package ca.omancosta.splunk.connector.internal.operations;

import static org.mule.runtime.extension.api.annotation.param.MediaType.ANY;

import ca.omancosta.splunk.connector.internal.config.SplunkConfiguration;
import ca.omancosta.splunk.connector.internal.connection.SplunkConnection;
import com.splunk.Job;
import org.mule.runtime.extension.api.annotation.param.MediaType;
import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.annotation.param.Connection;
import org.mule.runtime.extension.api.annotation.param.Optional;
import org.mule.runtime.extension.api.annotation.param.display.DisplayName;

import java.util.Map;

/**
 * This class is a container for operations, every public method in this class will be taken as an extension operation.
 */
public class SplunkOperations {

  @MediaType(value = ANY, strict = false)
  public String search(@Config SplunkConfiguration configuration, @Connection SplunkConnection connection, String query,  @Optional @DisplayName("Arguments") Map<String, Object> args){
    Job searchJob = args == null ? connection.getSplunkService().search(query) : connection.getSplunkService().search(query,args);
    return searchJob.values().toString();
  }

  @MediaType(value = ANY, strict = false)
  public String getJobs(@Config SplunkConfiguration configuration, @Connection SplunkConnection connection) {
    return connection.getSplunkService().getJobs().toString();
  }
}

package ca.omancosta.splunk.connector.internal.operations;

import static org.mule.runtime.extension.api.annotation.param.MediaType.ANY;

import ca.omancosta.splunk.connector.internal.config.SplunkConfiguration;
import ca.omancosta.splunk.connector.internal.connection.SplunkConnection;
import org.mule.runtime.extension.api.annotation.param.MediaType;
import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.annotation.param.Connection;


/**
 * This class is a container for operations, every public method in this class will be taken as an extension operation.
 */
public class SplunkOperations {

  @MediaType(value = ANY, strict = false)
  public String search(@Config SplunkConfiguration configuration, @Connection SplunkConnection connection){
    return "";
  }

  /**
   * Example of an operation that uses the configuration and a connection instance to perform some action.
   */
  @MediaType(value = ANY, strict = false)
  public String retrieveInfo(@Config SplunkConfiguration configuration, @Connection SplunkConnection connection){
    return "";
  }

  /**
   * Example of a simple operation that receives a string parameter and returns a new string message that will be set on the payload.
   */
  @MediaType(value = ANY, strict = false)
  public String sayHi(String person) {
    return buildHelloMessage(person);
  }

  /**
   * Private Methods are not exposed as operations
   */
  private String buildHelloMessage(String person) {
    return "Hello " + person + "!!!";
  }
}

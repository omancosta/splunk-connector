package ca.omancosta.splunk.connector.internal.config;

import ca.omancosta.splunk.connector.internal.operations.SplunkOperations;
import ca.omancosta.splunk.connector.internal.connection.provider.SplunkConnectionProvider;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.connectivity.ConnectionProviders;
import org.mule.runtime.extension.api.annotation.param.Parameter;

/**
 * This class represents an extension configuration, values set in this class are commonly used across multiple
 * operations since they represent something core from the extension.
 */
@Operations(SplunkOperations.class)
@ConnectionProviders(SplunkConnectionProvider.class)
public class SplunkConfiguration {
}

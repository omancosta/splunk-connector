package ca.omancosta.splunk.connector.internal.extension;

import ca.omancosta.splunk.connector.internal.config.SplunkConfiguration;
import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.Configurations;
import org.mule.runtime.extension.api.annotation.dsl.xml.Xml;


/**
 * This is the main class of an extension, is the entry point from which configurations, connection providers, operations
 * and sources are going to be declared.
 */
@Xml(prefix = "splunk")
@Extension(name = "Splunk-Connector")
@Configurations(SplunkConfiguration.class)
public class SplunkExtension {

}

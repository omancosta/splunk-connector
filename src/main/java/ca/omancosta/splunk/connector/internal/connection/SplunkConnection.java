package ca.omancosta.splunk.connector.internal.connection;

import com.splunk.SSLSecurityProtocol;
import com.splunk.Service;
import com.splunk.ServiceArgs;
import org.mule.runtime.api.connection.ConnectionException;

public final class SplunkConnection {

  private static Service splunkService;
  public SplunkConnection(String host, int port, String token) throws ConnectionException {
    ServiceArgs loginArgs = new ServiceArgs();
    loginArgs.setPort(port);
    loginArgs.setHost(host);
    loginArgs.setScheme("https");
    loginArgs.setToken(String.format("Bearer %s", token));

    splunkService.setSslSecurityProtocol(SSLSecurityProtocol.TLSv1_2);
    splunkService = Service.connect(loginArgs);
    if(splunkService.getApplications().values().isEmpty())
      throw new ConnectionException("error");
  }

  public Service getSplunkService() {
    return this.splunkService;
  }
  public void invalidate() {
    // do something to invalidate this connection!
  }
}

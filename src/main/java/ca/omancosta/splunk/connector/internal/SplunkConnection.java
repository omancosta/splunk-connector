package ca.omancosta.splunk.connector.internal;



public final class SplunkConnection {

  private final String id;

  public SplunkConnection(String id) {
    this.id = id;
  }

  public String getId() {
    return id;
  }

  public void invalidate() {
    // do something to invalidate this connection!
  }
}

package rule;

import org.junit.Rule;
import org.junit.rules.ExternalResource;

/**
 * ExternalResourceの利用例
 */
public class ExternalResourceExample {

  @Rule
  public ServerResource resource = new ServerResource();

  static class ServerResource extends ExternalResource {

    Server server;

    @Override
    public void before() {

      server = new Server(8080);
      server.start();
    }

    @Override
    public void after() {
      server.stop();
    }
  }
}

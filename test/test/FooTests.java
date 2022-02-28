package test;

import static org.junit.Assert.assertEquals;

import controllers.routes;
import controllers.ReverseFooController;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FooTests {

  private static final Logger LOG = LoggerFactory.getLogger(FooTests.class);

  @Test
  public void test001() {
    var fooUrl = routes.FooController.index().url();
    LOG.debug("fooUrl: {}", fooUrl);
    assertEquals("/v1/bar/foo", fooUrl); // /foo fail
  }

  @Test
  public void test002() {
    var fooUrl = new ReverseFooController(() -> "/v1/bar").index().url();
    LOG.debug("fooUrl: {}", fooUrl);
    assertEquals("/v1/bar/foo", fooUrl); // ok
  }
}

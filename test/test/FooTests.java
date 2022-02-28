package test;

import static org.junit.Assert.assertEquals;

import controllers.routes;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FooTests {

  private static final Logger LOG = LoggerFactory.getLogger(FooTests.class);

  @Test
  public void test001() {
    var fooUrl = routes.FooController.index().url();
    LOG.debug("fooUrl: {}", fooUrl);
    assertEquals("/v1/bar/foo", fooUrl);
  }
}

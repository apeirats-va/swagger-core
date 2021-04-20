package io.swagger.v3.core.resolving;

import io.swagger.v3.core.SelfContainsSchemas;
import io.swagger.v3.core.converter.ModelConverters;
import io.swagger.v3.oas.models.media.Schema;
import java.util.Map;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SelfContainsTest {

  @Test
  public void test() {
    Map<String, Schema> schemas = ModelConverters.getInstance().readAll(
        SelfContainsSchemas.MySchema.class);

    Schema containsItself = schemas.get("ContainsItself");
    Schema mySchema = schemas.get("MySchema");
    Schema foo = schemas.get("Foo");
    Schema bar = schemas.get("Bar");

    System.out.println(
        String.format("%s size = %s, expected %s, values=%s", "ContainsItself",
            containsItself.getProperties().size(), 3, containsItself.getProperties().keySet()));
    System.out.println(
        String.format("%s size = %s, expected %s, values=%s", "MySchema",
            mySchema.getProperties().size(), 5, mySchema.getProperties().keySet()));
    System.out.println(
        String.format("%s size = %s, expected %s, values=%s", "Foo", foo.getProperties().size(),
            3, foo.getProperties().keySet()));
    System.out.println(
        String
            .format("%s size = %s, expected %s, values=%s", "Bar", bar.getProperties().size(), 4,
                bar.getProperties().keySet()));

    Assert.assertEquals(containsItself.getProperties().size(), 3);
    Assert.assertEquals(mySchema.getProperties().size(), 5);
    Assert.assertEquals(foo.getProperties().size(), 3);
    Assert.assertEquals(bar.getProperties().size(), 4);
  }
}

package io.swagger.v3.core;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.List;
import javax.validation.Valid;

public class SelfContainsSchemas {

  @Schema
  public class ContainsItself {

    String id;
    @Valid List<ContainsItself> containsItself;
    String foo;

    public ContainsItself(String id, @Valid List<ContainsItself> containsItself, String foo) {
      this.id = id;
      this.containsItself = containsItself;
      this.foo = foo;
    }

    public String getId() {
      return id;
    }

    public void setId(String id) {
      this.id = id;
    }

    public List<ContainsItself> getContainsItself() {
      return containsItself;
    }

    public void setContainsItself(List<ContainsItself> containsItself) {
      this.containsItself = containsItself;
    }

    public String getFoo() {
      return foo;
    }

    public void setFoo(String foo) {
      this.foo = foo;
    }
  }

  @Schema
  public class MySchema {

    String id;
    @Valid SelfContainsSchemas.Foo foo;
    @Valid List<Bar> bar;
    String name;
    @Valid List<MySchema> part;

    public MySchema(String id,
        @Valid SelfContainsSchemas.Foo foo,
        @Valid List<Bar> bar,
        String name,
        @Valid List<MySchema> part) {
      this.id = id;
      this.foo = foo;
      this.bar = bar;
      this.name = name;
      this.part = part;
    }

    public String getId() {
      return id;
    }

    public void setId(String id) {
      this.id = id;
    }

    public Foo getFoo() {
      return foo;
    }

    public void setFoo(Foo foo) {
      this.foo = foo;
    }

    public List<Bar> getBar() {
      return bar;
    }

    public void setBar(List<Bar> bar) {
      this.bar = bar;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public List<MySchema> getPart() {
      return part;
    }

    public void setPart(List<MySchema> part) {
      this.part = part;
    }
  }

  @Schema
  public class Foo {

    String id;
    @Valid List<ContainsItself> containsItself;
    Integer someValue;

    public Foo(String id,
        @Valid List<ContainsItself> containsItself, Integer someValue) {
      this.id = id;
      this.containsItself = containsItself;
      this.someValue = someValue;
    }

    public String getId() {
      return id;
    }

    public void setId(String id) {
      this.id = id;
    }

    public List<ContainsItself> getContainsItself() {
      return containsItself;
    }

    public void setContainsItself(List<ContainsItself> containsItself) {
      this.containsItself = containsItself;
    }

    public Integer getSomeValue() {
      return someValue;
    }

    public void setSomeValue(Integer someValue) {
      this.someValue = someValue;
    }
  }

  @Schema
  public class Bar {

    String id;
    @Valid List<ContainsItself> containsItself;
    Integer someValue;
    @Valid List<Bar> bars;

    public Bar(String id,
        @Valid List<ContainsItself> containsItself, Integer someValue, @Valid List<Bar> bars) {
      this.id = id;
      this.containsItself = containsItself;
      this.someValue = someValue;
      this.bars = bars;
    }

    public String getId() {
      return id;
    }

    public void setId(String id) {
      this.id = id;
    }

    public List<ContainsItself> getContainsItself() {
      return containsItself;
    }

    public void setContainsItself(List<ContainsItself> containsItself) {
      this.containsItself = containsItself;
    }

    public Integer getSomeValue() {
      return someValue;
    }

    public void setSomeValue(Integer someValue) {
      this.someValue = someValue;
    }

    public List<Bar> getBars() {
      return bars;
    }

    public void setBars(List<Bar> bars) {
      this.bars = bars;
    }
  }
}

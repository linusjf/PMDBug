open module lm {
  requires java.logging;
  requires java.compiler;
  requires java.management;
  requires transitive org.junit.jupiter.api;
  requires transitive org.junit.jupiter.engine;
  requires transitive org.junit.jupiter.params;
  requires transitive org.junit.platform.commons;
  requires transitive org.junit.platform.engine;
  requires transitive org.junit.platform.launcher;

  exports lm;
}

/**
 * @author : Linus Fernandes (linusfernandes at gmail dot com)
 * @file : Service
 * @created : Sunday Apr 02, 2023 18:33:42 IST
 */
package lm;

public class Service {

  private final Database database;

  public Service(Database database) {
    this.database = database;
  }

  public boolean query() {
    return database.isAvailable();
  }

  @Override
  public String toString() {
    return "Using database with id: " + database.getUniqueId();
  }
}

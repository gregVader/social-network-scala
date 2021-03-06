package config

import slick.basic.DatabaseConfig
import slick.jdbc.JdbcProfile

trait DbConfiguration {
  lazy val config = DatabaseConfig.forConfig[JdbcProfile]("slick.dbs.default")
}

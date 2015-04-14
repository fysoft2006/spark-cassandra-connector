package com.datastax.spark.connector.sql.source

class BaseScanSpec extends CassandraDataSourceSpec {
  override def setScanType() = {
    scanType = "base"
  }
}

class BaseScanClusterLevelSpec extends CassandraDataSourceClusterLevelSpec {
  override def setScanType() = {
    scanType = "base"
  }
}
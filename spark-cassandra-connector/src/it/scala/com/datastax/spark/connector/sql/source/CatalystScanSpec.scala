package com.datastax.spark.connector.sql.source

class CatalystScanSpec extends CassandraDataSourceSpec {
  override def setScanType() = {
    scanType = "catalyst"
  }
}

class CatalystScanFilterPushdownSpec extends CassandraDataSourceFilterPushdownSpec {
  override def setScanType() = {
    scanType = "catalyst"
  }
}

class CatalystScanClusterLevelSpec extends CassandraDataSourceClusterLevelSpec {
  override def setScanType() = {
    scanType = "catalyst"
  }
}
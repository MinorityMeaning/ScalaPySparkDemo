package ru.example

import org.apache.log4j.Logger
import org.apache.spark.sql.SparkSession
import ru.mardaunt.python.PySparkApp
import ru.mardaunt.python.logger.SimpleLogger

class PySparkDemo(spark: SparkSession, logger: Logger)
  extends PySparkApp(mainPyName = "pyspark_main.py", needKerberosAuth = false)(spark, logger) {

  override protected val starterTool: String = "spark-submit"
}

object PySparkDemo extends App {

  lazy val spark = SparkSession.builder()
                               .master("local[*]")
                               .getOrCreate()


  new PySparkDemo(spark, SimpleLogger()).run()
}

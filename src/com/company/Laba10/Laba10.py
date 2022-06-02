from pyspark.sql import SparkSession

spark=SparkSession \
.builder \
.appName("SQL") \
.config("spark.some.config.option", "some-value") \
.getOrCreate()


spark.sparkContext.setLogLevel("WARN")

data=spark.read.load("/home/hdoop/russian_demography.csv", format="csv",
sep=",",inferSchema="true", header="true")



data.registerTempTable("table")

#df = spark.sql("select * from table").show()
#df = spark.sql("select region, (birth_rate/death_rate) as rating from table WHERE year=2017").show()
#df = spark.sql("select region, MAX(npg) from table WHERE region!='Москва' AND year BETWEEN 2007 AND 2017 GROUP BY region ORDER by MAX(npg) DESC LIMIT 1").show()
#df = spark.sql("select region, MAX(npg) from table GROUP BY region ORDER by MAX(npg) DESC LIMIT 5").show()
#df = spark.sql("select region, MIN(urbanization) from table WHERE year BETWEEN 2007 AND 2017 GROUP BY region ORDER by MIN(urbanization) ASC LIMIT 1").show()
#df = spark.sql("select year, npg from table WHERE region = 'Chechen Republic' AND year BETWEEN 2007 AND 2017 ORDER by year").show()
#df = spark.sql("select region, MAX(npg) from table WHERE year=2017 GROUP BY region ORDER by MAX(npg) DESC LIMIT 1").show()
#df = spark.sql("select region, birth_rate from table WHERE year=2017 AND birth_rate BETWEEN 5 AND 9").show()
#df = spark.sql("select region, MAX(gdw) from table WHERE year=2017 GROUP BY region ORDER by MAX(gdw) DESC LIMIT 1").show()
df = spark.sql("select distinct count(region) from table").show()
input()
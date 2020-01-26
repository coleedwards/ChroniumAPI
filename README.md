# ChroniumAPI

It's pretty self explanatory, everything is in the ChroniumAPI class that you should need. If you need anything else please create an issue and I'll add it.


**Maven:**
```xml
	<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
  
  	<dependency>
	    <groupId>com.github.coleedwards</groupId>
	    <artifactId>ChroniumAPI</artifactId>
	    <version>Tag</version>
	</dependency>
  ```
**Gradle:**
```gradle
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  	dependencies {
	        implementation 'com.github.coleedwards:ChroniumAPI:Tag'
	}
  ```

# Wallpo
A powerful image setter for Smart Phone MainScreen and LockScreen for Android


<h2>Setting Wallpaper on Mainscreen </h3>
<img src="Example/mainscreen.gif" alt="mainscreen" height="492" width="252"/>
   

<h2>Setting Wallpaper on Lockscreen </h3>
<img src="Example/lockscreen.gif" alt="lockscrren" height="492" width="252"/>

Only three steps to use the wallpo:

1. Add repository to your build file 
         
          allprojects {
      		repositories {
		   	...
	   		maven { url 'https://jitpack.io' }
		   }
	   }
      
      
2. Add the dependency
      
          dependencies {
	        implementation 'com.github.sayyedrizwan:wallpo:1.4.0'
      	}


OR 

ADD Through <b> MAVEN </b>

ADD  Add repository to your build file


	<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
	
	
Add the maven dependency


	<dependency>
	    <groupId>com.github.sayyedrizwan</groupId>
	    <artifactId>wallpo</artifactId>
	    <version>1.4.0</version>
	</dependency>


3. Add Wallpo Code Where you want to run and set a image as mainscreen wallpaper



		Wallpo.setMainScreenWallpaper(MainActivity.this, imageView, "Wallpaper Set");
				//imageview is the view where image is loading
		

OR


3. Add Wallpo Code Where you want to run and set a image as lockscreen wallpaper

		Wallpo.setLockScreenWallpaper(MainActivity.this, imageView, "LockWallpaper Set"); 
						//imageview is the view where image is loading
		
		
		
		



License


		Copyright 2018-2019 Wallpo Inc.

	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at

   	http://www.apache.org/licenses/LICENSE-2.0

	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
	
	
	
	
	
	
	
	
<h9> Founder Rizwan Sayyed </h9>

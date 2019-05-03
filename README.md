# Wallpo
A powerful image setter for Smart Phone MainScreen and LockScreen for Awndroid


<h2>Setting Wallpaper on Mainscreen </h3>
<img src="Example/mainscreen.gif" alt="mainscreen" height="492" width="252"/>
   

<h2>Setting Wallpaper on Lockscreen </h3>
<img src="Example/lockscreen.gif" alt="lockscrren" height="492" width="252"/>

Only five steps to use the wallpo:

1. Add repository to your build file 
         
               	allprojects {
      		repositories {
		   	...
	   		maven { url 'https://jitpack.io' }
		   }
	   }
      
      
2. Add the dependency
      
          dependencies {
	        implementation 'com.github.sayyedrizwan:wallpo:1.'
      	}

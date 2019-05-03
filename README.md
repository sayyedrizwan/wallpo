# Wallpo
A powerful image setter for Smart Phone MainScreen and LockScreen for Awndroid


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
	        implementation 'com.github.sayyedrizwan:wallpo:1.0.2'
      	}

3. Add Wallpo Code Where you want to run and set a image as mainscreen wallpaper



		Wallpo.setMainScreenWallpaper(MainActivity.this, imageView, "Wallpaper Set"); //imageview is the view where image is loading
		

OR


3. Add Wallpo Code Where you want to run and set a image as lockscreen wallpaper

		Wallpo.setLockScreenWallpaper(MainActivity.this, imageView, "LockWallpaper Set"); //imageview is the view where image is loading
		
		
		
		

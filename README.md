# PROGRESS BUTTON
is a custom button with built in progressbar and features customization options.


<img src="https://github.com/imnithish/progress_button/blob/master/progress_button_demo.gif" width="250"/>


## ADDING TO YOUR PROJECT
Step 1. Add the JitPack repository to your build file.
Add it in your root build.gradle at the end of repositories:
```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
Step 2. Add the dependency.
```
dependencies {
	        implementation 'com.github.imnithish:progress_button:Tag'
	}
```


## XML ATTRIBUTES
```
    <com.imnstudios.theprogressbutton.ProgressButtonTest
        android:id="@+id/login_button"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:textSize="15sp"
        app:buttonBackgroundColor="#FF7B7B"
        app:progressBarTint="#3F51B5"
        app:text="LOG IN"
        app:textColor="#FFFFFF" />
 ```


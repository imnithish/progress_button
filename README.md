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
    <com.imnstudios.library.ProgressButton
        android:id="@+id/progress_button"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:textSize="15sp"
        android:elevation="4sp"
        app:buttonBackgroundColor="#FF7B7B"
        app:progressBarTint="#3F51B5"
        app:text="LOG IN"
        app:textColor="#FFFFFF" />
 ```



## CUSTOMIZE PROGRAMMATICALLY
To set background color:
```
progress_button.backgroundColor = "#6200EE"
```
To set background drawable:
```
progress_button.buttonBackground = ContextCompat.getDrawable(applicationContext, R.drawable.rounded_background)
```
Rounded background:
```
<?xml version="1.0" encoding="utf-8"?>
<shape xmlns:android="http://schemas.android.com/apk/res/android"
        android:shape="rectangle">
    <corners
            android:radius="4sp"/>

    <solid android:color="@color/colorAccent" />
</shape>
```
To set text:
```
progress_button.text = "Button was clicked!"
```
To set font:
```
progress_button.font = ResourcesCompat.getFont(applicationContext, R.font.poppins)
```
To set text size:
```
progress_button.textSize = 17f
```
To set progress tint:
```
progress_button.progressBarTint = "#FFFFFF"
```


## License
```
   Copyright 2020 Nitheesh Ag

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
```

### Contact
Contact me at +918907471155 or imnithish@live.com.

[My Website](https://imnstudios.com/#/nitheeshag)

Connect with me in [LinkedIn](https://www.linkedin.com/in/imnithish/)






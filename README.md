# AutoScrollViewPager

[![Release](https://jitpack.io/v/demoNo/AutoScrollViewPager.svg)](https://jitpack.io/#demoNo/AutoScrollViewPager)  [![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

README: [English](https://github.com/demoNo/AutoScrollViewPager/blob/master/README.md) | [中文](https://github.com/demoNo/AutoScrollViewPager/blob/master/README-zh.md)

## Add to your project

Gradle

* Add it in your root build.gradle at the end of repositories:
```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
}
```

* Add the dependency
```
dependencies {
	    compile 'com.github.demoNo:AutoScrollViewPager:v1.0.0'
}
```


Maven

* Add the JitPack repository to your build file
```
<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
</repositories>
```

* Add the dependency
```
<dependency>
	    <groupId>com.github.demoNo</groupId>
	    <artifactId>AutoScrollViewPager</artifactId>
	    <version>v1.0.0</version>
</dependency>
```

# Feature

* Unlimited scrolling
* Custom slide duration
* Custom slide interval
* Slide both right and left
* todo

# How to use

* use in xml

```
<com.github.demono.AutoScrollViewPager
        android:id="@+id/viewPager"
        android:layout_width="match_parent"
        android:layout_height="200dp"
        app:stopWhenTouch="true"
        app:slideInterval="5000"
        app:slideDirection="right"
        app:slideDuration="5000"/>
```

* Create an Adapter extends InfinitePagerAdapter
```
public class MyAdapter extends InfinitePagerAdapter {

    private List<String> data;

    public MyAdapter(List<String> data) {
        this.data = data;
    }

    @Override
    public int getItemCount() {
        return data == null ? 0 : data.size();
    }

    @Override
    public View getItemView(int position, View convertView, ViewGroup container) {
        return your view;
    }
}
```

* set Adapter
```
AutoScrollViewPager mViewPager = (AutoScrollViewPager) findViewById(R.id.viewPager);
MyAdapter mAdapter = new MyAdapter(data);
mViewPager.setAdapter(mAdapter);
// optional start auto scroll
mViewPager.startAutoScroll();
```

# More setting

* `startAutoScroll()` Start auto scroll.
* `stopAutoScroll()` Stop auto scroll.
* `setSlideInterval(int slideInterval)` Set each item slide interval, default `5000`ms.
* `setDirection(int direction)` Set auto scroll direction `DIRECTION_RIGHT` or `DIRECTION_LEFT`, default `RIGHT`.
* `setStopWhenTouch(boolean stopWhenTouch)` Whether stop when touch ViewPager, default `true`.
* `setCycle(boolean cycle)` Whether auto scroll to first item when scroll to last item, only for `Adapter` that extends `PagerAdapter`, default `false`.
* `setSlideDuration(int slideDuration)` Set each item scroll duration, default `800`ms.

# Credits

* [android-auto-scroll-view-pager](https://github.com/Trinea/android-auto-scroll-view-pager) Android auto scroll viewpager or viewpager in viewpager.
* [How to make a ViewPager loop](http://stackoverflow.com/questions/10188011/how-to-make-a-viewpager-loop/12965787#12965787)
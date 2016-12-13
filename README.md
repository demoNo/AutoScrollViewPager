# AutoScrollViewPager

README: [English]() | [中文]()

## Add to your project

* Gradle


1. Add it in your root build.gradle at the end of repositories:
```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
}
```
2. Add the dependency
```
dependencies {
	    compile 'com.github.demoNo:AutoScrollViewPager:v1.0.0'
  }
  ```


* Maven


1. Add the JitPack repository to your build file
```
<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
</repositories>
```

2. Add the dependency
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

#How to use

1. Create an Adapter extends InfinitePagerAdapter
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
2. set Adapter
```
AutoScrollViewPager mViewPager = (AutoScrollViewPager) findViewById(R.id.viewPager);
MyAdapter mAdapter = new MyAdapter(data);
mViewPager.setAdapter(mAdapter);
// optional start auto scroll
mViewPager.startAutoScroll();
```

# AutoScrollViewPager

[![Release](https://jitpack.io/v/demoNo/AutoScrollViewPager.svg)](https://jitpack.io/#demoNo/AutoScrollViewPager) [![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

![](https://raw.githubusercontent.com/demoNo/AutoScrollViewPager/master/design/screen_record.gif)

## 添加到项目中

Gradle
* 在项目根目录的build.gradle中添加JitPack仓库
```Gradle
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
}
```

* 在项目中添加依赖
```Gradle
dependencies {
	    compile 'com.github.demoNo:AutoScrollViewPager:v1.0.1'
}
```

Maven

* 添加JitPack
```xml
<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
</repositories>
```

* 添加依赖
```xml
<dependency>
	    <groupId>com.github.demoNo</groupId>
	    <artifactId>AutoScrollViewPager</artifactId>
	    <version>v1.0.1</version>
</dependency>
```

# 功能

* 可以无限滚动
* 自定义滚动时间
* 自定义自动滚动的时间间隔
* 可以左右自动滚动
* todo

# 使用

* 在xml中定义

```xml
<com.github.demono.AutoScrollViewPager
        android:id="@+id/viewPager"
        android:layout_width="match_parent"
        android:layout_height="200dp"
        app:stopWhenTouch="true"
        app:slideInterval="5000"
        app:slideDirection="right"
        app:slideDuration="5000"/>
```

* 创建Adapter继承InfinitePagerAdapter
```Java
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

* 设置ViewPager Adapter
```Java
@Override
protected void onCreate(Bundle savedInstanceState) {
    AutoScrollViewPager mViewPager = (AutoScrollViewPager) findViewById(R.id.viewPager);
    MyAdapter mAdapter = new MyAdapter(data);
    mViewPager.setAdapter(mAdapter);
    // optional start auto scroll
    mViewPager.startAutoScroll();
}
```

# 更多设置

* `startAutoScroll()` 开启自动滚动.
* `stopAutoScroll()` 停止自动滚动.
* `setSlideInterval(int slideInterval)` 设置自动滚动的间隔时间，默认5000毫秒.
* `setDirection(int direction)` 设置自动滚动的方向 `DIRECTION_RIGHT` 或者 `DIRECTION_LEFT`，默认向右.
* `setStopWhenTouch(boolean stopWhenTouch)` 触摸时是否停止自动滚动，默认为true.
* `setCycle(boolean cycle)` 当自动滚动到最后一个item时是否自动回到第一个item，只对继承自 `PagerAdapter`的 `Adapter`有效，默认false.
* `setSlideDuration(int slideDuration)` 设置自动滚动的一个item的时长，默认800毫秒.

# 鸣谢

* [android-auto-scroll-view-pager](https://github.com/Trinea/android-auto-scroll-view-pager) Android auto scroll viewpager or viewpager in viewpager.
* [How to make a ViewPager loop](http://stackoverflow.com/questions/10188011/how-to-make-a-viewpager-loop/12965787#12965787)

# 版权信息

```
                    Copyright 2016 demoNo

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
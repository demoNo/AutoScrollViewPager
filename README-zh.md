# AutoScrollViewPager

[![Release](https://jitpack.io/v/demoNo/AutoScrollViewPager.svg)]
(https://jitpack.io/#demoNo/AutoScrollViewPager)

## 添加到项目中

Gradle
* 在项目根目录的build.gradle中添加JitPack仓库
```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
}
```

* 在项目中添加依赖
```
dependencies {
	    compile 'com.github.demoNo:AutoScrollViewPager:v1.0.0'
}
```

Maven

* 添加JitPack
```
<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
</repositories>
```

* 添加依赖
```
<dependency>
	    <groupId>com.github.demoNo</groupId>
	    <artifactId>AutoScrollViewPager</artifactId>
	    <version>v1.0.0</version>
</dependency>
```

# 功能

* 可以无限滚动
* 自定义滚动时间
* 自定义自动滚动的时间间隔
* 可以左右自动滚动
* todo

# 使用

* 创建Adapter继承InfinitePagerAdapter
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

* 设置ViewPager Adapter
```
AutoScrollViewPager mViewPager = (AutoScrollViewPager) findViewById(R.id.viewPager);
MyAdapter mAdapter = new MyAdapter(data);
mViewPager.setAdapter(mAdapter);
// optional start auto scroll
mViewPager.startAutoScroll();
```

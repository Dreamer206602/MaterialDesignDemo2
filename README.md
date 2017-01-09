Material Design : 带动画的标题栏

ConstraintLayout


# CoordinatorLayout，AppBarLayout，CollapsingToolbarLayout

### 1.CoordinatorLayout
CoordinatorLayout控件互动实现滑动，总结就是CoordinatorLayout控件和app:layout_behavior来进行互动，进而CoordinatorLayout的子控件和app:layout_behavior互动。当然@string/appbar_scrolling_view_behavior是系统自带的


### 2.AppBarLayout
AppBarLayout，去除官方解释，简单来说就是它可以让你定制当某个可滚动View的滚动手势发生变化时，其内部的子View实现何种动作。内部的子View通过在布局中加app:layout_scrollFlags设置执行的动作。而layout_srcollFlags的动作主要如下：

* scroll:值设为scroll的View会跟随滚动事件一起发生移动。
* enterAlways:值设为enterAlways的View,当ScrollView往下滚动时，该View会直接往下滚动。而不用考虑ScrollView是否在滚动。
* exitUntilCollapsed：值设为exitUntilCollapsed的View，当这个View要往上逐渐“消逝”时，会一直往上滑动，直到剩下的的高度达到它的最小高度后，再响应ScrollView的内部滑动事件。
* enterAlwaysCollapsed：是enterAlways的附加选项，一般跟enterAlways一起使用，它是指，View在往下“出现”的时候，首先是enterAlways效果，当View的高度达到最小高度时，View就暂时不去往下滚动，直到ScrollView滑动到顶部不再滑动时，View再继续往下滑动，直到滑到View的顶部结束。
* snap这是属性是子View不会存在局部显示的情况，滚动Child View的部分高度，当我们松开手指时，Child View要么向上全部滚出屏幕，要么向下全部滚进屏幕。


### 3.CollapsingToolbarLayout
###### 是用来对Toolbar进行再次包装的ViewGroup，主要是用于实现折叠的App Bar效果。CollapsingToolbarLayout只要有这方面：
* 1.title展开时是最大的，然后随着收缩会越来越少，直到屏幕的顶部，通过app:title设置title,不然就默认。
* 2.通过setContentScrim(Drawable)来设置达到某一个状态之后的出现的效果
* 3.通过setStatusBarScrim(Drawable)来设置达到某一个状态之后的状态栏出现的效果
* 4.当app:layout_collapseMode设为parallax子View可以选择在当前的布局当时是否以“视差”的方式来跟随滚动
* 5.当app:layout_collapseMode设为pinToolbar固定位置而不受移动的影响
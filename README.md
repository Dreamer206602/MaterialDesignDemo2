Material Design : 带动画的标题栏



1.用到的新特性控件

CoordinatorLayout

就是一个超级FrameLayout,定义了一系列的行为（behavior）,与包裹着的子视图互动。允许悬浮的view以此为基准，固定。

AppBarLayout

本质上就是一个垂直的线性LinearLayout,根据子视图的滚动和CoordinatorLayout的联动。一般作为CoordinatorLayout的直接子视图。

CollapsingToolbarLayout

用来包裹Toolbar的，使图片收缩的时候让Toolbar适应标题的字体大小.




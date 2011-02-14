fork from http://code.google.com/p/deezapps-widgets/

# Collection of common-use Android widgets
This project is intended as a repository for common Android widgets that may be of use to other developers. Less emphasis will be placed on creating robust re-usable drop-in libraries but rather sample source code that can be used as-is for basic purposes or easily customized for your own purposes.

## HorizontalPager

Intended as a ViewGroup that mimics the UIScrollView horizontal paging functionality of iOS.

Supports:

Each child inherits the width and height of the HorizonalPager.
Swipe to page left and right, or invoke scrollLeft() and scrollRight() methods to accomplish the same.
OnScrollListener will report scroll and scroll-finished events (use to implement a "current page number/position" view, for example).
Much of the code for this class was adapted from the Workspace class from the official Launcher app (AOSP).
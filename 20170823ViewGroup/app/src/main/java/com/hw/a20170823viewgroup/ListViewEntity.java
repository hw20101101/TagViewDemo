package com.hw.a20170823viewgroup;

/**
 * Created by HW on 24/08/2017.
 */

public class ListViewEntity {

    /*标题*/
    private String title;
    /*标签数组*/
    private String[] tags;
    /*是否使标签拦截点击事件*/
    private boolean ifInterceptEvent;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public boolean isIfInterceptEvent() {
        return ifInterceptEvent;
    }

    public void setIfInterceptEvent(boolean ifInterceptEvent) {
        this.ifInterceptEvent = ifInterceptEvent;
    }
}

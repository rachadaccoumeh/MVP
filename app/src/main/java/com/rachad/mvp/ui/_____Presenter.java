package com.rachad.mvp.ui;

import android.view.View;

import com.rachad.mvp.pojo._____Model;

public class _____Presenter {
	____View view;

	public _____Presenter(____View view) {
		this.view = view;
	}

	/*private fun get____FromDatabase(): _____Model {
		return _____Model("__name", "__description", 1)
	}*/
	public _____Model get____ModelFromDatabase() {
		return new _____Model("__name", "---description", 1);
	}

	public void get____Name() {
		view.onGet____Name(get____ModelFromDatabase().getName());
	}
}

package com.google.zxing.integration.android;

import android.content.Intent;
import android.support.v4.app.Fragment;

public final class IntentIntegratorSupportV4 extends IntentIntegrator {
	private final Fragment fragment;

	public IntentIntegratorSupportV4(Fragment fragment) {
		super(fragment.getActivity());
		this.fragment = fragment;
	}

	protected void startActivityForResult(Intent intent, int code) {
		this.fragment.startActivityForResult(intent, code);
	}
}
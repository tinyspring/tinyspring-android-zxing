package com.google.zxing.integration.android;

import android.app.Fragment;
import android.content.Intent;

public final class IntentIntegratorV30 extends IntentIntegrator
{
  private final Fragment fragment;

  public IntentIntegratorV30(Fragment fragment)
  {
    super(fragment.getActivity());
    this.fragment = fragment;
  }

  protected void startActivityForResult(Intent intent, int code)
  {
    this.fragment.startActivityForResult(intent, code);
  }
}
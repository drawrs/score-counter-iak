// Generated code from Butter Knife. Do not modify!
package com.khilman.www.haripertamaiak;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class CounterActivity_ViewBinding implements Unbinder {
  private CounterActivity target;

  private View view2131165223;

  @UiThread
  public CounterActivity_ViewBinding(CounterActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public CounterActivity_ViewBinding(final CounterActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.btn_finish, "field 'btnFinish' and method 'onViewClicked'");
    target.btnFinish = Utils.castView(view, R.id.btn_finish, "field 'btnFinish'", Button.class);
    view2131165223 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    CounterActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.btnFinish = null;

    view2131165223.setOnClickListener(null);
    view2131165223 = null;
  }
}

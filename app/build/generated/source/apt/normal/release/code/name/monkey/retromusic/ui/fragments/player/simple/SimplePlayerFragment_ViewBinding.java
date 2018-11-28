// Generated code from Butter Knife. Do not modify!
package code.name.monkey.retromusic.ui.fragments.player.simple;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.Toolbar;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import code.name.monkey.retromusic.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SimplePlayerFragment_ViewBinding implements Unbinder {
  private SimplePlayerFragment target;

  @UiThread
  public SimplePlayerFragment_ViewBinding(SimplePlayerFragment target, View source) {
    this.target = target;

    target.toolbar = Utils.findRequiredViewAsType(source, R.id.player_toolbar, "field 'toolbar'", Toolbar.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SimplePlayerFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.toolbar = null;
  }
}
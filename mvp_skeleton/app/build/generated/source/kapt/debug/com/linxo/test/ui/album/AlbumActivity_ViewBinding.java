// Generated code from Butter Knife. Do not modify!
package com.linxo.test.ui.album;

import android.view.View;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.linxo.test.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public final class AlbumActivity_ViewBinding implements Unbinder {
  private AlbumActivity target;

  @UiThread
  public AlbumActivity_ViewBinding(AlbumActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public AlbumActivity_ViewBinding(AlbumActivity target, View source) {
    this.target = target;

    target.rvFolder = Utils.findRequiredViewAsType(source, R.id.rv_folder, "field 'rvFolder'", RecyclerView.class);
  }

  @Override
  public void unbind() {
    AlbumActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.rvFolder = null;
  }
}

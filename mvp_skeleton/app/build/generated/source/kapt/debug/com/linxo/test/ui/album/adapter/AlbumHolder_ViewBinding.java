// Generated code from Butter Knife. Do not modify!
package com.linxo.test.ui.album.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.linxo.test.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public final class AlbumHolder_ViewBinding implements Unbinder {
  private AlbumHolder target;

  @UiThread
  public AlbumHolder_ViewBinding(AlbumHolder target, View source) {
    this.target = target;

    target.ivPicture = Utils.findRequiredViewAsType(source, R.id.iv_picture, "field 'ivPicture'", ImageView.class);
    target.tvTitle = Utils.findRequiredViewAsType(source, R.id.tv_title, "field 'tvTitle'", TextView.class);
    target.tvAuthor = Utils.findRequiredViewAsType(source, R.id.tv_author, "field 'tvAuthor'", TextView.class);
  }

  @Override
  public void unbind() {
    AlbumHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.ivPicture = null;
    target.tvTitle = null;
    target.tvAuthor = null;
  }
}

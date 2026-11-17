package X;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.FKs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnFocusChangeListenerC7920FKs implements View.OnFocusChangeListener {
    public final List<View.OnFocusChangeListener> A00 = C3cG.A0h();

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        Iterator<View.OnFocusChangeListener> it = this.A00.iterator();
        while (it.hasNext()) {
            it.next().onFocusChange(view, z);
        }
    }
}

package X;

import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: X.FKt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7921FKt implements TextView.OnEditorActionListener {
    public final /* synthetic */ C7912FKk A00;

    public C7921FKt(C7912FKk c7912FKk) {
        this.A00 = c7912FKk;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        return this.A00.A02.onEditorAction(textView, i, keyEvent);
    }
}

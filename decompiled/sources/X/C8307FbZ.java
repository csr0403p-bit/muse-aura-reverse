package X;

import android.widget.PopupWindow;

/* renamed from: X.FbZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8307FbZ implements PopupWindow.OnDismissListener {
    public final /* synthetic */ C8236FaC A00;

    public C8307FbZ(C8236FaC c8236FaC) {
        this.A00 = c8236FaC;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.A00.A01();
    }
}

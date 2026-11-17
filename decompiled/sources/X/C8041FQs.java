package X;

import android.content.Context;
import android.view.ViewManager;
import java.lang.ref.WeakReference;

/* renamed from: X.FQs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8041FQs implements FR2 {
    public final /* synthetic */ C8040FQr A00;
    public final /* synthetic */ C8042FQt A01;

    public C8041FQs(C8040FQr c8040FQr, C8042FQt c8042FQt) {
        this.A00 = c8040FQr;
        this.A01 = c8042FQt;
    }

    @Override // X.FR2
    public final void ASZ() {
        ViewManager viewManager;
        C8042FQt c8042FQt = this.A01;
        Context context = c8042FQt.A03;
        C8040FQr c8040FQr = this.A00;
        WeakReference<C8040FQr> weakReference = AbstractC8043FQu.A00;
        c8040FQr.setVisibility(8);
        try {
            viewManager = (ViewManager) context.getSystemService("window");
        } catch (IllegalArgumentException unused) {
        }
        if (viewManager == null) {
            throw C3cG.A0Q("Window manager required but not found.");
        }
        viewManager.removeView(c8040FQr);
        WeakReference<C8040FQr> weakReference2 = AbstractC8043FQu.A00;
        if (weakReference2.get() == c8040FQr) {
            weakReference2.clear();
        }
        c8042FQt.A06.ASZ();
    }
}

package X;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;

/* renamed from: X.FRs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class OnReceiveContentListenerC8064FRs implements OnReceiveContentListener {
    public final FS1 A00;

    public OnReceiveContentListenerC8064FRs(FS1 fs1) {
        this.A00 = fs1;
    }

    @Override // android.view.OnReceiveContentListener
    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        C8071FRz c8071FRzA00 = C8071FRz.A00(contentInfo);
        C8071FRz c8071FRzAVC = this.A00.AVC(view, c8071FRzA00);
        if (c8071FRzAVC == null) {
            return null;
        }
        return c8071FRzAVC != c8071FRzA00 ? c8071FRzAVC.A01() : contentInfo;
    }
}

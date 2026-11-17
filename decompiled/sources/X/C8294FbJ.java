package X;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: X.FbJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8294FbJ extends FrameLayout implements InterfaceC8341FcE {
    public final CollapsibleActionView A00;

    /* JADX WARN: Multi-variable type inference failed */
    public C8294FbJ(View view) {
        super(view.getContext());
        this.A00 = (CollapsibleActionView) view;
        addView(view);
    }
}

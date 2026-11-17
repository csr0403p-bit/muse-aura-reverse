package X;

import android.view.View;
import android.view.WindowManager;

/* renamed from: X.EnJ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7346EnJ extends C06G {
    public final View A00;
    public final WindowManager.LayoutParams A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7346EnJ) {
                C7346EnJ c7346EnJ = (C7346EnJ) obj;
                if (!C7384Etj.areEqual(this.A00, c7346EnJ.A00) || !C7384Etj.areEqual(this.A01, c7346EnJ.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A01, AnonymousClass005.A0E(this.A00));
    }

    public C7346EnJ(View view, WindowManager.LayoutParams layoutParams) {
        AnonymousClass003.A0u(view, layoutParams);
        this.A00 = view;
        this.A01 = layoutParams;
    }
}

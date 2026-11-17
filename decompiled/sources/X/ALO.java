package X;

import android.view.View;

/* loaded from: classes4.dex */
public final class ALO implements View.OnLayoutChangeListener {
    public final /* synthetic */ C9n4 A00;
    public final /* synthetic */ AL9 A01;

    public ALO(C9n4 c9n4, AL9 al9) {
        this.A01 = al9;
        this.A00 = c9n4;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        AL9 al9 = this.A01;
        if (al9.A0b || (i3 - i > 0 && i4 - i2 > 0)) {
            al9.removeOnLayoutChangeListener(this);
            al9.A01 = null;
            if (al9.A0b) {
                return;
            }
            AL9.A0B(this.A00, al9);
        }
    }
}

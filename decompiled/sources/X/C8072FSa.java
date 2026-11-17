package X;

import android.view.Choreographer;

/* renamed from: X.FSa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8072FSa {
    public long A00;
    public FSX A01;
    public boolean A02;
    public final Choreographer.FrameCallback A03;
    public final Choreographer A04;

    public C8072FSa() {
    }

    public C8072FSa(Choreographer choreographer) {
        this.A04 = choreographer;
        this.A03 = new ChoreographerFrameCallbackC10645I0p(this, 2);
    }
}

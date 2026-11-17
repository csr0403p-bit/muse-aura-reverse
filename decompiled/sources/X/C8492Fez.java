package X;

import android.view.WindowInsetsAnimation;

/* renamed from: X.Fez, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8492Fez {
    public final C8345FcJ A00;
    public final C8345FcJ A01;

    public static C8492Fez A00(WindowInsetsAnimation.Bounds bounds) {
        return new C8492Fez(bounds);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("Bounds{lower=");
        sbA0x.append(this.A00);
        sbA0x.append(" upper=");
        return BV8.A0v(this.A01, sbA0x);
    }

    public C8492Fez(WindowInsetsAnimation.Bounds bounds) {
        this.A00 = C8491Fey.A02(bounds);
        this.A01 = C8491Fey.A01(bounds);
    }

    public final WindowInsetsAnimation.Bounds A01() {
        return C8491Fey.A00(this);
    }

    public C8492Fez(C8345FcJ c8345FcJ, C8345FcJ c8345FcJ2) {
        this.A00 = c8345FcJ;
        this.A01 = c8345FcJ2;
    }
}

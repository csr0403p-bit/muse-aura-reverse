package X;

import android.animation.ValueAnimator;

/* loaded from: classes6.dex */
public final class FK5 extends FS5 {
    public ValueAnimator A00;
    public Runnable A01;
    public boolean A02;
    public final FK4 A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            FK5 fk5 = (FK5) obj;
            if (this.A04 == fk5.A04) {
                return this.A03.equals(fk5.A03);
            }
        }
        return false;
    }

    public final int hashCode() {
        return BV7.A0D(this.A03, Boolean.valueOf(this.A04));
    }

    public FK5(FK4 fk4, boolean z) {
        this.A03 = fk4;
        fk4.A01 = this;
        this.A02 = AnonymousClass002.A1L((fk4.A00 > 0.0f ? 1 : (fk4.A00 == 0.0f ? 0 : -1)));
        this.A04 = z;
        if (z) {
            fk4.A00 = 1.0f;
        }
    }
}

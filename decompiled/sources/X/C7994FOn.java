package X;

import android.view.animation.Interpolator;

/* renamed from: X.FOn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7994FOn {
    public final Interpolator A00;
    public final FPN A01;
    public final Integer A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7994FOn) {
                C7994FOn c7994FOn = (C7994FOn) obj;
                if (!this.A01.equals(c7994FOn.A01) || !C7384Etj.areEqual(this.A02, c7994FOn.A02) || !C7384Etj.areEqual(this.A00, c7994FOn.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass005.A0E(this.A01) + AnonymousClass006.A0D(this.A02)) * 31) + C3cH.A02(this.A00);
    }

    public final String toString() {
        FPN fpn = this.A01;
        Integer num = this.A02;
        Interpolator interpolator = this.A00;
        StringBuilder sbA0f = C3cG.A0f(fpn, "FoaLayoutUpdate(newConfig=");
        sbA0f.append(", duration=");
        sbA0f.append(num);
        return C3cJ.A0L(interpolator, ", interpolator=", sbA0f);
    }

    public C7994FOn(Interpolator interpolator, FPN fpn, Integer num) {
        this.A01 = fpn;
        this.A02 = num;
        this.A00 = interpolator;
    }
}

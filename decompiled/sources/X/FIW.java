package X;

import android.animation.Animator;

/* loaded from: classes6.dex */
public final class FIW extends C06G {
    public String A03 = "";
    public boolean A04 = true;
    public int A01 = 1;
    public Animator.AnimatorListener A02 = null;
    public float A00 = 0.0f;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FIW) {
                FIW fiw = (FIW) obj;
                if (!C7384Etj.areEqual(this.A03, fiw.A03) || this.A04 != fiw.A04 || this.A01 != fiw.A01 || !C7384Etj.areEqual(this.A02, fiw.A02) || Float.compare(this.A00, fiw.A00) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C8j4.A06((((C0KA.A01(AnonymousClass001.A0G(this.A03), this.A04) + this.A01) * 31) + AnonymousClass006.A0D(this.A02)) * 31, this.A00);
    }
}

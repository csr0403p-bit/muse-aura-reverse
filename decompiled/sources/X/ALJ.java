package X;

import java.util.List;

/* loaded from: classes4.dex */
public final class ALJ extends C06G {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Integer A03;
    public final List<BE6> A04;

    public ALJ() {
        this(null, C0881AGi.A00, 8388661, 0, 0);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ALJ) {
                ALJ alj = (ALJ) obj;
                if (this.A00 != alj.A00 || this.A01 != alj.A01 || this.A02 != alj.A02 || !C7384Etj.areEqual(this.A03, alj.A03) || !C7384Etj.areEqual(this.A04, alj.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A04, ((((((this.A00 * 31) + this.A01) * 31) + this.A02) * 31 * 31 * 31) + AnonymousClass006.A0D(this.A03)) * 31);
    }

    public ALJ(Integer num, List list, int i, int i2, int i3) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = num;
        this.A04 = list;
    }
}

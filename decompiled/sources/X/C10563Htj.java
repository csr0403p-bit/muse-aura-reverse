package X;

/* renamed from: X.Htj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10563Htj extends C06G {
    public final boolean A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C10563Htj) {
                C10563Htj c10563Htj = (C10563Htj) obj;
                if (this.A00 != c10563Htj.A00 || this.A01 != c10563Htj.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C0KA.A00(C0KA.A02(this.A00), this.A01);
    }

    public final String toString() {
        return FGI.A0p("VolumeChangedUpdate(isMin=", ", wasIncreased=", ")", this.A00, this.A01);
    }

    public C10563Htj(boolean z, boolean z2) {
        this.A00 = z;
        this.A01 = z2;
    }
}

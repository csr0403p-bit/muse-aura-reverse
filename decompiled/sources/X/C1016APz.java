package X;

/* renamed from: X.APz, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1016APz {
    public final float A00;
    public final long A01;
    public final AOe<Float> A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1016APz) {
                C1016APz c1016APz = (C1016APz) obj;
                if (Float.compare(this.A00, c1016APz.A00) == 0) {
                    long j = this.A01;
                    long j2 = c1016APz.A01;
                    long j3 = C15k.A01;
                    if (j != j2 || !C7384Etj.areEqual(this.A02, c1016APz.A02)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iA04 = C8j4.A04(this.A00);
        long j = this.A01;
        long j2 = C15k.A01;
        return AnonymousClass005.A0G(this.A02, C60R.A00(j, iA04));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("Scale(scale=");
        sbA0x.append(this.A00);
        sbA0x.append(", transformOrigin=");
        long j = this.A01;
        long j2 = C15k.A01;
        StringBuilder sb = new StringBuilder("TransformOrigin(packedValue=");
        sb.append(j);
        sbA0x.append((Object) AnonymousClass006.A0z(sb));
        sbA0x.append(", animationSpec=");
        return AnonymousClass007.A0Z(this.A02, sbA0x);
    }

    /* JADX WARN: Incorrect types in method signature: (FJLX/AOe<Ljava/lang/Float;>;)V */
    public C1016APz(AOe aOe, float f, long j) {
        this.A00 = f;
        this.A01 = j;
        this.A02 = aOe;
    }
}

package X;

/* renamed from: X.BbE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2428BbE {
    public final long A00;
    public final EnumC5133DaN A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2428BbE) {
                C2428BbE c2428BbE = (C2428BbE) obj;
                if (this.A00 != c2428BbE.A00 || !this.A02.equals(c2428BbE.A02) || this.A01 != c2428BbE.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public static C2428BbE A00(C5123Da7 c5123Da7, EnumC5133DaN enumC5133DaN, String str) {
        return new C2428BbE(enumC5133DaN, str, c5123Da7.A00);
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A01, AnonymousClass005.A0I(this.A02, C3cI.A01(this.A00)));
    }

    public final String toString() {
        long j = this.A00;
        String str = this.A02;
        EnumC5133DaN enumC5133DaN = this.A01;
        StringBuilder sbA0z = C60O.A0z("FieldCacheKey(nodeKey=", j);
        sbA0z.append(", fieldName=");
        sbA0z.append(str);
        return C3cJ.A0L(enumC5133DaN, ", access=", sbA0z);
    }

    public C2428BbE(EnumC5133DaN enumC5133DaN, String str, long j) {
        AnonymousClass003.A0x(str, enumC5133DaN);
        this.A00 = j;
        this.A02 = str;
        this.A01 = enumC5133DaN;
    }
}

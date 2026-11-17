package X;

import java.util.List;

/* loaded from: classes4.dex */
public final class BFU implements C9uE {
    public final List<C07107nn> A00;
    public final BO5 A01;

    public BFU(List list, BO5 bo5) {
        C7384Etj.A0Y(list, 1);
        this.A01 = bo5;
        this.A00 = list;
    }

    public final String toString() {
        return FGI.A0M(A00(this, false), " (Kotlin reflection is not available)");
    }

    public static final String A00(BFU bfu, boolean z) {
        String string;
        BO5 bo5 = bfu.A01;
        C9uG c9uG = (C9uG) bo5;
        if (c9uG != null) {
            Class clsA01 = C9uT.A01(c9uG);
            string = clsA01.isArray() ? boolean[].class.equals(clsA01) ? "kotlin.BooleanArray" : char[].class.equals(clsA01) ? "kotlin.CharArray" : byte[].class.equals(clsA01) ? "kotlin.ByteArray" : short[].class.equals(clsA01) ? "kotlin.ShortArray" : int[].class.equals(clsA01) ? "kotlin.IntArray" : float[].class.equals(clsA01) ? "kotlin.FloatArray" : long[].class.equals(clsA01) ? "kotlin.LongArray" : double[].class.equals(clsA01) ? "kotlin.DoubleArray" : "kotlin.Array" : (z && clsA01.isPrimitive()) ? C9uT.A02(c9uG).getName() : clsA01.getName();
        } else {
            string = bo5.toString();
        }
        List<C07107nn> list = bfu.A00;
        return FGI.A0U(string, list.isEmpty() ? "" : AbstractC0878AGe.A0L(", ", "<", ">", list, new C8i5(bfu, 4)), "");
    }

    @Override // X.C9uE
    public final List<C07107nn> ACU() {
        return this.A00;
    }

    @Override // X.C9uE
    public final BO5 ADh() {
        return this.A01;
    }

    @Override // X.C9uE
    public final boolean AOi() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof BFU) {
            BFU bfu = (BFU) obj;
            if (this.A01.equals(bfu.A01) && this.A00.equals(bfu.A00)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AnonymousClass005.A0F(this.A00, AnonymousClass005.A0E(this.A01));
    }

    @Override // X.InterfaceC7518Eyt
    public final List getAnnotations() {
        throw F60.createAndThrow();
    }
}

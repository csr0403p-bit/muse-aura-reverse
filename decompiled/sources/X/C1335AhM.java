package X;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.AhM, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1335AhM extends AbstractC1336AhN implements APS {
    public final int A00;
    public final long A01;
    public final long A02;
    public final List<B6A> A03;
    public final List<Float> A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1335AhM) {
                C1335AhM c1335AhM = (C1335AhM) obj;
                if (!C7384Etj.areEqual(this.A03, c1335AhM.A03) || !C7384Etj.areEqual(this.A04, c1335AhM.A04) || this.A02 != c1335AhM.A02 || this.A01 != c1335AhM.A01 || this.A00 != c1335AhM.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        String strA0v;
        long j = this.A02;
        String strA0v2 = "";
        if (((((j & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            StringBuilder sbA0x = C60O.A0x("start=");
            AWx.A0E(j, sbA0x);
            strA0v = AnonymousClass001.A0v(", ", sbA0x);
        } else {
            strA0v = "";
        }
        long j2 = this.A01;
        if ((((9187343241974906880L ^ (j2 & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) == 0) {
            StringBuilder sbA0x2 = C60O.A0x("end=");
            AWx.A0E(j2, sbA0x2);
            strA0v2 = AnonymousClass001.A0v(", ", sbA0x2);
        }
        StringBuilder sbA0x3 = C60O.A0x("LinearGradient(colors=");
        sbA0x3.append(this.A03);
        sbA0x3.append(", stops=");
        sbA0x3.append(this.A04);
        sbA0x3.append(", ");
        sbA0x3.append(strA0v);
        sbA0x3.append(strA0v2);
        sbA0x3.append("tileMode=");
        return AnonymousClass007.A0Z(C2b3.A00(this.A00), sbA0x3);
    }

    @Override // X.AbstractC1336AhN
    public final Shader A08(long j) {
        long j2 = this.A02;
        long j3 = j2 >> 32;
        if (C8j3.A05(j3) == Float.POSITIVE_INFINITY) {
            j3 = j >> 32;
        }
        float fA05 = C8j3.A05(j3);
        long j4 = j2 & 4294967295L;
        if (C8j3.A05(j4) == Float.POSITIVE_INFINITY) {
            j4 = j & 4294967295L;
        }
        float fA052 = C8j3.A05(j4);
        long j5 = this.A01;
        long j6 = j5 >> 32;
        if (C8j3.A05(j6) == Float.POSITIVE_INFINITY) {
            j6 = j >> 32;
        }
        float fA053 = C8j3.A05(j6);
        long j7 = j5 & 4294967295L;
        if (C8j3.A05(j7) == Float.POSITIVE_INFINITY) {
            j7 = j & 4294967295L;
        }
        float fA054 = C8j3.A05(j7);
        List<B6A> list = this.A03;
        List<Float> list2 = this.A04;
        long jA0L = AnonymousClass005.A0L(fA05, fA052);
        long jA0M = AnonymousClass005.A0M(fA053, fA054);
        int i = this.A00;
        AbstractC1337AhO.A00(list, list2);
        float fA00 = AnonymousClass001.A00(jA0L);
        float fA01 = AnonymousClass001.A01(jA0L, 4294967295L);
        float fA002 = AnonymousClass001.A00(jA0M);
        float fA012 = AnonymousClass001.A01(jA0M, 4294967295L);
        int size = list.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = HxS.A01(list.get(i2).A00);
        }
        return new LinearGradient(fA00, fA01, fA002, fA012, iArr, list2 != null ? AbstractC0878AGe.A0m(list2) : null, AbstractC2070Axl.A00(i));
    }

    @Override // X.APS
    public final Object APb(Object obj, float f) {
        Object c1335AhM = obj;
        if (obj == null) {
            c1335AhM = new C1326AhD(B6A.A06);
        }
        if (c1335AhM instanceof C1326AhD) {
            List<B6A> list = this.A03;
            ArrayList arrayListA0t = C60Q.A0t(list);
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i);
                arrayListA0t.add(C60P.A04(((C1326AhD) c1335AhM).A00));
            }
            c1335AhM = new C1335AhM(arrayListA0t, this.A04, this.A00, this.A02, this.A01);
        }
        if (!(c1335AhM instanceof C1335AhM)) {
            return null;
        }
        C1335AhM c1335AhM2 = (C1335AhM) c1335AhM;
        return new C1335AhM(AbstractC0868AEg.A00(this.A03, c1335AhM2.A03, f), AbstractC0868AEg.A01(this.A04, c1335AhM2.A04, f), f < 0.5f ? this.A00 : c1335AhM2.A00, A06(this.A02, c1335AhM2.A02, f), A06(this.A01, c1335AhM2.A01, f));
    }

    public final int hashCode() {
        return AnonymousClass006.A06(this.A01, AnonymousClass006.A06(this.A02, (AnonymousClass005.A0E(this.A03) + C60R.A01(this.A04)) * 31)) + this.A00;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0007: IPUT (r4 I:long), (r0 I:X.AhM) (LINE:7) X.AhM.A02 long, block:B:2:0x0000 */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0009: IPUT (r6 I:long), (r0 I:X.AhM) (LINE:9) X.AhM.A01 long, block:B:2:0x0000 */
    public C1335AhM(List<B6A> list, List<Float> list2, long j, long j2, int i) {
        long j3;
        long j4;
        this.A03 = list;
        this.A04 = list2;
        this.A02 = j3;
        this.A01 = j4;
        this.A00 = j;
    }

    public static final long A06(long j, long j2, float f) {
        return (((((j & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0 && (((9187343241974906880L ^ (j2 & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) == 0) ? AbstractC04560zN.A00(j, j2, f) : f >= 0.5f ? j2 : j;
    }
}

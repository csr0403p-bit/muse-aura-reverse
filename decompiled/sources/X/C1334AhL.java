package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.AhL, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1334AhL extends AbstractC1336AhN implements APS {
    public final float A00;
    public final int A01;
    public final long A02;
    public final List<B6A> A03;
    public final List<Float> A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1334AhL) {
                C1334AhL c1334AhL = (C1334AhL) obj;
                if (!C7384Etj.areEqual(this.A03, c1334AhL.A03) || !C7384Etj.areEqual(this.A04, c1334AhL.A04) || this.A02 != c1334AhL.A02 || this.A00 != c1334AhL.A00 || this.A01 != c1334AhL.A01) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.APS
    public final Object APb(Object obj, float f) {
        Object c1334AhL = obj;
        if (obj == null) {
            c1334AhL = new C1326AhD(B6A.A06);
        }
        if (c1334AhL instanceof C1326AhD) {
            List<B6A> list = this.A03;
            ArrayList arrayListA0t = C60Q.A0t(list);
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i);
                arrayListA0t.add(C60P.A04(((C1326AhD) c1334AhL).A00));
            }
            c1334AhL = new C1334AhL(arrayListA0t, this.A04, this.A00, this.A01, this.A02);
        }
        if (!(c1334AhL instanceof C1334AhL)) {
            return null;
        }
        C1334AhL c1334AhL2 = (C1334AhL) c1334AhL;
        return new C1334AhL(AbstractC0868AEg.A00(this.A03, c1334AhL2.A03, f), AbstractC0868AEg.A01(this.A04, c1334AhL2.A04, f), AnonymousClass003.A01(f, this.A00, c1334AhL2.A00), f < 0.5f ? this.A01 : c1334AhL2.A01, AbstractC04560zN.A00(this.A02, c1334AhL2.A02, f));
    }

    public final int hashCode() {
        return AnonymousClass005.A02(C60R.A00(this.A02, (AnonymousClass005.A0E(this.A03) + C60R.A01(this.A04)) * 31), this.A00) + this.A01;
    }

    public final String toString() {
        String strA0v;
        long j = this.A02;
        if ((j & 9223372034707292159L) != 9205357640488583168L) {
            StringBuilder sbA0x = C60O.A0x("center=");
            AWx.A0E(j, sbA0x);
            strA0v = AnonymousClass001.A0v(", ", sbA0x);
        } else {
            strA0v = "";
        }
        float f = this.A00;
        String strA0R = (Float.floatToRawIntBits(f) & Integer.MAX_VALUE) < 2139095040 ? FGI.A0R("radius=", ", ", f) : "";
        StringBuilder sbA0x2 = C60O.A0x("RadialGradient(colors=");
        sbA0x2.append(this.A03);
        sbA0x2.append(", stops=");
        sbA0x2.append(this.A04);
        sbA0x2.append(", ");
        sbA0x2.append(strA0v);
        sbA0x2.append(strA0R);
        sbA0x2.append("tileMode=");
        return AnonymousClass007.A0Z(C2b3.A00(this.A01), sbA0x2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x000b: IPUT (r4 I:int), (r0 I:X.AhL) (LINE:11) X.AhL.A01 int, block:B:2:0x0000 */
    public C1334AhL(List<B6A> list, List<Float> list2, long j, float f, int i) {
        int i2;
        this.A03 = list;
        this.A04 = list2;
        this.A02 = f;
        this.A00 = j;
        this.A01 = i2;
    }
}

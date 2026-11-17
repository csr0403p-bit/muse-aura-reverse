package X;

import java.util.List;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class BBb implements ApJ {
    public int A00;
    public int A01;
    public AeA<Object> A02;
    public C0918AHu<BCS<?>, Object> A03;
    public B1X A04;
    public InterfaceC2230BCa A05;
    public G0V<? super BFM, ? super Integer, Unit> A06;

    public static void A00(BBb bBb, Object obj, Object obj2, int i, int i2) {
        bBb.A06 = new BTH(obj, obj2, i, i2);
    }

    public final void A02() {
        InterfaceC2230BCa interfaceC2230BCa = this.A05;
        if (interfaceC2230BCa != null) {
            interfaceC2230BCa.AZi();
        }
        this.A05 = null;
        this.A02 = null;
        this.A03 = null;
        this.A06 = null;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/BBJ;Ljava/util/List<LX/BCR;>;LX/BCa;)V */
    public static final void A01(InterfaceC2230BCa interfaceC2230BCa, BBJ bbj, List list) {
        BBb bBb;
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int iA0L = bbj.A0L((BCR) list.get(i));
            int iA02 = BBJ.A02(bbj, iA0L);
            int[] iArr = bbj.A0G;
            int iA05 = BBJ.A05(bbj, iArr, iA02);
            Object obj = (iA05 > iA05 || iA05 >= BBJ.A03(bbj, iArr, BBJ.A02(bbj, iA0L + 1))) ? C78N.A00 : bbj.A0H[BBJ.A01(bbj, iA05)];
            if ((obj instanceof BBb) && (bBb = (BBb) obj) != null) {
                bBb.A05 = interfaceC2230BCa;
            }
        }
    }
}

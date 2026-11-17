package X;

import com.facebook.hyperthrift.HyperThriftBase;
import com.facebook.systrace.Systrace;

/* loaded from: classes5.dex */
public final class DVW {
    public final DKJ A00;
    public final DVX A01;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0231  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A01(X.C5084DVd r10, java.lang.Object r11) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 790
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DVW.A01(X.DVd, java.lang.Object):void");
    }

    public DVW(DKJ dkj, DVX dvx) {
        this.A00 = dkj;
        this.A01 = dvx;
    }

    public static void A00(HyperThriftBase hyperThriftBase, DVW dvw, String str) {
        int i;
        HHf.A00("HyperThriftWriter.write", "type", str, AnonymousClass001.A0h());
        try {
            C4987DKg c4987DKgA00 = dvw.A00.A00(str);
            Object[] objArr = hyperThriftBase.A01;
            DVX dvx = dvw.A01;
            dvx.A0K();
            C4986DKf[] c4986DKfArr = c4987DKgA00.A02;
            int length = c4986DKfArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                C4986DKf c4986DKf = c4986DKfArr[i2];
                Object obj = objArr[i2];
                if (obj != null && obj != HyperThriftBase.A02) {
                    String str2 = c4986DKf.A01;
                    if (str2 == null) {
                        str2 = "";
                    }
                    C5084DVd c5084DVd = c4986DKf.A00;
                    C5082DVb c5082DVb = new C5082DVb(str2, AbstractC7484Exl.A00(c5084DVd.A00), c4986DKf.A02);
                    if (dvx instanceof DVZ) {
                        DVZ dvz = (DVZ) dvx;
                        byte b = c5082DVb.A00;
                        if (b == 2) {
                            dvz.A00 = c5082DVb;
                        } else {
                            byte b2 = DVZ.A07[b];
                            short s = c5082DVb.A03;
                            short s2 = dvz.A02;
                            if (s <= s2 || (i = s - s2) > 15) {
                                DVZ.A02(dvz, b2);
                                dvz.A09(s);
                            } else {
                                DVZ.A02(dvz, (byte) (b2 | (i << 4)));
                            }
                            dvz.A02 = s;
                        }
                    } else {
                        dvx.A07(c5082DVb.A00);
                        dvx.A09(c5082DVb.A03);
                    }
                    dvw.A01(c5084DVd, obj);
                }
            }
            dvx.A0J();
            dvx.A0L();
        } finally {
            Systrace.A03(4L);
        }
    }
}

package X;

import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.jvm.functions.Function0;

/* renamed from: X.ASp, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1045ASp {
    public static final HnV A01 = new HnV(0.2f, 0.0f, 0.8f, 1.0f);
    public static final HnV A02 = new HnV(0.4f, 0.0f, 1.0f, 1.0f);
    public static final HnV A03 = new HnV(0.0f, 0.0f, 0.65f, 1.0f);
    public static final HnV A04 = new HnV(0.1f, 0.0f, 0.45f, 1.0f);
    public static final HnV A00 = new HnV(0.4f, 0.0f, 0.2f, 1.0f);

    public static final void A00(float f, long j, BRg bRg, BFM bfm, int i, int i2) {
        float f2 = f;
        BRg bRg2 = bRg;
        bfm.AgG(-1482707784);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0N(bfm, j);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A06(bfm, f2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                f2 = 4.0f;
            }
            BBI bbi = (BBI) bfm;
            AaJ aaJ = new AaJ(null, AKO.A04(Am0.A04, bbi).Ah4(f2), 4.0f, 2, 0);
            C1049ASt c1049AStA01 = AbstractC1046ASq.A01(bfm);
            C31w<Integer, AOW> c31w = AVd.A05;
            C28s c28s = C2HU.A02;
            ASj aSj = new ASj(c28s, 6660, 0);
            Integer num = C79.A00;
            C1041ASi c1041ASi = new C1041ASi(aSj, num, 0L);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = new C1050ASu(c1041ASi, c1049AStA01, c31w, 0, 5);
                BBI.A0O(bbi, objAaT);
            }
            C1050ASu c1050ASu = (C1050ASu) objAaT;
            boolean z = bfm.A67(c1041ASi);
            Object objAaT2 = bfm.AaT();
            if (z || objAaT2 == obj) {
                objAaT2 = new BTW(c1041ASi, c1050ASu, 0, 5, 0);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A15(bfm, objAaT2);
            boolean zA67 = bfm.A67(c1049AStA01);
            Object objAaT3 = bfm.AaT();
            if (zA67 || objAaT3 == obj) {
                objAaT3 = BTA.A00(bfm, c1050ASu, c1049AStA01, 2);
            }
            AnonymousClass001.A17(bfm, objAaT3, c1050ASu);
            C1050ASu c1050ASuA00 = AbstractC1046ASq.A00(new C1041ASi(new ASj(c28s, 1332, 0), num, 0L), c1049AStA01, bfm, 0.0f, 286.0f);
            Object objAaT4 = bfm.AaT();
            if (objAaT4 == obj) {
                objAaT4 = BUU.A00(bfm, 38);
            }
            C1050ASu c1050ASuA002 = AbstractC1046ASq.A00(new C1041ASi(AbstractC1052ASw.A00((G0U) objAaT4), num, 0L), c1049AStA01, bfm, 0.0f, 290.0f);
            Object objAaT5 = bfm.AaT();
            if (objAaT5 == obj) {
                objAaT5 = BUU.A00(bfm, 39);
            }
            C1050ASu c1050ASuA003 = AbstractC1046ASq.A00(new C1041ASi(AbstractC1052ASw.A00((G0U) objAaT5), num, 0L), c1049AStA01, bfm, 0.0f, 290.0f);
            BRg bRgA07 = C10G.A07(ARD.A01(bRg2, C2278BSe.A00(25), true), 40.0f);
            boolean zA1V = AnonymousClass002.A1V(bfm, aaJ, AnonymousClass005.A1T(bfm, c1050ASuA002, c1050ASuA003, c1050ASuA00, bfm.A65(c1050ASu)) | AnonymousClass004.A1K(iA0d), (iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32);
            Object objAaT6 = bfm.AaT();
            if (zA1V || objAaT6 == obj) {
                objAaT6 = new C1047ASr(c1050ASu, c1050ASuA002, c1050ASuA003, c1050ASuA00, aaJ, f2, j);
                BBI.A0O(bbi, objAaT6);
            }
            C0zJ.A00(bRgA07, (G0U) objAaT6, bfm, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C05493bv(i, f2, j, bRg2, i2, 1);
        }
    }

    /* JADX WARN: Incorrect types in method signature: (Lkotlin/jvm/functions/Function0<Ljava/lang/Float;>;LX/BRg;JZJFFLX/BFM;II)V */
    public static final void A01(BFM bfm, BRg bRg, Function0 function0, float f, float f2, int i, int i2, long j, long j2, boolean z) {
        float f3 = f;
        float f4 = f2;
        boolean z2 = z;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(function0, 0);
        bfm.AgG(-1418285171);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0O(bfm, j);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            iA0T |= 3072;
        } else if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0q(bfm, z2);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0Q(bfm, j2);
        }
        int i5 = i2 & 32;
        int iA09 = 196608;
        if (i5 != 0) {
            iA0T |= iA09;
        } else if ((196608 & i) == 0) {
            iA09 = AnonymousClass004.A09(bfm, f3);
            iA0T |= iA09;
        }
        int i6 = i2 & 64;
        int iA0A = 1572864;
        if (i6 != 0) {
            iA0T |= iA0A;
        } else if ((1572864 & i) == 0) {
            iA0A = AnonymousClass004.A0A(bfm, f4);
            iA0T |= iA0A;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 599187, 599186), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                z2 = false;
            }
            if (i5 != 0) {
                f3 = 4.0f;
            }
            if (i6 != 0) {
                f4 = 40.0f;
            }
            BBI bbi = (BBI) bfm;
            AaJ aaJA00 = AaJ.A00(null, AKO.A04(Am0.A04, bbi).Ah4(f3), 0);
            BRg bRgA07 = C10G.A07(bRg2, f4);
            boolean zA1V = AnonymousClass002.A1V(bfm, aaJA00, AnonymousClass004.A1F(iA0T) | AnonymousClass004.A1M(iA0T), AnonymousClass005.A1L(iA0T)) | ((iA0T & 896) == 256);
            Object objAaT = bfm.AaT();
            if (zA1V || objAaT == C78N.A00) {
                objAaT = new C1048ASs(aaJA00, function0, j2, j, z2);
                BBI.A0O(bbi, objAaT);
            }
            C0zJ.A00(bRgA07, (G0U) objAaT, bfm, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C1eF(bRg2, function0, f3, f4, i, i2, j, j2, z2);
        }
    }

    public static final void A02(AT3 at3, AaJ aaJ, float f, float f2, long j) {
        float f3 = aaJ.A01 / 2.0f;
        float fA00 = AnonymousClass001.A00(at3.AKb()) - (2.0f * f3);
        long jA0P = C8j3.A0P(f3);
        at3.A9K(null, aaJ, f, f2, 1.0f, 3, j, (jA0P & 4294967295L) | (jA0P << 32), C8j4.A0J(fA00), false);
    }
}

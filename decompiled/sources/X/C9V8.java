package X;

import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.common.dextricks.RuntimeInternals;

/* renamed from: X.9V8, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9V8 {
    /* JADX WARN: Incorrect types in method signature: (LX/AFR;LX/ALE;LX/BRg;LX/G0U<-LX/9n4;Lkotlin/Unit;>;LX/G0U<-LX/9n4;Lkotlin/Unit;>;LX/BFM;II)V */
    public static final void A00(BFM bfm, BRg bRg, ALE ale, AFR afr, G0U g0u, G0U g0u2, int i, int i2) {
        G0U g0u3;
        G0U g0u4 = g0u;
        BRg bRg2 = bRg;
        AnonymousClass003.A0u(afr, ale);
        bfm.AgG(1842346242);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, afr) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, ale);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, bRg2);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            iA0T |= 3072;
        } else if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0W(bfm, g0u4);
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            iA0T |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0X(bfm, g0u2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 9363, 9362), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                g0u4 = null;
            }
            g0u3 = i5 == 0 ? g0u2 : null;
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = BUU.A00(bfm, 22);
            }
            G0U g0u5 = (G0U) objAaT;
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = BUU.A00(bfm, 23);
            }
            G0U g0u6 = (G0U) objAaT2;
            boolean zA1M = AnonymousClass003.A1M(bfm, afr, ale) | AnonymousClass002.A1Q(iA0T & 7168, 2048) | ((57344 & iA0T) == 16384);
            Object objAaT3 = bfm.AaT();
            if (zA1M || objAaT3 == obj) {
                objAaT3 = new ALD(ale, afr, g0u4, g0u3);
                BBI.A0T(bfm, objAaT3);
            }
            AbstractC1532Ako.A03(bfm, bRg2, g0u5, null, g0u6, (G0U) objAaT3, ((iA0T >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 3078, 4);
        } else {
            bfm.Afo();
            g0u3 = g0u2;
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C2344BUs(g0u3, g0u4, ale, bRg2, afr, i, i2, 0);
        }
    }
}

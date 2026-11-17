package X;

import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.jvm.functions.Function0;

/* renamed from: X.72Y, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C72Y {
    /* JADX WARN: Incorrect types in method signature: (LX/76B;IILX/G0W<-LX/71L;-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/BFM;II)V */
    public static final void A00(BFM bfm, C76B c76b, G0W g0w, int i, int i2, int i3, int i4) {
        C76B c76b2 = c76b;
        int i5 = i;
        int i6 = i2;
        bfm.AgG(-474572032);
        int i7 = i4 & 1;
        int iA0d = i7 != 0 ? i3 | 6 : (i3 & 6) == 0 ? AnonymousClass004.A0d(bfm, c76b) | i3 : i3;
        int i8 = i4 & 2;
        if (i8 != 0) {
            iA0d |= 48;
        } else if ((i3 & 48) == 0) {
            iA0d |= AnonymousClass004.A0E(bfm, i);
        }
        int i9 = i4 & 4;
        if (i9 != 0) {
            iA0d |= 384;
        } else if ((i3 & 384) == 0) {
            iA0d |= AnonymousClass004.A0F(bfm, i6);
        }
        if ((i3 & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, g0w);
        }
        if ((iA0d & 1171) == 1170 && bfm.AKh()) {
            bfm.Afo();
        } else {
            if (i7 != 0) {
                c76b2 = C76B.A00;
            }
            if (i8 != 0) {
                i5 = 0;
            }
            if (i9 != 0) {
                i6 = 0;
            }
            bfm.AgF(1849434622);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = C72a.A00;
                bfm.Ai0(objAaT);
            }
            BBI bbi = (BBI) bfm;
            BBI.A0R(bbi, false);
            Function0 function0 = (Function0) ((InterfaceC7353EnQ) objAaT);
            bfm.AgF(-683746039);
            bfm.AgF(-548224868);
            if (!(bbi.A0V instanceof C73Q)) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            C60R.A13(bfm, bbi, function0);
            C8i0.A00(bfm, c76b2, 18);
            C8i0.A00(bfm, C059472r.A05(i6), 19);
            C8i0.A00(bfm, C059572s.A02(i5), 20);
            AnonymousClass001.A1G(C72X.A00, bfm, g0w, ((iA0d >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6);
            AnonymousClass002.A10(bbi, true, false);
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C8iE(c76b2, g0w, i5, i6, i3, i4, 0);
        }
    }
}

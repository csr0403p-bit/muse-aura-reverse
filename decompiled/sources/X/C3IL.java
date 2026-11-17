package X;

import androidx.compose.ui.Alignment;
import kotlin.Unit;

/* renamed from: X.3IL, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C3IL {
    /* JADX WARN: Incorrect types in method signature: (LX/BRg;Landroidx/compose/ui/Alignment;ZLX/G0W<-LX/0Ig;-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/BFM;II)V */
    public static final void A00(BFM bfm, Alignment alignment, BRg bRg, final G0W g0w, final int i, final int i2, boolean z) {
        final BRg bRg2 = bRg;
        final boolean z2 = z;
        final Alignment alignment2 = alignment;
        bfm.AgG(380139498);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, alignment2);
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0p(bfm, z2);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, g0w);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                alignment2 = C2VU.A0E;
            }
            if (i5 != 0) {
                z2 = false;
            }
            InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(alignment2, z2);
            boolean zA65 = bfm.A65(interfaceC1380AiAA01) | ((iA0d & 7168) == 2048);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new C3bU(0, g0w, interfaceC1380AiAA01);
                bfm.Ai0(objAaT);
            }
            AbstractC1360Ahl.A01(bRg2, (G0V) objAaT, bfm, iA0d & 14, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new G0V() { // from class: X.3IM
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    BRg bRg3 = bRg2;
                    Alignment alignment3 = alignment2;
                    boolean z3 = z2;
                    G0W g0w2 = g0w;
                    int i6 = i;
                    C3IL.A00((BFM) obj, alignment3, bRg3, g0w2, AnonymousClass011.A00(i6), i2, z3);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}

package X;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Deprecated;
import kotlin.Unit;

/* renamed from: X.7VF, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7VF {
    /* JADX WARN: Incorrect types in method signature: (LX/ApQ;LX/BRg;LX/Arm;ZIILX/G0U<-LX/Aux;Lkotlin/Unit;>;LX/G0U<-Ljava/lang/Integer;Lkotlin/Unit;>;LX/BFM;II)V */
    @Deprecated(message = "Use Text or BasicText and pass an AnnotatedString that contains a LinkAnnotation. Check LinkAnnotation's documentation for more details and samples.")
    public static final void A00(BFM bfm, BRg bRg, final ApQ apQ, C1822Arm c1822Arm, G0U g0u, final G0U g0u2, int i, int i2, final int i3, final int i4, boolean z) {
        BRg bRg2 = bRg;
        int i5 = i;
        int i6 = i2;
        C1822Arm c1822Arm2 = c1822Arm;
        boolean zA1Q = z;
        G0U g0u3 = g0u;
        bfm.AgG(-246609449);
        int iA0d = (i3 & 6) == 0 ? AnonymousClass004.A0d(bfm, apQ) | i3 : i3;
        int i7 = i4 & 2;
        if (i7 != 0) {
            iA0d |= 48;
        } else if ((i3 & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        int i8 = i4 & 4;
        if (i8 != 0) {
            iA0d |= 384;
        } else if ((i3 & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, c1822Arm2);
        }
        int i9 = i4 & 8;
        if (i9 != 0) {
            iA0d |= 3072;
        } else if ((i3 & 3072) == 0) {
            iA0d |= AnonymousClass004.A0q(bfm, zA1Q);
        }
        int i10 = i4 & 16;
        if (i10 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i3 & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0G(bfm, i5);
        }
        int i11 = i4 & 32;
        int iA02 = 196608;
        if (i11 != 0) {
            iA0d |= iA02;
        } else if ((i3 & 196608) == 0) {
            iA02 = AnonymousClass002.A02(bfm.A63(i6) ? 1 : 0);
            iA0d |= iA02;
        }
        int i12 = i4 & 64;
        int iA0Z = 1572864;
        if (i12 != 0) {
            iA0d |= iA0Z;
        } else if ((i3 & 1572864) == 0) {
            iA0Z = AnonymousClass004.A0Z(bfm, g0u3);
            iA0d |= iA0Z;
        }
        if ((i3 & 12582912) == 0) {
            iA0d |= AnonymousClass004.A0a(bfm, g0u2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 4793491, 4793490), bfm, iA0d)) {
            if (i7 != 0) {
                bRg2 = BRg.A00;
            }
            if (i8 != 0) {
                c1822Arm2 = C1822Arm.A03;
            }
            zA1Q = C60Q.A1Q(i9, zA1Q);
            if (i10 != 0) {
                i5 = 1;
            }
            if (i11 != 0) {
                i6 = Integer.MAX_VALUE;
            }
            if (i12 != 0) {
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = new C8i1(0);
                    bfm.Ai0(objAaT);
                }
                g0u3 = (G0U) objAaT;
            }
            Object objAaT2 = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT2 == obj) {
                objAaT2 = AnonymousClass004.A11(bfm, null);
            }
            BS0 bs0 = BRg.A00;
            boolean zA1J = AnonymousClass005.A1J(iA0d);
            Object objAaT3 = bfm.AaT();
            if (zA1J || objAaT3 == obj) {
                objAaT3 = new BSK(1, objAaT2, g0u2);
                bfm.Ai0(objAaT3);
            }
            BRg bRgThen = bRg2.then(AaM.A00(bs0, (PointerInputEventHandler) objAaT3, g0u2));
            boolean z2 = (iA0d & 3670016) == 1048576;
            Object objAaT4 = bfm.AaT();
            if (z2 || objAaT4 == obj) {
                objAaT4 = new C8i8(0, g0u3, objAaT2);
                bfm.Ai0(objAaT4);
            }
            AbstractC1727ApL.A04(bfm, bRgThen, null, apQ, c1822Arm2, null, (G0U) objAaT4, i5, i6, 0, (58254 & iA0d) | (458752 & (iA0d << 6)) | ((iA0d << 3) & 3670016), 0, 1920, zA1Q);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            final BRg bRg3 = bRg2;
            final C1822Arm c1822Arm3 = c1822Arm2;
            final G0U g0u4 = g0u3;
            final int i13 = i5;
            final int i14 = i6;
            final boolean z3 = zA1Q;
            bBbAAc.A06 = new G0V() { // from class: X.7Rf
                @Override // X.G0V
                public final Object invoke(Object obj2, Object obj3) {
                    ApQ apQ2 = apQ;
                    BRg bRg4 = bRg3;
                    C1822Arm c1822Arm4 = c1822Arm3;
                    boolean z4 = z3;
                    int i15 = i13;
                    int i16 = i14;
                    G0U g0u5 = g0u4;
                    G0U g0u6 = g0u2;
                    int i17 = i3;
                    C7VF.A00((BFM) obj2, bRg4, apQ2, c1822Arm4, g0u5, g0u6, i15, i16, AnonymousClass011.A00(i17), i4, z4);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}

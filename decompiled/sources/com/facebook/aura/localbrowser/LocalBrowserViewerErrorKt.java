package com.facebook.aura.localbrowser;

import X.AKQ;
import X.AVy;
import X.AbstractC2271BQs;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BRg;
import X.C00x;
import X.C06G;
import X.C06I;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1b8;
import X.C2VU;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC0857A6e;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.ui.HatchScreenEmptyStateKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class LocalBrowserViewerErrorKt {
    public static final void LocalBrowserViewerError(final boolean z, final Function0<Unit> function0, BRg bRg, BFM bfm, final int i, final int i2) {
        BRg bRgA0Q = bRg;
        C7384Etj.A0Y(function0, 1);
        bfm.AgG(-1358287460);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0n |= 384;
        } else if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0f(bfm, bRgA0Q);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 147, 146), bfm, iA0n)) {
            if (i3 != 0) {
                bRgA0Q = BRg.A00;
            }
            BRg bRgA09 = C3U4.A09(C10G.A0D(AnonymousClass005.A0T(bfm, C10G.A02(C2VU.A09, C1b8.A01(bRgA0Q, C06G.A0B(bfm)), false)), Float.NaN, 360.0f), AuraDimensKt.SpacingMedium);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = new G0U() { // from class: com.facebook.aura.localbrowser.LocalBrowserViewerErrorKt$$ExternalSyntheticLambda0
                    @Override // X.G0U
                    public final Object invoke(Object obj) {
                        AnonymousClass002.A11((InterfaceC0857A6e) obj);
                        return Unit.INSTANCE;
                    }
                };
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA09, objAaT, false);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A06, bfm, C2VU.A00, 48);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0Y);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            int i4 = R.string._name_removed__res_0x7f120193;
            if (z) {
                i4 = R.string._name_removed__res_0x7f120ca9;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, i4);
            AVy aVyA00 = BOf.A00(bfm, R.drawable.exclamation_circle_outline, 0);
            C1062ATq c1062ATq = C10G.A02;
            HatchScreenEmptyStateKt.HatchScreenEmptyState(strA01, c1062ATq, aVyA00, null, bfm, (AVy.$stable << 6) | 48, 8);
            if (z) {
                bfm.AgE(809435580);
            } else {
                bfm.AgE(809223013);
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1201a1), null, c1062ATq, AuraButtonStyles.INSTANCE.secondary(null, bfm, 48, 1), null, null, false, false, false, false, false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 3072, (iA0n << 9) & 57344, 0, 134201317);
            }
            bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, false, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            final BRg bRg2 = bRgA0Q;
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.localbrowser.LocalBrowserViewerErrorKt$$ExternalSyntheticLambda1
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    boolean z2 = z;
                    Function0 function03 = function0;
                    BRg bRg3 = bRg2;
                    int i5 = i;
                    LocalBrowserViewerErrorKt.LocalBrowserViewerError(z2, function03, bRg3, (BFM) obj, AnonymousClass011.A02(obj2, i5), i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* renamed from: $r8$lambda$IAq--evLgVWolX6Py0JeF-LDKgs, reason: not valid java name */
    public static /* synthetic */ Unit m1230$r8$lambda$IAqevLgVWolX6Py0JeFLDKgs(InterfaceC0857A6e interfaceC0857A6e) {
        AnonymousClass002.A11(interfaceC0857A6e);
        return Unit.INSTANCE;
    }

    public static final Unit LocalBrowserViewerError$lambda$0$0(InterfaceC0857A6e interfaceC0857A6e) {
        AnonymousClass002.A11(interfaceC0857A6e);
        return Unit.INSTANCE;
    }

    public static final Unit LocalBrowserViewerError$lambda$2(boolean z, Function0 function0, BRg bRg, int i, int i2, BFM bfm, int i3) {
        LocalBrowserViewerError(z, function0, bRg, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }
}

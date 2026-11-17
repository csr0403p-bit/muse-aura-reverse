package com.facebook.aura.browsertask.screen;

import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.B18;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C3UX;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0V;
import X.G0W;
import com.facebook.aura.browsertask.view.AgentComputerScreenKt;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.RemoteBrowserScreenKey;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class RemoteBrowserScreenKt {
    public static /* synthetic */ boolean $r8$lambda$UeUIKopRCTZI7yxi0EdumQgYFUU(AuraNavKey auraNavKey) {
        C7384Etj.A0Y(auraNavKey, 0);
        return auraNavKey instanceof RemoteBrowserScreenKey;
    }

    public static final boolean RemoteBrowserScreen$lambda$1$0$0(AuraNavKey auraNavKey) {
        C7384Etj.A0Y(auraNavKey, 0);
        return auraNavKey instanceof RemoteBrowserScreenKey;
    }

    public static final void RemoteBrowserScreen(final String str, final G0W<? super BRg, ? super BFM, ? super Integer, Unit> g0w, BRg bRg, BFM bfm, final int i, final int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(1412641429);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g0w);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            final AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            C3UX c3ux = (C3UX) AnonymousClass004.A15(bfm, objAaT, obj);
            boolean zA1W = AnonymousClass002.A1W(bfm, c3ux, bfm.A65(abstractC3358CGzA0h), AnonymousClass001.A1M(iA0d));
            Object objAaT2 = bfm.AaT();
            if (zA1W || objAaT2 == obj) {
                objAaT2 = new RemoteBrowserSurface(str, abstractC3358CGzA0h, c3ux);
                bfm.Ai0(objAaT2);
            }
            RemoteBrowserSurface remoteBrowserSurface = (RemoteBrowserSurface) objAaT2;
            boolean zA67 = bfm.A67(auraNavigatorA0b);
            Object objAaT3 = bfm.AaT();
            if (zA67 || objAaT3 == obj) {
                objAaT3 = new Function0() { // from class: com.facebook.aura.browsertask.screen.RemoteBrowserScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RemoteBrowserScreenKt.RemoteBrowserScreen$lambda$1$0(auraNavigatorA0b);
                    }
                };
                bfm.Ai0(objAaT3);
            }
            int i4 = iA0d << 6;
            AgentComputerScreenKt.AgentComputerScreen(remoteBrowserSurface, false, (Function0) objAaT3, g0w, bRg2, bfm, AnonymousClass001.A0B(i4, (i4 & 7168) | 48), 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            final BRg bRg3 = bRg2;
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.browsertask.screen.RemoteBrowserScreenKt$$ExternalSyntheticLambda1
                @Override // X.G0V
                public final Object invoke(Object obj2, Object obj3) {
                    String str2 = str;
                    G0W g0w2 = g0w;
                    BRg bRg4 = bRg3;
                    int i5 = i;
                    RemoteBrowserScreenKt.RemoteBrowserScreen(str2, g0w2, bRg4, (BFM) obj2, AnonymousClass011.A02(obj3, i5), i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final Unit RemoteBrowserScreen$lambda$1$0(AuraNavigator auraNavigator) {
        auraNavigator.popAll(new G0U() { // from class: com.facebook.aura.browsertask.screen.RemoteBrowserScreenKt$$ExternalSyntheticLambda2
            @Override // X.G0U
            public final Object invoke(Object obj) {
                C7384Etj.A0Y(obj, 0);
                return Boolean.valueOf(obj instanceof RemoteBrowserScreenKey);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void RemoteScreenshot(final String str, BRg bRg, BFM bfm, final int i, final int i2) {
        final BRg bRg2 = bRg;
        bfm.AgG(-1471844369);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, str) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraImageKt.m2573AuraImageXRP3Ue8(str, bRg2, B18.A02, null, null, false, null, 0L, true, false, true, null, null, null, null, bfm, (iA0d & 14) | 100663680 | (iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 6, 31480);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.browsertask.screen.RemoteBrowserScreenKt$$ExternalSyntheticLambda3
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    String str2 = str;
                    BRg bRg3 = bRg2;
                    int i4 = i;
                    RemoteBrowserScreenKt.RemoteScreenshot(str2, bRg3, (BFM) obj, AnonymousClass011.A00(i4), i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final Unit RemoteBrowserScreen$lambda$2(String str, G0W g0w, BRg bRg, int i, int i2, BFM bfm, int i3) {
        RemoteBrowserScreen(str, g0w, bRg, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }

    public static final Unit RemoteScreenshot$lambda$0(String str, BRg bRg, int i, int i2, BFM bfm, int i3) {
        RemoteScreenshot(str, bRg, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }
}

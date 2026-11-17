package com.facebook.aura.localbrowser;

import X.AKL;
import X.AKQ;
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
import X.BRg;
import X.C00x;
import X.C0Yr;
import X.C0z7;
import X.C1515AkP;
import X.C1BO;
import X.C1b8;
import X.C2CK;
import X.C3cH;
import X.C7384Etj;
import X.C78N;
import X.C78g;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.activity.ComponentActivity;
import com.facebook.aura.main.api.AuthenticatedWindowContent;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class LocalBrowserWindowContent implements AuthenticatedWindowContent {
    public static final LocalBrowserWindowContent INSTANCE = new LocalBrowserWindowContent();

    @Override // com.facebook.aura.main.api.AuthenticatedWindowContent
    public void Underlay(final boolean z, final BRg bRg, BFM bfm, final int i) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> g0v;
        final ComponentActivity componentActivity;
        C7384Etj.A0Y(bRg, 1);
        bfm.AgG(1309428062);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 19, 18), bfm, iA0n)) {
            final LocalBrowserRuntime companion = LocalBrowserRuntime.Companion.getInstance(AnonymousClass002.A0h(bfm));
            Object objA6v = bfm.A6v(AKL.A00);
            if (!(objA6v instanceof ComponentActivity) || (componentActivity = (ComponentActivity) objA6v) == null) {
                BBb bBbAAc2 = bfm.AAc();
                if (bBbAAc2 != null) {
                    bBbAAc2.A06 = new G0V() { // from class: com.facebook.aura.localbrowser.LocalBrowserWindowContent$$ExternalSyntheticLambda0
                        @Override // X.G0V
                        public final Object invoke(Object obj, Object obj2) {
                            this.f$0.Underlay(z, bRg, (BFM) obj, AnonymousClass011.A00(i));
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            boolean zA1M = AnonymousClass003.A1M(bfm, companion, componentActivity);
            Object objAaT = bfm.AaT();
            if (zA1M || objAaT == C78N.A00) {
                objAaT = new G0U() { // from class: com.facebook.aura.localbrowser.LocalBrowserWindowContent$$ExternalSyntheticLambda1
                    @Override // X.G0U
                    public final Object invoke(Object obj) {
                        return new LocalBrowserWindowContent$Underlay$lambda$1$0$$inlined$onDispose$1(companion.offerActivity(componentActivity));
                    }
                };
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A19(bfm, objAaT, companion, componentActivity);
            C1BO c1boA02 = C2CK.A02(bfm, companion.activeSessions);
            if (((Map) c1boA02.getValue()).isEmpty() || !companion.isEnabled() || z) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    g0v = new G0V() { // from class: com.facebook.aura.localbrowser.LocalBrowserWindowContent$$ExternalSyntheticLambda2
                        @Override // X.G0V
                        public final Object invoke(Object obj, Object obj2) {
                            this.f$0.Underlay(z, bRg, (BFM) obj, AnonymousClass011.A00(i));
                            return Unit.INSTANCE;
                        }
                    };
                    bBbAAc.A06 = g0v;
                }
                return;
            }
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
            C0z7 c0z7 = C0z7.A00;
            bfm.AgE(-2014738642);
            for (LocalBrowserSession localBrowserSession : ((Map) c1boA02.getValue()).values()) {
                bfm.Ag8(-834636693, localBrowserSession.id);
                LocalBrowserKeepScreenOnKt.LocalBrowserKeepScreenOn(localBrowserSession, bfm, LocalBrowserSession.$stable);
                LocalBrowserViewportKt.LocalBrowserViewport(componentActivity, localBrowserSession.target, c0z7.AQJ(BRg.A00), LocalBrowserHostKind.APP, false, null, null, null, bfm, (LocalBrowserTarget.$stable << 3) | 3072, 240);
                BBI.A0R(bbi, false);
            }
            BBI.A0R(bbi, false);
            C1b8.A04(bfm, c0z7.AQJ(BRg.A00), C3cH.A0W(bfm).background);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            g0v = new G0V() { // from class: com.facebook.aura.localbrowser.LocalBrowserWindowContent$$ExternalSyntheticLambda3
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    this.f$0.Underlay(z, bRg, (BFM) obj, AnonymousClass011.A00(i));
                    return Unit.INSTANCE;
                }
            };
            bBbAAc.A06 = g0v;
        }
    }

    public static /* synthetic */ C78g $r8$lambda$QDUTbVadLFEq8EM6alHcTucYAHM(LocalBrowserRuntime localBrowserRuntime, ComponentActivity componentActivity, C0Yr c0Yr) {
        return new LocalBrowserWindowContent$Underlay$lambda$1$0$$inlined$onDispose$1(localBrowserRuntime.offerActivity(componentActivity));
    }

    public static final Unit Underlay$lambda$0(LocalBrowserWindowContent localBrowserWindowContent, boolean z, BRg bRg, int i, BFM bfm, int i2) {
        localBrowserWindowContent.Underlay(z, bRg, bfm, AnonymousClass011.A00(i));
        return Unit.INSTANCE;
    }

    public static final C78g Underlay$lambda$1$0(LocalBrowserRuntime localBrowserRuntime, ComponentActivity componentActivity, C0Yr c0Yr) {
        return new LocalBrowserWindowContent$Underlay$lambda$1$0$$inlined$onDispose$1(localBrowserRuntime.offerActivity(componentActivity));
    }

    public static final Unit Underlay$lambda$3(LocalBrowserWindowContent localBrowserWindowContent, boolean z, BRg bRg, int i, BFM bfm, int i2) {
        localBrowserWindowContent.Underlay(z, bRg, bfm, AnonymousClass011.A00(i));
        return Unit.INSTANCE;
    }

    public static final Unit Underlay$lambda$5(LocalBrowserWindowContent localBrowserWindowContent, boolean z, BRg bRg, int i, BFM bfm, int i2) {
        localBrowserWindowContent.Underlay(z, bRg, bfm, AnonymousClass011.A00(i));
        return Unit.INSTANCE;
    }
}

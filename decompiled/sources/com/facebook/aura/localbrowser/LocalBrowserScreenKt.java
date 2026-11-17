package com.facebook.aura.localbrowser;

import X.AKT;
import X.AbstractC1724ApD;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C06787bB;
import X.C0Yr;
import X.C1BO;
import X.C1EP;
import X.C28u;
import X.C2CK;
import X.C3UX;
import X.C7384Etj;
import X.C78N;
import X.C78g;
import X.C7bA;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC06807bD;
import com.facebook.aura.R;
import com.facebook.aura.backgroundwork.api.BackgroundWork;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.LocalBrowserScreenKey;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class LocalBrowserScreenKt {
    public static /* synthetic */ boolean $r8$lambda$Ss_p0wrONoHMMVjO176V4vT1xDw(AuraNavKey auraNavKey) {
        C7384Etj.A0Y(auraNavKey, 0);
        return auraNavKey instanceof LocalBrowserScreenKey;
    }

    public static final InterfaceC06807bD LocalBrowserScreen$lambda$0$0(AbstractC3358CGz abstractC3358CGz, String str, final C06787bB c06787bB) {
        C7384Etj.A0Y(c06787bB, 2);
        BackgroundWork.INSTANCE.acknowledge(abstractC3358CGz, LocalBrowserBackgroundWorkKt.localBrowserTaskUri(str));
        return new InterfaceC06807bD() { // from class: com.facebook.aura.localbrowser.LocalBrowserScreenKt$LocalBrowserScreen$lambda$0$0$$inlined$onPauseOrDispose$1
            @Override // X.InterfaceC06807bD
            public void runPauseOrOnDisposeEffect() {
            }
        };
    }

    public static final boolean LocalBrowserScreen$lambda$1$0$0(AuraNavKey auraNavKey) {
        C7384Etj.A0Y(auraNavKey, 0);
        return auraNavKey instanceof LocalBrowserScreenKey;
    }

    public static /* synthetic */ C78g $r8$lambda$_gUPYMnPALEIob3Tbl9ONPQwqxY(LocalBrowserComputerSurface localBrowserComputerSurface, C0Yr c0Yr) {
        return new LocalBrowserScreenKt$LocalBrowserScreen$lambda$7$0$$inlined$onDispose$1(localBrowserComputerSurface);
    }

    public static final void LocalBrowserScreen(final String str, final boolean z, final G0W<? super BRg, ? super BFM, ? super Integer, Unit> g0w, BRg bRg, BFM bfm, final int i, final int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> g0v;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(-404270025);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, g0w);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        boolean z2 = false;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            final AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            LocalBrowserRuntime companion = LocalBrowserRuntime.Companion.getInstance(abstractC3358CGzA0h);
            int i4 = iA0d & 14;
            boolean zA67 = bfm.A67(abstractC3358CGzA0h) | AnonymousClass002.A1Q(i4, 4);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new G0U() { // from class: com.facebook.aura.localbrowser.LocalBrowserScreenKt$$ExternalSyntheticLambda3
                    @Override // X.G0U
                    public final Object invoke(Object obj) {
                        return LocalBrowserScreenKt.LocalBrowserScreen$lambda$0$0(abstractC3358CGzA0h, str, (C06787bB) obj);
                    }
                };
                bfm.Ai0(objAaT);
            }
            C7bA.A03(bfm, null, abstractC3358CGzA0h, str, (G0U) objAaT, (iA0d << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 4);
            final AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            boolean zA65 = bfm.A65(auraNavigatorA0b);
            Object objAaT2 = bfm.AaT();
            if (zA65 || objAaT2 == C78N.A00) {
                objAaT2 = new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LocalBrowserScreenKt.LocalBrowserScreen$lambda$1$0(auraNavigatorA0b);
                    }
                };
                bfm.Ai0(objAaT2);
            }
            final Function0 function0 = (Function0) objAaT2;
            Iterator it = ((Map) C1BO.A07(bfm, companion.activeSessions)).values().iterator();
            Object obj = null;
            Object obj2 = null;
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    if (LocalBrowserTaskViewerKt.isFor((LocalBrowserSession) next, str)) {
                        if (z2) {
                            break;
                        }
                        obj2 = next;
                        z2 = true;
                    }
                } else if (z2) {
                    obj = obj2;
                }
            }
            LocalBrowserSession localBrowserSession = (LocalBrowserSession) obj;
            if (localBrowserSession == null) {
                bfm.AgE(-519317150);
                LocalBrowserMissingTaskScreenKt.LocalBrowserMissingTaskScreen(str, function0, bRg2, bfm, i4 | ((iA0d >> 3) & 896), 0);
                bBbAAc = AnonymousClass002.A0Q(bfm, bfm);
                if (bBbAAc != null) {
                    final BRg bRg3 = bRg2;
                    g0v = new G0V() { // from class: com.facebook.aura.localbrowser.LocalBrowserScreenKt$$ExternalSyntheticLambda5
                        @Override // X.G0V
                        public final Object invoke(Object obj3, Object obj4) {
                            String str2 = str;
                            boolean z3 = z;
                            G0W g0w2 = g0w;
                            BRg bRg4 = bRg3;
                            int i5 = i;
                            LocalBrowserScreenKt.LocalBrowserScreen(str2, z3, g0w2, bRg4, (BFM) obj3, AnonymousClass011.A02(obj4, i5), i2);
                            return Unit.INSTANCE;
                        }
                    };
                    bBbAAc.A06 = g0v;
                }
                return;
            }
            BBI bbiA0M = AnonymousClass002.A0M(bfm, -519216245);
            bfm.Ag8(-1956410869, localBrowserSession);
            final C1BO c1boA02 = C2CK.A02(bfm, localBrowserSession.facts);
            Object objAaT3 = bfm.AaT();
            Object obj3 = C78N.A00;
            C3UX c3ux = (C3UX) AnonymousClass004.A15(bfm, objAaT3, obj3);
            boolean zA1K = AnonymousClass003.A1K(bfm, localBrowserSession, c3ux);
            Object objAaT4 = bfm.AaT();
            if (zA1K || objAaT4 == obj3) {
                objAaT4 = new LocalBrowserComputerSurface(localBrowserSession, c3ux);
                bfm.Ai0(objAaT4);
            }
            final LocalBrowserComputerSurface localBrowserComputerSurface = (LocalBrowserComputerSurface) objAaT4;
            boolean zA672 = bfm.A67(localBrowserComputerSurface);
            Object objAaT5 = bfm.AaT();
            if (zA672 || objAaT5 == obj3) {
                objAaT5 = new G0U() { // from class: com.facebook.aura.localbrowser.LocalBrowserScreenKt$$ExternalSyntheticLambda6
                    @Override // X.G0U
                    public final Object invoke(Object obj4) {
                        return new LocalBrowserScreenKt$LocalBrowserScreen$lambda$7$0$$inlined$onDispose$1(localBrowserComputerSurface);
                    }
                };
                bfm.Ai0(objAaT5);
            }
            AnonymousClass001.A17(bfm, objAaT5, localBrowserComputerSurface);
            LocalBrowserKeepScreenOnKt.LocalBrowserKeepScreenOn(localBrowserSession, bfm, LocalBrowserSession.$stable);
            final BRg bRg4 = bRg2;
            ProvideBrowserWindowBackDispatcher(B1V.A00(bfm, new G0V() { // from class: com.facebook.aura.localbrowser.LocalBrowserScreenKt$$ExternalSyntheticLambda7
                @Override // X.G0V
                public final Object invoke(Object obj4, Object obj5) {
                    return LocalBrowserScreenKt.LocalBrowserScreen$lambda$8(localBrowserComputerSurface, z, function0, g0w, bRg4, c1boA02, (BFM) obj4, AnonymousClass001.A0F(obj5));
                }
            }, 1643639224), bfm, 6);
            BBI.A0R(bbiA0M, false);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            final BRg bRg5 = bRg2;
            g0v = new G0V() { // from class: com.facebook.aura.localbrowser.LocalBrowserScreenKt$$ExternalSyntheticLambda8
                @Override // X.G0V
                public final Object invoke(Object obj4, Object obj5) {
                    String str2 = str;
                    boolean z3 = z;
                    G0W g0w2 = g0w;
                    BRg bRg6 = bRg5;
                    int i5 = i;
                    LocalBrowserScreenKt.LocalBrowserScreen(str2, z3, g0w2, bRg6, (BFM) obj4, AnonymousClass011.A02(obj5, i5), i2);
                    return Unit.INSTANCE;
                }
            };
            bBbAAc.A06 = g0v;
        }
    }

    public static final Unit LocalBrowserScreen$lambda$1$0(AuraNavigator auraNavigator) {
        auraNavigator.popAll(new G0U() { // from class: com.facebook.aura.localbrowser.LocalBrowserScreenKt$$ExternalSyntheticLambda2
            @Override // X.G0U
            public final Object invoke(Object obj) {
                C7384Etj.A0Y(obj, 0);
                return Boolean.valueOf(obj instanceof LocalBrowserScreenKey);
            }
        });
        return Unit.INSTANCE;
    }

    public static final C78g LocalBrowserScreen$lambda$7$0(LocalBrowserComputerSurface localBrowserComputerSurface, C0Yr c0Yr) {
        return new LocalBrowserScreenKt$LocalBrowserScreen$lambda$7$0$$inlined$onDispose$1(localBrowserComputerSurface);
    }

    public static final Unit LocalBrowserScreen$lambda$4(String str, boolean z, G0W g0w, BRg bRg, int i, int i2, BFM bfm, int i3) {
        LocalBrowserScreen(str, z, g0w, bRg, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit LocalBrowserScreen$lambda$8(com.facebook.aura.localbrowser.LocalBrowserComputerSurface r8, boolean r9, kotlin.jvm.functions.Function0 r10, X.G0W r11, X.BRg r12, X.C1BO r13, X.BFM r14, int r15) {
        /*
            boolean r0 = X.AnonymousClass004.A1E(r15)
            r5 = r14
            boolean r0 = X.AnonymousClass001.A1b(r0, r14, r15)
            if (r0 == 0) goto L26
            if (r9 != 0) goto L18
            java.lang.Object r0 = r13.getValue()
            com.facebook.aura.localbrowser.LocalBrowserFacts r0 = (com.facebook.aura.localbrowser.LocalBrowserFacts) r0
            java.lang.String r0 = r0.userActionRequired
            r1 = 0
            if (r0 == 0) goto L19
        L18:
            r1 = 1
        L19:
            int r6 = com.facebook.aura.localbrowser.LocalBrowserComputerSurface.$stable
            r7 = 0
            r0 = r8
            r2 = r10
            r3 = r11
            r4 = r12
            com.facebook.aura.browsertask.view.AgentComputerScreenKt.AgentComputerScreen(r0, r1, r2, r3, r4, r5, r6, r7)
        L23:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L26:
            r14.Afo()
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserScreenKt.LocalBrowserScreen$lambda$8(com.facebook.aura.localbrowser.LocalBrowserComputerSurface, boolean, kotlin.jvm.functions.Function0, X.G0W, X.BRg, X.1BO, X.BFM, int):kotlin.Unit");
    }

    public static final Unit LocalBrowserScreen$lambda$9(String str, boolean z, G0W g0w, BRg bRg, int i, int i2, BFM bfm, int i3) {
        LocalBrowserScreen(str, z, g0w, bRg, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }

    public static final void ProvideBrowserWindowBackDispatcher(final G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, final int i) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> g0v2;
        bfm.AgG(1118800838);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, g0v) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0T), bfm, iA0T)) {
            C28u c28uA00 = AbstractC1724ApD.A00(AnonymousClass001.A0J(bfm));
            if (c28uA00 == null) {
                bfm.AgE(1249713068);
                AnonymousClass003.A13(bfm, g0v, iA0T);
                AnonymousClass002.A19(bfm);
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    g0v2 = new G0V() { // from class: com.facebook.aura.localbrowser.LocalBrowserScreenKt$$ExternalSyntheticLambda0
                        @Override // X.G0V
                        public final Object invoke(Object obj, Object obj2) {
                            LocalBrowserScreenKt.ProvideBrowserWindowBackDispatcher(g0v, (BFM) obj, AnonymousClass011.A02(obj2, i));
                            return Unit.INSTANCE;
                        }
                    };
                    bBbAAc.A06 = g0v2;
                }
                return;
            }
            AnonymousClass004.A1A(bfm, 1425784600);
            AKT.A01(bfm, C1EP.A00.A04(c28uA00), g0v, (iA0T << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            g0v2 = new G0V() { // from class: com.facebook.aura.localbrowser.LocalBrowserScreenKt$$ExternalSyntheticLambda1
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    LocalBrowserScreenKt.ProvideBrowserWindowBackDispatcher(g0v, (BFM) obj, AnonymousClass011.A02(obj2, i));
                    return Unit.INSTANCE;
                }
            };
            bBbAAc.A06 = g0v2;
        }
    }

    public static final Unit ProvideBrowserWindowBackDispatcher$lambda$0(G0V g0v, int i, BFM bfm, int i2) {
        ProvideBrowserWindowBackDispatcher(g0v, bfm, AnonymousClass011.A00(i));
        return Unit.INSTANCE;
    }

    public static final Unit ProvideBrowserWindowBackDispatcher$lambda$1(G0V g0v, int i, BFM bfm, int i2) {
        ProvideBrowserWindowBackDispatcher(g0v, bfm, AnonymousClass011.A00(i));
        return Unit.INSTANCE;
    }

    public static final int localBrowserStatusRes(LocalBrowserFacts localBrowserFacts, LocalBrowserPageState localBrowserPageState, boolean z) {
        AnonymousClass003.A0u(localBrowserFacts, localBrowserPageState);
        LocalBrowserControl localBrowserControl = localBrowserFacts.control;
        if (localBrowserControl == LocalBrowserControl.USER) {
            return R.string._name_removed__res_0x7f12019a;
        }
        if (!localBrowserFacts.available) {
            return R.string._name_removed__res_0x7f120c96;
        }
        if (z) {
            return R.string._name_removed__res_0x7f120c80;
        }
        LocalBrowserPagePhase localBrowserPagePhase = localBrowserPageState.phase;
        return localBrowserPagePhase == LocalBrowserPagePhase.LOADING ? R.string._name_removed__res_0x7f120c88 : localBrowserPagePhase == LocalBrowserPagePhase.FAILED ? R.string._name_removed__res_0x7f120ca9 : localBrowserControl != LocalBrowserControl.AGENT ? R.string._name_removed__res_0x7f120c96 : R.string._name_removed__res_0x7f120c9c;
    }
}

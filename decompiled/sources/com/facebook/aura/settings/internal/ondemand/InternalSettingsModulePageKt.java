package com.facebook.aura.settings.internal.ondemand;

import X.AKQ;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C0A8;
import X.C0Yr;
import X.C1515AkP;
import X.C1822Arm;
import X.C1BO;
import X.C1DG;
import X.C2CK;
import X.C2VU;
import X.C3cH;
import X.C7384Etj;
import X.C78N;
import X.C78g;
import X.F60;
import X.G0U;
import X.G0V;
import X.G2j;
import X.InterfaceC0857A6e;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.header.view.HatchPageScreenKt;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.ui.HatchScreenErrorStateKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerKt;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerStyle;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class InternalSettingsModulePageKt {
    /* renamed from: $r8$lambda$YuiE4QWTM7I72S5e-KYXOP6AF8w, reason: not valid java name */
    public static /* synthetic */ Unit m1979$r8$lambda$YuiE4QWTM7I72S5eKYXOP6AF8w() {
        InternalSettingsModule.INSTANCE.request();
        return Unit.INSTANCE;
    }

    public static final void InternalSettingsModulePage(BRg bRg, final G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, final int i, final int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> g0v2;
        final BRg bRg2 = bRg;
        C7384Etj.A0Y(g0v, 1);
        bfm.AgG(-1443742782);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            final C1BO c1boA02 = C2CK.A02(bfm, InternalSettingsModule.state);
            if (c1boA02.getValue() == InternalSettingsModuleState.READY) {
                bfm.AgE(-738496254);
                AnonymousClass003.A13(bfm, g0v, iA0d >> 3);
                bBbAAc = AnonymousClass002.A0Q(bfm, bfm);
                if (bBbAAc != null) {
                    g0v2 = new G0V() { // from class: com.facebook.aura.settings.internal.ondemand.InternalSettingsModulePageKt$$ExternalSyntheticLambda0
                        @Override // X.G0V
                        public final Object invoke(Object obj, Object obj2) {
                            BRg bRg3 = bRg2;
                            G0V g0v3 = g0v;
                            int i4 = i;
                            InternalSettingsModulePageKt.InternalSettingsModulePage(bRg3, g0v3, (BFM) obj, AnonymousClass011.A00(i4), i2);
                            return Unit.INSTANCE;
                        }
                    };
                    bBbAAc.A06 = g0v2;
                }
                return;
            }
            AnonymousClass003.A0l(bfm, -738467424);
            final AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            AuraContainer.SecondaryScreen secondaryScreen = AuraContainer.SecondaryScreen.INSTANCE;
            boolean zA67 = bfm.A67(auraNavigatorA0b);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new Function0() { // from class: com.facebook.aura.settings.internal.ondemand.InternalSettingsModulePageKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        auraNavigatorA0b.back();
                        return Unit.INSTANCE;
                    }
                };
                bfm.Ai0(objAaT);
            }
            HatchPageScreenKt.m997HatchPageScreenZOcclw(secondaryScreen, bRg2, null, 0L, "Internal settings", null, (Function0) objAaT, null, false, false, 0, null, null, null, null, null, null, 0L, 0L, null, 0.0f, null, null, null, 0, null, null, null, false, B1V.A00(bfm, new G2j() { // from class: com.facebook.aura.settings.internal.ondemand.InternalSettingsModulePageKt$$ExternalSyntheticLambda2
                @Override // X.G2j
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    return InternalSettingsModulePageKt.InternalSettingsModulePage$lambda$3(c1boA02, (C1DG) obj, (C1DG) obj2, (BFM) obj3, AnonymousClass001.A0F(obj4));
                }
            }, -31582393), bfm, ((iA0d << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 24582, 0, 805306368, 536870828);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            g0v2 = new G0V() { // from class: com.facebook.aura.settings.internal.ondemand.InternalSettingsModulePageKt$$ExternalSyntheticLambda3
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    BRg bRg3 = bRg2;
                    G0V g0v3 = g0v;
                    int i4 = i;
                    InternalSettingsModulePageKt.InternalSettingsModulePage(bRg3, g0v3, (BFM) obj, AnonymousClass011.A00(i4), i2);
                    return Unit.INSTANCE;
                }
            };
            bBbAAc.A06 = g0v2;
        }
    }

    public static final Unit InternalSettingsModulePage$lambda$3(C1BO c1bo, C1DG c1dg, C1DG c1dg2, BFM bfm, int i) {
        if ((i & 6) == 0) {
            i |= AnonymousClass004.A04(bfm, c1dg.A00);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 131, 130), bfm, i)) {
            BS0 bs0 = BRg.A00;
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bs0);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            C01N.A08(bfm, bs0, c1dg.A00);
            InternalSettingsModulePlaceholder((InternalSettingsModuleState) c1bo.getValue(), null, bfm, 0, 2);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        return Unit.INSTANCE;
    }

    public static final void InternalSettingsModulePlaceholder(final InternalSettingsModuleState internalSettingsModuleState, BRg bRg, BFM bfm, final int i, final int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> g0v;
        final BRg bRg2 = bRg;
        bfm.AgG(-1854213462);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, internalSettingsModuleState) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA08 |= 48;
        } else if ((i & 48) == 0) {
            iA08 |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA08 & 19, 18), bfm, iA08)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Unit unit = Unit.INSTANCE;
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = new G0U() { // from class: com.facebook.aura.settings.internal.ondemand.InternalSettingsModulePageKt$$ExternalSyntheticLambda4
                    @Override // X.G0U
                    public final Object invoke(Object obj2) {
                        return InternalSettingsModulePageKt.InternalSettingsModulePlaceholder$lambda$0$0((C0Yr) obj2);
                    }
                };
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A17(bfm, objAaT, unit);
            if (internalSettingsModuleState == InternalSettingsModuleState.UNAVAILABLE) {
                bfm.AgE(-1298494317);
                Object objAaT2 = bfm.AaT();
                if (objAaT2 == obj) {
                    objAaT2 = new Function0() { // from class: com.facebook.aura.settings.internal.ondemand.InternalSettingsModulePageKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            InternalSettingsModule.INSTANCE.request();
                            return Unit.INSTANCE;
                        }
                    };
                    bfm.Ai0(objAaT2);
                }
                HatchScreenErrorStateKt.HatchScreenErrorState("Internal settings couldn't be downloaded.", (Function0) objAaT2, bRg2, null, null, null, null, bfm, ((iA08 << 3) & 896) | 54, 120);
                bBbAAc = AnonymousClass002.A0Q(bfm, bfm);
                if (bBbAAc != null) {
                    g0v = new G0V() { // from class: com.facebook.aura.settings.internal.ondemand.InternalSettingsModulePageKt$$ExternalSyntheticLambda6
                        @Override // X.G0V
                        public final Object invoke(Object obj2, Object obj3) {
                            InternalSettingsModuleState internalSettingsModuleState2 = internalSettingsModuleState;
                            BRg bRg3 = bRg2;
                            int i4 = i;
                            InternalSettingsModulePageKt.InternalSettingsModulePlaceholder(internalSettingsModuleState2, bRg3, (BFM) obj2, AnonymousClass011.A00(i4), i2);
                            return Unit.INSTANCE;
                        }
                    };
                    bBbAAc.A06 = g0v;
                }
                return;
            }
            BBI bbiA0M = AnonymousClass002.A0M(bfm, -1298305000);
            BRg bRgA0U = AnonymousClass001.A0U(AnonymousClass001.A0R(bRg2), 160.0f);
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(AcQ.A01(C2VU.A00, AuraDimensKt.SpacingSmall), bfm, C2VU.A04, 48);
            int iA0J = AnonymousClass003.A0J(bbiA0M);
            AKQ akqA04 = BBI.A04(bbiA0M);
            BRg bRgA01 = AxM.A01(bfm, bRgA0U);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbiA0M.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbiA0M, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(null, AuraSpinnerStyle.Companion.small(bfm, 6), 0L, bfm, AuraSpinnerStyle.$stable << 3, 5);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1822Arm c1822ArmA0C = C3cH.A0C(bfm, auraTheme);
            long jA07 = C3cH.A07(bfm, auraTheme);
            BS0 bs0 = BRg.A00;
            Object objAaT3 = bfm.AaT();
            if (objAaT3 == obj) {
                objAaT3 = new G0U() { // from class: com.facebook.aura.settings.internal.ondemand.InternalSettingsModulePageKt$$ExternalSyntheticLambda7
                    @Override // X.G0U
                    public final Object invoke(Object obj2) {
                        AnonymousClass002.A11((InterfaceC0857A6e) obj2);
                        return Unit.INSTANCE;
                    }
                };
                bfm.Ai0(objAaT3);
            }
            AuraTextKt.m2639AuraTextUY9GdpU("Downloading internal settings\u2026", AnonymousClass001.A0Y(bs0, objAaT3, false), jA07, c1822ArmA0C, null, null, null, false, 0, 0, 0, null, null, null, bfm, 6, 0, 16368);
            BBI.A0R(bbiA0M, true);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            g0v = new G0V() { // from class: com.facebook.aura.settings.internal.ondemand.InternalSettingsModulePageKt$$ExternalSyntheticLambda8
                @Override // X.G0V
                public final Object invoke(Object obj2, Object obj3) {
                    InternalSettingsModuleState internalSettingsModuleState2 = internalSettingsModuleState;
                    BRg bRg3 = bRg2;
                    int i4 = i;
                    InternalSettingsModulePageKt.InternalSettingsModulePlaceholder(internalSettingsModuleState2, bRg3, (BFM) obj2, AnonymousClass011.A00(i4), i2);
                    return Unit.INSTANCE;
                }
            };
            bBbAAc.A06 = g0v;
        }
    }

    public static final C78g InternalSettingsModulePlaceholder$lambda$0$0(C0Yr c0Yr) {
        InternalSettingsModule internalSettingsModule = InternalSettingsModule.INSTANCE;
        if (InternalSettingsModule.state.getValue() == InternalSettingsModuleState.NOT_LOADED) {
            internalSettingsModule.request();
        }
        return new C78g() { // from class: com.facebook.aura.settings.internal.ondemand.InternalSettingsModulePageKt$InternalSettingsModulePlaceholder$lambda$0$0$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }

    public static final Unit InternalSettingsModulePlaceholder$lambda$1$0() {
        InternalSettingsModule.INSTANCE.request();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit $r8$lambda$LYimufI7f6FRcsZg4QpuNwxbuRM(AuraNavigator auraNavigator) {
        auraNavigator.back();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit $r8$lambda$feuJ2PF65lJ4T4NYoodbEuDcyN0(InterfaceC0857A6e interfaceC0857A6e) {
        AnonymousClass002.A11(interfaceC0857A6e);
        return Unit.INSTANCE;
    }

    public static final Unit InternalSettingsModulePage$lambda$1(BRg bRg, G0V g0v, int i, int i2, BFM bfm, int i3) {
        InternalSettingsModulePage(bRg, g0v, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }

    public static final Unit InternalSettingsModulePage$lambda$2$0(AuraNavigator auraNavigator) {
        auraNavigator.back();
        return Unit.INSTANCE;
    }

    public static final Unit InternalSettingsModulePage$lambda$4(BRg bRg, G0V g0v, int i, int i2, BFM bfm, int i3) {
        InternalSettingsModulePage(bRg, g0v, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }

    public static final Unit InternalSettingsModulePlaceholder$lambda$2(InternalSettingsModuleState internalSettingsModuleState, BRg bRg, int i, int i2, BFM bfm, int i3) {
        InternalSettingsModulePlaceholder(internalSettingsModuleState, bRg, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }

    public static final Unit InternalSettingsModulePlaceholder$lambda$3$0$0(InterfaceC0857A6e interfaceC0857A6e) {
        AnonymousClass002.A11(interfaceC0857A6e);
        return Unit.INSTANCE;
    }

    public static final Unit InternalSettingsModulePlaceholder$lambda$4(InternalSettingsModuleState internalSettingsModuleState, BRg bRg, int i, int i2, BFM bfm, int i3) {
        InternalSettingsModulePlaceholder(internalSettingsModuleState, bRg, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }
}

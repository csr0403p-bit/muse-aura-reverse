package com.facebook.aura.applock;

import X.AKH;
import X.AKL;
import X.AKQ;
import X.AbstractC1754Apr;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.AxM;
import X.B81;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06I;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1BO;
import X.C1b8;
import X.C2CK;
import X.C2VU;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C78N;
import X.C7bA;
import X.C8328Fbu;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import android.app.Activity;
import android.content.Context;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.FragmentActivity;
import com.facebook.aura.R;
import com.facebook.aura.applock.AppBiometricLockViewModel;
import com.facebook.aura.session.LocalUserSessionKt;
import com.facebook.aura.ui.adaptive.AuraContentFrameKt;
import com.facebook.aura.ui.adaptive.AuraContentRole;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.common.AuraDrawableSourceResource;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class AppBiometricLockScreenKt {
    public static final String TAG = "AppBiometricLockScreen";

    /* renamed from: com.facebook.aura.applock.AppBiometricLockScreenKt$AppBiometricLockRetryScreen$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ Function0<Unit> $onLogOut;
        public final /* synthetic */ Function0<Unit> $onUnlock;
        public final /* synthetic */ int $splashIcon;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(int i, Function0<Unit> function0, Function0<Unit> function02, int i2) {
            super(2);
            this.$splashIcon = i;
            this.$onUnlock = function0;
            this.$onLogOut = function02;
            this.$$changed = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AppBiometricLockScreenKt.AppBiometricLockRetryScreen(this.$splashIcon, this.$onUnlock, this.$onLogOut, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.applock.AppBiometricLockScreenKt$AppBiometricLockScreen$8, reason: invalid class name */
    public final class AnonymousClass8 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(int i) {
            super(2);
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            AppBiometricLockScreenKt.AppBiometricLockScreen(bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.applock.AppBiometricLockScreenKt$AppBiometricLockSplashScreen$2, reason: invalid class name and case insensitive filesystem */
    public final class C109332 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $splashIcon;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C109332(int i, int i2) {
            super(2);
            this.$splashIcon = i;
            this.$$changed = i2;
        }

        public final void invoke(BFM bfm, int i) {
            AppBiometricLockScreenKt.AppBiometricLockSplashScreen(this.$splashIcon, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.applock.AppBiometricLockScreenKt$AppBiometricLockUnavailableScreen$2, reason: invalid class name and case insensitive filesystem */
    public final class C109342 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ Function0<Unit> $onLogOut;
        public final /* synthetic */ Function0<Unit> $onOpenSettings;
        public final /* synthetic */ int $splashIcon;
        public final /* synthetic */ AppBiometricLockViewModel.UiState.Unavailable $uiState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C109342(int i, AppBiometricLockViewModel.UiState.Unavailable unavailable, Function0<Unit> function0, Function0<Unit> function02, int i2) {
            super(2);
            this.$splashIcon = i;
            this.$uiState = unavailable;
            this.$onOpenSettings = function0;
            this.$onLogOut = function02;
            this.$$changed = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AppBiometricLockScreenKt.AppBiometricLockUnavailableScreen(this.$splashIcon, this.$uiState, this.$onOpenSettings, this.$onLogOut, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    public static final void AppBiometricLockRetryScreen(int i, Function0<Unit> function0, Function0<Unit> function02, BFM bfm, int i2) {
        bfm.AgG(740583249);
        int iA0D = (i2 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0D |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i2 & 384) == 0) {
            iA0D |= AnonymousClass004.A0V(bfm, function02);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0D & 147, 146), bfm, iA0D)) {
            BS0 bs0 = BRg.A00;
            C1062ATq c1062ATq = C10G.A01;
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            BRg bRgA01 = C1b8.A01(c1062ATq, auraTheme.getColors(bfm, 6).background);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA01);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function03);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0c);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA012, g0u);
            BRg bRgAuraContentWidth = AuraContentFrameKt.auraContentWidth(C3U4.A07(AbstractC1754Apr.A01(AbstractC1754Apr.A02(c1062ATq)), AuraDimensKt.SpacingMedium), AuraContentRole.Focused, bfm, 48);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A02, bfm, C2VU.A00, 54);
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bRgAuraContentWidth);
            AnonymousClass005.A0n(bfm, bbi, function03);
            BPg.A02(bfm, interfaceC1380AiAA00, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA013, g0vA0u);
            AuraImageKt.AuraImage(new AuraDrawableSourceResource(i), C10G.A07(bs0, 80.0f), null, null, false, false, null, false, null, bfm, 48, 508);
            C01N.A08(bfm, bs0, 24.0f);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120166), null, C3cH.A06(bfm, auraTheme), auraTheme.getTypography(bfm, 6).title2Emphasized, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            C01N.A08(bfm, bs0, 8.0f);
            String strA0v = AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f120164);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = AppBiometricLockScreenKt$AppBiometricLockRetryScreen$1$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(strA0v, AnonymousClass001.A0Y(bs0, objAaT, false), C3cH.A07(bfm, auraTheme), C3cH.A0C(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            C01N.A08(bfm, bs0, 24.0f);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120168);
            AuraButtonStyles auraButtonStyles = AuraButtonStyles.INSTANCE;
            AuraLabelButtonStyle auraLabelButtonStylePrimaryAlt = auraButtonStyles.primaryAlt(null, bfm, 48, 1);
            AuraButtonSize auraButtonSize = AuraButtonSize.LARGE;
            C1062ATq c1062ATq2 = C10G.A02;
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, c1062ATq2, auraLabelButtonStylePrimaryAlt, auraButtonSize, null, false, false, false, false, false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, (iA0D << 9) & 57344, 0, 134201285);
            C01N.A08(bfm, bs0, 12.0f);
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120702), null, c1062ATq2, auraButtonStyles.secondary(null, bfm, 48, 1), auraButtonSize, null, false, false, false, false, false, null, null, function02, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, (iA0D << 6) & 57344, 0, 134201285);
            BBI.A0R(bbi, true);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(i, function0, function02, i2);
        }
    }

    public static final void AppBiometricLockScreen(BFM bfm, int i) {
        bfm.AgG(2020243930);
        if (AnonymousClass001.A1b(AnonymousClass002.A1L(i), bfm, i)) {
            Context contextA0H = AnonymousClass002.A0H(bfm);
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            long jA05 = C3cG.A05(bfm.A6v(LocalUserSessionKt.LocalUserSessionGeneration));
            AppBiometricLockViewModel.Factory factory = new AppBiometricLockViewModel.Factory(abstractC3358CGzA0h, AnonymousClass001.A0I(contextA0H));
            String strActivityViewModelKey = LocalUserSessionKt.activityViewModelKey(AppBiometricLockViewModel.class, jA05);
            AKH<Activity> akh = AKL.A00;
            Object objA6v = bfm.A6v(akh);
            C7384Etj.A0Z(objA6v, "null cannot be cast to non-null type androidx.activity.ComponentActivity");
            ComponentActivity componentActivity = (ComponentActivity) objA6v;
            AppBiometricLockViewModel appBiometricLockViewModel = (AppBiometricLockViewModel) AnonymousClass003.A0Y(factory, componentActivity, AnonymousClass003.A0Z(componentActivity), AppBiometricLockViewModel.class, strActivityViewModelKey);
            C1BO c1boA02 = C2CK.A02(bfm, appBiometricLockViewModel.uiState);
            Object objA6v2 = bfm.A6v(akh);
            C7384Etj.A0Z(objA6v2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            FragmentActivity fragmentActivity = (FragmentActivity) objA6v2;
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = contextA0H.getMainExecutor();
                bfm.Ai0(objAaT);
            }
            Executor executor = (Executor) objAaT;
            C7384Etj.A0X(executor);
            String strA0v = AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f120163);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120162);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1206f0);
            boolean zA1R = AnonymousClass005.A1R(bfm, strA0v, strA01, strA012);
            Object objAaT2 = bfm.AaT();
            if (zA1R || objAaT2 == obj) {
                objAaT2 = AppLockBiometricSettingsKt.createAppLockPromptInfo(strA0v, strA01, strA012);
                bfm.Ai0(objAaT2);
            }
            C8328Fbu c8328Fbu = (C8328Fbu) objAaT2;
            boolean zA1V = AnonymousClass005.A1V(bfm, fragmentActivity, executor, c8328Fbu, bfm.A67(appBiometricLockViewModel));
            Object objAaT3 = bfm.AaT();
            if (zA1V || objAaT3 == obj) {
                objAaT3 = new AppBiometricLockScreenKt$AppBiometricLockScreen$launchPrompt$1$1(appBiometricLockViewModel, fragmentActivity, executor, c8328Fbu);
                bfm.Ai0(objAaT3);
            }
            G0U g0u = (G0U) objAaT3;
            Unit unit = Unit.INSTANCE;
            Object objAaT4 = bfm.AaT();
            if (objAaT4 == obj) {
                objAaT4 = AppBiometricLockScreenKt$AppBiometricLockScreen$1$1.INSTANCE;
                bfm.Ai0(objAaT4);
            }
            AnonymousClass001.A17(bfm, objAaT4, unit);
            boolean zA1N = AnonymousClass003.A1N(bfm, appBiometricLockViewModel, g0u);
            Object objAaT5 = bfm.AaT();
            if (zA1N || objAaT5 == obj) {
                objAaT5 = new AppBiometricLockScreenKt$AppBiometricLockScreen$2$1(appBiometricLockViewModel, g0u);
                bfm.Ai0(objAaT5);
            }
            C7bA.A05(bfm, null, unit, (G0U) objAaT5, 6, 2);
            Object objAaT6 = bfm.AaT();
            if (objAaT6 == obj) {
                objAaT6 = AppBiometricLockScreenKt$AppBiometricLockScreen$3$1.INSTANCE;
                bfm.Ai0(objAaT6);
            }
            B81.A00(false, (Function0) objAaT6, bfm, 48, 1);
            AppBiometricLockViewModel.UiState uiState = (AppBiometricLockViewModel.UiState) c1boA02.getValue();
            if (uiState instanceof AppBiometricLockViewModel.UiState.Unavailable) {
                bfm.AgE(129265248);
                AppBiometricLockViewModel.UiState.Unavailable unavailable = (AppBiometricLockViewModel.UiState.Unavailable) uiState;
                boolean zA67 = bfm.A67(contextA0H);
                Object objAaT7 = bfm.AaT();
                if (zA67 || objAaT7 == obj) {
                    objAaT7 = new AppBiometricLockScreenKt$AppBiometricLockScreen$4$1(contextA0H);
                    bfm.Ai0(objAaT7);
                }
                Function0 function0 = (Function0) objAaT7;
                boolean zA672 = bfm.A67(appBiometricLockViewModel);
                Object objAaT8 = bfm.AaT();
                if (zA672 || objAaT8 == obj) {
                    objAaT8 = new AppBiometricLockScreenKt$AppBiometricLockScreen$5$1(appBiometricLockViewModel);
                    bfm.Ai0(objAaT8);
                }
                AppBiometricLockUnavailableScreen(R.drawable.hatch_logo, unavailable, function0, (Function0) ((InterfaceC7353EnQ) objAaT8), bfm, AppBiometricLockViewModel.UiState.Unavailable.$stable << 3);
            } else if (uiState instanceof AppBiometricLockViewModel.UiState.Error) {
                boolean zA1Y = AnonymousClass001.A1Y(g0u, bfm, 129274430);
                Object objAaT9 = bfm.AaT();
                if (zA1Y || objAaT9 == obj) {
                    objAaT9 = new AppBiometricLockScreenKt$AppBiometricLockScreen$6$1(g0u);
                    bfm.Ai0(objAaT9);
                }
                Function0 function02 = (Function0) objAaT9;
                boolean zA673 = bfm.A67(appBiometricLockViewModel);
                Object objAaT10 = bfm.AaT();
                if (zA673 || objAaT10 == obj) {
                    objAaT10 = new AppBiometricLockScreenKt$AppBiometricLockScreen$7$1(appBiometricLockViewModel);
                    bfm.Ai0(objAaT10);
                }
                AppBiometricLockRetryScreen(R.drawable.hatch_logo, function02, (Function0) ((InterfaceC7353EnQ) objAaT10), bfm, 0);
            } else {
                bfm.AgE(129279983);
                AppBiometricLockSplashScreen(R.drawable.hatch_logo, bfm, 0);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass8(i);
        }
    }

    public static final void AppBiometricLockSplashScreen(int i, BFM bfm, int i2) {
        bfm.AgG(-217928104);
        int iA0D = (i2 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i2 : i2;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0D & 3, 2), bfm, iA0D)) {
            BS0 bs0 = BRg.A00;
            C1062ATq c1062ATq = C10G.A01;
            BRg bRgA01 = C1b8.A01(c1062ATq, C3cH.A0W(bfm).background);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA01);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0c);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA012, g0u);
            BRg bRgA02 = AbstractC1754Apr.A02(c1062ATq);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A06, bfm, C2VU.A00, 54);
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bRgA02);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA00, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA013, g0vA0u);
            C01N.A08(bfm, bs0, 64.0f);
            AuraImageKt.AuraImage(new AuraDrawableSourceResource(i), C10G.A07(bs0, 80.0f), null, null, false, false, null, false, null, bfm, 48, 508);
            BBI.A0R(bbi, true);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C109332(i, i2);
        }
    }

    public static final void AppBiometricLockUnavailableScreen(int i, AppBiometricLockViewModel.UiState.Unavailable unavailable, Function0<Unit> function0, Function0<Unit> function02, BFM bfm, int i2) {
        String strA0s;
        bfm.AgG(820145661);
        int iA0D = (i2 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0D |= AnonymousClass002.A06(AnonymousClass004.A1Y(unavailable, bfm, i2) ? 1 : 0);
        }
        if ((i2 & 384) == 0) {
            iA0D |= AnonymousClass004.A0V(bfm, function0);
        }
        if ((i2 & 3072) == 0) {
            iA0D |= AnonymousClass004.A0W(bfm, function02);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0D & 1171, 1170), bfm, iA0D)) {
            BS0 bs0 = BRg.A00;
            C1062ATq c1062ATq = C10G.A01;
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            BRg bRgA01 = C1b8.A01(c1062ATq, auraTheme.getColors(bfm, 6).background);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA01);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function03);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0c);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA012, g0u);
            BRg bRgAuraContentWidth = AuraContentFrameKt.auraContentWidth(C3U4.A07(AbstractC1754Apr.A01(AbstractC1754Apr.A02(c1062ATq)), AuraDimensKt.SpacingMedium), AuraContentRole.Focused, bfm, 48);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A02, bfm, C2VU.A00, 54);
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bRgAuraContentWidth);
            AnonymousClass005.A0n(bfm, bbi, function03);
            BPg.A02(bfm, interfaceC1380AiAA00, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA013, g0vA0u);
            AuraImageKt.AuraImage(new AuraDrawableSourceResource(i), C10G.A07(bs0, 80.0f), null, null, false, false, null, false, null, bfm, 48, 508);
            C01N.A08(bfm, bs0, 24.0f);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120166), null, C3cH.A06(bfm, auraTheme), auraTheme.getTypography(bfm, 6).title2Emphasized, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            C01N.A08(bfm, bs0, 8.0f);
            AppBiometricLockViewModel.UiState.Reason reason = unavailable.reason;
            AppBiometricLockViewModel.UiState.Reason reason2 = AppBiometricLockViewModel.UiState.Reason.NO_DEVICE_CREDENTIAL;
            if (reason == reason2) {
                bfm.AgE(696692771);
                strA0s = AnonymousClass001.A0s(bfm, bbi, R.string._name_removed__res_0x7f120165);
            } else {
                bfm.AgE(696799721);
                strA0s = AnonymousClass001.A0s(bfm, bbi, R.string._name_removed__res_0x7f120167);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(strA0s, null, C3cH.A07(bfm, auraTheme), C3cH.A0C(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            C01N.A08(bfm, bs0, 24.0f);
            AppBiometricLockViewModel.UiState.Reason reason3 = unavailable.reason;
            if (reason3 == AppBiometricLockViewModel.UiState.Reason.NONE_ENROLLED || reason3 == reason2) {
                bfm.AgE(697247640);
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120f19), null, C10G.A02, AuraButtonStyles.INSTANCE.primaryAlt(null, bfm, 48, 1), AuraButtonSize.LARGE, null, false, false, false, false, false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, (iA0D << 6) & 57344, 0, 134201285);
                C01N.A04(bfm, bbi, bs0, 12.0f, false);
            } else {
                bfm.AgE(697571497);
                BBI.A0R(bbi, false);
            }
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120702), null, C10G.A02, AuraButtonStyles.INSTANCE.secondary(null, bfm, 48, 1), AuraButtonSize.LARGE, null, false, false, false, false, false, null, null, function02, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, (iA0D << 3) & 57344, 0, 134201285);
            BBI.A0R(bbi, true);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C109342(i, unavailable, function0, function02, i2);
        }
    }
}

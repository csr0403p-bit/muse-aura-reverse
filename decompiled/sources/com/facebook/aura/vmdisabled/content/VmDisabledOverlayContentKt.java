package com.facebook.aura.vmdisabled.content;

import X.AHD;
import X.AKQ;
import X.AVy;
import X.AbstractC1754Apr;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B81;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BQN;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C0861A6i;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C1BO;
import X.C1DG;
import X.C1SA;
import X.C1YL;
import X.C2CK;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.activity.ComponentActivity;
import com.facebook.aura.R;
import com.facebook.aura.header.view.HatchHeaderKt;
import com.facebook.aura.header.view.HatchHeaderTitleAlignment;
import com.facebook.aura.header.view.HeaderButton;
import com.facebook.aura.header.view.SettingsHeaderButtonKt;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.VmDisabledOverlayScreenKey;
import com.facebook.aura.ui.OnboardingAndActivationSpinnerKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vmdisabled.VmDisabledViewModel;
import com.facebook.aura.vmdisabled.VmRecoveryFlowType;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class VmDisabledOverlayContentKt {
    public static final float COPY_BLOCK_TOP_OFFSET = 177.0f;
    public static final float LOGO_TO_COPY_SPACING;
    public static final float REENABLE_LOGO_SIZE = 64.0f;
    public static final float REENABLE_LOGO_TOP_OFFSET = 48.0f;
    public static final float REENABLE_LOGO_TO_TITLE_SPACING = 14.0f;
    public static final float SUPPORT_LOGO_TOP_OFFSET;

    /* renamed from: com.facebook.aura.vmdisabled.content.VmDisabledOverlayContentKt$VmDisabledOverlayContent$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(BRg bRg, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            VmDisabledOverlayContentKt.VmDisabledOverlayContent(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.vmdisabled.content.VmDisabledOverlayContentKt$VmDisabledSupportBody$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BRg bRg, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            VmDisabledOverlayContentKt.VmDisabledSupportBody(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    static {
        float f = AuraDimensKt.SpacingXlarge;
        LOGO_TO_COPY_SPACING = f;
        SUPPORT_LOGO_TOP_OFFSET = C1DG.A04(new C1DG((177.0f - OnboardingAndActivationSpinnerKt.LOGIN_SCREEN_LOGO_SIZE) - f), 0.0f).A00;
    }

    /* renamed from: VmDisabledMessage-KLGhzwk, reason: not valid java name */
    public static final void m3145VmDisabledMessageKLGhzwk(String str, float f, float f2, float f3, BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        AnonymousClass002.A1D(str, 0, g0v);
        bfm.AgG(-521556341);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A05(bfm, f);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A06(bfm, f2);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A07(bfm, f3);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0Y(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1A(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRg2.then(c1062ATq);
            InterfaceC1380AiA interfaceC1380AiAA0J = AnonymousClass007.A0J(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0J, akqA04, bRgA01, iA0J);
            BS0 bs0 = BRg.A00;
            C01N.A08(bfm, bs0, f);
            C1SA.A00(bfm, null, C10G.A07(bs0, f2), null, BOf.A00(bfm, R.drawable.hatch_logo, 0), null, null, 0.0f, AVy.$stable | 48, 120);
            C1822Arm c1822Arm = C01N.A01(bfm, bs0, f3).title1Medium;
            long jA0C = C06G.A0C(bfm);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = VmDisabledOverlayContentKt$VmDisabledMessage$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str, AnonymousClass001.A0Y(c1062ATq, objAaT, false), jA0C, c1822Arm, null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16304);
            C01N.A05(bfm, bs0);
            AnonymousClass005.A0q(bbi, bfm, g0v, iA0d >> 15);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new VmDisabledOverlayContentKt$VmDisabledMessage$2(str, f, f2, f3, bRg2, g0v, i, i2);
        }
    }

    public static final void VmDisabledOverlayContent(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(2062341107);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            VmDisabledViewModel.Factory factory = new VmDisabledViewModel.Factory(AnonymousClass002.A0h(bfm));
            ComponentActivity componentActivityA0y = AnonymousClass004.A0y(bfm);
            C1BO c1boA02 = C2CK.A02(bfm, ((VmDisabledViewModel) BQN.A00(factory, componentActivityA0y, AnonymousClass003.A0Z(componentActivityA0y), null, new C0861A6i(VmDisabledViewModel.class))).flowType);
            boolean zAreEqual = C7384Etj.areEqual(auraNavigatorA0b.currentKey(true), VmDisabledOverlayScreenKey.INSTANCE);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = VmDisabledOverlayContentKt$VmDisabledOverlayContent$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            B81.A00(zAreEqual, (Function0) objAaT, bfm, 48, 0);
            Unit unit = Unit.INSTANCE;
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = VmDisabledOverlayContentKt$VmDisabledOverlayContent$2$1.INSTANCE;
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A17(bfm, objAaT2, unit);
            bfm.Ag8(1929907716, c1boA02.getValue());
            BRg bRgVmDisabledVisibility = VmDisabledVisibilityModifierKt.vmDisabledVisibility(C06G.A0N(bfm, AnonymousClass001.A0T(bRg2)), (VmRecoveryFlowType) c1boA02.getValue(), bfm, 0);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgVmDisabledVisibility);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
            VmRecoveryFlowType vmRecoveryFlowType = (VmRecoveryFlowType) c1boA02.getValue();
            if (vmRecoveryFlowType == null) {
                bfm.AgE(-2118711725);
                VmDisabledSupportBody(null, bfm, 0, 1);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-2118664078);
                VmRecoveryFlowBodyKt.VmRecoveryFlowBody(vmRecoveryFlowType, false, null, bfm, 48, 4);
                BBI.A0R(bbi, false);
            }
            HatchHeaderTitleAlignment hatchHeaderTitleAlignment = HatchHeaderTitleAlignment.HIDDEN;
            AHD<HeaderButton> ahd = SettingsHeaderButtonKt.SettingsHeaderButtons;
            boolean zA67 = bfm.A67(auraNavigatorA0b);
            Object objAaT3 = bfm.AaT();
            if (zA67 || objAaT3 == obj) {
                objAaT3 = new VmDisabledOverlayContentKt$VmDisabledOverlayContent$3$1$1(auraNavigatorA0b);
                bfm.Ai0(objAaT3);
            }
            HatchHeaderKt.m994HatchPageHeaderOT94q8g(null, null, null, null, hatchHeaderTitleAlignment, false, 0, null, null, false, ahd, (G0U) objAaT3, null, null, 0L, 0L, null, null, 0, null, null, false, bfm, 221184, 0, 0, 4191183);
            BBI.A0R(bbi, true);
            BBI.A0R(bbi, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(bRg2, i, i2);
        }
    }

    public static final void VmDisabledSupportBody(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1206985177);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            BRg bRgA01 = AbstractC1754Apr.A01(AnonymousClass007.A0H(bfm, bRg2, C10G.A01));
            float f = AuraDimensKt.SpacingLarge;
            BRg bRgA07 = C3U4.A07(bRgA01, f);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA07);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA012, iA0J);
            m3145VmDisabledMessageKLGhzwk(AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f12111e), SUPPORT_LOGO_TOP_OFFSET, OnboardingAndActivationSpinnerKt.LOGIN_SCREEN_LOGO_SIZE, LOGO_TO_COPY_SPACING, null, ComposableSingletons$VmDisabledOverlayContentKt.lambda$460502707, bfm, 199728, 16);
            BS0 bs0 = BRg.A00;
            C01N.A08(bfm, bs0, AuraDimensKt.SpacingLargePlusMicro);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12111c);
            AuraLabelButtonStyle auraLabelButtonStyleA0h = AnonymousClass006.A0h(bfm);
            AuraButtonSize auraButtonSize = AuraButtonSize.MEDIUM;
            C1062ATq c1062ATq = C10G.A02;
            boolean zA67 = bfm.A67(auraNavigatorA0b);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new VmDisabledOverlayContentKt$VmDisabledSupportBody$1$1$1(auraNavigatorA0b);
                bfm.Ai0(objAaT);
            }
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, c1062ATq, auraLabelButtonStyleA0h, auraButtonSize, null, false, false, false, false, false, null, null, (Function0) objAaT, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, 0, 0, 134201285);
            C01N.A04(bfm, bbi, bs0, f, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(bRg2, i, i2);
        }
    }

    public static final float getREENABLE_LOGO_SIZE() {
        return REENABLE_LOGO_SIZE;
    }

    public static final float getREENABLE_LOGO_TOP_OFFSET() {
        return REENABLE_LOGO_TOP_OFFSET;
    }

    public static final float getREENABLE_LOGO_TO_TITLE_SPACING() {
        return REENABLE_LOGO_TO_TITLE_SPACING;
    }
}

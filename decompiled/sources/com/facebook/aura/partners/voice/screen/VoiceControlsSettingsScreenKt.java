package com.facebook.aura.partners.voice.screen;

import X.AKH;
import X.AKQ;
import X.AVy;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C0dx;
import X.C0v2;
import X.C0v5;
import X.C1515AkP;
import X.C1822Arm;
import X.C1BO;
import X.C1DG;
import X.C1YD;
import X.C1YL;
import X.C2CK;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.C7bA;
import X.C90l;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.G2j;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.common.ui.settings.HatchSettingsDescriptionKt;
import com.facebook.aura.header.view.HatchBackClickAnalytics;
import com.facebook.aura.header.view.HatchPageScreenKt;
import com.facebook.aura.partners.voice.api.VoiceOption;
import com.facebook.aura.partners.voice.gating.VoiceGating;
import com.facebook.aura.partners.voice.viewmodel.VoiceControlsSettingsViewModel;
import com.facebook.aura.partners.voice.viewmodel.VoiceTelemetry;
import com.facebook.aura.ui.HatchSectionKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.controls.AuraSwitchKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class VoiceControlsSettingsScreenKt {

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceControlsSettingsScreenKt$BackgroundingRow$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<Boolean, Unit> $onToggle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(boolean z, G0U<? super Boolean, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$enabled = z;
            this.$onToggle = g0u;
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
            VoiceControlsSettingsScreenKt.BackgroundingRow(this.$enabled, this.$onToggle, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceControlsSettingsScreenKt$BackgroundingSection$2, reason: invalid class name and case insensitive filesystem */
    public final class C131842 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ VoiceControlsSettingsViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C131842(VoiceControlsSettingsViewModel voiceControlsSettingsViewModel, BRg bRg, int i, int i2) {
            super(2);
            this.$viewModel = voiceControlsSettingsViewModel;
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
            VoiceControlsSettingsScreenKt.BackgroundingSection(this.$viewModel, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceControlsSettingsScreenKt$CreateYourOwnRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C131852 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C131852(Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$onClick = function0;
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
            VoiceControlsSettingsScreenKt.CreateYourOwnRow(this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceControlsSettingsScreenKt$LiveAvatarRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C131862 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<Boolean, Unit> $onToggle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C131862(boolean z, G0U<? super Boolean, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$enabled = z;
            this.$onToggle = g0u;
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
            VoiceControlsSettingsScreenKt.LiveAvatarRow(this.$enabled, this.$onToggle, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceControlsSettingsScreenKt$LiveAvatarSection$2, reason: invalid class name and case insensitive filesystem */
    public final class C131872 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ VoiceControlsSettingsViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C131872(VoiceControlsSettingsViewModel voiceControlsSettingsViewModel, BRg bRg, int i, int i2) {
            super(2);
            this.$viewModel = voiceControlsSettingsViewModel;
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
            VoiceControlsSettingsScreenKt.LiveAvatarSection(this.$viewModel, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceControlsSettingsScreenKt$SelectedVoiceRow$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ VoiceOption $voice;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(VoiceOption voiceOption, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$voice = voiceOption;
            this.$onClick = function0;
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
            VoiceControlsSettingsScreenKt.SelectedVoiceRow(this.$voice, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceControlsSettingsScreenKt$VoiceControlsSettingsScreen$3, reason: invalid class name and case insensitive filesystem */
    public final class C131883 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> $onOpenVoiceList;
        public final /* synthetic */ VoiceControlsSettingsViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C131883(VoiceControlsSettingsViewModel voiceControlsSettingsViewModel, Function0<Unit> function0) {
            super(4);
            this.$viewModel = voiceControlsSettingsViewModel;
            this.$onOpenVoiceList = function0;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m1758invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m1758invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            int iA04 = (i & 6) == 0 ? i | AnonymousClass004.A04(bfm, f) : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 147, 146), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            C1BO c1boA02 = C2CK.A02(bfm, this.$viewModel.selectedVoice);
            BS0 bs0 = BRg.A00;
            BRg bRgA0C = C3U4.A0C(C3U4.A0B(AnonymousClass006.A0M(bfm), C06G.A00(bfm), 0.0f), 0.0f, 0.0f, 0.0f, f2);
            VoiceControlsSettingsViewModel voiceControlsSettingsViewModel = this.$viewModel;
            Function0<Unit> function0 = this.$onOpenVoiceList;
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0C);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            C90l c90l = C90l.A00;
            C01N.A08(bfm, bs0, f);
            boolean zA1O = AnonymousClass003.A1O(bfm, voiceControlsSettingsViewModel, function0, bfm.A65(c1boA02));
            Object objAaT = bfm.AaT();
            if (zA1O || objAaT == C78N.A00) {
                objAaT = new VoiceControlsSettingsScreenKt$VoiceControlsSettingsScreen$3$1$1$1(voiceControlsSettingsViewModel, function0, c1boA02);
                bfm.Ai0(objAaT);
            }
            HatchSectionKt.m2326HatchSectionuDo3WH8(c90l, false, null, 0L, (G0U) objAaT, bfm, 6, 7);
            if (VoiceGating.INSTANCE.isEmbodimentEnabled()) {
                bfm.AgE(553135471);
                C01N.A08(bfm, bs0, AuraDimensKt.SpacingLargePlusMicro);
                VoiceControlsSettingsScreenKt.LiveAvatarSection(voiceControlsSettingsViewModel, null, bfm, VoiceControlsSettingsViewModel.$stable, 2);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(553244064);
                BBI.A0R(bbi, false);
            }
            C01N.A08(bfm, bs0, AuraDimensKt.SpacingLargePlusMicro);
            VoiceControlsSettingsScreenKt.BackgroundingSection(voiceControlsSettingsViewModel, null, bfm, VoiceControlsSettingsViewModel.$stable, 2);
            BBI.A0R(bbi, true);
        }

        public static final /* synthetic */ VoiceOption access$invoke_i1RSzL4$lambda$0(C1BO c1bo) {
            return (VoiceOption) c1bo.getValue();
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceControlsSettingsScreenKt$VoiceControlsSettingsScreen$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBackClick;
        public final /* synthetic */ Function0<Unit> $onOpenVoiceList;
        public final /* synthetic */ VoiceControlsSettingsViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(VoiceControlsSettingsViewModel voiceControlsSettingsViewModel, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, int i, int i2) {
            super(2);
            this.$viewModel = voiceControlsSettingsViewModel;
            this.$onOpenVoiceList = function0;
            this.$onBackClick = function02;
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
            VoiceControlsSettingsScreenKt.VoiceControlsSettingsScreen(this.$viewModel, this.$onOpenVoiceList, this.$onBackClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void BackgroundingRow(boolean z, G0U<? super Boolean, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1780249672);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0U(bfm, g0u);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0n |= 384;
        } else if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 147, 146), bfm, iA0n)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA01 = C0v2.A01(AnonymousClass001.A0V(AnonymousClass001.A0R(bRg2), 56.0f), new C1YD(2), AuraSwitchKt.withToggleHaptic(g0u, bfm, (iA0n >> 3) & 14), z, true);
            float f = AuraDimensKt.SpacingMedium;
            BRg bRgA0B = C3U4.A0B(bRgA01, f, f);
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass003.A0W(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0W, akqA04, bRgA012, iA0J);
            C90m c90m = C90m.A00;
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120656);
            C1822Arm c1822ArmA0T = C06G.A0T(bfm);
            long jA0C = C06G.A0C(bfm);
            BS0 bs0 = BRg.A00;
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, C3U4.A0C(AnonymousClass001.A0O(c90m, bs0, true), 0.0f, 0.0f, f, 0.0f), jA0C, c1822ArmA0T, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = VoiceControlsSettingsScreenKt$BackgroundingRow$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraSwitchKt.AuraSwitch(AnonymousClass001.A0X(bs0, objAaT), false, z, g0u, null, null, null, bfm, (iA0n << 6) & 8064, 114);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(z, g0u, bRg2, i, i2);
        }
    }

    public static final void BackgroundingSection(VoiceControlsSettingsViewModel voiceControlsSettingsViewModel, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1558507897);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(voiceControlsSettingsViewModel, bfm, i) ? 1 : 0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 19, 18), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1BO c1boA02 = C2CK.A02(bfm, voiceControlsSettingsViewModel.backgroundingEnabled);
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            C90l c90l = C90l.A00;
            boolean zA65 = bfm.A65(c1boA02) | ((iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(voiceControlsSettingsViewModel)));
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new VoiceControlsSettingsScreenKt$BackgroundingSection$1$1$1(voiceControlsSettingsViewModel, c1boA02);
                bfm.Ai0(objAaT);
            }
            HatchSectionKt.m2326HatchSectionuDo3WH8(c90l, false, null, 0L, (G0U) objAaT, bfm, 6, 7);
            HatchSettingsDescriptionKt.HatchSettingsDescription(AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f120655), C3U4.A04(BRg.A00, AuraDimensKt.SpacingSmall), bfm, 0, 0);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C131842(voiceControlsSettingsViewModel, bRg2, i, i2);
        }
    }

    public static final void CreateYourOwnRow(Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-704191624);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA04 = C0v5.A04(AnonymousClass001.A0V(AnonymousClass001.A0R(bRg2), AuraDimensKt.SpacingXHugePlus), new C1YD(0), null, VoiceCreationActionKt.rememberVoiceCreationAction(function0, bfm, iA0T & 14), true);
            float f = AuraDimensKt.SpacingMedium;
            BRg bRgA0B = C3U4.A0B(bRgA04, f, f);
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass003.A0W(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0W, akqA04, bRgA01, iA0J);
            C90m c90m = C90m.A00;
            AVy aVyA00 = BOf.A00(bfm, R.drawable.audio_outline_24_wght400, 0);
            AuraIconSize auraIconSize = AuraIconSize.SMALL;
            long jA0C = C06G.A0C(bfm);
            int i4 = AVy.$stable;
            AuraIconKt.m2567AuraIconFHprtrg(null, aVyA00, auraIconSize, null, jA0C, null, bfm, (i4 << 3) | 3456, 33);
            BS0 bs0 = BRg.A00;
            C01N.A09(bfm, bs0, AuraDimensKt.SpacingSmall);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120657);
            C1822Arm c1822ArmA0T = C06G.A0T(bfm);
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, AnonymousClass001.A0O(c90m, bs0, true), C06G.A0L(bfm, akh), c1822ArmA0T, null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14832);
            AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, R.drawable.chevron_right_wght400_outline_24, 0), auraIconSize, null, C06G.A0H(bfm, akh), null, bfm, (i4 << 3) | 3456, 33);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C131852(function0, bRg2, i, i2);
        }
    }

    public static final void LiveAvatarRow(boolean z, G0U<? super Boolean, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1857959925);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0U(bfm, g0u);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0n |= 384;
        } else if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 147, 146), bfm, iA0n)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA01 = C0v2.A01(AnonymousClass001.A0V(AnonymousClass001.A0R(bRg2), 56.0f), new C1YD(2), AuraSwitchKt.withToggleHaptic(g0u, bfm, (iA0n >> 3) & 14), z, true);
            float f = AuraDimensKt.SpacingMedium;
            BRg bRgA0B = C3U4.A0B(bRgA01, f, f);
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass003.A0W(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0W, akqA04, bRgA012, iA0J);
            C90m c90m = C90m.A00;
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120659);
            C1822Arm c1822ArmA0T = C06G.A0T(bfm);
            long jA0C = C06G.A0C(bfm);
            BS0 bs0 = BRg.A00;
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, C3U4.A0C(AnonymousClass001.A0O(c90m, bs0, true), 0.0f, 0.0f, f, 0.0f), jA0C, c1822ArmA0T, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = VoiceControlsSettingsScreenKt$LiveAvatarRow$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraSwitchKt.AuraSwitch(AnonymousClass001.A0X(bs0, objAaT), false, z, g0u, null, null, null, bfm, (iA0n << 6) & 8064, 114);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C131862(z, g0u, bRg2, i, i2);
        }
    }

    public static final void LiveAvatarSection(VoiceControlsSettingsViewModel voiceControlsSettingsViewModel, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1248688762);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(voiceControlsSettingsViewModel, bfm, i) ? 1 : 0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 19, 18), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1BO c1boA02 = C2CK.A02(bfm, voiceControlsSettingsViewModel.liveAvatarEnabled);
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            C90l c90l = C90l.A00;
            boolean zA65 = bfm.A65(c1boA02) | ((iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(voiceControlsSettingsViewModel)));
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new VoiceControlsSettingsScreenKt$LiveAvatarSection$1$1$1(voiceControlsSettingsViewModel, c1boA02);
                bfm.Ai0(objAaT);
            }
            HatchSectionKt.m2326HatchSectionuDo3WH8(c90l, false, null, 0L, (G0U) objAaT, bfm, 6, 7);
            if (C1BO.A0F(c1boA02)) {
                bfm.AgE(-2005865870);
            } else {
                bfm.AgE(-2006141677);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120658);
                BRg bRgA04 = C3U4.A04(BRg.A00, AuraDimensKt.SpacingSmall);
                Object objAaT2 = bfm.AaT();
                if (objAaT2 == C78N.A00) {
                    objAaT2 = VoiceControlsSettingsScreenKt$LiveAvatarSection$1$2$1.INSTANCE;
                    bfm.Ai0(objAaT2);
                }
                HatchSettingsDescriptionKt.HatchSettingsDescription(strA01, AnonymousClass001.A0Y(bRgA04, objAaT2, false), bfm, 0, 0);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C131872(voiceControlsSettingsViewModel, bRg2, i, i2);
        }
    }

    public static final void SelectedVoiceRow(VoiceOption voiceOption, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        String str;
        BRg bRg2 = bRg;
        bfm.AgG(-283281453);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, voiceOption) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
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
            C0dx c0dxA0T = AnonymousClass002.A0T(bfm);
            BRg bRgA0V = AnonymousClass001.A0V(AnonymousClass001.A0R(bRg2), 56.0f);
            C1YD c1yd = new C1YD(0);
            boolean zA67 = bfm.A67(c0dxA0T) | AnonymousClass001.A1N(iA0d);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new VoiceControlsSettingsScreenKt$SelectedVoiceRow$1$1(c0dxA0T, function0);
                bfm.Ai0(objAaT);
            }
            BRg bRgA04 = C0v5.A04(bRgA0V, c1yd, null, (Function0) objAaT, true);
            float f = AuraDimensKt.SpacingMedium;
            BRg bRgA0B = C3U4.A0B(bRgA04, f, f);
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass003.A0W(bfm);
            BBI bbi = (BBI) bfm;
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0W, akqA04, bRgA01, iA0D);
            C90m c90m = C90m.A00;
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120660);
            C1822Arm c1822ArmA0T = C06G.A0T(bfm);
            long jA0C = C06G.A0C(bfm);
            BS0 bs0 = BRg.A00;
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, C3U4.A0C(c90m.AiP(bs0, 1.0f, true), 0.0f, 0.0f, f, 0.0f), jA0C, c1822ArmA0T, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            if (voiceOption == null || (str = voiceOption.name) == null) {
                str = "";
            }
            C1822Arm c1822ArmA0T2 = C06G.A0T(bfm);
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            AuraTextKt.m2639AuraTextUY9GdpU(str, c90m.AiP(bs0, 1.0f, true), C06G.A0I(bfm, akh), c1822ArmA0T2, null, null, new C1YL(6), false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14768);
            AuraIconKt.m2567AuraIconFHprtrg(C3U4.A0C(bs0, AuraDimensKt.SpacingSmall, 0.0f, 0.0f, 0.0f), BOf.A00(bfm, R.drawable.chevron_right_wght400_outline_24, 0), AuraIconSize.X_SMALL, null, C06G.A0H(bfm, akh), null, bfm, AnonymousClass001.A04(), 32);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(voiceOption, function0, bRg2, i, i2);
        }
    }

    public static final void VoiceControlsSettingsScreen(VoiceControlsSettingsViewModel voiceControlsSettingsViewModel, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean zA1b = AnonymousClass004.A1b(voiceControlsSettingsViewModel, function0);
        C7384Etj.A0Y(function02, 2);
        bfm.AgG(-1315669337);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(voiceControlsSettingsViewModel, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, function02);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            int i4 = iA05 & 14;
            boolean z = i4 == 4 || ((iA05 & 8) != 0 && bfm.A67(voiceControlsSettingsViewModel));
            Object objAaT = bfm.AaT();
            if (z || objAaT == C78N.A00) {
                objAaT = new VoiceControlsSettingsScreenKt$VoiceControlsSettingsScreen$1$1(voiceControlsSettingsViewModel);
                bfm.Ai0(objAaT);
            }
            C7bA.A05(bfm, null, voiceControlsSettingsViewModel, (G0U) objAaT, VoiceControlsSettingsViewModel.$stable | i4, 2);
            C1BO c1boA02 = C2CK.A02(bfm, voiceControlsSettingsViewModel.getPageImpressionMetadata());
            boolean zA1D = AnonymousClass003.A1D(iA05) | (i4 == 4 || ((iA05 & 8) != 0 && bfm.A67(voiceControlsSettingsViewModel)));
            Object objAaT2 = bfm.AaT();
            if (zA1D || objAaT2 == C78N.A00) {
                objAaT2 = new VoiceControlsSettingsScreenKt$VoiceControlsSettingsScreen$handleBack$1$1(voiceControlsSettingsViewModel, function02);
                bfm.Ai0(objAaT2);
            }
            Function0 function03 = (Function0) objAaT2;
            AuraContainer.SecondaryScreen secondaryScreen = AuraContainer.SecondaryScreen.INSTANCE;
            VoiceTelemetry voiceTelemetry = voiceControlsSettingsViewModel.telemetry;
            HatchComponent hatchComponent = HatchComponent.VOICE_SETTINGS_PAGE;
            boolean zA65 = bfm.A65(c1boA02);
            Object objAaT3 = bfm.AaT();
            if (zA65 || objAaT3 == C78N.A00) {
                objAaT3 = new VoiceControlsSettingsScreenKt$VoiceControlsSettingsScreen$2$1(c1boA02);
                bfm.Ai0(objAaT3);
            }
            HatchPageScreenKt.m997HatchPageScreenZOcclw(secondaryScreen, VoiceTelemetryModifiersKt.voiceImpression(bRg2, voiceTelemetry, hatchComponent, null, (Function0) objAaT3, bfm, ((iA05 >> 9) & 14) | 384 | (VoiceTelemetry.$stable << 3), 4), null, 0L, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12065f), null, function03, null, zA1b, zA1b, zA1b ? 1 : 0, null, null, null, null, null, null, 0L, 0L, null, 0.0f, null, null, null, zA1b ? 1 : 0, null, null, new HatchBackClickAnalytics(HatchSurface.VOICE_MODE, HatchScreen.VOICE_SETTINGS), zA1b, B1V.A00(bfm, new C131883(voiceControlsSettingsViewModel, function0), 909872300), bfm, 6, zA1b ? 1 : 0, C06G.A02(), 402653100);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(voiceControlsSettingsViewModel, function0, function02, bRg2, i, i2);
        }
    }

    public static final /* synthetic */ Map access$VoiceControlsSettingsScreen$lambda$1(C1BO c1bo) {
        return (Map) c1bo.getValue();
    }
}

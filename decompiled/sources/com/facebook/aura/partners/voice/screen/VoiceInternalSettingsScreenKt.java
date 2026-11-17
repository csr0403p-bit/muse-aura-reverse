package com.facebook.aura.partners.voice.screen;

import X.AKH;
import X.AKQ;
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
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C0v5;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C1BO;
import X.C1DG;
import X.C1YD;
import X.C2CK;
import X.C3U4;
import X.C78N;
import X.C7bA;
import X.F60;
import X.G0U;
import X.G0V;
import X.G2j;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import com.facebook.aura.R;
import com.facebook.aura.header.view.HatchPageScreenKt;
import com.facebook.aura.partners.voice.api.VoicePipelineProfileState;
import com.facebook.aura.partners.voice.gating.VoiceGating;
import com.facebook.aura.partners.voice.viewmodel.VoiceControlsSettingsViewModel;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.surface.AuraSurfaceKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.aura.vds.compose.theme.AuraDimensions;
import com.facebook.aura.vds.compose.theme.AuraDimensionsKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class VoiceInternalSettingsScreenKt {

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceInternalSettingsScreenKt$GreetingDelaySection$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $greetingDelayMs;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<Integer, Unit> $onSetGreetingDelayMs;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(int i, G0U<? super Integer, Unit> g0u, BRg bRg, int i2, int i3) {
            super(2);
            this.$greetingDelayMs = i;
            this.$onSetGreetingDelayMs = g0u;
            this.$modifier = bRg;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            VoiceInternalSettingsScreenKt.GreetingDelaySection(this.$greetingDelayMs, this.$onSetGreetingDelayMs, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceInternalSettingsScreenKt$GreetingDelayStepButton$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $description;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ String $symbol;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str, String str2, boolean z, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$symbol = str;
            this.$description = str2;
            this.$enabled = z;
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
            VoiceInternalSettingsScreenKt.GreetingDelayStepButton(this.$symbol, this.$description, this.$enabled, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceInternalSettingsScreenKt$ResetVoiceOnboardingSection$2, reason: invalid class name and case insensitive filesystem */
    public final class C132012 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C132012(Function0<Unit> function0, BRg bRg, int i, int i2) {
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
            VoiceInternalSettingsScreenKt.ResetVoiceOnboardingSection(this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceInternalSettingsScreenKt$VoiceInternalSettingsScreen$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ VoiceControlsSettingsViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(VoiceControlsSettingsViewModel voiceControlsSettingsViewModel) {
            super(4);
            this.$viewModel = voiceControlsSettingsViewModel;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m1779invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m1779invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            int iA04 = (i & 6) == 0 ? i | AnonymousClass004.A04(bfm, f) : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 147, 146), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            Unit unit = Unit.INSTANCE;
            boolean zA67 = bfm.A67(this.$viewModel);
            VoiceControlsSettingsViewModel voiceControlsSettingsViewModel = this.$viewModel;
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new VoiceInternalSettingsScreenKt$VoiceInternalSettingsScreen$1$1$1(voiceControlsSettingsViewModel);
                bfm.Ai0(objAaT);
            }
            C7bA.A05(bfm, null, unit, (G0U) objAaT, 6, 2);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12065d);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12065c);
            C1BO c1boA02 = C2CK.A02(bfm, this.$viewModel.greetingDelayMs);
            C1BO c1boA022 = C2CK.A02(bfm, this.$viewModel.voicePipelineProfileState);
            C1BO c1boA023 = C2CK.A02(bfm, this.$viewModel.isSavingVoicePipelineProfile);
            boolean zA1P = AnonymousClass003.A1P(bfm, strA01, strA012, bfm.A67(this.$viewModel));
            VoiceControlsSettingsViewModel voiceControlsSettingsViewModel2 = this.$viewModel;
            Object objAaT2 = bfm.AaT();
            if (zA1P || objAaT2 == C78N.A00) {
                objAaT2 = new VoiceInternalSettingsScreenKt$VoiceInternalSettingsScreen$1$2$1(voiceControlsSettingsViewModel2, strA01, strA012, null);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A18(bfm, objAaT2, unit);
            BS0 bs0 = BRg.A00;
            BRg bRgA03 = C3U4.A03(AnonymousClass006.A0M(bfm), f2);
            VoiceControlsSettingsViewModel voiceControlsSettingsViewModel3 = this.$viewModel;
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA03);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            C01N.A08(bfm, bs0, f);
            VoicePipelineProfileState voicePipelineProfileState = (VoicePipelineProfileState) c1boA022.getValue();
            boolean zA0F = C1BO.A0F(c1boA023);
            boolean zA672 = bfm.A67(voiceControlsSettingsViewModel3);
            Object objAaT3 = bfm.AaT();
            if (zA672 || objAaT3 == C78N.A00) {
                objAaT3 = new VoiceInternalSettingsScreenKt$VoiceInternalSettingsScreen$1$3$1$1(voiceControlsSettingsViewModel3);
                bfm.Ai0(objAaT3);
            }
            VoiceInternalSettingsScreenKt.VoicePipelineSection(voicePipelineProfileState, zA0F, (G0U) ((InterfaceC7353EnQ) objAaT3), null, bfm, 0, 8);
            if (VoiceGating.INSTANCE.isGreetingDelayEnabled()) {
                bfm.AgE(743380984);
                int iA02 = C1BO.A02(c1boA02);
                boolean zA673 = bfm.A67(voiceControlsSettingsViewModel3);
                Object objAaT4 = bfm.AaT();
                if (zA673 || objAaT4 == C78N.A00) {
                    objAaT4 = new VoiceInternalSettingsScreenKt$VoiceInternalSettingsScreen$1$3$2$1(voiceControlsSettingsViewModel3);
                    bfm.Ai0(objAaT4);
                }
                VoiceInternalSettingsScreenKt.GreetingDelaySection(iA02, (G0U) ((InterfaceC7353EnQ) objAaT4), null, bfm, 0, 4);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(743536666);
                BBI.A0R(bbi, false);
            }
            boolean zA674 = bfm.A67(voiceControlsSettingsViewModel3);
            Object objAaT5 = bfm.AaT();
            if (zA674 || objAaT5 == C78N.A00) {
                objAaT5 = new VoiceInternalSettingsScreenKt$VoiceInternalSettingsScreen$1$3$3$1(voiceControlsSettingsViewModel3);
                bfm.Ai0(objAaT5);
            }
            VoiceInternalSettingsScreenKt.ResetVoiceOnboardingSection((Function0) objAaT5, null, bfm, 0, 2);
            BBI.A0R(bbi, true);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceInternalSettingsScreenKt$VoiceInternalSettingsScreen$2, reason: invalid class name and case insensitive filesystem */
    public final class C132022 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBackClick;
        public final /* synthetic */ VoiceControlsSettingsViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C132022(VoiceControlsSettingsViewModel voiceControlsSettingsViewModel, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$viewModel = voiceControlsSettingsViewModel;
            this.$onBackClick = function0;
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
            VoiceInternalSettingsScreenKt.VoiceInternalSettingsScreen(this.$viewModel, this.$onBackClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceInternalSettingsScreenKt$VoicePipelineSection$3, reason: invalid class name and case insensitive filesystem */
    public final class C132033 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isSaving;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<String, Unit> $onSelect;
        public final /* synthetic */ VoicePipelineProfileState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C132033(VoicePipelineProfileState voicePipelineProfileState, boolean z, G0U<? super String, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$state = voicePipelineProfileState;
            this.$isSaving = z;
            this.$onSelect = g0u;
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
            VoiceInternalSettingsScreenKt.VoicePipelineSection(this.$state, this.$isSaving, this.$onSelect, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void GreetingDelaySection(int i, G0U<? super Integer, Unit> g0u, BRg bRg, BFM bfm, int i2, int i3) {
        BRg bRgA0P = bRg;
        bfm.AgG(2105884749);
        int iA0D = (i2 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0D |= AnonymousClass004.A0U(bfm, g0u);
        }
        int i4 = i3 & 4;
        if (i4 != 0) {
            iA0D |= 384;
        } else if ((i2 & 384) == 0) {
            iA0D |= AnonymousClass004.A0f(bfm, bRgA0P);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0D & 147, 146), bfm, iA0D)) {
            if (i4 != 0) {
                bRgA0P = BRg.A00;
            }
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRgA0P.then(c1062ATq);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
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
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120666);
            C1822Arm c1822ArmA0W = C06G.A0W(bfm);
            long jA0C = C06G.A0C(bfm);
            AKH<AuraDimensions> akh = AuraDimensionsKt.LocalAuraDimensions;
            float fA01 = C06G.A01(bfm, akh);
            float f = AuraDimensKt.SpacingSmall;
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, C3U4.A0B(c1062ATq, fA01, f), jA0C, c1822ArmA0W, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            AuraSurfaceKt.m2623AuraSurface1esR5Hs(C3U4.A0B(c1062ATq, C06G.A01(bfm, akh), f), AnonymousClass002.A0e(bfm).large, false, AnonymousClass002.A0c(bfm).highlight, null, 0L, null, false, B1V.A00(bfm, new VoiceInternalSettingsScreenKt$GreetingDelaySection$1$1(i, g0u), -1626382345), bfm, 100663296, 244);
            bRgA0P = AnonymousClass001.A0P(bbi, bRgA0P);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(i, g0u, bRgA0P, i2, i3);
        }
    }

    public static final void GreetingDelayStepButton(String str, String str2, boolean z, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1529426346);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0p(bfm, z);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, function0);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 9363, 9362), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA04 = C0v5.A04(C10G.A09(bRg2, 48.0f, 48.0f), new C1YD(0), null, function0, z);
            boolean zA1C = AnonymousClass003.A1C(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1C || objAaT == C78N.A00) {
                objAaT = new VoiceInternalSettingsScreenKt$GreetingDelayStepButton$1$1(str2);
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA04, objAaT, false);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            BBI bbi = (BBI) bfm;
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0Y);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA01, iA0D);
            C1822Arm c1822ArmA0U = C06G.A0U(bfm);
            long j = z ? AnonymousClass003.A0c(bfm, 758171111).primaryText : AnonymousClass003.A0c(bfm, 758172200).tertiaryText;
            BBI.A0R(bbi, false);
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, j, c1822ArmA0U, null, null, null, false, 0, 1, 0, null, null, null, bfm, AnonymousClass005.A01(iA0d), 0, 15858);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(str, str2, z, function0, bRg2, i, i2);
        }
    }

    public static final void ResetVoiceOnboardingSection(Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRgA0P = bRg;
        bfm.AgG(-147424007);
        int iA0T = (i & 6) == 0 ? i | AnonymousClass004.A0T(bfm, function0) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRgA0P);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            if (i3 != 0) {
                bRgA0P = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12065b);
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRgA0P.then(c1062ATq);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12066a);
            C1822Arm c1822ArmA0W = C06G.A0W(bfm);
            long jA0C = C06G.A0C(bfm);
            AKH<AuraDimensions> akh = AuraDimensionsKt.LocalAuraDimensions;
            float fA01 = C06G.A01(bfm, akh);
            float f = AuraDimensKt.SpacingSmall;
            AuraTextKt.m2639AuraTextUY9GdpU(strA012, C3U4.A0B(c1062ATq, fA01, f), jA0C, c1822ArmA0W, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            AuraSurfaceKt.m2623AuraSurface1esR5Hs(C3U4.A0B(c1062ATq, C06G.A01(bfm, akh), f), AnonymousClass002.A0e(bfm).large, false, AnonymousClass002.A0c(bfm).highlight, null, 0L, null, false, B1V.A00(bfm, new VoiceInternalSettingsScreenKt$ResetVoiceOnboardingSection$1$1(function0, strA01), -3062513), bfm, 100663296, 244);
            bRgA0P = AnonymousClass001.A0P(bbi, bRgA0P);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C132012(function0, bRgA0P, i, i2);
        }
    }

    public static final void VoiceInternalSettingsScreen(VoiceControlsSettingsViewModel voiceControlsSettingsViewModel, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean zA1b = AnonymousClass004.A1b(voiceControlsSettingsViewModel, function0);
        bfm.AgG(173305165);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(voiceControlsSettingsViewModel, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            HatchPageScreenKt.m997HatchPageScreenZOcclw(AuraContainer.SecondaryScreen.INSTANCE, bRg2, null, 0L, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120669), null, function0, null, zA1b, zA1b, zA1b ? 1 : 0, null, null, null, null, null, null, 0L, 0L, null, 0.0f, null, null, null, zA1b ? 1 : 0, null, null, null, zA1b, B1V.A00(bfm, new AnonymousClass1(voiceControlsSettingsViewModel), 1692684690), bfm, AnonymousClass001.A05(iA05 << 15, ((iA05 >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6), zA1b ? 1 : 0, 805306368, 536870828);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C132022(voiceControlsSettingsViewModel, function0, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void VoicePipelineSection(com.facebook.aura.partners.voice.api.VoicePipelineProfileState r42, boolean r43, X.G0U<? super java.lang.String, kotlin.Unit> r44, X.BRg r45, X.BFM r46, int r47, int r48) {
        /*
            Method dump skipped, instructions count: 537
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.screen.VoiceInternalSettingsScreenKt.VoicePipelineSection(com.facebook.aura.partners.voice.api.VoicePipelineProfileState, boolean, X.G0U, X.BRg, X.BFM, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String greetingDelayValueLabel(int r5, X.BFM r6, int r7) {
        /*
            if (r5 > 0) goto L13
            r0 = -439153185(0xffffffffe5d30ddf, float:-1.245844E23)
            r6.AgE(r0)
            r0 = 2131887719(0x7f120667, float:1.9410053E38)
            java.lang.String r0 = X.AbstractC2271BQs.A01(r6, r0)
        Lf:
            X.AnonymousClass001.A1D(r6)
            return r0
        L13:
            r0 = -439070601(0xffffffffe5d45077, float:-1.2532825E23)
            r6.AgE(r0)
            r0 = r7 & 14
            r0 = r0 ^ 6
            r2 = 4
            if (r0 <= r2) goto L26
            boolean r0 = r6.A63(r5)
            if (r0 != 0) goto L2b
        L26:
            r1 = r7 & 6
            r0 = 0
            if (r1 != r2) goto L2c
        L2b:
            r0 = 1
        L2c:
            java.lang.Object r1 = r6.AaT()
            if (r0 != 0) goto L36
            java.lang.Object r0 = X.C78N.A00
            if (r1 != r0) goto L48
        L36:
            java.text.NumberFormat r4 = java.text.NumberFormat.getInstance()
            double r2 = (double) r5
            r0 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r2 = r2 / r0
            java.lang.String r1 = r4.format(r2)
            r6.Ai0(r1)
        L48:
            r0 = 2131887720(0x7f120668, float:1.9410055E38)
            X.C7384Etj.A0X(r1)
            java.lang.String r0 = X.AnonymousClass001.A0t(r6, r1, r0)
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.screen.VoiceInternalSettingsScreenKt.greetingDelayValueLabel(int, X.BFM, int):java.lang.String");
    }
}

package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.BFM;
import X.C07C;
import X.C1BO;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0W;
import com.facebook.aura.partners.voice.api.VoiceOption;
import com.facebook.aura.partners.voice.gating.VoiceGating;
import com.facebook.aura.partners.voice.viewmodel.VoiceControlsSettingsViewModel;
import com.facebook.aura.ui.HatchSectionScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class VoiceControlsSettingsScreenKt$VoiceControlsSettingsScreen$3$1$1$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ Function0<Unit> $onOpenVoiceList;
    public final /* synthetic */ C1BO<VoiceOption> $selectedVoice$delegate;
    public final /* synthetic */ VoiceControlsSettingsViewModel $viewModel;

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceControlsSettingsScreenKt$VoiceControlsSettingsScreen$3$1$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> $onOpenVoiceList;
        public final /* synthetic */ C1BO<VoiceOption> $selectedVoice$delegate;
        public final /* synthetic */ VoiceControlsSettingsViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(VoiceControlsSettingsViewModel voiceControlsSettingsViewModel, Function0<Unit> function0, C1BO<VoiceOption> c1bo) {
            super(3);
            this.$viewModel = voiceControlsSettingsViewModel;
            this.$onOpenVoiceList = function0;
            this.$selectedVoice$delegate = c1bo;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                VoiceOption value = this.$selectedVoice$delegate.getValue();
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$onOpenVoiceList, bfm.A67(this.$viewModel));
                VoiceControlsSettingsViewModel voiceControlsSettingsViewModel = this.$viewModel;
                Function0<Unit> function0 = this.$onOpenVoiceList;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new VoiceControlsSettingsScreenKt$VoiceControlsSettingsScreen$3$1$1$1$1$1$1(voiceControlsSettingsViewModel, function0);
                    bfm.Ai0(objAaT);
                }
                VoiceControlsSettingsScreenKt.SelectedVoiceRow(value, (Function0) objAaT, null, bfm, 0, 4);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceControlsSettingsScreenKt$VoiceControlsSettingsScreen$3$1$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ VoiceControlsSettingsViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(VoiceControlsSettingsViewModel voiceControlsSettingsViewModel) {
            super(3);
            this.$viewModel = voiceControlsSettingsViewModel;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                boolean zA67 = bfm.A67(this.$viewModel);
                VoiceControlsSettingsViewModel voiceControlsSettingsViewModel = this.$viewModel;
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new VoiceControlsSettingsScreenKt$VoiceControlsSettingsScreen$3$1$1$1$2$1$1(voiceControlsSettingsViewModel);
                    bfm.Ai0(objAaT);
                }
                VoiceControlsSettingsScreenKt.CreateYourOwnRow((Function0) objAaT, null, bfm, 0, 2);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        AnonymousClass005.A0u(hatchSectionScope, new AnonymousClass1(this.$viewModel, this.$onOpenVoiceList, this.$selectedVoice$delegate), -2125006072);
        if (VoiceGating.INSTANCE.isVoiceDesignEnabled()) {
            AnonymousClass005.A0u(hatchSectionScope, new AnonymousClass2(this.$viewModel), 14066467);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceControlsSettingsScreenKt$VoiceControlsSettingsScreen$3$1$1$1(VoiceControlsSettingsViewModel voiceControlsSettingsViewModel, Function0<Unit> function0, C1BO<VoiceOption> c1bo) {
        super(1);
        this.$viewModel = voiceControlsSettingsViewModel;
        this.$onOpenVoiceList = function0;
        this.$selectedVoice$delegate = c1bo;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}

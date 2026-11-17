package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.BFM;
import X.C07C;
import X.C1BO;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0W;
import X.InterfaceC7353EnQ;
import com.facebook.aura.partners.voice.viewmodel.VoiceControlsSettingsViewModel;
import com.facebook.aura.ui.HatchSectionScope;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class VoiceControlsSettingsScreenKt$LiveAvatarSection$1$1$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ C1BO<Boolean> $enabled$delegate;
    public final /* synthetic */ VoiceControlsSettingsViewModel $viewModel;

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceControlsSettingsScreenKt$LiveAvatarSection$1$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ C1BO<Boolean> $enabled$delegate;
        public final /* synthetic */ VoiceControlsSettingsViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(VoiceControlsSettingsViewModel voiceControlsSettingsViewModel, C1BO<Boolean> c1bo) {
            super(3);
            this.$viewModel = voiceControlsSettingsViewModel;
            this.$enabled$delegate = c1bo;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                boolean zA0F = C1BO.A0F(this.$enabled$delegate);
                VoiceControlsSettingsViewModel voiceControlsSettingsViewModel = this.$viewModel;
                boolean zA67 = bfm.A67(voiceControlsSettingsViewModel);
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new VoiceControlsSettingsScreenKt$LiveAvatarSection$1$1$1$1$1$1(voiceControlsSettingsViewModel);
                    bfm.Ai0(objAaT);
                }
                VoiceControlsSettingsScreenKt.LiveAvatarRow(zA0F, (G0U) ((InterfaceC7353EnQ) objAaT), null, bfm, 0, 4);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        AnonymousClass006.A1E(hatchSectionScope, new AnonymousClass1(this.$viewModel, this.$enabled$delegate), -1308985942);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceControlsSettingsScreenKt$LiveAvatarSection$1$1$1(VoiceControlsSettingsViewModel voiceControlsSettingsViewModel, C1BO<Boolean> c1bo) {
        super(1);
        this.$viewModel = voiceControlsSettingsViewModel;
        this.$enabled$delegate = c1bo;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}

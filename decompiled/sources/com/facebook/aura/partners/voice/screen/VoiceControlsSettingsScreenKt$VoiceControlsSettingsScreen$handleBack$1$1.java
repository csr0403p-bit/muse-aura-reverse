package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import com.facebook.aura.partners.voice.viewmodel.VoiceControlsSettingsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class VoiceControlsSettingsScreenKt$VoiceControlsSettingsScreen$handleBack$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Function0<Unit> $onBackClick;
    public final /* synthetic */ VoiceControlsSettingsViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceControlsSettingsScreenKt$VoiceControlsSettingsScreen$handleBack$1$1(VoiceControlsSettingsViewModel voiceControlsSettingsViewModel, Function0<Unit> function0) {
        super(0);
        this.$viewModel = voiceControlsSettingsViewModel;
        this.$onBackClick = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$viewModel.telemetry.endVisit("back");
        this.$onBackClick.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

package com.facebook.aura.partners.voice.screen;

import X.AnonymousClass006;
import X.C7438Evz;
import X.G0U;
import com.facebook.aura.partners.voice.viewmodel.VoiceControlsSettingsViewModel;
import kotlin.Unit;

/* loaded from: classes.dex */
public final /* synthetic */ class VoiceInternalSettingsScreenKt$VoiceInternalSettingsScreen$1$3$1$1 extends C7438Evz implements G0U<String, Unit> {
    public VoiceInternalSettingsScreenKt$VoiceInternalSettingsScreen$1$3$1$1(Object obj) {
        super(1, obj, VoiceControlsSettingsViewModel.class, "setVoicePipelineProfile", "setVoicePipelineProfile(Ljava/lang/String;)V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        ((VoiceControlsSettingsViewModel) AnonymousClass006.A0o(str, this)).setVoicePipelineProfile(str);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}

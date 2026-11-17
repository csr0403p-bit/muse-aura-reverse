package com.facebook.aura.partners.voice.screen;

import X.AnonymousClass001;
import X.C7438Evz;
import X.G0U;
import com.facebook.aura.partners.voice.viewmodel.VoiceControlsSettingsViewModel;
import kotlin.Unit;

/* loaded from: classes.dex */
public final /* synthetic */ class VoiceControlsSettingsScreenKt$BackgroundingSection$1$1$1$1$1$1 extends C7438Evz implements G0U<Boolean, Unit> {
    public VoiceControlsSettingsScreenKt$BackgroundingSection$1$1$1$1$1$1(Object obj) {
        super(1, obj, VoiceControlsSettingsViewModel.class, "setBackgroundingEnabled", "setBackgroundingEnabled(Z)V", 0);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        ((VoiceControlsSettingsViewModel) this.receiver).setBackgroundingEnabled(z);
    }
}

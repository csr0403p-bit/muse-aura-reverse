package com.facebook.aura.partners.voice.screen;

import X.AnonymousClass001;
import X.C7438Evz;
import X.G0U;
import com.facebook.aura.partners.voice.viewmodel.VoiceControlsSettingsViewModel;
import kotlin.Unit;

/* loaded from: classes.dex */
public final /* synthetic */ class VoiceInternalSettingsScreenKt$VoiceInternalSettingsScreen$1$3$2$1 extends C7438Evz implements G0U<Integer, Unit> {
    public VoiceInternalSettingsScreenKt$VoiceInternalSettingsScreen$1$3$2$1(Object obj) {
        super(1, obj, VoiceControlsSettingsViewModel.class, "setGreetingDelayMs", "setGreetingDelayMs(I)V", 0);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(int i) {
        ((VoiceControlsSettingsViewModel) this.receiver).setGreetingDelayMs(i);
    }
}

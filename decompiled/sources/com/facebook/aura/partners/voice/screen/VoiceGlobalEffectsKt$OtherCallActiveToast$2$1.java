package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.partners.voice.intf.DeviceCallStateTracker;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class VoiceGlobalEffectsKt$OtherCallActiveToast$2$1 extends AbstractC7559F3s implements G0U<Unit, Boolean> {
    public static final VoiceGlobalEffectsKt$OtherCallActiveToast$2$1 INSTANCE = new VoiceGlobalEffectsKt$OtherCallActiveToast$2$1();

    public VoiceGlobalEffectsKt$OtherCallActiveToast$2$1() {
        super(1);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Boolean invoke2(Unit unit) {
        return Boolean.valueOf(DeviceCallStateTracker.INSTANCE.isInCallNow());
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Boolean invoke(Unit unit) {
        return Boolean.valueOf(DeviceCallStateTracker.INSTANCE.isInCallNow());
    }
}

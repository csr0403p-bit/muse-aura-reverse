package com.facebook.aura.partners.voice.chrome;

import X.AbstractC7559F3s;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class VoiceFloatingCallControlsKt$VoiceCallControlButton$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ VoiceCallControl $control;
    public final /* synthetic */ G0U<VoiceCallControl, Unit> $onClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VoiceFloatingCallControlsKt$VoiceCallControlButton$1$1(G0U<? super VoiceCallControl, Unit> g0u, VoiceCallControl voiceCallControl) {
        super(0);
        this.$onClick = g0u;
        this.$control = voiceCallControl;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onClick.invoke(this.$control);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

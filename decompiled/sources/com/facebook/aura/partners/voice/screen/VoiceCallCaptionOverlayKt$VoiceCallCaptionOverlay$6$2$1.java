package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class VoiceCallCaptionOverlayKt$VoiceCallCaptionOverlay$6$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ boolean $exiting;
    public final /* synthetic */ boolean[] $passiveLatch;
    public final /* synthetic */ boolean $passiveNow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceCallCaptionOverlayKt$VoiceCallCaptionOverlay$6$2$1(boolean z, boolean[] zArr, boolean z2) {
        super(0);
        this.$exiting = z;
        this.$passiveLatch = zArr;
        this.$passiveNow = z2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.$exiting) {
            return;
        }
        this.$passiveLatch[0] = this.$passiveNow;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

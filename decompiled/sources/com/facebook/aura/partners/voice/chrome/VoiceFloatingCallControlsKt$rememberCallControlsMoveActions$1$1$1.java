package com.facebook.aura.partners.voice.chrome;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class VoiceFloatingCallControlsKt$rememberCallControlsMoveActions$1$1$1 extends AbstractC7559F3s implements Function0<Boolean> {
    public final /* synthetic */ CallControlsCorner $corner;
    public final /* synthetic */ HatchCallControlsMotion $motion;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceFloatingCallControlsKt$rememberCallControlsMoveActions$1$1$1(HatchCallControlsMotion hatchCallControlsMotion, CallControlsCorner callControlsCorner) {
        super(0);
        this.$motion = hatchCallControlsMotion;
        this.$corner = callControlsCorner;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        this.$motion.moveTo(this.$corner);
        return AnonymousClass001.A0i();
    }
}

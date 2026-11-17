package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.AnonymousClass003;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchVoiceNuxSheetKt$VoiceNuxContent$2$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Function0<Boolean> $canContinue;
    public final /* synthetic */ VoiceNuxInteraction $loggingState;
    public final /* synthetic */ Function0<Unit> $onContinue;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchVoiceNuxSheetKt$VoiceNuxContent$2$1$1(Function0<Boolean> function0, VoiceNuxInteraction voiceNuxInteraction, Function0<Unit> function02) {
        super(0);
        this.$canContinue = function0;
        this.$loggingState = voiceNuxInteraction;
        this.$onContinue = function02;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (AnonymousClass003.A1Y(this.$canContinue)) {
            this.$loggingState.logContinue();
            this.$onContinue.invoke();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

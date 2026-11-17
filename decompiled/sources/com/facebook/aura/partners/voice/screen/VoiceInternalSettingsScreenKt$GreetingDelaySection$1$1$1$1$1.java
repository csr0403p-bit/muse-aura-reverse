package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.AnonymousClass005;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class VoiceInternalSettingsScreenKt$GreetingDelaySection$1$1$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ int $greetingDelayMs;
    public final /* synthetic */ G0U<Integer, Unit> $onSetGreetingDelayMs;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VoiceInternalSettingsScreenKt$GreetingDelaySection$1$1$1$1$1(G0U<? super Integer, Unit> g0u, int i) {
        super(0);
        this.$onSetGreetingDelayMs = g0u;
        this.$greetingDelayMs = i;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        G0U<Integer, Unit> g0u = this.$onSetGreetingDelayMs;
        int i = this.$greetingDelayMs - 250;
        if (i < 0) {
            i = 0;
        }
        AnonymousClass005.A0l(i, g0u);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

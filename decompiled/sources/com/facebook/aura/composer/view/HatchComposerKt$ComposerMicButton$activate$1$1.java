package com.facebook.aura.composer.view;

import X.AbstractC7559F3s;
import X.C0dx;
import com.facebook.aura.vds.compose.accessibility.AuraHaptics;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchComposerKt$ComposerMicButton$activate$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C0dx $haptic;
    public final /* synthetic */ Function0<Unit> $onMicTap;
    public final /* synthetic */ DictationSendStandIn $sendStandIn;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchComposerKt$ComposerMicButton$activate$1$1(DictationSendStandIn dictationSendStandIn, Function0<Unit> function0, C0dx c0dx) {
        super(0);
        this.$sendStandIn = dictationSendStandIn;
        this.$onMicTap = function0;
        this.$haptic = c0dx;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Function0<Unit> function0;
        DictationSendStandIn dictationSendStandIn = this.$sendStandIn;
        if (dictationSendStandIn == null) {
            function0 = this.$onMicTap;
        } else {
            if (!dictationSendStandIn.isEnabled) {
                return;
            }
            if (!dictationSendStandIn.isBlocked) {
                this.$haptic.AXr(AuraHaptics.SUCCESS);
            }
            function0 = this.$sendStandIn.onSend;
        }
        function0.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

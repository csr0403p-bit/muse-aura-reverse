package com.facebook.aura.composer.view;

import X.AbstractC7559F3s;
import X.C0dx;
import com.facebook.aura.vds.compose.accessibility.AuraHaptics;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class TapDictationComposerKt$DictationCancelButton$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C0dx $haptic;
    public final /* synthetic */ Function0<Unit> $onCancel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapDictationComposerKt$DictationCancelButton$1$1(C0dx c0dx, Function0<Unit> function0) {
        super(0);
        this.$haptic = c0dx;
        this.$onCancel = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$haptic.AXr(AuraHaptics.FAILURE);
        this.$onCancel.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

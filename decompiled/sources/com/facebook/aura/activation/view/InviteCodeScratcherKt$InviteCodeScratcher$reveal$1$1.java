package com.facebook.aura.activation.view;

import X.AbstractC7559F3s;
import X.C0dx;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.vds.compose.accessibility.AuraHaptics;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class InviteCodeScratcherKt$InviteCodeScratcher$reveal$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C0dx $haptics;
    public final /* synthetic */ boolean $isCodeVisible;
    public final /* synthetic */ Function0<Unit> $onRevealed;
    public final /* synthetic */ MutableState<Boolean> $revealFeedbackPending$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InviteCodeScratcherKt$InviteCodeScratcher$reveal$1$1(boolean z, C0dx c0dx, Function0<Unit> function0, MutableState<Boolean> mutableState) {
        super(0);
        this.$isCodeVisible = z;
        this.$haptics = c0dx;
        this.$onRevealed = function0;
        this.$revealFeedbackPending$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.$isCodeVisible) {
            return;
        }
        MutableState<Boolean> mutableState = this.$revealFeedbackPending$delegate;
        int i = InviteCodeScratcherKt.COVERAGE_COLUMNS;
        if (MutableState.A0A((MutableState) mutableState)) {
            return;
        }
        MutableState.A09(true, this.$revealFeedbackPending$delegate);
        this.$haptics.AXr(AuraHaptics.GESTURE_THRESHOLD);
        this.$onRevealed.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

package com.facebook.aura.common.video;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchVideoPlayerComposableKt$HatchVideoPlayerComposable$14$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<Integer> $resumeGeneration$delegate;
    public final /* synthetic */ MutableState<Boolean> $sourceReleased$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchVideoPlayerComposableKt$HatchVideoPlayerComposable$14$1(MutableState<Boolean> mutableState, MutableState<Integer> mutableState2) {
        super(0);
        this.$sourceReleased$delegate = mutableState;
        this.$resumeGeneration$delegate = mutableState2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (MutableState.A0A((MutableState) this.$sourceReleased$delegate)) {
            MutableState.A09(false, this.$sourceReleased$delegate);
            MutableState.A07(MutableState.A02((MutableState) this.$resumeGeneration$delegate) + 1, this.$resumeGeneration$delegate);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

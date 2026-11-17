package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class MediaViewerContentKt$MediaViewerVideo$3$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<Boolean> $hasRendered$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaViewerContentKt$MediaViewerVideo$3$2$1(MutableState<Boolean> mutableState) {
        super(0);
        this.$hasRendered$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MutableState<Boolean> mutableState = this.$hasRendered$delegate;
        float f = MediaViewerContentKt.CONTROLS_SCRIM_ALPHA;
        MutableState.A09(true, mutableState);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

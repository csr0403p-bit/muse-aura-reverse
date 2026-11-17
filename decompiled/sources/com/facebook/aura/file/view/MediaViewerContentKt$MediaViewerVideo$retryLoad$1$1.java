package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.C00r;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class MediaViewerContentKt$MediaViewerVideo$retryLoad$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<Boolean> $hasRendered$delegate;
    public final /* synthetic */ C00r $loadAttempt$delegate;
    public final /* synthetic */ MutableState<Boolean> $loadFailed;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaViewerContentKt$MediaViewerVideo$retryLoad$1$1(MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, C00r c00r) {
        super(0);
        this.$loadFailed = mutableState;
        this.$hasRendered$delegate = mutableState2;
        this.$loadAttempt$delegate = c00r;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MutableState<Boolean> mutableState = this.$hasRendered$delegate;
        float f = MediaViewerContentKt.CONTROLS_SCRIM_ALPHA;
        MutableState.A09(false, mutableState);
        MutableState.A09(false, this.$loadFailed);
        this.$loadAttempt$delegate.AdX(this.$loadAttempt$delegate.AGd() + 1);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

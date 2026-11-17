package com.facebook.aura.vds.compose.image;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AuraImageKt$AuraImageContent$5$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AuraImagePainter $painter;
    public final /* synthetic */ MutableState<Boolean> $showRetryViewState;
    public final /* synthetic */ MutableState<Boolean> $showShimmeringViewState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraImageKt$AuraImageContent$5$1$1(MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, AuraImagePainter auraImagePainter) {
        super(0);
        this.$showShimmeringViewState = mutableState;
        this.$showRetryViewState = mutableState2;
        this.$painter = auraImagePainter;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() throws NumberFormatException {
        MutableState<Boolean> mutableState = this.$showShimmeringViewState;
        if (mutableState != null) {
            MutableState.A09(true, mutableState);
        }
        MutableState.A09(false, this.$showRetryViewState);
        this.$painter.retry();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() throws NumberFormatException {
        invoke2();
        return Unit.INSTANCE;
    }
}

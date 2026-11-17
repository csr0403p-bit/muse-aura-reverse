package com.facebook.aura.common.video;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchVideoPlayerComposableKt$HatchVideoPlayerComposable$22$7$1$1 extends AbstractC7559F3s implements G0U<Integer, Unit> {
    public final /* synthetic */ MutableState<Boolean> $showLoadingSpinner$delegate;
    public final /* synthetic */ MutableState<Boolean> $showRetryView$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchVideoPlayerComposableKt$HatchVideoPlayerComposable$22$7$1$1(MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2) {
        super(1);
        this.$showLoadingSpinner$delegate = mutableState;
        this.$showRetryView$delegate = mutableState2;
    }

    public final void invoke(int i) {
        MutableState.A09(true, this.$showLoadingSpinner$delegate);
        MutableState.A09(false, this.$showRetryView$delegate);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}

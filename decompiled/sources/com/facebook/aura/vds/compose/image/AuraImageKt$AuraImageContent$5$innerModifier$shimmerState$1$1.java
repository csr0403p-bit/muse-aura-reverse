package com.facebook.aura.vds.compose.image;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AuraImageKt$AuraImageContent$5$innerModifier$shimmerState$1$1 extends AbstractC7559F3s implements Function0<Boolean> {
    public final /* synthetic */ MutableState<Boolean> $showShimmeringViewState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraImageKt$AuraImageContent$5$innerModifier$shimmerState$1$1(MutableState<Boolean> mutableState) {
        super(0);
        this.$showShimmeringViewState = mutableState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        MutableState<Boolean> mutableState = this.$showShimmeringViewState;
        boolean z = false;
        if (mutableState != null && MutableState.A0A((MutableState) mutableState)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}

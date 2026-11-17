package com.facebook.aura.ui;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C1BO;
import X.C78g;
import X.G0U;
import androidx.compose.runtime.MutableState;

/* loaded from: classes.dex */
public final class HatchPullToRefreshKt$HatchPTRLoadingIndicator$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ C1BO<Boolean> $isAtRest$delegate;
    public final /* synthetic */ MutableState<Boolean> $isPTRPending$delegate;
    public final /* synthetic */ boolean $isRefreshing;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchPullToRefreshKt$HatchPTRLoadingIndicator$1$1(boolean z, MutableState<Boolean> mutableState, C1BO<Boolean> c1bo) {
        super(1);
        this.$isRefreshing = z;
        this.$isPTRPending$delegate = mutableState;
        this.$isAtRest$delegate = c1bo;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        if (this.$isRefreshing) {
            MutableState.A09(true, this.$isPTRPending$delegate);
        }
        if (C1BO.A0F(this.$isAtRest$delegate)) {
            MutableState.A09(false, this.$isPTRPending$delegate);
        }
        return new C78g() { // from class: com.facebook.aura.ui.HatchPullToRefreshKt$HatchPTRLoadingIndicator$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}

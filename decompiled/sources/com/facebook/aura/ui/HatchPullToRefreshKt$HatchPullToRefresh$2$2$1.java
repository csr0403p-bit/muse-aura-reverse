package com.facebook.aura.ui;

import X.AbstractC7559F3s;
import com.facebook.aura.ui.pulltorefresh.PullRefreshState;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchPullToRefreshKt$HatchPullToRefresh$2$2$1 extends AbstractC7559F3s implements Function0<Float> {
    public final /* synthetic */ PullRefreshState $pullRefreshState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchPullToRefreshKt$HatchPullToRefresh$2$2$1(PullRefreshState pullRefreshState) {
        super(0);
        this.$pullRefreshState = pullRefreshState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        return Float.valueOf(this.$pullRefreshState.getPosition());
    }
}

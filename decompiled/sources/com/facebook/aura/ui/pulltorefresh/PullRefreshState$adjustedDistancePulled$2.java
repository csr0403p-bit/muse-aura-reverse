package com.facebook.aura.ui.pulltorefresh;

import X.AbstractC7559F3s;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class PullRefreshState$adjustedDistancePulled$2 extends AbstractC7559F3s implements Function0<Float> {
    public final /* synthetic */ PullRefreshState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullRefreshState$adjustedDistancePulled$2(PullRefreshState pullRefreshState) {
        super(0);
        this.this$0 = pullRefreshState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        return Float.valueOf(this.this$0.getDistancePulled() * 0.5f);
    }
}

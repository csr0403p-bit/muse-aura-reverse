package com.facebook.aura.ui.pulltorefresh;

import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.ui.pulltorefresh.PullRefreshNestedScrollConnection", f = "PullRefresh.kt", l = {73}, m = "onPreFling-QWom1Mo", v = 2)
/* loaded from: classes.dex */
public final class PullRefreshNestedScrollConnection$onPreFling$1 extends HzP {
    public long J$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PullRefreshNestedScrollConnection this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullRefreshNestedScrollConnection$onPreFling$1(PullRefreshNestedScrollConnection pullRefreshNestedScrollConnection, HtJ<? super PullRefreshNestedScrollConnection$onPreFling$1> htJ) {
        super(htJ);
        this.this$0 = pullRefreshNestedScrollConnection;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo5onPreFlingQWom1Mo(0L, this);
    }
}

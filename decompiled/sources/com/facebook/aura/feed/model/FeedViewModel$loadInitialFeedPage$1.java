package com.facebook.aura.feed.model;

import X.AnonymousClass006;
import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.feed.model.FeedViewModel", f = "FeedViewModel.kt", l = {967, 968}, m = "loadInitialFeedPage-gIAlu-s", v = 2)
/* loaded from: classes3.dex */
public final class FeedViewModel$loadInitialFeedPage$1 extends HzP {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ FeedViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedViewModel$loadInitialFeedPage$1(FeedViewModel feedViewModel, HtJ<? super FeedViewModel$loadInitialFeedPage$1> htJ) {
        super(htJ);
        this.this$0 = feedViewModel;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AnonymousClass006.A0m(this.this$0.m799loadInitialFeedPagegIAlus(null, this));
    }
}

package com.facebook.aura.feed.repo;

import X.AnonymousClass006;
import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.feed.repo.FeedRepository", f = "FeedRepository.kt", l = {73}, m = "fetchLatestFeed-IoAF18A", v = 2)
/* loaded from: classes6.dex */
public final class FeedRepository$fetchLatestFeed$1 extends HzP {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ FeedRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedRepository$fetchLatestFeed$1(FeedRepository feedRepository, HtJ<? super FeedRepository$fetchLatestFeed$1> htJ) {
        super(htJ);
        this.this$0 = feedRepository;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AnonymousClass006.A0m(this.this$0.m806fetchLatestFeedIoAF18A(this));
    }
}

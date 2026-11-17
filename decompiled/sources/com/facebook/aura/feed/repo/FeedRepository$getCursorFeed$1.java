package com.facebook.aura.feed.repo;

import X.AnonymousClass006;
import X.HtJ;
import X.HzP;
import com.facebook.aura.composer.util.ImageCompressor;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.feed.repo.FeedRepository", f = "FeedRepository.kt", l = {ImageCompressor.IMAGE_COMPRESSION_QUALITY}, m = "getCursorFeed-0E7RQCE", v = 2)
/* loaded from: classes6.dex */
public final class FeedRepository$getCursorFeed$1 extends HzP {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ FeedRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedRepository$getCursorFeed$1(FeedRepository feedRepository, HtJ<? super FeedRepository$getCursorFeed$1> htJ) {
        super(htJ);
        this.this$0 = feedRepository;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AnonymousClass006.A0m(this.this$0.m807getCursorFeed0E7RQCE(null, null, this));
    }
}

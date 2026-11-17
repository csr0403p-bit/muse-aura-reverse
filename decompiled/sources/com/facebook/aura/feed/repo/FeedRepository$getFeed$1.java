package com.facebook.aura.feed.repo;

import X.AnonymousClass006;
import X.HtJ;
import X.HzP;
import com.facebook.aura.commands.sms.MessageDraftSenderKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.feed.repo.FeedRepository", f = "FeedRepository.kt", l = {MessageDraftSenderKt.UNICODE_SINGLE_PART_CHARS}, m = "getFeed-IoAF18A", v = 2)
/* loaded from: classes6.dex */
public final class FeedRepository$getFeed$1 extends HzP {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ FeedRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedRepository$getFeed$1(FeedRepository feedRepository, HtJ<? super FeedRepository$getFeed$1> htJ) {
        super(htJ);
        this.this$0 = feedRepository;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AnonymousClass006.A0m(this.this$0.m808getFeedIoAF18A(this));
    }
}

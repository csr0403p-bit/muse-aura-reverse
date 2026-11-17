package com.facebook.aura.feed.repo;

import X.AnonymousClass006;
import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.feed.repo.FeedRepository", f = "FeedRepository.kt", l = {361}, m = "getPrompt-IoAF18A", v = 2)
/* loaded from: classes6.dex */
public final class FeedRepository$getPrompt$1 extends HzP {
    public int I$0;
    public int I$1;
    public int I$2;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public Object L$7;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ FeedRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedRepository$getPrompt$1(FeedRepository feedRepository, HtJ<? super FeedRepository$getPrompt$1> htJ) {
        super(htJ);
        this.this$0 = feedRepository;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AnonymousClass006.A0m(this.this$0.m809getPromptIoAF18A(this));
    }
}

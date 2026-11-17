package com.facebook.aura.explore.repo;

import X.AnonymousClass006;
import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.explore.repo.IdeaCardsDataSource", f = "IdeaCardsDataSource.kt", l = {270}, m = "fetchCardDetailResult-gIAlu-s", v = 2)
/* loaded from: classes.dex */
public final class IdeaCardsDataSource$fetchCardDetailResult$1 extends HzP {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ IdeaCardsDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaCardsDataSource$fetchCardDetailResult$1(IdeaCardsDataSource ideaCardsDataSource, HtJ<? super IdeaCardsDataSource$fetchCardDetailResult$1> htJ) {
        super(htJ);
        this.this$0 = ideaCardsDataSource;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AnonymousClass006.A0m(this.this$0.m767fetchCardDetailResultgIAlus(null, this));
    }
}

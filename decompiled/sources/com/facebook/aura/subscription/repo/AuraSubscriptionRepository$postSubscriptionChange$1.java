package com.facebook.aura.subscription.repo;

import X.AnonymousClass006;
import X.HtJ;
import X.HzP;
import com.facebook.aura.file.utils.HtmlPdfRenderer;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.subscription.repo.AuraSubscriptionRepository", f = "AuraSubscriptionRepository.kt", l = {HtmlPdfRenderer.PAGE_HEIGHT}, m = "postSubscriptionChange-0E7RQCE", v = 2)
/* loaded from: classes4.dex */
public final class AuraSubscriptionRepository$postSubscriptionChange$1 extends HzP {
    public int I$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public boolean Z$0;
    public boolean Z$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AuraSubscriptionRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSubscriptionRepository$postSubscriptionChange$1(AuraSubscriptionRepository auraSubscriptionRepository, HtJ<? super AuraSubscriptionRepository$postSubscriptionChange$1> htJ) {
        super(htJ);
        this.this$0 = auraSubscriptionRepository;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AnonymousClass006.A0m(this.this$0.m2260postSubscriptionChange0E7RQCE(null, false, this));
    }
}

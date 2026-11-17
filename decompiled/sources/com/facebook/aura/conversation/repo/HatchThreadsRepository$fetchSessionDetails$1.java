package com.facebook.aura.conversation.repo;

import X.AnonymousClass006;
import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchThreadsRepository", f = "HatchThreadsRepository.kt", l = {686}, m = "fetchSessionDetails-gIAlu-s", v = 2)
/* loaded from: classes3.dex */
public final class HatchThreadsRepository$fetchSessionDetails$1 extends HzP {
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
    public final /* synthetic */ HatchThreadsRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchThreadsRepository$fetchSessionDetails$1(HatchThreadsRepository hatchThreadsRepository, HtJ<? super HatchThreadsRepository$fetchSessionDetails$1> htJ) {
        super(htJ);
        this.this$0 = hatchThreadsRepository;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AnonymousClass006.A0m(this.this$0.m498fetchSessionDetailsgIAlus(null, this));
    }
}

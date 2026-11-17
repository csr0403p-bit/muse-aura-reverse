package com.facebook.aura.modellock;

import X.AnonymousClass006;
import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.modellock.ModelLockRepository", f = "ModelLockRepository.kt", l = {199}, m = "submitAppeal-0E7RQCE", v = 2)
/* loaded from: classes5.dex */
public final class ModelLockRepository$submitAppeal$1 extends HzP {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ModelLockRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModelLockRepository$submitAppeal$1(ModelLockRepository modelLockRepository, HtJ<? super ModelLockRepository$submitAppeal$1> htJ) {
        super(htJ);
        this.this$0 = modelLockRepository;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AnonymousClass006.A0m(this.this$0.m1446submitAppeal0E7RQCE(null, null, this));
    }
}

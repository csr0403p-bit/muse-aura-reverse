package com.facebook.aura.status.repo;

import X.HtJ;
import X.HzP;
import com.facebook.aura.gateway.HatchGatewayConnectionState;
import com.facebook.aura.status.repo.ActivityDataSource;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.status.repo.ActivityDataSource$setupActivitySubscription$2$1", f = "ActivityDataSource.kt", l = {504}, m = "emit", v = 2)
/* loaded from: classes3.dex */
public final class ActivityDataSource$setupActivitySubscription$2$1$emit$1 extends HzP {
    public int I$0;
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ActivityDataSource.C140222.AnonymousClass1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ActivityDataSource$setupActivitySubscription$2$1$emit$1(ActivityDataSource.C140222.AnonymousClass1<? super T> anonymousClass1, HtJ<? super ActivityDataSource$setupActivitySubscription$2$1$emit$1> htJ) {
        super(htJ);
        this.this$0 = anonymousClass1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((HatchGatewayConnectionState) null, (HtJ<? super Unit>) this);
    }
}

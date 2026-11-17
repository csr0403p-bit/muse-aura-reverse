package com.facebook.aura.status.repo;

import X.HtJ;
import X.HzP;
import com.facebook.aura.gateway.ActivityUpdatedEvent;
import com.facebook.aura.status.repo.ActivityDataSource;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.status.repo.ActivityDataSource$setupActivitySubscription$1$1", f = "ActivityDataSource.kt", l = {1085}, m = "emit", v = 2)
/* loaded from: classes2.dex */
public final class ActivityDataSource$setupActivitySubscription$1$1$emit$1 extends HzP {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ActivityDataSource.C140211.C03911<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ActivityDataSource$setupActivitySubscription$1$1$emit$1(ActivityDataSource.C140211.C03911<? super T> c03911, HtJ<? super ActivityDataSource$setupActivitySubscription$1$1$emit$1> htJ) {
        super(htJ);
        this.this$0 = c03911;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((ActivityUpdatedEvent) null, (HtJ<? super Unit>) this);
    }
}

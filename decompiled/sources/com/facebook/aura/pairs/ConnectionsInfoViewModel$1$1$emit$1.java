package com.facebook.aura.pairs;

import X.HtJ;
import X.HzP;
import com.facebook.aura.pairs.ConnectionsInfoViewModel;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.pairs.ConnectionsInfoViewModel$1$1", f = "ConnectionsInfoViewModel.kt", l = {29}, m = "emit", v = 2)
/* loaded from: classes3.dex */
public final class ConnectionsInfoViewModel$1$1$emit$1 extends HzP {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ConnectionsInfoViewModel.AnonymousClass1.C02711<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConnectionsInfoViewModel$1$1$emit$1(ConnectionsInfoViewModel.AnonymousClass1.C02711<? super T> c02711, HtJ<? super ConnectionsInfoViewModel$1$1$emit$1> htJ) {
        super(htJ);
        this.this$0 = c02711;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((Unit) null, (HtJ<? super Unit>) this);
    }
}

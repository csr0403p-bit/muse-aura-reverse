package com.facebook.aura.spaces.repo;

import X.HtJ;
import X.HzP;
import com.facebook.aura.spaces.repo.HatchSpacesDataSource;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.spaces.repo.HatchSpacesDataSource$setupSpacesSubscription$2$1", f = "HatchSpacesDataSource.kt", l = {396, 398, 400}, m = "emit", v = 2)
/* loaded from: classes3.dex */
public final class HatchSpacesDataSource$setupSpacesSubscription$2$1$emit$1 extends HzP {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HatchSpacesDataSource.C139242.AnonymousClass1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchSpacesDataSource$setupSpacesSubscription$2$1$emit$1(HatchSpacesDataSource.C139242.AnonymousClass1<? super T> anonymousClass1, HtJ<? super HatchSpacesDataSource$setupSpacesSubscription$2$1$emit$1> htJ) {
        super(htJ);
        this.this$0 = anonymousClass1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((String) null, (HtJ<? super Unit>) this);
    }
}

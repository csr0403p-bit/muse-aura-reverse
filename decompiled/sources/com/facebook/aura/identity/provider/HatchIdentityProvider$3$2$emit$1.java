package com.facebook.aura.identity.provider;

import X.HtJ;
import X.HzP;
import com.facebook.aura.identity.provider.HatchIdentityProvider;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.identity.provider.HatchIdentityProvider$3$2", f = "HatchIdentityProvider.kt", l = {180}, m = "emit", v = 2)
/* loaded from: classes2.dex */
public final class HatchIdentityProvider$3$2$emit$1 extends HzP {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HatchIdentityProvider.AnonymousClass3.AnonymousClass2<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchIdentityProvider$3$2$emit$1(HatchIdentityProvider.AnonymousClass3.AnonymousClass2<? super T> anonymousClass2, HtJ<? super HatchIdentityProvider$3$2$emit$1> htJ) {
        super(htJ);
        this.this$0 = anonymousClass2;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((String) null, (HtJ<? super Unit>) this);
    }
}

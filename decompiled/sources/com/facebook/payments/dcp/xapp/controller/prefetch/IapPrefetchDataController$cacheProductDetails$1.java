package com.facebook.payments.dcp.xapp.controller.prefetch;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C8j3;
import X.C9571GPd;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.payments.dcp.xapp.controller.prefetch.IapPrefetchDataController$cacheProductDetails$1", f = "IapPrefetchDataController.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class IapPrefetchDataController$cacheProductDetails$1 extends AbstractC07127nr implements G0V<G0U<? super C9571GPd, ? extends Unit>, HtJ<? super Unit>, Object> {
    public final /* synthetic */ String $sku;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IapPrefetchDataController$cacheProductDetails$1(String str, HtJ<? super IapPrefetchDataController$cacheProductDetails$1> htJ) {
        super(2, htJ);
        this.$sku = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        IapPrefetchDataController$cacheProductDetails$1 iapPrefetchDataController$cacheProductDetails$1 = new IapPrefetchDataController$cacheProductDetails$1(this.$sku, htJ);
        iapPrefetchDataController$cacheProductDetails$1.L$0 = obj;
        return iapPrefetchDataController$cacheProductDetails$1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        G0U g0u = (G0U) this.L$0;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        g0u.invoke(new C9571GPd(null, null, this.$sku));
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(G0U<? super C9571GPd, ? extends Unit> g0u, HtJ<? super Unit> htJ) {
        return ((IapPrefetchDataController$cacheProductDetails$1) C8j3.A1E(htJ, g0u, this)).invokeSuspend(Unit.INSTANCE);
    }
}

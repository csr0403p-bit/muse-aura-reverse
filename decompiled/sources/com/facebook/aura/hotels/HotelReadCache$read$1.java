package com.facebook.aura.hotels;

import X.AnonymousClass006;
import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.hotels.HotelReadCache", f = "HotelReadCache.kt", l = {148}, m = "read-0E7RQCE", v = 2)
/* loaded from: classes3.dex */
public final class HotelReadCache$read$1 extends HzP {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HotelReadCache<K, V> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelReadCache$read$1(HotelReadCache<K, V> hotelReadCache, HtJ<? super HotelReadCache$read$1> htJ) {
        super(htJ);
        this.this$0 = hotelReadCache;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AnonymousClass006.A0m(this.this$0.m1068read0E7RQCE(null, null, this));
    }
}

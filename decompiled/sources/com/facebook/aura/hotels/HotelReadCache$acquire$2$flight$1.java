package com.facebook.aura.hotels;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3cG;
import X.EnumC10460Hji;
import X.G0U;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.hotels.HotelReadCache;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: Add missing generic type declarations: [V] */
@DebugMetadata(c = "com.facebook.aura.hotels.HotelReadCache$acquire$2$flight$1", f = "HotelReadCache.kt", l = {130}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class HotelReadCache$acquire$2$flight$1<V> extends AbstractC07127nr implements G0U<HtJ<? super HsJ<? extends V>>, Object> {
    public final /* synthetic */ K $key;
    public final /* synthetic */ HotelReadCache.Ticket<V> $ticket;
    public int label;
    public final /* synthetic */ HotelReadCache<K, V> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelReadCache$acquire$2$flight$1(HotelReadCache<K, V> hotelReadCache, K k, HotelReadCache.Ticket<V> ticket, HtJ<? super HotelReadCache$acquire$2$flight$1> htJ) {
        super(1, htJ);
        this.this$0 = hotelReadCache;
        this.$key = k;
        this.$ticket = ticket;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new HotelReadCache$acquire$2$flight$1(this.this$0, this.$key, this.$ticket, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object objM1068read0E7RQCE;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HotelReadCache<K, V> hotelReadCache = this.this$0;
            K k = this.$key;
            HotelReadCache.Ticket<V> ticket = this.$ticket;
            this.label = 1;
            objM1068read0E7RQCE = hotelReadCache.m1068read0E7RQCE(k, ticket, this);
            if (objM1068read0E7RQCE == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            objM1068read0E7RQCE = AnonymousClass001.A0q(obj);
        }
        return C3cG.A0t(objM1068read0E7RQCE);
    }

    @Override // X.G0U
    public final Object invoke(HtJ<? super HsJ<? extends V>> htJ) {
        return ((HotelReadCache$acquire$2$flight$1) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }
}

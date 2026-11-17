package com.facebook.aura.hotels;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3cG;
import X.EnumC10460Hji;
import X.G0U;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.hotels.HotelRepository$results$2", f = "HotelRepository.kt", l = {72}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class HotelRepository$results$2 extends AbstractC07127nr implements G0U<HtJ<? super HsJ<? extends HotelResults>>, Object> {
    public final /* synthetic */ boolean $forceRefresh;
    public final /* synthetic */ String $searchRef;
    public int label;
    public final /* synthetic */ HotelRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelRepository$results$2(HotelRepository hotelRepository, String str, boolean z, HtJ<? super HotelRepository$results$2> htJ) {
        super(1, htJ);
        this.this$0 = hotelRepository;
        this.$searchRef = str;
        this.$forceRefresh = z;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new HotelRepository$results$2(this.this$0, this.$searchRef, this.$forceRefresh, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object objM1069get0E7RQCE;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HotelReadCache<String, HotelResults> hotelReadCache = this.this$0.currentReadOwner().results;
            String str = this.$searchRef;
            boolean z = this.$forceRefresh;
            this.label = 1;
            objM1069get0E7RQCE = hotelReadCache.m1069get0E7RQCE(str, z, this);
            if (objM1069get0E7RQCE == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            objM1069get0E7RQCE = AnonymousClass001.A0q(obj);
        }
        return C3cG.A0t(objM1069get0E7RQCE);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(HtJ<? super HsJ<HotelResults>> htJ) {
        return ((HotelRepository$results$2) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Object invoke(HtJ<? super HsJ<? extends HotelResults>> htJ) {
        return invoke2((HtJ<? super HsJ<HotelResults>>) htJ);
    }
}

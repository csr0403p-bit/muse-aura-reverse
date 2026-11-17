package com.facebook.aura.hotels;

import X.AnonymousClass006;
import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.hotels.HotelRepository", f = "HotelRepository.kt", l = {166}, m = "requestBookingReview-BWLJW6A", v = 2)
/* loaded from: classes3.dex */
public final class HotelRepository$requestBookingReview$1 extends HzP {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HotelRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelRepository$requestBookingReview$1(HotelRepository hotelRepository, HtJ<? super HotelRepository$requestBookingReview$1> htJ) {
        super(htJ);
        this.this$0 = hotelRepository;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AnonymousClass006.A0m(this.this$0.mo1060requestBookingReviewBWLJW6A(null, null, null, this));
    }
}

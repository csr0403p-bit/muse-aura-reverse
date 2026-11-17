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

@DebugMetadata(c = "com.facebook.aura.hotels.HotelRepository$requestBookingReview$2", f = "HotelRepository.kt", l = {167}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class HotelRepository$requestBookingReview$2 extends AbstractC07127nr implements G0U<HtJ<? super HsJ<? extends Unit>>, Object> {
    public final /* synthetic */ String $selectionRef;
    public final /* synthetic */ String $sessionId;
    public int label;
    public final /* synthetic */ HotelRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelRepository$requestBookingReview$2(HotelRepository hotelRepository, String str, String str2, HtJ<? super HotelRepository$requestBookingReview$2> htJ) {
        super(1, htJ);
        this.this$0 = hotelRepository;
        this.$selectionRef = str;
        this.$sessionId = str2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new HotelRepository$requestBookingReview$2(this.this$0, this.$selectionRef, this.$sessionId, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object objM1076postBookingReview0E7RQCE;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HotelRepository hotelRepository = this.this$0;
            String str = this.$selectionRef;
            String str2 = this.$sessionId;
            this.label = 1;
            objM1076postBookingReview0E7RQCE = hotelRepository.m1076postBookingReview0E7RQCE(str, str2, this);
            if (objM1076postBookingReview0E7RQCE == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            objM1076postBookingReview0E7RQCE = AnonymousClass001.A0q(obj);
        }
        return C3cG.A0t(objM1076postBookingReview0E7RQCE);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(HtJ<? super HsJ<Unit>> htJ) {
        return ((HotelRepository$requestBookingReview$2) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Object invoke(HtJ<? super HsJ<? extends Unit>> htJ) {
        return invoke2((HtJ<? super HsJ<Unit>>) htJ);
    }
}

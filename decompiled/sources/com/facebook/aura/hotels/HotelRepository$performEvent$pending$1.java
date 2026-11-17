package com.facebook.aura.hotels;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0V;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.common.coroutines.SingleFlightResult;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.hotels.HotelRepository$performEvent$pending$1", f = "HotelRepository.kt", l = {202}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class HotelRepository$performEvent$pending$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HsJ<? extends Unit>>, Object> {
    public final /* synthetic */ HotelReviewRequestKey $key;
    public final /* synthetic */ HotelEventKind $kind;
    public final /* synthetic */ HotelReviewSource $source;
    public final /* synthetic */ HotelRequestTicket $ticket;
    public int label;
    public final /* synthetic */ HotelRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelRepository$performEvent$pending$1(HotelRepository hotelRepository, HotelRequestTicket hotelRequestTicket, HotelReviewSource hotelReviewSource, HotelEventKind hotelEventKind, HotelReviewRequestKey hotelReviewRequestKey, HtJ<? super HotelRepository$performEvent$pending$1> htJ) {
        super(2, htJ);
        this.this$0 = hotelRepository;
        this.$ticket = hotelRequestTicket;
        this.$source = hotelReviewSource;
        this.$kind = hotelEventKind;
        this.$key = hotelReviewRequestKey;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HotelRepository$performEvent$pending$1(this.this$0, this.$ticket, this.$source, this.$kind, this.$key, htJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object objA0s;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HotelRepository hotelRepository = this.this$0;
            SingleFlight singleFlight = hotelRepository.flights;
            HotelRequestTicket hotelRequestTicket = this.$ticket;
            HotelRepository$performEvent$pending$1$flight$1 hotelRepository$performEvent$pending$1$flight$1 = new HotelRepository$performEvent$pending$1$flight$1(hotelRepository, hotelRequestTicket, this.$source, this.$kind, this.$key, null);
            this.label = 1;
            obj = singleFlight.invoke(hotelRequestTicket, hotelRepository$performEvent$pending$1$flight$1, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        SingleFlightResult singleFlightResult = (SingleFlightResult) obj;
        if (singleFlightResult instanceof SingleFlightResult.Result) {
            objA0s = ((HsJ) ((SingleFlightResult.Result) singleFlightResult).value).value;
        } else {
            if (!C7384Etj.areEqual(singleFlightResult, SingleFlightResult.Skipped.INSTANCE)) {
                throw C3cG.A0q();
            }
            objA0s = C3cG.A0s(C3cG.A0Q("Hotel action was skipped"));
        }
        return C3cG.A0t(objA0s);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super HsJ<Unit>> htJ) {
        return ((HotelRepository$performEvent$pending$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super HsJ<? extends Unit>> htJ) {
        return invoke2(c3ux, (HtJ<? super HsJ<Unit>>) htJ);
    }
}

package com.facebook.aura.hotels;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.C10571Hud;
import X.C3cG;
import X.C60O;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import X.HxE;
import com.facebook.aura.hotels.HotelRepository;
import com.facebook.aura.network.AuraAcceptLanguage;
import com.facebook.aura.network.http.HatchHttpApi;
import com.facebook.aura.network.http.RequestType;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.hotels.HotelRepository$ReadOwner$results$2", f = "HotelRepository.kt", l = {119}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class HotelRepository$ReadOwner$results$2 extends AbstractC07127nr implements G0V<String, HtJ<? super HsJ<? extends HotelResults>>, Object> {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ HotelRepository this$0;
    public final /* synthetic */ HotelRepository.ReadOwner this$1;

    @DebugMetadata(c = "com.facebook.aura.hotels.HotelRepository$ReadOwner$results$2$1", f = "HotelRepository.kt", l = {360}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.hotels.HotelRepository$ReadOwner$results$2$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0U<HtJ<? super HsJ<? extends HotelResults>>, Object> {
        public final /* synthetic */ String $searchRef;
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public int label;
        public final /* synthetic */ HotelRepository this$0;
        public final /* synthetic */ HotelRepository.ReadOwner this$1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HotelRepository hotelRepository, String str, HotelRepository.ReadOwner readOwner, HtJ<? super AnonymousClass1> htJ) {
            super(1, htJ);
            this.this$0 = hotelRepository;
            this.$searchRef = str;
            this.this$1 = readOwner;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return new AnonymousClass1(this.this$0, this.$searchRef, this.this$1, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1595executeBodylessJarvisRequestWithp3iPjrY;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                HatchHttpApi hatchHttpApiA06 = C60O.A06(obj);
                HotelPath hotelPath = HotelPath.RESULTS;
                RequestType requestType = RequestType.GET;
                AbstractC3358CGz abstractC3358CGz = this.this$0.userSession;
                HxE<String, ? extends Object>[] hxEArr = {C3cG.A0r("search_ref", this.$searchRef)};
                HotelRepository.ReadOwner readOwner = this.this$1;
                String str = readOwner.gateway;
                Map<String, String> mapA10 = AnonymousClass006.A10(AuraAcceptLanguage.HEADER, readOwner.language);
                Long lA0S = C3cG.A0S(120L);
                Set<Integer> setA18 = AnonymousClass004.A18();
                HotelRepository$ReadOwner$results$2$1$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 hotelRepository$ReadOwner$results$2$1$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 = HotelRepository$ReadOwner$results$2$1$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = null;
                this.I$0 = 1;
                this.I$1 = 1;
                this.I$2 = 0;
                this.label = 1;
                objM1595executeBodylessJarvisRequestWithp3iPjrY = hatchHttpApiA06.m1595executeBodylessJarvisRequestWithp3iPjrY(hotelRepository$ReadOwner$results$2$1$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1, false, hotelPath, requestType, abstractC3358CGz, lA0S, hxEArr, null, setA18, true, mapA10, true, str, false, this);
                if (objM1595executeBodylessJarvisRequestWithp3iPjrY == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM1595executeBodylessJarvisRequestWithp3iPjrY = AnonymousClass002.A0j(obj);
            }
            if (!(objM1595executeBodylessJarvisRequestWithp3iPjrY instanceof C10571Hud)) {
                try {
                    int i2 = HotelResultsJson.$stable;
                    objM1595executeBodylessJarvisRequestWithp3iPjrY = ((HotelResultsJson) objM1595executeBodylessJarvisRequestWithp3iPjrY).toDomain(null);
                    if (objM1595executeBodylessJarvisRequestWithp3iPjrY == null) {
                        throw C3cG.A0Q("Invalid hotel results");
                    }
                } catch (Throwable th) {
                    objM1595executeBodylessJarvisRequestWithp3iPjrY = C3cG.A0s(th);
                }
            }
            return C3cG.A0t(objM1595executeBodylessJarvisRequestWithp3iPjrY);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(HtJ<? super HsJ<HotelResults>> htJ) {
            return ((AnonymousClass1) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Object invoke(HtJ<? super HsJ<? extends HotelResults>> htJ) {
            return invoke2((HtJ<? super HsJ<HotelResults>>) htJ);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelRepository$ReadOwner$results$2(HotelRepository hotelRepository, HotelRepository.ReadOwner readOwner, HtJ<? super HotelRepository$ReadOwner$results$2> htJ) {
        super(2, htJ);
        this.this$0 = hotelRepository;
        this.this$1 = readOwner;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        HotelRepository$ReadOwner$results$2 hotelRepository$ReadOwner$results$2 = new HotelRepository$ReadOwner$results$2(this.this$0, this.this$1, htJ);
        hotelRepository$ReadOwner$results$2.L$0 = obj;
        return hotelRepository$ReadOwner$results$2;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object objM1078requestgIAlus;
        String str = (String) this.L$0;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HotelRepository hotelRepository = this.this$0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(hotelRepository, str, this.this$1, null);
            this.L$0 = null;
            this.label = 1;
            objM1078requestgIAlus = hotelRepository.m1078requestgIAlus(anonymousClass1, this);
            if (objM1078requestgIAlus == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            objM1078requestgIAlus = AnonymousClass001.A0q(obj);
        }
        return C3cG.A0t(objM1078requestgIAlus);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(String str, HtJ<? super HsJ<HotelResults>> htJ) {
        return ((HotelRepository$ReadOwner$results$2) create(str, htJ)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(String str, HtJ<? super HsJ<? extends HotelResults>> htJ) {
        return invoke2(str, (HtJ<? super HsJ<HotelResults>>) htJ);
    }
}

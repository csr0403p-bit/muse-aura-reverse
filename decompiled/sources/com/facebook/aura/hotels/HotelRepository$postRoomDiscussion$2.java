package com.facebook.aura.hotels;

import X.AGH;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.C10571Hud;
import X.C3cG;
import X.C60O;
import X.C9jH;
import X.EnumC10460Hji;
import X.G0U;
import X.HsJ;
import X.HtJ;
import X.HxE;
import com.facebook.aura.network.http.RequestType;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.hotels.HotelRepository$postRoomDiscussion$2", f = "HotelRepository.kt", l = {384}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class HotelRepository$postRoomDiscussion$2 extends AbstractC07127nr implements G0U<HtJ<? super HsJ<? extends Unit>>, Object> {
    public final /* synthetic */ String $selectionRef;
    public final /* synthetic */ String $sessionId;
    public int I$0;
    public int I$1;
    public int I$2;
    public int I$3;
    public int I$4;
    public int I$5;
    public int I$6;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelRepository$postRoomDiscussion$2(String str, String str2, HotelRepository hotelRepository, HtJ<? super HotelRepository$postRoomDiscussion$2> htJ) {
        super(1, htJ);
        this.$selectionRef = str;
        this.$sessionId = str2;
        this.this$0 = hotelRepository;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new HotelRepository$postRoomDiscussion$2(this.$selectionRef, this.$sessionId, this.this$0, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object objM1599executeJarvisRequestWithFof5HsY;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Set<Integer> setA18 = AnonymousClass004.A18();
            C9jH c9jHA0E = AGH.A0E();
            HotelRepository$postRoomDiscussion$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 hotelRepository$postRoomDiscussion$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 = HotelRepository$postRoomDiscussion$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE;
            HotelRepository$postRoomDiscussion$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 hotelRepository$postRoomDiscussion$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 = HotelRepository$postRoomDiscussion$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE;
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
            this.I$1 = 0;
            this.I$2 = 0;
            this.I$3 = 0;
            this.I$4 = 0;
            this.I$5 = 0;
            this.I$6 = 0;
            this.label = 1;
            objM1599executeJarvisRequestWithFof5HsY = C60O.A06(obj).m1599executeJarvisRequestWithFof5HsY(hotelRepository$postRoomDiscussion$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1, hotelRepository$postRoomDiscussion$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2, false, HotelPath.EVENTS, new HotelBookingReviewRequestJson("ask_about_rooms", this.$selectionRef, this.$sessionId), RequestType.POST, this.this$0.userSession, C3cG.A0S(30L), null, new HxE[0], setA18, true, false, c9jHA0E, null, false, false, false, false, null, false, this);
            if (objM1599executeJarvisRequestWithFof5HsY == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            objM1599executeJarvisRequestWithFof5HsY = AnonymousClass002.A0j(obj);
        }
        String str = this.$selectionRef;
        String str2 = this.$sessionId;
        if (!(objM1599executeJarvisRequestWithFof5HsY instanceof C10571Hud)) {
            try {
                ((HotelEventResponseJson) objM1599executeJarvisRequestWithFof5HsY).validate(str, str2);
                objM1599executeJarvisRequestWithFof5HsY = Unit.INSTANCE;
            } catch (Throwable th) {
                objM1599executeJarvisRequestWithFof5HsY = C3cG.A0s(th);
            }
        }
        return C3cG.A0t(objM1599executeJarvisRequestWithFof5HsY);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(HtJ<? super HsJ<Unit>> htJ) {
        return ((HotelRepository$postRoomDiscussion$2) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Object invoke(HtJ<? super HsJ<? extends Unit>> htJ) {
        return invoke2((HtJ<? super HsJ<Unit>>) htJ);
    }
}

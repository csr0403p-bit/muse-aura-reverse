package com.facebook.aura.hotels;

import X.AbstractC07127nr;
import X.G0U;
import X.HsJ;
import X.HtJ;
import com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.hotels.HotelRepository$performEvent$pending$1$flight$1", f = "HotelRepository.kt", l = {HatchIdeaShareImageRenderer.ILLUSTRATION_SIZE}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class HotelRepository$performEvent$pending$1$flight$1 extends AbstractC07127nr implements G0U<HtJ<? super HsJ<? extends Unit>>, Object> {
    public final /* synthetic */ HotelReviewRequestKey $key;
    public final /* synthetic */ HotelEventKind $kind;
    public final /* synthetic */ HotelReviewSource $source;
    public final /* synthetic */ HotelRequestTicket $ticket;
    public Object L$0;
    public int label;
    public final /* synthetic */ HotelRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelRepository$performEvent$pending$1$flight$1(HotelRepository hotelRepository, HotelRequestTicket hotelRequestTicket, HotelReviewSource hotelReviewSource, HotelEventKind hotelEventKind, HotelReviewRequestKey hotelReviewRequestKey, HtJ<? super HotelRepository$performEvent$pending$1$flight$1> htJ) {
        super(1, htJ);
        this.this$0 = hotelRepository;
        this.$ticket = hotelRequestTicket;
        this.$source = hotelReviewSource;
        this.$kind = hotelEventKind;
        this.$key = hotelReviewRequestKey;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new HotelRepository$performEvent$pending$1$flight$1(this.this$0, this.$ticket, this.$source, this.$kind, this.$key, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e5 A[Catch: all -> 0x00f0, TRY_LEAVE, TryCatch #0 {, blocks: (B:36:0x009d, B:38:0x00a1, B:40:0x00b8, B:42:0x00bc, B:44:0x00cc, B:46:0x00d2, B:51:0x00dd, B:53:0x00e5), top: B:64:0x009d }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x009d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.hotels.HotelRepository$performEvent$pending$1$flight$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(HtJ<? super HsJ<Unit>> htJ) {
        return ((HotelRepository$performEvent$pending$1$flight$1) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Object invoke(HtJ<? super HsJ<? extends Unit>> htJ) {
        return invoke2((HtJ<? super HsJ<Unit>>) htJ);
    }
}

package com.facebook.aura.hotels;

import X.AnonymousClass006;
import X.HtJ;
import X.HzP;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.hotels.HotelRepository", f = "HotelRepository.kt", l = {HatchMessageShareDocumentRenderer.MIN_CONTENT_HEIGHT_PX}, m = "request-gIAlu-s", v = 2)
/* loaded from: classes3.dex */
public final class HotelRepository$request$1<T> extends HzP {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HotelRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelRepository$request$1(HotelRepository hotelRepository, HtJ<? super HotelRepository$request$1> htJ) {
        super(htJ);
        this.this$0 = hotelRepository;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AnonymousClass006.A0m(this.this$0.m1078requestgIAlus(null, this));
    }
}

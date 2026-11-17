package com.facebook.aura.hotels;

import X.C7438Evz;
import com.facebook.aura.hotels.HotelRepository;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class HotelRepository$ReadOwner$details$1 extends C7438Evz implements Function0<Boolean> {
    public HotelRepository$ReadOwner$details$1(Object obj) {
        super(0, obj, HotelRepository.ReadOwner.class, "canUse", "canUse()Z", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(((HotelRepository.ReadOwner) this.receiver).canUse());
    }
}

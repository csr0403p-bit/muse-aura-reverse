package com.facebook.aura.hotels;

import X.AHD;
import X.AbstractC7559F3s;
import X.BL5;
import X.C2BR;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HotelDetailsPrefetchModifierKt$prefetchHotelDetailsOnImpression$1$1 extends AbstractC7559F3s implements G0U {
    public final /* synthetic */ MutableState<Boolean> $prefetched$delegate;
    public final /* synthetic */ HotelRepository $repository;
    public final /* synthetic */ AHD<HotelReviewSource> $targets;

    /* renamed from: com.facebook.aura.hotels.HotelDetailsPrefetchModifierKt$prefetchHotelDetailsOnImpression$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    @Override // X.G0U
    public final BL5 invoke(C2BR c2br) {
        C7384Etj.A0Y(c2br, 0);
        if (!MutableState.A0A((MutableState) this.$prefetched$delegate)) {
            MutableState.A09(true, this.$prefetched$delegate);
            this.$repository.prefetchDetails(this.$targets);
        }
        AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        C7384Etj.A0Y(anonymousClass1, 0);
        return new BL5(anonymousClass1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelDetailsPrefetchModifierKt$prefetchHotelDetailsOnImpression$1$1(HotelRepository hotelRepository, AHD<HotelReviewSource> ahd, MutableState<Boolean> mutableState) {
        super(1);
        this.$repository = hotelRepository;
        this.$targets = ahd;
        this.$prefetched$delegate = mutableState;
    }
}

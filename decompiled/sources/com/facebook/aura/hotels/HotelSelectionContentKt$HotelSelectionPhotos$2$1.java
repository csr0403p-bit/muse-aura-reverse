package com.facebook.aura.hotels;

import X.AXY;
import X.AYU;
import X.AZE;
import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.C3TG;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import X.InterfaceC1134Abi;
import androidx.compose.ui.unit.Constraints;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HotelSelectionContentKt$HotelSelectionPhotos$2$1 extends AbstractC7559F3s implements G0W<AXY, C3TG, Constraints, InterfaceC1134Abi> {
    public static final HotelSelectionContentKt$HotelSelectionPhotos$2$1 INSTANCE = new HotelSelectionContentKt$HotelSelectionPhotos$2$1();

    /* renamed from: com.facebook.aura.hotels.HotelSelectionContentKt$HotelSelectionPhotos$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AYU, Unit> {
        public final /* synthetic */ AZE $photos;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AYU ayu) {
            C7384Etj.A0Y(ayu, 0);
            AYU.A04(ayu, this.$photos, 0, 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AZE aze) {
            super(1);
            this.$photos = aze;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(AYU ayu) {
            invoke2(ayu);
            return Unit.INSTANCE;
        }
    }

    public HotelSelectionContentKt$HotelSelectionPhotos$2$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ InterfaceC1134Abi invoke(AXY axy, C3TG c3tg, Constraints constraints) {
        return m1089invoke3p2s80s(axy, c3tg, constraints.A00);
    }

    /* renamed from: invoke-3p2s80s, reason: not valid java name */
    public final InterfaceC1134Abi m1089invoke3p2s80s(AXY axy, C3TG c3tg, long j) {
        AnonymousClass003.A0u(axy, c3tg);
        int iA01 = Constraints.A01(j);
        int iMin = Math.min((int) (iA01 * 0.8091603f), Math.min(axy.Abr(318.0f), Constraints.A00(j)));
        int iA02 = Constraints.A02(j);
        if (iMin < iA02) {
            iMin = iA02;
        }
        AZE azeAQW = c3tg.AQW(Constraints.A05(Constraints.A03(j), iA01, iMin, iMin));
        return AXY.A01(axy, new AnonymousClass1(azeAQW), azeAQW.A01, azeAQW.A00);
    }
}

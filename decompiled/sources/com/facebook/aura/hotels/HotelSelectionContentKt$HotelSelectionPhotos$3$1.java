package com.facebook.aura.hotels;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.AnonymousClass037;
import X.B1V;
import X.BFM;
import X.C0AU;
import X.C0CD;
import X.C1OM;
import X.C1Z5;
import X.C60O;
import X.C60P;
import X.C7384Etj;
import X.G0U;
import X.G0V;
import X.G2j;
import com.facebook.aura.ui.sharedelement.HatchSharedElementKt;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class HotelSelectionContentKt$HotelSelectionPhotos$3$1 extends AbstractC7559F3s implements G0U<C0CD, Unit> {
    public final /* synthetic */ String $description;
    public final /* synthetic */ List<HotelImage> $images;
    public final /* synthetic */ String $sharedKey;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C0CD c0cd) {
        C7384Etj.A0Y(c0cd, 0);
        final List<HotelImage> list = this.$images;
        final AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        final String str = this.$sharedKey;
        final String str2 = this.$description;
        c0cd.APL(anonymousClass1 != null ? new G0U<Integer, Object>() { // from class: com.facebook.aura.hotels.HotelSelectionContentKt$HotelSelectionPhotos$3$1$invoke$$inlined$itemsIndexed$default$1
            public final Object invoke(int i) {
                return AnonymousClass006.A0n(Integer.valueOf(i), list, anonymousClass1, i);
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(AnonymousClass001.A0F(num));
            }
        } : null, new G0U<Integer, Object>() { // from class: com.facebook.aura.hotels.HotelSelectionContentKt$HotelSelectionPhotos$3$1$invoke$$inlined$itemsIndexed$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                list.get(AnonymousClass001.A0F(num));
                return null;
            }

            public final Object invoke(int i) {
                list.get(i);
                return null;
            }
        }, AnonymousClass001.A0M(new G2j<AnonymousClass037, Integer, BFM, Integer, Unit>() { // from class: com.facebook.aura.hotels.HotelSelectionContentKt$HotelSelectionPhotos$3$1$invoke$$inlined$itemsIndexed$default$3
            public final void invoke(AnonymousClass037 anonymousClass037, int i, BFM bfm, int i2) {
                int iA0d = (i2 & 6) == 0 ? AnonymousClass004.A0d(bfm, anonymousClass037) | i2 : i2;
                if ((i2 & 48) == 0) {
                    iA0d |= AnonymousClass004.A0E(bfm, i);
                }
                if (!AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
                    bfm.Afo();
                    return;
                }
                HotelImage hotelImage = (HotelImage) list.get(i);
                bfm.AgE(1998238795);
                String str3 = str;
                if (i != 0) {
                    str3 = null;
                }
                C0AU c0au = (C0AU) anonymousClass037;
                HatchSharedElementKt.HatchSharedElement(str3, C1OM.A00, new C1Z5(c0au.A01, null, "fillParentMaxWidth", 0.8f).then(new C1Z5(null, c0au.A00, "fillParentMaxHeight", 1.0f)), null, null, 350, B1V.A00(bfm, new HotelSelectionContentKt$HotelSelectionPhotos$3$1$2$2(hotelImage, str2), -1308285386), bfm, 1769520, 24);
                AnonymousClass002.A19(bfm);
            }

            @Override // X.G2j
            public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, Integer num, BFM bfm, Integer num2) {
                invoke(anonymousClass037, AnonymousClass001.A0F(num), bfm, AnonymousClass001.A0F(num2));
                return Unit.INSTANCE;
            }
        }, 2039820996), list.size());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelSelectionContentKt$HotelSelectionPhotos$3$1(List<HotelImage> list, String str, String str2) {
        super(1);
        this.$images = list;
        this.$sharedKey = str;
        this.$description = str2;
    }

    /* renamed from: com.facebook.aura.hotels.HotelSelectionContentKt$HotelSelectionPhotos$3$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<Integer, HotelImage, Object> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(2);
        }

        public final Object invoke(int i, HotelImage hotelImage) {
            C7384Etj.A0Y(hotelImage, 1);
            String str = hotelImage.url;
            StringBuilder sbA0w = C60O.A0w();
            sbA0w.append(i);
            return C60P.A1M(":", str, sbA0w);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(Integer num, HotelImage hotelImage) {
            return invoke(AnonymousClass001.A0F(num), hotelImage);
        }
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C0CD c0cd) {
        invoke2(c0cd);
        return Unit.INSTANCE;
    }
}

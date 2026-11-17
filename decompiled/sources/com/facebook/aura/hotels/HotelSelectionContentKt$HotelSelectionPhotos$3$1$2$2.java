package com.facebook.aura.hotels;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.B18;
import X.BFM;
import X.C10G;
import X.C1DG;
import X.G0V;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HotelSelectionContentKt$HotelSelectionPhotos$3$1$2$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ String $description;
    public final /* synthetic */ HotelImage $image;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelSelectionContentKt$HotelSelectionPhotos$3$1$2$2(HotelImage hotelImage, String str) {
        super(2);
        this.$image = hotelImage;
        this.$description = str;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            HotelImage hotelImage = this.$image;
            String str = hotelImage.url;
            String str2 = hotelImage.caption;
            if (str2 == null) {
                str2 = this.$description;
            }
            AuraImageKt.m2573AuraImageXRP3Ue8(str, C10G.A01, B18.A00, str2, null, false, new C1DG(393.0f), 0L, false, false, false, null, null, null, null, bfm, 1573296, 0, 32688);
            return;
        }
        bfm.Afo();
    }
}

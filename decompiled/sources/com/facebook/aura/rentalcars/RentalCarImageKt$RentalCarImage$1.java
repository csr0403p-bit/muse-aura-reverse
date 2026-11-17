package com.facebook.aura.rentalcars;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.B18;
import X.B1V;
import X.BFM;
import X.BRg;
import X.C10G;
import X.C1DG;
import X.C1b8;
import X.C3cH;
import X.G0V;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class RentalCarImageKt$RentalCarImage$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ float $decodeAtSize;
    public final /* synthetic */ String $imageUrl;

    /* renamed from: com.facebook.aura.rentalcars.RentalCarImageKt$RentalCarImage$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ BRg $imageModifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BRg bRg) {
            super(2);
            this.$imageModifier = bRg;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                RentalCarImageKt.RentalCarImagePlaceholder(this.$imageModifier, bfm, 0, 0);
            } else {
                bfm.Afo();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RentalCarImageKt$RentalCarImage$1(String str, float f) {
        super(2);
        this.$imageUrl = str;
        this.$decodeAtSize = f;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            BRg bRgA01 = C1b8.A01(C10G.A01, C3cH.A0W(bfm).card);
            if (this.$imageUrl == null) {
                bfm.AgE(1890415805);
                RentalCarImageKt.RentalCarImagePlaceholder(bRgA01, bfm, 0, 0);
            } else {
                bfm.AgE(1890500869);
                AuraImageKt.m2573AuraImageXRP3Ue8(this.$imageUrl, bRgA01, B18.A02, null, null, false, new C1DG(this.$decodeAtSize), 0L, false, false, false, B1V.A00(bfm, new AnonymousClass1(bRgA01), -799503029), null, null, null, bfm, 3456, 48, 30640);
            }
            AnonymousClass002.A19(bfm);
            return;
        }
        bfm.Afo();
    }
}

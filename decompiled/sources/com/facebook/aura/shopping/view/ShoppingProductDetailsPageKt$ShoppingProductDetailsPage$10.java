package com.facebook.aura.shopping.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.BRg;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.productactions.impl.ProductDetailsActions;
import com.facebook.aura.productactions.impl.ShoppingProductMediaActions;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class ShoppingProductDetailsPageKt$ShoppingProductDetailsPage$10 extends AbstractC7559F3s implements G0W<BRg, BFM, Integer, Unit> {
    public final /* synthetic */ ProductDetailsActions $productActions;

    public final void invoke(BRg bRg, BFM bfm, int i) {
        C7384Etj.A0Y(bRg, 0);
        if ((i & 6) == 0) {
            i |= AnonymousClass004.A0d(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(i), bfm, i)) {
            ShoppingProductMediaActions.INSTANCE.Content(this.$productActions, bRg, bfm, ((i << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 384, 0);
        } else {
            bfm.Afo();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingProductDetailsPageKt$ShoppingProductDetailsPage$10(ProductDetailsActions productDetailsActions) {
        super(3);
        this.$productActions = productDetailsActions;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(BRg bRg, BFM bfm, Integer num) {
        invoke(bRg, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}

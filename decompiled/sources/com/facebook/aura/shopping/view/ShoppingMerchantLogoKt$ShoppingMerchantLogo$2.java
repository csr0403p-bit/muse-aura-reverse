package com.facebook.aura.shopping.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.C10G;
import X.G0V;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ShoppingMerchantLogoKt$ShoppingMerchantLogo$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ AuraIconSize $fallbackIconSize;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingMerchantLogoKt$ShoppingMerchantLogo$2(AuraIconSize auraIconSize) {
        super(2);
        this.$fallbackIconSize = auraIconSize;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            ShoppingMerchantLogoKt.ShoppingMerchantLogoFallback(this.$fallbackIconSize, C10G.A01, bfm, 48, 0);
        } else {
            bfm.Afo();
        }
    }
}

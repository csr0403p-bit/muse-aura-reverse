package com.facebook.aura.shopping.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ShoppingMerchantLogoKt$ShoppingMerchantLogo$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ AuraIconSize $fallbackIconSize;
    public final /* synthetic */ String $iconUrl;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ float $size;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingMerchantLogoKt$ShoppingMerchantLogo$1(String str, float f, AuraIconSize auraIconSize, BRg bRg, int i, int i2) {
        super(2);
        this.$iconUrl = str;
        this.$size = f;
        this.$fallbackIconSize = auraIconSize;
        this.$modifier = bRg;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        ShoppingMerchantLogoKt.m2070ShoppingMerchantLogoDzVHIIc(this.$iconUrl, this.$size, this.$fallbackIconSize, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}

package com.facebook.aura.shopping.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1822Arm;
import X.G0V;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ShoppingMerchantLogoKt$ShoppingMerchantLabel$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ AuraIconSize $fallbackIconSize;
    public final /* synthetic */ float $logoSize;
    public final /* synthetic */ float $logoSpacing;
    public final /* synthetic */ String $logoUrl;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ boolean $showsLogo;
    public final /* synthetic */ C1822Arm $style;
    public final /* synthetic */ String $text;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingMerchantLogoKt$ShoppingMerchantLabel$2(String str, C1822Arm c1822Arm, boolean z, String str2, float f, float f2, AuraIconSize auraIconSize, BRg bRg, int i, int i2) {
        super(2);
        this.$text = str;
        this.$style = c1822Arm;
        this.$showsLogo = z;
        this.$logoUrl = str2;
        this.$logoSize = f;
        this.$logoSpacing = f2;
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
        ShoppingMerchantLogoKt.m2069ShoppingMerchantLabeltOXsyB8(this.$text, this.$style, this.$showsLogo, this.$logoUrl, this.$logoSize, this.$logoSpacing, this.$fallbackIconSize, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}

package com.facebook.aura.shopping.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1822Arm;
import X.G0V;
import com.facebook.aura.shopping.model.ShoppingProductSubtitle;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchShoppingResultsCardKt$ShoppingProductSubtitleLine$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ AuraIconSize $fallbackIconSize;
    public final /* synthetic */ float $logoSize;
    public final /* synthetic */ float $logoSpacing;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ C1822Arm $style;
    public final /* synthetic */ ShoppingProductSubtitle $subtitle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchShoppingResultsCardKt$ShoppingProductSubtitleLine$1(ShoppingProductSubtitle shoppingProductSubtitle, C1822Arm c1822Arm, float f, float f2, AuraIconSize auraIconSize, BRg bRg, int i, int i2) {
        super(2);
        this.$subtitle = shoppingProductSubtitle;
        this.$style = c1822Arm;
        this.$logoSize = f;
        this.$logoSpacing = f2;
        this.$fallbackIconSize = auraIconSize;
        this.$modifier = bRg;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(BFM bfm, int i) {
        HatchShoppingResultsCardKt.m2041ShoppingProductSubtitleLine1yyLQnY(this.$subtitle, this.$style, this.$logoSize, this.$logoSpacing, this.$fallbackIconSize, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}

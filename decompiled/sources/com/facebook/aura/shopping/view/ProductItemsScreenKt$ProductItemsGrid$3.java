package com.facebook.aura.shopping.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import com.facebook.aura.shopping.viewmodel.ProductItemsSection;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class ProductItemsScreenKt$ProductItemsGrid$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ float $bottomPadding;
    public final /* synthetic */ String $messageId;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ AHD<ProductItemsSection> $sections;
    public final /* synthetic */ String $sessionId;
    public final /* synthetic */ float $topPadding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductItemsScreenKt$ProductItemsGrid$3(AHD<ProductItemsSection> ahd, String str, String str2, float f, float f2, BRg bRg, int i, int i2) {
        super(2);
        this.$sections = ahd;
        this.$sessionId = str;
        this.$messageId = str2;
        this.$topPadding = f;
        this.$bottomPadding = f2;
        this.$modifier = bRg;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(BFM bfm, int i) {
        ProductItemsScreenKt.m2052ProductItemsGridnSlTg7c(this.$sections, this.$sessionId, this.$messageId, this.$topPadding, this.$bottomPadding, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}

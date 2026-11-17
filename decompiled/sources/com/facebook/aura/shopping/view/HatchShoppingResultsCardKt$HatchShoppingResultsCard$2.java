package com.facebook.aura.shopping.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1D3;
import X.G0V;
import X.G0W;
import com.facebook.aura.shopping.model.ShoppingResultProduct;
import com.facebook.aura.shopping.model.ShoppingResultsPresentation;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchShoppingResultsCardKt$HatchShoppingResultsCard$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $backgroundColor;
    public final /* synthetic */ C1D3 $containerShape;
    public final /* synthetic */ String $messageId;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0W<Integer, ShoppingResultProduct, List<ShoppingResultProduct>, Unit> $onProductClick;
    public final /* synthetic */ String $presentationEventId;
    public final /* synthetic */ String $presentationId;
    public final /* synthetic */ ShoppingResultsPresentation $results;
    public final /* synthetic */ String $sessionId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchShoppingResultsCardKt$HatchShoppingResultsCard$2(ShoppingResultsPresentation shoppingResultsPresentation, G0W<? super Integer, ? super ShoppingResultProduct, ? super List<ShoppingResultProduct>, Unit> g0w, String str, String str2, BRg bRg, long j, C1D3 c1d3, String str3, String str4, int i, int i2) {
        super(2);
        this.$results = shoppingResultsPresentation;
        this.$onProductClick = g0w;
        this.$messageId = str;
        this.$presentationEventId = str2;
        this.$modifier = bRg;
        this.$backgroundColor = j;
        this.$containerShape = c1d3;
        this.$sessionId = str3;
        this.$presentationId = str4;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(BFM bfm, int i) {
        HatchShoppingResultsCardKt.m2039HatchShoppingResultsCardCcamzx0(this.$results, this.$onProductClick, this.$messageId, this.$presentationEventId, this.$modifier, this.$backgroundColor, this.$containerShape, this.$sessionId, this.$presentationId, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}

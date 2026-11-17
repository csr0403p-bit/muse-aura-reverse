package com.facebook.aura.shopping.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1D3;
import X.G0V;
import com.facebook.aura.shopping.model.ShoppingCartCardUiModel;
import com.facebook.aura.shopping.model.ShoppingCartPresentation;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class HatchShoppingCartCardKt$HatchShoppingCartCard$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $backgroundColor;
    public final /* synthetic */ ShoppingCartCardUiModel $card;
    public final /* synthetic */ ShoppingCartPresentation $cart;
    public final /* synthetic */ C1D3 $containerShape;
    public final /* synthetic */ String $hostMessageId;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ String $presentationId;
    public final /* synthetic */ String $sessionId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchShoppingCartCardKt$HatchShoppingCartCard$2(ShoppingCartPresentation shoppingCartPresentation, ShoppingCartCardUiModel shoppingCartCardUiModel, String str, String str2, String str3, long j, C1D3 c1d3, BRg bRg, int i, int i2) {
        super(2);
        this.$cart = shoppingCartPresentation;
        this.$card = shoppingCartCardUiModel;
        this.$presentationId = str;
        this.$hostMessageId = str2;
        this.$sessionId = str3;
        this.$backgroundColor = j;
        this.$containerShape = c1d3;
        this.$modifier = bRg;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(BFM bfm, int i) {
        HatchShoppingCartCardKt.m2034HatchShoppingCartCard1YH7lEI(this.$cart, this.$card, this.$presentationId, this.$hostMessageId, this.$sessionId, this.$backgroundColor, this.$containerShape, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}

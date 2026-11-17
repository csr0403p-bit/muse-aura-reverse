package com.facebook.aura.shopping.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1D3;
import X.G0V;
import com.facebook.aura.shopping.model.ShoppingCollection;
import com.facebook.aura.shopping.model.ShoppingResultsPresentation;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class HatchShoppingCollectionCardKt$HatchShoppingCollectionCard$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $backgroundColor;
    public final /* synthetic */ ShoppingCollection $collection;
    public final /* synthetic */ C1D3 $containerShape;
    public final /* synthetic */ String $messageId;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ String $presentationEventId;
    public final /* synthetic */ String $presentationId;
    public final /* synthetic */ ShoppingResultsPresentation $results;
    public final /* synthetic */ String $sessionId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchShoppingCollectionCardKt$HatchShoppingCollectionCard$3(ShoppingResultsPresentation shoppingResultsPresentation, ShoppingCollection shoppingCollection, String str, String str2, String str3, long j, C1D3 c1d3, String str4, BRg bRg, int i, int i2) {
        super(2);
        this.$results = shoppingResultsPresentation;
        this.$collection = shoppingCollection;
        this.$presentationId = str;
        this.$presentationEventId = str2;
        this.$messageId = str3;
        this.$backgroundColor = j;
        this.$containerShape = c1d3;
        this.$sessionId = str4;
        this.$modifier = bRg;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(BFM bfm, int i) {
        HatchShoppingCollectionCardKt.m2036HatchShoppingCollectionCardCcamzx0(this.$results, this.$collection, this.$presentationId, this.$presentationEventId, this.$messageId, this.$backgroundColor, this.$containerShape, this.$sessionId, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}

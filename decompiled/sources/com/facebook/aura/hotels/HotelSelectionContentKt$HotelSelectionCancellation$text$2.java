package com.facebook.aura.hotels;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HotelSelectionContentKt$HotelSelectionCancellation$text$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ HotelSelection $selection;
    public final /* synthetic */ HotelSelectionSheetKey $selectionKey;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelSelectionContentKt$HotelSelectionCancellation$text$2(HotelSelection hotelSelection, HotelSelectionSheetKey hotelSelectionSheetKey, BRg bRg, int i, int i2) {
        super(2);
        this.$selection = hotelSelection;
        this.$selectionKey = hotelSelectionSheetKey;
        this.$modifier = bRg;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(BFM bfm, int i) {
        HotelSelectionContentKt.HotelSelectionCancellation(this.$selection, this.$selectionKey, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}

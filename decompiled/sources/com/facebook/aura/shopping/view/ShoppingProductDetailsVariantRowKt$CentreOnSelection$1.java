package com.facebook.aura.shopping.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.C1110AYw;
import X.C1DG;
import X.G0V;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class ShoppingProductDetailsVariantRowKt$CentreOnSelection$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ List<C1DG> $cellWidths;
    public final /* synthetic */ float $leadingInset;
    public final /* synthetic */ Object $resetKey;
    public final /* synthetic */ float $rowWidth;
    public final /* synthetic */ C1110AYw $scrollState;
    public final /* synthetic */ Integer $selectedIndex;
    public final /* synthetic */ float $spacing;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingProductDetailsVariantRowKt$CentreOnSelection$1(C1110AYw c1110AYw, List<C1DG> list, float f, Integer num, float f2, float f3, Object obj, int i) {
        super(2);
        this.$scrollState = c1110AYw;
        this.$cellWidths = list;
        this.$spacing = f;
        this.$selectedIndex = num;
        this.$rowWidth = f2;
        this.$leadingInset = f3;
        this.$resetKey = obj;
        this.$$changed = i;
    }

    public final void invoke(BFM bfm, int i) {
        ShoppingProductDetailsVariantRowKt.m2076CentreOnSelectionCGg2A0w(this.$scrollState, this.$cellWidths, this.$spacing, this.$selectedIndex, this.$rowWidth, this.$leadingInset, this.$resetKey, bfm, AnonymousClass011.A00(this.$$changed));
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}

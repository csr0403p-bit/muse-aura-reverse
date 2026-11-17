package com.facebook.aura.ui;

import X.AbstractC7559F3s;
import X.C0981AMm;
import X.C7384Etj;
import X.G0U;

/* loaded from: classes2.dex */
public final class ReorderableColumnKt$ReorderableColumn$positionOf$slotHeight$1 extends AbstractC7559F3s implements G0U<Object, Integer> {
    public final /* synthetic */ C0981AMm<Object, Integer> $decorationHeights;
    public final /* synthetic */ C0981AMm<Object, Integer> $itemHeights;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.G0U
    public final Integer invoke(Object obj) {
        C7384Etj.A0Y(obj, 0);
        Integer num = this.$decorationHeights.get(obj);
        int iIntValue = num != null ? num.intValue() : 0;
        Integer num2 = this.$itemHeights.get(obj);
        return Integer.valueOf(iIntValue + (num2 != null ? num2.intValue() : 0));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReorderableColumnKt$ReorderableColumn$positionOf$slotHeight$1(C0981AMm<Object, Integer> c0981AMm, C0981AMm<Object, Integer> c0981AMm2) {
        super(1);
        this.$decorationHeights = c0981AMm;
        this.$itemHeights = c0981AMm2;
    }
}

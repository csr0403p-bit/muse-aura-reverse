package com.facebook.aura.ui;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.BL4;
import X.C0981AMm;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class ReorderableColumnKt$ReorderableColumn$8$1$1$1 extends AbstractC7559F3s implements G0U<BL4, Unit> {
    public final /* synthetic */ C0981AMm<Object, Integer> $decorationHeights;
    public final /* synthetic */ Object $itemKey;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReorderableColumnKt$ReorderableColumn$8$1$1$1(C0981AMm<Object, Integer> c0981AMm, Object obj) {
        super(1);
        this.$decorationHeights = c0981AMm;
        this.$itemKey = obj;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(BL4 bl4) {
        m2333invokeozmzZPI(bl4.A00);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-ozmzZPI, reason: not valid java name */
    public final void m2333invokeozmzZPI(long j) {
        this.$decorationHeights.put(this.$itemKey, Integer.valueOf(AnonymousClass002.A09(j)));
    }
}

package com.facebook.aura.ui;

import X.AbstractC7559F3s;
import X.C00r;
import X.C2LD;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ReorderableRowKt$ReorderableRow$6$2$1 extends AbstractC7559F3s implements G0U<C2LD, Unit> {
    public final /* synthetic */ C00r $itemWidths;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2LD c2ld) {
        C7384Etj.A0Y(c2ld, 0);
        this.$itemWidths.AdX(((int) (c2ld.A00 >> 32)) - ((int) (c2ld.A01 >> 32)));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReorderableRowKt$ReorderableRow$6$2$1(C00r c00r) {
        super(1);
        this.$itemWidths = c00r;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2LD c2ld) {
        invoke2(c2ld);
        return Unit.INSTANCE;
    }
}

package com.facebook.aura.ui;

import X.AbstractC7559F3s;
import X.C0981AMm;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class ReorderableColumnKt$ReorderableColumn$5$1$measuredHeight$1 extends AbstractC7559F3s implements Function0<Integer> {
    public final /* synthetic */ C0981AMm<Object, Integer> $itemHeights;
    public final /* synthetic */ Object $sourceKey;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReorderableColumnKt$ReorderableColumn$5$1$measuredHeight$1(C0981AMm<Object, Integer> c0981AMm, Object obj) {
        super(0);
        this.$itemHeights = c0981AMm;
        this.$sourceKey = obj;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return this.$itemHeights.get(this.$sourceKey);
    }
}

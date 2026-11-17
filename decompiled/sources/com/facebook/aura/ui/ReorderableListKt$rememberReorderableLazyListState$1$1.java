package com.facebook.aura.ui;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0V;

/* loaded from: classes2.dex */
public final class ReorderableListKt$rememberReorderableLazyListState$1$1 extends AbstractC7559F3s implements G0V<ItemPosition, Integer, Integer> {
    public static final ReorderableListKt$rememberReorderableLazyListState$1$1 INSTANCE = new ReorderableListKt$rememberReorderableLazyListState$1$1();

    public ReorderableListKt$rememberReorderableLazyListState$1$1() {
        super(2);
    }

    public final Integer invoke(ItemPosition itemPosition, int i) {
        return Integer.valueOf(i);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Integer invoke(ItemPosition itemPosition, Integer num) {
        return Integer.valueOf(AnonymousClass001.A0F(num));
    }
}

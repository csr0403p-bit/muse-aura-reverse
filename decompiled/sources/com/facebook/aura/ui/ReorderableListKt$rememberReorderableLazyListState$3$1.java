package com.facebook.aura.ui;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G2j;

/* loaded from: classes2.dex */
public final class ReorderableListKt$rememberReorderableLazyListState$3$1 extends AbstractC7559F3s implements G2j<ItemPosition, Integer, Integer, Boolean, Integer> {
    public static final ReorderableListKt$rememberReorderableLazyListState$3$1 INSTANCE = new ReorderableListKt$rememberReorderableLazyListState$3$1();

    public ReorderableListKt$rememberReorderableLazyListState$3$1() {
        super(4);
    }

    @Override // X.G2j
    public /* bridge */ /* synthetic */ Integer invoke(ItemPosition itemPosition, Integer num, Integer num2, Boolean bool) {
        int iA0F = AnonymousClass001.A0F(num);
        int iA0F2 = AnonymousClass001.A0F(num2);
        if (AnonymousClass001.A1X(bool)) {
            iA0F += iA0F2;
        }
        return Integer.valueOf(iA0F);
    }

    public final Integer invoke(ItemPosition itemPosition, int i, int i2, boolean z) {
        if (z) {
            i += i2;
        }
        return Integer.valueOf(i);
    }
}

package com.facebook.aura.shopping.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C05363bi;
import X.C0Yr;
import X.C78g;
import X.G0U;
import androidx.compose.foundation.lazy.grid.LazyGridState;

/* loaded from: classes4.dex */
public final class ProductItemsScreenKt$ProductItemsGrid$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ LazyGridState $gridState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductItemsScreenKt$ProductItemsGrid$1$1(LazyGridState lazyGridState) {
        super(1);
        this.$gridState = lazyGridState;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        if (this.$gridState.A09.A03.AGd() == 0 && this.$gridState.A09.A04.AGd() == 0) {
            LazyGridState lazyGridState = this.$gridState;
            if (lazyGridState.A06.AOz()) {
                AnonymousClass001.A1J(new C05363bi(lazyGridState, null, 0), lazyGridState.A0I.getValue().A0F);
            }
            lazyGridState.A03(0, 0, false);
        }
        return new C78g() { // from class: com.facebook.aura.shopping.view.ProductItemsScreenKt$ProductItemsGrid$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}

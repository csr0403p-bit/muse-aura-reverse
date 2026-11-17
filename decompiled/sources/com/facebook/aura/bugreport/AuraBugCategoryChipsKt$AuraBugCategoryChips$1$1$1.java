package com.facebook.aura.bugreport;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraBugCategoryChipsKt$AuraBugCategoryChips$1$1$1 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
    public final /* synthetic */ AuraBugCategory $category;
    public final /* synthetic */ G0U<String, Unit> $onSelectionChange;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraBugCategoryChipsKt$AuraBugCategoryChips$1$1$1(G0U<? super String, Unit> g0u, AuraBugCategory auraBugCategory) {
        super(1);
        this.$onSelectionChange = g0u;
        this.$category = auraBugCategory;
    }

    public final void invoke(boolean z) {
        this.$onSelectionChange.invoke(z ? null : this.$category.id);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }
}

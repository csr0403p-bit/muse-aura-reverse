package com.facebook.aura.explore.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ExploreIdeaCardDetailSheetKt$IdeaIncludedToggleRow$1$1 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
    public final /* synthetic */ G0U<Boolean, Unit> $onToggle;
    public final /* synthetic */ boolean $selected;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ExploreIdeaCardDetailSheetKt$IdeaIncludedToggleRow$1$1(G0U<? super Boolean, Unit> g0u, boolean z) {
        super(1);
        this.$onToggle = g0u;
        this.$selected = z;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        AnonymousClass001.A1K(!this.$selected, this.$onToggle);
    }
}

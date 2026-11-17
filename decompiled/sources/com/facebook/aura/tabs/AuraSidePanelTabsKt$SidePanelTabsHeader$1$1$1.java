package com.facebook.aura.tabs;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraSidePanelTabsKt$SidePanelTabsHeader$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AuraSidePanelCollapseState $collapseState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSidePanelTabsKt$SidePanelTabsHeader$1$1$1(AuraSidePanelCollapseState auraSidePanelCollapseState) {
        super(0);
        this.$collapseState = auraSidePanelCollapseState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$collapseState.setTabsCollapsed(!MutableState.A0A(r1.tabsCollapsed$delegate));
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

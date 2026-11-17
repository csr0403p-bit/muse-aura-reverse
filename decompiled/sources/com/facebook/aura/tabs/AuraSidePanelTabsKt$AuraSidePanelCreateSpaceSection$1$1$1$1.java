package com.facebook.aura.tabs;

import X.AbstractC7559F3s;
import com.facebook.aura.spaces.menu.SpacesSidebarAnalytics;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraSidePanelTabsKt$AuraSidePanelCreateSpaceSection$1$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Function0<Unit> $onCreateSpaceSelected;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSidePanelTabsKt$AuraSidePanelCreateSpaceSection$1$1$1$1(Function0<Unit> function0) {
        super(0);
        this.$onCreateSpaceSelected = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        SpacesSidebarAnalytics.INSTANCE.logCreateSpaceClick();
        this.$onCreateSpaceSelected.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

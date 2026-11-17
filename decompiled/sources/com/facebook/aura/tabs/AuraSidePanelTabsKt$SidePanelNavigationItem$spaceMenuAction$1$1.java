package com.facebook.aura.tabs;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraSidePanelTabsKt$SidePanelNavigationItem$spaceMenuAction$1$1 extends AbstractC7559F3s implements Function0<Boolean> {
    public final /* synthetic */ MutableState<Boolean> $isSpaceMenuExpanded$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSidePanelTabsKt$SidePanelNavigationItem$spaceMenuAction$1$1(MutableState<Boolean> mutableState) {
        super(0);
        this.$isSpaceMenuExpanded$delegate = mutableState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        MutableState.A09(true, this.$isSpaceMenuExpanded$delegate);
        return true;
    }
}

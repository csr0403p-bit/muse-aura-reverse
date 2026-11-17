package com.facebook.aura.tabs;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.tabs.AuraTabItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraSidePanelTabsKt$AuraSidePanelTabs$13$3$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ String $label;
    public final /* synthetic */ MutableState<AuraTabItem.Space> $renameTarget$delegate;
    public final /* synthetic */ MutableState<String> $renameText$delegate;
    public final /* synthetic */ AuraTabItem.Space $space;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSidePanelTabsKt$AuraSidePanelTabs$13$3$1$1(String str, AuraTabItem.Space space, MutableState<String> mutableState, MutableState<AuraTabItem.Space> mutableState2) {
        super(0);
        this.$label = str;
        this.$space = space;
        this.$renameText$delegate = mutableState;
        this.$renameTarget$delegate = mutableState2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$renameText$delegate.Af8(this.$label);
        this.$renameTarget$delegate.Af8(this.$space);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

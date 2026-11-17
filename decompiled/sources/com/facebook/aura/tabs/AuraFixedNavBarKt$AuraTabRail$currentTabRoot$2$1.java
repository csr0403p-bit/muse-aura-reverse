package com.facebook.aura.tabs;

import X.AbstractC7559F3s;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.AuraTabRootNavKey;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraFixedNavBarKt$AuraTabRail$currentTabRoot$2$1 extends AbstractC7559F3s implements Function0<AuraTabRootNavKey> {
    public final /* synthetic */ AuraNavigator $navigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraFixedNavBarKt$AuraTabRail$currentTabRoot$2$1(AuraNavigator auraNavigator) {
        super(0);
        this.$navigator = auraNavigator;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final AuraTabRootNavKey invoke() {
        return this.$navigator.currentTabRoot();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ AuraTabRootNavKey invoke() {
        return this.$navigator.currentTabRoot();
    }
}

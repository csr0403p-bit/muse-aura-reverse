package com.facebook.aura.header.view;

import X.AbstractC7559F3s;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchRootSidePanelButtonKt$HatchRootSidePanelButton$topKey$2$1 extends AbstractC7559F3s implements Function0<AuraNavKey> {
    public final /* synthetic */ AuraNavigator $navigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchRootSidePanelButtonKt$HatchRootSidePanelButton$topKey$2$1(AuraNavigator auraNavigator) {
        super(0);
        this.$navigator = auraNavigator;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final AuraNavKey invoke() {
        return this.$navigator.currentKey(false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ AuraNavKey invoke() {
        return this.$navigator.currentKey(false);
    }
}

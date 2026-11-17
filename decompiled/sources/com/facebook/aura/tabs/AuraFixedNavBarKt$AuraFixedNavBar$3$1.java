package com.facebook.aura.tabs;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.facebook.aura.navigation.AuraTabRootNavKey;

/* loaded from: classes.dex */
public final class AuraFixedNavBarKt$AuraFixedNavBar$3$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ AuraTabRootNavKey $currentTabRoot;
    public final /* synthetic */ TabBadgeViewModel $tabBadgeViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraFixedNavBarKt$AuraFixedNavBar$3$1(TabBadgeViewModel tabBadgeViewModel, AuraTabRootNavKey auraTabRootNavKey) {
        super(1);
        this.$tabBadgeViewModel = tabBadgeViewModel;
        this.$currentTabRoot = auraTabRootNavKey;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        this.$tabBadgeViewModel.onCurrentTabRootChanged(this.$currentTabRoot);
        return new C78g() { // from class: com.facebook.aura.tabs.AuraFixedNavBarKt$AuraFixedNavBar$3$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}

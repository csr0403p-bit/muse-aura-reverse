package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C7384Etj;
import X.C78g;
import X.G0U;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.AuraTabRootNavKey;

/* loaded from: classes3.dex */
public final class PairsAnalyticsKt$rememberConnectionsTabLogContext$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ AuraNavKey $tabKey;
    public final /* synthetic */ ConnectionsViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PairsAnalyticsKt$rememberConnectionsTabLogContext$1$1(AuraNavigator auraNavigator, AuraNavKey auraNavKey, ConnectionsViewModel connectionsViewModel) {
        super(1);
        this.$navigator = auraNavigator;
        this.$tabKey = auraNavKey;
        this.$viewModel = connectionsViewModel;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        final AuraTabRootNavKey auraTabRootNavKeyCurrentTabRoot = this.$navigator.currentTabRoot();
        final AuraNavigator auraNavigator = this.$navigator;
        final AuraNavKey auraNavKey = this.$tabKey;
        final ConnectionsViewModel connectionsViewModel = this.$viewModel;
        return new C78g() { // from class: com.facebook.aura.pairs.PairsAnalyticsKt$rememberConnectionsTabLogContext$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                if (auraNavigator.isInBackStack(auraNavKey) && C7384Etj.areEqual(auraNavigator.currentTabRoot(), auraTabRootNavKeyCurrentTabRoot)) {
                    return;
                }
                connectionsViewModel.onScreenLeft(auraNavKey);
            }
        };
    }
}

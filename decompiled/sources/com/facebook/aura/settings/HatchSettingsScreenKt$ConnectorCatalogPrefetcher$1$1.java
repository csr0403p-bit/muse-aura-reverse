package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.facebook.aura.skills.viewmodel.HatchConnectorPrefetchViewModel;

/* loaded from: classes.dex */
public final class HatchSettingsScreenKt$ConnectorCatalogPrefetcher$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ HatchConnectorPrefetchViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSettingsScreenKt$ConnectorCatalogPrefetcher$1$1(HatchConnectorPrefetchViewModel hatchConnectorPrefetchViewModel) {
        super(1);
        this.$viewModel = hatchConnectorPrefetchViewModel;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        this.$viewModel.onScreenEntered();
        return new C78g() { // from class: com.facebook.aura.settings.HatchSettingsScreenKt$ConnectorCatalogPrefetcher$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}

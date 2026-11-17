package com.facebook.aura.pairs;

import X.C78g;

/* loaded from: classes3.dex */
public final class ConnectionsAddScreenKt$ConnectionsAddScreen$1$1$invoke$$inlined$onDispose$1 implements C78g {
    public final /* synthetic */ ConnectionsViewModel $viewModel$inlined;

    public ConnectionsAddScreenKt$ConnectionsAddScreen$1$1$invoke$$inlined$onDispose$1(ConnectionsViewModel connectionsViewModel) {
        this.$viewModel$inlined = connectionsViewModel;
    }

    @Override // X.C78g
    public void dispose() {
        this.$viewModel$inlined.onAddQueryChange("");
    }
}

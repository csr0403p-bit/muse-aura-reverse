package com.facebook.aura.skills.view;

import X.AnonymousClass003;
import X.G0U;
import com.facebook.aura.skills.viewmodel.ConnectorCatalogRowUiState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ConnectorCatalogActions {
    public static final int $stable = 0;
    public final G0U<ConnectorCatalogRowUiState, Unit> onRowClick;
    public final Function0<Unit> refreshLocal;

    public final G0U<ConnectorCatalogRowUiState, Unit> getOnRowClick() {
        return this.onRowClick;
    }

    public final Function0<Unit> getRefreshLocal() {
        return this.refreshLocal;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConnectorCatalogActions(G0U<? super ConnectorCatalogRowUiState, Unit> g0u, Function0<Unit> function0) {
        AnonymousClass003.A0u(g0u, function0);
        this.onRowClick = g0u;
        this.refreshLocal = function0;
    }
}

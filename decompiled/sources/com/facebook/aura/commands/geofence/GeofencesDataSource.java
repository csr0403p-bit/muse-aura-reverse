package com.facebook.aura.commands.geofence;

import X.C60O;
import X.HtJ;
import com.facebook.aura.nodes.datasource.DataSource;
import com.facebook.aura.nodes.datasource.DataSourceContext;
import com.facebook.aura.nodes.datasource.DataSourceResult;
import com.facebook.aura.nodes.datasource.ProactiveDelivery;
import com.facebook.aura.nodes.datasource.ProactiveTrigger;
import com.facebook.aura.nodes.registry.HatchDataSourceRegistration;
import java.util.List;

/* loaded from: classes3.dex */
public final class GeofencesDataSource implements DataSource, HatchDataSourceRegistration {
    public static final String description = "Hatch-registered geofences (id, label, lat/long, radius, trigger type).";
    public static final boolean emitsProactively = false;
    public static final String sourceId = "geofences";
    public static final boolean supportsBackfill = false;
    public static final GeofencesDataSource INSTANCE = new GeofencesDataSource();
    public static final List<String> permissionRequired = C60O.A16("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_BACKGROUND_LOCATION");

    @Override // com.facebook.aura.nodes.registry.HatchDataSourceRegistration
    public DataSource getDataSource() {
        return this;
    }

    @Override // com.facebook.aura.nodes.datasource.DataSource
    public String getDescription() {
        return description;
    }

    @Override // com.facebook.aura.nodes.datasource.DataSource
    public boolean getEmitsProactively() {
        return emitsProactively;
    }

    @Override // com.facebook.aura.nodes.datasource.DataSource
    public List<String> getPermissionRequired() {
        return permissionRequired;
    }

    @Override // com.facebook.aura.nodes.datasource.DataSource
    public /* bridge */ ProactiveDelivery getProactiveDelivery() {
        return ProactiveDelivery.DURABLE;
    }

    @Override // com.facebook.aura.nodes.datasource.DataSource
    public /* bridge */ ProactiveTrigger getProactiveTrigger() {
        return ProactiveTrigger.None.INSTANCE;
    }

    @Override // com.facebook.aura.nodes.datasource.DataSource
    public String getSourceId() {
        return sourceId;
    }

    @Override // com.facebook.aura.nodes.datasource.DataSource
    public boolean getSupportsBackfill() {
        return supportsBackfill;
    }

    @Override // com.facebook.aura.nodes.datasource.DataSource
    public /* bridge */ boolean isEnabled() {
        return true;
    }

    @Override // com.facebook.aura.nodes.datasource.DataSource
    public /* bridge */ Object backfill(String str, String str2, DataSourceContext dataSourceContext, HtJ<? super DataSourceResult> htJ) {
        return DataSource.CC.backfill$suspendImpl(this, str, str2, dataSourceContext, htJ);
    }

    @Override // com.facebook.aura.nodes.datasource.DataSource
    public /* bridge */ Object proactiveSync(DataSourceContext dataSourceContext, HtJ<? super DataSourceResult> htJ) {
        return DataSourceResult.Ok.INSTANCE;
    }
}

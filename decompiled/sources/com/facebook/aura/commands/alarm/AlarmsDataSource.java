package com.facebook.aura.commands.alarm;

import X.C0881AGi;
import X.HtJ;
import com.facebook.aura.nodes.datasource.DataSource;
import com.facebook.aura.nodes.datasource.DataSourceContext;
import com.facebook.aura.nodes.datasource.DataSourceResult;
import com.facebook.aura.nodes.datasource.ProactiveDelivery;
import com.facebook.aura.nodes.datasource.ProactiveTrigger;
import com.facebook.aura.nodes.registry.HatchDataSourceRegistration;
import java.util.List;

/* loaded from: classes3.dex */
public final class AlarmsDataSource implements DataSource, HatchDataSourceRegistration {
    public static final String description = "Hatch-created alarms mirrored from the system Clock app (id, label, time, recurrence). Read them with `alarm.list`. On a recurring alarm, use `days_weekdays` (a list of full weekday names) to say which days it runs. `days` is a raw CSV of Java Calendar constants where 1=Sunday through 7=Saturday \u2014 NOT the ISO numbering where 1=Monday \u2014 so never interpret it yourself or the alarm will be reported one day late.";
    public static final boolean emitsProactively = false;
    public static final String sourceId = "alarms";
    public static final boolean supportsBackfill = false;
    public static final AlarmsDataSource INSTANCE = new AlarmsDataSource();
    public static final List<String> permissionRequired = C0881AGi.A00;
    public static final ProactiveTrigger proactiveTrigger = ProactiveTrigger.None.INSTANCE;

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
    public ProactiveTrigger getProactiveTrigger() {
        return proactiveTrigger;
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

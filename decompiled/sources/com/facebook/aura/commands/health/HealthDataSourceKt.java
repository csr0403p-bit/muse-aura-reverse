package com.facebook.aura.commands.health;

import X.AnonymousClass001;
import X.C31u;
import X.C7462Ewq;
import X.InterfaceC7359EnW;
import com.facebook.aura.commands.health.MC;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;

/* loaded from: classes3.dex */
public abstract class HealthDataSourceKt {
    public static final long BACKFILL_CHUNK_DAYS = 30;
    public static final long DEFAULT_INTERVAL_SECONDS = 1800;
    public static final String TAG = "HealthDataSource";
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = {new C7462Ewq(HealthDataSourceKt.class, "isHealthEnabled", "isHealthEnabled()Z", 1), new C7462Ewq(HealthDataSourceKt.class, "isHealthSyncIncludeSamplesKillswitch", "isHealthSyncIncludeSamplesKillswitch()Z", 1)};
    public static final C31u isHealthEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android.health_connect_connector_enabled);
    public static final C31u isHealthSyncIncludeSamplesKillswitch$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.wearables_hatch_health_connectors.health_connect_samples_in_backfill_killswitch);

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        if (r1.equals("permission_denied") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if (r1.equals("provider_unavailable") != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        return com.facebook.aura.health.HealthSyncErrorCategory.AUTH;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.health.HealthSyncErrorCategory errorCategory(com.facebook.aura.nodes.datasource.DataSourceResult.Error r1) {
        /*
            java.lang.String r1 = r1.code
            int r0 = r1.hashCode()
            switch(r0) {
                case -2097845079: goto Lc;
                case -1502667597: goto L13;
                case -1203270128: goto L16;
                case -356190867: goto L1d;
                case -85992702: goto L29;
                case 330128395: goto L20;
                case 1065760316: goto L34;
                case 1205307284: goto L3f;
                default: goto L9;
            }
        L9:
            com.facebook.aura.health.HealthSyncErrorCategory r0 = com.facebook.aura.health.HealthSyncErrorCategory.UNKNOWN
            return r0
        Lc:
            r0 = 36
            java.lang.String r0 = X.AbstractC7606F5t.A00(r0)
            goto L41
        L13:
            java.lang.String r0 = "ack_failed"
            goto L41
        L16:
            r0 = 38
            java.lang.String r0 = X.AbstractC7606F5t.A00(r0)
            goto L41
        L1d:
            java.lang.String r0 = "publish_failed"
            goto L41
        L20:
            java.lang.String r0 = "permission_denied"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L31
            goto L9
        L29:
            java.lang.String r0 = "provider_unavailable"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L9
        L31:
            com.facebook.aura.health.HealthSyncErrorCategory r0 = com.facebook.aura.health.HealthSyncErrorCategory.AUTH
            return r0
        L34:
            java.lang.String r0 = "backfill_cancelled"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L9
            com.facebook.aura.health.HealthSyncErrorCategory r0 = com.facebook.aura.health.HealthSyncErrorCategory.CANCELLED
            return r0
        L3f:
            java.lang.String r0 = "query_failed"
        L41:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L9
            com.facebook.aura.health.HealthSyncErrorCategory r0 = com.facebook.aura.health.HealthSyncErrorCategory.API
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.health.HealthDataSourceKt.errorCategory(com.facebook.aura.nodes.datasource.DataSourceResult$Error):com.facebook.aura.health.HealthSyncErrorCategory");
    }

    public static final boolean isHealthEnabled() {
        return AnonymousClass001.A1X(C31u.A00(isHealthEnabled$delegate, $$delegatedProperties));
    }

    public static final boolean isHealthSyncIncludeSamplesKillswitch() {
        return AnonymousClass001.A1X(isHealthSyncIncludeSamplesKillswitch$delegate.getValue(null, $$delegatedProperties[1]));
    }

    public static final /* synthetic */ boolean access$isHealthSyncIncludeSamplesEnabled() {
        return !isHealthSyncIncludeSamplesKillswitch();
    }

    public static final boolean isHealthSyncIncludeSamplesEnabled() {
        return !isHealthSyncIncludeSamplesKillswitch();
    }
}

package com.facebook.aura.nodes.datasource;

import X.C0881AGi;
import X.FGI;
import X.HtJ;
import com.facebook.aura.nodes.datasource.DataSourceResult;
import com.facebook.aura.nodes.datasource.ProactiveTrigger;
import java.util.List;

/* loaded from: classes3.dex */
public interface DataSource {

    /* renamed from: com.facebook.aura.nodes.datasource.DataSource$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        public static String $default$getDescription(DataSource dataSource) {
            return null;
        }

        public static boolean $default$isEnabled(DataSource dataSource) {
            return true;
        }

        public static /* synthetic */ String access$getDescription$jd(DataSource dataSource) {
            return null;
        }

        public static /* synthetic */ boolean access$isEnabled$jd(DataSource dataSource) {
            return true;
        }

        public static /* synthetic */ Object backfill$suspendImpl(DataSource dataSource, String str, String str2, DataSourceContext dataSourceContext, HtJ<? super DataSourceResult> htJ) {
            return new DataSourceResult.Error("backfill_not_supported", FGI.A0U("Source ", dataSource.getSourceId(), " does not support backfill"));
        }
    }

    public abstract class DefaultImpls {
        @Deprecated
        public static String getDescription(DataSource dataSource) {
            return null;
        }

        @Deprecated
        public static List<String> getPermissionRequired(DataSource dataSource) {
            return C0881AGi.A00;
        }

        @Deprecated
        public static ProactiveDelivery getProactiveDelivery(DataSource dataSource) {
            return ProactiveDelivery.DURABLE;
        }

        @Deprecated
        public static ProactiveTrigger getProactiveTrigger(DataSource dataSource) {
            return ProactiveTrigger.None.INSTANCE;
        }

        @Deprecated
        public static boolean isEnabled(DataSource dataSource) {
            return true;
        }

        @Deprecated
        public static Object backfill(DataSource dataSource, String str, String str2, DataSourceContext dataSourceContext, HtJ<? super DataSourceResult> htJ) {
            return CC.backfill$suspendImpl(dataSource, str, str2, dataSourceContext, htJ);
        }

        @Deprecated
        public static Object proactiveSync(DataSource dataSource, DataSourceContext dataSourceContext, HtJ<? super DataSourceResult> htJ) {
            return DataSourceResult.Ok.INSTANCE;
        }
    }

    Object backfill(String str, String str2, DataSourceContext dataSourceContext, HtJ<? super DataSourceResult> htJ);

    String getDescription();

    boolean getEmitsProactively();

    List<String> getPermissionRequired();

    ProactiveDelivery getProactiveDelivery();

    ProactiveTrigger getProactiveTrigger();

    String getSourceId();

    boolean getSupportsBackfill();

    boolean isEnabled();

    Object proactiveSync(DataSourceContext dataSourceContext, HtJ<? super DataSourceResult> htJ);
}

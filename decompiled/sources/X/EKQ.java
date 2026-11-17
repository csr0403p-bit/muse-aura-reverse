package X;

import androidx.work.impl.WorkDatabase_Impl;
import com.facebook.acra.constants.ErrorReportingConstants;
import com.facebook.aura.analytics.waterfall.HatchPriceImpressionEventDataKt;
import java.util.AbstractCollection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* loaded from: classes5.dex */
public final class EKQ extends EIT {
    public final /* synthetic */ WorkDatabase_Impl A00;

    @Override // X.EIT
    public final void createAllTables(EJV ejv) {
        C7384Etj.A0Y(ejv, 0);
        EIW.A00(ejv, "CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        EIW.A00(ejv, "CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        EIW.A00(ejv, "CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        EIW.A00(ejv, "CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `backoff_on_system_interruptions` INTEGER, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
        EIW.A00(ejv, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        EIW.A00(ejv, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
        EIW.A00(ejv, "CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        EIW.A00(ejv, "CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        EIW.A00(ejv, "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        EIW.A00(ejv, "CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        EIW.A00(ejv, "CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        EIW.A00(ejv, "CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        EIW.A00(ejv, "CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        EIW.A00(ejv, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        EIW.A00(ejv, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '08b926448d86528e697981ddd30459f7')");
    }

    @Override // X.EIT
    public final void dropAllTables(EJV ejv) {
        C7384Etj.A0Y(ejv, 0);
        EIW.A00(ejv, "DROP TABLE IF EXISTS `Dependency`");
        EIW.A00(ejv, "DROP TABLE IF EXISTS `WorkSpec`");
        EIW.A00(ejv, "DROP TABLE IF EXISTS `WorkTag`");
        EIW.A00(ejv, "DROP TABLE IF EXISTS `SystemIdInfo`");
        EIW.A00(ejv, "DROP TABLE IF EXISTS `WorkName`");
        EIW.A00(ejv, "DROP TABLE IF EXISTS `WorkProgress`");
        EIW.A00(ejv, "DROP TABLE IF EXISTS `Preference`");
    }

    @Override // X.EIT
    public final void onOpen(EJV ejv) {
        C7384Etj.A0Y(ejv, 0);
        EIW.A00(ejv, "PRAGMA foreign_keys = ON");
        this.A00.internalInitInvalidationTracker(ejv);
    }

    @Override // X.EIT
    public final void onPreMigrate(EJV ejv) {
        C7384Etj.A0Y(ejv, 0);
        AbstractC6591EIj.A00(ejv);
    }

    @Override // X.EIT
    public final C6587EIf onValidateSchema(EJV ejv) {
        String str;
        String str2;
        StringBuilder sbA0f;
        C7384Etj.A0Y(ejv, 0);
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        EIT.A01("work_spec_id", "TEXT", linkedHashMapA0j);
        linkedHashMapA0j.put("prerequisite_id", EIT.A00("prerequisite_id", "TEXT", null, 2));
        LinkedHashSet linkedHashSetA0k = C3cG.A0k();
        linkedHashSetA0k.add(new C6596EIx(Collections.singletonList("work_spec_id"), "WorkSpec", Collections.singletonList("id"), "CASCADE", "CASCADE"));
        LinkedHashSet linkedHashSetA03 = A03("prerequisite_id", linkedHashSetA0k);
        EIT.A02("index_Dependency_work_spec_id", linkedHashSetA03, Collections.singletonList("work_spec_id"), Collections.singletonList("ASC"));
        EIT.A02("index_Dependency_prerequisite_id", linkedHashSetA03, Collections.singletonList("prerequisite_id"), Collections.singletonList("ASC"));
        C6594EIt c6594EIt = new C6594EIt("Dependency", linkedHashMapA0j, linkedHashSetA0k, linkedHashSetA03);
        C6594EIt c6594EItA00 = EIy.A00(ejv, "Dependency");
        if (c6594EIt.equals(c6594EItA00)) {
            LinkedHashMap linkedHashMapA0j2 = C3cG.A0j();
            EIT.A01("id", "TEXT", linkedHashMapA0j2);
            linkedHashMapA0j2.put("state", EIT.A00("state", "INTEGER", null, 0));
            linkedHashMapA0j2.put("worker_class_name", EIT.A00("worker_class_name", "TEXT", null, 0));
            linkedHashMapA0j2.put("input_merger_class_name", EIT.A00("input_merger_class_name", "TEXT", null, 0));
            linkedHashMapA0j2.put("input", EIT.A00("input", "BLOB", null, 0));
            linkedHashMapA0j2.put("output", EIT.A00("output", "BLOB", null, 0));
            linkedHashMapA0j2.put("initial_delay", EIT.A00("initial_delay", "INTEGER", null, 0));
            linkedHashMapA0j2.put("interval_duration", EIT.A00("interval_duration", "INTEGER", null, 0));
            linkedHashMapA0j2.put("flex_duration", EIT.A00("flex_duration", "INTEGER", null, 0));
            linkedHashMapA0j2.put("run_attempt_count", EIT.A00("run_attempt_count", "INTEGER", null, 0));
            linkedHashMapA0j2.put("backoff_policy", EIT.A00("backoff_policy", "INTEGER", null, 0));
            linkedHashMapA0j2.put("backoff_delay_duration", EIT.A00("backoff_delay_duration", "INTEGER", null, 0));
            linkedHashMapA0j2.put("last_enqueue_time", EIT.A00("last_enqueue_time", "INTEGER", ErrorReportingConstants.ANR_DEFAULT_RECOVERY_DELAY_VAL, 0));
            linkedHashMapA0j2.put("minimum_retention_duration", EIT.A00("minimum_retention_duration", "INTEGER", null, 0));
            linkedHashMapA0j2.put("schedule_requested_at", EIT.A00("schedule_requested_at", "INTEGER", null, 0));
            linkedHashMapA0j2.put("run_in_foreground", EIT.A00("run_in_foreground", "INTEGER", null, 0));
            linkedHashMapA0j2.put("out_of_quota_policy", EIT.A00("out_of_quota_policy", "INTEGER", null, 0));
            linkedHashMapA0j2.put("period_count", EIT.A00("period_count", "INTEGER", HatchPriceImpressionEventDataKt.NO_DISCOUNT, 0));
            linkedHashMapA0j2.put("generation", EIT.A00("generation", "INTEGER", HatchPriceImpressionEventDataKt.NO_DISCOUNT, 0));
            linkedHashMapA0j2.put("next_schedule_time_override", EIT.A00("next_schedule_time_override", "INTEGER", "9223372036854775807", 0));
            linkedHashMapA0j2.put("next_schedule_time_override_generation", EIT.A00("next_schedule_time_override_generation", "INTEGER", HatchPriceImpressionEventDataKt.NO_DISCOUNT, 0));
            linkedHashMapA0j2.put("stop_reason", EIT.A00("stop_reason", "INTEGER", "-256", 0));
            linkedHashMapA0j2.put("trace_tag", new EIs("trace_tag", "TEXT", null, 0, 1, false));
            linkedHashMapA0j2.put("backoff_on_system_interruptions", new EIs("backoff_on_system_interruptions", "INTEGER", null, 0, 1, false));
            linkedHashMapA0j2.put("required_network_type", EIT.A00("required_network_type", "INTEGER", null, 0));
            linkedHashMapA0j2.put("required_network_request", EIT.A00("required_network_request", "BLOB", "x''", 0));
            linkedHashMapA0j2.put("requires_charging", EIT.A00("requires_charging", "INTEGER", null, 0));
            linkedHashMapA0j2.put("requires_device_idle", EIT.A00("requires_device_idle", "INTEGER", null, 0));
            linkedHashMapA0j2.put("requires_battery_not_low", EIT.A00("requires_battery_not_low", "INTEGER", null, 0));
            linkedHashMapA0j2.put("requires_storage_not_low", EIT.A00("requires_storage_not_low", "INTEGER", null, 0));
            linkedHashMapA0j2.put("trigger_content_update_delay", EIT.A00("trigger_content_update_delay", "INTEGER", null, 0));
            linkedHashMapA0j2.put("trigger_max_content_delay", EIT.A00("trigger_max_content_delay", "INTEGER", null, 0));
            linkedHashMapA0j2.put("content_uri_triggers", EIT.A00("content_uri_triggers", "BLOB", null, 0));
            LinkedHashSet linkedHashSetA0k2 = C3cG.A0k();
            LinkedHashSet linkedHashSetA0k3 = C3cG.A0k();
            EIT.A02("index_WorkSpec_schedule_requested_at", linkedHashSetA0k3, Collections.singletonList("schedule_requested_at"), Collections.singletonList("ASC"));
            EIT.A02("index_WorkSpec_last_enqueue_time", linkedHashSetA0k3, Collections.singletonList("last_enqueue_time"), Collections.singletonList("ASC"));
            c6594EIt = new C6594EIt("WorkSpec", linkedHashMapA0j2, linkedHashSetA0k2, linkedHashSetA0k3);
            c6594EItA00 = EIy.A00(ejv, "WorkSpec");
            if (c6594EIt.equals(c6594EItA00)) {
                LinkedHashMap linkedHashMapA0j3 = C3cG.A0j();
                EIT.A01("tag", "TEXT", linkedHashMapA0j3);
                linkedHashMapA0j3.put("work_spec_id", EIT.A00("work_spec_id", "TEXT", null, 2));
                LinkedHashSet linkedHashSetA0k4 = C3cG.A0k();
                LinkedHashSet linkedHashSetA032 = A03("work_spec_id", linkedHashSetA0k4);
                EIT.A02("index_WorkTag_work_spec_id", linkedHashSetA032, Collections.singletonList("work_spec_id"), Collections.singletonList("ASC"));
                C6594EIt c6594EIt2 = new C6594EIt("WorkTag", linkedHashMapA0j3, linkedHashSetA0k4, linkedHashSetA032);
                C6594EIt c6594EItA002 = EIy.A00(ejv, "WorkTag");
                if (c6594EIt2.equals(c6594EItA002)) {
                    LinkedHashMap linkedHashMapA0j4 = C3cG.A0j();
                    EIT.A01("work_spec_id", "TEXT", linkedHashMapA0j4);
                    linkedHashMapA0j4.put("generation", EIT.A00("generation", "INTEGER", HatchPriceImpressionEventDataKt.NO_DISCOUNT, 2));
                    linkedHashMapA0j4.put("system_id", EIT.A00("system_id", "INTEGER", null, 0));
                    LinkedHashSet linkedHashSetA0k5 = C3cG.A0k();
                    c6594EIt2 = new C6594EIt("SystemIdInfo", linkedHashMapA0j4, linkedHashSetA0k5, A03("work_spec_id", linkedHashSetA0k5));
                    c6594EItA002 = EIy.A00(ejv, "SystemIdInfo");
                    if (c6594EIt2.equals(c6594EItA002)) {
                        LinkedHashMap linkedHashMapA0j5 = C3cG.A0j();
                        EIT.A01("name", "TEXT", linkedHashMapA0j5);
                        linkedHashMapA0j5.put("work_spec_id", EIT.A00("work_spec_id", "TEXT", null, 2));
                        LinkedHashSet linkedHashSetA0k6 = C3cG.A0k();
                        LinkedHashSet linkedHashSetA033 = A03("work_spec_id", linkedHashSetA0k6);
                        EIT.A02("index_WorkName_work_spec_id", linkedHashSetA033, Collections.singletonList("work_spec_id"), Collections.singletonList("ASC"));
                        c6594EIt2 = new C6594EIt("WorkName", linkedHashMapA0j5, linkedHashSetA0k6, linkedHashSetA033);
                        c6594EItA002 = EIy.A00(ejv, "WorkName");
                        if (c6594EIt2.equals(c6594EItA002)) {
                            LinkedHashMap linkedHashMapA0j6 = C3cG.A0j();
                            EIT.A01("work_spec_id", "TEXT", linkedHashMapA0j6);
                            linkedHashMapA0j6.put("progress", EIT.A00("progress", "BLOB", null, 0));
                            LinkedHashSet linkedHashSetA0k7 = C3cG.A0k();
                            c6594EIt2 = new C6594EIt("WorkProgress", linkedHashMapA0j6, linkedHashSetA0k7, A03("work_spec_id", linkedHashSetA0k7));
                            c6594EItA002 = EIy.A00(ejv, "WorkProgress");
                            if (c6594EIt2.equals(c6594EItA002)) {
                                LinkedHashMap linkedHashMapA0j7 = C3cG.A0j();
                                EIT.A01("key", "TEXT", linkedHashMapA0j7);
                                linkedHashMapA0j7.put("long_value", new EIs("long_value", "INTEGER", null, 0, 1, false));
                                c6594EIt = new C6594EIt("Preference", linkedHashMapA0j7, C3cG.A0k(), C3cG.A0k());
                                c6594EItA00 = EIy.A00(ejv, "Preference");
                                if (c6594EIt.equals(c6594EItA00)) {
                                    return new C6587EIf(true, null);
                                }
                                str = "Preference(androidx.work.impl.model.Preference).\n Expected:\n";
                            } else {
                                str2 = "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n";
                            }
                        } else {
                            str2 = "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n";
                        }
                    } else {
                        str2 = "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n";
                    }
                } else {
                    str2 = "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n";
                }
                sbA0f = C3cG.A0f(c6594EIt2, str2);
                sbA0f.append("\n Found:\n");
                sbA0f.append(c6594EItA002);
                return new C6587EIf(false, sbA0f.toString());
            }
            str = "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n";
        } else {
            str = "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n";
        }
        sbA0f = C3cG.A0f(c6594EIt, str);
        sbA0f.append("\n Found:\n");
        sbA0f.append(c6594EItA00);
        return new C6587EIf(false, sbA0f.toString());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EKQ(WorkDatabase_Impl workDatabase_Impl) {
        super(24, "08b926448d86528e697981ddd30459f7", "149fd8ad55885d3fe3549a37a0163243");
        this.A00 = workDatabase_Impl;
    }

    public static LinkedHashSet A03(Object obj, AbstractCollection abstractCollection) {
        abstractCollection.add(new C6596EIx(Collections.singletonList(obj), "WorkSpec", Collections.singletonList("id"), "CASCADE", "CASCADE"));
        return new LinkedHashSet();
    }

    @Override // X.EIT
    public final void onCreate(EJV ejv) {
    }

    @Override // X.EIT
    public final void onPostMigrate(EJV ejv) {
    }
}

package com.facebook.aura.conversation.offline;

import X.AbstractC6554EEq;
import X.AbstractC6591EIj;
import X.BV4;
import X.C3cG;
import X.C60O;
import X.C6587EIf;
import X.C6594EIt;
import X.C7384Etj;
import X.EIR;
import X.EIT;
import X.EIW;
import X.EIs;
import X.EIy;
import X.EJV;
import X.EN5;
import com.facebook.aura.ageverification.intf.AgeCheckFunnelLogging;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public final class HatchOfflineConversationDatabase_Impl extends HatchOfflineConversationDatabase {
    public volatile HatchOfflineConversationDao _hatchOfflineConversationDao;

    @Override // X.EIN
    public EIR createInvalidationTracker() {
        return new EIR(this, BV4.A0v(0), BV4.A0v(0), "offline_messages", "offline_threads", "offline_keys");
    }

    @Override // X.EIN
    public void clearAllTables() {
        performClear(false, "offline_messages", "offline_threads", "offline_keys");
    }

    @Override // X.EIN
    public EIT createOpenDelegate() {
        return new EIT(9, "3411a1c9f95eef5e0a6921cac1d5eb8b", "1c1cd6ac22c651f80d0ffc865d22a242") { // from class: com.facebook.aura.conversation.offline.HatchOfflineConversationDatabase_Impl.1
            @Override // X.EIT
            public C6587EIf onValidateSchema(EJV ejv) {
                String str;
                StringBuilder sbA0f;
                HashMap mapA0v = BV4.A0v(7);
                EIT.A01("vm_id", "TEXT", mapA0v);
                mapA0v.put("session_id", EIT.A00("session_id", "TEXT", null, 2));
                mapA0v.put(AgeCheckFunnelLogging.KEY_SEQ, EIT.A00(AgeCheckFunnelLogging.KEY_SEQ, "INTEGER", null, 3));
                mapA0v.put("timestamp", EIT.A00("timestamp", "INTEGER", null, 0));
                mapA0v.put("server_message_id", new EIs("server_message_id", "TEXT", null, 0, 1, false));
                mapA0v.put("role", EIT.A00("role", "TEXT", null, 0));
                mapA0v.put("json", EIT.A00("json", "BLOB", null, 0));
                HashSet hashSet = new HashSet(0);
                HashSet hashSet2 = new HashSet(1);
                EIT.A02("index_offline_messages_timestamp", hashSet2, Arrays.asList("timestamp"), Arrays.asList("ASC"));
                C6594EIt c6594EIt = new C6594EIt("offline_messages", mapA0v, hashSet, hashSet2);
                C7384Etj.A0Y(ejv, 0);
                C6594EIt c6594EItA00 = EIy.A00(ejv, "offline_messages");
                if (c6594EIt.equals(c6594EItA00)) {
                    HashMap mapA0v2 = BV4.A0v(14);
                    EIT.A01("vm_id", "TEXT", mapA0v2);
                    mapA0v2.put("session_id", EIT.A00("session_id", "TEXT", null, 2));
                    mapA0v2.put("title", new EIs("title", "BLOB", null, 0, 1, false));
                    mapA0v2.put("snippet", new EIs("snippet", "BLOB", null, 0, 1, false));
                    mapA0v2.put("created_at", EIT.A00("created_at", "INTEGER", null, 0));
                    mapA0v2.put("updated_at", EIT.A00("updated_at", "INTEGER", null, 0));
                    mapA0v2.put("is_thread", EIT.A00("is_thread", "INTEGER", null, 0));
                    mapA0v2.put(AuraDeeplinkRouteMapper.STATUS_ROUTE, EIT.A00(AuraDeeplinkRouteMapper.STATUS_ROUTE, "TEXT", null, 0));
                    mapA0v2.put("unread_count", EIT.A00("unread_count", "INTEGER", null, 0));
                    mapA0v2.put("is_pinned", EIT.A00("is_pinned", "INTEGER", null, 0));
                    mapA0v2.put("last_opened_at", EIT.A00("last_opened_at", "INTEGER", null, 0));
                    mapA0v2.put("channel", new EIs("channel", "TEXT", null, 0, 1, false));
                    mapA0v2.put("account_username", new EIs("account_username", "BLOB", null, 0, 1, false));
                    mapA0v2.put("can_send_messages", EIT.A00("can_send_messages", "INTEGER", "1", 0));
                    C6594EIt c6594EIt2 = new C6594EIt("offline_threads", mapA0v2, new HashSet(0), new HashSet(0));
                    c6594EItA00 = EIy.A00(ejv, "offline_threads");
                    if (c6594EIt2.equals(c6594EItA00)) {
                        HashMap mapA0v3 = BV4.A0v(2);
                        EIT.A01("id", "INTEGER", mapA0v3);
                        mapA0v3.put("wrapped_key", EIT.A00("wrapped_key", "BLOB", null, 0));
                        c6594EIt2 = new C6594EIt("offline_keys", mapA0v3, new HashSet(0), new HashSet(0));
                        c6594EItA00 = EIy.A00(ejv, "offline_keys");
                        if (c6594EIt2.equals(c6594EItA00)) {
                            return new C6587EIf(true, null);
                        }
                        str = "offline_keys(com.facebook.aura.conversation.offline.HatchOfflineKeyEntity).\n Expected:\n";
                    } else {
                        str = "offline_threads(com.facebook.aura.conversation.offline.HatchOfflineThreadEntity).\n Expected:\n";
                    }
                    sbA0f = C3cG.A0f(c6594EIt2, str);
                } else {
                    sbA0f = C3cG.A0f(c6594EIt, "offline_messages(com.facebook.aura.conversation.offline.HatchOfflineMessageEntity).\n Expected:\n");
                }
                sbA0f.append("\n Found:\n");
                sbA0f.append(c6594EItA00);
                return new C6587EIf(false, sbA0f.toString());
            }

            @Override // X.EIT
            public void createAllTables(EJV ejv) {
                EIW.A00(ejv, "CREATE TABLE IF NOT EXISTS `offline_messages` (`vm_id` TEXT NOT NULL, `session_id` TEXT NOT NULL, `seq` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, `server_message_id` TEXT, `role` TEXT NOT NULL, `json` BLOB NOT NULL, PRIMARY KEY(`vm_id`, `session_id`, `seq`))");
                EIW.A00(ejv, "CREATE INDEX IF NOT EXISTS `index_offline_messages_timestamp` ON `offline_messages` (`timestamp`)");
                EIW.A00(ejv, "CREATE TABLE IF NOT EXISTS `offline_threads` (`vm_id` TEXT NOT NULL, `session_id` TEXT NOT NULL, `title` BLOB, `snippet` BLOB, `created_at` INTEGER NOT NULL, `updated_at` INTEGER NOT NULL, `is_thread` INTEGER NOT NULL, `status` TEXT NOT NULL, `unread_count` INTEGER NOT NULL, `is_pinned` INTEGER NOT NULL, `last_opened_at` INTEGER NOT NULL, `channel` TEXT, `account_username` BLOB, `can_send_messages` INTEGER NOT NULL DEFAULT 1, PRIMARY KEY(`vm_id`, `session_id`))");
                EIW.A00(ejv, "CREATE TABLE IF NOT EXISTS `offline_keys` (`id` INTEGER NOT NULL, `wrapped_key` BLOB NOT NULL, PRIMARY KEY(`id`))");
                EIW.A00(ejv, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                EIW.A00(ejv, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '3411a1c9f95eef5e0a6921cac1d5eb8b')");
            }

            @Override // X.EIT
            public void dropAllTables(EJV ejv) {
                EIW.A00(ejv, "DROP TABLE IF EXISTS `offline_messages`");
                EIW.A00(ejv, "DROP TABLE IF EXISTS `offline_threads`");
                EIW.A00(ejv, "DROP TABLE IF EXISTS `offline_keys`");
            }

            @Override // X.EIT
            public void onOpen(EJV ejv) {
                HatchOfflineConversationDatabase_Impl.this.internalInitInvalidationTracker(ejv);
            }

            @Override // X.EIT
            public void onCreate(EJV ejv) {
            }

            @Override // X.EIT
            public void onPostMigrate(EJV ejv) {
            }

            @Override // X.EIT
            public void onPreMigrate(EJV ejv) {
                AbstractC6591EIj.A00(ejv);
            }
        };
    }

    @Override // com.facebook.aura.conversation.offline.HatchOfflineConversationDatabase
    public HatchOfflineConversationDao dao() {
        HatchOfflineConversationDao hatchOfflineConversationDao;
        if (this._hatchOfflineConversationDao != null) {
            return this._hatchOfflineConversationDao;
        }
        synchronized (this) {
            if (this._hatchOfflineConversationDao == null) {
                this._hatchOfflineConversationDao = new HatchOfflineConversationDao_Impl(this);
            }
            hatchOfflineConversationDao = this._hatchOfflineConversationDao;
        }
        return hatchOfflineConversationDao;
    }

    @Override // X.EIN
    public List<AbstractC6554EEq> getAutoMigrations(Map<Class<? extends EN5>, EN5> map) {
        return C3cG.A0h();
    }

    @Override // X.EIN
    public Set<Class<? extends EN5>> getRequiredAutoMigrationSpecs() {
        return C60O.A13();
    }

    @Override // X.EIN
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap mapA0u = BV4.A0u();
        mapA0u.put(HatchOfflineConversationDao.class, Collections.EMPTY_LIST);
        return mapA0u;
    }
}

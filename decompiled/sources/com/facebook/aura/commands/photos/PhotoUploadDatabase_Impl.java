package com.facebook.aura.commands.photos;

import X.AbstractC6554EEq;
import X.AbstractC6591EIj;
import X.AnonymousClass006;
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
import com.facebook.aura.perf.HatchNavTTRCSpec;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public final class PhotoUploadDatabase_Impl extends PhotoUploadDatabase {
    public volatile PhotoUploadDao _photoUploadDao;

    @Override // X.EIN
    public EIR createInvalidationTracker() {
        return new EIR(this, BV4.A0v(0), BV4.A0v(0), "photo_upload_queue");
    }

    @Override // X.EIN
    public void clearAllTables() {
        performClear(false, "photo_upload_queue");
    }

    @Override // X.EIN
    public EIT createOpenDelegate() {
        return new EIT(2, "4cc2d7d546e6ec1207f99700fb3b612a", "36e9c573bab2cf528b7139e899f9daeb") { // from class: com.facebook.aura.commands.photos.PhotoUploadDatabase_Impl.1
            @Override // X.EIT
            public void createAllTables(EJV ejv) {
                EIW.A00(ejv, "CREATE TABLE IF NOT EXISTS `photo_upload_queue` (`media_uri` TEXT NOT NULL, `batch_id` TEXT NOT NULL, `state` TEXT NOT NULL, `strike_count` INTEGER NOT NULL, `next_retry_at` INTEGER NOT NULL, `last_attempt_at` INTEGER NOT NULL, `enqueued_at` INTEGER NOT NULL, `failure_reason` TEXT, PRIMARY KEY(`media_uri`))");
                EIW.A00(ejv, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                EIW.A00(ejv, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '4cc2d7d546e6ec1207f99700fb3b612a')");
            }

            @Override // X.EIT
            public void dropAllTables(EJV ejv) {
                EIW.A00(ejv, "DROP TABLE IF EXISTS `photo_upload_queue`");
            }

            @Override // X.EIT
            public void onOpen(EJV ejv) {
                PhotoUploadDatabase_Impl.this.internalInitInvalidationTracker(ejv);
            }

            @Override // X.EIT
            public C6587EIf onValidateSchema(EJV ejv) {
                HashMap mapA0v = BV4.A0v(8);
                EIT.A01("media_uri", "TEXT", mapA0v);
                mapA0v.put("batch_id", EIT.A00("batch_id", "TEXT", null, 0));
                mapA0v.put("state", EIT.A00("state", "TEXT", null, 0));
                mapA0v.put("strike_count", EIT.A00("strike_count", "INTEGER", null, 0));
                mapA0v.put("next_retry_at", EIT.A00("next_retry_at", "INTEGER", null, 0));
                mapA0v.put("last_attempt_at", EIT.A00("last_attempt_at", "INTEGER", null, 0));
                mapA0v.put("enqueued_at", EIT.A00("enqueued_at", "INTEGER", null, 0));
                mapA0v.put(HatchNavTTRCSpec.AnnotationKeys.FAILURE_REASON, new EIs(HatchNavTTRCSpec.AnnotationKeys.FAILURE_REASON, "TEXT", null, 0, 1, false));
                C6594EIt c6594EIt = new C6594EIt("photo_upload_queue", mapA0v, new HashSet(0), new HashSet(0));
                C7384Etj.A0Y(ejv, 0);
                C6594EIt c6594EItA00 = EIy.A00(ejv, "photo_upload_queue");
                return !c6594EIt.equals(c6594EItA00) ? new C6587EIf(false, AnonymousClass006.A0y(c6594EItA00, "\n Found:\n", C3cG.A0f(c6594EIt, "photo_upload_queue(com.facebook.aura.commands.photos.PhotoUploadQueueEntity).\n Expected:\n"))) : new C6587EIf(true, null);
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

    @Override // com.facebook.aura.commands.photos.PhotoUploadDatabase
    public PhotoUploadDao dao() {
        PhotoUploadDao photoUploadDao;
        if (this._photoUploadDao != null) {
            return this._photoUploadDao;
        }
        synchronized (this) {
            if (this._photoUploadDao == null) {
                this._photoUploadDao = new PhotoUploadDao_Impl(this);
            }
            photoUploadDao = this._photoUploadDao;
        }
        return photoUploadDao;
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
        mapA0u.put(PhotoUploadDao.class, Collections.EMPTY_LIST);
        return mapA0u;
    }
}

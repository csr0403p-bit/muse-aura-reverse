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
import X.EIy;
import X.EJV;
import X.EN5;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public final class PhotoLabelDatabase_Impl extends PhotoLabelDatabase {
    public volatile PhotoLabelDao _photoLabelDao;

    @Override // X.EIN
    public EIR createInvalidationTracker() {
        return new EIR(this, BV4.A0v(0), BV4.A0v(0), "photo_labels");
    }

    @Override // X.EIN
    public void clearAllTables() {
        performClear(false, "photo_labels");
    }

    @Override // X.EIN
    public EIT createOpenDelegate() {
        return new EIT(1, "a53354f3298a9ec7da04803c07ee7712", "47d176474edc6f4a62e243476486e2f5") { // from class: com.facebook.aura.commands.photos.PhotoLabelDatabase_Impl.1
            @Override // X.EIT
            public C6587EIf onValidateSchema(EJV ejv) {
                HashMap mapA0v = BV4.A0v(5);
                EIT.A01("media_uri", "TEXT", mapA0v);
                mapA0v.put("size_bytes", EIT.A00("size_bytes", "INTEGER", null, 0));
                mapA0v.put("date_modified_s", EIT.A00("date_modified_s", "INTEGER", null, 0));
                mapA0v.put(PhotosSearchHandlerKt.PARAM_LABELS, EIT.A00(PhotosSearchHandlerKt.PARAM_LABELS, "TEXT", null, 0));
                mapA0v.put("labeled_at", EIT.A00("labeled_at", "INTEGER", null, 0));
                C6594EIt c6594EIt = new C6594EIt("photo_labels", mapA0v, new HashSet(0), new HashSet(0));
                C7384Etj.A0Y(ejv, 0);
                C6594EIt c6594EItA00 = EIy.A00(ejv, "photo_labels");
                return !c6594EIt.equals(c6594EItA00) ? new C6587EIf(false, AnonymousClass006.A0y(c6594EItA00, "\n Found:\n", C3cG.A0f(c6594EIt, "photo_labels(com.facebook.aura.commands.photos.PhotoLabelEntity).\n Expected:\n"))) : new C6587EIf(true, null);
            }

            @Override // X.EIT
            public void createAllTables(EJV ejv) {
                EIW.A00(ejv, "CREATE TABLE IF NOT EXISTS `photo_labels` (`media_uri` TEXT NOT NULL, `size_bytes` INTEGER NOT NULL, `date_modified_s` INTEGER NOT NULL, `labels` TEXT NOT NULL, `labeled_at` INTEGER NOT NULL, PRIMARY KEY(`media_uri`))");
                EIW.A00(ejv, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                EIW.A00(ejv, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'a53354f3298a9ec7da04803c07ee7712')");
            }

            @Override // X.EIT
            public void dropAllTables(EJV ejv) {
                EIW.A00(ejv, "DROP TABLE IF EXISTS `photo_labels`");
            }

            @Override // X.EIT
            public void onOpen(EJV ejv) {
                PhotoLabelDatabase_Impl.this.internalInitInvalidationTracker(ejv);
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

    @Override // com.facebook.aura.commands.photos.PhotoLabelDatabase
    public PhotoLabelDao dao() {
        PhotoLabelDao photoLabelDao;
        if (this._photoLabelDao != null) {
            return this._photoLabelDao;
        }
        synchronized (this) {
            if (this._photoLabelDao == null) {
                this._photoLabelDao = new PhotoLabelDao_Impl(this);
            }
            photoLabelDao = this._photoLabelDao;
        }
        return photoLabelDao;
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
        mapA0u.put(PhotoLabelDao.class, Collections.EMPTY_LIST);
        return mapA0u;
    }
}

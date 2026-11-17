package com.facebook.aura.commands.photos;

import X.AnonymousClass001;
import X.C06H;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.C7BY;
import X.EEk;
import X.EIN;
import android.content.Context;

/* loaded from: classes5.dex */
public abstract class PhotoUploadDatabase extends EIN {
    public static final String DB_NAME = "hatch_photo_upload.db";
    public static volatile PhotoUploadDatabase instance;
    public static final Companion Companion = new Companion();
    public static final Object LOCK = C3cG.A0T();

    public abstract PhotoUploadDao dao();

    public final class Companion {
        public final PhotoUploadDatabase getInstance(Context context) {
            C7384Etj.A0Y(context, 0);
            PhotoUploadDatabase photoUploadDatabase = PhotoUploadDatabase.instance;
            if (photoUploadDatabase == null) {
                synchronized (PhotoUploadDatabase.LOCK) {
                    photoUploadDatabase = PhotoUploadDatabase.instance;
                    if (photoUploadDatabase == null) {
                        Context contextA0I = AnonymousClass001.A0I(context);
                        if (C7BY.A0j(PhotoUploadDatabase.DB_NAME)) {
                            throw C60O.A0i("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
                        }
                        EEk eEk = new EEk(contextA0I, PhotoUploadDatabase.class, PhotoUploadDatabase.DB_NAME);
                        eEk.A06 = false;
                        eEk.A05 = true;
                        photoUploadDatabase = (PhotoUploadDatabase) eEk.A00();
                        PhotoUploadDatabase.instance = photoUploadDatabase;
                    }
                }
            }
            return photoUploadDatabase;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }
}

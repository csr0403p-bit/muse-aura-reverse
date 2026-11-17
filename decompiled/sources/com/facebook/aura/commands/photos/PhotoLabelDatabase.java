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
public abstract class PhotoLabelDatabase extends EIN {
    public static final String DB_NAME = "hatch_photo_labels.db";
    public static volatile PhotoLabelDatabase instance;
    public static final Companion Companion = new Companion();
    public static final Object LOCK = C3cG.A0T();

    public abstract PhotoLabelDao dao();

    public final class Companion {
        public final PhotoLabelDatabase getInstance(Context context) {
            C7384Etj.A0Y(context, 0);
            PhotoLabelDatabase photoLabelDatabase = PhotoLabelDatabase.instance;
            if (photoLabelDatabase == null) {
                synchronized (PhotoLabelDatabase.LOCK) {
                    photoLabelDatabase = PhotoLabelDatabase.instance;
                    if (photoLabelDatabase == null) {
                        Context contextA0I = AnonymousClass001.A0I(context);
                        if (C7BY.A0j(PhotoLabelDatabase.DB_NAME)) {
                            throw C60O.A0i("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
                        }
                        EEk eEk = new EEk(contextA0I, PhotoLabelDatabase.class, PhotoLabelDatabase.DB_NAME);
                        eEk.A06 = false;
                        eEk.A05 = true;
                        photoLabelDatabase = (PhotoLabelDatabase) eEk.A00();
                        PhotoLabelDatabase.instance = photoLabelDatabase;
                    }
                }
            }
            return photoLabelDatabase;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }
}

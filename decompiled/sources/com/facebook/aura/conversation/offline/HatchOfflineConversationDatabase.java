package com.facebook.aura.conversation.offline;

import X.AbstractC6554EEq;
import X.AnonymousClass001;
import X.C06H;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.C7BY;
import X.EEk;
import X.EHO;
import X.EI3;
import X.EIN;
import android.content.Context;
import android.database.SQLException;

/* loaded from: classes5.dex */
public abstract class HatchOfflineConversationDatabase extends EIN {
    public static final String DB_NAME = "hatch_offline_conversation.db";
    public static volatile HatchOfflineConversationDatabase instance;
    public static final Companion Companion = new Companion();
    public static final Object LOCK = C3cG.A0T();

    public abstract HatchOfflineConversationDao dao();

    public final class Companion {
        public final HatchOfflineConversationDatabase getInstance(Context context) {
            C7384Etj.A0Y(context, 0);
            HatchOfflineConversationDatabase hatchOfflineConversationDatabase = HatchOfflineConversationDatabase.instance;
            if (hatchOfflineConversationDatabase == null) {
                synchronized (HatchOfflineConversationDatabase.LOCK) {
                    hatchOfflineConversationDatabase = HatchOfflineConversationDatabase.instance;
                    if (hatchOfflineConversationDatabase == null) {
                        Context contextA0I = AnonymousClass001.A0I(context);
                        if (C7BY.A0j(HatchOfflineConversationDatabase.DB_NAME)) {
                            throw C60O.A0i("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
                        }
                        EEk eEk = new EEk(contextA0I, HatchOfflineConversationDatabase.class, HatchOfflineConversationDatabase.DB_NAME);
                        eEk.A06 = false;
                        eEk.A05 = true;
                        eEk.A01(new AbstractC6554EEq() { // from class: com.facebook.aura.conversation.offline.HatchOfflineConversationDatabase$Companion$getInstance$1$1
                            @Override // X.AbstractC6554EEq
                            public void migrate(EI3 ei3) throws SQLException {
                                C7384Etj.A0Y(ei3, 0);
                                ((EHO) ei3).A00.execSQL("ALTER TABLE offline_threads ADD COLUMN can_send_messages INTEGER NOT NULL DEFAULT 1");
                            }
                        }, new AbstractC6554EEq() { // from class: com.facebook.aura.conversation.offline.HatchOfflineConversationDatabase$Companion$getInstance$1$2
                            @Override // X.AbstractC6554EEq
                            public void migrate(EI3 ei3) throws SQLException {
                                C7384Etj.A0Y(ei3, 0);
                                ((EHO) ei3).A00.execSQL("ALTER TABLE offline_threads ADD COLUMN account_username BLOB");
                            }
                        });
                        PurgeOversizedMessagesCallback purgeOversizedMessagesCallback = PurgeOversizedMessagesCallback.INSTANCE;
                        C7384Etj.A0Y(purgeOversizedMessagesCallback, 0);
                        eEk.A0B.add(purgeOversizedMessagesCallback);
                        hatchOfflineConversationDatabase = (HatchOfflineConversationDatabase) eEk.A00();
                        HatchOfflineConversationDatabase.instance = hatchOfflineConversationDatabase;
                    }
                }
            }
            return hatchOfflineConversationDatabase;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }
}

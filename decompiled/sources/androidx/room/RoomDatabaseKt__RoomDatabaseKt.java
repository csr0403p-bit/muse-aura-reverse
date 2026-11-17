package androidx.room;

import X.EIN;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class RoomDatabaseKt__RoomDatabaseKt {
    public static final void A00(EIN ein) {
        if (ein.closeBarrier.A00.get()) {
            throw new IllegalStateException("Database is closed");
        }
    }
}

package X;

/* renamed from: X.EEq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6554EEq {
    public final int endVersion;
    public final int startVersion;

    public void migrate(EJV ejv) {
        C7384Etj.A0Y(ejv, 0);
        if (!(ejv instanceof EI7)) {
            throw new C7500EyF("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
        }
        migrate(((EI7) ejv).A00);
    }

    public AbstractC6554EEq(int i, int i2) {
        this.startVersion = i;
        this.endVersion = i2;
    }

    public static void A00(EJV ejv, String str) {
        EIW.A00(ejv, str);
        EIW.A00(ejv, "DROP TABLE `WorkSpec`");
        EIW.A00(ejv, "ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
        EIW.A00(ejv, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
    }

    public void migrate(EI3 ei3) {
        throw new C7500EyF("Migration functionality with a SupportSQLiteDatabase (without a provided SQLiteDriver) requires overriding the migrate(SupportSQLiteDatabase) function.");
    }
}

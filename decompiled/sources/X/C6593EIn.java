package X;

import com.facebook.debug.plog.persistence.PLogDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: X.EIn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6593EIn extends EIT {
    public final /* synthetic */ PLogDatabase_Impl A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6593EIn(PLogDatabase_Impl pLogDatabase_Impl) {
        super(3, "0090ab4b89b93a932d784228b851d36e", "2f1900c0a70925ec6ebd79fa4bdb05c3");
        this.A00 = pLogDatabase_Impl;
    }

    @Override // X.EIT
    public final C6587EIf onValidateSchema(EJV ejv) {
        HashMap mapA0v = BV4.A0v(7);
        EIT.A01("configName", "TEXT", mapA0v);
        mapA0v.put("bufferSize", EIT.A00("bufferSize", "INTEGER", null, 0));
        mapA0v.put("isActive", EIT.A00("isActive", "INTEGER", null, 0));
        mapA0v.put("forwardToDebugLogs", EIT.A00("forwardToDebugLogs", "INTEGER", null, 0));
        mapA0v.put("minLogLevel", EIT.A00("minLogLevel", "INTEGER", null, 0));
        mapA0v.put("bugReportFilename", new EIs("bugReportFilename", "TEXT", null, 0, 1, false));
        mapA0v.put("softErrorEnabled", EIT.A00("softErrorEnabled", "INTEGER", null, 0));
        C6594EIt c6594EIt = new C6594EIt("plog_config_overrides", mapA0v, new HashSet(0), new HashSet(0));
        C7384Etj.A0Y(ejv, 0);
        C6594EIt c6594EItA00 = EIy.A00(ejv, "plog_config_overrides");
        return !c6594EIt.equals(c6594EItA00) ? new C6587EIf(false, AnonymousClass006.A0y(c6594EItA00, "\n Found:\n", C3cG.A0f(c6594EIt, "plog_config_overrides(com.facebook.debug.plog.persistence.PLogConfigEntity).\n Expected:\n"))) : new C6587EIf(true, null);
    }

    @Override // X.EIT
    public final void createAllTables(EJV ejv) {
        EIW.A00(ejv, "CREATE TABLE IF NOT EXISTS `plog_config_overrides` (`configName` TEXT NOT NULL, `bufferSize` INTEGER NOT NULL, `isActive` INTEGER NOT NULL, `forwardToDebugLogs` INTEGER NOT NULL, `minLogLevel` INTEGER NOT NULL, `bugReportFilename` TEXT, `softErrorEnabled` INTEGER NOT NULL, PRIMARY KEY(`configName`))");
        EIW.A00(ejv, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        EIW.A00(ejv, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '0090ab4b89b93a932d784228b851d36e')");
    }

    @Override // X.EIT
    public final void dropAllTables(EJV ejv) {
        EIW.A00(ejv, "DROP TABLE IF EXISTS `plog_config_overrides`");
    }

    @Override // X.EIT
    public final void onOpen(EJV ejv) {
        this.A00.internalInitInvalidationTracker(ejv);
    }

    @Override // X.EIT
    public final void onCreate(EJV ejv) {
    }

    @Override // X.EIT
    public final void onPostMigrate(EJV ejv) {
    }

    @Override // X.EIT
    public final void onPreMigrate(EJV ejv) {
        AbstractC6591EIj.A00(ejv);
    }
}

package X;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes5.dex */
public final class EMJ extends AbstractC6554EEq {
    public static final EMJ A00 = new EMJ();

    @Override // X.AbstractC6554EEq
    public final void migrate(EI3 ei3) throws SQLException {
        C7384Etj.A0Y(ei3, 0);
        SQLiteDatabase sQLiteDatabase = ((EHO) ei3).A00;
        sQLiteDatabase.execSQL("DELETE FROM SystemIdInfo WHERE work_spec_id IN (SELECT work_spec_id FROM SystemIdInfo LEFT JOIN WorkSpec ON work_spec_id = id WHERE WorkSpec.id IS NULL)");
        sQLiteDatabase.execSQL("ALTER TABLE `WorkSpec` ADD COLUMN `generation` INTEGER NOT NULL DEFAULT 0");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `_new_SystemIdInfo` (\n            `work_spec_id` TEXT NOT NULL, \n            `generation` INTEGER NOT NULL DEFAULT 0, \n            `system_id` INTEGER NOT NULL, \n            PRIMARY KEY(`work_spec_id`, `generation`), \n            FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) \n                ON UPDATE CASCADE ON DELETE CASCADE )");
        sQLiteDatabase.execSQL("INSERT INTO `_new_SystemIdInfo` (`work_spec_id`,`system_id`) SELECT `work_spec_id`,`system_id` FROM `SystemIdInfo`");
        sQLiteDatabase.execSQL("DROP TABLE `SystemIdInfo`");
        sQLiteDatabase.execSQL("ALTER TABLE `_new_SystemIdInfo` RENAME TO `SystemIdInfo`");
    }

    public EMJ() {
        super(15, 16);
    }
}

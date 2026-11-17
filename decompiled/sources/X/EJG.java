package X;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes5.dex */
public final class EJG extends SQLiteOpenHelper {
    public static final String A02 = FGI.A0J("INSERT INTO global_log_event_state VALUES (", System.currentTimeMillis(), ")");
    public static final EJH A03;
    public static final EJH A04;
    public static final EJH A05;
    public static final EJH A06;
    public static final EJH A07;
    public static final List<EJH> A08;
    public boolean A00;
    public final int A01;

    public EJG(Context context, String str, int i) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.A00 = false;
        this.A01 = i;
    }

    public static void A00(SQLiteDatabase sQLiteDatabase, int i, int i2) throws SQLException {
        String str;
        int i3 = i;
        List<EJH> list = A08;
        if (i2 > list.size()) {
            throw C60O.A0i(FGI.A0f("Migration from ", " to ", " was requested, but cannot be performed. Only ", " migrations are provided", i3, i2, list.size()));
        }
        while (i3 < i2) {
            switch (((F5U) list.get(i3)).$t) {
                case 0:
                    sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
                    sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
                    sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
                    sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
                    str = "CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)";
                    sQLiteDatabase.execSQL(str);
                    break;
                case 1:
                    sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
                    sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
                    str = "DROP INDEX contexts_backend_priority";
                    sQLiteDatabase.execSQL(str);
                    break;
                case 2:
                    str = "ALTER TABLE events ADD COLUMN payload_encoding TEXT";
                    sQLiteDatabase.execSQL(str);
                    break;
                case 3:
                    sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
                    str = "CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))";
                    sQLiteDatabase.execSQL(str);
                    break;
                case 4:
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
                    sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
                    sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
                    str = A02;
                    sQLiteDatabase.execSQL(str);
                    break;
            }
            i3++;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.A00 = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    static {
        F5U f5u = new F5U(0);
        A03 = f5u;
        F5U f5u2 = new F5U(1);
        A04 = f5u2;
        F5U f5u3 = new F5U(2);
        A05 = f5u3;
        F5U f5u4 = new F5U(3);
        A06 = f5u4;
        F5U f5u5 = new F5U(4);
        A07 = f5u5;
        A08 = Arrays.asList(f5u, f5u2, f5u3, f5u4, f5u5);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        int i = this.A01;
        if (!this.A00) {
            onConfigure(sQLiteDatabase);
        }
        A00(sQLiteDatabase, 0, i);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        if (!this.A00) {
            onConfigure(sQLiteDatabase);
        }
        A00(sQLiteDatabase, 0, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (this.A00) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) throws SQLException {
        if (!this.A00) {
            onConfigure(sQLiteDatabase);
        }
        A00(sQLiteDatabase, i, i2);
    }
}

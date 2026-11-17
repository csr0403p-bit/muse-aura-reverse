package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.CfV, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3842CfV implements InterfaceC3891CgU, InterfaceC3897Cgb, InterfaceC3922Ch3 {
    public static final Ce6 A05 = new Ce6("proto");
    public final CgR<String> A00;
    public final Cg9 A01;
    public final InterfaceC3770CeD A02;
    public final InterfaceC3770CeD A03;
    public final EJG A04;

    public static final SQLiteDatabase A00(C3842CfV c3842CfV) {
        EJG ejg = c3842CfV.A04;
        ejg.getClass();
        InterfaceC3770CeD interfaceC3770CeD = c3842CfV.A02;
        long jALc = interfaceC3770CeD.ALc();
        while (true) {
            try {
                return ejg.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (interfaceC3770CeD.ALc() >= ((Cg2) c3842CfV.A01).A00 + jALc) {
                    throw new SynchronizationException("Timed out while trying to open db.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public static Long A01(SQLiteDatabase sQLiteDatabase, AbstractC3874Cg5 abstractC3874Cg5) {
        StringBuilder sbA0x = C60O.A0x("backend_name = ? and priority = ?");
        C3867Cfw c3867Cfw = (C3867Cfw) abstractC3874Cg5;
        ArrayList arrayListA0t = BV4.A0t(C60O.A16(c3867Cfw.A01, String.valueOf(Ce7.A00(c3867Cfw.A00))));
        byte[] bArr = c3867Cfw.A02;
        if (bArr != null) {
            sbA0x.append(" and extras = ?");
            arrayListA0t.add(Base64.encodeToString(bArr, 0));
        } else {
            sbA0x.append(" and extras is null");
        }
        Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sbA0x.toString(), (String[]) arrayListA0t.toArray(new String[0]), null, null, null);
        try {
            return !cursorQuery.moveToNext() ? null : Long.valueOf(cursorQuery.getLong(0));
        } finally {
            cursorQuery.close();
        }
    }

    public static String A02(Iterable<AbstractC3923Ch4> iterable) {
        StringBuilder sbA0x = C60O.A0x("(");
        Iterator<AbstractC3923Ch4> it = iterable.iterator();
        while (it.hasNext()) {
            sbA0x.append(((C3852Cfh) it.next()).A00);
            if (it.hasNext()) {
                sbA0x.append(',');
            }
        }
        return AnonymousClass006.A0z(sbA0x);
    }

    public static void A03(SQLiteDatabase sQLiteDatabase, C3842CfV c3842CfV) {
        InterfaceC3770CeD interfaceC3770CeD = c3842CfV.A02;
        long jALc = interfaceC3770CeD.ALc();
        while (true) {
            try {
                sQLiteDatabase.beginTransaction();
                return;
            } catch (SQLiteDatabaseLockedException e) {
                if (interfaceC3770CeD.ALc() >= ((Cg2) c3842CfV.A01).A00 + jALc) {
                    throw new SynchronizationException("Timed out while trying to acquire the lock.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A04.close();
    }

    /* JADX WARN: Incorrect types in method signature: (LX/CeD;LX/CeD;LX/Cg9;LX/EJG;LX/CgR<Ljava/lang/String;>;)V */
    public C3842CfV(CgR cgR, Cg9 cg9, EJG ejg, InterfaceC3770CeD interfaceC3770CeD, InterfaceC3770CeD interfaceC3770CeD2) {
        this.A04 = ejg;
        this.A03 = interfaceC3770CeD;
        this.A02 = interfaceC3770CeD2;
        this.A01 = cg9;
        this.A00 = cgR;
    }

    @Override // X.InterfaceC3897Cgb
    public final void AZl(EnumC3860Cfp enumC3860Cfp, String str, long j) {
        SQLiteDatabase sQLiteDatabaseA00 = A00(this);
        sQLiteDatabaseA00.beginTransaction();
        try {
            Cursor cursorRawQuery = sQLiteDatabaseA00.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(enumC3860Cfp.number_)});
            try {
                boolean zA1N = AnonymousClass002.A1N(cursorRawQuery.getCount());
                cursorRawQuery.close();
                if (zA1N) {
                    sQLiteDatabaseA00.execSQL(FGI.A0J("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", j, " WHERE log_source = ? AND reason = ?"), new String[]{str, Integer.toString(enumC3860Cfp.number_)});
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("log_source", str);
                    contentValues.put("reason", Integer.valueOf(enumC3860Cfp.number_));
                    contentValues.put("events_dropped_count", Long.valueOf(j));
                    sQLiteDatabaseA00.insert("log_event_dropped", null, contentValues);
                }
                sQLiteDatabaseA00.setTransactionSuccessful();
            } catch (Throwable th) {
                cursorRawQuery.close();
                throw th;
            }
        } finally {
            sQLiteDatabaseA00.endTransaction();
        }
    }

    @Override // X.InterfaceC3891CgU
    public final void AZn(AbstractC3874Cg5 abstractC3874Cg5, long j) {
        SQLiteDatabase sQLiteDatabaseA00 = A00(this);
        sQLiteDatabaseA00.beginTransaction();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("next_request_ms", Long.valueOf(j));
            C3867Cfw c3867Cfw = (C3867Cfw) abstractC3874Cg5;
            String str = c3867Cfw.A01;
            Ce5 ce5 = c3867Cfw.A00;
            if (sQLiteDatabaseA00.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(Ce7.A00(ce5))}) < 1) {
                contentValues.put("backend_name", str);
                contentValues.put("priority", Integer.valueOf(Ce7.A00(ce5)));
                sQLiteDatabaseA00.insert("transport_contexts", null, contentValues);
            }
            sQLiteDatabaseA00.setTransactionSuccessful();
        } finally {
            sQLiteDatabaseA00.endTransaction();
        }
    }
}

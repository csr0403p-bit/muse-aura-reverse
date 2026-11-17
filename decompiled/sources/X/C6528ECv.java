package X;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.Lock;

/* renamed from: X.ECv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6528ECv extends SQLiteOpenHelper {
    public boolean A00;
    public boolean A01;
    public final Context A02;
    public final ED4 A03;
    public final boolean A04;
    public final ECx A05;
    public final C8V A06;

    /* JADX WARN: Illegal instructions before constructor call */
    public C6528ECv(Context context, final ECx eCx, final ED4 ed4, String str, boolean z) {
        String str2 = str;
        super(context, str2, null, eCx.A00, new DatabaseErrorHandler() { // from class: X.ECw
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                ED4 ed42 = ed4;
                C7384Etj.A0X(sQLiteDatabase);
                EHO ehoA00 = C6528ECv.A00(sQLiteDatabase, ed42);
                C7384Etj.A0Y(ehoA00, 0);
                Log.e("SupportSQLite", AnonymousClass001.A0v(".path", C3cG.A0f(ehoA00, "Corruption reported by sqlite on database: ")));
                SQLiteDatabase sQLiteDatabase2 = ehoA00.A00;
                if (sQLiteDatabase2.isOpen()) {
                    List<Pair<String, String>> attachedDbs = null;
                    try {
                        try {
                            attachedDbs = sQLiteDatabase2.getAttachedDbs();
                        } catch (SQLiteException unused) {
                        }
                        try {
                            ehoA00.close();
                        } catch (IOException unused2) {
                        }
                        if (attachedDbs != null) {
                            return;
                        }
                    } finally {
                        if (attachedDbs != null) {
                            Iterator<Pair<String, String>> it = attachedDbs.iterator();
                            while (it.hasNext()) {
                                Object obj = BV6.A0O(it).second;
                                C7384Etj.A0T(obj);
                                ECx.A00((String) obj);
                            }
                        } else {
                            String path = sQLiteDatabase2.getPath();
                            if (path != null) {
                                ECx.A00(path);
                            }
                        }
                    }
                }
            }
        });
        this.A02 = context;
        this.A03 = ed4;
        this.A05 = eCx;
        this.A04 = z;
        this.A06 = new C8V(context.getCacheDir(), str == null ? AnonymousClass002.A0k() : str2);
    }

    public static final EHO A00(SQLiteDatabase sQLiteDatabase, ED4 ed4) {
        C7384Etj.A0Y(ed4, 0);
        EHO eho = ed4.A00;
        if (eho != null && eho.A00.equals(sQLiteDatabase)) {
            return eho;
        }
        EHO eho2 = new EHO(sQLiteDatabase);
        ed4.A00 = eho2;
        return eho2;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        C7384Etj.A0Y(sQLiteDatabase, 0);
        if (!this.A01 && this.A05.A00 != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            A00(sQLiteDatabase, this.A03);
        } catch (Throwable th) {
            throw new FrameworkSQLiteOpenHelper$OpenHelper$CallbackException(EnumC2385BYa.A02, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        C7384Etj.A0Y(sQLiteDatabase, 0);
        try {
            ECx eCx = this.A05;
            EHO ehoA00 = A00(sQLiteDatabase, this.A03);
            C7384Etj.A0Y(ehoA00, 0);
            eCx.A01.A02(new EI7(ehoA00));
        } catch (Throwable th) {
            throw new FrameworkSQLiteOpenHelper$OpenHelper$CallbackException(EnumC2385BYa.A03, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C7384Etj.A0Y(sQLiteDatabase, 0);
        this.A01 = true;
        try {
            ECx eCx = this.A05;
            EHO ehoA00 = A00(sQLiteDatabase, this.A03);
            C7384Etj.A0Y(ehoA00, 0);
            eCx.A01.A04(new EI7(ehoA00), i, i2);
        } catch (Throwable th) {
            throw new FrameworkSQLiteOpenHelper$OpenHelper$CallbackException(EnumC2385BYa.A04, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        C7384Etj.A0Y(sQLiteDatabase, 0);
        if (!this.A01) {
            try {
                ECx eCx = this.A05;
                EHO ehoA00 = A00(sQLiteDatabase, this.A03);
                C7384Etj.A0Y(ehoA00, 0);
                EIO eio = eCx.A01;
                eio.A03(new EI7(ehoA00));
                eio.A00 = ehoA00;
            } catch (Throwable th) {
                throw new FrameworkSQLiteOpenHelper$OpenHelper$CallbackException(EnumC2385BYa.A05, th);
            }
        }
        this.A00 = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C7384Etj.A0Y(sQLiteDatabase, 0);
        this.A01 = true;
        try {
            ECx eCx = this.A05;
            EHO ehoA00 = A00(sQLiteDatabase, this.A03);
            C7384Etj.A0Y(ehoA00, 0);
            eCx.A01.A04(new EI7(ehoA00), i, i2);
        } catch (Throwable th) {
            throw new FrameworkSQLiteOpenHelper$OpenHelper$CallbackException(EnumC2385BYa.A06, th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.EI3 A01() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6528ECv.A01():X.EI3");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() throws IOException {
        try {
            C8V c8v = this.A06;
            Lock lock = c8v.A02;
            lock.lock();
            super.close();
            this.A03.A00 = null;
            this.A00 = false;
            try {
                FileChannel fileChannel = c8v.A00;
                if (fileChannel != null) {
                    fileChannel.close();
                }
            } catch (IOException unused) {
            }
            lock.unlock();
        } catch (Throwable th) {
            C8V c8v2 = this.A06;
            try {
                FileChannel fileChannel2 = c8v2.A00;
                if (fileChannel2 != null) {
                    fileChannel2.close();
                }
            } catch (IOException unused2) {
            }
            c8v2.A02.unlock();
            throw th;
        }
    }
}

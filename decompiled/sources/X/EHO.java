package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import java.lang.reflect.Method;

/* loaded from: classes5.dex */
public final class EHO implements EI3 {
    public static final F0C<Method> A01;
    public static final F0C<Method> A02;
    public static final String[] A03 = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    public static final String[] A04 = new String[0];
    public final SQLiteDatabase A00;

    static {
        Integer num = C79.A01;
        A02 = AbstractC5321DgF.A02(num, new C7587F5a(2));
        A01 = AbstractC5321DgF.A02(num, new C7587F5a(3));
    }

    @Override // X.EI3
    public final Cursor AYu(final InterfaceC6578EHw interfaceC6578EHw) {
        final G2j g2j = new G2j() { // from class: X.EHx
            @Override // X.G2j
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                InterfaceC6578EHw interfaceC6578EHw2 = interfaceC6578EHw;
                SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
                String[] strArr = EHO.A03;
                C7384Etj.A0X(sQLiteQuery);
                interfaceC6578EHw2.A5H(new C6581EHz(sQLiteQuery));
                return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
            }
        };
        Cursor cursorRawQueryWithFactory = this.A00.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: X.EHP
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                G2j g2j2 = g2j;
                String[] strArr = EHO.A03;
                return (Cursor) g2j2.invoke(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, interfaceC6578EHw.AKr(), A04, null);
        C7384Etj.A0U(cursorRawQueryWithFactory);
        return cursorRawQueryWithFactory;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A00.close();
    }

    public EHO(SQLiteDatabase sQLiteDatabase) {
        this.A00 = sQLiteDatabase;
    }
}

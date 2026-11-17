package X;

import android.database.sqlite.SQLiteProgram;

/* renamed from: X.EHz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C6581EHz implements EIB {
    public final SQLiteProgram A00;

    @Override // X.EIB
    public final void A5A(int i, byte[] bArr) {
        C7384Etj.A0Y(bArr, 1);
        this.A00.bindBlob(i, bArr);
    }

    @Override // X.EIB
    public final void A5E(int i, String str) {
        C7384Etj.A0Y(str, 1);
        this.A00.bindString(i, str);
    }

    @Override // X.EIB
    public final void A5B(int i, double d) {
        this.A00.bindDouble(i, d);
    }

    @Override // X.EIB
    public final void A5C(int i, long j) {
        this.A00.bindLong(i, j);
    }

    @Override // X.EIB
    public final void A5D(int i) {
        this.A00.bindNull(i);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A00.close();
    }

    public C6581EHz(SQLiteProgram sQLiteProgram) {
        this.A00 = sQLiteProgram;
    }
}

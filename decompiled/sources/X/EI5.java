package X;

import android.database.SQLException;
import android.database.sqlite.SQLiteStatement;
import java.io.IOException;

/* loaded from: classes5.dex */
public final class EI5 extends EIA {
    public final EI1 A00;

    @Override // X.EIK
    public final void A5A(int i, byte[] bArr) {
        C7384Etj.A0Y(bArr, 1);
        A03();
        this.A00.A5A(i, bArr);
    }

    @Override // X.EIK
    public final void A5F(int i, String str) {
        C7384Etj.A0Y(str, 1);
        A03();
        this.A00.A5E(i, str);
    }

    @Override // X.EIK, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.A00.close();
        super.A00 = true;
    }

    public EI5(EI3 ei3, String str) throws SQLException {
        super(ei3, str);
        SQLiteStatement sQLiteStatementCompileStatement = ((EHO) ei3).A00.compileStatement(str);
        C7384Etj.A0U(sQLiteStatementCompileStatement);
        this.A00 = new EI0(sQLiteStatementCompileStatement);
    }

    @Override // X.EIK
    public final void A5B(int i, double d) {
        A03();
        this.A00.A5B(i, d);
    }

    @Override // X.EIK
    public final void A5C(int i, long j) {
        A03();
        this.A00.A5C(i, j);
    }

    @Override // X.EIK
    public final void A5D(int i) {
        A03();
        this.A00.A5D(i);
    }

    @Override // X.EIK
    public final void A6F() {
        A03();
        ((C6581EHz) this.A00).A00.clearBindings();
    }

    @Override // X.EIK
    public final String ALa(int i) {
        EIA.A02(this);
        throw F60.createAndThrow();
    }

    @Override // X.EIK
    public final boolean AgN() {
        A03();
        ((EI0) this.A00).A00.execute();
        return false;
    }

    @Override // X.EIK
    public final byte[] getBlob(int i) {
        EIA.A02(this);
        throw F60.createAndThrow();
    }

    @Override // X.EIK
    public final int getColumnCount() {
        A03();
        return 0;
    }

    @Override // X.EIK
    public final String getColumnName(int i) {
        EIA.A02(this);
        throw F60.createAndThrow();
    }

    @Override // X.EIK
    public final long getLong(int i) {
        EIA.A02(this);
        throw F60.createAndThrow();
    }

    @Override // X.EIK
    public final boolean isNull(int i) {
        EIA.A02(this);
        throw F60.createAndThrow();
    }

    @Override // X.EIK
    public final void reset() {
        A03();
    }
}

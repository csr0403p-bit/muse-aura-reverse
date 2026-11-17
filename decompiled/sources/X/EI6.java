package X;

import android.database.Cursor;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class EI6 extends EIA {
    public Cursor A00;
    public double[] A01;
    public int[] A02;
    public long[] A03;
    public String[] A04;
    public byte[][] A05;

    @Override // X.EIK
    public final void A5A(int i, byte[] bArr) {
        C7384Etj.A0Y(bArr, 1);
        A03();
        int i2 = i + 1;
        int[] iArr = this.A02;
        if (iArr.length < i2) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i2);
            C7384Etj.A0U(iArrCopyOf);
            this.A02 = iArrCopyOf;
        }
        byte[][] bArr2 = this.A05;
        if (bArr2.length < i2) {
            bArr2 = (byte[][]) C8j3.A1a(bArr2, i2);
            this.A05 = bArr2;
        }
        this.A02[i] = 4;
        bArr2[i] = bArr;
    }

    @Override // X.EIK
    public final void A5F(int i, String str) {
        C7384Etj.A0Y(str, 1);
        A03();
        int i2 = i + 1;
        int[] iArr = this.A02;
        if (iArr.length < i2) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i2);
            C7384Etj.A0U(iArrCopyOf);
            this.A02 = iArrCopyOf;
        }
        String[] strArr = this.A04;
        if (strArr.length < i2) {
            Object[] objArrCopyOf = Arrays.copyOf(strArr, i2);
            C7384Etj.A0U(objArrCopyOf);
            strArr = (String[]) objArrCopyOf;
            this.A04 = strArr;
        }
        this.A02[i] = 3;
        strArr[i] = str;
    }

    private final void A00() {
        if (this.A00 == null) {
            this.A00 = super.A01.AYu(new EI9(this));
        }
    }

    public static final void A01(Cursor cursor, int i) {
        if (i < 0 || i >= cursor.getColumnCount()) {
            EJB.A00("column index out of range", 25);
            throw F60.createAndThrow();
        }
    }

    @Override // X.EIK, java.lang.AutoCloseable
    public final void close() {
        if (!super.A00) {
            A6F();
            reset();
        }
        super.A00 = true;
    }

    @Override // X.EIK
    public final void A5B(int i, double d) {
        A03();
        int i2 = i + 1;
        int[] iArr = this.A02;
        if (iArr.length < i2) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i2);
            C7384Etj.A0U(iArrCopyOf);
            this.A02 = iArrCopyOf;
        }
        double[] dArrCopyOf = this.A01;
        if (dArrCopyOf.length < i2) {
            dArrCopyOf = Arrays.copyOf(dArrCopyOf, i2);
            C7384Etj.A0U(dArrCopyOf);
            this.A01 = dArrCopyOf;
        }
        this.A02[i] = 2;
        dArrCopyOf[i] = d;
    }

    @Override // X.EIK
    public final void A5C(int i, long j) {
        A03();
        int i2 = i + 1;
        int[] iArr = this.A02;
        if (iArr.length < i2) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i2);
            C7384Etj.A0U(iArrCopyOf);
            this.A02 = iArrCopyOf;
        }
        long[] jArrCopyOf = this.A03;
        if (jArrCopyOf.length < i2) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i2);
            C7384Etj.A0U(jArrCopyOf);
            this.A03 = jArrCopyOf;
        }
        this.A02[i] = 1;
        jArrCopyOf[i] = j;
    }

    @Override // X.EIK
    public final void A5D(int i) {
        A03();
        int i2 = i + 1;
        int[] iArrCopyOf = this.A02;
        if (iArrCopyOf.length < i2) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i2);
            C7384Etj.A0U(iArrCopyOf);
            this.A02 = iArrCopyOf;
        }
        iArrCopyOf[i] = 5;
    }

    @Override // X.EIK
    public final void A6F() {
        A03();
        this.A02 = new int[0];
        this.A03 = new long[0];
        this.A01 = new double[0];
        this.A04 = new String[0];
        this.A05 = new byte[0][];
    }

    @Override // X.EIK
    public final String ALa(int i) {
        A03();
        Cursor cursor = this.A00;
        if (cursor == null) {
            EJB.A00("no row", 21);
            throw F60.createAndThrow();
        }
        A01(cursor, i);
        String string = cursor.getString(i);
        C7384Etj.A0U(string);
        return string;
    }

    @Override // X.EIK
    public final boolean AgN() {
        A03();
        A00();
        Cursor cursor = this.A00;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.EIK
    public final byte[] getBlob(int i) {
        A03();
        Cursor cursor = this.A00;
        if (cursor == null) {
            EJB.A00("no row", 21);
            throw F60.createAndThrow();
        }
        A01(cursor, i);
        byte[] blob = cursor.getBlob(i);
        C7384Etj.A0U(blob);
        return blob;
    }

    @Override // X.EIK
    public final int getColumnCount() {
        A03();
        A00();
        Cursor cursor = this.A00;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    @Override // X.EIK
    public final String getColumnName(int i) {
        A03();
        A00();
        Cursor cursor = this.A00;
        if (cursor == null) {
            throw new IllegalStateException("Required value was null.");
        }
        A01(cursor, i);
        String columnName = cursor.getColumnName(i);
        C7384Etj.A0U(columnName);
        return columnName;
    }

    @Override // X.EIK
    public final long getLong(int i) {
        A03();
        Cursor cursor = this.A00;
        if (cursor != null) {
            A01(cursor, i);
            return cursor.getLong(i);
        }
        EJB.A00("no row", 21);
        throw F60.createAndThrow();
    }

    @Override // X.EIK
    public final boolean isNull(int i) {
        A03();
        Cursor cursor = this.A00;
        if (cursor != null) {
            A01(cursor, i);
            return cursor.isNull(i);
        }
        EJB.A00("no row", 21);
        throw F60.createAndThrow();
    }

    @Override // X.EIK
    public final void reset() {
        A03();
        Cursor cursor = this.A00;
        if (cursor != null) {
            cursor.close();
        }
        this.A00 = null;
    }
}

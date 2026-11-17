package X;

/* loaded from: classes5.dex */
public final class EIL implements EIK {
    public final EIK A00;

    public EIL(EIK eik) {
        C7384Etj.A0Y(eik, 0);
        this.A00 = eik;
    }

    @Override // X.EIK
    public final void A5A(int i, byte[] bArr) {
        C7384Etj.A0Y(bArr, 1);
        this.A00.A5A(i, bArr);
    }

    @Override // X.EIK
    public final void A5F(int i, String str) {
        C7384Etj.A0Y(str, 1);
        this.A00.A5F(i, str);
    }

    @Override // X.EIK
    public final void A5B(int i, double d) {
        this.A00.A5B(i, d);
    }

    @Override // X.EIK
    public final void A5C(int i, long j) {
        this.A00.A5C(i, j);
    }

    @Override // X.EIK
    public final void A5D(int i) {
        this.A00.A5D(i);
    }

    @Override // X.EIK
    public final void A6F() {
        this.A00.A6F();
    }

    @Override // X.EIK
    public final boolean ACx(int i) {
        return this.A00.ACx(i);
    }

    @Override // X.EIK
    public final String ALa(int i) {
        return this.A00.ALa(i);
    }

    @Override // X.EIK
    public final boolean AgN() {
        return this.A00.AgN();
    }

    @Override // X.EIK, java.lang.AutoCloseable
    public final void close() {
        EIK eik = this.A00;
        eik.reset();
        eik.A6F();
    }

    @Override // X.EIK
    public final byte[] getBlob(int i) {
        return this.A00.getBlob(i);
    }

    @Override // X.EIK
    public final int getColumnCount() {
        return this.A00.getColumnCount();
    }

    @Override // X.EIK
    public final String getColumnName(int i) {
        return this.A00.getColumnName(i);
    }

    @Override // X.EIK
    public final long getLong(int i) {
        return this.A00.getLong(i);
    }

    @Override // X.EIK
    public final boolean isNull(int i) {
        return this.A00.isNull(i);
    }

    @Override // X.EIK
    public final void reset() {
        this.A00.reset();
    }
}

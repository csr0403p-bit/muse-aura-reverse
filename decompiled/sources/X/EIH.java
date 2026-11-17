package X;

/* loaded from: classes5.dex */
public final class EIH implements EIK {
    public final /* synthetic */ EIK A00;

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
        throw C3cG.A0Q("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // X.EIK
    public final boolean AgN() {
        throw C3cG.A0Q("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // X.EIK, java.lang.AutoCloseable
    public final void close() {
        throw C3cG.A0Q("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // X.EIK
    public final byte[] getBlob(int i) {
        throw C3cG.A0Q("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // X.EIK
    public final int getColumnCount() {
        throw C3cG.A0Q("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // X.EIK
    public final String getColumnName(int i) {
        throw C3cG.A0Q("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // X.EIK
    public final long getLong(int i) {
        throw C3cG.A0Q("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // X.EIK
    public final boolean isNull(int i) {
        throw C3cG.A0Q("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // X.EIK
    public final void reset() {
        throw C3cG.A0Q("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    public EIH(EIK eik) {
        this.A00 = eik;
    }
}

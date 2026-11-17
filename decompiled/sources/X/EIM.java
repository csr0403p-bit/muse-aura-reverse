package X;

import androidx.room.coroutines.PooledConnectionImpl;

/* loaded from: classes5.dex */
public final class EIM implements EIK {
    public final long A00;
    public final EIK A01;
    public final /* synthetic */ PooledConnectionImpl A02;

    public EIM(PooledConnectionImpl pooledConnectionImpl, EIK eik) {
        C7384Etj.A0Y(eik, 1);
        this.A02 = pooledConnectionImpl;
        this.A01 = eik;
        this.A00 = BV7.A0Q();
    }

    @Override // X.EIK
    public final void A5A(int i, byte[] bArr) {
        String str;
        C7384Etj.A0Y(bArr, 1);
        if (this.A02.A04) {
            str = "Statement is recycled";
        } else {
            if (this.A00 == BV7.A0Q()) {
                this.A01.A5A(i, bArr);
                return;
            }
            str = "Attempted to use statement on a different thread";
        }
        EJB.A00(str, 21);
        throw F60.createAndThrow();
    }

    @Override // X.EIK
    public final void A5F(int i, String str) {
        String str2;
        C7384Etj.A0Y(str, 1);
        if (this.A02.A04) {
            str2 = "Statement is recycled";
        } else {
            if (this.A00 == BV7.A0Q()) {
                this.A01.A5F(i, str);
                return;
            }
            str2 = "Attempted to use statement on a different thread";
        }
        EJB.A00(str2, 21);
        throw F60.createAndThrow();
    }

    @Override // X.EIK
    public final void A5B(int i, double d) {
        String str;
        if (this.A02.A04) {
            str = "Statement is recycled";
        } else {
            if (this.A00 == BV7.A0Q()) {
                this.A01.A5B(i, d);
                return;
            }
            str = "Attempted to use statement on a different thread";
        }
        EJB.A00(str, 21);
        throw F60.createAndThrow();
    }

    @Override // X.EIK
    public final void A5C(int i, long j) {
        String str;
        if (this.A02.A04) {
            str = "Statement is recycled";
        } else {
            if (this.A00 == BV7.A0Q()) {
                this.A01.A5C(i, j);
                return;
            }
            str = "Attempted to use statement on a different thread";
        }
        EJB.A00(str, 21);
        throw F60.createAndThrow();
    }

    @Override // X.EIK
    public final void A5D(int i) {
        String str;
        if (this.A02.A04) {
            str = "Statement is recycled";
        } else {
            if (this.A00 == BV7.A0Q()) {
                this.A01.A5D(i);
                return;
            }
            str = "Attempted to use statement on a different thread";
        }
        EJB.A00(str, 21);
        throw F60.createAndThrow();
    }

    @Override // X.EIK
    public final void A6F() {
        String str;
        if (this.A02.A04) {
            str = "Statement is recycled";
        } else {
            if (this.A00 == BV7.A0Q()) {
                this.A01.A6F();
                return;
            }
            str = "Attempted to use statement on a different thread";
        }
        EJB.A00(str, 21);
        throw F60.createAndThrow();
    }

    @Override // X.EIK
    public final String ALa(int i) {
        String str;
        if (this.A02.A04) {
            str = "Statement is recycled";
        } else {
            if (this.A00 == BV7.A0Q()) {
                return this.A01.ALa(i);
            }
            str = "Attempted to use statement on a different thread";
        }
        EJB.A00(str, 21);
        throw F60.createAndThrow();
    }

    @Override // X.EIK
    public final boolean AgN() {
        String str;
        if (this.A02.A04) {
            str = "Statement is recycled";
        } else {
            if (this.A00 == BV7.A0Q()) {
                return this.A01.AgN();
            }
            str = "Attempted to use statement on a different thread";
        }
        EJB.A00(str, 21);
        throw F60.createAndThrow();
    }

    @Override // X.EIK, java.lang.AutoCloseable
    public final void close() {
        String str;
        if (this.A02.A04) {
            str = "Statement is recycled";
        } else {
            if (this.A00 == BV7.A0Q()) {
                this.A01.close();
                return;
            }
            str = "Attempted to use statement on a different thread";
        }
        EJB.A00(str, 21);
        throw F60.createAndThrow();
    }

    @Override // X.EIK
    public final byte[] getBlob(int i) {
        String str;
        if (this.A02.A04) {
            str = "Statement is recycled";
        } else {
            if (this.A00 == BV7.A0Q()) {
                return this.A01.getBlob(i);
            }
            str = "Attempted to use statement on a different thread";
        }
        EJB.A00(str, 21);
        throw F60.createAndThrow();
    }

    @Override // X.EIK
    public final int getColumnCount() {
        String str;
        if (this.A02.A04) {
            str = "Statement is recycled";
        } else {
            if (this.A00 == BV7.A0Q()) {
                return this.A01.getColumnCount();
            }
            str = "Attempted to use statement on a different thread";
        }
        EJB.A00(str, 21);
        throw F60.createAndThrow();
    }

    @Override // X.EIK
    public final String getColumnName(int i) {
        String str;
        if (this.A02.A04) {
            str = "Statement is recycled";
        } else {
            if (this.A00 == BV7.A0Q()) {
                return this.A01.getColumnName(i);
            }
            str = "Attempted to use statement on a different thread";
        }
        EJB.A00(str, 21);
        throw F60.createAndThrow();
    }

    @Override // X.EIK
    public final long getLong(int i) {
        String str;
        if (this.A02.A04) {
            str = "Statement is recycled";
        } else {
            if (this.A00 == BV7.A0Q()) {
                return this.A01.getLong(i);
            }
            str = "Attempted to use statement on a different thread";
        }
        EJB.A00(str, 21);
        throw F60.createAndThrow();
    }

    @Override // X.EIK
    public final boolean isNull(int i) {
        String str;
        if (this.A02.A04) {
            str = "Statement is recycled";
        } else {
            if (this.A00 == BV7.A0Q()) {
                return this.A01.isNull(i);
            }
            str = "Attempted to use statement on a different thread";
        }
        EJB.A00(str, 21);
        throw F60.createAndThrow();
    }

    @Override // X.EIK
    public final void reset() {
        String str;
        if (this.A02.A04) {
            str = "Statement is recycled";
        } else {
            if (this.A00 == BV7.A0Q()) {
                this.A01.reset();
                return;
            }
            str = "Attempted to use statement on a different thread";
        }
        EJB.A00(str, 21);
        throw F60.createAndThrow();
    }

    @Override // X.EIK
    public final /* synthetic */ boolean ACx(int i) {
        return AnonymousClass002.A1L((getLong(i) > 0L ? 1 : (getLong(i) == 0L ? 0 : -1)));
    }
}

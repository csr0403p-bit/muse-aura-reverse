package X;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes5.dex */
public final class EI8 extends EIA {
    public final Integer A00;

    @Override // X.EIK, java.lang.AutoCloseable
    public final void close() {
        super.A00 = true;
    }

    @Override // X.EIK
    public final boolean AgN() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        EHO eho;
        int iIntValue = this.A00.intValue();
        if (iIntValue == 0) {
            ((EHO) this.A01).A00.setTransactionSuccessful();
        } else if (iIntValue != 1) {
            if (iIntValue != 2) {
                eho = (EHO) this.A01;
                if (iIntValue == 3) {
                    eho.A00.beginTransactionNonExclusive();
                    return false;
                }
                F0C<Method> f0c = EHO.A01;
                if (f0c.getValue() != null) {
                    F0C<Method> f0c2 = EHO.A02;
                    if (f0c2.getValue() != null) {
                        Method value = f0c.getValue();
                        C7384Etj.A0X(value);
                        Method value2 = f0c2.getValue();
                        C7384Etj.A0X(value2);
                        Object objInvoke = value2.invoke(eho.A00, null);
                        if (objInvoke == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        value.invoke(objInvoke, 0, null, 0, null);
                        return false;
                    }
                }
            } else {
                eho = (EHO) this.A01;
            }
            eho.A00.beginTransaction();
            return false;
        }
        ((EHO) this.A01).A00.endTransaction();
        return false;
    }

    public EI8(EI3 ei3, Integer num, String str) {
        super(ei3, str);
        this.A00 = num;
    }

    public static void A00(EIA eia) {
        eia.A03();
        EJB.A00("column index out of range", 25);
        throw F60.createAndThrow();
    }

    @Override // X.EIK
    public final void A5A(int i, byte[] bArr) {
        A00(this);
        throw F60.createAndThrow();
    }

    @Override // X.EIK
    public final void A5B(int i, double d) {
        A00(this);
        throw F60.createAndThrow();
    }

    @Override // X.EIK
    public final void A5C(int i, long j) {
        A00(this);
        throw F60.createAndThrow();
    }

    @Override // X.EIK
    public final void A5D(int i) {
        A00(this);
        throw F60.createAndThrow();
    }

    @Override // X.EIK
    public final void A5F(int i, String str) {
        A00(this);
        throw F60.createAndThrow();
    }

    @Override // X.EIK
    public final void A6F() {
        A03();
    }

    @Override // X.EIK
    public final String ALa(int i) {
        EIA.A02(this);
        throw F60.createAndThrow();
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

package X;

/* loaded from: classes5.dex */
public final class EI4 implements InterfaceC6578EHw {
    public final String A00;
    public final Object[] A01;

    public static final void A00(EIB eib, Object[] objArr) {
        double dA02;
        long jA05;
        int iA0F;
        if (objArr != null) {
            int length = objArr.length;
            int i = 0;
            while (i < length) {
                Object obj = objArr[i];
                i++;
                if (obj == null) {
                    eib.A5D(i);
                } else if (obj instanceof byte[]) {
                    eib.A5A(i, (byte[]) obj);
                } else {
                    if (obj instanceof Float) {
                        dA02 = AnonymousClass001.A02(obj);
                    } else if (obj instanceof Double) {
                        dA02 = BV6.A00(obj);
                    } else {
                        if (obj instanceof Long) {
                            jA05 = C3cG.A05(obj);
                        } else {
                            if (obj instanceof Integer) {
                                iA0F = AnonymousClass001.A0F(obj);
                            } else if (obj instanceof Short) {
                                iA0F = ((Number) obj).shortValue();
                            } else if (obj instanceof Byte) {
                                iA0F = ((Number) obj).byteValue();
                            } else if (obj instanceof String) {
                                eib.A5E(i, (String) obj);
                            } else {
                                if (!(obj instanceof Boolean)) {
                                    StringBuilder sbA0f = C3cG.A0f(obj, "Cannot bind ");
                                    sbA0f.append(" at index ");
                                    sbA0f.append(i);
                                    throw C8j3.A0w(" Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String", sbA0f);
                                }
                                jA05 = BV5.A06(AnonymousClass001.A1X(obj) ? 1 : 0);
                            }
                            jA05 = iA0F;
                        }
                        eib.A5C(i, jA05);
                    }
                    eib.A5B(i, dA02);
                }
            }
        }
    }

    @Override // X.InterfaceC6578EHw
    public final void A5H(EIB eib) {
        A00(eib, this.A01);
    }

    @Override // X.InterfaceC6578EHw
    public final String AKr() {
        return this.A00;
    }

    public EI4(String str, Object[] objArr) {
        this.A00 = str;
        this.A01 = objArr;
    }
}

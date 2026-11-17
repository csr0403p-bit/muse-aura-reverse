package X;

import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import java.nio.charset.Charset;
import java.util.List;

/* loaded from: classes6.dex */
public final class GGQ implements InterfaceC9369GGf {
    public int A00;
    public int A01 = 0;
    public int A02;
    public final GGT A03;

    public static GGT A01(GGQ ggq) throws InvalidProtocolBufferException.InvalidWireTypeException {
        A08(ggq, 0);
        return ggq.A03;
    }

    public static GGT A02(GGQ ggq) throws InvalidProtocolBufferException.InvalidWireTypeException {
        A08(ggq, 1);
        return ggq.A03;
    }

    public static GGT A03(GGQ ggq) throws InvalidProtocolBufferException.InvalidWireTypeException {
        A08(ggq, 5);
        return ggq.A03;
    }

    @Override // X.InterfaceC9369GGf
    public final void AZ9(List<Boolean> list) throws InvalidProtocolBufferException {
        int iA0K;
        int i = this.A02 & 7;
        if (i != 0) {
            if (i != 2) {
                throw AbstractC7608F5v.A0G();
            }
            GGT ggt = this.A03;
            int iA00 = A00(ggt);
            do {
                list.add(Boolean.valueOf(ggt.A0Y()));
            } while (ggt.A0E() < iA00);
            A07(iA00);
            return;
        }
        do {
            GGT ggt2 = this.A03;
            list.add(Boolean.valueOf(ggt2.A0Y()));
            if (ggt2.A0X()) {
                return;
            } else {
                iA0K = ggt2.A0K();
            }
        } while (iA0K == this.A02);
        this.A01 = iA0K;
    }

    @Override // X.InterfaceC9369GGf
    public final void AZG(List<Double> list) throws InvalidProtocolBufferException {
        int iA0K;
        int i = this.A02 & 7;
        if (i == 1) {
            do {
                GGT ggt = this.A03;
                list.add(Double.valueOf(ggt.A0C()));
                if (ggt.A0X()) {
                    return;
                } else {
                    iA0K = ggt.A0K();
                }
            } while (iA0K == this.A02);
            this.A01 = iA0K;
            return;
        }
        if (i != 2) {
            throw AbstractC7608F5v.A0G();
        }
        GGT ggt2 = this.A03;
        int iA0L = ggt2.A0L();
        if ((iA0L & 7) != 0) {
            throw AbstractC7607F5u.A0k("Failed to parse the message.");
        }
        int iA0E = ggt2.A0E() + iA0L;
        do {
            list.add(Double.valueOf(ggt2.A0C()));
        } while (ggt2.A0E() < iA0E);
    }

    @Override // X.InterfaceC9369GGf
    public final void AZH(List<Integer> list) throws InvalidProtocolBufferException {
        int iA0K;
        int i = this.A02 & 7;
        if (i != 0) {
            if (i != 2) {
                throw AbstractC7608F5v.A0G();
            }
            GGT ggt = this.A03;
            int iA00 = A00(ggt);
            do {
                AbstractC7608F5v.A1A(ggt.A0F(), list);
            } while (ggt.A0E() < iA00);
            A07(iA00);
            return;
        }
        do {
            GGT ggt2 = this.A03;
            AbstractC7608F5v.A1A(ggt2.A0F(), list);
            if (ggt2.A0X()) {
                return;
            } else {
                iA0K = ggt2.A0K();
            }
        } while (iA0K == this.A02);
        this.A01 = iA0K;
    }

    @Override // X.InterfaceC9369GGf
    public final void AZI(List<Integer> list) throws InvalidProtocolBufferException {
        int iA0K;
        int i = this.A02 & 7;
        if (i == 2) {
            GGT ggt = this.A03;
            int iA0L = ggt.A0L();
            if ((iA0L & 3) != 0) {
                throw AbstractC7607F5u.A0k("Failed to parse the message.");
            }
            int iA0E = ggt.A0E() + iA0L;
            do {
                AbstractC7608F5v.A1A(ggt.A0G(), list);
            } while (ggt.A0E() < iA0E);
            return;
        }
        if (i != 5) {
            throw AbstractC7608F5v.A0G();
        }
        do {
            GGT ggt2 = this.A03;
            AbstractC7608F5v.A1A(ggt2.A0G(), list);
            if (ggt2.A0X()) {
                return;
            } else {
                iA0K = ggt2.A0K();
            }
        } while (iA0K == this.A02);
        this.A01 = iA0K;
    }

    @Override // X.InterfaceC9369GGf
    public final void AZJ(List<Long> list) throws InvalidProtocolBufferException {
        int iA0K;
        int i = this.A02 & 7;
        if (i == 1) {
            do {
                GGT ggt = this.A03;
                AbstractC7608F5v.A1W(list, ggt.A0N());
                if (ggt.A0X()) {
                    return;
                } else {
                    iA0K = ggt.A0K();
                }
            } while (iA0K == this.A02);
            this.A01 = iA0K;
            return;
        }
        if (i != 2) {
            throw AbstractC7608F5v.A0G();
        }
        GGT ggt2 = this.A03;
        int iA0L = ggt2.A0L();
        if ((iA0L & 7) != 0) {
            throw AbstractC7607F5u.A0k("Failed to parse the message.");
        }
        int iA0E = ggt2.A0E() + iA0L;
        do {
            AbstractC7608F5v.A1W(list, ggt2.A0N());
        } while (ggt2.A0E() < iA0E);
    }

    @Override // X.InterfaceC9369GGf
    public final void AZK(List<Float> list) throws InvalidProtocolBufferException {
        int iA0K;
        int i = this.A02 & 7;
        if (i == 2) {
            GGT ggt = this.A03;
            int iA0L = ggt.A0L();
            if ((iA0L & 3) != 0) {
                throw AbstractC7607F5u.A0k("Failed to parse the message.");
            }
            int iA0E = ggt.A0E() + iA0L;
            do {
                list.add(Float.valueOf(ggt.A0D()));
            } while (ggt.A0E() < iA0E);
            return;
        }
        if (i != 5) {
            throw AbstractC7608F5v.A0G();
        }
        do {
            GGT ggt2 = this.A03;
            list.add(Float.valueOf(ggt2.A0D()));
            if (ggt2.A0X()) {
                return;
            } else {
                iA0K = ggt2.A0K();
            }
        } while (iA0K == this.A02);
        this.A01 = iA0K;
    }

    @Override // X.InterfaceC9369GGf
    public final void AZO(List<Integer> list) throws InvalidProtocolBufferException {
        int iA0K;
        int i = this.A02 & 7;
        if (i != 0) {
            if (i != 2) {
                throw AbstractC7608F5v.A0G();
            }
            GGT ggt = this.A03;
            int iA00 = A00(ggt);
            do {
                AbstractC7608F5v.A1A(ggt.A0H(), list);
            } while (ggt.A0E() < iA00);
            A07(iA00);
            return;
        }
        do {
            GGT ggt2 = this.A03;
            AbstractC7608F5v.A1A(ggt2.A0H(), list);
            if (ggt2.A0X()) {
                return;
            } else {
                iA0K = ggt2.A0K();
            }
        } while (iA0K == this.A02);
        this.A01 = iA0K;
    }

    @Override // X.InterfaceC9369GGf
    public final void AZP(List<Long> list) throws InvalidProtocolBufferException {
        int iA0K;
        int i = this.A02 & 7;
        if (i != 0) {
            if (i != 2) {
                throw AbstractC7608F5v.A0G();
            }
            GGT ggt = this.A03;
            int iA00 = A00(ggt);
            do {
                AbstractC7608F5v.A1W(list, ggt.A0O());
            } while (ggt.A0E() < iA00);
            A07(iA00);
            return;
        }
        do {
            GGT ggt2 = this.A03;
            AbstractC7608F5v.A1W(list, ggt2.A0O());
            if (ggt2.A0X()) {
                return;
            } else {
                iA0K = ggt2.A0K();
            }
        } while (iA0K == this.A02);
        this.A01 = iA0K;
    }

    @Override // X.InterfaceC9369GGf
    public final void AZU(List<Integer> list) throws InvalidProtocolBufferException {
        int iA0K;
        int i = this.A02 & 7;
        if (i == 2) {
            GGT ggt = this.A03;
            int iA0L = ggt.A0L();
            if ((iA0L & 3) != 0) {
                throw AbstractC7607F5u.A0k("Failed to parse the message.");
            }
            int iA0E = ggt.A0E() + iA0L;
            do {
                AbstractC7608F5v.A1A(ggt.A0I(), list);
            } while (ggt.A0E() < iA0E);
            return;
        }
        if (i != 5) {
            throw AbstractC7608F5v.A0G();
        }
        do {
            GGT ggt2 = this.A03;
            AbstractC7608F5v.A1A(ggt2.A0I(), list);
            if (ggt2.A0X()) {
                return;
            } else {
                iA0K = ggt2.A0K();
            }
        } while (iA0K == this.A02);
        this.A01 = iA0K;
    }

    @Override // X.InterfaceC9369GGf
    public final void AZV(List<Long> list) throws InvalidProtocolBufferException {
        int iA0K;
        int i = this.A02 & 7;
        if (i == 1) {
            do {
                GGT ggt = this.A03;
                AbstractC7608F5v.A1W(list, ggt.A0P());
                if (ggt.A0X()) {
                    return;
                } else {
                    iA0K = ggt.A0K();
                }
            } while (iA0K == this.A02);
            this.A01 = iA0K;
            return;
        }
        if (i != 2) {
            throw AbstractC7608F5v.A0G();
        }
        GGT ggt2 = this.A03;
        int iA0L = ggt2.A0L();
        if ((iA0L & 7) != 0) {
            throw AbstractC7607F5u.A0k("Failed to parse the message.");
        }
        int iA0E = ggt2.A0E() + iA0L;
        do {
            AbstractC7608F5v.A1W(list, ggt2.A0P());
        } while (ggt2.A0E() < iA0E);
    }

    @Override // X.InterfaceC9369GGf
    public final void AZW(List<Integer> list) throws InvalidProtocolBufferException {
        int iA0K;
        int i = this.A02 & 7;
        if (i != 0) {
            if (i != 2) {
                throw AbstractC7608F5v.A0G();
            }
            GGT ggt = this.A03;
            int iA00 = A00(ggt);
            do {
                AbstractC7608F5v.A1A(ggt.A0J(), list);
            } while (ggt.A0E() < iA00);
            A07(iA00);
            return;
        }
        do {
            GGT ggt2 = this.A03;
            AbstractC7608F5v.A1A(ggt2.A0J(), list);
            if (ggt2.A0X()) {
                return;
            } else {
                iA0K = ggt2.A0K();
            }
        } while (iA0K == this.A02);
        this.A01 = iA0K;
    }

    @Override // X.InterfaceC9369GGf
    public final void AZX(List<Long> list) throws InvalidProtocolBufferException {
        int iA0K;
        int i = this.A02 & 7;
        if (i != 0) {
            if (i != 2) {
                throw AbstractC7608F5v.A0G();
            }
            GGT ggt = this.A03;
            int iA00 = A00(ggt);
            do {
                AbstractC7608F5v.A1W(list, ggt.A0Q());
            } while (ggt.A0E() < iA00);
            A07(iA00);
            return;
        }
        do {
            GGT ggt2 = this.A03;
            AbstractC7608F5v.A1W(list, ggt2.A0Q());
            if (ggt2.A0X()) {
                return;
            } else {
                iA0K = ggt2.A0K();
            }
        } while (iA0K == this.A02);
        this.A01 = iA0K;
    }

    @Override // X.InterfaceC9369GGf
    public final void AZY(List<Integer> list) throws InvalidProtocolBufferException {
        int iA0K;
        int i = this.A02 & 7;
        if (i != 0) {
            if (i != 2) {
                throw AbstractC7608F5v.A0G();
            }
            GGT ggt = this.A03;
            int iA00 = A00(ggt);
            do {
                AbstractC7608F5v.A1A(ggt.A0L(), list);
            } while (ggt.A0E() < iA00);
            A07(iA00);
            return;
        }
        do {
            GGT ggt2 = this.A03;
            AbstractC7608F5v.A1A(ggt2.A0L(), list);
            if (ggt2.A0X()) {
                return;
            } else {
                iA0K = ggt2.A0K();
            }
        } while (iA0K == this.A02);
        this.A01 = iA0K;
    }

    @Override // X.InterfaceC9369GGf
    public final void AZZ(List<Long> list) throws InvalidProtocolBufferException {
        int iA0K;
        int i = this.A02 & 7;
        if (i != 0) {
            if (i != 2) {
                throw AbstractC7608F5v.A0G();
            }
            GGT ggt = this.A03;
            int iA00 = A00(ggt);
            do {
                AbstractC7608F5v.A1W(list, ggt.A0R());
            } while (ggt.A0E() < iA00);
            A07(iA00);
            return;
        }
        do {
            GGT ggt2 = this.A03;
            AbstractC7608F5v.A1W(list, ggt2.A0R());
            if (ggt2.A0X()) {
                return;
            } else {
                iA0K = ggt2.A0K();
            }
        } while (iA0K == this.A02);
        this.A01 = iA0K;
    }

    public static Object A04(GGQ ggq, HyE hyE, InterfaceC9366GGc interfaceC9366GGc) {
        int i = ggq.A00;
        ggq.A00 = ((ggq.A02 >>> 3) << 3) | 4;
        try {
            Object objARC = interfaceC9366GGc.ARC();
            interfaceC9366GGc.AQc(hyE, ggq, objARC);
            interfaceC9366GGc.AQ3(objARC);
            if (ggq.A02 == ggq.A00) {
                return objARC;
            }
            throw AbstractC7607F5u.A0k("Failed to parse the message.");
        } finally {
            ggq.A00 = i;
        }
    }

    public static Object A05(GGQ ggq, HyE hyE, InterfaceC9366GGc interfaceC9366GGc) throws InvalidProtocolBufferException {
        GGT ggt = ggq.A03;
        int iA0L = ggt.A0L();
        if (ggt.A00 >= 100) {
            throw AbstractC7607F5u.A0k("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iA0M = ggt.A0M(iA0L);
        Object objARC = interfaceC9366GGc.ARC();
        ggt.A00++;
        interfaceC9366GGc.AQc(hyE, ggq, objARC);
        interfaceC9366GGc.AQ3(objARC);
        ggt.A0V(0);
        ggt.A00--;
        ggt.A0W(iA0M);
        return objARC;
    }

    public static Object A06(GGQ ggq, HyE hyE, EnumC10214Gra enumC10214Gra, Class cls) throws InvalidProtocolBufferException.InvalidWireTypeException {
        long jA0R;
        int iA0L;
        switch (GH0.A00[enumC10214Gra.ordinal()]) {
            case 1:
                return Boolean.valueOf(A01(ggq).A0Y());
            case 2:
                A08(ggq, 2);
                return ggq.A03.A0S();
            case 3:
                return Double.valueOf(A02(ggq).A0C());
            case 4:
                iA0L = A01(ggq).A0F();
                return Integer.valueOf(iA0L);
            case 5:
                iA0L = A03(ggq).A0G();
                return Integer.valueOf(iA0L);
            case 6:
                jA0R = A02(ggq).A0N();
                return Long.valueOf(jA0R);
            case 7:
                return Float.valueOf(A03(ggq).A0D());
            case 8:
                iA0L = A01(ggq).A0H();
                return Integer.valueOf(iA0L);
            case 9:
                jA0R = A01(ggq).A0O();
                return Long.valueOf(jA0R);
            case 10:
                A08(ggq, 2);
                return A05(ggq, hyE, GGS.A02.A00(cls));
            case 11:
                iA0L = A03(ggq).A0I();
                return Integer.valueOf(iA0L);
            case 12:
                jA0R = A02(ggq).A0P();
                return Long.valueOf(jA0R);
            case 13:
                iA0L = A01(ggq).A0J();
                return Integer.valueOf(iA0L);
            case 14:
                jA0R = A01(ggq).A0Q();
                return Long.valueOf(jA0R);
            case 15:
                A08(ggq, 2);
                return ggq.A03.A0U();
            case 16:
                iA0L = A01(ggq).A0L();
                return Integer.valueOf(iA0L);
            case 17:
                jA0R = A01(ggq).A0R();
                return Long.valueOf(jA0R);
            default:
                throw BV4.A0c("unsupported field type.");
        }
    }

    private void A07(int i) throws InvalidProtocolBufferException {
        if (this.A03.A0E() != i) {
            throw AbstractC7608F5v.A0H();
        }
    }

    public static void A08(GGQ ggq, int i) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if ((ggq.A02 & 7) != i) {
            throw AbstractC7608F5v.A0G();
        }
    }

    @Override // X.InterfaceC9369GGf
    public final int AFb() throws InvalidProtocolBufferException {
        int iA0K = this.A01;
        if (iA0K != 0) {
            this.A02 = iA0K;
            this.A01 = 0;
        } else {
            iA0K = this.A03.A0K();
            this.A02 = iA0K;
            if (iA0K == 0) {
                return Integer.MAX_VALUE;
            }
        }
        if (iA0K != this.A00) {
            return iA0K >>> 3;
        }
        return Integer.MAX_VALUE;
    }

    public GGQ(GGT ggt) {
        Charset charset = GGV.A03;
        this.A03 = ggt;
        ggt.A01 = this;
    }

    public static int A00(GGT ggt) {
        return ggt.A0E() + ggt.A0L();
    }
}

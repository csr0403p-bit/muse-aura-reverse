package X;

import androidx.glance.appwidget.protobuf.InvalidProtocolBufferException;
import java.nio.charset.Charset;
import java.util.List;

/* loaded from: classes6.dex */
public final class GG3 implements GGK {
    public int A00;
    public int A01 = 0;
    public int A02;
    public final GG9 A03;

    @Override // X.GGK
    public final void AZ9(List<Boolean> target) throws InvalidProtocolBufferException {
        int iA0K;
        int i = this.A02 & 7;
        if (i != 0) {
            if (i != 2) {
                throw InvalidProtocolBufferException.A00();
            }
            GG9 gg9 = this.A03;
            int iA02 = A02(gg9);
            do {
                target.add(Boolean.valueOf(gg9.A0W()));
            } while (gg9.A0E() < iA02);
            A04(iA02);
            return;
        }
        do {
            GG9 gg92 = this.A03;
            target.add(Boolean.valueOf(gg92.A0W()));
            if (gg92.A0V()) {
                return;
            } else {
                iA0K = gg92.A0K();
            }
        } while (iA0K == this.A02);
        this.A01 = iA0K;
    }

    @Override // X.GGK
    public final void AZG(List<Double> target) throws InvalidProtocolBufferException {
        int iA0K;
        int i = this.A02 & 7;
        if (i != 1) {
            if (i != 2) {
                throw InvalidProtocolBufferException.A00();
            }
            GG9 gg9 = this.A03;
            int iA01 = A01(gg9);
            do {
                target.add(Double.valueOf(gg9.A0C()));
            } while (gg9.A0E() < iA01);
            return;
        }
        do {
            GG9 gg92 = this.A03;
            target.add(Double.valueOf(gg92.A0C()));
            if (gg92.A0V()) {
                return;
            } else {
                iA0K = gg92.A0K();
            }
        } while (iA0K == this.A02);
        this.A01 = iA0K;
    }

    @Override // X.GGK
    public final void AZK(List<Float> target) throws InvalidProtocolBufferException {
        int iA0K;
        int i = this.A02 & 7;
        if (i == 2) {
            GG9 gg9 = this.A03;
            int iA00 = A00(gg9);
            do {
                target.add(Float.valueOf(gg9.A0D()));
            } while (gg9.A0E() < iA00);
            return;
        }
        if (i != 5) {
            throw InvalidProtocolBufferException.A00();
        }
        do {
            GG9 gg92 = this.A03;
            target.add(Float.valueOf(gg92.A0D()));
            if (gg92.A0V()) {
                return;
            } else {
                iA0K = gg92.A0K();
            }
        } while (iA0K == this.A02);
        this.A01 = iA0K;
    }

    private void A04(int expectedPosition) throws InvalidProtocolBufferException {
        if (this.A03.A0E() != expectedPosition) {
            throw AbstractC7609F5w.A0U("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public static void A05(int bytes) throws InvalidProtocolBufferException {
        if ((bytes & 3) != 0) {
            throw AbstractC7609F5w.A0U("Failed to parse the message.");
        }
    }

    public static void A06(int bytes) throws InvalidProtocolBufferException {
        if ((bytes & 7) != 0) {
            throw AbstractC7609F5w.A0U("Failed to parse the message.");
        }
    }

    public static void A07(GG3 gg3, int i) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if ((gg3.A02 & 7) != i) {
            throw InvalidProtocolBufferException.A00();
        }
    }

    public static void A08(GG3 gg3, AnonymousClass796 anonymousClass796, GG0 gg0, Object obj) {
        int i = gg3.A00;
        gg3.A00 = ((gg3.A02 >>> 3) << 3) | 4;
        try {
            gg0.AQd(anonymousClass796, gg3, obj);
            if (gg3.A02 == gg3.A00) {
            } else {
                throw AbstractC7609F5w.A0U("Failed to parse the message.");
            }
        } finally {
            gg3.A00 = i;
        }
    }

    public static void A09(GG3 gg3, AnonymousClass796 anonymousClass796, GG0 gg0, Object obj) throws InvalidProtocolBufferException {
        GG9 gg9 = gg3.A03;
        int iA0L = gg9.A0L();
        int i = gg9.A00;
        if (i >= 100) {
            throw AbstractC7609F5w.A0U("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iA0M = gg9.A0M(iA0L);
        gg9.A00 = i + 1;
        gg0.AQd(anonymousClass796, gg3, obj);
        boolean z = gg9 instanceof GGA;
        if (z) {
            if (((GGA) gg9).A02 != 0) {
                throw AbstractC7609F5w.A0U("Protocol message end-group tag did not match expected tag.");
            }
        } else if (((GGD) gg9).A02 != 0) {
            throw AbstractC7609F5w.A0U("Protocol message end-group tag did not match expected tag.");
        }
        gg9.A00--;
        if (z) {
            GGA gga = (GGA) gg9;
            gga.A01 = iA0M;
            GGA.A07(gga);
            return;
        }
        GGD ggd = (GGD) gg9;
        ggd.A01 = iA0M;
        int i2 = ggd.A03 + ggd.A00;
        ggd.A03 = i2;
        if (i2 <= iA0M) {
            ggd.A00 = 0;
            return;
        }
        int i3 = i2 - iA0M;
        ggd.A00 = i3;
        ggd.A03 = i2 - i3;
    }

    @Override // X.GGK
    public final void AZH(List<Integer> target) throws InvalidProtocolBufferException {
        int iA0K;
        int iA02;
        if (!(target instanceof GDU)) {
            int i = this.A02 & 7;
            if (i != 0) {
                if (i == 2) {
                    GG9 gg9 = this.A03;
                    iA02 = A02(gg9);
                    do {
                        AbstractC7608F5v.A1A(gg9.A0F(), target);
                    } while (gg9.A0E() < iA02);
                    A04(iA02);
                    return;
                }
                throw InvalidProtocolBufferException.A00();
            }
            do {
                GG9 gg92 = this.A03;
                AbstractC7608F5v.A1A(gg92.A0F(), target);
                if (gg92.A0V()) {
                    return;
                } else {
                    iA0K = gg92.A0K();
                }
            } while (iA0K == this.A02);
            this.A01 = iA0K;
        }
        GDU gdu = (GDU) target;
        int i2 = this.A02 & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                GG9 gg93 = this.A03;
                iA02 = A02(gg93);
                do {
                    gdu.A04(gg93.A0F());
                } while (gg93.A0E() < iA02);
                A04(iA02);
                return;
            }
            throw InvalidProtocolBufferException.A00();
        }
        do {
            GG9 gg94 = this.A03;
            gdu.A04(gg94.A0F());
            if (gg94.A0V()) {
                return;
            } else {
                iA0K = gg94.A0K();
            }
        } while (iA0K == this.A02);
        this.A01 = iA0K;
    }

    @Override // X.GGK
    public final void AZI(List<Integer> target) throws InvalidProtocolBufferException {
        int iA0K;
        if (!(target instanceof GDU)) {
            int i = this.A02 & 7;
            if (i == 2) {
                GG9 gg9 = this.A03;
                int iA00 = A00(gg9);
                do {
                    AbstractC7608F5v.A1A(gg9.A0G(), target);
                } while (gg9.A0E() < iA00);
                return;
            }
            if (i == 5) {
                do {
                    GG9 gg92 = this.A03;
                    AbstractC7608F5v.A1A(gg92.A0G(), target);
                    if (gg92.A0V()) {
                        return;
                    } else {
                        iA0K = gg92.A0K();
                    }
                } while (iA0K == this.A02);
                this.A01 = iA0K;
                return;
            }
            throw InvalidProtocolBufferException.A00();
        }
        GDU gdu = (GDU) target;
        int i2 = this.A02 & 7;
        if (i2 == 2) {
            GG9 gg93 = this.A03;
            int iA002 = A00(gg93);
            do {
                gdu.A04(gg93.A0G());
            } while (gg93.A0E() < iA002);
            return;
        }
        if (i2 == 5) {
            do {
                GG9 gg94 = this.A03;
                gdu.A04(gg94.A0G());
                if (gg94.A0V()) {
                    return;
                } else {
                    iA0K = gg94.A0K();
                }
            } while (iA0K == this.A02);
            this.A01 = iA0K;
            return;
        }
        throw InvalidProtocolBufferException.A00();
    }

    @Override // X.GGK
    public final void AZJ(List<Long> target) throws InvalidProtocolBufferException {
        int iA0K;
        if (!(target instanceof GDV)) {
            int i = this.A02 & 7;
            if (i != 1) {
                if (i == 2) {
                    GG9 gg9 = this.A03;
                    int iA01 = A01(gg9);
                    do {
                        AbstractC7608F5v.A1W(target, gg9.A0N());
                    } while (gg9.A0E() < iA01);
                    return;
                }
                throw InvalidProtocolBufferException.A00();
            }
            do {
                GG9 gg92 = this.A03;
                AbstractC7608F5v.A1W(target, gg92.A0N());
                if (gg92.A0V()) {
                    return;
                } else {
                    iA0K = gg92.A0K();
                }
            } while (iA0K == this.A02);
            this.A01 = iA0K;
        }
        GDV gdv = (GDV) target;
        int i2 = this.A02 & 7;
        if (i2 != 1) {
            if (i2 == 2) {
                GG9 gg93 = this.A03;
                int iA012 = A01(gg93);
                do {
                    gdv.A04(gg93.A0N());
                } while (gg93.A0E() < iA012);
                return;
            }
            throw InvalidProtocolBufferException.A00();
        }
        do {
            GG9 gg94 = this.A03;
            gdv.A04(gg94.A0N());
            if (gg94.A0V()) {
                return;
            } else {
                iA0K = gg94.A0K();
            }
        } while (iA0K == this.A02);
        this.A01 = iA0K;
    }

    @Override // X.GGK
    public final void AZO(List<Integer> target) throws InvalidProtocolBufferException {
        int iA0K;
        int iA02;
        if (!(target instanceof GDU)) {
            int i = this.A02 & 7;
            if (i != 0) {
                if (i == 2) {
                    GG9 gg9 = this.A03;
                    iA02 = A02(gg9);
                    do {
                        AbstractC7608F5v.A1A(gg9.A0H(), target);
                    } while (gg9.A0E() < iA02);
                    A04(iA02);
                    return;
                }
                throw InvalidProtocolBufferException.A00();
            }
            do {
                GG9 gg92 = this.A03;
                AbstractC7608F5v.A1A(gg92.A0H(), target);
                if (gg92.A0V()) {
                    return;
                } else {
                    iA0K = gg92.A0K();
                }
            } while (iA0K == this.A02);
            this.A01 = iA0K;
        }
        GDU gdu = (GDU) target;
        int i2 = this.A02 & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                GG9 gg93 = this.A03;
                iA02 = A02(gg93);
                do {
                    gdu.A04(gg93.A0H());
                } while (gg93.A0E() < iA02);
                A04(iA02);
                return;
            }
            throw InvalidProtocolBufferException.A00();
        }
        do {
            GG9 gg94 = this.A03;
            gdu.A04(gg94.A0H());
            if (gg94.A0V()) {
                return;
            } else {
                iA0K = gg94.A0K();
            }
        } while (iA0K == this.A02);
        this.A01 = iA0K;
    }

    @Override // X.GGK
    public final void AZP(List<Long> target) throws InvalidProtocolBufferException {
        int iA0K;
        int iA02;
        if (!(target instanceof GDV)) {
            int i = this.A02 & 7;
            if (i != 0) {
                if (i == 2) {
                    GG9 gg9 = this.A03;
                    iA02 = A02(gg9);
                    do {
                        AbstractC7608F5v.A1W(target, gg9.A0O());
                    } while (gg9.A0E() < iA02);
                    A04(iA02);
                    return;
                }
                throw InvalidProtocolBufferException.A00();
            }
            do {
                GG9 gg92 = this.A03;
                AbstractC7608F5v.A1W(target, gg92.A0O());
                if (gg92.A0V()) {
                    return;
                } else {
                    iA0K = gg92.A0K();
                }
            } while (iA0K == this.A02);
            this.A01 = iA0K;
        }
        GDV gdv = (GDV) target;
        int i2 = this.A02 & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                GG9 gg93 = this.A03;
                iA02 = A02(gg93);
                do {
                    gdv.A04(gg93.A0O());
                } while (gg93.A0E() < iA02);
                A04(iA02);
                return;
            }
            throw InvalidProtocolBufferException.A00();
        }
        do {
            GG9 gg94 = this.A03;
            gdv.A04(gg94.A0O());
            if (gg94.A0V()) {
                return;
            } else {
                iA0K = gg94.A0K();
            }
        } while (iA0K == this.A02);
        this.A01 = iA0K;
    }

    @Override // X.GGK
    public final void AZU(List<Integer> target) throws InvalidProtocolBufferException {
        int iA0K;
        if (!(target instanceof GDU)) {
            int i = this.A02 & 7;
            if (i == 2) {
                GG9 gg9 = this.A03;
                int iA00 = A00(gg9);
                do {
                    AbstractC7608F5v.A1A(gg9.A0I(), target);
                } while (gg9.A0E() < iA00);
                return;
            }
            if (i == 5) {
                do {
                    GG9 gg92 = this.A03;
                    AbstractC7608F5v.A1A(gg92.A0I(), target);
                    if (gg92.A0V()) {
                        return;
                    } else {
                        iA0K = gg92.A0K();
                    }
                } while (iA0K == this.A02);
                this.A01 = iA0K;
                return;
            }
            throw InvalidProtocolBufferException.A00();
        }
        GDU gdu = (GDU) target;
        int i2 = this.A02 & 7;
        if (i2 == 2) {
            GG9 gg93 = this.A03;
            int iA002 = A00(gg93);
            do {
                gdu.A04(gg93.A0I());
            } while (gg93.A0E() < iA002);
            return;
        }
        if (i2 == 5) {
            do {
                GG9 gg94 = this.A03;
                gdu.A04(gg94.A0I());
                if (gg94.A0V()) {
                    return;
                } else {
                    iA0K = gg94.A0K();
                }
            } while (iA0K == this.A02);
            this.A01 = iA0K;
            return;
        }
        throw InvalidProtocolBufferException.A00();
    }

    @Override // X.GGK
    public final void AZV(List<Long> target) throws InvalidProtocolBufferException {
        int iA0K;
        if (!(target instanceof GDV)) {
            int i = this.A02 & 7;
            if (i != 1) {
                if (i == 2) {
                    GG9 gg9 = this.A03;
                    int iA01 = A01(gg9);
                    do {
                        AbstractC7608F5v.A1W(target, gg9.A0P());
                    } while (gg9.A0E() < iA01);
                    return;
                }
                throw InvalidProtocolBufferException.A00();
            }
            do {
                GG9 gg92 = this.A03;
                AbstractC7608F5v.A1W(target, gg92.A0P());
                if (gg92.A0V()) {
                    return;
                } else {
                    iA0K = gg92.A0K();
                }
            } while (iA0K == this.A02);
            this.A01 = iA0K;
        }
        GDV gdv = (GDV) target;
        int i2 = this.A02 & 7;
        if (i2 != 1) {
            if (i2 == 2) {
                GG9 gg93 = this.A03;
                int iA012 = A01(gg93);
                do {
                    gdv.A04(gg93.A0P());
                } while (gg93.A0E() < iA012);
                return;
            }
            throw InvalidProtocolBufferException.A00();
        }
        do {
            GG9 gg94 = this.A03;
            gdv.A04(gg94.A0P());
            if (gg94.A0V()) {
                return;
            } else {
                iA0K = gg94.A0K();
            }
        } while (iA0K == this.A02);
        this.A01 = iA0K;
    }

    @Override // X.GGK
    public final void AZW(List<Integer> target) throws InvalidProtocolBufferException {
        int iA0K;
        int iA02;
        if (!(target instanceof GDU)) {
            int i = this.A02 & 7;
            if (i != 0) {
                if (i == 2) {
                    GG9 gg9 = this.A03;
                    iA02 = A02(gg9);
                    do {
                        AbstractC7608F5v.A1A(gg9.A0J(), target);
                    } while (gg9.A0E() < iA02);
                    A04(iA02);
                    return;
                }
                throw InvalidProtocolBufferException.A00();
            }
            do {
                GG9 gg92 = this.A03;
                AbstractC7608F5v.A1A(gg92.A0J(), target);
                if (gg92.A0V()) {
                    return;
                } else {
                    iA0K = gg92.A0K();
                }
            } while (iA0K == this.A02);
            this.A01 = iA0K;
        }
        GDU gdu = (GDU) target;
        int i2 = this.A02 & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                GG9 gg93 = this.A03;
                iA02 = A02(gg93);
                do {
                    gdu.A04(gg93.A0J());
                } while (gg93.A0E() < iA02);
                A04(iA02);
                return;
            }
            throw InvalidProtocolBufferException.A00();
        }
        do {
            GG9 gg94 = this.A03;
            gdu.A04(gg94.A0J());
            if (gg94.A0V()) {
                return;
            } else {
                iA0K = gg94.A0K();
            }
        } while (iA0K == this.A02);
        this.A01 = iA0K;
    }

    @Override // X.GGK
    public final void AZX(List<Long> target) throws InvalidProtocolBufferException {
        int iA0K;
        int iA02;
        if (!(target instanceof GDV)) {
            int i = this.A02 & 7;
            if (i != 0) {
                if (i == 2) {
                    GG9 gg9 = this.A03;
                    iA02 = A02(gg9);
                    do {
                        AbstractC7608F5v.A1W(target, gg9.A0Q());
                    } while (gg9.A0E() < iA02);
                    A04(iA02);
                    return;
                }
                throw InvalidProtocolBufferException.A00();
            }
            do {
                GG9 gg92 = this.A03;
                AbstractC7608F5v.A1W(target, gg92.A0Q());
                if (gg92.A0V()) {
                    return;
                } else {
                    iA0K = gg92.A0K();
                }
            } while (iA0K == this.A02);
            this.A01 = iA0K;
        }
        GDV gdv = (GDV) target;
        int i2 = this.A02 & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                GG9 gg93 = this.A03;
                iA02 = A02(gg93);
                do {
                    gdv.A04(gg93.A0Q());
                } while (gg93.A0E() < iA02);
                A04(iA02);
                return;
            }
            throw InvalidProtocolBufferException.A00();
        }
        do {
            GG9 gg94 = this.A03;
            gdv.A04(gg94.A0Q());
            if (gg94.A0V()) {
                return;
            } else {
                iA0K = gg94.A0K();
            }
        } while (iA0K == this.A02);
        this.A01 = iA0K;
    }

    @Override // X.GGK
    public final void AZY(List<Integer> target) throws InvalidProtocolBufferException {
        int iA0K;
        int iA02;
        if (!(target instanceof GDU)) {
            int i = this.A02 & 7;
            if (i != 0) {
                if (i == 2) {
                    GG9 gg9 = this.A03;
                    iA02 = A02(gg9);
                    do {
                        AbstractC7608F5v.A1A(gg9.A0L(), target);
                    } while (gg9.A0E() < iA02);
                    A04(iA02);
                    return;
                }
                throw InvalidProtocolBufferException.A00();
            }
            do {
                GG9 gg92 = this.A03;
                AbstractC7608F5v.A1A(gg92.A0L(), target);
                if (gg92.A0V()) {
                    return;
                } else {
                    iA0K = gg92.A0K();
                }
            } while (iA0K == this.A02);
            this.A01 = iA0K;
        }
        GDU gdu = (GDU) target;
        int i2 = this.A02 & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                GG9 gg93 = this.A03;
                iA02 = A02(gg93);
                do {
                    gdu.A04(gg93.A0L());
                } while (gg93.A0E() < iA02);
                A04(iA02);
                return;
            }
            throw InvalidProtocolBufferException.A00();
        }
        do {
            GG9 gg94 = this.A03;
            gdu.A04(gg94.A0L());
            if (gg94.A0V()) {
                return;
            } else {
                iA0K = gg94.A0K();
            }
        } while (iA0K == this.A02);
        this.A01 = iA0K;
    }

    @Override // X.GGK
    public final void AZZ(List<Long> target) throws InvalidProtocolBufferException {
        int iA0K;
        int iA02;
        if (!(target instanceof GDV)) {
            int i = this.A02 & 7;
            if (i != 0) {
                if (i == 2) {
                    GG9 gg9 = this.A03;
                    iA02 = A02(gg9);
                    do {
                        AbstractC7608F5v.A1W(target, gg9.A0R());
                    } while (gg9.A0E() < iA02);
                    A04(iA02);
                    return;
                }
                throw InvalidProtocolBufferException.A00();
            }
            do {
                GG9 gg92 = this.A03;
                AbstractC7608F5v.A1W(target, gg92.A0R());
                if (gg92.A0V()) {
                    return;
                } else {
                    iA0K = gg92.A0K();
                }
            } while (iA0K == this.A02);
            this.A01 = iA0K;
        }
        GDV gdv = (GDV) target;
        int i2 = this.A02 & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                GG9 gg93 = this.A03;
                iA02 = A02(gg93);
                do {
                    gdv.A04(gg93.A0R());
                } while (gg93.A0E() < iA02);
                A04(iA02);
                return;
            }
            throw InvalidProtocolBufferException.A00();
        }
        do {
            GG9 gg94 = this.A03;
            gdv.A04(gg94.A0R());
            if (gg94.A0V()) {
                return;
            } else {
                iA0K = gg94.A0K();
            }
        } while (iA0K == this.A02);
        this.A01 = iA0K;
    }

    public GG3(GG9 input) {
        Charset charset = AbstractC9351GFk.A04;
        this.A03 = input;
        input.A01 = this;
    }

    public static int A00(GG9 gg9) throws InvalidProtocolBufferException {
        int iA0L = gg9.A0L();
        A05(iA0L);
        return gg9.A0E() + iA0L;
    }

    public static int A01(GG9 gg9) throws InvalidProtocolBufferException {
        int iA0L = gg9.A0L();
        A06(iA0L);
        return gg9.A0E() + iA0L;
    }

    public static int A02(GG9 gg9) {
        return gg9.A0E() + gg9.A0L();
    }

    public static GG9 A03(GG3 gg3, int i) throws InvalidProtocolBufferException.InvalidWireTypeException {
        A07(gg3, i);
        return gg3.A03;
    }
}

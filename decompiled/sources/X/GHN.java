package X;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.nio.charset.Charset;
import java.util.List;

/* loaded from: classes6.dex */
public final class GHN {
    public int A00;
    public int A01 = 0;
    public int A02;
    public final GHR A03;

    public final void A09(List<Boolean> target) throws InvalidProtocolBufferException {
        int iA0K;
        int i = this.A02 & 7;
        if (i != 0) {
            if (i != 2) {
                throw InvalidProtocolBufferException.A00();
            }
            GHR ghr = this.A03;
            int iA00 = A00(ghr);
            do {
                target.add(Boolean.valueOf(ghr.A0X()));
            } while (ghr.A0E() < iA00);
            A03(iA00);
            return;
        }
        do {
            GHR ghr2 = this.A03;
            target.add(Boolean.valueOf(ghr2.A0X()));
            if (ghr2.A0W()) {
                return;
            } else {
                iA0K = ghr2.A0K();
            }
        } while (iA0K == this.A02);
        this.A01 = iA0K;
    }

    public final void A0A(List<Double> target) throws InvalidProtocolBufferException {
        int iA0K;
        int i = this.A02 & 7;
        if (i != 1) {
            if (i != 2) {
                throw InvalidProtocolBufferException.A00();
            }
            GHR ghr = this.A03;
            int iA02 = A02(ghr);
            do {
                target.add(Double.valueOf(ghr.A0C()));
            } while (ghr.A0E() < iA02);
            return;
        }
        do {
            GHR ghr2 = this.A03;
            target.add(Double.valueOf(ghr2.A0C()));
            if (ghr2.A0W()) {
                return;
            } else {
                iA0K = ghr2.A0K();
            }
        } while (iA0K == this.A02);
        this.A01 = iA0K;
    }

    public final void A0E(List<Float> target) throws InvalidProtocolBufferException {
        int iA0K;
        int i = this.A02 & 7;
        if (i == 2) {
            GHR ghr = this.A03;
            int iA01 = A01(ghr);
            do {
                target.add(Float.valueOf(ghr.A0D()));
            } while (ghr.A0E() < iA01);
            return;
        }
        if (i != 5) {
            throw InvalidProtocolBufferException.A00();
        }
        do {
            GHR ghr2 = this.A03;
            target.add(Float.valueOf(ghr2.A0D()));
            if (ghr2.A0W()) {
                return;
            } else {
                iA0K = ghr2.A0K();
            }
        } while (iA0K == this.A02);
        this.A01 = iA0K;
    }

    private void A03(int expectedPosition) throws InvalidProtocolBufferException {
        if (this.A03.A0E() != expectedPosition) {
            throw AbstractC7609F5w.A0c("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public static void A04(int bytes) throws InvalidProtocolBufferException {
        if ((bytes & 3) != 0) {
            throw AbstractC7609F5w.A0c("Failed to parse the message.");
        }
    }

    public static void A05(int bytes) throws InvalidProtocolBufferException {
        if ((bytes & 7) != 0) {
            throw AbstractC7609F5w.A0c("Failed to parse the message.");
        }
    }

    public static void A06(GHN ghn, int i) {
        if ((ghn.A02 & 7) != i) {
            throw InvalidProtocolBufferException.A00();
        }
    }

    public static void A07(GHN ghn, HzL hzL, GHV ghv, Object obj) {
        int i = ghn.A00;
        ghn.A00 = ((ghn.A02 >>> 3) << 3) | 4;
        try {
            ghv.AQg(ghn, hzL, obj);
            if (ghn.A02 == ghn.A00) {
            } else {
                throw AbstractC7609F5w.A0c("Failed to parse the message.");
            }
        } finally {
            ghn.A00 = i;
        }
    }

    public static void A08(GHN ghn, HzL hzL, GHV ghv, Object obj) throws InvalidProtocolBufferException {
        GHR ghr = ghn.A03;
        int iA0L = ghr.A0L();
        int i = ghr.A00;
        if (i >= 100) {
            throw AbstractC7609F5w.A0c("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iA0M = ghr.A0M(iA0L);
        ghr.A00 = i + 1;
        ghv.AQg(ghn, hzL, obj);
        ghr.A0V();
        ghr.A00--;
        if (ghr instanceof GGB) {
            GGB ggb = (GGB) ghr;
            ggb.A01 = iA0M;
            GGB.A07(ggb);
        } else {
            GGE gge = (GGE) ghr;
            gge.A00 = iA0M;
            GGE.A05(gge);
        }
    }

    public final void A0B(List<Integer> target) throws InvalidProtocolBufferException {
        int iA0K;
        int iA00;
        if (!(target instanceof GDS)) {
            int i = this.A02 & 7;
            if (i != 0) {
                if (i == 2) {
                    GHR ghr = this.A03;
                    iA00 = A00(ghr);
                    do {
                        AbstractC7608F5v.A1A(ghr.A0F(), target);
                    } while (ghr.A0E() < iA00);
                    A03(iA00);
                    return;
                }
                throw InvalidProtocolBufferException.A00();
            }
            do {
                GHR ghr2 = this.A03;
                AbstractC7608F5v.A1A(ghr2.A0F(), target);
                if (ghr2.A0W()) {
                    return;
                } else {
                    iA0K = ghr2.A0K();
                }
            } while (iA0K == this.A02);
            this.A01 = iA0K;
        }
        GDS gds = (GDS) target;
        int i2 = this.A02 & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                GHR ghr3 = this.A03;
                iA00 = A00(ghr3);
                do {
                    gds.A04(ghr3.A0F());
                } while (ghr3.A0E() < iA00);
                A03(iA00);
                return;
            }
            throw InvalidProtocolBufferException.A00();
        }
        do {
            GHR ghr4 = this.A03;
            gds.A04(ghr4.A0F());
            if (ghr4.A0W()) {
                return;
            } else {
                iA0K = ghr4.A0K();
            }
        } while (iA0K == this.A02);
        this.A01 = iA0K;
    }

    public final void A0C(List<Integer> target) throws InvalidProtocolBufferException {
        int iA0K;
        if (!(target instanceof GDS)) {
            int i = this.A02 & 7;
            if (i == 2) {
                GHR ghr = this.A03;
                int iA01 = A01(ghr);
                do {
                    AbstractC7608F5v.A1A(ghr.A0G(), target);
                } while (ghr.A0E() < iA01);
                return;
            }
            if (i == 5) {
                do {
                    GHR ghr2 = this.A03;
                    AbstractC7608F5v.A1A(ghr2.A0G(), target);
                    if (ghr2.A0W()) {
                        return;
                    } else {
                        iA0K = ghr2.A0K();
                    }
                } while (iA0K == this.A02);
                this.A01 = iA0K;
                return;
            }
            throw InvalidProtocolBufferException.A00();
        }
        GDS gds = (GDS) target;
        int i2 = this.A02 & 7;
        if (i2 == 2) {
            GHR ghr3 = this.A03;
            int iA012 = A01(ghr3);
            do {
                gds.A04(ghr3.A0G());
            } while (ghr3.A0E() < iA012);
            return;
        }
        if (i2 == 5) {
            do {
                GHR ghr4 = this.A03;
                gds.A04(ghr4.A0G());
                if (ghr4.A0W()) {
                    return;
                } else {
                    iA0K = ghr4.A0K();
                }
            } while (iA0K == this.A02);
            this.A01 = iA0K;
            return;
        }
        throw InvalidProtocolBufferException.A00();
    }

    public final void A0D(List<Long> target) throws InvalidProtocolBufferException {
        int iA0K;
        if (!(target instanceof GDT)) {
            int i = this.A02 & 7;
            if (i != 1) {
                if (i == 2) {
                    GHR ghr = this.A03;
                    int iA02 = A02(ghr);
                    do {
                        AbstractC7608F5v.A1W(target, ghr.A0N());
                    } while (ghr.A0E() < iA02);
                    return;
                }
                throw InvalidProtocolBufferException.A00();
            }
            do {
                GHR ghr2 = this.A03;
                AbstractC7608F5v.A1W(target, ghr2.A0N());
                if (ghr2.A0W()) {
                    return;
                } else {
                    iA0K = ghr2.A0K();
                }
            } while (iA0K == this.A02);
            this.A01 = iA0K;
        }
        GDT gdt = (GDT) target;
        int i2 = this.A02 & 7;
        if (i2 != 1) {
            if (i2 == 2) {
                GHR ghr3 = this.A03;
                int iA022 = A02(ghr3);
                do {
                    gdt.A04(ghr3.A0N());
                } while (ghr3.A0E() < iA022);
                return;
            }
            throw InvalidProtocolBufferException.A00();
        }
        do {
            GHR ghr4 = this.A03;
            gdt.A04(ghr4.A0N());
            if (ghr4.A0W()) {
                return;
            } else {
                iA0K = ghr4.A0K();
            }
        } while (iA0K == this.A02);
        this.A01 = iA0K;
    }

    public final void A0F(List<Integer> target) throws InvalidProtocolBufferException {
        int iA0K;
        int iA00;
        if (!(target instanceof GDS)) {
            int i = this.A02 & 7;
            if (i != 0) {
                if (i == 2) {
                    GHR ghr = this.A03;
                    iA00 = A00(ghr);
                    do {
                        AbstractC7608F5v.A1A(ghr.A0H(), target);
                    } while (ghr.A0E() < iA00);
                    A03(iA00);
                    return;
                }
                throw InvalidProtocolBufferException.A00();
            }
            do {
                GHR ghr2 = this.A03;
                AbstractC7608F5v.A1A(ghr2.A0H(), target);
                if (ghr2.A0W()) {
                    return;
                } else {
                    iA0K = ghr2.A0K();
                }
            } while (iA0K == this.A02);
            this.A01 = iA0K;
        }
        GDS gds = (GDS) target;
        int i2 = this.A02 & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                GHR ghr3 = this.A03;
                iA00 = A00(ghr3);
                do {
                    gds.A04(ghr3.A0H());
                } while (ghr3.A0E() < iA00);
                A03(iA00);
                return;
            }
            throw InvalidProtocolBufferException.A00();
        }
        do {
            GHR ghr4 = this.A03;
            gds.A04(ghr4.A0H());
            if (ghr4.A0W()) {
                return;
            } else {
                iA0K = ghr4.A0K();
            }
        } while (iA0K == this.A02);
        this.A01 = iA0K;
    }

    public final void A0G(List<Long> target) throws InvalidProtocolBufferException {
        int iA0K;
        int iA00;
        if (!(target instanceof GDT)) {
            int i = this.A02 & 7;
            if (i != 0) {
                if (i == 2) {
                    GHR ghr = this.A03;
                    iA00 = A00(ghr);
                    do {
                        AbstractC7608F5v.A1W(target, ghr.A0O());
                    } while (ghr.A0E() < iA00);
                    A03(iA00);
                    return;
                }
                throw InvalidProtocolBufferException.A00();
            }
            do {
                GHR ghr2 = this.A03;
                AbstractC7608F5v.A1W(target, ghr2.A0O());
                if (ghr2.A0W()) {
                    return;
                } else {
                    iA0K = ghr2.A0K();
                }
            } while (iA0K == this.A02);
            this.A01 = iA0K;
        }
        GDT gdt = (GDT) target;
        int i2 = this.A02 & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                GHR ghr3 = this.A03;
                iA00 = A00(ghr3);
                do {
                    gdt.A04(ghr3.A0O());
                } while (ghr3.A0E() < iA00);
                A03(iA00);
                return;
            }
            throw InvalidProtocolBufferException.A00();
        }
        do {
            GHR ghr4 = this.A03;
            gdt.A04(ghr4.A0O());
            if (ghr4.A0W()) {
                return;
            } else {
                iA0K = ghr4.A0K();
            }
        } while (iA0K == this.A02);
        this.A01 = iA0K;
    }

    public final void A0H(List<Integer> target) throws InvalidProtocolBufferException {
        int iA0K;
        if (!(target instanceof GDS)) {
            int i = this.A02 & 7;
            if (i == 2) {
                GHR ghr = this.A03;
                int iA01 = A01(ghr);
                do {
                    AbstractC7608F5v.A1A(ghr.A0I(), target);
                } while (ghr.A0E() < iA01);
                return;
            }
            if (i == 5) {
                do {
                    GHR ghr2 = this.A03;
                    AbstractC7608F5v.A1A(ghr2.A0I(), target);
                    if (ghr2.A0W()) {
                        return;
                    } else {
                        iA0K = ghr2.A0K();
                    }
                } while (iA0K == this.A02);
                this.A01 = iA0K;
                return;
            }
            throw InvalidProtocolBufferException.A00();
        }
        GDS gds = (GDS) target;
        int i2 = this.A02 & 7;
        if (i2 == 2) {
            GHR ghr3 = this.A03;
            int iA012 = A01(ghr3);
            do {
                gds.A04(ghr3.A0I());
            } while (ghr3.A0E() < iA012);
            return;
        }
        if (i2 == 5) {
            do {
                GHR ghr4 = this.A03;
                gds.A04(ghr4.A0I());
                if (ghr4.A0W()) {
                    return;
                } else {
                    iA0K = ghr4.A0K();
                }
            } while (iA0K == this.A02);
            this.A01 = iA0K;
            return;
        }
        throw InvalidProtocolBufferException.A00();
    }

    public final void A0I(List<Long> target) throws InvalidProtocolBufferException {
        int iA0K;
        if (!(target instanceof GDT)) {
            int i = this.A02 & 7;
            if (i != 1) {
                if (i == 2) {
                    GHR ghr = this.A03;
                    int iA02 = A02(ghr);
                    do {
                        AbstractC7608F5v.A1W(target, ghr.A0P());
                    } while (ghr.A0E() < iA02);
                    return;
                }
                throw InvalidProtocolBufferException.A00();
            }
            do {
                GHR ghr2 = this.A03;
                AbstractC7608F5v.A1W(target, ghr2.A0P());
                if (ghr2.A0W()) {
                    return;
                } else {
                    iA0K = ghr2.A0K();
                }
            } while (iA0K == this.A02);
            this.A01 = iA0K;
        }
        GDT gdt = (GDT) target;
        int i2 = this.A02 & 7;
        if (i2 != 1) {
            if (i2 == 2) {
                GHR ghr3 = this.A03;
                int iA022 = A02(ghr3);
                do {
                    gdt.A04(ghr3.A0P());
                } while (ghr3.A0E() < iA022);
                return;
            }
            throw InvalidProtocolBufferException.A00();
        }
        do {
            GHR ghr4 = this.A03;
            gdt.A04(ghr4.A0P());
            if (ghr4.A0W()) {
                return;
            } else {
                iA0K = ghr4.A0K();
            }
        } while (iA0K == this.A02);
        this.A01 = iA0K;
    }

    public final void A0J(List<Integer> target) throws InvalidProtocolBufferException {
        int iA0K;
        int iA00;
        if (!(target instanceof GDS)) {
            int i = this.A02 & 7;
            if (i != 0) {
                if (i == 2) {
                    GHR ghr = this.A03;
                    iA00 = A00(ghr);
                    do {
                        AbstractC7608F5v.A1A(ghr.A0J(), target);
                    } while (ghr.A0E() < iA00);
                    A03(iA00);
                    return;
                }
                throw InvalidProtocolBufferException.A00();
            }
            do {
                GHR ghr2 = this.A03;
                AbstractC7608F5v.A1A(ghr2.A0J(), target);
                if (ghr2.A0W()) {
                    return;
                } else {
                    iA0K = ghr2.A0K();
                }
            } while (iA0K == this.A02);
            this.A01 = iA0K;
        }
        GDS gds = (GDS) target;
        int i2 = this.A02 & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                GHR ghr3 = this.A03;
                iA00 = A00(ghr3);
                do {
                    gds.A04(ghr3.A0J());
                } while (ghr3.A0E() < iA00);
                A03(iA00);
                return;
            }
            throw InvalidProtocolBufferException.A00();
        }
        do {
            GHR ghr4 = this.A03;
            gds.A04(ghr4.A0J());
            if (ghr4.A0W()) {
                return;
            } else {
                iA0K = ghr4.A0K();
            }
        } while (iA0K == this.A02);
        this.A01 = iA0K;
    }

    public final void A0K(List<Long> target) throws InvalidProtocolBufferException {
        int iA0K;
        int iA00;
        if (!(target instanceof GDT)) {
            int i = this.A02 & 7;
            if (i != 0) {
                if (i == 2) {
                    GHR ghr = this.A03;
                    iA00 = A00(ghr);
                    do {
                        AbstractC7608F5v.A1W(target, ghr.A0Q());
                    } while (ghr.A0E() < iA00);
                    A03(iA00);
                    return;
                }
                throw InvalidProtocolBufferException.A00();
            }
            do {
                GHR ghr2 = this.A03;
                AbstractC7608F5v.A1W(target, ghr2.A0Q());
                if (ghr2.A0W()) {
                    return;
                } else {
                    iA0K = ghr2.A0K();
                }
            } while (iA0K == this.A02);
            this.A01 = iA0K;
        }
        GDT gdt = (GDT) target;
        int i2 = this.A02 & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                GHR ghr3 = this.A03;
                iA00 = A00(ghr3);
                do {
                    gdt.A04(ghr3.A0Q());
                } while (ghr3.A0E() < iA00);
                A03(iA00);
                return;
            }
            throw InvalidProtocolBufferException.A00();
        }
        do {
            GHR ghr4 = this.A03;
            gdt.A04(ghr4.A0Q());
            if (ghr4.A0W()) {
                return;
            } else {
                iA0K = ghr4.A0K();
            }
        } while (iA0K == this.A02);
        this.A01 = iA0K;
    }

    public final void A0L(List<Integer> target) throws InvalidProtocolBufferException {
        int iA0K;
        int iA00;
        if (!(target instanceof GDS)) {
            int i = this.A02 & 7;
            if (i != 0) {
                if (i == 2) {
                    GHR ghr = this.A03;
                    iA00 = A00(ghr);
                    do {
                        AbstractC7608F5v.A1A(ghr.A0L(), target);
                    } while (ghr.A0E() < iA00);
                    A03(iA00);
                    return;
                }
                throw InvalidProtocolBufferException.A00();
            }
            do {
                GHR ghr2 = this.A03;
                AbstractC7608F5v.A1A(ghr2.A0L(), target);
                if (ghr2.A0W()) {
                    return;
                } else {
                    iA0K = ghr2.A0K();
                }
            } while (iA0K == this.A02);
            this.A01 = iA0K;
        }
        GDS gds = (GDS) target;
        int i2 = this.A02 & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                GHR ghr3 = this.A03;
                iA00 = A00(ghr3);
                do {
                    gds.A04(ghr3.A0L());
                } while (ghr3.A0E() < iA00);
                A03(iA00);
                return;
            }
            throw InvalidProtocolBufferException.A00();
        }
        do {
            GHR ghr4 = this.A03;
            gds.A04(ghr4.A0L());
            if (ghr4.A0W()) {
                return;
            } else {
                iA0K = ghr4.A0K();
            }
        } while (iA0K == this.A02);
        this.A01 = iA0K;
    }

    public final void A0M(List<Long> target) throws InvalidProtocolBufferException {
        int iA0K;
        int iA00;
        if (!(target instanceof GDT)) {
            int i = this.A02 & 7;
            if (i != 0) {
                if (i == 2) {
                    GHR ghr = this.A03;
                    iA00 = A00(ghr);
                    do {
                        AbstractC7608F5v.A1W(target, ghr.A0R());
                    } while (ghr.A0E() < iA00);
                    A03(iA00);
                    return;
                }
                throw InvalidProtocolBufferException.A00();
            }
            do {
                GHR ghr2 = this.A03;
                AbstractC7608F5v.A1W(target, ghr2.A0R());
                if (ghr2.A0W()) {
                    return;
                } else {
                    iA0K = ghr2.A0K();
                }
            } while (iA0K == this.A02);
            this.A01 = iA0K;
        }
        GDT gdt = (GDT) target;
        int i2 = this.A02 & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                GHR ghr3 = this.A03;
                iA00 = A00(ghr3);
                do {
                    gdt.A04(ghr3.A0R());
                } while (ghr3.A0E() < iA00);
                A03(iA00);
                return;
            }
            throw InvalidProtocolBufferException.A00();
        }
        do {
            GHR ghr4 = this.A03;
            gdt.A04(ghr4.A0R());
            if (ghr4.A0W()) {
                return;
            } else {
                iA0K = ghr4.A0K();
            }
        } while (iA0K == this.A02);
        this.A01 = iA0K;
    }

    public GHN(GHR input) {
        Charset charset = AbstractC9352GFl.A04;
        this.A03 = input;
        input.A01 = this;
    }

    public static int A00(GHR ghr) {
        return ghr.A0E() + ghr.A0L();
    }

    public static int A01(GHR ghr) throws InvalidProtocolBufferException {
        int iA0L = ghr.A0L();
        A04(iA0L);
        return ghr.A0E() + iA0L;
    }

    public static int A02(GHR ghr) throws InvalidProtocolBufferException {
        int iA0L = ghr.A0L();
        A05(iA0L);
        return ghr.A0E() + iA0L;
    }
}

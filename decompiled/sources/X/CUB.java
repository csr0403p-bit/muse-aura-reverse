package X;

import java.util.concurrent.ThreadLocalRandom;

/* loaded from: classes5.dex */
public abstract class CUB {
    public static final CUC A00 = new CUC();
    public static final CUB A01;

    static {
        Integer num = CU1.A00;
        A01 = (num == null || num.intValue() >= 34) ? new C1E() : new CU5();
    }

    private final int A04(int i) {
        return this instanceof CUC ? A01.A04(i) : (((C9W) this).A0A().nextInt() >>> (32 - i)) & ((-i) >> 31);
    }

    public final double A00() {
        return this instanceof CUC ? A01.A00() : ((C9W) this).A0A().nextDouble();
    }

    public final double A01() {
        double dA00;
        double d = 0.5d;
        if (this instanceof CUC) {
            return A01.A01();
        }
        double d2 = 1.0d - 0.5d;
        if (!Double.isInfinite(d2) || Math.abs(0.5d) > Double.MAX_VALUE || Math.abs(1.0d) > Double.MAX_VALUE) {
            dA00 = A00() * d2;
        } else {
            dA00 = A00() * ((1.0d / 2.0d) - (0.5d / 2.0d));
            d = 0.5d + dA00;
        }
        double d3 = d + dA00;
        return d3 >= 1.0d ? Math.nextAfter(1.0d, Double.NEGATIVE_INFINITY) : d3;
    }

    public final float A02() {
        return this instanceof CUC ? A01.A02() : ((C9W) this).A0A().nextFloat();
    }

    public final int A03() {
        return this instanceof CUC ? A01.A03() : ((C9W) this).A0A().nextInt();
    }

    public int A05(int i) {
        return A01.A05(i);
    }

    public final long A06() {
        return this instanceof CUC ? A01.A06() : ((C9W) this).A0A().nextLong();
    }

    public final long A07(long j) {
        return this instanceof C1E ? ThreadLocalRandom.current().nextLong(j) : this instanceof CUC ? A01.A07(j) : A08(0L, j);
    }

    public final long A08(long j, long j2) {
        long jA06;
        long jA04;
        int iA03;
        if (this instanceof C1E) {
            return ThreadLocalRandom.current().nextLong(j, j2);
        }
        if (this instanceof CUC) {
            return A01.A08(j, j2);
        }
        if (j2 <= j) {
            Long lValueOf = Long.valueOf(j);
            Long lValueOf2 = Long.valueOf(j2);
            StringBuilder sbA0f = C3cG.A0f(lValueOf, "Random range is empty: [");
            C8j3.A1K(sbA0f);
            sbA0f.append(lValueOf2);
            throw C8j3.A0w(").", sbA0f);
        }
        long j3 = j2 - j;
        if (j3 > 0) {
            if (((-j3) & j3) == j3) {
                int i = (int) j3;
                int i2 = (int) (j3 >>> 32);
                if (i != 0) {
                    iA03 = A04(31 - Integer.numberOfLeadingZeros(i));
                } else if (i2 == 1) {
                    iA03 = A03();
                } else {
                    jA04 = (A04(31 - Integer.numberOfLeadingZeros(i2)) << 32) + (A03() & 4294967295L);
                }
                jA04 = iA03 & 4294967295L;
            } else {
                do {
                    jA06 = A06() >>> 1;
                    jA04 = jA06 % j3;
                } while ((jA06 - jA04) + (j3 - 1) < 0);
            }
            return j + jA04;
        }
        while (true) {
            long jA062 = A06();
            if (j <= jA062 && jA062 < j2) {
                return jA062;
            }
        }
    }

    public final boolean A09() {
        return this instanceof CUC ? A01.A09() : ((C9W) this).A0A().nextBoolean();
    }
}

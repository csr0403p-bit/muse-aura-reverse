package X;

/* renamed from: X.FGk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC7829FGk {
    public final int A00;
    public final ADq A01;

    public static int A00(long j) {
        int i = ((int) j) & 1073741823;
        int i2 = i - 1;
        if (i == 0) {
            return Integer.MAX_VALUE;
        }
        return i2;
    }

    public static final AbstractC7829FGk A01(int i) {
        int i2 = i >>> 30;
        C7840FGw c7840FGw = C7840FGw.A00;
        if (i2 == c7840FGw.A00) {
            return c7840FGw;
        }
        C7838FGu c7838FGu = C7838FGu.A00;
        return i2 != c7838FGu.A00 ? C7839FGv.A00 : c7838FGu;
    }

    public final int A02(long j) {
        if (this instanceof C7838FGu) {
            return A00(j);
        }
        if (!(this instanceof C7839FGv)) {
            return A00(j);
        }
        int i = ((int) j) & 1073741823 & 262143;
        int i2 = i - 1;
        if (i == 0) {
            return Integer.MAX_VALUE;
        }
        return i2;
    }

    public final int A03(long j) {
        if (this instanceof C7838FGu) {
            return A00(j >>> 32);
        }
        if (!(this instanceof C7839FGv)) {
            return A00(j >>> 32);
        }
        int iA03 = BV6.A03(j) & 1073741823 & 262143;
        int i = iA03 - 1;
        if (iA03 == 0) {
            return Integer.MAX_VALUE;
        }
        return i;
    }

    public final int A04(long j) {
        if (this instanceof C7838FGu) {
            return 0;
        }
        if (!(this instanceof C7839FGv)) {
            return A00(j);
        }
        int i = (((int) j) & Integer.MAX_VALUE) >>> 18;
        int i2 = i - 1;
        if (i == 0) {
            return Integer.MAX_VALUE;
        }
        return i2;
    }

    public final int A05(long j) {
        if (this instanceof C7838FGu) {
            return 0;
        }
        if (!(this instanceof C7839FGv)) {
            return A00(j >>> 32);
        }
        int iA03 = (BV6.A03(j) & Integer.MAX_VALUE) >>> 18;
        int i = iA03 - 1;
        if (iA03 == 0) {
            return Integer.MAX_VALUE;
        }
        return i;
    }

    public final long A06(int i, int i2) {
        if (this instanceof C7838FGu) {
            int i3 = i2 + 1;
            if (i2 == Integer.MAX_VALUE) {
                i3 = 0;
            }
            return BV4.A03((i3 & 1073741823) | (this.A00 << 30));
        }
        if (!(this instanceof C7839FGv)) {
            int i4 = i2 + 1;
            if (i2 == Integer.MAX_VALUE) {
                i4 = 0;
            }
            return BV4.A03((i4 & 1073741823) | (this.A00 << 30));
        }
        int i5 = i + 1;
        if (i == Integer.MAX_VALUE) {
            i5 = 0;
        }
        return BV4.A03(((i5 & 8191) << 18) | (this.A00 << 30) | (262143 & (i2 != Integer.MAX_VALUE ? i2 + 1 : 0)));
    }

    public AbstractC7829FGk(ADq aDq, int i) {
        this.A01 = aDq;
        this.A00 = i;
    }
}

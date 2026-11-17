package X;

import android.util.Log;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class Dl3 extends AbstractC5554DkX {
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final List<DlF> A06;
    public final long A07;

    /* JADX WARN: Incorrect types in method signature: (LX/DgJ;JJJJLjava/util/List<LX/DlF;>;JJJIJ)V */
    public Dl3(C5325DgJ c5325DgJ, List list, int i, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        super(c5325DgJ, j, j2);
        this.A05 = j3;
        this.A02 = j4;
        this.A06 = list;
        this.A01 = j5;
        this.A07 = j6;
        this.A04 = j7;
        this.A00 = i;
        this.A03 = j8;
    }

    public final int A00(long j) {
        Dl0 dl0;
        List<DlF> list;
        DlL dlL;
        if (!(this instanceof Dl0) || (list = (dl0 = (Dl0) this).A06) == null || (dlL = dl0.A00) == null) {
            return -1;
        }
        int i = (int) (j - dl0.A05);
        int i2 = ((Dl3) dl0).A00;
        return i2 != list.size() ? i >= i2 ? ((DlF) BV5.A0e(list)).A00 + (i - i2) + 1 : dl0.A06(i).A00 : ((i + dlL.A00) - i2) + 1;
    }

    public final long A01(long j) {
        int size;
        if (!(this instanceof Dl0)) {
            size = ((C5588DlG) this).A00.size();
        } else if (this.A06 != null) {
            size = this.A00;
        } else {
            if (j == -9223372036854775807L) {
                return -1L;
            }
            long j2 = (this.A02 * 1000000) / super.A01;
            size = (int) (BV7.A0S(j, j2) / j2);
        }
        return size;
    }

    public final long A02(long j) {
        List<DlF> list = this.A06;
        long j2 = j - this.A05;
        return BV8.A0I(list != null ? A06((int) j2).A04 - super.A00 : j2 * this.A02, super.A01);
    }

    public final long A04(long j, long j2) {
        long j3;
        if (this.A06 != null) {
            j3 = A06((int) (j - this.A05)).A03;
        } else {
            long jA01 = A01(j2);
            if (jA01 != -1 && j == BV7.A0S(this.A05, jA01)) {
                return j2 - A02(j);
            }
            j3 = this.A02;
        }
        return (j3 * 1000000) / super.A01;
    }

    public final long A05(long j, long j2) {
        long jA0I;
        long j3 = this.A05;
        long jA01 = A01(j2);
        if (jA01 != 0) {
            if (this.A06 != null) {
                long j4 = (jA01 + j3) - 1;
                long j5 = j3;
                while (j5 <= j4) {
                    jA0I = BV6.A0I(j4 - j5) + j5;
                    long jA02 = A02(jA0I);
                    if (jA02 < j) {
                        j5 = jA0I + 1;
                    } else if (jA02 > j) {
                        j4 = jA0I - 1;
                    }
                }
                return j5 == j3 ? j5 : j4;
            }
            jA0I = j3 + (j / ((this.A02 * 1000000) / super.A01));
            if (jA0I >= j3) {
                if (jA01 != -1) {
                    return Math.min(jA0I, (j3 + jA01) - 1);
                }
            }
            return jA0I;
        }
        return j3;
    }

    public final DlF A06(int i) {
        int i2 = i;
        int i3 = this.A00;
        List<DlF> list = this.A06;
        if (i3 == list.size()) {
            if (i2 >= i3) {
                i2 = i3 - 1;
                Log.w("SegmentTemplate", "index was past bounds of the list, so clamping to final element");
            }
            return list.get(i2);
        }
        int size = list.size() - 1;
        int i4 = i + list.get(0).A01;
        int i5 = 0;
        while (i5 <= size) {
            int i6 = (i5 + size) / 2;
            DlF dlF = list.get(i6);
            int i7 = dlF.A01;
            int i8 = dlF.A02 + i7;
            if (i8 <= i4) {
                i5 = i6 + 1;
            } else {
                if (i8 <= i4 || i6 == 0 || i7 <= i4) {
                    if (i8 <= i4 || (i6 != 0 && i7 > i4)) {
                        throw BV6.A0g("Segment Index out of Segment Timeline bounds");
                    }
                    long j = dlF.A04;
                    long j2 = dlF.A03;
                    int i9 = dlF.A01;
                    int i10 = i4 - i9;
                    return new DlF(1, i9, (dlF.A00 - (dlF.A02 - 1)) + i10, j + (j2 * i10), j2, dlF.A05);
                }
                size = i6 - 1;
            }
        }
        BV6.A1L("Search Fail; Index: %d, Start relative index: %d, End relative index: %d, Segment Timeline Size: %d", "SegmentTemplate", new Object[]{Integer.valueOf(i4), Integer.valueOf(list.size() > 0 ? list.get(0).A01 : -1), Integer.valueOf(list.size() > 0 ? ((DlF) BV7.A0t(list)).A01 : -1), Integer.valueOf(list.size())});
        throw BV6.A0g("Segment Index out of Segment Timeline bounds");
    }

    public final long A03(long j, long j2) {
        if (A01(j) == -1) {
            long j3 = this.A07;
            if (j3 != -9223372036854775807L) {
                return Math.max(this.A05, A05((j2 - this.A04) - j3, j));
            }
        }
        return this.A05;
    }
}

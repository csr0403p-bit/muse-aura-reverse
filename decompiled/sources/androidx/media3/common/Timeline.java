package androidx.media3.common;

import X.AbstractC6427E5f;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.BV4;
import X.BV5;
import X.BV6;
import X.BV7;
import X.C1G;
import X.C5580Dky;
import X.C5587DlE;
import X.C5998Dth;
import X.C6007Dtq;
import X.C6015Dty;
import X.C6428E5g;
import X.C6429E5h;
import X.C6xC;
import X.Dl8;
import X.Du4;
import X.E0F;
import X.E6B;
import android.util.Pair;
import java.util.Arrays;

/* loaded from: classes5.dex */
public abstract class Timeline {
    public static final Timeline A00 = new E0F();

    public final int A03(int i, int i2) {
        if (this instanceof Du4) {
            return ((Du4) this).A00.A03(i, i2);
        }
        if (!(this instanceof AbstractC6427E5f)) {
            if (i2 != 0) {
                if (i2 == 1) {
                    return i;
                }
                if (i2 != 2) {
                    throw BV4.A0T();
                }
                if (i == A07(false)) {
                    return A08(false);
                }
            } else if (i == A07(false)) {
                return -1;
            }
            return i - 1;
        }
        AbstractC6427E5f abstractC6427E5f = (AbstractC6427E5f) this;
        C6428E5g c6428E5g = (C6428E5g) abstractC6427E5f;
        int[] iArr = c6428E5g.A04;
        int i3 = i + 1;
        int iBinarySearch = Arrays.binarySearch(iArr, i3);
        if (iBinarySearch >= 0) {
            do {
                iBinarySearch--;
                if (iBinarySearch < 0) {
                    break;
                }
            } while (iArr[iBinarySearch] == i3);
        } else {
            iBinarySearch = -(iBinarySearch + 2);
        }
        int i4 = iArr[iBinarySearch];
        Timeline[] timelineArr = c6428E5g.A05;
        int iA03 = timelineArr[iBinarySearch].A03(i - i4, i2 != 2 ? i2 : 0);
        if (iA03 != -1) {
            return i4 + iA03;
        }
        int i5 = iBinarySearch - 1;
        if (iBinarySearch > 0) {
            while (true) {
                int i6 = i5;
                if (i5 == -1) {
                    break;
                }
                Timeline timeline = timelineArr[i5];
                if (AnonymousClass002.A1M(timeline.A02())) {
                    i5--;
                    if (i6 <= 0) {
                        break;
                    }
                } else if (i5 != -1) {
                    return iArr[i5] + timeline.A08(false);
                }
            }
        }
        if (i2 == 2) {
            return abstractC6427E5f.A08(false);
        }
        return -1;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Dth;LX/E6B;IJJ)Landroid/util/Pair<Ljava/lang/Object;Ljava/lang/Long;>; */
    public final Pair A0A(E6B e6b, C5998Dth c5998Dth, int i, long j, long j2) {
        C1G.A03(i, A02());
        A0E(c5998Dth, i, j2);
        if (j == -9223372036854775807L) {
            j = c5998Dth.A02;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = c5998Dth.A00;
        A0D(e6b, i2, false);
        while (i2 < c5998Dth.A01 && e6b.A02 != j) {
            int i3 = i2 + 1;
            if (A0D(e6b, i3, false).A02 > j) {
                break;
            }
            i2 = i3;
        }
        A0D(e6b, i2, true);
        long jMin = j - e6b.A02;
        long j3 = e6b.A01;
        if (j3 != -9223372036854775807L) {
            jMin = Math.min(jMin, j3 - 1);
        }
        long jA07 = BV5.A07(jMin);
        Object obj = e6b.A05;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jA07));
    }

    public abstract E6B A0D(E6B e6b, int i, boolean z);

    public abstract C5998Dth A0E(C5998Dth c5998Dth, int i, long j);

    public final boolean equals(Object obj) {
        int iA08;
        if (this != obj) {
            if (obj instanceof Timeline) {
                Timeline timeline = (Timeline) obj;
                int iA02 = timeline.A02();
                int iA022 = A02();
                if (iA02 == iA022 && timeline.A01() == A01()) {
                    C5998Dth c5998Dth = new C5998Dth();
                    E6B e6b = new E6B();
                    C5998Dth c5998Dth2 = new C5998Dth();
                    E6B e6b2 = new E6B();
                    int i = 0;
                    while (true) {
                        if (i >= iA022) {
                            int i2 = 0;
                            while (true) {
                                if (i2 >= A01()) {
                                    int iA07 = A07(true);
                                    if (iA07 != timeline.A07(true) || (iA08 = A08(true)) != timeline.A08(true)) {
                                        return false;
                                    }
                                    while (iA07 != iA08) {
                                        int iA04 = A04(iA07, 0, true);
                                        if (iA04 == timeline.A04(iA07, 0, true)) {
                                            iA07 = iA04;
                                        }
                                    }
                                } else {
                                    if (!A0D(e6b, i2, true).equals(timeline.A0D(e6b2, i2, true))) {
                                        break;
                                    }
                                    i2++;
                                }
                            }
                        } else {
                            if (!A0E(c5998Dth, i, 0L).equals(timeline.A0E(c5998Dth2, i, 0L))) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    private final int A08(boolean z) {
        int i;
        int i2;
        if (this instanceof Du4) {
            return ((Du4) this).A00.A08(z);
        }
        if (!(this instanceof AbstractC6427E5f)) {
            if (AnonymousClass002.A1M(A02())) {
                return -1;
            }
            return A02() - 1;
        }
        AbstractC6427E5f abstractC6427E5f = (AbstractC6427E5f) this;
        int i3 = abstractC6427E5f.A00;
        if (i3 == 0) {
            return -1;
        }
        if (z) {
            int[] iArr = ((C6429E5h) abstractC6427E5f.A01).A02;
            int length = iArr.length;
            i = length > 0 ? iArr[length - 1] : -1;
        } else {
            i = i3 - 1;
        }
        do {
            C6428E5g c6428E5g = (C6428E5g) abstractC6427E5f;
            Timeline timeline = c6428E5g.A05[i];
            if (!AnonymousClass002.A1M(timeline.A02())) {
                return c6428E5g.A04[i] + timeline.A08(z);
            }
            if (z) {
                C6429E5h c6429E5h = (C6429E5h) abstractC6427E5f.A01;
                int i4 = c6429E5h.A01[i] - 1;
                if (i4 < 0) {
                    return -1;
                }
                i2 = c6429E5h.A02[i4];
            } else {
                i2 = i - 1;
                if (i <= 0) {
                    return -1;
                }
            }
            i = i2;
        } while (i2 != -1);
        return -1;
    }

    public final int A01() {
        if (this instanceof Dl8) {
            return C5580Dky.A00(((Dl8) this).A04);
        }
        if ((this instanceof C5587DlE) || (this instanceof C6015Dty)) {
            return 1;
        }
        if (this instanceof Du4) {
            return ((Du4) this).A00.A01();
        }
        if (this instanceof C6428E5g) {
            return ((C6428E5g) this).A00;
        }
        return 0;
    }

    public final int A02() {
        if ((this instanceof Dl8) || (this instanceof C5587DlE) || (this instanceof C6015Dty)) {
            return 1;
        }
        if (this instanceof Du4) {
            return ((Du4) this).A00.A02();
        }
        if (this instanceof C6428E5g) {
            return ((C6428E5g) this).A01;
        }
        return 0;
    }

    public final int A04(int i, int i2, boolean z) {
        if (this instanceof Du4) {
            return ((Du4) this).A00.A04(i, i2, z);
        }
        if (!(this instanceof AbstractC6427E5f)) {
            if (i2 != 0) {
                if (i2 == 1) {
                    return i;
                }
                if (i2 != 2) {
                    throw BV4.A0T();
                }
                if (i == A08(z)) {
                    return A07(z);
                }
            } else if (i == A08(z)) {
                return -1;
            }
            return i + 1;
        }
        AbstractC6427E5f abstractC6427E5f = (AbstractC6427E5f) this;
        C6428E5g c6428E5g = (C6428E5g) abstractC6427E5f;
        int[] iArr = c6428E5g.A04;
        int i3 = i + 1;
        int iBinarySearch = Arrays.binarySearch(iArr, i3);
        if (iBinarySearch >= 0) {
            do {
                iBinarySearch--;
                if (iBinarySearch < 0) {
                    break;
                }
            } while (iArr[iBinarySearch] == i3);
        } else {
            iBinarySearch = -(iBinarySearch + 2);
        }
        int i4 = iArr[iBinarySearch];
        Timeline[] timelineArr = c6428E5g.A05;
        int iA04 = timelineArr[iBinarySearch].A04(i - i4, i2 != 2 ? i2 : 0, z);
        if (iA04 != -1) {
            return i4 + iA04;
        }
        int iA00 = AbstractC6427E5f.A00(abstractC6427E5f, iBinarySearch, z);
        while (true) {
            if (iA00 == -1) {
                break;
            }
            Timeline timeline = timelineArr[iA00];
            if (AnonymousClass002.A1M(timeline.A02())) {
                iA00 = AbstractC6427E5f.A00(abstractC6427E5f, iA00, z);
            } else if (iA00 != -1) {
                return iArr[iA00] + timeline.A07(z);
            }
        }
        if (i2 == 2) {
            return abstractC6427E5f.A07(z);
        }
        return -1;
    }

    public final int A06(Object obj) {
        int iIntValue;
        int iA06;
        Object obj2;
        int iA0F;
        if (this instanceof Dl8) {
            Dl8 dl8 = (Dl8) this;
            if ((obj instanceof Integer) && (iA0F = AnonymousClass001.A0F(obj) - dl8.A00) >= 0 && iA0F < dl8.A01()) {
                return iA0F;
            }
        } else {
            if (this instanceof C5587DlE) {
                return C5587DlE.A07.equals(obj) ? 0 : -1;
            }
            if (this instanceof C6015Dty) {
                return obj == C6007Dtq.A02 ? 0 : -1;
            }
            if (this instanceof Du4) {
                Du4 du4 = (Du4) this;
                if (!(du4 instanceof C6007Dtq)) {
                    return du4.A00.A06(obj);
                }
                C6007Dtq c6007Dtq = (C6007Dtq) du4;
                Timeline timeline = ((Du4) c6007Dtq).A00;
                if (C6007Dtq.A02.equals(obj) && (obj2 = c6007Dtq.A00) != null) {
                    obj = obj2;
                }
                return timeline.A06(obj);
            }
            if (this instanceof AbstractC6427E5f) {
                AbstractC6427E5f abstractC6427E5f = (AbstractC6427E5f) this;
                if (!(obj instanceof Pair)) {
                    return -1;
                }
                Pair pair = (Pair) obj;
                Object obj3 = pair.first;
                Object obj4 = pair.second;
                C6428E5g c6428E5g = (C6428E5g) abstractC6427E5f;
                Number numberA0j = BV6.A0j(obj3, c6428E5g.A02);
                if (numberA0j == null || (iIntValue = numberA0j.intValue()) == -1 || (iA06 = c6428E5g.A05[iIntValue].A06(obj4)) == -1) {
                    return -1;
                }
                return c6428E5g.A03[iIntValue] + iA06;
            }
        }
        return -1;
    }

    public final int A07(boolean z) {
        if (this instanceof Du4) {
            return ((Du4) this).A00.A07(z);
        }
        if (!(this instanceof AbstractC6427E5f)) {
            return AnonymousClass002.A1M(A02()) ? -1 : 0;
        }
        AbstractC6427E5f abstractC6427E5f = (AbstractC6427E5f) this;
        if (abstractC6427E5f.A00 == 0) {
            return -1;
        }
        int iA00 = 0;
        if (z) {
            int[] iArr = ((C6429E5h) abstractC6427E5f.A01).A02;
            iA00 = iArr.length > 0 ? iArr[0] : -1;
        }
        do {
            C6428E5g c6428E5g = (C6428E5g) abstractC6427E5f;
            Timeline timeline = c6428E5g.A05[iA00];
            if (!AnonymousClass002.A1M(timeline.A02())) {
                return c6428E5g.A04[iA00] + timeline.A07(z);
            }
            iA00 = AbstractC6427E5f.A00(abstractC6427E5f, iA00, z);
        } while (iA00 != -1);
        return -1;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Dth;LX/E6B;IJ)Landroid/util/Pair<Ljava/lang/Object;Ljava/lang/Long;>; */
    public final Pair A09(E6B e6b, C5998Dth c5998Dth, int i, long j) {
        Pair pairA0A = A0A(e6b, c5998Dth, i, j, 0L);
        pairA0A.getClass();
        return pairA0A;
    }

    public final E6B A0B(E6B e6b, Object obj) {
        if (!(this instanceof AbstractC6427E5f)) {
            return A0D(e6b, A06(obj), true);
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        C6428E5g c6428E5g = (C6428E5g) ((AbstractC6427E5f) this);
        Number numberA0j = BV6.A0j(obj2, c6428E5g.A02);
        int iIntValue = numberA0j == null ? -1 : numberA0j.intValue();
        int i = c6428E5g.A04[iIntValue];
        c6428E5g.A05[iIntValue].A0B(e6b, obj3);
        e6b.A00 += i;
        e6b.A05 = obj;
        return e6b;
    }

    public final Object A0C(int i) {
        if (this instanceof Dl8) {
            Dl8 dl8 = (Dl8) this;
            C1G.A03(i, dl8.A01());
            return Integer.valueOf(dl8.A00 + i);
        }
        if (this instanceof C5587DlE) {
            C1G.A03(i, 1);
            return C5587DlE.A07;
        }
        if (!(this instanceof C6015Dty)) {
            if (!(this instanceof Du4)) {
                if (!(this instanceof AbstractC6427E5f)) {
                    throw new IndexOutOfBoundsException();
                }
                C6428E5g c6428E5g = (C6428E5g) ((AbstractC6427E5f) this);
                int[] iArr = c6428E5g.A03;
                int i2 = i + 1;
                int iBinarySearch = Arrays.binarySearch(iArr, i2);
                if (iBinarySearch >= 0) {
                    do {
                        iBinarySearch--;
                        if (iBinarySearch < 0) {
                            break;
                        }
                    } while (iArr[iBinarySearch] == i2);
                } else {
                    iBinarySearch = -(iBinarySearch + 2);
                }
                return Pair.create(c6428E5g.A06[iBinarySearch], c6428E5g.A05[iBinarySearch].A0C(i - iArr[iBinarySearch]));
            }
            Du4 du4 = (Du4) this;
            if (!(du4 instanceof C6007Dtq)) {
                return du4.A00.A0C(i);
            }
            C6007Dtq c6007Dtq = (C6007Dtq) du4;
            Object objA0C = ((Du4) c6007Dtq).A00.A0C(i);
            if (!C6xC.A00(objA0C, c6007Dtq.A00)) {
                return objA0C;
            }
        }
        return C6007Dtq.A02;
    }

    public final int hashCode() {
        int i;
        C5998Dth c5998Dth = new C5998Dth();
        E6B e6b = new E6B();
        int iA02 = A02();
        int iA0G = 217 + iA02;
        int i2 = 0;
        while (true) {
            i = iA0G * 31;
            if (i2 >= iA02) {
                break;
            }
            iA0G = AnonymousClass005.A0G(BV7.A0d(c5998Dth, this, i2), i);
            i2++;
        }
        int iA01 = i + A01();
        for (int i3 = 0; i3 < A01(); i3++) {
            iA01 = AnonymousClass005.A0G(A0D(e6b, i3, true), iA01 * 31);
        }
        int iA07 = A07(true);
        while (iA07 != -1) {
            iA01 = (iA01 * 31) + iA07;
            iA07 = A04(iA07, 0, true);
        }
        return iA01;
    }

    public final int A05(E6B e6b, C5998Dth c5998Dth, int i, int i2, boolean z) {
        int iA00 = E6B.A00(e6b, this, i);
        if (A0E(c5998Dth, iA00, 0L).A01 != i) {
            return i + 1;
        }
        int iA04 = A04(iA00, i2, z);
        if (iA04 != -1) {
            return A0E(c5998Dth, iA04, 0L).A00;
        }
        return -1;
    }
}

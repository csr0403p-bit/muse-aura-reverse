package X;

import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import java.util.ArrayList;
import java.util.TreeSet;

/* loaded from: classes5.dex */
public final class C0H {
    public C3121Byl A00;
    public final int A01;
    public final String A02;
    public final TreeSet<C0D> A04 = new TreeSet<>();
    public final ArrayList<C0I> A03 = C3cG.A0h();

    public final long A00(long j, long j2) {
        C1G.A07(C8j3.A1Q((j > 0L ? 1 : (j == 0L ? 0 : -1))));
        C1G.A07(j2 >= 0);
        C0D c0dA01 = A01(j, j2);
        boolean z = !c0dA01.A07;
        long j3 = LinkEncryptedPairingKt.LINK_COUNTER_MAX;
        if (z) {
            long j4 = c0dA01.A03;
            if (j4 != -1) {
                j3 = j4;
            }
            return -Math.min(j3, j2);
        }
        long j5 = j + j2;
        if (j5 >= 0) {
            j3 = j5;
        }
        long jMax = c0dA01.A04 + c0dA01.A03;
        if (jMax < j3) {
            for (C0D c0d : this.A04.tailSet(c0dA01, false)) {
                long j6 = c0d.A04;
                if (j6 > jMax) {
                    break;
                }
                jMax = Math.max(jMax, j6 + c0d.A03);
                if (jMax >= j3) {
                    break;
                }
            }
        }
        return Math.min(jMax - j, j2);
    }

    public final boolean A02(long j, long j2) {
        int i = 0;
        while (true) {
            ArrayList<C0I> arrayList = this.A03;
            if (i >= arrayList.size()) {
                return false;
            }
            C0I c0i = arrayList.get(i);
            long j3 = c0i.A00;
            if (j3 != -1) {
                if (j2 != -1) {
                    long j4 = c0i.A01;
                    if (j4 <= j && j + j2 <= j4 + j3) {
                        break;
                    }
                } else {
                    continue;
                }
                i++;
            } else {
                if (j >= c0i.A01) {
                    break;
                }
                i++;
            }
        }
        return true;
    }

    public final boolean A03(long j, long j2) {
        int i;
        int i2 = 0;
        while (true) {
            ArrayList<C0I> arrayList = this.A03;
            if (i2 >= arrayList.size()) {
                arrayList.add(new C0I(j, j2));
                return true;
            }
            C0I c0i = arrayList.get(i2);
            long j3 = c0i.A01;
            if (j3 <= j) {
                long j4 = c0i.A00;
                if (j4 == -1) {
                    return false;
                }
                i = ((j3 + j4) > j ? 1 : ((j3 + j4) == j ? 0 : -1));
            } else {
                if (j2 == -1) {
                    return false;
                }
                i = ((j + j2) > j3 ? 1 : ((j + j2) == j3 ? 0 : -1));
            }
            if (i > 0) {
                return false;
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C0H c0h = (C0H) obj;
                if (this.A01 != c0h.A01 || !this.A02.equals(c0h.A02) || !this.A04.equals(c0h.A04) || !this.A00.equals(c0h.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final C0D A01(long j, long j2) {
        long jMin = j2;
        String str = this.A02;
        C0D c0d = new C0D(null, str, j, -1L, -9223372036854775807L);
        TreeSet<C0D> treeSet = this.A04;
        C0D c0dFloor = treeSet.floor(c0d);
        if (c0dFloor != null && c0dFloor.A04 + c0dFloor.A03 > j) {
            return c0dFloor;
        }
        C0D c0dCeiling = treeSet.ceiling(c0d);
        if (c0dCeiling != null) {
            long j3 = c0dCeiling.A04 - j;
            jMin = j2 == -1 ? j3 : Math.min(j3, jMin);
        }
        return new C0D(null, str, j, jMin, -9223372036854775807L);
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A00, AnonymousClass005.A0I(this.A02, this.A01 * 31));
    }

    public C0H(C3121Byl c3121Byl, String str, int i) {
        this.A01 = i;
        this.A02 = str;
        this.A00 = c3121Byl;
    }
}

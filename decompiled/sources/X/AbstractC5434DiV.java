package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.DiV, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5434DiV implements InterfaceC5546DkO, InterfaceC5468Dj3 {
    public int A00;
    public final int A01;
    public final C5382DhZ A02;
    public final int[] A03;
    public final long[] A04;
    public final C6154Dwx[] A05;

    @Override // X.InterfaceC5441Dic
    public final void A90() {
    }

    @Override // X.InterfaceC5441Dic
    public final void A9v() {
    }

    @Override // X.InterfaceC5481DjJ
    public final int ANV(int i) {
        for (int i2 = 0; i2 < this.A01; i2++) {
            if (this.A03[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // X.InterfaceC5481DjJ
    public final int ANW(C6154Dwx c6154Dwx) {
        boolean zEquals;
        for (int i = 0; i < this.A01; i++) {
            C6154Dwx[] c6154DwxArr = this.A05;
            C6154Dwx c6154Dwx2 = c6154DwxArr[i];
            if (c6154Dwx2 != c6154Dwx) {
                if (c6154Dwx2.A0Y != null) {
                    zEquals = c6154DwxArr[i].A0Y.equals(c6154Dwx.A0Y);
                } else if (c6154Dwx.A0Y == null) {
                    zEquals = c6154DwxArr[i].equals(c6154Dwx);
                } else {
                    continue;
                }
                if (!zEquals) {
                }
            }
            return i;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                AbstractC5434DiV abstractC5434DiV = (AbstractC5434DiV) obj;
                if (this.A02 != abstractC5434DiV.A02 || !Arrays.equals(this.A03, abstractC5434DiV.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC5481DjJ
    public final C6154Dwx AFq(int i) {
        return this.A05[i];
    }

    @Override // X.InterfaceC5481DjJ
    public final int AGQ(int i) {
        return this.A03[i];
    }

    @Override // X.InterfaceC5441Dic
    public final C6154Dwx AKF() {
        return this.A05[AKG()];
    }

    @Override // X.InterfaceC5481DjJ
    public final C5382DhZ ALt() {
        return this.A02;
    }

    @Override // X.InterfaceC5441Dic
    public final boolean APB(int i, long j) {
        return AnonymousClass002.A1N((this.A04[i] > j ? 1 : (this.A04[i] == j ? 0 : -1)));
    }

    public final int hashCode() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int iIdentityHashCode = (System.identityHashCode(this.A02) * 31) + Arrays.hashCode(this.A03);
        this.A00 = iIdentityHashCode;
        return iIdentityHashCode;
    }

    @Override // X.InterfaceC5481DjJ
    public final int length() {
        return this.A03.length;
    }

    public AbstractC5434DiV(C5382DhZ c5382DhZ, int... iArr) {
        int i;
        int length = iArr.length;
        C1G.A08(AnonymousClass002.A1N(length));
        this.A02 = c5382DhZ;
        this.A01 = length;
        C6154Dwx[] c6154DwxArr = new C6154Dwx[length];
        this.A05 = c6154DwxArr;
        for (int i2 = 0; i2 < length; i2++) {
            c6154DwxArr[i2] = c5382DhZ.A04[iArr[i2]];
        }
        Arrays.sort(c6154DwxArr, new C7572F4l(29));
        int i3 = this.A01;
        int[] iArr2 = new int[i3];
        this.A03 = iArr2;
        for (int i4 = 0; i4 < i3; i4++) {
            C6154Dwx c6154Dwx = this.A05[i4];
            while (true) {
                C6154Dwx[] c6154DwxArr2 = c5382DhZ.A04;
                if (i >= c6154DwxArr2.length) {
                    i = -1;
                    break;
                }
                i = c6154Dwx != c6154DwxArr2[i] ? i + 1 : 0;
            }
            iArr2[i4] = i;
        }
        this.A04 = new long[i3];
    }

    /* JADX WARN: Incorrect types in method signature: (JLjava/util/List<+LX/DiB;>;)I */
    @Override // X.InterfaceC5441Dic
    public final int AAv(List list, long j) {
        return list.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    @Override // X.InterfaceC5441Dic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean AAw(int r12, long r13) {
        /*
            r11 = this;
            long r2 = android.os.SystemClock.elapsedRealtime()
            boolean r5 = r11.APB(r12, r2)
            r4 = 0
            r1 = 0
        La:
            int r0 = r11.A01
            r10 = 1
            if (r1 >= r0) goto L1e
            if (r5 != 0) goto L21
            if (r1 == r12) goto L1a
            boolean r0 = r11.APB(r1, r2)
            r5 = 1
            if (r0 == 0) goto L1b
        L1a:
            r5 = 0
        L1b:
            int r1 = r1 + 1
            goto La
        L1e:
            if (r5 != 0) goto L21
            return r4
        L21:
            long[] r9 = r11.A04
            r4 = r9[r12]
            long r0 = r2 + r13
            long r2 = r2 ^ r0
            long r13 = r13 ^ r0
            long r2 = r2 & r13
            r7 = 0
            int r6 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r6 >= 0) goto L35
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L35:
            long r0 = java.lang.Math.max(r4, r0)
            r9[r12] = r0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC5434DiV.AAw(int, long):boolean");
    }
}

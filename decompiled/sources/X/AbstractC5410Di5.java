package X;

import android.os.SystemClock;
import androidx.media3.common.util.Util;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.Di5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5410Di5 implements InterfaceC5441Dic {
    public int A00;
    public final C6154Dwx[] A01;
    public final long[] A02;
    public final int A03;
    public final C5382DhZ A04;
    public final int[] A05;

    @Override // X.InterfaceC5481DjJ
    public final int ANV(int i) {
        for (int i2 = 0; i2 < this.A03; i2++) {
            if (this.A05[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // X.InterfaceC5481DjJ
    public final int ANW(C6154Dwx c6154Dwx) {
        for (int i = 0; i < this.A03; i++) {
            if (this.A01[i] == c6154Dwx) {
                return i;
            }
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                AbstractC5410Di5 abstractC5410Di5 = (AbstractC5410Di5) obj;
                if (!this.A04.equals(abstractC5410Di5.A04) || !Arrays.equals(this.A05, abstractC5410Di5.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC5441Dic
    public final void A90() {
        if (this instanceof C5409Di4) {
            ((C5409Di4) this).A03 = null;
        }
    }

    @Override // X.InterfaceC5441Dic
    public final void A9v() {
        if (this instanceof C5409Di4) {
            C5409Di4 c5409Di4 = (C5409Di4) this;
            c5409Di4.A02 = -9223372036854775807L;
            c5409Di4.A03 = null;
        }
    }

    /* JADX WARN: Incorrect types in method signature: (JLjava/util/List<+LX/DiB;>;)I */
    @Override // X.InterfaceC5441Dic
    public final int AAv(List list, long j) {
        if (this instanceof C5409Di4) {
            C5409Di4 c5409Di4 = (C5409Di4) this;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = c5409Di4.A02;
            if (j2 == -9223372036854775807L || jElapsedRealtime - j2 >= 2000 || (!list.isEmpty() && !AbstractC7398Eub.A00(list).equals(c5409Di4.A03))) {
                c5409Di4.A02 = jElapsedRealtime;
                c5409Di4.A03 = list.isEmpty() ? null : (AbstractC5415DiB) AbstractC7398Eub.A00(list);
                int i = 0;
                if (!list.isEmpty()) {
                    int size = list.size();
                    if (Util.A0D(((AbstractC5411Di6) list.get(size - 1)).A04 - j, c5409Di4.A00) >= 25000000) {
                        if (!list.isEmpty()) {
                            AbstractC7398Eub.A00(list);
                        }
                        C6154Dwx c6154Dwx = ((AbstractC5410Di5) c5409Di4).A01[C5409Di4.A00(c5409Di4, jElapsedRealtime)];
                        while (i < size) {
                            AbstractC5411Di6 abstractC5411Di6 = (AbstractC5411Di6) list.get(i);
                            C6154Dwx c6154Dwx2 = abstractC5411Di6.A05;
                            if (Util.A0D(abstractC5411Di6.A04 - j, c5409Di4.A00) < 25000000 || c6154Dwx2.A05 >= c6154Dwx.A05 || c6154Dwx2.A0D == -1 || c6154Dwx2.A0D > 719 || c6154Dwx2.A0Q == -1 || c6154Dwx2.A0Q > 1279 || c6154Dwx2.A0D >= c6154Dwx.A0D) {
                                i++;
                            }
                        }
                    }
                    return size;
                }
                return i;
            }
        }
        return list.size();
    }

    @Override // X.InterfaceC5481DjJ
    public final C6154Dwx AFq(int i) {
        return this.A01[i];
    }

    @Override // X.InterfaceC5481DjJ
    public final int AGQ(int i) {
        return this.A05[i];
    }

    @Override // X.InterfaceC5441Dic
    public final C6154Dwx AKF() {
        return this.A01[AKG()];
    }

    @Override // X.InterfaceC5481DjJ
    public final C5382DhZ ALt() {
        return this.A04;
    }

    @Override // X.InterfaceC5441Dic
    public final boolean APB(int i, long j) {
        return AnonymousClass002.A1N((this.A02[i] > j ? 1 : (this.A02[i] == j ? 0 : -1)));
    }

    @Override // X.InterfaceC5441Dic
    public final void AUe(float f) {
        if (this instanceof C5409Di4) {
            ((C5409Di4) this).A00 = f;
        }
    }

    public final int hashCode() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int iIdentityHashCode = (System.identityHashCode(this.A04) * 31) + Arrays.hashCode(this.A05);
        this.A00 = iIdentityHashCode;
        return iIdentityHashCode;
    }

    @Override // X.InterfaceC5481DjJ
    public final int length() {
        return this.A05.length;
    }

    public AbstractC5410Di5(C5382DhZ c5382DhZ, int[] iArr) {
        int i;
        int length = iArr.length;
        C1G.A08(AnonymousClass002.A1N(length));
        this.A04 = c5382DhZ;
        this.A03 = length;
        C6154Dwx[] c6154DwxArr = new C6154Dwx[length];
        this.A01 = c6154DwxArr;
        for (int i2 = 0; i2 < length; i2++) {
            c6154DwxArr[i2] = c5382DhZ.A04[iArr[i2]];
        }
        Arrays.sort(c6154DwxArr, new C7572F4l(3));
        int i3 = this.A03;
        int[] iArr2 = new int[i3];
        this.A05 = iArr2;
        for (int i4 = 0; i4 < i3; i4++) {
            C6154Dwx c6154Dwx = this.A01[i4];
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
        this.A02 = new long[i3];
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
            int r0 = r11.A03
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
            long[] r9 = r11.A02
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
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC5410Di5.AAw(int, long):boolean");
    }

    @Override // X.InterfaceC5441Dic
    public final void AUa(boolean z) {
    }

    @Override // X.InterfaceC5441Dic
    public final /* synthetic */ boolean AfM(AbstractC5411Di6 abstractC5411Di6, List list, long j) {
        return false;
    }
}

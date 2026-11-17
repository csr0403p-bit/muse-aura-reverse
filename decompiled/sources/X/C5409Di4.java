package X;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.Di4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5409Di4 extends AbstractC5410Di5 {
    public float A00;
    public int A01;
    public long A02;
    public AbstractC5415DiB A03;
    public int A04;
    public final InterfaceC5047DQt A05;
    public final ImmutableList<C5379DhW> A06;
    public final E7C A07;

    public C5409Di4(C5382DhZ c5382DhZ, E7C e7c, InterfaceC5047DQt interfaceC5047DQt, List list, int[] iArr) {
        super(c5382DhZ, iArr);
        this.A05 = interfaceC5047DQt;
        this.A06 = ImmutableList.copyOf((Collection) list);
        this.A07 = e7c;
        this.A00 = 1.0f;
        this.A04 = 0;
        this.A02 = -9223372036854775807L;
    }

    public static int A00(C5409Di4 c5409Di4, long j) {
        long jACr = (long) (((long) (c5409Di4.A05.ACr() * 0.75f)) / c5409Di4.A00);
        ImmutableList<C5379DhW> immutableList = c5409Di4.A06;
        if (!immutableList.isEmpty()) {
            int i = 1;
            while (i < immutableList.size() - 1 && immutableList.get(i).A01 < jACr) {
                i++;
            }
            C5379DhW c5379DhW = immutableList.get(i - 1);
            C5379DhW c5379DhW2 = immutableList.get(i);
            long j2 = c5379DhW.A01;
            float f = (jACr - j2) / (c5379DhW2.A01 - j2);
            jACr = c5379DhW.A00 + ((long) (f * (c5379DhW2.A00 - r3)));
        }
        int i2 = 0;
        for (int i3 = 0; i3 < ((AbstractC5410Di5) c5409Di4).A03; i3++) {
            if (j == Long.MIN_VALUE || !c5409Di4.APB(i3, j)) {
                if (((AbstractC5410Di5) c5409Di4).A01[i3].A05 <= jACr) {
                    return i3;
                }
                i2 = i3;
            }
        }
        return i2;
    }

    public static void A01(List<ImmutableList.Builder<C5379DhW>> list, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < list.size(); i++) {
            ImmutableList.Builder<C5379DhW> builder = list.get(i);
            if (builder != null) {
                builder.add((ImmutableList.Builder<C5379DhW>) new C5379DhW(j, jArr[i]));
            }
        }
    }

    @Override // X.InterfaceC5441Dic
    public final int AKG() {
        return this.A01;
    }

    @Override // X.InterfaceC5441Dic
    public final Object AKJ() {
        return null;
    }

    @Override // X.InterfaceC5441Dic
    public final int AKK() {
        return this.A04;
    }

    /* JADX WARN: Incorrect types in method signature: (JJJLjava/util/List<+LX/DiB;>;[LX/Di8;)V */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0094  */
    @Override // X.InterfaceC5441Dic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ai3(java.util.List r14, X.InterfaceC5412Di8[] r15, long r16, long r18, long r20) {
        /*
            r13 = this;
            r4 = r20
            long r2 = android.os.SystemClock.elapsedRealtime()
            int r0 = r13.A01
            int r7 = r15.length
            if (r0 >= r7) goto L94
            r6 = r15[r0]
            boolean r0 = r6.ARH()
            if (r0 == 0) goto L94
        L13:
            long r11 = r6.ADe()
            long r0 = r6.ADf()
            long r11 = r11 - r0
        L1c:
            int r7 = r13.A04
            if (r7 != 0) goto L2a
            r0 = 1
            r13.A04 = r0
            int r8 = A00(r13, r2)
        L27:
            r13.A01 = r8
            return
        L2a:
            int r6 = r13.A01
            boolean r0 = r14.isEmpty()
            r8 = -1
            if (r0 != 0) goto L4a
            java.lang.Object r0 = X.AbstractC7398Eub.A00(r14)
            X.Di6 r0 = (X.AbstractC5411Di6) r0
            X.Dwx r0 = r0.A05
            int r1 = r13.ANW(r0)
            if (r1 == r8) goto L4a
            java.lang.Object r0 = X.AbstractC7398Eub.A00(r14)
            X.Di6 r0 = (X.AbstractC5411Di6) r0
            int r7 = r0.A00
            r6 = r1
        L4a:
            int r8 = A00(r13, r2)
            boolean r0 = r13.APB(r6, r2)
            if (r0 != 0) goto L71
            X.Dwx[] r0 = r13.A01
            r10 = r0[r6]
            r9 = r0[r8]
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r20 > r1 ? 1 : (r20 == r1 ? 0 : -1))
            if (r0 != 0) goto L81
            r3 = 10000000(0x989680, double:4.9406565E-317)
        L66:
            int r2 = r9.A05
            int r1 = r10.A05
            if (r2 <= r1) goto L77
            int r0 = (r18 > r3 ? 1 : (r18 == r3 ? 0 : -1))
            if (r0 >= 0) goto L77
        L70:
            r8 = r6
        L71:
            if (r8 == r6) goto L74
            r7 = 3
        L74:
            r13.A04 = r7
            goto L27
        L77:
            if (r2 >= r1) goto L71
            r1 = 25000000(0x17d7840, double:1.2351641E-316)
            int r0 = (r18 > r1 ? 1 : (r18 == r1 ? 0 : -1))
            if (r0 < 0) goto L71
            goto L70
        L81:
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 == 0) goto L87
            long r4 = r20 - r11
        L87:
            float r1 = (float) r4
            r0 = 1061158912(0x3f400000, float:0.75)
            float r1 = r1 * r0
            long r2 = (long) r1
            r0 = 10000000(0x989680, double:4.9406565E-317)
            long r3 = java.lang.Math.min(r2, r0)
            goto L66
        L94:
            r1 = 0
        L95:
            if (r1 >= r7) goto La2
            r6 = r15[r1]
            boolean r0 = r6.ARH()
            if (r0 != 0) goto L13
            int r1 = r1 + 1
            goto L95
        La2:
            boolean r0 = r14.isEmpty()
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 != 0) goto L1c
            java.lang.Object r1 = X.AbstractC7398Eub.A00(r14)
            X.Di6 r1 = (X.AbstractC5411Di6) r1
            long r6 = r1.A04
            int r0 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r0 == 0) goto L1c
            long r0 = r1.A02
            int r8 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r8 == 0) goto L1c
            long r11 = r0 - r6
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5409Di4.Ai3(java.util.List, X.Di8[], long, long, long):void");
    }
}

package X;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.HttpDataSource$HttpDataSourceException;
import androidx.media3.exoplayer.ExoPlaybackException;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.E5r, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6439E5r implements E6A, InterfaceC6271DzO, InterfaceC5503Djf, E7V, InterfaceC6069Dv7, Handler.Callback, InterfaceC6461E7a, InterfaceC6436E5o, InterfaceC6323E0y {
    public int A00;
    public int A01;
    public int A02;
    public long A06;
    public long A07;
    public ExoPlaybackException A08;
    public E81 A09;
    public E79 A0A;
    public E7K A0B;
    public E7K A0C;
    public E60 A0D;
    public DpX A0F;
    public DpX A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0R;
    public final long A0S;
    public final HandlerThread A0T;
    public final E6B A0U;
    public final C5998Dth A0V;
    public final E7C A0W;
    public final InterfaceC6459E6s A0X;
    public final E62 A0Y;
    public final E68 A0Z;
    public final InterfaceC5858Dqs A0a;
    public final InterfaceC5745Dog A0b;
    public final E5u A0c;
    public final C6430E5i A0d;
    public final C5813Dpx A0e;
    public final E65 A0f;
    public final E6Y A0g;
    public final AbstractC5823DqC A0h;
    public final E6W A0i;
    public final InterfaceC5047DQt A0j;
    public final ArrayList<C6455E6i> A0k;
    public final boolean A0l;
    public final boolean A0m;
    public final boolean A0n;
    public final boolean A0o;
    public final boolean A0p;
    public final boolean A0q;
    public final boolean A0r;
    public final InterfaceC5921Ds8[] A0s;
    public final E6P[] A0t;
    public final long A0u;
    public final long A0v;
    public final Looper A0w;
    public final InterfaceC6459E6s A0x;
    public final E84 A0y;
    public final boolean A0z;
    public final boolean A10;
    public final boolean A11;
    public final boolean A12;
    public final boolean[] A13;
    public long A03 = -9223372036854775807L;
    public boolean A0P = false;
    public boolean A0K = false;
    public C5725DoK A0E = C5725DoK.A03;
    public long A05 = -9223372036854775807L;
    public long A04 = -9223372036854775807L;
    public Timeline A0Q = Timeline.A00;

    private Pair<Dy6, Long> A04(Timeline timeline) {
        Dy6 dy6A0A;
        long jA0T = 0;
        if (AnonymousClass002.A1M(timeline.A02())) {
            dy6A0A = E60.A0L;
        } else {
            int iA07 = timeline.A07(this.A0P);
            C5998Dth c5998Dth = this.A0V;
            E6B e6b = this.A0U;
            Pair pairA09 = timeline.A09(e6b, c5998Dth, iA07, -9223372036854775807L);
            dy6A0A = this.A0c.A0A(timeline, pairA09.first);
            jA0T = BV7.A0T(pairA09);
            if (AnonymousClass002.A1P(dy6A0A.A00, -1)) {
                Dy6.A00(e6b, timeline, dy6A0A);
                jA0T = 0;
            }
        }
        return Pair.create(dy6A0A, Long.valueOf(jA0T));
    }

    public static Object A06(E6B e6b, C5998Dth c5998Dth, Timeline timeline, Timeline timeline2, Object obj, int i, boolean z) {
        int iA06 = timeline.A06(obj);
        int iA01 = timeline.A01();
        int iA062 = -1;
        for (int i2 = 0; i2 < iA01 && iA062 == -1; i2++) {
            iA06 = timeline.A05(e6b, c5998Dth, iA06, i, z);
            if (iA06 == -1) {
                return null;
            }
            iA062 = timeline2.A06(timeline.A0C(iA06));
        }
        if (iA062 != -1) {
            return timeline2.A0C(iA062);
        }
        return null;
    }

    private void A0M(Timeline timeline, Timeline timeline2) {
        if (AnonymousClass002.A1M(timeline.A02()) && AnonymousClass002.A1M(timeline2.A02())) {
            return;
        }
        ArrayList<C6455E6i> arrayList = this.A0k;
        for (int iA0K = C8j3.A0K(arrayList); iA0K >= 0; iA0K--) {
            if (!A0d(this.A0U, this.A0V, timeline, timeline2, arrayList.get(iA0K), this.A02, this.A0P)) {
                arrayList.get(iA0K).A03.A03(false);
                arrayList.remove(iA0K);
            }
        }
        Collections.sort(arrayList);
    }

    public static void A0R(C6322E0x c6322E0x) {
        synchronized (c6322E0x) {
        }
        try {
            c6322E0x.A09.AN4(c6322E0x.A01, c6322E0x.A04);
        } finally {
            c6322E0x.A03(true);
        }
    }

    private void A0W(boolean z) throws ExoPlaybackException {
        Dy6 dy6 = this.A0c.A06.A02.A04;
        long jA02 = A02(dy6, this.A0D.A0I, true, false);
        if (jA02 != this.A0D.A0I) {
            E60 e60 = this.A0D;
            this.A0D = A05(dy6, 4, jA02, e60.A04, e60.A03, z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0009  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0X(boolean r5, boolean r6) {
        /*
            r4 = this;
            r3 = 0
            r2 = 1
            if (r5 != 0) goto L9
            boolean r1 = r4.A0I
            r0 = 0
            if (r1 != 0) goto La
        L9:
            r0 = 1
        La:
            r4.A0Y(r0, r3, r2, r3)
            X.E79 r0 = r4.A0A
            r0.A00(r6)
            X.Dog r1 = r4.A0b
            X.E6Y r0 = r4.A0g
            r1.AWJ(r0)
            r4.A0G(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6439E5r.A0X(boolean, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:
    
        if (r6.A02 == Long.MIN_VALUE) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A0d(X.E6B r10, X.C5998Dth r11, androidx.media3.common.Timeline r12, androidx.media3.common.Timeline r13, X.C6455E6i r14, int r15, boolean r16) {
        /*
            r5 = r14
            java.lang.Object r0 = r14.A02
            r14 = 0
            r4 = 1
            r7 = -9223372036854775808
            r9 = r10
            r10 = r11
            r11 = r12
            if (r0 != 0) goto L75
            X.E0x r6 = r5.A03
            long r0 = r6.A02
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 != 0) goto L70
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L19:
            androidx.media3.common.Timeline r3 = r6.A08
            int r2 = r6.A00
            X.E7K r12 = new X.E7K
            r12.<init>(r3, r2, r0)
            r13 = r15
            r15 = r16
            android.util.Pair r2 = A03(r9, r10, r11, r12, r13, r14, r15)
            if (r2 == 0) goto Lc0
            java.lang.Object r0 = r2.first
            int r3 = r11.A06(r0)
            long r0 = X.BV7.A0T(r2)
            java.lang.Object r2 = r2.first
            r5.A00 = r3
            r5.A01 = r0
            r5.A02 = r2
            long r0 = r6.A02
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 != 0) goto L69
        L43:
            java.lang.Object r0 = r5.A02
            int r0 = X.E6B.A01(r9, r11, r0)
            X.Dth r0 = X.BV7.A0d(r10, r11, r0)
            int r3 = r0.A01
            X.E6B r0 = r11.A0D(r9, r3, r4)
            java.lang.Object r8 = r0.A05
            long r6 = r9.A01
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 == 0) goto L6a
            r0 = 1
            long r6 = r6 - r0
        L63:
            r5.A00 = r3
        L65:
            r5.A01 = r6
            r5.A02 = r8
        L69:
            return r4
        L6a:
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L63
        L70:
            long r0 = androidx.media3.common.util.Util.A0A(r0)
            goto L19
        L75:
            int r3 = r12.A06(r0)
            r0 = -1
            if (r3 == r0) goto Lc0
            X.E0x r0 = r5.A03
            long r0 = r0.A02
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 == 0) goto L43
            r5.A00 = r3
            java.lang.Object r0 = r5.A02
            r13.A0B(r9, r0)
            boolean r0 = r9.A06
            if (r0 == 0) goto L69
            int r0 = r9.A00
            X.Dth r0 = X.BV7.A0d(r10, r13, r0)
            int r1 = r0.A00
            java.lang.Object r0 = r5.A02
            int r0 = r13.A06(r0)
            if (r1 != r0) goto L69
            long r2 = r5.A01
            long r0 = r9.A02
            long r2 = r2 + r0
            java.lang.Object r0 = r5.A02
            int r14 = X.E6B.A01(r9, r12, r0)
            r12 = r9
            r13 = r10
            r15 = r2
            android.util.Pair r1 = r11.A09(r12, r13, r14, r15)
            java.lang.Object r0 = r1.first
            int r0 = r11.A06(r0)
            long r6 = X.BV7.A0T(r1)
            java.lang.Object r8 = r1.first
            r5.A00 = r0
            goto L65
        Lc0:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6439E5r.A0d(X.E6B, X.Dth, androidx.media3.common.Timeline, androidx.media3.common.Timeline, X.E6i, int, boolean):boolean");
    }

    private long A00(long j) {
        C6444E5x c6444E5x = this.A0c.A05;
        if (c6444E5x == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.A07 - c6444E5x.A00));
    }

    private long A01(Timeline timeline, Object obj, long j) {
        E6B e6b = this.A0U;
        int iA01 = E6B.A01(e6b, timeline, obj);
        C5998Dth c5998Dth = this.A0V;
        timeline.A0E(c5998Dth, iA01, 0L);
        long j2 = c5998Dth.A07;
        if (j2 == -9223372036854775807L || c5998Dth.A08 == null || !c5998Dth.A0D) {
            return -9223372036854775807L;
        }
        return Util.A0A(Util.A09(c5998Dth.A04) - j2) - (j + e6b.A02);
    }

    /* JADX WARN: Incorrect types in method signature: (Landroidx/media3/common/Timeline;LX/E7K;ZIZLX/Dth;LX/E6B;)Landroid/util/Pair<Ljava/lang/Object;Ljava/lang/Long;>; */
    public static Pair A03(E6B e6b, C5998Dth c5998Dth, Timeline timeline, E7K e7k, int i, boolean z, boolean z2) {
        long j;
        Pair pairA09;
        Object objA06;
        Timeline timeline2 = e7k.A02;
        if (AnonymousClass002.A1M(timeline.A02())) {
            return null;
        }
        if (AnonymousClass002.A1M(timeline2.A02())) {
            timeline2 = timeline;
        }
        try {
            int i2 = e7k.A00;
            j = e7k.A01;
            pairA09 = timeline2.A09(e6b, c5998Dth, i2, j);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (!timeline.equals(timeline2)) {
            if (timeline.A06(pairA09.first) == -1) {
                if (z && (objA06 = A06(e6b, c5998Dth, timeline2, timeline, pairA09.first, i, z2)) != null) {
                    return timeline.A09(e6b, c5998Dth, E6B.A01(e6b, timeline, objA06), -9223372036854775807L);
                }
                return null;
            }
            if (timeline2.A0B(e6b, pairA09.first).A06 && BV7.A0d(c5998Dth, timeline2, e6b.A00).A00 == timeline2.A06(pairA09.first)) {
                return timeline.A09(e6b, c5998Dth, E6B.A01(e6b, timeline, pairA09.first), j);
            }
        }
        return pairA09;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private X.E60 A05(X.Dy6 r19, int r20, long r21, long r23, long r25, boolean r27) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6439E5r.A05(X.Dy6, int, long, long, long, boolean):X.E60");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A07() {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6439E5r.A07():void");
    }

    private void A08() {
        E79 e79 = this.A0A;
        E60 e60 = this.A0D;
        boolean zA1Z = e79.A03 | AnonymousClass006.A1Z(e79.A02, e60);
        e79.A03 = zA1Z;
        e79.A02 = e60;
        if (zA1Z) {
            C6438E5q c6438E5q = ((E7Q) this.A0y).A00;
            BV6.A1C(c6438E5q.A0i, new E63(c6438E5q, e79));
            E60 e602 = this.A0D;
            E79 e792 = new E79();
            e792.A02 = e602;
            this.A0A = e792;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A09() {
        /*
            r2 = this;
            X.E5u r0 = r2.A0c
            X.E5x r0 = r0.A06
            if (r0 == 0) goto L11
            X.E6Q r0 = r0.A02
            boolean r0 = r0.A08
            if (r0 == 0) goto L11
            boolean r1 = r2.A0K
            r0 = 1
            if (r1 != 0) goto L12
        L11:
            r0 = 0
        L12:
            r2.A0L = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6439E5r.A09():void");
    }

    private void A0A() {
        C6444E5x c6444E5x = this.A0c.A06;
        if (c6444E5x == null) {
            return;
        }
        E6W e6w = c6444E5x.A04;
        int i = 0;
        while (true) {
            E6P[] e6pArr = this.A0t;
            if (i >= e6pArr.length) {
                return;
            }
            if (AnonymousClass002.A1X(e6w.A03[i])) {
                InterfaceC6068Dv6 interfaceC6068Dv6 = e6pArr[i].A02;
                if (interfaceC6068Dv6.AL0() == 1) {
                    interfaceC6068Dv6.start();
                }
            }
            i++;
        }
    }

    private void A0B() {
        this.A0Z.A02();
        for (E6P e6p : this.A0t) {
            InterfaceC6068Dv6 interfaceC6068Dv6 = e6p.A02;
            if (interfaceC6068Dv6.AL0() != 0 && interfaceC6068Dv6.AL0() == 2) {
                interfaceC6068Dv6.stop();
            }
        }
    }

    private void A0C() {
        C6444E5x c6444E5x = this.A0c.A05;
        boolean z = this.A0O || (c6444E5x != null && c6444E5x.A08.AOd());
        E60 e60 = this.A0D;
        if (z != e60.A0D) {
            this.A0D = e60.A0A(z);
        }
    }

    private void A0D() {
        C6455E6i c6455E6i;
        int i;
        E5u e5u = this.A0c;
        C6444E5x c6444E5x = e5u.A06;
        if (c6444E5x == null) {
            this.A0D.A0J = -9223372036854775807L;
            return;
        }
        long jAZF = c6444E5x.A07 ? c6444E5x.A08.AZF() : -9223372036854775807L;
        if (jAZF != -9223372036854775807L) {
            A0J(jAZF);
            if (jAZF != this.A0D.A0I) {
                E60 e60 = this.A0D;
                this.A0D = A05(e60.A09, 4, jAZF, e60.A04, jAZF, true);
            }
        } else {
            long jA01 = this.A0Z.A01(AnonymousClass006.A1Z(c6444E5x, e5u.A08));
            this.A07 = jA01;
            long j = jA01 - c6444E5x.A00;
            long j2 = this.A0D.A0I;
            ArrayList<C6455E6i> arrayList = this.A0k;
            if (!arrayList.isEmpty()) {
                E60 e602 = this.A0D;
                Dy6 dy6 = e602.A09;
                if (!AnonymousClass002.A1P(dy6.A00, -1)) {
                    if (this.A0H) {
                        j2--;
                        this.A0H = false;
                    }
                    int iA06 = e602.A06.A06(dy6.A04);
                    int iMin = Math.min(this.A01, arrayList.size());
                    if (iMin > 0) {
                        C6455E6i c6455E6i2 = arrayList.get(iMin - 1);
                        while (c6455E6i2 != null && (c6455E6i2.A00 > iA06 || (c6455E6i2.A00 == iA06 && c6455E6i2.A01 > j2))) {
                            int i2 = iMin - 1;
                            c6455E6i2 = i2 > 0 ? arrayList.get(iMin - 2) : null;
                            iMin = i2;
                        }
                    }
                    while (iMin < arrayList.size() && (c6455E6i = arrayList.get(iMin)) != null) {
                        if (c6455E6i.A02 == null || ((i = c6455E6i.A00) >= iA06 && (i != iA06 || c6455E6i.A01 > j2))) {
                            while (c6455E6i.A02 != null && c6455E6i.A00 == iA06) {
                                long j3 = c6455E6i.A01;
                                if (j3 <= j2 || j3 > j) {
                                    break;
                                }
                                try {
                                    A0Q(c6455E6i.A03);
                                    arrayList.remove(iMin);
                                    if (iMin >= arrayList.size() || (c6455E6i = arrayList.get(iMin)) == null) {
                                        break;
                                    }
                                } catch (Throwable th) {
                                    arrayList.remove(iMin);
                                    throw th;
                                }
                            }
                            this.A01 = iMin;
                        } else {
                            iMin++;
                        }
                    }
                    this.A01 = iMin;
                }
            }
            E60 e603 = this.A0D;
            e603.A0I = j;
            e603.A0H = SystemClock.elapsedRealtime();
        }
        this.A0D.A0G = e5u.A05.A02();
        E60 e604 = this.A0D;
        e604.A0K = A00(e604.A0G);
        boolean z = this.A10;
        E60 e605 = this.A0D;
        if (z) {
            e605.A0J = BV5.A07(c6444E5x.A08.AD6(e605.A0I));
        } else {
            e605.A0J = -9223372036854775807L;
        }
        E60 e606 = this.A0D;
        if (e606.A0E && e606.A01 == 3 && A0e(e606.A06, e606.A09)) {
            E60 e607 = this.A0D;
            if (e607.A05.A01 == 1.0f) {
                float fACE = this.A0a.ACE(A01(e607.A06, e607.A09.A04, e607.A0I), this.A0D.A0K);
                E68 e68 = this.A0Z;
                if (E68.A00(e68) != fACE) {
                    C6233Dyb c6233Dyb = new C6233Dyb(fACE, this.A0D.A05.A00);
                    BV6.A1A(this.A0X, 16);
                    e68.Ae1(c6233Dyb);
                    A0L(this.A0D.A05, E68.A00(e68), false, false);
                }
            }
        }
    }

    private void A0E(float f) {
        for (C6444E5x c6444E5x = this.A0c.A06; c6444E5x != null; c6444E5x = c6444E5x.A01) {
            for (InterfaceC5441Dic interfaceC5441Dic : c6444E5x.A04.A04) {
                if (interfaceC5441Dic != null) {
                    interfaceC5441Dic.AUe(f);
                }
            }
        }
    }

    private void A0F(int i) {
        InterfaceC6068Dv6 interfaceC6068Dv6 = this.A0t[i].A02;
        int iAL0 = interfaceC6068Dv6.AL0();
        boolean zA1L = AnonymousClass002.A1L(iAL0);
        E68 e68 = this.A0Z;
        if (iAL0 != 0) {
            if (interfaceC6068Dv6 == e68.A01) {
                e68.A00 = null;
                e68.A01 = null;
                e68.A02 = true;
            }
            if (iAL0 == 2) {
                interfaceC6068Dv6.stop();
            }
            interfaceC6068Dv6.A90();
        }
        A0I(i, false);
        this.A00 -= zA1L ? 1 : 0;
    }

    private void A0G(int i) {
        E60 e60 = this.A0D;
        if (e60.A01 != i) {
            if (i != 2) {
                this.A05 = -9223372036854775807L;
            }
            this.A0D = e60.A03(i);
        }
    }

    private void A0H(int i, int i2, boolean z, boolean z2) {
        E79 e79 = this.A0A;
        e79.A00(z2 ? 1 : 0);
        e79.A03 = true;
        this.A0J = false;
        this.A04 = -9223372036854775807L;
        E60 e60A04 = this.A0D.A04(i2, i, z);
        this.A0D = e60A04;
        E5u e5u = this.A0c;
        for (C6444E5x c6444E5x = e5u.A05; c6444E5x != null; c6444E5x = c6444E5x.A01) {
            for (InterfaceC5441Dic interfaceC5441Dic : c6444E5x.A04.A04) {
                if (interfaceC5441Dic != null) {
                    interfaceC5441Dic.AUa(z);
                }
            }
        }
        if (!A0c()) {
            A0B();
            A0D();
            long j = this.A07;
            C6444E5x c6444E5x2 = e5u.A05;
            if (c6444E5x2 != null) {
                c6444E5x2.A06(j);
                return;
            }
            return;
        }
        int i3 = e60A04.A01;
        if (i3 == 3) {
            this.A0J = false;
            this.A04 = -9223372036854775807L;
            E68 e68 = this.A0Z;
            e68.A03 = true;
            e68.A06.A00();
            A0A();
        } else if (i3 != 2) {
            return;
        }
        BV6.A1B(this.A0X, 2);
    }

    private void A0I(final int i, final boolean z) {
        boolean[] zArr = this.A13;
        if (zArr[i] != z) {
            zArr[i] = z;
            BV6.A1C(this.A0x, new Runnable() { // from class: X.E6f
                public static final String __redex_internal_original_name = "ExoPlayerImplInternal$$ExternalSyntheticLambda0";

                @Override // java.lang.Runnable
                public final void run() {
                    C6439E5r c6439E5r = this.A01;
                    c6439E5r.A0f.AVK(i, z);
                }
            });
        }
    }

    private void A0J(long j) {
        E5u e5u = this.A0c;
        C6444E5x c6444E5x = e5u.A06;
        long j2 = j + (c6444E5x == null ? 1000000000000L : c6444E5x.A00);
        this.A07 = j2;
        this.A0Z.A06.A01(j2);
        for (E6P e6p : this.A0t) {
            long j3 = this.A07;
            InterfaceC6068Dv6 interfaceC6068Dv6 = e6p.A02;
            if (interfaceC6068Dv6.AL0() != 0) {
                interfaceC6068Dv6.AbP(j3);
            }
        }
        for (C6444E5x c6444E5x2 = e5u.A06; c6444E5x2 != null; c6444E5x2 = c6444E5x2.A01) {
            for (int i = 0; i < c6444E5x2.A04.A04.length; i++) {
            }
        }
    }

    private void A0K(long j) {
        long jMin;
        C6444E5x c6444E5x;
        C6444E5x c6444E5x2;
        if (this.A0m || this.A0M) {
            jMin = this.A0D.A01 == 3 ? 1000L : 10L;
            if (!this.A0n || A0c()) {
                for (E6P e6p : this.A0t) {
                    long j2 = this.A07;
                    long j3 = this.A06;
                    InterfaceC6068Dv6 interfaceC6068Dv6 = e6p.A02;
                    jMin = Math.min(jMin, Util.A0B(interfaceC6068Dv6.AL0() != 0 ? interfaceC6068Dv6.AEx(j2, j3) : LinkEncryptedPairingKt.LINK_COUNTER_MAX));
                }
            }
            E60 e60 = this.A0D;
            if (e60.A0B() && (c6444E5x = this.A0c.A06) != null && (c6444E5x2 = c6444E5x.A01) != null && this.A07 + (Util.A0A(jMin) * e60.A05.A01) >= c6444E5x2.A02.A03 + c6444E5x2.A00) {
                jMin = Math.min(jMin, 10L);
            }
        } else {
            jMin = (this.A0D.A01 != 3 || A0c()) ? 10L : 1000L;
        }
        ((E6I) this.A0X).A00.sendEmptyMessageAtTime(2, j + jMin);
    }

    private void A0L(C6233Dyb c6233Dyb, float f, boolean z, boolean z2) {
        if (z) {
            if (z2) {
                this.A0A.A00(1);
            }
            this.A0D = this.A0D.A05(c6233Dyb);
        }
        if (!this.A0z) {
            A0E(c6233Dyb.A01);
        }
        for (E6P e6p : this.A0t) {
            e6p.A02.Ae2(f, c6233Dyb.A01);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:184:0x0367, code lost:
    
        if ((!r8.A0C(r7)) != false) goto L158;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0235 A[Catch: all -> 0x0372, TryCatch #0 {all -> 0x0372, blocks: (B:110:0x0230, B:112:0x0235, B:114:0x0239, B:115:0x023d, B:129:0x0278, B:133:0x0288, B:135:0x028c, B:143:0x029d, B:185:0x0369, B:132:0x0285, B:128:0x0273, B:118:0x0253, B:120:0x025b, B:122:0x0263, B:183:0x0361, B:148:0x02a8, B:150:0x02ac, B:152:0x02b8, B:153:0x02c3, B:154:0x02c6, B:156:0x02ce), top: B:214:0x01f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02dd A[EDGE_INSN: B:217:0x02dd->B:158:0x02dd BREAK  A[LOOP:1: B:111:0x0233->B:128:0x0273], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0057  */
    /* JADX WARN: Type inference failed for: r22v12 */
    /* JADX WARN: Type inference failed for: r22v13 */
    /* JADX WARN: Type inference failed for: r22v18 */
    /* JADX WARN: Type inference failed for: r22v19 */
    /* JADX WARN: Type inference failed for: r22v7, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0O(androidx.media3.common.Timeline r34, boolean r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1015
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6439E5r.A0O(androidx.media3.common.Timeline, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a7 A[Catch: all -> 0x018d, TryCatch #1 {all -> 0x018d, blocks: (B:18:0x0099, B:20:0x00a7, B:23:0x00ae, B:25:0x00b2, B:26:0x00b5, B:27:0x00ba, B:29:0x00c2, B:31:0x00c8, B:35:0x00d0, B:41:0x00e0, B:43:0x00e6, B:45:0x00ea, B:47:0x0107, B:49:0x010d, B:52:0x011a, B:53:0x011e, B:55:0x012e, B:61:0x013c, B:63:0x0141, B:65:0x014d, B:67:0x0157, B:70:0x0165, B:51:0x0113, B:58:0x0136), top: B:82:0x0099 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0P(X.E7K r28, boolean r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6439E5r.A0P(X.E7K, boolean):void");
    }

    private void A0Q(C6322E0x c6322E0x) {
        if (c6322E0x.A03 != this.A0w) {
            C6447E6a.A00(this.A0X, c6322E0x, 15);
            return;
        }
        A0R(c6322E0x);
        int i = this.A0D.A01;
        if (i == 3 || i == 2) {
            BV6.A1B(this.A0X, 2);
        }
    }

    private void A0S(E6P e6p) throws HttpDataSource$HttpDataSourceException {
        try {
            e6p.A02.AQT();
        } catch (HttpDataSource$HttpDataSourceException e) {
            if (e.getClass().equals(HttpDataSource$HttpDataSourceException.class) && this.A12) {
                long j = this.A03;
                if (j == -9223372036854775807L) {
                    CNC.A04("ExoPlayerImplInternal", BV5.A0n("Temporarily ignoring stream error: ", e));
                    this.A03 = System.currentTimeMillis();
                    return;
                } else if (System.currentTimeMillis() - j <= this.A0v) {
                    return;
                }
            }
            throw e;
        }
    }

    private void A0T(Dy6 dy6, C5414DiA c5414DiA, E6W e6w) {
        E5u e5u = this.A0c;
        C6444E5x c6444E5x = e5u.A05;
        c6444E5x.getClass();
        C6444E5x c6444E5x2 = e5u.A06;
        long j = this.A07 - c6444E5x.A00;
        if (c6444E5x != c6444E5x2) {
            j -= c6444E5x.A02.A03;
        }
        long jA00 = A00(c6444E5x.A02());
        long jALV = A0e(this.A0D.A06, c6444E5x.A02.A04) ? this.A0a.ALV() : -9223372036854775807L;
        this.A0b.AWf(new C5820Dq6(this.A0D.A06, this.A0g, dy6, E68.A00(this.A0Z), j, jA00, jALV, this.A04, this.A0D.A0E, this.A0J), c5414DiA, e6w.A04);
    }

    private void A0V(boolean z) {
        C6444E5x c6444E5x = this.A0c.A05;
        Dy6 dy6 = c6444E5x == null ? this.A0D.A09 : c6444E5x.A02.A04;
        boolean zEquals = this.A0D.A08.equals(dy6);
        if (!zEquals) {
            this.A0D = this.A0D.A08(dy6);
        }
        E60 e60 = this.A0D;
        e60.A0G = c6444E5x == null ? e60.A0I : c6444E5x.A02();
        E60 e602 = this.A0D;
        e602.A0K = A00(e602.A0G);
        if ((!zEquals || z) && c6444E5x != null && c6444E5x.A07) {
            A0T(c6444E5x.A02.A04, c6444E5x.A03, c6444E5x.A04);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0126 A[PHI: r0 r2 r10
  0x0126: PHI (r0v10 long) = (r0v9 long), (r0v18 long) binds: [B:27:0x008c, B:29:0x00ad] A[DONT_GENERATE, DONT_INLINE]
  0x0126: PHI (r2v2 long) = (r2v1 long), (r2v4 long) binds: [B:27:0x008c, B:29:0x00ad] A[DONT_GENERATE, DONT_INLINE]
  0x0126: PHI (r10v1 X.Dy6) = (r10v0 X.Dy6), (r10v4 X.Dy6) binds: [B:27:0x008c, B:29:0x00ad] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0Y(boolean r39, boolean r40, boolean r41, boolean r42) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6439E5r.A0Y(boolean, boolean, boolean, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0Z(boolean[] r31) throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            r30 = this;
            r10 = r30
            X.E5u r9 = r10.A0c
            X.E5x r11 = r9.A08
            X.E6W r8 = r11.A04
            r7 = 0
            r2 = 0
        La:
            X.E6P[] r6 = r10.A0t
            int r5 = r6.length
            if (r2 >= r5) goto L29
            X.Dsl[] r0 = r8.A03
            r0 = r0[r2]
            boolean r0 = X.AnonymousClass002.A1X(r0)
            if (r0 != 0) goto L26
            r1 = r6[r2]
            boolean r0 = r1.A00
            if (r0 == 0) goto L26
            X.Dv6 r0 = r1.A02
            r0.reset()
            r1.A00 = r7
        L26:
            int r2 = r2 + 1
            goto La
        L29:
            if (r7 >= r5) goto Lc9
            X.Dsl[] r0 = r8.A03
            r0 = r0[r7]
            boolean r0 = X.AnonymousClass002.A1X(r0)
            if (r0 == 0) goto Lc5
            boolean r13 = r31[r7]
            X.E5x r4 = r9.A08
            r3 = r6[r7]
            X.Dv6 r0 = r3.A02
            int r0 = r0.AL0()
            if (r0 != 0) goto Lc5
            X.E5x r0 = r9.A06
            boolean r30 = X.AnonymousClass002.A1Z(r4, r0)
            X.E6W r1 = r4.A04
            X.Dsl[] r0 = r1.A03
            r19 = r0[r7]
            X.Dic[] r0 = r1.A04
            r2 = r0[r7]
            r1 = 0
            if (r2 == 0) goto L67
            int r0 = r2.length()
        L5a:
            X.Dwx[] r14 = new X.C6154Dwx[r0]
        L5c:
            if (r1 >= r0) goto L69
            X.Dwx r12 = r2.AFq(r1)
            r14[r1] = r12
            int r1 = r1 + 1
            goto L5c
        L67:
            r0 = 0
            goto L5a
        L69:
            boolean r0 = r10.A0c()
            if (r0 == 0) goto L78
            X.E60 r0 = r10.A0D
            int r1 = r0.A01
            r0 = 3
            r17 = 1
            if (r1 == r0) goto L7a
        L78:
            r17 = 0
        L7a:
            if (r13 != 0) goto L80
            r29 = 1
            if (r17 != 0) goto L82
        L80:
            r29 = 0
        L82:
            int r0 = r10.A00
            int r0 = r0 + 1
            r10.A00 = r0
            X.DuF[] r0 = r4.A0C
            r21 = r0[r7]
            long r15 = r10.A07
            X.E6Q r2 = r4.A02
            long r0 = r2.A03
            long r12 = r4.A00
            long r0 = r0 + r12
            X.Dy6 r2 = r2.A04
            r20 = r2
            X.E68 r4 = r10.A0Z
            r2 = 1
            r3.A00 = r2
            X.Dv6 r3 = r3.A02
            r22 = r14
            r23 = r15
            r25 = r0
            r27 = r12
            r18 = r3
            r18.A9y(r19, r20, r21, r22, r23, r25, r27, r29, r30)
            r4.A03(r3)
            X.E6g r1 = new X.E6g
            r1.<init>(r10)
            r0 = 11
            r3.AN4(r0, r1)
            if (r17 == 0) goto Lc5
            int r0 = r3.AL0()
            if (r0 != r2) goto Lc5
            r3.start()
        Lc5:
            int r7 = r7 + 1
            goto L29
        Lc9:
            r0 = 1
            r11.A05 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6439E5r.A0Z(boolean[]):void");
    }

    private boolean A0a() {
        C6444E5x c6444E5x = this.A0c.A05;
        return (c6444E5x == null || (c6444E5x.A07 && c6444E5x.A08.AI5() == Long.MIN_VALUE)) ? false : true;
    }

    private boolean A0b() {
        C6444E5x c6444E5x = this.A0c.A06;
        long j = c6444E5x.A02.A00;
        if (c6444E5x.A07) {
            return j == -9223372036854775807L || this.A0D.A0I < j || !A0c();
        }
        return false;
    }

    private boolean A0c() {
        E60 e60 = this.A0D;
        return e60.A0E && e60.A02 == 0;
    }

    private boolean A0e(Timeline timeline, Dy6 dy6) {
        if (AnonymousClass002.A1P(dy6.A00, -1) || AnonymousClass002.A1M(timeline.A02())) {
            return false;
        }
        int iA01 = E6B.A01(this.A0U, timeline, dy6.A04);
        C5998Dth c5998Dth = this.A0V;
        timeline.A0E(c5998Dth, iA01, 0L);
        return (c5998Dth.A08 == null || !c5998Dth.A0D || c5998Dth.A07 == -9223372036854775807L) ? false : true;
    }

    /* JADX WARN: Incorrect types in method signature: (ILjava/util/List<LX/E5j;>;LX/E5p;)V */
    @Override // X.E6A
    public final void A3h(InterfaceC6437E5p interfaceC6437E5p, List list, int i) {
        C6447E6a.A02(this.A0X, 18, new C6458E6r(interfaceC6437E5p, list, -1, -9223372036854775807L), i, 0);
    }

    @Override // X.E7V
    public final void AB2(int i) {
        this.A0X.ARc(33, i, 0).A03();
    }

    @Override // X.E6A
    public final Looper AIn() {
        return this.A0w;
    }

    @Override // X.InterfaceC5495DjX
    public final /* bridge */ /* synthetic */ void ASS(InterfaceC5487DjP interfaceC5487DjP) {
        C6447E6a.A00(this.A0X, interfaceC5487DjP, 9);
    }

    @Override // X.InterfaceC6436E5o
    public final void AUk() {
        BV6.A1B(this.A0X, 22);
    }

    @Override // X.InterfaceC5503Djf
    public final void AUv(InterfaceC6006Dtp interfaceC6006Dtp) {
        C6447E6a.A00(this.A0X, interfaceC6006Dtp, 8);
    }

    @Override // X.InterfaceC6069Dv7
    public final void AWe() {
        BV6.A1B(this.A0X, 10);
    }

    @Override // X.InterfaceC6271DzO
    public final void AX9(MediaFormat mediaFormat, C6154Dwx c6154Dwx, long j, long j2) {
        if (this.A0N) {
            this.A0X.ARb(37).A03();
        }
    }

    @Override // X.E6A
    public final boolean AaB() {
        if (this.A0R || !BV7.A1V(this.A0w)) {
            return true;
        }
        this.A0R = true;
        C5778DpK c5778DpK = new C5778DpK(this.A0W);
        C6447E6a.A00(this.A0X, c5778DpK, 7);
        return c5778DpK.A03(this.A0u);
    }

    @Override // X.E6A
    public final void Aat(InterfaceC6437E5p interfaceC6437E5p, int i, int i2) {
        C6447E6a.A02(this.A0X, 20, interfaceC6437E5p, i, i2);
    }

    @Override // X.E6A
    public final void AcO(Timeline timeline, int i, long j) {
        C6447E6a.A00(this.A0X, new E7K(timeline, i, j), 3);
    }

    @Override // X.InterfaceC6323E0y
    public final void AcX(C6322E0x c6322E0x) {
        if (!this.A0R && BV7.A1V(this.A0w)) {
            C6447E6a.A00(this.A0X, c6322E0x, 14);
        } else {
            CNC.A04("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            c6322E0x.A03(false);
        }
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/List<LX/E5j;>;IJLX/E5p;)V */
    @Override // X.E6A
    public final void Adj(InterfaceC6437E5p interfaceC6437E5p, List list, int i, long j) {
        C6447E6a.A00(this.A0X, new C6458E6r(interfaceC6437E5p, list, i, j), 17);
    }

    @Override // X.E6A
    public final void Ae0(boolean z, int i, int i2) {
        if (!this.A11 || i2 != 4) {
            i2 = 0;
        }
        this.A0X.ARc(1, z ? 1 : 0, i2).A03();
    }

    @Override // X.E6A
    public final void Ae1(C6233Dyb c6233Dyb) {
        C6447E6a.A00(this.A0X, c6233Dyb, 4);
    }

    @Override // X.E6A
    public final void AeN(int i) {
        this.A0X.ARc(11, i, 0).A03();
    }

    @Override // X.E6A
    public final void Aea(boolean z) {
        C6447E6a.A00(this.A0X, Boolean.valueOf(z), 36);
    }

    @Override // X.E6A
    public final void Aeb(C5725DoK c5725DoK) {
        C6447E6a.A00(this.A0X, c5725DoK, 38);
    }

    @Override // X.E6A
    public final void Aec(DpX dpX) {
        C6447E6a.A00(this.A0X, dpX, 5);
    }

    @Override // X.E6A
    public final boolean AfC(Object obj, long j) {
        if (this.A0R || !BV7.A1V(this.A0w)) {
            return true;
        }
        C5778DpK c5778DpK = new C5778DpK(this.A0W);
        C6447E6a.A00(this.A0X, BV4.A0A(obj, c5778DpK), 30);
        if (j != -9223372036854775807L) {
            return c5778DpK.A03(j);
        }
        return true;
    }

    @Override // X.E6A
    public final void AfF(float f) {
        C6447E6a.A00(this.A0X, Float.valueOf(f), 32);
    }

    @Override // X.E7V
    public final void AfG() {
        BV6.A1B(this.A0X, 34);
    }

    /* JADX WARN: Code restructure failed: missing block: B:526:0x0acf, code lost:
    
        if (r23 == false) goto L527;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 0, insn: 0x0bf3: INVOKE (r0 I:X.E5r), (r4 I:java.io.IOException), (r2 I:int) DIRECT call: X.E5r.A0U(java.io.IOException, int):void A[MD:(java.io.IOException, int):void (m)] (LINE:3059), block:B:614:0x0bf1 */
    /* JADX WARN: Not initialized variable reg: 0, insn: 0x0c0b: INVOKE (r0 I:X.E5r), (r3 I:java.io.IOException), (r2 I:int) DIRECT call: X.E5r.A0U(java.io.IOException, int):void A[MD:(java.io.IOException, int):void (m)] (LINE:3083), block:B:624:0x0c0b */
    /* JADX WARN: Not initialized variable reg: 0, insn: 0x0c14: IGET (r2 I:X.E5u) = (r0 I:X.E5r) (LINE:3092) X.E5r.A0c X.E5u, block:B:628:0x0c14 */
    /* JADX WARN: Not initialized variable reg: 0, insn: 0x0c26: IGET (r2 I:androidx.media3.exoplayer.ExoPlaybackException) = (r0 I:X.E5r) (LINE:3110) X.E5r.A08 androidx.media3.exoplayer.ExoPlaybackException, block:B:633:0x0c26 */
    /* JADX WARN: Not initialized variable reg: 0, insn: 0x0c51: IGET (r2 I:androidx.media3.exoplayer.ExoPlaybackException) = (r0 I:X.E5r) (LINE:3153) X.E5r.A08 androidx.media3.exoplayer.ExoPlaybackException, block:B:636:0x0c51 */
    /* JADX WARN: Not initialized variable reg: 0, insn: 0x0c73: INVOKE (r0 I:X.E5r), (r1 I:boolean), (r4 I:boolean) DIRECT call: X.E5r.A0X(boolean, boolean):void A[MD:(boolean, boolean):void (m)] (LINE:3187), block:B:646:0x0c6c */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0612 A[Catch: BehindLiveWindowException -> 0x0bdc, DataSourceException -> 0x0be0, ParserException -> 0x0be4, DrmSession$DrmSessionException -> 0x0c04, IOException -> 0x0c08, ExoPlaybackException -> 0x0c0f, RuntimeException -> 0x0c5b, PHI: r5
  0x0612: PHI (r5v9 X.E5x) = (r5v8 X.E5x), (r5v35 X.E5x) binds: [B:250:0x05ef, B:258:0x0610] A[DONT_GENERATE, DONT_INLINE], TryCatch #3 {ParserException -> 0x0be4, DataSourceException -> 0x0be0, ExoPlaybackException -> 0x0c0f, DrmSession$DrmSessionException -> 0x0c04, BehindLiveWindowException -> 0x0bdc, IOException -> 0x0c08, RuntimeException -> 0x0c5b, blocks: (B:3:0x0008, B:4:0x000e, B:6:0x0012, B:8:0x0018, B:9:0x0021, B:11:0x002d, B:13:0x0033, B:14:0x0035, B:16:0x003f, B:17:0x0042, B:19:0x0048, B:20:0x0050, B:22:0x0058, B:24:0x0065, B:25:0x006b, B:27:0x0073, B:29:0x0079, B:30:0x007b, B:32:0x0085, B:33:0x0088, B:35:0x0092, B:37:0x009d, B:38:0x00a1, B:39:0x00a4, B:41:0x00ae, B:44:0x00b8, B:45:0x00bd, B:47:0x00cd, B:49:0x00d8, B:50:0x00db, B:51:0x00de, B:56:0x00ef, B:54:0x00e8, B:57:0x00f4, B:60:0x0113, B:61:0x0129, B:63:0x013b, B:64:0x0140, B:66:0x0148, B:67:0x0156, B:68:0x015e, B:70:0x0166, B:72:0x0172, B:74:0x0178, B:76:0x0187, B:77:0x018a, B:78:0x018e, B:79:0x01a6, B:80:0x01ab, B:82:0x01b1, B:84:0x01ba, B:141:0x0369, B:142:0x036c, B:87:0x01c4, B:88:0x01cf, B:89:0x01e3, B:92:0x01f6, B:95:0x0200, B:96:0x0211, B:566:0x0b74, B:97:0x021e, B:99:0x022e, B:100:0x0234, B:101:0x0241, B:103:0x024f, B:104:0x0261, B:105:0x027d, B:106:0x0288, B:108:0x0294, B:109:0x02a0, B:110:0x02b3, B:112:0x02c2, B:113:0x02c7, B:115:0x02d5, B:116:0x02e1, B:118:0x0302, B:119:0x030c, B:120:0x0311, B:122:0x0317, B:124:0x031f, B:126:0x0323, B:128:0x0329, B:130:0x032f, B:131:0x0336, B:133:0x033b, B:134:0x0340, B:136:0x0346, B:139:0x0357, B:143:0x0371, B:145:0x0380, B:147:0x0384, B:149:0x039c, B:151:0x03a0, B:152:0x03a3, B:153:0x03a6, B:155:0x03aa, B:159:0x03b2, B:161:0x03b8, B:164:0x03be, B:167:0x03c4, B:169:0x03e5, B:172:0x03ef, B:174:0x040b, B:175:0x040e, B:177:0x0413, B:179:0x041f, B:181:0x0423, B:183:0x042b, B:184:0x042f, B:186:0x0433, B:188:0x043f, B:189:0x0442, B:193:0x046a, B:194:0x046d, B:196:0x0476, B:190:0x0445, B:192:0x044c, B:197:0x0484, B:199:0x048e, B:201:0x0492, B:215:0x0536, B:202:0x0499, B:204:0x04a3, B:206:0x04a7, B:208:0x04cd, B:210:0x04d1, B:211:0x04d4, B:212:0x04d7, B:214:0x0509, B:216:0x053b, B:217:0x0543, B:219:0x0548, B:220:0x0550, B:224:0x0555, B:228:0x0565, B:230:0x0573, B:231:0x0578, B:232:0x057c, B:234:0x0580, B:236:0x0585, B:237:0x058a, B:238:0x0592, B:240:0x05a6, B:241:0x05b1, B:242:0x05ba, B:244:0x05dc, B:246:0x05e2, B:248:0x05ea, B:249:0x05ed, B:251:0x05f1, B:253:0x05f7, B:255:0x05fd, B:257:0x060c, B:276:0x0698, B:278:0x069c, B:279:0x06a5, B:281:0x06a9, B:283:0x06b3, B:285:0x06b7, B:316:0x0739, B:318:0x073e, B:321:0x0750, B:323:0x0756, B:325:0x075c, B:327:0x0760, B:329:0x0764, B:331:0x0768, B:333:0x0777, B:334:0x077a, B:336:0x077e, B:339:0x078d, B:341:0x07b9, B:343:0x07c3, B:345:0x07cd, B:348:0x07d8, B:350:0x07ec, B:352:0x07f6, B:354:0x07fc, B:357:0x0803, B:358:0x080f, B:359:0x0812, B:361:0x0818, B:363:0x081c, B:365:0x0821, B:367:0x0829, B:369:0x0831, B:375:0x0844, B:376:0x0847, B:377:0x084a, B:287:0x06bb, B:289:0x06bf, B:291:0x06c3, B:293:0x06c7, B:294:0x06cc, B:296:0x06d1, B:298:0x06db, B:302:0x06ee, B:304:0x06f6, B:306:0x06fd, B:307:0x0701, B:310:0x0708, B:311:0x0711, B:312:0x072c, B:314:0x0732, B:301:0x06eb, B:380:0x0858, B:382:0x085c, B:384:0x0862, B:386:0x0868, B:388:0x086c, B:390:0x0870, B:392:0x0874, B:394:0x0881, B:397:0x0887, B:398:0x088a, B:400:0x08a3, B:402:0x08ac, B:404:0x08b4, B:407:0x08bc, B:378:0x084d, B:259:0x0612, B:261:0x0618, B:264:0x0637, B:266:0x064c, B:267:0x0656, B:269:0x066d, B:271:0x0671, B:272:0x0679, B:274:0x0692, B:275:0x0695, B:379:0x0852, B:262:0x062f, B:408:0x08e0, B:412:0x08e9, B:414:0x08ef, B:416:0x08f3, B:418:0x08f7, B:419:0x08fc, B:420:0x0908, B:422:0x0915, B:423:0x0932, B:425:0x0937, B:427:0x0941, B:429:0x094d, B:431:0x0952, B:434:0x095c, B:437:0x0964, B:440:0x096e, B:442:0x097a, B:444:0x0980, B:446:0x0986, B:449:0x098e, B:461:0x09ad, B:455:0x099b, B:457:0x099f, B:458:0x09a3, B:459:0x09a7, B:466:0x09b7, B:468:0x09c1, B:470:0x09c9, B:472:0x09d4, B:473:0x09d7, B:474:0x09db, B:476:0x09e9, B:478:0x09f4, B:482:0x09fc, B:484:0x0a04, B:486:0x0a08, B:487:0x0a12, B:489:0x0a18, B:535:0x0af4, B:539:0x0b14, B:542:0x0b1d, B:544:0x0b22, B:546:0x0b2a, B:548:0x0b30, B:549:0x0b34, B:551:0x0b3c, B:552:0x0b3f, B:554:0x0b45, B:556:0x0b4e, B:558:0x0b54, B:560:0x0b5a, B:562:0x0b64, B:568:0x0b77, B:570:0x0b7d, B:573:0x0b85, B:575:0x0b8b, B:576:0x0b91, B:578:0x0b95, B:580:0x0b99, B:586:0x0ba5, B:590:0x0bae, B:595:0x0bbf, B:597:0x0bc3, B:599:0x0bc8, B:600:0x0bca, B:563:0x0b67, B:565:0x0b6e, B:567:0x0b75, B:490:0x0a1d, B:492:0x0a25, B:494:0x0a29, B:536:0x0af8, B:538:0x0b04, B:497:0x0a33, B:499:0x0a37, B:501:0x0a45, B:502:0x0a4b, B:504:0x0a53, B:509:0x0a62, B:511:0x0a6f, B:516:0x0a79, B:519:0x0abe, B:521:0x0ac4, B:523:0x0ac8, B:527:0x0ad1, B:531:0x0ae0, B:532:0x0ae4, B:534:0x0aef, B:475:0x09de, B:601:0x0bcf, B:603:0x0bd5), top: B:651:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:278:0x069c A[Catch: BehindLiveWindowException -> 0x0bdc, DataSourceException -> 0x0be0, ParserException -> 0x0be4, DrmSession$DrmSessionException -> 0x0c04, IOException -> 0x0c08, ExoPlaybackException -> 0x0c0f, RuntimeException -> 0x0c5b, TryCatch #3 {ParserException -> 0x0be4, DataSourceException -> 0x0be0, ExoPlaybackException -> 0x0c0f, DrmSession$DrmSessionException -> 0x0c04, BehindLiveWindowException -> 0x0bdc, IOException -> 0x0c08, RuntimeException -> 0x0c5b, blocks: (B:3:0x0008, B:4:0x000e, B:6:0x0012, B:8:0x0018, B:9:0x0021, B:11:0x002d, B:13:0x0033, B:14:0x0035, B:16:0x003f, B:17:0x0042, B:19:0x0048, B:20:0x0050, B:22:0x0058, B:24:0x0065, B:25:0x006b, B:27:0x0073, B:29:0x0079, B:30:0x007b, B:32:0x0085, B:33:0x0088, B:35:0x0092, B:37:0x009d, B:38:0x00a1, B:39:0x00a4, B:41:0x00ae, B:44:0x00b8, B:45:0x00bd, B:47:0x00cd, B:49:0x00d8, B:50:0x00db, B:51:0x00de, B:56:0x00ef, B:54:0x00e8, B:57:0x00f4, B:60:0x0113, B:61:0x0129, B:63:0x013b, B:64:0x0140, B:66:0x0148, B:67:0x0156, B:68:0x015e, B:70:0x0166, B:72:0x0172, B:74:0x0178, B:76:0x0187, B:77:0x018a, B:78:0x018e, B:79:0x01a6, B:80:0x01ab, B:82:0x01b1, B:84:0x01ba, B:141:0x0369, B:142:0x036c, B:87:0x01c4, B:88:0x01cf, B:89:0x01e3, B:92:0x01f6, B:95:0x0200, B:96:0x0211, B:566:0x0b74, B:97:0x021e, B:99:0x022e, B:100:0x0234, B:101:0x0241, B:103:0x024f, B:104:0x0261, B:105:0x027d, B:106:0x0288, B:108:0x0294, B:109:0x02a0, B:110:0x02b3, B:112:0x02c2, B:113:0x02c7, B:115:0x02d5, B:116:0x02e1, B:118:0x0302, B:119:0x030c, B:120:0x0311, B:122:0x0317, B:124:0x031f, B:126:0x0323, B:128:0x0329, B:130:0x032f, B:131:0x0336, B:133:0x033b, B:134:0x0340, B:136:0x0346, B:139:0x0357, B:143:0x0371, B:145:0x0380, B:147:0x0384, B:149:0x039c, B:151:0x03a0, B:152:0x03a3, B:153:0x03a6, B:155:0x03aa, B:159:0x03b2, B:161:0x03b8, B:164:0x03be, B:167:0x03c4, B:169:0x03e5, B:172:0x03ef, B:174:0x040b, B:175:0x040e, B:177:0x0413, B:179:0x041f, B:181:0x0423, B:183:0x042b, B:184:0x042f, B:186:0x0433, B:188:0x043f, B:189:0x0442, B:193:0x046a, B:194:0x046d, B:196:0x0476, B:190:0x0445, B:192:0x044c, B:197:0x0484, B:199:0x048e, B:201:0x0492, B:215:0x0536, B:202:0x0499, B:204:0x04a3, B:206:0x04a7, B:208:0x04cd, B:210:0x04d1, B:211:0x04d4, B:212:0x04d7, B:214:0x0509, B:216:0x053b, B:217:0x0543, B:219:0x0548, B:220:0x0550, B:224:0x0555, B:228:0x0565, B:230:0x0573, B:231:0x0578, B:232:0x057c, B:234:0x0580, B:236:0x0585, B:237:0x058a, B:238:0x0592, B:240:0x05a6, B:241:0x05b1, B:242:0x05ba, B:244:0x05dc, B:246:0x05e2, B:248:0x05ea, B:249:0x05ed, B:251:0x05f1, B:253:0x05f7, B:255:0x05fd, B:257:0x060c, B:276:0x0698, B:278:0x069c, B:279:0x06a5, B:281:0x06a9, B:283:0x06b3, B:285:0x06b7, B:316:0x0739, B:318:0x073e, B:321:0x0750, B:323:0x0756, B:325:0x075c, B:327:0x0760, B:329:0x0764, B:331:0x0768, B:333:0x0777, B:334:0x077a, B:336:0x077e, B:339:0x078d, B:341:0x07b9, B:343:0x07c3, B:345:0x07cd, B:348:0x07d8, B:350:0x07ec, B:352:0x07f6, B:354:0x07fc, B:357:0x0803, B:358:0x080f, B:359:0x0812, B:361:0x0818, B:363:0x081c, B:365:0x0821, B:367:0x0829, B:369:0x0831, B:375:0x0844, B:376:0x0847, B:377:0x084a, B:287:0x06bb, B:289:0x06bf, B:291:0x06c3, B:293:0x06c7, B:294:0x06cc, B:296:0x06d1, B:298:0x06db, B:302:0x06ee, B:304:0x06f6, B:306:0x06fd, B:307:0x0701, B:310:0x0708, B:311:0x0711, B:312:0x072c, B:314:0x0732, B:301:0x06eb, B:380:0x0858, B:382:0x085c, B:384:0x0862, B:386:0x0868, B:388:0x086c, B:390:0x0870, B:392:0x0874, B:394:0x0881, B:397:0x0887, B:398:0x088a, B:400:0x08a3, B:402:0x08ac, B:404:0x08b4, B:407:0x08bc, B:378:0x084d, B:259:0x0612, B:261:0x0618, B:264:0x0637, B:266:0x064c, B:267:0x0656, B:269:0x066d, B:271:0x0671, B:272:0x0679, B:274:0x0692, B:275:0x0695, B:379:0x0852, B:262:0x062f, B:408:0x08e0, B:412:0x08e9, B:414:0x08ef, B:416:0x08f3, B:418:0x08f7, B:419:0x08fc, B:420:0x0908, B:422:0x0915, B:423:0x0932, B:425:0x0937, B:427:0x0941, B:429:0x094d, B:431:0x0952, B:434:0x095c, B:437:0x0964, B:440:0x096e, B:442:0x097a, B:444:0x0980, B:446:0x0986, B:449:0x098e, B:461:0x09ad, B:455:0x099b, B:457:0x099f, B:458:0x09a3, B:459:0x09a7, B:466:0x09b7, B:468:0x09c1, B:470:0x09c9, B:472:0x09d4, B:473:0x09d7, B:474:0x09db, B:476:0x09e9, B:478:0x09f4, B:482:0x09fc, B:484:0x0a04, B:486:0x0a08, B:487:0x0a12, B:489:0x0a18, B:535:0x0af4, B:539:0x0b14, B:542:0x0b1d, B:544:0x0b22, B:546:0x0b2a, B:548:0x0b30, B:549:0x0b34, B:551:0x0b3c, B:552:0x0b3f, B:554:0x0b45, B:556:0x0b4e, B:558:0x0b54, B:560:0x0b5a, B:562:0x0b64, B:568:0x0b77, B:570:0x0b7d, B:573:0x0b85, B:575:0x0b8b, B:576:0x0b91, B:578:0x0b95, B:580:0x0b99, B:586:0x0ba5, B:590:0x0bae, B:595:0x0bbf, B:597:0x0bc3, B:599:0x0bc8, B:600:0x0bca, B:563:0x0b67, B:565:0x0b6e, B:567:0x0b75, B:490:0x0a1d, B:492:0x0a25, B:494:0x0a29, B:536:0x0af8, B:538:0x0b04, B:497:0x0a33, B:499:0x0a37, B:501:0x0a45, B:502:0x0a4b, B:504:0x0a53, B:509:0x0a62, B:511:0x0a6f, B:516:0x0a79, B:519:0x0abe, B:521:0x0ac4, B:523:0x0ac8, B:527:0x0ad1, B:531:0x0ae0, B:532:0x0ae4, B:534:0x0aef, B:475:0x09de, B:601:0x0bcf, B:603:0x0bd5), top: B:651:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x06a9 A[Catch: BehindLiveWindowException -> 0x0bdc, DataSourceException -> 0x0be0, ParserException -> 0x0be4, DrmSession$DrmSessionException -> 0x0c04, IOException -> 0x0c08, ExoPlaybackException -> 0x0c0f, RuntimeException -> 0x0c5b, TryCatch #3 {ParserException -> 0x0be4, DataSourceException -> 0x0be0, ExoPlaybackException -> 0x0c0f, DrmSession$DrmSessionException -> 0x0c04, BehindLiveWindowException -> 0x0bdc, IOException -> 0x0c08, RuntimeException -> 0x0c5b, blocks: (B:3:0x0008, B:4:0x000e, B:6:0x0012, B:8:0x0018, B:9:0x0021, B:11:0x002d, B:13:0x0033, B:14:0x0035, B:16:0x003f, B:17:0x0042, B:19:0x0048, B:20:0x0050, B:22:0x0058, B:24:0x0065, B:25:0x006b, B:27:0x0073, B:29:0x0079, B:30:0x007b, B:32:0x0085, B:33:0x0088, B:35:0x0092, B:37:0x009d, B:38:0x00a1, B:39:0x00a4, B:41:0x00ae, B:44:0x00b8, B:45:0x00bd, B:47:0x00cd, B:49:0x00d8, B:50:0x00db, B:51:0x00de, B:56:0x00ef, B:54:0x00e8, B:57:0x00f4, B:60:0x0113, B:61:0x0129, B:63:0x013b, B:64:0x0140, B:66:0x0148, B:67:0x0156, B:68:0x015e, B:70:0x0166, B:72:0x0172, B:74:0x0178, B:76:0x0187, B:77:0x018a, B:78:0x018e, B:79:0x01a6, B:80:0x01ab, B:82:0x01b1, B:84:0x01ba, B:141:0x0369, B:142:0x036c, B:87:0x01c4, B:88:0x01cf, B:89:0x01e3, B:92:0x01f6, B:95:0x0200, B:96:0x0211, B:566:0x0b74, B:97:0x021e, B:99:0x022e, B:100:0x0234, B:101:0x0241, B:103:0x024f, B:104:0x0261, B:105:0x027d, B:106:0x0288, B:108:0x0294, B:109:0x02a0, B:110:0x02b3, B:112:0x02c2, B:113:0x02c7, B:115:0x02d5, B:116:0x02e1, B:118:0x0302, B:119:0x030c, B:120:0x0311, B:122:0x0317, B:124:0x031f, B:126:0x0323, B:128:0x0329, B:130:0x032f, B:131:0x0336, B:133:0x033b, B:134:0x0340, B:136:0x0346, B:139:0x0357, B:143:0x0371, B:145:0x0380, B:147:0x0384, B:149:0x039c, B:151:0x03a0, B:152:0x03a3, B:153:0x03a6, B:155:0x03aa, B:159:0x03b2, B:161:0x03b8, B:164:0x03be, B:167:0x03c4, B:169:0x03e5, B:172:0x03ef, B:174:0x040b, B:175:0x040e, B:177:0x0413, B:179:0x041f, B:181:0x0423, B:183:0x042b, B:184:0x042f, B:186:0x0433, B:188:0x043f, B:189:0x0442, B:193:0x046a, B:194:0x046d, B:196:0x0476, B:190:0x0445, B:192:0x044c, B:197:0x0484, B:199:0x048e, B:201:0x0492, B:215:0x0536, B:202:0x0499, B:204:0x04a3, B:206:0x04a7, B:208:0x04cd, B:210:0x04d1, B:211:0x04d4, B:212:0x04d7, B:214:0x0509, B:216:0x053b, B:217:0x0543, B:219:0x0548, B:220:0x0550, B:224:0x0555, B:228:0x0565, B:230:0x0573, B:231:0x0578, B:232:0x057c, B:234:0x0580, B:236:0x0585, B:237:0x058a, B:238:0x0592, B:240:0x05a6, B:241:0x05b1, B:242:0x05ba, B:244:0x05dc, B:246:0x05e2, B:248:0x05ea, B:249:0x05ed, B:251:0x05f1, B:253:0x05f7, B:255:0x05fd, B:257:0x060c, B:276:0x0698, B:278:0x069c, B:279:0x06a5, B:281:0x06a9, B:283:0x06b3, B:285:0x06b7, B:316:0x0739, B:318:0x073e, B:321:0x0750, B:323:0x0756, B:325:0x075c, B:327:0x0760, B:329:0x0764, B:331:0x0768, B:333:0x0777, B:334:0x077a, B:336:0x077e, B:339:0x078d, B:341:0x07b9, B:343:0x07c3, B:345:0x07cd, B:348:0x07d8, B:350:0x07ec, B:352:0x07f6, B:354:0x07fc, B:357:0x0803, B:358:0x080f, B:359:0x0812, B:361:0x0818, B:363:0x081c, B:365:0x0821, B:367:0x0829, B:369:0x0831, B:375:0x0844, B:376:0x0847, B:377:0x084a, B:287:0x06bb, B:289:0x06bf, B:291:0x06c3, B:293:0x06c7, B:294:0x06cc, B:296:0x06d1, B:298:0x06db, B:302:0x06ee, B:304:0x06f6, B:306:0x06fd, B:307:0x0701, B:310:0x0708, B:311:0x0711, B:312:0x072c, B:314:0x0732, B:301:0x06eb, B:380:0x0858, B:382:0x085c, B:384:0x0862, B:386:0x0868, B:388:0x086c, B:390:0x0870, B:392:0x0874, B:394:0x0881, B:397:0x0887, B:398:0x088a, B:400:0x08a3, B:402:0x08ac, B:404:0x08b4, B:407:0x08bc, B:378:0x084d, B:259:0x0612, B:261:0x0618, B:264:0x0637, B:266:0x064c, B:267:0x0656, B:269:0x066d, B:271:0x0671, B:272:0x0679, B:274:0x0692, B:275:0x0695, B:379:0x0852, B:262:0x062f, B:408:0x08e0, B:412:0x08e9, B:414:0x08ef, B:416:0x08f3, B:418:0x08f7, B:419:0x08fc, B:420:0x0908, B:422:0x0915, B:423:0x0932, B:425:0x0937, B:427:0x0941, B:429:0x094d, B:431:0x0952, B:434:0x095c, B:437:0x0964, B:440:0x096e, B:442:0x097a, B:444:0x0980, B:446:0x0986, B:449:0x098e, B:461:0x09ad, B:455:0x099b, B:457:0x099f, B:458:0x09a3, B:459:0x09a7, B:466:0x09b7, B:468:0x09c1, B:470:0x09c9, B:472:0x09d4, B:473:0x09d7, B:474:0x09db, B:476:0x09e9, B:478:0x09f4, B:482:0x09fc, B:484:0x0a04, B:486:0x0a08, B:487:0x0a12, B:489:0x0a18, B:535:0x0af4, B:539:0x0b14, B:542:0x0b1d, B:544:0x0b22, B:546:0x0b2a, B:548:0x0b30, B:549:0x0b34, B:551:0x0b3c, B:552:0x0b3f, B:554:0x0b45, B:556:0x0b4e, B:558:0x0b54, B:560:0x0b5a, B:562:0x0b64, B:568:0x0b77, B:570:0x0b7d, B:573:0x0b85, B:575:0x0b8b, B:576:0x0b91, B:578:0x0b95, B:580:0x0b99, B:586:0x0ba5, B:590:0x0bae, B:595:0x0bbf, B:597:0x0bc3, B:599:0x0bc8, B:600:0x0bca, B:563:0x0b67, B:565:0x0b6e, B:567:0x0b75, B:490:0x0a1d, B:492:0x0a25, B:494:0x0a29, B:536:0x0af8, B:538:0x0b04, B:497:0x0a33, B:499:0x0a37, B:501:0x0a45, B:502:0x0a4b, B:504:0x0a53, B:509:0x0a62, B:511:0x0a6f, B:516:0x0a79, B:519:0x0abe, B:521:0x0ac4, B:523:0x0ac8, B:527:0x0ad1, B:531:0x0ae0, B:532:0x0ae4, B:534:0x0aef, B:475:0x09de, B:601:0x0bcf, B:603:0x0bd5), top: B:651:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:296:0x06d1 A[Catch: BehindLiveWindowException -> 0x0bdc, DataSourceException -> 0x0be0, ParserException -> 0x0be4, DrmSession$DrmSessionException -> 0x0c04, IOException -> 0x0c08, ExoPlaybackException -> 0x0c0f, RuntimeException -> 0x0c5b, TryCatch #3 {ParserException -> 0x0be4, DataSourceException -> 0x0be0, ExoPlaybackException -> 0x0c0f, DrmSession$DrmSessionException -> 0x0c04, BehindLiveWindowException -> 0x0bdc, IOException -> 0x0c08, RuntimeException -> 0x0c5b, blocks: (B:3:0x0008, B:4:0x000e, B:6:0x0012, B:8:0x0018, B:9:0x0021, B:11:0x002d, B:13:0x0033, B:14:0x0035, B:16:0x003f, B:17:0x0042, B:19:0x0048, B:20:0x0050, B:22:0x0058, B:24:0x0065, B:25:0x006b, B:27:0x0073, B:29:0x0079, B:30:0x007b, B:32:0x0085, B:33:0x0088, B:35:0x0092, B:37:0x009d, B:38:0x00a1, B:39:0x00a4, B:41:0x00ae, B:44:0x00b8, B:45:0x00bd, B:47:0x00cd, B:49:0x00d8, B:50:0x00db, B:51:0x00de, B:56:0x00ef, B:54:0x00e8, B:57:0x00f4, B:60:0x0113, B:61:0x0129, B:63:0x013b, B:64:0x0140, B:66:0x0148, B:67:0x0156, B:68:0x015e, B:70:0x0166, B:72:0x0172, B:74:0x0178, B:76:0x0187, B:77:0x018a, B:78:0x018e, B:79:0x01a6, B:80:0x01ab, B:82:0x01b1, B:84:0x01ba, B:141:0x0369, B:142:0x036c, B:87:0x01c4, B:88:0x01cf, B:89:0x01e3, B:92:0x01f6, B:95:0x0200, B:96:0x0211, B:566:0x0b74, B:97:0x021e, B:99:0x022e, B:100:0x0234, B:101:0x0241, B:103:0x024f, B:104:0x0261, B:105:0x027d, B:106:0x0288, B:108:0x0294, B:109:0x02a0, B:110:0x02b3, B:112:0x02c2, B:113:0x02c7, B:115:0x02d5, B:116:0x02e1, B:118:0x0302, B:119:0x030c, B:120:0x0311, B:122:0x0317, B:124:0x031f, B:126:0x0323, B:128:0x0329, B:130:0x032f, B:131:0x0336, B:133:0x033b, B:134:0x0340, B:136:0x0346, B:139:0x0357, B:143:0x0371, B:145:0x0380, B:147:0x0384, B:149:0x039c, B:151:0x03a0, B:152:0x03a3, B:153:0x03a6, B:155:0x03aa, B:159:0x03b2, B:161:0x03b8, B:164:0x03be, B:167:0x03c4, B:169:0x03e5, B:172:0x03ef, B:174:0x040b, B:175:0x040e, B:177:0x0413, B:179:0x041f, B:181:0x0423, B:183:0x042b, B:184:0x042f, B:186:0x0433, B:188:0x043f, B:189:0x0442, B:193:0x046a, B:194:0x046d, B:196:0x0476, B:190:0x0445, B:192:0x044c, B:197:0x0484, B:199:0x048e, B:201:0x0492, B:215:0x0536, B:202:0x0499, B:204:0x04a3, B:206:0x04a7, B:208:0x04cd, B:210:0x04d1, B:211:0x04d4, B:212:0x04d7, B:214:0x0509, B:216:0x053b, B:217:0x0543, B:219:0x0548, B:220:0x0550, B:224:0x0555, B:228:0x0565, B:230:0x0573, B:231:0x0578, B:232:0x057c, B:234:0x0580, B:236:0x0585, B:237:0x058a, B:238:0x0592, B:240:0x05a6, B:241:0x05b1, B:242:0x05ba, B:244:0x05dc, B:246:0x05e2, B:248:0x05ea, B:249:0x05ed, B:251:0x05f1, B:253:0x05f7, B:255:0x05fd, B:257:0x060c, B:276:0x0698, B:278:0x069c, B:279:0x06a5, B:281:0x06a9, B:283:0x06b3, B:285:0x06b7, B:316:0x0739, B:318:0x073e, B:321:0x0750, B:323:0x0756, B:325:0x075c, B:327:0x0760, B:329:0x0764, B:331:0x0768, B:333:0x0777, B:334:0x077a, B:336:0x077e, B:339:0x078d, B:341:0x07b9, B:343:0x07c3, B:345:0x07cd, B:348:0x07d8, B:350:0x07ec, B:352:0x07f6, B:354:0x07fc, B:357:0x0803, B:358:0x080f, B:359:0x0812, B:361:0x0818, B:363:0x081c, B:365:0x0821, B:367:0x0829, B:369:0x0831, B:375:0x0844, B:376:0x0847, B:377:0x084a, B:287:0x06bb, B:289:0x06bf, B:291:0x06c3, B:293:0x06c7, B:294:0x06cc, B:296:0x06d1, B:298:0x06db, B:302:0x06ee, B:304:0x06f6, B:306:0x06fd, B:307:0x0701, B:310:0x0708, B:311:0x0711, B:312:0x072c, B:314:0x0732, B:301:0x06eb, B:380:0x0858, B:382:0x085c, B:384:0x0862, B:386:0x0868, B:388:0x086c, B:390:0x0870, B:392:0x0874, B:394:0x0881, B:397:0x0887, B:398:0x088a, B:400:0x08a3, B:402:0x08ac, B:404:0x08b4, B:407:0x08bc, B:378:0x084d, B:259:0x0612, B:261:0x0618, B:264:0x0637, B:266:0x064c, B:267:0x0656, B:269:0x066d, B:271:0x0671, B:272:0x0679, B:274:0x0692, B:275:0x0695, B:379:0x0852, B:262:0x062f, B:408:0x08e0, B:412:0x08e9, B:414:0x08ef, B:416:0x08f3, B:418:0x08f7, B:419:0x08fc, B:420:0x0908, B:422:0x0915, B:423:0x0932, B:425:0x0937, B:427:0x0941, B:429:0x094d, B:431:0x0952, B:434:0x095c, B:437:0x0964, B:440:0x096e, B:442:0x097a, B:444:0x0980, B:446:0x0986, B:449:0x098e, B:461:0x09ad, B:455:0x099b, B:457:0x099f, B:458:0x09a3, B:459:0x09a7, B:466:0x09b7, B:468:0x09c1, B:470:0x09c9, B:472:0x09d4, B:473:0x09d7, B:474:0x09db, B:476:0x09e9, B:478:0x09f4, B:482:0x09fc, B:484:0x0a04, B:486:0x0a08, B:487:0x0a12, B:489:0x0a18, B:535:0x0af4, B:539:0x0b14, B:542:0x0b1d, B:544:0x0b22, B:546:0x0b2a, B:548:0x0b30, B:549:0x0b34, B:551:0x0b3c, B:552:0x0b3f, B:554:0x0b45, B:556:0x0b4e, B:558:0x0b54, B:560:0x0b5a, B:562:0x0b64, B:568:0x0b77, B:570:0x0b7d, B:573:0x0b85, B:575:0x0b8b, B:576:0x0b91, B:578:0x0b95, B:580:0x0b99, B:586:0x0ba5, B:590:0x0bae, B:595:0x0bbf, B:597:0x0bc3, B:599:0x0bc8, B:600:0x0bca, B:563:0x0b67, B:565:0x0b6e, B:567:0x0b75, B:490:0x0a1d, B:492:0x0a25, B:494:0x0a29, B:536:0x0af8, B:538:0x0b04, B:497:0x0a33, B:499:0x0a37, B:501:0x0a45, B:502:0x0a4b, B:504:0x0a53, B:509:0x0a62, B:511:0x0a6f, B:516:0x0a79, B:519:0x0abe, B:521:0x0ac4, B:523:0x0ac8, B:527:0x0ad1, B:531:0x0ae0, B:532:0x0ae4, B:534:0x0aef, B:475:0x09de, B:601:0x0bcf, B:603:0x0bd5), top: B:651:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:378:0x084d A[Catch: BehindLiveWindowException -> 0x0bdc, DataSourceException -> 0x0be0, ParserException -> 0x0be4, DrmSession$DrmSessionException -> 0x0c04, IOException -> 0x0c08, ExoPlaybackException -> 0x0c0f, RuntimeException -> 0x0c5b, TryCatch #3 {ParserException -> 0x0be4, DataSourceException -> 0x0be0, ExoPlaybackException -> 0x0c0f, DrmSession$DrmSessionException -> 0x0c04, BehindLiveWindowException -> 0x0bdc, IOException -> 0x0c08, RuntimeException -> 0x0c5b, blocks: (B:3:0x0008, B:4:0x000e, B:6:0x0012, B:8:0x0018, B:9:0x0021, B:11:0x002d, B:13:0x0033, B:14:0x0035, B:16:0x003f, B:17:0x0042, B:19:0x0048, B:20:0x0050, B:22:0x0058, B:24:0x0065, B:25:0x006b, B:27:0x0073, B:29:0x0079, B:30:0x007b, B:32:0x0085, B:33:0x0088, B:35:0x0092, B:37:0x009d, B:38:0x00a1, B:39:0x00a4, B:41:0x00ae, B:44:0x00b8, B:45:0x00bd, B:47:0x00cd, B:49:0x00d8, B:50:0x00db, B:51:0x00de, B:56:0x00ef, B:54:0x00e8, B:57:0x00f4, B:60:0x0113, B:61:0x0129, B:63:0x013b, B:64:0x0140, B:66:0x0148, B:67:0x0156, B:68:0x015e, B:70:0x0166, B:72:0x0172, B:74:0x0178, B:76:0x0187, B:77:0x018a, B:78:0x018e, B:79:0x01a6, B:80:0x01ab, B:82:0x01b1, B:84:0x01ba, B:141:0x0369, B:142:0x036c, B:87:0x01c4, B:88:0x01cf, B:89:0x01e3, B:92:0x01f6, B:95:0x0200, B:96:0x0211, B:566:0x0b74, B:97:0x021e, B:99:0x022e, B:100:0x0234, B:101:0x0241, B:103:0x024f, B:104:0x0261, B:105:0x027d, B:106:0x0288, B:108:0x0294, B:109:0x02a0, B:110:0x02b3, B:112:0x02c2, B:113:0x02c7, B:115:0x02d5, B:116:0x02e1, B:118:0x0302, B:119:0x030c, B:120:0x0311, B:122:0x0317, B:124:0x031f, B:126:0x0323, B:128:0x0329, B:130:0x032f, B:131:0x0336, B:133:0x033b, B:134:0x0340, B:136:0x0346, B:139:0x0357, B:143:0x0371, B:145:0x0380, B:147:0x0384, B:149:0x039c, B:151:0x03a0, B:152:0x03a3, B:153:0x03a6, B:155:0x03aa, B:159:0x03b2, B:161:0x03b8, B:164:0x03be, B:167:0x03c4, B:169:0x03e5, B:172:0x03ef, B:174:0x040b, B:175:0x040e, B:177:0x0413, B:179:0x041f, B:181:0x0423, B:183:0x042b, B:184:0x042f, B:186:0x0433, B:188:0x043f, B:189:0x0442, B:193:0x046a, B:194:0x046d, B:196:0x0476, B:190:0x0445, B:192:0x044c, B:197:0x0484, B:199:0x048e, B:201:0x0492, B:215:0x0536, B:202:0x0499, B:204:0x04a3, B:206:0x04a7, B:208:0x04cd, B:210:0x04d1, B:211:0x04d4, B:212:0x04d7, B:214:0x0509, B:216:0x053b, B:217:0x0543, B:219:0x0548, B:220:0x0550, B:224:0x0555, B:228:0x0565, B:230:0x0573, B:231:0x0578, B:232:0x057c, B:234:0x0580, B:236:0x0585, B:237:0x058a, B:238:0x0592, B:240:0x05a6, B:241:0x05b1, B:242:0x05ba, B:244:0x05dc, B:246:0x05e2, B:248:0x05ea, B:249:0x05ed, B:251:0x05f1, B:253:0x05f7, B:255:0x05fd, B:257:0x060c, B:276:0x0698, B:278:0x069c, B:279:0x06a5, B:281:0x06a9, B:283:0x06b3, B:285:0x06b7, B:316:0x0739, B:318:0x073e, B:321:0x0750, B:323:0x0756, B:325:0x075c, B:327:0x0760, B:329:0x0764, B:331:0x0768, B:333:0x0777, B:334:0x077a, B:336:0x077e, B:339:0x078d, B:341:0x07b9, B:343:0x07c3, B:345:0x07cd, B:348:0x07d8, B:350:0x07ec, B:352:0x07f6, B:354:0x07fc, B:357:0x0803, B:358:0x080f, B:359:0x0812, B:361:0x0818, B:363:0x081c, B:365:0x0821, B:367:0x0829, B:369:0x0831, B:375:0x0844, B:376:0x0847, B:377:0x084a, B:287:0x06bb, B:289:0x06bf, B:291:0x06c3, B:293:0x06c7, B:294:0x06cc, B:296:0x06d1, B:298:0x06db, B:302:0x06ee, B:304:0x06f6, B:306:0x06fd, B:307:0x0701, B:310:0x0708, B:311:0x0711, B:312:0x072c, B:314:0x0732, B:301:0x06eb, B:380:0x0858, B:382:0x085c, B:384:0x0862, B:386:0x0868, B:388:0x086c, B:390:0x0870, B:392:0x0874, B:394:0x0881, B:397:0x0887, B:398:0x088a, B:400:0x08a3, B:402:0x08ac, B:404:0x08b4, B:407:0x08bc, B:378:0x084d, B:259:0x0612, B:261:0x0618, B:264:0x0637, B:266:0x064c, B:267:0x0656, B:269:0x066d, B:271:0x0671, B:272:0x0679, B:274:0x0692, B:275:0x0695, B:379:0x0852, B:262:0x062f, B:408:0x08e0, B:412:0x08e9, B:414:0x08ef, B:416:0x08f3, B:418:0x08f7, B:419:0x08fc, B:420:0x0908, B:422:0x0915, B:423:0x0932, B:425:0x0937, B:427:0x0941, B:429:0x094d, B:431:0x0952, B:434:0x095c, B:437:0x0964, B:440:0x096e, B:442:0x097a, B:444:0x0980, B:446:0x0986, B:449:0x098e, B:461:0x09ad, B:455:0x099b, B:457:0x099f, B:458:0x09a3, B:459:0x09a7, B:466:0x09b7, B:468:0x09c1, B:470:0x09c9, B:472:0x09d4, B:473:0x09d7, B:474:0x09db, B:476:0x09e9, B:478:0x09f4, B:482:0x09fc, B:484:0x0a04, B:486:0x0a08, B:487:0x0a12, B:489:0x0a18, B:535:0x0af4, B:539:0x0b14, B:542:0x0b1d, B:544:0x0b22, B:546:0x0b2a, B:548:0x0b30, B:549:0x0b34, B:551:0x0b3c, B:552:0x0b3f, B:554:0x0b45, B:556:0x0b4e, B:558:0x0b54, B:560:0x0b5a, B:562:0x0b64, B:568:0x0b77, B:570:0x0b7d, B:573:0x0b85, B:575:0x0b8b, B:576:0x0b91, B:578:0x0b95, B:580:0x0b99, B:586:0x0ba5, B:590:0x0bae, B:595:0x0bbf, B:597:0x0bc3, B:599:0x0bc8, B:600:0x0bca, B:563:0x0b67, B:565:0x0b6e, B:567:0x0b75, B:490:0x0a1d, B:492:0x0a25, B:494:0x0a29, B:536:0x0af8, B:538:0x0b04, B:497:0x0a33, B:499:0x0a37, B:501:0x0a45, B:502:0x0a4b, B:504:0x0a53, B:509:0x0a62, B:511:0x0a6f, B:516:0x0a79, B:519:0x0abe, B:521:0x0ac4, B:523:0x0ac8, B:527:0x0ad1, B:531:0x0ae0, B:532:0x0ae4, B:534:0x0aef, B:475:0x09de, B:601:0x0bcf, B:603:0x0bd5), top: B:651:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0887 A[Catch: BehindLiveWindowException -> 0x0bdc, DataSourceException -> 0x0be0, ParserException -> 0x0be4, DrmSession$DrmSessionException -> 0x0c04, IOException -> 0x0c08, ExoPlaybackException -> 0x0c0f, RuntimeException -> 0x0c5b, TryCatch #3 {ParserException -> 0x0be4, DataSourceException -> 0x0be0, ExoPlaybackException -> 0x0c0f, DrmSession$DrmSessionException -> 0x0c04, BehindLiveWindowException -> 0x0bdc, IOException -> 0x0c08, RuntimeException -> 0x0c5b, blocks: (B:3:0x0008, B:4:0x000e, B:6:0x0012, B:8:0x0018, B:9:0x0021, B:11:0x002d, B:13:0x0033, B:14:0x0035, B:16:0x003f, B:17:0x0042, B:19:0x0048, B:20:0x0050, B:22:0x0058, B:24:0x0065, B:25:0x006b, B:27:0x0073, B:29:0x0079, B:30:0x007b, B:32:0x0085, B:33:0x0088, B:35:0x0092, B:37:0x009d, B:38:0x00a1, B:39:0x00a4, B:41:0x00ae, B:44:0x00b8, B:45:0x00bd, B:47:0x00cd, B:49:0x00d8, B:50:0x00db, B:51:0x00de, B:56:0x00ef, B:54:0x00e8, B:57:0x00f4, B:60:0x0113, B:61:0x0129, B:63:0x013b, B:64:0x0140, B:66:0x0148, B:67:0x0156, B:68:0x015e, B:70:0x0166, B:72:0x0172, B:74:0x0178, B:76:0x0187, B:77:0x018a, B:78:0x018e, B:79:0x01a6, B:80:0x01ab, B:82:0x01b1, B:84:0x01ba, B:141:0x0369, B:142:0x036c, B:87:0x01c4, B:88:0x01cf, B:89:0x01e3, B:92:0x01f6, B:95:0x0200, B:96:0x0211, B:566:0x0b74, B:97:0x021e, B:99:0x022e, B:100:0x0234, B:101:0x0241, B:103:0x024f, B:104:0x0261, B:105:0x027d, B:106:0x0288, B:108:0x0294, B:109:0x02a0, B:110:0x02b3, B:112:0x02c2, B:113:0x02c7, B:115:0x02d5, B:116:0x02e1, B:118:0x0302, B:119:0x030c, B:120:0x0311, B:122:0x0317, B:124:0x031f, B:126:0x0323, B:128:0x0329, B:130:0x032f, B:131:0x0336, B:133:0x033b, B:134:0x0340, B:136:0x0346, B:139:0x0357, B:143:0x0371, B:145:0x0380, B:147:0x0384, B:149:0x039c, B:151:0x03a0, B:152:0x03a3, B:153:0x03a6, B:155:0x03aa, B:159:0x03b2, B:161:0x03b8, B:164:0x03be, B:167:0x03c4, B:169:0x03e5, B:172:0x03ef, B:174:0x040b, B:175:0x040e, B:177:0x0413, B:179:0x041f, B:181:0x0423, B:183:0x042b, B:184:0x042f, B:186:0x0433, B:188:0x043f, B:189:0x0442, B:193:0x046a, B:194:0x046d, B:196:0x0476, B:190:0x0445, B:192:0x044c, B:197:0x0484, B:199:0x048e, B:201:0x0492, B:215:0x0536, B:202:0x0499, B:204:0x04a3, B:206:0x04a7, B:208:0x04cd, B:210:0x04d1, B:211:0x04d4, B:212:0x04d7, B:214:0x0509, B:216:0x053b, B:217:0x0543, B:219:0x0548, B:220:0x0550, B:224:0x0555, B:228:0x0565, B:230:0x0573, B:231:0x0578, B:232:0x057c, B:234:0x0580, B:236:0x0585, B:237:0x058a, B:238:0x0592, B:240:0x05a6, B:241:0x05b1, B:242:0x05ba, B:244:0x05dc, B:246:0x05e2, B:248:0x05ea, B:249:0x05ed, B:251:0x05f1, B:253:0x05f7, B:255:0x05fd, B:257:0x060c, B:276:0x0698, B:278:0x069c, B:279:0x06a5, B:281:0x06a9, B:283:0x06b3, B:285:0x06b7, B:316:0x0739, B:318:0x073e, B:321:0x0750, B:323:0x0756, B:325:0x075c, B:327:0x0760, B:329:0x0764, B:331:0x0768, B:333:0x0777, B:334:0x077a, B:336:0x077e, B:339:0x078d, B:341:0x07b9, B:343:0x07c3, B:345:0x07cd, B:348:0x07d8, B:350:0x07ec, B:352:0x07f6, B:354:0x07fc, B:357:0x0803, B:358:0x080f, B:359:0x0812, B:361:0x0818, B:363:0x081c, B:365:0x0821, B:367:0x0829, B:369:0x0831, B:375:0x0844, B:376:0x0847, B:377:0x084a, B:287:0x06bb, B:289:0x06bf, B:291:0x06c3, B:293:0x06c7, B:294:0x06cc, B:296:0x06d1, B:298:0x06db, B:302:0x06ee, B:304:0x06f6, B:306:0x06fd, B:307:0x0701, B:310:0x0708, B:311:0x0711, B:312:0x072c, B:314:0x0732, B:301:0x06eb, B:380:0x0858, B:382:0x085c, B:384:0x0862, B:386:0x0868, B:388:0x086c, B:390:0x0870, B:392:0x0874, B:394:0x0881, B:397:0x0887, B:398:0x088a, B:400:0x08a3, B:402:0x08ac, B:404:0x08b4, B:407:0x08bc, B:378:0x084d, B:259:0x0612, B:261:0x0618, B:264:0x0637, B:266:0x064c, B:267:0x0656, B:269:0x066d, B:271:0x0671, B:272:0x0679, B:274:0x0692, B:275:0x0695, B:379:0x0852, B:262:0x062f, B:408:0x08e0, B:412:0x08e9, B:414:0x08ef, B:416:0x08f3, B:418:0x08f7, B:419:0x08fc, B:420:0x0908, B:422:0x0915, B:423:0x0932, B:425:0x0937, B:427:0x0941, B:429:0x094d, B:431:0x0952, B:434:0x095c, B:437:0x0964, B:440:0x096e, B:442:0x097a, B:444:0x0980, B:446:0x0986, B:449:0x098e, B:461:0x09ad, B:455:0x099b, B:457:0x099f, B:458:0x09a3, B:459:0x09a7, B:466:0x09b7, B:468:0x09c1, B:470:0x09c9, B:472:0x09d4, B:473:0x09d7, B:474:0x09db, B:476:0x09e9, B:478:0x09f4, B:482:0x09fc, B:484:0x0a04, B:486:0x0a08, B:487:0x0a12, B:489:0x0a18, B:535:0x0af4, B:539:0x0b14, B:542:0x0b1d, B:544:0x0b22, B:546:0x0b2a, B:548:0x0b30, B:549:0x0b34, B:551:0x0b3c, B:552:0x0b3f, B:554:0x0b45, B:556:0x0b4e, B:558:0x0b54, B:560:0x0b5a, B:562:0x0b64, B:568:0x0b77, B:570:0x0b7d, B:573:0x0b85, B:575:0x0b8b, B:576:0x0b91, B:578:0x0b95, B:580:0x0b99, B:586:0x0ba5, B:590:0x0bae, B:595:0x0bbf, B:597:0x0bc3, B:599:0x0bc8, B:600:0x0bca, B:563:0x0b67, B:565:0x0b6e, B:567:0x0b75, B:490:0x0a1d, B:492:0x0a25, B:494:0x0a29, B:536:0x0af8, B:538:0x0b04, B:497:0x0a33, B:499:0x0a37, B:501:0x0a45, B:502:0x0a4b, B:504:0x0a53, B:509:0x0a62, B:511:0x0a6f, B:516:0x0a79, B:519:0x0abe, B:521:0x0ac4, B:523:0x0ac8, B:527:0x0ad1, B:531:0x0ae0, B:532:0x0ae4, B:534:0x0aef, B:475:0x09de, B:601:0x0bcf, B:603:0x0bd5), top: B:651:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:400:0x08a3 A[Catch: BehindLiveWindowException -> 0x0bdc, DataSourceException -> 0x0be0, ParserException -> 0x0be4, DrmSession$DrmSessionException -> 0x0c04, IOException -> 0x0c08, ExoPlaybackException -> 0x0c0f, RuntimeException -> 0x0c5b, TryCatch #3 {ParserException -> 0x0be4, DataSourceException -> 0x0be0, ExoPlaybackException -> 0x0c0f, DrmSession$DrmSessionException -> 0x0c04, BehindLiveWindowException -> 0x0bdc, IOException -> 0x0c08, RuntimeException -> 0x0c5b, blocks: (B:3:0x0008, B:4:0x000e, B:6:0x0012, B:8:0x0018, B:9:0x0021, B:11:0x002d, B:13:0x0033, B:14:0x0035, B:16:0x003f, B:17:0x0042, B:19:0x0048, B:20:0x0050, B:22:0x0058, B:24:0x0065, B:25:0x006b, B:27:0x0073, B:29:0x0079, B:30:0x007b, B:32:0x0085, B:33:0x0088, B:35:0x0092, B:37:0x009d, B:38:0x00a1, B:39:0x00a4, B:41:0x00ae, B:44:0x00b8, B:45:0x00bd, B:47:0x00cd, B:49:0x00d8, B:50:0x00db, B:51:0x00de, B:56:0x00ef, B:54:0x00e8, B:57:0x00f4, B:60:0x0113, B:61:0x0129, B:63:0x013b, B:64:0x0140, B:66:0x0148, B:67:0x0156, B:68:0x015e, B:70:0x0166, B:72:0x0172, B:74:0x0178, B:76:0x0187, B:77:0x018a, B:78:0x018e, B:79:0x01a6, B:80:0x01ab, B:82:0x01b1, B:84:0x01ba, B:141:0x0369, B:142:0x036c, B:87:0x01c4, B:88:0x01cf, B:89:0x01e3, B:92:0x01f6, B:95:0x0200, B:96:0x0211, B:566:0x0b74, B:97:0x021e, B:99:0x022e, B:100:0x0234, B:101:0x0241, B:103:0x024f, B:104:0x0261, B:105:0x027d, B:106:0x0288, B:108:0x0294, B:109:0x02a0, B:110:0x02b3, B:112:0x02c2, B:113:0x02c7, B:115:0x02d5, B:116:0x02e1, B:118:0x0302, B:119:0x030c, B:120:0x0311, B:122:0x0317, B:124:0x031f, B:126:0x0323, B:128:0x0329, B:130:0x032f, B:131:0x0336, B:133:0x033b, B:134:0x0340, B:136:0x0346, B:139:0x0357, B:143:0x0371, B:145:0x0380, B:147:0x0384, B:149:0x039c, B:151:0x03a0, B:152:0x03a3, B:153:0x03a6, B:155:0x03aa, B:159:0x03b2, B:161:0x03b8, B:164:0x03be, B:167:0x03c4, B:169:0x03e5, B:172:0x03ef, B:174:0x040b, B:175:0x040e, B:177:0x0413, B:179:0x041f, B:181:0x0423, B:183:0x042b, B:184:0x042f, B:186:0x0433, B:188:0x043f, B:189:0x0442, B:193:0x046a, B:194:0x046d, B:196:0x0476, B:190:0x0445, B:192:0x044c, B:197:0x0484, B:199:0x048e, B:201:0x0492, B:215:0x0536, B:202:0x0499, B:204:0x04a3, B:206:0x04a7, B:208:0x04cd, B:210:0x04d1, B:211:0x04d4, B:212:0x04d7, B:214:0x0509, B:216:0x053b, B:217:0x0543, B:219:0x0548, B:220:0x0550, B:224:0x0555, B:228:0x0565, B:230:0x0573, B:231:0x0578, B:232:0x057c, B:234:0x0580, B:236:0x0585, B:237:0x058a, B:238:0x0592, B:240:0x05a6, B:241:0x05b1, B:242:0x05ba, B:244:0x05dc, B:246:0x05e2, B:248:0x05ea, B:249:0x05ed, B:251:0x05f1, B:253:0x05f7, B:255:0x05fd, B:257:0x060c, B:276:0x0698, B:278:0x069c, B:279:0x06a5, B:281:0x06a9, B:283:0x06b3, B:285:0x06b7, B:316:0x0739, B:318:0x073e, B:321:0x0750, B:323:0x0756, B:325:0x075c, B:327:0x0760, B:329:0x0764, B:331:0x0768, B:333:0x0777, B:334:0x077a, B:336:0x077e, B:339:0x078d, B:341:0x07b9, B:343:0x07c3, B:345:0x07cd, B:348:0x07d8, B:350:0x07ec, B:352:0x07f6, B:354:0x07fc, B:357:0x0803, B:358:0x080f, B:359:0x0812, B:361:0x0818, B:363:0x081c, B:365:0x0821, B:367:0x0829, B:369:0x0831, B:375:0x0844, B:376:0x0847, B:377:0x084a, B:287:0x06bb, B:289:0x06bf, B:291:0x06c3, B:293:0x06c7, B:294:0x06cc, B:296:0x06d1, B:298:0x06db, B:302:0x06ee, B:304:0x06f6, B:306:0x06fd, B:307:0x0701, B:310:0x0708, B:311:0x0711, B:312:0x072c, B:314:0x0732, B:301:0x06eb, B:380:0x0858, B:382:0x085c, B:384:0x0862, B:386:0x0868, B:388:0x086c, B:390:0x0870, B:392:0x0874, B:394:0x0881, B:397:0x0887, B:398:0x088a, B:400:0x08a3, B:402:0x08ac, B:404:0x08b4, B:407:0x08bc, B:378:0x084d, B:259:0x0612, B:261:0x0618, B:264:0x0637, B:266:0x064c, B:267:0x0656, B:269:0x066d, B:271:0x0671, B:272:0x0679, B:274:0x0692, B:275:0x0695, B:379:0x0852, B:262:0x062f, B:408:0x08e0, B:412:0x08e9, B:414:0x08ef, B:416:0x08f3, B:418:0x08f7, B:419:0x08fc, B:420:0x0908, B:422:0x0915, B:423:0x0932, B:425:0x0937, B:427:0x0941, B:429:0x094d, B:431:0x0952, B:434:0x095c, B:437:0x0964, B:440:0x096e, B:442:0x097a, B:444:0x0980, B:446:0x0986, B:449:0x098e, B:461:0x09ad, B:455:0x099b, B:457:0x099f, B:458:0x09a3, B:459:0x09a7, B:466:0x09b7, B:468:0x09c1, B:470:0x09c9, B:472:0x09d4, B:473:0x09d7, B:474:0x09db, B:476:0x09e9, B:478:0x09f4, B:482:0x09fc, B:484:0x0a04, B:486:0x0a08, B:487:0x0a12, B:489:0x0a18, B:535:0x0af4, B:539:0x0b14, B:542:0x0b1d, B:544:0x0b22, B:546:0x0b2a, B:548:0x0b30, B:549:0x0b34, B:551:0x0b3c, B:552:0x0b3f, B:554:0x0b45, B:556:0x0b4e, B:558:0x0b54, B:560:0x0b5a, B:562:0x0b64, B:568:0x0b77, B:570:0x0b7d, B:573:0x0b85, B:575:0x0b8b, B:576:0x0b91, B:578:0x0b95, B:580:0x0b99, B:586:0x0ba5, B:590:0x0bae, B:595:0x0bbf, B:597:0x0bc3, B:599:0x0bc8, B:600:0x0bca, B:563:0x0b67, B:565:0x0b6e, B:567:0x0b75, B:490:0x0a1d, B:492:0x0a25, B:494:0x0a29, B:536:0x0af8, B:538:0x0b04, B:497:0x0a33, B:499:0x0a37, B:501:0x0a45, B:502:0x0a4b, B:504:0x0a53, B:509:0x0a62, B:511:0x0a6f, B:516:0x0a79, B:519:0x0abe, B:521:0x0ac4, B:523:0x0ac8, B:527:0x0ad1, B:531:0x0ae0, B:532:0x0ae4, B:534:0x0aef, B:475:0x09de, B:601:0x0bcf, B:603:0x0bd5), top: B:651:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:406:0x08bb  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x095a  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x096c  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x098d  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0993  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0997  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x0a1d A[Catch: BehindLiveWindowException -> 0x0bdc, DataSourceException -> 0x0be0, ParserException -> 0x0be4, DrmSession$DrmSessionException -> 0x0c04, IOException -> 0x0c08, ExoPlaybackException -> 0x0c0f, RuntimeException -> 0x0c5b, TryCatch #3 {ParserException -> 0x0be4, DataSourceException -> 0x0be0, ExoPlaybackException -> 0x0c0f, DrmSession$DrmSessionException -> 0x0c04, BehindLiveWindowException -> 0x0bdc, IOException -> 0x0c08, RuntimeException -> 0x0c5b, blocks: (B:3:0x0008, B:4:0x000e, B:6:0x0012, B:8:0x0018, B:9:0x0021, B:11:0x002d, B:13:0x0033, B:14:0x0035, B:16:0x003f, B:17:0x0042, B:19:0x0048, B:20:0x0050, B:22:0x0058, B:24:0x0065, B:25:0x006b, B:27:0x0073, B:29:0x0079, B:30:0x007b, B:32:0x0085, B:33:0x0088, B:35:0x0092, B:37:0x009d, B:38:0x00a1, B:39:0x00a4, B:41:0x00ae, B:44:0x00b8, B:45:0x00bd, B:47:0x00cd, B:49:0x00d8, B:50:0x00db, B:51:0x00de, B:56:0x00ef, B:54:0x00e8, B:57:0x00f4, B:60:0x0113, B:61:0x0129, B:63:0x013b, B:64:0x0140, B:66:0x0148, B:67:0x0156, B:68:0x015e, B:70:0x0166, B:72:0x0172, B:74:0x0178, B:76:0x0187, B:77:0x018a, B:78:0x018e, B:79:0x01a6, B:80:0x01ab, B:82:0x01b1, B:84:0x01ba, B:141:0x0369, B:142:0x036c, B:87:0x01c4, B:88:0x01cf, B:89:0x01e3, B:92:0x01f6, B:95:0x0200, B:96:0x0211, B:566:0x0b74, B:97:0x021e, B:99:0x022e, B:100:0x0234, B:101:0x0241, B:103:0x024f, B:104:0x0261, B:105:0x027d, B:106:0x0288, B:108:0x0294, B:109:0x02a0, B:110:0x02b3, B:112:0x02c2, B:113:0x02c7, B:115:0x02d5, B:116:0x02e1, B:118:0x0302, B:119:0x030c, B:120:0x0311, B:122:0x0317, B:124:0x031f, B:126:0x0323, B:128:0x0329, B:130:0x032f, B:131:0x0336, B:133:0x033b, B:134:0x0340, B:136:0x0346, B:139:0x0357, B:143:0x0371, B:145:0x0380, B:147:0x0384, B:149:0x039c, B:151:0x03a0, B:152:0x03a3, B:153:0x03a6, B:155:0x03aa, B:159:0x03b2, B:161:0x03b8, B:164:0x03be, B:167:0x03c4, B:169:0x03e5, B:172:0x03ef, B:174:0x040b, B:175:0x040e, B:177:0x0413, B:179:0x041f, B:181:0x0423, B:183:0x042b, B:184:0x042f, B:186:0x0433, B:188:0x043f, B:189:0x0442, B:193:0x046a, B:194:0x046d, B:196:0x0476, B:190:0x0445, B:192:0x044c, B:197:0x0484, B:199:0x048e, B:201:0x0492, B:215:0x0536, B:202:0x0499, B:204:0x04a3, B:206:0x04a7, B:208:0x04cd, B:210:0x04d1, B:211:0x04d4, B:212:0x04d7, B:214:0x0509, B:216:0x053b, B:217:0x0543, B:219:0x0548, B:220:0x0550, B:224:0x0555, B:228:0x0565, B:230:0x0573, B:231:0x0578, B:232:0x057c, B:234:0x0580, B:236:0x0585, B:237:0x058a, B:238:0x0592, B:240:0x05a6, B:241:0x05b1, B:242:0x05ba, B:244:0x05dc, B:246:0x05e2, B:248:0x05ea, B:249:0x05ed, B:251:0x05f1, B:253:0x05f7, B:255:0x05fd, B:257:0x060c, B:276:0x0698, B:278:0x069c, B:279:0x06a5, B:281:0x06a9, B:283:0x06b3, B:285:0x06b7, B:316:0x0739, B:318:0x073e, B:321:0x0750, B:323:0x0756, B:325:0x075c, B:327:0x0760, B:329:0x0764, B:331:0x0768, B:333:0x0777, B:334:0x077a, B:336:0x077e, B:339:0x078d, B:341:0x07b9, B:343:0x07c3, B:345:0x07cd, B:348:0x07d8, B:350:0x07ec, B:352:0x07f6, B:354:0x07fc, B:357:0x0803, B:358:0x080f, B:359:0x0812, B:361:0x0818, B:363:0x081c, B:365:0x0821, B:367:0x0829, B:369:0x0831, B:375:0x0844, B:376:0x0847, B:377:0x084a, B:287:0x06bb, B:289:0x06bf, B:291:0x06c3, B:293:0x06c7, B:294:0x06cc, B:296:0x06d1, B:298:0x06db, B:302:0x06ee, B:304:0x06f6, B:306:0x06fd, B:307:0x0701, B:310:0x0708, B:311:0x0711, B:312:0x072c, B:314:0x0732, B:301:0x06eb, B:380:0x0858, B:382:0x085c, B:384:0x0862, B:386:0x0868, B:388:0x086c, B:390:0x0870, B:392:0x0874, B:394:0x0881, B:397:0x0887, B:398:0x088a, B:400:0x08a3, B:402:0x08ac, B:404:0x08b4, B:407:0x08bc, B:378:0x084d, B:259:0x0612, B:261:0x0618, B:264:0x0637, B:266:0x064c, B:267:0x0656, B:269:0x066d, B:271:0x0671, B:272:0x0679, B:274:0x0692, B:275:0x0695, B:379:0x0852, B:262:0x062f, B:408:0x08e0, B:412:0x08e9, B:414:0x08ef, B:416:0x08f3, B:418:0x08f7, B:419:0x08fc, B:420:0x0908, B:422:0x0915, B:423:0x0932, B:425:0x0937, B:427:0x0941, B:429:0x094d, B:431:0x0952, B:434:0x095c, B:437:0x0964, B:440:0x096e, B:442:0x097a, B:444:0x0980, B:446:0x0986, B:449:0x098e, B:461:0x09ad, B:455:0x099b, B:457:0x099f, B:458:0x09a3, B:459:0x09a7, B:466:0x09b7, B:468:0x09c1, B:470:0x09c9, B:472:0x09d4, B:473:0x09d7, B:474:0x09db, B:476:0x09e9, B:478:0x09f4, B:482:0x09fc, B:484:0x0a04, B:486:0x0a08, B:487:0x0a12, B:489:0x0a18, B:535:0x0af4, B:539:0x0b14, B:542:0x0b1d, B:544:0x0b22, B:546:0x0b2a, B:548:0x0b30, B:549:0x0b34, B:551:0x0b3c, B:552:0x0b3f, B:554:0x0b45, B:556:0x0b4e, B:558:0x0b54, B:560:0x0b5a, B:562:0x0b64, B:568:0x0b77, B:570:0x0b7d, B:573:0x0b85, B:575:0x0b8b, B:576:0x0b91, B:578:0x0b95, B:580:0x0b99, B:586:0x0ba5, B:590:0x0bae, B:595:0x0bbf, B:597:0x0bc3, B:599:0x0bc8, B:600:0x0bca, B:563:0x0b67, B:565:0x0b6e, B:567:0x0b75, B:490:0x0a1d, B:492:0x0a25, B:494:0x0a29, B:536:0x0af8, B:538:0x0b04, B:497:0x0a33, B:499:0x0a37, B:501:0x0a45, B:502:0x0a4b, B:504:0x0a53, B:509:0x0a62, B:511:0x0a6f, B:516:0x0a79, B:519:0x0abe, B:521:0x0ac4, B:523:0x0ac8, B:527:0x0ad1, B:531:0x0ae0, B:532:0x0ae4, B:534:0x0aef, B:475:0x09de, B:601:0x0bcf, B:603:0x0bd5), top: B:651:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:521:0x0ac4 A[Catch: BehindLiveWindowException -> 0x0bdc, DataSourceException -> 0x0be0, ParserException -> 0x0be4, DrmSession$DrmSessionException -> 0x0c04, IOException -> 0x0c08, ExoPlaybackException -> 0x0c0f, RuntimeException -> 0x0c5b, TryCatch #3 {ParserException -> 0x0be4, DataSourceException -> 0x0be0, ExoPlaybackException -> 0x0c0f, DrmSession$DrmSessionException -> 0x0c04, BehindLiveWindowException -> 0x0bdc, IOException -> 0x0c08, RuntimeException -> 0x0c5b, blocks: (B:3:0x0008, B:4:0x000e, B:6:0x0012, B:8:0x0018, B:9:0x0021, B:11:0x002d, B:13:0x0033, B:14:0x0035, B:16:0x003f, B:17:0x0042, B:19:0x0048, B:20:0x0050, B:22:0x0058, B:24:0x0065, B:25:0x006b, B:27:0x0073, B:29:0x0079, B:30:0x007b, B:32:0x0085, B:33:0x0088, B:35:0x0092, B:37:0x009d, B:38:0x00a1, B:39:0x00a4, B:41:0x00ae, B:44:0x00b8, B:45:0x00bd, B:47:0x00cd, B:49:0x00d8, B:50:0x00db, B:51:0x00de, B:56:0x00ef, B:54:0x00e8, B:57:0x00f4, B:60:0x0113, B:61:0x0129, B:63:0x013b, B:64:0x0140, B:66:0x0148, B:67:0x0156, B:68:0x015e, B:70:0x0166, B:72:0x0172, B:74:0x0178, B:76:0x0187, B:77:0x018a, B:78:0x018e, B:79:0x01a6, B:80:0x01ab, B:82:0x01b1, B:84:0x01ba, B:141:0x0369, B:142:0x036c, B:87:0x01c4, B:88:0x01cf, B:89:0x01e3, B:92:0x01f6, B:95:0x0200, B:96:0x0211, B:566:0x0b74, B:97:0x021e, B:99:0x022e, B:100:0x0234, B:101:0x0241, B:103:0x024f, B:104:0x0261, B:105:0x027d, B:106:0x0288, B:108:0x0294, B:109:0x02a0, B:110:0x02b3, B:112:0x02c2, B:113:0x02c7, B:115:0x02d5, B:116:0x02e1, B:118:0x0302, B:119:0x030c, B:120:0x0311, B:122:0x0317, B:124:0x031f, B:126:0x0323, B:128:0x0329, B:130:0x032f, B:131:0x0336, B:133:0x033b, B:134:0x0340, B:136:0x0346, B:139:0x0357, B:143:0x0371, B:145:0x0380, B:147:0x0384, B:149:0x039c, B:151:0x03a0, B:152:0x03a3, B:153:0x03a6, B:155:0x03aa, B:159:0x03b2, B:161:0x03b8, B:164:0x03be, B:167:0x03c4, B:169:0x03e5, B:172:0x03ef, B:174:0x040b, B:175:0x040e, B:177:0x0413, B:179:0x041f, B:181:0x0423, B:183:0x042b, B:184:0x042f, B:186:0x0433, B:188:0x043f, B:189:0x0442, B:193:0x046a, B:194:0x046d, B:196:0x0476, B:190:0x0445, B:192:0x044c, B:197:0x0484, B:199:0x048e, B:201:0x0492, B:215:0x0536, B:202:0x0499, B:204:0x04a3, B:206:0x04a7, B:208:0x04cd, B:210:0x04d1, B:211:0x04d4, B:212:0x04d7, B:214:0x0509, B:216:0x053b, B:217:0x0543, B:219:0x0548, B:220:0x0550, B:224:0x0555, B:228:0x0565, B:230:0x0573, B:231:0x0578, B:232:0x057c, B:234:0x0580, B:236:0x0585, B:237:0x058a, B:238:0x0592, B:240:0x05a6, B:241:0x05b1, B:242:0x05ba, B:244:0x05dc, B:246:0x05e2, B:248:0x05ea, B:249:0x05ed, B:251:0x05f1, B:253:0x05f7, B:255:0x05fd, B:257:0x060c, B:276:0x0698, B:278:0x069c, B:279:0x06a5, B:281:0x06a9, B:283:0x06b3, B:285:0x06b7, B:316:0x0739, B:318:0x073e, B:321:0x0750, B:323:0x0756, B:325:0x075c, B:327:0x0760, B:329:0x0764, B:331:0x0768, B:333:0x0777, B:334:0x077a, B:336:0x077e, B:339:0x078d, B:341:0x07b9, B:343:0x07c3, B:345:0x07cd, B:348:0x07d8, B:350:0x07ec, B:352:0x07f6, B:354:0x07fc, B:357:0x0803, B:358:0x080f, B:359:0x0812, B:361:0x0818, B:363:0x081c, B:365:0x0821, B:367:0x0829, B:369:0x0831, B:375:0x0844, B:376:0x0847, B:377:0x084a, B:287:0x06bb, B:289:0x06bf, B:291:0x06c3, B:293:0x06c7, B:294:0x06cc, B:296:0x06d1, B:298:0x06db, B:302:0x06ee, B:304:0x06f6, B:306:0x06fd, B:307:0x0701, B:310:0x0708, B:311:0x0711, B:312:0x072c, B:314:0x0732, B:301:0x06eb, B:380:0x0858, B:382:0x085c, B:384:0x0862, B:386:0x0868, B:388:0x086c, B:390:0x0870, B:392:0x0874, B:394:0x0881, B:397:0x0887, B:398:0x088a, B:400:0x08a3, B:402:0x08ac, B:404:0x08b4, B:407:0x08bc, B:378:0x084d, B:259:0x0612, B:261:0x0618, B:264:0x0637, B:266:0x064c, B:267:0x0656, B:269:0x066d, B:271:0x0671, B:272:0x0679, B:274:0x0692, B:275:0x0695, B:379:0x0852, B:262:0x062f, B:408:0x08e0, B:412:0x08e9, B:414:0x08ef, B:416:0x08f3, B:418:0x08f7, B:419:0x08fc, B:420:0x0908, B:422:0x0915, B:423:0x0932, B:425:0x0937, B:427:0x0941, B:429:0x094d, B:431:0x0952, B:434:0x095c, B:437:0x0964, B:440:0x096e, B:442:0x097a, B:444:0x0980, B:446:0x0986, B:449:0x098e, B:461:0x09ad, B:455:0x099b, B:457:0x099f, B:458:0x09a3, B:459:0x09a7, B:466:0x09b7, B:468:0x09c1, B:470:0x09c9, B:472:0x09d4, B:473:0x09d7, B:474:0x09db, B:476:0x09e9, B:478:0x09f4, B:482:0x09fc, B:484:0x0a04, B:486:0x0a08, B:487:0x0a12, B:489:0x0a18, B:535:0x0af4, B:539:0x0b14, B:542:0x0b1d, B:544:0x0b22, B:546:0x0b2a, B:548:0x0b30, B:549:0x0b34, B:551:0x0b3c, B:552:0x0b3f, B:554:0x0b45, B:556:0x0b4e, B:558:0x0b54, B:560:0x0b5a, B:562:0x0b64, B:568:0x0b77, B:570:0x0b7d, B:573:0x0b85, B:575:0x0b8b, B:576:0x0b91, B:578:0x0b95, B:580:0x0b99, B:586:0x0ba5, B:590:0x0bae, B:595:0x0bbf, B:597:0x0bc3, B:599:0x0bc8, B:600:0x0bca, B:563:0x0b67, B:565:0x0b6e, B:567:0x0b75, B:490:0x0a1d, B:492:0x0a25, B:494:0x0a29, B:536:0x0af8, B:538:0x0b04, B:497:0x0a33, B:499:0x0a37, B:501:0x0a45, B:502:0x0a4b, B:504:0x0a53, B:509:0x0a62, B:511:0x0a6f, B:516:0x0a79, B:519:0x0abe, B:521:0x0ac4, B:523:0x0ac8, B:527:0x0ad1, B:531:0x0ae0, B:532:0x0ae4, B:534:0x0aef, B:475:0x09de, B:601:0x0bcf, B:603:0x0bd5), top: B:651:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:538:0x0b04 A[Catch: BehindLiveWindowException -> 0x0bdc, DataSourceException -> 0x0be0, ParserException -> 0x0be4, DrmSession$DrmSessionException -> 0x0c04, IOException -> 0x0c08, ExoPlaybackException -> 0x0c0f, RuntimeException -> 0x0c5b, TryCatch #3 {ParserException -> 0x0be4, DataSourceException -> 0x0be0, ExoPlaybackException -> 0x0c0f, DrmSession$DrmSessionException -> 0x0c04, BehindLiveWindowException -> 0x0bdc, IOException -> 0x0c08, RuntimeException -> 0x0c5b, blocks: (B:3:0x0008, B:4:0x000e, B:6:0x0012, B:8:0x0018, B:9:0x0021, B:11:0x002d, B:13:0x0033, B:14:0x0035, B:16:0x003f, B:17:0x0042, B:19:0x0048, B:20:0x0050, B:22:0x0058, B:24:0x0065, B:25:0x006b, B:27:0x0073, B:29:0x0079, B:30:0x007b, B:32:0x0085, B:33:0x0088, B:35:0x0092, B:37:0x009d, B:38:0x00a1, B:39:0x00a4, B:41:0x00ae, B:44:0x00b8, B:45:0x00bd, B:47:0x00cd, B:49:0x00d8, B:50:0x00db, B:51:0x00de, B:56:0x00ef, B:54:0x00e8, B:57:0x00f4, B:60:0x0113, B:61:0x0129, B:63:0x013b, B:64:0x0140, B:66:0x0148, B:67:0x0156, B:68:0x015e, B:70:0x0166, B:72:0x0172, B:74:0x0178, B:76:0x0187, B:77:0x018a, B:78:0x018e, B:79:0x01a6, B:80:0x01ab, B:82:0x01b1, B:84:0x01ba, B:141:0x0369, B:142:0x036c, B:87:0x01c4, B:88:0x01cf, B:89:0x01e3, B:92:0x01f6, B:95:0x0200, B:96:0x0211, B:566:0x0b74, B:97:0x021e, B:99:0x022e, B:100:0x0234, B:101:0x0241, B:103:0x024f, B:104:0x0261, B:105:0x027d, B:106:0x0288, B:108:0x0294, B:109:0x02a0, B:110:0x02b3, B:112:0x02c2, B:113:0x02c7, B:115:0x02d5, B:116:0x02e1, B:118:0x0302, B:119:0x030c, B:120:0x0311, B:122:0x0317, B:124:0x031f, B:126:0x0323, B:128:0x0329, B:130:0x032f, B:131:0x0336, B:133:0x033b, B:134:0x0340, B:136:0x0346, B:139:0x0357, B:143:0x0371, B:145:0x0380, B:147:0x0384, B:149:0x039c, B:151:0x03a0, B:152:0x03a3, B:153:0x03a6, B:155:0x03aa, B:159:0x03b2, B:161:0x03b8, B:164:0x03be, B:167:0x03c4, B:169:0x03e5, B:172:0x03ef, B:174:0x040b, B:175:0x040e, B:177:0x0413, B:179:0x041f, B:181:0x0423, B:183:0x042b, B:184:0x042f, B:186:0x0433, B:188:0x043f, B:189:0x0442, B:193:0x046a, B:194:0x046d, B:196:0x0476, B:190:0x0445, B:192:0x044c, B:197:0x0484, B:199:0x048e, B:201:0x0492, B:215:0x0536, B:202:0x0499, B:204:0x04a3, B:206:0x04a7, B:208:0x04cd, B:210:0x04d1, B:211:0x04d4, B:212:0x04d7, B:214:0x0509, B:216:0x053b, B:217:0x0543, B:219:0x0548, B:220:0x0550, B:224:0x0555, B:228:0x0565, B:230:0x0573, B:231:0x0578, B:232:0x057c, B:234:0x0580, B:236:0x0585, B:237:0x058a, B:238:0x0592, B:240:0x05a6, B:241:0x05b1, B:242:0x05ba, B:244:0x05dc, B:246:0x05e2, B:248:0x05ea, B:249:0x05ed, B:251:0x05f1, B:253:0x05f7, B:255:0x05fd, B:257:0x060c, B:276:0x0698, B:278:0x069c, B:279:0x06a5, B:281:0x06a9, B:283:0x06b3, B:285:0x06b7, B:316:0x0739, B:318:0x073e, B:321:0x0750, B:323:0x0756, B:325:0x075c, B:327:0x0760, B:329:0x0764, B:331:0x0768, B:333:0x0777, B:334:0x077a, B:336:0x077e, B:339:0x078d, B:341:0x07b9, B:343:0x07c3, B:345:0x07cd, B:348:0x07d8, B:350:0x07ec, B:352:0x07f6, B:354:0x07fc, B:357:0x0803, B:358:0x080f, B:359:0x0812, B:361:0x0818, B:363:0x081c, B:365:0x0821, B:367:0x0829, B:369:0x0831, B:375:0x0844, B:376:0x0847, B:377:0x084a, B:287:0x06bb, B:289:0x06bf, B:291:0x06c3, B:293:0x06c7, B:294:0x06cc, B:296:0x06d1, B:298:0x06db, B:302:0x06ee, B:304:0x06f6, B:306:0x06fd, B:307:0x0701, B:310:0x0708, B:311:0x0711, B:312:0x072c, B:314:0x0732, B:301:0x06eb, B:380:0x0858, B:382:0x085c, B:384:0x0862, B:386:0x0868, B:388:0x086c, B:390:0x0870, B:392:0x0874, B:394:0x0881, B:397:0x0887, B:398:0x088a, B:400:0x08a3, B:402:0x08ac, B:404:0x08b4, B:407:0x08bc, B:378:0x084d, B:259:0x0612, B:261:0x0618, B:264:0x0637, B:266:0x064c, B:267:0x0656, B:269:0x066d, B:271:0x0671, B:272:0x0679, B:274:0x0692, B:275:0x0695, B:379:0x0852, B:262:0x062f, B:408:0x08e0, B:412:0x08e9, B:414:0x08ef, B:416:0x08f3, B:418:0x08f7, B:419:0x08fc, B:420:0x0908, B:422:0x0915, B:423:0x0932, B:425:0x0937, B:427:0x0941, B:429:0x094d, B:431:0x0952, B:434:0x095c, B:437:0x0964, B:440:0x096e, B:442:0x097a, B:444:0x0980, B:446:0x0986, B:449:0x098e, B:461:0x09ad, B:455:0x099b, B:457:0x099f, B:458:0x09a3, B:459:0x09a7, B:466:0x09b7, B:468:0x09c1, B:470:0x09c9, B:472:0x09d4, B:473:0x09d7, B:474:0x09db, B:476:0x09e9, B:478:0x09f4, B:482:0x09fc, B:484:0x0a04, B:486:0x0a08, B:487:0x0a12, B:489:0x0a18, B:535:0x0af4, B:539:0x0b14, B:542:0x0b1d, B:544:0x0b22, B:546:0x0b2a, B:548:0x0b30, B:549:0x0b34, B:551:0x0b3c, B:552:0x0b3f, B:554:0x0b45, B:556:0x0b4e, B:558:0x0b54, B:560:0x0b5a, B:562:0x0b64, B:568:0x0b77, B:570:0x0b7d, B:573:0x0b85, B:575:0x0b8b, B:576:0x0b91, B:578:0x0b95, B:580:0x0b99, B:586:0x0ba5, B:590:0x0bae, B:595:0x0bbf, B:597:0x0bc3, B:599:0x0bc8, B:600:0x0bca, B:563:0x0b67, B:565:0x0b6e, B:567:0x0b75, B:490:0x0a1d, B:492:0x0a25, B:494:0x0a29, B:536:0x0af8, B:538:0x0b04, B:497:0x0a33, B:499:0x0a37, B:501:0x0a45, B:502:0x0a4b, B:504:0x0a53, B:509:0x0a62, B:511:0x0a6f, B:516:0x0a79, B:519:0x0abe, B:521:0x0ac4, B:523:0x0ac8, B:527:0x0ad1, B:531:0x0ae0, B:532:0x0ae4, B:534:0x0aef, B:475:0x09de, B:601:0x0bcf, B:603:0x0bd5), top: B:651:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:541:0x0b1c  */
    /* JADX WARN: Removed duplicated region for block: B:567:0x0b75 A[Catch: BehindLiveWindowException -> 0x0bdc, DataSourceException -> 0x0be0, ParserException -> 0x0be4, DrmSession$DrmSessionException -> 0x0c04, IOException -> 0x0c08, ExoPlaybackException -> 0x0c0f, RuntimeException -> 0x0c5b, PHI: r22
  0x0b75: PHI (r22v2 boolean) = (r22v1 boolean), (r22v4 boolean), (r22v4 boolean), (r22v4 boolean), (r22v4 boolean) binds: [B:540:0x0b1a, B:553:0x0b43, B:555:0x0b4c, B:557:0x0b52, B:559:0x0b58] A[DONT_GENERATE, DONT_INLINE], TryCatch #3 {ParserException -> 0x0be4, DataSourceException -> 0x0be0, ExoPlaybackException -> 0x0c0f, DrmSession$DrmSessionException -> 0x0c04, BehindLiveWindowException -> 0x0bdc, IOException -> 0x0c08, RuntimeException -> 0x0c5b, blocks: (B:3:0x0008, B:4:0x000e, B:6:0x0012, B:8:0x0018, B:9:0x0021, B:11:0x002d, B:13:0x0033, B:14:0x0035, B:16:0x003f, B:17:0x0042, B:19:0x0048, B:20:0x0050, B:22:0x0058, B:24:0x0065, B:25:0x006b, B:27:0x0073, B:29:0x0079, B:30:0x007b, B:32:0x0085, B:33:0x0088, B:35:0x0092, B:37:0x009d, B:38:0x00a1, B:39:0x00a4, B:41:0x00ae, B:44:0x00b8, B:45:0x00bd, B:47:0x00cd, B:49:0x00d8, B:50:0x00db, B:51:0x00de, B:56:0x00ef, B:54:0x00e8, B:57:0x00f4, B:60:0x0113, B:61:0x0129, B:63:0x013b, B:64:0x0140, B:66:0x0148, B:67:0x0156, B:68:0x015e, B:70:0x0166, B:72:0x0172, B:74:0x0178, B:76:0x0187, B:77:0x018a, B:78:0x018e, B:79:0x01a6, B:80:0x01ab, B:82:0x01b1, B:84:0x01ba, B:141:0x0369, B:142:0x036c, B:87:0x01c4, B:88:0x01cf, B:89:0x01e3, B:92:0x01f6, B:95:0x0200, B:96:0x0211, B:566:0x0b74, B:97:0x021e, B:99:0x022e, B:100:0x0234, B:101:0x0241, B:103:0x024f, B:104:0x0261, B:105:0x027d, B:106:0x0288, B:108:0x0294, B:109:0x02a0, B:110:0x02b3, B:112:0x02c2, B:113:0x02c7, B:115:0x02d5, B:116:0x02e1, B:118:0x0302, B:119:0x030c, B:120:0x0311, B:122:0x0317, B:124:0x031f, B:126:0x0323, B:128:0x0329, B:130:0x032f, B:131:0x0336, B:133:0x033b, B:134:0x0340, B:136:0x0346, B:139:0x0357, B:143:0x0371, B:145:0x0380, B:147:0x0384, B:149:0x039c, B:151:0x03a0, B:152:0x03a3, B:153:0x03a6, B:155:0x03aa, B:159:0x03b2, B:161:0x03b8, B:164:0x03be, B:167:0x03c4, B:169:0x03e5, B:172:0x03ef, B:174:0x040b, B:175:0x040e, B:177:0x0413, B:179:0x041f, B:181:0x0423, B:183:0x042b, B:184:0x042f, B:186:0x0433, B:188:0x043f, B:189:0x0442, B:193:0x046a, B:194:0x046d, B:196:0x0476, B:190:0x0445, B:192:0x044c, B:197:0x0484, B:199:0x048e, B:201:0x0492, B:215:0x0536, B:202:0x0499, B:204:0x04a3, B:206:0x04a7, B:208:0x04cd, B:210:0x04d1, B:211:0x04d4, B:212:0x04d7, B:214:0x0509, B:216:0x053b, B:217:0x0543, B:219:0x0548, B:220:0x0550, B:224:0x0555, B:228:0x0565, B:230:0x0573, B:231:0x0578, B:232:0x057c, B:234:0x0580, B:236:0x0585, B:237:0x058a, B:238:0x0592, B:240:0x05a6, B:241:0x05b1, B:242:0x05ba, B:244:0x05dc, B:246:0x05e2, B:248:0x05ea, B:249:0x05ed, B:251:0x05f1, B:253:0x05f7, B:255:0x05fd, B:257:0x060c, B:276:0x0698, B:278:0x069c, B:279:0x06a5, B:281:0x06a9, B:283:0x06b3, B:285:0x06b7, B:316:0x0739, B:318:0x073e, B:321:0x0750, B:323:0x0756, B:325:0x075c, B:327:0x0760, B:329:0x0764, B:331:0x0768, B:333:0x0777, B:334:0x077a, B:336:0x077e, B:339:0x078d, B:341:0x07b9, B:343:0x07c3, B:345:0x07cd, B:348:0x07d8, B:350:0x07ec, B:352:0x07f6, B:354:0x07fc, B:357:0x0803, B:358:0x080f, B:359:0x0812, B:361:0x0818, B:363:0x081c, B:365:0x0821, B:367:0x0829, B:369:0x0831, B:375:0x0844, B:376:0x0847, B:377:0x084a, B:287:0x06bb, B:289:0x06bf, B:291:0x06c3, B:293:0x06c7, B:294:0x06cc, B:296:0x06d1, B:298:0x06db, B:302:0x06ee, B:304:0x06f6, B:306:0x06fd, B:307:0x0701, B:310:0x0708, B:311:0x0711, B:312:0x072c, B:314:0x0732, B:301:0x06eb, B:380:0x0858, B:382:0x085c, B:384:0x0862, B:386:0x0868, B:388:0x086c, B:390:0x0870, B:392:0x0874, B:394:0x0881, B:397:0x0887, B:398:0x088a, B:400:0x08a3, B:402:0x08ac, B:404:0x08b4, B:407:0x08bc, B:378:0x084d, B:259:0x0612, B:261:0x0618, B:264:0x0637, B:266:0x064c, B:267:0x0656, B:269:0x066d, B:271:0x0671, B:272:0x0679, B:274:0x0692, B:275:0x0695, B:379:0x0852, B:262:0x062f, B:408:0x08e0, B:412:0x08e9, B:414:0x08ef, B:416:0x08f3, B:418:0x08f7, B:419:0x08fc, B:420:0x0908, B:422:0x0915, B:423:0x0932, B:425:0x0937, B:427:0x0941, B:429:0x094d, B:431:0x0952, B:434:0x095c, B:437:0x0964, B:440:0x096e, B:442:0x097a, B:444:0x0980, B:446:0x0986, B:449:0x098e, B:461:0x09ad, B:455:0x099b, B:457:0x099f, B:458:0x09a3, B:459:0x09a7, B:466:0x09b7, B:468:0x09c1, B:470:0x09c9, B:472:0x09d4, B:473:0x09d7, B:474:0x09db, B:476:0x09e9, B:478:0x09f4, B:482:0x09fc, B:484:0x0a04, B:486:0x0a08, B:487:0x0a12, B:489:0x0a18, B:535:0x0af4, B:539:0x0b14, B:542:0x0b1d, B:544:0x0b22, B:546:0x0b2a, B:548:0x0b30, B:549:0x0b34, B:551:0x0b3c, B:552:0x0b3f, B:554:0x0b45, B:556:0x0b4e, B:558:0x0b54, B:560:0x0b5a, B:562:0x0b64, B:568:0x0b77, B:570:0x0b7d, B:573:0x0b85, B:575:0x0b8b, B:576:0x0b91, B:578:0x0b95, B:580:0x0b99, B:586:0x0ba5, B:590:0x0bae, B:595:0x0bbf, B:597:0x0bc3, B:599:0x0bc8, B:600:0x0bca, B:563:0x0b67, B:565:0x0b6e, B:567:0x0b75, B:490:0x0a1d, B:492:0x0a25, B:494:0x0a29, B:536:0x0af8, B:538:0x0b04, B:497:0x0a33, B:499:0x0a37, B:501:0x0a45, B:502:0x0a4b, B:504:0x0a53, B:509:0x0a62, B:511:0x0a6f, B:516:0x0a79, B:519:0x0abe, B:521:0x0ac4, B:523:0x0ac8, B:527:0x0ad1, B:531:0x0ae0, B:532:0x0ae4, B:534:0x0aef, B:475:0x09de, B:601:0x0bcf, B:603:0x0bd5), top: B:651:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:572:0x0b84  */
    /* JADX WARN: Removed duplicated region for block: B:711:0x0858 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ff  */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.E5r] */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.E5r] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.E5r] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.E5r] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.E5r] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.E5r] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.Djf, X.E5r] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r39) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 3284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6439E5r.handleMessage(android.os.Message):boolean");
    }

    @Override // X.InterfaceC6461E7a
    public final void onPlaybackParametersChanged(C6233Dyb c6233Dyb) {
        C6447E6a.A00(this.A0X, c6233Dyb, 16);
        if (this.A0z) {
            A0E(c6233Dyb.A01);
        }
    }

    @Override // X.E6A
    public final void prepare() {
        this.A0X.ARb(29).A03();
    }

    @Override // X.E6A
    public final void stop() {
        this.A0X.ARb(6).A03();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private long A02(X.Dy6 r13, long r14, boolean r16, boolean r17) throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            r12 = this;
            r12.A0B()
            r6 = 0
            r12.A0J = r6
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r12.A04 = r0
            r7 = 2
            if (r17 != 0) goto L17
            X.E60 r0 = r12.A0D
            int r1 = r0.A01
            r0 = 3
            if (r1 != r0) goto L1a
        L17:
            r12.A0G(r7)
        L1a:
            X.E5u r4 = r12.A0c
            X.E5x r2 = r4.A06
            r1 = r2
        L1f:
            if (r2 == 0) goto L2e
            X.E6Q r0 = r2.A02
            X.Dy6 r0 = r0.A04
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L2e
            X.E5x r2 = r2.A01
            goto L1f
        L2e:
            if (r16 != 0) goto L3e
            if (r1 != r2) goto L3e
            if (r2 == 0) goto L54
            long r0 = r2.A00
            long r10 = r14 + r0
            r8 = 0
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 >= 0) goto L6a
        L3e:
            r1 = 0
        L3f:
            X.E6P[] r0 = r12.A0t
            int r3 = r0.length
            if (r1 >= r3) goto L4a
            r12.A0F(r1)
            int r1 = r1 + 1
            goto L3f
        L4a:
            if (r2 == 0) goto L54
        L4c:
            X.E5x r0 = r4.A06
            if (r0 == r2) goto L5b
            r4.A08()
            goto L4c
        L54:
            r4.A0B()
            r12.A0J(r14)
            goto L7f
        L5b:
            r4.A0C(r2)
            r0 = 1000000000000(0xe8d4a51000, double:4.94065645841E-312)
            r2.A00 = r0
            boolean[] r0 = new boolean[r3]
            r12.A0Z(r0)
        L6a:
            r4.A0C(r2)
            boolean r0 = r2.A07
            if (r0 != 0) goto L88
            X.E6Q r0 = r2.A02
            X.E6Q r0 = r0.A01(r14)
            r2.A02 = r0
        L79:
            r12.A0J(r14)
            r12.A07()
        L7f:
            r12.A0V(r6)
            X.E6s r0 = r12.A0X
            X.BV6.A1B(r0, r7)
            return r14
        L88:
            boolean r0 = r2.A06
            if (r0 == 0) goto L79
            X.Dtp r5 = r2.A08
            long r14 = r5.AcP(r14)
            long r3 = r12.A0S
            long r1 = r14 - r3
            boolean r0 = r12.A0r
            r5.A94(r1, r0)
            goto L79
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6439E5r.A02(X.Dy6, long, boolean, boolean):long");
    }

    private void A0N(Timeline timeline, Timeline timeline2, Dy6 dy6, Dy6 dy62, long j, boolean z) {
        if (!A0e(timeline, dy6)) {
            C6233Dyb c6233Dyb = AnonymousClass002.A1P(dy6.A00, -1) ? C6233Dyb.A03 : this.A0D.A05;
            E68 e68 = this.A0Z;
            if (e68.AIo().equals(c6233Dyb)) {
                return;
            }
            BV6.A1A(this.A0X, 16);
            e68.Ae1(c6233Dyb);
            A0L(this.A0D.A05, c6233Dyb.A01, false, false);
            return;
        }
        Object obj = dy6.A04;
        E6B e6b = this.A0U;
        int iA01 = E6B.A01(e6b, timeline, obj);
        C5998Dth c5998Dth = this.A0V;
        timeline.A0E(c5998Dth, iA01, 0L);
        InterfaceC5858Dqs interfaceC5858Dqs = this.A0a;
        interfaceC5858Dqs.Adf(c5998Dth.A08);
        long jA01 = -9223372036854775807L;
        if (j != -9223372036854775807L) {
            jA01 = A01(timeline, obj, j);
        } else {
            if (C6xC.A00(!AnonymousClass002.A1M(timeline2.A02()) ? timeline2.A0E(c5998Dth, E6B.A01(e6b, timeline2, dy62.A04), 0L).A0C : null, c5998Dth.A0C) && !z) {
                return;
            }
        }
        interfaceC5858Dqs.Aev(jA01);
    }

    private void A0U(IOException iOException, int i) {
        ExoPlaybackException exoPlaybackExceptionA00 = ExoPlaybackException.A00(iOException, i);
        C6444E5x c6444E5x = this.A0c.A06;
        if (c6444E5x != null) {
            exoPlaybackExceptionA00 = exoPlaybackExceptionA00.A02(c6444E5x.A02.A04);
        }
        CNC.A05("ExoPlayerImplInternal", "Playback error", exoPlaybackExceptionA00);
        A0X(false, false);
        this.A0D = this.A0D.A07(exoPlaybackExceptionA00);
    }

    @Override // X.E6A
    public final void Acp(DrN drN, boolean z) {
    }

    public C6439E5r(Context context, Looper looper, Looper looper2, E7C e7c, E81 e81, E84 e84, InterfaceC5858Dqs interfaceC5858Dqs, InterfaceC5745Dog interfaceC5745Dog, C5813Dpx c5813Dpx, DpX dpX, E65 e65, E6Y e6y, AbstractC5823DqC abstractC5823DqC, E6W e6w, InterfaceC5047DQt interfaceC5047DQt, final InterfaceC6271DzO interfaceC6271DzO, C6041Duc c6041Duc, InterfaceC6068Dv6[] interfaceC6068Dv6Arr, int i, long j, boolean z) {
        Looper looper3 = looper2;
        C5813Dpx c5813Dpx2 = c5813Dpx;
        this.A0y = e84;
        this.A0h = abstractC5823DqC;
        this.A0i = e6w;
        this.A0b = interfaceC5745Dog;
        this.A0j = interfaceC5047DQt;
        this.A02 = i;
        this.A0G = dpX;
        this.A0a = interfaceC5858Dqs;
        this.A0u = j;
        this.A0m = z;
        this.A0W = e7c;
        this.A0g = e6y;
        this.A09 = e81;
        this.A0f = e65;
        this.A0S = interfaceC5745Dog.ACi(e6y);
        this.A0r = interfaceC5745Dog.Abj(e6y);
        E60 e60A00 = E60.A00(e6w);
        this.A0D = e60A00;
        E79 e79 = new E79();
        e79.A02 = e60A00;
        this.A0A = e79;
        int length = interfaceC6068Dv6Arr.length;
        this.A0s = new InterfaceC5921Ds8[length];
        this.A13 = new boolean[length];
        DoW doW = (DoW) abstractC5823DqC;
        this.A0t = new E6P[length];
        for (int i2 = 0; i2 < length; i2++) {
            InterfaceC6068Dv6 interfaceC6068Dv6 = interfaceC6068Dv6Arr[i2];
            interfaceC6068Dv6.ANc(e7c, e6y, i2);
            InterfaceC5921Ds8[] interfaceC5921Ds8Arr = this.A0s;
            interfaceC5921Ds8Arr[i2] = interfaceC6068Dv6.ADR();
            if (doW != null) {
                AbstractC6146Dwo abstractC6146Dwo = (AbstractC6146Dwo) interfaceC5921Ds8Arr[i2];
                synchronized (abstractC6146Dwo.A0H) {
                    abstractC6146Dwo.A07 = doW;
                }
            }
            this.A0t[i2] = new E6P(interfaceC6068Dv6Arr[i2], i2);
        }
        this.A0Z = new E68(e7c, this);
        this.A0k = C3cG.A0h();
        this.A0V = new C5998Dth();
        this.A0U = new E6B();
        abstractC5823DqC.A00 = this;
        abstractC5823DqC.A01 = interfaceC5047DQt;
        this.A0H = true;
        E6I e6iA7o = e7c.A7o(null, looper);
        this.A0x = e6iA7o;
        this.A0c = new E5u(e6iA7o, e81, new E82() { // from class: X.E7T
        }, e65);
        this.A0d = new C6430E5i(e6iA7o, this, e65, e6y);
        boolean zA03 = AbstractC5653Dmh.A03(EnumC5618Dlz.A1e);
        this.A0q = zA03;
        if (zA03) {
            this.A0T = null;
            c5813Dpx2 = c5813Dpx == null ? new C5813Dpx(null) : c5813Dpx2;
            this.A0e = c5813Dpx2;
            looper3 = c5813Dpx2.A00();
        } else {
            this.A0e = null;
            if (looper2 != null) {
                this.A0T = null;
            } else {
                HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                this.A0T = handlerThread;
                handlerThread.start();
                looper3 = handlerThread.getLooper();
            }
        }
        this.A0w = looper3;
        E6I e6iA7o2 = e7c.A7o(this, looper3);
        this.A0X = e6iA7o2;
        this.A0Y = new E62(context, this.A0w, this);
        InterfaceC6271DzO interfaceC6271DzO2 = new InterfaceC6271DzO() { // from class: X.E74
            @Override // X.InterfaceC6271DzO
            public final void AX9(MediaFormat mediaFormat, C6154Dwx c6154Dwx, long j2, long j3) {
                C6439E5r c6439E5r = this.A00;
                interfaceC6271DzO.AX9(mediaFormat, c6154Dwx, j2, j3);
                c6439E5r.AX9(mediaFormat, c6154Dwx, j2, j3);
            }
        };
        C6447E6a c6447E6aA00 = E6I.A00();
        c6447E6aA00.A00 = e6iA7o2.A00.obtainMessage(35, interfaceC6271DzO2);
        c6447E6aA00.A01 = e6iA7o2;
        c6447E6aA00.A03();
        long j2 = c6041Duc.A00;
        this.A12 = j2 > 0;
        this.A0v = j2;
        this.A0o = AbstractC5653Dmh.A03(EnumC5618Dlz.A1z);
        this.A0z = AbstractC5653Dmh.A03(EnumC5618Dlz.A03);
        this.A0l = AbstractC5653Dmh.A03(EnumC5618Dlz.A0H);
        this.A0p = AbstractC5653Dmh.A03(EnumC5618Dlz.A0x);
        this.A0n = AbstractC5653Dmh.A03(EnumC5618Dlz.A0p);
        this.A11 = AbstractC5653Dmh.A03(EnumC5618Dlz.A0v);
        this.A10 = c6041Duc.A01;
    }
}

package X;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.ExoPlaybackException;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.E5s, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6440E5s implements E6A, InterfaceC6271DzO, InterfaceC5503Djf, E7V, InterfaceC6069Dv7, Handler.Callback, InterfaceC6461E7a, InterfaceC6436E5o, InterfaceC6323E0y {
    public int A01;
    public int A02;
    public int A03;
    public long A07;
    public long A08;
    public ExoPlaybackException A0A;
    public E81 A0B;
    public E78 A0C;
    public E7J A0D;
    public E7J A0E;
    public E60 A0F;
    public DpX A0H;
    public DpX A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0T;
    public final long A0U;
    public final E6B A0V;
    public final C5998Dth A0W;
    public final E7C A0X;
    public final InterfaceC6459E6s A0Y;
    public final E62 A0Z;
    public final E68 A0a;
    public final InterfaceC5858Dqs A0b;
    public final InterfaceC5745Dog A0c;
    public final C6441E5t A0d;
    public final C6430E5i A0e;
    public final C5813Dpx A0f;
    public final E65 A0g;
    public final E6Y A0h;
    public final AbstractC5823DqC A0i;
    public final E6W A0j;
    public final InterfaceC5047DQt A0k;
    public final ArrayList<C6454E6h> A0l;
    public final boolean A0m;
    public final boolean A0n;
    public final boolean A0o;
    public final InterfaceC5921Ds8[] A0p;
    public final C6445E5y[] A0q;
    public final long A0r;
    public final Looper A0s;
    public final InterfaceC6459E6s A0t;
    public final E83 A0u;
    public final boolean A0v;
    public final boolean[] A0w;
    public long A06 = -9223372036854775807L;
    public boolean A0S = false;
    public boolean A0N = false;
    public float A00 = 1.0f;
    public C5725DoK A0G = C5725DoK.A03;
    public long A05 = -9223372036854775807L;
    public long A04 = -9223372036854775807L;
    public Timeline A09 = Timeline.A00;

    public static int A00(E6B e6b, C5998Dth c5998Dth, Timeline timeline, Timeline timeline2, Object obj, int i, boolean z) {
        Object obj2 = timeline.A0E(c5998Dth, E6B.A01(e6b, timeline, obj), 0L).A0C;
        for (int i2 = 0; i2 < timeline2.A02(); i2++) {
            if (timeline2.A0E(c5998Dth, i2, 0L).A0C.equals(obj2)) {
                return i2;
            }
        }
        int iA06 = timeline.A06(obj);
        int iA01 = timeline.A01();
        int iA062 = -1;
        for (int i3 = 0; i3 < iA01 && iA062 == -1; i3++) {
            iA06 = timeline.A05(e6b, c5998Dth, iA06, i, z);
            if (iA06 == -1) {
                return -1;
            }
            iA062 = timeline2.A06(timeline.A0C(iA06));
        }
        if (iA062 != -1) {
            return E6B.A00(e6b, timeline2, iA062);
        }
        return -1;
    }

    private Pair<Dy6, Long> A06(Timeline timeline) {
        Dy6 dy6A0D;
        long jA0T = 0;
        if (AnonymousClass002.A1M(timeline.A02())) {
            dy6A0D = E60.A0L;
        } else {
            int iA07 = timeline.A07(this.A0S);
            C5998Dth c5998Dth = this.A0W;
            E6B e6b = this.A0V;
            Pair pairA09 = timeline.A09(e6b, c5998Dth, iA07, -9223372036854775807L);
            dy6A0D = this.A0d.A0D(timeline, pairA09.first);
            jA0T = BV7.A0T(pairA09);
            if (AnonymousClass002.A1P(dy6A0D.A00, -1)) {
                Dy6.A00(e6b, timeline, dy6A0D);
                jA0T = 0;
            }
        }
        return Pair.create(dy6A0D, Long.valueOf(jA0T));
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0007  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0L(int r9, int r10, int r11, boolean r12) {
        /*
            r8 = this;
            r2 = 0
            if (r12 == 0) goto L7
            r0 = -1
            r7 = 1
            if (r9 != r0) goto L8
        L7:
            r7 = 0
        L8:
            r1 = -1
            r0 = 2
            if (r9 != r1) goto L88
            r11 = 2
        Ld:
            r0 = 1
            if (r9 != 0) goto L84
            r10 = 1
        L11:
            X.E60 r1 = r8.A0F
            boolean r0 = r1.A0E
            if (r0 != r7) goto L20
            int r0 = r1.A02
            if (r0 != r10) goto L20
            int r0 = r1.A00
            if (r0 != r11) goto L20
        L1f:
            return
        L20:
            X.E60 r6 = r1.A04(r11, r10, r7)
            r8.A0F = r6
            r8.A0M = r2
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8.A04 = r0
            X.E5t r5 = r8.A0d
            X.E5v r4 = r5.A06
        L33:
            if (r4 == 0) goto L4a
            X.E6W r0 = r4.A04
            X.Dic[] r3 = r0.A04
            int r2 = r3.length
            r1 = 0
        L3b:
            if (r1 >= r2) goto L47
            r0 = r3[r1]
            if (r0 == 0) goto L44
            r0.AUa(r7)
        L44:
            int r1 = r1 + 1
            goto L3b
        L47:
            X.E5v r4 = r4.A01
            goto L33
        L4a:
            boolean r0 = r8.A0g()
            if (r0 != 0) goto L68
            r8.A0E()
            r8.A0G()
            X.E60 r1 = r8.A0F
            boolean r0 = r1.A0F
            if (r0 == 0) goto L62
            X.E60 r0 = r1.A02()
            r8.A0F = r0
        L62:
            long r0 = r8.A08
            r5.A0G(r0)
            return
        L68:
            int r1 = r6.A01
            r0 = 3
            r2 = 2
            if (r1 != r0) goto L81
            X.E68 r1 = r8.A0a
            r0 = 1
            r1.A03 = r0
            X.E6R r0 = r1.A06
            r0.A00()
            r8.A0D()
        L7b:
            X.E6s r0 = r8.A0Y
            X.BV6.A1B(r0, r2)
            return
        L81:
            if (r1 != r2) goto L1f
            goto L7b
        L84:
            if (r10 != r0) goto L11
            r10 = 0
            goto L11
        L88:
            if (r11 != r0) goto Ld
            r11 = 1
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6440E5s.A0L(int, int, int, boolean):void");
    }

    private void A0Q(Timeline timeline, Timeline timeline2) {
        if (AnonymousClass002.A1M(timeline.A02()) && AnonymousClass002.A1M(timeline2.A02())) {
            return;
        }
        ArrayList<C6454E6h> arrayList = this.A0l;
        for (int iA0K = C8j3.A0K(arrayList); iA0K >= 0; iA0K--) {
            if (!A0h(this.A0V, this.A0W, timeline, timeline2, arrayList.get(iA0K), this.A03, this.A0S)) {
                arrayList.get(iA0K).A03.A03(false);
                arrayList.remove(iA0K);
            }
        }
        Collections.sort(arrayList);
    }

    public static void A0W(C6322E0x c6322E0x) {
        synchronized (c6322E0x) {
        }
        try {
            c6322E0x.A09.AN4(c6322E0x.A01, c6322E0x.A04);
        } finally {
            c6322E0x.A03(true);
        }
    }

    private void A0Z(boolean z) throws ExoPlaybackException {
        Dy6 dy6 = this.A0d.A06.A02.A04;
        long jA04 = A04(dy6, this.A0F.A0I, true, false);
        if (jA04 != this.A0F.A0I) {
            E60 e60 = this.A0F;
            this.A0F = A07(dy6, 4, jA04, e60.A04, e60.A03, z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0009  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0b(boolean r5, boolean r6) {
        /*
            r4 = this;
            r3 = 0
            r2 = 1
            if (r5 != 0) goto L9
            boolean r1 = r4.A0K
            r0 = 0
            if (r1 != 0) goto La
        L9:
            r0 = 1
        La:
            r4.A0c(r0, r3, r2, r3)
            X.E78 r0 = r4.A0C
            r0.A00(r6)
            X.Dog r1 = r4.A0c
            X.E6Y r0 = r4.A0h
            r1.AWJ(r0)
            X.E62 r0 = r4.A0Z
            X.E62.A00(r0)
            X.E62.A01(r0, r3)
            r4.A0K(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6440E5s.A0b(boolean, boolean):void");
    }

    private void A0d(boolean[] zArr, long j) throws ExoPlaybackException {
        C6445E5y[] c6445E5yArr;
        int length;
        C6442E5v c6442E5v = this.A0d.A09;
        E6W e6w = c6442E5v.A04;
        int i = 0;
        while (true) {
            c6445E5yArr = this.A0q;
            length = c6445E5yArr.length;
            if (i >= length) {
                break;
            }
            if (!AnonymousClass002.A1X(e6w.A03[i])) {
                c6445E5yArr[i].A07();
            }
            i++;
        }
        for (int i2 = 0; i2 < length; i2++) {
            if (AnonymousClass002.A1X(e6w.A03[i2]) && C6445E5y.A01(c6442E5v, c6445E5yArr[i2]) == null) {
                A0U(c6442E5v, i2, j, zArr[i2]);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:
    
        if (r6.A02 == Long.MIN_VALUE) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A0h(X.E6B r10, X.C5998Dth r11, androidx.media3.common.Timeline r12, androidx.media3.common.Timeline r13, X.C6454E6h r14, int r15, boolean r16) {
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
            X.E7J r12 = new X.E7J
            r12.<init>(r3, r2, r0)
            r13 = r15
            r15 = r16
            android.util.Pair r2 = A05(r9, r10, r11, r12, r13, r14, r15)
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
        throw new UnsupportedOperationException("Method not decompiled: X.C6440E5s.A0h(X.E6B, X.Dth, androidx.media3.common.Timeline, androidx.media3.common.Timeline, X.E6h, int, boolean):boolean");
    }

    private long A01(long j) {
        C6442E5v c6442E5v = this.A0d.A05;
        if (c6442E5v == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.A08 - c6442E5v.A00));
    }

    private long A02(Timeline timeline, Object obj, long j) {
        E6B e6b = this.A0V;
        int iA01 = E6B.A01(e6b, timeline, obj);
        C5998Dth c5998Dth = this.A0W;
        timeline.A0E(c5998Dth, iA01, 0L);
        long j2 = c5998Dth.A07;
        if (j2 == -9223372036854775807L || c5998Dth.A08 == null || !c5998Dth.A0D) {
            return -9223372036854775807L;
        }
        return Util.A0A(Util.A09(c5998Dth.A04) - j2) - (j + e6b.A02);
    }

    private long A03(C6442E5v c6442E5v) {
        long jMax = c6442E5v.A00;
        if (c6442E5v.A08) {
            int i = 0;
            while (true) {
                C6445E5y[] c6445E5yArr = this.A0q;
                if (i >= c6445E5yArr.length) {
                    break;
                }
                if (C6445E5y.A01(c6442E5v, c6445E5yArr[i]) != null) {
                    InterfaceC6068Dv6 interfaceC6068Dv6A01 = C6445E5y.A01(c6442E5v, c6445E5yArr[i]);
                    interfaceC6068Dv6A01.getClass();
                    long jAJR = interfaceC6068Dv6A01.AJR();
                    if (jAJR == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    jMax = Math.max(jAJR, jMax);
                }
                i++;
            }
        }
        return jMax;
    }

    private long A04(Dy6 dy6, long j, boolean z, boolean z2) throws ExoPlaybackException {
        int length;
        long jAcP = j;
        A0E();
        this.A0M = false;
        this.A04 = -9223372036854775807L;
        if (z2 || this.A0F.A01 == 3) {
            A0K(2);
        }
        C6441E5t c6441E5t = this.A0d;
        C6442E5v c6442E5v = c6441E5t.A06;
        while (c6442E5v != null && !dy6.equals(c6442E5v.A02.A04)) {
            c6442E5v = c6442E5v.A01;
        }
        if (z || c6442E5v != c6442E5v || (c6442E5v != null && j + c6442E5v.A00 < 0)) {
            int i = 0;
            while (true) {
                length = this.A0q.length;
                if (i >= length) {
                    break;
                }
                A0I(i);
                i++;
            }
            this.A06 = -9223372036854775807L;
            if (c6442E5v != null) {
                while (c6441E5t.A06 != c6442E5v) {
                    c6441E5t.A0B();
                }
                c6441E5t.A0A(c6442E5v);
                c6442E5v.A00 = 1000000000000L;
                A0d(new boolean[length], C6442E5v.A00(c6441E5t.A09));
                c6442E5v.A05 = true;
            }
        }
        A08();
        if (c6442E5v != null) {
            c6441E5t.A0A(c6442E5v);
            if (!c6442E5v.A08) {
                c6442E5v.A02 = c6442E5v.A02.A01(jAcP);
            } else if (c6442E5v.A06) {
                InterfaceC6006Dtp interfaceC6006Dtp = c6442E5v.A09;
                jAcP = interfaceC6006Dtp.AcP(jAcP);
                interfaceC6006Dtp.A94(jAcP - this.A0U, this.A0o);
            }
            A0N(jAcP);
            A09();
        } else {
            c6441E5t.A0E();
            A0N(jAcP);
        }
        A0Y(false);
        BV6.A1B(this.A0Y, 2);
        return jAcP;
    }

    /* JADX WARN: Incorrect types in method signature: (Landroidx/media3/common/Timeline;LX/E7J;ZIZLX/Dth;LX/E6B;)Landroid/util/Pair<Ljava/lang/Object;Ljava/lang/Long;>; */
    public static Pair A05(E6B e6b, C5998Dth c5998Dth, Timeline timeline, E7J e7j, int i, boolean z, boolean z2) {
        long j;
        Pair pairA09;
        int iA00;
        Timeline timeline2 = e7j.A02;
        if (AnonymousClass002.A1M(timeline.A02())) {
            return null;
        }
        if (AnonymousClass002.A1M(timeline2.A02())) {
            timeline2 = timeline;
        }
        try {
            int i2 = e7j.A00;
            j = e7j.A01;
            pairA09 = timeline2.A09(e6b, c5998Dth, i2, j);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (!timeline.equals(timeline2)) {
            if (timeline.A06(pairA09.first) == -1) {
                if (z && (iA00 = A00(e6b, c5998Dth, timeline2, timeline, pairA09.first, i, z2)) != -1) {
                    j = -9223372036854775807L;
                }
                return null;
            }
            if (timeline2.A0B(e6b, pairA09.first).A06 && BV7.A0d(c5998Dth, timeline2, e6b.A00).A00 == timeline2.A06(pairA09.first)) {
                iA00 = E6B.A01(e6b, timeline, pairA09.first);
            }
            return timeline.A09(e6b, c5998Dth, iA00, j);
        }
        return pairA09;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private X.E60 A07(X.Dy6 r19, int r20, long r21, long r23, long r25, boolean r27) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6440E5s.A07(X.Dy6, int, long, long, long, boolean):X.E60");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A08() {
        /*
            r11 = this;
            boolean r0 = r11.A0n
            if (r0 == 0) goto L52
            boolean r0 = r11.A0e()
            if (r0 == 0) goto L52
            X.E5y[] r10 = r11.A0q
            int r9 = r10.length
            r8 = 0
        Le:
            if (r8 >= r9) goto L4b
            r7 = r10[r8]
            int r6 = r7.A06()
            X.E68 r5 = r11.A0a
            boolean r0 = r7.A09()
            if (r0 == 0) goto L38
            int r4 = r7.A00
            r3 = 0
            r2 = 4
            if (r4 == r2) goto L28
            r0 = 2
            r1 = 0
            if (r4 != r0) goto L29
        L28:
            r1 = 1
        L29:
            if (r4 != r2) goto L2c
            r3 = 1
        L2c:
            if (r1 == 0) goto L45
            X.Dv6 r0 = r7.A04
        L30:
            X.C6445E5y.A02(r5, r0, r7)
            X.C6445E5y.A04(r7, r1)
            r7.A00 = r3
        L38:
            int r1 = r11.A01
            int r0 = r7.A06()
            int r6 = r6 - r0
            int r1 = r1 - r6
            r11.A01 = r1
            int r8 = r8 + 1
            goto Le
        L45:
            X.Dv6 r0 = r7.A05
            r0.getClass()
            goto L30
        L4b:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r11.A06 = r0
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6440E5s.A08():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A09() {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6440E5s.A09():void");
    }

    private void A0A() {
        E78 e78 = this.A0C;
        E60 e60 = this.A0F;
        boolean zA1Z = e78.A03 | AnonymousClass006.A1Z(e78.A02, e60);
        e78.A03 = zA1Z;
        e78.A02 = e60;
        if (zA1Z) {
            C6438E5q c6438E5q = ((E7P) this.A0u).A00;
            BV6.A1C(c6438E5q.A0i, new E64(c6438E5q, e78));
            E60 e602 = this.A0F;
            E78 e782 = new E78();
            e782.A02 = e602;
            this.A0C = e782;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0B() throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6440E5s.A0B():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0C() {
        /*
            r2 = this;
            X.E5t r0 = r2.A0d
            X.E5v r0 = r0.A06
            if (r0 == 0) goto L11
            X.E6Q r0 = r0.A02
            boolean r0 = r0.A08
            if (r0 == 0) goto L11
            boolean r1 = r2.A0N
            r0 = 1
            if (r1 != 0) goto L12
        L11:
            r0 = 0
        L12:
            r2.A0O = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6440E5s.A0C():void");
    }

    private void A0D() {
        C6442E5v c6442E5v = this.A0d.A06;
        if (c6442E5v == null) {
            return;
        }
        E6W e6w = c6442E5v.A04;
        int i = 0;
        while (true) {
            C6445E5y[] c6445E5yArr = this.A0q;
            if (i >= c6445E5yArr.length) {
                return;
            }
            if (AnonymousClass002.A1X(e6w.A03[i])) {
                c6445E5yArr[i].A08();
            }
            i++;
        }
    }

    private void A0E() {
        this.A0a.A02();
        for (C6445E5y c6445E5y : this.A0q) {
            InterfaceC6068Dv6 interfaceC6068Dv6 = c6445E5y.A04;
            if (AnonymousClass002.A1L(interfaceC6068Dv6.AL0()) && interfaceC6068Dv6.AL0() == 2) {
                interfaceC6068Dv6.stop();
            }
            InterfaceC6068Dv6 interfaceC6068Dv62 = c6445E5y.A05;
            if (interfaceC6068Dv62 != null && AnonymousClass002.A1L(interfaceC6068Dv62.AL0()) && interfaceC6068Dv62.AL0() == 2) {
                interfaceC6068Dv62.stop();
            }
        }
    }

    private void A0F() {
        C6442E5v c6442E5v = this.A0d.A05;
        boolean z = this.A0R || (c6442E5v != null && c6442E5v.A09.AOd());
        E60 e60 = this.A0F;
        if (z != e60.A0D) {
            this.A0F = e60.A0A(z);
        }
    }

    private void A0G() {
        boolean z;
        Dy6 dy6;
        long j;
        int i;
        C6454E6h c6454E6h;
        int i2;
        C6441E5t c6441E5t = this.A0d;
        C6442E5v c6442E5v = c6441E5t.A06;
        if (c6442E5v == null) {
            this.A0F.A0J = -9223372036854775807L;
            return;
        }
        long jAZF = c6442E5v.A08 ? c6442E5v.A09.AZF() : -9223372036854775807L;
        if (jAZF != -9223372036854775807L) {
            if (!c6442E5v.A09()) {
                c6441E5t.A0A(c6442E5v);
                A0Y(false);
                A09();
            }
            A0N(jAZF);
            if (jAZF != this.A0F.A0I) {
                E60 e60 = this.A0F;
                dy6 = e60.A09;
                j = e60.A04;
                z = true;
                i = 4;
                this.A0F = A07(dy6, i, jAZF, j, jAZF, z);
            }
        } else {
            E68 e68 = this.A0a;
            long jA01 = e68.A01(AnonymousClass006.A1Z(c6442E5v, c6441E5t.A09));
            this.A08 = jA01;
            jAZF = jA01 - c6442E5v.A00;
            long j2 = this.A0F.A0I;
            ArrayList<C6454E6h> arrayList = this.A0l;
            if (!arrayList.isEmpty()) {
                E60 e602 = this.A0F;
                Dy6 dy62 = e602.A09;
                if (!AnonymousClass002.A1P(dy62.A00, -1)) {
                    if (this.A0J) {
                        j2--;
                        this.A0J = false;
                    }
                    int iA06 = e602.A06.A06(dy62.A04);
                    int iMin = Math.min(this.A02, arrayList.size());
                    if (iMin > 0) {
                        C6454E6h c6454E6h2 = arrayList.get(iMin - 1);
                        while (c6454E6h2 != null && (c6454E6h2.A00 > iA06 || (c6454E6h2.A00 == iA06 && c6454E6h2.A01 > j2))) {
                            int i3 = iMin - 1;
                            c6454E6h2 = i3 > 0 ? arrayList.get(iMin - 2) : null;
                            iMin = i3;
                        }
                    }
                    while (iMin < arrayList.size() && (c6454E6h = arrayList.get(iMin)) != null) {
                        if (c6454E6h.A02 == null || ((i2 = c6454E6h.A00) >= iA06 && (i2 != iA06 || c6454E6h.A01 > j2))) {
                            while (c6454E6h.A02 != null && c6454E6h.A00 == iA06) {
                                long j3 = c6454E6h.A01;
                                if (j3 <= j2 || j3 > jAZF) {
                                    break;
                                }
                                try {
                                    A0V(c6454E6h.A03);
                                    arrayList.remove(iMin);
                                    if (iMin >= arrayList.size() || (c6454E6h = arrayList.get(iMin)) == null) {
                                        break;
                                    }
                                } catch (Throwable th) {
                                    arrayList.remove(iMin);
                                    throw th;
                                }
                            }
                            this.A02 = iMin;
                        } else {
                            iMin++;
                        }
                    }
                    this.A02 = iMin;
                }
            }
            if (e68.ANJ()) {
                z = !this.A0C.A04;
                E60 e603 = this.A0F;
                dy6 = e603.A09;
                j = e603.A04;
                i = 8;
                this.A0F = A07(dy6, i, jAZF, j, jAZF, z);
            } else {
                E60 e604 = this.A0F;
                e604.A0I = jAZF;
                e604.A0H = SystemClock.elapsedRealtime();
            }
        }
        this.A0F.A0G = c6441E5t.A05.A03();
        E60 e605 = this.A0F;
        e605.A0K = A01(e605.A0G);
        boolean z2 = this.A0v;
        E60 e606 = this.A0F;
        if (z2) {
            e606.A0J = BV5.A07(c6442E5v.A09.AD6(e606.A0I));
        } else {
            e606.A0J = -9223372036854775807L;
        }
        E60 e607 = this.A0F;
        if (e607.A0E && e607.A01 == 3 && A0i(e607.A06, e607.A09)) {
            E60 e608 = this.A0F;
            if (e608.A05.A01 == 1.0f) {
                float fACE = this.A0b.ACE(A02(e608.A06, e608.A09.A04, e608.A0I), this.A0F.A0K);
                E68 e682 = this.A0a;
                if (E68.A00(e682) != fACE) {
                    C6233Dyb c6233Dyb = new C6233Dyb(fACE, this.A0F.A05.A00);
                    BV6.A1A(this.A0Y, 16);
                    e682.Ae1(c6233Dyb);
                    A0P(this.A0F.A05, E68.A00(e682), false, false);
                }
            }
        }
    }

    private void A0H(float f) {
        this.A00 = f;
        float f2 = f * this.A0Z.A00;
        for (C6445E5y c6445E5y : this.A0q) {
            InterfaceC6068Dv6 interfaceC6068Dv6 = c6445E5y.A04;
            if (interfaceC6068Dv6.ALv() == 1) {
                Float fValueOf = Float.valueOf(f2);
                interfaceC6068Dv6.AN4(2, fValueOf);
                InterfaceC6068Dv6 interfaceC6068Dv62 = c6445E5y.A05;
                if (interfaceC6068Dv62 != null) {
                    interfaceC6068Dv62.AN4(2, fValueOf);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0I(int r10) {
        /*
            r9 = this;
            X.E5y[] r0 = r9.A0q
            r8 = r0[r10]
            int r7 = r8.A06()
            X.E68 r6 = r9.A0a
            X.Dv6 r5 = r8.A04
            X.C6445E5y.A02(r6, r5, r8)
            X.Dv6 r4 = r8.A05
            r3 = 0
            if (r4 == 0) goto L32
            int r0 = r4.AL0()
            boolean r0 = X.AnonymousClass002.A1L(r0)
            if (r0 == 0) goto L24
            int r2 = r8.A00
            r1 = 3
            r0 = 1
            if (r2 != r1) goto L25
        L24:
            r0 = 0
        L25:
            X.C6445E5y.A02(r6, r4, r8)
            X.C6445E5y.A04(r8, r3)
            if (r0 == 0) goto L32
            r0 = 17
            r4.AN4(r0, r5)
        L32:
            r8.A00 = r3
            r9.A0M(r10, r3)
            int r0 = r9.A01
            int r0 = r0 - r7
            r9.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6440E5s.A0I(int):void");
    }

    private void A0J(int i) {
        C6445E5y c6445E5y = this.A0q[i];
        try {
            C6442E5v c6442E5v = this.A0d.A06;
            c6442E5v.getClass();
            InterfaceC6068Dv6 interfaceC6068Dv6A01 = C6445E5y.A01(c6442E5v, c6445E5y);
            interfaceC6068Dv6A01.getClass();
            interfaceC6068Dv6A01.AQT();
        } catch (IOException | RuntimeException e) {
            int iALv = c6445E5y.A04.ALv();
            if (iALv != 3 && iALv != 5) {
                throw e;
            }
            C6441E5t c6441E5t = this.A0d;
            E6W e6w = c6441E5t.A06.A04;
            InterfaceC5441Dic[] interfaceC5441DicArr = e6w.A04;
            CNC.A05("ExoPlayerImplInternal", FGI.A0M("Disabling track due to error: ", C6154Dwx.A00(interfaceC5441DicArr[i].AKF())), e);
            E6W e6w2 = new E6W(e6w.A01, e6w.A02, (C5951Dsl[]) e6w.A03.clone(), (InterfaceC5441Dic[]) interfaceC5441DicArr.clone());
            e6w2.A03[i] = null;
            e6w2.A04[i] = null;
            A0I(i);
            C6442E5v c6442E5v2 = c6441E5t.A06;
            c6442E5v2.A04(e6w2, new boolean[c6442E5v2.A0B.length], this.A0F.A0I, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0K(int r4) {
        /*
            r3 = this;
            X.E60 r2 = r3.A0F
            int r0 = r2.A01
            if (r0 == r4) goto L23
            r0 = 2
            if (r4 == r0) goto L13
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.A05 = r0
            r0 = 3
            if (r4 == r0) goto L1d
        L13:
            boolean r0 = r2.A0F
            if (r0 == 0) goto L1d
            X.E60 r2 = r2.A02()
            r3.A0F = r2
        L1d:
            X.E60 r0 = r2.A03(r4)
            r3.A0F = r0
        L23:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6440E5s.A0K(int):void");
    }

    private void A0M(final int i, final boolean z) {
        boolean[] zArr = this.A0w;
        if (zArr[i] != z) {
            zArr[i] = z;
            BV6.A1C(this.A0t, new Runnable() { // from class: X.E6e
                public static final String __redex_internal_original_name = "ExoPlayerImplInternal2$$ExternalSyntheticLambda2";

                @Override // java.lang.Runnable
                public final void run() {
                    C6440E5s c6440E5s = this.A01;
                    c6440E5s.A0g.AVK(i, z);
                }
            });
        }
    }

    private void A0N(long j) {
        C6441E5t c6441E5t = this.A0d;
        C6442E5v c6442E5v = c6441E5t.A06;
        long j2 = j + (c6442E5v == null ? 1000000000000L : c6442E5v.A00);
        this.A08 = j2;
        this.A0a.A06.A01(j2);
        for (C6445E5y c6445E5y : this.A0q) {
            long j3 = this.A08;
            InterfaceC6068Dv6 interfaceC6068Dv6A01 = C6445E5y.A01(c6442E5v, c6445E5y);
            if (interfaceC6068Dv6A01 != null) {
                interfaceC6068Dv6A01.AbP(j3);
            }
        }
        for (C6442E5v c6442E5v2 = c6441E5t.A06; c6442E5v2 != null; c6442E5v2 = c6442E5v2.A01) {
            for (int i = 0; i < c6442E5v2.A04.A04.length; i++) {
            }
        }
    }

    private void A0O(long j) {
        long jMin;
        C6442E5v c6442E5v;
        C6442E5v c6442E5v2;
        if (this.A0m || this.A0P) {
            jMin = this.A0F.A01 == 3 ? 1000L : 10L;
            for (C6445E5y c6445E5y : this.A0q) {
                long j2 = this.A08;
                long j3 = this.A07;
                InterfaceC6068Dv6 interfaceC6068Dv6 = c6445E5y.A04;
                long jAEx = AnonymousClass002.A1L(interfaceC6068Dv6.AL0()) ? interfaceC6068Dv6.AEx(j2, j3) : LinkEncryptedPairingKt.LINK_COUNTER_MAX;
                InterfaceC6068Dv6 interfaceC6068Dv62 = c6445E5y.A05;
                if (interfaceC6068Dv62 != null && AnonymousClass002.A1L(interfaceC6068Dv62.AL0())) {
                    jAEx = Math.min(jAEx, interfaceC6068Dv62.AEx(j2, j3));
                }
                jMin = Math.min(jMin, Util.A0B(jAEx));
            }
            E60 e60 = this.A0F;
            if (e60.A0B() && (c6442E5v = this.A0d.A06) != null && (c6442E5v2 = c6442E5v.A01) != null && this.A08 + (Util.A0A(jMin) * e60.A05.A01) >= C6442E5v.A00(c6442E5v2)) {
                jMin = Math.min(jMin, 10L);
            }
        } else {
            jMin = (this.A0F.A01 != 3 || A0g()) ? 10L : 1000L;
        }
        ((E6I) this.A0Y).A00.sendEmptyMessageAtTime(2, j + jMin);
    }

    private void A0P(C6233Dyb c6233Dyb, float f, boolean z, boolean z2) {
        if (z) {
            if (z2) {
                this.A0C.A00(1);
            }
            this.A0F = this.A0F.A05(c6233Dyb);
        }
        float f2 = c6233Dyb.A01;
        for (C6442E5v c6442E5v = this.A0d.A06; c6442E5v != null; c6442E5v = c6442E5v.A01) {
            for (InterfaceC5441Dic interfaceC5441Dic : c6442E5v.A04.A04) {
                if (interfaceC5441Dic != null) {
                    interfaceC5441Dic.AUe(f2);
                }
            }
        }
        for (C6445E5y c6445E5y : this.A0q) {
            c6445E5y.A04.Ae2(f, f2);
            InterfaceC6068Dv6 interfaceC6068Dv6 = c6445E5y.A05;
            if (interfaceC6068Dv6 != null) {
                interfaceC6068Dv6.Ae2(f, f2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02b9 A[Catch: all -> 0x0392, TryCatch #0 {all -> 0x0392, blocks: (B:107:0x0214, B:110:0x021b, B:112:0x021f, B:113:0x0223, B:115:0x0233, B:128:0x0267, B:130:0x026d, B:138:0x027c, B:146:0x028b, B:150:0x0295, B:152:0x029b, B:165:0x02b9, B:166:0x02bb, B:170:0x02c3, B:171:0x02c7, B:173:0x02cb, B:127:0x0264, B:123:0x0250, B:116:0x0237, B:118:0x023d, B:120:0x0245, B:155:0x02a2, B:176:0x02d3, B:178:0x02d7, B:180:0x02e3, B:181:0x02ee, B:182:0x02f1, B:184:0x02f9), top: B:238:0x01f3 }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0057  */
    /* JADX WARN: Type inference failed for: r25v1, types: [X.E6B] */
    /* JADX WARN: Type inference failed for: r25v2, types: [X.Dth] */
    /* JADX WARN: Type inference failed for: r25v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0S(androidx.media3.common.Timeline r40, boolean r41) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1052
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6440E5s.A0S(androidx.media3.common.Timeline, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a7 A[Catch: all -> 0x018d, TryCatch #1 {all -> 0x018d, blocks: (B:18:0x0099, B:20:0x00a7, B:23:0x00ae, B:25:0x00b2, B:26:0x00b5, B:27:0x00ba, B:29:0x00c2, B:31:0x00c8, B:35:0x00d0, B:41:0x00e0, B:43:0x00e6, B:45:0x00ea, B:47:0x0107, B:49:0x010d, B:52:0x011a, B:53:0x011e, B:55:0x012e, B:61:0x013c, B:63:0x0141, B:65:0x014d, B:67:0x0157, B:70:0x0165, B:51:0x0113, B:58:0x0136), top: B:82:0x0099 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0T(X.E7J r28, boolean r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6440E5s.A0T(X.E7J, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0U(X.C6442E5v r27, int r28, long r29, boolean r31) throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            r26 = this;
            r8 = r26
            X.E5y[] r0 = r8.A0q
            r6 = r0[r28]
            int r1 = r6.A00
            if (r1 == 0) goto L77
            r0 = 2
            if (r1 == r0) goto L77
            r0 = 4
            if (r1 == r0) goto L77
            X.Dv6 r0 = r6.A05
            r0.getClass()
        L15:
            int r0 = r0.AL0()
            boolean r0 = X.AnonymousClass002.A1L(r0)
            if (r0 != 0) goto Lba
            X.E5t r0 = r8.A0d
            X.E5v r0 = r0.A06
            r7 = r27
            boolean r27 = X.AnonymousClass002.A1Z(r7, r0)
            X.E6W r1 = r7.A04
            X.Dsl[] r0 = r1.A03
            r16 = r0[r28]
            X.Dic[] r0 = r1.A04
            r4 = r0[r28]
            boolean r0 = r8.A0g()
            if (r0 == 0) goto L41
            X.E60 r0 = r8.A0F
            int r1 = r0.A01
            r0 = 3
            r14 = 1
            if (r1 == r0) goto L42
        L41:
            r14 = 0
        L42:
            if (r31 != 0) goto L48
            r26 = 1
            if (r14 != 0) goto L4a
        L48:
            r26 = 0
        L4a:
            int r0 = r8.A01
            int r0 = r0 + 1
            r8.A01 = r0
            X.DuF[] r0 = r7.A0C
            r18 = r0[r28]
            long r2 = r8.A08
            long r0 = r7.A00
            X.E6Q r5 = r7.A02
            X.Dy6 r12 = r5.A04
            X.E68 r10 = r8.A0a
            r11 = 0
            if (r4 == 0) goto L75
            int r5 = r4.length()
        L65:
            X.Dwx[] r9 = new X.C6154Dwx[r5]
        L67:
            if (r11 >= r5) goto L7a
            r4.getClass()
            X.Dwx r13 = r4.AFq(r11)
            r9[r11] = r13
            int r11 = r11 + 1
            goto L67
        L75:
            r5 = 0
            goto L65
        L77:
            X.Dv6 r0 = r6.A04
            goto L15
        L7a:
            int r11 = r6.A00
            r5 = 1
            r22 = r29
            if (r11 == 0) goto Lb5
            r4 = 2
            if (r11 == r4) goto Lb5
            r4 = 4
            if (r11 == r4) goto Lb5
            r6.A02 = r5
            X.Dv6 r15 = r6.A05
            r15.getClass()
        L8e:
            r24 = r0
            r20 = r2
            r19 = r9
            r17 = r12
            r15.A9y(r16, r17, r18, r19, r20, r22, r24, r26, r27)
            r10.A03(r15)
            X.E6b r2 = new X.E6b
            r2.<init>(r8)
            r1 = 11
            X.Dv6 r0 = X.C6445E5y.A01(r7, r6)
            r0.getClass()
            r0.AN4(r1, r2)
            if (r14 == 0) goto Lba
            if (r27 == 0) goto Lba
            r6.A08()
            return
        Lb5:
            r6.A01 = r5
            X.Dv6 r15 = r6.A04
            goto L8e
        Lba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6440E5s.A0U(X.E5v, int, long, boolean):void");
    }

    private void A0V(C6322E0x c6322E0x) {
        if (c6322E0x.A03 != this.A0s) {
            C6447E6a.A00(this.A0Y, c6322E0x, 15);
            return;
        }
        A0W(c6322E0x);
        int i = this.A0F.A01;
        if (i == 3 || i == 2) {
            BV6.A1B(this.A0Y, 2);
        }
    }

    private void A0X(Dy6 dy6, C5414DiA c5414DiA, E6W e6w) {
        C6441E5t c6441E5t = this.A0d;
        C6442E5v c6442E5v = c6441E5t.A05;
        c6442E5v.getClass();
        C6442E5v c6442E5v2 = c6441E5t.A06;
        long j = this.A08 - c6442E5v.A00;
        if (c6442E5v != c6442E5v2) {
            j -= c6442E5v.A02.A03;
        }
        long jA01 = A01(c6442E5v.A03());
        long jALV = A0i(this.A0F.A06, c6442E5v.A02.A04) ? this.A0b.ALV() : -9223372036854775807L;
        this.A0c.AWf(new C5820Dq6(this.A0F.A06, this.A0h, dy6, E68.A00(this.A0a), j, jA01, jALV, this.A04, this.A0F.A0E, this.A0M), c5414DiA, e6w.A04);
    }

    private void A0Y(boolean z) {
        C6442E5v c6442E5v = this.A0d.A05;
        Dy6 dy6 = c6442E5v == null ? this.A0F.A09 : c6442E5v.A02.A04;
        boolean zEquals = this.A0F.A08.equals(dy6);
        if (!zEquals) {
            this.A0F = this.A0F.A08(dy6);
        }
        E60 e60 = this.A0F;
        e60.A0G = c6442E5v == null ? e60.A0I : c6442E5v.A03();
        E60 e602 = this.A0F;
        e602.A0K = A01(e602.A0G);
        if ((!zEquals || z) && c6442E5v != null && c6442E5v.A08) {
            A0X(c6442E5v.A02.A04, c6442E5v.A03, c6442E5v.A04);
        }
    }

    private void A0a(boolean z, int i, int i2) {
        final E62 e62 = this.A0Z;
        int i3 = 0;
        if (this.A0F.A01 != 1 && e62.A02 == 1) {
            if (!z) {
                int i4 = e62.A01;
                if (i4 == 1) {
                    i3 = -1;
                } else if (i4 != 3) {
                }
            } else if (e62.A01 != 2) {
                if (e62.A04 == null) {
                    int i5 = e62.A02;
                    DrN drN = e62.A03;
                    drN.getClass();
                    e62.A04 = new E87(new AudioManager.OnAudioFocusChangeListener() { // from class: X.E6Z
                        @Override // android.media.AudioManager.OnAudioFocusChangeListener
                        public final void onAudioFocusChange(int i6) {
                            int i7;
                            E62 e622 = e62;
                            if (i6 == -3) {
                                i7 = 4;
                            } else if (i6 != -2) {
                                i7 = 1;
                                if (i6 != -1) {
                                    if (i6 != 1) {
                                        CNC.A04("AudioFocusManager", FGI.A0H("Unknown focus change type: ", i6));
                                        return;
                                    }
                                    E62.A01(e622, 2);
                                    E7V e7v = e622.A05;
                                    if (e7v != null) {
                                        e7v.AB2(1);
                                        return;
                                    }
                                    return;
                                }
                                E7V e7v2 = e622.A05;
                                if (e7v2 != null) {
                                    e7v2.AB2(-1);
                                }
                                E62.A00(e622);
                            } else {
                                E7V e7v3 = e622.A05;
                                if (e7v3 != null) {
                                    e7v3.AB2(0);
                                }
                                i7 = 3;
                            }
                            E62.A01(e622, i7);
                        }
                    }, e62.A06, drN, i5);
                }
                AudioManager audioManager = e62.A07.get();
                Object obj = e62.A04.A00;
                obj.getClass();
                if (audioManager.requestAudioFocus((AudioFocusRequest) obj) == 1) {
                    E62.A01(e62, 2);
                } else {
                    E62.A01(e62, 1);
                    i3 = -1;
                }
            }
            A0L(i3, i, i2, z);
        }
        E62.A00(e62);
        E62.A01(e62, 0);
        i3 = 1;
        A0L(i3, i, i2, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00da A[PHI: r2 r7 r17
  0x00da: PHI (r2v2 long) = (r2v1 long), (r2v4 long) binds: [B:26:0x008a, B:28:0x00ab] A[DONT_GENERATE, DONT_INLINE]
  0x00da: PHI (r7v1 X.Dy6) = (r7v0 X.Dy6), (r7v6 X.Dy6) binds: [B:26:0x008a, B:28:0x00ab] A[DONT_GENERATE, DONT_INLINE]
  0x00da: PHI (r17v1 long) = (r17v0 long), (r17v4 long) binds: [B:26:0x008a, B:28:0x00ab] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0c(boolean r42, boolean r43, boolean r44, boolean r45) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6440E5s.A0c(boolean, boolean, boolean, boolean):void");
    }

    private boolean A0e() {
        if (!this.A0n) {
            return false;
        }
        for (C6445E5y c6445E5y : this.A0q) {
            if (c6445E5y.A09()) {
                return true;
            }
        }
        return false;
    }

    private boolean A0f() {
        C6442E5v c6442E5v = this.A0d.A06;
        long j = c6442E5v.A02.A00;
        if (c6442E5v.A08) {
            return j == -9223372036854775807L || this.A0F.A0I < j || !A0g();
        }
        return false;
    }

    private boolean A0g() {
        E60 e60 = this.A0F;
        return e60.A0E && e60.A02 == 0;
    }

    private boolean A0i(Timeline timeline, Dy6 dy6) {
        if (AnonymousClass002.A1P(dy6.A00, -1) || AnonymousClass002.A1M(timeline.A02())) {
            return false;
        }
        int iA01 = E6B.A01(this.A0V, timeline, dy6.A04);
        C5998Dth c5998Dth = this.A0W;
        timeline.A0E(c5998Dth, iA01, 0L);
        return (c5998Dth.A08 == null || !c5998Dth.A0D || c5998Dth.A07 == -9223372036854775807L) ? false : true;
    }

    public static boolean A0j(C6442E5v c6442E5v) {
        if (c6442E5v == null) {
            return false;
        }
        try {
            if (c6442E5v.A08) {
                for (InterfaceC6022DuF interfaceC6022DuF : c6442E5v.A0C) {
                    if (interfaceC6022DuF != null) {
                        interfaceC6022DuF.AQQ();
                    }
                }
            } else {
                c6442E5v.A09.AQR();
            }
            return (c6442E5v.A08 && c6442E5v.A09.AI5() == Long.MIN_VALUE) ? false : true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX WARN: Incorrect types in method signature: (ILjava/util/List<LX/E5j;>;LX/E5p;)V */
    @Override // X.E6A
    public final void A3h(InterfaceC6437E5p interfaceC6437E5p, List list, int i) {
        C6447E6a.A02(this.A0Y, 18, new C6457E6q(interfaceC6437E5p, list, -1, -9223372036854775807L), i, 0);
    }

    @Override // X.E7V
    public final void AB2(int i) {
        this.A0Y.ARc(33, i, 0).A03();
    }

    @Override // X.E6A
    public final Looper AIn() {
        return this.A0s;
    }

    @Override // X.InterfaceC5495DjX
    public final /* bridge */ /* synthetic */ void ASS(InterfaceC5487DjP interfaceC5487DjP) {
        C6447E6a.A00(this.A0Y, interfaceC5487DjP, 9);
    }

    @Override // X.InterfaceC6436E5o
    public final void AUk() {
        Handler handler = ((E6I) this.A0Y).A00;
        handler.removeMessages(2);
        handler.sendEmptyMessage(22);
    }

    @Override // X.InterfaceC5503Djf
    public final void AUv(InterfaceC6006Dtp interfaceC6006Dtp) {
        C6447E6a.A00(this.A0Y, interfaceC6006Dtp, 8);
    }

    @Override // X.InterfaceC6069Dv7
    public final void AWe() {
        BV6.A1B(this.A0Y, 10);
    }

    @Override // X.InterfaceC6271DzO
    public final void AX9(MediaFormat mediaFormat, C6154Dwx c6154Dwx, long j, long j2) {
        if (this.A0Q) {
            this.A0Y.ARb(37).A03();
        }
    }

    @Override // X.E6A
    public final boolean AaB() {
        if (this.A0T || !BV7.A1V(this.A0s)) {
            return true;
        }
        this.A0T = true;
        C5778DpK c5778DpK = new C5778DpK(this.A0X);
        C6447E6a.A00(this.A0Y, c5778DpK, 7);
        return c5778DpK.A03(this.A0r);
    }

    @Override // X.E6A
    public final void Aat(InterfaceC6437E5p interfaceC6437E5p, int i, int i2) {
        C6447E6a.A02(this.A0Y, 20, interfaceC6437E5p, i, i2);
    }

    @Override // X.E6A
    public final void AcO(Timeline timeline, int i, long j) {
        C6447E6a.A00(this.A0Y, new E7J(timeline, i, j), 3);
    }

    @Override // X.InterfaceC6323E0y
    public final void AcX(C6322E0x c6322E0x) {
        if (!this.A0T && BV7.A1V(this.A0s)) {
            C6447E6a.A00(this.A0Y, c6322E0x, 14);
        } else {
            CNC.A04("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            c6322E0x.A03(false);
        }
    }

    @Override // X.E6A
    public final void Acp(DrN drN, boolean z) {
        C6447E6a.A02(this.A0Y, 31, drN, z ? 1 : 0, 0);
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/List<LX/E5j;>;IJLX/E5p;)V */
    @Override // X.E6A
    public final void Adj(InterfaceC6437E5p interfaceC6437E5p, List list, int i, long j) {
        C6447E6a.A00(this.A0Y, new C6457E6q(interfaceC6437E5p, list, i, j), 17);
    }

    @Override // X.E6A
    public final void Ae0(boolean z, int i, int i2) {
        this.A0Y.ARc(1, z ? 1 : 0, i | (i2 << 4)).A03();
    }

    @Override // X.E6A
    public final void Ae1(C6233Dyb c6233Dyb) {
        C6447E6a.A00(this.A0Y, c6233Dyb, 4);
    }

    @Override // X.E6A
    public final void AeN(int i) {
        this.A0Y.ARc(11, i, 0).A03();
    }

    @Override // X.E6A
    public final void Aea(boolean z) {
        C6447E6a.A00(this.A0Y, Boolean.valueOf(z), 36);
    }

    @Override // X.E6A
    public final void Aeb(C5725DoK c5725DoK) {
        C6447E6a.A00(this.A0Y, c5725DoK, 38);
    }

    @Override // X.E6A
    public final void Aec(DpX dpX) {
        C6447E6a.A00(this.A0Y, dpX, 5);
    }

    @Override // X.E6A
    public final boolean AfC(Object obj, long j) {
        if (this.A0T || !BV7.A1V(this.A0s)) {
            return true;
        }
        C5778DpK c5778DpK = new C5778DpK(this.A0X);
        C6447E6a.A00(this.A0Y, BV4.A0A(obj, c5778DpK), 30);
        if (j != -9223372036854775807L) {
            return c5778DpK.A03(j);
        }
        return true;
    }

    @Override // X.E6A
    public final void AfF(float f) {
        C6447E6a.A00(this.A0Y, Float.valueOf(f), 32);
    }

    @Override // X.E7V
    public final void AfG() {
        BV6.A1B(this.A0Y, 34);
    }

    /* JADX WARN: Code restructure failed: missing block: B:616:0x0bf2, code lost:
    
        if (r23 == false) goto L617;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 0, insn: 0x0d08: IGET (r3 I:X.E5t) = (r0 I:X.E5s) (LINE:3336) X.E5s.A0d X.E5t, block:B:695:0x0d08 */
    /* JADX WARN: Not initialized variable reg: 0, insn: 0x0d24: IGET (r8 I:X.E5t) = (r0 I:X.E5s) (LINE:3364) X.E5s.A0d X.E5t, block:B:704:0x0d22 */
    /* JADX WARN: Not initialized variable reg: 0, insn: 0x0d87: IGET (r3 I:androidx.media3.exoplayer.ExoPlaybackException) = (r0 I:X.E5s) (LINE:3463) X.E5s.A0A androidx.media3.exoplayer.ExoPlaybackException, block:B:731:0x0d87 */
    /* JADX WARN: Not initialized variable reg: 0, insn: 0x0e18: INVOKE (r0 I:X.E5s), (r2 I:boolean), (r1 I:boolean) DIRECT call: X.E5s.A0b(boolean, boolean):void A[MD:(boolean, boolean):void (m)] (LINE:3608), block:B:761:0x0e11 */
    /* JADX WARN: Not initialized variable reg: 0, insn: 0x0e25: IGET (r3 I:X.E5t) = (r0 I:X.E5s) (LINE:3621) X.E5s.A0d X.E5t, block:B:764:0x0e1f */
    /* JADX WARN: Not initialized variable reg: 0, insn: 0x0e3d: IGET (r1 I:X.E60) = (r0 I:X.E5s) (LINE:3645) X.E5s.A0F X.E60, block:B:768:0x0e3d */
    /* JADX WARN: Removed duplicated region for block: B:130:0x034a A[Catch: IOException -> 0x0cd6, ParserException -> 0x0cdb, DrmSession$DrmSessionException -> 0x0cf8, DataSourceException -> 0x0cfc, ExoPlaybackException -> 0x0d03, RuntimeException -> 0x0e00, BehindLiveWindowException -> 0x0e1c, TryCatch #4 {ParserException -> 0x0cdb, DataSourceException -> 0x0cfc, ExoPlaybackException -> 0x0d03, DrmSession$DrmSessionException -> 0x0cf8, BehindLiveWindowException -> 0x0e1c, IOException -> 0x0cd6, RuntimeException -> 0x0e00, blocks: (B:3:0x000a, B:4:0x0010, B:6:0x0014, B:8:0x001a, B:9:0x0022, B:11:0x002a, B:13:0x0037, B:14:0x003d, B:16:0x0046, B:18:0x004c, B:20:0x0052, B:21:0x0054, B:23:0x005f, B:25:0x0065, B:15:0x0040, B:26:0x0068, B:28:0x0072, B:30:0x007d, B:32:0x0085, B:33:0x0088, B:34:0x008b, B:35:0x0092, B:36:0x00a1, B:37:0x00ae, B:39:0x00b8, B:42:0x00c2, B:43:0x00d2, B:45:0x00e2, B:47:0x00ed, B:51:0x00fa, B:50:0x00f5, B:52:0x00fd, B:53:0x0100, B:58:0x0111, B:56:0x010a, B:59:0x0116, B:62:0x0135, B:63:0x0156, B:65:0x0168, B:66:0x0171, B:67:0x0189, B:68:0x0191, B:70:0x0197, B:72:0x01a0, B:126:0x033e, B:127:0x0341, B:75:0x01aa, B:76:0x01b5, B:77:0x01c9, B:80:0x01dc, B:83:0x01e6, B:84:0x01f7, B:651:0x0c87, B:85:0x0204, B:87:0x0214, B:88:0x021a, B:89:0x0227, B:91:0x0235, B:92:0x0247, B:93:0x0263, B:94:0x026e, B:96:0x027a, B:97:0x0286, B:98:0x0299, B:100:0x02a8, B:101:0x02ad, B:103:0x02bb, B:104:0x02c7, B:106:0x02db, B:107:0x02e5, B:108:0x02ea, B:110:0x02f0, B:112:0x02f8, B:114:0x02fc, B:116:0x0302, B:118:0x030c, B:119:0x0311, B:121:0x0317, B:128:0x0346, B:130:0x034a, B:124:0x032a, B:131:0x034e, B:132:0x0353, B:134:0x035d, B:136:0x0361, B:138:0x0365, B:139:0x0374, B:141:0x0383, B:158:0x03fe, B:143:0x03b5, B:145:0x03bd, B:147:0x03c9, B:149:0x03e3, B:163:0x040b, B:165:0x0412, B:167:0x0416, B:169:0x041a, B:171:0x0422, B:173:0x0428, B:174:0x042b, B:176:0x0431, B:178:0x0435, B:179:0x0442, B:184:0x045b, B:189:0x0471, B:191:0x047f, B:152:0x03e8, B:153:0x03eb, B:155:0x03f5, B:157:0x03f9, B:159:0x0403, B:161:0x0407, B:192:0x0489, B:208:0x04d4, B:211:0x04e7, B:212:0x04fa, B:213:0x04ff, B:214:0x0507, B:215:0x0522, B:216:0x052b, B:218:0x0546, B:220:0x054c, B:222:0x0557, B:224:0x055d, B:226:0x0563, B:228:0x0572, B:269:0x065a, B:271:0x065e, B:272:0x0669, B:274:0x066d, B:276:0x0671, B:278:0x0675, B:280:0x067b, B:282:0x067f, B:284:0x0683, B:286:0x0687, B:288:0x068b, B:295:0x06af, B:296:0x06b2, B:298:0x06b7, B:300:0x06c1, B:302:0x06c7, B:304:0x06cf, B:312:0x06f8, B:307:0x06e8, B:309:0x06ec, B:313:0x0705, B:314:0x0708, B:316:0x070e, B:318:0x071c, B:319:0x0725, B:321:0x0729, B:323:0x0733, B:325:0x0737, B:328:0x073c, B:330:0x0741, B:332:0x074b, B:334:0x0753, B:354:0x079f, B:356:0x07a5, B:372:0x07ec, B:374:0x07f0, B:377:0x07fb, B:379:0x0803, B:380:0x0805, B:382:0x0832, B:384:0x0836, B:388:0x0846, B:390:0x084a, B:400:0x0873, B:398:0x086f, B:402:0x087d, B:393:0x0850, B:395:0x0862, B:397:0x086a, B:407:0x088c, B:409:0x089a, B:413:0x08a4, B:414:0x08a7, B:416:0x08ab, B:418:0x08b5, B:420:0x08ba, B:421:0x08bd, B:422:0x08c0, B:424:0x08c6, B:386:0x083c, B:426:0x08d3, B:428:0x08f1, B:431:0x08f8, B:434:0x0907, B:436:0x090c, B:438:0x0912, B:440:0x091d, B:442:0x0923, B:445:0x092b, B:447:0x0931, B:448:0x0936, B:433:0x0904, B:335:0x0756, B:337:0x075c, B:339:0x0760, B:341:0x0765, B:343:0x076d, B:345:0x077a, B:351:0x078f, B:352:0x0792, B:353:0x079c, B:358:0x07a9, B:360:0x07ad, B:362:0x07b1, B:364:0x07b5, B:365:0x07ba, B:367:0x07bf, B:370:0x07d6, B:451:0x093d, B:453:0x0947, B:455:0x094f, B:456:0x095e, B:457:0x0961, B:459:0x0966, B:461:0x096c, B:463:0x0970, B:465:0x0974, B:467:0x0978, B:469:0x0982, B:472:0x0988, B:473:0x098b, B:475:0x09a6, B:477:0x09af, B:479:0x09b7, B:482:0x09bf, B:484:0x09e7, B:486:0x09eb, B:488:0x09f1, B:499:0x0a09, B:501:0x0a18, B:504:0x0a22, B:505:0x0a24, B:500:0x0a11, B:506:0x0a27, B:508:0x0a2e, B:289:0x0696, B:230:0x0578, B:232:0x057e, B:235:0x059d, B:241:0x05b3, B:243:0x05bb, B:252:0x05f1, B:247:0x05d6, B:249:0x05de, B:251:0x05e8, B:256:0x061f, B:257:0x0623, B:259:0x0627, B:261:0x062b, B:262:0x0633, B:264:0x0645, B:265:0x064e, B:267:0x0652, B:268:0x0657, B:290:0x069a, B:292:0x069e, B:293:0x06a6, B:255:0x05f7, B:238:0x05a2, B:233:0x0595, B:510:0x0a34, B:514:0x0a3e, B:516:0x0a44, B:517:0x0a4b, B:519:0x0a57, B:520:0x0a6f, B:522:0x0a74, B:524:0x0a7c, B:561:0x0af5, B:525:0x0a80, B:527:0x0a90, B:528:0x0a93, B:530:0x0a97, B:532:0x0aa1, B:534:0x0aa6, B:536:0x0ab0, B:539:0x0ab8, B:541:0x0ac2, B:545:0x0acb, B:547:0x0ad1, B:549:0x0ad7, B:551:0x0add, B:554:0x0ae5, B:560:0x0af2, B:563:0x0b01, B:565:0x0b0c, B:569:0x0b14, B:571:0x0b1c, B:573:0x0b21, B:577:0x0b35, B:579:0x0b3b, B:625:0x0c17, B:629:0x0c37, B:632:0x0c40, B:634:0x0c45, B:636:0x0c4d, B:637:0x0c50, B:638:0x0c53, B:640:0x0c59, B:642:0x0c62, B:644:0x0c6a, B:646:0x0c70, B:648:0x0c7a, B:650:0x0c81, B:653:0x0c8a, B:655:0x0c90, B:658:0x0c98, B:660:0x0c9e, B:661:0x0ca4, B:667:0x0cb2, B:669:0x0cb6, B:670:0x0cbb, B:652:0x0c88, B:580:0x0b42, B:582:0x0b4a, B:584:0x0b4e, B:626:0x0c1b, B:628:0x0c27, B:587:0x0b57, B:589:0x0b5b, B:591:0x0b69, B:592:0x0b6f, B:594:0x0b77, B:599:0x0b86, B:601:0x0b93, B:606:0x0b9c, B:609:0x0be1, B:611:0x0be7, B:613:0x0beb, B:617:0x0bf4, B:621:0x0c03, B:622:0x0c07, B:624:0x0c12, B:562:0x0af9, B:671:0x0cc0, B:673:0x0cc6), top: B:774:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0422 A[Catch: IOException -> 0x0cd6, ParserException -> 0x0cdb, DrmSession$DrmSessionException -> 0x0cf8, DataSourceException -> 0x0cfc, ExoPlaybackException -> 0x0d03, RuntimeException -> 0x0e00, BehindLiveWindowException -> 0x0e1c, TryCatch #4 {ParserException -> 0x0cdb, DataSourceException -> 0x0cfc, ExoPlaybackException -> 0x0d03, DrmSession$DrmSessionException -> 0x0cf8, BehindLiveWindowException -> 0x0e1c, IOException -> 0x0cd6, RuntimeException -> 0x0e00, blocks: (B:3:0x000a, B:4:0x0010, B:6:0x0014, B:8:0x001a, B:9:0x0022, B:11:0x002a, B:13:0x0037, B:14:0x003d, B:16:0x0046, B:18:0x004c, B:20:0x0052, B:21:0x0054, B:23:0x005f, B:25:0x0065, B:15:0x0040, B:26:0x0068, B:28:0x0072, B:30:0x007d, B:32:0x0085, B:33:0x0088, B:34:0x008b, B:35:0x0092, B:36:0x00a1, B:37:0x00ae, B:39:0x00b8, B:42:0x00c2, B:43:0x00d2, B:45:0x00e2, B:47:0x00ed, B:51:0x00fa, B:50:0x00f5, B:52:0x00fd, B:53:0x0100, B:58:0x0111, B:56:0x010a, B:59:0x0116, B:62:0x0135, B:63:0x0156, B:65:0x0168, B:66:0x0171, B:67:0x0189, B:68:0x0191, B:70:0x0197, B:72:0x01a0, B:126:0x033e, B:127:0x0341, B:75:0x01aa, B:76:0x01b5, B:77:0x01c9, B:80:0x01dc, B:83:0x01e6, B:84:0x01f7, B:651:0x0c87, B:85:0x0204, B:87:0x0214, B:88:0x021a, B:89:0x0227, B:91:0x0235, B:92:0x0247, B:93:0x0263, B:94:0x026e, B:96:0x027a, B:97:0x0286, B:98:0x0299, B:100:0x02a8, B:101:0x02ad, B:103:0x02bb, B:104:0x02c7, B:106:0x02db, B:107:0x02e5, B:108:0x02ea, B:110:0x02f0, B:112:0x02f8, B:114:0x02fc, B:116:0x0302, B:118:0x030c, B:119:0x0311, B:121:0x0317, B:128:0x0346, B:130:0x034a, B:124:0x032a, B:131:0x034e, B:132:0x0353, B:134:0x035d, B:136:0x0361, B:138:0x0365, B:139:0x0374, B:141:0x0383, B:158:0x03fe, B:143:0x03b5, B:145:0x03bd, B:147:0x03c9, B:149:0x03e3, B:163:0x040b, B:165:0x0412, B:167:0x0416, B:169:0x041a, B:171:0x0422, B:173:0x0428, B:174:0x042b, B:176:0x0431, B:178:0x0435, B:179:0x0442, B:184:0x045b, B:189:0x0471, B:191:0x047f, B:152:0x03e8, B:153:0x03eb, B:155:0x03f5, B:157:0x03f9, B:159:0x0403, B:161:0x0407, B:192:0x0489, B:208:0x04d4, B:211:0x04e7, B:212:0x04fa, B:213:0x04ff, B:214:0x0507, B:215:0x0522, B:216:0x052b, B:218:0x0546, B:220:0x054c, B:222:0x0557, B:224:0x055d, B:226:0x0563, B:228:0x0572, B:269:0x065a, B:271:0x065e, B:272:0x0669, B:274:0x066d, B:276:0x0671, B:278:0x0675, B:280:0x067b, B:282:0x067f, B:284:0x0683, B:286:0x0687, B:288:0x068b, B:295:0x06af, B:296:0x06b2, B:298:0x06b7, B:300:0x06c1, B:302:0x06c7, B:304:0x06cf, B:312:0x06f8, B:307:0x06e8, B:309:0x06ec, B:313:0x0705, B:314:0x0708, B:316:0x070e, B:318:0x071c, B:319:0x0725, B:321:0x0729, B:323:0x0733, B:325:0x0737, B:328:0x073c, B:330:0x0741, B:332:0x074b, B:334:0x0753, B:354:0x079f, B:356:0x07a5, B:372:0x07ec, B:374:0x07f0, B:377:0x07fb, B:379:0x0803, B:380:0x0805, B:382:0x0832, B:384:0x0836, B:388:0x0846, B:390:0x084a, B:400:0x0873, B:398:0x086f, B:402:0x087d, B:393:0x0850, B:395:0x0862, B:397:0x086a, B:407:0x088c, B:409:0x089a, B:413:0x08a4, B:414:0x08a7, B:416:0x08ab, B:418:0x08b5, B:420:0x08ba, B:421:0x08bd, B:422:0x08c0, B:424:0x08c6, B:386:0x083c, B:426:0x08d3, B:428:0x08f1, B:431:0x08f8, B:434:0x0907, B:436:0x090c, B:438:0x0912, B:440:0x091d, B:442:0x0923, B:445:0x092b, B:447:0x0931, B:448:0x0936, B:433:0x0904, B:335:0x0756, B:337:0x075c, B:339:0x0760, B:341:0x0765, B:343:0x076d, B:345:0x077a, B:351:0x078f, B:352:0x0792, B:353:0x079c, B:358:0x07a9, B:360:0x07ad, B:362:0x07b1, B:364:0x07b5, B:365:0x07ba, B:367:0x07bf, B:370:0x07d6, B:451:0x093d, B:453:0x0947, B:455:0x094f, B:456:0x095e, B:457:0x0961, B:459:0x0966, B:461:0x096c, B:463:0x0970, B:465:0x0974, B:467:0x0978, B:469:0x0982, B:472:0x0988, B:473:0x098b, B:475:0x09a6, B:477:0x09af, B:479:0x09b7, B:482:0x09bf, B:484:0x09e7, B:486:0x09eb, B:488:0x09f1, B:499:0x0a09, B:501:0x0a18, B:504:0x0a22, B:505:0x0a24, B:500:0x0a11, B:506:0x0a27, B:508:0x0a2e, B:289:0x0696, B:230:0x0578, B:232:0x057e, B:235:0x059d, B:241:0x05b3, B:243:0x05bb, B:252:0x05f1, B:247:0x05d6, B:249:0x05de, B:251:0x05e8, B:256:0x061f, B:257:0x0623, B:259:0x0627, B:261:0x062b, B:262:0x0633, B:264:0x0645, B:265:0x064e, B:267:0x0652, B:268:0x0657, B:290:0x069a, B:292:0x069e, B:293:0x06a6, B:255:0x05f7, B:238:0x05a2, B:233:0x0595, B:510:0x0a34, B:514:0x0a3e, B:516:0x0a44, B:517:0x0a4b, B:519:0x0a57, B:520:0x0a6f, B:522:0x0a74, B:524:0x0a7c, B:561:0x0af5, B:525:0x0a80, B:527:0x0a90, B:528:0x0a93, B:530:0x0a97, B:532:0x0aa1, B:534:0x0aa6, B:536:0x0ab0, B:539:0x0ab8, B:541:0x0ac2, B:545:0x0acb, B:547:0x0ad1, B:549:0x0ad7, B:551:0x0add, B:554:0x0ae5, B:560:0x0af2, B:563:0x0b01, B:565:0x0b0c, B:569:0x0b14, B:571:0x0b1c, B:573:0x0b21, B:577:0x0b35, B:579:0x0b3b, B:625:0x0c17, B:629:0x0c37, B:632:0x0c40, B:634:0x0c45, B:636:0x0c4d, B:637:0x0c50, B:638:0x0c53, B:640:0x0c59, B:642:0x0c62, B:644:0x0c6a, B:646:0x0c70, B:648:0x0c7a, B:650:0x0c81, B:653:0x0c8a, B:655:0x0c90, B:658:0x0c98, B:660:0x0c9e, B:661:0x0ca4, B:667:0x0cb2, B:669:0x0cb6, B:670:0x0cbb, B:652:0x0c88, B:580:0x0b42, B:582:0x0b4a, B:584:0x0b4e, B:626:0x0c1b, B:628:0x0c27, B:587:0x0b57, B:589:0x0b5b, B:591:0x0b69, B:592:0x0b6f, B:594:0x0b77, B:599:0x0b86, B:601:0x0b93, B:606:0x0b9c, B:609:0x0be1, B:611:0x0be7, B:613:0x0beb, B:617:0x0bf4, B:621:0x0c03, B:622:0x0c07, B:624:0x0c12, B:562:0x0af9, B:671:0x0cc0, B:673:0x0cc6), top: B:774:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c A[Catch: IOException -> 0x0cd6, ParserException -> 0x0cdb, DrmSession$DrmSessionException -> 0x0cf8, DataSourceException -> 0x0cfc, ExoPlaybackException -> 0x0d03, RuntimeException -> 0x0e00, BehindLiveWindowException -> 0x0e1c, TryCatch #4 {ParserException -> 0x0cdb, DataSourceException -> 0x0cfc, ExoPlaybackException -> 0x0d03, DrmSession$DrmSessionException -> 0x0cf8, BehindLiveWindowException -> 0x0e1c, IOException -> 0x0cd6, RuntimeException -> 0x0e00, blocks: (B:3:0x000a, B:4:0x0010, B:6:0x0014, B:8:0x001a, B:9:0x0022, B:11:0x002a, B:13:0x0037, B:14:0x003d, B:16:0x0046, B:18:0x004c, B:20:0x0052, B:21:0x0054, B:23:0x005f, B:25:0x0065, B:15:0x0040, B:26:0x0068, B:28:0x0072, B:30:0x007d, B:32:0x0085, B:33:0x0088, B:34:0x008b, B:35:0x0092, B:36:0x00a1, B:37:0x00ae, B:39:0x00b8, B:42:0x00c2, B:43:0x00d2, B:45:0x00e2, B:47:0x00ed, B:51:0x00fa, B:50:0x00f5, B:52:0x00fd, B:53:0x0100, B:58:0x0111, B:56:0x010a, B:59:0x0116, B:62:0x0135, B:63:0x0156, B:65:0x0168, B:66:0x0171, B:67:0x0189, B:68:0x0191, B:70:0x0197, B:72:0x01a0, B:126:0x033e, B:127:0x0341, B:75:0x01aa, B:76:0x01b5, B:77:0x01c9, B:80:0x01dc, B:83:0x01e6, B:84:0x01f7, B:651:0x0c87, B:85:0x0204, B:87:0x0214, B:88:0x021a, B:89:0x0227, B:91:0x0235, B:92:0x0247, B:93:0x0263, B:94:0x026e, B:96:0x027a, B:97:0x0286, B:98:0x0299, B:100:0x02a8, B:101:0x02ad, B:103:0x02bb, B:104:0x02c7, B:106:0x02db, B:107:0x02e5, B:108:0x02ea, B:110:0x02f0, B:112:0x02f8, B:114:0x02fc, B:116:0x0302, B:118:0x030c, B:119:0x0311, B:121:0x0317, B:128:0x0346, B:130:0x034a, B:124:0x032a, B:131:0x034e, B:132:0x0353, B:134:0x035d, B:136:0x0361, B:138:0x0365, B:139:0x0374, B:141:0x0383, B:158:0x03fe, B:143:0x03b5, B:145:0x03bd, B:147:0x03c9, B:149:0x03e3, B:163:0x040b, B:165:0x0412, B:167:0x0416, B:169:0x041a, B:171:0x0422, B:173:0x0428, B:174:0x042b, B:176:0x0431, B:178:0x0435, B:179:0x0442, B:184:0x045b, B:189:0x0471, B:191:0x047f, B:152:0x03e8, B:153:0x03eb, B:155:0x03f5, B:157:0x03f9, B:159:0x0403, B:161:0x0407, B:192:0x0489, B:208:0x04d4, B:211:0x04e7, B:212:0x04fa, B:213:0x04ff, B:214:0x0507, B:215:0x0522, B:216:0x052b, B:218:0x0546, B:220:0x054c, B:222:0x0557, B:224:0x055d, B:226:0x0563, B:228:0x0572, B:269:0x065a, B:271:0x065e, B:272:0x0669, B:274:0x066d, B:276:0x0671, B:278:0x0675, B:280:0x067b, B:282:0x067f, B:284:0x0683, B:286:0x0687, B:288:0x068b, B:295:0x06af, B:296:0x06b2, B:298:0x06b7, B:300:0x06c1, B:302:0x06c7, B:304:0x06cf, B:312:0x06f8, B:307:0x06e8, B:309:0x06ec, B:313:0x0705, B:314:0x0708, B:316:0x070e, B:318:0x071c, B:319:0x0725, B:321:0x0729, B:323:0x0733, B:325:0x0737, B:328:0x073c, B:330:0x0741, B:332:0x074b, B:334:0x0753, B:354:0x079f, B:356:0x07a5, B:372:0x07ec, B:374:0x07f0, B:377:0x07fb, B:379:0x0803, B:380:0x0805, B:382:0x0832, B:384:0x0836, B:388:0x0846, B:390:0x084a, B:400:0x0873, B:398:0x086f, B:402:0x087d, B:393:0x0850, B:395:0x0862, B:397:0x086a, B:407:0x088c, B:409:0x089a, B:413:0x08a4, B:414:0x08a7, B:416:0x08ab, B:418:0x08b5, B:420:0x08ba, B:421:0x08bd, B:422:0x08c0, B:424:0x08c6, B:386:0x083c, B:426:0x08d3, B:428:0x08f1, B:431:0x08f8, B:434:0x0907, B:436:0x090c, B:438:0x0912, B:440:0x091d, B:442:0x0923, B:445:0x092b, B:447:0x0931, B:448:0x0936, B:433:0x0904, B:335:0x0756, B:337:0x075c, B:339:0x0760, B:341:0x0765, B:343:0x076d, B:345:0x077a, B:351:0x078f, B:352:0x0792, B:353:0x079c, B:358:0x07a9, B:360:0x07ad, B:362:0x07b1, B:364:0x07b5, B:365:0x07ba, B:367:0x07bf, B:370:0x07d6, B:451:0x093d, B:453:0x0947, B:455:0x094f, B:456:0x095e, B:457:0x0961, B:459:0x0966, B:461:0x096c, B:463:0x0970, B:465:0x0974, B:467:0x0978, B:469:0x0982, B:472:0x0988, B:473:0x098b, B:475:0x09a6, B:477:0x09af, B:479:0x09b7, B:482:0x09bf, B:484:0x09e7, B:486:0x09eb, B:488:0x09f1, B:499:0x0a09, B:501:0x0a18, B:504:0x0a22, B:505:0x0a24, B:500:0x0a11, B:506:0x0a27, B:508:0x0a2e, B:289:0x0696, B:230:0x0578, B:232:0x057e, B:235:0x059d, B:241:0x05b3, B:243:0x05bb, B:252:0x05f1, B:247:0x05d6, B:249:0x05de, B:251:0x05e8, B:256:0x061f, B:257:0x0623, B:259:0x0627, B:261:0x062b, B:262:0x0633, B:264:0x0645, B:265:0x064e, B:267:0x0652, B:268:0x0657, B:290:0x069a, B:292:0x069e, B:293:0x06a6, B:255:0x05f7, B:238:0x05a2, B:233:0x0595, B:510:0x0a34, B:514:0x0a3e, B:516:0x0a44, B:517:0x0a4b, B:519:0x0a57, B:520:0x0a6f, B:522:0x0a74, B:524:0x0a7c, B:561:0x0af5, B:525:0x0a80, B:527:0x0a90, B:528:0x0a93, B:530:0x0a97, B:532:0x0aa1, B:534:0x0aa6, B:536:0x0ab0, B:539:0x0ab8, B:541:0x0ac2, B:545:0x0acb, B:547:0x0ad1, B:549:0x0ad7, B:551:0x0add, B:554:0x0ae5, B:560:0x0af2, B:563:0x0b01, B:565:0x0b0c, B:569:0x0b14, B:571:0x0b1c, B:573:0x0b21, B:577:0x0b35, B:579:0x0b3b, B:625:0x0c17, B:629:0x0c37, B:632:0x0c40, B:634:0x0c45, B:636:0x0c4d, B:637:0x0c50, B:638:0x0c53, B:640:0x0c59, B:642:0x0c62, B:644:0x0c6a, B:646:0x0c70, B:648:0x0c7a, B:650:0x0c81, B:653:0x0c8a, B:655:0x0c90, B:658:0x0c98, B:660:0x0c9e, B:661:0x0ca4, B:667:0x0cb2, B:669:0x0cb6, B:670:0x0cbb, B:652:0x0c88, B:580:0x0b42, B:582:0x0b4a, B:584:0x0b4e, B:626:0x0c1b, B:628:0x0c27, B:587:0x0b57, B:589:0x0b5b, B:591:0x0b69, B:592:0x0b6f, B:594:0x0b77, B:599:0x0b86, B:601:0x0b93, B:606:0x0b9c, B:609:0x0be1, B:611:0x0be7, B:613:0x0beb, B:617:0x0bf4, B:621:0x0c03, B:622:0x0c07, B:624:0x0c12, B:562:0x0af9, B:671:0x0cc0, B:673:0x0cc6), top: B:774:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0578 A[Catch: IOException -> 0x0cd6, ParserException -> 0x0cdb, DrmSession$DrmSessionException -> 0x0cf8, DataSourceException -> 0x0cfc, ExoPlaybackException -> 0x0d03, RuntimeException -> 0x0e00, BehindLiveWindowException -> 0x0e1c, PHI: r5
  0x0578: PHI (r5v81 X.E5v) = (r5v80 X.E5v), (r5v124 X.E5v) binds: [B:221:0x0555, B:229:0x0576] A[DONT_GENERATE, DONT_INLINE], TryCatch #4 {ParserException -> 0x0cdb, DataSourceException -> 0x0cfc, ExoPlaybackException -> 0x0d03, DrmSession$DrmSessionException -> 0x0cf8, BehindLiveWindowException -> 0x0e1c, IOException -> 0x0cd6, RuntimeException -> 0x0e00, blocks: (B:3:0x000a, B:4:0x0010, B:6:0x0014, B:8:0x001a, B:9:0x0022, B:11:0x002a, B:13:0x0037, B:14:0x003d, B:16:0x0046, B:18:0x004c, B:20:0x0052, B:21:0x0054, B:23:0x005f, B:25:0x0065, B:15:0x0040, B:26:0x0068, B:28:0x0072, B:30:0x007d, B:32:0x0085, B:33:0x0088, B:34:0x008b, B:35:0x0092, B:36:0x00a1, B:37:0x00ae, B:39:0x00b8, B:42:0x00c2, B:43:0x00d2, B:45:0x00e2, B:47:0x00ed, B:51:0x00fa, B:50:0x00f5, B:52:0x00fd, B:53:0x0100, B:58:0x0111, B:56:0x010a, B:59:0x0116, B:62:0x0135, B:63:0x0156, B:65:0x0168, B:66:0x0171, B:67:0x0189, B:68:0x0191, B:70:0x0197, B:72:0x01a0, B:126:0x033e, B:127:0x0341, B:75:0x01aa, B:76:0x01b5, B:77:0x01c9, B:80:0x01dc, B:83:0x01e6, B:84:0x01f7, B:651:0x0c87, B:85:0x0204, B:87:0x0214, B:88:0x021a, B:89:0x0227, B:91:0x0235, B:92:0x0247, B:93:0x0263, B:94:0x026e, B:96:0x027a, B:97:0x0286, B:98:0x0299, B:100:0x02a8, B:101:0x02ad, B:103:0x02bb, B:104:0x02c7, B:106:0x02db, B:107:0x02e5, B:108:0x02ea, B:110:0x02f0, B:112:0x02f8, B:114:0x02fc, B:116:0x0302, B:118:0x030c, B:119:0x0311, B:121:0x0317, B:128:0x0346, B:130:0x034a, B:124:0x032a, B:131:0x034e, B:132:0x0353, B:134:0x035d, B:136:0x0361, B:138:0x0365, B:139:0x0374, B:141:0x0383, B:158:0x03fe, B:143:0x03b5, B:145:0x03bd, B:147:0x03c9, B:149:0x03e3, B:163:0x040b, B:165:0x0412, B:167:0x0416, B:169:0x041a, B:171:0x0422, B:173:0x0428, B:174:0x042b, B:176:0x0431, B:178:0x0435, B:179:0x0442, B:184:0x045b, B:189:0x0471, B:191:0x047f, B:152:0x03e8, B:153:0x03eb, B:155:0x03f5, B:157:0x03f9, B:159:0x0403, B:161:0x0407, B:192:0x0489, B:208:0x04d4, B:211:0x04e7, B:212:0x04fa, B:213:0x04ff, B:214:0x0507, B:215:0x0522, B:216:0x052b, B:218:0x0546, B:220:0x054c, B:222:0x0557, B:224:0x055d, B:226:0x0563, B:228:0x0572, B:269:0x065a, B:271:0x065e, B:272:0x0669, B:274:0x066d, B:276:0x0671, B:278:0x0675, B:280:0x067b, B:282:0x067f, B:284:0x0683, B:286:0x0687, B:288:0x068b, B:295:0x06af, B:296:0x06b2, B:298:0x06b7, B:300:0x06c1, B:302:0x06c7, B:304:0x06cf, B:312:0x06f8, B:307:0x06e8, B:309:0x06ec, B:313:0x0705, B:314:0x0708, B:316:0x070e, B:318:0x071c, B:319:0x0725, B:321:0x0729, B:323:0x0733, B:325:0x0737, B:328:0x073c, B:330:0x0741, B:332:0x074b, B:334:0x0753, B:354:0x079f, B:356:0x07a5, B:372:0x07ec, B:374:0x07f0, B:377:0x07fb, B:379:0x0803, B:380:0x0805, B:382:0x0832, B:384:0x0836, B:388:0x0846, B:390:0x084a, B:400:0x0873, B:398:0x086f, B:402:0x087d, B:393:0x0850, B:395:0x0862, B:397:0x086a, B:407:0x088c, B:409:0x089a, B:413:0x08a4, B:414:0x08a7, B:416:0x08ab, B:418:0x08b5, B:420:0x08ba, B:421:0x08bd, B:422:0x08c0, B:424:0x08c6, B:386:0x083c, B:426:0x08d3, B:428:0x08f1, B:431:0x08f8, B:434:0x0907, B:436:0x090c, B:438:0x0912, B:440:0x091d, B:442:0x0923, B:445:0x092b, B:447:0x0931, B:448:0x0936, B:433:0x0904, B:335:0x0756, B:337:0x075c, B:339:0x0760, B:341:0x0765, B:343:0x076d, B:345:0x077a, B:351:0x078f, B:352:0x0792, B:353:0x079c, B:358:0x07a9, B:360:0x07ad, B:362:0x07b1, B:364:0x07b5, B:365:0x07ba, B:367:0x07bf, B:370:0x07d6, B:451:0x093d, B:453:0x0947, B:455:0x094f, B:456:0x095e, B:457:0x0961, B:459:0x0966, B:461:0x096c, B:463:0x0970, B:465:0x0974, B:467:0x0978, B:469:0x0982, B:472:0x0988, B:473:0x098b, B:475:0x09a6, B:477:0x09af, B:479:0x09b7, B:482:0x09bf, B:484:0x09e7, B:486:0x09eb, B:488:0x09f1, B:499:0x0a09, B:501:0x0a18, B:504:0x0a22, B:505:0x0a24, B:500:0x0a11, B:506:0x0a27, B:508:0x0a2e, B:289:0x0696, B:230:0x0578, B:232:0x057e, B:235:0x059d, B:241:0x05b3, B:243:0x05bb, B:252:0x05f1, B:247:0x05d6, B:249:0x05de, B:251:0x05e8, B:256:0x061f, B:257:0x0623, B:259:0x0627, B:261:0x062b, B:262:0x0633, B:264:0x0645, B:265:0x064e, B:267:0x0652, B:268:0x0657, B:290:0x069a, B:292:0x069e, B:293:0x06a6, B:255:0x05f7, B:238:0x05a2, B:233:0x0595, B:510:0x0a34, B:514:0x0a3e, B:516:0x0a44, B:517:0x0a4b, B:519:0x0a57, B:520:0x0a6f, B:522:0x0a74, B:524:0x0a7c, B:561:0x0af5, B:525:0x0a80, B:527:0x0a90, B:528:0x0a93, B:530:0x0a97, B:532:0x0aa1, B:534:0x0aa6, B:536:0x0ab0, B:539:0x0ab8, B:541:0x0ac2, B:545:0x0acb, B:547:0x0ad1, B:549:0x0ad7, B:551:0x0add, B:554:0x0ae5, B:560:0x0af2, B:563:0x0b01, B:565:0x0b0c, B:569:0x0b14, B:571:0x0b1c, B:573:0x0b21, B:577:0x0b35, B:579:0x0b3b, B:625:0x0c17, B:629:0x0c37, B:632:0x0c40, B:634:0x0c45, B:636:0x0c4d, B:637:0x0c50, B:638:0x0c53, B:640:0x0c59, B:642:0x0c62, B:644:0x0c6a, B:646:0x0c70, B:648:0x0c7a, B:650:0x0c81, B:653:0x0c8a, B:655:0x0c90, B:658:0x0c98, B:660:0x0c9e, B:661:0x0ca4, B:667:0x0cb2, B:669:0x0cb6, B:670:0x0cbb, B:652:0x0c88, B:580:0x0b42, B:582:0x0b4a, B:584:0x0b4e, B:626:0x0c1b, B:628:0x0c27, B:587:0x0b57, B:589:0x0b5b, B:591:0x0b69, B:592:0x0b6f, B:594:0x0b77, B:599:0x0b86, B:601:0x0b93, B:606:0x0b9c, B:609:0x0be1, B:611:0x0be7, B:613:0x0beb, B:617:0x0bf4, B:621:0x0c03, B:622:0x0c07, B:624:0x0c12, B:562:0x0af9, B:671:0x0cc0, B:673:0x0cc6), top: B:774:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x065e A[Catch: IOException -> 0x0cd6, ParserException -> 0x0cdb, DrmSession$DrmSessionException -> 0x0cf8, DataSourceException -> 0x0cfc, ExoPlaybackException -> 0x0d03, RuntimeException -> 0x0e00, BehindLiveWindowException -> 0x0e1c, TryCatch #4 {ParserException -> 0x0cdb, DataSourceException -> 0x0cfc, ExoPlaybackException -> 0x0d03, DrmSession$DrmSessionException -> 0x0cf8, BehindLiveWindowException -> 0x0e1c, IOException -> 0x0cd6, RuntimeException -> 0x0e00, blocks: (B:3:0x000a, B:4:0x0010, B:6:0x0014, B:8:0x001a, B:9:0x0022, B:11:0x002a, B:13:0x0037, B:14:0x003d, B:16:0x0046, B:18:0x004c, B:20:0x0052, B:21:0x0054, B:23:0x005f, B:25:0x0065, B:15:0x0040, B:26:0x0068, B:28:0x0072, B:30:0x007d, B:32:0x0085, B:33:0x0088, B:34:0x008b, B:35:0x0092, B:36:0x00a1, B:37:0x00ae, B:39:0x00b8, B:42:0x00c2, B:43:0x00d2, B:45:0x00e2, B:47:0x00ed, B:51:0x00fa, B:50:0x00f5, B:52:0x00fd, B:53:0x0100, B:58:0x0111, B:56:0x010a, B:59:0x0116, B:62:0x0135, B:63:0x0156, B:65:0x0168, B:66:0x0171, B:67:0x0189, B:68:0x0191, B:70:0x0197, B:72:0x01a0, B:126:0x033e, B:127:0x0341, B:75:0x01aa, B:76:0x01b5, B:77:0x01c9, B:80:0x01dc, B:83:0x01e6, B:84:0x01f7, B:651:0x0c87, B:85:0x0204, B:87:0x0214, B:88:0x021a, B:89:0x0227, B:91:0x0235, B:92:0x0247, B:93:0x0263, B:94:0x026e, B:96:0x027a, B:97:0x0286, B:98:0x0299, B:100:0x02a8, B:101:0x02ad, B:103:0x02bb, B:104:0x02c7, B:106:0x02db, B:107:0x02e5, B:108:0x02ea, B:110:0x02f0, B:112:0x02f8, B:114:0x02fc, B:116:0x0302, B:118:0x030c, B:119:0x0311, B:121:0x0317, B:128:0x0346, B:130:0x034a, B:124:0x032a, B:131:0x034e, B:132:0x0353, B:134:0x035d, B:136:0x0361, B:138:0x0365, B:139:0x0374, B:141:0x0383, B:158:0x03fe, B:143:0x03b5, B:145:0x03bd, B:147:0x03c9, B:149:0x03e3, B:163:0x040b, B:165:0x0412, B:167:0x0416, B:169:0x041a, B:171:0x0422, B:173:0x0428, B:174:0x042b, B:176:0x0431, B:178:0x0435, B:179:0x0442, B:184:0x045b, B:189:0x0471, B:191:0x047f, B:152:0x03e8, B:153:0x03eb, B:155:0x03f5, B:157:0x03f9, B:159:0x0403, B:161:0x0407, B:192:0x0489, B:208:0x04d4, B:211:0x04e7, B:212:0x04fa, B:213:0x04ff, B:214:0x0507, B:215:0x0522, B:216:0x052b, B:218:0x0546, B:220:0x054c, B:222:0x0557, B:224:0x055d, B:226:0x0563, B:228:0x0572, B:269:0x065a, B:271:0x065e, B:272:0x0669, B:274:0x066d, B:276:0x0671, B:278:0x0675, B:280:0x067b, B:282:0x067f, B:284:0x0683, B:286:0x0687, B:288:0x068b, B:295:0x06af, B:296:0x06b2, B:298:0x06b7, B:300:0x06c1, B:302:0x06c7, B:304:0x06cf, B:312:0x06f8, B:307:0x06e8, B:309:0x06ec, B:313:0x0705, B:314:0x0708, B:316:0x070e, B:318:0x071c, B:319:0x0725, B:321:0x0729, B:323:0x0733, B:325:0x0737, B:328:0x073c, B:330:0x0741, B:332:0x074b, B:334:0x0753, B:354:0x079f, B:356:0x07a5, B:372:0x07ec, B:374:0x07f0, B:377:0x07fb, B:379:0x0803, B:380:0x0805, B:382:0x0832, B:384:0x0836, B:388:0x0846, B:390:0x084a, B:400:0x0873, B:398:0x086f, B:402:0x087d, B:393:0x0850, B:395:0x0862, B:397:0x086a, B:407:0x088c, B:409:0x089a, B:413:0x08a4, B:414:0x08a7, B:416:0x08ab, B:418:0x08b5, B:420:0x08ba, B:421:0x08bd, B:422:0x08c0, B:424:0x08c6, B:386:0x083c, B:426:0x08d3, B:428:0x08f1, B:431:0x08f8, B:434:0x0907, B:436:0x090c, B:438:0x0912, B:440:0x091d, B:442:0x0923, B:445:0x092b, B:447:0x0931, B:448:0x0936, B:433:0x0904, B:335:0x0756, B:337:0x075c, B:339:0x0760, B:341:0x0765, B:343:0x076d, B:345:0x077a, B:351:0x078f, B:352:0x0792, B:353:0x079c, B:358:0x07a9, B:360:0x07ad, B:362:0x07b1, B:364:0x07b5, B:365:0x07ba, B:367:0x07bf, B:370:0x07d6, B:451:0x093d, B:453:0x0947, B:455:0x094f, B:456:0x095e, B:457:0x0961, B:459:0x0966, B:461:0x096c, B:463:0x0970, B:465:0x0974, B:467:0x0978, B:469:0x0982, B:472:0x0988, B:473:0x098b, B:475:0x09a6, B:477:0x09af, B:479:0x09b7, B:482:0x09bf, B:484:0x09e7, B:486:0x09eb, B:488:0x09f1, B:499:0x0a09, B:501:0x0a18, B:504:0x0a22, B:505:0x0a24, B:500:0x0a11, B:506:0x0a27, B:508:0x0a2e, B:289:0x0696, B:230:0x0578, B:232:0x057e, B:235:0x059d, B:241:0x05b3, B:243:0x05bb, B:252:0x05f1, B:247:0x05d6, B:249:0x05de, B:251:0x05e8, B:256:0x061f, B:257:0x0623, B:259:0x0627, B:261:0x062b, B:262:0x0633, B:264:0x0645, B:265:0x064e, B:267:0x0652, B:268:0x0657, B:290:0x069a, B:292:0x069e, B:293:0x06a6, B:255:0x05f7, B:238:0x05a2, B:233:0x0595, B:510:0x0a34, B:514:0x0a3e, B:516:0x0a44, B:517:0x0a4b, B:519:0x0a57, B:520:0x0a6f, B:522:0x0a74, B:524:0x0a7c, B:561:0x0af5, B:525:0x0a80, B:527:0x0a90, B:528:0x0a93, B:530:0x0a97, B:532:0x0aa1, B:534:0x0aa6, B:536:0x0ab0, B:539:0x0ab8, B:541:0x0ac2, B:545:0x0acb, B:547:0x0ad1, B:549:0x0ad7, B:551:0x0add, B:554:0x0ae5, B:560:0x0af2, B:563:0x0b01, B:565:0x0b0c, B:569:0x0b14, B:571:0x0b1c, B:573:0x0b21, B:577:0x0b35, B:579:0x0b3b, B:625:0x0c17, B:629:0x0c37, B:632:0x0c40, B:634:0x0c45, B:636:0x0c4d, B:637:0x0c50, B:638:0x0c53, B:640:0x0c59, B:642:0x0c62, B:644:0x0c6a, B:646:0x0c70, B:648:0x0c7a, B:650:0x0c81, B:653:0x0c8a, B:655:0x0c90, B:658:0x0c98, B:660:0x0c9e, B:661:0x0ca4, B:667:0x0cb2, B:669:0x0cb6, B:670:0x0cbb, B:652:0x0c88, B:580:0x0b42, B:582:0x0b4a, B:584:0x0b4e, B:626:0x0c1b, B:628:0x0c27, B:587:0x0b57, B:589:0x0b5b, B:591:0x0b69, B:592:0x0b6f, B:594:0x0b77, B:599:0x0b86, B:601:0x0b93, B:606:0x0b9c, B:609:0x0be1, B:611:0x0be7, B:613:0x0beb, B:617:0x0bf4, B:621:0x0c03, B:622:0x0c07, B:624:0x0c12, B:562:0x0af9, B:671:0x0cc0, B:673:0x0cc6), top: B:774:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0696 A[Catch: IOException -> 0x0cd6, ParserException -> 0x0cdb, DrmSession$DrmSessionException -> 0x0cf8, DataSourceException -> 0x0cfc, ExoPlaybackException -> 0x0d03, RuntimeException -> 0x0e00, BehindLiveWindowException -> 0x0e1c, TryCatch #4 {ParserException -> 0x0cdb, DataSourceException -> 0x0cfc, ExoPlaybackException -> 0x0d03, DrmSession$DrmSessionException -> 0x0cf8, BehindLiveWindowException -> 0x0e1c, IOException -> 0x0cd6, RuntimeException -> 0x0e00, blocks: (B:3:0x000a, B:4:0x0010, B:6:0x0014, B:8:0x001a, B:9:0x0022, B:11:0x002a, B:13:0x0037, B:14:0x003d, B:16:0x0046, B:18:0x004c, B:20:0x0052, B:21:0x0054, B:23:0x005f, B:25:0x0065, B:15:0x0040, B:26:0x0068, B:28:0x0072, B:30:0x007d, B:32:0x0085, B:33:0x0088, B:34:0x008b, B:35:0x0092, B:36:0x00a1, B:37:0x00ae, B:39:0x00b8, B:42:0x00c2, B:43:0x00d2, B:45:0x00e2, B:47:0x00ed, B:51:0x00fa, B:50:0x00f5, B:52:0x00fd, B:53:0x0100, B:58:0x0111, B:56:0x010a, B:59:0x0116, B:62:0x0135, B:63:0x0156, B:65:0x0168, B:66:0x0171, B:67:0x0189, B:68:0x0191, B:70:0x0197, B:72:0x01a0, B:126:0x033e, B:127:0x0341, B:75:0x01aa, B:76:0x01b5, B:77:0x01c9, B:80:0x01dc, B:83:0x01e6, B:84:0x01f7, B:651:0x0c87, B:85:0x0204, B:87:0x0214, B:88:0x021a, B:89:0x0227, B:91:0x0235, B:92:0x0247, B:93:0x0263, B:94:0x026e, B:96:0x027a, B:97:0x0286, B:98:0x0299, B:100:0x02a8, B:101:0x02ad, B:103:0x02bb, B:104:0x02c7, B:106:0x02db, B:107:0x02e5, B:108:0x02ea, B:110:0x02f0, B:112:0x02f8, B:114:0x02fc, B:116:0x0302, B:118:0x030c, B:119:0x0311, B:121:0x0317, B:128:0x0346, B:130:0x034a, B:124:0x032a, B:131:0x034e, B:132:0x0353, B:134:0x035d, B:136:0x0361, B:138:0x0365, B:139:0x0374, B:141:0x0383, B:158:0x03fe, B:143:0x03b5, B:145:0x03bd, B:147:0x03c9, B:149:0x03e3, B:163:0x040b, B:165:0x0412, B:167:0x0416, B:169:0x041a, B:171:0x0422, B:173:0x0428, B:174:0x042b, B:176:0x0431, B:178:0x0435, B:179:0x0442, B:184:0x045b, B:189:0x0471, B:191:0x047f, B:152:0x03e8, B:153:0x03eb, B:155:0x03f5, B:157:0x03f9, B:159:0x0403, B:161:0x0407, B:192:0x0489, B:208:0x04d4, B:211:0x04e7, B:212:0x04fa, B:213:0x04ff, B:214:0x0507, B:215:0x0522, B:216:0x052b, B:218:0x0546, B:220:0x054c, B:222:0x0557, B:224:0x055d, B:226:0x0563, B:228:0x0572, B:269:0x065a, B:271:0x065e, B:272:0x0669, B:274:0x066d, B:276:0x0671, B:278:0x0675, B:280:0x067b, B:282:0x067f, B:284:0x0683, B:286:0x0687, B:288:0x068b, B:295:0x06af, B:296:0x06b2, B:298:0x06b7, B:300:0x06c1, B:302:0x06c7, B:304:0x06cf, B:312:0x06f8, B:307:0x06e8, B:309:0x06ec, B:313:0x0705, B:314:0x0708, B:316:0x070e, B:318:0x071c, B:319:0x0725, B:321:0x0729, B:323:0x0733, B:325:0x0737, B:328:0x073c, B:330:0x0741, B:332:0x074b, B:334:0x0753, B:354:0x079f, B:356:0x07a5, B:372:0x07ec, B:374:0x07f0, B:377:0x07fb, B:379:0x0803, B:380:0x0805, B:382:0x0832, B:384:0x0836, B:388:0x0846, B:390:0x084a, B:400:0x0873, B:398:0x086f, B:402:0x087d, B:393:0x0850, B:395:0x0862, B:397:0x086a, B:407:0x088c, B:409:0x089a, B:413:0x08a4, B:414:0x08a7, B:416:0x08ab, B:418:0x08b5, B:420:0x08ba, B:421:0x08bd, B:422:0x08c0, B:424:0x08c6, B:386:0x083c, B:426:0x08d3, B:428:0x08f1, B:431:0x08f8, B:434:0x0907, B:436:0x090c, B:438:0x0912, B:440:0x091d, B:442:0x0923, B:445:0x092b, B:447:0x0931, B:448:0x0936, B:433:0x0904, B:335:0x0756, B:337:0x075c, B:339:0x0760, B:341:0x0765, B:343:0x076d, B:345:0x077a, B:351:0x078f, B:352:0x0792, B:353:0x079c, B:358:0x07a9, B:360:0x07ad, B:362:0x07b1, B:364:0x07b5, B:365:0x07ba, B:367:0x07bf, B:370:0x07d6, B:451:0x093d, B:453:0x0947, B:455:0x094f, B:456:0x095e, B:457:0x0961, B:459:0x0966, B:461:0x096c, B:463:0x0970, B:465:0x0974, B:467:0x0978, B:469:0x0982, B:472:0x0988, B:473:0x098b, B:475:0x09a6, B:477:0x09af, B:479:0x09b7, B:482:0x09bf, B:484:0x09e7, B:486:0x09eb, B:488:0x09f1, B:499:0x0a09, B:501:0x0a18, B:504:0x0a22, B:505:0x0a24, B:500:0x0a11, B:506:0x0a27, B:508:0x0a2e, B:289:0x0696, B:230:0x0578, B:232:0x057e, B:235:0x059d, B:241:0x05b3, B:243:0x05bb, B:252:0x05f1, B:247:0x05d6, B:249:0x05de, B:251:0x05e8, B:256:0x061f, B:257:0x0623, B:259:0x0627, B:261:0x062b, B:262:0x0633, B:264:0x0645, B:265:0x064e, B:267:0x0652, B:268:0x0657, B:290:0x069a, B:292:0x069e, B:293:0x06a6, B:255:0x05f7, B:238:0x05a2, B:233:0x0595, B:510:0x0a34, B:514:0x0a3e, B:516:0x0a44, B:517:0x0a4b, B:519:0x0a57, B:520:0x0a6f, B:522:0x0a74, B:524:0x0a7c, B:561:0x0af5, B:525:0x0a80, B:527:0x0a90, B:528:0x0a93, B:530:0x0a97, B:532:0x0aa1, B:534:0x0aa6, B:536:0x0ab0, B:539:0x0ab8, B:541:0x0ac2, B:545:0x0acb, B:547:0x0ad1, B:549:0x0ad7, B:551:0x0add, B:554:0x0ae5, B:560:0x0af2, B:563:0x0b01, B:565:0x0b0c, B:569:0x0b14, B:571:0x0b1c, B:573:0x0b21, B:577:0x0b35, B:579:0x0b3b, B:625:0x0c17, B:629:0x0c37, B:632:0x0c40, B:634:0x0c45, B:636:0x0c4d, B:637:0x0c50, B:638:0x0c53, B:640:0x0c59, B:642:0x0c62, B:644:0x0c6a, B:646:0x0c70, B:648:0x0c7a, B:650:0x0c81, B:653:0x0c8a, B:655:0x0c90, B:658:0x0c98, B:660:0x0c9e, B:661:0x0ca4, B:667:0x0cb2, B:669:0x0cb6, B:670:0x0cbb, B:652:0x0c88, B:580:0x0b42, B:582:0x0b4a, B:584:0x0b4e, B:626:0x0c1b, B:628:0x0c27, B:587:0x0b57, B:589:0x0b5b, B:591:0x0b69, B:592:0x0b6f, B:594:0x0b77, B:599:0x0b86, B:601:0x0b93, B:606:0x0b9c, B:609:0x0be1, B:611:0x0be7, B:613:0x0beb, B:617:0x0bf4, B:621:0x0c03, B:622:0x0c07, B:624:0x0c12, B:562:0x0af9, B:671:0x0cc0, B:673:0x0cc6), top: B:774:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x06af A[Catch: IOException -> 0x0cd6, ParserException -> 0x0cdb, DrmSession$DrmSessionException -> 0x0cf8, DataSourceException -> 0x0cfc, ExoPlaybackException -> 0x0d03, RuntimeException -> 0x0e00, BehindLiveWindowException -> 0x0e1c, TryCatch #4 {ParserException -> 0x0cdb, DataSourceException -> 0x0cfc, ExoPlaybackException -> 0x0d03, DrmSession$DrmSessionException -> 0x0cf8, BehindLiveWindowException -> 0x0e1c, IOException -> 0x0cd6, RuntimeException -> 0x0e00, blocks: (B:3:0x000a, B:4:0x0010, B:6:0x0014, B:8:0x001a, B:9:0x0022, B:11:0x002a, B:13:0x0037, B:14:0x003d, B:16:0x0046, B:18:0x004c, B:20:0x0052, B:21:0x0054, B:23:0x005f, B:25:0x0065, B:15:0x0040, B:26:0x0068, B:28:0x0072, B:30:0x007d, B:32:0x0085, B:33:0x0088, B:34:0x008b, B:35:0x0092, B:36:0x00a1, B:37:0x00ae, B:39:0x00b8, B:42:0x00c2, B:43:0x00d2, B:45:0x00e2, B:47:0x00ed, B:51:0x00fa, B:50:0x00f5, B:52:0x00fd, B:53:0x0100, B:58:0x0111, B:56:0x010a, B:59:0x0116, B:62:0x0135, B:63:0x0156, B:65:0x0168, B:66:0x0171, B:67:0x0189, B:68:0x0191, B:70:0x0197, B:72:0x01a0, B:126:0x033e, B:127:0x0341, B:75:0x01aa, B:76:0x01b5, B:77:0x01c9, B:80:0x01dc, B:83:0x01e6, B:84:0x01f7, B:651:0x0c87, B:85:0x0204, B:87:0x0214, B:88:0x021a, B:89:0x0227, B:91:0x0235, B:92:0x0247, B:93:0x0263, B:94:0x026e, B:96:0x027a, B:97:0x0286, B:98:0x0299, B:100:0x02a8, B:101:0x02ad, B:103:0x02bb, B:104:0x02c7, B:106:0x02db, B:107:0x02e5, B:108:0x02ea, B:110:0x02f0, B:112:0x02f8, B:114:0x02fc, B:116:0x0302, B:118:0x030c, B:119:0x0311, B:121:0x0317, B:128:0x0346, B:130:0x034a, B:124:0x032a, B:131:0x034e, B:132:0x0353, B:134:0x035d, B:136:0x0361, B:138:0x0365, B:139:0x0374, B:141:0x0383, B:158:0x03fe, B:143:0x03b5, B:145:0x03bd, B:147:0x03c9, B:149:0x03e3, B:163:0x040b, B:165:0x0412, B:167:0x0416, B:169:0x041a, B:171:0x0422, B:173:0x0428, B:174:0x042b, B:176:0x0431, B:178:0x0435, B:179:0x0442, B:184:0x045b, B:189:0x0471, B:191:0x047f, B:152:0x03e8, B:153:0x03eb, B:155:0x03f5, B:157:0x03f9, B:159:0x0403, B:161:0x0407, B:192:0x0489, B:208:0x04d4, B:211:0x04e7, B:212:0x04fa, B:213:0x04ff, B:214:0x0507, B:215:0x0522, B:216:0x052b, B:218:0x0546, B:220:0x054c, B:222:0x0557, B:224:0x055d, B:226:0x0563, B:228:0x0572, B:269:0x065a, B:271:0x065e, B:272:0x0669, B:274:0x066d, B:276:0x0671, B:278:0x0675, B:280:0x067b, B:282:0x067f, B:284:0x0683, B:286:0x0687, B:288:0x068b, B:295:0x06af, B:296:0x06b2, B:298:0x06b7, B:300:0x06c1, B:302:0x06c7, B:304:0x06cf, B:312:0x06f8, B:307:0x06e8, B:309:0x06ec, B:313:0x0705, B:314:0x0708, B:316:0x070e, B:318:0x071c, B:319:0x0725, B:321:0x0729, B:323:0x0733, B:325:0x0737, B:328:0x073c, B:330:0x0741, B:332:0x074b, B:334:0x0753, B:354:0x079f, B:356:0x07a5, B:372:0x07ec, B:374:0x07f0, B:377:0x07fb, B:379:0x0803, B:380:0x0805, B:382:0x0832, B:384:0x0836, B:388:0x0846, B:390:0x084a, B:400:0x0873, B:398:0x086f, B:402:0x087d, B:393:0x0850, B:395:0x0862, B:397:0x086a, B:407:0x088c, B:409:0x089a, B:413:0x08a4, B:414:0x08a7, B:416:0x08ab, B:418:0x08b5, B:420:0x08ba, B:421:0x08bd, B:422:0x08c0, B:424:0x08c6, B:386:0x083c, B:426:0x08d3, B:428:0x08f1, B:431:0x08f8, B:434:0x0907, B:436:0x090c, B:438:0x0912, B:440:0x091d, B:442:0x0923, B:445:0x092b, B:447:0x0931, B:448:0x0936, B:433:0x0904, B:335:0x0756, B:337:0x075c, B:339:0x0760, B:341:0x0765, B:343:0x076d, B:345:0x077a, B:351:0x078f, B:352:0x0792, B:353:0x079c, B:358:0x07a9, B:360:0x07ad, B:362:0x07b1, B:364:0x07b5, B:365:0x07ba, B:367:0x07bf, B:370:0x07d6, B:451:0x093d, B:453:0x0947, B:455:0x094f, B:456:0x095e, B:457:0x0961, B:459:0x0966, B:461:0x096c, B:463:0x0970, B:465:0x0974, B:467:0x0978, B:469:0x0982, B:472:0x0988, B:473:0x098b, B:475:0x09a6, B:477:0x09af, B:479:0x09b7, B:482:0x09bf, B:484:0x09e7, B:486:0x09eb, B:488:0x09f1, B:499:0x0a09, B:501:0x0a18, B:504:0x0a22, B:505:0x0a24, B:500:0x0a11, B:506:0x0a27, B:508:0x0a2e, B:289:0x0696, B:230:0x0578, B:232:0x057e, B:235:0x059d, B:241:0x05b3, B:243:0x05bb, B:252:0x05f1, B:247:0x05d6, B:249:0x05de, B:251:0x05e8, B:256:0x061f, B:257:0x0623, B:259:0x0627, B:261:0x062b, B:262:0x0633, B:264:0x0645, B:265:0x064e, B:267:0x0652, B:268:0x0657, B:290:0x069a, B:292:0x069e, B:293:0x06a6, B:255:0x05f7, B:238:0x05a2, B:233:0x0595, B:510:0x0a34, B:514:0x0a3e, B:516:0x0a44, B:517:0x0a4b, B:519:0x0a57, B:520:0x0a6f, B:522:0x0a74, B:524:0x0a7c, B:561:0x0af5, B:525:0x0a80, B:527:0x0a90, B:528:0x0a93, B:530:0x0a97, B:532:0x0aa1, B:534:0x0aa6, B:536:0x0ab0, B:539:0x0ab8, B:541:0x0ac2, B:545:0x0acb, B:547:0x0ad1, B:549:0x0ad7, B:551:0x0add, B:554:0x0ae5, B:560:0x0af2, B:563:0x0b01, B:565:0x0b0c, B:569:0x0b14, B:571:0x0b1c, B:573:0x0b21, B:577:0x0b35, B:579:0x0b3b, B:625:0x0c17, B:629:0x0c37, B:632:0x0c40, B:634:0x0c45, B:636:0x0c4d, B:637:0x0c50, B:638:0x0c53, B:640:0x0c59, B:642:0x0c62, B:644:0x0c6a, B:646:0x0c70, B:648:0x0c7a, B:650:0x0c81, B:653:0x0c8a, B:655:0x0c90, B:658:0x0c98, B:660:0x0c9e, B:661:0x0ca4, B:667:0x0cb2, B:669:0x0cb6, B:670:0x0cbb, B:652:0x0c88, B:580:0x0b42, B:582:0x0b4a, B:584:0x0b4e, B:626:0x0c1b, B:628:0x0c27, B:587:0x0b57, B:589:0x0b5b, B:591:0x0b69, B:592:0x0b6f, B:594:0x0b77, B:599:0x0b86, B:601:0x0b93, B:606:0x0b9c, B:609:0x0be1, B:611:0x0be7, B:613:0x0beb, B:617:0x0bf4, B:621:0x0c03, B:622:0x0c07, B:624:0x0c12, B:562:0x0af9, B:671:0x0cc0, B:673:0x0cc6), top: B:774:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:311:0x06f7  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0729 A[Catch: IOException -> 0x0cd6, ParserException -> 0x0cdb, DrmSession$DrmSessionException -> 0x0cf8, DataSourceException -> 0x0cfc, ExoPlaybackException -> 0x0d03, RuntimeException -> 0x0e00, BehindLiveWindowException -> 0x0e1c, TryCatch #4 {ParserException -> 0x0cdb, DataSourceException -> 0x0cfc, ExoPlaybackException -> 0x0d03, DrmSession$DrmSessionException -> 0x0cf8, BehindLiveWindowException -> 0x0e1c, IOException -> 0x0cd6, RuntimeException -> 0x0e00, blocks: (B:3:0x000a, B:4:0x0010, B:6:0x0014, B:8:0x001a, B:9:0x0022, B:11:0x002a, B:13:0x0037, B:14:0x003d, B:16:0x0046, B:18:0x004c, B:20:0x0052, B:21:0x0054, B:23:0x005f, B:25:0x0065, B:15:0x0040, B:26:0x0068, B:28:0x0072, B:30:0x007d, B:32:0x0085, B:33:0x0088, B:34:0x008b, B:35:0x0092, B:36:0x00a1, B:37:0x00ae, B:39:0x00b8, B:42:0x00c2, B:43:0x00d2, B:45:0x00e2, B:47:0x00ed, B:51:0x00fa, B:50:0x00f5, B:52:0x00fd, B:53:0x0100, B:58:0x0111, B:56:0x010a, B:59:0x0116, B:62:0x0135, B:63:0x0156, B:65:0x0168, B:66:0x0171, B:67:0x0189, B:68:0x0191, B:70:0x0197, B:72:0x01a0, B:126:0x033e, B:127:0x0341, B:75:0x01aa, B:76:0x01b5, B:77:0x01c9, B:80:0x01dc, B:83:0x01e6, B:84:0x01f7, B:651:0x0c87, B:85:0x0204, B:87:0x0214, B:88:0x021a, B:89:0x0227, B:91:0x0235, B:92:0x0247, B:93:0x0263, B:94:0x026e, B:96:0x027a, B:97:0x0286, B:98:0x0299, B:100:0x02a8, B:101:0x02ad, B:103:0x02bb, B:104:0x02c7, B:106:0x02db, B:107:0x02e5, B:108:0x02ea, B:110:0x02f0, B:112:0x02f8, B:114:0x02fc, B:116:0x0302, B:118:0x030c, B:119:0x0311, B:121:0x0317, B:128:0x0346, B:130:0x034a, B:124:0x032a, B:131:0x034e, B:132:0x0353, B:134:0x035d, B:136:0x0361, B:138:0x0365, B:139:0x0374, B:141:0x0383, B:158:0x03fe, B:143:0x03b5, B:145:0x03bd, B:147:0x03c9, B:149:0x03e3, B:163:0x040b, B:165:0x0412, B:167:0x0416, B:169:0x041a, B:171:0x0422, B:173:0x0428, B:174:0x042b, B:176:0x0431, B:178:0x0435, B:179:0x0442, B:184:0x045b, B:189:0x0471, B:191:0x047f, B:152:0x03e8, B:153:0x03eb, B:155:0x03f5, B:157:0x03f9, B:159:0x0403, B:161:0x0407, B:192:0x0489, B:208:0x04d4, B:211:0x04e7, B:212:0x04fa, B:213:0x04ff, B:214:0x0507, B:215:0x0522, B:216:0x052b, B:218:0x0546, B:220:0x054c, B:222:0x0557, B:224:0x055d, B:226:0x0563, B:228:0x0572, B:269:0x065a, B:271:0x065e, B:272:0x0669, B:274:0x066d, B:276:0x0671, B:278:0x0675, B:280:0x067b, B:282:0x067f, B:284:0x0683, B:286:0x0687, B:288:0x068b, B:295:0x06af, B:296:0x06b2, B:298:0x06b7, B:300:0x06c1, B:302:0x06c7, B:304:0x06cf, B:312:0x06f8, B:307:0x06e8, B:309:0x06ec, B:313:0x0705, B:314:0x0708, B:316:0x070e, B:318:0x071c, B:319:0x0725, B:321:0x0729, B:323:0x0733, B:325:0x0737, B:328:0x073c, B:330:0x0741, B:332:0x074b, B:334:0x0753, B:354:0x079f, B:356:0x07a5, B:372:0x07ec, B:374:0x07f0, B:377:0x07fb, B:379:0x0803, B:380:0x0805, B:382:0x0832, B:384:0x0836, B:388:0x0846, B:390:0x084a, B:400:0x0873, B:398:0x086f, B:402:0x087d, B:393:0x0850, B:395:0x0862, B:397:0x086a, B:407:0x088c, B:409:0x089a, B:413:0x08a4, B:414:0x08a7, B:416:0x08ab, B:418:0x08b5, B:420:0x08ba, B:421:0x08bd, B:422:0x08c0, B:424:0x08c6, B:386:0x083c, B:426:0x08d3, B:428:0x08f1, B:431:0x08f8, B:434:0x0907, B:436:0x090c, B:438:0x0912, B:440:0x091d, B:442:0x0923, B:445:0x092b, B:447:0x0931, B:448:0x0936, B:433:0x0904, B:335:0x0756, B:337:0x075c, B:339:0x0760, B:341:0x0765, B:343:0x076d, B:345:0x077a, B:351:0x078f, B:352:0x0792, B:353:0x079c, B:358:0x07a9, B:360:0x07ad, B:362:0x07b1, B:364:0x07b5, B:365:0x07ba, B:367:0x07bf, B:370:0x07d6, B:451:0x093d, B:453:0x0947, B:455:0x094f, B:456:0x095e, B:457:0x0961, B:459:0x0966, B:461:0x096c, B:463:0x0970, B:465:0x0974, B:467:0x0978, B:469:0x0982, B:472:0x0988, B:473:0x098b, B:475:0x09a6, B:477:0x09af, B:479:0x09b7, B:482:0x09bf, B:484:0x09e7, B:486:0x09eb, B:488:0x09f1, B:499:0x0a09, B:501:0x0a18, B:504:0x0a22, B:505:0x0a24, B:500:0x0a11, B:506:0x0a27, B:508:0x0a2e, B:289:0x0696, B:230:0x0578, B:232:0x057e, B:235:0x059d, B:241:0x05b3, B:243:0x05bb, B:252:0x05f1, B:247:0x05d6, B:249:0x05de, B:251:0x05e8, B:256:0x061f, B:257:0x0623, B:259:0x0627, B:261:0x062b, B:262:0x0633, B:264:0x0645, B:265:0x064e, B:267:0x0652, B:268:0x0657, B:290:0x069a, B:292:0x069e, B:293:0x06a6, B:255:0x05f7, B:238:0x05a2, B:233:0x0595, B:510:0x0a34, B:514:0x0a3e, B:516:0x0a44, B:517:0x0a4b, B:519:0x0a57, B:520:0x0a6f, B:522:0x0a74, B:524:0x0a7c, B:561:0x0af5, B:525:0x0a80, B:527:0x0a90, B:528:0x0a93, B:530:0x0a97, B:532:0x0aa1, B:534:0x0aa6, B:536:0x0ab0, B:539:0x0ab8, B:541:0x0ac2, B:545:0x0acb, B:547:0x0ad1, B:549:0x0ad7, B:551:0x0add, B:554:0x0ae5, B:560:0x0af2, B:563:0x0b01, B:565:0x0b0c, B:569:0x0b14, B:571:0x0b1c, B:573:0x0b21, B:577:0x0b35, B:579:0x0b3b, B:625:0x0c17, B:629:0x0c37, B:632:0x0c40, B:634:0x0c45, B:636:0x0c4d, B:637:0x0c50, B:638:0x0c53, B:640:0x0c59, B:642:0x0c62, B:644:0x0c6a, B:646:0x0c70, B:648:0x0c7a, B:650:0x0c81, B:653:0x0c8a, B:655:0x0c90, B:658:0x0c98, B:660:0x0c9e, B:661:0x0ca4, B:667:0x0cb2, B:669:0x0cb6, B:670:0x0cbb, B:652:0x0c88, B:580:0x0b42, B:582:0x0b4a, B:584:0x0b4e, B:626:0x0c1b, B:628:0x0c27, B:587:0x0b57, B:589:0x0b5b, B:591:0x0b69, B:592:0x0b6f, B:594:0x0b77, B:599:0x0b86, B:601:0x0b93, B:606:0x0b9c, B:609:0x0be1, B:611:0x0be7, B:613:0x0beb, B:617:0x0bf4, B:621:0x0c03, B:622:0x0c07, B:624:0x0c12, B:562:0x0af9, B:671:0x0cc0, B:673:0x0cc6), top: B:774:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:367:0x07bf A[Catch: IOException -> 0x0cd6, ParserException -> 0x0cdb, DrmSession$DrmSessionException -> 0x0cf8, DataSourceException -> 0x0cfc, ExoPlaybackException -> 0x0d03, RuntimeException -> 0x0e00, BehindLiveWindowException -> 0x0e1c, TryCatch #4 {ParserException -> 0x0cdb, DataSourceException -> 0x0cfc, ExoPlaybackException -> 0x0d03, DrmSession$DrmSessionException -> 0x0cf8, BehindLiveWindowException -> 0x0e1c, IOException -> 0x0cd6, RuntimeException -> 0x0e00, blocks: (B:3:0x000a, B:4:0x0010, B:6:0x0014, B:8:0x001a, B:9:0x0022, B:11:0x002a, B:13:0x0037, B:14:0x003d, B:16:0x0046, B:18:0x004c, B:20:0x0052, B:21:0x0054, B:23:0x005f, B:25:0x0065, B:15:0x0040, B:26:0x0068, B:28:0x0072, B:30:0x007d, B:32:0x0085, B:33:0x0088, B:34:0x008b, B:35:0x0092, B:36:0x00a1, B:37:0x00ae, B:39:0x00b8, B:42:0x00c2, B:43:0x00d2, B:45:0x00e2, B:47:0x00ed, B:51:0x00fa, B:50:0x00f5, B:52:0x00fd, B:53:0x0100, B:58:0x0111, B:56:0x010a, B:59:0x0116, B:62:0x0135, B:63:0x0156, B:65:0x0168, B:66:0x0171, B:67:0x0189, B:68:0x0191, B:70:0x0197, B:72:0x01a0, B:126:0x033e, B:127:0x0341, B:75:0x01aa, B:76:0x01b5, B:77:0x01c9, B:80:0x01dc, B:83:0x01e6, B:84:0x01f7, B:651:0x0c87, B:85:0x0204, B:87:0x0214, B:88:0x021a, B:89:0x0227, B:91:0x0235, B:92:0x0247, B:93:0x0263, B:94:0x026e, B:96:0x027a, B:97:0x0286, B:98:0x0299, B:100:0x02a8, B:101:0x02ad, B:103:0x02bb, B:104:0x02c7, B:106:0x02db, B:107:0x02e5, B:108:0x02ea, B:110:0x02f0, B:112:0x02f8, B:114:0x02fc, B:116:0x0302, B:118:0x030c, B:119:0x0311, B:121:0x0317, B:128:0x0346, B:130:0x034a, B:124:0x032a, B:131:0x034e, B:132:0x0353, B:134:0x035d, B:136:0x0361, B:138:0x0365, B:139:0x0374, B:141:0x0383, B:158:0x03fe, B:143:0x03b5, B:145:0x03bd, B:147:0x03c9, B:149:0x03e3, B:163:0x040b, B:165:0x0412, B:167:0x0416, B:169:0x041a, B:171:0x0422, B:173:0x0428, B:174:0x042b, B:176:0x0431, B:178:0x0435, B:179:0x0442, B:184:0x045b, B:189:0x0471, B:191:0x047f, B:152:0x03e8, B:153:0x03eb, B:155:0x03f5, B:157:0x03f9, B:159:0x0403, B:161:0x0407, B:192:0x0489, B:208:0x04d4, B:211:0x04e7, B:212:0x04fa, B:213:0x04ff, B:214:0x0507, B:215:0x0522, B:216:0x052b, B:218:0x0546, B:220:0x054c, B:222:0x0557, B:224:0x055d, B:226:0x0563, B:228:0x0572, B:269:0x065a, B:271:0x065e, B:272:0x0669, B:274:0x066d, B:276:0x0671, B:278:0x0675, B:280:0x067b, B:282:0x067f, B:284:0x0683, B:286:0x0687, B:288:0x068b, B:295:0x06af, B:296:0x06b2, B:298:0x06b7, B:300:0x06c1, B:302:0x06c7, B:304:0x06cf, B:312:0x06f8, B:307:0x06e8, B:309:0x06ec, B:313:0x0705, B:314:0x0708, B:316:0x070e, B:318:0x071c, B:319:0x0725, B:321:0x0729, B:323:0x0733, B:325:0x0737, B:328:0x073c, B:330:0x0741, B:332:0x074b, B:334:0x0753, B:354:0x079f, B:356:0x07a5, B:372:0x07ec, B:374:0x07f0, B:377:0x07fb, B:379:0x0803, B:380:0x0805, B:382:0x0832, B:384:0x0836, B:388:0x0846, B:390:0x084a, B:400:0x0873, B:398:0x086f, B:402:0x087d, B:393:0x0850, B:395:0x0862, B:397:0x086a, B:407:0x088c, B:409:0x089a, B:413:0x08a4, B:414:0x08a7, B:416:0x08ab, B:418:0x08b5, B:420:0x08ba, B:421:0x08bd, B:422:0x08c0, B:424:0x08c6, B:386:0x083c, B:426:0x08d3, B:428:0x08f1, B:431:0x08f8, B:434:0x0907, B:436:0x090c, B:438:0x0912, B:440:0x091d, B:442:0x0923, B:445:0x092b, B:447:0x0931, B:448:0x0936, B:433:0x0904, B:335:0x0756, B:337:0x075c, B:339:0x0760, B:341:0x0765, B:343:0x076d, B:345:0x077a, B:351:0x078f, B:352:0x0792, B:353:0x079c, B:358:0x07a9, B:360:0x07ad, B:362:0x07b1, B:364:0x07b5, B:365:0x07ba, B:367:0x07bf, B:370:0x07d6, B:451:0x093d, B:453:0x0947, B:455:0x094f, B:456:0x095e, B:457:0x0961, B:459:0x0966, B:461:0x096c, B:463:0x0970, B:465:0x0974, B:467:0x0978, B:469:0x0982, B:472:0x0988, B:473:0x098b, B:475:0x09a6, B:477:0x09af, B:479:0x09b7, B:482:0x09bf, B:484:0x09e7, B:486:0x09eb, B:488:0x09f1, B:499:0x0a09, B:501:0x0a18, B:504:0x0a22, B:505:0x0a24, B:500:0x0a11, B:506:0x0a27, B:508:0x0a2e, B:289:0x0696, B:230:0x0578, B:232:0x057e, B:235:0x059d, B:241:0x05b3, B:243:0x05bb, B:252:0x05f1, B:247:0x05d6, B:249:0x05de, B:251:0x05e8, B:256:0x061f, B:257:0x0623, B:259:0x0627, B:261:0x062b, B:262:0x0633, B:264:0x0645, B:265:0x064e, B:267:0x0652, B:268:0x0657, B:290:0x069a, B:292:0x069e, B:293:0x06a6, B:255:0x05f7, B:238:0x05a2, B:233:0x0595, B:510:0x0a34, B:514:0x0a3e, B:516:0x0a44, B:517:0x0a4b, B:519:0x0a57, B:520:0x0a6f, B:522:0x0a74, B:524:0x0a7c, B:561:0x0af5, B:525:0x0a80, B:527:0x0a90, B:528:0x0a93, B:530:0x0a97, B:532:0x0aa1, B:534:0x0aa6, B:536:0x0ab0, B:539:0x0ab8, B:541:0x0ac2, B:545:0x0acb, B:547:0x0ad1, B:549:0x0ad7, B:551:0x0add, B:554:0x0ae5, B:560:0x0af2, B:563:0x0b01, B:565:0x0b0c, B:569:0x0b14, B:571:0x0b1c, B:573:0x0b21, B:577:0x0b35, B:579:0x0b3b, B:625:0x0c17, B:629:0x0c37, B:632:0x0c40, B:634:0x0c45, B:636:0x0c4d, B:637:0x0c50, B:638:0x0c53, B:640:0x0c59, B:642:0x0c62, B:644:0x0c6a, B:646:0x0c70, B:648:0x0c7a, B:650:0x0c81, B:653:0x0c8a, B:655:0x0c90, B:658:0x0c98, B:660:0x0c9e, B:661:0x0ca4, B:667:0x0cb2, B:669:0x0cb6, B:670:0x0cbb, B:652:0x0c88, B:580:0x0b42, B:582:0x0b4a, B:584:0x0b4e, B:626:0x0c1b, B:628:0x0c27, B:587:0x0b57, B:589:0x0b5b, B:591:0x0b69, B:592:0x0b6f, B:594:0x0b77, B:599:0x0b86, B:601:0x0b93, B:606:0x0b9c, B:609:0x0be1, B:611:0x0be7, B:613:0x0beb, B:617:0x0bf4, B:621:0x0c03, B:622:0x0c07, B:624:0x0c12, B:562:0x0af9, B:671:0x0cc0, B:673:0x0cc6), top: B:774:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:426:0x08d3 A[Catch: IOException -> 0x0cd6, ParserException -> 0x0cdb, DrmSession$DrmSessionException -> 0x0cf8, DataSourceException -> 0x0cfc, ExoPlaybackException -> 0x0d03, RuntimeException -> 0x0e00, BehindLiveWindowException -> 0x0e1c, TryCatch #4 {ParserException -> 0x0cdb, DataSourceException -> 0x0cfc, ExoPlaybackException -> 0x0d03, DrmSession$DrmSessionException -> 0x0cf8, BehindLiveWindowException -> 0x0e1c, IOException -> 0x0cd6, RuntimeException -> 0x0e00, blocks: (B:3:0x000a, B:4:0x0010, B:6:0x0014, B:8:0x001a, B:9:0x0022, B:11:0x002a, B:13:0x0037, B:14:0x003d, B:16:0x0046, B:18:0x004c, B:20:0x0052, B:21:0x0054, B:23:0x005f, B:25:0x0065, B:15:0x0040, B:26:0x0068, B:28:0x0072, B:30:0x007d, B:32:0x0085, B:33:0x0088, B:34:0x008b, B:35:0x0092, B:36:0x00a1, B:37:0x00ae, B:39:0x00b8, B:42:0x00c2, B:43:0x00d2, B:45:0x00e2, B:47:0x00ed, B:51:0x00fa, B:50:0x00f5, B:52:0x00fd, B:53:0x0100, B:58:0x0111, B:56:0x010a, B:59:0x0116, B:62:0x0135, B:63:0x0156, B:65:0x0168, B:66:0x0171, B:67:0x0189, B:68:0x0191, B:70:0x0197, B:72:0x01a0, B:126:0x033e, B:127:0x0341, B:75:0x01aa, B:76:0x01b5, B:77:0x01c9, B:80:0x01dc, B:83:0x01e6, B:84:0x01f7, B:651:0x0c87, B:85:0x0204, B:87:0x0214, B:88:0x021a, B:89:0x0227, B:91:0x0235, B:92:0x0247, B:93:0x0263, B:94:0x026e, B:96:0x027a, B:97:0x0286, B:98:0x0299, B:100:0x02a8, B:101:0x02ad, B:103:0x02bb, B:104:0x02c7, B:106:0x02db, B:107:0x02e5, B:108:0x02ea, B:110:0x02f0, B:112:0x02f8, B:114:0x02fc, B:116:0x0302, B:118:0x030c, B:119:0x0311, B:121:0x0317, B:128:0x0346, B:130:0x034a, B:124:0x032a, B:131:0x034e, B:132:0x0353, B:134:0x035d, B:136:0x0361, B:138:0x0365, B:139:0x0374, B:141:0x0383, B:158:0x03fe, B:143:0x03b5, B:145:0x03bd, B:147:0x03c9, B:149:0x03e3, B:163:0x040b, B:165:0x0412, B:167:0x0416, B:169:0x041a, B:171:0x0422, B:173:0x0428, B:174:0x042b, B:176:0x0431, B:178:0x0435, B:179:0x0442, B:184:0x045b, B:189:0x0471, B:191:0x047f, B:152:0x03e8, B:153:0x03eb, B:155:0x03f5, B:157:0x03f9, B:159:0x0403, B:161:0x0407, B:192:0x0489, B:208:0x04d4, B:211:0x04e7, B:212:0x04fa, B:213:0x04ff, B:214:0x0507, B:215:0x0522, B:216:0x052b, B:218:0x0546, B:220:0x054c, B:222:0x0557, B:224:0x055d, B:226:0x0563, B:228:0x0572, B:269:0x065a, B:271:0x065e, B:272:0x0669, B:274:0x066d, B:276:0x0671, B:278:0x0675, B:280:0x067b, B:282:0x067f, B:284:0x0683, B:286:0x0687, B:288:0x068b, B:295:0x06af, B:296:0x06b2, B:298:0x06b7, B:300:0x06c1, B:302:0x06c7, B:304:0x06cf, B:312:0x06f8, B:307:0x06e8, B:309:0x06ec, B:313:0x0705, B:314:0x0708, B:316:0x070e, B:318:0x071c, B:319:0x0725, B:321:0x0729, B:323:0x0733, B:325:0x0737, B:328:0x073c, B:330:0x0741, B:332:0x074b, B:334:0x0753, B:354:0x079f, B:356:0x07a5, B:372:0x07ec, B:374:0x07f0, B:377:0x07fb, B:379:0x0803, B:380:0x0805, B:382:0x0832, B:384:0x0836, B:388:0x0846, B:390:0x084a, B:400:0x0873, B:398:0x086f, B:402:0x087d, B:393:0x0850, B:395:0x0862, B:397:0x086a, B:407:0x088c, B:409:0x089a, B:413:0x08a4, B:414:0x08a7, B:416:0x08ab, B:418:0x08b5, B:420:0x08ba, B:421:0x08bd, B:422:0x08c0, B:424:0x08c6, B:386:0x083c, B:426:0x08d3, B:428:0x08f1, B:431:0x08f8, B:434:0x0907, B:436:0x090c, B:438:0x0912, B:440:0x091d, B:442:0x0923, B:445:0x092b, B:447:0x0931, B:448:0x0936, B:433:0x0904, B:335:0x0756, B:337:0x075c, B:339:0x0760, B:341:0x0765, B:343:0x076d, B:345:0x077a, B:351:0x078f, B:352:0x0792, B:353:0x079c, B:358:0x07a9, B:360:0x07ad, B:362:0x07b1, B:364:0x07b5, B:365:0x07ba, B:367:0x07bf, B:370:0x07d6, B:451:0x093d, B:453:0x0947, B:455:0x094f, B:456:0x095e, B:457:0x0961, B:459:0x0966, B:461:0x096c, B:463:0x0970, B:465:0x0974, B:467:0x0978, B:469:0x0982, B:472:0x0988, B:473:0x098b, B:475:0x09a6, B:477:0x09af, B:479:0x09b7, B:482:0x09bf, B:484:0x09e7, B:486:0x09eb, B:488:0x09f1, B:499:0x0a09, B:501:0x0a18, B:504:0x0a22, B:505:0x0a24, B:500:0x0a11, B:506:0x0a27, B:508:0x0a2e, B:289:0x0696, B:230:0x0578, B:232:0x057e, B:235:0x059d, B:241:0x05b3, B:243:0x05bb, B:252:0x05f1, B:247:0x05d6, B:249:0x05de, B:251:0x05e8, B:256:0x061f, B:257:0x0623, B:259:0x0627, B:261:0x062b, B:262:0x0633, B:264:0x0645, B:265:0x064e, B:267:0x0652, B:268:0x0657, B:290:0x069a, B:292:0x069e, B:293:0x06a6, B:255:0x05f7, B:238:0x05a2, B:233:0x0595, B:510:0x0a34, B:514:0x0a3e, B:516:0x0a44, B:517:0x0a4b, B:519:0x0a57, B:520:0x0a6f, B:522:0x0a74, B:524:0x0a7c, B:561:0x0af5, B:525:0x0a80, B:527:0x0a90, B:528:0x0a93, B:530:0x0a97, B:532:0x0aa1, B:534:0x0aa6, B:536:0x0ab0, B:539:0x0ab8, B:541:0x0ac2, B:545:0x0acb, B:547:0x0ad1, B:549:0x0ad7, B:551:0x0add, B:554:0x0ae5, B:560:0x0af2, B:563:0x0b01, B:565:0x0b0c, B:569:0x0b14, B:571:0x0b1c, B:573:0x0b21, B:577:0x0b35, B:579:0x0b3b, B:625:0x0c17, B:629:0x0c37, B:632:0x0c40, B:634:0x0c45, B:636:0x0c4d, B:637:0x0c50, B:638:0x0c53, B:640:0x0c59, B:642:0x0c62, B:644:0x0c6a, B:646:0x0c70, B:648:0x0c7a, B:650:0x0c81, B:653:0x0c8a, B:655:0x0c90, B:658:0x0c98, B:660:0x0c9e, B:661:0x0ca4, B:667:0x0cb2, B:669:0x0cb6, B:670:0x0cbb, B:652:0x0c88, B:580:0x0b42, B:582:0x0b4a, B:584:0x0b4e, B:626:0x0c1b, B:628:0x0c27, B:587:0x0b57, B:589:0x0b5b, B:591:0x0b69, B:592:0x0b6f, B:594:0x0b77, B:599:0x0b86, B:601:0x0b93, B:606:0x0b9c, B:609:0x0be1, B:611:0x0be7, B:613:0x0beb, B:617:0x0bf4, B:621:0x0c03, B:622:0x0c07, B:624:0x0c12, B:562:0x0af9, B:671:0x0cc0, B:673:0x0cc6), top: B:774:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:472:0x0988 A[Catch: IOException -> 0x0cd6, ParserException -> 0x0cdb, DrmSession$DrmSessionException -> 0x0cf8, DataSourceException -> 0x0cfc, ExoPlaybackException -> 0x0d03, RuntimeException -> 0x0e00, BehindLiveWindowException -> 0x0e1c, TryCatch #4 {ParserException -> 0x0cdb, DataSourceException -> 0x0cfc, ExoPlaybackException -> 0x0d03, DrmSession$DrmSessionException -> 0x0cf8, BehindLiveWindowException -> 0x0e1c, IOException -> 0x0cd6, RuntimeException -> 0x0e00, blocks: (B:3:0x000a, B:4:0x0010, B:6:0x0014, B:8:0x001a, B:9:0x0022, B:11:0x002a, B:13:0x0037, B:14:0x003d, B:16:0x0046, B:18:0x004c, B:20:0x0052, B:21:0x0054, B:23:0x005f, B:25:0x0065, B:15:0x0040, B:26:0x0068, B:28:0x0072, B:30:0x007d, B:32:0x0085, B:33:0x0088, B:34:0x008b, B:35:0x0092, B:36:0x00a1, B:37:0x00ae, B:39:0x00b8, B:42:0x00c2, B:43:0x00d2, B:45:0x00e2, B:47:0x00ed, B:51:0x00fa, B:50:0x00f5, B:52:0x00fd, B:53:0x0100, B:58:0x0111, B:56:0x010a, B:59:0x0116, B:62:0x0135, B:63:0x0156, B:65:0x0168, B:66:0x0171, B:67:0x0189, B:68:0x0191, B:70:0x0197, B:72:0x01a0, B:126:0x033e, B:127:0x0341, B:75:0x01aa, B:76:0x01b5, B:77:0x01c9, B:80:0x01dc, B:83:0x01e6, B:84:0x01f7, B:651:0x0c87, B:85:0x0204, B:87:0x0214, B:88:0x021a, B:89:0x0227, B:91:0x0235, B:92:0x0247, B:93:0x0263, B:94:0x026e, B:96:0x027a, B:97:0x0286, B:98:0x0299, B:100:0x02a8, B:101:0x02ad, B:103:0x02bb, B:104:0x02c7, B:106:0x02db, B:107:0x02e5, B:108:0x02ea, B:110:0x02f0, B:112:0x02f8, B:114:0x02fc, B:116:0x0302, B:118:0x030c, B:119:0x0311, B:121:0x0317, B:128:0x0346, B:130:0x034a, B:124:0x032a, B:131:0x034e, B:132:0x0353, B:134:0x035d, B:136:0x0361, B:138:0x0365, B:139:0x0374, B:141:0x0383, B:158:0x03fe, B:143:0x03b5, B:145:0x03bd, B:147:0x03c9, B:149:0x03e3, B:163:0x040b, B:165:0x0412, B:167:0x0416, B:169:0x041a, B:171:0x0422, B:173:0x0428, B:174:0x042b, B:176:0x0431, B:178:0x0435, B:179:0x0442, B:184:0x045b, B:189:0x0471, B:191:0x047f, B:152:0x03e8, B:153:0x03eb, B:155:0x03f5, B:157:0x03f9, B:159:0x0403, B:161:0x0407, B:192:0x0489, B:208:0x04d4, B:211:0x04e7, B:212:0x04fa, B:213:0x04ff, B:214:0x0507, B:215:0x0522, B:216:0x052b, B:218:0x0546, B:220:0x054c, B:222:0x0557, B:224:0x055d, B:226:0x0563, B:228:0x0572, B:269:0x065a, B:271:0x065e, B:272:0x0669, B:274:0x066d, B:276:0x0671, B:278:0x0675, B:280:0x067b, B:282:0x067f, B:284:0x0683, B:286:0x0687, B:288:0x068b, B:295:0x06af, B:296:0x06b2, B:298:0x06b7, B:300:0x06c1, B:302:0x06c7, B:304:0x06cf, B:312:0x06f8, B:307:0x06e8, B:309:0x06ec, B:313:0x0705, B:314:0x0708, B:316:0x070e, B:318:0x071c, B:319:0x0725, B:321:0x0729, B:323:0x0733, B:325:0x0737, B:328:0x073c, B:330:0x0741, B:332:0x074b, B:334:0x0753, B:354:0x079f, B:356:0x07a5, B:372:0x07ec, B:374:0x07f0, B:377:0x07fb, B:379:0x0803, B:380:0x0805, B:382:0x0832, B:384:0x0836, B:388:0x0846, B:390:0x084a, B:400:0x0873, B:398:0x086f, B:402:0x087d, B:393:0x0850, B:395:0x0862, B:397:0x086a, B:407:0x088c, B:409:0x089a, B:413:0x08a4, B:414:0x08a7, B:416:0x08ab, B:418:0x08b5, B:420:0x08ba, B:421:0x08bd, B:422:0x08c0, B:424:0x08c6, B:386:0x083c, B:426:0x08d3, B:428:0x08f1, B:431:0x08f8, B:434:0x0907, B:436:0x090c, B:438:0x0912, B:440:0x091d, B:442:0x0923, B:445:0x092b, B:447:0x0931, B:448:0x0936, B:433:0x0904, B:335:0x0756, B:337:0x075c, B:339:0x0760, B:341:0x0765, B:343:0x076d, B:345:0x077a, B:351:0x078f, B:352:0x0792, B:353:0x079c, B:358:0x07a9, B:360:0x07ad, B:362:0x07b1, B:364:0x07b5, B:365:0x07ba, B:367:0x07bf, B:370:0x07d6, B:451:0x093d, B:453:0x0947, B:455:0x094f, B:456:0x095e, B:457:0x0961, B:459:0x0966, B:461:0x096c, B:463:0x0970, B:465:0x0974, B:467:0x0978, B:469:0x0982, B:472:0x0988, B:473:0x098b, B:475:0x09a6, B:477:0x09af, B:479:0x09b7, B:482:0x09bf, B:484:0x09e7, B:486:0x09eb, B:488:0x09f1, B:499:0x0a09, B:501:0x0a18, B:504:0x0a22, B:505:0x0a24, B:500:0x0a11, B:506:0x0a27, B:508:0x0a2e, B:289:0x0696, B:230:0x0578, B:232:0x057e, B:235:0x059d, B:241:0x05b3, B:243:0x05bb, B:252:0x05f1, B:247:0x05d6, B:249:0x05de, B:251:0x05e8, B:256:0x061f, B:257:0x0623, B:259:0x0627, B:261:0x062b, B:262:0x0633, B:264:0x0645, B:265:0x064e, B:267:0x0652, B:268:0x0657, B:290:0x069a, B:292:0x069e, B:293:0x06a6, B:255:0x05f7, B:238:0x05a2, B:233:0x0595, B:510:0x0a34, B:514:0x0a3e, B:516:0x0a44, B:517:0x0a4b, B:519:0x0a57, B:520:0x0a6f, B:522:0x0a74, B:524:0x0a7c, B:561:0x0af5, B:525:0x0a80, B:527:0x0a90, B:528:0x0a93, B:530:0x0a97, B:532:0x0aa1, B:534:0x0aa6, B:536:0x0ab0, B:539:0x0ab8, B:541:0x0ac2, B:545:0x0acb, B:547:0x0ad1, B:549:0x0ad7, B:551:0x0add, B:554:0x0ae5, B:560:0x0af2, B:563:0x0b01, B:565:0x0b0c, B:569:0x0b14, B:571:0x0b1c, B:573:0x0b21, B:577:0x0b35, B:579:0x0b3b, B:625:0x0c17, B:629:0x0c37, B:632:0x0c40, B:634:0x0c45, B:636:0x0c4d, B:637:0x0c50, B:638:0x0c53, B:640:0x0c59, B:642:0x0c62, B:644:0x0c6a, B:646:0x0c70, B:648:0x0c7a, B:650:0x0c81, B:653:0x0c8a, B:655:0x0c90, B:658:0x0c98, B:660:0x0c9e, B:661:0x0ca4, B:667:0x0cb2, B:669:0x0cb6, B:670:0x0cbb, B:652:0x0c88, B:580:0x0b42, B:582:0x0b4a, B:584:0x0b4e, B:626:0x0c1b, B:628:0x0c27, B:587:0x0b57, B:589:0x0b5b, B:591:0x0b69, B:592:0x0b6f, B:594:0x0b77, B:599:0x0b86, B:601:0x0b93, B:606:0x0b9c, B:609:0x0be1, B:611:0x0be7, B:613:0x0beb, B:617:0x0bf4, B:621:0x0c03, B:622:0x0c07, B:624:0x0c12, B:562:0x0af9, B:671:0x0cc0, B:673:0x0cc6), top: B:774:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:475:0x09a6 A[Catch: IOException -> 0x0cd6, ParserException -> 0x0cdb, DrmSession$DrmSessionException -> 0x0cf8, DataSourceException -> 0x0cfc, ExoPlaybackException -> 0x0d03, RuntimeException -> 0x0e00, BehindLiveWindowException -> 0x0e1c, TryCatch #4 {ParserException -> 0x0cdb, DataSourceException -> 0x0cfc, ExoPlaybackException -> 0x0d03, DrmSession$DrmSessionException -> 0x0cf8, BehindLiveWindowException -> 0x0e1c, IOException -> 0x0cd6, RuntimeException -> 0x0e00, blocks: (B:3:0x000a, B:4:0x0010, B:6:0x0014, B:8:0x001a, B:9:0x0022, B:11:0x002a, B:13:0x0037, B:14:0x003d, B:16:0x0046, B:18:0x004c, B:20:0x0052, B:21:0x0054, B:23:0x005f, B:25:0x0065, B:15:0x0040, B:26:0x0068, B:28:0x0072, B:30:0x007d, B:32:0x0085, B:33:0x0088, B:34:0x008b, B:35:0x0092, B:36:0x00a1, B:37:0x00ae, B:39:0x00b8, B:42:0x00c2, B:43:0x00d2, B:45:0x00e2, B:47:0x00ed, B:51:0x00fa, B:50:0x00f5, B:52:0x00fd, B:53:0x0100, B:58:0x0111, B:56:0x010a, B:59:0x0116, B:62:0x0135, B:63:0x0156, B:65:0x0168, B:66:0x0171, B:67:0x0189, B:68:0x0191, B:70:0x0197, B:72:0x01a0, B:126:0x033e, B:127:0x0341, B:75:0x01aa, B:76:0x01b5, B:77:0x01c9, B:80:0x01dc, B:83:0x01e6, B:84:0x01f7, B:651:0x0c87, B:85:0x0204, B:87:0x0214, B:88:0x021a, B:89:0x0227, B:91:0x0235, B:92:0x0247, B:93:0x0263, B:94:0x026e, B:96:0x027a, B:97:0x0286, B:98:0x0299, B:100:0x02a8, B:101:0x02ad, B:103:0x02bb, B:104:0x02c7, B:106:0x02db, B:107:0x02e5, B:108:0x02ea, B:110:0x02f0, B:112:0x02f8, B:114:0x02fc, B:116:0x0302, B:118:0x030c, B:119:0x0311, B:121:0x0317, B:128:0x0346, B:130:0x034a, B:124:0x032a, B:131:0x034e, B:132:0x0353, B:134:0x035d, B:136:0x0361, B:138:0x0365, B:139:0x0374, B:141:0x0383, B:158:0x03fe, B:143:0x03b5, B:145:0x03bd, B:147:0x03c9, B:149:0x03e3, B:163:0x040b, B:165:0x0412, B:167:0x0416, B:169:0x041a, B:171:0x0422, B:173:0x0428, B:174:0x042b, B:176:0x0431, B:178:0x0435, B:179:0x0442, B:184:0x045b, B:189:0x0471, B:191:0x047f, B:152:0x03e8, B:153:0x03eb, B:155:0x03f5, B:157:0x03f9, B:159:0x0403, B:161:0x0407, B:192:0x0489, B:208:0x04d4, B:211:0x04e7, B:212:0x04fa, B:213:0x04ff, B:214:0x0507, B:215:0x0522, B:216:0x052b, B:218:0x0546, B:220:0x054c, B:222:0x0557, B:224:0x055d, B:226:0x0563, B:228:0x0572, B:269:0x065a, B:271:0x065e, B:272:0x0669, B:274:0x066d, B:276:0x0671, B:278:0x0675, B:280:0x067b, B:282:0x067f, B:284:0x0683, B:286:0x0687, B:288:0x068b, B:295:0x06af, B:296:0x06b2, B:298:0x06b7, B:300:0x06c1, B:302:0x06c7, B:304:0x06cf, B:312:0x06f8, B:307:0x06e8, B:309:0x06ec, B:313:0x0705, B:314:0x0708, B:316:0x070e, B:318:0x071c, B:319:0x0725, B:321:0x0729, B:323:0x0733, B:325:0x0737, B:328:0x073c, B:330:0x0741, B:332:0x074b, B:334:0x0753, B:354:0x079f, B:356:0x07a5, B:372:0x07ec, B:374:0x07f0, B:377:0x07fb, B:379:0x0803, B:380:0x0805, B:382:0x0832, B:384:0x0836, B:388:0x0846, B:390:0x084a, B:400:0x0873, B:398:0x086f, B:402:0x087d, B:393:0x0850, B:395:0x0862, B:397:0x086a, B:407:0x088c, B:409:0x089a, B:413:0x08a4, B:414:0x08a7, B:416:0x08ab, B:418:0x08b5, B:420:0x08ba, B:421:0x08bd, B:422:0x08c0, B:424:0x08c6, B:386:0x083c, B:426:0x08d3, B:428:0x08f1, B:431:0x08f8, B:434:0x0907, B:436:0x090c, B:438:0x0912, B:440:0x091d, B:442:0x0923, B:445:0x092b, B:447:0x0931, B:448:0x0936, B:433:0x0904, B:335:0x0756, B:337:0x075c, B:339:0x0760, B:341:0x0765, B:343:0x076d, B:345:0x077a, B:351:0x078f, B:352:0x0792, B:353:0x079c, B:358:0x07a9, B:360:0x07ad, B:362:0x07b1, B:364:0x07b5, B:365:0x07ba, B:367:0x07bf, B:370:0x07d6, B:451:0x093d, B:453:0x0947, B:455:0x094f, B:456:0x095e, B:457:0x0961, B:459:0x0966, B:461:0x096c, B:463:0x0970, B:465:0x0974, B:467:0x0978, B:469:0x0982, B:472:0x0988, B:473:0x098b, B:475:0x09a6, B:477:0x09af, B:479:0x09b7, B:482:0x09bf, B:484:0x09e7, B:486:0x09eb, B:488:0x09f1, B:499:0x0a09, B:501:0x0a18, B:504:0x0a22, B:505:0x0a24, B:500:0x0a11, B:506:0x0a27, B:508:0x0a2e, B:289:0x0696, B:230:0x0578, B:232:0x057e, B:235:0x059d, B:241:0x05b3, B:243:0x05bb, B:252:0x05f1, B:247:0x05d6, B:249:0x05de, B:251:0x05e8, B:256:0x061f, B:257:0x0623, B:259:0x0627, B:261:0x062b, B:262:0x0633, B:264:0x0645, B:265:0x064e, B:267:0x0652, B:268:0x0657, B:290:0x069a, B:292:0x069e, B:293:0x06a6, B:255:0x05f7, B:238:0x05a2, B:233:0x0595, B:510:0x0a34, B:514:0x0a3e, B:516:0x0a44, B:517:0x0a4b, B:519:0x0a57, B:520:0x0a6f, B:522:0x0a74, B:524:0x0a7c, B:561:0x0af5, B:525:0x0a80, B:527:0x0a90, B:528:0x0a93, B:530:0x0a97, B:532:0x0aa1, B:534:0x0aa6, B:536:0x0ab0, B:539:0x0ab8, B:541:0x0ac2, B:545:0x0acb, B:547:0x0ad1, B:549:0x0ad7, B:551:0x0add, B:554:0x0ae5, B:560:0x0af2, B:563:0x0b01, B:565:0x0b0c, B:569:0x0b14, B:571:0x0b1c, B:573:0x0b21, B:577:0x0b35, B:579:0x0b3b, B:625:0x0c17, B:629:0x0c37, B:632:0x0c40, B:634:0x0c45, B:636:0x0c4d, B:637:0x0c50, B:638:0x0c53, B:640:0x0c59, B:642:0x0c62, B:644:0x0c6a, B:646:0x0c70, B:648:0x0c7a, B:650:0x0c81, B:653:0x0c8a, B:655:0x0c90, B:658:0x0c98, B:660:0x0c9e, B:661:0x0ca4, B:667:0x0cb2, B:669:0x0cb6, B:670:0x0cbb, B:652:0x0c88, B:580:0x0b42, B:582:0x0b4a, B:584:0x0b4e, B:626:0x0c1b, B:628:0x0c27, B:587:0x0b57, B:589:0x0b5b, B:591:0x0b69, B:592:0x0b6f, B:594:0x0b77, B:599:0x0b86, B:601:0x0b93, B:606:0x0b9c, B:609:0x0be1, B:611:0x0be7, B:613:0x0beb, B:617:0x0bf4, B:621:0x0c03, B:622:0x0c07, B:624:0x0c12, B:562:0x0af9, B:671:0x0cc0, B:673:0x0cc6), top: B:774:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:481:0x09be  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x09f1 A[Catch: IOException -> 0x0cd6, ParserException -> 0x0cdb, DrmSession$DrmSessionException -> 0x0cf8, DataSourceException -> 0x0cfc, ExoPlaybackException -> 0x0d03, RuntimeException -> 0x0e00, BehindLiveWindowException -> 0x0e1c, TryCatch #4 {ParserException -> 0x0cdb, DataSourceException -> 0x0cfc, ExoPlaybackException -> 0x0d03, DrmSession$DrmSessionException -> 0x0cf8, BehindLiveWindowException -> 0x0e1c, IOException -> 0x0cd6, RuntimeException -> 0x0e00, blocks: (B:3:0x000a, B:4:0x0010, B:6:0x0014, B:8:0x001a, B:9:0x0022, B:11:0x002a, B:13:0x0037, B:14:0x003d, B:16:0x0046, B:18:0x004c, B:20:0x0052, B:21:0x0054, B:23:0x005f, B:25:0x0065, B:15:0x0040, B:26:0x0068, B:28:0x0072, B:30:0x007d, B:32:0x0085, B:33:0x0088, B:34:0x008b, B:35:0x0092, B:36:0x00a1, B:37:0x00ae, B:39:0x00b8, B:42:0x00c2, B:43:0x00d2, B:45:0x00e2, B:47:0x00ed, B:51:0x00fa, B:50:0x00f5, B:52:0x00fd, B:53:0x0100, B:58:0x0111, B:56:0x010a, B:59:0x0116, B:62:0x0135, B:63:0x0156, B:65:0x0168, B:66:0x0171, B:67:0x0189, B:68:0x0191, B:70:0x0197, B:72:0x01a0, B:126:0x033e, B:127:0x0341, B:75:0x01aa, B:76:0x01b5, B:77:0x01c9, B:80:0x01dc, B:83:0x01e6, B:84:0x01f7, B:651:0x0c87, B:85:0x0204, B:87:0x0214, B:88:0x021a, B:89:0x0227, B:91:0x0235, B:92:0x0247, B:93:0x0263, B:94:0x026e, B:96:0x027a, B:97:0x0286, B:98:0x0299, B:100:0x02a8, B:101:0x02ad, B:103:0x02bb, B:104:0x02c7, B:106:0x02db, B:107:0x02e5, B:108:0x02ea, B:110:0x02f0, B:112:0x02f8, B:114:0x02fc, B:116:0x0302, B:118:0x030c, B:119:0x0311, B:121:0x0317, B:128:0x0346, B:130:0x034a, B:124:0x032a, B:131:0x034e, B:132:0x0353, B:134:0x035d, B:136:0x0361, B:138:0x0365, B:139:0x0374, B:141:0x0383, B:158:0x03fe, B:143:0x03b5, B:145:0x03bd, B:147:0x03c9, B:149:0x03e3, B:163:0x040b, B:165:0x0412, B:167:0x0416, B:169:0x041a, B:171:0x0422, B:173:0x0428, B:174:0x042b, B:176:0x0431, B:178:0x0435, B:179:0x0442, B:184:0x045b, B:189:0x0471, B:191:0x047f, B:152:0x03e8, B:153:0x03eb, B:155:0x03f5, B:157:0x03f9, B:159:0x0403, B:161:0x0407, B:192:0x0489, B:208:0x04d4, B:211:0x04e7, B:212:0x04fa, B:213:0x04ff, B:214:0x0507, B:215:0x0522, B:216:0x052b, B:218:0x0546, B:220:0x054c, B:222:0x0557, B:224:0x055d, B:226:0x0563, B:228:0x0572, B:269:0x065a, B:271:0x065e, B:272:0x0669, B:274:0x066d, B:276:0x0671, B:278:0x0675, B:280:0x067b, B:282:0x067f, B:284:0x0683, B:286:0x0687, B:288:0x068b, B:295:0x06af, B:296:0x06b2, B:298:0x06b7, B:300:0x06c1, B:302:0x06c7, B:304:0x06cf, B:312:0x06f8, B:307:0x06e8, B:309:0x06ec, B:313:0x0705, B:314:0x0708, B:316:0x070e, B:318:0x071c, B:319:0x0725, B:321:0x0729, B:323:0x0733, B:325:0x0737, B:328:0x073c, B:330:0x0741, B:332:0x074b, B:334:0x0753, B:354:0x079f, B:356:0x07a5, B:372:0x07ec, B:374:0x07f0, B:377:0x07fb, B:379:0x0803, B:380:0x0805, B:382:0x0832, B:384:0x0836, B:388:0x0846, B:390:0x084a, B:400:0x0873, B:398:0x086f, B:402:0x087d, B:393:0x0850, B:395:0x0862, B:397:0x086a, B:407:0x088c, B:409:0x089a, B:413:0x08a4, B:414:0x08a7, B:416:0x08ab, B:418:0x08b5, B:420:0x08ba, B:421:0x08bd, B:422:0x08c0, B:424:0x08c6, B:386:0x083c, B:426:0x08d3, B:428:0x08f1, B:431:0x08f8, B:434:0x0907, B:436:0x090c, B:438:0x0912, B:440:0x091d, B:442:0x0923, B:445:0x092b, B:447:0x0931, B:448:0x0936, B:433:0x0904, B:335:0x0756, B:337:0x075c, B:339:0x0760, B:341:0x0765, B:343:0x076d, B:345:0x077a, B:351:0x078f, B:352:0x0792, B:353:0x079c, B:358:0x07a9, B:360:0x07ad, B:362:0x07b1, B:364:0x07b5, B:365:0x07ba, B:367:0x07bf, B:370:0x07d6, B:451:0x093d, B:453:0x0947, B:455:0x094f, B:456:0x095e, B:457:0x0961, B:459:0x0966, B:461:0x096c, B:463:0x0970, B:465:0x0974, B:467:0x0978, B:469:0x0982, B:472:0x0988, B:473:0x098b, B:475:0x09a6, B:477:0x09af, B:479:0x09b7, B:482:0x09bf, B:484:0x09e7, B:486:0x09eb, B:488:0x09f1, B:499:0x0a09, B:501:0x0a18, B:504:0x0a22, B:505:0x0a24, B:500:0x0a11, B:506:0x0a27, B:508:0x0a2e, B:289:0x0696, B:230:0x0578, B:232:0x057e, B:235:0x059d, B:241:0x05b3, B:243:0x05bb, B:252:0x05f1, B:247:0x05d6, B:249:0x05de, B:251:0x05e8, B:256:0x061f, B:257:0x0623, B:259:0x0627, B:261:0x062b, B:262:0x0633, B:264:0x0645, B:265:0x064e, B:267:0x0652, B:268:0x0657, B:290:0x069a, B:292:0x069e, B:293:0x06a6, B:255:0x05f7, B:238:0x05a2, B:233:0x0595, B:510:0x0a34, B:514:0x0a3e, B:516:0x0a44, B:517:0x0a4b, B:519:0x0a57, B:520:0x0a6f, B:522:0x0a74, B:524:0x0a7c, B:561:0x0af5, B:525:0x0a80, B:527:0x0a90, B:528:0x0a93, B:530:0x0a97, B:532:0x0aa1, B:534:0x0aa6, B:536:0x0ab0, B:539:0x0ab8, B:541:0x0ac2, B:545:0x0acb, B:547:0x0ad1, B:549:0x0ad7, B:551:0x0add, B:554:0x0ae5, B:560:0x0af2, B:563:0x0b01, B:565:0x0b0c, B:569:0x0b14, B:571:0x0b1c, B:573:0x0b21, B:577:0x0b35, B:579:0x0b3b, B:625:0x0c17, B:629:0x0c37, B:632:0x0c40, B:634:0x0c45, B:636:0x0c4d, B:637:0x0c50, B:638:0x0c53, B:640:0x0c59, B:642:0x0c62, B:644:0x0c6a, B:646:0x0c70, B:648:0x0c7a, B:650:0x0c81, B:653:0x0c8a, B:655:0x0c90, B:658:0x0c98, B:660:0x0c9e, B:661:0x0ca4, B:667:0x0cb2, B:669:0x0cb6, B:670:0x0cbb, B:652:0x0c88, B:580:0x0b42, B:582:0x0b4a, B:584:0x0b4e, B:626:0x0c1b, B:628:0x0c27, B:587:0x0b57, B:589:0x0b5b, B:591:0x0b69, B:592:0x0b6f, B:594:0x0b77, B:599:0x0b86, B:601:0x0b93, B:606:0x0b9c, B:609:0x0be1, B:611:0x0be7, B:613:0x0beb, B:617:0x0bf4, B:621:0x0c03, B:622:0x0c07, B:624:0x0c12, B:562:0x0af9, B:671:0x0cc0, B:673:0x0cc6), top: B:774:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:508:0x0a2e A[Catch: IOException -> 0x0cd6, ParserException -> 0x0cdb, DrmSession$DrmSessionException -> 0x0cf8, DataSourceException -> 0x0cfc, ExoPlaybackException -> 0x0d03, RuntimeException -> 0x0e00, BehindLiveWindowException -> 0x0e1c, TryCatch #4 {ParserException -> 0x0cdb, DataSourceException -> 0x0cfc, ExoPlaybackException -> 0x0d03, DrmSession$DrmSessionException -> 0x0cf8, BehindLiveWindowException -> 0x0e1c, IOException -> 0x0cd6, RuntimeException -> 0x0e00, blocks: (B:3:0x000a, B:4:0x0010, B:6:0x0014, B:8:0x001a, B:9:0x0022, B:11:0x002a, B:13:0x0037, B:14:0x003d, B:16:0x0046, B:18:0x004c, B:20:0x0052, B:21:0x0054, B:23:0x005f, B:25:0x0065, B:15:0x0040, B:26:0x0068, B:28:0x0072, B:30:0x007d, B:32:0x0085, B:33:0x0088, B:34:0x008b, B:35:0x0092, B:36:0x00a1, B:37:0x00ae, B:39:0x00b8, B:42:0x00c2, B:43:0x00d2, B:45:0x00e2, B:47:0x00ed, B:51:0x00fa, B:50:0x00f5, B:52:0x00fd, B:53:0x0100, B:58:0x0111, B:56:0x010a, B:59:0x0116, B:62:0x0135, B:63:0x0156, B:65:0x0168, B:66:0x0171, B:67:0x0189, B:68:0x0191, B:70:0x0197, B:72:0x01a0, B:126:0x033e, B:127:0x0341, B:75:0x01aa, B:76:0x01b5, B:77:0x01c9, B:80:0x01dc, B:83:0x01e6, B:84:0x01f7, B:651:0x0c87, B:85:0x0204, B:87:0x0214, B:88:0x021a, B:89:0x0227, B:91:0x0235, B:92:0x0247, B:93:0x0263, B:94:0x026e, B:96:0x027a, B:97:0x0286, B:98:0x0299, B:100:0x02a8, B:101:0x02ad, B:103:0x02bb, B:104:0x02c7, B:106:0x02db, B:107:0x02e5, B:108:0x02ea, B:110:0x02f0, B:112:0x02f8, B:114:0x02fc, B:116:0x0302, B:118:0x030c, B:119:0x0311, B:121:0x0317, B:128:0x0346, B:130:0x034a, B:124:0x032a, B:131:0x034e, B:132:0x0353, B:134:0x035d, B:136:0x0361, B:138:0x0365, B:139:0x0374, B:141:0x0383, B:158:0x03fe, B:143:0x03b5, B:145:0x03bd, B:147:0x03c9, B:149:0x03e3, B:163:0x040b, B:165:0x0412, B:167:0x0416, B:169:0x041a, B:171:0x0422, B:173:0x0428, B:174:0x042b, B:176:0x0431, B:178:0x0435, B:179:0x0442, B:184:0x045b, B:189:0x0471, B:191:0x047f, B:152:0x03e8, B:153:0x03eb, B:155:0x03f5, B:157:0x03f9, B:159:0x0403, B:161:0x0407, B:192:0x0489, B:208:0x04d4, B:211:0x04e7, B:212:0x04fa, B:213:0x04ff, B:214:0x0507, B:215:0x0522, B:216:0x052b, B:218:0x0546, B:220:0x054c, B:222:0x0557, B:224:0x055d, B:226:0x0563, B:228:0x0572, B:269:0x065a, B:271:0x065e, B:272:0x0669, B:274:0x066d, B:276:0x0671, B:278:0x0675, B:280:0x067b, B:282:0x067f, B:284:0x0683, B:286:0x0687, B:288:0x068b, B:295:0x06af, B:296:0x06b2, B:298:0x06b7, B:300:0x06c1, B:302:0x06c7, B:304:0x06cf, B:312:0x06f8, B:307:0x06e8, B:309:0x06ec, B:313:0x0705, B:314:0x0708, B:316:0x070e, B:318:0x071c, B:319:0x0725, B:321:0x0729, B:323:0x0733, B:325:0x0737, B:328:0x073c, B:330:0x0741, B:332:0x074b, B:334:0x0753, B:354:0x079f, B:356:0x07a5, B:372:0x07ec, B:374:0x07f0, B:377:0x07fb, B:379:0x0803, B:380:0x0805, B:382:0x0832, B:384:0x0836, B:388:0x0846, B:390:0x084a, B:400:0x0873, B:398:0x086f, B:402:0x087d, B:393:0x0850, B:395:0x0862, B:397:0x086a, B:407:0x088c, B:409:0x089a, B:413:0x08a4, B:414:0x08a7, B:416:0x08ab, B:418:0x08b5, B:420:0x08ba, B:421:0x08bd, B:422:0x08c0, B:424:0x08c6, B:386:0x083c, B:426:0x08d3, B:428:0x08f1, B:431:0x08f8, B:434:0x0907, B:436:0x090c, B:438:0x0912, B:440:0x091d, B:442:0x0923, B:445:0x092b, B:447:0x0931, B:448:0x0936, B:433:0x0904, B:335:0x0756, B:337:0x075c, B:339:0x0760, B:341:0x0765, B:343:0x076d, B:345:0x077a, B:351:0x078f, B:352:0x0792, B:353:0x079c, B:358:0x07a9, B:360:0x07ad, B:362:0x07b1, B:364:0x07b5, B:365:0x07ba, B:367:0x07bf, B:370:0x07d6, B:451:0x093d, B:453:0x0947, B:455:0x094f, B:456:0x095e, B:457:0x0961, B:459:0x0966, B:461:0x096c, B:463:0x0970, B:465:0x0974, B:467:0x0978, B:469:0x0982, B:472:0x0988, B:473:0x098b, B:475:0x09a6, B:477:0x09af, B:479:0x09b7, B:482:0x09bf, B:484:0x09e7, B:486:0x09eb, B:488:0x09f1, B:499:0x0a09, B:501:0x0a18, B:504:0x0a22, B:505:0x0a24, B:500:0x0a11, B:506:0x0a27, B:508:0x0a2e, B:289:0x0696, B:230:0x0578, B:232:0x057e, B:235:0x059d, B:241:0x05b3, B:243:0x05bb, B:252:0x05f1, B:247:0x05d6, B:249:0x05de, B:251:0x05e8, B:256:0x061f, B:257:0x0623, B:259:0x0627, B:261:0x062b, B:262:0x0633, B:264:0x0645, B:265:0x064e, B:267:0x0652, B:268:0x0657, B:290:0x069a, B:292:0x069e, B:293:0x06a6, B:255:0x05f7, B:238:0x05a2, B:233:0x0595, B:510:0x0a34, B:514:0x0a3e, B:516:0x0a44, B:517:0x0a4b, B:519:0x0a57, B:520:0x0a6f, B:522:0x0a74, B:524:0x0a7c, B:561:0x0af5, B:525:0x0a80, B:527:0x0a90, B:528:0x0a93, B:530:0x0a97, B:532:0x0aa1, B:534:0x0aa6, B:536:0x0ab0, B:539:0x0ab8, B:541:0x0ac2, B:545:0x0acb, B:547:0x0ad1, B:549:0x0ad7, B:551:0x0add, B:554:0x0ae5, B:560:0x0af2, B:563:0x0b01, B:565:0x0b0c, B:569:0x0b14, B:571:0x0b1c, B:573:0x0b21, B:577:0x0b35, B:579:0x0b3b, B:625:0x0c17, B:629:0x0c37, B:632:0x0c40, B:634:0x0c45, B:636:0x0c4d, B:637:0x0c50, B:638:0x0c53, B:640:0x0c59, B:642:0x0c62, B:644:0x0c6a, B:646:0x0c70, B:648:0x0c7a, B:650:0x0c81, B:653:0x0c8a, B:655:0x0c90, B:658:0x0c98, B:660:0x0c9e, B:661:0x0ca4, B:667:0x0cb2, B:669:0x0cb6, B:670:0x0cbb, B:652:0x0c88, B:580:0x0b42, B:582:0x0b4a, B:584:0x0b4e, B:626:0x0c1b, B:628:0x0c27, B:587:0x0b57, B:589:0x0b5b, B:591:0x0b69, B:592:0x0b6f, B:594:0x0b77, B:599:0x0b86, B:601:0x0b93, B:606:0x0b9c, B:609:0x0be1, B:611:0x0be7, B:613:0x0beb, B:617:0x0bf4, B:621:0x0c03, B:622:0x0c07, B:624:0x0c12, B:562:0x0af9, B:671:0x0cc0, B:673:0x0cc6), top: B:774:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:544:0x0aca  */
    /* JADX WARN: Removed duplicated region for block: B:553:0x0ae4  */
    /* JADX WARN: Removed duplicated region for block: B:556:0x0aea  */
    /* JADX WARN: Removed duplicated region for block: B:558:0x0aee  */
    /* JADX WARN: Removed duplicated region for block: B:611:0x0be7 A[Catch: IOException -> 0x0cd6, ParserException -> 0x0cdb, DrmSession$DrmSessionException -> 0x0cf8, DataSourceException -> 0x0cfc, ExoPlaybackException -> 0x0d03, RuntimeException -> 0x0e00, BehindLiveWindowException -> 0x0e1c, TryCatch #4 {ParserException -> 0x0cdb, DataSourceException -> 0x0cfc, ExoPlaybackException -> 0x0d03, DrmSession$DrmSessionException -> 0x0cf8, BehindLiveWindowException -> 0x0e1c, IOException -> 0x0cd6, RuntimeException -> 0x0e00, blocks: (B:3:0x000a, B:4:0x0010, B:6:0x0014, B:8:0x001a, B:9:0x0022, B:11:0x002a, B:13:0x0037, B:14:0x003d, B:16:0x0046, B:18:0x004c, B:20:0x0052, B:21:0x0054, B:23:0x005f, B:25:0x0065, B:15:0x0040, B:26:0x0068, B:28:0x0072, B:30:0x007d, B:32:0x0085, B:33:0x0088, B:34:0x008b, B:35:0x0092, B:36:0x00a1, B:37:0x00ae, B:39:0x00b8, B:42:0x00c2, B:43:0x00d2, B:45:0x00e2, B:47:0x00ed, B:51:0x00fa, B:50:0x00f5, B:52:0x00fd, B:53:0x0100, B:58:0x0111, B:56:0x010a, B:59:0x0116, B:62:0x0135, B:63:0x0156, B:65:0x0168, B:66:0x0171, B:67:0x0189, B:68:0x0191, B:70:0x0197, B:72:0x01a0, B:126:0x033e, B:127:0x0341, B:75:0x01aa, B:76:0x01b5, B:77:0x01c9, B:80:0x01dc, B:83:0x01e6, B:84:0x01f7, B:651:0x0c87, B:85:0x0204, B:87:0x0214, B:88:0x021a, B:89:0x0227, B:91:0x0235, B:92:0x0247, B:93:0x0263, B:94:0x026e, B:96:0x027a, B:97:0x0286, B:98:0x0299, B:100:0x02a8, B:101:0x02ad, B:103:0x02bb, B:104:0x02c7, B:106:0x02db, B:107:0x02e5, B:108:0x02ea, B:110:0x02f0, B:112:0x02f8, B:114:0x02fc, B:116:0x0302, B:118:0x030c, B:119:0x0311, B:121:0x0317, B:128:0x0346, B:130:0x034a, B:124:0x032a, B:131:0x034e, B:132:0x0353, B:134:0x035d, B:136:0x0361, B:138:0x0365, B:139:0x0374, B:141:0x0383, B:158:0x03fe, B:143:0x03b5, B:145:0x03bd, B:147:0x03c9, B:149:0x03e3, B:163:0x040b, B:165:0x0412, B:167:0x0416, B:169:0x041a, B:171:0x0422, B:173:0x0428, B:174:0x042b, B:176:0x0431, B:178:0x0435, B:179:0x0442, B:184:0x045b, B:189:0x0471, B:191:0x047f, B:152:0x03e8, B:153:0x03eb, B:155:0x03f5, B:157:0x03f9, B:159:0x0403, B:161:0x0407, B:192:0x0489, B:208:0x04d4, B:211:0x04e7, B:212:0x04fa, B:213:0x04ff, B:214:0x0507, B:215:0x0522, B:216:0x052b, B:218:0x0546, B:220:0x054c, B:222:0x0557, B:224:0x055d, B:226:0x0563, B:228:0x0572, B:269:0x065a, B:271:0x065e, B:272:0x0669, B:274:0x066d, B:276:0x0671, B:278:0x0675, B:280:0x067b, B:282:0x067f, B:284:0x0683, B:286:0x0687, B:288:0x068b, B:295:0x06af, B:296:0x06b2, B:298:0x06b7, B:300:0x06c1, B:302:0x06c7, B:304:0x06cf, B:312:0x06f8, B:307:0x06e8, B:309:0x06ec, B:313:0x0705, B:314:0x0708, B:316:0x070e, B:318:0x071c, B:319:0x0725, B:321:0x0729, B:323:0x0733, B:325:0x0737, B:328:0x073c, B:330:0x0741, B:332:0x074b, B:334:0x0753, B:354:0x079f, B:356:0x07a5, B:372:0x07ec, B:374:0x07f0, B:377:0x07fb, B:379:0x0803, B:380:0x0805, B:382:0x0832, B:384:0x0836, B:388:0x0846, B:390:0x084a, B:400:0x0873, B:398:0x086f, B:402:0x087d, B:393:0x0850, B:395:0x0862, B:397:0x086a, B:407:0x088c, B:409:0x089a, B:413:0x08a4, B:414:0x08a7, B:416:0x08ab, B:418:0x08b5, B:420:0x08ba, B:421:0x08bd, B:422:0x08c0, B:424:0x08c6, B:386:0x083c, B:426:0x08d3, B:428:0x08f1, B:431:0x08f8, B:434:0x0907, B:436:0x090c, B:438:0x0912, B:440:0x091d, B:442:0x0923, B:445:0x092b, B:447:0x0931, B:448:0x0936, B:433:0x0904, B:335:0x0756, B:337:0x075c, B:339:0x0760, B:341:0x0765, B:343:0x076d, B:345:0x077a, B:351:0x078f, B:352:0x0792, B:353:0x079c, B:358:0x07a9, B:360:0x07ad, B:362:0x07b1, B:364:0x07b5, B:365:0x07ba, B:367:0x07bf, B:370:0x07d6, B:451:0x093d, B:453:0x0947, B:455:0x094f, B:456:0x095e, B:457:0x0961, B:459:0x0966, B:461:0x096c, B:463:0x0970, B:465:0x0974, B:467:0x0978, B:469:0x0982, B:472:0x0988, B:473:0x098b, B:475:0x09a6, B:477:0x09af, B:479:0x09b7, B:482:0x09bf, B:484:0x09e7, B:486:0x09eb, B:488:0x09f1, B:499:0x0a09, B:501:0x0a18, B:504:0x0a22, B:505:0x0a24, B:500:0x0a11, B:506:0x0a27, B:508:0x0a2e, B:289:0x0696, B:230:0x0578, B:232:0x057e, B:235:0x059d, B:241:0x05b3, B:243:0x05bb, B:252:0x05f1, B:247:0x05d6, B:249:0x05de, B:251:0x05e8, B:256:0x061f, B:257:0x0623, B:259:0x0627, B:261:0x062b, B:262:0x0633, B:264:0x0645, B:265:0x064e, B:267:0x0652, B:268:0x0657, B:290:0x069a, B:292:0x069e, B:293:0x06a6, B:255:0x05f7, B:238:0x05a2, B:233:0x0595, B:510:0x0a34, B:514:0x0a3e, B:516:0x0a44, B:517:0x0a4b, B:519:0x0a57, B:520:0x0a6f, B:522:0x0a74, B:524:0x0a7c, B:561:0x0af5, B:525:0x0a80, B:527:0x0a90, B:528:0x0a93, B:530:0x0a97, B:532:0x0aa1, B:534:0x0aa6, B:536:0x0ab0, B:539:0x0ab8, B:541:0x0ac2, B:545:0x0acb, B:547:0x0ad1, B:549:0x0ad7, B:551:0x0add, B:554:0x0ae5, B:560:0x0af2, B:563:0x0b01, B:565:0x0b0c, B:569:0x0b14, B:571:0x0b1c, B:573:0x0b21, B:577:0x0b35, B:579:0x0b3b, B:625:0x0c17, B:629:0x0c37, B:632:0x0c40, B:634:0x0c45, B:636:0x0c4d, B:637:0x0c50, B:638:0x0c53, B:640:0x0c59, B:642:0x0c62, B:644:0x0c6a, B:646:0x0c70, B:648:0x0c7a, B:650:0x0c81, B:653:0x0c8a, B:655:0x0c90, B:658:0x0c98, B:660:0x0c9e, B:661:0x0ca4, B:667:0x0cb2, B:669:0x0cb6, B:670:0x0cbb, B:652:0x0c88, B:580:0x0b42, B:582:0x0b4a, B:584:0x0b4e, B:626:0x0c1b, B:628:0x0c27, B:587:0x0b57, B:589:0x0b5b, B:591:0x0b69, B:592:0x0b6f, B:594:0x0b77, B:599:0x0b86, B:601:0x0b93, B:606:0x0b9c, B:609:0x0be1, B:611:0x0be7, B:613:0x0beb, B:617:0x0bf4, B:621:0x0c03, B:622:0x0c07, B:624:0x0c12, B:562:0x0af9, B:671:0x0cc0, B:673:0x0cc6), top: B:774:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:628:0x0c27 A[Catch: IOException -> 0x0cd6, ParserException -> 0x0cdb, DrmSession$DrmSessionException -> 0x0cf8, DataSourceException -> 0x0cfc, ExoPlaybackException -> 0x0d03, RuntimeException -> 0x0e00, BehindLiveWindowException -> 0x0e1c, TryCatch #4 {ParserException -> 0x0cdb, DataSourceException -> 0x0cfc, ExoPlaybackException -> 0x0d03, DrmSession$DrmSessionException -> 0x0cf8, BehindLiveWindowException -> 0x0e1c, IOException -> 0x0cd6, RuntimeException -> 0x0e00, blocks: (B:3:0x000a, B:4:0x0010, B:6:0x0014, B:8:0x001a, B:9:0x0022, B:11:0x002a, B:13:0x0037, B:14:0x003d, B:16:0x0046, B:18:0x004c, B:20:0x0052, B:21:0x0054, B:23:0x005f, B:25:0x0065, B:15:0x0040, B:26:0x0068, B:28:0x0072, B:30:0x007d, B:32:0x0085, B:33:0x0088, B:34:0x008b, B:35:0x0092, B:36:0x00a1, B:37:0x00ae, B:39:0x00b8, B:42:0x00c2, B:43:0x00d2, B:45:0x00e2, B:47:0x00ed, B:51:0x00fa, B:50:0x00f5, B:52:0x00fd, B:53:0x0100, B:58:0x0111, B:56:0x010a, B:59:0x0116, B:62:0x0135, B:63:0x0156, B:65:0x0168, B:66:0x0171, B:67:0x0189, B:68:0x0191, B:70:0x0197, B:72:0x01a0, B:126:0x033e, B:127:0x0341, B:75:0x01aa, B:76:0x01b5, B:77:0x01c9, B:80:0x01dc, B:83:0x01e6, B:84:0x01f7, B:651:0x0c87, B:85:0x0204, B:87:0x0214, B:88:0x021a, B:89:0x0227, B:91:0x0235, B:92:0x0247, B:93:0x0263, B:94:0x026e, B:96:0x027a, B:97:0x0286, B:98:0x0299, B:100:0x02a8, B:101:0x02ad, B:103:0x02bb, B:104:0x02c7, B:106:0x02db, B:107:0x02e5, B:108:0x02ea, B:110:0x02f0, B:112:0x02f8, B:114:0x02fc, B:116:0x0302, B:118:0x030c, B:119:0x0311, B:121:0x0317, B:128:0x0346, B:130:0x034a, B:124:0x032a, B:131:0x034e, B:132:0x0353, B:134:0x035d, B:136:0x0361, B:138:0x0365, B:139:0x0374, B:141:0x0383, B:158:0x03fe, B:143:0x03b5, B:145:0x03bd, B:147:0x03c9, B:149:0x03e3, B:163:0x040b, B:165:0x0412, B:167:0x0416, B:169:0x041a, B:171:0x0422, B:173:0x0428, B:174:0x042b, B:176:0x0431, B:178:0x0435, B:179:0x0442, B:184:0x045b, B:189:0x0471, B:191:0x047f, B:152:0x03e8, B:153:0x03eb, B:155:0x03f5, B:157:0x03f9, B:159:0x0403, B:161:0x0407, B:192:0x0489, B:208:0x04d4, B:211:0x04e7, B:212:0x04fa, B:213:0x04ff, B:214:0x0507, B:215:0x0522, B:216:0x052b, B:218:0x0546, B:220:0x054c, B:222:0x0557, B:224:0x055d, B:226:0x0563, B:228:0x0572, B:269:0x065a, B:271:0x065e, B:272:0x0669, B:274:0x066d, B:276:0x0671, B:278:0x0675, B:280:0x067b, B:282:0x067f, B:284:0x0683, B:286:0x0687, B:288:0x068b, B:295:0x06af, B:296:0x06b2, B:298:0x06b7, B:300:0x06c1, B:302:0x06c7, B:304:0x06cf, B:312:0x06f8, B:307:0x06e8, B:309:0x06ec, B:313:0x0705, B:314:0x0708, B:316:0x070e, B:318:0x071c, B:319:0x0725, B:321:0x0729, B:323:0x0733, B:325:0x0737, B:328:0x073c, B:330:0x0741, B:332:0x074b, B:334:0x0753, B:354:0x079f, B:356:0x07a5, B:372:0x07ec, B:374:0x07f0, B:377:0x07fb, B:379:0x0803, B:380:0x0805, B:382:0x0832, B:384:0x0836, B:388:0x0846, B:390:0x084a, B:400:0x0873, B:398:0x086f, B:402:0x087d, B:393:0x0850, B:395:0x0862, B:397:0x086a, B:407:0x088c, B:409:0x089a, B:413:0x08a4, B:414:0x08a7, B:416:0x08ab, B:418:0x08b5, B:420:0x08ba, B:421:0x08bd, B:422:0x08c0, B:424:0x08c6, B:386:0x083c, B:426:0x08d3, B:428:0x08f1, B:431:0x08f8, B:434:0x0907, B:436:0x090c, B:438:0x0912, B:440:0x091d, B:442:0x0923, B:445:0x092b, B:447:0x0931, B:448:0x0936, B:433:0x0904, B:335:0x0756, B:337:0x075c, B:339:0x0760, B:341:0x0765, B:343:0x076d, B:345:0x077a, B:351:0x078f, B:352:0x0792, B:353:0x079c, B:358:0x07a9, B:360:0x07ad, B:362:0x07b1, B:364:0x07b5, B:365:0x07ba, B:367:0x07bf, B:370:0x07d6, B:451:0x093d, B:453:0x0947, B:455:0x094f, B:456:0x095e, B:457:0x0961, B:459:0x0966, B:461:0x096c, B:463:0x0970, B:465:0x0974, B:467:0x0978, B:469:0x0982, B:472:0x0988, B:473:0x098b, B:475:0x09a6, B:477:0x09af, B:479:0x09b7, B:482:0x09bf, B:484:0x09e7, B:486:0x09eb, B:488:0x09f1, B:499:0x0a09, B:501:0x0a18, B:504:0x0a22, B:505:0x0a24, B:500:0x0a11, B:506:0x0a27, B:508:0x0a2e, B:289:0x0696, B:230:0x0578, B:232:0x057e, B:235:0x059d, B:241:0x05b3, B:243:0x05bb, B:252:0x05f1, B:247:0x05d6, B:249:0x05de, B:251:0x05e8, B:256:0x061f, B:257:0x0623, B:259:0x0627, B:261:0x062b, B:262:0x0633, B:264:0x0645, B:265:0x064e, B:267:0x0652, B:268:0x0657, B:290:0x069a, B:292:0x069e, B:293:0x06a6, B:255:0x05f7, B:238:0x05a2, B:233:0x0595, B:510:0x0a34, B:514:0x0a3e, B:516:0x0a44, B:517:0x0a4b, B:519:0x0a57, B:520:0x0a6f, B:522:0x0a74, B:524:0x0a7c, B:561:0x0af5, B:525:0x0a80, B:527:0x0a90, B:528:0x0a93, B:530:0x0a97, B:532:0x0aa1, B:534:0x0aa6, B:536:0x0ab0, B:539:0x0ab8, B:541:0x0ac2, B:545:0x0acb, B:547:0x0ad1, B:549:0x0ad7, B:551:0x0add, B:554:0x0ae5, B:560:0x0af2, B:563:0x0b01, B:565:0x0b0c, B:569:0x0b14, B:571:0x0b1c, B:573:0x0b21, B:577:0x0b35, B:579:0x0b3b, B:625:0x0c17, B:629:0x0c37, B:632:0x0c40, B:634:0x0c45, B:636:0x0c4d, B:637:0x0c50, B:638:0x0c53, B:640:0x0c59, B:642:0x0c62, B:644:0x0c6a, B:646:0x0c70, B:648:0x0c7a, B:650:0x0c81, B:653:0x0c8a, B:655:0x0c90, B:658:0x0c98, B:660:0x0c9e, B:661:0x0ca4, B:667:0x0cb2, B:669:0x0cb6, B:670:0x0cbb, B:652:0x0c88, B:580:0x0b42, B:582:0x0b4a, B:584:0x0b4e, B:626:0x0c1b, B:628:0x0c27, B:587:0x0b57, B:589:0x0b5b, B:591:0x0b69, B:592:0x0b6f, B:594:0x0b77, B:599:0x0b86, B:601:0x0b93, B:606:0x0b9c, B:609:0x0be1, B:611:0x0be7, B:613:0x0beb, B:617:0x0bf4, B:621:0x0c03, B:622:0x0c07, B:624:0x0c12, B:562:0x0af9, B:671:0x0cc0, B:673:0x0cc6), top: B:774:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:631:0x0c3f  */
    /* JADX WARN: Removed duplicated region for block: B:652:0x0c88 A[Catch: IOException -> 0x0cd6, ParserException -> 0x0cdb, DrmSession$DrmSessionException -> 0x0cf8, DataSourceException -> 0x0cfc, ExoPlaybackException -> 0x0d03, RuntimeException -> 0x0e00, BehindLiveWindowException -> 0x0e1c, PHI: r3
  0x0c88: PHI (r3v67 long) = (r3v66 long), (r3v66 long), (r3v66 long), (r3v66 long), (r3v66 long), (r3v76 long) binds: [B:630:0x0c3d, B:639:0x0c57, B:641:0x0c60, B:643:0x0c68, B:645:0x0c6e, B:647:0x0c78] A[DONT_GENERATE, DONT_INLINE], TryCatch #4 {ParserException -> 0x0cdb, DataSourceException -> 0x0cfc, ExoPlaybackException -> 0x0d03, DrmSession$DrmSessionException -> 0x0cf8, BehindLiveWindowException -> 0x0e1c, IOException -> 0x0cd6, RuntimeException -> 0x0e00, blocks: (B:3:0x000a, B:4:0x0010, B:6:0x0014, B:8:0x001a, B:9:0x0022, B:11:0x002a, B:13:0x0037, B:14:0x003d, B:16:0x0046, B:18:0x004c, B:20:0x0052, B:21:0x0054, B:23:0x005f, B:25:0x0065, B:15:0x0040, B:26:0x0068, B:28:0x0072, B:30:0x007d, B:32:0x0085, B:33:0x0088, B:34:0x008b, B:35:0x0092, B:36:0x00a1, B:37:0x00ae, B:39:0x00b8, B:42:0x00c2, B:43:0x00d2, B:45:0x00e2, B:47:0x00ed, B:51:0x00fa, B:50:0x00f5, B:52:0x00fd, B:53:0x0100, B:58:0x0111, B:56:0x010a, B:59:0x0116, B:62:0x0135, B:63:0x0156, B:65:0x0168, B:66:0x0171, B:67:0x0189, B:68:0x0191, B:70:0x0197, B:72:0x01a0, B:126:0x033e, B:127:0x0341, B:75:0x01aa, B:76:0x01b5, B:77:0x01c9, B:80:0x01dc, B:83:0x01e6, B:84:0x01f7, B:651:0x0c87, B:85:0x0204, B:87:0x0214, B:88:0x021a, B:89:0x0227, B:91:0x0235, B:92:0x0247, B:93:0x0263, B:94:0x026e, B:96:0x027a, B:97:0x0286, B:98:0x0299, B:100:0x02a8, B:101:0x02ad, B:103:0x02bb, B:104:0x02c7, B:106:0x02db, B:107:0x02e5, B:108:0x02ea, B:110:0x02f0, B:112:0x02f8, B:114:0x02fc, B:116:0x0302, B:118:0x030c, B:119:0x0311, B:121:0x0317, B:128:0x0346, B:130:0x034a, B:124:0x032a, B:131:0x034e, B:132:0x0353, B:134:0x035d, B:136:0x0361, B:138:0x0365, B:139:0x0374, B:141:0x0383, B:158:0x03fe, B:143:0x03b5, B:145:0x03bd, B:147:0x03c9, B:149:0x03e3, B:163:0x040b, B:165:0x0412, B:167:0x0416, B:169:0x041a, B:171:0x0422, B:173:0x0428, B:174:0x042b, B:176:0x0431, B:178:0x0435, B:179:0x0442, B:184:0x045b, B:189:0x0471, B:191:0x047f, B:152:0x03e8, B:153:0x03eb, B:155:0x03f5, B:157:0x03f9, B:159:0x0403, B:161:0x0407, B:192:0x0489, B:208:0x04d4, B:211:0x04e7, B:212:0x04fa, B:213:0x04ff, B:214:0x0507, B:215:0x0522, B:216:0x052b, B:218:0x0546, B:220:0x054c, B:222:0x0557, B:224:0x055d, B:226:0x0563, B:228:0x0572, B:269:0x065a, B:271:0x065e, B:272:0x0669, B:274:0x066d, B:276:0x0671, B:278:0x0675, B:280:0x067b, B:282:0x067f, B:284:0x0683, B:286:0x0687, B:288:0x068b, B:295:0x06af, B:296:0x06b2, B:298:0x06b7, B:300:0x06c1, B:302:0x06c7, B:304:0x06cf, B:312:0x06f8, B:307:0x06e8, B:309:0x06ec, B:313:0x0705, B:314:0x0708, B:316:0x070e, B:318:0x071c, B:319:0x0725, B:321:0x0729, B:323:0x0733, B:325:0x0737, B:328:0x073c, B:330:0x0741, B:332:0x074b, B:334:0x0753, B:354:0x079f, B:356:0x07a5, B:372:0x07ec, B:374:0x07f0, B:377:0x07fb, B:379:0x0803, B:380:0x0805, B:382:0x0832, B:384:0x0836, B:388:0x0846, B:390:0x084a, B:400:0x0873, B:398:0x086f, B:402:0x087d, B:393:0x0850, B:395:0x0862, B:397:0x086a, B:407:0x088c, B:409:0x089a, B:413:0x08a4, B:414:0x08a7, B:416:0x08ab, B:418:0x08b5, B:420:0x08ba, B:421:0x08bd, B:422:0x08c0, B:424:0x08c6, B:386:0x083c, B:426:0x08d3, B:428:0x08f1, B:431:0x08f8, B:434:0x0907, B:436:0x090c, B:438:0x0912, B:440:0x091d, B:442:0x0923, B:445:0x092b, B:447:0x0931, B:448:0x0936, B:433:0x0904, B:335:0x0756, B:337:0x075c, B:339:0x0760, B:341:0x0765, B:343:0x076d, B:345:0x077a, B:351:0x078f, B:352:0x0792, B:353:0x079c, B:358:0x07a9, B:360:0x07ad, B:362:0x07b1, B:364:0x07b5, B:365:0x07ba, B:367:0x07bf, B:370:0x07d6, B:451:0x093d, B:453:0x0947, B:455:0x094f, B:456:0x095e, B:457:0x0961, B:459:0x0966, B:461:0x096c, B:463:0x0970, B:465:0x0974, B:467:0x0978, B:469:0x0982, B:472:0x0988, B:473:0x098b, B:475:0x09a6, B:477:0x09af, B:479:0x09b7, B:482:0x09bf, B:484:0x09e7, B:486:0x09eb, B:488:0x09f1, B:499:0x0a09, B:501:0x0a18, B:504:0x0a22, B:505:0x0a24, B:500:0x0a11, B:506:0x0a27, B:508:0x0a2e, B:289:0x0696, B:230:0x0578, B:232:0x057e, B:235:0x059d, B:241:0x05b3, B:243:0x05bb, B:252:0x05f1, B:247:0x05d6, B:249:0x05de, B:251:0x05e8, B:256:0x061f, B:257:0x0623, B:259:0x0627, B:261:0x062b, B:262:0x0633, B:264:0x0645, B:265:0x064e, B:267:0x0652, B:268:0x0657, B:290:0x069a, B:292:0x069e, B:293:0x06a6, B:255:0x05f7, B:238:0x05a2, B:233:0x0595, B:510:0x0a34, B:514:0x0a3e, B:516:0x0a44, B:517:0x0a4b, B:519:0x0a57, B:520:0x0a6f, B:522:0x0a74, B:524:0x0a7c, B:561:0x0af5, B:525:0x0a80, B:527:0x0a90, B:528:0x0a93, B:530:0x0a97, B:532:0x0aa1, B:534:0x0aa6, B:536:0x0ab0, B:539:0x0ab8, B:541:0x0ac2, B:545:0x0acb, B:547:0x0ad1, B:549:0x0ad7, B:551:0x0add, B:554:0x0ae5, B:560:0x0af2, B:563:0x0b01, B:565:0x0b0c, B:569:0x0b14, B:571:0x0b1c, B:573:0x0b21, B:577:0x0b35, B:579:0x0b3b, B:625:0x0c17, B:629:0x0c37, B:632:0x0c40, B:634:0x0c45, B:636:0x0c4d, B:637:0x0c50, B:638:0x0c53, B:640:0x0c59, B:642:0x0c62, B:644:0x0c6a, B:646:0x0c70, B:648:0x0c7a, B:650:0x0c81, B:653:0x0c8a, B:655:0x0c90, B:658:0x0c98, B:660:0x0c9e, B:661:0x0ca4, B:667:0x0cb2, B:669:0x0cb6, B:670:0x0cbb, B:652:0x0c88, B:580:0x0b42, B:582:0x0b4a, B:584:0x0b4e, B:626:0x0c1b, B:628:0x0c27, B:587:0x0b57, B:589:0x0b5b, B:591:0x0b69, B:592:0x0b6f, B:594:0x0b77, B:599:0x0b86, B:601:0x0b93, B:606:0x0b9c, B:609:0x0be1, B:611:0x0be7, B:613:0x0beb, B:617:0x0bf4, B:621:0x0c03, B:622:0x0c07, B:624:0x0c12, B:562:0x0af9, B:671:0x0cc0, B:673:0x0cc6), top: B:774:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:655:0x0c90 A[Catch: IOException -> 0x0cd6, ParserException -> 0x0cdb, DrmSession$DrmSessionException -> 0x0cf8, DataSourceException -> 0x0cfc, ExoPlaybackException -> 0x0d03, RuntimeException -> 0x0e00, BehindLiveWindowException -> 0x0e1c, TryCatch #4 {ParserException -> 0x0cdb, DataSourceException -> 0x0cfc, ExoPlaybackException -> 0x0d03, DrmSession$DrmSessionException -> 0x0cf8, BehindLiveWindowException -> 0x0e1c, IOException -> 0x0cd6, RuntimeException -> 0x0e00, blocks: (B:3:0x000a, B:4:0x0010, B:6:0x0014, B:8:0x001a, B:9:0x0022, B:11:0x002a, B:13:0x0037, B:14:0x003d, B:16:0x0046, B:18:0x004c, B:20:0x0052, B:21:0x0054, B:23:0x005f, B:25:0x0065, B:15:0x0040, B:26:0x0068, B:28:0x0072, B:30:0x007d, B:32:0x0085, B:33:0x0088, B:34:0x008b, B:35:0x0092, B:36:0x00a1, B:37:0x00ae, B:39:0x00b8, B:42:0x00c2, B:43:0x00d2, B:45:0x00e2, B:47:0x00ed, B:51:0x00fa, B:50:0x00f5, B:52:0x00fd, B:53:0x0100, B:58:0x0111, B:56:0x010a, B:59:0x0116, B:62:0x0135, B:63:0x0156, B:65:0x0168, B:66:0x0171, B:67:0x0189, B:68:0x0191, B:70:0x0197, B:72:0x01a0, B:126:0x033e, B:127:0x0341, B:75:0x01aa, B:76:0x01b5, B:77:0x01c9, B:80:0x01dc, B:83:0x01e6, B:84:0x01f7, B:651:0x0c87, B:85:0x0204, B:87:0x0214, B:88:0x021a, B:89:0x0227, B:91:0x0235, B:92:0x0247, B:93:0x0263, B:94:0x026e, B:96:0x027a, B:97:0x0286, B:98:0x0299, B:100:0x02a8, B:101:0x02ad, B:103:0x02bb, B:104:0x02c7, B:106:0x02db, B:107:0x02e5, B:108:0x02ea, B:110:0x02f0, B:112:0x02f8, B:114:0x02fc, B:116:0x0302, B:118:0x030c, B:119:0x0311, B:121:0x0317, B:128:0x0346, B:130:0x034a, B:124:0x032a, B:131:0x034e, B:132:0x0353, B:134:0x035d, B:136:0x0361, B:138:0x0365, B:139:0x0374, B:141:0x0383, B:158:0x03fe, B:143:0x03b5, B:145:0x03bd, B:147:0x03c9, B:149:0x03e3, B:163:0x040b, B:165:0x0412, B:167:0x0416, B:169:0x041a, B:171:0x0422, B:173:0x0428, B:174:0x042b, B:176:0x0431, B:178:0x0435, B:179:0x0442, B:184:0x045b, B:189:0x0471, B:191:0x047f, B:152:0x03e8, B:153:0x03eb, B:155:0x03f5, B:157:0x03f9, B:159:0x0403, B:161:0x0407, B:192:0x0489, B:208:0x04d4, B:211:0x04e7, B:212:0x04fa, B:213:0x04ff, B:214:0x0507, B:215:0x0522, B:216:0x052b, B:218:0x0546, B:220:0x054c, B:222:0x0557, B:224:0x055d, B:226:0x0563, B:228:0x0572, B:269:0x065a, B:271:0x065e, B:272:0x0669, B:274:0x066d, B:276:0x0671, B:278:0x0675, B:280:0x067b, B:282:0x067f, B:284:0x0683, B:286:0x0687, B:288:0x068b, B:295:0x06af, B:296:0x06b2, B:298:0x06b7, B:300:0x06c1, B:302:0x06c7, B:304:0x06cf, B:312:0x06f8, B:307:0x06e8, B:309:0x06ec, B:313:0x0705, B:314:0x0708, B:316:0x070e, B:318:0x071c, B:319:0x0725, B:321:0x0729, B:323:0x0733, B:325:0x0737, B:328:0x073c, B:330:0x0741, B:332:0x074b, B:334:0x0753, B:354:0x079f, B:356:0x07a5, B:372:0x07ec, B:374:0x07f0, B:377:0x07fb, B:379:0x0803, B:380:0x0805, B:382:0x0832, B:384:0x0836, B:388:0x0846, B:390:0x084a, B:400:0x0873, B:398:0x086f, B:402:0x087d, B:393:0x0850, B:395:0x0862, B:397:0x086a, B:407:0x088c, B:409:0x089a, B:413:0x08a4, B:414:0x08a7, B:416:0x08ab, B:418:0x08b5, B:420:0x08ba, B:421:0x08bd, B:422:0x08c0, B:424:0x08c6, B:386:0x083c, B:426:0x08d3, B:428:0x08f1, B:431:0x08f8, B:434:0x0907, B:436:0x090c, B:438:0x0912, B:440:0x091d, B:442:0x0923, B:445:0x092b, B:447:0x0931, B:448:0x0936, B:433:0x0904, B:335:0x0756, B:337:0x075c, B:339:0x0760, B:341:0x0765, B:343:0x076d, B:345:0x077a, B:351:0x078f, B:352:0x0792, B:353:0x079c, B:358:0x07a9, B:360:0x07ad, B:362:0x07b1, B:364:0x07b5, B:365:0x07ba, B:367:0x07bf, B:370:0x07d6, B:451:0x093d, B:453:0x0947, B:455:0x094f, B:456:0x095e, B:457:0x0961, B:459:0x0966, B:461:0x096c, B:463:0x0970, B:465:0x0974, B:467:0x0978, B:469:0x0982, B:472:0x0988, B:473:0x098b, B:475:0x09a6, B:477:0x09af, B:479:0x09b7, B:482:0x09bf, B:484:0x09e7, B:486:0x09eb, B:488:0x09f1, B:499:0x0a09, B:501:0x0a18, B:504:0x0a22, B:505:0x0a24, B:500:0x0a11, B:506:0x0a27, B:508:0x0a2e, B:289:0x0696, B:230:0x0578, B:232:0x057e, B:235:0x059d, B:241:0x05b3, B:243:0x05bb, B:252:0x05f1, B:247:0x05d6, B:249:0x05de, B:251:0x05e8, B:256:0x061f, B:257:0x0623, B:259:0x0627, B:261:0x062b, B:262:0x0633, B:264:0x0645, B:265:0x064e, B:267:0x0652, B:268:0x0657, B:290:0x069a, B:292:0x069e, B:293:0x06a6, B:255:0x05f7, B:238:0x05a2, B:233:0x0595, B:510:0x0a34, B:514:0x0a3e, B:516:0x0a44, B:517:0x0a4b, B:519:0x0a57, B:520:0x0a6f, B:522:0x0a74, B:524:0x0a7c, B:561:0x0af5, B:525:0x0a80, B:527:0x0a90, B:528:0x0a93, B:530:0x0a97, B:532:0x0aa1, B:534:0x0aa6, B:536:0x0ab0, B:539:0x0ab8, B:541:0x0ac2, B:545:0x0acb, B:547:0x0ad1, B:549:0x0ad7, B:551:0x0add, B:554:0x0ae5, B:560:0x0af2, B:563:0x0b01, B:565:0x0b0c, B:569:0x0b14, B:571:0x0b1c, B:573:0x0b21, B:577:0x0b35, B:579:0x0b3b, B:625:0x0c17, B:629:0x0c37, B:632:0x0c40, B:634:0x0c45, B:636:0x0c4d, B:637:0x0c50, B:638:0x0c53, B:640:0x0c59, B:642:0x0c62, B:644:0x0c6a, B:646:0x0c70, B:648:0x0c7a, B:650:0x0c81, B:653:0x0c8a, B:655:0x0c90, B:658:0x0c98, B:660:0x0c9e, B:661:0x0ca4, B:667:0x0cb2, B:669:0x0cb6, B:670:0x0cbb, B:652:0x0c88, B:580:0x0b42, B:582:0x0b4a, B:584:0x0b4e, B:626:0x0c1b, B:628:0x0c27, B:587:0x0b57, B:589:0x0b5b, B:591:0x0b69, B:592:0x0b6f, B:594:0x0b77, B:599:0x0b86, B:601:0x0b93, B:606:0x0b9c, B:609:0x0be1, B:611:0x0be7, B:613:0x0beb, B:617:0x0bf4, B:621:0x0c03, B:622:0x0c07, B:624:0x0c12, B:562:0x0af9, B:671:0x0cc0, B:673:0x0cc6), top: B:774:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:657:0x0c97  */
    /* JADX WARN: Removed duplicated region for block: B:714:0x0d4c  */
    /* JADX WARN: Removed duplicated region for block: B:719:0x0d59  */
    /* JADX WARN: Removed duplicated region for block: B:731:0x0d87  */
    /* JADX WARN: Removed duplicated region for block: B:766:0x0e2b  */
    /* JADX WARN: Removed duplicated region for block: B:820:0x0939 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:832:0x0a31 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.E5s] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.E5s] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.E5s] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.E5s] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.E5s] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.Djf, X.E5s] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r38) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 3738
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6440E5s.handleMessage(android.os.Message):boolean");
    }

    @Override // X.InterfaceC6461E7a
    public final void onPlaybackParametersChanged(C6233Dyb c6233Dyb) {
        C6447E6a.A00(this.A0Y, c6233Dyb, 16);
    }

    @Override // X.E6A
    public final void prepare() {
        this.A0Y.ARb(29).A03();
    }

    @Override // X.E6A
    public final void stop() {
        this.A0Y.ARb(6).A03();
    }

    private void A0R(Timeline timeline, Timeline timeline2, Dy6 dy6, Dy6 dy62, long j, boolean z) {
        if (!A0i(timeline, dy6)) {
            C6233Dyb c6233Dyb = AnonymousClass002.A1P(dy6.A00, -1) ? C6233Dyb.A03 : this.A0F.A05;
            E68 e68 = this.A0a;
            if (e68.AIo().equals(c6233Dyb)) {
                return;
            }
            BV6.A1A(this.A0Y, 16);
            e68.Ae1(c6233Dyb);
            A0P(this.A0F.A05, c6233Dyb.A01, false, false);
            return;
        }
        Object obj = dy6.A04;
        E6B e6b = this.A0V;
        int iA01 = E6B.A01(e6b, timeline, obj);
        C5998Dth c5998Dth = this.A0W;
        timeline.A0E(c5998Dth, iA01, 0L);
        InterfaceC5858Dqs interfaceC5858Dqs = this.A0b;
        interfaceC5858Dqs.Adf(c5998Dth.A08);
        long jA02 = -9223372036854775807L;
        if (j != -9223372036854775807L) {
            jA02 = A02(timeline, obj, j);
        } else {
            if (C6xC.A00(!AnonymousClass002.A1M(timeline2.A02()) ? timeline2.A0E(c5998Dth, E6B.A01(e6b, timeline2, dy62.A04), 0L).A0C : null, c5998Dth.A0C) && !z) {
                return;
            }
        }
        interfaceC5858Dqs.Aev(jA02);
    }

    public C6440E5s(Context context, Looper looper, E7C e7c, E81 e81, E83 e83, InterfaceC5858Dqs interfaceC5858Dqs, InterfaceC5745Dog interfaceC5745Dog, C5813Dpx c5813Dpx, DpX dpX, E65 e65, E6Y e6y, AbstractC5823DqC abstractC5823DqC, E6W e6w, InterfaceC5047DQt interfaceC5047DQt, final InterfaceC6271DzO interfaceC6271DzO, C6041Duc c6041Duc, InterfaceC6068Dv6[] interfaceC6068Dv6Arr, InterfaceC6068Dv6[] interfaceC6068Dv6Arr2, int i, long j, boolean z) {
        C5813Dpx c5813Dpx2 = c5813Dpx;
        this.A0u = e83;
        this.A0i = abstractC5823DqC;
        this.A0j = e6w;
        this.A0c = interfaceC5745Dog;
        this.A0k = interfaceC5047DQt;
        this.A03 = i;
        this.A0I = dpX;
        this.A0b = interfaceC5858Dqs;
        this.A0r = j;
        this.A0m = z;
        this.A0X = e7c;
        this.A0h = e6y;
        this.A0B = e81;
        this.A0g = e65;
        this.A0v = c6041Duc.A01;
        this.A0U = interfaceC5745Dog.ACi(e6y);
        this.A0o = interfaceC5745Dog.Abj(e6y);
        E60 e60A00 = E60.A00(e6w);
        this.A0F = e60A00;
        E78 e78 = new E78();
        e78.A02 = e60A00;
        this.A0C = e78;
        int length = interfaceC6068Dv6Arr.length;
        this.A0p = new InterfaceC5921Ds8[length];
        this.A0w = new boolean[length];
        DoW doW = (DoW) abstractC5823DqC;
        this.A0q = new C6445E5y[length];
        boolean z2 = false;
        for (int i2 = 0; i2 < length; i2++) {
            InterfaceC6068Dv6 interfaceC6068Dv6 = interfaceC6068Dv6Arr[i2];
            interfaceC6068Dv6.ANc(e7c, e6y, i2);
            InterfaceC5921Ds8[] interfaceC5921Ds8Arr = this.A0p;
            interfaceC5921Ds8Arr[i2] = interfaceC6068Dv6.ADR();
            if (doW != null) {
                AbstractC6146Dwo abstractC6146Dwo = (AbstractC6146Dwo) interfaceC5921Ds8Arr[i2];
                synchronized (abstractC6146Dwo.A0H) {
                    abstractC6146Dwo.A07 = doW;
                }
            }
            InterfaceC6068Dv6 interfaceC6068Dv62 = interfaceC6068Dv6Arr2[i2];
            if (interfaceC6068Dv62 != null) {
                interfaceC6068Dv62.ANc(e7c, e6y, i2);
                z2 = true;
            }
            this.A0q[i2] = new C6445E5y(interfaceC6068Dv6Arr[i2], interfaceC6068Dv6Arr2[i2], i2);
        }
        this.A0n = z2;
        this.A0a = new E68(e7c, this);
        this.A0l = C3cG.A0h();
        this.A0W = new C5998Dth();
        this.A0V = new E6B();
        abstractC5823DqC.A00 = this;
        abstractC5823DqC.A01 = interfaceC5047DQt;
        this.A0J = true;
        E6I e6iA7o = e7c.A7o(null, looper);
        this.A0t = e6iA7o;
        this.A0d = new C6441E5t(e6iA7o, e81, new E6S(this), e65);
        this.A0e = new C6430E5i(e6iA7o, this, e65, e6y);
        c5813Dpx2 = c5813Dpx == null ? new C5813Dpx(null) : c5813Dpx2;
        this.A0f = c5813Dpx2;
        Looper looperA00 = c5813Dpx2.A00();
        this.A0s = looperA00;
        E6I e6iA7o2 = e7c.A7o(this, looperA00);
        this.A0Y = e6iA7o2;
        this.A0Z = new E62(context, looperA00, this);
        InterfaceC6271DzO interfaceC6271DzO2 = new InterfaceC6271DzO() { // from class: X.E73
            @Override // X.InterfaceC6271DzO
            public final void AX9(MediaFormat mediaFormat, C6154Dwx c6154Dwx, long j2, long j3) {
                C6440E5s c6440E5s = this.A00;
                interfaceC6271DzO.AX9(mediaFormat, c6154Dwx, j2, j3);
                c6440E5s.AX9(mediaFormat, c6154Dwx, j2, j3);
            }
        };
        C6447E6a c6447E6aA00 = E6I.A00();
        c6447E6aA00.A00 = e6iA7o2.A00.obtainMessage(35, interfaceC6271DzO2);
        c6447E6aA00.A01 = e6iA7o2;
        c6447E6aA00.A03();
    }
}

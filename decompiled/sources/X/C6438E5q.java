package X;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.ExoTimeoutException;
import com.google.common.base.Function;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.E5q, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6438E5q extends AbstractC5797Dph implements InterfaceC5661Dmq {
    public static final C6438E5q $redex_init_class = null;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public Surface A05;
    public E7U A06;
    public C6154Dwx A07;
    public C6154Dwx A08;
    public C10388Har A09;
    public C10388Har A0A;
    public E1B A0B;
    public C6232Dya A0C;
    public DXD A0D;
    public C6173DxG A0E;
    public C6173DxG A0F;
    public E60 A0G;
    public C5725DoK A0H;
    public InterfaceC6437E5p A0I;
    public InterfaceC6271DzO A0J;
    public ImmutableSet<Integer> A0K;
    public Object A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public float A0R;
    public int A0S;
    public int A0T;
    public int A0U;
    public DrN A0V;
    public C10388Har A0W;
    public C6226DyM A0X;
    public E81 A0Y;
    public DpX A0Z;
    public boolean A0a;
    public final Context A0b;
    public final Looper A0c;
    public final E1B A0d;
    public final Dn6 A0e;
    public final E6B A0f;
    public final E61<Integer> A0g;
    public final E7C A0h;
    public final InterfaceC6459E6s A0i;
    public final C6443E5w<E76> A0j;
    public final C6464E7e A0k;
    public final C6299Dzv A0l;
    public final E84 A0m;
    public final E83 A0n;
    public final E6A A0o;
    public final E65 A0p;
    public final InterfaceC5791Dpa A0q;
    public final AbstractC5823DqC A0r;
    public final E6W A0s;
    public final List<C6434E5m> A0t;
    public final CopyOnWriteArraySet<E85> A0u;
    public final long A0v;
    public final C5778DpK A0w = new C5778DpK();
    public final E6E A0x;
    public final SurfaceHolderCallbackC6446E5z A0y;
    public final E6l A0z;
    public final E6m A10;
    public final InterfaceC5047DQt A11;
    public final boolean A12;
    public final boolean A13;
    public final InterfaceC6068Dv6[] A14;
    public final InterfaceC6068Dv6[] A15;

    public static Pair A09(Timeline timeline, Timeline timeline2, C6438E5q c6438E5q, int i, long j) {
        long j2 = -9223372036854775807L;
        int i2 = -1;
        if (AnonymousClass002.A1M(timeline.A02())) {
            i2 = i;
            j2 = j;
        } else if (!AnonymousClass002.A1M(timeline2.A02())) {
            C5998Dth c5998Dth = ((AbstractC5797Dph) c6438E5q).A00;
            E6B e6b = c6438E5q.A0f;
            Pair pairA09 = timeline.A09(e6b, c5998Dth, i, Util.A0A(j));
            Object obj = pairA09.first;
            if (timeline2.A06(obj) != -1) {
                return pairA09;
            }
            Object objA06 = C6439E5r.A06(e6b, c5998Dth, timeline, timeline2, obj, c6438E5q.A03, false);
            if (objA06 != null) {
                timeline2.A0B(e6b, objA06);
                int i3 = e6b.A00;
                return A0A(timeline2, c6438E5q, i3, Util.A0B(BV7.A0d(c5998Dth, timeline2, i3).A02));
            }
        }
        return A0A(timeline2, c6438E5q, i2, j2);
    }

    public static Pair A0A(Timeline timeline, C6438E5q c6438E5q, int i, long j) {
        int iA07 = i;
        if (AnonymousClass002.A1M(timeline.A02())) {
            c6438E5q.A00 = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            c6438E5q.A04 = j;
            return null;
        }
        if (i == -1 || i >= timeline.A02()) {
            iA07 = timeline.A07(false);
            j = Util.A0B(BV7.A0d(((AbstractC5797Dph) c6438E5q).A00, timeline, iA07).A02);
        }
        return timeline.A09(c6438E5q.A0f, ((AbstractC5797Dph) c6438E5q).A00, iA07, Util.A0A(j));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0H(androidx.media3.exoplayer.ExoPlaybackException r9, X.C6438E5q r10) {
        /*
            r3 = r10
            X.E60 r1 = r10.A0G
            X.Dy6 r0 = r1.A09
            X.E60 r2 = r1.A08(r0)
            long r0 = r2.A0I
            r2.A0G = r0
            r0 = 0
            r2.A0K = r0
            r0 = 1
            X.E60 r1 = r2.A03(r0)
            r0 = 0
            X.E60 r4 = r1.A0A(r0)
            if (r9 == 0) goto L21
            X.E60 r4 = r4.A07(r9)
        L21:
            int r0 = r10.A02
            int r0 = r0 + 1
            r10.A02 = r0
            X.E6A r0 = r10.A0o
            r0.stop()
            androidx.media3.common.Timeline r0 = r4.A06
            int r0 = r0.A02()
            boolean r0 = X.AnonymousClass002.A1M(r0)
            if (r0 == 0) goto L47
            X.E60 r0 = r10.A0G
            androidx.media3.common.Timeline r0 = r0.A06
            int r0 = r0.A02()
            boolean r0 = X.AnonymousClass002.A1M(r0)
            r10 = 1
            if (r0 == 0) goto L48
        L47:
            r10 = 0
        L48:
            long r8 = A07(r3, r4)
            r7 = -1
            r5 = 3
            r6 = 7
            A0M(r3, r4, r5, r6, r7, r8, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6438E5q.A0H(androidx.media3.exoplayer.ExoPlaybackException, X.E5q):void");
    }

    @Override // X.Dn6
    public final void Aas(int i, int i2) {
        A0J(this);
        List<C6434E5m> list = this.A0t;
        int size = list.size();
        int iMin = Math.min(i2, size);
        if (i >= size || i == iMin) {
            return;
        }
        E60 e60 = this.A0G;
        int iA05 = A05(this, e60);
        long jA06 = A06(this, e60);
        Timeline timeline = e60.A06;
        int size2 = list.size();
        this.A02++;
        A0G(i, iMin);
        C6428E5g c6428E5g = new C6428E5g(this.A0I, list);
        E60 e60A0C = A0C(A09(timeline, c6428E5g, this, iA05, jA06), c6428E5g, this, e60);
        int i3 = e60A0C.A01;
        if (i3 != 1 && i3 != 4 && i < iMin && iMin == size2 && iA05 >= e60A0C.A06.A02()) {
            e60A0C = e60A0C.A03(4).A0A(false);
        }
        this.A0o.Aat(this.A0I, i, iMin);
        A0M(this, e60A0C, 3, 7, -1, A07(this, e60A0C), !e60A0C.A09.A04.equals(this.A0G.A09.A04));
    }

    @Override // X.Dn6
    public final void Ae1(C6233Dyb c6233Dyb) {
        A0J(this);
        if (c6233Dyb == null) {
            c6233Dyb = C6233Dyb.A03;
        }
        E60 e60 = this.A0G;
        if (e60.A05.equals(c6233Dyb)) {
            return;
        }
        if (this.A12) {
            this.A0o.Ae1(c6233Dyb);
            return;
        }
        E60 e60A05 = e60.A05(c6233Dyb);
        this.A02++;
        this.A0o.Ae1(c6233Dyb);
        A0M(this, e60A05, 3, 4, -1, -9223372036854775807L, false);
    }

    @Override // X.Dn6
    public final void prepare() {
        E60 e60A03 = AbstractC5797Dph.A03(this);
        if (e60A03.A01 == 1) {
            E60 e60A07 = e60A03.A07(null);
            int i = AnonymousClass002.A1M(e60A07.A06.A02()) ? 4 : 2;
            E60 e60A032 = e60A07.A03(i);
            if (i == 4) {
                e60A032 = e60A032.A0A(false);
            }
            this.A02++;
            this.A0o.prepare();
            A0M(this, e60A032, 4, 4, -1, -9223372036854775807L, false);
        }
    }

    static {
        C2369BVx.A00("media3.exoplayer");
    }

    public static int A05(C6438E5q c6438E5q, E60 e60) {
        Timeline timeline = e60.A06;
        if (AnonymousClass002.A1M(timeline.A02())) {
            return c6438E5q.A00;
        }
        return E6B.A01(c6438E5q.A0f, timeline, e60.A09.A04);
    }

    public static long A06(C6438E5q c6438E5q, E60 e60) {
        long jA07;
        Dy6 dy6 = e60.A09;
        if (AnonymousClass002.A1P(dy6.A00, -1)) {
            Timeline timeline = e60.A06;
            Object obj = dy6.A04;
            E6B e6b = c6438E5q.A0f;
            timeline.A0B(e6b, obj);
            long j = e60.A04;
            if (j != -9223372036854775807L) {
                return Util.A0B(e6b.A02) + Util.A0B(j);
            }
            jA07 = BV7.A0d(((AbstractC5797Dph) c6438E5q).A00, timeline, A05(c6438E5q, e60)).A02;
        } else {
            jA07 = A07(c6438E5q, e60);
        }
        return Util.A0B(jA07);
    }

    public static long A07(C6438E5q c6438E5q, E60 e60) {
        Timeline timeline = e60.A06;
        if (AnonymousClass002.A1M(timeline.A02())) {
            return Util.A0A(c6438E5q.A04);
        }
        long jA01 = e60.A0F ? e60.A01() : e60.A0I;
        Dy6 dy6 = e60.A09;
        if (AnonymousClass002.A1P(dy6.A00, -1)) {
            return jA01;
        }
        Object obj = dy6.A04;
        E6B e6b = c6438E5q.A0f;
        timeline.A0B(e6b, obj);
        return jA01 + e6b.A02;
    }

    public static long A08(E60 e60) {
        C5998Dth c5998Dth = new C5998Dth();
        E6B e6b = new E6B();
        Timeline timeline = e60.A06;
        timeline.A0B(e6b, e60.A09.A04);
        long j = e60.A04;
        return j == -9223372036854775807L ? BV7.A0d(c5998Dth, timeline, e6b.A00).A02 : e6b.A02 + j;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.E60 A0C(android.util.Pair r21, androidx.media3.common.Timeline r22, X.C6438E5q r23, X.E60 r24) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6438E5q.A0C(android.util.Pair, androidx.media3.common.Timeline, X.E5q, X.E60):X.E60");
    }

    public static C6322E0x A0D(C6438E5q c6438E5q, Dv4 dv4) {
        int iA05 = A05(c6438E5q, c6438E5q.A0G);
        E6A e6a = c6438E5q.A0o;
        Timeline timeline = c6438E5q.A0G.A06;
        if (iA05 == -1) {
            iA05 = 0;
        }
        return new C6322E0x(e6a.AIn(), timeline, c6438E5q.A0h, e6a, dv4, iA05);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0F() {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6438E5q.A0F():void");
    }

    private void A0G(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            this.A0t.remove(i3);
        }
        C6429E5h c6429E5h = (C6429E5h) this.A0I;
        int i4 = i2 - i;
        int[] iArr = c6429E5h.A02;
        int length = iArr.length;
        int[] iArr2 = new int[length - i4];
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6++) {
            int i7 = iArr[i6];
            if (i7 < i || i7 >= i2) {
                int i8 = i6 - i5;
                if (i7 >= i) {
                    i7 -= i4;
                }
                iArr2[i8] = i7;
            } else {
                i5++;
            }
        }
        this.A0I = new C6429E5h(new Random(c6429E5h.A00.nextLong()), iArr2);
    }

    public static void A0J(C6438E5q c6438E5q) {
        c6438E5q.A0w.A00();
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = c6438E5q.A0c;
        if (threadCurrentThread != looper.getThread()) {
            String str = String.format(Locale.US, "Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", threadCurrentThread.getName(), looper.getThread().getName());
            if (c6438E5q.A0Q) {
                throw C3cG.A0Q(str);
            }
            CNC.A06("ExoPlayerImpl", str, c6438E5q.A0a ? null : BV4.A0T());
            c6438E5q.A0a = true;
        }
    }

    public static void A0K(C6438E5q c6438E5q, final int i, final int i2) {
        C6226DyM c6226DyM = c6438E5q.A0X;
        if (i == c6226DyM.A01 && i2 == c6226DyM.A00) {
            return;
        }
        c6438E5q.A0X = new C6226DyM(i, i2);
        C6443E5w<E76> c6443E5w = c6438E5q.A0j;
        c6443E5w.A03(new E7R() { // from class: X.E7E
            @Override // X.E7R
            public final void ANx(Object obj) {
                int i3 = i;
                int i4 = i2;
                C6438E5q c6438E5q2 = C6438E5q.$redex_init_class;
                ((E76) obj).onSurfaceSizeChanged(i3, i4);
            }
        }, 24);
        c6443E5w.A01();
        A0O(c6438E5q, new C6226DyM(i, i2), 2, 14);
    }

    public static void A0L(C6438E5q c6438E5q, int i, boolean z) {
        int i2;
        if (c6438E5q.A0O) {
            i2 = 4;
        } else {
            i2 = 1;
            if (c6438E5q.A0G.A02 != 1 || z) {
                i2 = 0;
            }
        }
        E60 e60 = c6438E5q.A0G;
        boolean z2 = e60.A0E;
        if (z2 == z && e60.A02 == i2) {
            return;
        }
        c6438E5q.A02++;
        if (e60.A0F) {
            Timeline timeline = e60.A06;
            Dy6 dy6 = e60.A09;
            long j = e60.A04;
            long j2 = e60.A03;
            int i3 = e60.A01;
            ExoPlaybackException exoPlaybackException = e60.A07;
            boolean z3 = e60.A0D;
            e60 = new E60(e60.A05, timeline, exoPlaybackException, dy6, e60.A08, e60.A0A, e60.A0B, e60.A0C, i3, e60.A00, e60.A02, j, j2, e60.A0G, e60.A0K, e60.A0J, e60.A01(), SystemClock.elapsedRealtime(), z3, z2, e60.A0F);
        }
        E60 e60A04 = e60.A04(i, i2, z);
        c6438E5q.A0o.Ae0(z, i, i2);
        A0M(c6438E5q, e60A04, 3, 4, -1, -9223372036854775807L, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x033a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012c A[PHI: r17
  0x012c: PHI (r17v5 boolean) = (r17v4 boolean), (r17v7 boolean) binds: [B:45:0x0126, B:47:0x012a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0M(X.C6438E5q r29, X.E60 r30, int r31, final int r32, int r33, long r34, boolean r36) {
        /*
            Method dump skipped, instructions count: 827
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6438E5q.A0M(X.E5q, X.E60, int, int, int, long, boolean):void");
    }

    public static void A0N(C6438E5q c6438E5q, Object obj) {
        boolean z;
        long j;
        Object obj2 = c6438E5q.A0L;
        if (obj2 == null || obj2 == obj) {
            z = false;
            j = -9223372036854775807L;
        } else {
            z = true;
            j = c6438E5q.A0v;
        }
        boolean zAfC = c6438E5q.A0o.AfC(obj, j);
        if (z) {
            Object obj3 = c6438E5q.A0L;
            Surface surface = c6438E5q.A05;
            if (obj3 == surface) {
                surface.release();
                c6438E5q.A05 = null;
            }
        }
        c6438E5q.A0L = obj;
        if (zAfC) {
            return;
        }
        A0H(ExoPlaybackException.A01(new ExoTimeoutException(3), 1003), c6438E5q);
    }

    public static void A0O(C6438E5q c6438E5q, Object obj, int i, int i2) {
        for (InterfaceC6068Dv6 interfaceC6068Dv6 : c6438E5q.A14) {
            if (i == -1 || interfaceC6068Dv6.ALv() == i) {
                C6322E0x.A00(A0D(c6438E5q, interfaceC6068Dv6), obj, i2);
            }
        }
        for (InterfaceC6068Dv6 interfaceC6068Dv62 : c6438E5q.A15) {
            if (interfaceC6068Dv62 != null && (i == -1 || interfaceC6068Dv62.ALv() == i)) {
                C6322E0x.A00(A0D(c6438E5q, interfaceC6068Dv62), obj, i2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0P(X.C6438E5q r18, java.util.List r19, boolean r20) {
        /*
            r10 = r18
            A0J(r10)
            r14 = -1
            X.E60 r0 = r10.A0G
            int r5 = A05(r10, r0)
            long r0 = r10.getCurrentPosition()
            int r2 = r10.A02
            r7 = 1
            int r2 = r2 + 1
            r10.A02 = r2
            java.util.List<X.E5m> r3 = r10.A0t
            boolean r2 = r3.isEmpty()
            r6 = 0
            if (r2 != 0) goto L27
            int r2 = r3.size()
            r10.A0G(r6, r2)
        L27:
            r2 = r19
            java.util.ArrayList r17 = A0E(r10, r2, r6)
            X.E5p r2 = r10.A0I
            X.E5g r8 = new X.E5g
            r8.<init>(r2, r3)
            int r2 = r8.A02()
            boolean r9 = X.AnonymousClass002.A1M(r2)
            if (r9 != 0) goto L48
            int r2 = r8.A01
            if (r14 < r2) goto L48
            androidx.media3.common.IllegalSeekPositionException r0 = new androidx.media3.common.IllegalSeekPositionException
            r0.<init>(r8)
            throw r0
        L48:
            if (r20 == 0) goto L53
            int r5 = r8.A07(r6)
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L53:
            X.E60 r3 = r10.A0G
            android.util.Pair r2 = A0A(r8, r10, r5, r0)
            X.E60 r4 = A0C(r2, r8, r10, r3)
            int r3 = r4.A01
            if (r5 == r14) goto L6b
            if (r3 == r7) goto L6b
            if (r9 != 0) goto L6a
            int r2 = r8.A01
            r3 = 2
            if (r5 < r2) goto L6b
        L6a:
            r3 = 4
        L6b:
            X.E60 r11 = r4.A03(r3)
            if (r3 == r7) goto L74
            r2 = 4
            if (r3 != r2) goto L78
        L74:
            X.E60 r11 = r11.A0A(r6)
        L78:
            X.E6A r15 = r10.A0o
            long r19 = androidx.media3.common.util.Util.A0A(r0)
            X.E5p r0 = r10.A0I
            r18 = r5
            r16 = r0
            r15.Adj(r16, r17, r18, r19)
            X.E60 r0 = r10.A0G
            X.Dy6 r0 = r0.A09
            java.lang.Object r1 = r0.A04
            X.Dy6 r0 = r11.A09
            java.lang.Object r0 = r0.A04
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto La7
            X.E60 r0 = r10.A0G
            androidx.media3.common.Timeline r0 = r0.A06
            int r0 = r0.A02()
            boolean r0 = X.AnonymousClass002.A1M(r0)
            r17 = 1
            if (r0 == 0) goto La9
        La7:
            r17 = 0
        La9:
            long r15 = A07(r10, r11)
            r12 = 3
            r13 = 7
            A0M(r10, r11, r12, r13, r14, r15, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6438E5q.A0P(X.E5q, java.util.List, boolean):void");
    }

    @Override // X.InterfaceC5661Dmq
    public final void release() {
        String str;
        String strA0x = BV7.A0x(this);
        String str2 = Util.A02;
        synchronized (C2369BVx.class) {
            str = C2369BVx.A00;
        }
        CNC.A03("ExoPlayerImpl", FGI.A0k("Release ", strA0x, " [ExoPlayerLib/2.8.1] [", str2, "] [", str, "]"));
        A0J(this);
        this.A0k.A00(false);
        E6l e6l = this.A0z;
        if (e6l.A00) {
            e6l.A00 = false;
        }
        E6m e6m = this.A10;
        if (e6m.A00) {
            e6m.A00 = false;
        }
        E6E e6e = this.A0x;
        if (e6e != null) {
            ((E6I) e6e.A04).A00.removeCallbacksAndMessages(null);
            e6e.A01.Aar(e6e.A00);
        }
        if (!this.A0o.AaB()) {
            C6443E5w<E76> c6443E5w = this.A0j;
            c6443E5w.A03(new C7583F4w(1), 10);
            c6443E5w.A01();
        }
        this.A0j.A02();
        ((E6I) this.A0i).A00.removeCallbacksAndMessages(null);
        InterfaceC5047DQt interfaceC5047DQt = this.A11;
        E65 e65 = this.A0p;
        interfaceC5047DQt.Aaq(e65);
        E60 e60A0A = this.A0G.A03(1).A0A(false);
        this.A0G = e60A0A;
        E60 e60A08 = e60A0A.A08(e60A0A.A09);
        this.A0G = e60A08;
        e60A08.A0G = e60A08.A0I;
        this.A0G.A0K = 0L;
        e65.release();
        if (!AbstractC5653Dmh.A03(EnumC5618Dlz.A0r) && !AbstractC5653Dmh.A03(EnumC5618Dlz.A1r)) {
            this.A0r.A0B();
        }
        Surface surface = this.A05;
        if (surface != null) {
            surface.release();
            this.A05 = null;
        }
        this.A0D = DXD.A01;
        this.A0N = true;
    }

    public static C10388Har A0B(C6438E5q c6438E5q) {
        Timeline timelineA02 = AbstractC5797Dph.A02(c6438E5q);
        if (AnonymousClass002.A1M(timelineA02.A02())) {
            return c6438E5q.A0A;
        }
        C5704Dnm c5704Dnm = BV7.A0d(((AbstractC5797Dph) c6438E5q).A00, timelineA02, c6438E5q.AEU()).A09;
        C10389Has c10389Has = new C10389Has(c6438E5q.A0A);
        c10389Has.A00(c5704Dnm.A06);
        return new C10388Har(c10389Has);
    }

    public static ArrayList A0E(C6438E5q c6438E5q, List list, int i) {
        ArrayList arrayListA0h = C3cG.A0h();
        for (int i2 = 0; i2 < list.size(); i2++) {
            C6431E5j c6431E5j = new C6431E5j((InterfaceC6009Dts) list.get(i2), c6438E5q.A13);
            arrayListA0h.add(c6431E5j);
            c6438E5q.A0t.add(i2 + i, new C6434E5m(c6431E5j.A02, c6431E5j.A03));
        }
        c6438E5q.A0I = c6438E5q.A0I.A6P(i, arrayListA0h.size());
        return arrayListA0h;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0I(X.C6438E5q r4) {
        /*
            int r2 = X.AbstractC5797Dph.A00(r4)
            r0 = 0
            r1 = 1
            if (r2 == r1) goto L38
            r1 = 2
            if (r2 == r1) goto L16
            r1 = 3
            if (r2 == r1) goto L16
            r1 = 4
            if (r2 == r1) goto L38
            java.lang.IllegalStateException r0 = X.BV4.A0T()
            throw r0
        L16:
            X.E60 r1 = X.AbstractC5797Dph.A03(r4)
            boolean r3 = r1.A0F
            X.E6l r2 = r4.A0z
            X.E60 r1 = X.AbstractC5797Dph.A03(r4)
            boolean r1 = r1.A0E
            if (r1 == 0) goto L29
            if (r3 != 0) goto L29
            r0 = 1
        L29:
            boolean r1 = r2.A00
            if (r1 == r0) goto L2f
            r2.A00 = r0
        L2f:
            X.E6m r2 = r4.A10
            X.E60 r0 = X.AbstractC5797Dph.A03(r4)
            boolean r0 = r0.A0E
            goto L42
        L38:
            X.E6l r2 = r4.A0z
            boolean r1 = r2.A00
            if (r1 == r0) goto L40
            r2.A00 = r0
        L40:
            X.E6m r2 = r4.A10
        L42:
            boolean r1 = r2.A00
            if (r1 == r0) goto L48
            r2.A00 = r0
        L48:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6438E5q.A0I(X.E5q):void");
    }

    @Override // X.Dn6
    public final long AD7() {
        long j;
        A0J(this);
        E60 e60A03 = AbstractC5797Dph.A03(this);
        Dy6 dy6 = e60A03.A09;
        if (!AnonymousClass002.A1P(dy6.A00, -1)) {
            E60 e60A032 = AbstractC5797Dph.A03(this);
            Timeline timeline = e60A032.A06;
            if (AnonymousClass002.A1M(timeline.A02())) {
                return this.A04;
            }
            if (e60A032.A08.A03 == e60A032.A09.A03) {
                long j2 = e60A032.A0G;
                E60 e60 = this.A0G;
                Dy6 dy62 = e60.A08;
                if (AnonymousClass002.A1P(dy62.A00, -1)) {
                    e60.A06.A0B(this.A0f, dy62.A04);
                    e60 = this.A0G;
                    dy62 = e60.A08;
                    j2 = 0;
                }
                Timeline timeline2 = e60.A06;
                Object obj = dy62.A04;
                E6B e6b = this.A0f;
                timeline2.A0B(e6b, obj);
                return Util.A0B(j2 + e6b.A02);
            }
            j = BV7.A0d(super.A00, timeline, AEU()).A03;
        } else {
            if (!e60A03.A08.equals(dy6)) {
                return getDuration();
            }
            j = this.A0G.A0G;
        }
        return Util.A0B(j);
    }

    @Override // X.Dn6
    public final int AEP() {
        A0J(this);
        int i = AbstractC5797Dph.A03(this).A09.A00;
        if (AnonymousClass002.A1P(i, -1)) {
            return i;
        }
        return -1;
    }

    @Override // X.Dn6
    public final int AEQ() {
        A0J(this);
        Dy6 dy6 = AbstractC5797Dph.A03(this).A09;
        if (AnonymousClass002.A1P(dy6.A00, -1)) {
            return dy6.A01;
        }
        return -1;
    }

    @Override // X.Dn6
    public final int AEU() {
        int iA05 = A05(this, AbstractC5797Dph.A03(this));
        if (iA05 == -1) {
            return 0;
        }
        return iA05;
    }

    @Override // X.Dn6
    public final int AEV() {
        E60 e60A03 = AbstractC5797Dph.A03(this);
        Timeline timeline = e60A03.A06;
        if (AnonymousClass002.A1M(timeline.A02())) {
            return 0;
        }
        return timeline.A06(e60A03.A09.A04);
    }

    @Override // X.InterfaceC5661Dmq
    public final long AJu() {
        A0J(this);
        if (this.A02 > 0) {
            return -9223372036854775807L;
        }
        long j = this.A0G.A0J;
        if (j != -9223372036854775807L) {
            return Util.A0B(j);
        }
        return -9223372036854775807L;
    }

    @Override // X.Dn6
    public final void Aar(E76 e76) {
        A0J(this);
        C6443E5w<E76> c6443E5w = this.A0j;
        e76.getClass();
        C6443E5w.A00(c6443E5w);
        CopyOnWriteArraySet<E6X<E76>> copyOnWriteArraySet = c6443E5w.A05;
        Iterator<E6X<E76>> it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            E6X<E76> next = it.next();
            E76 e762 = next.A03;
            if (e762.equals(e76)) {
                InterfaceC6255Dyy<E76> interfaceC6255Dyy = c6443E5w.A04;
                next.A02 = true;
                if (next.A01) {
                    next.A01 = false;
                    interfaceC6255Dyy.ANy(next.A00.A00(), e762);
                }
                copyOnWriteArraySet.remove(next);
            }
        }
    }

    @Override // X.Dn6
    public final void AeN(int i) {
        A0J(this);
        if (this.A03 != i) {
            this.A03 = i;
            this.A0o.AeN(i);
            C6443E5w<E76> c6443E5w = this.A0j;
            c6443E5w.A03(new C7584F4x(i, 0), 8);
            A0F();
            c6443E5w.A01();
        }
    }

    @Override // X.InterfaceC5661Dmq
    public final void Aec(DpX dpX) {
        A0J(this);
        if (dpX == null) {
            dpX = DpX.A03;
        }
        if (this.A0Z.equals(dpX)) {
            return;
        }
        this.A0Z = dpX;
        this.A0o.Aec(dpX);
    }

    @Override // X.Dn6
    public final void AfF(float f) {
        A0J(this);
        final float fA01 = BV7.A01(f, 1.0f, 0.0f);
        if (this.A0R != fA01) {
            this.A0R = fA01;
            this.A0o.AfF(fA01);
            C6443E5w<E76> c6443E5w = this.A0j;
            c6443E5w.A03(new E7R() { // from class: X.E7B
                @Override // X.E7R
                public final void ANx(Object obj) {
                    float f2 = fA01;
                    C6438E5q c6438E5q = C6438E5q.$redex_init_class;
                    ((E76) obj).onVolumeChanged(f2);
                }
            }, 22);
            c6443E5w.A01();
        }
    }

    @Override // X.Dn6
    public final long getCurrentPosition() {
        return Util.A0B(A07(this, AbstractC5797Dph.A03(this)));
    }

    @Override // X.Dn6
    public final long getDuration() {
        long jA03;
        A0J(this);
        E60 e60A03 = AbstractC5797Dph.A03(this);
        Dy6 dy6 = e60A03.A09;
        int i = dy6.A00;
        if (AnonymousClass002.A1P(i, -1)) {
            Timeline timeline = e60A03.A06;
            Object obj = dy6.A04;
            E6B e6b = this.A0f;
            timeline.A0B(e6b, obj);
            jA03 = e6b.A03(i, dy6.A01);
        } else {
            Timeline timelineA02 = AbstractC5797Dph.A02(this);
            if (AnonymousClass002.A1M(timelineA02.A02())) {
                return -9223372036854775807L;
            }
            jA03 = BV7.A0d(super.A00, timelineA02, AEU()).A03;
        }
        return Util.A0B(jA03);
    }

    @Override // X.Dn6
    public final void stop() {
        A0J(this);
        A0H(null, this);
        DOM<E0J> dom = DXD.A02;
        this.A0D = new DXD(ImmutableList.of());
    }

    public C6438E5q(Context context, Looper looper, Looper looper2, DrN drN, E7C e7c, InterfaceC5858Dqs interfaceC5858Dqs, C5813Dpx c5813Dpx, C5725DoK c5725DoK, DpX dpX, C6041Duc c6041Duc, Function function, Supplier supplier, Supplier supplier2, Supplier supplier3, Supplier supplier4, Supplier supplier5, String str, int i, int i2, int i3, int i4, int i5, long j, boolean z, boolean z2) {
        E6A c6439E5r;
        E6E e6e;
        try {
            CNC.A03("ExoPlayerImpl", FGI.A0h("Init ", BV7.A0x(this), " [ExoPlayerLib/2.8.1] [", Util.A02, "]"));
            this.A0b = context.getApplicationContext();
            this.A0p = (E65) function.apply(e7c);
            this.A0S = -1000;
            this.A0V = drN;
            this.A0U = 1;
            this.A0T = i5;
            this.A0P = false;
            this.A0v = 2000L;
            SurfaceHolderCallbackC6446E5z surfaceHolderCallbackC6446E5z = new SurfaceHolderCallbackC6446E5z(this);
            this.A0y = surfaceHolderCallbackC6446E5z;
            this.A0l = new C6299Dzv();
            InterfaceC6068Dv6[] interfaceC6068Dv6ArrA7z = ((CNB) supplier4.get()).A7z(BV4.A09(looper), surfaceHolderCallbackC6446E5z, surfaceHolderCallbackC6446E5z, surfaceHolderCallbackC6446E5z, surfaceHolderCallbackC6446E5z);
            this.A14 = interfaceC6068Dv6ArrA7z;
            int length = interfaceC6068Dv6ArrA7z.length;
            C1G.A08(AnonymousClass002.A1N(length));
            InterfaceC6068Dv6[] interfaceC6068Dv6Arr = new InterfaceC6068Dv6[length];
            this.A15 = interfaceC6068Dv6Arr;
            for (int i6 = 0; i6 < length; i6++) {
                interfaceC6068Dv6Arr[i6] = null;
            }
            AbstractC5823DqC abstractC5823DqC = (AbstractC5823DqC) supplier5.get();
            this.A0r = abstractC5823DqC;
            this.A0q = (InterfaceC5791Dpa) supplier3.get();
            InterfaceC5047DQt interfaceC5047DQt = (InterfaceC5047DQt) supplier.get();
            this.A11 = interfaceC5047DQt;
            this.A13 = z2;
            this.A0Z = dpX;
            this.A0H = c5725DoK;
            this.A0c = looper;
            this.A0h = e7c;
            this.A0e = this;
            this.A0j = new C6443E5w<>(looper, e7c, new InterfaceC6255Dyy() { // from class: X.E6z
                @Override // X.InterfaceC6255Dyy
                public final void ANy(DzH dzH, Object obj) {
                    ((E76) obj).onEvents(this.A00.A0e, new E7N(dzH));
                }
            }, new CopyOnWriteArraySet(), true);
            this.A0u = new CopyOnWriteArraySet<>();
            this.A0t = C3cG.A0h();
            this.A0I = new C6429E5h(new Random(), new int[0]);
            this.A0Y = E81.A00;
            int length2 = this.A14.length;
            E6W e6w = new E6W(C5735DoU.A01, null, new C5951Dsl[length2], new InterfaceC5441Dic[length2]);
            this.A0s = e6w;
            this.A0f = new E6B();
            C6265DzI c6265DzI = new C6265DzI();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32};
            int i7 = 0;
            do {
                c6265DzI.A01(iArr[i7]);
                i7++;
            } while (i7 < 20);
            c6265DzI.A01(29);
            E1B e1b = E1B.A01;
            E1B e1b2 = new E1B(c6265DzI.A00());
            this.A0d = e1b2;
            C6265DzI c6265DzI2 = new C6265DzI();
            DzH dzH = e1b2.A00;
            int i8 = 0;
            while (true) {
                SparseBooleanArray sparseBooleanArray = dzH.A00;
                if (i8 >= sparseBooleanArray.size()) {
                    break;
                }
                c6265DzI2.A01(C1G.A00(sparseBooleanArray, i8));
                i8++;
            }
            c6265DzI2.A01(4);
            c6265DzI2.A01(10);
            this.A0B = new E1B(c6265DzI2.A00());
            this.A0i = e7c.A7o(null, looper);
            E7Q e7q = new E7Q(this);
            this.A0m = e7q;
            E7P e7p = new E7P(this);
            this.A0n = e7p;
            this.A0G = E60.A00(e6w);
            this.A0p.Ae5(looper, this);
            E6Y e6y = new E6Y(str);
            if (AbstractC5653Dmh.A03(EnumC5618Dlz.A0r)) {
                Context context2 = this.A0b;
                InterfaceC6068Dv6[] interfaceC6068Dv6Arr2 = this.A14;
                InterfaceC6068Dv6[] interfaceC6068Dv6Arr3 = this.A15;
                InterfaceC5745Dog interfaceC5745Dog = (InterfaceC5745Dog) supplier2.get();
                int i9 = this.A03;
                E65 e65 = this.A0p;
                c6439E5r = new C6440E5s(context2, looper, e7c, this.A0Y, e7p, interfaceC5858Dqs, interfaceC5745Dog, c5813Dpx, this.A0Z, e65, e6y, abstractC5823DqC, e6w, interfaceC5047DQt, this.A0l, c6041Duc, interfaceC6068Dv6Arr2, interfaceC6068Dv6Arr3, i9, j, z);
            } else {
                Context context3 = this.A0b;
                InterfaceC6068Dv6[] interfaceC6068Dv6Arr4 = this.A14;
                InterfaceC5745Dog interfaceC5745Dog2 = (InterfaceC5745Dog) supplier2.get();
                int i10 = this.A03;
                E65 e652 = this.A0p;
                c6439E5r = new C6439E5r(context3, looper, looper2, e7c, this.A0Y, e7q, interfaceC5858Dqs, interfaceC5745Dog2, c5813Dpx, this.A0Z, e652, e6y, abstractC5823DqC, e6w, interfaceC5047DQt, this.A0l, c6041Duc, interfaceC6068Dv6Arr4, i10, j, z);
            }
            this.A0o = c6439E5r;
            Looper looperAIn = c6439E5r.AIn();
            if (!AbstractC5653Dmh.A03(EnumC5618Dlz.A0I) && Build.VERSION.SDK_INT >= 31) {
                E6J.A00(this.A0b, this, e6y);
            }
            this.A0R = 1.0f;
            this.A03 = 0;
            C10388Har c10388Har = C10388Har.A0Y;
            this.A09 = c10388Har;
            this.A0W = c10388Har;
            this.A0A = c10388Har;
            this.A00 = -1;
            this.A0D = DXD.A01;
            this.A0Q = true;
            E65 e653 = this.A0p;
            C6443E5w<E76> c6443E5w = this.A0j;
            e653.getClass();
            c6443E5w.A04(e653);
            interfaceC5047DQt.A3X(BV4.A09(looper), this.A0p);
            this.A0u.add(this.A0y);
            boolean zA03 = AbstractC5653Dmh.A03(EnumC5618Dlz.A0B);
            E61<Integer> e61 = new E61<>(looperAIn, looper, new E7O(this), e7c, 0);
            this.A0g = e61;
            if (!zA03) {
                BV8.A1L(e61.A03, new Runnable() { // from class: X.E6G
                    public static final String __redex_internal_original_name = "ExoPlayerImpl$$ExternalSyntheticLambda28";

                    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Integer, java.lang.Object] */
                    @Override // java.lang.Runnable
                    public final void run() {
                        C6438E5q c6438E5q = this.A00;
                        final E61<Integer> e612 = c6438E5q.A0g;
                        final ?? ValueOf = Integer.valueOf(DpL.A00(c6438E5q.A0b).generateAudioSessionId());
                        e612.A01 = ValueOf;
                        BV8.A1L(e612.A04, new Runnable() { // from class: X.E7G
                            public static final String __redex_internal_original_name = "BackgroundThreadStateHandler$$ExternalSyntheticLambda1";

                            @Override // java.lang.Runnable
                            public final void run() {
                                E61 e613 = e612;
                                Object obj = ValueOf;
                                if (e613.A00 == 0) {
                                    E61.A00(e613, obj);
                                }
                            }
                        });
                    }
                });
            }
            C6464E7e c6464E7e = new C6464E7e(context, looperAIn, looper, e7c, this.A0y);
            this.A0k = c6464E7e;
            c6464E7e.A00(false);
            this.A0z = new E6l(context, looperAIn, e7c);
            this.A10 = new E6m(context, looperAIn, e7c);
            this.A06 = E7U.A00;
            this.A0C = C6232Dya.A03;
            this.A0X = C6226DyM.A02;
            if (AbstractC5653Dmh.A03(EnumC5618Dlz.A1o)) {
                e6e = new E6E(this, e7c, this.A0y, i, i2, i3, i4);
            } else {
                e6e = null;
            }
            this.A0x = e6e;
            this.A0o.Aeb(this.A0H);
            this.A0o.Acp(this.A0V, false);
            this.A12 = AbstractC5653Dmh.A03(EnumC5618Dlz.A0H);
            A0O(this, this.A0V, 1, 3);
            A0O(this, Integer.valueOf(this.A0U), 2, 4);
            A0O(this, Integer.valueOf(this.A0T), 2, 5);
            A0O(this, Boolean.valueOf(this.A0P), 1, 9);
            A0O(this, this.A0l, 6, 8);
            A0O(this, Integer.valueOf(this.A0S), -1, 16);
        } finally {
            this.A0w.A02();
        }
    }
}

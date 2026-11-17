package X;

import android.os.SystemClock;
import com.facebook.exoplayer.monitor.VpsEventCallback;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.functions.Function0;

/* renamed from: X.DEh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4914DEh implements DDj {
    public static final long A0D;
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final E7C A04;
    public final VpsEventCallback A05;
    public final Executor A06;
    public final boolean A07;
    public volatile int A08;
    public volatile long A09;
    public volatile long A0A;
    public volatile C4917DEk A0B;
    public static final F0C<ExecutorService> A0C = C5322DgG.A01((Function0) C6724EXi.A00(8));
    public static final AtomicLong A0E = BV5.A19();

    private final void A01(C4917DEk c4917DEk, long j) {
        c4917DEk.A08 = true;
        long j2 = A0D;
        long j3 = c4917DEk.A01;
        long j4 = this.A03;
        this.A06.execute(new RunnableC4916DEj(this, C4915DEi.A01(1, 0, c4917DEk.A03, c4917DEk.A00, 0, 0, j2, j3, j4, j, 0L, c4917DEk.A05)));
    }

    @Override // X.CXB
    public final void AS2(C1J c1j, C1O c1o, int i, boolean z) {
        C4915DEi c4915DEiA01;
        boolean zA1a = AnonymousClass002.A1a(c1j, c1o);
        C4917DEk c4917DEk = this.A0B;
        if (c4917DEk == null || i <= 0) {
            return;
        }
        long j = c4917DEk.A04 + i;
        c4917DEk.A04 = j;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (!c4917DEk.A07) {
            c4917DEk.A07 = zA1a;
            c4917DEk.A06 = jElapsedRealtime;
            if (!c4917DEk.A08) {
                A01(c4917DEk, jElapsedRealtime);
            }
            c4915DEiA01 = C4915DEi.A01(2, 0, 0, -1, 0, 0, A0D, c4917DEk.A01, this.A03, jElapsedRealtime, j, -1L);
        } else {
            if (jElapsedRealtime - c4917DEk.A06 < 1000) {
                c4917DEk.A02++;
                return;
            }
            c4917DEk.A06 = jElapsedRealtime;
            c4915DEiA01 = C4915DEi.A01(3, c4917DEk.A02, 0, -1, 0, 0, A0D, c4917DEk.A01, this.A03, jElapsedRealtime, j, -1L);
        }
        this.A06.execute(new RunnableC4916DEj(this, c4915DEiA01));
    }

    @Override // X.DDj
    public final void ATL(DEK dek, long j, long j2, long j3) {
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
    @Override // X.DDj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AWi(java.io.IOException r11) {
        /*
            r10 = this;
            r0 = 0
            X.C7384Etj.A0Y(r11, r0)
            X.DEk r2 = r10.A0B
            r5 = 18
            X.EY5 r0 = new X.EY5
            r0.<init>(r5)
            X.3b6 r0 = X.AbstractC0875AGb.A0B(r11, r0)
            r4 = 8
            X.3b6 r0 = X.A6B.A07(r0, r4)
            java.util.List r3 = X.A6B.A02(r0)
            X.AbK r0 = X.AbstractC0878AGe.A0h(r3)
            java.util.Iterator r9 = r0.iterator()
        L23:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L53
            java.lang.Object r1 = r9.next()
            X.BRq r1 = (X.C2273BRq) r1
            int r0 = r1.A00
            T r6 = r1.A01
            int r0 = r0 + 1
            java.util.List r0 = X.AbstractC0878AGe.A0a(r3, r0)
            java.util.ArrayList r8 = X.C3cG.A0h()
            java.util.Iterator r7 = r0.iterator()
        L41:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L56
            java.lang.Object r1 = r7.next()
            boolean r0 = r1 instanceof androidx.media3.datasource.HttpDataSource$HttpDataSourceException
            if (r0 == 0) goto L41
            r8.add(r1)
            goto L41
        L53:
            r3 = 11
            goto L65
        L56:
            java.lang.Object r1 = X.AbstractC0878AGe.A0I(r8)
            androidx.media3.datasource.HttpDataSource$HttpDataSourceException r1 = (androidx.media3.datasource.HttpDataSource$HttpDataSourceException) r1
            boolean r0 = r6 instanceof androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException
            if (r0 == 0) goto L89
            r0 = 7
        L61:
            int r3 = X.BV6.A02(r0)
        L65:
            X.EY5 r0 = new X.EY5
            r0.<init>(r5)
            X.3b6 r0 = X.AbstractC0875AGb.A0B(r11, r0)
            X.3b6 r1 = X.A6B.A07(r0, r4)
            X.DEl r0 = X.C4918DEl.A00
            X.B3i r0 = X.A6B.A03(r0, r1)
            java.lang.Object r0 = X.A6B.A00(r0)
            androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException r0 = (androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException) r0
            if (r0 == 0) goto L87
            int r1 = r0.responseCode
        L82:
            r0 = 5
            r10.A00(r2, r0, r3, r1)
            return
        L87:
            r1 = 0
            goto L82
        L89:
            boolean r0 = r6 instanceof java.net.UnknownHostException
            if (r0 == 0) goto L8f
            r0 = 4
            goto L61
        L8f:
            boolean r0 = r6 instanceof javax.net.ssl.SSLException
            if (r0 == 0) goto L95
            r0 = 6
            goto L61
        L95:
            boolean r0 = r6 instanceof java.net.SocketTimeoutException
            if (r0 == 0) goto La3
            if (r1 == 0) goto La1
            int r3 = r1.type
            r1 = 1
            r0 = 3
            if (r3 == r1) goto L61
        La1:
            r0 = 2
            goto L61
        La3:
            boolean r0 = r6 instanceof java.net.ConnectException
            if (r0 != 0) goto Lbf
            boolean r0 = r6 instanceof java.net.NoRouteToHostException
            if (r0 != 0) goto Lbf
            boolean r0 = r6 instanceof java.net.SocketException
            if (r0 == 0) goto Lb1
            r0 = 5
            goto L61
        Lb1:
            boolean r0 = r6 instanceof com.facebook.google.android.exoplayer2.upstream.cache.Cache$CacheException
            if (r0 == 0) goto Lb8
            r0 = 10
            goto L61
        Lb8:
            boolean r0 = r6 instanceof androidx.media3.common.ParserException
            if (r0 == 0) goto L23
            r0 = 8
            goto L61
        Lbf:
            r0 = 9
            goto L61
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4914DEh.AWi(java.io.IOException):void");
    }

    @Override // X.InterfaceC4897DDq
    public final void AWj(String str, Object obj) {
        String str2;
        int i;
        C7384Etj.A0Y(str, 0);
        if ("X-FB-Connection-Quality".equals(str) && (obj instanceof String) && (str2 = (String) obj) != null) {
            String upperCase = str2.toUpperCase(Locale.ROOT);
            switch (upperCase.hashCode()) {
                case -30683114:
                    if (upperCase.equals("EXCELLENT")) {
                        i = 4;
                        break;
                    } else {
                        return;
                    }
                case 2193597:
                    if (upperCase.equals("GOOD")) {
                        i = 3;
                        break;
                    } else {
                        return;
                    }
                case 2461730:
                    if (upperCase.equals("POOR")) {
                        i = 1;
                        break;
                    } else {
                        return;
                    }
                case 163769603:
                    if (upperCase.equals("MODERATE")) {
                        i = 2;
                        break;
                    } else {
                        return;
                    }
                default:
                    return;
            }
            C4917DEk c4917DEk = this.A0B;
            if (c4917DEk != null) {
                c4917DEk.A03 = i;
            }
        }
    }

    @Override // X.DDj
    public final void AWl(C1O c1o, DEK dek) {
        int i;
        boolean zA1a = AnonymousClass002.A1a(c1o, dek);
        C4890DDe c4890DDeA00 = C4890DDe.A00(c1o);
        long j = c1o.A04;
        long j2 = c1o.A03;
        int i2 = (j == this.A0A && j2 == this.A09) ? this.A08 + 1 : 0;
        this.A0A = j;
        this.A09 = j2;
        this.A08 = i2;
        long jIncrementAndGet = A0E.incrementAndGet();
        int iOrdinal = dek.ordinal();
        int i3 = 1;
        if (iOrdinal == 0) {
            i3 = 0;
        } else if (iOrdinal != zA1a) {
            if (iOrdinal == 2) {
                i3 = 2;
            } else {
                if (iOrdinal != 3) {
                    throw C3cG.A0q();
                }
                i3 = -1;
            }
        }
        C4917DEk c4917DEk = new C4917DEk(jIncrementAndGet, i3);
        A00(this.A0B, 6, 0, 0);
        this.A0B = c4917DEk;
        long j3 = A0D;
        long j4 = c4917DEk.A01;
        long j5 = this.A03;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i4 = this.A02;
        int i5 = c4890DDeA00.A0E;
        int i6 = c4890DDeA00.A0C;
        if (this.A07) {
            i = 3;
        } else if (i6 == 0) {
            i = 1;
        } else {
            i = 2;
            if (i6 < 0) {
                i = 0;
            }
        }
        this.A06.execute(new RunnableC4916DEj(this, new C4915DEi(0, i4, i5, i, c4890DDeA00.A0D, i6, c4890DDeA00.A06, c4890DDeA00.A0A, this.A00, this.A01, i2, 0, 0, -1, 0, 0, j3, j4, j5, jElapsedRealtime, j, j2, c4890DDeA00.A0F, 0L, -1L, c4890DDeA00.A0Z)));
    }

    static {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime < 1) {
            jElapsedRealtime = 1;
        }
        A0D = jElapsedRealtime;
    }

    public /* synthetic */ C4914DEh(VpsEventCallback vpsEventCallback, int i, int i2, int i3, long j, boolean z) {
        E7C e7c = E7C.A00;
        Executor executorA06 = F0C.A06(A0C);
        C7384Etj.A0Y(executorA06, 7);
        this.A03 = j;
        this.A02 = i;
        this.A07 = z;
        this.A00 = i2;
        this.A01 = i3;
        this.A05 = vpsEventCallback;
        this.A04 = e7c;
        this.A06 = executorA06;
        this.A0A = Long.MIN_VALUE;
        this.A09 = Long.MIN_VALUE;
    }

    private final void A00(C4917DEk c4917DEk, int i, int i2, int i3) {
        if (c4917DEk == null || c4917DEk.A09) {
            return;
        }
        c4917DEk.A09 = true;
        if (this.A0B == c4917DEk) {
            this.A0B = null;
        }
        this.A06.execute(new RunnableC4916DEj(this, C4915DEi.A01(i, c4917DEk.A02, 0, c4917DEk.A00, i2, i3, A0D, c4917DEk.A01, this.A03, SystemClock.elapsedRealtime(), c4917DEk.A04, -1L)));
    }

    @Override // X.DDj
    public final void AVB() {
        A00(this.A0B, 4, 0, 0);
    }

    @Override // X.DDj
    public final void AWg() {
        A00(this.A0B, 6, 0, 0);
    }

    @Override // X.CXB
    public final void AWh(C1J c1j, C1O c1o, boolean z) {
        A00(this.A0B, 4, 0, 0);
    }

    @Override // X.CXB
    public final void AWm(C1J c1j, C1O c1o, boolean z) {
        C4917DEk c4917DEk = this.A0B;
        if (c4917DEk == null || c4917DEk.A08) {
            return;
        }
        A01(c4917DEk, SystemClock.elapsedRealtime());
    }

    @Override // X.DDj
    public final void AdA(long j) {
        C4917DEk c4917DEk = this.A0B;
        if (c4917DEk != null) {
            c4917DEk.A05 = j;
        }
    }

    @Override // X.DDj
    public final void AdN(String str) {
    }

    @Override // X.DDj
    public final /* synthetic */ void AdZ(boolean z) {
    }

    @Override // X.DDj
    public final void ATM(long j, long j2) {
    }

    @Override // X.CXB
    public final void AWk(C1J c1j, C1O c1o, boolean z) {
    }
}

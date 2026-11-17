package X;

import android.util.SparseArray;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import java.io.EOFException;

/* renamed from: X.DiN, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5426DiN implements InterfaceC5563Dkg {
    public int A00;
    public int A02;
    public int A03;
    public int A04;
    public long A07;
    public C6154Dwx A09;
    public C6154Dwx A0A;
    public InterfaceC5547DkP A0B;
    public InterfaceC5545DkN A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public C6154Dwx A0O;
    public final C6014Dtx A0Q;
    public final InterfaceC5460Div A0R;
    public final C5430DiR A0S;
    public final C5516Djs A0U = new C5516Djs();
    public int A01 = 1000;
    public int[] A0K = new int[1000];
    public long[] A0L = new long[1000];
    public long[] A0M = new long[1000];
    public int[] A0I = new int[1000];
    public int[] A0J = new int[1000];
    public DjB[] A0N = new DjB[1000];
    public final C5452Din<C5510Djm> A0T = new C5452Din<>(new C7575F4o(0));
    public long A08 = Long.MIN_VALUE;
    public long A05 = Long.MIN_VALUE;
    public long A06 = Long.MIN_VALUE;
    public boolean A0H = true;
    public boolean A0P = true;

    private int A00(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.A0M[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.A0I[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.A01) {
                i = 0;
            }
        }
        return i3;
    }

    public final synchronized int A04(long j, boolean z) {
        int iA00;
        int i = this.A03;
        int i2 = this.A04 + i;
        int i3 = this.A01;
        if (i2 >= i3) {
            i2 -= i3;
        }
        int i4 = this.A02;
        if (AnonymousClass002.A1P(i, i4) && j >= this.A0M[i2]) {
            if (j <= this.A06 || !z) {
                iA00 = A00(i2, i4 - i, j, true);
                if (iA00 == -1) {
                }
            } else {
                iA00 = i4 - i;
            }
            return iA00;
        }
        return 0;
    }

    public final synchronized long A06() {
        return this.A06;
    }

    public final void A0A() {
        A03(this, true);
        InterfaceC5547DkP interfaceC5547DkP = this.A0B;
        if (interfaceC5547DkP != null) {
            interfaceC5547DkP.Aa8(this.A0Q);
            this.A0B = null;
            this.A09 = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void A0B(int r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            if (r4 < 0) goto Lb
            int r2 = r3.A03     // Catch: java.lang.Throwable -> L16
            int r2 = r2 + r4
            int r1 = r3.A02     // Catch: java.lang.Throwable -> L16
            r0 = 1
            if (r2 <= r1) goto Lc
        Lb:
            r0 = 0
        Lc:
            X.C1G.A07(r0)     // Catch: java.lang.Throwable -> L16
            int r0 = r3.A03     // Catch: java.lang.Throwable -> L16
            int r0 = r0 + r4
            r3.A03 = r0     // Catch: java.lang.Throwable -> L16
            monitor-exit(r3)
            return
        L16:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L16
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5426DiN.A0B(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0029 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0C(long r9, boolean r11, boolean r12) {
        /*
            r8 = this;
            r4 = r8
            X.DiR r3 = r8.A0S
            monitor-enter(r4)
            int r6 = r8.A02     // Catch: java.lang.Throwable -> L30
            if (r6 == 0) goto L29
            long[] r0 = r8.A0M     // Catch: java.lang.Throwable -> L30
            int r5 = r8.A04     // Catch: java.lang.Throwable -> L30
            r1 = r0[r5]     // Catch: java.lang.Throwable -> L30
            r7 = r9
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 < 0) goto L29
            if (r12 == 0) goto L1b
            int r0 = r4.A03     // Catch: java.lang.Throwable -> L30
            if (r0 == r6) goto L1b
            int r6 = r0 + 1
        L1b:
            r9 = r11
            int r1 = r4.A00(r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L30
            r0 = -1
            if (r1 == r0) goto L29
            long r0 = A01(r4, r1)     // Catch: java.lang.Throwable -> L30
            monitor-exit(r4)
            goto L2c
        L29:
            monitor-exit(r4)
            r0 = -1
        L2c:
            r3.A05(r0)
            return
        L30:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L30
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5426DiN.A0C(long, boolean, boolean):void");
    }

    public final synchronized boolean A0D(long j, boolean z) {
        int iA00;
        this.A03 = 0;
        C5430DiR c5430DiR = this.A0S;
        c5430DiR.A02 = c5430DiR.A01;
        int i = this.A04;
        int i2 = this.A01;
        if (i >= i2) {
            i -= i2;
        }
        int i3 = this.A02;
        if (!AnonymousClass002.A1P(0, i3) || j < this.A0M[i] || ((j > this.A06 && !z) || (iA00 = A00(i, i3, j, true)) == -1)) {
            return false;
        }
        this.A08 = j;
        this.A03 = iA00;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean A0E(boolean r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            int r3 = r4.A03     // Catch: java.lang.Throwable -> L57
            int r0 = r4.A02     // Catch: java.lang.Throwable -> L57
            boolean r1 = X.AnonymousClass002.A1P(r3, r0)
            r0 = 1
            if (r1 != 0) goto L1b
            if (r5 != 0) goto L55
            boolean r1 = r4.A0D     // Catch: java.lang.Throwable -> L57
            if (r1 != 0) goto L55
            X.Dwx r2 = r4.A0A     // Catch: java.lang.Throwable -> L57
            if (r2 == 0) goto L54
            X.Dwx r1 = r4.A09     // Catch: java.lang.Throwable -> L57
            if (r2 == r1) goto L54
            goto L55
        L1b:
            X.Din<X.Djm> r2 = r4.A0T     // Catch: java.lang.Throwable -> L57
            int r1 = r4.A00     // Catch: java.lang.Throwable -> L57
            int r1 = r1 + r3
            java.lang.Object r1 = r2.A00(r1)     // Catch: java.lang.Throwable -> L57
            X.Djm r1 = (X.C5510Djm) r1     // Catch: java.lang.Throwable -> L57
            X.Dwx r2 = r1.A00     // Catch: java.lang.Throwable -> L57
            X.Dwx r1 = r4.A09     // Catch: java.lang.Throwable -> L57
            if (r2 != r1) goto L55
            int r0 = r4.A03     // Catch: java.lang.Throwable -> L57
            int r2 = r4.A04     // Catch: java.lang.Throwable -> L57
            int r2 = r2 + r0
            int r0 = r4.A01     // Catch: java.lang.Throwable -> L57
            if (r2 < r0) goto L36
            int r2 = r2 - r0
        L36:
            X.DkP r0 = r4.A0B     // Catch: java.lang.Throwable -> L57
            if (r0 == 0) goto L52
            int r1 = r0.AL0()     // Catch: java.lang.Throwable -> L57
            r0 = 4
            if (r1 == r0) goto L52
            int[] r0 = r4.A0I     // Catch: java.lang.Throwable -> L57
            r1 = r0[r2]     // Catch: java.lang.Throwable -> L57
            r0 = 1073741824(0x40000000, float:2.0)
            r1 = r1 & r0
            if (r1 != 0) goto L54
            X.DkP r0 = r4.A0B     // Catch: java.lang.Throwable -> L57
            boolean r0 = r0.AXx()     // Catch: java.lang.Throwable -> L57
            if (r0 == 0) goto L54
        L52:
            r0 = 1
            goto L55
        L54:
            r0 = 0
        L55:
            monitor-exit(r4)
            return r0
        L57:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L57
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5426DiN.A0E(boolean):boolean");
    }

    @Override // X.InterfaceC5563Dkg
    public final void ABq(C6154Dwx c6154Dwx) {
        boolean z;
        C6154Dwx c6154DwxA0U = c6154Dwx;
        long j = this.A07;
        if (j != 0) {
            long j2 = c6154Dwx.A0R;
            if (j2 != LinkEncryptedPairingKt.LINK_COUNTER_MAX) {
                C6162Dx5 c6162Dx5A01 = C6162Dx5.A01(c6154Dwx);
                c6162Dx5A01.A0P = j2 + j;
                c6154DwxA0U = BV6.A0U(c6162Dx5A01);
            }
        }
        this.A0G = false;
        this.A0O = c6154Dwx;
        synchronized (this) {
            this.A0H = false;
            if (C6xC.A00(c6154DwxA0U, this.A0A)) {
                z = false;
            } else {
                SparseArray<C5510Djm> sparseArray = this.A0T.A01;
                if (sparseArray.size() != 0 && sparseArray.valueAt(sparseArray.size() - 1).A00.equals(c6154DwxA0U)) {
                    c6154DwxA0U = sparseArray.valueAt(sparseArray.size() - 1).A00;
                }
                this.A0A = c6154DwxA0U;
                this.A0F = AbstractC6161Dx4.A0A(c6154DwxA0U.A0b, c6154DwxA0U.A0W);
                this.A0E = false;
                z = true;
            }
        }
        InterfaceC5545DkN interfaceC5545DkN = this.A0C;
        if (interfaceC5545DkN == null || !z) {
            return;
        }
        C5427DiO c5427DiO = (C5427DiO) interfaceC5545DkN;
        c5427DiO.A0M.post(c5427DiO.A0U);
    }

    @Override // X.InterfaceC5563Dkg
    public final /* synthetic */ int Abu(C1L c1l, int i, boolean z) {
        return Aby(c1l, i, 0, z);
    }

    @Override // X.InterfaceC5563Dkg
    public final /* synthetic */ void Abv(E1P e1p, int i) {
        Abw(e1p, i, 0);
    }

    public static long A01(C5426DiN c5426DiN, int i) {
        c5426DiN.A05 = Math.max(c5426DiN.A05, A02(c5426DiN, i));
        c5426DiN.A02 -= i;
        int i2 = c5426DiN.A00 + i;
        c5426DiN.A00 = i2;
        int i3 = c5426DiN.A04 + i;
        c5426DiN.A04 = i3;
        int i4 = c5426DiN.A01;
        if (i3 >= i4) {
            c5426DiN.A04 = i3 - i4;
        }
        int i5 = c5426DiN.A03 - i;
        c5426DiN.A03 = i5;
        if (i5 < 0) {
            c5426DiN.A03 = 0;
        }
        C5452Din<C5510Djm> c5452Din = c5426DiN.A0T;
        int i6 = 0;
        while (true) {
            SparseArray<C5510Djm> sparseArray = c5452Din.A01;
            if (i6 >= sparseArray.size() - 1) {
                break;
            }
            int i7 = i6 + 1;
            if (i2 < sparseArray.keyAt(i7)) {
                break;
            }
            c5452Din.A02.accept(sparseArray.valueAt(i6));
            sparseArray.removeAt(i6);
            int i8 = c5452Din.A00;
            if (i8 > 0) {
                c5452Din.A00 = i8 - 1;
            }
            i6 = i7;
        }
        if (c5426DiN.A02 != 0) {
            return c5426DiN.A0L[c5426DiN.A04];
        }
        int i9 = c5426DiN.A04;
        if (i9 == 0) {
            i9 = c5426DiN.A01;
        }
        return c5426DiN.A0L[i9 - 1] + c5426DiN.A0J[r1];
    }

    public static long A02(C5426DiN c5426DiN, int i) {
        long jMax = Long.MIN_VALUE;
        if (i != 0) {
            int i2 = c5426DiN.A04 + (i - 1);
            int i3 = c5426DiN.A01;
            if (i2 >= i3) {
                i2 -= i3;
            }
            for (int i4 = 0; i4 < i; i4++) {
                jMax = Math.max(jMax, c5426DiN.A0M[i2]);
                if ((c5426DiN.A0I[i2] & 1) != 0) {
                    break;
                }
                i2--;
                if (i2 == -1) {
                    i2 = i3 - 1;
                }
            }
        }
        return jMax;
    }

    public static final void A03(C5426DiN c5426DiN, boolean z) {
        SparseArray<C5510Djm> sparseArray;
        C5430DiR c5430DiR = c5426DiN.A0S;
        C5430DiR.A04(c5430DiR.A01, c5430DiR);
        C5484DjM c5484DjM = c5430DiR.A01;
        C1G.A08(AnonymousClass002.A1Y(c5484DjM.A03));
        c5484DjM.A01 = 0L;
        c5484DjM.A00 = 65536L;
        c5430DiR.A02 = c5484DjM;
        c5430DiR.A03 = c5484DjM;
        c5430DiR.A00 = 0L;
        c5430DiR.A06.AhR();
        c5426DiN.A02 = 0;
        c5426DiN.A00 = 0;
        c5426DiN.A04 = 0;
        c5426DiN.A03 = 0;
        c5426DiN.A0P = true;
        c5426DiN.A08 = Long.MIN_VALUE;
        c5426DiN.A05 = Long.MIN_VALUE;
        c5426DiN.A06 = Long.MIN_VALUE;
        c5426DiN.A0D = false;
        C5452Din<C5510Djm> c5452Din = c5426DiN.A0T;
        int i = 0;
        while (true) {
            sparseArray = c5452Din.A01;
            if (i >= sparseArray.size()) {
                break;
            }
            c5452Din.A02.accept(sparseArray.valueAt(i));
            i++;
        }
        c5452Din.A00 = -1;
        sparseArray.clear();
        if (z) {
            c5426DiN.A0O = null;
            c5426DiN.A0A = null;
            c5426DiN.A0H = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0087, code lost:
    
        if (r6 != r9.A09) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00f9, code lost:
    
        if (r5 == false) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0090 A[Catch: all -> 0x0109, TryCatch #0 {, blocks: (B:4:0x000a, B:6:0x0012, B:8:0x0021, B:10:0x0025, B:12:0x002e, B:13:0x002f, B:15:0x0033, B:17:0x003a, B:19:0x0043, B:25:0x0075, B:21:0x004b, B:23:0x005d, B:24:0x0062, B:34:0x0089, B:38:0x0092, B:40:0x009a, B:41:0x00a8, B:45:0x00b5, B:48:0x00bc, B:50:0x00c2, B:52:0x00d0, B:37:0x0090, B:27:0x007b, B:29:0x007f, B:32:0x0085, B:59:0x00d9), top: B:80:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009a A[Catch: all -> 0x0109, TryCatch #0 {, blocks: (B:4:0x000a, B:6:0x0012, B:8:0x0021, B:10:0x0025, B:12:0x002e, B:13:0x002f, B:15:0x0033, B:17:0x003a, B:19:0x0043, B:25:0x0075, B:21:0x004b, B:23:0x005d, B:24:0x0062, B:34:0x0089, B:38:0x0092, B:40:0x009a, B:41:0x00a8, B:45:0x00b5, B:48:0x00bc, B:50:0x00c2, B:52:0x00d0, B:37:0x0090, B:27:0x007b, B:29:0x007f, B:32:0x0085, B:59:0x00d9), top: B:80:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d0 A[Catch: all -> 0x0109, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x000a, B:6:0x0012, B:8:0x0021, B:10:0x0025, B:12:0x002e, B:13:0x002f, B:15:0x0033, B:17:0x003a, B:19:0x0043, B:25:0x0075, B:21:0x004b, B:23:0x005d, B:24:0x0062, B:34:0x0089, B:38:0x0092, B:40:0x009a, B:41:0x00a8, B:45:0x00b5, B:48:0x00bc, B:50:0x00c2, B:52:0x00d0, B:37:0x0090, B:27:0x007b, B:29:0x007f, B:32:0x0085, B:59:0x00d9), top: B:80:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A05(X.Di2 r10, X.C5406Dhz r11, int r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5426DiN.A05(X.Di2, X.Dhz, int, boolean):int");
    }

    public final void A07() {
        long jA01;
        C5430DiR c5430DiR = this.A0S;
        synchronized (this) {
            int i = this.A02;
            jA01 = i == 0 ? -1L : A01(this, i);
        }
        c5430DiR.A05(jA01);
    }

    public final void A08() throws DrmSession$DrmSessionException {
        InterfaceC5547DkP interfaceC5547DkP = this.A0B;
        if (interfaceC5547DkP == null || interfaceC5547DkP.AL0() != 1) {
            return;
        }
        DrmSession$DrmSessionException drmSession$DrmSessionExceptionAFI = this.A0B.AFI();
        drmSession$DrmSessionExceptionAFI.getClass();
        throw drmSession$DrmSessionExceptionAFI;
    }

    @Override // X.InterfaceC5563Dkg
    public final void Abw(E1P e1p, int i, int i2) {
        C5430DiR c5430DiR = this.A0S;
        while (i > 0) {
            int iA00 = C5430DiR.A00(c5430DiR, i);
            C5484DjM c5484DjM = c5430DiR.A03;
            e1p.A0U(c5484DjM.A03.A00, (int) (c5430DiR.A00 - c5484DjM.A01), iA00);
            i -= iA00;
            long j = c5430DiR.A00 + iA00;
            c5430DiR.A00 = j;
            C5484DjM c5484DjM2 = c5430DiR.A03;
            if (j == c5484DjM2.A00) {
                c5430DiR.A03 = c5484DjM2.A02;
            }
        }
    }

    @Override // X.InterfaceC5563Dkg
    public final int Aby(C1L c1l, int i, int i2, boolean z) throws EOFException {
        C5430DiR c5430DiR = this.A0S;
        int iA00 = C5430DiR.A00(c5430DiR, i);
        C5484DjM c5484DjM = c5430DiR.A03;
        int i3 = c1l.read(c5484DjM.A03.A00, (int) (c5430DiR.A00 - c5484DjM.A01), iA00);
        if (i3 == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        long j = c5430DiR.A00 + i3;
        c5430DiR.A00 = j;
        C5484DjM c5484DjM2 = c5430DiR.A03;
        if (j != c5484DjM2.A00) {
            return i3;
        }
        c5430DiR.A03 = c5484DjM2.A02;
        return i3;
    }

    @Override // X.InterfaceC5563Dkg
    public final void Abz(DjB djB, int i, int i2, int i3, long j) {
        if (this.A0G) {
            C6154Dwx c6154Dwx = this.A0O;
            C1G.A05(c6154Dwx);
            ABq(c6154Dwx);
        }
        int i4 = i & 1;
        boolean zA1L = AnonymousClass002.A1L(i4);
        if (this.A0P) {
            if (!zA1L) {
                return;
            } else {
                this.A0P = false;
            }
        }
        long j2 = this.A07 + j;
        if (this.A0F) {
            if (j2 < this.A08) {
                return;
            }
            if (i4 == 0) {
                if (!this.A0E) {
                    CNC.A04("SampleQueue", C8j3.A14(this.A0A, C60O.A0x("Overriding unexpected non-sync sample for format: ")));
                    this.A0E = true;
                }
                i |= 1;
            }
        }
        long j3 = (this.A0S.A00 - i2) - i3;
        synchronized (this) {
            int i5 = this.A02;
            if (i5 > 0) {
                int i6 = this.A04 + (i5 - 1);
                int i7 = this.A01;
                if (i6 >= i7) {
                    i6 -= i7;
                }
                C1G.A07(BV7.A1R(((this.A0L[i6] + this.A0J[i6]) > j3 ? 1 : ((this.A0L[i6] + this.A0J[i6]) == j3 ? 0 : -1))));
            }
            this.A0D = AnonymousClass002.A1L(536870912 & i);
            this.A06 = Math.max(this.A06, j2);
            int i8 = this.A04 + this.A02;
            int i9 = this.A01;
            if (i8 >= i9) {
                i8 -= i9;
            }
            this.A0M[i8] = j2;
            this.A0L[i8] = j3;
            this.A0J[i8] = i2;
            this.A0I[i8] = i;
            this.A0N[i8] = djB;
            this.A0K[i8] = 0;
            C5452Din<C5510Djm> c5452Din = this.A0T;
            SparseArray<C5510Djm> sparseArray = c5452Din.A01;
            if (sparseArray.size() == 0 || !sparseArray.valueAt(sparseArray.size() - 1).A00.equals(this.A0A)) {
                InterfaceC5460Div interfaceC5460Div = this.A0R;
                InterfaceC5532Dk9 interfaceC5532Dk9AYJ = interfaceC5460Div != null ? interfaceC5460Div.AYJ(this.A0A, this.A0Q) : InterfaceC5532Dk9.A00;
                int i10 = this.A00 + this.A02;
                C6154Dwx c6154Dwx2 = this.A0A;
                c6154Dwx2.getClass();
                C5510Djm c5510Djm = new C5510Djm(c6154Dwx2, interfaceC5532Dk9AYJ);
                if (c5452Din.A00 == -1) {
                    C1G.A08(AnonymousClass002.A1M(sparseArray.size()));
                    c5452Din.A00 = 0;
                }
                if (sparseArray.size() > 0) {
                    int iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
                    C1G.A07(i10 >= iKeyAt);
                    if (iKeyAt == i10) {
                        c5452Din.A02.accept(sparseArray.valueAt(sparseArray.size() - 1));
                    }
                }
                sparseArray.append(i10, c5510Djm);
            }
            int i11 = this.A02 + 1;
            this.A02 = i11;
            int i12 = this.A01;
            if (i11 == i12) {
                int i13 = i12 + 1000;
                int[] iArr = new int[i13];
                long[] jArr = new long[i13];
                long[] jArr2 = new long[i13];
                int[] iArr2 = new int[i13];
                int[] iArr3 = new int[i13];
                DjB[] djBArr = new DjB[i13];
                int i14 = this.A04;
                int i15 = i12 - i14;
                System.arraycopy(this.A0L, i14, jArr, 0, i15);
                System.arraycopy(this.A0M, this.A04, jArr2, 0, i15);
                System.arraycopy(this.A0I, this.A04, iArr2, 0, i15);
                System.arraycopy(this.A0J, this.A04, iArr3, 0, i15);
                System.arraycopy(this.A0N, this.A04, djBArr, 0, i15);
                System.arraycopy(this.A0K, this.A04, iArr, 0, i15);
                int i16 = this.A04;
                System.arraycopy(this.A0L, 0, jArr, i15, i16);
                System.arraycopy(this.A0M, 0, jArr2, i15, i16);
                System.arraycopy(this.A0I, 0, iArr2, i15, i16);
                System.arraycopy(this.A0J, 0, iArr3, i15, i16);
                System.arraycopy(this.A0N, 0, djBArr, i15, i16);
                System.arraycopy(this.A0K, 0, iArr, i15, i16);
                this.A0L = jArr;
                this.A0M = jArr2;
                this.A0I = iArr2;
                this.A0J = iArr3;
                this.A0N = djBArr;
                this.A0K = iArr;
                this.A04 = 0;
                this.A01 = i13;
            }
        }
    }

    public C5426DiN(C6014Dtx c6014Dtx, InterfaceC5460Div interfaceC5460Div, InterfaceC5538DkF interfaceC5538DkF) {
        this.A0R = interfaceC5460Div;
        this.A0Q = c6014Dtx;
        this.A0S = new C5430DiR(interfaceC5538DkF);
    }

    public final void A09() {
        A07();
        InterfaceC5547DkP interfaceC5547DkP = this.A0B;
        if (interfaceC5547DkP != null) {
            interfaceC5547DkP.Aa8(this.A0Q);
            this.A0B = null;
            this.A09 = null;
        }
    }

    @Override // X.InterfaceC5563Dkg
    public final /* synthetic */ void A9m(long j) {
    }
}

package X;

import android.net.Uri;
import android.os.Handler;
import androidx.media3.common.util.Util;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.DiO, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5427DiO implements InterfaceC6006Dtp, InterfaceC6413E4p, InterfaceC5229Ddn<C5428DiP>, InterfaceC5346Dgp, InterfaceC5545DkN {
    public static final C6154Dwx A0d;
    public static final Map<String, String> A0e;
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public InterfaceC5503Djf A05;
    public C5485DjN A06;
    public InterfaceC5509Djl A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public C5521Djx[] A0G;
    public C5426DiN[] A0H;
    public long A0I;
    public boolean A0J;
    public boolean A0K;
    public final long A0L;
    public final Handler A0M;
    public final C6014Dtx A0N;
    public final InterfaceC5460Div A0O;
    public final C6013Dtw A0P;
    public final InterfaceC5539DkG A0Q;
    public final InterfaceC5538DkF A0R;
    public final InterfaceC5334DgV A0S;
    public final C5342Dgl A0T;
    public final Runnable A0U;
    public final Runnable A0V;
    public final String A0W;
    public final Uri A0X;
    public final C5778DpK A0Y;
    public final C1J A0Z;
    public final InterfaceC5543DkL A0a;
    public final boolean A0b;
    public final boolean A0c;

    private void A01() {
        C5428DiP c5428DiP = new C5428DiP(this.A0X, this.A0Y, this.A0Z, this.A0a, this, this);
        if (this.A0E) {
            C1G.A08(A06(this));
            long j = this.A03;
            if (j != -9223372036854775807L && this.A0I >= j) {
                this.A0B = true;
                this.A0I = -9223372036854775807L;
                return;
            }
            InterfaceC5509Djl interfaceC5509Djl = this.A07;
            interfaceC5509Djl.getClass();
            long j2 = interfaceC5509Djl.AK7(this.A0I).A00.A00;
            long j3 = this.A0I;
            c5428DiP.A05.A00 = j2;
            c5428DiP.A00 = j3;
            c5428DiP.A02 = true;
            for (C5426DiN c5426DiN : this.A0H) {
                c5426DiN.A08 = j3;
            }
            this.A0I = -9223372036854775807L;
        }
        int i = 0;
        for (C5426DiN c5426DiN2 : this.A0H) {
            i += c5426DiN2.A00 + c5426DiN2.A02;
        }
        this.A02 = i;
        this.A0P.A02(null, new C5072DTn(c5428DiP.A01, c5428DiP.A03, this.A0T.A00(this, c5428DiP, this.A0S.AHm(this.A00))), null, 1, -1, 0, 0, c5428DiP.A00, this.A03);
    }

    @Override // X.InterfaceC6413E4p
    public final void AAe() {
        this.A0J = true;
        this.A0M.post(this.A0U);
    }

    private void A00() {
        C1G.A08(this.A0E);
        this.A06.getClass();
        this.A07.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A02(X.C5427DiO r7) {
        /*
            boolean r0 = r7.A0F
            if (r0 != 0) goto L92
            boolean r0 = r7.A0E
            if (r0 != 0) goto L92
            boolean r0 = r7.A0J
            if (r0 == 0) goto L92
            X.Djl r0 = r7.A07
            if (r0 == 0) goto L92
            X.DiN[] r4 = r7.A0H
            int r3 = r4.length
            r2 = 0
        L14:
            if (r2 >= r3) goto L2b
            r1 = r4[r2]
            monitor-enter(r1)
            boolean r0 = r1.A0H     // Catch: java.lang.Throwable -> L28
            if (r0 == 0) goto L1e
            goto L21
        L1e:
            X.Dwx r0 = r1.A0A     // Catch: java.lang.Throwable -> L28
            goto L22
        L21:
            r0 = 0
        L22:
            monitor-exit(r1)
            if (r0 == 0) goto L92
            int r2 = r2 + 1
            goto L14
        L28:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L28
            throw r0
        L2b:
            X.DpK r0 = r7.A0Y
            r0.A01()
            X.DiN[] r0 = r7.A0H
            int r6 = r0.length
            X.DhZ[] r5 = new X.C5382DhZ[r6]
            boolean[] r4 = new boolean[r6]
            r3 = 0
        L38:
            r2 = 1
            if (r3 >= r6) goto L7c
            X.DiN[] r0 = r7.A0H
            r1 = r0[r3]
            monitor-enter(r1)
            boolean r0 = r1.A0H     // Catch: java.lang.Throwable -> L79
            if (r0 == 0) goto L45
            goto L48
        L45:
            X.Dwx r2 = r1.A0A     // Catch: java.lang.Throwable -> L79
            goto L49
        L48:
            r2 = 0
        L49:
            monitor-exit(r1)
            r2.getClass()
            java.lang.String r1 = r2.A0b
            java.lang.String r0 = "audio"
            boolean r0 = X.BV7.A1Z(r1, r0)
            if (r0 != 0) goto L61
            java.lang.String r0 = "video"
            boolean r0 = X.BV7.A1Z(r1, r0)
            r1 = 0
            if (r0 == 0) goto L62
        L61:
            r1 = 1
        L62:
            r4[r3] = r1
            boolean r0 = r7.A08
            r1 = r1 | r0
            r7.A08 = r1
            X.Dwx[] r2 = new X.C6154Dwx[]{r2}
            java.lang.String r1 = ""
            X.DhZ r0 = new X.DhZ
            r0.<init>(r1, r2)
            r5[r3] = r0
            int r3 = r3 + 1
            goto L38
        L79:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L79
            throw r0
        L7c:
            X.DiA r1 = new X.DiA
            r1.<init>(r5)
            X.DjN r0 = new X.DjN
            r0.<init>(r1, r4)
            r7.A06 = r0
            r7.A0E = r2
            X.Djf r0 = r7.A05
            r0.getClass()
            r0.AUv(r7)
        L92:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5427DiO.A02(X.DiO):void");
    }

    public static final void A03(C5427DiO c5427DiO) throws IOException {
        C5342Dgl c5342Dgl = c5427DiO.A0T;
        int iAHm = c5427DiO.A0S.AHm(c5427DiO.A00);
        IOException iOException = c5342Dgl.A01;
        if (iOException != null) {
            throw iOException;
        }
        HandlerC5228Ddm<? extends InterfaceC5231Ddp> handlerC5228Ddm = c5342Dgl.A00;
        if (handlerC5228Ddm != null) {
            if (iAHm == Integer.MIN_VALUE) {
                iAHm = handlerC5228Ddm.A05;
            }
            IOException iOException2 = handlerC5228Ddm.A01;
            if (iOException2 != null && handlerC5228Ddm.A00 > iAHm) {
                throw iOException2;
            }
        }
    }

    public static boolean A06(C5427DiO c5427DiO) {
        return AnonymousClass002.A1L((c5427DiO.A0I > (-9223372036854775807L) ? 1 : (c5427DiO.A0I == (-9223372036854775807L) ? 0 : -1)));
    }

    @Override // X.InterfaceC6006Dtp, X.InterfaceC5487DjP
    public final boolean A7A(Du1 du1) {
        if (!this.A0B) {
            C5342Dgl c5342Dgl = this.A0T;
            if (c5342Dgl.A01 == null && !this.A0D && (!this.A0E || this.A01 != 0)) {
                boolean zA02 = this.A0Y.A02();
                if (c5342Dgl.A00 != null) {
                    return zA02;
                }
                A01();
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC5487DjP
    public final long AD6(long j) {
        if (!this.A0c || this.A0E) {
            return (this.A0B ? this.A03 : AD8()) - j;
        }
        return 0L;
    }

    @Override // X.InterfaceC6006Dtp, X.InterfaceC5487DjP
    public final boolean AOd() {
        return AnonymousClass002.A1X(this.A0T.A00);
    }

    @Override // X.InterfaceC5229Ddn
    public final /* bridge */ /* synthetic */ void ATt(InterfaceC5231Ddp interfaceC5231Ddp, long j, boolean z) {
        C5428DiP c5428DiP = (C5428DiP) interfaceC5231Ddp;
        DF4 df4 = c5428DiP.A04;
        this.A0P.A03(null, new C5072DTn(df4.A01, c5428DiP.A01, df4.A02, c5428DiP.A03, j), null, 1, -1, 0, c5428DiP.A00, this.A03);
        if (z) {
            return;
        }
        for (C5426DiN c5426DiN : this.A0H) {
            C5426DiN.A03(c5426DiN, false);
        }
        if (this.A01 > 0) {
            InterfaceC5503Djf interfaceC5503Djf = this.A05;
            interfaceC5503Djf.getClass();
            interfaceC5503Djf.ASS(this);
        }
    }

    @Override // X.InterfaceC5229Ddn
    public final /* bridge */ /* synthetic */ void ATu(InterfaceC5231Ddp interfaceC5231Ddp, long j, long j2) {
        InterfaceC5509Djl interfaceC5509Djl;
        C5428DiP c5428DiP = (C5428DiP) interfaceC5231Ddp;
        if (this.A03 == -9223372036854775807L && (interfaceC5509Djl = this.A07) != null) {
            boolean zIsSeekable = interfaceC5509Djl.isSeekable();
            long jMax = Long.MIN_VALUE;
            int i = 0;
            while (true) {
                C5426DiN[] c5426DiNArr = this.A0H;
                if (i >= c5426DiNArr.length) {
                    break;
                }
                jMax = Math.max(jMax, c5426DiNArr[i].A06());
                i++;
            }
            long j3 = jMax == Long.MIN_VALUE ? 0L : jMax + 10000;
            this.A03 = j3;
            this.A0Q.AW0(j3, zIsSeekable, this.A0A);
        }
        DF4 df4 = c5428DiP.A04;
        this.A0P.A04(null, new C5072DTn(df4.A01, c5428DiP.A01, df4.A02, c5428DiP.A03, j), null, 1, -1, 0, c5428DiP.A00, this.A03);
        this.A0B = true;
        InterfaceC5503Djf interfaceC5503Djf = this.A05;
        interfaceC5503Djf.getClass();
        interfaceC5503Djf.ASS(this);
    }

    @Override // X.InterfaceC5229Ddn
    public final /* bridge */ /* synthetic */ C5230Ddo ATv(InterfaceC5231Ddp interfaceC5231Ddp, IOException iOException, int i, long j, long j2) {
        C5230Ddo c5230Ddo;
        InterfaceC5509Djl interfaceC5509Djl;
        C5428DiP c5428DiP = (C5428DiP) interfaceC5231Ddp;
        DF4 df4 = c5428DiP.A04;
        C5072DTn c5072DTn = new C5072DTn(df4.A01, c5428DiP.A01, df4.A02, c5428DiP.A03, j);
        long jAJn = this.A0S.AJn(new C5335DgW(c5072DTn, new C5893Dra(null, null, 1, -1, 0, Util.A0B(c5428DiP.A00), Util.A0B(this.A03)), iOException, i));
        if (jAJn == -9223372036854775807L) {
            c5230Ddo = C5342Dgl.A04;
        } else {
            C5426DiN[] c5426DiNArr = this.A0H;
            int i2 = 0;
            for (C5426DiN c5426DiN : c5426DiNArr) {
                i2 += c5426DiN.A00 + c5426DiN.A02;
            }
            boolean zA1V = C8j4.A1V(i2, this.A02);
            if (this.A09 || !((interfaceC5509Djl = this.A07) == null || interfaceC5509Djl.AEy() == -9223372036854775807L)) {
                this.A02 = i2;
            } else {
                boolean z = this.A0E;
                if (!z || this.A0C || A06(this)) {
                    this.A0C = z;
                    this.A04 = 0L;
                    this.A02 = 0;
                    for (C5426DiN c5426DiN2 : c5426DiNArr) {
                        C5426DiN.A03(c5426DiN2, false);
                    }
                    c5428DiP.A05.A00 = 0L;
                    c5428DiP.A00 = 0L;
                    c5428DiP.A02 = true;
                } else {
                    this.A0D = true;
                    c5230Ddo = C5342Dgl.A03;
                }
            }
            c5230Ddo = new C5230Ddo(zA1V ? 1 : 0, jAJn);
        }
        int i3 = c5230Ddo.A00;
        boolean z2 = true;
        if (i3 != 0 && i3 != 1) {
            z2 = false;
        }
        this.A0P.A01(null, c5072DTn, iOException, null, 1, -1, 0, c5428DiP.A00, this.A03, !z2);
        return c5230Ddo;
    }

    @Override // X.InterfaceC5229Ddn
    public final /* bridge */ /* synthetic */ void ATx(InterfaceC5231Ddp interfaceC5231Ddp, int i, long j) {
        C5072DTn c5072DTn;
        C5428DiP c5428DiP = (C5428DiP) interfaceC5231Ddp;
        DF4 df4 = c5428DiP.A04;
        long j2 = c5428DiP.A03;
        if (i == 0) {
            c5072DTn = new C5072DTn(c5428DiP.A01, j2, j);
        } else {
            c5072DTn = new C5072DTn(df4.A01, c5428DiP.A01, df4.A02, j2, j);
        }
        this.A0P.A02(null, c5072DTn, null, 1, -1, 0, i, c5428DiP.A00, this.A03);
    }

    @Override // X.InterfaceC5346Dgp
    public final void ATz() {
        for (C5426DiN c5426DiN : this.A0H) {
            c5426DiN.A0A();
        }
        C5494DjW c5494DjW = (C5494DjW) this.A0a;
        InterfaceC5458Dit interfaceC5458Dit = c5494DjW.A00;
        if (interfaceC5458Dit != null) {
            interfaceC5458Dit.release();
            c5494DjW.A00 = null;
        }
        c5494DjW.A01 = null;
    }

    @Override // X.InterfaceC6006Dtp
    public final void AYP(InterfaceC5503Djf interfaceC5503Djf, long j) {
        this.A05 = interfaceC5503Djf;
        this.A0Y.A02();
        A01();
    }

    @Override // X.InterfaceC6006Dtp
    public final long AZF() {
        if (!this.A0C) {
            return -9223372036854775807L;
        }
        if (!this.A0B) {
            int i = 0;
            for (C5426DiN c5426DiN : this.A0H) {
                i += c5426DiN.A00 + c5426DiN.A02;
            }
            if (i <= this.A02) {
                return -9223372036854775807L;
            }
        }
        this.A0C = false;
        return this.A04;
    }

    @Override // X.InterfaceC6413E4p
    public final void AcM(final InterfaceC5509Djl interfaceC5509Djl) {
        this.A0M.post(new Runnable() { // from class: X.Dio
            public static final String __redex_internal_original_name = "ProgressiveMediaPeriod$$ExternalSyntheticLambda3";

            /* JADX WARN: Removed duplicated region for block: B:6:0x001b  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    r8 = this;
                    X.DiO r7 = r8.A00
                    X.Djl r6 = r2
                    r7.A07 = r6
                    long r3 = r6.AEy()
                    r7.A03 = r3
                    boolean r0 = r7.A09
                    r5 = 1
                    if (r0 != 0) goto L1b
                    r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                    int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                    r2 = 1
                    if (r0 == 0) goto L1c
                L1b:
                    r2 = 0
                L1c:
                    r7.A0A = r2
                    if (r2 == 0) goto L21
                    r5 = 7
                L21:
                    r7.A00 = r5
                    X.DkG r1 = r7.A0Q
                    boolean r0 = r6.isSeekable()
                    r1.AW0(r3, r0, r2)
                    boolean r0 = r7.A0E
                    if (r0 != 0) goto L33
                    X.C5427DiO.A02(r7)
                L33:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.RunnableC5453Dio.run():void");
            }
        });
    }

    @Override // X.InterfaceC6413E4p
    public final InterfaceC5563Dkg AhC(int i, int i2) {
        C5521Djx c5521Djx = new C5521Djx(i);
        C5426DiN[] c5426DiNArr = this.A0H;
        int length = c5426DiNArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (c5521Djx.equals(this.A0G[i3])) {
                return c5426DiNArr[i3];
            }
        }
        InterfaceC5538DkF interfaceC5538DkF = this.A0R;
        C5426DiN c5426DiN = new C5426DiN(this.A0N, this.A0O, interfaceC5538DkF);
        c5426DiN.A0C = this;
        int i4 = length + 1;
        Object[] objArrCopyOf = Arrays.copyOf(this.A0G, i4);
        objArrCopyOf[length] = c5521Djx;
        this.A0G = (C5521Djx[]) objArrCopyOf;
        Object[] objArrCopyOf2 = Arrays.copyOf(this.A0H, i4);
        objArrCopyOf2[length] = c5426DiN;
        this.A0H = (C5426DiN[]) objArrCopyOf2;
        return c5426DiN;
    }

    static {
        HashMap mapA0u = BV4.A0u();
        mapA0u.put("Icy-MetaData", "1");
        A0e = Collections.unmodifiableMap(mapA0u);
        C6162Dx5 c6162Dx5A00 = C6162Dx5.A00();
        c6162Dx5A00.A0W = "icy";
        A0d = C6162Dx5.A02(c6162Dx5A00, "application/x-icy");
    }

    public C5427DiO(Uri uri, C1J c1j, C6014Dtx c6014Dtx, InterfaceC5460Div interfaceC5460Div, C6013Dtw c6013Dtw, InterfaceC5543DkL interfaceC5543DkL, InterfaceC5539DkG interfaceC5539DkG, InterfaceC5538DkF interfaceC5538DkF, InterfaceC5334DgV interfaceC5334DgV, InterfaceExecutorC5232Ddq interfaceExecutorC5232Ddq, String str, int i) {
        this.A0X = uri;
        this.A0Z = c1j;
        this.A0O = interfaceC5460Div;
        this.A0N = c6014Dtx;
        this.A0S = interfaceC5334DgV;
        this.A0P = c6013Dtw;
        this.A0Q = interfaceC5539DkG;
        this.A0R = interfaceC5538DkF;
        this.A0W = str;
        this.A0L = i;
        this.A0T = interfaceExecutorC5232Ddq != null ? new C5342Dgl(interfaceExecutorC5232Ddq) : new C5342Dgl("Loader:ProgressiveMediaPeriod");
        this.A0a = interfaceC5543DkL;
        this.A0Y = new C5778DpK();
        this.A0U = new Runnable() { // from class: X.Djn
            public static final String __redex_internal_original_name = "ProgressiveMediaPeriod$$ExternalSyntheticLambda1";

            @Override // java.lang.Runnable
            public final void run() {
                C5427DiO.A02(this.A00);
            }
        };
        this.A0V = new Runnable() { // from class: X.Dj7
            public static final String __redex_internal_original_name = "ProgressiveMediaPeriod$$ExternalSyntheticLambda2";

            @Override // java.lang.Runnable
            public final void run() {
                C5427DiO c5427DiO = this.A00;
                if (c5427DiO.A0F) {
                    return;
                }
                InterfaceC5503Djf interfaceC5503Djf = c5427DiO.A05;
                interfaceC5503Djf.getClass();
                interfaceC5503Djf.ASS(c5427DiO);
            }
        };
        this.A0M = C1G.A02(null);
        this.A0G = new C5521Djx[0];
        this.A0H = new C5426DiN[0];
        this.A0I = -9223372036854775807L;
        this.A03 = -9223372036854775807L;
        this.A00 = 1;
        this.A0c = AbstractC5653Dmh.A03(EnumC5618Dlz.A0e) || AbstractC5653Dmh.A03(EnumC5618Dlz.A2K);
        this.A0b = AbstractC5653Dmh.A03(EnumC5618Dlz.A0f);
    }

    public static void A04(C5427DiO c5427DiO, int i) {
        c5427DiO.A00();
        C5485DjN c5485DjN = c5427DiO.A06;
        boolean[] zArr = c5485DjN.A03;
        if (zArr[i]) {
            return;
        }
        C6154Dwx c6154Dwx = BV7.A0e(c5485DjN.A00, i).A04[0];
        c5427DiO.A0P.A05(c6154Dwx, null, AbstractC6161Dx4.A01(c6154Dwx.A0b), 0, c5427DiO.A04);
        zArr[i] = true;
    }

    public static void A05(C5427DiO c5427DiO, int i) {
        c5427DiO.A00();
        boolean[] zArr = c5427DiO.A06.A02;
        if (c5427DiO.A0D && zArr[i]) {
            if (c5427DiO.A0H[i].A0E(false)) {
                return;
            }
            c5427DiO.A0I = 0L;
            c5427DiO.A0D = false;
            c5427DiO.A0C = true;
            c5427DiO.A04 = 0L;
            c5427DiO.A02 = 0;
            for (C5426DiN c5426DiN : c5427DiO.A0H) {
                C5426DiN.A03(c5426DiN, false);
            }
            InterfaceC5503Djf interfaceC5503Djf = c5427DiO.A05;
            interfaceC5503Djf.getClass();
            interfaceC5503Djf.ASS(c5427DiO);
        }
    }

    @Override // X.InterfaceC6006Dtp
    public final void A94(long j, boolean z) {
        A00();
        if (A06(this)) {
            return;
        }
        boolean[] zArr = this.A06.A01;
        int length = this.A0H.length;
        for (int i = 0; i < length; i++) {
            this.A0H[i].A0C(j, z, zArr[i]);
        }
    }

    @Override // X.InterfaceC6006Dtp
    public final long ACF(DpX dpX, long j) {
        A00();
        InterfaceC5509Djl interfaceC5509Djl = this.A07;
        if (!interfaceC5509Djl.isSeekable()) {
            return 0L;
        }
        DkQ dkQAK7 = interfaceC5509Djl.AK7(j);
        return dpX.A00(j, dkQAK7.A00.A01, dkQAK7.A01.A01);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    @Override // X.InterfaceC6006Dtp, X.InterfaceC5487DjP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long AD8() {
        /*
            r10 = this;
            r10.A00()
            boolean r0 = r10.A0B
            r4 = -9223372036854775808
            if (r0 != 0) goto L15
            int r0 = r10.A01
            if (r0 == 0) goto L15
            boolean r0 = A06(r10)
            if (r0 == 0) goto L16
            long r4 = r10.A0I
        L15:
            return r4
        L16:
            boolean r0 = r10.A08
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r0 == 0) goto L58
            X.DiN[] r0 = r10.A0H
            int r7 = r0.length
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6 = 0
        L28:
            if (r6 >= r7) goto L54
            X.DjN r1 = r10.A06
            boolean[] r0 = r1.A02
            boolean r0 = r0[r6]
            if (r0 == 0) goto L4e
            boolean[] r0 = r1.A01
            boolean r0 = r0[r6]
            if (r0 == 0) goto L4e
            X.DiN[] r0 = r10.A0H
            r1 = r0[r6]
            monitor-enter(r1)
            boolean r0 = r1.A0D     // Catch: java.lang.Throwable -> L51
            monitor-exit(r1)
            if (r0 != 0) goto L4e
            X.DiN[] r0 = r10.A0H
            r0 = r0[r6]
            long r0 = r0.A06()
            long r2 = java.lang.Math.min(r2, r0)
        L4e:
            int r6 = r6 + 1
            goto L28
        L51:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L51
            throw r0
        L54:
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 != 0) goto L7a
        L58:
            r2 = -9223372036854775808
            r6 = 0
        L5b:
            X.DiN[] r0 = r10.A0H
            int r0 = r0.length
            if (r6 >= r0) goto L7a
            X.DjN r0 = r10.A06
            r0.getClass()
            boolean[] r0 = r0.A01
            boolean r0 = r0[r6]
            if (r0 == 0) goto L77
            X.DiN[] r0 = r10.A0H
            r0 = r0[r6]
            long r0 = r0.A06()
            long r2 = java.lang.Math.max(r2, r0)
        L77:
            int r6 = r6 + 1
            goto L5b
        L7a:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L81
            long r4 = r10.A04
            return r4
        L81:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5427DiO.AD8():long");
    }

    @Override // X.InterfaceC6006Dtp, X.InterfaceC5487DjP
    public final long AI5() {
        return AD8();
    }

    @Override // X.InterfaceC6006Dtp
    public final C5414DiA ALu() {
        A00();
        return this.A06.A00;
    }

    @Override // X.InterfaceC6006Dtp
    public final void AQR() throws IOException {
        A03(this);
        if (!this.A0B || this.A0E) {
        } else {
            throw BV6.A0V(this.A0b ? BV4.A0k("Loading finished before preparation is complete. URI: ", this.A0X) : "Loading finished before preparation is complete.", null);
        }
    }

    @Override // X.InterfaceC6006Dtp, X.InterfaceC5487DjP
    public final void AZv(long j) {
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    @Override // X.InterfaceC6006Dtp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long AcP(long r6) {
        /*
            r5 = this;
            r5.A00()
            X.DjN r0 = r5.A06
            boolean[] r3 = r0.A02
            X.Djl r0 = r5.A07
            boolean r0 = r0.isSeekable()
            if (r0 != 0) goto L11
            r6 = 0
        L11:
            r4 = 0
            r5.A0C = r4
            r5.A04 = r6
            boolean r0 = A06(r5)
            if (r0 == 0) goto L1f
            r5.A0I = r6
        L1e:
            return r6
        L1f:
            int r1 = r5.A00
            r0 = 7
            if (r1 == r0) goto L3c
            X.DiN[] r0 = r5.A0H
            int r2 = r0.length
            r1 = 0
        L28:
            if (r1 >= r2) goto L1e
            X.DiN[] r0 = r5.A0H
            r0 = r0[r1]
            boolean r0 = r0.A0D(r6, r4)
            if (r0 != 0) goto L55
            boolean r0 = r3[r1]
            if (r0 != 0) goto L3c
            boolean r0 = r5.A08
            if (r0 != 0) goto L55
        L3c:
            r5.A0D = r4
            r5.A0I = r6
            r5.A0B = r4
            X.Dgl r3 = r5.A0T
            X.Ddm<? extends X.Ddp> r0 = r3.A00
            if (r0 == 0) goto L58
            X.DiN[] r2 = r5.A0H
            int r1 = r2.length
        L4b:
            if (r4 >= r1) goto L69
            r0 = r2[r4]
            r0.A07()
            int r4 = r4 + 1
            goto L4b
        L55:
            int r1 = r1 + 1
            goto L28
        L58:
            r0 = 0
            r3.A01 = r0
            X.DiN[] r3 = r5.A0H
            int r2 = r3.length
        L5e:
            if (r4 >= r2) goto L1e
            r1 = r3[r4]
            r0 = 0
            X.C5426DiN.A03(r1, r0)
            int r4 = r4 + 1
            goto L5e
        L69:
            X.Ddm<? extends X.Ddp> r1 = r3.A00
            X.C1G.A05(r1)
            r0 = 0
            r1.A01(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5427DiO.AcP(long):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0093  */
    @Override // X.InterfaceC6006Dtp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long AcS(X.InterfaceC6022DuF[] r10, X.InterfaceC5441Dic[] r11, boolean[] r12, boolean[] r13, long r14) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5427DiO.AcS(X.DuF[], X.Dic[], boolean[], boolean[], long):long");
    }
}

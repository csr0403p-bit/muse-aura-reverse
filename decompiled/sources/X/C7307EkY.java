package X;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;

/* renamed from: X.EkY, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7307EkY implements InterfaceC7274Ejz {
    public int A00;
    public boolean A01;
    public C7306EkX A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final boolean A06;
    public final InterfaceC7288EkF A07;
    public final C7315Ekg A08;
    public final C7311Ekc A09;
    public final C7178Ehn A0A;
    public final String A0B;
    public final boolean A0C;

    public C7307EkY(InterfaceC7288EkF interfaceC7288EkF, C7311Ekc c7311Ekc, C7178Ehn c7178Ehn, String str, boolean z) {
        this.A07 = interfaceC7288EkF;
        this.A0A = c7178Ehn;
        this.A09 = c7311Ekc;
        this.A06 = z;
        this.A0C = AnonymousClass002.A1Y(str);
        this.A0B = str == null ? String.valueOf(hashCode()) : str;
        this.A04 = interfaceC7288EkF.AiQ();
        this.A03 = interfaceC7288EkF.ANN();
        long jAHK = 1000 / (interfaceC7288EkF.AHK() / interfaceC7288EkF.getFrameCount());
        int i = (int) (jAHK < 1 ? 1L : jAHK);
        this.A05 = i;
        this.A00 = i;
        this.A01 = true;
        this.A08 = new C7315Ekg(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00cd  */
    @Override // X.InterfaceC7274Ejz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.EfF<android.graphics.Bitmap> ACp(int r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7307EkY.ACp(int, int, int):X.EfF");
    }

    public static final C7306EkX A00(C7307EkY c7307EkY) {
        C7306EkX c7306EkX = c7307EkY.A02;
        if (c7306EkX == null) {
            C7311Ekc c7311Ekc = c7307EkY.A09;
            String str = c7307EkY.A0B;
            C7178Ehn c7178Ehn = c7307EkY.A0A;
            InterfaceC7288EkF interfaceC7288EkF = c7307EkY.A07;
            C7384Etj.A0Y(str, 0);
            ConcurrentHashMap<String, C7314Ekf> concurrentHashMap = C7311Ekc.A07;
            synchronized (concurrentHashMap) {
                C7314Ekf c7314Ekf = concurrentHashMap.get(str);
                if (c7314Ekf != null) {
                    concurrentHashMap.remove(str);
                    c7306EkX = c7314Ekf.A00;
                } else {
                    c7306EkX = new C7306EkX(interfaceC7288EkF, new C7316Ekh(c7311Ekc.A01, c7311Ekc.A06), c7178Ehn, c7311Ekc.A02, c7311Ekc.A00, c7311Ekc.A03);
                }
            }
            c7307EkY.A02 = c7306EkX;
        }
        return c7306EkX;
    }

    @Override // X.InterfaceC7274Ejz
    public final void AYR(int i, int i2) {
        int i3;
        int i4;
        if (i <= 0 || i2 <= 0 || (i3 = this.A04) <= 0 || (i4 = this.A03) <= 0) {
            return;
        }
        this.A01 = true;
        if (this.A06) {
            double d = i3;
            double d2 = i4;
            double dMin = Math.min(1.0d, Math.min(i / d, i2 / d2));
            i3 = (int) (d * dMin);
            if (i3 < 1) {
                i3 = 1;
            }
            i4 = (int) (d2 * dMin);
            if (i4 < 1) {
                i4 = 1;
            }
        }
        C7306EkX c7306EkXA00 = A00(this);
        if (c7306EkXA00.A07) {
            return;
        }
        C7306EkX.A01(c7306EkXA00, i3, i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0013  */
    @Override // X.InterfaceC7274Ejz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A6I() {
        /*
            r7 = this;
            X.EkX r5 = A00(r7)
            r4 = 0
            java.lang.String r6 = r7.A0B
            X.Ekc r2 = r7.A09
            boolean r0 = r2.A04
            r3 = 1
            if (r0 != 0) goto L13
            boolean r0 = r7.A0C
            r1 = 0
            if (r0 == 0) goto L14
        L13:
            r1 = 1
        L14:
            boolean r0 = r2.A05
            if (r0 != 0) goto L1d
            boolean r0 = r7.A0C
            if (r0 != 0) goto L1d
            r3 = 0
        L1d:
            X.C7384Etj.A0Y(r6, r4)
            if (r1 != 0) goto L39
            if (r3 != 0) goto L39
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.Ekf> r2 = X.C7311Ekc.A07
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            X.Ekf r0 = new X.Ekf
            r0.<init>(r5, r1)
            r2.put(r6, r0)
        L33:
            r0 = 0
            r7.A02 = r0
            r7.A01 = r4
            return
        L39:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.Ekf> r2 = X.C7311Ekc.A07
            monitor-enter(r2)
            java.util.Date r1 = new java.util.Date     // Catch: java.lang.Throwable -> L59
            r1.<init>()     // Catch: java.lang.Throwable -> L59
            X.Ekf r0 = new X.Ekf     // Catch: java.lang.Throwable -> L59
            r0.<init>(r5, r1)     // Catch: java.lang.Throwable -> L59
            java.lang.Object r0 = r2.put(r6, r0)     // Catch: java.lang.Throwable -> L59
            X.Ekf r0 = (X.C7314Ekf) r0     // Catch: java.lang.Throwable -> L59
            if (r3 == 0) goto L57
            if (r0 == 0) goto L57
            X.EkX r0 = r0.A00     // Catch: java.lang.Throwable -> L59
            if (r0 == r5) goto L57
            r0.A02()     // Catch: java.lang.Throwable -> L59
        L57:
            monitor-exit(r2)
            goto L33
        L59:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7307EkY.A6I():void");
    }

    @Override // X.InterfaceC7274Ejz
    public final void AWF() {
        A00(this);
        A6I();
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Ehl;LX/Ek1;LX/Ek4;ILkotlin/jvm/functions/Function0<Lkotlin/Unit;>;)V */
    @Override // X.InterfaceC7274Ejz
    public final /* bridge */ void AYQ(InterfaceC7278Ek4 interfaceC7278Ek4, InterfaceC7275Ek1 interfaceC7275Ek1, InterfaceC7176Ehl interfaceC7176Ehl, Function0 function0, int i) {
    }
}

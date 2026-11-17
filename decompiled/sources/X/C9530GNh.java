package X;

import android.app.ActivityManager;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.android.billingclient.api.a;
import com.android.billingclient.t5;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* renamed from: X.GNh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C9530GNh extends GOL {
    public Context A01;
    public GPA A02;
    public GNK A04;
    public ExecutorService A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public final String A0Q;
    public volatile ServiceConnectionC9532GNj A0S;
    public volatile GNW A0T;
    public volatile t5 A0U;
    public volatile C9559GOq A0V;
    public final Object A0O = C3cG.A0T();
    public volatile int A0R = 0;
    public final Handler A0K = C60O.A02();
    public int A00 = 0;
    public GNF A03 = GNH.A05;
    public final Long A0N = Long.valueOf(new Random().nextLong());
    public final C9527GNe A0M = AbstractC9525GNc.A00;
    public final Hs5 A0L = AbstractC10587Hwv.A00;
    public final String A0P = "9.1.0-billing-eap01";

    public static GNM A01(C9530GNh c9530GNh) {
        int i = 0;
        int[] iArr = {0, 3};
        synchronized (c9530GNh.A0O) {
            do {
                if (c9530GNh.A0R == iArr[i]) {
                    return GO0.A0M;
                }
                i++;
            } while (i < 2);
            return GO0.A0K;
        }
    }

    public static Future A04(Handler handler, final Runnable runnable, Callable callable, ExecutorService executorService, long j) {
        long j2 = (long) (j * 0.95d);
        try {
            final Future futureSubmit = executorService.submit(callable);
            handler.postDelayed(new Runnable() { // from class: X.Hk9
                public static final String __redex_internal_original_name = "BillingClientImpl$$ExternalSyntheticLambda2";

                @Override // java.lang.Runnable
                public final void run() {
                    Future future = futureSubmit;
                    Runnable runnable2 = runnable;
                    if (future.isDone() || future.isCancelled()) {
                        return;
                    }
                    future.cancel(true);
                    GNN.A06("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            }, j2);
            return futureSubmit;
        } catch (Exception e) {
            GNN.A07("BillingClient", "Async task throws exception!", e);
            return null;
        }
    }

    @Override // X.GOL
    public void A0O(GPB gpb, final GOY goy) {
        if (A05(this, new Runnable() { // from class: X.GOJ
            public static final String __redex_internal_original_name = "BillingClientImpl$$ExternalSyntheticLambda18";

            @Override // java.lang.Runnable
            public final void run() {
                C9530GNh c9530GNh = this.A00;
                GOY goy2 = goy;
                EnumC9535GNn enumC9535GNn = EnumC9535GNn.A2H;
                EnumC9540GNw enumC9540GNw = EnumC9540GNw.A04;
                GNM gnm = GO0.A0N;
                C9530GNh.A0B(c9530GNh, gnm, enumC9540GNw, enumC9535GNn);
                goy2.A00(gnm);
            }
        }, new CallableC10631I0b(gpb, this, goy, 0)) == null) {
            GNM gnmA01 = A01(this);
            A0B(this, gnmA01, EnumC9540GNw.A04, EnumC9535GNn.A2K);
            goy.A00(gnmA01);
        }
    }

    @Override // X.GOL
    public void A0P(final GPC gpc, final GOX gox) {
        if (A05(this, new Runnable() { // from class: X.GOG
            public static final String __redex_internal_original_name = "BillingClientImpl$$ExternalSyntheticLambda35";

            @Override // java.lang.Runnable
            public final void run() {
                C9530GNh c9530GNh = this.A00;
                GOX gox2 = gox;
                EnumC9535GNn enumC9535GNn = EnumC9535GNn.A2H;
                EnumC9540GNw enumC9540GNw = EnumC9540GNw.A05;
                GNM gnm = GO0.A0N;
                C9530GNh.A0B(c9530GNh, gnm, enumC9540GNw, enumC9535GNn);
                gox2.A00(gnm);
            }
        }, new CallableC10631I0b(gpc, this, gox, 1)) == null) {
            GNM gnmA01 = A01(this);
            A0B(this, gnmA01, EnumC9540GNw.A05, EnumC9535GNn.A2K);
            gox.A00(gnmA01);
        }
    }

    @Override // X.GOL
    public void A0Q(GP2 gp2, final GO3 go3) {
        if (A05(this, new Runnable() { // from class: X.GOB
            public static final String __redex_internal_original_name = "BillingClientImpl$$ExternalSyntheticLambda4";

            @Override // java.lang.Runnable
            public final void run() {
                C9530GNh c9530GNh = this.A00;
                GO3 go32 = go3;
                EnumC9535GNn enumC9535GNn = EnumC9535GNn.A2H;
                EnumC9540GNw enumC9540GNw = EnumC9540GNw.A08;
                GNM gnm = GO0.A0N;
                C9530GNh.A0B(c9530GNh, gnm, enumC9540GNw, enumC9535GNn);
                GNC gnc = GNE.A00;
                GNJ gnj = GNJ.A02;
                GO3.A00(gnm, go32, gnj, gnj);
            }
        }, new CallableC10631I0b(gp2, this, go3, 2)) == null) {
            GNM gnmA01 = A01(this);
            A0B(this, gnmA01, EnumC9540GNw.A08, EnumC9535GNn.A2K);
            GNC gnc = GNE.A00;
            GNJ gnj = GNJ.A02;
            GO3.A00(gnmA01, go3, gnj, gnj);
        }
    }

    public final synchronized ExecutorService A0S() {
        ExecutorService executorServiceNewFixedThreadPool;
        executorServiceNewFixedThreadPool = this.A05;
        if (executorServiceNewFixedThreadPool == null) {
            executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(GNN.A00, new Bq9());
            this.A05 = executorServiceNewFixedThreadPool;
        }
        return executorServiceNewFixedThreadPool;
    }

    private GNM A00() {
        GNN.A05("BillingClient", "Service connection is valid. No need to re-initialize.");
        int i = C9542GNy.c;
        C9529GNg c9529GNg = new C9529GNg();
        C9542GNy.A0A(EnumC9540GNw.A07, (C9542GNy) GIG.A02(c9529GNg));
        int i2 = GO4.c;
        C9556GOn c9556GOn = new C9556GOn();
        GO4 go4 = (GO4) GIG.A02(c9556GOn);
        go4.bitField0_ |= 2;
        go4.isConnectionAlreadyEstablished_ = true;
        GIF.A08(c9556GOn);
        C9542GNy c9542GNy = (C9542GNy) GIG.A02(c9529GNg);
        GI0 gi0A03 = c9556GOn.A03();
        c9542GNy.getClass();
        c9542GNy.apiDetails_ = gi0A03;
        c9542GNy.apiDetailsCase_ = 3;
        A0F(this, (C9542GNy) c9529GNg.A03());
        return GO0.A0L;
    }

    public static C9557GOo A02(C9530GNh c9530GNh, GNM gnm, EnumC9535GNn enumC9535GNn, Exception exc, String str) {
        GNN.A07("BillingClient", str, exc);
        A0C(c9530GNh, gnm, EnumC9540GNw.A08, enumC9535GNn, GNr.A02(exc));
        return new C9557GOo(gnm.A02, C3cG.A0h(), C3cG.A0h(), gnm.A00);
    }

    public static C9562GOt A03(C9530GNh c9530GNh, GNM gnm, EnumC9535GNn enumC9535GNn, Exception exc, String str) {
        A0C(c9530GNh, gnm, EnumC9540GNw.A09, enumC9535GNn, GNr.A02(exc));
        GNN.A07("BillingClient", str, exc);
        return new C9562GOt(gnm, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A06(C9530GNh c9530GNh) {
        synchronized (c9530GNh.A0O) {
            if (c9530GNh.A0S != null) {
                try {
                    c9530GNh.A01.unbindService(c9530GNh.A0S);
                } finally {
                    try {
                    } finally {
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A07(X.C9530GNh r3, int r4) {
        /*
            r3.A00 = r4
            r0 = 29
            r2 = 1
            if (r4 >= r0) goto Lc
            r0 = 28
            r1 = 0
            if (r4 < r0) goto Ld
        Lc:
            r1 = 1
        Ld:
            r3.A08 = r1
            r0 = 27
            if (r4 >= r0) goto L18
            r0 = 26
            r1 = 0
            if (r4 < r0) goto L19
        L18:
            r1 = 1
        L19:
            r3.A07 = r1
            r0 = 24
            boolean r0 = X.BV5.A1P(r4, r0)
            r3.A06 = r0
            r0 = 23
            if (r4 >= r0) goto L30
            r0 = 22
            if (r4 >= r0) goto L30
            r0 = 21
            r1 = 0
            if (r4 < r0) goto L31
        L30:
            r1 = 1
        L31:
            r3.A0I = r1
            r0 = 20
            boolean r0 = X.BV5.A1P(r4, r0)
            r3.A0H = r0
            r0 = 19
            boolean r0 = X.BV5.A1P(r4, r0)
            r3.A0G = r0
            r0 = 18
            boolean r0 = X.BV5.A1P(r4, r0)
            r3.A0F = r0
            r0 = 17
            boolean r0 = X.BV5.A1P(r4, r0)
            r3.A0E = r0
            r0 = 16
            boolean r0 = X.BV5.A1P(r4, r0)
            r3.A0D = r0
            r0 = 15
            boolean r0 = X.BV5.A1P(r4, r0)
            r3.A0C = r0
            r0 = 14
            boolean r0 = X.BV5.A1P(r4, r0)
            r3.A0B = r0
            r0 = 12
            if (r4 >= r0) goto L74
            r0 = 9
            r1 = 0
            if (r4 < r0) goto L75
        L74:
            r1 = 1
        L75:
            r3.A0A = r1
            r0 = 8
            if (r4 >= r0) goto L7f
            r0 = 6
            if (r4 >= r0) goto L7f
            r2 = 0
        L7f:
            r3.A0J = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9530GNh.A07(X.GNh, int):void");
    }

    public static void A08(C9530GNh c9530GNh, int i) {
        if (i != 0) {
            A09(c9530GNh, 0);
            return;
        }
        synchronized (c9530GNh.A0O) {
            if (c9530GNh.A0R == 3) {
                return;
            }
            A09(c9530GNh, 2);
            GNW gnw = c9530GNh.A0T != null ? c9530GNh.A0T : null;
            if (gnw != null) {
                boolean z = c9530GNh.A0I;
                IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
                IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
                intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
                gnw.A01 = z;
                a aVar = gnw.A04;
                Context context = gnw.A02;
                aVar.A02(context, intentFilter2);
                boolean z2 = gnw.A01;
                a aVar2 = gnw.A03;
                if (z2) {
                    aVar2.A03(context, intentFilter);
                } else {
                    aVar2.A02(context, intentFilter);
                }
            }
        }
    }

    public static void A09(C9530GNh c9530GNh, int i) {
        synchronized (c9530GNh.A0O) {
            if (c9530GNh.A0R != 3) {
                int i2 = c9530GNh.A0R;
                GNN.A05("BillingClient", FGI.A0d("Setting clientState from ", i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? "UNKNOWN" : "CLOSED" : "CONNECTED" : "CONNECTING" : AnonymousClass000.A00(10), " to ", i != 0 ? i != 1 ? i != 2 ? "CLOSED" : "CONNECTED" : "CONNECTING" : AnonymousClass000.A00(10)));
                c9530GNh.A0R = i;
            }
        }
    }

    public static void A0B(C9530GNh c9530GNh, GNM gnm, EnumC9540GNw enumC9540GNw, EnumC9535GNn enumC9535GNn) {
        try {
            A0E(c9530GNh, GNr.A00(gnm, enumC9540GNw, enumC9535GNn, G4i.A01, null));
        } catch (Throwable th) {
            GNN.A07("BillingClient", "Unable to log.", th);
        }
    }

    public static void A0C(C9530GNh c9530GNh, GNM gnm, EnumC9540GNw enumC9540GNw, EnumC9535GNn enumC9535GNn, String str) {
        try {
            A0E(c9530GNh, GNr.A00(gnm, enumC9540GNw, enumC9535GNn, G4i.A01, str));
        } catch (Throwable th) {
            GNN.A07("BillingClient", "Unable to log.", th);
        }
    }

    public static void A0D(C9530GNh c9530GNh, GNM gnm, EnumC9535GNn enumC9535GNn) {
        try {
            GOC goc = (GOC) GNr.A00(gnm, EnumC9540GNw.A07, enumC9535GNn, G4i.A01, null).A0D();
            int i = GO4.c;
            C9556GOn c9556GOn = new C9556GOn();
            GIF.A08(c9556GOn);
            C9541GNx c9541GNx = (C9541GNx) GIG.A02(goc);
            GO4 go4 = (GO4) c9556GOn.A03();
            int i2 = C9541GNx.c;
            c9541GNx.getClass();
            c9541GNx.apiDetails_ = go4;
            c9541GNx.apiDetailsCase_ = 6;
            A0E(c9530GNh, (C9541GNx) goc.A03());
        } catch (Throwable th) {
            GNN.A07("BillingClient", "Unable to log.", th);
        }
    }

    public static void A0E(C9530GNh c9530GNh, C9541GNx c9541GNx) {
        try {
            ((GNT) c9530GNh.A04).A04(c9541GNx, c9530GNh.A00);
        } catch (Throwable th) {
            GNN.A07("BillingClient", "Unable to log.", th);
        }
    }

    public static void A0F(C9530GNh c9530GNh, C9542GNy c9542GNy) {
        try {
            GNT gnt = (GNT) c9530GNh.A04;
            try {
                C9523GNa c9523GNaA04 = GIF.A04(gnt, c9530GNh.A00);
                gnt.A00 = c9523GNaA04;
                try {
                    gnt.A08(c9542GNy, c9523GNaA04);
                } catch (Throwable th) {
                    GNN.A07("BillingLogger", "Unable to log.", th);
                }
            } catch (Throwable th2) {
                GNN.A07("BillingLogger", "Unable to log.", th2);
            }
        } catch (Throwable th3) {
            GNN.A07("BillingClient", "Unable to log.", th3);
        }
    }

    private void A0G(GNM gnm, EnumC9535GNn enumC9535GNn, long j) {
        try {
            C9541GNx c9541GNxA00 = GNr.A00(gnm, EnumC9540GNw.A03, enumC9535GNn, G4i.A01, null);
            try {
                GNT gnt = (GNT) this.A04;
                try {
                    C9523GNa c9523GNaA04 = GIF.A04(gnt, this.A00);
                    gnt.A00 = c9523GNaA04;
                    if (j != 0) {
                        C9524GNb c9524GNb = (C9524GNb) c9523GNaA04.A0D();
                        C9523GNa c9523GNaA01 = GIG.A01(c9524GNb);
                        c9523GNaA01.bitField0_ |= 32;
                        c9523GNaA01.billingClientTransactionId_ = j;
                        c9523GNaA04 = (C9523GNa) c9524GNb.A03();
                    }
                    GNT.A01(c9541GNxA00, gnt, c9523GNaA04);
                } catch (Throwable th) {
                    GNN.A07("BillingLogger", "Unable to log.", th);
                }
            } catch (Throwable th2) {
                GNN.A07("BillingClient", "Unable to log.", th2);
            }
        } catch (Throwable th3) {
            GNN.A07("BillingClient", "Unable to log.", th3);
        }
    }

    private void A0H(GNM gnm, EnumC9535GNn enumC9535GNn, long j) {
        try {
            C9541GNx c9541GNxA00 = GNr.A00(gnm, EnumC9540GNw.A03, enumC9535GNn, G4i.A01, null);
            try {
                ((GNT) this.A04).A05(c9541GNxA00, this.A00, j);
            } catch (Throwable th) {
                GNN.A07("BillingClient", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            GNN.A07("BillingClient", "Unable to log.", th2);
        }
    }

    private void A0I(GNM gnm, EnumC9535GNn enumC9535GNn, String str, long j) {
        try {
            C9541GNx c9541GNxA00 = GNr.A00(gnm, EnumC9540GNw.A03, enumC9535GNn, G4i.A01, str);
            try {
                ((GNT) this.A04).A05(c9541GNxA00, this.A00, j);
            } catch (Throwable th) {
                GNN.A07("BillingClient", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            GNN.A07("BillingClient", "Unable to log.", th2);
        }
    }

    public static boolean A0J(C9530GNh c9530GNh) {
        try {
            GNN.A05("BillingClient", "Already connected or not opted into auto reconnection.");
            int i = GO0.A0L.A00;
            if (i == 0) {
                GNN.A05("BillingClient", FGI.A0H("Reconnection succeeded with result: ", 0));
            } else {
                GNN.A06("BillingClient", FGI.A0H("Reconnection failed with result: ", i));
            }
        } catch (Exception e) {
            if (e instanceof InterruptedException) {
                BV4.A1A();
            }
            GNN.A07("BillingClient", "Error during reconnection attempt: ", e);
        }
        return A0K(c9530GNh);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A0K(X.C9530GNh r3) {
        /*
            java.lang.Object r2 = r3.A0O
            monitor-enter(r2)
            int r1 = r3.A0R     // Catch: java.lang.Throwable -> L14
            r0 = 2
            if (r1 != r0) goto L11
            com.android.billingclient.t5 r0 = r3.A0U     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L11
            X.GNj r1 = r3.A0S     // Catch: java.lang.Throwable -> L14
            r0 = 1
            if (r1 != 0) goto L12
        L11:
            r0 = 0
        L12:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L14
            return r0
        L14:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L14
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9530GNh.A0K(X.GNh):boolean");
    }

    public static boolean A0L(C9530GNh c9530GNh, long j) throws InterruptedException {
        String str;
        Hs5 hs5 = c9530GNh.A0L;
        if (hs5 == null) {
            throw BV4.A0a("ticker");
        }
        long jA00 = hs5.A00();
        int i = AbstractC9566GOx.A00;
        long jA002 = j;
        for (int i2 = 1; i2 <= i; i2++) {
            try {
            } catch (Exception e) {
                if (e instanceof InterruptedException) {
                    BV4.A1A();
                }
                GNN.A07("BillingClient", "Error during reconnection attempt: ", e);
            }
            if (Math.max(0L, jA002) <= 0) {
                GNN.A06("BillingClient", "No time remaining for reconnection attempt.");
                return A0K(c9530GNh);
            }
            GNN.A05("BillingClient", "Already connected or not opted into auto reconnection.");
            int i3 = GO0.A0L.A00;
            if (i3 == 0) {
                GNN.A05("BillingClient", FGI.A0H("Reconnection succeeded with result: ", 0));
                return A0K(c9530GNh);
            }
            GNN.A06("BillingClient", FGI.A0H("Reconnection failed with result: ", i3));
            jA002 = j - ((hs5.A00() - jA00) / 1000000);
            long jPow = ((long) Math.pow(2.0d, i2 - 1)) * 1000;
            if (jA002 < jPow) {
                str = "Reconnection failed due to timeout limit reached.";
                break;
            }
            if (i2 < i && jPow > 0) {
                try {
                    Thread.sleep(jPow);
                    jA002 = j - ((hs5.A00() - jA00) / 1000000);
                } catch (InterruptedException e2) {
                    BV4.A1A();
                    GNN.A07("BillingClient", "Error sleeping during reconnection attempt: ", e2);
                }
            }
        }
        str = "Max retries reached.";
        GNN.A06("BillingClient", str);
        return A0K(c9530GNh);
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x01fb, code lost:
    
        r4 = X.FGI.A0U(r4, r3, ".");
        r3 = X.GO0.A00;
     */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x011f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0166 A[EDGE_INSN: B:368:0x0166->B:76:0x0166 BREAK  A[LOOP:6: B:81:0x018d->B:375:0x018d], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016a  */
    @Override // X.GOL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.GNM A0M(android.app.Activity r28, final X.C9545GOb r29) {
        /*
            Method dump skipped, instructions count: 1908
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9530GNh.A0M(android.app.Activity, X.GOb):X.GNM");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0048 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // X.GOL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A0N() {
        /*
            r6 = this;
            X.GNw r1 = X.EnumC9540GNw.A0A
            X.G4i r0 = X.G4i.A01     // Catch: java.lang.Throwable -> Lc
            X.GNy r0 = X.GNr.A01(r1, r0)     // Catch: java.lang.Throwable -> Lc
            A0F(r6, r0)     // Catch: java.lang.Throwable -> Lc
            goto L14
        Lc:
            r2 = move-exception
            java.lang.String r1 = "BillingClient"
            java.lang.String r0 = "Unable to log."
            X.GNN.A07(r1, r0, r2)
        L14:
            java.lang.Object r5 = r6.A0O
            monitor-enter(r5)
            X.GNW r0 = r6.A0T     // Catch: java.lang.Throwable -> L2a
            if (r0 == 0) goto L32
            X.GNW r2 = r6.A0T     // Catch: java.lang.Throwable -> L2a
            com.android.billingclient.api.a r0 = r2.A03     // Catch: java.lang.Throwable -> L2a
            android.content.Context r1 = r2.A02     // Catch: java.lang.Throwable -> L2a
            r0.A01(r1)     // Catch: java.lang.Throwable -> L2a
            com.android.billingclient.api.a r0 = r2.A04     // Catch: java.lang.Throwable -> L2a
            r0.A01(r1)     // Catch: java.lang.Throwable -> L2a
            goto L32
        L2a:
            r2 = move-exception
            java.lang.String r1 = "BillingClient"
            java.lang.String r0 = "There was an exception while shutting down broadcast manager while ending connection!"
            X.GNN.A07(r1, r0, r2)     // Catch: java.lang.Throwable -> L6a
        L32:
            java.lang.String r4 = "BillingClient"
            java.lang.String r0 = "Unbinding from service."
            X.GNN.A05(r4, r0)     // Catch: java.lang.Throwable -> L3d
            A06(r6)     // Catch: java.lang.Throwable -> L3d
            goto L45
        L3d:
            r1 = move-exception
            java.lang.String r4 = "BillingClient"
            java.lang.String r0 = "There was an exception while unbinding from the service while ending connection!"
            X.GNN.A07(r4, r0, r1)     // Catch: java.lang.Throwable -> L6a
        L45:
            r3 = 0
            r2 = 3
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L56
            java.util.concurrent.ExecutorService r0 = r6.A05     // Catch: java.lang.Throwable -> L53
            if (r0 == 0) goto L51
            r0.shutdownNow()     // Catch: java.lang.Throwable -> L53
            r6.A05 = r3     // Catch: java.lang.Throwable -> L53
        L51:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L56
            goto L5c
        L53:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L53
            throw r0     // Catch: java.lang.Throwable -> L56
        L56:
            r1 = move-exception
            java.lang.String r0 = "There was an exception while shutting down the executor service while ending connection!"
            X.GNN.A07(r4, r0, r1)     // Catch: java.lang.Throwable -> L63
        L5c:
            A09(r6, r2)     // Catch: java.lang.Throwable -> L6a
            r6.A0V = r3     // Catch: java.lang.Throwable -> L6a
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L6a
            return
        L63:
            r0 = move-exception
            A09(r6, r2)     // Catch: java.lang.Throwable -> L6a
            r6.A0V = r3     // Catch: java.lang.Throwable -> L6a
            throw r0     // Catch: java.lang.Throwable -> L6a
        L6a:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L6a
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9530GNh.A0N():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00e4  */
    @Override // X.GOL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A0R(X.C9559GOq r11) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9530GNh.A0R(X.GOq):void");
    }

    public C9530GNh(Context context, GPA gpa, Hxa hxa) {
        String str;
        try {
            str = (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            str = null;
        }
        this.A0Q = str;
        this.A01 = context.getApplicationContext();
        int i = C9523GNa.c;
        C9524GNb c9524GNb = new C9524GNb();
        C9523GNa c9523GNaA01 = GIG.A01(c9524GNb);
        c9523GNaA01.getClass();
        c9523GNaA01.bitField0_ |= 1;
        c9523GNaA01.playBillingLibraryVersion_ = "9.1.0-billing-eap01";
        String str2 = this.A0Q;
        if (str2 != null) {
            C9523GNa c9523GNaA012 = GIG.A01(c9524GNb);
            c9523GNaA012.getClass();
            c9523GNaA012.bitField0_ |= 2;
            c9523GNaA012.playBillingLibraryWrapperVersion_ = str2;
        }
        String packageName = this.A01.getPackageName();
        C9523GNa c9523GNaA013 = GIG.A01(c9524GNb);
        c9523GNaA013.getClass();
        c9523GNaA013.bitField0_ |= 4;
        c9523GNaA013.callingPackage_ = packageName;
        long jLongValue = this.A0N.longValue();
        C9523GNa c9523GNaA014 = GIG.A01(c9524GNb);
        c9523GNaA014.bitField0_ |= 16;
        c9523GNaA014.billingClientSessionId_ = jLongValue;
        C9523GNa c9523GNaA015 = GIG.A01(c9524GNb);
        c9523GNaA015.bitField0_ |= 64;
        c9523GNaA015.isAutoServiceReconnectionEnabled_ = false;
        int i2 = Build.VERSION.SDK_INT;
        C9523GNa c9523GNaA016 = GIG.A01(c9524GNb);
        c9523GNaA016.bitField0_ |= 128;
        c9523GNaA016.androidSdkVersion_ = i2;
        C9523GNa c9523GNaA017 = GIG.A01(c9524GNb);
        c9523GNaA017.bitField0_ |= 512;
        c9523GNaA017.buildChangelist_ = 926256734L;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null) {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                int i3 = (int) (memoryInfo.totalMem / 1048576);
                C9523GNa c9523GNaA018 = GIG.A01(c9524GNb);
                c9523GNaA018.bitField0_ |= 16384;
                c9523GNaA018.deviceRamInMb_ = i3;
                C9523GNa c9523GNaA019 = GIG.A01(c9524GNb);
                String str3 = Build.BRAND;
                c9523GNaA019.getClass();
                str3.getClass();
                c9523GNaA019.bitField0_ |= 1024;
                c9523GNaA019.deviceBrand_ = str3;
                C9523GNa c9523GNaA0110 = GIG.A01(c9524GNb);
                String str4 = Build.MODEL;
                c9523GNaA0110.getClass();
                str4.getClass();
                c9523GNaA0110.bitField0_ |= 2048;
                c9523GNaA0110.deviceModel_ = str4;
                String str5 = Build.MANUFACTURER;
                C9523GNa c9523GNaA0111 = GIG.A01(c9524GNb);
                c9523GNaA0111.getClass();
                str5.getClass();
                c9523GNaA0111.bitField0_ |= 4096;
                c9523GNaA0111.deviceManufacturer_ = str5;
                C9523GNa c9523GNaA0112 = GIG.A01(c9524GNb);
                String str6 = Build.FINGERPRINT;
                c9523GNaA0112.getClass();
                str6.getClass();
                c9523GNaA0112.bitField0_ |= 8192;
                c9523GNaA0112.deviceFingerprint_ = str6;
            }
        } catch (RuntimeException e) {
            GNN.A07("BillingClient", "Runtime error while populating device info.", e);
        }
        try {
            int i4 = this.A01.getPackageManager().getPackageInfo(this.A01.getPackageName(), 0).versionCode;
            C9523GNa c9523GNaA0113 = GIG.A01(c9524GNb);
            c9523GNaA0113.bitField0_ |= 256;
            c9523GNaA0113.appVersionCode_ = i4;
        } catch (Throwable th) {
            GNN.A07("BillingClient", "Error getting app version code.", th);
        }
        GNT gnt = new GNT(this.A01, (C9523GNa) c9524GNb.A03());
        this.A04 = gnt;
        this.A0T = new GNW(this.A01, gnt, hxa);
        this.A02 = gpa;
        C9527GNe c9527GNe = this.A0M;
        this.A01.getPackageName();
        c9527GNe.getClass();
    }

    public static Future A05(C9530GNh c9530GNh, Runnable runnable, Callable callable) {
        return A04(Looper.myLooper() == null ? c9530GNh.A0K : new Handler(Looper.myLooper()), runnable, callable, c9530GNh.A0S(), 30000L);
    }

    public static final void A0A(final C9530GNh c9530GNh, final GNM gnm) {
        if (Thread.interrupted()) {
            return;
        }
        c9530GNh.A0K.post(new Runnable() { // from class: X.GOE
            public static final String __redex_internal_original_name = "BillingClientImpl$$ExternalSyntheticLambda13";

            @Override // java.lang.Runnable
            public final void run() {
                C9530GNh c9530GNh2 = this.A00;
                GNM gnm2 = gnm;
                Hxa hxa = c9530GNh2.A0T.A07;
                C7384Etj.A0Y(gnm2, 0);
                C0881AGi c0881AGi = C0881AGi.A00;
                hxa.A00.AVA(new GOD(gnm2), c0881AGi);
            }
        });
    }
}

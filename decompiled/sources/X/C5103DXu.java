package X;

import android.content.Context;
import android.content.IntentFilter;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* renamed from: X.DXu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5103DXu {
    public static C5103DXu A05;
    public boolean A00;
    public int A01;
    public final Object A02;
    public final CopyOnWriteArrayList<HuD> A03;
    public final Executor A04;

    public static synchronized C5103DXu A00(Context context) {
        C5103DXu c5103DXu;
        c5103DXu = A05;
        if (c5103DXu == null) {
            c5103DXu = new C5103DXu(context);
            A05 = c5103DXu;
        }
        return c5103DXu;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A01(android.content.Context r4, X.C5103DXu r5) {
        /*
            java.lang.String r0 = "connectivity"
            java.lang.Object r1 = r4.getSystemService(r0)
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            r0 = 0
            if (r1 == 0) goto L30
            android.net.NetworkInfo r3 = r1.getActiveNetworkInfo()     // Catch: java.lang.SecurityException -> L30
            r0 = 1
            if (r3 == 0) goto L30
            boolean r1 = r3.isConnected()
            if (r1 == 0) goto L30
            int r2 = r3.getType()
            if (r2 == 0) goto L3d
            if (r2 == r0) goto L49
            r0 = 4
            if (r2 == r0) goto L3d
            r0 = 5
            if (r2 == r0) goto L3d
            r1 = 6
            if (r2 == r1) goto L30
            r1 = 9
            r0 = 7
            if (r2 == r1) goto L30
            r0 = 8
        L30:
            int r2 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r2 < r1) goto L51
            r1 = 5
            if (r0 != r1) goto L51
            X.AbstractC5097DXm.A00(r4, r5)
            return
        L3d:
            int r0 = r3.getSubtype()
            switch(r0) {
                case 1: goto L4f;
                case 2: goto L4f;
                case 3: goto L4d;
                case 4: goto L4d;
                case 5: goto L4d;
                case 6: goto L4d;
                case 7: goto L4d;
                case 8: goto L4d;
                case 9: goto L4d;
                case 10: goto L4d;
                case 11: goto L4d;
                case 12: goto L4d;
                case 13: goto L4b;
                case 14: goto L4d;
                case 15: goto L4d;
                case 16: goto L44;
                case 17: goto L4d;
                case 18: goto L49;
                case 19: goto L44;
                case 20: goto L46;
                default: goto L44;
            }
        L44:
            r0 = 6
            goto L30
        L46:
            r0 = 9
            goto L30
        L49:
            r0 = 2
            goto L30
        L4b:
            r0 = 5
            goto L30
        L4d:
            r0 = 4
            goto L30
        L4f:
            r0 = 3
            goto L30
        L51:
            A03(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5103DXu.A01(android.content.Context, X.DXu):void");
    }

    public static void A02(C5103DXu c5103DXu) {
        CopyOnWriteArrayList<HuD> copyOnWriteArrayList = c5103DXu.A03;
        Iterator<HuD> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            HuD next = it.next();
            if (next.A00.get() == null) {
                copyOnWriteArrayList.remove(next);
            }
        }
    }

    public final int A04() {
        int i;
        synchronized (this.A02) {
            i = this.A01;
        }
        return i;
    }

    public C5103DXu(final Context context) {
        Executor executorA00 = C5341Dgk.A00();
        this.A04 = executorA00;
        this.A03 = new CopyOnWriteArrayList<>();
        this.A02 = C3cG.A0T();
        this.A01 = 0;
        executorA00.execute(new Runnable() { // from class: X.DXt
            public static final String __redex_internal_original_name = "NetworkTypeObserver$$ExternalSyntheticLambda0";

            @Override // java.lang.Runnable
            public final void run() {
                C5103DXu c5103DXu = this;
                Context context2 = context;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                context2.registerReceiver(new C5104DXv(c5103DXu), intentFilter);
            }
        });
    }

    public static void A03(C5103DXu c5103DXu, int i) {
        A02(c5103DXu);
        synchronized (c5103DXu.A02) {
            if (c5103DXu.A00 && c5103DXu.A01 == i) {
                return;
            }
            c5103DXu.A00 = true;
            c5103DXu.A01 = i;
            Iterator<HuD> it = c5103DXu.A03.iterator();
            while (it.hasNext()) {
                HuD next = it.next();
                next.A01.execute(new RunnableC10473Hkk(next));
            }
        }
    }
}

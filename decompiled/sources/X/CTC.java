package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* loaded from: classes5.dex */
public final class CTC implements ServiceConnection {
    public boolean A00;
    public CTH A01;
    public final Context A02;
    public final Intent A03;
    public final Queue<CTD> A04;
    public final ScheduledExecutorService A05;

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0086, code lost:
    
        if (android.util.Log.isLoggable("EnhancedIntentService", 3) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0088, code lost:
    
        android.util.Log.d("EnhancedIntentService", X.C60P.A1P("binder is dead. start connection? ", X.BV4.A0p(39), !r9.A00));
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009d, code lost:
    
        if (r9.A00 != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009f, code lost:
    
        r9.A00 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a1, code lost:
    
        r7 = X.CUD.A00();
        r4 = r9.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b3, code lost:
    
        if (X.CUD.A01(r4, r9.A03, r9, r7, X.C60Q.A0e(r4), 65) != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b5, code lost:
    
        android.util.Log.e("EnhancedIntentService", "binding to the service failed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bb, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00bc, code lost:
    
        android.util.Log.e("EnhancedIntentService", "Exception while binding the service", r1);
     */
    /* JADX WARN: In static synchronized method top region not synchronized by class const: (r9v0 X.CTC) */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final synchronized void A00(X.CTC r9) {
        /*
            r6 = r9
            monitor-enter(r6)
            java.lang.String r3 = "EnhancedIntentService"
            r4 = 3
            boolean r0 = android.util.Log.isLoggable(r3, r4)     // Catch: java.lang.Throwable -> Ld6
            if (r0 == 0) goto L10
            java.lang.String r0 = "flush queue called"
            android.util.Log.d(r3, r0)     // Catch: java.lang.Throwable -> Ld6
        L10:
            java.util.Queue<X.CTD> r2 = r9.A04     // Catch: java.lang.Throwable -> Ld6
            boolean r0 = r2.isEmpty()     // Catch: java.lang.Throwable -> Ld6
            if (r0 != 0) goto Ld4
            boolean r0 = android.util.Log.isLoggable(r3, r4)     // Catch: java.lang.Throwable -> Ld6
            if (r0 == 0) goto L23
            java.lang.String r0 = "found intent to be delivered"
            android.util.Log.d(r3, r0)     // Catch: java.lang.Throwable -> Ld6
        L23:
            X.CTH r0 = r9.A01     // Catch: java.lang.Throwable -> Ld6
            if (r0 == 0) goto L81
            boolean r0 = r0.isBinderAlive()     // Catch: java.lang.Throwable -> Ld6
            if (r0 == 0) goto L81
            boolean r0 = android.util.Log.isLoggable(r3, r4)     // Catch: java.lang.Throwable -> Ld6
            if (r0 == 0) goto L38
            java.lang.String r0 = "binder is alive, sending the intent."
            android.util.Log.d(r3, r0)     // Catch: java.lang.Throwable -> Ld6
        L38:
            java.lang.Object r5 = r2.poll()     // Catch: java.lang.Throwable -> Ld6
            X.CTD r5 = (X.CTD) r5     // Catch: java.lang.Throwable -> Ld6
            X.CTH r2 = r9.A01     // Catch: java.lang.Throwable -> Ld6
            int r1 = android.os.Binder.getCallingUid()     // Catch: java.lang.Throwable -> Ld6
            int r0 = android.os.Process.myUid()     // Catch: java.lang.Throwable -> Ld6
            if (r1 != r0) goto L79
            boolean r0 = android.util.Log.isLoggable(r3, r4)     // Catch: java.lang.Throwable -> Ld6
            if (r0 == 0) goto L55
            java.lang.String r0 = "service received new intent via bind strategy"
            android.util.Log.d(r3, r0)     // Catch: java.lang.Throwable -> Ld6
        L55:
            X.CTB r1 = r2.A00     // Catch: java.lang.Throwable -> Ld6
            android.content.Intent r0 = r5.A01     // Catch: java.lang.Throwable -> Ld6
            boolean r0 = r1.A03(r0)     // Catch: java.lang.Throwable -> Ld6
            if (r0 == 0) goto L63
            r5.A00()     // Catch: java.lang.Throwable -> Ld6
            goto L10
        L63:
            boolean r0 = android.util.Log.isLoggable(r3, r4)     // Catch: java.lang.Throwable -> Ld6
            if (r0 == 0) goto L6e
            java.lang.String r0 = "intent being queued for bg execution"
            android.util.Log.d(r3, r0)     // Catch: java.lang.Throwable -> Ld6
        L6e:
            java.util.concurrent.ExecutorService r1 = r1.A03     // Catch: java.lang.Throwable -> Ld6
            X.CTF r0 = new X.CTF     // Catch: java.lang.Throwable -> Ld6
            r0.<init>(r5, r2)     // Catch: java.lang.Throwable -> Ld6
            r1.execute(r0)     // Catch: java.lang.Throwable -> Ld6
            goto L10
        L79:
            java.lang.String r1 = "Binding only allowed within app"
            java.lang.SecurityException r0 = new java.lang.SecurityException     // Catch: java.lang.Throwable -> Ld6
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Ld6
            throw r0     // Catch: java.lang.Throwable -> Ld6
        L81:
            boolean r0 = android.util.Log.isLoggable(r3, r4)     // Catch: java.lang.Throwable -> Ld6
            r5 = 1
            if (r0 == 0) goto L9b
            boolean r0 = r9.A00     // Catch: java.lang.Throwable -> Ld6
            r4 = r0 ^ 1
            r0 = 39
            java.lang.StringBuilder r1 = X.BV4.A0p(r0)     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r0 = "binder is dead. start connection? "
            java.lang.String r0 = X.C60P.A1P(r0, r1, r4)     // Catch: java.lang.Throwable -> Ld6
            android.util.Log.d(r3, r0)     // Catch: java.lang.Throwable -> Ld6
        L9b:
            boolean r0 = r9.A00     // Catch: java.lang.Throwable -> Ld6
            if (r0 != 0) goto Ld4
            r9.A00 = r5     // Catch: java.lang.Throwable -> Ld6
            X.CUD r7 = X.CUD.A00()     // Catch: java.lang.SecurityException -> Lbb java.lang.Throwable -> Ld6
            android.content.Context r4 = r9.A02     // Catch: java.lang.SecurityException -> Lbb java.lang.Throwable -> Ld6
            android.content.Intent r5 = r9.A03     // Catch: java.lang.SecurityException -> Lbb java.lang.Throwable -> Ld6
            r9 = 65
            java.lang.String r8 = X.C60Q.A0e(r4)     // Catch: java.lang.SecurityException -> Lbb java.lang.Throwable -> Ld6
            boolean r0 = X.CUD.A01(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.SecurityException -> Lbb java.lang.Throwable -> Ld6
            if (r0 != 0) goto Ld4
            java.lang.String r0 = "binding to the service failed"
            android.util.Log.e(r3, r0)     // Catch: java.lang.SecurityException -> Lbb java.lang.Throwable -> Ld6
            goto Lc1
        Lbb:
            r1 = move-exception
            java.lang.String r0 = "Exception while binding the service"
            android.util.Log.e(r3, r0, r1)     // Catch: java.lang.Throwable -> Ld6
        Lc1:
            r0 = 0
            r6.A00 = r0     // Catch: java.lang.Throwable -> Ld6
        Lc4:
            boolean r0 = r2.isEmpty()     // Catch: java.lang.Throwable -> Ld6
            if (r0 != 0) goto Ld4
            java.lang.Object r0 = r2.poll()     // Catch: java.lang.Throwable -> Ld6
            X.CTD r0 = (X.CTD) r0     // Catch: java.lang.Throwable -> Ld6
            r0.A00()     // Catch: java.lang.Throwable -> Ld6
            goto Lc4
        Ld4:
            monitor-exit(r6)
            return
        Ld6:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Ld6
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CTC.A00(X.CTC):void");
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (BV4.A1U("EnhancedIntentService")) {
            String strValueOf = String.valueOf(componentName);
            BV8.A1P(BV4.A0p(BV5.A04(strValueOf) + 20), "onServiceConnected: ", strValueOf, "EnhancedIntentService");
        }
        this.A00 = false;
        if (!(iBinder instanceof CTH)) {
            String strValueOf2 = String.valueOf(iBinder);
            Log.e("EnhancedIntentService", C60P.A1M("Invalid service connection: ", strValueOf2, BV4.A0p(BV5.A04(strValueOf2) + 28)));
            while (true) {
                Queue<CTD> queue = this.A04;
                if (queue.isEmpty()) {
                    break;
                } else {
                    queue.poll().A00();
                }
            }
        } else {
            this.A01 = (CTH) iBinder;
            A00(this);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            String strValueOf = String.valueOf(componentName);
            BV8.A1P(BV4.A0p(BV5.A04(strValueOf) + 23), "onServiceDisconnected: ", strValueOf, "EnhancedIntentService");
        }
        A00(this);
    }

    public CTC(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new C04("Firebase-FirebaseInstanceIdServiceConnection"));
        this.A04 = BV4.A0s();
        this.A00 = false;
        Context applicationContext = context.getApplicationContext();
        this.A02 = applicationContext;
        this.A03 = C60P.A03("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.A05 = scheduledThreadPoolExecutor;
    }
}

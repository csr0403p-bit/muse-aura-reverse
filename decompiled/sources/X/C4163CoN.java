package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.CoN, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4163CoN implements Handler.Callback {
    public static C4163CoN A0E;
    public static final Status A0F = new Status(4, "Sign-out occurred while this API call was in progress.");
    public static final Status A0G = new Status(4, "The user must be signed in to make this API call.");
    public static final Object A0H = C3cG.A0T();
    public Cc7 A01;
    public TelemetryData A03;
    public final Context A04;
    public final Handler A05;
    public final C4001CjU A06;
    public final C4268Crr A07;
    public volatile boolean A0D;
    public long A00 = 10000;
    public boolean A02 = false;
    public final AtomicInteger A0A = BV4.A13(1);
    public final AtomicInteger A0B = BV4.A13(0);
    public final Map A08 = new ConcurrentHashMap(5, 0.75f, 1);
    public final Set A09 = new Ao0(0);
    public final Set A0C = new Ao0(0);

    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A05(X.AbstractC4178Com r9, X.C4163CoN r10, X.CSE r11, int r12) {
        /*
            r6 = r12
            if (r12 == 0) goto L5e
            X.CrJ r4 = r9.A06
            r5 = r10
            boolean r0 = r10.A06()
            if (r0 == 0) goto L5e
            X.Ctv r0 = X.C4353Ctv.A00()
            com.google.android.gms.common.internal.RootTelemetryConfiguration r1 = r0.A00
            if (r1 == 0) goto L5f
            boolean r0 = r1.A03
            if (r0 == 0) goto L5e
            boolean r3 = r1.A04
            java.util.Map r0 = r10.A08
            java.lang.Object r2 = r0.get(r4)
            X.CoO r2 = (X.C4164CoO) r2
            if (r2 == 0) goto L44
            X.CpP r1 = r2.A04
            boolean r0 = r1 instanceof X.AbstractC4160CoH
            if (r0 == 0) goto L5e
            X.CoH r1 = (X.AbstractC4160CoH) r1
            com.google.android.gms.common.internal.zzk r0 = r1.A0L
            if (r0 == 0) goto L44
            boolean r0 = r1.AOH()
            if (r0 != 0) goto L44
            com.google.android.gms.common.internal.ConnectionTelemetryConfiguration r1 = X.C4166CoR.A00(r2, r1, r12)
            if (r1 == 0) goto L5e
            int r0 = r2.A00
            int r0 = r0 + 1
            r2.A00 = r0
            boolean r3 = r1.A03
        L44:
            r9 = 0
            if (r3 != 0) goto L5f
            r7 = 0
        L4a:
            X.CoR r3 = new X.CoR
            r3.<init>(r4, r5, r6, r7, r9)
            X.CSC r2 = r11.A00
            android.os.Handler r1 = r5.A05
            r1.getClass()
            X.Bbc r0 = new X.Bbc
            r0.<init>()
            r2.A09(r3, r0)
        L5e:
            return
        L5f:
            long r7 = java.lang.System.currentTimeMillis()
            long r9 = android.os.SystemClock.elapsedRealtime()
            goto L4a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4163CoN.A05(X.Com, X.CoN, X.CSE, int):void");
    }

    public static Status A00(ConnectionResult connectionResult, C4247CrJ c4247CrJ) {
        return new Status(connectionResult.A02, connectionResult, FGI.A0d("API: ", c4247CrJ.A00.A02, " is not available on this device. Connection failed with: ", String.valueOf(connectionResult)), 17);
    }

    public static C4163CoN A01(Context context) {
        C4163CoN c4163CoN;
        HandlerThread handlerThread;
        synchronized (A0H) {
            c4163CoN = A0E;
            if (c4163CoN == null) {
                synchronized (C3649Cbe.A07) {
                    handlerThread = C3649Cbe.A05;
                    if (handlerThread == null) {
                        HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                        C3649Cbe.A05 = handlerThread2;
                        handlerThread2.start();
                        handlerThread = C3649Cbe.A05;
                    }
                }
                c4163CoN = new C4163CoN(context.getApplicationContext(), handlerThread.getLooper(), C4001CjU.A00);
                A0E = c4163CoN;
            }
        }
        return c4163CoN;
    }

    private final C4164CoO A02(AbstractC4178Com abstractC4178Com) {
        Map map = this.A08;
        C4247CrJ c4247CrJ = abstractC4178Com.A06;
        C4164CoO c4164CoO = (C4164CoO) map.get(c4247CrJ);
        if (c4164CoO == null) {
            c4164CoO = new C4164CoO(abstractC4178Com, this);
            map.put(c4247CrJ, c4164CoO);
        }
        if (c4164CoO.A04.AbJ()) {
            this.A0C.add(c4247CrJ);
        }
        c4164CoO.A08();
        return c4164CoO;
    }

    public static void A03() {
        synchronized (A0H) {
            C4163CoN c4163CoN = A0E;
            if (c4163CoN != null) {
                c4163CoN.A0B.incrementAndGet();
                Handler handler = c4163CoN.A05;
                handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
            }
        }
    }

    private final void A04() {
        TelemetryData telemetryData = this.A03;
        if (telemetryData != null) {
            if (telemetryData.A01 > 0 || A06()) {
                Cc7 c4106Cmn = this.A01;
                if (c4106Cmn == null) {
                    c4106Cmn = new C4106Cmn(this.A04, C3784CeS.A01);
                    this.A01 = c4106Cmn;
                }
                c4106Cmn.APt(telemetryData);
            }
            this.A03 = null;
        }
    }

    public final boolean A06() {
        if (this.A02) {
            return false;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration = C4353Ctv.A00().A00;
        if (rootTelemetryConfiguration != null && !rootTelemetryConfiguration.A03) {
            return false;
        }
        int i = this.A07.A01.get(203400000, -1);
        return i == -1 || i == 0;
    }

    public final boolean A07(ConnectionResult connectionResult, int i) throws Resources.NotFoundException {
        boolean zIsInstantApp;
        Intent intentA02;
        PendingIntent activity;
        Boolean bool;
        C4001CjU c4001CjU = this.A06;
        Context context = this.A04;
        synchronized (C4371CuR.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = C4371CuR.A00;
            if (context2 == null || (bool = C4371CuR.A01) == null || context2 != applicationContext) {
                C4371CuR.A01 = null;
                zIsInstantApp = applicationContext.getPackageManager().isInstantApp();
                C4371CuR.A01 = Boolean.valueOf(zIsInstantApp);
                C4371CuR.A00 = applicationContext;
            } else {
                zIsInstantApp = bool.booleanValue();
            }
        }
        if (zIsInstantApp) {
            return false;
        }
        int i2 = connectionResult.A01;
        if ((i2 == 0 || (activity = connectionResult.A02) == null) && ((intentA02 = c4001CjU.A02(context, null, i2)) == null || (activity = PendingIntent.getActivity(context, 0, intentA02, 201326592)) == null)) {
            return false;
        }
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra("pending_intent", activity);
        intent.putExtra("failing_client_id", i);
        intent.putExtra("notify_manager", true);
        C4001CjU.A00(PendingIntent.getActivity(context, 0, intent, AbstractC4385Cul.A00 | 134217728), context, c4001CjU, i2);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0185, code lost:
    
        if (r1.A02 != false) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02b4  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r10) {
        /*
            Method dump skipped, instructions count: 964
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4163CoN.handleMessage(android.os.Message):boolean");
    }

    public C4163CoN(Context context, Looper looper, C4001CjU c4001CjU) {
        this.A0D = true;
        this.A04 = context;
        HandlerC4000CjT handlerC4000CjT = new HandlerC4000CjT(looper, this);
        this.A05 = handlerC4000CjT;
        this.A06 = c4001CjU;
        this.A07 = new C4268Crr(c4001CjU);
        PackageManager packageManager = context.getPackageManager();
        Boolean boolValueOf = AbstractC3629CaM.A03;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.automotive"));
            AbstractC3629CaM.A03 = boolValueOf;
        }
        if (boolValueOf.booleanValue()) {
            this.A0D = false;
        }
        BV4.A1C(handlerC4000CjT, 6);
    }
}

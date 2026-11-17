package X;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: X.Cna, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4133Cna extends AbstractC4162CoM {
    public final CaR A00;
    public final InterfaceC4142Cnk A01;
    public final C4102CmZ A02;
    public final C4102CmZ A03;
    public final C4102CmZ A04;
    public final C4102CmZ A05;
    public final C4102CmZ A06;
    public final C4102CmZ A07;
    public final C4102CmZ A08;
    public final C4102CmZ A09;
    public final C4102CmZ A0A;
    public final C4102CmZ A0B;
    public final C4102CmZ A0C;
    public final C4102CmZ A0D;
    public final ExecutorService A0E;

    @Override // X.AbstractC4160CoH
    public final void A05(Bundle bundle, IBinder iBinder, int i, int i2) {
        if (Log.isLoggable("WearableClient", 2)) {
            Log.v("WearableClient", FGI.A0H("onPostInitHandler: statusCode ", i));
        }
        if (i == 0) {
            this.A02.A00(iBinder);
            this.A03.A00(iBinder);
            this.A04.A00(iBinder);
            this.A06.A00(iBinder);
            this.A07.A00(iBinder);
            this.A08.A00(iBinder);
            this.A09.A00(iBinder);
            this.A0A.A00(iBinder);
            this.A0B.A00(iBinder);
            this.A05.A00(iBinder);
            i = 0;
        }
        super.A05(bundle, iBinder, i, i2);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v7 int, still in use, count: 2, list:
          (r2v7 int) from 0x0024: IF  (r2v7 int) < (8600000 int)  -> B:8:0x0026 A[HIDDEN] (LINE:36)
          (r2v7 int) from 0x0026: PHI (r2v2 int) = (r2v1 int), (r2v7 int) binds: [B:12:0x007f, B:7:0x0024] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // X.AbstractC4160CoH, X.InterfaceC4191CpP
    public final void A6s(X.InterfaceC4395Cv0 r8) {
        /*
            r7 = this;
            java.lang.String r5 = "com.google.android.wearable.app.cn"
            java.lang.String r6 = "The Wear OS app is out of date. Requires API version 8600000 but found "
            boolean r0 = r7.AbG()
            if (r0 != 0) goto L9d
            android.content.Context r4 = r7.A0A     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L82
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L82
            r0 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r0 = r1.getApplicationInfo(r5, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L82
            android.os.Bundle r1 = r0.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L82
            r3 = 0
            if (r1 == 0) goto L7f
            java.lang.String r0 = "com.google.android.wearable.api.version"
            int r2 = r1.getInt(r0, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L82
            r0 = 8600000(0x8339c0, float:1.2051167E-38)
            if (r2 >= r0) goto L9d
        L26:
            java.lang.String r1 = "WearableClient"
            java.lang.String r0 = X.FGI.A0H(r6, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L82
            android.util.Log.w(r1, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L82
            java.lang.String r0 = "com.google.android.wearable.app.cn.UPDATE_ANDROID_WEAR"
            android.content.Intent r0 = X.C60P.A03(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L82
            android.content.Intent r2 = r0.setPackage(r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L82
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L82
            r0 = 65536(0x10000, float:9.18355E-41)
            android.content.pm.ResolveInfo r0 = r1.resolveActivity(r2, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L82
            if (r0 != 0) goto L60
            java.lang.String r0 = "market://details"
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L82
            android.net.Uri$Builder r1 = r0.buildUpon()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L82
            java.lang.String r0 = "id"
            android.net.Uri$Builder r0 = r1.appendQueryParameter(r0, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L82
            android.net.Uri r1 = r0.build()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L82
            java.lang.String r0 = "android.intent.action.VIEW"
            android.content.Intent r2 = new android.content.Intent     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L82
            r2.<init>(r0, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L82
        L60:
            int r0 = X.AbstractC4138Cnf.A00     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L82
            android.app.PendingIntent r4 = android.app.PendingIntent.getActivity(r4, r3, r2, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L82
            r3 = 6
            java.lang.String r0 = "Connection progress callbacks cannot be null."
            X.CRy.A04(r8, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L82
            r7.A02 = r8     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L82
            java.util.concurrent.atomic.AtomicInteger r0 = r7.A05     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L82
            int r2 = r0.get()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L82
            android.os.Handler r1 = r7.A0B     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L82
            r0 = 3
            android.os.Message r0 = r1.obtainMessage(r0, r2, r3, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L82
            r1.sendMessage(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L82
            goto L81
        L7f:
            r2 = 0
            goto L26
        L81:
            return
        L82:
            r4 = 0
            r3 = 16
            java.lang.String r0 = "Connection progress callbacks cannot be null."
            X.CRy.A04(r8, r0)
            r7.A02 = r8
            java.util.concurrent.atomic.AtomicInteger r0 = r7.A05
            int r2 = r0.get()
            android.os.Handler r1 = r7.A0B
            r0 = 3
            android.os.Message r0 = r1.obtainMessage(r0, r2, r3, r4)
            r1.sendMessage(r0)
            return
        L9d:
            super.A6s(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4133Cna.A6s(X.Cv0):void");
    }

    @Override // X.AbstractC4160CoH, X.InterfaceC4191CpP
    public final boolean AbG() {
        return AnonymousClass002.A1M(this.A00.A01() ? 1 : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4133Cna(final Context context, Looper looper, InterfaceC4139Cng interfaceC4139Cng, InterfaceC4140Cnh interfaceC4140Cnh, C4173Cod c4173Cod) {
        super(context, looper, interfaceC4139Cng, interfaceC4140Cnh, c4173Cod, 14);
        ExecutorService executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        byte[] bArr = CaR.A02;
        CRy.A03(context);
        synchronized (CaR.class) {
            if (CaR.A01 == null) {
                CaR.A01 = new CaR(context);
            }
        }
        CaR caR = CaR.A01;
        this.A02 = new C4102CmZ();
        this.A03 = new C4102CmZ();
        this.A04 = new C4102CmZ();
        this.A05 = new C4102CmZ();
        this.A06 = new C4102CmZ();
        this.A07 = new C4102CmZ();
        this.A08 = new C4102CmZ();
        this.A09 = new C4102CmZ();
        this.A0A = new C4102CmZ();
        this.A0B = new C4102CmZ();
        this.A0C = new C4102CmZ();
        this.A0D = new C4102CmZ();
        CRy.A03(executorServiceUnconfigurableExecutorService);
        this.A0E = executorServiceUnconfigurableExecutorService;
        this.A00 = caR;
        InterfaceC4142Cnk interfaceC4142Cnk = new InterfaceC4142Cnk() { // from class: X.Cne
        };
        C4135Cnc c4135Cnc = new C4135Cnc();
        c4135Cnc.A00 = interfaceC4142Cnk;
        this.A01 = c4135Cnc;
    }

    @Override // X.AbstractC4160CoH, X.InterfaceC4191CpP
    public final int AHi() {
        return 8600000;
    }
}

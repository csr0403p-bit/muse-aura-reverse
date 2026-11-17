package X;

import android.content.Context;
import android.os.SystemClock;
import android.os.Trace;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import androidx.camera.core.impl.CameraValidator$CameraIdListIncorrectException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Bh6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class RunnableC2668Bh6 implements Runnable {
    public static final String __redex_internal_original_name = "CameraX$$ExternalSyntheticLambda2";
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ Context A02;
    public final /* synthetic */ C2679Bhc A03;
    public final /* synthetic */ C3010Brs A04;
    public final /* synthetic */ Executor A05;

    @Override // java.lang.Runnable
    public final void run() {
        C2584Beg c2584Beg;
        Object objAbk;
        Object objAbk2;
        Object objAbk3;
        Object objAbk4;
        ThreadPoolExecutor threadPoolExecutor;
        final C2679Bhc c2679Bhc = this.A03;
        Context context = this.A02;
        final Executor executor = this.A05;
        final int i = this.A00;
        final C3010Brs c3010Brs = this.A04;
        final long j = this.A01;
        AbstractC3136BzG.A00("CX:initAndRetryRecursively");
        final Context contextA00 = Bq3.A00(context);
        try {
            try {
                c2584Beg = c2679Bhc.A07.A00;
                try {
                    objAbk = c2584Beg.Abk(C2647Bge.A03);
                } catch (IllegalArgumentException unused) {
                    objAbk = null;
                }
            } finally {
                Trace.endSection();
            }
        } catch (InitializationException | CameraValidator$CameraIdListIncorrectException | RuntimeException e) {
            e = e;
            Bh8 bh8 = new Bh8(j, e);
            BhF bhFAVa = c2679Bhc.A08.AVa(bh8);
            if (Trace.isEnabled()) {
                AbstractC3136BzG.A01("CX:CameraProvider-RetryStatus", bh8.A00);
            }
            if (!bhFAVa.A02 || i >= Integer.MAX_VALUE) {
                Object obj = c2679Bhc.A0B;
                synchronized (obj) {
                    try {
                        c2679Bhc.A04 = C79.A0C;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (bhFAVa.A01) {
                    synchronized (obj) {
                        try {
                            c2679Bhc.A04 = C79.A0K;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    c3010Brs.A03(null);
                } else {
                    if (e instanceof CameraValidator$CameraIdListIncorrectException) {
                        String strA0H = FGI.A0H("Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: ", ((CameraValidator$CameraIdListIncorrectException) e).mAvailableCameraCount);
                        AbstractC2875Bni.A05("CameraX", strA0H, e);
                        e = new InitializationException(new CameraUnavailableException(strA0H));
                    } else if (!(e instanceof InitializationException)) {
                        c3010Brs.A04(new InitializationException(e));
                    }
                    c3010Brs.A04(e);
                }
            } else {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                StringBuilder sbA0g = C3cG.A0g("Retry init. Start time ");
                sbA0g.append(j);
                AbstractC2875Bni.A06("CameraX", BV7.A0z(" current time ", sbA0g, jElapsedRealtime), e);
                c2679Bhc.A05.postDelayed(new Runnable() { // from class: X.Bh9
                    public static final String __redex_internal_original_name = "CameraX$$ExternalSyntheticLambda1";

                    @Override // java.lang.Runnable
                    public final void run() {
                        C2679Bhc c2679Bhc2 = c2679Bhc;
                        Executor executor2 = executor;
                        executor2.execute(new RunnableC2668Bh6(contextA00, c2679Bhc2, c3010Brs, executor2, i + 1, j));
                    }
                }, "retry_token", bhFAVa.A00);
            }
        }
        if (((Bh4) objAbk) == null) {
            throw new InitializationException(C60O.A0i("Invalid app configuration provided. Missing CameraFactory."));
        }
        C2432BbI c2432BbI = new C2432BbI(c2679Bhc.A05, c2679Bhc.A0C);
        try {
            objAbk2 = c2584Beg.Abk(C2647Bge.A01);
        } catch (IllegalArgumentException unused2) {
            objAbk2 = null;
        }
        C2565Bdt c2565Bdt = (C2565Bdt) objAbk2;
        Object objAbk5 = -1L;
        try {
            objAbk5 = c2584Beg.Abk(C2647Bge.A04);
        } catch (IllegalArgumentException unused3) {
        }
        c2679Bhc.A01 = new C2537BdO(contextA00, c2565Bdt, c2432BbI, BV4.A06(objAbk5));
        try {
            objAbk3 = c2584Beg.Abk(C2647Bge.A06);
        } catch (IllegalArgumentException unused4) {
            objAbk3 = null;
        }
        if (((Bh5) objAbk3) == null) {
            throw new InitializationException(C60O.A0i("Invalid app configuration provided. Missing CameraDeviceSurfaceManager."));
        }
        C2537BdO c2537BdO = (C2537BdO) c2679Bhc.A01;
        try {
            c2679Bhc.A00 = new C2495BcM(contextA00, c2537BdO.A03, new LinkedHashSet(c2537BdO.A07));
            try {
                objAbk4 = c2584Beg.Abk(C2647Bge.A0A);
            } catch (IllegalArgumentException unused5) {
                objAbk4 = null;
            }
            if (((InterfaceC2673BhJ) objAbk4) == null) {
                throw new InitializationException(C60O.A0i("Invalid app configuration provided. Missing UseCaseConfigFactory."));
            }
            c2679Bhc.A02 = new BfH(contextA00);
            if (executor instanceof Bh7) {
                Bh7 bh7 = (Bh7) executor;
                InterfaceC2541BdS interfaceC2541BdS = c2679Bhc.A01;
                interfaceC2541BdS.getClass();
                synchronized (bh7.A01) {
                    if (bh7.A00.isShutdown()) {
                        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), Bh7.A02);
                        threadPoolExecutor2.setRejectedExecutionHandler(new RejectedExecutionHandlerC2671BhG());
                        bh7.A00 = threadPoolExecutor2;
                    }
                    threadPoolExecutor = bh7.A00;
                }
                int iMax = Math.max(1, new LinkedHashSet(((C2537BdO) interfaceC2541BdS).A07).size());
                threadPoolExecutor.setMaximumPoolSize(iMax);
                threadPoolExecutor.setCorePoolSize(iMax);
            }
            C2569Bdy c2569Bdy = c2679Bhc.A09;
            InterfaceC2541BdS interfaceC2541BdS2 = c2679Bhc.A01;
            synchronized (c2569Bdy.A00) {
                try {
                    C2537BdO c2537BdO2 = (C2537BdO) interfaceC2541BdS2;
                    List<String> list = c2537BdO2.A07;
                    Iterator it = new LinkedHashSet(list).iterator();
                    while (it.hasNext()) {
                        String strA0j = AnonymousClass005.A0j(it);
                        AbstractC2875Bni.A04("Added camera: ", strA0j, "CameraRepository");
                        Map<String, InterfaceC2610Bfb> map = c2569Bdy.A01;
                        if (!list.contains(strA0j)) {
                            throw C60O.A0i("The given camera id is not on the available camera id list.");
                        }
                        Context context2 = c2537BdO2.A01;
                        C2538BdP c2538BdP = c2537BdO2.A03;
                        C2532BdJ c2532BdJA00 = c2537BdO2.A00(strA0j);
                        InterfaceC2794BlU interfaceC2794BlU = c2537BdO2.A04;
                        BjD bjD = c2537BdO2.A05;
                        C2432BbI c2432BbI2 = (C2432BbI) c2537BdO2.A06;
                        map.put(strA0j, new Bj4(context2, c2432BbI2.A00, c2532BdJA00, c2537BdO2.A02, c2538BdP, interfaceC2794BlU, bjD, strA0j, c2432BbI2.A01, c2537BdO2.A00));
                    }
                } catch (CameraUnavailableException e2) {
                    throw new InitializationException(e2);
                }
            }
            AbstractC2567Bdv.A00(contextA00, c2565Bdt, c2569Bdy);
            if (i > 1 && Trace.isEnabled()) {
                AbstractC3136BzG.A01("CX:CameraProvider-RetryStatus", -1);
            }
            synchronized (c2679Bhc.A0B) {
                c2679Bhc.A04 = C79.A0K;
            }
            c3010Brs.A03(null);
        } catch (CameraUnavailableException e3) {
            throw new InitializationException(e3);
        }
    }

    public /* synthetic */ RunnableC2668Bh6(Context context, C2679Bhc c2679Bhc, C3010Brs c3010Brs, Executor executor, int i, long j) {
        this.A03 = c2679Bhc;
        this.A02 = context;
        this.A05 = executor;
        this.A00 = i;
        this.A04 = c3010Brs;
        this.A01 = j;
    }
}

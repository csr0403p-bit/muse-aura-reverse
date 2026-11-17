package X;

import android.graphics.Rect;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import androidx.lifecycle.OnLifecycleEvent;
import com.google.mlkit.common.MlKitException;
import java.io.Closeable;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.CRd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3503CRd<DetectionResultT> implements Closeable, C2Kw {
    public static final CA9 A05 = new CA9("MobileVisionBase", "");
    public final AbstractC3512CRm A00;
    public final C3511CRl A01;
    public final CSA A02;
    public final Executor A03;
    public final AtomicBoolean A04 = C60O.A1E();

    public final synchronized CSA<DetectionResultT> A00(final C3665CcL c3665CcL) {
        MlKitException mlKitException;
        CSC csc;
        if (this.A04.get()) {
            mlKitException = new MlKitException("This detector is already closed!", 14);
            csc = new CSC();
        } else if (c3665CcL.A00 < 32 || c3665CcL.A01 < 32) {
            mlKitException = new MlKitException("InputImage width and height should be at least 32!", 3);
            csc = new CSC();
        } else {
            AbstractC3512CRm abstractC3512CRm = this.A00;
            Executor executor = this.A03;
            csc = abstractC3512CRm.A01(this.A01.A00, new Callable() { // from class: X.CRp
                @Override // java.util.concurrent.Callable
                public final Object call() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
                    C3516CRq c3516CRq;
                    List listA0t;
                    Rect rect;
                    C3503CRd c3503CRd = this;
                    C3665CcL c3665CcL2 = c3665CcL;
                    C3518CRs.A00();
                    C3518CRs.A00();
                    if (Boolean.parseBoolean("")) {
                        Map map = C3516CRq.A06;
                        if (map.get("detectorTaskWithResource#run") == null) {
                            map.put("detectorTaskWithResource#run", new C3516CRq());
                        }
                        c3516CRq = (C3516CRq) map.get("detectorTaskWithResource#run");
                    } else {
                        c3516CRq = C3517CRr.A00;
                    }
                    if (!(c3516CRq instanceof C3517CRr)) {
                        c3516CRq.A02 = BV4.A04(SystemClock.elapsedRealtimeNanos());
                    }
                    try {
                        AbstractC3512CRm abstractC3512CRm2 = c3503CRd.A00;
                        if (abstractC3512CRm2 instanceof C3658CcB) {
                            C3658CcB c3658CcB = (C3658CcB) abstractC3512CRm2;
                            synchronized (abstractC3512CRm2) {
                                try {
                                    CRy.A04(c3665CcL2, "Mobile vision input can not be null");
                                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                                    try {
                                        listA0t = c3658CcB.A03.AjG(c3665CcL2);
                                        C3658CcB.A00(EnumC10410Hbh.A02, c3665CcL2, c3658CcB, jElapsedRealtime);
                                        c3658CcB.A00 = false;
                                    } catch (MlKitException e) {
                                        C3658CcB.A00(e.zza == 14 ? EnumC10410Hbh.A03 : EnumC10410Hbh.A01, c3665CcL2, c3658CcB, jElapsedRealtime);
                                        throw e;
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            c3516CRq.close();
                            return listA0t;
                        }
                        Cc0 cc0 = (Cc0) abstractC3512CRm2;
                        synchronized (abstractC3512CRm2) {
                            try {
                                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                                Cc1 cc1 = cc0.A02;
                                if (c3665CcL2.A03 == -1) {
                                    long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                                    LinkedList linkedList = cc1.A01;
                                    BV6.A1R(linkedList, jElapsedRealtime3);
                                    if (linkedList.size() > 5) {
                                        linkedList.removeFirst();
                                    }
                                    if (linkedList.size() == 5) {
                                        Object objPeekFirst = linkedList.peekFirst();
                                        CRy.A03(objPeekFirst);
                                        if (jElapsedRealtime3 - BV4.A06(objPeekFirst) < 5000) {
                                            long j = cc1.A00;
                                            if (j == -1 || jElapsedRealtime3 - j >= 5000) {
                                                cc1.A00 = jElapsedRealtime3;
                                                CA9 ca9 = Cc1.A02;
                                                if (Log.isLoggable("StreamingFormatChecker", 5)) {
                                                    String str = ca9.A01;
                                                    Log.w("StreamingFormatChecker", str != null ? str.concat("ML Kit has detected that you seem to pass camera frames to the detector as a Bitmap object. This is inefficient. Please use YUV_420_888 format for camera2 API or NV21 format for (legacy) camera API and directly pass down the byte array to ML Kit.") : "ML Kit has detected that you seem to pass camera frames to the detector as a Bitmap object. This is inefficient. Please use YUV_420_888 format for camera2 API or NV21 format for (legacy) camera API and directly pass down the byte array to ML Kit.");
                                                }
                                            }
                                        }
                                    }
                                }
                                try {
                                    Pair pairAjD = cc0.A04.AjD(c3665CcL2);
                                    List<C4208CqE> list = (List) pairAjD.first;
                                    List<C4208CqE> list2 = (List) pairAjD.second;
                                    if (list == null && list2 == null) {
                                        throw new MlKitException("No detector is enabled", 13);
                                    }
                                    if (list == null) {
                                        CRy.A03(list2);
                                        listA0t = list2;
                                    } else if (list2 == null) {
                                        listA0t = list;
                                    } else {
                                        HashSet hashSetA13 = C60O.A13();
                                        for (C4208CqE c4208CqE : list2) {
                                            boolean z = false;
                                            for (C4208CqE c4208CqE2 : list) {
                                                Rect rect2 = c4208CqE.A03;
                                                if (rect2 != null && (rect = c4208CqE2.A03) != null && rect2.intersect(rect)) {
                                                    double dMin = (Math.min(rect2.right, rect.right) - Math.max(rect2.left, rect.left)) * (Math.min(rect2.bottom, rect.bottom) - Math.max(rect2.top, rect.top));
                                                    if (dMin / ((((r3 - r15) * (r2 - r0)) + ((r13 - r1) * (r1 - r14))) - dMin) > 0.6d) {
                                                        SparseArray sparseArray = c4208CqE.A05;
                                                        SparseArray sparseArray2 = c4208CqE2.A05;
                                                        sparseArray2.clear();
                                                        for (int i = 0; i < sparseArray.size(); i++) {
                                                            sparseArray2.put(sparseArray.keyAt(i), sparseArray.valueAt(i));
                                                        }
                                                        z = true;
                                                    }
                                                }
                                                hashSetA13.add(c4208CqE2);
                                            }
                                            if (!z) {
                                                hashSetA13.add(c4208CqE);
                                            }
                                        }
                                        listA0t = BV4.A0t(hashSetA13);
                                    }
                                    Cc0.A00(EnumC10409Hbg.A04, c3665CcL2, cc0, list2 == null ? 0 : list2.size(), list == null ? 0 : list.size(), jElapsedRealtime2);
                                    Cc0.A06.set(false);
                                } catch (MlKitException e2) {
                                    Cc0.A00(e2.zza == 14 ? EnumC10409Hbg.A05 : EnumC10409Hbg.A03, c3665CcL2, cc0, 0, 0, jElapsedRealtime2);
                                    throw e2;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        c3516CRq.close();
                        return listA0t;
                    } catch (Throwable th3) {
                        try {
                            c3516CRq.close();
                            throw th3;
                        } finally {
                        }
                    }
                }
            }, executor);
        }
        csc.A0F(mlKitException);
        return csc;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    @OnLifecycleEvent(EnumC3085Bxl.ON_DESTROY)
    public synchronized void close() {
        if (!this.A04.getAndSet(true)) {
            this.A01.A00();
            final AbstractC3512CRm abstractC3512CRm = this.A00;
            Executor executor = this.A03;
            if (abstractC3512CRm.A02.get() <= 0) {
                throw BV4.A0T();
            }
            final CSE cse = new CSE();
            abstractC3512CRm.A00.A02(executor, new Runnable() { // from class: X.CRe
                public static final String __redex_internal_original_name = "zzl";

                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC3507CRh abstractC3507CRh = abstractC3512CRm;
                    CSE cse2 = cse;
                    int iDecrementAndGet = abstractC3507CRh.A02.decrementAndGet();
                    if (iDecrementAndGet < 0) {
                        throw BV4.A0T();
                    }
                    if (iDecrementAndGet == 0) {
                        if (abstractC3507CRh instanceof C3658CcB) {
                            C3658CcB c3658CcB = (C3658CcB) abstractC3507CRh;
                            synchronized (abstractC3507CRh) {
                                c3658CcB.A03.AjV();
                                c3658CcB.A00 = true;
                                C3695Cct c3695Cct = c3658CcB.A02;
                                C3713CdC c3713CdC = new C3713CdC();
                                c3713CdC.A01 = EnumC3721CdK.TYPE_THIN;
                                RunnableC3697Ccv.A00(EnumC10421Hbu.A2l, new C3716CdF(c3713CdC, 0), c3695Cct);
                            }
                            abstractC3507CRh.A01.set(false);
                        } else {
                            Cc0 cc0 = (Cc0) abstractC3507CRh;
                            synchronized (abstractC3507CRh) {
                                cc0.A04.AjR();
                                Cc0.A06.set(true);
                                C3696Ccu c3696Ccu = cc0.A01;
                                C3712CdB c3712CdB = new C3712CdB();
                                c3712CdB.A01 = cc0.A00 ? EnumC3720CdJ.TYPE_THICK : EnumC3720CdJ.TYPE_THIN;
                                RunnableC3698Ccw.A00(EnumC10420Hbt.A2Z, new C3717CdG(c3712CdB, 0), c3696Ccu);
                            }
                        }
                        abstractC3507CRh.A01.set(false);
                    }
                    AbstractC3505CRf.A00.clear();
                    BZ4.A00.clear();
                    cse2.A02(null);
                }
            });
        }
    }

    public C3503CRd(AbstractC3512CRm<DetectionResultT, C3665CcL> abstractC3512CRm, Executor executor) {
        this.A00 = abstractC3512CRm;
        C3511CRl c3511CRl = new C3511CRl();
        this.A01 = c3511CRl;
        this.A03 = executor;
        abstractC3512CRm.A02.incrementAndGet();
        CSC cscA01 = abstractC3512CRm.A01(c3511CRl.A00, CallableC3506CRg.A00, executor);
        cscA01.A0A(CFG.A00, AbstractC3097ByB.A00);
        this.A02 = cscA01;
    }
}

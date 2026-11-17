package X;

import android.app.Application;
import android.os.Trace;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.C4y, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3241C4y {
    public static C3241C4y A0a;
    public static final String A0b = AbstractC3285C9b.A00("mobile", "reliability_event_log_upload").toString();
    public C3232C4p A00;
    public C54 A02;
    public F18<C4X> A03;
    public F18<C4E> A04;
    public F18<C4U> A05;
    public F18<C7B> A07;
    public F18 A08;
    public F18<C4Z> A09;
    public F18<C5F> A0B;
    public final int A0C;
    public final long A0D;
    public final Application A0E;
    public final C3237C4u A0F;
    public final List<InterfaceC3269C6v> A0I;
    public final List<InterfaceC3269C6v> A0J;
    public final List<InterfaceC3269C6v> A0K;
    public final List<InterfaceC3269C6v> A0L;
    public final F18<String> A0M;
    public final F18<String> A0N;
    public final F18 A0O;
    public final F18<String> A0P;
    public final F18<String> A0Q;
    public final F18<Boolean> A0R;
    public final F18<String> A0U;
    public final F18<String> A0V;
    public final F18<String> A0X;
    public final boolean A0Z;
    public EnumC3250C5k A01 = null;
    public final Object A0G = C3cG.A0T();
    public final List<Runnable> A0H = C3cG.A0h();
    public final F18 A0W = new F4A(this, 6);
    public final F18<C4I> A0T = new F4A(this, 7);
    public F18<C3278C7g> A0A = null;
    public final F18<Executor> A0S = new C50();
    public F18<InterfaceC3189C2f> A06 = null;
    public final boolean A0Y = true;

    public C3241C4y(Application application, C3237C4u c3237C4u, List list, List list2, List list3, List list4, F18 f18, F18 f182, F18 f183, F18 f184, F18 f185, F18 f186, F18 f187, F18 f188, F18 f189, F18 f1810, long j, boolean z) {
        this.A0E = application;
        this.A0P = f182;
        this.A0X = f183;
        this.A0N = f184;
        this.A0M = f185;
        this.A0R = f186;
        this.A0I = list;
        this.A0J = list2;
        this.A0K = list3;
        this.A0L = list4;
        this.A0V = f187;
        this.A0Q = f188;
        this.A05 = f189;
        this.A0U = f18;
        this.A0O = f1810;
        A0a = this;
        InterfaceC3234C4r interfaceC3234C4rA00 = C2Q.A00();
        interfaceC3234C4rA00.Acd((String) f18.AMN());
        interfaceC3234C4rA00.AeG(0L);
        this.A0D = j;
        this.A0C = 3;
        this.A0Z = z;
        this.A0F = c3237C4u;
    }

    public static void A00(final C3241C4y c3241C4y) {
        synchronized (c3241C4y.A0G) {
            if (c3241C4y.A0H.isEmpty()) {
                return;
            }
            C51.A03.execute(new Runnable() { // from class: X.C2V
                public static final String __redex_internal_original_name = "LacrimaConfig$$ExternalSyntheticLambda5";

                @Override // java.lang.Runnable
                public final void run() {
                    ArrayList arrayListA0t;
                    C3241C4y c3241C4y2 = this.A00;
                    C3241C4y c3241C4y3 = C3241C4y.A0a;
                    while (true) {
                        synchronized (c3241C4y2.A0G) {
                            List<Runnable> list = c3241C4y2.A0H;
                            if (list.isEmpty()) {
                                return;
                            }
                            arrayListA0t = BV4.A0t(list);
                            list.clear();
                        }
                        Iterator it = arrayListA0t.iterator();
                        while (it.hasNext()) {
                            try {
                                ((Runnable) it.next()).run();
                            } catch (Throwable th) {
                                C2Q.A00().AT9("DelayedAssembleReport", th, null);
                            }
                        }
                    }
                }
            });
        }
    }

    public static final void A01(C3241C4y c3241C4y) {
        Trace.beginSection("FixedLengthFiles.init");
        try {
            C3194C2s c3194C2sA00 = C3194C2s.A00("collector");
            Application application = c3241C4y.A0E;
            c3194C2sA00.A03(application, 8, 15000);
            C3194C2s.A00("reports").A03(application, 6, 60000);
        } finally {
            Trace.endSection();
        }
    }

    public static void A02(C3241C4y c3241C4y, String str, Throwable th) {
        Trace.beginSection("maybeReportSoftError");
        try {
            if (Math.random() < 0.001d) {
                String str2 = c3241C4y.A0X.AMN();
                String str3 = c3241C4y.A0N.AMN();
                String str4 = c3241C4y.A0M.AMN();
                c3241C4y.A0V.AMN();
                HashMap mapA0u = BV4.A0u();
                C6E.A01(C6B.A5w, C6Q.A01(th), mapA0u);
                C6E.A02(str2, str3, str4, mapA0u);
                C6E.A03(C9Y.TAG, str, mapA0u);
                C6E.A00().A04(mapA0u);
            }
        } finally {
            Trace.endSection();
        }
    }

    public final C54 A03() {
        BeS.A03(this.A02, "Did you call earlyInit()?");
        return this.A02;
    }
}

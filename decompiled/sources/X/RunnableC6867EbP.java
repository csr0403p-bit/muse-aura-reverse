package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;

/* renamed from: X.EbP, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC6867EbP implements Runnable {
    public static final String __redex_internal_original_name = "RealCall$AsyncCall";
    public final EcQ A00;
    public volatile AtomicInteger A01 = BV4.A13(0);
    public final /* synthetic */ C6864EbM A02;

    /* JADX WARN: Multi-variable type inference failed */
    public RunnableC6867EbP(EcQ ecQ, EcQ ecQ2) {
        this.A02 = ecQ2;
        this.A00 = ecQ;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        C6859EbH c6859EbH;
        C6886Ebi c6886EbiA00;
        C6864EbM c6864EbM = this.A02;
        Eb0 eb0 = c6864EbM.A0A;
        C6854EbC c6854EbC = eb0.A04;
        String strA0y = AnonymousClass006.A0y(c6854EbC.A09(), "OkHttp ", C60O.A0w());
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(strA0y);
        try {
            c6864EbM.A0B.A07();
            try {
                try {
                    ArrayList arrayListA0h = C3cG.A0h();
                    c6859EbH = c6864EbM.A09;
                    AbstractC0882AGj.A0r(c6859EbH.A02, arrayListA0h);
                    arrayListA0h.add(new C6860EbI(c6859EbH));
                    arrayListA0h.add(new C6847Eaz(c6859EbH.A0D));
                    arrayListA0h.add(new C6874EbW());
                    arrayListA0h.add(C6861EbJ.A00);
                    AbstractC0882AGj.A0r(c6859EbH.A03, arrayListA0h);
                    arrayListA0h.add(new C6866EbO());
                    try {
                        try {
                            c6886EbiA00 = new C6875EbX(arrayListA0h, eb0, null, c6864EbM, 0, 10000, 10000, 10000).A00(eb0);
                        } catch (IOException e) {
                            IOException iOExceptionA01 = c6864EbM.A01(e);
                            if (iOExceptionA01 != null) {
                                throw iOExceptionA01;
                            }
                            throw BV4.A0a("null cannot be cast to non-null type kotlin.Throwable");
                        }
                    } catch (Throwable th) {
                        if (0 == 0) {
                            c6864EbM.A01(null);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    c6864EbM.A09.A0E.A01(this);
                    throw th2;
                }
            } catch (IOException e2) {
                this.A00.onFailure(c6864EbM, e2);
            } catch (Throwable th3) {
                th = th3;
                z = false;
            }
            if (c6864EbM.A0G) {
                AbstractC6843Eav.A0A(c6886EbiA00);
                throw BV4.A0K("Canceled");
            }
            c6864EbM.A01(null);
            z = true;
            try {
                this.A00.onResponse(c6864EbM, c6886EbiA00);
            } catch (IOException e3) {
                Logger logger = EZT.A00;
                EZT.A01(AnonymousClass006.A0y(FGI.A0d(c6864EbM.A0G ? "canceled " : "", "call", " to ", c6854EbC.A09()), "Callback failure for ", C60O.A0w()), 4, e3);
                c6859EbH = c6864EbM.A09;
                c6859EbH.A0E.A01(this);
                return;
            } catch (Throwable th4) {
                th = th4;
                c6864EbM.cancel();
                if (!z) {
                    IOException iOExceptionA0C = C7384Etj.A0C(th, "canceled due to ");
                    CU7.A01(iOExceptionA0C, th);
                    this.A00.onFailure(c6864EbM, iOExceptionA0C);
                }
                throw th;
            }
            c6859EbH.A0E.A01(this);
            return;
        } finally {
            threadCurrentThread.setName(name);
        }
        threadCurrentThread.setName(name);
    }
}

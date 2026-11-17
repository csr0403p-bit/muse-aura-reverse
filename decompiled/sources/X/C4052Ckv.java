package X;

import android.content.Context;
import android.util.SparseArray;

/* renamed from: X.Ckv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4052Ckv {
    public final Context A00;
    public final SparseArray<Cl9> A01 = new SparseArray<>(2);

    /* JADX WARN: In static synchronized method top region not synchronized by class const: (r10v0 X.Ckv) */
    public static synchronized void A00(C4065ClC c4065ClC, InterfaceC4069ClG interfaceC4069ClG, C4052Ckv c4052Ckv) {
        synchronized (c4052Ckv) {
            int i = c4065ClC.A00;
            C4057Cl0 c4057Cl0 = new C4057Cl0(interfaceC4069ClG, c4052Ckv, i);
            Context context = c4052Ckv.A00;
            C4046Ckp c4046CkpA00 = C4046Ckp.A00(context);
            C4045Cko c4045Cko = c4065ClC.A01;
            c4046CkpA00.A05(c4045Cko.A0A);
            try {
                SparseArray<Cl9> sparseArray = c4052Ckv.A01;
                if (sparseArray.get(i) != null && sparseArray.get(i).A00 != null) {
                    throw BV5.A0U("Trying to create a new handler when one already exists for jobId: ", String.valueOf(i));
                }
                HandlerC4042Ckl handlerC4042Ckl = new HandlerC4042Ckl(context, BV5.A0C(FGI.A0H("UploadJobHandlerManager-", i), c4045Cko.A04 == C79.A01 ? 18 : 19), c4065ClC, c4057Cl0);
                Cl9 cl9 = sparseArray.get(i);
                if (cl9 == null) {
                    cl9 = new Cl9();
                    sparseArray.put(i, cl9);
                }
                cl9.A00 = handlerC4042Ckl;
                synchronized (handlerC4042Ckl) {
                    try {
                        if (!handlerC4042Ckl.A04) {
                            handlerC4042Ckl.A04 = true;
                            BV4.A1C(handlerC4042Ckl, 1);
                        }
                    } catch (Throwable th) {
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public C4052Ckv(Context context) {
        this.A00 = context;
    }
}

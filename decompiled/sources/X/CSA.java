package X;

import com.google.android.gms.tasks.RuntimeExecutionException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public abstract class CSA<TResult> {
    public static void A00(CMT cmt, CSC csc) {
        CSF csf = csc.A03;
        csf.A01(cmt);
        synchronized (csc.A04) {
            if (csc.A02) {
                csf.A00(csc);
            }
        }
    }

    /* JADX WARN: Incorrect types in method signature: <TContinuationResult:Ljava/lang/Object;>(Ljava/util/concurrent/Executor;LX/CSY<TTResult;TTContinuationResult;>;)LX/CSA<TTContinuationResult;>; */
    public final CSC A04(CSY csy, Executor executor) {
        CSC csc = new CSC();
        A00(new CSV(csy, csc, executor), (CSC) this);
        return csc;
    }

    public final CSA<TResult> A05(CEF<TResult> cef) {
        CSC csc = (CSC) this;
        A00(new CMS(cef, AbstractC3097ByB.A00), csc);
        return csc;
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/concurrent/Executor;LX/CSZ<-TTResult;>;)LX/CSA<TTResult;>; */
    public final CSC A06(CSZ csz, Executor executor) {
        CSC csc = (CSC) this;
        A00(new CSW(csz, executor), csc);
        return csc;
    }

    public final Exception A07() {
        Exception exc;
        CSC csc = (CSC) this;
        synchronized (csc.A04) {
            exc = csc.A00;
        }
        return exc;
    }

    public final TResult A08() {
        TResult tresult;
        CSC csc = (CSC) this;
        synchronized (csc.A04) {
            CRy.A09(csc.A02, "Task is not yet complete");
            if (csc.A05) {
                throw new CancellationException("Task is already canceled.");
            }
            Exception exc = csc.A00;
            if (exc != null) {
                throw new RuntimeExecutionException(exc);
            }
            tresult = (TResult) csc.A01;
        }
        return tresult;
    }

    /* JADX WARN: Incorrect return type in method signature: (Ljava/util/concurrent/Executor;LX/CEF<TTResult;>;)LX/CSA<TTResult;>; */
    public final void A09(CEF cef, Executor executor) {
        A00(new CMS(cef, executor), (CSC) this);
    }

    /* JADX WARN: Incorrect return type in method signature: (Ljava/util/concurrent/Executor;LX/CSP;)LX/CSA<TTResult;>; */
    public final void A0A(CSP csp, Executor executor) {
        A00(new CSL(csp, executor), (CSC) this);
    }

    public final boolean A0B() {
        boolean z;
        CSC csc = (CSC) this;
        synchronized (csc.A04) {
            z = csc.A02;
        }
        return z;
    }

    public final boolean A0C() {
        boolean z;
        CSC csc = (CSC) this;
        synchronized (csc.A04) {
            z = false;
            if (csc.A02 && !csc.A05 && csc.A00 == null) {
                z = true;
            }
        }
        return z;
    }
}

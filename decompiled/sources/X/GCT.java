package X;

import kotlinx.coroutines.internal.UndeliveredElementException;

/* loaded from: classes6.dex */
public abstract class GCT {
    /* JADX WARN: Incorrect types in method signature: <E:Ljava/lang/Object;>(LX/G0U<-TE;Lkotlin/Unit;>;TE;LX/78T;)V */
    public static final void A01(Object obj, C78T c78t, G0U g0u) {
        UndeliveredElementException undeliveredElementExceptionA00 = A00(obj, g0u, null);
        if (undeliveredElementExceptionA00 != null) {
            HwS.A00(c78t, undeliveredElementExceptionA00);
        }
    }

    /* JADX WARN: Incorrect types in method signature: <E:Ljava/lang/Object;>(LX/G0U<-TE;Lkotlin/Unit;>;TE;Lkotlinx/coroutines/internal/UndeliveredElementException;)Lkotlinx/coroutines/internal/UndeliveredElementException; */
    public static final UndeliveredElementException A00(Object obj, G0U g0u, UndeliveredElementException undeliveredElementException) {
        try {
            g0u.invoke(obj);
            return undeliveredElementException;
        } catch (Throwable th) {
            if (undeliveredElementException == null || undeliveredElementException.getCause() == th) {
                return new UndeliveredElementException(AnonymousClass007.A0a("Exception in undelivered element handler for ", obj), th);
            }
            CU7.A01(undeliveredElementException, th);
            return undeliveredElementException;
        }
    }
}

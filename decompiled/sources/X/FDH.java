package X;

import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import com.instagram.common.lispy.lang.BloksScriptingException;
import com.instagram.common.lispy.lang.LispyException;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class FDH {
    /* JADX WARN: Incorrect types in method signature: <T:LX/F6L;>(LX/HsM;LX/Hj6;TT;)Ljava/lang/Object; */
    public static Object A00(Hj6 hj6, HsM hsM, F6L f6l) {
        ThreadLocal<FDJ> threadLocal;
        FDJ fdj;
        boolean z;
        Hj6 hj6A00 = hj6;
        if (!(hsM instanceof FDG)) {
            throw C60Q.A0U("evaluate_INTERNAL expects a BloksScript, got ", hsM == null ? HatchCcvLoggingKt.NO_POSTAL_FIELD : C60Q.A0e(hsM));
        }
        FDG fdg = (FDG) hsM;
        FDS fds = fdg.A00;
        fdg.A01();
        FDK fdk = fdg.A01;
        List<Object> list = fdg.A03;
        Object obj = fds.A00.A00;
        if (list != null) {
            hj6A00 = hj6A00.A00(list);
        }
        ThreadLocal<Boolean> threadLocal2 = FDL.A01;
        if (threadLocal2.get() == null) {
            z = true;
            threadLocal2.set(true);
            fdj = new FDJ();
            threadLocal = FDL.A00;
            threadLocal.set(fdj);
        } else {
            threadLocal = FDL.A00;
            FDJ fdj2 = threadLocal.get();
            C7384Etj.A0X(fdj2);
            fdj = fdj2;
            z = false;
        }
        try {
            try {
                Object objA01 = FDL.A01(hj6A00, fdj, f6l, fdk, obj, -1);
                if (z) {
                    threadLocal2.remove();
                    threadLocal.remove();
                }
                return objA01;
            } catch (LispyException e) {
                if (z) {
                    throw new BloksScriptingException(fdk != null ? fdk.A00 : null, e);
                }
                throw e;
            }
        } finally {
        }
    }
}

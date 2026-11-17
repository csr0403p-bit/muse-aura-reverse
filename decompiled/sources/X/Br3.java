package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* loaded from: classes5.dex */
public abstract class Br3 {
    public static final <T> Object A00(ListenableFuture<T> listenableFuture, HtJ<? super T> htJ) {
        try {
            if (listenableFuture.isDone()) {
                return CQV.A01(listenableFuture);
            }
            GBL gblA03 = C7Bm.A03(htJ);
            listenableFuture.addListener(new Br4(listenableFuture, gblA03), EnumC7508EyT.A01);
            gblA03.AO2(new C7590F5d(listenableFuture, 0));
            return gblA03.A0F();
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            C7384Etj.A0X(cause);
            throw cause;
        }
    }
}

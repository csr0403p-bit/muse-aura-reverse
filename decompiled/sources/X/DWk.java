package X;

import android.os.RemoteException;
import androidx.health.platform.client.error.ErrorCode;
import androidx.health.platform.client.error.ErrorStatus;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class DWk {
    public static final Map<Integer, C9uG<? extends Exception>> A00 = AGH.A0D(C3cG.A0r(BV4.A0W(), new C0861A6i(UnsupportedOperationException.class)), A01(UnsupportedOperationException.class, 2), A01(UnsupportedOperationException.class, 3), C3cG.A0r(BV4.A0Z(), new C0861A6i(SecurityException.class)), A01(SecurityException.class, 10000), A01(SecurityException.class, ErrorCode.NOT_ALLOWED), C3cG.A0r(Integer.valueOf(ErrorCode.EMPTY_PERMISSION_LIST), new C0861A6i(IllegalArgumentException.class)), A01(SecurityException.class, ErrorCode.PERMISSION_NOT_DECLARED), A01(SecurityException.class, ErrorCode.INVALID_PERMISSION_RATIONALE_DECLARATION), C3cG.A0r(Integer.valueOf(ErrorCode.INVALID_UID), new C0861A6i(RemoteException.class)), C3cG.A0r(Integer.valueOf(ErrorCode.DATABASE_ERROR), new C0861A6i(IOException.class)), A01(RemoteException.class, ErrorCode.INTERNAL_ERROR), A01(RemoteException.class, ErrorCode.CHANGES_TOKEN_OUTDATED), A01(RemoteException.class, ErrorCode.TRANSACTION_TOO_LARGE));

    public static final Exception A00(ErrorStatus errorStatus) {
        Object objA0f = BV5.A0f(A00, errorStatus.A00);
        if (objA0f == null) {
            return C8j3.A18(errorStatus.A01);
        }
        if (BV5.A1S(SecurityException.class, objA0f)) {
            return new SecurityException(errorStatus.A01);
        }
        if (BV5.A1S(RemoteException.class, objA0f)) {
            return new RemoteException(errorStatus.A01);
        }
        if (BV5.A1S(IllegalArgumentException.class, objA0f)) {
            return C60O.A0i(errorStatus.A01);
        }
        boolean zA1S = BV5.A1S(IOException.class, objA0f);
        String str = errorStatus.A01;
        return zA1S ? BV4.A0K(str) : C8j3.A18(str);
    }

    public static HxE A01(Class cls, int i) {
        return new HxE(Integer.valueOf(i), new C0861A6i(cls));
    }
}

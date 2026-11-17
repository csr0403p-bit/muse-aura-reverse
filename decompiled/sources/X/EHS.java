package X;

import android.os.Binder;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class EHS {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (obj != null) {
            return obj == this || this.A01 == obj.hashCode();
        }
        return false;
    }

    public final int hashCode() {
        return this.A01;
    }

    public EHS() {
        int callingUid = Binder.getCallingUid();
        this.A00 = callingUid;
        this.A01 = Arrays.hashCode(BV5.A1Z(callingUid, Binder.getCallingPid()));
    }
}

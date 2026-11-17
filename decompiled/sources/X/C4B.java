package X;

import com.facebook.analytics2.logger.legacy.batchsupport.CrossProcessBatchLockState$FailedFileCreationException;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes5.dex */
public abstract class C4B<T> {
    public final HashMap<T, C4B<T>.BatchLock> A00 = BV4.A0u();

    /* JADX WARN: Incorrect inner types in method signature: (TT;)LX/C4B<TT;>.BatchLock; */
    public final synchronized C4C A02(Object obj) {
        C4B<T>.BatchLock c46;
        HashMap<T, C4B<T>.BatchLock> map = this.A00;
        c46 = (C4C) map.get(obj);
        if (c46 == null) {
            if (this instanceof C4A) {
                c46 = new C49((C4A) this, obj);
            } else {
                File file = (File) obj;
                try {
                    c46 = new C46((C47) this, file);
                } catch (IOException e) {
                    throw new CrossProcessBatchLockState$FailedFileCreationException(AnonymousClass007.A0a("Unexpected error, failed to create file: ", file), e);
                }
            }
            map.put(obj, c46);
        }
        c46.A00++;
        return c46;
    }

    public static C4B<Object> A01(boolean z) {
        C4B<Object> c47;
        if (!z) {
            return C4A.A00();
        }
        synchronized (C47.class) {
            c47 = C47.A00;
            if (c47 == null) {
                c47 = new C47();
                C47.A00 = c47;
            }
        }
        return c47;
    }
}

package kotlinx.coroutines;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C60O;
import X.C60R;
import X.C7384Etj;
import X.C8j3;
import X.HoC;
import X.HwK;
import java.util.concurrent.CancellationException;

/* loaded from: classes6.dex */
public final class JobCancellationException extends CancellationException {
    public final transient HoC A00;

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof JobCancellationException)) {
            return false;
        }
        JobCancellationException jobCancellationException = (JobCancellationException) obj;
        if (!C7384Etj.areEqual(jobCancellationException.getMessage(), getMessage())) {
            return false;
        }
        Object obj2 = jobCancellationException.A00;
        if (obj2 == null) {
            obj2 = HwK.A00;
        }
        Object obj3 = this.A00;
        if (obj3 == null) {
            obj3 = HwK.A00;
        }
        return obj2.equals(obj3) && C7384Etj.areEqual(jobCancellationException.getCause(), getCause());
    }

    public JobCancellationException(String str, Throwable th, HoC hoC) {
        super(str);
        this.A00 = hoC;
        if (th != null) {
            initCause(th);
        }
    }

    public final int hashCode() {
        String message = getMessage();
        C7384Etj.A0X(message);
        int iA0G = AnonymousClass001.A0G(message);
        Object obj = this.A00;
        if (obj == null) {
            obj = HwK.A00;
        }
        return AnonymousClass005.A0F(obj, iA0G) + C60R.A01(getCause());
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(super.toString());
        sbA0w.append("; job=");
        Object obj = this.A00;
        if (obj == null) {
            obj = HwK.A00;
        }
        return C8j3.A14(obj, sbA0w);
    }
}

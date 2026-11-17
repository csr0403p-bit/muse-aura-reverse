package X;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

/* loaded from: classes5.dex */
public abstract class CU7 {
    public static final String A00(Throwable th) throws IOException {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        return C60O.A0o(stringWriter);
    }

    public static final void A01(Throwable th, Throwable th2) {
        AnonymousClass003.A0u(th, th2);
        if (th != th2) {
            AbstractC7477ExS.A00.A01(th, th2);
        }
    }
}

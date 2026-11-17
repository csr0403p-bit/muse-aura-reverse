package X;

/* loaded from: classes6.dex */
public abstract class Hl6 {
    public static final StackTraceElement A00;

    static {
        StackTraceElement stackTraceElement = new Exception().getStackTrace()[0];
        A00 = new StackTraceElement(FGI.A0O("_COROUTINE", "_BOUNDARY", '.'), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            Class.forName("X.Fsp").getCanonicalName();
        } catch (Throwable unused) {
        }
        try {
            Class.forName("X.Hl6").getCanonicalName();
        } catch (Throwable unused2) {
        }
    }
}

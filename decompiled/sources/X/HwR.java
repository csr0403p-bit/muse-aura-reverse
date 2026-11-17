package X;

/* loaded from: classes6.dex */
public abstract class HwR {
    public static void A00(Throwable th) throws Throwable {
        if ((th instanceof VirtualMachineError) || (th instanceof ThreadDeath) || (th instanceof InterruptedException) || (th instanceof ClassCircularityError) || (th instanceof ClassFormatError) || (th instanceof IncompatibleClassChangeError) || (th instanceof VerifyError)) {
            if (!(th instanceof Error) && !(th instanceof RuntimeException)) {
                throw BV4.A0e(th);
            }
            throw th;
        }
    }
}

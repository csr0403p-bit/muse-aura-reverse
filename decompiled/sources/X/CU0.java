package X;

import java.io.PrintStream;

/* loaded from: classes5.dex */
public abstract class CU0 {
    public static final CT3 A00;

    static {
        CT3 cTi;
        Integer num;
        try {
            try {
                num = (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Exception e) {
                PrintStream printStream = System.err;
                printStream.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
                e.printStackTrace(printStream);
            }
            cTi = (num == null || num.intValue() < 19) ? !Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic") ? new CUH() : new CTi() : new C3548CTh();
        } catch (Throwable th) {
            PrintStream printStream2 = System.err;
            String name = CTi.class.getName();
            StringBuilder sbA0p = BV4.A0p(BV5.A04(name) + 133);
            sbA0p.append("An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy ");
            sbA0p.append(name);
            printStream2.println(AnonymousClass001.A0v("will be used. The error is: ", sbA0p));
            th.printStackTrace(printStream2);
            cTi = new CTi();
        }
        A00 = cTi;
    }
}

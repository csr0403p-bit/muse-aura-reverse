package X;

import java.io.PrintStream;

/* loaded from: classes5.dex */
public abstract class CV0 {
    public static final Integer A00;
    public static final String[] A01 = {"System.out", "stdout", "sysout"};
    public static final Integer A02;

    /* JADX WARN: Removed duplicated region for block: B:25:0x005f  */
    static {
        /*
            r4 = 3
            java.lang.String r2 = "System.out"
            java.lang.String r1 = "stdout"
            java.lang.String r0 = "sysout"
            java.lang.String[] r0 = new java.lang.String[]{r2, r1, r0}
            X.CV0.A01 = r0
            java.lang.String r0 = "slf4j.internal.report.stream"
            java.lang.String r3 = java.lang.System.getProperty(r0)
            if (r3 == 0) goto L67
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L67
            java.lang.String[] r2 = X.CV0.A01
            r1 = 0
        L21:
            r0 = r2[r1]
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L62
            java.lang.Integer r0 = X.C79.A01
        L2b:
            X.CV0.A02 = r0
            java.lang.String r0 = "slf4j.internal.verbosity"
            java.lang.String r1 = java.lang.System.getProperty(r0)
            if (r1 == 0) goto L5f
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L5f
            java.lang.String r0 = "DEBUG"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L49
            java.lang.Integer r0 = X.C79.A00
        L46:
            X.CV0.A00 = r0
            return
        L49:
            java.lang.String r0 = "ERROR"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L54
            java.lang.Integer r0 = X.C79.A0K
            goto L46
        L54:
            java.lang.String r0 = "WARN"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L5f
            java.lang.Integer r0 = X.C79.A0C
            goto L46
        L5f:
            java.lang.Integer r0 = X.C79.A01
            goto L46
        L62:
            int r1 = r1 + 1
            if (r1 >= r4) goto L67
            goto L21
        L67:
            java.lang.Integer r0 = X.C79.A00
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CV0.<clinit>():void");
    }

    public static PrintStream A00() {
        return A02.intValue() != 1 ? System.err : System.out;
    }

    public static void A01(String str) {
        switch (A00.intValue()) {
            case 0:
            case 1:
                A00().println(FGI.A0M("SLF4J(I): ", str));
                break;
        }
    }

    public static final void A02(String str) {
        if (3 - A00.intValue() != 0) {
            A00().println(FGI.A0M("SLF4J(W): ", str));
        }
    }

    public static final void A03(String str, Throwable th) {
        A00().println(FGI.A0M("SLF4J(E): ", str));
        A00().println("SLF4J(E): Reported exception:");
        th.printStackTrace(A00());
    }
}

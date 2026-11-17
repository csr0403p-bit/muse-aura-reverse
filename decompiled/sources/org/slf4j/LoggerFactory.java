package org.slf4j;

import X.C3cG;
import X.CV0;
import X.CV3;
import X.CV6;
import X.CV9;
import X.CVI;
import X.FGI;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class LoggerFactory {
    public static final String[] A02;
    public static volatile int A03;
    public static volatile CV9 A04;
    public static final CV3 A01 = new CV3();
    public static final CV6 A00 = new CV6();

    static {
        try {
            System.getProperty("slf4j.detectLoggerNameMismatch");
        } catch (SecurityException unused) {
        }
        A02 = new String[]{"2.0"};
    }

    public static CVI getLogger(String str) {
        CV9 cv9;
        if (A03 == 0) {
            synchronized (LoggerFactory.class) {
                if (A03 == 0) {
                    A03 = 1;
                    A00();
                    if (A03 == 3) {
                        try {
                            String strAJa = A04.AJa();
                            String[] strArr = A02;
                            if (!strAJa.startsWith(strArr[0])) {
                                CV0.A02(FGI.A0d("The requested version ", strAJa, " by your slf4j provider is not compatible with ", Arrays.asList(strArr).toString()));
                                CV0.A02("See https://www.slf4j.org/codes.html#version_mismatch for further details.");
                            }
                        } catch (Throwable th) {
                            CV0.A03("Unexpected problem occurred during version sanity check", th);
                        }
                    }
                }
            }
        }
        int i = A03;
        if (i == 1) {
            cv9 = A01;
        } else {
            if (i == 2) {
                throw C3cG.A0Q("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also https://www.slf4j.org/codes.html#unsuccessfulInit");
            }
            if (i == 3) {
                cv9 = A04;
            } else {
                if (i != 4) {
                    throw C3cG.A0Q("Unreachable code");
                }
                cv9 = A00;
            }
        }
        return cv9.AHD().AHC(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055 A[Catch: Exception -> 0x020c, TryCatch #1 {Exception -> 0x020c, blocks: (B:2:0x0000, B:4:0x0014, B:6:0x001a, B:23:0x0098, B:24:0x009b, B:26:0x00a2, B:27:0x00ab, B:29:0x00b1, B:30:0x00cc, B:31:0x00d1, B:33:0x00d7, B:35:0x00e8, B:36:0x00ea, B:38:0x00f3, B:63:0x017a, B:64:0x018e, B:65:0x0190, B:84:0x01f4, B:85:0x01ff, B:79:0x01dc, B:81:0x01e6, B:82:0x01ef, B:83:0x01f0, B:87:0x0205, B:67:0x0192, B:69:0x01a8, B:41:0x00fc, B:42:0x0104, B:43:0x011a, B:48:0x0128, B:49:0x012c, B:51:0x0132, B:54:0x0140, B:56:0x0146, B:57:0x014f, B:59:0x0155, B:60:0x0170, B:47:0x0123, B:53:0x013b, B:10:0x0039, B:12:0x0048, B:13:0x0055, B:15:0x005b, B:16:0x0061, B:17:0x0065, B:19:0x006b, B:21:0x0074, B:22:0x008c), top: B:94:0x0000, inners: #0, #2, #3, #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00() {
        /*
            Method dump skipped, instructions count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.slf4j.LoggerFactory.A00():void");
    }
}

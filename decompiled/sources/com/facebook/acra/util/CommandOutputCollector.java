package com.facebook.acra.util;

import X.BV4;
import X.C60O;
import java.io.IOException;
import java.io.InputStreamReader;

/* loaded from: classes5.dex */
public class CommandOutputCollector {
    public static String collect(String... strArr) throws IOException {
        StringBuilder sbA0w = C60O.A0w();
        Process processStart = new ProcessBuilder(strArr).redirectErrorStream(true).start();
        try {
            if (processStart.getOutputStream() != null) {
                processStart.getOutputStream().close();
            }
            InputStreamReader inputStreamReader = new InputStreamReader(processStart.getInputStream());
            try {
                char[] cArr = new char[4096];
                while (true) {
                    int i = inputStreamReader.read(cArr, 0, 4096);
                    if (i == -1) {
                        break;
                    }
                    sbA0w.append(cArr, 0, i);
                }
                inputStreamReader.close();
                try {
                    processStart.waitFor();
                } catch (InterruptedException unused) {
                    BV4.A1A();
                }
                processStart.destroy();
                return sbA0w.toString();
            } finally {
            }
        } catch (Throwable th) {
            processStart.destroy();
            throw th;
        }
    }
}

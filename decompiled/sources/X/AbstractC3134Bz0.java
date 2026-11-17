package X;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

/* renamed from: X.Bz0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3134Bz0 {
    public static String A00(File file, Charset charset) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        StringBuilder sbA0w = C60O.A0w();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(BV4.A0H(file), charset));
        try {
            char[] cArr = new char[1024];
            while (true) {
                int i = bufferedReader.read(cArr);
                if (i == -1) {
                    bufferedReader.close();
                    return sbA0w.toString();
                }
                sbA0w.append(cArr, 0, i);
            }
        } catch (Throwable th) {
            try {
                bufferedReader.close();
                throw th;
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                throw th;
            }
        }
    }
}

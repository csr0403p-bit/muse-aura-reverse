package X;

import java.io.File;
import java.io.IOException;

/* loaded from: classes5.dex */
public abstract class C2U {
    public static void A00(File file, String str) throws IOException {
        try {
            BV5.A0L(str, "_done", file).createNewFile();
        } catch (IOException e) {
            C2Q.A00().AT9("MarkAssembled", e, null);
        }
    }
}

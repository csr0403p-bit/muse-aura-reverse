package X;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

/* loaded from: classes5.dex */
public final class C60 implements InterfaceC3235C4s {
    public final C3232C4p A00;
    public final C54 A01;
    public final F18<C61> A02;

    public static Properties A00(File file) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        Properties properties = new Properties();
        if (file == null) {
            return properties;
        }
        try {
            FileInputStream fileInputStreamA0H = BV4.A0H(file);
            try {
                properties.load(fileInputStreamA0H);
                fileInputStreamA0H.close();
                return properties;
            } finally {
            }
        } catch (IOException e) {
            CFK.A0A(C9Y.TAG, "Error while reading Anr report", e);
            C2Q.A00().AT9("ReadAnrReport", e, null);
            return properties;
        }
    }

    @Override // X.InterfaceC3235C4s
    public final /* synthetic */ C3238C4v AH4() {
        return null;
    }

    @Override // X.InterfaceC3235C4s
    public final C5l AHs() {
        return C5l.A02;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0131  */
    @Override // X.InterfaceC3235C4s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void start() throws java.lang.IllegalAccessException, java.io.IOException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60.start():void");
    }

    public C60(C3232C4p c3232C4p, C54 c54, F18 f18) {
        this.A01 = c54;
        this.A00 = c3232C4p;
        this.A02 = f18;
    }

    @Override // X.InterfaceC3235C4s
    public final /* synthetic */ int AGC() {
        return 100000;
    }
}

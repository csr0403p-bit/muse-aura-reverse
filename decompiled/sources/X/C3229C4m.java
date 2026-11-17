package X;

import com.facebook.errorreporting.field.ReportFieldString;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.C4m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3229C4m implements InterfaceC3231C4o {
    public final File A00;

    @Override // X.InterfaceC3231C4o
    public final Integer AHt() {
        return C79.A0F;
    }

    @Override // X.InterfaceC3231C4o
    public final void AY4(C3228C4l c3228C4l, EnumC3223C4g enumC3223C4g) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        String string;
        C5W c5w = C5V.A04;
        if (c5w != null) {
            ReportFieldString reportFieldString = C6B.A70;
            File file = this.A00;
            if (file != null) {
                File fileA0O = C3cG.A0O(file, "navmodules.txt");
                string = null;
                try {
                } catch (Exception e) {
                    C2Q.A00().AT9("StartupConfigGEReading", e, null);
                }
                if (fileA0O.exists()) {
                    try {
                        BufferedReader bufferedReaderA0I = BV5.A0I(fileA0O);
                        try {
                            String line = bufferedReaderA0I.readLine();
                            bufferedReaderA0I.close();
                            string = line;
                        } finally {
                        }
                    } catch (IOException e2) {
                        CFK.A0A(C9Y.TAG, "Reading granular exposures failed", e2);
                        C2Q.A00().AT9("StartupConfigGEReading", e2, null);
                    }
                }
            } else {
                StringBuilder sb = c5w.A05;
                synchronized (sb) {
                    string = sb.toString();
                }
            }
            c3228C4l.A03(reportFieldString, string);
        }
    }

    public C3229C4m(File file) {
        this.A00 = file;
    }

    public C3229C4m() {
        this.A00 = null;
    }
}

package X;

import android.util.Base64OutputStream;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import com.facebook.common.stringformat.StringFormatUtil;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;

/* renamed from: X.BzM, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3140BzM {
    public static final Map<C3140BzM, Map<String, Object>> A02 = BV4.A0u();
    public final Object A00 = new Object();
    public final F18<File> A01;

    public final String A01() throws IOException {
        try {
            File fileAMN = this.A01.AMN();
            FileInputStream fileInputStreamA0H = BV4.A0H(fileAMN);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((int) fileAMN.length());
            Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 0);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = fileInputStreamA0H.read(bArr);
                    if (i == -1) {
                        base64OutputStream.close();
                        String string = byteArrayOutputStream.toString(HatchWebPageParserKt.UTF_8);
                        C7384Etj.A0U(string);
                        return string;
                    }
                    base64OutputStream.write(bArr, 0, i);
                }
            } finally {
                fileInputStreamA0H.close();
                base64OutputStream.close();
            }
        } catch (IOException e) {
            String message = e.getMessage();
            if (message == null) {
                message = "description N/A";
            }
            CFK.A0A("LightSharedPreferencesStorage", "Error reading raw preferences file", e);
            return FGI.A0U("[I/O error: ", message, "]");
        }
    }

    public C3140BzM(F18<File> f18) {
        this.A01 = f18;
    }

    public static final void A00(C3140BzM c3140BzM, File file, Throwable th, boolean z) {
        try {
            file.length();
            Object[] objArr = {file.getAbsolutePath(), c3140BzM.A01()};
            if (CFL.A01()) {
                CFK.A08(C3140BzM.class.getSimpleName(), StringFormatUtil.formatStrLocaleSafe("Failed to read or parse SharedPreferences from: %s; Raw file: %s", objArr), th);
            }
            if (z) {
                file.delete();
            }
        } catch (Throwable th2) {
            CU7.A01(th2, th);
            CFK.A08("LightSharedPreferencesStorage", "Error while logging exception", th2);
        }
    }
}

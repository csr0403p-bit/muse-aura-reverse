package X;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.D9e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4859D9e {
    public static final byte[] A00 = {112, 114, 111, 0};
    public static final byte[] A01 = {112, 114, 109, 0};

    public static String A00(String str, String str2, byte[] bArr) {
        byte[] bArr2 = AbstractC4862D9h.A02;
        String str3 = ":";
        String str4 = ":";
        if (!Arrays.equals(bArr, bArr2) && !Arrays.equals(bArr, AbstractC4862D9h.A03)) {
            str3 = "!";
        }
        if (str.length() > 0) {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (!str2.contains("!") && !str2.contains(str4)) {
                if (str2.endsWith(".apk")) {
                    return str2;
                }
                if (!Arrays.equals(bArr, bArr2) && !Arrays.equals(bArr, AbstractC4862D9h.A03)) {
                    str4 = "!";
                }
                return FGI.A0U(str, str4, str2);
            }
        }
        return "!".equals(str3) ? str2.replace(str4, "!") : str4.equals(str3) ? str2.replace("!", str4) : str2;
    }

    public static void A02(C4860D9f c4860D9f, OutputStream outputStream) throws IOException {
        Iterator itA0i = C3cG.A0i(c4860D9f.A08);
        int i = 0;
        while (itA0i.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0i);
            int iA0N = BV7.A0N(entryA0l);
            if ((AnonymousClass001.A0F(entryA0l.getValue()) & 1) != 0) {
                AbstractC4867D9m.A00(outputStream, 2, iA0N - i);
                AbstractC4867D9m.A00(outputStream, 2, 0L);
                i = iA0N;
            }
        }
    }

    public static void A03(C4860D9f c4860D9f, OutputStream outputStream, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        AbstractC4867D9m.A00(outputStream, 2, str.getBytes(charset).length);
        AbstractC4867D9m.A00(outputStream, 2, c4860D9f.A00);
        AbstractC4867D9m.A00(outputStream, 4, c4860D9f.A03);
        AbstractC4867D9m.A00(outputStream, 4, c4860D9f.A05);
        AbstractC4867D9m.A00(outputStream, 4, c4860D9f.A04);
        outputStream.write(str.getBytes(charset));
    }

    public static void A01(C4860D9f c4860D9f, OutputStream outputStream) throws IOException {
        A02(c4860D9f, outputStream);
        int[] iArr = c4860D9f.A02;
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = iArr[i];
            AbstractC4867D9m.A00(outputStream, 2, i3 - i2);
            i++;
            i2 = i3;
        }
        int i4 = c4860D9f.A04;
        byte[] bArr = new byte[(((i4 * 2) + 7) & (-8)) / 8];
        Iterator itA0i = C3cG.A0i(c4860D9f.A08);
        while (itA0i.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0i);
            int iA0N = BV7.A0N(entryA0l);
            int iA0F = AnonymousClass001.A0F(entryA0l.getValue());
            if ((iA0F & 2) != 0) {
                int i5 = iA0N / 8;
                BV6.A0x(1 << (iA0N % 8), bArr, bArr[i5], i5);
            }
            if ((iA0F & 4) != 0) {
                int i6 = iA0N + i4;
                int i7 = i6 / 8;
                BV6.A0x(1 << (i6 % 8), bArr, bArr[i7], i7);
            }
        }
        outputStream.write(bArr);
    }
}

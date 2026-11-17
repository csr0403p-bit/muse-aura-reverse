package X;

import java.io.IOException;
import org.bouncycastle.util.encoders.DecoderException;

/* loaded from: classes5.dex */
public abstract class Bz9 {
    public static final Bz8 A00 = new Bz8();

    public static byte[] A00(String str) throws IOException {
        try {
            Bz8 bz8 = A00;
            int length = str.length();
            int i = 0;
            if (length < 0 || 0 > length - length) {
                throw BV6.A0g("invalid offset and/or length specified");
            }
            if ((length & 1) != 0) {
                throw BV4.A0K("a hexadecimal encoding must have an even number of characters");
            }
            int i2 = length >>> 1;
            byte[] bArr = new byte[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                byte[] bArr2 = bz8.A00;
                int i4 = i + 1;
                byte b = bArr2[str.charAt(i)];
                i += 2;
                int i5 = (b << 4) | bArr2[str.charAt(i4)];
                if (i5 < 0) {
                    throw BV4.A0K("invalid characters encountered in Hex string");
                }
                bArr[i3] = (byte) i5;
            }
            return bArr;
        } catch (Exception e) {
            DecoderException decoderException = new DecoderException(BV5.A0n("exception decoding Hex string: ", e));
            decoderException.cause = e;
            throw decoderException;
        }
    }
}

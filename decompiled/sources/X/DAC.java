package X;

import com.facebook.aura.opengraph.HatchWebPageParserKt;
import com.google.android.gms.internal.fido.zzhd;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes5.dex */
public abstract class DAC {
    public static final DAD A00;
    public static final ByteBuffer A01;
    public static final Charset A02 = Charset.forName("US-ASCII");
    public static final Charset A03 = Charset.forName(HatchWebPageParserKt.UTF_8);
    public static final Charset A04 = Charset.forName("ISO-8859-1");
    public static final byte[] A05;

    static {
        byte[] bArr = new byte[0];
        A05 = bArr;
        A01 = ByteBuffer.wrap(bArr);
        DAD dad = new DAD(bArr);
        try {
            int i = dad.A00 + dad.A01;
            dad.A00 = i;
            if (i > 0) {
                dad.A01 = i;
                dad.A00 = 0;
            } else {
                dad.A01 = 0;
            }
            A00 = dad;
        } catch (zzhd e) {
            throw new IllegalArgumentException(e);
        }
    }
}

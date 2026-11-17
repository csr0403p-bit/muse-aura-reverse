package X;

import androidx.health.platform.client.proto.InvalidProtocolBufferException;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: X.GFi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9349GFi {
    public static final C9350GFj A00;
    public static final ByteBuffer A01;
    public static final byte[] A05;
    public static final Charset A03 = Charset.forName("US-ASCII");
    public static final Charset A04 = Charset.forName(HatchWebPageParserKt.UTF_8);
    public static final Charset A02 = Charset.forName("ISO-8859-1");

    static {
        byte[] bArr = new byte[0];
        A05 = bArr;
        A01 = ByteBuffer.wrap(bArr);
        C9350GFj c9350GFj = new C9350GFj(bArr);
        try {
            int i = c9350GFj.A01 + c9350GFj.A00;
            c9350GFj.A01 = i;
            if (i > 0) {
                c9350GFj.A00 = i;
                c9350GFj.A01 = i - i;
            } else {
                c9350GFj.A00 = 0;
            }
            A00 = c9350GFj;
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalArgumentException(e);
        }
    }
}

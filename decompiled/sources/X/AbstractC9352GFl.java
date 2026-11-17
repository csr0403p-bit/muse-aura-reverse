package X;

import com.facebook.aura.opengraph.HatchWebPageParserKt;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: X.GFl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9352GFl {
    public static final GHR A00;
    public static final ByteBuffer A01;
    public static final byte[] A05;
    public static final Charset A03 = Charset.forName("US-ASCII");
    public static final Charset A04 = Charset.forName(HatchWebPageParserKt.UTF_8);
    public static final Charset A02 = Charset.forName("ISO-8859-1");

    static {
        byte[] bArr = new byte[0];
        A05 = bArr;
        A01 = ByteBuffer.wrap(bArr);
        GGE gge = new GGE(bArr, 0, 0);
        try {
            gge.A0M(0);
            A00 = gge;
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalArgumentException(e);
        }
    }
}

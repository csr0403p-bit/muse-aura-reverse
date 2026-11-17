package X;

import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes6.dex */
public abstract class GGV {
    public static final GGT A00;
    public static final ByteBuffer A01;
    public static final byte[] A04;
    public static final Charset A03 = Charset.forName(HatchWebPageParserKt.UTF_8);
    public static final Charset A02 = Charset.forName("ISO-8859-1");

    static {
        byte[] bArr = new byte[0];
        A04 = bArr;
        A01 = ByteBuffer.wrap(bArr);
        GGG ggg = new GGG(bArr);
        try {
            ggg.A0M(0);
            A00 = ggg;
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static AbstractC9339GEw A00(Object obj, Object obj2) {
        AbstractC9339GEw abstractC9339GEw = (AbstractC9339GEw) ((GH2) obj);
        GGW ggw = (GGW) abstractC9339GEw.A04(C79.A0P);
        ggw.A02();
        MessageType messagetype = ggw.A00;
        AbstractC7609F5w.A0T(messagetype).AQb(messagetype, abstractC9339GEw);
        GH2 gh2 = (GH2) obj2;
        if (!ggw.A02.getClass().isInstance(gh2)) {
            throw C60O.A0i("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        ggw.A02();
        MessageType messagetype2 = ggw.A00;
        AbstractC7609F5w.A0T(messagetype2).AQb(messagetype2, (AbstractC9339GEw) ((AbstractC9340GEx) gh2));
        return GGW.A00(ggw);
    }
}

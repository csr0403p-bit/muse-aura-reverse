package X;

import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import com.facebook.acra.util.UrlEncodingWriter;

/* loaded from: classes6.dex */
public abstract class GE2 {
    public static void A00(char[] cArr, byte b, byte b2, byte b3, int i) throws InvalidProtocolBufferException {
        if (b2 > -65 || (b != -32 ? !(b != -19 || b2 < -96) : b2 < -96) || b3 > -65) {
            throw AbstractC7607F5u.A0k("Protocol message had invalid UTF-8.");
        }
        cArr[i] = (char) (((b & 15) << 12) | ((b2 & UrlEncodingWriter.UTF16_REPLACEMENT_BYTE) << 6) | (b3 & UrlEncodingWriter.UTF16_REPLACEMENT_BYTE));
    }
}

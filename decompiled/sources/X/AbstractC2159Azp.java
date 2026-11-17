package X;

import java.nio.ByteBuffer;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;

/* renamed from: X.Azp, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2159Azp extends C9tI {
    public static final String A0y(CharSequence charSequence, int i) {
        C7384Etj.A0Y(charSequence, 0);
        if (i < 0) {
            throw C60O.A0i(FGI.A0G("Count 'n' must be non-negative, but was ", '.', i));
        }
        if (i != 0) {
            int i2 = 1;
            if (i == 1) {
                return charSequence.toString();
            }
            int length = charSequence.length();
            if (length != 0) {
                if (length == 1) {
                    int i3 = 0;
                    char cCharAt = charSequence.charAt(0);
                    char[] cArr = new char[i];
                    do {
                        cArr[i3] = cCharAt;
                        i3++;
                    } while (i3 < i);
                    return new String(cArr);
                }
                StringBuilder sb = new StringBuilder(charSequence.length() * i);
                while (true) {
                    sb.append(charSequence);
                    if (i2 == i) {
                        return sb.toString();
                    }
                    i2++;
                }
            }
        }
        return "";
    }

    public static final String A0z(String str, String str2, String str3) {
        C7384Etj.A0Y(str, 0);
        C7384Etj.A0Y(str2, 1);
        C7384Etj.A0Y(str3, 2);
        int i = 0;
        int iA0B = C7BY.A0B(str, str2, 0, false);
        if (iA0B < 0) {
            return str;
        }
        int length = str2.length();
        int i2 = length;
        if (length < 1) {
            i2 = 1;
        }
        int length2 = str.length();
        int length3 = (length2 - length) + str3.length();
        if (length3 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length3);
        do {
            sb.append((CharSequence) str, i, iA0B);
            sb.append(str3);
            i = iA0B + length;
            if (iA0B >= length2) {
                break;
            }
            iA0B = C7BY.A0B(str, str2, iA0B + i2, false);
        } while (iA0B > 0);
        sb.append((CharSequence) str, i, length2);
        return sb.toString();
    }

    public static final String A10(byte[] bArr, int i) {
        AH7.A03(0, i, bArr.length);
        CharsetDecoder charsetDecoderNewDecoder = DCl.A05.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        return C60O.A0o(charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).decode(ByteBuffer.wrap(bArr, 0, i)));
    }

    public static final boolean A11(CharSequence charSequence, CharSequence charSequence2) {
        if ((charSequence instanceof String) && charSequence2 != null) {
            return ((String) charSequence).contentEquals(charSequence2);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (charSequence.charAt(i) != charSequence2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean A12(String str, String str2, boolean z) {
        return str == null ? AnonymousClass002.A1Y(str2) : !z ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }
}

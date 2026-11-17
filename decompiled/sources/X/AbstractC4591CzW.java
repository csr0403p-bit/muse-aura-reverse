package X;

import com.facebook.aura.handoff.impl.HandoffLinkVerifier;
import com.google.common.base.Preconditions;
import java.io.IOException;
import java.math.RoundingMode;

/* renamed from: X.CzW, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4591CzW {
    public static final AbstractC4591CzW A00;
    public static final AbstractC4591CzW A01;
    public static final AbstractC4591CzW A02;
    public static final AbstractC4591CzW A03;
    public static final AbstractC4591CzW A04;

    public final String A00(byte[] bytes) throws IOException {
        int length = bytes.length;
        Preconditions.checkPositionIndexes(0, length, length);
        C4592CzX c4592CzX = (C4592CzX) this;
        CzV czV = c4592CzX.A00;
        int i = czV.A02;
        int i2 = czV.A01;
        StringBuilder sbA0p = BV4.A0p(i * AbstractC4595Cza.A00(RoundingMode.CEILING, length, i2));
        try {
            if (c4592CzX instanceof C4593CzY) {
                int i3 = 0;
                Preconditions.checkPositionIndexes(0, length, length);
                for (int i4 = length; i4 >= 3; i4 -= 3) {
                    int i5 = i3 + 2;
                    int iA0D = BV6.A0D(bytes, i3 + 1) | ((bytes[i3] & 255) << 16);
                    i3 += 3;
                    int i6 = iA0D | (bytes[i5] & 255);
                    char[] cArr = czV.A07;
                    sbA0p.append(cArr[i6 >>> 18]);
                    sbA0p.append(cArr[(i6 >>> 12) & 63]);
                    sbA0p.append(cArr[(i6 >>> 6) & 63]);
                    sbA0p.append(cArr[i6 & 63]);
                }
                if (i3 < length) {
                    c4592CzX.A01(sbA0p, bytes, i3, length - i3);
                }
            } else if (c4592CzX instanceof C4594CzZ) {
                C4594CzZ c4594CzZ = (C4594CzZ) c4592CzX;
                Preconditions.checkPositionIndexes(0, length, length);
                for (byte b : bytes) {
                    int i7 = b & 255;
                    char[] cArr2 = c4594CzZ.A00;
                    sbA0p.append(cArr2[i7]);
                    sbA0p.append(cArr2[i7 | 256]);
                }
            } else {
                Preconditions.checkPositionIndexes(0, length, length);
                for (int i8 = 0; i8 < length; i8 += i2) {
                    c4592CzX.A01(sbA0p, bytes, i8, C8j3.A0F(length, i8, i2));
                }
            }
            return sbA0p.toString();
        } catch (IOException e) {
            throw BV4.A0N(e);
        }
    }

    static {
        CzV czV = new CzV("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray());
        C4593CzY c4593CzY = new C4593CzY(czV, '=');
        Preconditions.checkArgument(AnonymousClass002.A1Q(czV.A07.length, 64));
        A01 = c4593CzY;
        CzV czV2 = new CzV("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".toCharArray());
        C4593CzY c4593CzY2 = new C4593CzY(czV2, '=');
        Preconditions.checkArgument(AnonymousClass002.A1Q(czV2.A07.length, 64));
        A04 = c4593CzY2;
        A02 = new C4592CzX(new CzV("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567".toCharArray()), '=');
        A03 = new C4592CzX(new CzV("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV".toCharArray()), '=');
        A00 = new C4594CzZ(new CzV("base16()", HandoffLinkVerifier.HEX_DIGITS.toCharArray()));
    }
}

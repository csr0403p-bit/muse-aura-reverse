package X;

import java.net.ProtocolException;

/* renamed from: X.Ebs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6896Ebs {
    public final int A00;
    public final String A01;
    public final EnumC6905Ec1 A02;

    public static final C6896Ebs A00(String str) {
        EnumC6905Ec1 enumC6905Ec1;
        int i;
        String strSubstring;
        C7384Etj.A0Y(str, 0);
        if (str.startsWith("HTTP/1.")) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException(AnonymousClass006.A0y(str, "Unexpected status line: ", C60O.A0w()));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt == 0) {
                enumC6905Ec1 = EnumC6905Ec1.HTTP_1_0;
            } else {
                if (iCharAt != 1) {
                    throw new ProtocolException(AnonymousClass006.A0y(str, "Unexpected status line: ", C60O.A0w()));
                }
                enumC6905Ec1 = EnumC6905Ec1.HTTP_1_1;
            }
        } else {
            if (!str.startsWith("ICY ")) {
                throw new ProtocolException(AnonymousClass006.A0y(str, "Unexpected status line: ", C60O.A0w()));
            }
            enumC6905Ec1 = EnumC6905Ec1.HTTP_1_0;
            i = 4;
        }
        int length = str.length();
        int i2 = i + 3;
        if (length < i2) {
            throw new ProtocolException(AnonymousClass006.A0y(str, "Unexpected status line: ", C60O.A0w()));
        }
        try {
            int iA0J = BV7.A0J(str, i, i2);
            if (length <= i2) {
                strSubstring = "";
            } else {
                if (str.charAt(i2) != ' ') {
                    throw new ProtocolException(AnonymousClass006.A0y(str, "Unexpected status line: ", C60O.A0w()));
                }
                strSubstring = str.substring(i + 4);
            }
            return new C6896Ebs(strSubstring, enumC6905Ec1, iA0J);
        } catch (NumberFormatException unused) {
            throw new ProtocolException(AnonymousClass006.A0y(str, "Unexpected status line: ", C60O.A0w()));
        }
    }

    public C6896Ebs(String str, EnumC6905Ec1 enumC6905Ec1, int i) {
        this.A02 = enumC6905Ec1;
        this.A00 = i;
        this.A01 = str;
    }

    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(this.A02 == EnumC6905Ec1.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sbA0w.append(' ');
        sbA0w.append(this.A00);
        sbA0w.append(' ');
        return AnonymousClass001.A0v(this.A01, sbA0w);
    }
}

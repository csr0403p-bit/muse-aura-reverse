package X;

/* loaded from: classes6.dex */
public abstract class HnT {
    public static String A00(byte[] bArr) {
        String str;
        StringBuilder sbA0p = BV4.A0p(bArr.length);
        for (int iA0A : bArr) {
            if (iA0A == 34) {
                str = "\\\"";
            } else if (iA0A == 39) {
                str = "\\'";
            } else if (iA0A != 92) {
                switch (iA0A) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (iA0A < 32 || iA0A > 126) {
                            iA0A = AbstractC7611F5y.A0A(sbA0p, iA0A);
                        }
                        sbA0p.append((char) iA0A);
                        continue;
                        break;
                }
            } else {
                str = "\\\\";
            }
            sbA0p.append(str);
        }
        return sbA0p.toString();
    }
}

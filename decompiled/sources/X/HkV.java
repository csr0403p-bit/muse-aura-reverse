package X;

/* loaded from: classes6.dex */
public abstract class HkV {
    public static String A00(final AbstractC9320GEb input) {
        int iA0A;
        String str;
        StringBuilder sbA0p = BV4.A0p(input.A02());
        for (int i = 0; i < input.A02(); i++) {
            C9322GEd c9322GEd = (C9322GEd) input;
            if (c9322GEd instanceof C9323GEe) {
                C9323GEe c9323GEe = (C9323GEe) c9322GEd;
                int i2 = c9323GEe.bytesLength;
                if (((i2 - (i + 1)) | i) < 0) {
                    if (i < 0) {
                        throw new ArrayIndexOutOfBoundsException(FGI.A0H("Index < 0: ", i));
                    }
                    throw new ArrayIndexOutOfBoundsException(FGI.A0T("Index > length: ", ", ", i, i2));
                }
                iA0A = c9323GEe.bytes[c9323GEe.bytesOffset + i];
            } else {
                iA0A = c9322GEd.bytes[i];
            }
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

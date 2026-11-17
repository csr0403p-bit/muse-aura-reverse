package X;

import com.facebook.aura.pairs.PairsDiscretionDocument;
import java.util.Arrays;

/* renamed from: X.FHx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7861FHx {
    public static final FIP A02 = FIP.AUTO;
    public static final float[] A03 = new float[0];
    public float[] A01 = A03;
    public int A00 = 0;

    public static void A00(C7861FHx c7861FHx, int i) {
        int i2 = c7861FHx.A00 + i;
        float[] fArr = c7861FHx.A01;
        int length = fArr.length;
        if (i2 > length) {
            int iA04 = AbstractC7609F5w.A04(length);
            if (iA04 >= i2) {
                i2 = iA04;
            }
            c7861FHx.A01 = Arrays.copyOf(fArr, i2);
        }
    }

    public static void A01(String str, StringBuilder sb, float[] fArr, int i) {
        Integer numA02 = AbstractC7866FId.A02((int) fArr[i + 1]);
        float f = fArr[i + 2];
        sb.append(str);
        sb.append(AbstractC7866FId.A03(numA02));
        sb.append(": ");
        sb.append(f);
    }

    public static boolean A02(float f) {
        return AnonymousClass002.A1M(Float.compare(f, Float.NaN));
    }

    public final String toString() {
        Object obj;
        String str;
        String str2;
        StringBuilder sbA0w = C60O.A0w();
        int i = 0;
        while (i < this.A00) {
            Integer[] numArrA00 = C79.A00(32);
            float[] fArr = this.A01;
            String str3 = "  flexBasis: ";
            switch (numArrA00[(int) fArr[i]].intValue()) {
                case 0:
                    str3 = "  flex: ";
                    sbA0w.append(str3);
                    sbA0w.append(fArr[i + 1]);
                    sbA0w.append(PairsDiscretionDocument.TERMINATOR);
                    i += 2;
                    break;
                case 1:
                    str3 = "  flexGrow: ";
                    sbA0w.append(str3);
                    sbA0w.append(fArr[i + 1]);
                    sbA0w.append(PairsDiscretionDocument.TERMINATOR);
                    i += 2;
                    break;
                case 2:
                    str3 = "  flexShrink: ";
                    sbA0w.append(str3);
                    sbA0w.append(fArr[i + 1]);
                    sbA0w.append(PairsDiscretionDocument.TERMINATOR);
                    i += 2;
                    break;
                case 3:
                    sbA0w.append(str3);
                    sbA0w.append(fArr[i + 1]);
                    sbA0w.append(PairsDiscretionDocument.TERMINATOR);
                    i += 2;
                    break;
                case 4:
                    sbA0w.append("  flexBasis: ");
                    sbA0w.append(fArr[i + 1]);
                    sbA0w.append("%\n");
                    i += 2;
                    break;
                case 6:
                    sbA0w.append("  width: ");
                    sbA0w.append(fArr[i + 1]);
                    sbA0w.append(PairsDiscretionDocument.TERMINATOR);
                    i += 2;
                    break;
                case 7:
                    sbA0w.append("  width: ");
                    sbA0w.append(fArr[i + 1]);
                    sbA0w.append("%\n");
                    i += 2;
                    break;
                case 9:
                    sbA0w.append("  minWidth: ");
                    sbA0w.append(fArr[i + 1]);
                    sbA0w.append(PairsDiscretionDocument.TERMINATOR);
                    i += 2;
                    break;
                case 10:
                    sbA0w.append("  minWidth: ");
                    sbA0w.append(fArr[i + 1]);
                    sbA0w.append("%\n");
                    i += 2;
                    break;
                case 11:
                    sbA0w.append("  maxWidth: ");
                    sbA0w.append(fArr[i + 1]);
                    sbA0w.append(PairsDiscretionDocument.TERMINATOR);
                    i += 2;
                    break;
                case 12:
                    sbA0w.append("  maxWidth: ");
                    sbA0w.append(fArr[i + 1]);
                    sbA0w.append("%\n");
                    i += 2;
                    break;
                case 13:
                    sbA0w.append("  height: ");
                    sbA0w.append(fArr[i + 1]);
                    sbA0w.append(PairsDiscretionDocument.TERMINATOR);
                    i += 2;
                    break;
                case 14:
                    sbA0w.append("  height: ");
                    sbA0w.append(fArr[i + 1]);
                    sbA0w.append("%\n");
                    i += 2;
                    break;
                case 16:
                    sbA0w.append("  minHeight: ");
                    sbA0w.append(fArr[i + 1]);
                    sbA0w.append(PairsDiscretionDocument.TERMINATOR);
                    i += 2;
                    break;
                case 17:
                    sbA0w.append("  minHeight: ");
                    sbA0w.append(fArr[i + 1]);
                    sbA0w.append("%\n");
                    i += 2;
                    break;
                case 18:
                    sbA0w.append("  maxHeight: ");
                    sbA0w.append(fArr[i + 1]);
                    sbA0w.append(PairsDiscretionDocument.TERMINATOR);
                    i += 2;
                    break;
                case 19:
                    sbA0w.append("  maxHeight: ");
                    sbA0w.append(fArr[i + 1]);
                    sbA0w.append("%\n");
                    i += 2;
                    break;
                case 20:
                    obj = FIP.values()[(int) this.A01[i + 1]];
                    str = "  alignSelf: ";
                    sbA0w.append(str);
                    sbA0w.append(obj);
                    sbA0w.append(PairsDiscretionDocument.TERMINATOR);
                    i += 2;
                    break;
                case 21:
                    obj = HiR.values()[(int) this.A01[i + 1]];
                    str = "  positionType: ";
                    sbA0w.append(str);
                    sbA0w.append(obj);
                    sbA0w.append(PairsDiscretionDocument.TERMINATOR);
                    i += 2;
                    break;
                case 22:
                    str3 = "  aspectRatio: ";
                    sbA0w.append(str3);
                    sbA0w.append(fArr[i + 1]);
                    sbA0w.append(PairsDiscretionDocument.TERMINATOR);
                    i += 2;
                    break;
                case 23:
                    obj = HmK.values()[(int) this.A01[i + 1]];
                    str = "  display: ";
                    sbA0w.append(str);
                    sbA0w.append(obj);
                    sbA0w.append(PairsDiscretionDocument.TERMINATOR);
                    i += 2;
                    break;
                case 24:
                    A01("  margin", sbA0w, fArr, i);
                    sbA0w.append(PairsDiscretionDocument.TERMINATOR);
                    i += 3;
                    break;
                case 25:
                    A01("  margin", sbA0w, fArr, i);
                    sbA0w.append("%\n");
                    i += 3;
                    break;
                case 26:
                    Integer numA02 = AbstractC7866FId.A02((int) fArr[i + 1]);
                    sbA0w.append("  margin");
                    sbA0w.append(AbstractC7866FId.A03(numA02));
                    sbA0w.append(": auto\n");
                    i += 2;
                    break;
                case 27:
                    A01("  position", sbA0w, fArr, i);
                    sbA0w.append(PairsDiscretionDocument.TERMINATOR);
                    i += 3;
                    break;
                case 28:
                    A01("  position", sbA0w, fArr, i);
                    sbA0w.append("%\n");
                    i += 3;
                    break;
                case 29:
                    str2 = "  hasMeasureFunction: true\n";
                    sbA0w.append(str2);
                    i++;
                    break;
                case 30:
                    str2 = "  hasBaselineFunction: true\n";
                    sbA0w.append(str2);
                    i++;
                    break;
                case 31:
                    str2 = "  enableTextRounding: true\n";
                    sbA0w.append(str2);
                    i++;
                    break;
            }
        }
        return sbA0w.length() > 0 ? FGI.A0U("{\n", sbA0w.toString(), "}") : "";
    }
}

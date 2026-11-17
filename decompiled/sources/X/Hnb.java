package X;

import com.instagram.common.bloks.lexer.ParsingException;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class Hnb {
    public static int A00(List list, int i) {
        if (list == null || list.isEmpty()) {
            return i;
        }
        int i2 = 0;
        for (Object obj : list) {
            String string = obj.toString();
            switch (string.hashCode()) {
                case -1699597560:
                    if (!string.equals("bottom_right")) {
                        throw new ParsingException(AnonymousClass007.A0a("Can't parse corner: ", obj));
                    }
                    i2 |= 4;
                    break;
                case -966253391:
                    if (!string.equals("top_left")) {
                        throw new ParsingException(AnonymousClass007.A0a("Can't parse corner: ", obj));
                    }
                    i2 |= 1;
                    break;
                case -609197669:
                    if (!string.equals("bottom_left")) {
                        throw new ParsingException(AnonymousClass007.A0a("Can't parse corner: ", obj));
                    }
                    i2 |= 8;
                    break;
                case 116576946:
                    if (!string.equals("top_right")) {
                        throw new ParsingException(AnonymousClass007.A0a("Can't parse corner: ", obj));
                    }
                    i2 |= 2;
                    break;
                default:
                    throw new ParsingException(AnonymousClass007.A0a("Can't parse corner: ", obj));
            }
        }
        return i2;
    }

    public static void A01(float[] fArr, float f, int i) {
        float f2 = (i & 1) != 0 ? f : 0.0f;
        float f3 = (i & 2) != 0 ? f : 0.0f;
        float f4 = (i & 4) != 0 ? f : 0.0f;
        if ((i & 8) == 0) {
            f = 0.0f;
        }
        fArr[1] = f2;
        fArr[0] = f2;
        fArr[3] = f3;
        fArr[2] = f3;
        fArr[5] = f4;
        fArr[4] = f4;
        fArr[7] = f;
        fArr[6] = f;
    }

    public static boolean A02(int i) {
        if (i != 0) {
            return ((i & 1) == 0 || (i & 2) == 0 || (i & 4) == 0 || (i & 8) == 0) ? false : true;
        }
        return true;
    }
}

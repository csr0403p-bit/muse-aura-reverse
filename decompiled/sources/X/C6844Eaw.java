package X;

import com.facebook.aura.pairs.PairsDiscretionDocument;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Eaw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6844Eaw implements Iterable<HxE<? extends String, ? extends String>>, BOA {
    public final String[] A00;

    public static final C6844Eaw A00(String... strArr) {
        String[] strArr2 = (String[]) strArr.clone();
        int length = strArr2.length;
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            String str = strArr2[i2];
            if (str == null) {
                throw C60O.A0i("Headers cannot be null");
            }
            strArr2[i2] = AnonymousClass002.A0l(str);
            i2 = i3;
        }
        int iA00 = AKD.A00(0, length - 1, 2);
        if (iA00 >= 0) {
            while (true) {
                int i4 = i + 2;
                String str2 = strArr2[i];
                String str3 = strArr2[i + 1];
                A01(str2);
                A02(str3, str2);
                if (i == iA00) {
                    break;
                }
                i = i4;
            }
        }
        return new C6844Eaw(strArr2);
    }

    public final String A03(String str) {
        String[] strArr = this.A00;
        int length = strArr.length - 2;
        int iA00 = AKD.A00(length, 0, -2);
        if (iA00 > length) {
            return null;
        }
        while (true) {
            int i = length - 2;
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
            if (length == iA00) {
                return null;
            }
            length = i;
        }
    }

    public final C6845Eax A04() {
        C6845Eax c6845Eax = new C6845Eax();
        List<String> list = c6845Eax.A00;
        String[] strArr = this.A00;
        C7384Etj.A0Y(strArr, 1);
        list.addAll(Arrays.asList(strArr));
        return c6845Eax;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C6844Eaw) && Arrays.equals(this.A00, ((C6844Eaw) obj).A00);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.A00);
    }

    @Override // java.lang.Iterable
    public final Iterator<HxE<? extends String, ? extends String>> iterator() {
        String[] strArr = this.A00;
        int length = strArr.length / 2;
        HxE[] hxEArr = new HxE[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            hxEArr[i] = C3cG.A0r(strArr[i2], strArr[i2 + 1]);
        }
        return new F3E(hxEArr);
    }

    public C6844Eaw(String[] strArr) {
        this.A00 = strArr;
    }

    public static final void A01(String str) {
        int i;
        int length = str.length();
        if (length <= 0) {
            throw C60O.A0i("name is empty");
        }
        int i2 = 0;
        do {
            i = i2 + 1;
            char cCharAt = str.charAt(i2);
            if ('!' > cCharAt || cCharAt >= '\u007f') {
                throw C60O.A0i(AbstractC6843Eav.A05("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i2), str));
            }
            i2 = i;
        } while (i < length);
    }

    public static final void A02(String str, String str2) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= '\u007f')) {
                throw C7384Etj.A0D(AbstractC6843Eav.A0D(str2) ? "" : AnonymousClass006.A0y(str, ": ", C60O.A0w()), AbstractC6843Eav.A05("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i), str2));
            }
            i = i2;
        }
    }

    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        String[] strArr = this.A00;
        int length = strArr.length / 2;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            int i3 = i * 2;
            String str = strArr[i3];
            String str2 = strArr[i3 + 1];
            sbA0w.append(str);
            sbA0w.append(": ");
            if (AbstractC6843Eav.A0D(str)) {
                str2 = "\u2588\u2588";
            }
            sbA0w.append(str2);
            sbA0w.append(PairsDiscretionDocument.TERMINATOR);
            i = i2;
        }
        return sbA0w.toString();
    }
}

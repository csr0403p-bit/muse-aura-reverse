package X;

import com.facebook.aura.R;

/* renamed from: X.9W8, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9W8 {
    public static final C06827l3 A00 = C06827l3.A02("(\\d{2}):?(\\d{2})");

    public static final Integer A00(Integer num) {
        if (num == null) {
            return null;
        }
        int iIntValue = num.intValue();
        int i = 1;
        if (iIntValue != 0) {
            i = 2;
            if (iIntValue != 1) {
                i = 3;
                if (iIntValue != 2) {
                    i = 4;
                    if (iIntValue != 3) {
                        return null;
                    }
                }
            }
        }
        return Integer.valueOf(i);
    }

    public static final Integer A01(Integer num, boolean z) {
        int i;
        if (num == null) {
            return null;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            i = R.string._name_removed__res_0x7f120e5b;
            if (z) {
                i = R.string._name_removed__res_0x7f120e5c;
            }
        } else {
            if (iIntValue != 1) {
                return null;
            }
            i = R.string._name_removed__res_0x7f120e59;
            if (z) {
                i = R.string._name_removed__res_0x7f120e5a;
            }
        }
        return Integer.valueOf(i);
    }

    public static final Integer A02(String str) throws NumberFormatException {
        C06847l8 c06847l8A06;
        C06827l3 c06827l3 = A00;
        if (str == null || (c06847l8A06 = c06827l3.A06(str)) == null) {
            return null;
        }
        String str2 = (String) C8j4.A0q(c06847l8A06.AG1());
        String str3 = c06847l8A06.AG1().get(2);
        int i = Integer.parseInt(str2);
        int i2 = Integer.parseInt(str3);
        if (i > 23 || i2 > 59) {
            return null;
        }
        return Integer.valueOf((i * 60) + i2);
    }
}

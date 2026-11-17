package X;

import java.util.List;

/* renamed from: X.1Vi, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1Vi {
    public static final String A00(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, List list, G0U g0u) {
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object string = list.get(i2);
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            if (g0u != null) {
                string = g0u.invoke(string);
            } else {
                if (string != null && !(string instanceof CharSequence)) {
                    if (string instanceof Character) {
                        sb.append(((Character) string).charValue());
                    } else {
                        string = string.toString();
                    }
                }
            }
            sb.append((CharSequence) string);
        }
        sb.append(charSequence3);
        return sb.toString();
    }
}

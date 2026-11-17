package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.GqZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10164GqZ {
    public abstract String A04(C9934Glc c9934Glc, String str);

    public final String A03(C9934Glc c9934Glc, String str) {
        C9950Gm8 c9950Gm8 = (C9950Gm8) this;
        String str2 = c9950Gm8.A00;
        if (str2 == null) {
            return null;
        }
        if (!c9950Gm8.A02) {
            AbstractC9870GjI abstractC9870GjIA07 = c9934Glc.A07();
            if (abstractC9870GjIA07.A06()) {
                abstractC9870GjIA07 = abstractC9870GjIA07 instanceof C9871GjJ ? ((C9871GjJ) abstractC9870GjIA07)._referencedType : null;
            }
            Class<?> cls = Boolean.TYPE;
            Class<?> cls2 = abstractC9870GjIA07._class;
            if (cls2 != cls && cls2 != Boolean.class && cls2 != AtomicBoolean.class) {
                return null;
            }
        }
        if (str.startsWith(str2)) {
            return C9950Gm8.A00(c9950Gm8, str2, str);
        }
        return null;
    }
}

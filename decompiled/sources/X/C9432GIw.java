package X;

import java.lang.reflect.Field;
import java.util.EnumMap;
import java.util.EnumSet;

/* renamed from: X.GIw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9432GIw {
    public static final C9432GIw A04 = new C9432GIw();
    public final String A00;
    public final String A01;
    public final Field A02;
    public final Field A03;

    public static Field A00(Class cls, String str) throws SecurityException {
        for (Field field : cls.getDeclaredFields()) {
            if (str.equals(field.getName()) && field.getType() == Class.class) {
                field.setAccessible(true);
                return field;
            }
        }
        throw BV5.A0W("No field named '%s' in class '%s'", AbstractC7609F5w.A1b(cls, str));
    }

    public C9432GIw() {
        String string;
        Field fieldA00;
        String string2;
        Field fieldA002 = null;
        try {
            fieldA00 = A00(EnumSet.class, "elementType");
            string = null;
        } catch (Exception e) {
            string = e.toString();
            fieldA00 = null;
        }
        this.A03 = fieldA00;
        this.A01 = string;
        try {
            string2 = null;
            fieldA002 = A00(EnumMap.class, "keyType");
        } catch (Exception e2) {
            string2 = e2.toString();
        }
        this.A02 = fieldA002;
        this.A00 = string2;
    }
}

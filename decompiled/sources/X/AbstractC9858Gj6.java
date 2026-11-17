package X;

import java.lang.reflect.Array;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/* renamed from: X.Gj6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9858Gj6 {
    public static Object A01(AbstractC9870GjI abstractC9870GjI) {
        Class<?> cls = abstractC9870GjI._class;
        Class<?> clsA01 = AbstractC9855Gj3.A01(cls);
        if (clsA01 == null) {
            if (abstractC9870GjI.A0R() || abstractC9870GjI.A06()) {
                return EnumC10065Gom.NON_EMPTY;
            }
            if (cls == String.class) {
                return "";
            }
            if (abstractC9870GjI.A0U(Date.class)) {
                return new Date(0L);
            }
            if (!abstractC9870GjI.A0U(Calendar.class)) {
                return null;
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTimeInMillis(0L);
            return gregorianCalendar;
        }
        if (clsA01 == Integer.TYPE) {
            return 0;
        }
        if (clsA01 == Long.TYPE) {
            return BV7.A0o();
        }
        if (clsA01 == Boolean.TYPE) {
            return Boolean.FALSE;
        }
        if (clsA01 == Double.TYPE) {
            return AbstractC7609F5w.A0k();
        }
        if (clsA01 == Float.TYPE) {
            return AnonymousClass005.A0a();
        }
        if (clsA01 == Byte.TYPE) {
            return (byte) 0;
        }
        if (clsA01 == Short.TYPE) {
            return (short) 0;
        }
        if (clsA01 == Character.TYPE) {
            return (char) 0;
        }
        throw C60Q.A0V("Class ", clsA01.getName(), " is not a primitive type");
    }

    public static Object A00(AbstractC9870GjI abstractC9870GjI) {
        Object objA01 = A01(abstractC9870GjI);
        if (objA01 != null) {
            Class<?> cls = objA01.getClass();
            if (cls.isArray()) {
                return new C10141Gq8(cls, objA01, Array.getLength(objA01));
            }
        }
        return objA01;
    }

    public static String A02(AbstractC9870GjI abstractC9870GjI) {
        String str;
        String str2;
        String strA04 = AbstractC9870GjI.A04(abstractC9870GjI);
        if (strA04.startsWith("java.time.")) {
            if (strA04.indexOf(46, 10) >= 0 || abstractC9870GjI.A0U(Throwable.class)) {
                return null;
            }
            str = "Java 8 date/time";
            str2 = "com.fasterxml.jackson.datatype:jackson-datatype-jsr310";
        } else if (strA04.startsWith("org.joda.time.")) {
            str = "Joda date/time";
            str2 = "com.fasterxml.jackson.datatype:jackson-datatype-joda";
        } else {
            if (!strA04.startsWith("java.util.Optional")) {
                return null;
            }
            str = "Java 8 optional";
            str2 = "com.fasterxml.jackson.datatype:jackson-datatype-jdk8";
        }
        return String.format("%s type %s not supported by default: add Module \"%s\" to enable handling", str, AbstractC9855Gj3.A04(abstractC9870GjI), str2);
    }
}

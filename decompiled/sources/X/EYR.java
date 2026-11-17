package X;

import com.google.gson.JsonIOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes5.dex */
public abstract class EYR {
    public static final Ev0 A00;

    public static void A04(AccessibleObject accessibleObject) {
        try {
            accessibleObject.setAccessible(true);
        } catch (Exception e) {
            throw new JsonIOException(FGI.A0d("Failed making ", A01(accessibleObject), " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type.", A00(e)), e);
        }
    }

    static {
        Ev0 f1s;
        try {
            f1s = new C7404Eui();
        } catch (ReflectiveOperationException unused) {
            f1s = new F1S();
        }
        A00 = f1s;
    }

    public static String A01(AccessibleObject accessibleObject) {
        StringBuilder sbA0x;
        String strA02;
        String string = "'";
        if (accessibleObject instanceof Field) {
            sbA0x = C60O.A0x("field '");
            Field field = (Field) accessibleObject;
            strA02 = FGI.A0U(field.getDeclaringClass().getName(), "#", field.getName());
        } else if (accessibleObject instanceof Method) {
            Executable executable = (Executable) accessibleObject;
            StringBuilder sbA0x2 = C60O.A0x(executable.getName());
            A03(sbA0x2, executable);
            strA02 = sbA0x2.toString();
            sbA0x = C60O.A0x("method '");
            BV6.A18(executable.getDeclaringClass(), sbA0x);
            sbA0x.append("#");
        } else {
            if (!(accessibleObject instanceof Constructor)) {
                sbA0x = C60O.A0x("<unknown AccessibleObject> ");
                string = accessibleObject.toString();
                return AnonymousClass001.A0v(string, sbA0x);
            }
            sbA0x = C60O.A0x("constructor '");
            strA02 = A02((Constructor) accessibleObject);
        }
        sbA0x.append(strA02);
        return AnonymousClass001.A0v(string, sbA0x);
    }

    public static void A03(StringBuilder sb, AccessibleObject accessibleObject) {
        sb.append('(');
        Class<?>[] parameterTypes = ((Executable) accessibleObject).getParameterTypes();
        for (int i = 0; i < parameterTypes.length; i++) {
            if (i > 0) {
                C8j3.A1K(sb);
            }
            sb.append(parameterTypes[i].getSimpleName());
        }
        sb.append(')');
    }

    public static String A00(Exception exc) {
        if (!C60Q.A0e(exc).equals("java.lang.reflect.InaccessibleObjectException")) {
            return "";
        }
        String message = exc.getMessage();
        return FGI.A0M("\nSee ", FGI.A0M("https://github.com/google/gson/blob/main/Troubleshooting.md#", (message == null || !message.contains("to module com.google.gson")) ? "reflection-inaccessible" : "reflection-inaccessible-to-module-gson"));
    }

    public static String A02(Constructor<?> constructor) {
        StringBuilder sbA0x = C60O.A0x(constructor.getDeclaringClass().getName());
        A03(sbA0x, constructor);
        return sbA0x.toString();
    }
}

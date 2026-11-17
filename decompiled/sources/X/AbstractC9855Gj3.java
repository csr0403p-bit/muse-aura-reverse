package X;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: X.Gj3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9855Gj3 {
    public static final Annotation[] A02 = new Annotation[0];
    public static final C10104GpS[] A01 = new C10104GpS[0];
    public static final Iterator<?> A00 = Collections.EMPTY_LIST.iterator();

    /* JADX WARN: Multi-variable type inference failed */
    public static void A0H(Member member, boolean z) {
        AccessibleObject accessibleObject = (AccessibleObject) member;
        try {
            Class<?> declaringClass = member.getDeclaringClass();
            if (Modifier.isPublic(member.getModifiers()) && Modifier.isPublic(declaringClass.getModifiers()) && (!z || A0J(declaringClass))) {
                return;
            }
            accessibleObject.setAccessible(true);
        } catch (SecurityException e) {
            if (accessibleObject.isAccessible()) {
                return;
            }
            Class<?> declaringClass2 = member.getDeclaringClass();
            StringBuilder sbA0f = C3cG.A0f(member, "Cannot access ");
            sbA0f.append(" (from class ");
            BV6.A18(declaringClass2, sbA0f);
            sbA0f.append("; failed to set access: ");
            throw C8j3.A0w(e.getMessage(), sbA0f);
        } catch (RuntimeException e2) {
            Class<?> cls = e2.getClass();
            if (!"InaccessibleObjectException".equals(cls.getSimpleName())) {
                throw e2;
            }
            throw BV4.A0Q(String.format("Failed to call `setAccess()` on %s '%s' (of class %s) due to `%s`, problem: %s", C3cI.A0Y(member), member.getName(), A06(member.getDeclaringClass()), cls.getName(), e2.getMessage()), e2);
        }
    }

    public static Class<?> A02(Class<?> cls) {
        if (cls == Integer.TYPE) {
            return Integer.class;
        }
        if (cls == Long.TYPE) {
            return Long.class;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.class;
        }
        if (cls == Double.TYPE) {
            return Double.class;
        }
        if (cls == Float.TYPE) {
            return Float.class;
        }
        if (cls == Byte.TYPE) {
            return Byte.class;
        }
        if (cls == Short.TYPE) {
            return Short.class;
        }
        if (cls == Character.TYPE) {
            return Character.class;
        }
        throw C60Q.A0V("Class ", cls.getName(), " is not a primitive type");
    }

    public static String A04(AbstractC9870GjI abstractC9870GjI) {
        if (abstractC9870GjI == null) {
            return "[null]";
        }
        int i = 0;
        while (abstractC9870GjI instanceof C9872GjK) {
            i++;
            abstractC9870GjI = abstractC9870GjI.A07();
        }
        StringBuilder sbA0p = BV4.A0p(80);
        sbA0p.append('`');
        sbA0p.append(((AbstractC9869GjH) abstractC9870GjI).A0V());
        while (true) {
            int i2 = i - 1;
            if (i <= 0) {
                return C8j3.A16(sbA0p, '`');
            }
            sbA0p.append("[]");
            i = i2;
        }
    }

    public static String A06(Class<?> cls) {
        if (cls == null) {
            return "[null]";
        }
        int i = 0;
        while (cls.isArray()) {
            i++;
            cls = cls.getComponentType();
        }
        String simpleName = cls.isPrimitive() ? cls.getSimpleName() : cls.getName();
        if (i > 0) {
            StringBuilder sbA0x = C60O.A0x(simpleName);
            do {
                sbA0x.append("[]");
                i--;
            } while (i > 0);
            simpleName = sbA0x.toString();
        }
        StringBuilder sbA0p = BV4.A0p(simpleName.length() + 2);
        sbA0p.append('`');
        sbA0p.append(simpleName);
        return C8j3.A16(sbA0p, '`');
    }

    public static String A07(Object obj) {
        if (obj == null) {
            return "[null]";
        }
        return A06(obj instanceof Class ? (Class) obj : obj.getClass());
    }

    public static String A08(Object obj) {
        if (obj == null) {
            return "unknown";
        }
        return A06(obj instanceof Class ? (Class) obj : obj.getClass());
    }

    public static String A09(String str) {
        if (str == null) {
            return "[null]";
        }
        StringBuilder sbA0p = BV4.A0p(str.length() + 2);
        sbA0p.append('\'');
        sbA0p.append(str);
        return C8j3.A16(sbA0p, '\'');
    }

    public static String A0A(Throwable th) {
        if (th instanceof JacksonException) {
            return ((JacksonException) th).A05();
        }
        if ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        return th.getMessage();
    }

    public static <T> Constructor<T> A0B(Class<T> cls, boolean z) throws Throwable {
        try {
            Constructor<T> declaredConstructor = cls.getDeclaredConstructor(null);
            if (z) {
                A0H(declaredConstructor, z);
                return declaredConstructor;
            }
            if (Modifier.isPublic(declaredConstructor.getModifiers())) {
                return declaredConstructor;
            }
            throw C60Q.A0V("Default constructor for ", cls.getName(), " is not accessible (non-public?): not allowed to try modify access via Reflection: cannot instantiate type");
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (Exception e) {
            A0G(e, FGI.A0d("Failed to find default constructor of class ", cls.getName(), ", problem: ", e.getMessage()));
            throw F60.createAndThrow();
        }
    }

    public static void A0C(AbstractC9919GlE abstractC9919GlE, Exception exc) throws Exception {
        abstractC9919GlE.A0b(EnumC9998GnS.AUTO_CLOSE_JSON_CONTENT);
        try {
            abstractC9919GlE.close();
        } catch (Exception e) {
            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(exc, e);
        }
        if (exc instanceof IOException) {
            throw exc;
        }
        A0F(exc);
        throw BV4.A0e(exc);
    }

    public static void A0D(Class cls, Class cls2, Collection collection) {
        if (cls == cls2 || cls == null || cls == Object.class || collection.contains(cls)) {
            return;
        }
        collection.add(cls);
        for (Class<?> cls3 : cls.getInterfaces()) {
            A0D(cls3, cls2, collection);
        }
        A0D(cls.getSuperclass(), cls2, collection);
    }

    public static void A0F(Throwable th) {
        if (th instanceof RuntimeException) {
            throw th;
        }
    }

    public static boolean A0I(Class<?> cls) {
        return cls == Void.class || cls == Void.TYPE || cls == C9857Gj5.class;
    }

    public static boolean A0K(Object obj) {
        return obj == null || obj.getClass().getAnnotation(JacksonStdImpl.class) != null;
    }

    public static Annotation[] A0M(Class<?> cls) {
        return (cls == Object.class || cls.isPrimitive()) ? A02 : cls.getDeclaredAnnotations();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Class<?> A00(java.lang.Class<?> r4) {
        /*
            int r0 = r4.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isStatic(r0)
            r0 = 0
            if (r1 != 0) goto L2c
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            if (r4 == r3) goto L1c
            boolean r1 = r4.isPrimitive()     // Catch: java.lang.SecurityException -> L2c
            if (r1 != 0) goto L1c
            java.lang.reflect.Method r2 = r4.getEnclosingMethod()     // Catch: java.lang.SecurityException -> L2c
            r1 = 1
            if (r2 != 0) goto L1d
        L1c:
            r1 = 0
        L1d:
            if (r1 != 0) goto L2b
            if (r4 == r3) goto L2b
            boolean r1 = r4.isPrimitive()     // Catch: java.lang.SecurityException -> L2c
            if (r1 != 0) goto L2b
            java.lang.Class r0 = r4.getEnclosingClass()     // Catch: java.lang.SecurityException -> L2c
        L2b:
            return r0
        L2c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC9855Gj3.A00(java.lang.Class):java.lang.Class");
    }

    public static Class<?> A01(Class<?> cls) {
        if (cls.isPrimitive()) {
            return cls;
        }
        if (cls == Integer.class) {
            return Integer.TYPE;
        }
        if (cls == Long.class) {
            return Long.TYPE;
        }
        if (cls == Boolean.class) {
            return Boolean.TYPE;
        }
        if (cls == Double.class) {
            return Double.TYPE;
        }
        if (cls == Float.class) {
            return Float.TYPE;
        }
        if (cls == Byte.class) {
            return Byte.TYPE;
        }
        if (cls == Short.class) {
            return Short.TYPE;
        }
        if (cls == Character.class) {
            return Character.TYPE;
        }
        return null;
    }

    public static <T> T A03(Class<T> cls, boolean z) throws Throwable {
        Constructor constructorA0B = A0B(cls, z);
        if (constructorA0B == null) {
            throw C60Q.A0V("Class ", cls.getName(), " has no default (no arg) constructor");
        }
        try {
            return (T) constructorA0B.newInstance(null);
        } catch (Exception e) {
            A0G(e, FGI.A0d("Failed to instantiate class ", cls.getName(), ", problem: ", e.getMessage()));
            throw F60.createAndThrow();
        }
    }

    public static String A05(Class<?> cls) {
        if (cls.isAnnotation()) {
            return "annotation";
        }
        if (cls.isArray()) {
            return "array";
        }
        if (Enum.class.isAssignableFrom(cls)) {
            return "enum";
        }
        if (cls.isPrimitive()) {
            return "primitive";
        }
        return null;
    }

    public static void A0E(Class<?> cls, Object obj, String str) {
        Class<?> cls2 = obj.getClass();
        if (cls2 != cls) {
            throw BV5.A0W("Sub-class %s (of class %s) must override method '%s'", new Object[]{cls2.getName(), cls.getName(), str});
        }
    }

    public static void A0G(Throwable th, String str) throws Throwable {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        A0F(th);
        if (!(th instanceof Error)) {
            throw BV4.A0Q(str, th);
        }
        throw th;
    }

    public static boolean A0J(Class<?> cls) {
        String name = cls.getName();
        return name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("sun.");
    }

    public static C10104GpS[] A0L(Class<?> cls) throws SecurityException {
        if (cls.isInterface() || cls == Object.class || cls.isPrimitive()) {
            return A01;
        }
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        int length = declaredConstructors.length;
        C10104GpS[] c10104GpSArr = new C10104GpS[length];
        for (int i = 0; i < length; i++) {
            c10104GpSArr[i] = new C10104GpS(declaredConstructors[i]);
        }
        return c10104GpSArr;
    }

    public static Method[] A0N(Class<?> cls) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            try {
                return cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                e = e;
                ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
                if (contextClassLoader != null) {
                    try {
                        return contextClassLoader.loadClass(cls.getName()).getDeclaredMethods();
                    } catch (ClassNotFoundException e2) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(e, e2);
                        throw BV4.A0Q(String.format("Failed on call to `getDeclaredMethods()` on class `%s`, problem: (%s) %s", cls.getName(), C60Q.A0e(e), e.getMessage()), e);
                    }
                }
                throw BV4.A0Q(String.format("Failed on call to `getDeclaredMethods()` on class `%s`, problem: (%s) %s", cls.getName(), C60Q.A0e(e), e.getMessage()), e);
            }
        } catch (Exception e3) {
            e = e3;
            throw BV4.A0Q(String.format("Failed on call to `getDeclaredMethods()` on class `%s`, problem: (%s) %s", cls.getName(), C60Q.A0e(e), e.getMessage()), e);
        }
    }
}

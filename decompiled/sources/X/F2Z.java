package X;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import kotlinx.serialization.Polymorphic;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.NamedCompanion;

/* loaded from: classes5.dex */
public abstract class F2Z {
    public static final <T> C9hr<T> A00(Object obj, C9hr<Object>... c9hrArr) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class[] clsArr;
        try {
            int length = c9hrArr.length;
            int i = 0;
            if (length == 0) {
                clsArr = new Class[0];
            } else {
                clsArr = new Class[length];
                do {
                    clsArr[i] = C9hr.class;
                    i++;
                } while (i < length);
            }
            Object objInvoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(c9hrArr, length));
            if (objInvoke instanceof C9hr) {
                return (C9hr) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                throw e;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    public static final <T> C9hr<T> A01(C9uG<T> c9uG, C9hr<Object>... c9hrArr) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Serializable serializable;
        Field field;
        C9hr<T> c9hrA00;
        C9hr<T> c9hr;
        C9hr<T> c9hrA002;
        C7384Etj.A0Y(c9hrArr, 1);
        Class clsA01 = C9uT.A01(c9uG);
        C9hr[] c9hrArr2 = (C9hr[]) Arrays.copyOf(c9hrArr, c9hrArr.length);
        C7384Etj.A0Y(c9hrArr2, 1);
        if (clsA01.isEnum() && clsA01.getAnnotation(Serializable.class) == null && clsA01.getAnnotation(Polymorphic.class) == null) {
            Object[] enumConstants = clsA01.getEnumConstants();
            String canonicalName = clsA01.getCanonicalName();
            C7384Etj.A0U(canonicalName);
            C7384Etj.A0Z(enumConstants, "null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>");
            return new C9iQ(canonicalName, (Enum[]) enumConstants);
        }
        int length = c9hrArr2.length;
        C9hr[] c9hrArr3 = (C9hr[]) Arrays.copyOf(c9hrArr2, length);
        try {
            Object objA0c = BV5.A0c(null, clsA01, "Companion");
            if (objA0c != null && (c9hrA002 = A00(objA0c, (C9hr[]) Arrays.copyOf(c9hrArr3, c9hrArr3.length))) != null) {
                return c9hrA002;
            }
        } catch (Throwable unused) {
        }
        String canonicalName2 = clsA01.getCanonicalName();
        if (canonicalName2 != null) {
            int i = 0;
            if (!canonicalName2.startsWith("java.") && !canonicalName2.startsWith("kotlin.")) {
                Field[] declaredFields = clsA01.getDeclaredFields();
                C7384Etj.A0U(declaredFields);
                int length2 = declaredFields.length;
                Field field2 = null;
                int i2 = 0;
                boolean z = false;
                while (true) {
                    if (i2 < length2) {
                        Field field3 = declaredFields[i2];
                        if ("INSTANCE".equals(field3.getName()) && clsA01.equals(field3.getType()) && Modifier.isStatic(field3.getModifiers())) {
                            if (z) {
                                break;
                            }
                            field2 = field3;
                            z = true;
                        }
                        i2++;
                    } else if (z && field2 != null) {
                        Object obj = field2.get(null);
                        Method[] methods = clsA01.getMethods();
                        C7384Etj.A0U(methods);
                        int length3 = methods.length;
                        Method method = null;
                        boolean z2 = false;
                        while (true) {
                            if (i < length3) {
                                Method method2 = methods[i];
                                if ("serializer".equals(method2.getName())) {
                                    Class<?>[] parameterTypes = method2.getParameterTypes();
                                    C7384Etj.A0U(parameterTypes);
                                    if (parameterTypes.length == 0 && C9hr.class.equals(method2.getReturnType())) {
                                        if (z2) {
                                            break;
                                        }
                                        method = method2;
                                        z2 = true;
                                    }
                                }
                                i++;
                            } else if (z2 && method != null) {
                                Object objInvoke = method.invoke(obj, null);
                                if ((objInvoke instanceof C9hr) && (c9hr = (C9hr) objInvoke) != null) {
                                    return c9hr;
                                }
                            }
                        }
                    }
                }
            }
        }
        C9hr[] c9hrArr4 = (C9hr[]) Arrays.copyOf(c9hrArr2, length);
        Class<?>[] declaredClasses = clsA01.getDeclaredClasses();
        C7384Etj.A0U(declaredClasses);
        int length4 = declaredClasses.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length4) {
                break;
            }
            Class<?> cls = declaredClasses[i3];
            if (cls.getAnnotation(NamedCompanion.class) != null) {
                String simpleName = cls.getSimpleName();
                Object obj2 = null;
                try {
                    obj2 = BV4.A0r(clsA01, simpleName).get(null);
                } catch (Throwable unused2) {
                }
                if (obj2 != null && (c9hrA00 = A00(obj2, (C9hr[]) Arrays.copyOf(c9hrArr4, c9hrArr4.length))) != null) {
                    return c9hrA00;
                }
            } else {
                i3++;
            }
        }
        Object obj3 = null;
        try {
            Class<?>[] declaredClasses2 = clsA01.getDeclaredClasses();
            C7384Etj.A0U(declaredClasses2);
            int length5 = declaredClasses2.length;
            int i4 = 0;
            Class<?> cls2 = null;
            boolean z3 = false;
            while (true) {
                if (i4 < length5) {
                    Class<?> cls3 = declaredClasses2[i4];
                    if (cls3.getSimpleName().equals("$serializer")) {
                        if (z3) {
                            break;
                        }
                        z3 = true;
                        cls2 = cls3;
                    }
                    i4++;
                } else if (z3 && cls2 != null && (field = cls2.getField("INSTANCE")) != null) {
                    obj3 = field.get(null);
                }
            }
            if (obj3 instanceof C9hr) {
                C9hr<T> c9hr2 = (C9hr) obj3;
                if (c9hr2 != null) {
                    return c9hr2;
                }
            }
        } catch (NoSuchFieldException unused3) {
        }
        if (clsA01.getAnnotation(Polymorphic.class) != null || ((serializable = (Serializable) clsA01.getAnnotation(Serializable.class)) != null && BV5.A1S(PolymorphicSerializer.class, new C0861A6i(serializable.with())))) {
            return new PolymorphicSerializer(new C0861A6i(clsA01));
        }
        return null;
    }
}

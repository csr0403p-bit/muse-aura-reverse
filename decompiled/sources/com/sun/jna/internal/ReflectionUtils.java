package com.sun.jna.internal;

import X.AnonymousClass001;
import X.BV4;
import X.BV5;
import X.FGI;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public class ReflectionUtils {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static Constructor CONSTRUCTOR_LOOKUP_CLASS;
    public static final Logger LOG = BV5.A1B(ReflectionUtils.class);
    public static final Method METHOD_HANDLES_BIND_TO;
    public static final Method METHOD_HANDLES_INVOKE_WITH_ARGUMENTS;
    public static final Method METHOD_HANDLES_LOOKUP;
    public static final Method METHOD_HANDLES_LOOKUP_FIND_SPECIAL;
    public static final Method METHOD_HANDLES_LOOKUP_IN;
    public static final Method METHOD_HANDLES_LOOKUP_UNREFLECT_SPECIAL;
    public static final Method METHOD_HANDLES_PRIVATE_LOOKUP_IN;
    public static final Method METHOD_IS_DEFAULT;
    public static final Method METHOD_TYPE;

    public static Constructor lookupDeclaredConstructor(Class cls, Class... clsArr) throws NoSuchMethodException, SecurityException {
        if (cls == null) {
            LOG.log(Level.FINE, "Failed to lookup method: <init>#{1}({2})", new Object[]{cls, Arrays.toString(clsArr)});
            return null;
        }
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(clsArr);
            declaredConstructor.setAccessible(true);
            return declaredConstructor;
        } catch (Exception unused) {
            LOG.log(Level.FINE, "Failed to lookup method: <init>#{1}({2})", new Object[]{cls, Arrays.toString(clsArr)});
            return null;
        }
    }

    public static Method lookupMethod(Class cls, String str, Class... clsArr) throws NoSuchMethodException, SecurityException {
        Method method = null;
        if (cls == null) {
            LOG.log(Level.FINE, "Failed to lookup method: {0}#{1}({2})", new Object[]{cls, str, Arrays.toString(clsArr)});
            return null;
        }
        try {
            method = cls.getMethod(str, clsArr);
            return method;
        } catch (Exception unused) {
            LOG.log(Level.FINE, "Failed to lookup method: {0}#{1}({2})", new Object[]{cls, str, Arrays.toString(clsArr)});
            return method;
        }
    }

    static {
        Class clsLookupClass = lookupClass("java.lang.invoke.MethodHandles");
        Class clsLookupClass2 = lookupClass("java.lang.invoke.MethodHandle");
        Class clsLookupClass3 = lookupClass("java.lang.invoke.MethodHandles$Lookup");
        Class clsLookupClass4 = lookupClass("java.lang.invoke.MethodType");
        METHOD_IS_DEFAULT = lookupMethod(Method.class, "isDefault", new Class[0]);
        METHOD_HANDLES_LOOKUP = lookupMethod(clsLookupClass, "lookup", new Class[0]);
        METHOD_HANDLES_LOOKUP_IN = lookupMethod(clsLookupClass3, "in", Class.class);
        METHOD_HANDLES_LOOKUP_UNREFLECT_SPECIAL = lookupMethod(clsLookupClass3, "unreflectSpecial", Method.class, Class.class);
        METHOD_HANDLES_LOOKUP_FIND_SPECIAL = lookupMethod(clsLookupClass3, "findSpecial", Class.class, String.class, clsLookupClass4, Class.class);
        METHOD_HANDLES_BIND_TO = lookupMethod(clsLookupClass2, "bindTo", Object.class);
        METHOD_HANDLES_INVOKE_WITH_ARGUMENTS = lookupMethod(clsLookupClass2, "invokeWithArguments", Object[].class);
        METHOD_HANDLES_PRIVATE_LOOKUP_IN = lookupMethod(clsLookupClass, "privateLookupIn", Class.class, clsLookupClass3);
        METHOD_TYPE = lookupMethod(clsLookupClass4, "methodType", Class.class, Class[].class);
    }

    public static Object createLookup() {
        return METHOD_HANDLES_LOOKUP.invoke(null, null);
    }

    public static Object createPrivateLookupIn(Class cls, Object obj) {
        return METHOD_HANDLES_PRIVATE_LOOKUP_IN.invoke(null, cls, obj);
    }

    public static Constructor getConstructorLookupClass() throws NoSuchMethodException, SecurityException {
        Constructor constructor = CONSTRUCTOR_LOOKUP_CLASS;
        if (constructor != null) {
            return constructor;
        }
        Constructor constructorLookupDeclaredConstructor = lookupDeclaredConstructor(lookupClass("java.lang.invoke.MethodHandles$Lookup"), Class.class);
        CONSTRUCTOR_LOOKUP_CLASS = constructorLookupDeclaredConstructor;
        return constructorLookupDeclaredConstructor;
    }

    public static Object getMethodHandle(Method method) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            return mhViaFindSpecial(createPrivateLookupIn(method.getDeclaringClass(), METHOD_HANDLES_LOOKUP.invoke(null, null)), method);
        } catch (Exception unused) {
            return mhViaUnreflectSpecial(getConstructorLookupClass().newInstance(method.getDeclaringClass()), method);
        }
    }

    public static Object invokeDefaultMethod(Object obj, Object obj2, Object... objArr) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        return METHOD_HANDLES_INVOKE_WITH_ARGUMENTS.invoke(METHOD_HANDLES_BIND_TO.invoke(obj2, obj), objArr);
    }

    public static boolean isDefault(Method method) throws Throwable {
        Method method2 = METHOD_IS_DEFAULT;
        if (method2 == null) {
            return false;
        }
        try {
            return AnonymousClass001.A1X(method2.invoke(method, null));
        } catch (IllegalAccessException | IllegalArgumentException e) {
            throw BV4.A0e(e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if ((cause instanceof RuntimeException) || (cause instanceof Error)) {
                throw cause;
            }
            throw BV4.A0e(cause);
        }
    }

    public static Object mhViaFindSpecial(Object obj, Method method) {
        return METHOD_HANDLES_LOOKUP_FIND_SPECIAL.invoke(obj, method.getDeclaringClass(), method.getName(), METHOD_TYPE.invoke(null, method.getReturnType(), method.getParameterTypes()), method.getDeclaringClass());
    }

    public static Object mhViaUnreflectSpecial(Object obj, Method method) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        return METHOD_HANDLES_LOOKUP_UNREFLECT_SPECIAL.invoke(METHOD_HANDLES_LOOKUP_IN.invoke(obj, method.getDeclaringClass()), method, method.getDeclaringClass());
    }

    public static Class lookupClass(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            LOG.log(Level.FINE, FGI.A0M("Failed to lookup class: ", str), (Throwable) e);
            return null;
        }
    }
}

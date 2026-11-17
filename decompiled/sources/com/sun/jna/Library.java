package com.sun.jna;

import X.BV4;
import X.BV5;
import X.C60O;
import X.C60Q;
import X.C8j3;
import X.C8j4;
import com.sun.jna.internal.ReflectionUtils;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public interface Library {
    public static final String OPTION_ALLOW_OBJECTS = "allow-objects";
    public static final String OPTION_CALLING_CONVENTION = "calling-convention";
    public static final String OPTION_CLASSLOADER = "classloader";
    public static final String OPTION_FUNCTION_MAPPER = "function-mapper";
    public static final String OPTION_INVOCATION_MAPPER = "invocation-mapper";
    public static final String OPTION_OPEN_FLAGS = "open-flags";
    public static final String OPTION_STRING_ENCODING = "string-encoding";
    public static final String OPTION_STRUCTURE_ALIGNMENT = "structure-alignment";
    public static final String OPTION_SYMBOL_PROVIDER = "symbol-provider";
    public static final String OPTION_TYPE_MAPPER = "type-mapper";

    public class Handler implements InvocationHandler {
        public static final Method OBJECT_EQUALS;
        public static final Method OBJECT_HASHCODE;
        public static final Method OBJECT_TOSTRING;
        public final Map<Method, FunctionInfo> functions = BV4.A11();
        public final Class<?> interfaceClass;
        public final InvocationMapper invocationMapper;
        public final NativeLibrary nativeLibrary;
        public final Map<String, Object> options;

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            Class<?>[] parameterTypes;
            HashMap mapA0w;
            Object[] objArrConcatenateVarArgs = objArr;
            if (OBJECT_TOSTRING.equals(method)) {
                return C8j3.A14(this.nativeLibrary, C60O.A0x("Proxy interface to "));
            }
            if (OBJECT_HASHCODE.equals(method)) {
                return BV5.A0X(this);
            }
            if (OBJECT_EQUALS.equals(method)) {
                Object obj2 = objArr[0];
                if (obj2 == null || !Proxy.isProxyClass(obj2.getClass())) {
                    return Boolean.FALSE;
                }
                return Function.valueOf(Proxy.getInvocationHandler(obj2) == this);
            }
            FunctionInfo functionInfo = this.functions.get(method);
            if (functionInfo == null) {
                synchronized (this.functions) {
                    functionInfo = this.functions.get(method);
                    if (functionInfo == null) {
                        if (ReflectionUtils.isDefault(method)) {
                            functionInfo = new FunctionInfo(ReflectionUtils.getMethodHandle(method));
                        } else {
                            boolean zIsVarArgs = Function.IS_VARARGS.isVarArgs(method);
                            InvocationMapper invocationMapper = this.invocationMapper;
                            Function function = null;
                            InvocationHandler invocationHandler = invocationMapper != null ? invocationMapper.getInvocationHandler(this.nativeLibrary, method) : null;
                            if (invocationHandler == null) {
                                function = this.nativeLibrary.getFunction(method.getName(), method);
                                parameterTypes = method.getParameterTypes();
                                mapA0w = BV4.A0w(this.options);
                                mapA0w.put(Function.OPTION_INVOKING_METHOD, method);
                            } else {
                                parameterTypes = null;
                                mapA0w = null;
                            }
                            functionInfo = new FunctionInfo(invocationHandler, function, parameterTypes, zIsVarArgs, mapA0w);
                        }
                        this.functions.put(method, functionInfo);
                    }
                }
            }
            Object obj3 = functionInfo.methodHandle;
            if (obj3 != null) {
                return ReflectionUtils.invokeDefaultMethod(obj, obj3, objArr);
            }
            if (functionInfo.isVarArgs) {
                objArrConcatenateVarArgs = Function.concatenateVarArgs(objArr);
            }
            InvocationHandler invocationHandler2 = functionInfo.handler;
            return invocationHandler2 != null ? invocationHandler2.invoke(obj, method, objArrConcatenateVarArgs) : functionInfo.function.invoke(method, functionInfo.parameterTypes, method.getReturnType(), objArrConcatenateVarArgs, functionInfo.options);
        }

        public final class FunctionInfo {
            public final Function function;
            public final InvocationHandler handler;
            public final boolean isVarArgs;
            public final Object methodHandle;
            public final Map<String, ?> options;
            public final Class<?>[] parameterTypes;

            public FunctionInfo(Object obj) {
                this.handler = null;
                this.function = null;
                this.isVarArgs = false;
                this.options = null;
                this.parameterTypes = null;
                this.methodHandle = obj;
            }

            public FunctionInfo(InvocationHandler invocationHandler, Function function, Class<?>[] clsArr, boolean z, Map<String, ?> map) {
                this.handler = invocationHandler;
                this.function = function;
                this.isVarArgs = z;
                this.options = map;
                this.parameterTypes = clsArr;
                this.methodHandle = null;
            }
        }

        static {
            try {
                OBJECT_TOSTRING = Object.class.getMethod("toString", null);
                OBJECT_HASHCODE = Object.class.getMethod("hashCode", null);
                OBJECT_EQUALS = Object.class.getMethod("equals", Object.class);
            } catch (Exception unused) {
                throw new Error("Error retrieving Object.toString() method");
            }
        }

        public Class<?> getInterfaceClass() {
            return this.interfaceClass;
        }

        public String getLibraryName() {
            return this.nativeLibrary.libraryName;
        }

        public NativeLibrary getNativeLibrary() {
            return this.nativeLibrary;
        }

        public Handler(String str, Class<?> cls, Map<String, ?> map) {
            if (str != null && "".equals(str.trim())) {
                throw C60Q.A0V("Invalid library name \"", str, "\"");
            }
            if (!cls.isInterface()) {
                throw C60Q.A0V(str, " does not implement an interface: ", cls.getName());
            }
            this.interfaceClass = cls;
            HashMap mapA0w = BV4.A0w(map);
            this.options = mapA0w;
            int i = AltCallingConvention.class.isAssignableFrom(cls) ? 63 : 0;
            if (mapA0w.get(Library.OPTION_CALLING_CONVENTION) == null) {
                C8j4.A1O(Library.OPTION_CALLING_CONVENTION, mapA0w, i);
            }
            if (mapA0w.get(Library.OPTION_CLASSLOADER) == null) {
                mapA0w.put(Library.OPTION_CLASSLOADER, cls.getClassLoader());
            }
            this.nativeLibrary = NativeLibrary.getInstance(str, mapA0w);
            this.invocationMapper = (InvocationMapper) mapA0w.get(Library.OPTION_INVOCATION_MAPPER);
        }
    }
}

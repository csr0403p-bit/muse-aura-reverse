package com.sun.jna;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass007;
import X.BV4;
import X.BV5;
import X.BV6;
import X.BV7;
import X.C60O;
import X.C60Q;
import X.C8j3;
import X.FGI;
import com.sun.jna.Library;
import com.sun.jna.Structure;
import com.sun.jna.internal.Cleaner;
import java.io.Closeable;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Executable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class CallbackReference extends WeakReference<Callback> implements Closeable {
    public static final Class<?> DLL_CALLBACK_CLASS;
    public static final Method PROXY_CALLBACK_METHOD;
    public static final Map<Callback, CallbackThreadInitializer> initializers;
    public int callingConvention;
    public Pointer cbstruct;
    public Cleaner.Cleanable cleanable;
    public Method method;
    public CallbackProxy proxy;
    public Pointer trampoline;
    public static final Map<Callback, CallbackReference> callbackMap = BV4.A11();
    public static final Map<Callback, CallbackReference> directCallbackMap = BV4.A11();
    public static final Map<Pointer, Reference<Callback>[]> pointerCallbackMap = BV4.A11();
    public static final Map<Object, Object> allocations = Collections.synchronizedMap(BV4.A11());
    public static final Map<Long, Reference<CallbackReference>> allocatedMemory = C60O.A1C();

    public class AttachOptions extends Structure {
        public static final List<String> FIELDS = Collections.unmodifiableList(BV5.A12("daemon", "detach", "name"));
        public boolean daemon;
        public boolean detach;
        public String name;

        @Override // com.sun.jna.Structure
        public List<String> getFieldOrder() {
            return FIELDS;
        }

        public AttachOptions() {
            this.encoding = "utf8";
        }
    }

    public class DefaultCallbackProxy implements CallbackProxy {
        public final Method callbackMethod;
        public final String encoding;
        public final FromNativeConverter[] fromNative;
        public ToNativeConverter toNative;

        private Object convertArgument(Object obj, Class<?> cls) {
            if (!(obj instanceof Pointer)) {
                return ((Boolean.TYPE == cls || Boolean.class == cls) && (obj instanceof Number)) ? Function.valueOf(AnonymousClass002.A1L(AnonymousClass001.A0F(obj))) : obj;
            }
            if (cls == String.class) {
                return ((Pointer) obj).getString(0L, this.encoding);
            }
            if (cls == WString.class) {
                return new WString(((Pointer) obj).getWideString(0L));
            }
            if (cls == String[].class) {
                return ((Pointer) obj).getStringArray(0L, -1, this.encoding);
            }
            if (cls == WString[].class) {
                return ((Pointer) obj).getWideStringArray(0L, -1);
            }
            if (Callback.class.isAssignableFrom(cls)) {
                return CallbackReference.getCallback(cls, (Pointer) obj, false);
            }
            if (!BV6.A1X(cls)) {
                return obj;
            }
            if (!Structure.ByValue.class.isAssignableFrom(cls)) {
                Structure structureNewInstance = Structure.newInstance((Class<Structure>) cls, (Pointer) obj);
                structureNewInstance.conditionalAutoRead();
                return structureNewInstance;
            }
            Structure structureNewInstance2 = Structure.newInstance(cls);
            int size = structureNewInstance2.size();
            byte[] bArr = new byte[size];
            ((Pointer) obj).read(0L, bArr, 0, size);
            structureNewInstance2.getPointer().write(0L, bArr, 0, size);
            structureNewInstance2.read();
            return structureNewInstance2;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0064 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public DefaultCallbackProxy(java.lang.reflect.Method r8, com.sun.jna.TypeMapper r9, java.lang.String r10) throws java.lang.SecurityException {
            /*
                r6 = this;
                com.sun.jna.CallbackReference.this = r7
                r6.<init>()
                r6.callbackMethod = r8
                r6.encoding = r10
                java.lang.Class[] r5 = r8.getParameterTypes()
                java.lang.Class r1 = r8.getReturnType()
                int r0 = r5.length
                com.sun.jna.FromNativeConverter[] r0 = new com.sun.jna.FromNativeConverter[r0]
                r6.fromNative = r0
                java.lang.Class<com.sun.jna.NativeMapped> r4 = com.sun.jna.NativeMapped.class
                boolean r0 = r4.isAssignableFrom(r1)
                if (r0 == 0) goto L4b
                com.sun.jna.NativeMappedConverter r0 = com.sun.jna.NativeMappedConverter.getInstance(r1)
            L22:
                r6.toNative = r0
            L24:
                r3 = 0
            L25:
                com.sun.jna.FromNativeConverter[] r0 = r6.fromNative
                int r0 = r0.length
                if (r3 >= r0) goto L52
                r0 = r5[r3]
                boolean r0 = r4.isAssignableFrom(r0)
                if (r0 == 0) goto L40
                com.sun.jna.FromNativeConverter[] r2 = r6.fromNative
                r1 = r5[r3]
                com.sun.jna.NativeMappedConverter r0 = new com.sun.jna.NativeMappedConverter
                r0.<init>(r1)
            L3b:
                r2[r3] = r0
            L3d:
                int r3 = r3 + 1
                goto L25
            L40:
                if (r9 == 0) goto L3d
                com.sun.jna.FromNativeConverter[] r2 = r6.fromNative
                r0 = r5[r3]
                com.sun.jna.FromNativeConverter r0 = r9.getFromNativeConverter(r0)
                goto L3b
            L4b:
                if (r9 == 0) goto L24
                com.sun.jna.ToNativeConverter r0 = r9.getToNativeConverter(r1)
                goto L22
            L52:
                boolean r0 = r8.isAccessible()
                if (r0 != 0) goto L64
                r0 = 1
                r8.setAccessible(r0)     // Catch: java.lang.SecurityException -> L5d
                return
            L5d:
                java.lang.String r0 = "Callback method is inaccessible, make sure the interface is public: "
                java.lang.IllegalArgumentException r0 = X.BV5.A0O(r8, r0)
                throw r0
            L64:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sun.jna.CallbackReference.DefaultCallbackProxy.<init>(com.sun.jna.CallbackReference, java.lang.reflect.Method, com.sun.jna.TypeMapper, java.lang.String):void");
        }

        private Object convertResult(Object obj) {
            ToNativeConverter toNativeConverter = this.toNative;
            if (toNativeConverter != null) {
                obj = toNativeConverter.toNative(obj, new CallbackResultContext(this.callbackMethod));
            }
            if (obj == null) {
                return null;
            }
            Class<?> cls = obj.getClass();
            if (BV6.A1X(cls)) {
                return !Structure.ByValue.class.isAssignableFrom(cls) ? ((Structure) obj).getPointer() : obj;
            }
            if (cls == Boolean.TYPE || cls == Boolean.class) {
                return Boolean.TRUE.equals(obj) ? Function.INTEGER_TRUE : Function.INTEGER_FALSE;
            }
            if (cls == String.class || cls == WString.class) {
                return CallbackReference.getNativeString(obj, AnonymousClass002.A1Z(cls, WString.class));
            }
            if (cls != String[].class && cls != WString[].class) {
                return Callback.class.isAssignableFrom(cls) ? CallbackReference.getFunctionPointer((Callback) obj, false) : obj;
            }
            StringArray stringArray = cls == String[].class ? new StringArray((Object[]) obj, this.encoding) : new StringArray((WString[]) obj);
            CallbackReference.allocations.put(obj, stringArray);
            return stringArray;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [com.sun.jna.Callback$UncaughtExceptionHandler] */
        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.reflect.Method] */
        /* JADX WARN: Type inference failed for: r1v0, types: [com.sun.jna.Callback$UncaughtExceptionHandler] */
        /* JADX WARN: Type inference failed for: r2v0, types: [com.sun.jna.Callback, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v1, types: [com.sun.jna.Callback] */
        /* JADX WARN: Type inference failed for: r2v2, types: [com.sun.jna.Callback] */
        /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
        private Object invokeCallback(Object[] objArr) {
            Object obj;
            Class<?>[] parameterTypes = this.callbackMethod.getParameterTypes();
            int length = objArr.length;
            Object[] objArr2 = new Object[length];
            for (int i = 0; i < length; i++) {
                Class<?> cls = parameterTypes[i];
                Object obj2 = objArr[i];
                FromNativeConverter[] fromNativeConverterArr = this.fromNative;
                objArr2[i] = fromNativeConverterArr[i] != null ? fromNativeConverterArr[i].fromNative(obj2, new CallbackParameterContext(cls, this.callbackMethod, objArr, i)) : convertArgument(obj2, cls);
            }
            ?? callback = getCallback();
            if (callback != 0) {
                try {
                    callback = convertResult(this.callbackMethod.invoke(callback, objArr2));
                    obj = callback;
                } catch (IllegalAccessException | IllegalArgumentException e) {
                    Native.callbackExceptionHandler.uncaughtException(callback, e);
                } catch (InvocationTargetException e2) {
                    Native.callbackExceptionHandler.uncaughtException(callback, e2.getTargetException());
                }
            } else {
                obj = null;
            }
            for (int i2 = 0; i2 < length; i2++) {
                Object obj3 = objArr2[i2];
                if ((obj3 instanceof Structure) && !(obj3 instanceof Structure.ByValue)) {
                    ((Structure) obj3).autoWrite();
                }
            }
            return obj;
        }

        public Callback getCallback() {
            CallbackReference callbackReference = CallbackReference.this;
            Class<?> cls = CallbackReference.DLL_CALLBACK_CLASS;
            return callbackReference.get();
        }

        @Override // com.sun.jna.CallbackProxy
        public Class<?>[] getParameterTypes() {
            return this.callbackMethod.getParameterTypes();
        }

        @Override // com.sun.jna.CallbackProxy
        public Class<?> getReturnType() {
            return this.callbackMethod.getReturnType();
        }

        @Override // com.sun.jna.CallbackProxy
        public Object callback(Object[] objArr) {
            try {
                return invokeCallback(objArr);
            } catch (Throwable th) {
                Native.callbackExceptionHandler.uncaughtException(getCallback(), th);
                return null;
            }
        }
    }

    public class NativeFunctionHandler implements InvocationHandler {
        public final Function function;
        public final Map<String, ?> options;

        public Pointer getPointer() {
            return this.function;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (Library.Handler.OBJECT_TOSTRING.equals(method)) {
                return FGI.A0d(C8j3.A14(this.function, C60O.A0x("Proxy interface to ")), " (", CallbackReference.findCallbackClass(((Executable) this.options.get(Function.OPTION_INVOKING_METHOD)).getDeclaringClass()).getName(), ")");
            }
            if (Library.Handler.OBJECT_HASHCODE.equals(method)) {
                return BV5.A0X(this);
            }
            if (!Library.Handler.OBJECT_EQUALS.equals(method)) {
                if (Function.IS_VARARGS.isVarArgs(method)) {
                    objArr = Function.concatenateVarArgs(objArr);
                }
                return this.function.invoke(method.getReturnType(), objArr, this.options);
            }
            Object obj2 = objArr[0];
            if (obj2 == null || !Proxy.isProxyClass(obj2.getClass())) {
                return Boolean.FALSE;
            }
            return Function.valueOf(Proxy.getInvocationHandler(obj2) == this);
        }

        public NativeFunctionHandler(Pointer pointer, int i, Map<String, ?> map) {
            this.options = map;
            this.function = new Function(pointer, i, C60O.A0p(Library.OPTION_STRING_ENCODING, map));
        }
    }

    public static Reference<Callback>[] addCallbackToArray(Callback callback, Reference<Callback>[] referenceArr) {
        int i = 0;
        int i2 = 1;
        if (referenceArr != null) {
            for (int i3 = 0; i3 < referenceArr.length; i3++) {
                if (referenceArr[i3].get() == null) {
                    referenceArr[i3] = null;
                } else {
                    i2++;
                }
            }
        }
        Reference<Callback>[] referenceArr2 = new Reference[i2];
        if (referenceArr != null) {
            int i4 = 0;
            while (i < referenceArr.length) {
                Reference<Callback> reference = referenceArr[i];
                if (reference != null) {
                    referenceArr2[i4] = reference;
                    i4++;
                }
                i++;
            }
            i = i4;
        }
        referenceArr2[i] = BV4.A0q(callback);
        return referenceArr2;
    }

    public static Pointer getFunctionPointer(Callback callback) {
        return getFunctionPointer(callback, false);
    }

    public final class CallbackReferenceDisposer implements Runnable {
        public Pointer cbstruct;

        @Override // java.lang.Runnable
        public synchronized void run() {
            Pointer pointer = this.cbstruct;
            if (pointer != null) {
                try {
                    Native.freeNativeCallback(pointer.peer);
                    CallbackReference.allocatedMemory.remove(Long.valueOf(this.cbstruct.peer));
                    this.cbstruct.peer = 0L;
                    this.cbstruct = null;
                } catch (Throwable th) {
                    CallbackReference.allocatedMemory.remove(Long.valueOf(this.cbstruct.peer));
                    this.cbstruct.peer = 0L;
                    this.cbstruct = null;
                    throw th;
                }
            }
        }

        public CallbackReferenceDisposer(Pointer pointer) {
            this.cbstruct = pointer;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CallbackReference(com.sun.jna.Callback r16, int r17, boolean r18) throws java.lang.NoSuchMethodException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.jna.CallbackReference.<init>(com.sun.jna.Callback, int, boolean):void");
    }

    public static Callback createCallback(Class<?> cls, Pointer pointer) {
        int i = AltCallingConvention.class.isAssignableFrom(cls) ? 63 : 0;
        HashMap mapA0w = BV4.A0w(Native.getLibraryOptions(cls));
        mapA0w.put(Function.OPTION_INVOKING_METHOD, getCallbackMethod(cls));
        return (Callback) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new NativeFunctionHandler(pointer, i, mapA0w));
    }

    public static void disposeAll() {
        Iterator it = new LinkedList(allocatedMemory.values()).iterator();
        while (it.hasNext()) {
            CallbackReference callbackReference = (CallbackReference) ((Reference) it.next()).get();
            if (callbackReference != null) {
                callbackReference.close();
            }
        }
    }

    public static Class<?> findCallbackClass(Class<?> cls) {
        if (!Callback.class.isAssignableFrom(cls)) {
            throw C60Q.A0U(cls.getName(), " is not derived from com.sun.jna.Callback");
        }
        if (!cls.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int i = 0;
            while (true) {
                if (i >= interfaces.length) {
                    break;
                }
                if (Callback.class.isAssignableFrom(interfaces[i])) {
                    try {
                        getCallbackMethod(interfaces[i]);
                        cls = interfaces[i];
                        return cls;
                    } catch (IllegalArgumentException unused) {
                        return Callback.class.isAssignableFrom(cls.getSuperclass()) ? findCallbackClass(cls.getSuperclass()) : cls;
                    }
                }
                i++;
            }
        } else {
            return cls;
        }
    }

    public static Pointer getNativeString(Object obj, boolean z) {
        if (obj == null) {
            return null;
        }
        NativeString nativeString = new NativeString(obj.toString(), z);
        allocations.put(obj, nativeString);
        return nativeString.pointer;
    }

    public static Callback getTypeAssignableCallback(Class<?> cls, Reference<Callback>[] referenceArr) {
        if (referenceArr == null) {
            return null;
        }
        for (Reference<Callback> reference : referenceArr) {
            Callback callback = reference.get();
            if (callback != null && BV6.A1Y(cls, callback)) {
                return callback;
            }
        }
        return null;
    }

    public static ThreadGroup initializeThread(Callback callback, AttachOptions attachOptions) {
        CallbackThreadInitializer callbackThreadInitializer;
        if (callback instanceof DefaultCallbackProxy) {
            callback = ((DefaultCallbackProxy) callback).getCallback();
        }
        Map<Callback, CallbackThreadInitializer> map = initializers;
        synchronized (map) {
            callbackThreadInitializer = map.get(callback);
        }
        if (callbackThreadInitializer == null) {
            return null;
        }
        ThreadGroup threadGroup = callbackThreadInitializer.group;
        attachOptions.name = callbackThreadInitializer.name;
        attachOptions.daemon = callbackThreadInitializer.daemon;
        attachOptions.detach = callbackThreadInitializer.detach;
        attachOptions.write();
        return threadGroup;
    }

    public static boolean isAllowableNativeType(Class<?> cls) {
        return cls == Void.TYPE || cls == Void.class || cls == Boolean.TYPE || cls == Boolean.class || cls == Byte.TYPE || cls == Byte.class || cls == Short.TYPE || cls == Short.class || cls == Character.TYPE || cls == Character.class || cls == Integer.TYPE || cls == Integer.class || cls == Long.TYPE || cls == Long.class || cls == Float.TYPE || cls == Float.class || cls == Double.TYPE || cls == Double.class || (Structure.ByValue.class.isAssignableFrom(cls) && BV6.A1X(cls)) || Pointer.class.isAssignableFrom(cls);
    }

    private void setCallbackOptions(int i) {
        this.cbstruct.setInt(Native.POINTER_SIZE, i);
    }

    public static CallbackThreadInitializer setCallbackThreadInitializer(Callback callback, CallbackThreadInitializer callbackThreadInitializer) {
        Map<Callback, CallbackThreadInitializer> map = initializers;
        synchronized (map) {
            if (callbackThreadInitializer != null) {
                return map.put(callback, callbackThreadInitializer);
            }
            return map.remove(callback);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Cleaner.Cleanable cleanable = this.cleanable;
        if (cleanable != null) {
            cleanable.clean();
        }
        this.cbstruct = null;
    }

    public Pointer getTrampoline() {
        Pointer pointer = this.trampoline;
        if (pointer != null) {
            return pointer;
        }
        Pointer pointer2 = this.cbstruct.getPointer(0L);
        this.trampoline = pointer2;
        return pointer2;
    }

    static {
        try {
            PROXY_CALLBACK_METHOD = CallbackProxy.class.getMethod(Callback.METHOD_NAME, Object[].class);
            if (Platform.isWindows()) {
                try {
                    DLL_CALLBACK_CLASS = Class.forName("com.sun.jna.win32.DLLCallback");
                } catch (ClassNotFoundException e) {
                    throw new Error("Error loading DLLCallback class", e);
                }
            }
            initializers = BV4.A11();
        } catch (Exception unused) {
            throw new Error("Error looking up CallbackProxy.callback() method");
        }
    }

    public static Method checkMethod(Method method) {
        if (method.getParameterTypes().length <= 256) {
            return method;
        }
        throw C8j3.A18(AnonymousClass007.A0a("Method signature exceeds the maximum parameter count: ", method));
    }

    private Callback getCallback() {
        return get();
    }

    public static Method getCallbackMethod(Class<?> cls) throws SecurityException {
        Method method;
        Method[] declaredMethods = cls.getDeclaredMethods();
        Method[] methods = cls.getMethods();
        HashSet hashSetA0v = BV5.A0v(declaredMethods);
        hashSetA0v.retainAll(Arrays.asList(methods));
        Iterator it = hashSetA0v.iterator();
        while (it.hasNext()) {
            if (Callback.FORBIDDEN_NAMES.contains(((Executable) it.next()).getName())) {
                it.remove();
            }
        }
        Method[] methodArr = (Method[]) hashSetA0v.toArray(new Method[0]);
        int length = methodArr.length;
        if (length != 1) {
            for (int i = 0; i < length; i++) {
                method = methodArr[i];
                if (!Callback.METHOD_NAME.equals(method.getName())) {
                }
            }
            throw C60O.A0i("Callback must implement a single public method, or one public method named 'callback'");
        }
        method = methodArr[0];
        checkMethod(method);
        return method;
    }

    public static Pointer getNativeFunctionPointer(Callback callback) throws IllegalArgumentException {
        if (!Proxy.isProxyClass(callback.getClass())) {
            return null;
        }
        InvocationHandler invocationHandler = Proxy.getInvocationHandler(callback);
        if (invocationHandler instanceof NativeFunctionHandler) {
            return ((NativeFunctionHandler) invocationHandler).function;
        }
        return null;
    }

    private Class<?> getNativeType(Class<?> cls) throws NoSuchMethodException, SecurityException {
        if (BV6.A1X(cls)) {
            Structure.validate(cls);
            if (Structure.ByValue.class.isAssignableFrom(cls)) {
                return cls;
            }
        } else {
            if (NativeMapped.class.isAssignableFrom(cls)) {
                return NativeMappedConverter.getInstance(cls).nativeType();
            }
            if (cls != String.class && cls != WString.class && cls != String[].class && cls != WString[].class && !Callback.class.isAssignableFrom(cls)) {
                return cls;
            }
        }
        return Pointer.class;
    }

    @Deprecated
    public void dispose() {
        close();
    }

    public static Callback getCallback(Class<?> cls, Pointer pointer, boolean z) {
        Map<Callback, CallbackReference> map;
        if (pointer == null) {
            return null;
        }
        if (cls.isInterface()) {
            if (z) {
                map = directCallbackMap;
            } else {
                map = callbackMap;
            }
            Map<Pointer, Reference<Callback>[]> map2 = pointerCallbackMap;
            synchronized (map2) {
                Reference<Callback>[] referenceArr = map2.get(pointer);
                Callback typeAssignableCallback = getTypeAssignableCallback(cls, referenceArr);
                if (typeAssignableCallback != null) {
                    return typeAssignableCallback;
                }
                Callback callbackCreateCallback = createCallback(cls, pointer);
                map2.put(pointer, addCallbackToArray(callbackCreateCallback, referenceArr));
                map.remove(callbackCreateCallback);
                return callbackCreateCallback;
            }
        }
        throw C60O.A0i("Callback type must be an interface");
    }

    public static Method getCallbackMethod(Callback callback) {
        return getCallbackMethod(findCallbackClass(callback.getClass()));
    }

    public static Pointer getFunctionPointer(Callback callback, boolean z) throws NoSuchFieldException, SecurityException, IllegalArgumentException {
        int iA0H;
        Map<Callback, CallbackReference> map;
        Pointer trampoline;
        if (callback == null) {
            return null;
        }
        Pointer nativeFunctionPointer = getNativeFunctionPointer(callback);
        if (nativeFunctionPointer == null) {
            Map<String, Object> libraryOptions = Native.getLibraryOptions(callback.getClass());
            if (callback instanceof AltCallingConvention) {
                iA0H = 63;
            } else if (libraryOptions.containsKey(Library.OPTION_CALLING_CONVENTION)) {
                iA0H = BV7.A0H(Library.OPTION_CALLING_CONVENTION, libraryOptions);
            } else {
                iA0H = 0;
            }
            if (z) {
                map = directCallbackMap;
            } else {
                map = callbackMap;
            }
            Map<Pointer, Reference<Callback>[]> map2 = pointerCallbackMap;
            synchronized (map2) {
                CallbackReference callbackReference = map.get(callback);
                if (callbackReference == null || callbackReference.cbstruct == null) {
                    callbackReference = new CallbackReference(callback, iA0H, z);
                    map.put(callback, callbackReference);
                    map2.put(callbackReference.getTrampoline(), addCallbackToArray(callback, null));
                    if (initializers.containsKey(callback)) {
                        callbackReference.setCallbackOptions(1);
                    }
                }
                trampoline = callbackReference.getTrampoline();
            }
            return trampoline;
        }
        return nativeFunctionPointer;
    }

    public static Callback getCallback(Class<?> cls, Pointer pointer) {
        return getCallback(cls, pointer, false);
    }
}

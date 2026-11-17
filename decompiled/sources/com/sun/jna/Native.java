package com.sun.jna;

import X.AbstractC7606F5t;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.BV4;
import X.BV5;
import X.BV6;
import X.BV7;
import X.C3cG;
import X.C3cH;
import X.C3cJ;
import X.C60O;
import X.C60Q;
import X.FGI;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import com.sun.jna.Callback;
import com.sun.jna.Library;
import com.sun.jna.Structure;
import java.awt.Component;
import java.awt.GraphicsEnvironment;
import java.awt.HeadlessException;
import java.awt.Window;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.ref.Reference;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class Native implements Version {
    public static final int BOOL_SIZE;
    public static final int CB_HAS_INITIALIZER = 1;
    public static final int CB_OPTION_DIRECT = 1;
    public static final int CB_OPTION_IN_DLL = 2;
    public static final int CVT_ARRAY_BOOLEAN = 13;
    public static final int CVT_ARRAY_BYTE = 6;
    public static final int CVT_ARRAY_CHAR = 8;
    public static final int CVT_ARRAY_DOUBLE = 12;
    public static final int CVT_ARRAY_FLOAT = 11;
    public static final int CVT_ARRAY_INT = 9;
    public static final int CVT_ARRAY_LONG = 10;
    public static final int CVT_ARRAY_SHORT = 7;
    public static final int CVT_BOOLEAN = 14;
    public static final int CVT_BUFFER = 5;
    public static final int CVT_BYTE = 29;
    public static final int CVT_CALLBACK = 15;
    public static final int CVT_DEFAULT = 0;
    public static final int CVT_FLOAT = 16;
    public static final int CVT_INTEGER_TYPE = 21;
    public static final int CVT_JNIENV = 27;
    public static final int CVT_NATIVE_MAPPED = 17;
    public static final int CVT_NATIVE_MAPPED_STRING = 18;
    public static final int CVT_NATIVE_MAPPED_WSTRING = 19;
    public static final int CVT_OBJECT = 26;
    public static final int CVT_POINTER = 1;
    public static final int CVT_POINTER_TYPE = 22;
    public static final int CVT_SHORT = 28;
    public static final int CVT_STRING = 2;
    public static final int CVT_STRUCTURE = 3;
    public static final int CVT_STRUCTURE_BYVAL = 4;
    public static final int CVT_TYPE_MAPPER = 23;
    public static final int CVT_TYPE_MAPPER_STRING = 24;
    public static final int CVT_TYPE_MAPPER_WSTRING = 25;
    public static final int CVT_UNSUPPORTED = -1;
    public static final int CVT_WSTRING = 20;
    public static final boolean DEBUG_JNA_LOAD;
    public static final Level DEBUG_JNA_LOAD_LEVEL;
    public static final boolean DEBUG_LOAD;
    public static final Charset DEFAULT_CHARSET;
    public static final String DEFAULT_ENCODING;
    public static final Callback.UncaughtExceptionHandler DEFAULT_HANDLER;
    public static final String JNA_TMPLIB_PREFIX = "jna";
    public static final Logger LOG = BV5.A1B(Native.class);
    public static final int LONG_DOUBLE_SIZE;
    public static final int LONG_SIZE;
    public static final int MAX_ALIGNMENT;
    public static final int MAX_PADDING;
    public static final int POINTER_SIZE;
    public static final int SIZE_T_SIZE;
    public static final int TYPE_BOOL = 4;
    public static final int TYPE_LONG = 1;
    public static final int TYPE_LONG_DOUBLE = 5;
    public static final int TYPE_SIZE_T = 3;
    public static final int TYPE_VOIDP = 0;
    public static final int TYPE_WCHAR_T = 2;
    public static final int WCHAR_SIZE;
    public static final String _OPTION_ENCLOSING_LIBRARY = "enclosing-library";
    public static final Method accessControllerDoPrivileged;
    public static Callback.UncaughtExceptionHandler callbackExceptionHandler;
    public static final Object finalizer;
    public static String jnidispatchPath;

    /* renamed from: libraries, reason: collision with root package name */
    public static final Map<Class<?>, Reference<?>> f316libraries;
    public static final ThreadLocal<Memory> nativeThreadTerminationFlag;
    public static final Map<Thread, Pointer> nativeThreads;
    public static final Map<Class<?>, long[]> registeredClasses;
    public static final Map<Class<?>, NativeLibrary> registeredLibraries;
    public static final Constructor securityManagerExposerConstructor;
    public static final Method securityManagerGetClassContext;
    public static final Object stackWalkerFilter;
    public static final Method stackWalkerGetInstance;
    public static final Enum stackWalkerRetainClassReference;
    public static final Method stackWalkerWalk;
    public static final Map<Class<?>, Map<String, Object>> typeOptions;

    public class Buffers {
        public static boolean isBuffer(Class<?> cls) {
            return Buffer.class.isAssignableFrom(cls);
        }
    }

    public interface ffi_callback {
        void invoke(long j, long j2, long j3);
    }

    public static native long _getDirectBufferPointer(Buffer buffer);

    public static native long _getPointer(long j);

    public static native void close(long j);

    public static native synchronized long createNativeCallback(Callback callback, Method method, Class<?>[] clsArr, Class<?> cls, int i, int i2, String str);

    public static File extractFromResourcePath(String str) {
        return extractFromResourcePath(str, null);
    }

    public static native void ffi_call(long j, long j2, long j3, long j4);

    public static native void ffi_free_closure(long j);

    public static native long ffi_prep_cif(int i, int i2, long j, long j2);

    public static native long ffi_prep_closure(long j, ffi_callback ffi_callbackVar);

    public static native long findSymbol(long j, String str);

    public static native void free(long j);

    public static native synchronized void freeNativeCallback(long j);

    public static native String getAPIChecksum();

    public static native byte getByte(Pointer pointer, long j, long j2);

    public static native char getChar(Pointer pointer, long j, long j2);

    public static native ByteBuffer getDirectByteBuffer(Pointer pointer, long j, long j2, long j3);

    public static native double getDouble(Pointer pointer, long j, long j2);

    public static native float getFloat(Pointer pointer, long j, long j2);

    public static native int getInt(Pointer pointer, long j, long j2);

    public static native int getLastError();

    public static native long getLong(Pointer pointer, long j, long j2);

    public static native String getNativeVersion();

    public static native short getShort(Pointer pointer, long j, long j2);

    public static native byte[] getStringBytes(Pointer pointer, long j, long j2);

    public static native String getWideString(Pointer pointer, long j, long j2);

    public static native long getWindowHandle0(Component component);

    public static native long indexOf(Pointer pointer, long j, long j2, byte b);

    public static native void initIDs();

    public static native int initialize_ffi_type(long j);

    public static native double invokeDouble(Function function, long j, int i, Object[] objArr);

    public static native float invokeFloat(Function function, long j, int i, Object[] objArr);

    public static native int invokeInt(Function function, long j, int i, Object[] objArr);

    public static native long invokeLong(Function function, long j, int i, Object[] objArr);

    public static native Object invokeObject(Function function, long j, int i, Object[] objArr);

    public static native long invokePointer(Function function, long j, int i, Object[] objArr);

    public static native void invokeStructure(Function function, long j, int i, Object[] objArr, long j2, long j3);

    public static native void invokeVoid(Function function, long j, int i, Object[] objArr);

    public static native synchronized boolean isProtected();

    public static <T extends Library> T load(Class<T> cls) {
        return (T) load(null, cls, Collections.EMPTY_MAP);
    }

    @Deprecated
    public static <T> T loadLibrary(Class<T> cls) {
        return (T) loadLibrary(null, cls, Collections.EMPTY_MAP);
    }

    public static Object lookupField(Class<?> cls, String str, Class<?> cls2) throws NoSuchFieldException, SecurityException {
        try {
            Field field = cls.getField(str);
            field.setAccessible(true);
            return field.get(null);
        } catch (NoSuchFieldException unused) {
            return null;
        } catch (Exception e) {
            StringBuilder sbA0g = C3cG.A0g(str);
            sbA0g.append(" must be a public field of type ");
            BV6.A18(cls2, sbA0g);
            sbA0g.append(" (");
            sbA0g.append(e);
            throw BV5.A0P(cls, "): ", sbA0g);
        }
    }

    public static native long malloc(long j);

    public static long open(String str) {
        return open(str, -1);
    }

    public static native long open(String str, int i);

    public static native void read(Pointer pointer, long j, long j2, byte[] bArr, int i, int i2);

    public static native void read(Pointer pointer, long j, long j2, char[] cArr, int i, int i2);

    public static native void read(Pointer pointer, long j, long j2, double[] dArr, int i, int i2);

    public static native void read(Pointer pointer, long j, long j2, float[] fArr, int i, int i2);

    public static native void read(Pointer pointer, long j, long j2, int[] iArr, int i, int i2);

    public static native void read(Pointer pointer, long j, long j2, long[] jArr, int i, int i2);

    public static native void read(Pointer pointer, long j, long j2, short[] sArr, int i, int i2);

    public static native long registerMethod(Class<?> cls, String str, String str2, int[] iArr, long[] jArr, long[] jArr2, int i, long j, long j2, Method method, long j3, int i2, boolean z, ToNativeConverter[] toNativeConverterArr, FromNativeConverter fromNativeConverter, String str3);

    public static native void setByte(Pointer pointer, long j, long j2, byte b);

    public static native void setChar(Pointer pointer, long j, long j2, char c);

    public static native void setDetachState(boolean z, long j);

    public static native void setDouble(Pointer pointer, long j, long j2, double d);

    public static native void setFloat(Pointer pointer, long j, long j2, float f);

    public static native void setInt(Pointer pointer, long j, long j2, int i);

    public static native void setLastError(int i);

    public static native void setLong(Pointer pointer, long j, long j2, long j3);

    public static native void setMemory(Pointer pointer, long j, long j2, long j3, byte b);

    public static native void setPointer(Pointer pointer, long j, long j2, long j3);

    public static native synchronized void setProtected(boolean z);

    public static native void setShort(Pointer pointer, long j, long j2, short s);

    public static native void setWideString(Pointer pointer, long j, long j2, String str);

    public static native int sizeof(int i);

    public static String toString(char[] cArr) {
        int length = cArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (cArr[i] == 0) {
                length = i;
                break;
            }
            i++;
        }
        return length == 0 ? "" : new String(cArr, 0, length);
    }

    public static List<String> toStringList(char[] cArr) {
        return toStringList(cArr, 0, cArr.length);
    }

    public static native void unregister(Class<?> cls, long[] jArr);

    public static native void write(Pointer pointer, long j, long j2, byte[] bArr, int i, int i2);

    public static native void write(Pointer pointer, long j, long j2, char[] cArr, int i, int i2);

    public static native void write(Pointer pointer, long j, long j2, double[] dArr, int i, int i2);

    public static native void write(Pointer pointer, long j, long j2, float[] fArr, int i, int i2);

    public static native void write(Pointer pointer, long j, long j2, int[] iArr, int i, int i2);

    public static native void write(Pointer pointer, long j, long j2, long[] jArr, int i, int i2);

    public static native void write(Pointer pointer, long j, long j2, short[] sArr, int i, int i2);

    public class AWT {
        /* JADX INFO: Thrown type has an unknown type hierarchy: java.awt.HeadlessException */
        public static long getComponentID(Object obj) throws HeadlessException {
            if (GraphicsEnvironment.isHeadless()) {
                throw new HeadlessException("No native windows when headless");
            }
            Component component = (Component) obj;
            if (component.isLightweight()) {
                throw C60O.A0i("Component must be heavyweight");
            }
            if (!component.isDisplayable()) {
                throw C3cG.A0Q("Component must be displayable");
            }
            if (Platform.isX11() && System.getProperty("java.version").startsWith("1.4") && !component.isVisible()) {
                throw C3cG.A0Q("Component must be visible");
            }
            return Native.getWindowHandle0(component);
        }

        public static long getWindowID(Window window) {
            return getComponentID(window);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0165  */
    static {
        /*
            Method dump skipped, instructions count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.jna.Native.<clinit>():void");
    }

    public static Class<?> findEnclosingLibraryClass(Class<?> cls) {
        Class<?> clsFindEnclosingLibraryClass;
        if (cls == null) {
            return null;
        }
        Map<String, Object> map = typeOptions.get(cls);
        if (map != null) {
            clsFindEnclosingLibraryClass = (Class) map.get(_OPTION_ENCLOSING_LIBRARY);
            if (clsFindEnclosingLibraryClass == null) {
                return cls;
            }
        } else {
            if (Library.class.isAssignableFrom(cls)) {
                return cls;
            }
            if (Callback.class.isAssignableFrom(cls)) {
                cls = CallbackReference.findCallbackClass(cls);
            }
            clsFindEnclosingLibraryClass = findEnclosingLibraryClass(cls.getDeclaringClass());
            if (clsFindEnclosingLibraryClass == null) {
                return findEnclosingLibraryClass(cls.getSuperclass());
            }
        }
        return clsFindEnclosingLibraryClass;
    }

    public static Callback.UncaughtExceptionHandler getCallbackExceptionHandler() {
        return callbackExceptionHandler;
    }

    public static Class<?> getCallingClass() {
        Method method = stackWalkerGetInstance;
        Class<?>[] clsArr = null;
        if (method != null) {
            try {
                return (Class) stackWalkerWalk.invoke(method.invoke(null, stackWalkerRetainClassReference), stackWalkerFilter);
            } catch (Throwable th) {
                LOG.log(Level.WARNING, "Failed to invoke StackWalker#getInstance or StackWalker#walk", th);
            }
        }
        Constructor constructor = securityManagerExposerConstructor;
        if (constructor == null) {
            throw C3cG.A0Q("Neither the StackWalker, nor the SecurityManager based getCallingClass implementation are useable; you must explicitly provide the class to register");
        }
        try {
            clsArr = (Class[]) securityManagerGetClassContext.invoke(constructor.newInstance(null), null);
        } catch (Throwable th2) {
            LOG.log(Level.WARNING, "Failed to invoke SecurityManagerExposer#<init> or SecurityManagerExposer#getClassContext", th2);
        }
        if (clsArr == null) {
            throw C3cG.A0Q("The SecurityManager implementation on this platform is broken; you must explicitly provide the class to register");
        }
        if (clsArr.length >= 4) {
            return clsArr[3];
        }
        throw C3cG.A0Q("This method must be called from the static initializer of a class");
    }

    public static Charset getCharset(String str) {
        Charset charsetForName;
        if (str != null) {
            try {
                charsetForName = Charset.forName(str);
            } catch (IllegalCharsetNameException | UnsupportedCharsetException e) {
                LOG.log(Level.WARNING, "JNA Warning: Encoding ''{0}'' is unsupported ({1})", new Object[]{str, e.getMessage()});
            }
        } else {
            charsetForName = null;
        }
        if (charsetForName != null) {
            return charsetForName;
        }
        Logger logger = LOG;
        Level level = Level.WARNING;
        Charset charset = DEFAULT_CHARSET;
        logger.log(level, "JNA Warning: Using fallback encoding {0}", charset);
        return charset;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int getConversion(java.lang.Class<?> r5, com.sun.jna.TypeMapper r6, boolean r7) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.jna.Native.getConversion(java.lang.Class, com.sun.jna.TypeMapper, boolean):int");
    }

    public static String getDefaultStringEncoding() {
        return System.getProperty("jna.encoding", DEFAULT_ENCODING);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008e A[PHI: r0
  0x008e: PHI (r0v5 java.util.Map<java.lang.String, java.lang.Object>) = (r0v4 java.util.Map<java.lang.String, java.lang.Object>), (r0v14 java.util.Map<java.lang.String, java.lang.Object>) binds: [B:8:0x0019, B:29:0x008c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map<java.lang.String, java.lang.Object> getLibraryOptions(java.lang.Class<?> r7) throws java.lang.NoSuchFieldException, java.lang.SecurityException {
        /*
            java.util.Map<java.lang.Class<?>, java.util.Map<java.lang.String, java.lang.Object>> r6 = com.sun.jna.Native.typeOptions
            java.lang.Object r0 = r6.get(r7)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L91
            java.lang.Class r3 = findEnclosingLibraryClass(r7)
            if (r3 == 0) goto L1d
            loadLibraryInstance(r3)
        L13:
            java.lang.Object r0 = r6.get(r3)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L8e
            r5 = 0
            goto L1f
        L1d:
            r3 = r7
            goto L13
        L1f:
            java.lang.String r0 = "OPTIONS"
            java.lang.reflect.Field r1 = r3.getField(r0)     // Catch: java.lang.Exception -> L38 java.lang.NoSuchFieldException -> L46
            r0 = 1
            r1.setAccessible(r0)     // Catch: java.lang.Exception -> L38 java.lang.NoSuchFieldException -> L46
            java.lang.Object r0 = r1.get(r5)     // Catch: java.lang.Exception -> L38 java.lang.NoSuchFieldException -> L46
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Exception -> L38 java.lang.NoSuchFieldException -> L46
            if (r0 != 0) goto L48
            java.lang.String r0 = "Null options field"
            java.lang.IllegalStateException r0 = X.C3cG.A0Q(r0)     // Catch: java.lang.Exception -> L38 java.lang.NoSuchFieldException -> L46
            throw r0     // Catch: java.lang.Exception -> L38 java.lang.NoSuchFieldException -> L46
        L38:
            r1 = move-exception
            java.lang.String r0 = "OPTIONS must be a public field of type java.util.Map ("
            java.lang.StringBuilder r1 = X.C3cG.A0f(r1, r0)
            java.lang.String r0 = "): "
            java.lang.IllegalArgumentException r0 = X.BV5.A0P(r3, r0, r1)
            throw r0
        L46:
            java.util.Map r0 = java.util.Collections.EMPTY_MAP
        L48:
            java.util.HashMap r4 = X.BV4.A0w(r0)
            java.lang.String r2 = "type-mapper"
            boolean r0 = r4.containsKey(r2)
            if (r0 != 0) goto L60
            java.lang.String r1 = "TYPE_MAPPER"
            java.lang.Class<com.sun.jna.TypeMapper> r0 = com.sun.jna.TypeMapper.class
            java.lang.Object r0 = lookupField(r3, r1, r0)
            r4.put(r2, r0)
        L60:
            java.lang.String r2 = "structure-alignment"
            boolean r0 = r4.containsKey(r2)
            if (r0 != 0) goto L74
            java.lang.String r1 = "STRUCTURE_ALIGNMENT"
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            java.lang.Object r0 = lookupField(r3, r1, r0)
            r4.put(r2, r0)
        L74:
            java.lang.String r2 = "string-encoding"
            boolean r0 = r4.containsKey(r2)
            if (r0 != 0) goto L88
            java.lang.String r1 = "STRING_ENCODING"
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.Object r0 = lookupField(r3, r1, r0)
            r4.put(r2, r0)
        L88:
            java.util.Map r0 = cacheOptions(r3, r4, r5)
            if (r7 == r3) goto L91
        L8e:
            r6.put(r7, r0)
        L91:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.jna.Native.getLibraryOptions(java.lang.Class):java.util.Map");
    }

    public static NativeLibrary getNativeLibrary(Library library) throws IllegalArgumentException {
        if (library == null) {
            throw C60O.A0i("null passed to getNativeLibrary");
        }
        if (!Proxy.isProxyClass(library.getClass())) {
            throw C60O.A0i("library object passed to getNativeLibrary in not a proxy");
        }
        InvocationHandler invocationHandler = Proxy.getInvocationHandler(library);
        if (invocationHandler instanceof Library.Handler) {
            return ((Library.Handler) invocationHandler).nativeLibrary;
        }
        throw C60O.A0i("Object is not a properly initialized Library interface instance");
    }

    public static int getNativeSize(Class<?> cls) {
        if (NativeMapped.class.isAssignableFrom(cls)) {
            cls = NativeMappedConverter.getInstance(cls).nativeType();
        }
        if (cls == Boolean.TYPE || cls == Boolean.class) {
            return 4;
        }
        if (cls == Byte.TYPE || cls == Byte.class) {
            return 1;
        }
        if (cls == Short.TYPE || cls == Short.class) {
            return 2;
        }
        if (cls == Character.TYPE || cls == Character.class) {
            return WCHAR_SIZE;
        }
        if (cls == Integer.TYPE || cls == Integer.class) {
            return 4;
        }
        if (cls != Long.TYPE && cls != Long.class) {
            if (cls == Float.TYPE || cls == Float.class) {
                return 4;
            }
            if (cls != Double.TYPE && cls != Double.class) {
                if (BV6.A1X(cls)) {
                    if (Structure.ByValue.class.isAssignableFrom(cls)) {
                        return Structure.size(cls, null);
                    }
                } else if (!Pointer.class.isAssignableFrom(cls) && ((!Platform.HAS_BUFFERS || !Buffer.class.isAssignableFrom(cls)) && !Callback.class.isAssignableFrom(cls) && String.class != cls && WString.class != cls)) {
                    throw C60Q.A0V("Native size for type \"", cls.getName(), "\" is unknown");
                }
                return POINTER_SIZE;
            }
        }
        return 8;
    }

    public static File getTempDir() throws IOException {
        File fileA0G;
        File fileA0O;
        String property = System.getProperty("jna.tmpdir");
        if (property != null) {
            fileA0G = BV4.A0G(property);
            fileA0G.mkdirs();
        } else {
            fileA0G = BV4.A0G(System.getProperty("java.io.tmpdir"));
            int i = Platform.osType;
            if (AnonymousClass002.A1M(i)) {
                fileA0O = new File(System.getProperty("user.home"), "Library/Caches/JNA/temp");
            } else if (BV7.A1Q(i) || AnonymousClass002.A1Q(i, 3) || AnonymousClass002.A1Q(i, 7) || Platform.isDragonFlyBSD() || AnonymousClass003.A17(i) || Platform.isNetBSD() || AnonymousClass002.A1Q(i, 5) || Platform.iskFreeBSD()) {
                String str = System.getenv("XDG_CACHE_HOME");
                fileA0O = C3cG.A0O((str == null || C60Q.A1V(str)) ? new File(System.getProperty("user.home"), ".cache") : BV4.A0G(str), "JNA/temp");
            } else {
                fileA0O = C3cG.A0O(fileA0G, FGI.A0H("jna-", System.getProperty("user.name").hashCode()));
            }
            fileA0O.mkdirs();
            if (fileA0O.exists() && fileA0O.canWrite()) {
                fileA0G = fileA0O;
            }
        }
        if (!fileA0G.exists()) {
            throw BV4.A0K(AnonymousClass001.A0v(AbstractC7606F5t.A00(13), C3cG.A0f(fileA0G, "JNA temporary directory '")));
        }
        if (fileA0G.canWrite()) {
            return fileA0G;
        }
        throw BV4.A0K(AnonymousClass001.A0v("' is not writable", C3cG.A0f(fileA0G, "JNA temporary directory '")));
    }

    public static Pointer getTerminationFlag(Thread thread) {
        return nativeThreads.get(thread);
    }

    public static String getWebStartLibraryPath(String str) {
        if (System.getProperty("javawebstart.version") == null) {
            return null;
        }
        try {
            String str2 = (String) ((Method) accessControllerDoPrivileged.invoke(null, new PrivilegedAction<Method>() { // from class: com.sun.jna.Native.5
                @Override // java.security.PrivilegedAction
                public Method run() throws NoSuchMethodException, SecurityException {
                    try {
                        Method declaredMethod = ClassLoader.class.getDeclaredMethod("findLibrary", String.class);
                        declaredMethod.setAccessible(true);
                        return declaredMethod;
                    } catch (Exception unused) {
                        return null;
                    }
                }
            })).invoke(Native.class.getClassLoader(), str);
            if (str2 != null) {
                return BV4.A0G(str2).getParent();
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static boolean isCompatibleVersion(String str, String str2) {
        String[] strArrSplit = str.split("\\.");
        String[] strArrSplit2 = str2.split("\\.");
        if (strArrSplit.length >= 3 && strArrSplit2.length >= 3) {
            int iA0F = BV6.A0F(strArrSplit, 0);
            int iA0F2 = BV6.A0F(strArrSplit2, 0);
            int iA0F3 = BV6.A0F(strArrSplit, 1);
            int iA0F4 = BV6.A0F(strArrSplit2, 1);
            if (iA0F == iA0F2 && iA0F3 <= iA0F4) {
                return true;
            }
        }
        return false;
    }

    public static void loadLibraryInstance(Class<?> cls) throws SecurityException {
        if (cls != null) {
            Map<Class<?>, Reference<?>> map = f316libraries;
            if (map.containsKey(cls)) {
                return;
            }
            try {
                for (Field field : cls.getFields()) {
                    if (field.getType() == cls && Modifier.isStatic(field.getModifiers())) {
                        field.setAccessible(true);
                        map.put(cls, BV4.A0q(field.get(null)));
                        return;
                    }
                }
            } catch (Exception e) {
                throw C60O.A0i(C3cJ.A0L(e, " (", C3cG.A0f(cls, "Could not access instance of ")));
            }
        }
    }

    public static void loadNativeDispatchLibrary() {
        if (!Boolean.getBoolean("jna.nounpack")) {
            try {
                removeTemporaryFiles();
            } catch (IOException e) {
                LOG.log(Level.WARNING, "JNA Warning: IOException removing temporary files", (Throwable) e);
            }
        }
        String property = System.getProperty("jna.boot.library.name", "jnidispatch");
        String property2 = System.getProperty("jna.boot.library.path");
        if (property2 != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(property2, File.pathSeparator);
            while (stringTokenizer.hasMoreTokens()) {
                File fileA0O = C3cG.A0O(BV4.A0G(stringTokenizer.nextToken()), System.mapLibraryName(property).replace(".dylib", ".jnilib"));
                String absolutePath = fileA0O.getAbsolutePath();
                Logger logger = LOG;
                Level level = DEBUG_JNA_LOAD_LEVEL;
                logger.log(level, "Looking in {0}", absolutePath);
                if (fileA0O.exists()) {
                    try {
                        logger.log(level, "Trying {0}", absolutePath);
                        System.setProperty("jnidispatch.path", absolutePath);
                        System.load(absolutePath);
                        jnidispatchPath = absolutePath;
                        logger.log(level, "Found jnidispatch at {0}", absolutePath);
                        return;
                    } catch (UnsatisfiedLinkError unused) {
                    }
                }
                if (AnonymousClass002.A1M(Platform.osType)) {
                    String str = "dylib";
                    String str2 = "jnilib";
                    if (!absolutePath.endsWith("dylib")) {
                        str2 = "dylib";
                        str = "jnilib";
                    }
                    String strA0M = FGI.A0M(absolutePath.substring(0, absolutePath.lastIndexOf(str)), str2);
                    logger.log(level, "Looking in {0}", strA0M);
                    if (BV5.A1V(strA0M)) {
                        try {
                            logger.log(level, "Trying {0}", strA0M);
                            System.setProperty("jnidispatch.path", strA0M);
                            System.load(strA0M);
                            jnidispatchPath = strA0M;
                            logger.log(level, "Found jnidispatch at {0}", strA0M);
                            return;
                        } catch (UnsatisfiedLinkError e2) {
                            logger.log(Level.WARNING, FGI.A0d("File found at ", strA0M, " but not loadable: ", e2.getMessage()), (Throwable) e2);
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        if (!Boolean.parseBoolean(System.getProperty("jna.nosys", "true")) || Platform.isAndroid()) {
            try {
                Logger logger2 = LOG;
                Level level2 = DEBUG_JNA_LOAD_LEVEL;
                logger2.log(level2, "Trying (via loadLibrary) {0}", property);
                System.loadLibrary(property);
                logger2.log(level2, "Found jnidispatch on system path");
                return;
            } catch (UnsatisfiedLinkError unused2) {
            }
        }
        if (Boolean.getBoolean("jna.noclasspath")) {
            throw new UnsatisfiedLinkError("Unable to locate JNA native support library");
        }
        loadNativeDispatchLibraryFromClasspath();
    }

    public static void loadNativeDispatchLibraryFromClasspath() {
        try {
            String strReplace = System.mapLibraryName("jnidispatch").replace(".dylib", ".jnilib");
            if (AnonymousClass002.A1Q(Platform.osType, 7)) {
                strReplace = "libjnidispatch.a";
            }
            File fileExtractFromResourcePath = extractFromResourcePath(FGI.A0d("/com/sun/jna/", Platform.RESOURCE_PREFIX, CustomConnectorRegisterRepositoryKt.ROOT_PATH, strReplace), Native.class.getClassLoader());
            if (fileExtractFromResourcePath == null) {
                throw new UnsatisfiedLinkError("Could not find JNA native support");
            }
            Logger logger = LOG;
            Level level = DEBUG_JNA_LOAD_LEVEL;
            logger.log(level, "Trying {0}", fileExtractFromResourcePath.getAbsolutePath());
            System.setProperty("jnidispatch.path", fileExtractFromResourcePath.getAbsolutePath());
            System.load(fileExtractFromResourcePath.getAbsolutePath());
            String absolutePath = fileExtractFromResourcePath.getAbsolutePath();
            jnidispatchPath = absolutePath;
            logger.log(level, "Found jnidispatch at {0}", absolutePath);
            if (!isUnpacked(fileExtractFromResourcePath) || Boolean.getBoolean("jnidispatch.preserve")) {
                return;
            }
            deleteLibrary(fileExtractFromResourcePath);
        } catch (IOException e) {
            throw new UnsatisfiedLinkError(e.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void main(java.lang.String[] r5) {
        /*
            java.lang.Class<com.sun.jna.Native> r0 = com.sun.jna.Native.class
            java.lang.Package r3 = r0.getPackage()
            java.lang.String r2 = "Java Native Access (JNA)"
            if (r3 == 0) goto L61
            java.lang.String r0 = r3.getSpecificationTitle()
            if (r0 != 0) goto L62
        L10:
            java.lang.String r1 = "5.19.1"
            if (r3 == 0) goto L5e
            java.lang.String r0 = r3.getSpecificationVersion()
            if (r0 != 0) goto L5f
        L1a:
            java.lang.String r0 = " API Version "
            java.lang.String r1 = X.FGI.A0U(r2, r0, r1)
            java.io.PrintStream r0 = java.lang.System.out
            r0.println(r1)
            java.lang.String r1 = "5.19.1 (package information missing)"
            if (r3 == 0) goto L5b
            java.lang.String r0 = r3.getImplementationVersion()
            if (r0 != 0) goto L5c
        L2f:
            java.io.PrintStream r5 = java.lang.System.out
            java.lang.String r0 = "Version: "
            java.lang.String r0 = X.FGI.A0M(r0, r1)
            r5.println(r0)
            java.lang.String r4 = " Native: "
            java.lang.String r3 = getNativeVersion()
            java.lang.String r2 = " ("
            java.lang.String r1 = getAPIChecksum()
            java.lang.String r0 = ")"
            java.lang.String r0 = X.FGI.A0h(r4, r3, r2, r1, r0)
            r5.println(r0)
            java.lang.String r1 = " Prefix: "
            java.lang.String r0 = com.sun.jna.Platform.RESOURCE_PREFIX
            java.lang.String r0 = X.FGI.A0M(r1, r0)
            r5.println(r0)
            return
        L5b:
            r0 = r1
        L5c:
            r1 = r0
            goto L2f
        L5e:
            r0 = r1
        L5f:
            r1 = r0
            goto L1a
        L61:
            r0 = r2
        L62:
            r2 = r0
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.jna.Native.main(java.lang.String[]):void");
    }

    public static boolean registered(Class<?> cls) {
        boolean zContainsKey;
        Map<Class<?>, long[]> map = registeredClasses;
        synchronized (map) {
            zContainsKey = map.containsKey(cls);
        }
        return zContainsKey;
    }

    public static void setCallbackExceptionHandler(Callback.UncaughtExceptionHandler uncaughtExceptionHandler) {
        if (uncaughtExceptionHandler == null) {
            uncaughtExceptionHandler = DEFAULT_HANDLER;
        }
        callbackExceptionHandler = uncaughtExceptionHandler;
    }

    public static Object toNative(ToNativeConverter toNativeConverter, Object obj) {
        return toNativeConverter.toNative(obj, new ToNativeContext());
    }

    public static void unregister(Class<?> cls) {
        Map<Class<?>, long[]> map = registeredClasses;
        synchronized (map) {
            long[] jArr = map.get(cls);
            if (jArr != null) {
                unregister(cls, jArr);
                map.remove(cls);
                registeredLibraries.remove(cls);
            }
        }
    }

    public static void unregisterAll() {
        Map<Class<?>, long[]> map = registeredClasses;
        synchronized (map) {
            Iterator itA0n = AnonymousClass002.A0n(map);
            while (itA0n.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(itA0n);
                unregister((Class) entryA0l.getKey(), (long[]) entryA0l.getValue());
            }
            map.clear();
        }
    }

    public static Map<String, Object> cacheOptions(Class<?> cls, Map<String, ?> map, Object obj) {
        HashMap mapA0w = BV4.A0w(map);
        mapA0w.put(_OPTION_ENCLOSING_LIBRARY, cls);
        typeOptions.put(cls, mapA0w);
        if (obj != null) {
            f316libraries.put(cls, BV4.A0q(obj));
        }
        if (!cls.isInterface() && Library.class.isAssignableFrom(cls)) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Class<?> cls2 = interfaces[i];
                if (Library.class.isAssignableFrom(cls2)) {
                    cacheOptions(cls2, mapA0w, obj);
                    break;
                }
                i++;
            }
        }
        return mapA0w;
    }

    public static boolean deleteLibrary(File file) throws IOException {
        if (file.delete()) {
            return true;
        }
        markTemporaryFile(file);
        return false;
    }

    public static void detach(boolean z) {
        boolean z2;
        long j;
        Thread threadCurrentThread = Thread.currentThread();
        Map<Thread, Pointer> map = nativeThreads;
        if (z) {
            map.remove(threadCurrentThread);
            nativeThreadTerminationFlag.get();
            z2 = true;
            j = 0;
        } else {
            if (map.containsKey(threadCurrentThread)) {
                return;
            }
            Memory memory = nativeThreadTerminationFlag.get();
            map.put(threadCurrentThread, memory);
            z2 = false;
            j = memory.peer;
        }
        setDetachState(z2, j);
    }

    public static void dispose() {
        CallbackReference.disposeAll();
        Memory.disposeAll();
        NativeLibrary.disposeAll();
        unregisterAll();
        jnidispatchPath = null;
        System.setProperty("jna.loaded", "false");
    }

    public static Class<?> findDirectMappedClass(Class<?> cls) throws SecurityException {
        for (Method method : cls.getDeclaredMethods()) {
            if ((method.getModifiers() & 256) != 0) {
                return cls;
            }
        }
        String name = cls.getName();
        int iLastIndexOf = name.lastIndexOf("$");
        if (iLastIndexOf != -1) {
            try {
                cls = findDirectMappedClass(Class.forName(name.substring(0, iLastIndexOf), true, cls.getClassLoader()));
                return cls;
            } catch (ClassNotFoundException unused) {
            }
        }
        throw C60O.A0i(C3cJ.A0M("Can't determine class with native methods from the current context (", cls));
    }

    public static NativeMapped fromNative(Method method, Object obj) {
        Class<?> returnType = method.getReturnType();
        return (NativeMapped) NativeMappedConverter.getInstance(returnType).fromNative(obj, new MethodResultContext(returnType, null, null, method));
    }

    public static byte[] getBytes(String str) {
        return str.getBytes(getCharset(getDefaultStringEncoding()));
    }

    public static long getComponentID(Component component) {
        return AWT.getComponentID(component);
    }

    public static Pointer getComponentPointer(Component component) {
        return new Pointer(AWT.getComponentID(component));
    }

    public static Pointer getDirectBufferPointer(Buffer buffer) {
        long j_getDirectBufferPointer = _getDirectBufferPointer(buffer);
        if (j_getDirectBufferPointer == 0) {
            return null;
        }
        return new Pointer(j_getDirectBufferPointer);
    }

    public static Pointer getPointer(long j) {
        long j_getPointer = _getPointer(j);
        if (j_getPointer == 0) {
            return null;
        }
        return new Pointer(j_getPointer);
    }

    public static String getSignature(Class<?> cls) {
        StringBuilder sbA0x;
        String signature;
        if (cls.isArray()) {
            sbA0x = C60O.A0x("[");
            signature = getSignature(cls.getComponentType());
        } else {
            if (cls.isPrimitive()) {
                if (cls == Void.TYPE) {
                    return "V";
                }
                if (cls == Boolean.TYPE) {
                    return "Z";
                }
                if (cls == Byte.TYPE) {
                    return "B";
                }
                if (cls == Short.TYPE) {
                    return "S";
                }
                if (cls == Character.TYPE) {
                    return "C";
                }
                if (cls == Integer.TYPE) {
                    return "I";
                }
                if (cls == Long.TYPE) {
                    return "J";
                }
                if (cls == Float.TYPE) {
                    return "F";
                }
                if (cls == Double.TYPE) {
                    return "D";
                }
            }
            sbA0x = C60O.A0x("L");
            sbA0x.append(replace(".", CustomConnectorRegisterRepositoryKt.ROOT_PATH, cls.getName()));
            signature = ";";
        }
        return AnonymousClass001.A0v(signature, sbA0x);
    }

    public static String getString(Pointer pointer, long j) {
        return getString(pointer, j, getDefaultStringEncoding());
    }

    public static String getStringEncoding(Class<?> cls) {
        String strA0p = C60O.A0p(Library.OPTION_STRING_ENCODING, getLibraryOptions(cls));
        return strA0p == null ? getDefaultStringEncoding() : strA0p;
    }

    public static int getStructureAlignment(Class<?> cls) {
        Number numberA0b = BV4.A0b(Library.OPTION_STRUCTURE_ALIGNMENT, getLibraryOptions(cls));
        if (numberA0b == null) {
            return 0;
        }
        return numberA0b.intValue();
    }

    public static TypeMapper getTypeMapper(Class<?> cls) {
        return (TypeMapper) getLibraryOptions(cls).get(Library.OPTION_TYPE_MAPPER);
    }

    public static long getWindowID(Window window) {
        return AWT.getComponentID(window);
    }

    public static Pointer getWindowPointer(Window window) {
        return new Pointer(AWT.getComponentID(window));
    }

    public static Structure invokeStructure(Function function, long j, int i, Object[] objArr, Structure structure) {
        invokeStructure(function, j, i, objArr, structure.getPointer().peer, structure.getTypeInfo().peer);
        return structure;
    }

    public static boolean isSupportedNativeType(Class<?> cls) {
        if (BV6.A1X(cls)) {
            return true;
        }
        return getNativeSize(cls) != 0;
    }

    public static boolean isUnpacked(File file) {
        return file.getName().startsWith(JNA_TMPLIB_PREFIX);
    }

    public static void markTemporaryFile(File file) throws IOException {
        try {
            BV5.A0L(file.getName(), ".x", file.getParentFile()).createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Class<?> nativeType(Class<?> cls) {
        return NativeMappedConverter.getInstance(cls).nativeType();
    }

    public static void register(NativeLibrary nativeLibrary) throws SecurityException {
        register(findDirectMappedClass(getCallingClass()), nativeLibrary);
    }

    public static void removeTemporaryFiles() {
        File[] fileArrListFiles = getTempDir().listFiles(new FilenameFilter() { // from class: com.sun.jna.Native.6
            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str) {
                return str.endsWith(".x") && str.startsWith(Native.JNA_TMPLIB_PREFIX);
            }
        });
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                File fileA0O = C3cG.A0O(file.getParentFile(), file.getName().substring(0, r1.length() - 2));
                if (!fileA0O.exists() || fileA0O.delete()) {
                    file.delete();
                }
            }
        }
    }

    public static String replace(String str, String str2, String str3) {
        StringBuilder sbA0w = C60O.A0w();
        while (true) {
            int iIndexOf = str3.indexOf(str);
            if (iIndexOf == -1) {
                return AnonymousClass001.A0v(str3, sbA0w);
            }
            sbA0w.append(BV4.A0j(str3, iIndexOf));
            sbA0w.append(str2);
            str3 = str3.substring(iIndexOf + str.length());
        }
    }

    public static Library synchronizedLibrary(final Library library) throws IllegalArgumentException {
        Class<?> cls = library.getClass();
        if (!Proxy.isProxyClass(cls)) {
            throw C60O.A0i("Library must be a proxy class");
        }
        InvocationHandler invocationHandler = Proxy.getInvocationHandler(library);
        if (!(invocationHandler instanceof Library.Handler)) {
            throw BV5.A0O(invocationHandler, "Unrecognized proxy handler: ");
        }
        final Library.Handler handler = (Library.Handler) invocationHandler;
        return (Library) Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), new InvocationHandler() { // from class: com.sun.jna.Native.4
            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj, Method method, Object[] objArr) {
                Object objInvoke;
                synchronized (handler.nativeLibrary) {
                    objInvoke = handler.invoke(library, method, objArr);
                }
                return objInvoke;
            }
        });
    }

    public static byte[] toByteArray(String str) {
        return toByteArray(str, getCharset(getDefaultStringEncoding()));
    }

    public static char[] toCharArray(String str) {
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        char[] cArr = new char[length + 1];
        System.arraycopy(charArray, 0, cArr, 0, length);
        return cArr;
    }

    public static void setCallbackThreadInitializer(Callback callback, CallbackThreadInitializer callbackThreadInitializer) {
        CallbackReference.setCallbackThreadInitializer(callback, callbackThreadInitializer);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.io.File extractFromResourcePath(java.lang.String r10, java.lang.ClassLoader r11) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.jna.Native.extractFromResourcePath(java.lang.String, java.lang.ClassLoader):java.io.File");
    }

    public static Object fromNative(FromNativeConverter fromNativeConverter, Object obj, Method method) {
        return fromNativeConverter.fromNative(obj, new MethodResultContext(method.getReturnType(), null, null, method));
    }

    public static byte[] getBytes(String str, String str2) {
        return str.getBytes(getCharset(str2));
    }

    public static NativeLibrary getNativeLibrary(Class<?> cls) throws SecurityException {
        NativeLibrary nativeLibrary;
        if (cls != null) {
            Class<?> clsFindDirectMappedClass = findDirectMappedClass(cls);
            synchronized (registeredClasses) {
                nativeLibrary = registeredLibraries.get(clsFindDirectMappedClass);
                if (nativeLibrary == null) {
                    throw C60Q.A0V("Class ", cls.getName(), " is not currently registered");
                }
            }
            return nativeLibrary;
        }
        throw C60O.A0i("null passed to getNativeLibrary");
    }

    public static int getNativeSize(Class<?> cls, Object obj) {
        if (cls.isArray()) {
            int length = Array.getLength(obj);
            if (length > 0) {
                return length * getNativeSize(cls.getComponentType(), Array.get(obj, 0));
            }
            throw BV5.A0O(cls, "Arrays of length zero not allowed: ");
        }
        if (BV6.A1X(cls) && !Structure.ByReference.class.isAssignableFrom(cls)) {
            return Structure.size(cls, (Structure) obj);
        }
        try {
            return getNativeSize(cls);
        } catch (IllegalArgumentException e) {
            throw C60O.A0i(FGI.A0d("The type \"", cls.getName(), "\" is not supported: ", e.getMessage()));
        }
    }

    public static String getString(Pointer pointer, long j, String str) {
        byte[] stringBytes = getStringBytes(pointer, pointer.peer, j);
        if (str != null) {
            try {
                return new String(stringBytes, str);
            } catch (UnsupportedEncodingException unused) {
            }
        }
        return new String(stringBytes);
    }

    public static <T extends Library> T load(String str, Class<T> cls, Map<String, ?> map) throws IllegalArgumentException {
        if (Library.class.isAssignableFrom(cls)) {
            Object objNewProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new Library.Handler(str, cls, map));
            cacheOptions(cls, map, objNewProxyInstance);
            return cls.cast(objNewProxyInstance);
        }
        throw C60O.A0i(FGI.A0h("Interface (", cls.getSimpleName(), ") of library=", str, " does not extend Library"));
    }

    @Deprecated
    public static <T> T loadLibrary(String str, Class<T> cls, Map<String, ?> map) throws IllegalArgumentException {
        if (Library.class.isAssignableFrom(cls)) {
            Object objNewProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new Library.Handler(str, cls, map));
            cacheOptions(cls, map, objNewProxyInstance);
            return cls.cast(objNewProxyInstance);
        }
        throw C60O.A0i(FGI.A0h("Interface (", cls.getSimpleName(), ") of library=", str, " does not extend Library"));
    }

    public static byte[] toByteArray(String str, Charset charset) {
        byte[] bytes = str.getBytes(charset);
        int length = bytes.length;
        byte[] bArr = new byte[length + 1];
        System.arraycopy(bytes, 0, bArr, 0, length);
        return bArr;
    }

    public static String toString(byte[] bArr, Charset charset) {
        int length = bArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (bArr[i] == 0) {
                length = i;
                break;
            }
            i++;
        }
        if (length == 0) {
            return "";
        }
        return BV4.A0n(charset, bArr, 0, length);
    }

    public static List<String> toStringList(char[] cArr, int i, int i2) {
        ArrayList arrayListA0h = C3cG.A0h();
        int i3 = i2 + i;
        int i4 = i;
        while (true) {
            if (i < i3) {
                if (cArr[i] == 0) {
                    if (i4 == i) {
                        break;
                    }
                    arrayListA0h.add(new String(cArr, i4, i - i4));
                    i4 = i + 1;
                }
                i++;
            } else if (i4 < i3) {
                arrayListA0h.add(new String(cArr, i4, i3 - i4));
            }
        }
        return arrayListA0h;
    }

    public static void unregister() {
        unregister(findDirectMappedClass(getCallingClass()));
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fc A[FALL_THROUGH, PHI: r11
  0x00fc: PHI (r11v2 java.lang.Class<?>) = (r11v3 java.lang.Class<?>), (r11v6 java.lang.Class<?>), (r11v0 java.lang.Class<?>) binds: [B:44:0x00cb, B:43:0x00c8, B:42:0x00c6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void register(java.lang.Class<?> r40, com.sun.jna.NativeLibrary r41) throws java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.jna.Native.register(java.lang.Class, com.sun.jna.NativeLibrary):void");
    }

    public static NativeMapped fromNative(Class<?> cls, Object obj) {
        return (NativeMapped) NativeMappedConverter.getInstance(cls).fromNative(obj, new FromNativeContext(cls));
    }

    public static byte[] getBytes(String str, Charset charset) {
        return str.getBytes(charset);
    }

    public static <T extends Library> T load(String str, Class<T> cls) {
        return (T) load(str, cls, Collections.EMPTY_MAP);
    }

    @Deprecated
    public static <T> T loadLibrary(String str, Class<T> cls) {
        return (T) loadLibrary(str, cls, Collections.EMPTY_MAP);
    }

    public static void register(Class<?> cls, String str) throws SecurityException {
        register(cls, NativeLibrary.getInstance(str, (Map<String, ?>) Collections.singletonMap(Library.OPTION_CLASSLOADER, cls.getClassLoader())));
    }

    public static byte[] toByteArray(String str, String str2) {
        return toByteArray(str, getCharset(str2));
    }

    public static String toString(byte[] bArr, String str) {
        return toString(bArr, getCharset(str));
    }

    public static <T extends Library> T load(Class<T> cls, Map<String, ?> map) {
        return (T) load(null, cls, map);
    }

    @Deprecated
    public static <T> T loadLibrary(Class<T> cls, Map<String, ?> map) {
        return (T) loadLibrary(null, cls, map);
    }

    public static void register(String str) throws SecurityException {
        register(findDirectMappedClass(getCallingClass()), str);
    }

    public static String toString(byte[] bArr) {
        return toString(bArr, getCharset(getDefaultStringEncoding()));
    }
}

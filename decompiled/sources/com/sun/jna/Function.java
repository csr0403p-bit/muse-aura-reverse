package com.sun.jna;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.BV4;
import X.BV5;
import X.BV6;
import X.C3cG;
import X.C60O;
import X.C8j3;
import X.FGI;
import com.sun.jna.Structure;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes5.dex */
public class Function extends Pointer {
    public static final int ALT_CONVENTION = 63;
    public static final int C_CONVENTION = 0;
    public static final int MASK_CC = 63;
    public static final int MAX_NARGS = 256;
    public static final String OPTION_INVOKING_METHOD = "invoking-method";
    public static final int THROW_LAST_ERROR = 64;
    public static final int USE_VARARGS = 255;
    public static final int USE_VARARGS_SHIFT = 7;
    public final int callFlags;
    public final String encoding;
    public final String functionName;
    public NativeLibrary library;
    public final Map<String, ?> options;
    public static final Integer INTEGER_TRUE = -1;
    public static final Integer INTEGER_FALSE = BV4.A0V();
    public static final VarArgsChecker IS_VARARGS = VarArgsChecker.create();

    public class NativeMappedArray extends Memory implements PostCallRead {
        public final NativeMapped[] original;

        @Override // com.sun.jna.Function.PostCallRead
        public void read() {
            NativeMapped[] nativeMappedArr = this.original;
            getValue(0L, nativeMappedArr.getClass(), nativeMappedArr);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public NativeMappedArray(NativeMapped[] nativeMappedArr) {
            Class<?> cls = nativeMappedArr.getClass();
            super(Native.getNativeSize(cls, nativeMappedArr));
            this.original = nativeMappedArr;
            setValue(0L, nativeMappedArr, cls);
        }
    }

    public class PointerArray extends Memory implements PostCallRead {
        public final Pointer[] original;

        @Override // com.sun.jna.Function.PostCallRead
        public void read() {
            Pointer[] pointerArr = this.original;
            read(0L, pointerArr, 0, pointerArr.length);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public PointerArray(Pointer[] pointerArr) {
            int i = Native.POINTER_SIZE;
            int length = pointerArr.length;
            super((length + 1) * i);
            this.original = pointerArr;
            for (int i2 = 0; i2 < length; i2++) {
                setPointer(i * i2, pointerArr[i2]);
            }
            setPointer(i * length, null);
        }
    }

    public interface PostCallRead {
        void read();
    }

    public static Function getFunction(Pointer pointer) {
        return new Function(pointer, 0, null);
    }

    @Override // com.sun.jna.Pointer
    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj != null && obj.getClass() == getClass()) {
                Function function = (Function) obj;
                if (function.callFlags != this.callFlags || !function.options.equals(this.options) || function.peer != this.peer) {
                }
            }
            return false;
        }
        return true;
    }

    private void checkCallingConvention(int i) {
        if ((i & 63) != i) {
            throw BV5.A0Q("Unrecognized calling convention: ", i);
        }
    }

    public static Object[] concatenateVarArgs(Object[] objArr) {
        int length;
        int i;
        Object obj;
        if (objArr == null || (length = objArr.length) <= 0 || (obj = objArr[length - 1]) == null || !obj.getClass().isArray()) {
            return objArr;
        }
        Object[] objArr2 = (Object[]) obj;
        int i2 = 0;
        while (true) {
            int length2 = objArr2.length;
            if (i2 >= length2) {
                int i3 = length + length2;
                Object[] objArr3 = new Object[i3];
                System.arraycopy(objArr, 0, objArr3, 0, i);
                System.arraycopy(objArr2, 0, objArr3, i, length2);
                objArr3[i3 - 1] = null;
                return objArr3;
            }
            if (objArr2[i2] instanceof Float) {
                objArr2[i2] = Double.valueOf(AnonymousClass001.A02(r1));
            }
            i2++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0063, code lost:
    
        if (com.sun.jna.Structure.ByValue.class.isAssignableFrom(r3) != false) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0024 A[PHI: r2
  0x0024: PHI (r2v2 java.lang.Object) = (r2v0 java.lang.Object), (r2v0 java.lang.Object), (r2v13 java.lang.Object) binds: [B:87:0x0139, B:7:0x0015, B:11:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.Object convertArgument(java.lang.Object[] r8, int r9, java.lang.reflect.Method r10, com.sun.jna.TypeMapper r11, boolean r12, java.lang.Class<?> r13) {
        /*
            Method dump skipped, instructions count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.jna.Function.convertArgument(java.lang.Object[], int, java.lang.reflect.Method, com.sun.jna.TypeMapper, boolean, java.lang.Class):java.lang.Object");
    }

    public static int fixedArgs(Method method) {
        return IS_VARARGS.fixedArgs(method);
    }

    public static boolean isVarArgs(Method method) {
        return IS_VARARGS.isVarArgs(method);
    }

    public static Boolean valueOf(boolean z) {
        return z ? Boolean.TRUE : Boolean.FALSE;
    }

    public int getCallingConvention() {
        return this.callFlags & 63;
    }

    public String getName() {
        return this.functionName;
    }

    @Override // com.sun.jna.Pointer
    public int hashCode() {
        return this.callFlags + this.options.hashCode() + super.hashCode();
    }

    public void invoke(Object[] objArr) {
        invoke(Void.class, objArr);
    }

    public double invokeDouble(Object[] objArr) {
        return BV6.A00(invoke(Double.class, objArr));
    }

    public float invokeFloat(Object[] objArr) {
        return AnonymousClass001.A02(invoke(Float.class, objArr));
    }

    public int invokeInt(Object[] objArr) {
        return AnonymousClass001.A0F(invoke(Integer.class, objArr));
    }

    public long invokeLong(Object[] objArr) {
        return C3cG.A05(invoke(Long.class, objArr));
    }

    public Object invokeObject(Object[] objArr) {
        return invoke(Object.class, objArr);
    }

    public Pointer invokePointer(Object[] objArr) {
        return (Pointer) invoke(Pointer.class, objArr);
    }

    public String invokeString(Object[] objArr, boolean z) {
        Object objInvoke = invoke(z ? WString.class : String.class, objArr);
        if (objInvoke != null) {
            return objInvoke.toString();
        }
        return null;
    }

    public void invokeVoid(Object[] objArr) {
        invoke(Void.class, objArr);
    }

    @Override // com.sun.jna.Pointer
    public String toString() {
        StringBuilder sbA0x;
        NativeLibrary nativeLibrary = this.library;
        if (nativeLibrary != null) {
            sbA0x = C60O.A0x("native function ");
            sbA0x.append(this.functionName);
            sbA0x.append("(");
            sbA0x.append(nativeLibrary.libraryName);
            sbA0x.append(")@0x");
        } else {
            sbA0x = C60O.A0x("native function@0x");
        }
        return AnonymousClass001.A0v(Long.toHexString(this.peer), sbA0x);
    }

    public Function(NativeLibrary nativeLibrary, String str, int i, String str2) {
        checkCallingConvention(i & 63);
        if (str == null) {
            throw BV4.A0a("Function name must not be null");
        }
        this.library = nativeLibrary;
        this.functionName = str;
        this.callFlags = i;
        this.options = nativeLibrary.options;
        this.encoding = str2 == null ? Native.getDefaultStringEncoding() : str2;
        try {
            this.peer = nativeLibrary.getSymbolAddress(str);
        } catch (UnsatisfiedLinkError e) {
            throw new UnsatisfiedLinkError(FGI.A0d("Error looking up function '", str, "': ", e.getMessage()));
        }
    }

    private boolean isPrimitiveArray(Class<?> cls) {
        return cls.isArray() && cls.getComponentType().isPrimitive();
    }

    public Function(Pointer pointer, int i, String str) {
        checkCallingConvention(i & 63);
        if (pointer != null && pointer.peer != 0) {
            this.functionName = pointer.toString();
            this.callFlags = i;
            this.peer = pointer.peer;
            this.options = Collections.EMPTY_MAP;
            this.encoding = str == null ? Native.getDefaultStringEncoding() : str;
            return;
        }
        throw BV4.A0a("Function address may not be null");
    }

    public static Function getFunction(String str, String str2, int i) {
        return NativeLibrary.getInstance(str, (Map<String, ?>) Collections.EMPTY_MAP).getFunction(str2, i, null);
    }

    private Pointer invokePointer(int i, Object[] objArr) {
        long jInvokePointer = Native.invokePointer(this, this.peer, i, objArr);
        if (jInvokePointer == 0) {
            return null;
        }
        return new Pointer(jInvokePointer);
    }

    private String invokeString(int i, Object[] objArr, boolean z) {
        Pointer pointerInvokePointer = invokePointer(i, objArr);
        if (pointerInvokePointer != null) {
            if (z) {
                return pointerInvokePointer.getWideString(0L);
            }
            return pointerInvokePointer.getString(0L, this.encoding);
        }
        return null;
    }

    public Object invoke(Class<?> cls, Object[] objArr, Map<String, ?> map) {
        Class<?>[] parameterTypes;
        Method method = (Method) map.get(OPTION_INVOKING_METHOD);
        if (method != null) {
            parameterTypes = method.getParameterTypes();
        } else {
            parameterTypes = null;
        }
        return invoke(method, parameterTypes, cls, objArr, map);
    }

    public static Function getFunction(String str, String str2, int i, String str3) {
        return NativeLibrary.getInstance(str, (Map<String, ?>) Collections.EMPTY_MAP).getFunction(str2, i, str3);
    }

    public Object invoke(Object[] objArr, Class<?> cls, boolean z, int i) {
        int i2 = this.callFlags | ((i & 255) << 7);
        Object objInvokeObject = null;
        if (cls == null || cls == Void.TYPE || cls == Void.class) {
            Native.invokeVoid(this, this.peer, i2, objArr);
            return null;
        }
        if (cls == Boolean.TYPE || cls == Boolean.class) {
            return valueOf(Native.invokeInt(this, this.peer, i2, objArr) != 0);
        }
        if (cls == Byte.TYPE || cls == Byte.class) {
            return Byte.valueOf((byte) Native.invokeInt(this, this.peer, i2, objArr));
        }
        if (cls == Short.TYPE || cls == Short.class) {
            return Short.valueOf((short) Native.invokeInt(this, this.peer, i2, objArr));
        }
        if (cls == Character.TYPE || cls == Character.class) {
            return Character.valueOf((char) Native.invokeInt(this, this.peer, i2, objArr));
        }
        if (cls == Integer.TYPE || cls == Integer.class) {
            return Integer.valueOf(Native.invokeInt(this, this.peer, i2, objArr));
        }
        if (cls == Long.TYPE || cls == Long.class) {
            return Long.valueOf(Native.invokeLong(this, this.peer, i2, objArr));
        }
        if (cls == Float.TYPE || cls == Float.class) {
            return Float.valueOf(Native.invokeFloat(this, this.peer, i2, objArr));
        }
        if (cls == Double.TYPE || cls == Double.class) {
            return Double.valueOf(Native.invokeDouble(this, this.peer, i2, objArr));
        }
        if (cls == String.class) {
            return invokeString(i2, objArr, false);
        }
        if (cls == WString.class) {
            String strInvokeString = invokeString(i2, objArr, true);
            if (strInvokeString != null) {
                return new WString(strInvokeString);
            }
        } else {
            if (Pointer.class.isAssignableFrom(cls)) {
                return invokePointer(i2, objArr);
            }
            if (BV6.A1X(cls)) {
                if (Structure.ByValue.class.isAssignableFrom(cls)) {
                    long j = this.peer;
                    Structure structureNewInstance = Structure.newInstance(cls);
                    Native.invokeStructure(this, j, i2, objArr, structureNewInstance);
                    structureNewInstance.autoRead();
                    return structureNewInstance;
                }
                Pointer pointerInvokePointer = invokePointer(i2, objArr);
                if (pointerInvokePointer == null) {
                    return pointerInvokePointer;
                }
                Structure structureNewInstance2 = Structure.newInstance((Class<Structure>) cls, pointerInvokePointer);
                structureNewInstance2.conditionalAutoRead();
                return structureNewInstance2;
            }
            if (Callback.class.isAssignableFrom(cls)) {
                Pointer pointerInvokePointer2 = invokePointer(i2, objArr);
                if (pointerInvokePointer2 != null) {
                    return CallbackReference.getCallback(cls, pointerInvokePointer2, false);
                }
                return pointerInvokePointer2;
            }
            if (cls == String[].class) {
                Pointer pointerInvokePointer3 = invokePointer(i2, objArr);
                if (pointerInvokePointer3 != null) {
                    return pointerInvokePointer3.getStringArray(0L, -1, this.encoding);
                }
            } else if (cls == WString[].class) {
                Pointer pointerInvokePointer4 = invokePointer(i2, objArr);
                if (pointerInvokePointer4 != null) {
                    String[] wideStringArray = pointerInvokePointer4.getWideStringArray(0L, -1);
                    int length = wideStringArray.length;
                    WString[] wStringArr = new WString[length];
                    for (int i3 = 0; i3 < length; i3++) {
                        wStringArr[i3] = new WString(wideStringArray[i3]);
                    }
                    return wStringArr;
                }
            } else if (cls == Pointer[].class) {
                Pointer pointerInvokePointer5 = invokePointer(i2, objArr);
                if (pointerInvokePointer5 != null) {
                    return pointerInvokePointer5.getPointerArray(0L);
                }
            } else if (z) {
                objInvokeObject = Native.invokeObject(this, this.peer, i2, objArr);
                if (objInvokeObject != null) {
                    Class<?> cls2 = objInvokeObject.getClass();
                    if (!cls.isAssignableFrom(cls2)) {
                        throw new ClassCastException(AnonymousClass006.A0y(cls2, " does not match result ", C3cG.A0f(cls, "Return type ")));
                    }
                }
            } else {
                StringBuilder sbA0f = C3cG.A0f(cls, "Unsupported return type ");
                sbA0f.append(" in function ");
                throw C8j3.A0w(this.functionName, sbA0f);
            }
        }
        return objInvokeObject;
    }

    public static Function getFunction(Pointer pointer, int i, String str) {
        return new Function(pointer, i, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0100 A[PHI: r14
  0x0100: PHI (r14v1 com.sun.jna.FromNativeConverter) = (r14v0 com.sun.jna.FromNativeConverter), (r14v12 com.sun.jna.FromNativeConverter) binds: [B:62:0x00f2, B:64:0x00f8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0065 A[EDGE_INSN: B:70:0x0065->B:28:0x0065 BREAK  A[LOOP:0: B:13:0x003c->B:21:0x0051], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(java.lang.reflect.Method r16, java.lang.Class<?>[] r17, java.lang.Class<?> r18, java.lang.Object[] r19, java.util.Map<java.lang.String, ?> r20) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.jna.Function.invoke(java.lang.reflect.Method, java.lang.Class[], java.lang.Class, java.lang.Object[], java.util.Map):java.lang.Object");
    }

    public static Function getFunction(Pointer pointer, int i) {
        return new Function(pointer, i, null);
    }

    public Object invoke(Object[] objArr, Class<?> cls, boolean z) {
        return invoke(objArr, cls, z, 0);
    }

    public static Function getFunction(String str, String str2) {
        NativeLibrary nativeLibrary = NativeLibrary.getInstance(str, (Map<String, ?>) Collections.EMPTY_MAP);
        return nativeLibrary.getFunction(str2, nativeLibrary.callFlags);
    }

    public Object invoke(Class<?> cls, Object[] objArr) {
        return invoke(cls, objArr, this.options);
    }
}

package com.sun.jna.win32;

import X.BV5;
import X.FGI;
import com.sun.jna.FunctionMapper;
import com.sun.jna.Native;
import com.sun.jna.NativeLibrary;
import com.sun.jna.NativeMapped;
import com.sun.jna.NativeMappedConverter;
import java.lang.reflect.Method;

/* loaded from: classes5.dex */
public class StdCallFunctionMapper implements FunctionMapper {
    public int getArgumentNativeStackSize(Class<?> cls) {
        if (NativeMapped.class.isAssignableFrom(cls)) {
            cls = NativeMappedConverter.getInstance(cls).nativeType();
        }
        if (cls.isArray()) {
            return Native.POINTER_SIZE;
        }
        try {
            return Native.getNativeSize(cls);
        } catch (IllegalArgumentException unused) {
            throw BV5.A0O(cls, "Unknown native stack allocation size for ");
        }
    }

    @Override // com.sun.jna.FunctionMapper
    public String getFunctionName(NativeLibrary nativeLibrary, Method method) {
        String name = method.getName();
        int argumentNativeStackSize = 0;
        for (Class<?> cls : method.getParameterTypes()) {
            argumentNativeStackSize += getArgumentNativeStackSize(cls);
        }
        String strA0S = FGI.A0S(name, "@", argumentNativeStackSize);
        try {
            try {
                return nativeLibrary.getFunction(strA0S, 63).functionName;
            } catch (UnsatisfiedLinkError unused) {
                return name;
            }
        } catch (UnsatisfiedLinkError unused2) {
            return nativeLibrary.getFunction(FGI.A0M("_", strA0S), 63).functionName;
        }
    }
}

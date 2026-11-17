package com.sun.jna.win32;

import X.FGI;
import com.sun.jna.FunctionMapper;
import com.sun.jna.NativeLibrary;
import java.lang.reflect.Method;

/* loaded from: classes5.dex */
public class W32APIFunctionMapper implements FunctionMapper {
    public final String suffix;
    public static final FunctionMapper UNICODE = new W32APIFunctionMapper(true);
    public static final FunctionMapper ASCII = new W32APIFunctionMapper(false);

    public W32APIFunctionMapper(boolean z) {
        this.suffix = z ? "W" : "A";
    }

    @Override // com.sun.jna.FunctionMapper
    public String getFunctionName(NativeLibrary nativeLibrary, Method method) {
        String name = method.getName();
        if (!name.endsWith("W") && !name.endsWith("A")) {
            try {
                return nativeLibrary.getFunction(FGI.A0M(name, this.suffix), 63).functionName;
            } catch (UnsatisfiedLinkError unused) {
            }
        }
        return name;
    }
}

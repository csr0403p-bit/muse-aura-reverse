package com.sun.jna;

import java.lang.reflect.Method;

/* loaded from: classes5.dex */
public abstract class VarArgsChecker {
    public static VarArgsChecker create() {
        try {
            return Method.class.getMethod("isVarArgs", null) != null ? new RealVarArgsChecker() : new NoVarArgsChecker();
        } catch (NoSuchMethodException | SecurityException unused) {
            return new NoVarArgsChecker();
        }
    }

    public abstract int fixedArgs(Method method);

    public abstract boolean isVarArgs(Method method);

    public final class NoVarArgsChecker extends VarArgsChecker {
        public /* synthetic */ NoVarArgsChecker(AnonymousClass1 anonymousClass1) {
        }

        @Override // com.sun.jna.VarArgsChecker
        public int fixedArgs(Method method) {
            return 0;
        }

        @Override // com.sun.jna.VarArgsChecker
        public boolean isVarArgs(Method method) {
            return false;
        }

        public NoVarArgsChecker() {
        }
    }

    public final class RealVarArgsChecker extends VarArgsChecker {
        public /* synthetic */ RealVarArgsChecker(AnonymousClass1 anonymousClass1) {
        }

        @Override // com.sun.jna.VarArgsChecker
        public int fixedArgs(Method method) {
            if (method.isVarArgs()) {
                return method.getParameterTypes().length - 1;
            }
            return 0;
        }

        @Override // com.sun.jna.VarArgsChecker
        public boolean isVarArgs(Method method) {
            return method.isVarArgs();
        }

        public RealVarArgsChecker() {
        }
    }

    public /* synthetic */ VarArgsChecker(AnonymousClass1 anonymousClass1) {
    }

    public VarArgsChecker() {
    }
}

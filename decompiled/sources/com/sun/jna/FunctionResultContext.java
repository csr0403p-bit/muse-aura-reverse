package com.sun.jna;

/* loaded from: classes5.dex */
public class FunctionResultContext extends FromNativeContext {
    public Object[] args;
    public Function function;

    public Object[] getArguments() {
        return this.args;
    }

    public Function getFunction() {
        return this.function;
    }

    public FunctionResultContext(Class<?> cls, Function function, Object[] objArr) {
        super(cls);
        this.function = function;
        this.args = objArr;
    }
}

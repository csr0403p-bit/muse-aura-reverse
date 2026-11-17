package com.fasterxml.jackson.databind.deser.std;

import X.EnumC10000GnW;

/* loaded from: classes6.dex */
public abstract class NumberDeserializers$PrimitiveOrWrapperDeserializer<T> extends StdScalarDeserializer<T> {
    public static final long serialVersionUID = 1;
    public final T _emptyValue;
    public final EnumC10000GnW _logicalType;
    public final T _nullValue;
    public final boolean _primitive;

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/Class<TT;>;LX/GnW;TT;TT;)V */
    /* JADX WARN: Multi-variable type inference failed */
    public NumberDeserializers$PrimitiveOrWrapperDeserializer(EnumC10000GnW enumC10000GnW, Class cls, Object obj, Object obj2) {
        super(cls);
        this._logicalType = enumC10000GnW;
        this._nullValue = obj;
        this._emptyValue = obj2;
        this._primitive = cls.isPrimitive();
    }
}

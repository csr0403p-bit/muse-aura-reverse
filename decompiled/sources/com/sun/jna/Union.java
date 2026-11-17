package com.sun.jna;

import X.F60;
import com.sun.jna.Structure;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class Union extends Structure {
    public Structure.StructField activeField;

    public abstract Object getTypedValue(Class<?> cls);

    public abstract void setType(Class<?> cls);

    public abstract void setType(String str);

    public abstract Object setTypedValue(Object obj);

    public Union(Pointer pointer) {
        throw F60.createAndThrow();
    }

    private Structure.StructField findField(Class<?> cls) {
        throw F60.createAndThrow();
    }

    @Override // com.sun.jna.Structure
    public List<String> getFieldOrder() {
        throw F60.createAndThrow();
    }

    @Override // com.sun.jna.Structure
    public int getNativeAlignment(Class<?> cls, Object obj, boolean z) {
        throw F60.createAndThrow();
    }

    @Override // com.sun.jna.Structure
    public Object readField(Structure.StructField structField) {
        throw F60.createAndThrow();
    }

    @Override // com.sun.jna.Structure
    public void writeField(Structure.StructField structField) {
        throw F60.createAndThrow();
    }

    public Union(Pointer pointer, int i, TypeMapper typeMapper) {
        throw F60.createAndThrow();
    }

    @Override // com.sun.jna.Structure
    public Object readField(String str) {
        throw F60.createAndThrow();
    }

    @Override // com.sun.jna.Structure
    public void writeField(String str, Object obj) {
        throw F60.createAndThrow();
    }

    public Union(Pointer pointer, int i) {
        throw F60.createAndThrow();
    }

    @Override // com.sun.jna.Structure
    public void writeField(String str) {
        throw F60.createAndThrow();
    }

    public Union(TypeMapper typeMapper) {
        throw F60.createAndThrow();
    }

    public Union() {
        throw F60.createAndThrow();
    }
}

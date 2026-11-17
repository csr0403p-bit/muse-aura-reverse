package com.sun.jna;

import X.BV4;
import X.BV5;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.Map;

/* loaded from: classes5.dex */
public class NativeMappedConverter implements TypeConverter {
    public static final Map<Class<?>, Reference<NativeMappedConverter>> converters = BV4.A11();
    public final NativeMapped instance;
    public final Class<?> nativeType;
    public final Class<?> type;

    public static NativeMappedConverter getInstance(Class<?> cls) {
        NativeMappedConverter nativeMappedConverter;
        Map<Class<?>, Reference<NativeMappedConverter>> map = converters;
        synchronized (map) {
            Reference<NativeMappedConverter> reference = map.get(cls);
            if (reference == null || (nativeMappedConverter = reference.get()) == null) {
                nativeMappedConverter = new NativeMappedConverter(cls);
                map.put(cls, new SoftReference(nativeMappedConverter));
            }
        }
        return nativeMappedConverter;
    }

    public NativeMapped defaultValue() {
        boolean zIsEnum = this.type.isEnum();
        Class<?> cls = this.type;
        return (NativeMapped) (zIsEnum ? cls.getEnumConstants()[0] : Klass.newInstance(cls));
    }

    @Override // com.sun.jna.FromNativeConverter
    public Object fromNative(Object obj, FromNativeContext fromNativeContext) {
        return this.instance.fromNative(obj, fromNativeContext);
    }

    @Override // com.sun.jna.ToNativeConverter, com.sun.jna.FromNativeConverter
    public Class<?> nativeType() {
        return this.nativeType;
    }

    @Override // com.sun.jna.ToNativeConverter
    public Object toNative(Object obj, ToNativeContext toNativeContext) {
        if (obj == null) {
            if (Pointer.class.isAssignableFrom(this.nativeType)) {
                return null;
            }
            obj = defaultValue();
        }
        return ((NativeMapped) obj).toNative();
    }

    public NativeMappedConverter(Class<?> cls) {
        if (!NativeMapped.class.isAssignableFrom(cls)) {
            throw BV5.A0O(NativeMapped.class, "Type must derive from ");
        }
        this.type = cls;
        NativeMapped nativeMappedDefaultValue = defaultValue();
        this.instance = nativeMappedDefaultValue;
        this.nativeType = nativeMappedDefaultValue.nativeType();
    }
}

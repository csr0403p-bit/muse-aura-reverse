package com.fasterxml.jackson.databind;

import X.AbstractC10109Gpa;
import X.AbstractC10187Gqy;
import X.AbstractC9787Ggw;
import X.AbstractC9842Gii;
import X.AbstractC9870GjI;
import X.AbstractC9919GlE;
import X.AbstractC9996GnP;
import X.AnonymousClass002;
import X.BV4;
import X.BV5;
import X.C10091GpF;
import X.C10094GpI;
import X.C3cG;
import X.C60Q;
import X.C9805GhS;
import X.C9809Ghf;
import X.EnumC9834GiY;
import X.EnumC9975Gmp;
import X.F60;
import X.HsZ;
import X.InterfaceC5023DOs;
import X.InterfaceC9786Ggu;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.ext.CoreXMLSerializers;
import com.fasterxml.jackson.databind.ser.BeanSerializer;
import com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer;
import com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer;
import com.fasterxml.jackson.databind.ser.impl.IteratorSerializer;
import com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer;
import com.fasterxml.jackson.databind.ser.impl.StringArraySerializer;
import com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer;
import com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import com.fasterxml.jackson.databind.ser.std.ByteArraySerializer;
import com.fasterxml.jackson.databind.ser.std.CollectionSerializer;
import com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase;
import com.fasterxml.jackson.databind.ser.std.EnumSetSerializer;
import com.fasterxml.jackson.databind.ser.std.IterableSerializer;
import com.fasterxml.jackson.databind.ser.std.JsonValueSerializer;
import com.fasterxml.jackson.databind.ser.std.MapSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializer;
import com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer;
import com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer;
import com.fasterxml.jackson.databind.ser.std.SerializableSerializer;
import com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase;
import com.fasterxml.jackson.databind.ser.std.StdArraySerializers$BooleanArraySerializer;
import com.fasterxml.jackson.databind.ser.std.StdArraySerializers$CharArraySerializer;
import com.fasterxml.jackson.databind.ser.std.StdArraySerializers$DoubleArraySerializer;
import com.fasterxml.jackson.databind.ser.std.StdArraySerializers$FloatArraySerializer;
import com.fasterxml.jackson.databind.ser.std.StdArraySerializers$IntArraySerializer;
import com.fasterxml.jackson.databind.ser.std.StdArraySerializers$LongArraySerializer;
import com.fasterxml.jackson.databind.ser.std.StdArraySerializers$ShortArraySerializer;
import com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.fasterxml.jackson.databind.ser.std.StringSerializer;
import com.fasterxml.jackson.databind.ser.std.ToEmptyObjectSerializer;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializerBase;
import com.fasterxml.jackson.databind.ser.std.UUIDSerializer;
import com.fasterxml.jackson.datatype.guava.ser.CacheSerializer;
import com.fasterxml.jackson.datatype.guava.ser.GuavaOptionalSerializer;
import com.fasterxml.jackson.datatype.guava.ser.MultimapSerializer;
import com.fasterxml.jackson.datatype.guava.ser.RangeSerializer;
import com.fasterxml.jackson.datatype.guava.ser.TableSerializer;
import com.google.common.base.Optional;
import com.google.common.collect.Range;
import java.lang.reflect.Modifier;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.datatype.XMLGregorianCalendar;

/* loaded from: classes6.dex */
public abstract class JsonSerializer {

    public abstract class None extends JsonSerializer<Object> {
        public None() {
            throw F60.createAndThrow();
        }
    }

    public static C10091GpF A06(AbstractC9919GlE abstractC9919GlE, AbstractC9996GnP abstractC9996GnP, Class cls, Object obj) {
        C10091GpF c10091GpFA04 = abstractC9996GnP.A04(EnumC9834GiY.VALUE_STRING, obj);
        c10091GpFA04.A01 = cls;
        return abstractC9996GnP.A02(abstractC9919GlE, c10091GpFA04);
    }

    public static void A07(AbstractC9919GlE abstractC9919GlE, JsonSerializer jsonSerializer, AbstractC9842Gii abstractC9842Gii, AbstractC9996GnP abstractC9996GnP, Object obj) throws InvalidDefinitionException {
        if (abstractC9996GnP == null) {
            jsonSerializer.A0C(abstractC9919GlE, abstractC9842Gii, obj);
        } else {
            jsonSerializer.A0B(abstractC9919GlE, abstractC9842Gii, abstractC9996GnP, obj);
        }
    }

    public static boolean A08(AbstractC9870GjI abstractC9870GjI) {
        return Modifier.isFinal(abstractC9870GjI._class.getModifiers());
    }

    public static boolean A09(AbstractC9842Gii abstractC9842Gii) {
        return abstractC9842Gii._config.A0E(EnumC9975Gmp.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED);
    }

    public final JsonSerializer<T> A0A(AbstractC10187Gqy abstractC10187Gqy) {
        if (!(this instanceof ReferenceTypeSerializer)) {
            if (!(this instanceof UnwrappingBeanSerializer)) {
                if (this instanceof BeanAsArraySerializer) {
                    return ((BeanAsArraySerializer) this)._defaultSerializer.A0A(abstractC10187Gqy);
                }
                if (!(this instanceof BeanSerializer)) {
                    return this;
                }
            }
            return new UnwrappingBeanSerializer((BeanSerializerBase) this, abstractC10187Gqy);
        }
        ReferenceTypeSerializer referenceTypeSerializer = (ReferenceTypeSerializer) this;
        JsonSerializer<Object> jsonSerializerA0A = referenceTypeSerializer._valueSerializer;
        JsonSerializer<Object> jsonSerializer = jsonSerializerA0A;
        if (jsonSerializerA0A != null && (jsonSerializerA0A = jsonSerializerA0A.A0A(abstractC10187Gqy)) == (jsonSerializer = referenceTypeSerializer._valueSerializer)) {
            return referenceTypeSerializer;
        }
        AbstractC10187Gqy abstractC10187Gqy2 = referenceTypeSerializer._unwrapper;
        if (abstractC10187Gqy2 != null) {
            abstractC10187Gqy = new C10094GpI(abstractC10187Gqy, abstractC10187Gqy2);
        }
        return (jsonSerializer == jsonSerializerA0A && abstractC10187Gqy2 == abstractC10187Gqy) ? referenceTypeSerializer : referenceTypeSerializer.A0H(referenceTypeSerializer._property, jsonSerializerA0A, referenceTypeSerializer._valueTypeSerializer, abstractC10187Gqy);
    }

    /* JADX WARN: Incorrect types in method signature: (TT;LX/GlE;LX/Gii;LX/GnP;)V */
    public void A0B(AbstractC9919GlE abstractC9919GlE, AbstractC9842Gii abstractC9842Gii, AbstractC9996GnP abstractC9996GnP, Object obj) throws InvalidDefinitionException {
        Class cls;
        if (!(this instanceof StdSerializer)) {
            if (this instanceof TypeWrappedSerializer) {
                cls = Object.class;
            }
            cls = obj.getClass();
            abstractC9842Gii.A0F(String.format("Type id handling not implemented for type %s (by serializer of type %s)", cls.getName(), C60Q.A0e(this)), cls);
            throw F60.createAndThrow();
        }
        cls = ((StdSerializer) this)._handledType;
        if (cls == null) {
            cls = obj.getClass();
        }
        abstractC9842Gii.A0F(String.format("Type id handling not implemented for type %s (by serializer of type %s)", cls.getName(), C60Q.A0e(this)), cls);
        throw F60.createAndThrow();
    }

    public final boolean A0D() {
        return this instanceof ReferenceTypeSerializer ? AnonymousClass002.A1X(((ReferenceTypeSerializer) this)._unwrapper) : this instanceof UnwrappingBeanSerializer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean A0E(AbstractC9842Gii abstractC9842Gii, T t) {
        Class<?> cls;
        AbstractC10109Gpa abstractC10109Gpa;
        boolean zEquals;
        boolean z;
        Object objA0D;
        JsonSerializer<Object> jsonSerializerA00;
        if (this instanceof RangeSerializer) {
            Range range = (Range) t;
            return range.lowerBound.equals(range.upperBound);
        }
        if (this instanceof ToEmptyObjectSerializer) {
            return true;
        }
        if (this instanceof StdDelegatingSerializer) {
            StdDelegatingSerializer stdDelegatingSerializer = (StdDelegatingSerializer) this;
            objA0D = stdDelegatingSerializer._converter.A7E(t);
            z = true;
            if (objA0D != null) {
                jsonSerializerA00 = stdDelegatingSerializer._delegateSerializer;
                if (jsonSerializerA00 == null) {
                    if (t != 0) {
                        return false;
                    }
                }
                return jsonSerializerA00.A0E(abstractC9842Gii, objA0D);
            }
            return z;
        }
        if (this instanceof StdArraySerializers$CharArraySerializer) {
            return AnonymousClass002.A1M(((char[]) t).length);
        }
        if (this instanceof StaticListSerializerBase) {
            Collection collection = (Collection) t;
            if (collection == null) {
                return true;
            }
            z = false;
            if (collection.isEmpty()) {
                return true;
            }
        } else {
            if (this instanceof SerializableSerializer) {
                InterfaceC9786Ggu interfaceC9786Ggu = (InterfaceC9786Ggu) t;
                if (!(interfaceC9786Ggu instanceof AbstractC9787Ggw)) {
                    return false;
                }
                AbstractC9787Ggw abstractC9787Ggw = (AbstractC9787Ggw) interfaceC9786Ggu;
                if (abstractC9787Ggw instanceof C9809Ghf) {
                    return ((C9809Ghf) abstractC9787Ggw)._children.isEmpty();
                }
                if (abstractC9787Ggw instanceof C9805GhS) {
                    return ((C9805GhS) abstractC9787Ggw)._children.isEmpty();
                }
                return false;
            }
            if (this instanceof ReferenceTypeSerializer) {
                ReferenceTypeSerializer referenceTypeSerializer = (ReferenceTypeSerializer) this;
                boolean z2 = referenceTypeSerializer instanceof GuavaOptionalSerializer;
                if (!(z2 ? ((Optional) t).isPresent() : AnonymousClass002.A1X(((AtomicReference) t).get()))) {
                    return true;
                }
                Object obj = z2 ? ((Optional) t).get() : ((AtomicReference) t).get();
                if (obj == null) {
                    return referenceTypeSerializer._suppressNulls;
                }
                if (referenceTypeSerializer._suppressableValue == null) {
                    return false;
                }
                JsonSerializer<Object> jsonSerializerA002 = referenceTypeSerializer._valueSerializer;
                if (jsonSerializerA002 == null) {
                    try {
                        jsonSerializerA002 = ReferenceTypeSerializer.A00(abstractC9842Gii, referenceTypeSerializer, obj.getClass());
                    } catch (JsonMappingException e) {
                        throw new RuntimeJsonMappingException(e);
                    }
                }
                Object obj2 = referenceTypeSerializer._suppressableValue;
                return obj2 == ReferenceTypeSerializer.A01 ? jsonSerializerA002.A0E(abstractC9842Gii, obj) : obj2.equals(obj);
            }
            if (this instanceof ToStringSerializerBase) {
                ToStringSerializerBase toStringSerializerBase = (ToStringSerializerBase) this;
                if (toStringSerializerBase instanceof NumberSerializer.BigDecimalAsStringSerializer) {
                    return false;
                }
                if (toStringSerializerBase instanceof ToStringSerializer) {
                    return t.toString().isEmpty();
                }
                throw new IllegalStateException();
            }
            if (this instanceof JsonValueSerializer) {
                JsonValueSerializer jsonValueSerializer = (JsonValueSerializer) this;
                objA0D = jsonValueSerializer._accessor.A0D(t);
                if (objA0D == null) {
                    return true;
                }
                jsonSerializerA00 = jsonValueSerializer._valueSerializer;
                if (jsonSerializerA00 == null) {
                    try {
                        jsonSerializerA00 = JsonValueSerializer.A00(abstractC9842Gii, jsonValueSerializer, objA0D.getClass());
                    } catch (JsonMappingException e2) {
                        throw new RuntimeJsonMappingException(e2);
                    }
                }
                return jsonSerializerA00.A0E(abstractC9842Gii, objA0D);
            }
            if (!(this instanceof UUIDSerializer)) {
                if (this instanceof StringSerializer) {
                    return ((String) t).isEmpty();
                }
                if (this instanceof DateTimeSerializerBase) {
                    return false;
                }
                if (this instanceof ByteArraySerializer) {
                    return AnonymousClass002.A1M(((byte[]) t).length);
                }
                if (this instanceof TableSerializer) {
                    throw BV4.A0a("isEmpty");
                }
                if (this instanceof MultimapSerializer) {
                    return ((InterfaceC5023DOs) t).isEmpty();
                }
                if (this instanceof CacheSerializer) {
                    return AnonymousClass002.A1M((((HsZ) t).size() > 0L ? 1 : (((HsZ) t).size() == 0L ? 0 : -1)));
                }
                if (this instanceof MapSerializer) {
                    MapSerializer mapSerializer = (MapSerializer) this;
                    Map map = (Map) t;
                    if (map.isEmpty()) {
                        return true;
                    }
                    Object obj3 = mapSerializer._suppressableValue;
                    if (obj3 == null && !mapSerializer._suppressNulls) {
                        return false;
                    }
                    JsonSerializer<Object> jsonSerializer = mapSerializer._valueSerializer;
                    boolean zA1Z = AnonymousClass002.A1Z(MapSerializer.A00, obj3);
                    Iterator itA10 = BV5.A10(map);
                    if (jsonSerializer != null) {
                        while (itA10.hasNext()) {
                            Object next = itA10.next();
                            if (next != null) {
                                if (zA1Z) {
                                    zEquals = jsonSerializer.A0E(abstractC9842Gii, next);
                                } else {
                                    if (obj3 == null) {
                                        return false;
                                    }
                                    zEquals = obj3.equals(map);
                                }
                                if (!zEquals) {
                                    return false;
                                }
                            } else if (!mapSerializer._suppressNulls) {
                                return false;
                            }
                        }
                        return true;
                    }
                    while (itA10.hasNext()) {
                        Object next2 = itA10.next();
                        if (next2 != null) {
                            JsonSerializer jsonSerializerA003 = MapSerializer.A00(abstractC9842Gii, mapSerializer, next2);
                            if (zA1Z) {
                                if (!jsonSerializerA003.A0E(abstractC9842Gii, next2)) {
                                    return false;
                                }
                            } else if (obj3 == null || !obj3.equals(map)) {
                                return false;
                            }
                        } else if (!mapSerializer._suppressNulls) {
                            return false;
                        }
                    }
                    return true;
                }
                if (this instanceof StdArraySerializers$IntArraySerializer) {
                    return AnonymousClass002.A1M(((int[]) t).length);
                }
                if (this instanceof StdArraySerializers$ShortArraySerializer) {
                    return AnonymousClass002.A1M(((short[]) t).length);
                }
                if (this instanceof StdArraySerializers$LongArraySerializer) {
                    return AnonymousClass002.A1M(((long[]) t).length);
                }
                if (this instanceof StdArraySerializers$FloatArraySerializer) {
                    return AnonymousClass002.A1M(((float[]) t).length);
                }
                if (this instanceof StdArraySerializers$DoubleArraySerializer) {
                    return AnonymousClass002.A1M(((double[]) t).length);
                }
                if (this instanceof StdArraySerializers$BooleanArraySerializer) {
                    return AnonymousClass002.A1M(((boolean[]) t).length);
                }
                if (this instanceof ObjectArraySerializer) {
                    return AnonymousClass002.A1M(((Object[]) t).length);
                }
                if (this instanceof StringArraySerializer) {
                    return AnonymousClass002.A1M(((String[]) t).length);
                }
                if (!(this instanceof MapEntrySerializer)) {
                    if (this instanceof IterableSerializer) {
                        return !((Iterable) t).iterator().hasNext();
                    }
                    if (this instanceof EnumSetSerializer) {
                        return ((AbstractCollection) t).isEmpty();
                    }
                    if (this instanceof CollectionSerializer) {
                        return C3cG.A1N(t);
                    }
                    if (this instanceof IteratorSerializer) {
                        return !((Iterator) t).hasNext();
                    }
                    if (this instanceof IndexedListSerializer) {
                        return ((List) t).isEmpty();
                    }
                    if (!(this instanceof CoreXMLSerializers.XMLGregorianCalendarSerializer)) {
                        return AnonymousClass002.A1Y(t);
                    }
                    XMLGregorianCalendar xMLGregorianCalendar = (XMLGregorianCalendar) t;
                    return ((CoreXMLSerializers.XMLGregorianCalendarSerializer) this)._delegate.A0E(abstractC9842Gii, xMLGregorianCalendar == null ? null : xMLGregorianCalendar.toGregorianCalendar());
                }
                MapEntrySerializer mapEntrySerializer = (MapEntrySerializer) this;
                Object value = ((Map.Entry) t).getValue();
                if (value == null) {
                    return mapEntrySerializer._suppressNulls;
                }
                if (mapEntrySerializer._suppressableValue == null) {
                    return false;
                }
                JsonSerializer<Object> jsonSerializerA004 = mapEntrySerializer._valueSerializer;
                if (jsonSerializerA004 == null && (jsonSerializerA004 = (abstractC10109Gpa = mapEntrySerializer._dynamicValueSerializers).A00((cls = value.getClass()))) == null) {
                    try {
                        jsonSerializerA004 = abstractC9842Gii.A0L(mapEntrySerializer._property, cls);
                        AbstractC10109Gpa abstractC10109GpaA01 = abstractC10109Gpa.A01(jsonSerializerA004, cls);
                        if (abstractC10109Gpa != abstractC10109GpaA01) {
                            mapEntrySerializer._dynamicValueSerializers = abstractC10109GpaA01;
                        }
                    } catch (JsonMappingException | DatabindException unused) {
                        return false;
                    }
                }
                Object obj4 = mapEntrySerializer._suppressableValue;
                return obj4 == MapEntrySerializer.A00 ? jsonSerializerA004.A0E(abstractC9842Gii, value) : obj4.equals(value);
            }
            UUID uuid = (UUID) t;
            if (uuid.getLeastSignificantBits() != 0) {
                return false;
            }
            z = true;
            if (uuid.getMostSignificantBits() != 0) {
                return false;
            }
        }
        return z;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:546:0x0787, code lost:
    
        if (r0 == null) goto L547;
     */
    /* JADX WARN: Code restructure failed: missing block: B:551:0x079b, code lost:
    
        if (r0 != false) goto L552;
     */
    /* JADX WARN: Code restructure failed: missing block: B:662:0x09c3, code lost:
    
        r9.A0I(r10, r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:663:0x09c6, code lost:
    
        return;
     */
    /* JADX WARN: Incorrect types in method signature: (TT;LX/GlE;LX/Gii;)V */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:560:0x07bb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:707:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A0C(X.AbstractC9919GlE r10, X.AbstractC9842Gii r11, java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 2714
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.JsonSerializer.A0C(X.GlE, X.Gii, java.lang.Object):void");
    }
}

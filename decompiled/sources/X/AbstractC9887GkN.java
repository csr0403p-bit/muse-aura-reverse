package X;

import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.ser.std.BooleanSerializer;
import com.fasterxml.jackson.databind.ser.std.CalendarSerializer;
import com.fasterxml.jackson.databind.ser.std.ClassSerializer;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;
import com.fasterxml.jackson.databind.ser.std.FileSerializer;
import com.fasterxml.jackson.databind.ser.std.JsonValueSerializer;
import com.fasterxml.jackson.databind.ser.std.NullSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers$DoubleSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers$FloatSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers$IntLikeSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers$IntegerSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers$LongSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers$ShortSerializer;
import com.fasterxml.jackson.databind.ser.std.SerializableSerializer;
import com.fasterxml.jackson.databind.ser.std.StdJdkSerializers$AtomicBooleanSerializer;
import com.fasterxml.jackson.databind.ser.std.StdJdkSerializers$AtomicIntegerSerializer;
import com.fasterxml.jackson.databind.ser.std.StdJdkSerializers$AtomicLongSerializer;
import com.fasterxml.jackson.databind.ser.std.StringSerializer;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer;
import com.fasterxml.jackson.databind.ser.std.UUIDSerializer;
import java.io.File;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URI;
import java.net.URL;
import java.util.Calendar;
import java.util.Collections;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* renamed from: X.GkN, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9887GkN extends AbstractC9843Gik implements Serializable {
    public static final HashMap<String, JsonSerializer<?>> A00;
    public static final HashMap<String, Class<? extends JsonSerializer<?>>> A01;
    public final C10129Gpu _factoryConfig;

    /* JADX WARN: Incorrect types in method signature: (LX/Gii;LX/Gl4;LX/GjI;Ljava/lang/Class<*>;)LX/Gnf; */
    public static final C10007Gnf A00(AbstractC9870GjI abstractC9870GjI, AbstractC9842Gii abstractC9842Gii, C9914Gl4 c9914Gl4, Class cls) {
        C10007Gnf c10007GnfA0A;
        EnumC10065Gom enumC10065Gom;
        C9963Gma c9963Gma = abstractC9842Gii._config;
        C10007Gnf c10007GnfA00 = c9963Gma._configOverrides._defaultInclusion;
        AbstractC9910Gks abstractC9910Gks = c9914Gl4.A04;
        if (abstractC9910Gks != null) {
            c10007GnfA0A = abstractC9910Gks.A0A(c9914Gl4.A07);
            if (c10007GnfA00 != null) {
                c10007GnfA00 = c10007GnfA00.A00(c10007GnfA0A);
                c10007GnfA0A = c10007GnfA00;
            }
        } else {
            c10007GnfA0A = c10007GnfA00;
        }
        C10007Gnf c10007Gnf = c9963Gma.A03(cls)._include;
        if (c10007Gnf != null) {
            c10007GnfA0A = c10007Gnf;
        }
        C10007Gnf c10007Gnf2 = c9963Gma.A03(abstractC9870GjI._class)._include;
        if (c10007Gnf2 == null) {
            return c10007GnfA0A;
        }
        EnumC10065Gom enumC10065Gom2 = c10007Gnf2._valueInclusion;
        int iOrdinal = enumC10065Gom2.ordinal();
        if (iOrdinal != 5) {
            return (iOrdinal == 6 || enumC10065Gom2 == c10007GnfA0A._contentInclusion) ? c10007GnfA0A : new C10007Gnf(c10007GnfA0A._valueInclusion, enumC10065Gom2, c10007GnfA0A._valueFilter, c10007GnfA0A._contentFilter);
        }
        Class<?> cls2 = c10007Gnf2._contentFilter;
        if (cls2 == null || cls2 == Void.class) {
            enumC10065Gom = EnumC10065Gom.USE_DEFAULTS;
            cls2 = null;
        } else {
            enumC10065Gom = EnumC10065Gom.CUSTOM;
        }
        EnumC10065Gom enumC10065Gom3 = c10007GnfA0A._valueInclusion;
        Class<?> cls3 = c10007GnfA0A._valueFilter;
        if (cls3 == Void.class) {
            cls3 = null;
        }
        if (cls2 == Void.class) {
            cls2 = null;
        }
        EnumC10065Gom enumC10065Gom4 = EnumC10065Gom.USE_DEFAULTS;
        return ((enumC10065Gom3 == enumC10065Gom4 || enumC10065Gom3 == null) && enumC10065Gom == enumC10065Gom4 && cls3 == null && cls2 == null) ? C10007Gnf.A00 : new C10007Gnf(enumC10065Gom3, enumC10065Gom, cls3, cls2);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gii;LX/GjI;LX/Gl4;)Lcom/fasterxml/jackson/databind/JsonSerializer<*>; */
    public final JsonSerializer A06(AbstractC9870GjI abstractC9870GjI, AbstractC9842Gii abstractC9842Gii, C9914Gl4 c9914Gl4) throws InvalidDefinitionException {
        if (InterfaceC9786Ggu.class.isAssignableFrom(abstractC9870GjI._class)) {
            return SerializableSerializer.A00;
        }
        AbstractC9970Gmj abstractC9970GmjA03 = c9914Gl4.A03();
        if (abstractC9970GmjA03 == null) {
            return null;
        }
        C9963Gma c9963Gma = abstractC9842Gii._config;
        if (c9963Gma.A07()) {
            AbstractC7609F5w.A1B(c9963Gma, abstractC9970GmjA03.A0F());
        }
        AbstractC9870GjI abstractC9870GjIA07 = abstractC9970GmjA03.A07();
        JsonSerializer<Object> jsonSerializerA07 = A07(abstractC9842Gii, abstractC9970GmjA03);
        if (jsonSerializerA07 == null) {
            jsonSerializerA07 = (JsonSerializer) abstractC9870GjIA07._valueHandler;
        }
        AbstractC9996GnP abstractC9996GnPA05 = (AbstractC9996GnP) abstractC9870GjIA07._typeHandler;
        if (abstractC9996GnPA05 == null) {
            abstractC9996GnPA05 = A05(abstractC9870GjIA07, abstractC9842Gii._config);
        }
        C10029Go4 c10029Go4A09 = AbstractC9849Git.A03(abstractC9842Gii).A09(abstractC9970GmjA03);
        Set<String> set = c10029Go4A09._allowGetters ? Collections.EMPTY_SET : c10029Go4A09._ignored;
        return new JsonValueSerializer(AbstractC7610F5x.A0i(jsonSerializerA07, jsonSerializerA07, set), abstractC9970GmjA03, abstractC9996GnPA05, set);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        HashMap<String, Class<? extends JsonSerializer<?>>> mapA0u = BV4.A0u();
        HashMap<String, JsonSerializer<?>> mapA0u2 = BV4.A0u();
        mapA0u2.put(String.class.getName(), new StringSerializer());
        ToStringSerializer toStringSerializer = ToStringSerializer.A00;
        AbstractC7608F5v.A1I(StringBuffer.class, toStringSerializer, mapA0u2);
        AbstractC7608F5v.A1I(StringBuilder.class, toStringSerializer, mapA0u2);
        AbstractC7608F5v.A1I(Character.class, toStringSerializer, mapA0u2);
        AbstractC7608F5v.A1I(Character.TYPE, toStringSerializer, mapA0u2);
        String name = Integer.class.getName();
        EnumC10067Goo enumC10067Goo = EnumC10067Goo.INT;
        mapA0u2.put(name, new NumberSerializers$IntegerSerializer(enumC10067Goo, Integer.class, "integer"));
        Class cls = Integer.TYPE;
        mapA0u2.put(cls.getName(), new NumberSerializers$IntegerSerializer(enumC10067Goo, cls, "integer"));
        String name2 = Long.class.getName();
        EnumC10067Goo enumC10067Goo2 = EnumC10067Goo.LONG;
        mapA0u2.put(name2, new NumberSerializers$LongSerializer(enumC10067Goo2, Long.class, "integer"));
        Class cls2 = Long.TYPE;
        mapA0u2.put(cls2.getName(), new NumberSerializers$LongSerializer(enumC10067Goo2, cls2, "integer"));
        String name3 = Byte.class.getName();
        NumberSerializers$IntLikeSerializer numberSerializers$IntLikeSerializer = NumberSerializers$IntLikeSerializer.A00;
        mapA0u2.put(name3, numberSerializers$IntLikeSerializer);
        AbstractC7608F5v.A1I(Byte.TYPE, numberSerializers$IntLikeSerializer, mapA0u2);
        String name4 = Short.class.getName();
        NumberSerializers$ShortSerializer numberSerializers$ShortSerializer = NumberSerializers$ShortSerializer.A00;
        mapA0u2.put(name4, numberSerializers$ShortSerializer);
        AbstractC7608F5v.A1I(Short.TYPE, numberSerializers$ShortSerializer, mapA0u2);
        String name5 = Double.class.getName();
        EnumC10067Goo enumC10067Goo3 = EnumC10067Goo.DOUBLE;
        mapA0u2.put(name5, new NumberSerializers$DoubleSerializer(enumC10067Goo3, Double.class, "number"));
        Class cls3 = Double.TYPE;
        mapA0u2.put(cls3.getName(), new NumberSerializers$DoubleSerializer(enumC10067Goo3, cls3, "number"));
        String name6 = Float.class.getName();
        NumberSerializers$FloatSerializer numberSerializers$FloatSerializer = NumberSerializers$FloatSerializer.A00;
        mapA0u2.put(name6, numberSerializers$FloatSerializer);
        AbstractC7608F5v.A1I(Float.TYPE, numberSerializers$FloatSerializer, mapA0u2);
        mapA0u2.put(Boolean.TYPE.getName(), new BooleanSerializer(true));
        mapA0u2.put(Boolean.class.getName(), new BooleanSerializer(false));
        mapA0u2.put(BigInteger.class.getName(), new NumberSerializer(BigInteger.class));
        mapA0u2.put(BigDecimal.class.getName(), new NumberSerializer(BigDecimal.class));
        mapA0u2.put(Calendar.class.getName(), CalendarSerializer.A00);
        mapA0u2.put(Date.class.getName(), DateSerializer.A00);
        HashMap mapA0u3 = BV4.A0u();
        mapA0u3.put(URL.class, new ToStringSerializer(URL.class, false));
        mapA0u3.put(URI.class, new ToStringSerializer(URI.class, false));
        mapA0u3.put(Currency.class, new ToStringSerializer(Currency.class, false));
        mapA0u3.put(UUID.class, new UUIDSerializer(null));
        mapA0u3.put(Pattern.class, new ToStringSerializer(Pattern.class, false));
        mapA0u3.put(Locale.class, new ToStringSerializer(Locale.class, false));
        mapA0u3.put(AtomicBoolean.class, StdJdkSerializers$AtomicBooleanSerializer.class);
        mapA0u3.put(AtomicInteger.class, StdJdkSerializers$AtomicIntegerSerializer.class);
        mapA0u3.put(AtomicLong.class, StdJdkSerializers$AtomicLongSerializer.class);
        mapA0u3.put(File.class, FileSerializer.class);
        mapA0u3.put(Class.class, ClassSerializer.class);
        NullSerializer nullSerializer = NullSerializer.A00;
        mapA0u3.put(Void.class, nullSerializer);
        mapA0u3.put(Void.TYPE, nullSerializer);
        Iterator itA0i = C3cG.A0i(mapA0u3);
        while (itA0i.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0i);
            Object value = entryA0l.getValue();
            boolean z = value instanceof JsonSerializer;
            String name7 = ((Class) entryA0l.getKey()).getName();
            if (z) {
                mapA0u2.put(name7, value);
            } else {
                mapA0u.put(name7, value);
            }
        }
        mapA0u.put(C9913Gl1.class.getName(), TokenBufferSerializer.class);
        A00 = mapA0u2;
        A01 = mapA0u;
    }

    public AbstractC9887GkN(C10129Gpu c10129Gpu) {
        this._factoryConfig = c10129Gpu == null ? new C10129Gpu() : c10129Gpu;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        if (r2 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> A07(X.AbstractC9842Gii r4, X.AbstractC10031Go7 r5) throws com.fasterxml.jackson.databind.exc.InvalidDefinitionException {
        /*
            r3 = this;
            X.Gks r0 = X.AbstractC9849Git.A03(r4)
            boolean r0 = r0 instanceof X.C9888GkO
            if (r0 == 0) goto L18
            com.fasterxml.jackson.databind.annotation.JsonSerialize r0 = X.AbstractC9910Gks.A03(r5)
            if (r0 == 0) goto L1a
            java.lang.Class r2 = r0.using()
            java.lang.Class<com.fasterxml.jackson.databind.JsonSerializer$None> r0 = com.fasterxml.jackson.databind.JsonSerializer.None.class
            if (r2 == r0) goto L1a
            if (r2 != 0) goto L34
        L18:
            r3 = 0
        L19:
            return r3
        L1a:
            java.lang.Class<com.fasterxml.jackson.annotation.JsonRawValue> r0 = com.fasterxml.jackson.annotation.JsonRawValue.class
            java.lang.annotation.Annotation r0 = r5.A0A(r0)
            com.fasterxml.jackson.annotation.JsonRawValue r0 = (com.fasterxml.jackson.annotation.JsonRawValue) r0
            if (r0 == 0) goto L18
            boolean r0 = r0.value()
            if (r0 == 0) goto L18
            java.lang.Class r1 = r5.A08()
            r0 = 0
            com.fasterxml.jackson.databind.ser.std.RawSerializer r2 = new com.fasterxml.jackson.databind.ser.std.RawSerializer
            r2.<init>(r1, r0)
        L34:
            com.fasterxml.jackson.databind.JsonSerializer r3 = r4.A0Q(r5, r2)
            X.Gks r0 = X.AbstractC9849Git.A03(r4)
            java.lang.Object r0 = r0.A0Z(r5)
            if (r0 == 0) goto L19
            X.Giz r2 = r4.A0C(r0)
            if (r2 == 0) goto L19
            X.Gj8 r0 = r4.A0B()
            X.GjI r1 = r2.AIN(r0)
            com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer r0 = new com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer
            r0.<init>(r1, r3, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC9887GkN.A07(X.Gii, X.Go7):com.fasterxml.jackson.databind.JsonSerializer");
    }
}

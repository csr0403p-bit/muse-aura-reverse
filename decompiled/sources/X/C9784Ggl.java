package X;

import X.AbstractC9842Gii;
import X.AbstractC9919GlE;
import X.FXT;
import com.facebook.flatbuffers.Flattenable;
import com.facebook.graphservice.staticcontext.StaticGraphServiceFactory;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.std.BooleanSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers$DoubleSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers$FloatSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers$IntegerSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers$LongSerializer;
import com.fasterxml.jackson.databind.ser.std.StringSerializer;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.Ggl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9784Ggl extends AbstractC9846Gip {
    public static boolean A01 = false;
    public static final long serialVersionUID = 1;
    public final transient C9785Ggn A00;
    public final JsonSerializer mCollectionSerializer;
    public boolean mHumanReadableFormatEnabled;
    public static final ConcurrentMap<Class<?>, JsonSerializer<?>> A02 = C60O.A1C();
    public static final JsonSerializer A05 = new JsonSerializer<InterfaceC9786Ggu>() { // from class: com.facebook.common.json.FbSerializerProvider$2
    };
    public static final JsonSerializer A07 = new JsonSerializer<InterfaceC9782GgT>() { // from class: com.facebook.common.json.FbSerializerProvider$3
    };
    public static final JsonSerializer A04 = new JsonSerializer<InterfaceC2619Bfl>() { // from class: com.facebook.common.json.FbSerializerProvider$4
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public final /* bridge */ /* synthetic */ void A0C(AbstractC9919GlE abstractC9919GlE, AbstractC9842Gii abstractC9842Gii, Object obj) {
            StaticGraphServiceFactory.getTreeSerializer();
            FXT.A00(obj);
            throw null;
        }
    };
    public static final JsonSerializer A03 = new JsonSerializer<Enum<?>>() { // from class: com.facebook.common.json.FbSerializerProvider$5
    };
    public static final JsonSerializer A06 = new JsonSerializer<Map<?, ?>>() { // from class: com.facebook.common.json.FbSerializerProvider$6
    };

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/Class<*>;ZLX/Gnp;)Lcom/fasterxml/jackson/databind/JsonSerializer<Ljava/lang/Object;>; */
    @Override // X.AbstractC9842Gii
    public final JsonSerializer A0O(InterfaceC10017Gnp interfaceC10017Gnp, Class cls, boolean z) throws ClassNotFoundException {
        JsonSerializer<?> jsonSerializerA0S;
        ConcurrentMap<Class<?>, JsonSerializer<?>> concurrentMap = A02;
        JsonSerializer<?> jsonSerializer = concurrentMap.get(cls);
        if (jsonSerializer == null) {
            if (InterfaceC9782GgT.class.isAssignableFrom(cls)) {
                jsonSerializerA0S = A07;
            } else {
                if (InterfaceC2619Bfl.class.isAssignableFrom(cls)) {
                    return A04;
                }
                if (InterfaceC9786Ggu.class.isAssignableFrom(cls)) {
                    jsonSerializerA0S = A05;
                } else if (cls.isEnum()) {
                    jsonSerializerA0S = A03;
                } else {
                    if (Collection.class.isAssignableFrom(cls)) {
                        concurrentMap.put(cls, this.mCollectionSerializer);
                        return this.mCollectionSerializer;
                    }
                    if (Map.class.isAssignableFrom(cls)) {
                        jsonSerializerA0S = A06;
                    } else {
                        try {
                            try {
                                Class.forName(FGI.A0M(cls.getName().replace('$', '_'), "Serializer"));
                            } catch (ClassNotFoundException unused) {
                                Class.forName(cls.getName().concat("$Serializer"));
                            }
                        } catch (ClassNotFoundException unused2) {
                        }
                        jsonSerializer = concurrentMap.get(cls);
                        if (jsonSerializer == null) {
                            if (Flattenable.class.isAssignableFrom(cls)) {
                                CFK.A0I("FbSerializerProvider", "Serializing a FlatBuffer based object to Json: %s", cls.toString());
                            }
                            try {
                                jsonSerializerA0S = super.A0O(interfaceC10017Gnp, cls, z);
                            } catch (NoClassDefFoundError unused3) {
                                jsonSerializerA0S = A0S(cls);
                            }
                            concurrentMap.put(cls, jsonSerializerA0S);
                            if (this.A00 != null) {
                                String string = cls.toString();
                                Object obj = jsonSerializerA0S;
                                if (jsonSerializerA0S == null) {
                                    obj = "<unknown>";
                                }
                                CFK.A01(obj, "serialize", string, "JACKSON_FALLBACK", "Using %s to %s %s");
                                return jsonSerializerA0S;
                            }
                            return jsonSerializerA0S;
                        }
                    }
                }
            }
            concurrentMap.put(cls, jsonSerializerA0S);
            return jsonSerializerA0S;
        }
        return jsonSerializer;
    }

    public C9784Ggl(C9785Ggn c9785Ggn, C9963Gma c9963Gma, AbstractC9842Gii abstractC9842Gii, AbstractC9843Gik abstractC9843Gik, boolean z) {
        super(c9963Gma, abstractC9842Gii, abstractC9843Gik);
        this.mCollectionSerializer = new JsonSerializer<Collection<?>>() { // from class: com.facebook.common.json.FbSerializerProvider$1
        };
        this.A00 = c9785Ggn;
        if (!A01) {
            ConcurrentMap<Class<?>, JsonSerializer<?>> concurrentMap = A02;
            concurrentMap.put(String.class, new StringSerializer());
            concurrentMap.put(Integer.class, new NumberSerializers$IntegerSerializer(EnumC10067Goo.INT, Integer.class, "integer"));
            concurrentMap.put(Long.class, new NumberSerializers$LongSerializer(EnumC10067Goo.LONG, Long.class, "integer"));
            concurrentMap.put(Boolean.class, new BooleanSerializer(false));
            concurrentMap.put(Float.class, new NumberSerializers$FloatSerializer());
            concurrentMap.put(Double.class, new NumberSerializers$DoubleSerializer(EnumC10067Goo.DOUBLE, Double.class, "number"));
            A01 = true;
        }
        this.mHumanReadableFormatEnabled = z;
    }
}

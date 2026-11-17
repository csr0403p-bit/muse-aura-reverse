package X;

import X.AbstractC9842Gii;
import X.AbstractC9870GjI;
import X.AbstractC9919GlE;
import X.AbstractC9996GnP;
import X.C10091GpF;
import X.C9860Gj8;
import X.EnumC9834GiY;
import X.EnumC9975Gmp;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.std.ArraySerializerBase;
import com.fasterxml.jackson.databind.ser.std.ByteArraySerializer;
import com.fasterxml.jackson.databind.ser.std.StdArraySerializers$TypedPrimitiveArraySerializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.Gi2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9815Gi2 {
    public static final HashMap<String, JsonSerializer<?>> A00;

    static {
        HashMap<String, JsonSerializer<?>> mapA0u = BV4.A0u();
        A00 = mapA0u;
        mapA0u.put(boolean[].class.getName(), new ArraySerializerBase<boolean[]>() { // from class: com.fasterxml.jackson.databind.ser.std.StdArraySerializers$BooleanArraySerializer
            public static final AbstractC9870GjI A00 = C9860Gj8.A08.A0C(Boolean.class);
        });
        mapA0u.put(byte[].class.getName(), new ByteArraySerializer());
        mapA0u.put(char[].class.getName(), new StdSerializer<char[]>() { // from class: com.fasterxml.jackson.databind.ser.std.StdArraySerializers$CharArraySerializer
            @Override // com.fasterxml.jackson.databind.JsonSerializer
            public final /* bridge */ /* synthetic */ void A0B(AbstractC9919GlE abstractC9919GlE, AbstractC9842Gii abstractC9842Gii, AbstractC9996GnP abstractC9996GnP, Object obj) throws IOException {
                C10091GpF c10091GpFA00;
                char[] cArr = (char[]) obj;
                if (abstractC9842Gii._config.A0E(EnumC9975Gmp.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS)) {
                    c10091GpFA00 = AbstractC9996GnP.A00(abstractC9919GlE, EnumC9834GiY.START_ARRAY, abstractC9996GnP, cArr);
                    int length = cArr.length;
                    for (int i = 0; i < length; i++) {
                        abstractC9919GlE.A0y(cArr, i, 1);
                    }
                } else {
                    c10091GpFA00 = AbstractC9996GnP.A00(abstractC9919GlE, EnumC9834GiY.VALUE_STRING, abstractC9996GnP, cArr);
                    abstractC9919GlE.A0y(cArr, 0, cArr.length);
                }
                abstractC9996GnP.A03(abstractC9919GlE, c10091GpFA00);
            }
        });
        mapA0u.put(short[].class.getName(), new StdArraySerializers$TypedPrimitiveArraySerializer<short[]>() { // from class: com.fasterxml.jackson.databind.ser.std.StdArraySerializers$ShortArraySerializer
            public static final AbstractC9870GjI A00 = C9860Gj8.A08.A0C(Short.TYPE);
        });
        mapA0u.put(int[].class.getName(), new ArraySerializerBase<int[]>() { // from class: com.fasterxml.jackson.databind.ser.std.StdArraySerializers$IntArraySerializer
            public static final AbstractC9870GjI A00 = C9860Gj8.A08.A0C(Integer.TYPE);
        });
        mapA0u.put(long[].class.getName(), new StdArraySerializers$TypedPrimitiveArraySerializer<long[]>() { // from class: com.fasterxml.jackson.databind.ser.std.StdArraySerializers$LongArraySerializer
            public static final AbstractC9870GjI A00 = C9860Gj8.A08.A0C(Long.TYPE);
        });
        mapA0u.put(float[].class.getName(), new StdArraySerializers$TypedPrimitiveArraySerializer<float[]>() { // from class: com.fasterxml.jackson.databind.ser.std.StdArraySerializers$FloatArraySerializer
            public static final AbstractC9870GjI A00 = C9860Gj8.A08.A0C(Float.TYPE);
        });
        mapA0u.put(double[].class.getName(), new ArraySerializerBase<double[]>() { // from class: com.fasterxml.jackson.databind.ser.std.StdArraySerializers$DoubleArraySerializer
            public static final AbstractC9870GjI A00 = C9860Gj8.A08.A0C(Double.TYPE);
        });
    }
}

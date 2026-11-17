package X;

import android.util.Base64;
import android.util.JsonWriter;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
public final class C9j implements InterfaceC3892CgV, CHI {
    public final JsonWriter A00;
    public final boolean A01;
    public final InterfaceC3288C9m<Object> A02;
    public final Map<Class<?>, InterfaceC3288C9m<?>> A03;
    public final Map<Class<?>, InterfaceC3289C9n<?>> A04;

    public final void A00(Object obj) throws IOException {
        JsonWriter jsonWriter;
        JsonWriter jsonWriter2;
        int i = 0;
        if (obj == null) {
            this.A00.nullValue();
            return;
        }
        if (obj instanceof Number) {
            this.A00.value((Number) obj);
            return;
        }
        Class<?> cls = obj.getClass();
        if (cls.isArray()) {
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                JsonWriter jsonWriter3 = this.A00;
                if (bArr == null) {
                    jsonWriter3.nullValue();
                    return;
                } else {
                    jsonWriter3.value(Base64.encodeToString(bArr, 2));
                    return;
                }
            }
            jsonWriter2 = this.A00;
            jsonWriter2.beginArray();
            if (obj instanceof int[]) {
                int length = ((int[]) obj).length;
                while (i < length) {
                    jsonWriter2.value(r7[i]);
                    i++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i < length2) {
                    jsonWriter2.value(jArr[i]);
                    i++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i < length3) {
                    jsonWriter2.value(dArr[i]);
                    i++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i < length4) {
                    jsonWriter2.value(zArr[i]);
                    i++;
                }
            } else if (obj instanceof Number[]) {
                for (Number number : (Number[]) obj) {
                    A00(number);
                }
            } else {
                for (Object obj2 : (Object[]) obj) {
                    A00(obj2);
                }
            }
        } else {
            if (!(obj instanceof Collection)) {
                if (obj instanceof Map) {
                    jsonWriter = this.A00;
                    jsonWriter.beginObject();
                    Iterator itA0n = AnonymousClass002.A0n((Map) obj);
                    while (itA0n.hasNext()) {
                        Map.Entry entryA0l = C3cH.A0l(itA0n);
                        Object key = entryA0l.getKey();
                        try {
                            String str = (String) key;
                            Object value = entryA0l.getValue();
                            if (!this.A01) {
                                jsonWriter.name(str);
                                if (value == null) {
                                    jsonWriter.nullValue();
                                } else {
                                    A00(value);
                                }
                            } else if (value != null) {
                                jsonWriter.name(str);
                                A00(value);
                            }
                        } catch (ClassCastException e) {
                            throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                        }
                    }
                } else {
                    InterfaceC3288C9m<?> interfaceC3288C9m = this.A03.get(cls);
                    if (interfaceC3288C9m == null) {
                        InterfaceC3289C9n<?> interfaceC3289C9n = this.A04.get(cls);
                        if (interfaceC3289C9n != null) {
                            interfaceC3289C9n.AA4(obj, this);
                            return;
                        } else {
                            if (obj instanceof Enum) {
                                this.A00.value(((Enum) obj).name());
                                return;
                            }
                            interfaceC3288C9m = this.A02;
                        }
                    }
                    jsonWriter = this.A00;
                    jsonWriter.beginObject();
                    interfaceC3288C9m.AA4(obj, this);
                }
                jsonWriter.endObject();
                return;
            }
            jsonWriter2 = this.A00;
            jsonWriter2.beginArray();
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                A00(it.next());
            }
        }
        jsonWriter2.endArray();
    }

    @Override // X.InterfaceC3892CgV
    public final void A3E(C2580BeF c2580BeF, long j) throws IOException {
        String str = c2580BeF.A00;
        JsonWriter jsonWriter = this.A00;
        jsonWriter.name(str);
        jsonWriter.value(j);
    }

    @Override // X.InterfaceC3892CgV
    public final void A3F(C2580BeF c2580BeF, Object obj) throws IOException {
        String str = c2580BeF.A00;
        if (!this.A01) {
            JsonWriter jsonWriter = this.A00;
            jsonWriter.name(str);
            if (obj == null) {
                jsonWriter.nullValue();
                return;
            }
        } else if (obj == null) {
            return;
        } else {
            this.A00.name(str);
        }
        A00(obj);
    }

    @Override // X.CHI
    public final /* bridge */ /* synthetic */ void A3G(String str) throws IOException {
        this.A00.value(str);
    }

    @Override // X.CHI
    public final /* bridge */ /* synthetic */ void A3H(boolean z) throws IOException {
        this.A00.value(z);
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/io/Writer;Ljava/util/Map<Ljava/lang/Class<*>;LX/C9m<*>;>;Ljava/util/Map<Ljava/lang/Class<*>;LX/C9n<*>;>;LX/C9m<Ljava/lang/Object;>;Z)V */
    public C9j(InterfaceC3288C9m interfaceC3288C9m, Writer writer, Map map, Map map2, boolean z) {
        this.A00 = new JsonWriter(writer);
        this.A03 = map;
        this.A04 = map2;
        this.A02 = interfaceC3288C9m;
        this.A01 = z;
    }
}

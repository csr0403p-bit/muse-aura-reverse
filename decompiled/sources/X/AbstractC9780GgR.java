package X;

import android.net.Uri;
import com.facebook.common.json.FbJsonDeserializer;
import com.facebook.common.json.UriDeserializer;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer;
import com.fasterxml.jackson.databind.deser.std.StringDeserializer;
import com.fasterxml.jackson.databind.deser.std.TokenBufferDeserializer;
import com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer;
import java.util.AbstractMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.GgR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9780GgR {
    public static final FbJsonDeserializer A00;
    public static final ConcurrentMap<Class<?>, JsonDeserializer> A01;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> com.fasterxml.jackson.databind.JsonDeserializer<T> A00(java.lang.Class<T> r6) {
        /*
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, com.fasterxml.jackson.databind.JsonDeserializer> r4 = X.AbstractC9780GgR.A01
            java.lang.Object r0 = r4.get(r6)
            com.fasterxml.jackson.databind.JsonDeserializer r0 = (com.fasterxml.jackson.databind.JsonDeserializer) r0
            com.facebook.common.json.FbJsonDeserializer r3 = X.AbstractC9780GgR.A00
            if (r0 != r3) goto Le
            r0 = 0
        Ld:
            return r0
        Le:
            if (r0 != 0) goto Ld
            java.lang.Class<X.GgT> r0 = X.InterfaceC9782GgT.class
            boolean r0 = r0.isAssignableFrom(r6)
            if (r0 == 0) goto L26
            com.facebook.common.json.TypeModelBase64Deserializer r0 = new com.facebook.common.json.TypeModelBase64Deserializer
            r0.<init>()
        L1d:
            r0.A00 = r6
        L1f:
            if (r0 == 0) goto L22
            r3 = r0
        L22:
            r4.putIfAbsent(r6, r3)
            return r0
        L26:
            java.lang.Class<X.Bfl> r0 = X.InterfaceC2619Bfl.class
            boolean r0 = r0.isAssignableFrom(r6)
            if (r0 == 0) goto L36
            com.facebook.common.json.TreeFragmentModelBase64Deserializer r0 = new com.facebook.common.json.TreeFragmentModelBase64Deserializer
            r0.<init>()
            r0.A00 = r6
            goto L1f
        L36:
            java.lang.Class<X.GgS> r0 = X.InterfaceC9781GgS.class
            boolean r0 = r0.isAssignableFrom(r6)
            if (r0 == 0) goto L44
            com.facebook.common.json.FBJsonSelfDeserializer r0 = new com.facebook.common.json.FBJsonSelfDeserializer
            r0.<init>()
            goto L1d
        L44:
            java.lang.String r5 = r6.getName()
            r1 = 36
            r0 = 95
            java.lang.String r1 = r5.replace(r1, r0)
            java.lang.String r0 = "Deserializer"
            java.lang.String r0 = r1.concat(r0)
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L63
            java.lang.Object r0 = r0.newInstance()     // Catch: java.lang.Throwable -> L63
            com.fasterxml.jackson.databind.JsonDeserializer r0 = (com.fasterxml.jackson.databind.JsonDeserializer) r0     // Catch: java.lang.Throwable -> L63
            if (r0 != 0) goto L1f
            goto L6f
        L63:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[]{r0}
            java.lang.String r1 = "GlobalAutoGenDeserializerCache"
            java.lang.String r0 = "Failed to find deserializer by naming convention"
            X.BzX.A00(r1, r0, r2)
        L6f:
            java.lang.String r0 = "$Deserializer"
            java.lang.String r0 = r5.concat(r0)
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L80
            java.lang.Object r0 = r0.newInstance()     // Catch: java.lang.Throwable -> L80
            com.fasterxml.jackson.databind.JsonDeserializer r0 = (com.fasterxml.jackson.databind.JsonDeserializer) r0     // Catch: java.lang.Throwable -> L80
            goto L1f
        L80:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[]{r0}
            java.lang.String r1 = "GlobalAutoGenDeserializerCache"
            java.lang.String r0 = "Failed to find deserializer by naming convention"
            X.BzX.A00(r1, r0, r2)
            r0 = 0
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC9780GgR.A00(java.lang.Class):com.fasterxml.jackson.databind.JsonDeserializer");
    }

    static {
        ConcurrentHashMap concurrentHashMapA1C = C60O.A1C();
        A01 = concurrentHashMapA1C;
        A00 = new FbJsonDeserializer();
        concurrentHashMapA1C.put(AbstractC9804GhQ.class, JsonNodeDeserializer.A00);
        concurrentHashMapA1C.put(String.class, StringDeserializer.A00);
        A01(Integer.class, concurrentHashMapA1C);
        A01(Long.class, concurrentHashMapA1C);
        A01(Boolean.class, concurrentHashMapA1C);
        A01(Float.class, concurrentHashMapA1C);
        A01(Double.class, concurrentHashMapA1C);
        concurrentHashMapA1C.put(Uri.class, new UriDeserializer());
        concurrentHashMapA1C.put(C9913Gl1.class, new TokenBufferDeserializer());
        concurrentHashMapA1C.put(Object.class, new UntypedObjectDeserializer((AbstractC9870GjI) null, (AbstractC9870GjI) null));
    }

    public static void A01(Class cls, AbstractMap abstractMap) {
        abstractMap.put(cls, AbstractC9948Gm6.A00(cls, cls.getName()));
    }
}

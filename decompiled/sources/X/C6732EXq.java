package X;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.EXq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6732EXq extends AbstractC6735EXt<JsonElement> {
    public static final C6732EXq A00 = new C6732EXq();

    /* JADX INFO: Access modifiers changed from: private */
    @Override // X.AbstractC6735EXt
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final void write(JsonElement jsonElement, C6733EXr c6733EXr) throws IOException {
        if (jsonElement == null || (jsonElement instanceof C6714EWu)) {
            c6733EXr.A0B();
            return;
        }
        if (jsonElement instanceof JsonPrimitive) {
            JsonPrimitive asJsonPrimitive = jsonElement.getAsJsonPrimitive();
            Object obj = asJsonPrimitive.value;
            if (obj instanceof Number) {
                c6733EXr.A0F(asJsonPrimitive.getAsNumber());
                return;
            } else if (obj instanceof Boolean) {
                c6733EXr.A0I(asJsonPrimitive.getAsBoolean());
                return;
            } else {
                c6733EXr.A0H(asJsonPrimitive.getAsString());
                return;
            }
        }
        if (jsonElement instanceof JsonArray) {
            c6733EXr.A07();
            Iterator<JsonElement> it = jsonElement.getAsJsonArray().iterator();
            while (it.hasNext()) {
                write(it.next(), c6733EXr);
            }
            c6733EXr.A09();
            return;
        }
        if (!(jsonElement instanceof JsonObject)) {
            throw C60O.A0i(BV8.A0x("Couldn't write ", jsonElement));
        }
        c6733EXr.A08();
        Iterator itA0i = C3cG.A0i(jsonElement.getAsJsonObject().members);
        while (itA0i.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0i);
            c6733EXr.A0G(C60O.A0t(entryA0l));
            write((JsonElement) entryA0l.getValue(), c6733EXr);
        }
        c6733EXr.A0A();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x004a A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v10, types: [com.google.gson.JsonElement, java.lang.Object] */
    @Override // X.AbstractC6735EXt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ com.google.gson.JsonElement read(X.EY1 r7) throws com.google.gson.stream.MalformedJsonException {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C6731EXp
            if (r0 == 0) goto L22
            X.EXp r7 = (X.C6731EXp) r7
            java.lang.Integer r1 = r7.A0R()
            java.lang.Integer r0 = X.C79.A0P
            if (r1 == r0) goto Lb0
            java.lang.Integer r0 = X.C79.A01
            if (r1 == r0) goto Lb0
            java.lang.Integer r0 = X.C79.A0K
            if (r1 == r0) goto Lb0
            java.lang.Integer r0 = X.C79.A0c
            if (r1 == r0) goto Lb0
            java.lang.Object r6 = X.EY1.A09(r7)
            r7.A0b()
        L21:
            return r6
        L22:
            java.lang.Integer r2 = r7.A0R()
            int r1 = r2.intValue()
            r0 = 0
            if (r1 == r0) goto L3e
            r0 = 2
            if (r1 == r0) goto L35
            com.google.gson.JsonElement r6 = A00(r7, r2)
            return r6
        L35:
            r7.A0X()
            com.google.gson.JsonObject r6 = new com.google.gson.JsonObject
            r6.<init>()
            goto L46
        L3e:
            r7.A0W()
            com.google.gson.JsonArray r6 = new com.google.gson.JsonArray
            r6.<init>()
        L46:
            java.util.ArrayDeque r5 = X.BV4.A0s()
        L4a:
            boolean r0 = r7.A0c()
            if (r0 == 0) goto L98
            boolean r0 = r6 instanceof com.google.gson.JsonObject
            if (r0 == 0) goto L96
            java.lang.String r4 = r7.A0U()
        L58:
            java.lang.Integer r3 = r7.A0R()
            int r1 = r3.intValue()
            r0 = 0
            if (r1 == r0) goto L83
            r0 = 2
            if (r1 == r0) goto L8c
            r2 = 0
            com.google.gson.JsonElement r0 = A00(r7, r3)
        L6b:
            boolean r1 = r6 instanceof com.google.gson.JsonArray
            if (r1 == 0) goto L7c
            r1 = r6
            com.google.gson.JsonArray r1 = (com.google.gson.JsonArray) r1
            r1.add(r0)
        L75:
            if (r2 == 0) goto L4a
            r5.addLast(r6)
            r6 = r0
            goto L4a
        L7c:
            r1 = r6
            com.google.gson.JsonObject r1 = (com.google.gson.JsonObject) r1
            r1.add(r4, r0)
            goto L75
        L83:
            r7.A0W()
            com.google.gson.JsonArray r0 = new com.google.gson.JsonArray
            r0.<init>()
            goto L94
        L8c:
            r7.A0X()
            com.google.gson.JsonObject r0 = new com.google.gson.JsonObject
            r0.<init>()
        L94:
            r2 = 1
            goto L6b
        L96:
            r4 = 0
            goto L58
        L98:
            boolean r0 = r6 instanceof com.google.gson.JsonArray
            if (r0 == 0) goto Lac
            r7.A0Y()
        L9f:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L21
            java.lang.Object r6 = r5.removeLast()
            com.google.gson.JsonElement r6 = (com.google.gson.JsonElement) r6
            goto L4a
        Lac:
            r7.A0Z()
            goto L9f
        Lb0:
            java.lang.String r2 = "Unexpected "
            java.lang.String r1 = X.EY2.A00(r1)
            java.lang.String r0 = " when reading a JsonElement."
            java.lang.IllegalStateException r0 = X.BV5.A0V(r2, r1, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6732EXq.read(X.EY1):java.lang.Object");
    }

    public static JsonElement A00(EY1 ey1, Integer num) {
        int iIntValue = num.intValue();
        if (iIntValue == 5) {
            return new JsonPrimitive(ey1.A0V());
        }
        if (iIntValue == 6) {
            return new JsonPrimitive(new C6716EWz(ey1.A0V()));
        }
        if (iIntValue == 7) {
            return new JsonPrimitive(Boolean.valueOf(ey1.A0d()));
        }
        if (iIntValue != 8) {
            throw BV5.A0U("Unexpected token: ", EY2.A00(num));
        }
        ey1.A0a();
        return C6714EWu.A00;
    }
}

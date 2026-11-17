package X;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.internal.JsonDecodingException;

/* renamed from: X.9sI, reason: invalid class name */
/* loaded from: classes4.dex */
public class C9sI extends C9sO {
    public boolean A00;
    public int A01;
    public final C9iZ A02;
    public final JsonObject A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9sI(String str, C9iZ c9iZ, C9sU c9sU, JsonObject jsonObject) {
        super(str, c9sU, jsonObject);
        C7384Etj.A0Y(c9sU, 0);
        C7384Etj.A0Y(jsonObject, 1);
        this.A03 = jsonObject;
        this.A02 = c9iZ;
    }

    @Override // X.AbstractC07999si
    public String A0F(C9iZ c9iZ, int i) {
        String next;
        C7384Etj.A0Y(c9iZ, 0);
        C9sU c9sU = ((C9sO) this).A01;
        C7384Etj.areEqual(c9iZ.AGs(), C9iN.A00);
        String strAF5 = c9iZ.AF5(i);
        if (super.A03.A0E) {
            JsonObject jsonObjectA0G = A0G();
            if (!jsonObjectA0G.keySet().contains(strAF5)) {
                Map map = (Map) c9sU.A01.A00(new BTB(29, c9iZ, c9sU), c9iZ, C9sC.A00);
                Iterator<String> it = jsonObjectA0G.keySet().iterator();
                while (true) {
                    next = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    next = it.next();
                    Number number = (Number) map.get(next);
                    if (number != null && number.intValue() == i) {
                        break;
                    }
                }
                String str = next;
                if (str != null) {
                    return str;
                }
            }
        }
        return strAF5;
    }

    @Override // X.C9sO
    public JsonElement A0I(String str) {
        C7384Etj.A0Y(str, 0);
        JsonObject jsonObjectA0G = A0G();
        C7384Etj.A0Y(jsonObjectA0G, 0);
        return (JsonElement) AbstractC2258BHp.A0L(str, jsonObjectA0G);
    }

    @Override // X.C9sO, X.InterfaceC07829iw
    public final C9j4 A55(C9iZ c9iZ) {
        C7384Etj.A0Y(c9iZ, 0);
        C9iZ c9iZ2 = this.A02;
        if (c9iZ != c9iZ2) {
            return super.A55(c9iZ);
        }
        C9sU c9sU = ((C9sO) this).A01;
        JsonElement jsonElementA0H = A0H();
        String strAKP = c9iZ2.AKP();
        if (jsonElementA0H instanceof JsonObject) {
            return new C9sI(((C9sO) this).A00, c9iZ2, c9sU, (JsonObject) jsonElementA0H);
        }
        throw C9rA.A02(jsonElementA0H.toString(), FGI.A0l("Expected ", C0861A6i.A01(JsonObject.class), ", but had ", C0861A6i.A01(jsonElementA0H.getClass()), " as the serialized body of ", strAKP, " at element: ", A0E()), -1);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x004c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0004 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0004 A[SYNTHETIC] */
    @Override // X.C9j4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int A8N(X.C9iZ r12) {
        /*
            r11 = this;
            r4 = 0
            X.C7384Etj.A0Y(r12, r4)
        L4:
            int r1 = r11.A01
            int r0 = r12.AF6()
            if (r1 >= r0) goto Lca
            int r1 = r11.A01
            int r0 = r1 + 1
            r11.A01 = r0
            java.lang.String r8 = r11.A0F(r12, r1)
            X.C7384Etj.A0Y(r8, r4)
            java.util.ArrayList<Tag> r0 = r11.A01
            X.AbstractC0878AGe.A0I(r0)
            int r3 = r11.A01
            r10 = 1
            int r3 = r3 - r10
            r11.A00 = r4
            kotlinx.serialization.json.JsonObject r7 = r11.A0G()
            boolean r0 = r7.containsKey(r8)
            if (r0 != 0) goto L4c
            X.9sU r0 = r11.A01
            X.9sa r0 = r0.A00
            boolean r0 = r0.A0A
            if (r0 != 0) goto L47
            boolean r0 = r12.AOL(r3)
            if (r0 != 0) goto L47
            X.9iZ r0 = r12.AF3(r3)
            boolean r1 = r0.AOo()
            r0 = 1
            if (r1 != 0) goto L48
        L47:
            r0 = 0
        L48:
            r11.A00 = r0
            if (r0 == 0) goto L4
        L4c:
            X.9sa r0 = r11.A03
            boolean r0 = r0.A07
            if (r0 == 0) goto Lcb
            X.9sU r6 = r11.A01
            boolean r9 = r12.AOL(r3)
            X.9iZ r2 = r12.AF3(r3)
            if (r9 == 0) goto L6d
            boolean r0 = r2.AOo()
            if (r0 != 0) goto L6d
            java.lang.Object r0 = r7.get(r8)
            boolean r0 = r0 instanceof kotlinx.serialization.json.JsonNull
            if (r0 == 0) goto L6d
            goto L4
        L6d:
            X.BL8 r1 = r2.AGs()
            X.9i9 r0 = X.C9i9.A00
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 == 0) goto Lcb
            boolean r5 = r2.AOo()
            if (r5 == 0) goto L88
            java.lang.Object r0 = r7.get(r8)
            boolean r0 = r0 instanceof kotlinx.serialization.json.JsonNull
            if (r0 == 0) goto L88
            return r3
        L88:
            java.lang.Object r1 = r7.get(r8)
            kotlinx.serialization.json.JsonElement r1 = (kotlinx.serialization.json.JsonElement) r1
            boolean r0 = r1 instanceof kotlinx.serialization.json.JsonPrimitive
            if (r0 == 0) goto Lcb
            kotlinx.serialization.json.JsonPrimitive r1 = (kotlinx.serialization.json.JsonPrimitive) r1
            if (r1 == 0) goto Lcb
            java.lang.String r0 = X.C9oY.A04(r1)
            if (r0 == 0) goto Lcb
            int r2 = X.C9sC.A01(r0, r2, r6)
            X.9sa r0 = r6.A00
            boolean r1 = r0.A0A
            if (r1 != 0) goto Lc8
            if (r5 == 0) goto Lc8
        La8:
            r0 = -3
            if (r2 != r0) goto Lcb
            if (r9 != 0) goto Laf
            if (r10 == 0) goto Lcb
        Laf:
            if (r1 != 0) goto Lc2
            boolean r0 = r12.AOL(r3)
            if (r0 != 0) goto Lc2
            X.9iZ r0 = r12.AF3(r3)
            boolean r1 = r0.AOo()
            r0 = 1
            if (r1 != 0) goto Lc3
        Lc2:
            r0 = 0
        Lc3:
            r11.A00 = r0
            if (r0 == 0) goto L4
            return r3
        Lc8:
            r10 = 0
            goto La8
        Lca:
            r3 = -1
        Lcb:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9sI.A8N(X.9iZ):int");
    }

    @Override // X.C9sO, X.C9j4
    public void AAd(C9iZ c9iZ) {
        Object obj;
        Iterable iterableKeySet;
        C7384Etj.A0Y(c9iZ, 0);
        C9sU c9sU = ((C9sO) this).A01;
        if (C9sC.A03(c9iZ, c9sU) || (c9iZ.AGs() instanceof C9hz)) {
            return;
        }
        C7384Etj.areEqual(c9iZ.AGs(), C9iN.A00);
        boolean z = super.A03.A0E;
        Set setA00 = C9iG.A00(c9iZ);
        if (z) {
            C9sD c9sD = c9sU.A01;
            C9sE<Map<String, Integer>> c9sE = C9sC.A00;
            Map<C9sE<Object>, Object> map = c9sD.A00.get(c9iZ);
            if (map == null || (obj = map.get(c9sE)) == null) {
                obj = null;
            }
            Map map2 = (Map) obj;
            if (map2 == null || (iterableKeySet = map2.keySet()) == null) {
                iterableKeySet = A3q.A00;
            }
            setA00 = BGK.A01(iterableKeySet, setA00);
        }
        JsonObject jsonObjectA0G = A0G();
        for (String str : jsonObjectA0G.keySet()) {
            if (!setA00.contains(str) && !C7384Etj.areEqual(str, ((C9sO) this).A00)) {
                StringBuilder sb = new StringBuilder("Encountered an unknown key '");
                sb.append(str);
                sb.append("' at element: ");
                sb.append(A0E());
                sb.append("\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: ");
                sb.append((Object) C9rA.A00(jsonObjectA0G.toString(), -1));
                throw new JsonDecodingException(sb.toString());
            }
        }
    }

    @Override // X.C9sO
    /* renamed from: A0J, reason: merged with bridge method [inline-methods] */
    public JsonObject A0G() {
        return this.A03;
    }

    @Override // X.C9sO, X.InterfaceC07829iw
    public final boolean A8Y() {
        return !this.A00 && ((A0H() instanceof JsonNull) ^ true);
    }
}

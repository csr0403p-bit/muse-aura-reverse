package X;

import com.facebook.aura.localbrowser.core.BrowserOperationCatalogKt;
import java.util.List;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonLiteral;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.json.internal.JsonDecodingException;

/* renamed from: X.9sO, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9sO extends AbstractC07999si implements BNA {
    public final String A00;
    public final C9sU A01;
    public final JsonElement A02;
    public final C9sa A03;

    public abstract JsonElement A0I(String str);

    @Override // X.InterfaceC07829iw
    public C9j4 A55(C9iZ c9iZ) {
        final C9sU c9sU;
        String strAKP;
        StringBuilder sb;
        Class cls;
        String strAKP2;
        Class cls2;
        C7384Etj.A0Y(c9iZ, 0);
        JsonElement jsonElementA0H = A0H();
        BL8 bl8AGs = c9iZ.AGs();
        if (C7384Etj.areEqual(bl8AGs, C9tD.A00) || (bl8AGs instanceof C9hz)) {
            c9sU = this.A01;
            strAKP = c9iZ.AKP();
            if (!(jsonElementA0H instanceof JsonArray)) {
                sb = new StringBuilder("Expected ");
                cls = JsonArray.class;
                sb.append(C0861A6i.A01(cls));
                sb.append(", but had ");
                sb.append(C0861A6i.A01(jsonElementA0H.getClass()));
                sb.append(" as the serialized body of ");
                sb.append(strAKP);
            }
            return new C08079sq(c9sU, (JsonArray) jsonElementA0H);
        }
        if (C7384Etj.areEqual(bl8AGs, C9tE.A00)) {
            c9sU = this.A01;
            C9iZ c9iZA00 = C9sV.A00(c9iZ.AF3(0), c9sU.A02);
            BL8 bl8AGs2 = c9iZA00.AGs();
            if (!(bl8AGs2 instanceof AbstractC07679ic) && !C7384Etj.areEqual(bl8AGs2, C9i9.A00)) {
                if (!c9sU.A00.A05) {
                    throw C9rA.A04(c9iZA00);
                }
                strAKP2 = c9iZ.AKP();
                if (!(jsonElementA0H instanceof JsonArray)) {
                    sb = new StringBuilder("Expected ");
                    cls2 = JsonArray.class;
                }
                return new C08079sq(c9sU, (JsonArray) jsonElementA0H);
            }
            strAKP2 = c9iZ.AKP();
            if (jsonElementA0H instanceof JsonObject) {
                final JsonObject jsonObject = (JsonObject) jsonElementA0H;
                return new C9sI(c9sU, jsonObject) { // from class: X.9sJ
                    public int A00;
                    public final JsonObject A01;
                    public final int A02;
                    public final List<String> A03;

                    {
                        C7384Etj.A0Y(jsonObject, 1);
                        this.A01 = jsonObject;
                        List<String> listA0X = AbstractC0878AGe.A0X(jsonObject.keySet());
                        this.A03 = listA0X;
                        this.A02 = listA0X.size() * 2;
                        this.A00 = -1;
                    }

                    @Override // X.C9sI, X.C9sO
                    public final JsonElement A0I(String str) {
                        Object objA0L;
                        C7384Etj.A0Y(str, 0);
                        if (this.A00 % 2 == 0) {
                            objA0L = C9oY.A07(str);
                        } else {
                            JsonObject jsonObject2 = this.A01;
                            C7384Etj.A0Y(jsonObject2, 0);
                            objA0L = AbstractC2258BHp.A0L(str, jsonObject2);
                        }
                        return (JsonElement) objA0L;
                    }

                    @Override // X.C9sI, X.C9sO, X.C9j4
                    public final void AAd(C9iZ c9iZ2) {
                    }

                    @Override // X.C9sI, X.AbstractC07999si
                    public final String A0F(C9iZ c9iZ2, int i) {
                        return this.A03.get(i / 2);
                    }

                    @Override // X.C9sI, X.C9sO
                    public final /* bridge */ /* synthetic */ JsonElement A0G() {
                        return this.A01;
                    }

                    @Override // X.C9sI
                    /* renamed from: A0J */
                    public final JsonObject A0G() {
                        return this.A01;
                    }

                    @Override // X.C9sI, X.C9j4
                    public final int A8N(C9iZ c9iZ2) {
                        int i = this.A00;
                        if (i >= this.A02 - 1) {
                            return -1;
                        }
                        int i2 = i + 1;
                        this.A00 = i2;
                        return i2;
                    }
                };
            }
            sb = new StringBuilder("Expected ");
            cls2 = JsonObject.class;
            sb.append(C0861A6i.A01(cls2));
            sb.append(", but had ");
            sb.append(C0861A6i.A01(jsonElementA0H.getClass()));
            sb.append(" as the serialized body of ");
            sb.append(strAKP2);
        } else {
            C9sU c9sU2 = this.A01;
            strAKP = c9iZ.AKP();
            if (jsonElementA0H instanceof JsonObject) {
                return new C9sI(this.A00, null, c9sU2, (JsonObject) jsonElementA0H);
            }
            sb = new StringBuilder("Expected ");
            cls = JsonObject.class;
            sb.append(C0861A6i.A01(cls));
            sb.append(", but had ");
            sb.append(C0861A6i.A01(jsonElementA0H.getClass()));
            sb.append(" as the serialized body of ");
            sb.append(strAKP);
        }
        sb.append(" at element: ");
        sb.append(A0E());
        throw C9rA.A02(jsonElementA0H.toString(), sb.toString(), -1);
    }

    @Override // X.C9sK, X.InterfaceC07829iw
    public final <T> T A8b(C9jG<? extends T> c9jG) {
        C7384Etj.A0Y(c9jG, 0);
        if (c9jG instanceof C9hu) {
            C9sU c9sU = this.A01;
            if (!c9sU.A00.A0F) {
                C9hu c9hu = (C9hu) c9jG;
                String strA00 = C9r9.A00(c9hu.getDescriptor(), c9sU);
                JsonElement jsonElementA0H = A0H();
                String strAKP = c9hu.getDescriptor().AKP();
                if (!(jsonElementA0H instanceof JsonObject)) {
                    throw C9rA.A02(jsonElementA0H.toString(), FGI.A0l("Expected ", C0861A6i.A01(JsonObject.class), ", but had ", C0861A6i.A01(jsonElementA0H.getClass()), " as the serialized body of ", strAKP, " at element: ", A0E()), -1);
                }
                JsonObject jsonObject = (JsonObject) jsonElementA0H;
                JsonElement jsonElement = (JsonElement) jsonObject.get(strA00);
                String strA04 = jsonElement != null ? C9oY.A04(C9oY.A08(jsonElement)) : null;
                try {
                    C9jG c9jGA01 = c9hu.A01(strA04, this);
                    if (c9jGA01 != null) {
                        C7384Etj.A0Y(strA00, 1);
                        return (T) new C9sI(strA00, c9jGA01.getDescriptor(), c9sU, jsonObject).A8b(c9jGA01);
                    }
                    BHX.A00(strA04, c9hu.A00());
                    throw F60.createAndThrow();
                } catch (SerializationException e) {
                    String message = e.getMessage();
                    C7384Etj.A0X(message);
                    throw C9rA.A02(jsonObject.toString(), message, -1);
                }
            }
        }
        return c9jG.deserialize(this);
    }

    public void AAd(C9iZ c9iZ) {
    }

    public static final void A03(String str, String str2, JsonPrimitive jsonPrimitive, C9sO c9sO) {
        String strA0M = FGI.A0M(str.startsWith("i") ? "an " : "a ", str);
        StringBuilder sbA0f = C3cG.A0f(jsonPrimitive, "Failed to parse literal '");
        sbA0f.append("' as ");
        sbA0f.append(strA0M);
        sbA0f.append(" value at element: ");
        throw C9rA.A03(c9sO.A0H(), AnonymousClass001.A0v(C9sK.A01(str2, c9sO), sbA0f));
    }

    @Override // X.C9sK
    public final /* bridge */ /* synthetic */ double A0A(String str) throws NumberFormatException {
        String str2 = str;
        C7384Etj.A0Y(str2, 0);
        JsonElement jsonElementA0I = A0I(str2);
        if (!(jsonElementA0I instanceof JsonPrimitive)) {
            throw C9rA.A03(jsonElementA0I, FGI.A0j("Expected ", C0861A6i.A01(JsonPrimitive.class), ", but had ", C60O.A0n(jsonElementA0I), " as the serialized body of double at element: ", C9sK.A01(str2, this)));
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementA0I;
        try {
            C9iZ c9iZ = C9oY.A00;
            C7384Etj.A0Y(jsonPrimitive, 0);
            double d = Double.parseDouble(jsonPrimitive.A00());
            if (this.A01.A00.A04 || Math.abs(d) <= Double.MAX_VALUE) {
                return d;
            }
            Double dValueOf = Double.valueOf(d);
            String string = A0H().toString();
            C7384Etj.A0Y(string, 2);
            StringBuilder sbA0f = C3cG.A0f(dValueOf, "Unexpected special floating-point value ");
            sbA0f.append(" with key ");
            sbA0f.append(str2);
            throw new JsonDecodingException(C9rA.A01(string, sbA0f));
        } catch (IllegalArgumentException unused) {
            A03(BrowserOperationCatalogKt.DOUBLE, str2, jsonPrimitive, this);
            throw F60.createAndThrow();
        }
    }

    @Override // X.C9sK
    public final /* bridge */ /* synthetic */ String A0C(String str) {
        String strA0j;
        StringBuilder sb;
        String strA0O;
        String str2 = str;
        C7384Etj.A0Y(str2, 0);
        JsonElement jsonElementA0I = A0I(str2);
        if (jsonElementA0I instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementA0I;
            if (jsonPrimitive instanceof JsonLiteral) {
                JsonLiteral jsonLiteral = (JsonLiteral) jsonPrimitive;
                if (jsonLiteral.A02 || this.A01.A00.A0C) {
                    return jsonLiteral.A00;
                }
                sb = new StringBuilder("String literal for key '");
                sb.append(str2);
                sb.append("' should be quoted at element: ");
                sb.append(FGI.A0O(A0E(), str2, '.'));
                strA0O = ".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.";
            } else {
                sb = new StringBuilder("Expected string value for a non-null key '");
                sb.append(str2);
                sb.append("', got null literal instead at element: ");
                strA0O = FGI.A0O(A0E(), str2, '.');
            }
            sb.append(strA0O);
            strA0j = sb.toString();
            jsonElementA0I = A0H();
        } else {
            strA0j = FGI.A0j("Expected ", C0861A6i.A01(JsonPrimitive.class), ", but had ", C0861A6i.A01(jsonElementA0I.getClass()), " as the serialized body of string at element: ", FGI.A0O(A0E(), str2, '.'));
        }
        throw C9rA.A02(jsonElementA0I.toString(), strA0j, -1);
    }

    public JsonElement A0G() {
        return this instanceof C08079sq ? ((C08079sq) this).A01 : ((C08089sr) this).A00;
    }

    public final JsonElement A0H() {
        JsonElement jsonElementA0I;
        String str = (String) AbstractC0878AGe.A0I(super.A01);
        return (str == null || (jsonElementA0I = A0I(str)) == null) ? A0G() : jsonElementA0I;
    }

    @Override // X.BNA
    public final C9sU AGk() {
        return this.A01;
    }

    @Override // X.C9j4
    public final C07959pz AKT() {
        return this.A01.A02;
    }

    public C9sO(String str, C9sU c9sU, JsonElement jsonElement) {
        this.A01 = c9sU;
        this.A02 = jsonElement;
        this.A00 = str;
        this.A03 = c9sU.A00;
    }

    @Override // X.C9sK
    public final /* bridge */ /* synthetic */ long A0B(String str) {
        String strA13 = C8j3.A13(str);
        JsonElement jsonElementA0I = A0I(strA13);
        if (!(jsonElementA0I instanceof JsonPrimitive)) {
            throw C9rA.A03(jsonElementA0I, FGI.A0j("Expected ", C0861A6i.A01(JsonPrimitive.class), ", but had ", C60O.A0n(jsonElementA0I), " as the serialized body of long at element: ", C9sK.A01(strA13, this)));
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementA0I;
        try {
            return C9oY.A00(jsonPrimitive);
        } catch (IllegalArgumentException unused) {
            A03("long", strA13, jsonPrimitive, this);
            throw F60.createAndThrow();
        }
    }

    @Override // X.C9sK
    public final /* bridge */ /* synthetic */ boolean A0D(String str) {
        String strA13 = C8j3.A13(str);
        JsonElement jsonElementA0I = A0I(strA13);
        if (!(jsonElementA0I instanceof JsonPrimitive)) {
            throw C9rA.A03(jsonElementA0I, FGI.A0j("Expected ", C0861A6i.A01(JsonPrimitive.class), ", but had ", C60O.A0n(jsonElementA0I), " as the serialized body of boolean at element: ", C9sK.A01(strA13, this)));
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementA0I;
        try {
            Boolean boolA01 = C9oY.A01(jsonPrimitive);
            if (boolA01 != null) {
                return boolA01.booleanValue();
            }
            A03("boolean", strA13, jsonPrimitive, this);
            throw F60.createAndThrow();
        } catch (IllegalArgumentException unused) {
            A03("boolean", strA13, jsonPrimitive, this);
            throw F60.createAndThrow();
        }
    }

    @Override // X.BNA
    public final JsonElement A8V() {
        return A0H();
    }

    @Override // X.InterfaceC07829iw
    public boolean A8Y() {
        return !(A0H() instanceof JsonNull);
    }
}

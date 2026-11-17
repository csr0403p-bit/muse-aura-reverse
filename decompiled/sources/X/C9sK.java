package X;

import com.facebook.aura.bloks.extensions.visibility.AuraImpressionTimeTracker;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.json.internal.JsonDecodingException;

/* renamed from: X.9sK, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9sK<Tag> implements InterfaceC07829iw, C9j4 {
    public boolean A00;
    public final ArrayList<Tag> A01 = new ArrayList<>();

    public static String A02(C9iZ c9iZ, C9sK c9sK, int i) {
        C7384Etj.A0Y(c9iZ, 0);
        AbstractC07999si abstractC07999si = (AbstractC07999si) c9sK;
        String strA0F = abstractC07999si.A0F(c9iZ, i);
        C7384Etj.A0Y(strA0F, 0);
        AbstractC0878AGe.A0I(abstractC07999si.A01);
        return strA0F;
    }

    public abstract double A0A(Tag tag);

    public abstract long A0B(Tag tag);

    public abstract String A0C(Tag tag);

    public abstract boolean A0D(Tag tag);

    @Override // X.InterfaceC07829iw
    public final int A8O(C9iZ c9iZ) {
        C7384Etj.A0Y(c9iZ, 0);
        Object objA00 = A00(this);
        C9sO c9sO = (C9sO) this;
        String str = (String) objA00;
        C7384Etj.A0Y(str, 0);
        C9sU c9sU = c9sO.A01;
        JsonElement jsonElementA0I = c9sO.A0I(str);
        String strAKP = c9iZ.AKP();
        if (jsonElementA0I instanceof JsonPrimitive) {
            return C9sC.A00(((JsonPrimitive) jsonElementA0I).A00(), "", c9iZ, c9sU);
        }
        throw C9rA.A03(jsonElementA0I, FGI.A0l("Expected ", C0861A6i.A01(JsonPrimitive.class), ", but had ", C60O.A0n(jsonElementA0I), " as the serialized body of ", strAKP, " at element: ", A01(str, c9sO)));
    }

    @Override // X.C9j4
    public final Object A8Z(C9jG c9jG, C9iZ c9iZ, int i) {
        C7384Etj.A0Y(c9iZ, 0);
        C7384Etj.A0Y(c9jG, 2);
        AbstractC07999si abstractC07999si = (AbstractC07999si) this;
        String strA0F = abstractC07999si.A0F(c9iZ, i);
        C7384Etj.A0Y(strA0F, 0);
        AbstractC0878AGe.A0I(abstractC07999si.A01);
        this.A01.add(strA0F);
        Object objA8b = (c9jG.getDescriptor().AOo() || A8Y()) ? A8b(c9jG) : null;
        if (!this.A00) {
            A00(this);
        }
        this.A00 = false;
        return objA8b;
    }

    @Override // X.C9j4
    public final Object A8a(C9jG c9jG, C9iZ c9iZ, int i) {
        C7384Etj.A0Y(c9iZ, 0);
        C7384Etj.A0Y(c9jG, 2);
        AbstractC07999si abstractC07999si = (AbstractC07999si) this;
        String strA0F = abstractC07999si.A0F(c9iZ, i);
        C7384Etj.A0Y(strA0F, 0);
        AbstractC0878AGe.A0I(abstractC07999si.A01);
        this.A01.add(strA0F);
        Object objA8b = A8b(c9jG);
        if (!this.A00) {
            A00(this);
        }
        this.A00 = false;
        return objA8b;
    }

    @Override // X.InterfaceC07829iw
    public abstract /* synthetic */ Object A8b(C9jG c9jG);

    @Override // X.C9j4
    public final String A8f(C9iZ c9iZ, int i) {
        C7384Etj.A0Y(c9iZ, 0);
        AbstractC07999si abstractC07999si = (AbstractC07999si) this;
        String strA0F = abstractC07999si.A0F(c9iZ, i);
        C7384Etj.A0Y(strA0F, 0);
        AbstractC0878AGe.A0I(abstractC07999si.A01);
        return A0C(strA0F);
    }

    public static final Object A00(C9sK c9sK) {
        Tag tagRemove = c9sK.A01.remove(r1.size() - 1);
        c9sK.A00 = true;
        return tagRemove;
    }

    private final byte A04(Tag tag) {
        C9sO c9sO = (C9sO) this;
        String strA13 = C8j3.A13(tag);
        JsonElement jsonElementA0I = c9sO.A0I(strA13);
        if (!(jsonElementA0I instanceof JsonPrimitive)) {
            throw C9rA.A03(jsonElementA0I, FGI.A0j("Expected ", C0861A6i.A01(JsonPrimitive.class), ", but had ", C60O.A0n(jsonElementA0I), " as the serialized body of byte at element: ", A01(strA13, c9sO)));
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementA0I;
        try {
            long jA00 = C9oY.A00(jsonPrimitive);
            if (-128 <= jA00 && jA00 <= 127) {
                return (byte) jA00;
            }
            C9sO.A03("byte", strA13, jsonPrimitive, c9sO);
            throw F60.createAndThrow();
        } catch (IllegalArgumentException unused) {
            C9sO.A03("byte", strA13, jsonPrimitive, c9sO);
            throw F60.createAndThrow();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final char A05(Tag tag) {
        C9sO c9sO = (C9sO) this;
        String str = (String) tag;
        C7384Etj.A0Y(str, 0);
        JsonElement jsonElementA0I = c9sO.A0I(str);
        if (!(jsonElementA0I instanceof JsonPrimitive)) {
            throw C9rA.A03(jsonElementA0I, FGI.A0j("Expected ", C0861A6i.A01(JsonPrimitive.class), ", but had ", C60O.A0n(jsonElementA0I), " as the serialized body of char at element: ", A01(str, c9sO)));
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementA0I;
        try {
            String strA00 = jsonPrimitive.A00();
            int iA0J = C8j3.A0J(strA00, 0);
            if (iA0J == 0) {
                throw new NoSuchElementException("Char sequence is empty.");
            }
            if (iA0J == 1) {
                return strA00.charAt(0);
            }
            throw C60O.A0i("Char sequence has more than one element.");
        } catch (IllegalArgumentException unused) {
            C9sO.A03("char", str, jsonPrimitive, c9sO);
            throw F60.createAndThrow();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final float A06(Tag tag) throws NumberFormatException {
        C9sO c9sO = (C9sO) this;
        String str = (String) tag;
        C7384Etj.A0Y(str, 0);
        JsonElement jsonElementA0I = c9sO.A0I(str);
        if (!(jsonElementA0I instanceof JsonPrimitive)) {
            throw C9rA.A03(jsonElementA0I, FGI.A0j("Expected ", C0861A6i.A01(JsonPrimitive.class), ", but had ", C60O.A0n(jsonElementA0I), " as the serialized body of float at element: ", A01(str, c9sO)));
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementA0I;
        try {
            C9iZ c9iZ = C9oY.A00;
            C7384Etj.A0Y(jsonPrimitive, 0);
            float f = Float.parseFloat(jsonPrimitive.A00());
            if (c9sO.A01.A00.A04 || Math.abs(f) <= Float.MAX_VALUE) {
                return f;
            }
            Float fValueOf = Float.valueOf(f);
            String string = c9sO.A0H().toString();
            C7384Etj.A0Y(string, 2);
            StringBuilder sbA0f = C3cG.A0f(fValueOf, "Unexpected special floating-point value ");
            sbA0f.append(" with key ");
            sbA0f.append(str);
            throw new JsonDecodingException(C9rA.A01(string, sbA0f));
        } catch (IllegalArgumentException unused) {
            C9sO.A03("float", str, jsonPrimitive, c9sO);
            throw F60.createAndThrow();
        }
    }

    private final int A07(Tag tag) {
        C9sO c9sO = (C9sO) this;
        String strA13 = C8j3.A13(tag);
        JsonElement jsonElementA0I = c9sO.A0I(strA13);
        if (!(jsonElementA0I instanceof JsonPrimitive)) {
            throw C9rA.A03(jsonElementA0I, FGI.A0j("Expected ", C0861A6i.A01(JsonPrimitive.class), ", but had ", C60O.A0n(jsonElementA0I), " as the serialized body of int at element: ", A01(strA13, c9sO)));
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementA0I;
        try {
            long jA00 = C9oY.A00(jsonPrimitive);
            if (AuraImpressionTimeTracker.UNKNOWN_TIME <= jA00 && jA00 <= 2147483647L) {
                return (int) jA00;
            }
            C9sO.A03("int", strA13, jsonPrimitive, c9sO);
            throw F60.createAndThrow();
        } catch (IllegalArgumentException unused) {
            C9sO.A03("int", strA13, jsonPrimitive, c9sO);
            throw F60.createAndThrow();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final InterfaceC07829iw A08(Tag tag, C9iZ c9iZ) {
        C9sO c9sO = (C9sO) this;
        String str = (String) tag;
        boolean zA1Y = C60P.A1Y(str, c9iZ);
        Set<C9iZ> set = C9oB.A00;
        if (!c9iZ.isInline() || !C9oB.A00.contains(c9iZ)) {
            ((C9sK) c9sO).A01.add(str);
            return c9sO;
        }
        C9sU c9sU = c9sO.A01;
        JsonElement jsonElementA0I = c9sO.A0I(str);
        String strAKP = c9iZ.AKP();
        if (!(jsonElementA0I instanceof JsonPrimitive)) {
            throw C9rA.A03(jsonElementA0I, FGI.A0l("Expected ", C0861A6i.A01(JsonPrimitive.class), ", but had ", C60O.A0n(jsonElementA0I), " as the serialized body of ", strAKP, " at element: ", A01(str, c9sO)));
        }
        String strA00 = ((JsonPrimitive) jsonElementA0I).A00();
        C7384Etj.A0Y(strA00, zA1Y ? 1 : 0);
        return new C9sY(c9sU, !c9sU.A00.A03 ? new C9sW(strA00) : new C9sg(strA00));
    }

    private final short A09(Tag tag) {
        C9sO c9sO = (C9sO) this;
        String strA13 = C8j3.A13(tag);
        JsonElement jsonElementA0I = c9sO.A0I(strA13);
        if (!(jsonElementA0I instanceof JsonPrimitive)) {
            throw C9rA.A03(jsonElementA0I, FGI.A0j("Expected ", C0861A6i.A01(JsonPrimitive.class), ", but had ", C60O.A0n(jsonElementA0I), " as the serialized body of short at element: ", A01(strA13, c9sO)));
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementA0I;
        try {
            long jA00 = C9oY.A00(jsonPrimitive);
            if (-32768 <= jA00 && jA00 <= 32767) {
                return (short) jA00;
            }
            C9sO.A03("short", strA13, jsonPrimitive, c9sO);
            throw F60.createAndThrow();
        } catch (IllegalArgumentException unused) {
            C9sO.A03("short", strA13, jsonPrimitive, c9sO);
            throw F60.createAndThrow();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC07829iw
    public final InterfaceC07829iw A8R(C9iZ c9iZ) {
        C9sO c9sO = (C9sO) this;
        C7384Etj.A0Y(c9iZ, 0);
        if (AbstractC0878AGe.A0I(((C9sK) c9sO).A01) != null) {
            return c9sO.A08(A00(c9sO), c9iZ);
        }
        return new C08089sr(c9sO.A00, c9sO.A01, c9sO.A0G()).A8R(c9iZ);
    }

    public static String A01(String str, AbstractC07999si abstractC07999si) {
        return FGI.A0O(abstractC07999si.A0E(), str, '.');
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC07829iw
    public final boolean A8F() {
        return A0D(A00(this));
    }

    @Override // X.C9j4
    public final boolean A8G(C9iZ c9iZ, int i) {
        return A0D(A02(c9iZ, this, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC07829iw
    public final byte A8H() {
        return A04(A00(this));
    }

    @Override // X.C9j4
    public final byte A8I(C9iZ c9iZ, int i) {
        return A04(A02(c9iZ, this, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC07829iw
    public final char A8J() {
        return A05(A00(this));
    }

    @Override // X.C9j4
    public final char A8K(C9iZ c9iZ, int i) {
        return A05(A02(c9iZ, this, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC07829iw
    public final double A8L() {
        return A0A(A00(this));
    }

    @Override // X.C9j4
    public final double A8M(C9iZ c9iZ, int i) {
        return A0A(A02(c9iZ, this, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC07829iw
    public final float A8P() {
        return A06(A00(this));
    }

    @Override // X.C9j4
    public final float A8Q(C9iZ c9iZ, int i) {
        return A06(A02(c9iZ, this, i));
    }

    @Override // X.C9j4
    public final InterfaceC07829iw A8S(C9iZ c9iZ, int i) {
        return A08(A02(c9iZ, this, i), c9iZ.AF3(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC07829iw
    public final int A8T() {
        return A07(A00(this));
    }

    @Override // X.C9j4
    public final int A8U(C9iZ c9iZ, int i) {
        return A07(A02(c9iZ, this, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC07829iw
    public final long A8W() {
        return A0B(A00(this));
    }

    @Override // X.C9j4
    public final long A8X(C9iZ c9iZ, int i) {
        return A0B(A02(c9iZ, this, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC07829iw
    public final short A8c() {
        return A09(A00(this));
    }

    @Override // X.C9j4
    public final short A8d(C9iZ c9iZ, int i) {
        return A09(A02(c9iZ, this, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC07829iw
    public final String A8e() {
        return A0C(A00(this));
    }
}

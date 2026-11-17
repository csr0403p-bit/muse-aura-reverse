package X;

import com.facebook.aura.localbrowser.core.BrowserOperationCatalogKt;
import java.util.ArrayList;
import kotlin.Unit;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.internal.JsonEncodingException;

/* renamed from: X.9sN, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9sN extends AbstractC08149sx implements C9i4 {
    public String A00;
    public String A01;
    public final G0U<JsonElement, Unit> A02;
    public final C9sU A03;
    public final C9sa A04;

    @Override // X.AbstractC08149sx
    public String A05(C9iZ c9iZ, int i) {
        C7384Etj.A0Y(c9iZ, 0);
        C7384Etj.areEqual(c9iZ.AGs(), C9iN.A00);
        return c9iZ.AF5(i);
    }

    @Override // X.InterfaceC07789is
    public final C9j5 A56(C9iZ c9iZ) {
        C9sN c9sM;
        C7384Etj.A0Y(c9iZ, 0);
        final G0U c2291BSr = AbstractC0878AGe.A0I(super.A00) == null ? this.A02 : new C2291BSr(this, 3);
        BL8 bl8AGs = c9iZ.AGs();
        if (C7384Etj.areEqual(bl8AGs, C9tD.A00) || (bl8AGs instanceof C9hz)) {
            final C9sU c9sU = this.A03;
            c9sM = new C9sN(c2291BSr, c9sU) { // from class: X.9sj
                public final ArrayList<JsonElement> A00 = new ArrayList<>();

                @Override // X.C9sN
                public final void A07(String str, JsonElement jsonElement) throws NumberFormatException {
                    C7384Etj.A0Y(str, 0);
                    C7384Etj.A0Y(jsonElement, 1);
                    this.A00.add(Integer.parseInt(str), jsonElement);
                }

                @Override // X.C9sN
                public final JsonElement A06() {
                    return new JsonArray(this.A00);
                }

                @Override // X.C9sN, X.AbstractC08149sx
                public final String A05(C9iZ c9iZ2, int i) {
                    return String.valueOf(i);
                }
            };
        } else if (C7384Etj.areEqual(bl8AGs, C9tE.A00)) {
            final C9sU c9sU2 = this.A03;
            C9iZ c9iZA00 = C9sV.A00(c9iZ.AF3(0), c9sU2.A02);
            BL8 bl8AGs2 = c9iZA00.AGs();
            if ((bl8AGs2 instanceof AbstractC07679ic) || C7384Etj.areEqual(bl8AGs2, C9i9.A00)) {
                C9r8 c9r8 = new C9r8(c2291BSr, c9sU2);
                c9r8.A00 = true;
                c9sM = c9r8;
            } else {
                if (!c9sU2.A00.A05) {
                    throw C9rA.A04(c9iZA00);
                }
                c9sM = new C9sN(c2291BSr, c9sU2) { // from class: X.9sj
                    public final ArrayList<JsonElement> A00 = new ArrayList<>();

                    @Override // X.C9sN
                    public final void A07(String str, JsonElement jsonElement) throws NumberFormatException {
                        C7384Etj.A0Y(str, 0);
                        C7384Etj.A0Y(jsonElement, 1);
                        this.A00.add(Integer.parseInt(str), jsonElement);
                    }

                    @Override // X.C9sN
                    public final JsonElement A06() {
                        return new JsonArray(this.A00);
                    }

                    @Override // X.C9sN, X.AbstractC08149sx
                    public final String A05(C9iZ c9iZ2, int i) {
                        return String.valueOf(i);
                    }
                };
            }
        } else {
            c9sM = new C9sM(c2291BSr, this.A03);
        }
        String str = this.A00;
        if (str != null) {
            if (c9sM instanceof C9r8) {
                c9sM.A07("key", C9oY.A07(str));
                String strAKP = this.A01;
                if (strAKP == null) {
                    strAKP = c9iZ.AKP();
                }
                c9sM.A07(BrowserOperationCatalogKt.VALUE, C9oY.A07(strAKP));
            } else {
                String strAKP2 = this.A01;
                if (strAKP2 == null) {
                    strAKP2 = c9iZ.AKP();
                }
                c9sM.A07(str, C9oY.A07(strAKP2));
            }
            this.A00 = null;
            this.A01 = null;
        }
        return c9sM;
    }

    @Override // X.C9i4
    public final void AAL(JsonElement jsonElement) {
        C7384Etj.A0Y(jsonElement, 0);
        if (this.A00 != null && !(jsonElement instanceof JsonObject)) {
            throw new JsonEncodingException(FGI.A0h("Class with serial name ", this.A01, " cannot be serialized polymorphically because it is represented as ", C60O.A0n(jsonElement), ". Make sure that its JsonTransformingSerializer returns JsonObject, so class discriminator can be added to it."));
        }
        AAR(jsonElement, JsonElementSerializer.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x009b, code lost:
    
        if (X.C7384Etj.areEqual(r1, X.C9iE.A00) == false) goto L25;
     */
    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(LX/9hv<-TT;>;TT;)V */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a8  */
    @Override // X.C9sL, X.InterfaceC07789is
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AAR(java.lang.Object r6, X.C9hv r7) {
        /*
            r5 = this;
            r4 = 0
            X.C7384Etj.A0Y(r7, r4)
            java.util.ArrayList<Tag> r0 = r5.A00
            java.lang.Object r0 = X.AbstractC0878AGe.A0I(r0)
            if (r0 != 0) goto L3a
            X.9iZ r1 = r7.getDescriptor()
            X.9sU r3 = r5.A03
            X.9pz r0 = r3.A02
            X.9iZ r1 = X.C9sV.A00(r1, r0)
            X.BL8 r0 = r1.AGs()
            boolean r0 = r0 instanceof X.AbstractC07679ic
            if (r0 != 0) goto L28
            X.BL8 r1 = r1.AGs()
            X.9i9 r0 = X.C9i9.A00
            if (r1 != r0) goto L3a
        L28:
            X.G0U<kotlinx.serialization.json.JsonElement, kotlin.Unit> r0 = r5.A02
            X.9t2 r2 = new X.9t2
            r2.<init>(r0, r3)
            java.lang.String r1 = "primitive"
            java.util.ArrayList<Tag> r0 = r2.A00
            r0.add(r1)
            r2.AAR(r6, r7)
            return
        L3a:
            X.9sU r3 = r5.A03
            X.9sa r1 = r3.A00
            boolean r0 = r1.A0F
            if (r0 != 0) goto L75
            boolean r2 = r7 instanceof X.C9hu
            java.lang.Integer r1 = r1.A00
            if (r2 == 0) goto L79
            java.lang.Integer r0 = X.C79.A00
            if (r1 != r0) goto L9d
            r3 = 0
        L4d:
            r2 = r7
            X.9hu r2 = (X.C9hu) r2
            if (r6 == 0) goto La8
            X.9hv r1 = X.C9ht.A00(r6, r5, r2)
            if (r3 == 0) goto L66
            X.C9r9.A01(r3, r7, r1)
            X.9iZ r0 = r1.getDescriptor()
            X.BL8 r0 = r0.AGs()
            X.C9r9.A02(r0)
        L66:
            r7 = r1
        L67:
            if (r3 == 0) goto L75
            X.9iZ r0 = r7.getDescriptor()
            java.lang.String r0 = r0.AKP()
            r5.A00 = r3
            r5.A01 = r0
        L75:
            r7.serialize(r5, r6)
            return
        L79:
            int r1 = r1.intValue()
            if (r1 == r4) goto L75
            r0 = 2
            if (r1 == r0) goto L75
            r0 = 1
            if (r1 != r0) goto Lc5
            X.9iZ r0 = r7.getDescriptor()
            X.BL8 r1 = r0.AGs()
            X.9iN r0 = X.C9iN.A00
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 != 0) goto L9d
            X.9iE r0 = X.C9iE.A00
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 == 0) goto L75
        L9d:
            X.9iZ r0 = r7.getDescriptor()
            java.lang.String r3 = X.C9r9.A00(r0, r3)
            if (r2 == 0) goto L67
            goto L4d
        La8:
            java.lang.String r0 = "Value for serializer "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            X.9iZ r0 = r2.getDescriptor()
            r1.append(r0)
            java.lang.String r0 = " should always be non-null. Please report issue to the kotlinx.serialization tracker."
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        Lc5:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9sN.AAR(java.lang.Object, X.9hv):void");
    }

    public JsonElement A06() {
        JsonElement jsonElement = ((C9t2) this).A00;
        if (jsonElement != null) {
            return jsonElement;
        }
        throw C60O.A0i("Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?");
    }

    public void A07(String str, JsonElement jsonElement) {
        C9t2 c9t2 = (C9t2) this;
        AnonymousClass003.A0u(str, jsonElement);
        if (str != "primitive") {
            throw C60O.A0i("This output can only consume primitives with 'primitive' tag");
        }
        if (c9t2.A00 != null) {
            throw C60O.A0i("Primitive element was already recorded. Does call to .encodeXxx happen more than once?");
        }
        c9t2.A00 = jsonElement;
        c9t2.A02.invoke(jsonElement);
    }

    @Override // X.InterfaceC07789is
    public final void AAO() {
        String str = (String) AbstractC0878AGe.A0I(super.A00);
        if (str == null) {
            this.A02.invoke(JsonNull.A00);
        } else {
            A07(str, JsonNull.A00);
        }
    }

    @Override // X.C9i4
    public final C9sU AGk() {
        return this.A03;
    }

    @Override // X.InterfaceC07789is
    public final C07959pz AKT() {
        return this.A03.A02;
    }

    @Override // X.C9j5
    public final boolean AfR() {
        return this.A04.A09;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/9sU;LX/G0U<-Lkotlinx/serialization/json/JsonElement;Lkotlin/Unit;>;)V */
    public C9sN(G0U g0u, C9sU c9sU) {
        this.A03 = c9sU;
        this.A02 = g0u;
        this.A04 = c9sU.A00;
    }
}

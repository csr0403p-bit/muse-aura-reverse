package X;

import com.facebook.aura.maps.model.HatchMapSceneKt;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.internal.JsonEncodingException;

/* renamed from: X.9sQ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9sQ extends C9jJ implements C9i4 {
    public String A00;
    public String A01;
    public boolean A02;
    public final C9sU A03;
    public final C9sa A04;
    public final C08029sl A05;
    public final C9sh A06;
    public final C07959pz A07;
    public final C9i4[] A08;

    public C9sQ(C9sU c9sU, C08029sl c08029sl, C9sh c9sh, C9i4[] c9i4Arr) {
        C7384Etj.A0Y(c08029sl, 0);
        C7384Etj.A0Y(c9sU, 1);
        C7384Etj.A0Y(c9sh, 2);
        this.A05 = c08029sl;
        this.A03 = c9sU;
        this.A06 = c9sh;
        this.A08 = c9i4Arr;
        this.A07 = c9sU.A02;
        this.A04 = c9sU.A00;
        int iOrdinal = c9sh.ordinal();
        if (c9i4Arr != null) {
            c9i4Arr[iOrdinal] = this;
        }
    }

    @Override // X.C9jJ
    public final boolean A05(C9iZ c9iZ, int i) {
        C08029sl c08029sl;
        C7384Etj.A0Y(c9iZ, 0);
        int iOrdinal = this.A06.ordinal();
        if (iOrdinal != 1) {
            boolean z = false;
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    C08029sl c08029sl2 = this.A05;
                    if (!c08029sl2.A00) {
                        c08029sl2.A01.Aig(',');
                    }
                    c08029sl2.A01();
                    C7384Etj.A0Y(this.A03, 1);
                    C7384Etj.areEqual(c9iZ.AGs(), C9iN.A00);
                    AAU(c9iZ.AF5(i));
                    c08029sl2.A01.Aig(HatchMapSceneKt.ARTIFACT_ID_SEPARATOR);
                    c08029sl2.A03();
                } else {
                    if (i == 0) {
                        this.A02 = true;
                        return true;
                    }
                    if (i == 1) {
                        C08029sl c08029sl3 = this.A05;
                        c08029sl3.A01.Aig(',');
                        c08029sl3.A03();
                        this.A02 = false;
                        return true;
                    }
                }
                return true;
            }
            c08029sl = this.A05;
            if (!c08029sl.A00) {
                if (i % 2 == 0) {
                    c08029sl.A01.Aig(',');
                    c08029sl.A01();
                    z = true;
                } else {
                    c08029sl.A01.Aig(HatchMapSceneKt.ARTIFACT_ID_SEPARATOR);
                    c08029sl.A03();
                }
                this.A02 = z;
                return true;
            }
            this.A02 = true;
        } else {
            c08029sl = this.A05;
            if (!c08029sl.A00) {
                c08029sl.A01.Aig(',');
            }
        }
        c08029sl.A01();
        return true;
    }

    @Override // X.C9jJ, X.InterfaceC07789is
    public final C9j5 A56(C9iZ c9iZ) {
        C9i4 c9i4;
        C7384Etj.A0Y(c9iZ, 0);
        C9sU c9sU = this.A03;
        C9sh c9shA01 = C9sV.A01(c9iZ, c9sU);
        char c = c9shA01.begin;
        if (c != 0) {
            C08029sl c08029sl = this.A05;
            c08029sl.A01.Aig(c);
            c08029sl.A00();
        }
        String str = this.A00;
        if (str != null) {
            String strAKP = this.A01;
            if (strAKP == null) {
                strAKP = c9iZ.AKP();
            }
            C08029sl c08029sl2 = this.A05;
            c08029sl2.A01();
            AAU(str);
            c08029sl2.A01.Aig(HatchMapSceneKt.ARTIFACT_ID_SEPARATOR);
            c08029sl2.A03();
            AAU(strAKP);
            this.A00 = null;
            this.A01 = null;
        }
        if (this.A06 == c9shA01) {
            return this;
        }
        C9i4[] c9i4Arr = this.A08;
        return (c9i4Arr == null || (c9i4 = c9i4Arr[c9shA01.ordinal()]) == null) ? new C9sQ(c9sU, this.A05, c9shA01, c9i4Arr) : c9i4;
    }

    @Override // X.C9i4
    public final void AAL(JsonElement jsonElement) {
        C7384Etj.A0Y(jsonElement, 0);
        if (this.A00 != null && !(jsonElement instanceof JsonObject)) {
            throw new JsonEncodingException(FGI.A0h("Class with serial name ", this.A01, " cannot be serialized polymorphically because it is represented as ", C60O.A0n(jsonElement), ". Make sure that its JsonTransformingSerializer returns JsonObject, so class discriminator can be added to it."));
        }
        AAR(jsonElement, JsonElementSerializer.A00);
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(LX/9iZ;ILX/9hv<-TT;>;TT;)V */
    @Override // X.C9jJ, X.C9j5
    public final void AAP(Object obj, C9hv c9hv, C9iZ c9iZ, int i) {
        C7384Etj.A0Y(c9iZ, 0);
        C7384Etj.A0Y(c9hv, 2);
        if (obj != null || this.A04.A0A) {
            super.AAP(obj, c9hv, c9iZ, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
    
        if (X.C7384Etj.areEqual(r1, X.C9iE.A00) == false) goto L17;
     */
    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(LX/9hv<-TT;>;TT;)V */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0072  */
    @Override // X.C9jJ, X.InterfaceC07789is
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AAR(java.lang.Object r6, X.C9hv r7) {
        /*
            r5 = this;
            r4 = 0
            X.C7384Etj.A0Y(r7, r4)
            X.9sU r3 = r5.A03
            X.9sa r1 = r3.A00
            boolean r0 = r1.A0F
            if (r0 != 0) goto L3f
            boolean r2 = r7 instanceof X.C9hu
            java.lang.Integer r1 = r1.A00
            if (r2 == 0) goto L43
            java.lang.Integer r0 = X.C79.A00
            if (r1 != r0) goto L67
            r3 = 0
        L17:
            r2 = r7
            X.9hu r2 = (X.C9hu) r2
            if (r6 == 0) goto L72
            X.9hv r1 = X.C9ht.A00(r6, r5, r2)
            if (r3 == 0) goto L30
            X.C9r9.A01(r3, r7, r1)
            X.9iZ r0 = r1.getDescriptor()
            X.BL8 r0 = r0.AGs()
            X.C9r9.A02(r0)
        L30:
            r7 = r1
        L31:
            if (r3 == 0) goto L3f
            X.9iZ r0 = r7.getDescriptor()
            java.lang.String r0 = r0.AKP()
            r5.A00 = r3
            r5.A01 = r0
        L3f:
            r7.serialize(r5, r6)
            return
        L43:
            int r1 = r1.intValue()
            if (r1 == r4) goto L3f
            r0 = 2
            if (r1 == r0) goto L3f
            r0 = 1
            if (r1 != r0) goto L8f
            X.9iZ r0 = r7.getDescriptor()
            X.BL8 r1 = r0.AGs()
            X.9iN r0 = X.C9iN.A00
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 != 0) goto L67
            X.9iE r0 = X.C9iE.A00
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 == 0) goto L3f
        L67:
            X.9iZ r0 = r7.getDescriptor()
            java.lang.String r3 = X.C9r9.A00(r0, r3)
            if (r2 == 0) goto L31
            goto L17
        L72:
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
        L8f:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9sQ.AAR(java.lang.Object, X.9hv):void");
    }

    @Override // X.C9jJ, X.InterfaceC07789is
    public final void AAU(String str) {
        C7384Etj.A0Y(str, 0);
        this.A05.A05(str);
    }

    @Override // X.C9jJ, X.C9j5
    public final void AAd(C9iZ c9iZ) {
        C9sh c9sh = this.A06;
        if (c9sh.end != 0) {
            C08029sl c08029sl = this.A05;
            c08029sl.A04();
            c08029sl.A02();
            c08029sl.A01.Aig(c9sh.end);
        }
    }

    @Override // X.C9i4
    public final C9sU AGk() {
        return this.A03;
    }

    @Override // X.InterfaceC07789is
    public final C07959pz AKT() {
        return this.A07;
    }

    @Override // X.C9jJ, X.C9j5
    public final boolean AfR() {
        return this.A04.A09;
    }
}

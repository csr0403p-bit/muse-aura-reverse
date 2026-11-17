package com.facebook.aura.gateway;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class PurchasePreapprovalJson extends C06G {
    public static final int $stable = 8;
    public final PurchasePreapprovalTotalJson max_total;
    public final List<PurchasePreapprovalRowJson> rows;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1X(C79.A01, PurchasePreapprovalJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<PurchasePreapprovalJson> serializer() {
            return PurchasePreapprovalJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PurchasePreapprovalJson) {
                PurchasePreapprovalJson purchasePreapprovalJson = (PurchasePreapprovalJson) obj;
                if (!C7384Etj.areEqual(this.rows, purchasePreapprovalJson.rows) || !C7384Etj.areEqual(this.max_total, purchasePreapprovalJson.max_total)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PurchasePreapprovalJson copy$default(PurchasePreapprovalJson purchasePreapprovalJson, List list, PurchasePreapprovalTotalJson purchasePreapprovalTotalJson, int i, Object obj) {
        if ((i & 1) != 0) {
            list = purchasePreapprovalJson.rows;
        }
        if ((i & 2) != 0) {
            purchasePreapprovalTotalJson = purchasePreapprovalJson.max_total;
        }
        return new PurchasePreapprovalJson(list, purchasePreapprovalTotalJson);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(PurchasePreapprovalJson purchasePreapprovalJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || purchasePreapprovalJson.rows != null) {
            c9j5.AAP(purchasePreapprovalJson.rows, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
        if (zAfR || purchasePreapprovalJson.max_total != null) {
            c9j5.AAP(purchasePreapprovalJson.max_total, PurchasePreapprovalTotalJson$$serializer.INSTANCE, c9iZ, 1);
        }
    }

    public final List<PurchasePreapprovalRowJson> component1() {
        return this.rows;
    }

    public final PurchasePreapprovalTotalJson component2() {
        return this.max_total;
    }

    public final PurchasePreapprovalJson copy(List<PurchasePreapprovalRowJson> list, PurchasePreapprovalTotalJson purchasePreapprovalTotalJson) {
        return new PurchasePreapprovalJson(list, purchasePreapprovalTotalJson);
    }

    public final PurchasePreapprovalTotalJson getMax_total() {
        return this.max_total;
    }

    public final List<PurchasePreapprovalRowJson> getRows() {
        return this.rows;
    }

    public int hashCode() {
        return (AnonymousClass006.A0D(this.rows) * 31) + C3cH.A02(this.max_total);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0042 A[PHI: r2
  0x0042: PHI (r2v2 java.lang.String) = (r2v0 java.lang.String), (r2v3 java.lang.String) binds: [B:19:0x0040, B:17:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.gateway.PurchasePreapproval toDomain() {
        /*
            r6 = this;
            java.util.List<com.facebook.aura.gateway.PurchasePreapprovalRowJson> r0 = r6.rows
            if (r0 != 0) goto L6
            X.AGi r0 = X.C0881AGi.A00
        L6:
            java.util.ArrayList r5 = X.AnonymousClass003.A0i(r0)
            java.util.Iterator r4 = r0.iterator()
        Le:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L2d
            java.lang.Object r3 = r4.next()
            com.facebook.aura.gateway.PurchasePreapprovalRowJson r3 = (com.facebook.aura.gateway.PurchasePreapprovalRowJson) r3
            com.facebook.aura.gateway.PurchasePreapprovalRowKind$Companion r1 = com.facebook.aura.gateway.PurchasePreapprovalRowKind.Companion
            java.lang.String r0 = r3.kind
            com.facebook.aura.gateway.PurchasePreapprovalRowKind r2 = r1.fromWire(r0)
            java.lang.String r1 = r3.text
            com.facebook.aura.gateway.PurchasePreapprovalRow r0 = new com.facebook.aura.gateway.PurchasePreapprovalRow
            r0.<init>(r2, r1)
            r5.add(r0)
            goto Le
        L2d:
            com.facebook.aura.gateway.PurchasePreapprovalTotalJson r0 = r6.max_total
            r4 = 0
            if (r0 == 0) goto L34
            java.lang.String r4 = r0.label
        L34:
            java.lang.String r3 = ""
            if (r4 != 0) goto L39
            r4 = r3
        L39:
            if (r0 == 0) goto L3f
            java.lang.String r2 = r0.caption
            if (r2 != 0) goto L42
        L3f:
            r2 = r3
            if (r0 == 0) goto L47
        L42:
            java.lang.String r0 = r0.value
            if (r0 == 0) goto L47
            r3 = r0
        L47:
            com.facebook.aura.gateway.PurchasePreapprovalTotal r1 = new com.facebook.aura.gateway.PurchasePreapprovalTotal
            r1.<init>(r4, r2, r3)
            com.facebook.aura.gateway.PurchasePreapproval r0 = new com.facebook.aura.gateway.PurchasePreapproval
            r0.<init>(r5, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.PurchasePreapprovalJson.toDomain():com.facebook.aura.gateway.PurchasePreapproval");
    }

    public PurchasePreapprovalJson(List<PurchasePreapprovalRowJson> list, PurchasePreapprovalTotalJson purchasePreapprovalTotalJson) {
        this.rows = list;
        this.max_total = purchasePreapprovalTotalJson;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PurchasePreapprovalJson(int i, List list, PurchasePreapprovalTotalJson purchasePreapprovalTotalJson, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.rows = null;
        } else {
            this.rows = list;
        }
        if ((i & 2) == 0) {
            this.max_total = null;
        } else {
            this.max_total = purchasePreapprovalTotalJson;
        }
    }

    public /* synthetic */ PurchasePreapprovalJson(List list, PurchasePreapprovalTotalJson purchasePreapprovalTotalJson, int i, C06H c06h) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : purchasePreapprovalTotalJson);
    }

    public PurchasePreapprovalJson() {
        this(null, null);
    }
}

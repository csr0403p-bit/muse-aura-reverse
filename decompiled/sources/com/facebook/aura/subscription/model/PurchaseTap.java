package com.facebook.aura.subscription.model;

import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C3cH;
import X.C7384Etj;
import java.util.Map;

/* loaded from: classes4.dex */
public final class PurchaseTap extends C06G {
    public static final int $stable = 0;
    public final boolean isPaidTier;
    public final String payDirection;
    public final Map<String, String> payMetadata;
    public final Map<String, String> priceEventData;
    public final String selectedId;
    public final Long selectedTier;

    public final PurchaseTap copy(String str, Long l, Map<String, String> map, String str2, Map<String, String> map2, boolean z) {
        C7384Etj.A0Y(map, 2);
        return new PurchaseTap(str, l, map, str2, map2, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PurchaseTap) {
                PurchaseTap purchaseTap = (PurchaseTap) obj;
                if (!C7384Etj.areEqual(this.selectedId, purchaseTap.selectedId) || !C7384Etj.areEqual(this.selectedTier, purchaseTap.selectedTier) || !C7384Etj.areEqual(this.payMetadata, purchaseTap.payMetadata) || !C7384Etj.areEqual(this.payDirection, purchaseTap.payDirection) || !C7384Etj.areEqual(this.priceEventData, purchaseTap.priceEventData) || this.isPaidTier != purchaseTap.isPaidTier) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ PurchaseTap(String str, Long l, Map map, String str2, Map map2, boolean z, int i, C06H c06h) {
        this(str, l, map, str2, (i & 16) != 0 ? null : map2, AnonymousClass002.A1R(i, z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PurchaseTap copy$default(PurchaseTap purchaseTap, String str, Long l, Map map, String str2, Map map2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = purchaseTap.selectedId;
        }
        if ((i & 2) != 0) {
            l = purchaseTap.selectedTier;
        }
        if ((i & 4) != 0) {
            map = purchaseTap.payMetadata;
        }
        if ((i & 8) != 0) {
            str2 = purchaseTap.payDirection;
        }
        if ((i & 16) != 0) {
            map2 = purchaseTap.priceEventData;
        }
        if ((i & 32) != 0) {
            z = purchaseTap.isPaidTier;
        }
        return purchaseTap.copy(str, l, map, str2, map2, z);
    }

    public final String component1() {
        return this.selectedId;
    }

    public final Long component2() {
        return this.selectedTier;
    }

    public final Map<String, String> component3() {
        return this.payMetadata;
    }

    public final String component4() {
        return this.payDirection;
    }

    public final Map<String, String> component5() {
        return this.priceEventData;
    }

    public final boolean component6() {
        return this.isPaidTier;
    }

    public final String getPayDirection() {
        return this.payDirection;
    }

    public final Map<String, String> getPayMetadata() {
        return this.payMetadata;
    }

    public final Map<String, String> getPriceEventData() {
        return this.priceEventData;
    }

    public final String getSelectedId() {
        return this.selectedId;
    }

    public final Long getSelectedTier() {
        return this.selectedTier;
    }

    public int hashCode() {
        return C0KA.A00((((AnonymousClass005.A0F(this.payMetadata, ((AnonymousClass006.A0G(this.selectedId) * 31) + AnonymousClass006.A0D(this.selectedTier)) * 31) + AnonymousClass006.A0G(this.payDirection)) * 31) + C3cH.A02(this.priceEventData)) * 31, this.isPaidTier);
    }

    public final boolean isPaidTier() {
        return this.isPaidTier;
    }

    public String toString() {
        return super.toString();
    }

    public PurchaseTap(String str, Long l, Map<String, String> map, String str2, Map<String, String> map2, boolean z) {
        C7384Etj.A0Y(map, 2);
        this.selectedId = str;
        this.selectedTier = l;
        this.payMetadata = map;
        this.payDirection = str2;
        this.priceEventData = map2;
        this.isPaidTier = z;
    }
}

package com.meta.maps.fancypins;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06H;
import X.C3cI;
import X.C3cJ;
import X.C7384Etj;

/* loaded from: classes6.dex */
public final class FancyPinClusterVariantRetentionPolicy {
    public final FancyPinClusterRetentionScope scope;
    public final String variantId;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FancyPinClusterVariantRetentionPolicy(String str) {
        this(str, FancyPinClusterRetentionScope.PRESENTATION);
        C7384Etj.A0Y(str, 0);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FancyPinClusterVariantRetentionPolicy) {
                FancyPinClusterVariantRetentionPolicy fancyPinClusterVariantRetentionPolicy = (FancyPinClusterVariantRetentionPolicy) obj;
                if (!C7384Etj.areEqual(this.variantId, fancyPinClusterVariantRetentionPolicy.variantId) || this.scope != fancyPinClusterVariantRetentionPolicy.scope) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FancyPinClusterVariantRetentionPolicy copy$default(FancyPinClusterVariantRetentionPolicy fancyPinClusterVariantRetentionPolicy, String str, FancyPinClusterRetentionScope fancyPinClusterRetentionScope, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fancyPinClusterVariantRetentionPolicy.variantId;
        }
        if ((i & 2) != 0) {
            fancyPinClusterRetentionScope = fancyPinClusterVariantRetentionPolicy.scope;
        }
        AnonymousClass003.A0u(str, fancyPinClusterRetentionScope);
        return new FancyPinClusterVariantRetentionPolicy(str, fancyPinClusterRetentionScope);
    }

    public final String component1() {
        return this.variantId;
    }

    public final FancyPinClusterRetentionScope component2() {
        return this.scope;
    }

    public final FancyPinClusterRetentionScope getScope() {
        return this.scope;
    }

    public final String getVariantId() {
        return this.variantId;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.scope, AnonymousClass001.A0G(this.variantId));
    }

    public String toString() {
        return C3cJ.A0L(this.scope, ", scope=", C3cI.A0x("FancyPinClusterVariantRetentionPolicy(variantId=", this.variantId));
    }

    public final FancyPinClusterVariantRetentionPolicy copy(String str, FancyPinClusterRetentionScope fancyPinClusterRetentionScope) {
        AnonymousClass003.A0u(str, fancyPinClusterRetentionScope);
        return new FancyPinClusterVariantRetentionPolicy(str, fancyPinClusterRetentionScope);
    }

    public FancyPinClusterVariantRetentionPolicy(String str, FancyPinClusterRetentionScope fancyPinClusterRetentionScope) {
        AnonymousClass003.A0u(str, fancyPinClusterRetentionScope);
        this.variantId = str;
        this.scope = fancyPinClusterRetentionScope;
    }

    public /* synthetic */ FancyPinClusterVariantRetentionPolicy(String str, FancyPinClusterRetentionScope fancyPinClusterRetentionScope, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? FancyPinClusterRetentionScope.PRESENTATION : fancyPinClusterRetentionScope);
    }
}

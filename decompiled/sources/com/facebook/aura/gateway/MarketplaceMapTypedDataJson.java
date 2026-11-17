package com.facebook.aura.gateway;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07729ii;
import X.C07779iq;
import X.C0881AGi;
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
import kotlinx.serialization.json.JsonElement;

@Serializable
/* loaded from: classes2.dex */
public final class MarketplaceMapTypedDataJson extends C06G {
    public static final int $stable = 8;
    public final List<JsonElement> elements;
    public final String kind;
    public final String motivation;
    public final Integer schema_version;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1U(C79.A01, null, null, null, MarketplaceMapTypedDataJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<MarketplaceMapTypedDataJson> serializer() {
            return MarketplaceMapTypedDataJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MarketplaceMapTypedDataJson(Integer num, String str, String str2, List<? extends JsonElement> list) {
        C7384Etj.A0Y(list, 3);
        this.schema_version = num;
        this.kind = str;
        this.motivation = str2;
        this.elements = list;
    }

    public final MarketplaceMapTypedDataJson copy(Integer num, String str, String str2, List<? extends JsonElement> list) {
        C7384Etj.A0Y(list, 3);
        return new MarketplaceMapTypedDataJson(num, str, str2, list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MarketplaceMapTypedDataJson) {
                MarketplaceMapTypedDataJson marketplaceMapTypedDataJson = (MarketplaceMapTypedDataJson) obj;
                if (!C7384Etj.areEqual(this.schema_version, marketplaceMapTypedDataJson.schema_version) || !C7384Etj.areEqual(this.kind, marketplaceMapTypedDataJson.kind) || !C7384Etj.areEqual(this.motivation, marketplaceMapTypedDataJson.motivation) || !C7384Etj.areEqual(this.elements, marketplaceMapTypedDataJson.elements)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ MarketplaceMapTypedDataJson copy$default(MarketplaceMapTypedDataJson marketplaceMapTypedDataJson, Integer num, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            num = marketplaceMapTypedDataJson.schema_version;
        }
        if ((i & 2) != 0) {
            str = marketplaceMapTypedDataJson.kind;
        }
        if ((i & 4) != 0) {
            str2 = marketplaceMapTypedDataJson.motivation;
        }
        if ((i & 8) != 0) {
            list = marketplaceMapTypedDataJson.elements;
        }
        C7384Etj.A0Y(list, 3);
        return new MarketplaceMapTypedDataJson(num, str, str2, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(MarketplaceMapTypedDataJson marketplaceMapTypedDataJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || marketplaceMapTypedDataJson.schema_version != null) {
            c9j5.AAP(marketplaceMapTypedDataJson.schema_version, C07729ii.A00, c9iZ, 0);
        }
        if (zAfR || marketplaceMapTypedDataJson.kind != null) {
            c9j5.AAP(marketplaceMapTypedDataJson.kind, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || marketplaceMapTypedDataJson.motivation != null) {
            c9j5.AAP(marketplaceMapTypedDataJson.motivation, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || !C3cG.A1L(marketplaceMapTypedDataJson.elements)) {
            c9j5.AAQ(marketplaceMapTypedDataJson.elements, C3cH.A15(f0cArr, 3), c9iZ, 3);
        }
    }

    public final Integer component1() {
        return this.schema_version;
    }

    public final String component2() {
        return this.kind;
    }

    public final String component3() {
        return this.motivation;
    }

    public final List<JsonElement> component4() {
        return this.elements;
    }

    public final List<JsonElement> getElements() {
        return this.elements;
    }

    public final String getKind() {
        return this.kind;
    }

    public final String getMotivation() {
        return this.motivation;
    }

    public final Integer getSchema_version() {
        return this.schema_version;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.elements, ((((AnonymousClass006.A0D(this.schema_version) * 31) + AnonymousClass006.A0G(this.kind)) * 31) + AnonymousClass005.A0H(this.motivation)) * 31);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ MarketplaceMapTypedDataJson(int i, Integer num, String str, String str2, List list, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.schema_version = null;
        } else {
            this.schema_version = num;
        }
        if ((i & 2) == 0) {
            this.kind = null;
        } else {
            this.kind = str;
        }
        if ((i & 4) == 0) {
            this.motivation = null;
        } else {
            this.motivation = str2;
        }
        if ((i & 8) == 0) {
            this.elements = C0881AGi.A00;
        } else {
            this.elements = list;
        }
    }

    public /* synthetic */ MarketplaceMapTypedDataJson(Integer num, String str, String str2, List list, int i, C06H c06h) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? C0881AGi.A00 : list);
    }

    public MarketplaceMapTypedDataJson() {
        this(null, null, null, C0881AGi.A00);
    }
}

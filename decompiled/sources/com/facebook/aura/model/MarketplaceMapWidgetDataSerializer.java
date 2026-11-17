package com.facebook.aura.model;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C10571Hud;
import X.C2hx;
import X.C3cG;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.InterfaceC07789is;
import com.facebook.aura.json.HatchJsonKt;
import java.util.List;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

/* loaded from: classes4.dex */
public final class MarketplaceMapWidgetDataSerializer implements C9hr<MarketplaceMapWidgetData> {
    public static final int $stable = 0;
    public static final MarketplaceMapWidgetDataSerializer INSTANCE = new MarketplaceMapWidgetDataSerializer();
    public static final C9iZ descriptor;
    public static final C9hr<List<MarketplaceMapListing>> listingsSerializer;

    @Serializable
    public final class Surrogate extends C06G {
        public static final Companion Companion = new Companion();
        public final JsonElement listings;
        public final String motivation;

        public final class Companion {
            public final C9hr<Surrogate> serializer() {
                return MarketplaceMapWidgetDataSerializer$Surrogate$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(C06H c06h) {
            }

            public Companion() {
            }
        }

        public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(Surrogate surrogate, C9j5 c9j5, C9iZ c9iZ) {
            boolean zAfR = c9j5.AfR();
            if (zAfR || surrogate.listings != null) {
                c9j5.AAP(surrogate.listings, JsonElementSerializer.A00, c9iZ, 0);
            }
            if (zAfR || surrogate.motivation != null) {
                c9j5.AAP(surrogate.motivation, C07779iq.A01, c9iZ, 1);
            }
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Surrogate) {
                    Surrogate surrogate = (Surrogate) obj;
                    if (!C7384Etj.areEqual(this.listings, surrogate.listings) || !C7384Etj.areEqual(this.motivation, surrogate.motivation)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, JsonElement jsonElement, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                jsonElement = surrogate.listings;
            }
            if ((i & 2) != 0) {
                str = surrogate.motivation;
            }
            return new Surrogate(jsonElement, str);
        }

        public final JsonElement component1() {
            return this.listings;
        }

        public final String component2() {
            return this.motivation;
        }

        public final Surrogate copy(JsonElement jsonElement, String str) {
            return new Surrogate(jsonElement, str);
        }

        public final JsonElement getListings() {
            return this.listings;
        }

        public final String getMotivation() {
            return this.motivation;
        }

        public int hashCode() {
            return (AnonymousClass006.A0D(this.listings) * 31) + AnonymousClass005.A0H(this.motivation);
        }

        public Surrogate(JsonElement jsonElement, String str) {
            this.listings = jsonElement;
            this.motivation = str;
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ Surrogate(int i, JsonElement jsonElement, String str, C2hx c2hx) {
            if ((i & 1) == 0) {
                this.listings = null;
            } else {
                this.listings = jsonElement;
            }
            if ((i & 2) == 0) {
                this.motivation = null;
            } else {
                this.motivation = str;
            }
        }

        public /* synthetic */ Surrogate(JsonElement jsonElement, String str, int i, C06H c06h) {
            this((i & 1) != 0 ? null : jsonElement, (i & 2) != 0 ? null : str);
        }

        public Surrogate() {
            this(null, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    @Override // X.C9jG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.facebook.aura.model.MarketplaceMapWidgetData deserialize(X.InterfaceC07829iw r6) {
        /*
            r5 = this;
            r5 = 0
            X.C7384Etj.A0Y(r6, r5)
            com.facebook.aura.model.MarketplaceMapWidgetDataSerializer$Surrogate$$serializer r0 = com.facebook.aura.model.MarketplaceMapWidgetDataSerializer$Surrogate$$serializer.INSTANCE
            java.lang.Object r4 = r6.A8b(r0)
            com.facebook.aura.model.MarketplaceMapWidgetDataSerializer$Surrogate r4 = (com.facebook.aura.model.MarketplaceMapWidgetDataSerializer.Surrogate) r4
            kotlinx.serialization.json.JsonElement r3 = r4.listings
            r2 = 0
            if (r3 == 0) goto L2d
            X.9sU r1 = com.facebook.aura.json.HatchJsonKt.HatchJson     // Catch: java.lang.Throwable -> L1f
            X.9hr<java.util.List<com.facebook.aura.model.MarketplaceMapListing>> r0 = com.facebook.aura.model.MarketplaceMapWidgetDataSerializer.listingsSerializer     // Catch: java.lang.Throwable -> L1f
            X.C7384Etj.A0Y(r0, r5)     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r1 = X.C9sZ.A00(r0, r1, r3)     // Catch: java.lang.Throwable -> L1f
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L1f
            goto L24
        L1f:
            r0 = move-exception
            X.Hud r1 = X.C3cG.A0s(r0)
        L24:
            boolean r0 = r1 instanceof X.C10571Hud
            if (r0 != 0) goto L29
            r2 = r1
        L29:
            java.util.List r2 = (java.util.List) r2
            if (r2 != 0) goto L2f
        L2d:
            X.AGi r2 = X.C0881AGi.A00
        L2f:
            java.lang.String r1 = r4.motivation
            com.facebook.aura.model.MarketplaceMapWidgetData r0 = new com.facebook.aura.model.MarketplaceMapWidgetData
            r0.<init>(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.model.MarketplaceMapWidgetDataSerializer.deserialize(X.9iw):com.facebook.aura.model.MarketplaceMapWidgetData");
    }

    static {
        MarketplaceMapListing$$serializer marketplaceMapListing$$serializer = MarketplaceMapListing$$serializer.INSTANCE;
        C7384Etj.A0Y(marketplaceMapListing$$serializer, 0);
        listingsSerializer = C3cG.A19(marketplaceMapListing$$serializer);
        descriptor = MarketplaceMapWidgetDataSerializer$Surrogate$$serializer.descriptor;
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public C9iZ getDescriptor() {
        return descriptor;
    }

    @Override // X.C9hv
    public void serialize(InterfaceC07789is interfaceC07789is, MarketplaceMapWidgetData marketplaceMapWidgetData) {
        Object objA0s;
        AnonymousClass003.A0u(interfaceC07789is, marketplaceMapWidgetData);
        MarketplaceMapWidgetDataSerializer$Surrogate$$serializer marketplaceMapWidgetDataSerializer$Surrogate$$serializer = MarketplaceMapWidgetDataSerializer$Surrogate$$serializer.INSTANCE;
        try {
            objA0s = HatchJsonKt.HatchJson.A03(marketplaceMapWidgetData.listings, listingsSerializer);
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        interfaceC07789is.AAR(new Surrogate((JsonElement) objA0s, marketplaceMapWidgetData.motivation), marketplaceMapWidgetDataSerializer$Surrogate$$serializer);
    }
}

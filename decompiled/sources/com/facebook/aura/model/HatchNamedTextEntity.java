package com.facebook.aura.model;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

@Serializable
/* loaded from: classes3.dex */
public final class HatchNamedTextEntity extends C06G {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final String name;
    public final JsonElement payload;

    public final class Companion {
        public final C9hr<HatchNamedTextEntity> serializer() {
            return HatchNamedTextEntity$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(HatchNamedTextEntity hatchNamedTextEntity, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(hatchNamedTextEntity.name, c9iZ, 0);
        c9j5.AAQ(hatchNamedTextEntity.payload, JsonElementSerializer.A00, c9iZ, 1);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchNamedTextEntity) {
                HatchNamedTextEntity hatchNamedTextEntity = (HatchNamedTextEntity) obj;
                if (!C7384Etj.areEqual(this.name, hatchNamedTextEntity.name) || !C7384Etj.areEqual(this.payload, hatchNamedTextEntity.payload)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchNamedTextEntity copy$default(HatchNamedTextEntity hatchNamedTextEntity, String str, JsonElement jsonElement, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchNamedTextEntity.name;
        }
        if ((i & 2) != 0) {
            jsonElement = hatchNamedTextEntity.payload;
        }
        AnonymousClass003.A0u(str, jsonElement);
        return new HatchNamedTextEntity(str, jsonElement);
    }

    public final String component1() {
        return this.name;
    }

    public final JsonElement component2() {
        return this.payload;
    }

    public final String getName() {
        return this.name;
    }

    public final JsonElement getPayload() {
        return this.payload;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.payload, AnonymousClass001.A0G(this.name));
    }

    public HatchNamedTextEntity(String str, JsonElement jsonElement) {
        AnonymousClass003.A0u(str, jsonElement);
        this.name = str;
        this.payload = jsonElement;
    }

    public final HatchNamedTextEntity copy(String str, JsonElement jsonElement) {
        AnonymousClass003.A0u(str, jsonElement);
        return new HatchNamedTextEntity(str, jsonElement);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchNamedTextEntity(int i, String str, JsonElement jsonElement, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(HatchNamedTextEntity$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.name = str;
        this.payload = jsonElement;
    }
}

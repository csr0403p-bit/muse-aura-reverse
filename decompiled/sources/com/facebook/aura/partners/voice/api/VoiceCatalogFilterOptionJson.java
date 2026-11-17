package com.facebook.aura.partners.voice.api;

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

@Serializable
/* loaded from: classes4.dex */
public final class VoiceCatalogFilterOptionJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final int count;
    public final String label;
    public final String value;

    public final class Companion {
        public final C9hr<VoiceCatalogFilterOptionJson> serializer() {
            return VoiceCatalogFilterOptionJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_partners_voice_api_api(VoiceCatalogFilterOptionJson voiceCatalogFilterOptionJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(voiceCatalogFilterOptionJson.value, c9iZ, 0);
        c9j5.AAV(voiceCatalogFilterOptionJson.label, c9iZ, 1);
        c9j5.AAK(c9iZ, 2, voiceCatalogFilterOptionJson.count);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VoiceCatalogFilterOptionJson) {
                VoiceCatalogFilterOptionJson voiceCatalogFilterOptionJson = (VoiceCatalogFilterOptionJson) obj;
                if (!C7384Etj.areEqual(this.value, voiceCatalogFilterOptionJson.value) || !C7384Etj.areEqual(this.label, voiceCatalogFilterOptionJson.label) || this.count != voiceCatalogFilterOptionJson.count) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ VoiceCatalogFilterOptionJson copy$default(VoiceCatalogFilterOptionJson voiceCatalogFilterOptionJson, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = voiceCatalogFilterOptionJson.value;
        }
        if ((i2 & 2) != 0) {
            str2 = voiceCatalogFilterOptionJson.label;
        }
        if ((i2 & 4) != 0) {
            i = voiceCatalogFilterOptionJson.count;
        }
        return voiceCatalogFilterOptionJson.copy(str, str2, i);
    }

    public final String component1() {
        return this.value;
    }

    public final String component2() {
        return this.label;
    }

    public final int component3() {
        return this.count;
    }

    public final int getCount() {
        return this.count;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.label, AnonymousClass001.A0G(this.value)) + this.count;
    }

    public VoiceCatalogFilterOptionJson(String str, String str2, int i) {
        AnonymousClass003.A0u(str, str2);
        this.value = str;
        this.label = str2;
        this.count = i;
    }

    public final VoiceCatalogFilterOptionJson copy(String str, String str2, int i) {
        AnonymousClass003.A0u(str, str2);
        return new VoiceCatalogFilterOptionJson(str, str2, i);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ VoiceCatalogFilterOptionJson(int i, String str, String str2, int i2, C2hx c2hx) {
        if (7 != (i & 7)) {
            C9iI.A00(VoiceCatalogFilterOptionJson$$serializer.descriptor, i, 7);
            throw F60.createAndThrow();
        }
        this.value = str;
        this.label = str2;
        this.count = i2;
    }
}

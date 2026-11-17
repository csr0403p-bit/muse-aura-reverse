package com.facebook.aura.partners.voice.api;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class VoiceCatalogFiltersResponseJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final VoiceCatalogFilterOptionsJson filter_options;

    public final class Companion {
        public final C9hr<VoiceCatalogFiltersResponseJson> serializer() {
            return VoiceCatalogFiltersResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final VoiceCatalogFiltersResponseJson copy(VoiceCatalogFilterOptionsJson voiceCatalogFilterOptionsJson) {
        C7384Etj.A0Y(voiceCatalogFilterOptionsJson, 0);
        return new VoiceCatalogFiltersResponseJson(voiceCatalogFilterOptionsJson);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof VoiceCatalogFiltersResponseJson) && C7384Etj.areEqual(this.filter_options, ((VoiceCatalogFiltersResponseJson) obj).filter_options));
    }

    public /* synthetic */ VoiceCatalogFiltersResponseJson(int i, VoiceCatalogFilterOptionsJson voiceCatalogFilterOptionsJson, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(VoiceCatalogFiltersResponseJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.filter_options = voiceCatalogFilterOptionsJson;
    }

    public static /* synthetic */ VoiceCatalogFiltersResponseJson copy$default(VoiceCatalogFiltersResponseJson voiceCatalogFiltersResponseJson, VoiceCatalogFilterOptionsJson voiceCatalogFilterOptionsJson, int i, Object obj) {
        if ((i & 1) != 0) {
            voiceCatalogFilterOptionsJson = voiceCatalogFiltersResponseJson.filter_options;
        }
        C7384Etj.A0Y(voiceCatalogFilterOptionsJson, 0);
        return new VoiceCatalogFiltersResponseJson(voiceCatalogFilterOptionsJson);
    }

    public final VoiceCatalogFilterOptionsJson component1() {
        return this.filter_options;
    }

    public final VoiceCatalogFilterOptionsJson getFilter_options() {
        return this.filter_options;
    }

    public int hashCode() {
        return this.filter_options.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public VoiceCatalogFiltersResponseJson(VoiceCatalogFilterOptionsJson voiceCatalogFilterOptionsJson) {
        C7384Etj.A0Y(voiceCatalogFilterOptionsJson, 0);
        this.filter_options = voiceCatalogFilterOptionsJson;
    }
}

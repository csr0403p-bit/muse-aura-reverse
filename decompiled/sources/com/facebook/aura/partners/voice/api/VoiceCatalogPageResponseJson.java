package com.facebook.aura.partners.voice.api;

import X.AbstractC5321DgF;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class VoiceCatalogPageResponseJson extends C06G {
    public static final int $stable = 8;
    public final CurrentVoiceJson current;
    public final int limit;
    public final int offset;
    public final int total;
    public final List<CatalogVoiceJson> voices;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {AbstractC5321DgF.A02(C79.A01, VoiceCatalogPageResponseJson$Companion$$childSerializers$1.INSTANCE), null, null, null, null};

    public final class Companion {
        public final C9hr<VoiceCatalogPageResponseJson> serializer() {
            return VoiceCatalogPageResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final VoiceCatalogPageResponseJson copy(List<CatalogVoiceJson> list, int i, int i2, int i3, CurrentVoiceJson currentVoiceJson) {
        C7384Etj.A0Y(list, 0);
        return new VoiceCatalogPageResponseJson(list, i, i2, i3, currentVoiceJson);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VoiceCatalogPageResponseJson) {
                VoiceCatalogPageResponseJson voiceCatalogPageResponseJson = (VoiceCatalogPageResponseJson) obj;
                if (!C7384Etj.areEqual(this.voices, voiceCatalogPageResponseJson.voices) || this.total != voiceCatalogPageResponseJson.total || this.limit != voiceCatalogPageResponseJson.limit || this.offset != voiceCatalogPageResponseJson.offset || !C7384Etj.areEqual(this.current, voiceCatalogPageResponseJson.current)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ VoiceCatalogPageResponseJson(int i, List list, int i2, int i3, int i4, CurrentVoiceJson currentVoiceJson, C2hx c2hx) {
        if (15 != (i & 15)) {
            C9iI.A00(VoiceCatalogPageResponseJson$$serializer.descriptor, i, 15);
            throw F60.createAndThrow();
        }
        this.voices = list;
        this.total = i2;
        this.limit = i3;
        this.offset = i4;
        this.current = (i & 16) == 0 ? null : currentVoiceJson;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VoiceCatalogPageResponseJson copy$default(VoiceCatalogPageResponseJson voiceCatalogPageResponseJson, List list, int i, int i2, int i3, CurrentVoiceJson currentVoiceJson, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            list = voiceCatalogPageResponseJson.voices;
        }
        if ((i4 & 2) != 0) {
            i = voiceCatalogPageResponseJson.total;
        }
        if ((i4 & 4) != 0) {
            i2 = voiceCatalogPageResponseJson.limit;
        }
        if ((i4 & 8) != 0) {
            i3 = voiceCatalogPageResponseJson.offset;
        }
        if ((i4 & 16) != 0) {
            currentVoiceJson = voiceCatalogPageResponseJson.current;
        }
        return voiceCatalogPageResponseJson.copy(list, i, i2, i3, currentVoiceJson);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_partners_voice_api_api(VoiceCatalogPageResponseJson voiceCatalogPageResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAQ(voiceCatalogPageResponseJson.voices, C3cH.A15($childSerializers, 0), c9iZ, 0);
        c9j5.AAK(c9iZ, 1, voiceCatalogPageResponseJson.total);
        c9j5.AAK(c9iZ, 2, voiceCatalogPageResponseJson.limit);
        c9j5.AAK(c9iZ, 3, voiceCatalogPageResponseJson.offset);
        if (c9j5.AfR() || voiceCatalogPageResponseJson.current != null) {
            c9j5.AAP(voiceCatalogPageResponseJson.current, CurrentVoiceJson$$serializer.INSTANCE, c9iZ, 4);
        }
    }

    public final List<CatalogVoiceJson> component1() {
        return this.voices;
    }

    public final int component2() {
        return this.total;
    }

    public final int component3() {
        return this.limit;
    }

    public final int component4() {
        return this.offset;
    }

    public final CurrentVoiceJson component5() {
        return this.current;
    }

    public final CurrentVoiceJson getCurrent() {
        return this.current;
    }

    public final int getLimit() {
        return this.limit;
    }

    public final int getOffset() {
        return this.offset;
    }

    public final int getTotal() {
        return this.total;
    }

    public final List<CatalogVoiceJson> getVoices() {
        return this.voices;
    }

    public int hashCode() {
        return ((((((AnonymousClass005.A0E(this.voices) + this.total) * 31) + this.limit) * 31) + this.offset) * 31) + AnonymousClass006.A0D(this.current);
    }

    public String toString() {
        return super.toString();
    }

    public VoiceCatalogPageResponseJson(List<CatalogVoiceJson> list, int i, int i2, int i3, CurrentVoiceJson currentVoiceJson) {
        C7384Etj.A0Y(list, 0);
        this.voices = list;
        this.total = i;
        this.limit = i2;
        this.offset = i3;
        this.current = currentVoiceJson;
    }

    public /* synthetic */ VoiceCatalogPageResponseJson(List list, int i, int i2, int i3, CurrentVoiceJson currentVoiceJson, int i4, C06H c06h) {
        this(list, i, i2, i3, (i4 & 16) != 0 ? null : currentVoiceJson);
    }
}

package com.facebook.aura.partners.voice.api;

import X.AbstractC5321DgF;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cG;
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
public final class VoiceCatalogFilterOptionsJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final List<VoiceCatalogFilterOptionJson> accent;
    public final List<VoiceCatalogFilterOptionJson> gender;
    public final List<VoiceCatalogFilterOptionJson> tone;

    public final class Companion {
        public final C9hr<VoiceCatalogFilterOptionsJson> serializer() {
            return VoiceCatalogFilterOptionsJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VoiceCatalogFilterOptionsJson) {
                VoiceCatalogFilterOptionsJson voiceCatalogFilterOptionsJson = (VoiceCatalogFilterOptionsJson) obj;
                if (!C7384Etj.areEqual(this.gender, voiceCatalogFilterOptionsJson.gender) || !C7384Etj.areEqual(this.accent, voiceCatalogFilterOptionsJson.accent) || !C7384Etj.areEqual(this.tone, voiceCatalogFilterOptionsJson.tone)) {
                }
            }
            return false;
        }
        return true;
    }

    static {
        Integer num = C79.A01;
        $childSerializers = C3cG.A1V(num, AbstractC5321DgF.A02(num, VoiceCatalogFilterOptionsJson$Companion$$childSerializers$1.INSTANCE), AbstractC5321DgF.A02(num, VoiceCatalogFilterOptionsJson$Companion$$childSerializers$2.INSTANCE), VoiceCatalogFilterOptionsJson$Companion$$childSerializers$3.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VoiceCatalogFilterOptionsJson copy$default(VoiceCatalogFilterOptionsJson voiceCatalogFilterOptionsJson, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = voiceCatalogFilterOptionsJson.gender;
        }
        if ((i & 2) != 0) {
            list2 = voiceCatalogFilterOptionsJson.accent;
        }
        if ((i & 4) != 0) {
            list3 = voiceCatalogFilterOptionsJson.tone;
        }
        return voiceCatalogFilterOptionsJson.copy(list, list2, list3);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_partners_voice_api_api(VoiceCatalogFilterOptionsJson voiceCatalogFilterOptionsJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAQ(voiceCatalogFilterOptionsJson.gender, C3cH.A15(f0cArr, 0), c9iZ, 0);
        c9j5.AAQ(voiceCatalogFilterOptionsJson.accent, C3cH.A15(f0cArr, 1), c9iZ, 1);
        c9j5.AAQ(voiceCatalogFilterOptionsJson.tone, C3cH.A15(f0cArr, 2), c9iZ, 2);
    }

    public final List<VoiceCatalogFilterOptionJson> component1() {
        return this.gender;
    }

    public final List<VoiceCatalogFilterOptionJson> component2() {
        return this.accent;
    }

    public final List<VoiceCatalogFilterOptionJson> component3() {
        return this.tone;
    }

    public final List<VoiceCatalogFilterOptionJson> getAccent() {
        return this.accent;
    }

    public final List<VoiceCatalogFilterOptionJson> getGender() {
        return this.gender;
    }

    public final List<VoiceCatalogFilterOptionJson> getTone() {
        return this.tone;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.tone, AnonymousClass005.A0F(this.accent, AnonymousClass005.A0E(this.gender)));
    }

    public VoiceCatalogFilterOptionsJson(List<VoiceCatalogFilterOptionJson> list, List<VoiceCatalogFilterOptionJson> list2, List<VoiceCatalogFilterOptionJson> list3) {
        AnonymousClass005.A0x(list, list2, list3);
        this.gender = list;
        this.accent = list2;
        this.tone = list3;
    }

    public final VoiceCatalogFilterOptionsJson copy(List<VoiceCatalogFilterOptionJson> list, List<VoiceCatalogFilterOptionJson> list2, List<VoiceCatalogFilterOptionJson> list3) {
        AnonymousClass005.A0x(list, list2, list3);
        return new VoiceCatalogFilterOptionsJson(list, list2, list3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ VoiceCatalogFilterOptionsJson(int i, List list, List list2, List list3, C2hx c2hx) {
        if (7 != (i & 7)) {
            C9iI.A00(VoiceCatalogFilterOptionsJson$$serializer.descriptor, i, 7);
            throw F60.createAndThrow();
        }
        this.gender = list;
        this.accent = list2;
        this.tone = list3;
    }
}

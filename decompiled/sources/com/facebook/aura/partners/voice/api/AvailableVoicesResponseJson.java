package com.facebook.aura.partners.voice.api;

import X.AbstractC5321DgF;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class AvailableVoicesResponseJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final CurrentVoiceJson current;
    public final String onboarding_line;
    public final String sample_line;
    public final List<VoiceJson> suggested;
    public final List<VoiceJson> voices;

    public final class Companion {
        public final C9hr<AvailableVoicesResponseJson> serializer() {
            return AvailableVoicesResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = new F0C[]{AbstractC5321DgF.A02(num, AvailableVoicesResponseJson$Companion$$childSerializers$1.INSTANCE), AbstractC5321DgF.A02(num, AvailableVoicesResponseJson$Companion$$childSerializers$2.INSTANCE), null, null, null};
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AvailableVoicesResponseJson) {
                AvailableVoicesResponseJson availableVoicesResponseJson = (AvailableVoicesResponseJson) obj;
                if (!C7384Etj.areEqual(this.voices, availableVoicesResponseJson.voices) || !C7384Etj.areEqual(this.suggested, availableVoicesResponseJson.suggested) || !C7384Etj.areEqual(this.sample_line, availableVoicesResponseJson.sample_line) || !C7384Etj.areEqual(this.onboarding_line, availableVoicesResponseJson.onboarding_line) || !C7384Etj.areEqual(this.current, availableVoicesResponseJson.current)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AvailableVoicesResponseJson copy$default(AvailableVoicesResponseJson availableVoicesResponseJson, List list, List list2, String str, String str2, CurrentVoiceJson currentVoiceJson, int i, Object obj) {
        if ((i & 1) != 0) {
            list = availableVoicesResponseJson.voices;
        }
        if ((i & 2) != 0) {
            list2 = availableVoicesResponseJson.suggested;
        }
        if ((i & 4) != 0) {
            str = availableVoicesResponseJson.sample_line;
        }
        if ((i & 8) != 0) {
            str2 = availableVoicesResponseJson.onboarding_line;
        }
        if ((i & 16) != 0) {
            currentVoiceJson = availableVoicesResponseJson.current;
        }
        return availableVoicesResponseJson.copy(list, list2, str, str2, currentVoiceJson);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_partners_voice_api_api(AvailableVoicesResponseJson availableVoicesResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cG.A1L(availableVoicesResponseJson.voices)) {
            c9j5.AAQ(availableVoicesResponseJson.voices, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
        if (zAfR || !C3cG.A1L(availableVoicesResponseJson.suggested)) {
            c9j5.AAQ(availableVoicesResponseJson.suggested, C3cH.A15(f0cArr, 1), c9iZ, 1);
        }
        if (zAfR || availableVoicesResponseJson.sample_line != null) {
            c9j5.AAP(availableVoicesResponseJson.sample_line, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || availableVoicesResponseJson.onboarding_line != null) {
            c9j5.AAP(availableVoicesResponseJson.onboarding_line, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || availableVoicesResponseJson.current != null) {
            c9j5.AAP(availableVoicesResponseJson.current, CurrentVoiceJson$$serializer.INSTANCE, c9iZ, 4);
        }
    }

    public final List<VoiceJson> component1() {
        return this.voices;
    }

    public final List<VoiceJson> component2() {
        return this.suggested;
    }

    public final String component3() {
        return this.sample_line;
    }

    public final String component4() {
        return this.onboarding_line;
    }

    public final CurrentVoiceJson component5() {
        return this.current;
    }

    public final CurrentVoiceJson getCurrent() {
        return this.current;
    }

    public final String getOnboarding_line() {
        return this.onboarding_line;
    }

    public final String getSample_line() {
        return this.sample_line;
    }

    public final List<VoiceJson> getSuggested() {
        return this.suggested;
    }

    public final List<VoiceJson> getVoices() {
        return this.voices;
    }

    public int hashCode() {
        return ((((AnonymousClass005.A0F(this.suggested, AnonymousClass005.A0E(this.voices)) + AnonymousClass006.A0G(this.sample_line)) * 31) + AnonymousClass006.A0G(this.onboarding_line)) * 31) + C3cH.A02(this.current);
    }

    public /* synthetic */ AvailableVoicesResponseJson(int i, List list, List list2, String str, String str2, CurrentVoiceJson currentVoiceJson, C2hx c2hx) {
        this.voices = (i & 1) == 0 ? C0881AGi.A00 : list;
        if ((i & 2) == 0) {
            this.suggested = C0881AGi.A00;
        } else {
            this.suggested = list2;
        }
        if ((i & 4) == 0) {
            this.sample_line = null;
        } else {
            this.sample_line = str;
        }
        if ((i & 8) == 0) {
            this.onboarding_line = null;
        } else {
            this.onboarding_line = str2;
        }
        if ((i & 16) == 0) {
            this.current = null;
        } else {
            this.current = currentVoiceJson;
        }
    }

    public final AvailableVoicesResponseJson copy(List<VoiceJson> list, List<VoiceJson> list2, String str, String str2, CurrentVoiceJson currentVoiceJson) {
        AnonymousClass003.A0u(list, list2);
        return new AvailableVoicesResponseJson(list, list2, str, str2, currentVoiceJson);
    }

    public String toString() {
        return super.toString();
    }

    public AvailableVoicesResponseJson(List<VoiceJson> list, List<VoiceJson> list2, String str, String str2, CurrentVoiceJson currentVoiceJson) {
        AnonymousClass003.A0u(list, list2);
        this.voices = list;
        this.suggested = list2;
        this.sample_line = str;
        this.onboarding_line = str2;
        this.current = currentVoiceJson;
    }

    public /* synthetic */ AvailableVoicesResponseJson(List list, List list2, String str, String str2, CurrentVoiceJson currentVoiceJson, int i, C06H c06h) {
        this(C3cI.A10(list, i), C3cI.A11(list2, i), (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : currentVoiceJson);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AvailableVoicesResponseJson() {
        C0881AGi c0881AGi = C0881AGi.A00;
        this(c0881AGi, c0881AGi, null, null, null);
    }
}

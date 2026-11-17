package com.facebook.aura.gateway;

import X.AbstractC5321DgF;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07839ix;
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
/* loaded from: classes3.dex */
public final class VoiceOptionsWidgetDataJson extends C06G {
    public static final int $stable = 8;
    public final Boolean browse_all;
    public final List<VoiceOptionJson> options;
    public final Boolean switch_voice;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {AbstractC5321DgF.A02(C79.A01, VoiceOptionsWidgetDataJson$Companion$$childSerializers$1.INSTANCE), null, null};

    public final class Companion {
        public final C9hr<VoiceOptionsWidgetDataJson> serializer() {
            return VoiceOptionsWidgetDataJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public VoiceOptionsWidgetDataJson(List<VoiceOptionJson> list, Boolean bool, Boolean bool2) {
        C7384Etj.A0Y(list, 0);
        this.options = list;
        this.switch_voice = bool;
        this.browse_all = bool2;
    }

    public final VoiceOptionsWidgetDataJson copy(List<VoiceOptionJson> list, Boolean bool, Boolean bool2) {
        C7384Etj.A0Y(list, 0);
        return new VoiceOptionsWidgetDataJson(list, bool, bool2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VoiceOptionsWidgetDataJson) {
                VoiceOptionsWidgetDataJson voiceOptionsWidgetDataJson = (VoiceOptionsWidgetDataJson) obj;
                if (!C7384Etj.areEqual(this.options, voiceOptionsWidgetDataJson.options) || !C7384Etj.areEqual(this.switch_voice, voiceOptionsWidgetDataJson.switch_voice) || !C7384Etj.areEqual(this.browse_all, voiceOptionsWidgetDataJson.browse_all)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VoiceOptionsWidgetDataJson copy$default(VoiceOptionsWidgetDataJson voiceOptionsWidgetDataJson, List list, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = voiceOptionsWidgetDataJson.options;
        }
        if ((i & 2) != 0) {
            bool = voiceOptionsWidgetDataJson.switch_voice;
        }
        if ((i & 4) != 0) {
            bool2 = voiceOptionsWidgetDataJson.browse_all;
        }
        return voiceOptionsWidgetDataJson.copy(list, bool, bool2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(VoiceOptionsWidgetDataJson voiceOptionsWidgetDataJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cG.A1L(voiceOptionsWidgetDataJson.options)) {
            c9j5.AAQ(voiceOptionsWidgetDataJson.options, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
        if (zAfR || voiceOptionsWidgetDataJson.switch_voice != null) {
            c9j5.AAP(voiceOptionsWidgetDataJson.switch_voice, C07839ix.A00, c9iZ, 1);
        }
        if (zAfR || voiceOptionsWidgetDataJson.browse_all != null) {
            c9j5.AAP(voiceOptionsWidgetDataJson.browse_all, C07839ix.A00, c9iZ, 2);
        }
    }

    public final List<VoiceOptionJson> component1() {
        return this.options;
    }

    public final Boolean component2() {
        return this.switch_voice;
    }

    public final Boolean component3() {
        return this.browse_all;
    }

    public final Boolean getBrowse_all() {
        return this.browse_all;
    }

    public final List<VoiceOptionJson> getOptions() {
        return this.options;
    }

    public final Boolean getSwitch_voice() {
        return this.switch_voice;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0E(this.options) + AnonymousClass006.A0D(this.switch_voice)) * 31) + C3cH.A02(this.browse_all);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ VoiceOptionsWidgetDataJson(int i, List list, Boolean bool, Boolean bool2, C2hx c2hx) {
        this.options = (i & 1) == 0 ? C0881AGi.A00 : list;
        if ((i & 2) == 0) {
            this.switch_voice = null;
        } else {
            this.switch_voice = bool;
        }
        if ((i & 4) == 0) {
            this.browse_all = null;
        } else {
            this.browse_all = bool2;
        }
    }

    public /* synthetic */ VoiceOptionsWidgetDataJson(List list, Boolean bool, Boolean bool2, int i, C06H c06h) {
        this(C3cI.A10(list, i), (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2);
    }

    public VoiceOptionsWidgetDataJson() {
        this(C0881AGi.A00, null, null);
    }
}

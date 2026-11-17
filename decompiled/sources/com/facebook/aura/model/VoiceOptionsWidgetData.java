package com.facebook.aura.model;

import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
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
public final class VoiceOptionsWidgetData extends C06G implements HatchWidgetData {
    public static final int $stable = 8;
    public final boolean browseAll;
    public final List<VoiceOptionData> options;
    public final boolean switchVoice;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cI.A1Z(C79.A01, VoiceOptionsWidgetData$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<VoiceOptionsWidgetData> serializer() {
            return VoiceOptionsWidgetData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public VoiceOptionsWidgetData(List<VoiceOptionData> list, boolean z, boolean z2) {
        C7384Etj.A0Y(list, 0);
        this.options = list;
        this.switchVoice = z;
        this.browseAll = z2;
    }

    public final VoiceOptionsWidgetData copy(List<VoiceOptionData> list, boolean z, boolean z2) {
        C7384Etj.A0Y(list, 0);
        return new VoiceOptionsWidgetData(list, z, z2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VoiceOptionsWidgetData) {
                VoiceOptionsWidgetData voiceOptionsWidgetData = (VoiceOptionsWidgetData) obj;
                if (!C7384Etj.areEqual(this.options, voiceOptionsWidgetData.options) || this.switchVoice != voiceOptionsWidgetData.switchVoice || this.browseAll != voiceOptionsWidgetData.browseAll) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VoiceOptionsWidgetData copy$default(VoiceOptionsWidgetData voiceOptionsWidgetData, List list, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = voiceOptionsWidgetData.options;
        }
        if ((i & 2) != 0) {
            z = voiceOptionsWidgetData.switchVoice;
        }
        if ((i & 4) != 0) {
            z2 = voiceOptionsWidgetData.browseAll;
        }
        return voiceOptionsWidgetData.copy(list, z, z2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(VoiceOptionsWidgetData voiceOptionsWidgetData, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAQ(voiceOptionsWidgetData.options, C3cH.A15($childSerializers, 0), c9iZ, 0);
        boolean zAfR = c9j5.AfR();
        if (zAfR || !voiceOptionsWidgetData.switchVoice) {
            c9j5.AA7(c9iZ, 1, voiceOptionsWidgetData.switchVoice);
        }
        if (zAfR || voiceOptionsWidgetData.browseAll) {
            c9j5.AA7(c9iZ, 2, voiceOptionsWidgetData.browseAll);
        }
    }

    public final List<VoiceOptionData> component1() {
        return this.options;
    }

    public final boolean component2() {
        return this.switchVoice;
    }

    public final boolean component3() {
        return this.browseAll;
    }

    public final boolean getBrowseAll() {
        return this.browseAll;
    }

    public final List<VoiceOptionData> getOptions() {
        return this.options;
    }

    public final boolean getSwitchVoice() {
        return this.switchVoice;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A01(AnonymousClass005.A0E(this.options), this.switchVoice), this.browseAll);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ VoiceOptionsWidgetData(int i, List list, boolean z, boolean z2, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(VoiceOptionsWidgetData$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.options = list;
        if ((i & 2) == 0) {
            this.switchVoice = true;
        } else {
            this.switchVoice = z;
        }
        if ((i & 4) == 0) {
            this.browseAll = false;
        } else {
            this.browseAll = z2;
        }
    }

    public /* synthetic */ VoiceOptionsWidgetData(List list, boolean z, boolean z2, int i, C06H c06h) {
        this(list, C3cG.A1J(i, z), AnonymousClass005.A1O(i, z2));
    }
}

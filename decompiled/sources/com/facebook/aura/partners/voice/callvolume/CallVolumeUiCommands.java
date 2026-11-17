package com.facebook.aura.partners.voice.callvolume;

import X.AGH;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.F60;
import com.facebook.aura.nodes.core.NodeArgSpec;
import com.facebook.aura.nodes.core.NodeArgType;
import com.facebook.aura.nodes.core.NodeCommandSpec;
import com.facebook.aura.partners.voice.gating.VoiceCallVolume;
import com.facebook.aura.partners.voice.session.intf.VoiceCallSupport;
import com.facebook.aura.uicontrol.ContributedUiAction;
import com.facebook.aura.uicontrol.UiCommandContributor;
import java.util.Map;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes2.dex */
public final class CallVolumeUiCommands implements UiCommandContributor {
    public static final CallVolumeUiCommands INSTANCE = new CallVolumeUiCommands();
    public static final NodeCommandSpec setVolumeSpec = C3cH.A0U("Change the call volume (how loud the agent's voice is) on this device. Pass step \"up\" or \"down\" for one step, or level_percent 0-100 to set a level (100 is max). Outside a call it sets the volume for the next call where the device supports that, and otherwise returns an error asking for an active call.", "Confirmation that the call volume changed.", AGH.A0E(), AnonymousClass007.A0d("level_percent", new NodeArgSpec(NodeArgType.INTEGER, "Volume level from 0 to 100."), C3cG.A0r("step", new NodeArgSpec(NodeArgType.STRING, "Volume step: \"up\" or \"down\"."))));

    private final /* synthetic */ <T> T decodeOrNull(JsonObject jsonObject) {
        try {
            C7384Etj.A0Q();
            throw F60.createAndThrow();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.aura.partners.voice.callvolume.VolumeChange volumeChange(kotlinx.serialization.json.JsonObject r3) {
        /*
            r2 = this;
            r2 = 0
            if (r3 == 0) goto L4e
            X.9sU r1 = com.facebook.aura.json.HatchJsonKt.HatchJson     // Catch: java.lang.Throwable -> Lc
            com.facebook.aura.partners.voice.callvolume.SetVolumeLevelParamsJson$$serializer r0 = com.facebook.aura.partners.voice.callvolume.SetVolumeLevelParamsJson$$serializer.INSTANCE     // Catch: java.lang.Throwable -> Lc
            java.lang.Object r1 = X.C3cI.A0T(r0, r1, r3)     // Catch: java.lang.Throwable -> Lc
            goto L11
        Lc:
            r0 = move-exception
            X.Hud r1 = X.C3cG.A0s(r0)
        L11:
            boolean r0 = r1 instanceof X.C10571Hud
            if (r0 == 0) goto L16
            r1 = r2
        L16:
            com.facebook.aura.partners.voice.callvolume.SetVolumeLevelParamsJson r1 = (com.facebook.aura.partners.voice.callvolume.SetVolumeLevelParamsJson) r1
            if (r1 == 0) goto L2e
            java.lang.Integer r0 = r1.level_percent
            if (r0 == 0) goto L2e
            int r1 = r0.intValue()
            if (r1 < 0) goto L2e
            r0 = 101(0x65, float:1.42E-43)
            if (r1 >= r0) goto L2e
            com.facebook.aura.partners.voice.callvolume.VolumeChange$Level r2 = new com.facebook.aura.partners.voice.callvolume.VolumeChange$Level
            r2.<init>(r1)
            goto L5d
        L2e:
            X.9sU r1 = com.facebook.aura.json.HatchJsonKt.HatchJson     // Catch: java.lang.Throwable -> L37
            com.facebook.aura.partners.voice.callvolume.SetVolumeStepParamsJson$$serializer r0 = com.facebook.aura.partners.voice.callvolume.SetVolumeStepParamsJson$$serializer.INSTANCE     // Catch: java.lang.Throwable -> L37
            java.lang.Object r1 = X.C3cI.A0T(r0, r1, r3)     // Catch: java.lang.Throwable -> L37
            goto L3c
        L37:
            r0 = move-exception
            X.Hud r1 = X.C3cG.A0s(r0)
        L3c:
            boolean r0 = r1 instanceof X.C10571Hud
            if (r0 == 0) goto L41
            r1 = r2
        L41:
            com.facebook.aura.partners.voice.callvolume.SetVolumeStepParamsJson r1 = (com.facebook.aura.partners.voice.callvolume.SetVolumeStepParamsJson) r1
            if (r1 == 0) goto L4e
            java.lang.String r0 = r1.step
            if (r0 == 0) goto L4e
            java.lang.String r1 = X.AnonymousClass001.A0u(r0)
            goto L4f
        L4e:
            r1 = r2
        L4f:
            java.lang.String r0 = "up"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L60
            r0 = 1
        L58:
            com.facebook.aura.partners.voice.callvolume.VolumeChange$Step r2 = new com.facebook.aura.partners.voice.callvolume.VolumeChange$Step
            r2.<init>(r0)
        L5d:
            com.facebook.aura.partners.voice.callvolume.VolumeChange r2 = (com.facebook.aura.partners.voice.callvolume.VolumeChange) r2
        L5f:
            return r2
        L60:
            java.lang.String r0 = "down"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L5f
            r0 = 0
            goto L58
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.callvolume.CallVolumeUiCommands.volumeChange(kotlinx.serialization.json.JsonObject):com.facebook.aura.partners.voice.callvolume.VolumeChange");
    }

    @Override // com.facebook.aura.uicontrol.UiCommandContributor
    public String invalidParams(String str, JsonObject jsonObject) {
        C7384Etj.A0Y(str, 0);
        if (str.equals(CallVolumeUiCommandsKt.UI_SET_VOICE_SET_VOLUME) && INSTANCE.volumeChange(jsonObject) == null) {
            return "Pass step \"up\" or \"down\", or level_percent from 0 to 100.";
        }
        return null;
    }

    @Override // com.facebook.aura.uicontrol.UiCommandContributor
    public ContributedUiAction parse(String str, JsonObject jsonObject) {
        VolumeChange volumeChange;
        C7384Etj.A0Y(str, 0);
        if (!str.equals(CallVolumeUiCommandsKt.UI_SET_VOICE_SET_VOLUME) || (volumeChange = volumeChange(jsonObject)) == null) {
            return null;
        }
        return new SetCallVolumeUiAction(volumeChange);
    }

    @Override // com.facebook.aura.uicontrol.UiCommandContributor
    public Map<String, NodeCommandSpec> getSpecs() {
        return (!VoiceCallSupport.INSTANCE.isVoiceCallSupported() || VoiceCallVolume.INSTANCE.callStream() == null) ? AGH.A0E() : AnonymousClass006.A10(CallVolumeUiCommandsKt.UI_SET_VOICE_SET_VOLUME, setVolumeSpec);
    }
}

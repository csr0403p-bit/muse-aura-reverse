package com.facebook.aura.partners.voice.screen;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.BFM;
import X.BRg;
import X.C1BO;
import X.C2CK;
import X.C60O;
import X.C78N;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchImpressionModifierKt;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.partners.voice.viewmodel.VoiceTelemetry;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class VoiceTelemetryModifiersKt {
    public static final BRg voiceImpression(BRg bRg, VoiceTelemetry voiceTelemetry, HatchComponent hatchComponent, VoiceTelemetry.CatalogState catalogState, Function0<? extends Map<HatchMetadataKey, String>> function0, BFM bfm, int i, int i2) {
        long jLongValue;
        Map<String, String> mapImpressionMetadata;
        String value;
        VoiceTelemetry.Episode episode;
        Number number;
        Function0<? extends Map<HatchMetadataKey, String>> function02 = function0;
        AnonymousClass005.A10(bRg, voiceTelemetry, hatchComponent);
        bfm.AgE(-1563209685);
        if ((i2 & 4) != 0) {
            catalogState = null;
        }
        if ((i2 & 8) != 0) {
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = VoiceTelemetryModifiersKt$voiceImpression$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            function02 = (Function0) objAaT;
        }
        C1BO c1boA02 = C2CK.A02(bfm, voiceTelemetry.visitSequence);
        C1BO c1boA022 = C2CK.A02(bfm, voiceTelemetry.impressionEpisodes);
        Number number2 = (Number) c1boA02.getValue();
        if (number2 == null || (mapImpressionMetadata = voiceTelemetry.impressionMetadata((jLongValue = number2.longValue()), function02.invoke())) == null) {
            AnonymousClass001.A1D(bfm);
            return bRg;
        }
        long jLongValue2 = (catalogState == null || (episode = catalogState.getEpisode()) == null || (number = (Number) ((Map) c1boA022.getValue()).get(episode)) == null) ? 0L : number.longValue();
        HatchOrigin origin = voiceTelemetry.getOrigin();
        HatchSurface hatchSurface = HatchSurface.VOICE_MODE;
        VoiceTelemetry.Page page = voiceTelemetry.page;
        HatchSubsurface subsurface = page.getSubsurface();
        HatchScreen screen = page.getScreen();
        String value2 = hatchComponent.getValue();
        if (catalogState == null || (value = catalogState.getValue()) == null) {
            value = "";
        }
        StringBuilder sbA0z = C60O.A0z("voice:", jLongValue);
        C60O.A1R(":", value2, sbA0z);
        sbA0z.append(value);
        sbA0z.append(":");
        sbA0z.append(jLongValue2);
        BRg bRgHatchImpression = HatchImpressionModifierKt.hatchImpression(bRg, origin, hatchSurface, subsurface, screen, hatchComponent, null, mapImpressionMetadata, null, 500L, 0.0f, sbA0z.toString(), null, null);
        AnonymousClass001.A1D(bfm);
        return bRgHatchImpression;
    }
}

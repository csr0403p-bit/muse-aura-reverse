package com.facebook.aura.gateway;

import X.AnonymousClass006;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.C7BY;
import com.facebook.aura.model.VoiceOptionData;
import com.facebook.aura.model.VoiceOptionsWidgetData;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class VoiceOptionsWidgetJsonKt {
    public static final VoiceOptionsWidgetData toDomain(VoiceOptionsWidgetDataJson voiceOptionsWidgetDataJson) {
        C7384Etj.A0Y(voiceOptionsWidgetDataJson, 0);
        List<VoiceOptionJson> list = voiceOptionsWidgetDataJson.options;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<VoiceOptionJson> it = list.iterator();
        while (true) {
            String str = null;
            if (!it.hasNext()) {
                break;
            }
            VoiceOptionJson next = it.next();
            String str2 = next.voice_id;
            if (str2.length() != 0) {
                String str3 = next.name;
                if (str3.length() != 0) {
                    String str4 = next.label;
                    if (str4 != null && !C7BY.A0j(str4)) {
                        str = str4;
                    }
                    arrayListA0h.add(new VoiceOptionData(str2, str3, str));
                }
            }
        }
        HashSet hashSetA13 = C60O.A13();
        ArrayList arrayListA0h2 = C3cG.A0h();
        for (Object obj : arrayListA0h) {
            AnonymousClass006.A1P(((VoiceOptionData) obj).voiceId, obj, hashSetA13, arrayListA0h2);
        }
        if (arrayListA0h2.isEmpty()) {
            return null;
        }
        int i = VoiceOptionsWidgetData.$stable;
        Boolean bool = voiceOptionsWidgetDataJson.switch_voice;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
        Boolean bool2 = voiceOptionsWidgetDataJson.browse_all;
        return new VoiceOptionsWidgetData(arrayListA0h2, zBooleanValue, bool2 != null ? bool2.booleanValue() : false);
    }
}

package com.facebook.aura.partners.voice.screen;

import X.AbstractC0878AGe;
import X.AbstractC0882AGj;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.C0881AGi;
import X.C1bi;
import X.C3cG;
import X.G0V;
import com.facebook.aura.partners.voice.intf.VoiceCallEntryPoint;
import com.facebook.aura.partners.voice.intf.VoiceCallStart;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class VoiceCallStarterKt$rememberConversationCallStarter$pendingStartSaver$1$1 extends AbstractC7559F3s implements G0V<C1bi, VoiceCallStart, List<? extends String>> {
    public static final VoiceCallStarterKt$rememberConversationCallStarter$pendingStartSaver$1$1 INSTANCE = new VoiceCallStarterKt$rememberConversationCallStarter$pendingStartSaver$1$1();

    public VoiceCallStarterKt$rememberConversationCallStarter$pendingStartSaver$1$1() {
        super(2);
    }

    @Override // X.G0V
    public final List<String> invoke(C1bi c1bi, VoiceCallStart voiceCallStart) {
        String value;
        if (voiceCallStart != null) {
            VoiceCallEntryPoint voiceCallEntryPoint = voiceCallStart.entryPoint;
            if (voiceCallEntryPoint == null || (value = voiceCallEntryPoint.getValue()) == null) {
                value = "";
            }
            List listSingletonList = Collections.singletonList(value);
            Map<String, String> map = voiceCallStart.attribution;
            ArrayList arrayListA0h = C3cG.A0h();
            Iterator itA0n = AnonymousClass002.A0n(map);
            while (itA0n.hasNext()) {
                Map.Entry entry = (Map.Entry) itA0n.next();
                AbstractC0882AGj.A0r(Arrays.asList((String) entry.getKey(), (String) entry.getValue()), arrayListA0h);
            }
            return AbstractC0878AGe.A0P(arrayListA0h, listSingletonList);
        }
        return C0881AGi.A00;
    }
}

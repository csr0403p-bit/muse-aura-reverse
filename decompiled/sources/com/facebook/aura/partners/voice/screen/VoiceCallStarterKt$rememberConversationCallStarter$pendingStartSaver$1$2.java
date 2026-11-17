package com.facebook.aura.partners.voice.screen;

import X.A3p;
import X.AGH;
import X.AH7;
import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.BL3;
import X.C0880AGh;
import X.C0887AGo;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.partners.voice.intf.VoiceCallEntryPoint;
import com.facebook.aura.partners.voice.intf.VoiceCallStart;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
public final class VoiceCallStarterKt$rememberConversationCallStarter$pendingStartSaver$1$2 extends AbstractC7559F3s implements G0U<List<? extends String>, VoiceCallStart> {
    public static final VoiceCallStarterKt$rememberConversationCallStarter$pendingStartSaver$1$2 INSTANCE = new VoiceCallStarterKt$rememberConversationCallStarter$pendingStartSaver$1$2();

    public VoiceCallStarterKt$rememberConversationCallStarter$pendingStartSaver$1$2() {
        super(1);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final VoiceCallStart invoke2(List<String> list) {
        ArrayList arrayListA0h;
        C7384Etj.A0Y(list, 0);
        String str = (String) AbstractC0878AGe.A0G(list);
        if (str == null) {
            return null;
        }
        VoiceCallEntryPoint voiceCallEntryPointFromValue = VoiceCallEntryPoint.Companion.fromValue(str);
        List listA0Z = AbstractC0878AGe.A0Z(list, 1);
        VoiceCallStarterKt$rememberConversationCallStarter$pendingStartSaver$1$2$1$1 voiceCallStarterKt$rememberConversationCallStarter$pendingStartSaver$1$2$1$1 = VoiceCallStarterKt$rememberConversationCallStarter$pendingStartSaver$1$2$1$1.INSTANCE;
        AnonymousClass002.A1C(listA0Z, 0, voiceCallStarterKt$rememberConversationCallStarter$pendingStartSaver$1$2$1$1);
        if (listA0Z instanceof RandomAccess) {
            int size = listA0Z.size();
            int i = 0;
            arrayListA0h = C60O.A11((size / 2) + (size % 2 == 0 ? 0 : 1));
            C0880AGh c0880AGh = new C0880AGh(listA0Z);
            while (i < size && 2 <= size - i) {
                int i2 = i + 2;
                AH7.A04(i, i2, c0880AGh.A02.size());
                c0880AGh.A01 = i;
                c0880AGh.A00 = i2 - i;
                arrayListA0h.add(voiceCallStarterKt$rememberConversationCallStarter$pendingStartSaver$1$2$1$1.invoke2((List<String>) c0880AGh));
                i = i2;
                if (i2 < 0) {
                    break;
                }
            }
        } else {
            arrayListA0h = C3cG.A0h();
            Iterator it = listA0Z.iterator();
            C7384Etj.A0Y(it, 0);
            Iterator itA0C = !it.hasNext() ? A3p.A00 : BL3.A0C(new C0887AGo(it, null, 2, 2, true, false));
            while (itA0C.hasNext()) {
                arrayListA0h.add(voiceCallStarterKt$rememberConversationCallStarter$pendingStartSaver$1$2$1$1.invoke2((List<String>) itA0C.next()));
            }
        }
        return new VoiceCallStart(voiceCallEntryPointFromValue, AGH.A06(arrayListA0h));
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ VoiceCallStart invoke(List<? extends String> list) {
        return invoke2((List<String>) list);
    }
}

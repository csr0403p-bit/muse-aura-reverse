package com.facebook.aura.partners.voice.chrome;

import X.AGH;
import X.AbstractC3358CGz;
import X.AnonymousClass002;
import X.AnonymousClass006;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import android.net.Uri;
import com.facebook.aura.analytics.hatch.HatchAppOpenLogger;
import com.facebook.aura.conversation.widget.api.ConversationPresentationActionContext;
import com.facebook.aura.conversation.widget.api.InboundLinkOrigin;
import com.facebook.aura.microphone.api.Microphone;
import com.facebook.aura.microphone.api.MicrophonePriority;
import com.facebook.aura.partners.voice.intf.Voice;
import com.facebook.aura.partners.voice.intf.VoiceCallEntryPoint;
import com.facebook.aura.partners.voice.intf.VoiceCallStart;
import com.facebook.aura.partners.voice.session.intf.VoiceCallSupport;
import com.facebook.aura.widgets.WidgetComponentsKt;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class VoiceConversationPresentationActionKt {
    public static final long PENDING_CALL_START_TIMEOUT_MS = 15000;
    public static final String SOURCE_APP_ANNOTATION = "source_app";

    public static final boolean canStartCall(ConversationPresentationActionContext conversationPresentationActionContext, AbstractC3358CGz abstractC3358CGz) {
        return conversationPresentationActionContext.isEligible && Voice.INSTANCE.isCallSupported(abstractC3358CGz) && VoiceCallSupport.INSTANCE.isVoiceCallSupported() && Microphone.INSTANCE.holder(abstractC3358CGz).getValue() != MicrophonePriority.TRANSIENT;
    }

    public static final VoiceCallStart inboundCallStart(String str, InboundLinkOrigin inboundLinkOrigin) {
        VoiceCallEntryPoint voiceCallEntryPoint;
        Map mapA11;
        Map<String, String> mapUtmParams = HatchAppOpenLogger.INSTANCE.utmParams(Uri.parse(str));
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        Iterator itA0n = AnonymousClass002.A0n(mapUtmParams);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            if (((String) entryA0l.getValue()).length() > 0) {
                AnonymousClass006.A1R(linkedHashMapA0j, entryA0l);
            }
        }
        if (C7384Etj.areEqual(inboundLinkOrigin, InboundLinkOrigin.Notification.INSTANCE)) {
            return new VoiceCallStart(VoiceCallEntryPoint.NOTIFICATION, linkedHashMapA0j);
        }
        if (C7384Etj.areEqual(inboundLinkOrigin, InboundLinkOrigin.HomeScreenWidget.INSTANCE)) {
            voiceCallEntryPoint = VoiceCallEntryPoint.WIDGET;
            mapA11 = AGH.A0E();
        } else {
            if (!(inboundLinkOrigin instanceof InboundLinkOrigin.MetaApp)) {
                throw C3cG.A0q();
            }
            voiceCallEntryPoint = VoiceCallEntryPoint.META_APP;
            mapA11 = AnonymousClass006.A11(SOURCE_APP_ANNOTATION, ((InboundLinkOrigin.MetaApp) inboundLinkOrigin).opener.getValue(), linkedHashMapA0j);
        }
        return new VoiceCallStart(voiceCallEntryPoint, mapA11);
    }

    public static final boolean isAppCallActive(AbstractC3358CGz abstractC3358CGz) {
        return C3cH.A1P(C3cG.A0K(abstractC3358CGz));
    }

    public static final boolean isVoiceCallStartUrl(String str) {
        String host;
        Uri uri = Uri.parse(str);
        String scheme = uri.getScheme();
        return scheme != null && scheme.equalsIgnoreCase("hatch") && (host = uri.getHost()) != null && host.equalsIgnoreCase("voice") && C7384Etj.areEqual(uri.getPathSegments(), Collections.singletonList(WidgetComponentsKt.START_PATH));
    }
}

package com.facebook.aura.partners.voice.chrome;

import X.AGH;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.BBI;
import X.BFM;
import X.BRg;
import X.C1BO;
import X.C1HY;
import X.C1er;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C78N;
import X.F2N;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.conversation.widget.api.ConversationPresentationAction;
import com.facebook.aura.conversation.widget.api.ConversationPresentationActionContext;
import com.facebook.aura.conversation.widget.api.ConversationPresentationActionContributor;
import com.facebook.aura.conversation.widget.api.PresentationLinkSource;
import com.facebook.aura.partners.voice.intf.Voice;
import com.facebook.aura.partners.voice.intf.VoiceCallEntryPoint;
import com.facebook.aura.partners.voice.intf.VoiceCallStart;
import com.facebook.aura.partners.voice.screen.VoiceCallStarterKt;
import com.facebook.aura.toast.api.ToastApi;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class VoiceConversationPresentationAction implements ConversationPresentationActionContributor {
    public static final VoiceConversationPresentationAction INSTANCE = new VoiceConversationPresentationAction();

    @Override // com.facebook.aura.conversation.widget.api.ConversationPresentationActionContributor
    public ConversationPresentationAction rememberAction(ConversationPresentationActionContext conversationPresentationActionContext, BFM bfm, int i) {
        C7384Etj.A0Y(conversationPresentationActionContext, 0);
        bfm.AgE(1184026917);
        G0U<VoiceCallStart, Unit> g0uRememberConversationCallStarter = VoiceCallStarterKt.rememberConversationCallStarter(conversationPresentationActionContext.threadId, !conversationPresentationActionContext.isReadOnly, null, null, null, bfm, 0, 28);
        final AbstractC3358CGz abstractC3358CGzA0g = AnonymousClass002.A0g(bfm);
        F2N f2nA00 = C1HY.A00(bfm);
        final MutableState mutableStateA00 = C1er.A00(bfm, conversationPresentationActionContext);
        final MutableState mutableStateA002 = C1er.A00(bfm, g0uRememberConversationCallStarter);
        Object objAaT = bfm.AaT();
        Object obj = C78N.A00;
        if (objAaT == obj) {
            objAaT = AnonymousClass004.A11(bfm, null);
        }
        final MutableState mutableState = (MutableState) objAaT;
        PendingCallStart pendingCallStart = (PendingCallStart) mutableState.getValue();
        if (pendingCallStart == null) {
            bfm.AgE(-1219917261);
        } else {
            boolean zA1R = AnonymousClass001.A1R(bfm, mutableStateA002, AnonymousClass005.A1V(bfm, pendingCallStart, f2nA00, abstractC3358CGzA0g, AnonymousClass001.A1Y(mutableStateA00, bfm, -1219917260)));
            Object objAaT2 = bfm.AaT();
            if (zA1R || objAaT2 == obj) {
                objAaT2 = new VoiceConversationPresentationAction$rememberAction$1$1$1(pendingCallStart, f2nA00, abstractC3358CGzA0g, mutableStateA00, mutableState, mutableStateA002, null);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A18(bfm, objAaT2, pendingCallStart);
        }
        BBI bbiA07 = C3cG.A07(bfm);
        boolean zA65 = bfm.A65(abstractC3358CGzA0g);
        Object objAaT3 = bfm.AaT();
        if (zA65 || objAaT3 == obj) {
            objAaT3 = new ConversationPresentationAction() { // from class: com.facebook.aura.partners.voice.chrome.VoiceConversationPresentationAction$rememberAction$2$1
                @Override // com.facebook.aura.conversation.widget.api.ConversationPresentationAction
                public boolean handle(String str, PresentationLinkSource presentationLinkSource) {
                    VoiceCallStart voiceCallStartInboundCallStart;
                    boolean zA1a = AnonymousClass002.A1a(str, presentationLinkSource);
                    if (VoiceConversationPresentationActionKt.isVoiceCallStartUrl(str)) {
                        if (presentationLinkSource instanceof PresentationLinkSource.TranscriptButton) {
                            voiceCallStartInboundCallStart = new VoiceCallStart(VoiceCallEntryPoint.CHAT_CTA, AGH.A0E());
                        } else {
                            if (!(presentationLinkSource instanceof PresentationLinkSource.Inbound)) {
                                throw C3cG.A0q();
                            }
                            if (Voice.INSTANCE.isCallSupported(abstractC3358CGzA0g)) {
                                voiceCallStartInboundCallStart = VoiceConversationPresentationActionKt.inboundCallStart(str, ((PresentationLinkSource.Inbound) presentationLinkSource).origin);
                            }
                        }
                        requestCall(voiceCallStartInboundCallStart);
                        return zA1a;
                    }
                    return false;
                }

                private final void requestCall(VoiceCallStart voiceCallStart) {
                    if (C3cH.A1P(C3cG.A0K(abstractC3358CGzA0g))) {
                        return;
                    }
                    if (!VoiceConversationPresentationActionKt.canStartCall(mutableStateA00.getValue(), abstractC3358CGzA0g)) {
                        ToastApi.INSTANCE.showToast(R.string._name_removed__res_0x7f120651);
                        return;
                    }
                    if (voiceCallStart.entryPoint == VoiceCallEntryPoint.CHAT_CTA) {
                        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, HatchSubsurface.MESSAGE_LIST, mutableStateA00.getValue().analyticsScreen, HatchComponent.VOICE_BUTTON, null, mutableStateA00.getValue().analyticsMetadata, null);
                    }
                    boolean z = mutableStateA00.getValue().isConnected;
                    MutableState<PendingCallStart> mutableState2 = mutableState;
                    if (!z) {
                        mutableState2.Af8(new PendingCallStart(mutableStateA00.getValue().threadId, voiceCallStart));
                    } else {
                        mutableState2.Af8(null);
                        C1BO.A0B(mutableStateA002).invoke(voiceCallStart);
                    }
                }

                @Override // com.facebook.aura.conversation.widget.api.ConversationPresentationAction
                public /* bridge */ BRg cardModifier(String str, List<String> list) {
                    return BRg.A00;
                }
            };
            bfm.Ai0(objAaT3);
        }
        VoiceConversationPresentationAction$rememberAction$2$1 voiceConversationPresentationAction$rememberAction$2$1 = (VoiceConversationPresentationAction$rememberAction$2$1) objAaT3;
        BBI.A0R(bbiA07, false);
        return voiceConversationPresentationAction$rememberAction$2$1;
    }

    public static final /* synthetic */ ConversationPresentationActionContext access$rememberAction$lambda$0(C1BO c1bo) {
        return (ConversationPresentationActionContext) c1bo.getValue();
    }
}

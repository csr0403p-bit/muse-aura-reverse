package com.facebook.rsys.metaaivoicestate.api.gen;

import X.C8921Ftd;
import X.G50;
import X.GUe;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public abstract class MetaAiVoiceStateApi {
    public static G50<MetaAiVoiceStateApi> CONVERTER = C8921Ftd.A00(10);

    public final class CProxy extends MetaAiVoiceStateApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native MetaAiVoiceStateApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        @Override // com.facebook.rsys.metaaivoicestate.api.gen.MetaAiVoiceStateApi
        public native void sendAppLoadSessionConfig(String str);

        @Override // com.facebook.rsys.metaaivoicestate.api.gen.MetaAiVoiceStateApi
        public native void sendAttachments(ArrayList<String> arrayList);

        @Override // com.facebook.rsys.metaaivoicestate.api.gen.MetaAiVoiceStateApi
        public native void sendBotStateMessage(String str);

        @Override // com.facebook.rsys.metaaivoicestate.api.gen.MetaAiVoiceStateApi
        public native void sendContextTokens(ArrayList<String> arrayList, ArrayList<String> arrayList2, int i);

        @Override // com.facebook.rsys.metaaivoicestate.api.gen.MetaAiVoiceStateApi
        public native void sendContextTokensWithSpeculation(ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayList<String> arrayList3, int i);

        @Override // com.facebook.rsys.metaaivoicestate.api.gen.MetaAiVoiceStateApi
        public native void sendCreatorBotClientReadyMessage(String str);

        @Override // com.facebook.rsys.metaaivoicestate.api.gen.MetaAiVoiceStateApi
        public native void sendDeepDiveMicPushToTalk(String str, long j, long j2, String str2, long j3);

        @Override // com.facebook.rsys.metaaivoicestate.api.gen.MetaAiVoiceStateApi
        public native void sendDeepDiveMiniPlayerClosed();

        @Override // com.facebook.rsys.metaaivoicestate.api.gen.MetaAiVoiceStateApi
        public native void sendDeepDiveMiniPlayerClosedInVoiceSession(String str, String str2);

        @Override // com.facebook.rsys.metaaivoicestate.api.gen.MetaAiVoiceStateApi
        public native void sendDeepDiveSelectDiscussedSubject(String str);

        @Override // com.facebook.rsys.metaaivoicestate.api.gen.MetaAiVoiceStateApi
        public native void sendDeepDiveSelectFeedPost(String str);

        @Override // com.facebook.rsys.metaaivoicestate.api.gen.MetaAiVoiceStateApi
        public native void sendDeepDiveSelectFeedPostInVoiceSession(String str, boolean z, String str2);

        @Override // com.facebook.rsys.metaaivoicestate.api.gen.MetaAiVoiceStateApi
        public native void sendDeepDiveSelectFeedPostWithNux(String str, boolean z);

        @Override // com.facebook.rsys.metaaivoicestate.api.gen.MetaAiVoiceStateApi
        public native void sendDeepDiveSelectTopic(String str, String str2);

        @Override // com.facebook.rsys.metaaivoicestate.api.gen.MetaAiVoiceStateApi
        public native void sendEvent(int i);

        @Override // com.facebook.rsys.metaaivoicestate.api.gen.MetaAiVoiceStateApi
        public native void sendEventWithAttachment(int i, String str);

        @Override // com.facebook.rsys.metaaivoicestate.api.gen.MetaAiVoiceStateApi
        public native void sendLocationData(LocationData locationData);

        @Override // com.facebook.rsys.metaaivoicestate.api.gen.MetaAiVoiceStateApi
        public native void sendMessage(String str, ChatHistory chatHistory);

        @Override // com.facebook.rsys.metaaivoicestate.api.gen.MetaAiVoiceStateApi
        public native void sendPrompt(String str, String str2, boolean z);

        @Override // com.facebook.rsys.metaaivoicestate.api.gen.MetaAiVoiceStateApi
        public native void sendPsiToolResponse(PsiToolData psiToolData);

        @Override // com.facebook.rsys.metaaivoicestate.api.gen.MetaAiVoiceStateApi
        public native void sendReadAloudData(ReadAloudData readAloudData);

        @Override // com.facebook.rsys.metaaivoicestate.api.gen.MetaAiVoiceStateApi
        public native void sendReadyForGreeting();

        @Override // com.facebook.rsys.metaaivoicestate.api.gen.MetaAiVoiceStateApi
        public native void sendSummarizeUnreadToolResponse(SummarizeUnreadToolData summarizeUnreadToolData);

        @Override // com.facebook.rsys.metaaivoicestate.api.gen.MetaAiVoiceStateApi
        public native void sendTap(double d, double d2, long j);

        @Override // com.facebook.rsys.metaaivoicestate.api.gen.MetaAiVoiceStateApi
        public native void sendToolCallResult(MetaAiToolCallResult metaAiToolCallResult);

        @Override // com.facebook.rsys.metaaivoicestate.api.gen.MetaAiVoiceStateApi
        public native void sendTtsSpeedUpdate(double d);

        @Override // com.facebook.rsys.metaaivoicestate.api.gen.MetaAiVoiceStateApi
        public native void sendUserContextUpdate(String str, int i);

        @Override // com.facebook.rsys.metaaivoicestate.api.gen.MetaAiVoiceStateApi
        public native void sendUserMicrophoneUnmuted();

        @Override // com.facebook.rsys.metaaivoicestate.api.gen.MetaAiVoiceStateApi
        public native void sendVoiceCommandExecutionResult(VoiceCommandExecutionResult voiceCommandExecutionResult);

        @Override // com.facebook.rsys.metaaivoicestate.api.gen.MetaAiVoiceStateApi
        public native void switchUgcBot(int i, long j);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof MetaAiVoiceStateApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        static {
            GUe.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void sendAppLoadSessionConfig(String str);

    public abstract void sendAttachments(ArrayList<String> arrayList);

    public abstract void sendBotStateMessage(String str);

    public abstract void sendContextTokens(ArrayList<String> arrayList, ArrayList<String> arrayList2, int i);

    public abstract void sendContextTokensWithSpeculation(ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayList<String> arrayList3, int i);

    public abstract void sendCreatorBotClientReadyMessage(String str);

    public abstract void sendDeepDiveMicPushToTalk(String str, long j, long j2, String str2, long j3);

    public abstract void sendDeepDiveMiniPlayerClosed();

    public abstract void sendDeepDiveMiniPlayerClosedInVoiceSession(String str, String str2);

    public abstract void sendDeepDiveSelectDiscussedSubject(String str);

    public abstract void sendDeepDiveSelectFeedPost(String str);

    public abstract void sendDeepDiveSelectFeedPostInVoiceSession(String str, boolean z, String str2);

    public abstract void sendDeepDiveSelectFeedPostWithNux(String str, boolean z);

    public abstract void sendDeepDiveSelectTopic(String str, String str2);

    public abstract void sendEvent(int i);

    public abstract void sendEventWithAttachment(int i, String str);

    public abstract void sendLocationData(LocationData locationData);

    public abstract void sendMessage(String str, ChatHistory chatHistory);

    public abstract void sendPrompt(String str, String str2, boolean z);

    public abstract void sendPsiToolResponse(PsiToolData psiToolData);

    public abstract void sendReadAloudData(ReadAloudData readAloudData);

    public abstract void sendReadyForGreeting();

    public abstract void sendSummarizeUnreadToolResponse(SummarizeUnreadToolData summarizeUnreadToolData);

    public abstract void sendTap(double d, double d2, long j);

    public abstract void sendToolCallResult(MetaAiToolCallResult metaAiToolCallResult);

    public abstract void sendTtsSpeedUpdate(double d);

    public abstract void sendUserContextUpdate(String str, int i);

    public abstract void sendUserMicrophoneUnmuted();

    public abstract void sendVoiceCommandExecutionResult(VoiceCommandExecutionResult voiceCommandExecutionResult);

    public abstract void switchUgcBot(int i, long j);
}

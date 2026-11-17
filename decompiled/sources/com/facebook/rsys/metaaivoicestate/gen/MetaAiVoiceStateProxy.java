package com.facebook.rsys.metaaivoicestate.gen;

import X.C8921Ftd;
import X.G50;
import X.GUf;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes6.dex */
public abstract class MetaAiVoiceStateProxy {
    public static G50<MetaAiVoiceStateProxy> CONVERTER = C8921Ftd.A00(43);

    public final class CProxy extends MetaAiVoiceStateProxy {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native MetaAiVoiceStateProxy createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        @Override // com.facebook.rsys.metaaivoicestate.gen.MetaAiVoiceStateProxy
        public native void onConnected(MetaAiConnectState metaAiConnectState);

        @Override // com.facebook.rsys.metaaivoicestate.gen.MetaAiVoiceStateProxy
        public native void onCosmosSessionCreated();

        @Override // com.facebook.rsys.metaaivoicestate.gen.MetaAiVoiceStateProxy
        public native void onDeepDiveState(DeepDiveState deepDiveState);

        @Override // com.facebook.rsys.metaaivoicestate.gen.MetaAiVoiceStateProxy
        public native void onInternalDebug(RealtimeaiInternalDebugContent realtimeaiInternalDebugContent);

        @Override // com.facebook.rsys.metaaivoicestate.gen.MetaAiVoiceStateProxy
        public native void onSessionInfo(MetaAiSessionInfo metaAiSessionInfo);

        @Override // com.facebook.rsys.metaaivoicestate.gen.MetaAiVoiceStateProxy
        public native void onToolCallCancel(MetaAiToolCallCancel metaAiToolCallCancel);

        @Override // com.facebook.rsys.metaaivoicestate.gen.MetaAiVoiceStateProxy
        public native void onToolCallRequest(MetaAiToolCallRequest metaAiToolCallRequest);

        @Override // com.facebook.rsys.metaaivoicestate.gen.MetaAiVoiceStateProxy
        public native void onUgcBotChangeResult(UgcBotChangeResult ugcBotChangeResult);

        @Override // com.facebook.rsys.metaaivoicestate.gen.MetaAiVoiceStateProxy
        public native void onUpdate(MetaAiVoiceState metaAiVoiceState);

        @Override // com.facebook.rsys.metaaivoicestate.gen.MetaAiVoiceStateProxy
        public native void onVoiceCommand(MetaAiVoiceCommand metaAiVoiceCommand);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof MetaAiVoiceStateProxy)) {
                return false;
            }
            return nativeEquals(obj);
        }

        static {
            GUf.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void onConnected(MetaAiConnectState metaAiConnectState);

    public abstract void onCosmosSessionCreated();

    public abstract void onDeepDiveState(DeepDiveState deepDiveState);

    public abstract void onInternalDebug(RealtimeaiInternalDebugContent realtimeaiInternalDebugContent);

    public abstract void onSessionInfo(MetaAiSessionInfo metaAiSessionInfo);

    public abstract void onToolCallCancel(MetaAiToolCallCancel metaAiToolCallCancel);

    public abstract void onToolCallRequest(MetaAiToolCallRequest metaAiToolCallRequest);

    public abstract void onUgcBotChangeResult(UgcBotChangeResult ugcBotChangeResult);

    public abstract void onUpdate(MetaAiVoiceState metaAiVoiceState);

    public abstract void onVoiceCommand(MetaAiVoiceCommand metaAiVoiceCommand);
}

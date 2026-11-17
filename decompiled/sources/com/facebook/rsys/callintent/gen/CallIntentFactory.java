package com.facebook.rsys.callintent.gen;

import X.C8926Fti;
import X.G50;
import X.GUb;
import X.GUo;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.execution.gen.TaskExecutor;
import com.facebook.rsys.outgoingcallconfig.gen.OutgoingCallConfig;
import com.facebook.rsys.perf.holders.gen.PerfListenerFactory;
import com.facebook.rsys.perf.holders.gen.PerfLoggerHolder;
import com.facebook.rsys.util.future.RsysFuture;
import com.facebook.simplejni.NativeHolder;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes6.dex */
public abstract class CallIntentFactory {
    public static G50<CallIntentFactory> CONVERTER = C8926Fti.A00(24);

    public final class CProxy extends CallIntentFactory {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        private native void asyncDestroy(RsysFuture<Void, Void> rsysFuture, TaskExecutor taskExecutor);

        private native void createCallIntentAsync(OutgoingCallConfig outgoingCallConfig, RsysFuture<CallIntentCreationResult, Void> rsysFuture, TaskExecutor taskExecutor);

        public static native CallIntentFactory createFromMcfType(McfReference mcfReference);

        public static native CallIntentFactory createInstance(boolean z, TaskExecutor taskExecutor, CallIntentFactoryListener callIntentFactoryListener, PerfListenerFactory perfListenerFactory);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.callintent.gen.CallIntentFactory
        public native CallIntentCreationResult createCallIntent(OutgoingCallConfig outgoingCallConfig);

        @Override // com.facebook.rsys.callintent.gen.CallIntentFactory
        public native void destroy();

        @Override // com.facebook.rsys.callintent.gen.CallIntentFactory
        public native PerfLoggerHolder getPerfLogger(String str, String str2);

        public native int hashCode();

        @Override // com.facebook.rsys.callintent.gen.CallIntentFactory
        public native void registerUser(SignalingUserContext signalingUserContext);

        @Override // com.facebook.rsys.callintent.gen.CallIntentFactory
        public native void unregisterUser(String str, String str2, CallIntentFactoryUnregisterCallback callIntentFactoryUnregisterCallback);

        @Override // com.facebook.rsys.callintent.gen.CallIntentFactory
        public ListenableFuture<Void> asyncDestroy() {
            RsysFuture<Void, Void> rsysFuture = new RsysFuture<>();
            asyncDestroy(rsysFuture, new GUo());
            return rsysFuture;
        }

        @Override // com.facebook.rsys.callintent.gen.CallIntentFactory
        public ListenableFuture<CallIntentCreationResult> createCallIntentAsync(OutgoingCallConfig outgoingCallConfig) {
            RsysFuture<CallIntentCreationResult, Void> rsysFuture = new RsysFuture<>();
            createCallIntentAsync(outgoingCallConfig, rsysFuture, new GUo());
            return rsysFuture;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof CallIntentFactory)) {
                return false;
            }
            return nativeEquals(obj);
        }

        static {
            GUb.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract ListenableFuture<Void> asyncDestroy();

    public abstract CallIntentCreationResult createCallIntent(OutgoingCallConfig outgoingCallConfig);

    public abstract ListenableFuture<CallIntentCreationResult> createCallIntentAsync(OutgoingCallConfig outgoingCallConfig);

    public abstract void destroy();

    public abstract PerfLoggerHolder getPerfLogger(String str, String str2);

    public abstract void registerUser(SignalingUserContext signalingUserContext);

    public abstract void unregisterUser(String str, String str2, CallIntentFactoryUnregisterCallback callIntentFactoryUnregisterCallback);
}

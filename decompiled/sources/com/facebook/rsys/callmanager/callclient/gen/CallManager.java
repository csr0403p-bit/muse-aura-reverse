package com.facebook.rsys.callmanager.callclient.gen;

import X.AbstractC7607F5u;
import X.AbstractC7608F5v;
import X.C8926Fti;
import X.ETi;
import X.G50;
import X.GUo;
import X.GW9;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.msys.mci.Execution;
import com.facebook.rsys.callintent.gen.CallIntentCreationResult;
import com.facebook.rsys.callintent.gen.CallIntentFactoryListener;
import com.facebook.rsys.callmanager.callintentcommon.gen.InitCallCallback;
import com.facebook.rsys.callmanager.callintentcommon.gen.InitCallConfig;
import com.facebook.rsys.callmanager.callintentcommon.gen.RejectCallParams;
import com.facebook.rsys.callmanager.gen.CallManagerClient;
import com.facebook.rsys.callmanager.gen.CallManagerConfig;
import com.facebook.rsys.callmanager.gen.UnregisterCallback;
import com.facebook.rsys.callmanager.gen.UserContext;
import com.facebook.rsys.devxagent.gen.DevXAgentApi;
import com.facebook.rsys.devxcallagent.gen.DevXAgentCallApi;
import com.facebook.rsys.execution.gen.TaskExecutor;
import com.facebook.rsys.filelogging.gen.LogFile;
import com.facebook.rsys.outgoingcallconfig.gen.OutgoingCallConfig;
import com.facebook.rsys.util.future.RsysFuture;
import com.facebook.simplejni.NativeHolder;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public abstract class CallManager {
    public static G50<CallManager> CONVERTER = C8926Fti.A00(28);

    public final class CProxy extends CallManager {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native CallManager createCallManager(CallManagerConfig callManagerConfig, CallManagerClient callManagerClient, DevXAgentApi devXAgentApi);

        public static native CallManager createFromMcfType(McfReference mcfReference);

        private native void destroy(RsysFuture<Void, Void> rsysFuture, TaskExecutor taskExecutor);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        private native void unregisterUserAsync(String str, String str2, RsysFuture<Void, Void> rsysFuture, TaskExecutor taskExecutor);

        @Override // com.facebook.rsys.callmanager.callclient.gen.CallManager
        public native CallIntentCreationResult createCallIntent(OutgoingCallConfig outgoingCallConfig);

        @Override // com.facebook.rsys.callmanager.callclient.gen.CallManager
        public native LogFile createLogFileForCall(int i, String str);

        @Override // com.facebook.rsys.callmanager.callclient.gen.CallManager
        public native DevXAgentCallApi getDevXAgentCallApi();

        @Override // com.facebook.rsys.callmanager.callclient.gen.CallManager
        public native ArrayList<LogFile> getRecentLogFiles(int i, int i2);

        public native int hashCode();

        @Override // com.facebook.rsys.callmanager.callclient.gen.CallManager
        public native void initCall(InitCallConfig initCallConfig, InitCallCallback initCallCallback);

        @Override // com.facebook.rsys.callmanager.callclient.gen.CallManager
        public native void registerUser(UserContext userContext, CallIntentFactoryListener callIntentFactoryListener);

        @Override // com.facebook.rsys.callmanager.callclient.gen.CallManager
        public native void rejectCall(RejectCallParams rejectCallParams);

        @Override // com.facebook.rsys.callmanager.callclient.gen.CallManager
        public native void unregisterUser(String str, String str2, UnregisterCallback unregisterCallback);

        static {
            if (GW9.A00) {
                return;
            }
            try {
                AbstractC7607F5u.A1F();
                Execution.initialize();
                ETi.loadLibrary("jniperflogger");
                ETi.loadLibrary("rsyscallmanagercallclientjniLatest");
                GW9.A00 = true;
            } catch (ClassNotFoundException e) {
                throw AbstractC7608F5v.A0m(e);
            }
        }

        @Override // com.facebook.rsys.callmanager.callclient.gen.CallManager
        public ListenableFuture<Void> destroy() {
            RsysFuture<Void, Void> rsysFuture = new RsysFuture<>();
            destroy(rsysFuture, new GUo());
            return rsysFuture;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof CallManager)) {
                return false;
            }
            return nativeEquals(obj);
        }

        @Override // com.facebook.rsys.callmanager.callclient.gen.CallManager
        public ListenableFuture<Void> unregisterUserAsync(String str, String str2) {
            RsysFuture<Void, Void> rsysFuture = new RsysFuture<>();
            unregisterUserAsync(str, str2, rsysFuture, new GUo());
            return rsysFuture;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract CallIntentCreationResult createCallIntent(OutgoingCallConfig outgoingCallConfig);

    public abstract LogFile createLogFileForCall(int i, String str);

    public abstract ListenableFuture<Void> destroy();

    public abstract DevXAgentCallApi getDevXAgentCallApi();

    public abstract ArrayList<LogFile> getRecentLogFiles(int i, int i2);

    public abstract void initCall(InitCallConfig initCallConfig, InitCallCallback initCallCallback);

    public abstract void registerUser(UserContext userContext, CallIntentFactoryListener callIntentFactoryListener);

    public abstract void rejectCall(RejectCallParams rejectCallParams);

    public abstract void unregisterUser(String str, String str2, UnregisterCallback unregisterCallback);

    public abstract ListenableFuture<Void> unregisterUserAsync(String str, String str2);
}

package com.facebook.rsys.devxagent.gen;

import X.C8925Fth;
import X.G50;
import X.GUo;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.execution.gen.TaskExecutor;
import com.facebook.rsys.util.future.RsysFuture;
import com.facebook.simplejni.NativeHolder;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public abstract class DevxDumpappAdapter {
    public static G50<DevxDumpappAdapter> CONVERTER = C8925Fth.A00(15);

    public final class CProxy extends DevxDumpappAdapter {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native DevxDumpappAdapter createFromMcfType(McfReference mcfReference);

        private native void executeCommand(String str, String str2, RsysFuture<String, Void> rsysFuture, TaskExecutor taskExecutor);

        public static native DevxDumpappAdapter get(DevXAgentApi devXAgentApi);

        private native void getInfo(ArrayList<String> arrayList, RsysFuture<String, Void> rsysFuture, TaskExecutor taskExecutor);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public static native void reportDumpappResult(DevXAgentApi devXAgentApi, long j, DumpappResult dumpappResult);

        public static native void setDumpappProxy(DevXAgentApi devXAgentApi, DumpappProxy dumpappProxy);

        public native int hashCode();

        @Override // com.facebook.rsys.devxagent.gen.DevxDumpappAdapter
        public native String help(String str);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof DevxDumpappAdapter)) {
                return false;
            }
            return nativeEquals(obj);
        }

        @Override // com.facebook.rsys.devxagent.gen.DevxDumpappAdapter
        public ListenableFuture<String> executeCommand(String str, String str2) {
            RsysFuture<String, Void> rsysFuture = new RsysFuture<>();
            executeCommand(str, str2, rsysFuture, new GUo());
            return rsysFuture;
        }

        @Override // com.facebook.rsys.devxagent.gen.DevxDumpappAdapter
        public ListenableFuture<String> getInfo(ArrayList<String> arrayList) {
            RsysFuture<String, Void> rsysFuture = new RsysFuture<>();
            getInfo(arrayList, rsysFuture, new GUo());
            return rsysFuture;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract ListenableFuture<String> executeCommand(String str, String str2);

    public abstract ListenableFuture<String> getInfo(ArrayList<String> arrayList);

    public abstract String help(String str);
}

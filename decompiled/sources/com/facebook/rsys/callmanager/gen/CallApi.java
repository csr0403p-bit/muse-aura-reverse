package com.facebook.rsys.callmanager.gen;

import X.C8926Fti;
import X.G50;
import X.GUR;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.call.gen.AddUsersOptions;
import com.facebook.rsys.datachannel.gen.DataApi;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public abstract class CallApi {
    public static G50<CallApi> CONVERTER = C8926Fti.A00(33);

    public final class CProxy extends CallApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native CallApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.callmanager.gen.CallApi
        public native void accept(boolean z, boolean z2, boolean z3);

        @Override // com.facebook.rsys.callmanager.gen.CallApi
        public native void addUsers(ArrayList<String> arrayList, AddUsersOptions addUsersOptions);

        @Override // com.facebook.rsys.callmanager.gen.CallApi
        public native void attemptAccept(boolean z, boolean z2, boolean z3);

        @Override // com.facebook.rsys.callmanager.gen.CallApi
        public native void consentToSeeRemoteVideo();

        @Override // com.facebook.rsys.callmanager.gen.CallApi
        public native void end(int i, String str, boolean z);

        @Override // com.facebook.rsys.callmanager.gen.CallApi
        public native void finishSetup();

        @Override // com.facebook.rsys.callmanager.gen.CallApi
        public native DataApi getDataApi();

        public native int hashCode();

        @Override // com.facebook.rsys.callmanager.gen.CallApi
        public native void removeUsers(ArrayList<String> arrayList);

        @Override // com.facebook.rsys.callmanager.gen.CallApi
        public native void removeWhenEnded();

        @Override // com.facebook.rsys.callmanager.gen.CallApi
        public native void respondToApprovalRequests(ArrayList<String> arrayList, int i);

        @Override // com.facebook.rsys.callmanager.gen.CallApi
        public native void setAppModelListener(AppModelListener appModelListener);

        @Override // com.facebook.rsys.callmanager.gen.CallApi
        public native void transfer();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof CallApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        static {
            GUR.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void accept(boolean z, boolean z2, boolean z3);

    public abstract void addUsers(ArrayList<String> arrayList, AddUsersOptions addUsersOptions);

    public abstract void attemptAccept(boolean z, boolean z2, boolean z3);

    public abstract void consentToSeeRemoteVideo();

    public abstract void end(int i, String str, boolean z);

    public abstract void finishSetup();

    public abstract DataApi getDataApi();

    public abstract void removeUsers(ArrayList<String> arrayList);

    public abstract void removeWhenEnded();

    public abstract void respondToApprovalRequests(ArrayList<String> arrayList, int i);

    public abstract void setAppModelListener(AppModelListener appModelListener);

    public abstract void transfer();
}

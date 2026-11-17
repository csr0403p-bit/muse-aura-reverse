package com.facebook.rsys.crypto.gen;

import X.C8926Fti;
import X.G50;
import X.GZ8;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public abstract class CryptoApi {
    public static G50<CryptoApi> CONVERTER = C8926Fti.A00(42);

    public final class CProxy extends CryptoApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native CryptoApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.crypto.gen.CryptoApi
        public native void ackNewDeviceNotifications(ArrayList<ParticipantIdentityInfo> arrayList);

        @Override // com.facebook.rsys.crypto.gen.CryptoApi
        public native void ackUiDisplayedParticipantIds(ArrayList<String> arrayList);

        public native int hashCode();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof CryptoApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        static {
            GZ8.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void ackNewDeviceNotifications(ArrayList<ParticipantIdentityInfo> arrayList);

    public abstract void ackUiDisplayedParticipantIds(ArrayList<String> arrayList);
}

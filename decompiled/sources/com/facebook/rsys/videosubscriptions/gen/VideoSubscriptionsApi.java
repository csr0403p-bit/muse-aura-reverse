package com.facebook.rsys.videosubscriptions.gen;

import X.C8924Ftg;
import X.G50;
import X.GYr;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes6.dex */
public abstract class VideoSubscriptionsApi {
    public static G50<VideoSubscriptionsApi> CONVERTER = new C8924Ftg(8);

    public final class CProxy extends VideoSubscriptionsApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native VideoSubscriptionsApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        @Override // com.facebook.rsys.videosubscriptions.gen.VideoSubscriptionsApi
        public native void updateSubscriptions(VideoSubscriptions videoSubscriptions);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof VideoSubscriptionsApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        static {
            GYr.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void updateSubscriptions(VideoSubscriptions videoSubscriptions);
}

package com.facebook.rsys.stream.gen;

import X.C8922Fte;
import X.G50;
import X.GUj;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes6.dex */
public abstract class StreamApi {
    public static G50<StreamApi> CONVERTER = C8922Fte.A00(22);

    public final class CProxy extends StreamApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native StreamApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.stream.gen.StreamApi
        public native VideoStreamController createVideoStream(VideoStreamParams videoStreamParams);

        public native int hashCode();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof StreamApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        static {
            GUj.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract VideoStreamController createVideoStream(VideoStreamParams videoStreamParams);
}

package com.facebook.rsys.videorender.gen;

import X.C8924Ftg;
import X.G50;
import X.GUn;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.media.gen.StreamInfo;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public abstract class VideoRenderSurface {
    public static G50<VideoRenderSurface> CONVERTER = new C8924Ftg(6);

    public final class CProxy extends VideoRenderSurface {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native VideoRenderSurface createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.videorender.gen.VideoRenderSurface
        public native void addRenderItem(VideoRenderItem videoRenderItem);

        public native int hashCode();

        @Override // com.facebook.rsys.videorender.gen.VideoRenderSurface
        public native void removeRenderItem(String str, StreamInfo streamInfo);

        @Override // com.facebook.rsys.videorender.gen.VideoRenderSurface
        public native void setRenderItems(ArrayList<VideoRenderItem> arrayList);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof VideoRenderSurface)) {
                return false;
            }
            return nativeEquals(obj);
        }

        static {
            GUn.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void addRenderItem(VideoRenderItem videoRenderItem);

    public abstract void removeRenderItem(String str, StreamInfo streamInfo);

    public abstract void setRenderItems(ArrayList<VideoRenderItem> arrayList);
}

package com.facebook.rsys.mediastats.gen;

import X.C8921Ftd;
import X.G50;
import X.GUd;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public abstract class MediaStatsListener {
    public static G50<MediaStatsListener> CONVERTER = C8921Ftd.A00(0);

    public final class CProxy extends MediaStatsListener {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native MediaStatsListener createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        @Override // com.facebook.rsys.mediastats.gen.MediaStatsListener
        public native void onMediaStats(ArrayList<MediaStats> arrayList);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof MediaStatsListener)) {
                return false;
            }
            return nativeEquals(obj);
        }

        static {
            GUd.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void onMediaStats(ArrayList<MediaStats> arrayList);
}

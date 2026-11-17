package com.facebook.rsys.metaaivoicestate.gen;

import X.C8921Ftd;
import X.G50;
import X.GUf;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes6.dex */
public abstract class MetaAiWearableAppEventsProxy {
    public static G50<MetaAiWearableAppEventsProxy> CONVERTER = C8921Ftd.A00(44);

    public final class CProxy extends MetaAiWearableAppEventsProxy {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native MetaAiWearableAppEventsProxy createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        @Override // com.facebook.rsys.metaaivoicestate.gen.MetaAiWearableAppEventsProxy
        public native void onEvent(WearableAppEvent wearableAppEvent);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof MetaAiWearableAppEventsProxy)) {
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

    public abstract void onEvent(WearableAppEvent wearableAppEvent);
}

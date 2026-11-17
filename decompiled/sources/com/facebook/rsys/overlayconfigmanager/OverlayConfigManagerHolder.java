package com.facebook.rsys.overlayconfigmanager;

import X.AbstractC7607F5u;
import X.AbstractC7608F5v;
import X.ETi;
import X.GWD;
import com.facebook.msys.mci.Execution;
import com.facebook.rtc.fbwebrtc.overlayconfig.overlayconfiglayer.OverlayConfigLayerInterface;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public class OverlayConfigManagerHolder {
    public static final OverlayConfigLayerInterface[] EMPTY_OVERLAYCONFIG_LAYER_ARRAY;
    public final NativeHolder mNativeHolder;

    public static native NativeHolder initNativeHolder(OverlayConfigLayerInterface[] overlayConfigLayerInterfaceArr);

    private native boolean nativeEquals(Object obj);

    public native boolean fetchParameterBoolean(int i, boolean z);

    public native int fetchParameterInt32(int i, boolean z);

    public native int hashCode();

    public native void logExposure(int i);

    static {
        if (!GWD.A00) {
            try {
                AbstractC7607F5u.A1F();
                Execution.initialize();
                ETi.loadLibrary("jniperflogger");
                ETi.loadLibrary("rsysoverlayconfigmanagerjni");
                GWD.A00 = true;
            } catch (ClassNotFoundException e) {
                throw AbstractC7608F5v.A0m(e);
            }
        }
        EMPTY_OVERLAYCONFIG_LAYER_ARRAY = new OverlayConfigLayerInterface[0];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof OverlayConfigManagerHolder)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public OverlayConfigManagerHolder(ArrayList<OverlayConfigLayerInterface> arrayList) {
        this.mNativeHolder = initNativeHolder((OverlayConfigLayerInterface[]) arrayList.toArray(EMPTY_OVERLAYCONFIG_LAYER_ARRAY));
    }

    public OverlayConfigManagerHolder(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}

package com.facebook.flipper.android;

import X.BV4;
import X.C26;
import com.facebook.flipper.core.FlipperPlugin;
import com.facebook.flipper.core.FlipperStateUpdateListener;
import com.facebook.flipper.core.StateSummary;
import com.facebook.jni.HybridData;
import java.util.Map;

/* loaded from: classes5.dex */
public class FlipperClientImpl {
    public final HybridData mHybridData;
    public final Map<Class<?>, String> A01 = BV4.A0v(8);
    public C26 A00 = new C26(new Object() { // from class: X.C27
    });

    public static native FlipperClientImpl getInstance();

    public static native void init(EventBase eventBase, EventBase eventBase2, int i, int i2, int i3, int i4, String str, String str2, String str3, String str4, String str5, String str6, String str7);

    public native void addPluginNative(FlipperPlugin flipperPlugin);

    @Deprecated
    public native <T extends FlipperPlugin> T getPlugin(String str);

    public native String getState();

    public native StateSummary getStateSummary();

    public native boolean isConnected();

    public native void removePluginNative(FlipperPlugin flipperPlugin);

    public native void start();

    public native void stop();

    public native void subscribeForUpdates(FlipperStateUpdateListener flipperStateUpdateListener);

    public native void unsubscribe();

    /* JADX WARN: Type inference failed for: r1v0, types: [X.C27] */
    public FlipperClientImpl(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}

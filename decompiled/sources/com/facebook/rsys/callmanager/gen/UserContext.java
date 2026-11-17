package com.facebook.rsys.callmanager.gen;

import X.AbstractC7609F5w;
import X.C8926Fti;
import X.G50;
import X.GUR;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.msys.mci.RedactedString;
import com.facebook.rsys.appinfo.gen.AppInfo;
import com.facebook.rsys.crypto.gen.CryptoContextHolder;
import com.facebook.rsys.filelogging.gen.LargeLogUploadProxy;
import com.facebook.rsys.log.gen.LogPersistenceProxy;
import com.facebook.rsys.logringbuffer.gen.LogRingBufferProxy;
import com.facebook.rsys.odin.gen.LiteInferenceEngineHolder;
import com.facebook.rsys.odin.gen.OdinPredictor;
import com.facebook.rsys.overlayconfigmanager.OverlayConfigManagerHolder;
import com.facebook.rsys.perf.holders.gen.PerfLoggerHolder;
import com.facebook.rsys.transport.gen.SignalingTransportProxy;
import com.facebook.simplejni.NativeHolder;
import com.facebook.xanalytics.XAnalyticsHolder;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public class UserContext {
    public static G50<UserContext> CONVERTER = C8926Fti.A00(36);
    public static long sMcfTypeId;
    public final NativeHolder mNativeHolder;

    public static native UserContext createFromMcfType(McfReference mcfReference);

    public static native NativeHolder initNativeHolder(String str, RedactedString redactedString, AppInfo appInfo, CryptoContextHolder cryptoContextHolder, SignalingTransportProxy signalingTransportProxy, LogPersistenceProxy logPersistenceProxy, LargeLogUploadProxy largeLogUploadProxy, byte[] bArr, OverlayConfigManagerHolder overlayConfigManagerHolder, String str2, ArrayList<CodecInfo> arrayList, XAnalyticsHolder xAnalyticsHolder, PerfLoggerHolder perfLoggerHolder, OdinPredictor odinPredictor, LogRingBufferProxy logRingBufferProxy, LiteInferenceEngineHolder liteInferenceEngineHolder);

    private native boolean nativeEquals(Object obj);

    public static native long nativeGetMcfTypeId();

    public native AppInfo getAppInfo();

    public native RedactedString getAuthDataAccessToken();

    public native byte[] getCapabilities();

    public native CryptoContextHolder getCryptoContext();

    public native LargeLogUploadProxy getLargeLogUploader();

    public native LiteInferenceEngineHolder getLiteInferenceEngine();

    public native String getLogDirectory();

    public native LogPersistenceProxy getLogPersister();

    public native LogRingBufferProxy getLogRingBufferProxy();

    public native OdinPredictor getOdinPredictor();

    public native OverlayConfigManagerHolder getOverlayConfigManager();

    public native PerfLoggerHolder getPerfLogger();

    public native SignalingTransportProxy getSignalingTransport();

    public native XAnalyticsHolder getStructuredlogger();

    @Deprecated
    public native ArrayList<CodecInfo> getSupportedCodecs();

    public native String getUserId();

    public native int hashCode();

    public native String toString();

    static {
        GUR.A00();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UserContext)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public UserContext(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public UserContext(String str, RedactedString redactedString, AppInfo appInfo, CryptoContextHolder cryptoContextHolder, SignalingTransportProxy signalingTransportProxy, LogPersistenceProxy logPersistenceProxy, LargeLogUploadProxy largeLogUploadProxy, byte[] bArr, OverlayConfigManagerHolder overlayConfigManagerHolder, String str2, ArrayList<CodecInfo> arrayList, XAnalyticsHolder xAnalyticsHolder, PerfLoggerHolder perfLoggerHolder, OdinPredictor odinPredictor, LogRingBufferProxy logRingBufferProxy, LiteInferenceEngineHolder liteInferenceEngineHolder) {
        AbstractC7609F5w.A1H(str, appInfo, logPersistenceProxy);
        overlayConfigManagerHolder.getClass();
        xAnalyticsHolder.getClass();
        this.mNativeHolder = initNativeHolder(str, redactedString, appInfo, cryptoContextHolder, signalingTransportProxy, logPersistenceProxy, largeLogUploadProxy, bArr, overlayConfigManagerHolder, str2, arrayList, xAnalyticsHolder, perfLoggerHolder, odinPredictor, logRingBufferProxy, liteInferenceEngineHolder);
    }
}

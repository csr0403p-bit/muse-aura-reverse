package X;

import com.facebook.rsys.appinfo.gen.AppInfo;
import com.facebook.rsys.log.gen.LogPersistenceProxy;
import com.facebook.rsys.logringbuffer.gen.LogRingBufferProxy;
import com.facebook.rsys.transport.gen.SignalingTransportProxy;
import com.facebook.rtc.fbwebrtc.overlayconfig.overlayconfiglayer.OverlayConfigLayerInterface;
import com.facebook.xanalytics.XAnalyticsHolder;
import kotlin.jvm.functions.Function0;

/* renamed from: X.GUq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9628GUq {
    public final AppInfo A00;
    public final G8S A01;
    public final OverlayConfigLayerInterface A02;
    public final XAnalyticsHolder A03;
    public final String A04;
    public final String A05;
    public final Function0<LogPersistenceProxy> A06;
    public final Function0<LogRingBufferProxy> A07;
    public final Function0<SignalingTransportProxy> A08;

    public C9628GUq(AppInfo appInfo, G8S g8s, OverlayConfigLayerInterface overlayConfigLayerInterface, XAnalyticsHolder xAnalyticsHolder, String str, String str2, Function0 function0, Function0 function02, Function0 function03) {
        AnonymousClass003.A0v(str, g8s);
        C7384Etj.A0Y(xAnalyticsHolder, 7);
        this.A05 = str;
        this.A00 = appInfo;
        this.A01 = g8s;
        this.A02 = overlayConfigLayerInterface;
        this.A08 = function0;
        this.A06 = function02;
        this.A03 = xAnalyticsHolder;
        this.A04 = str2;
        this.A07 = function03;
    }
}

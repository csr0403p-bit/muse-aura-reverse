package com.facebook.falco.sampling;

import X.BV4;
import X.BV5;
import X.C3cG;
import X.C5090DVl;
import X.C5091DVm;
import X.C8j4;
import X.CFK;
import X.CLo;
import X.DHQ;
import X.DKG;
import X.DVW;
import X.DVY;
import X.DVZ;
import X.ETi;
import X.F18;
import X.InterfaceC4017Cjy;
import android.content.Context;
import com.facebook.aura.analytics.impl.FFMetaAnalyticsUploader;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.hyperthrift.HyperThriftBase;
import com.facebook.logginginfra.falco.GetQPLConfigDirective;
import com.facebook.logginginfra.falco.PrincipalSubject;
import com.facebook.logginginfra.falco.SetQPLConfigDirective;
import com.facebook.tigon.iface.TigonServiceHolder;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public class FFSamplingBridgeJava {
    public static Context sContext = null;
    public static long sCurrentlyScheduledDelay = Long.MAX_VALUE;
    public static DKG sHyperThrift;
    public static volatile boolean sIsInitialized;
    public static F18<DHQ> sQPLConfigHandlerProvider;
    public static F18<TigonServiceHolder> sTigonServiceHolderProvider;
    public static InterfaceC4017Cjy sUploadCallback;
    public static FFMetaAnalyticsUploader sUploader;
    public static final Object sScheduleLock = C3cG.A0T();
    public static final AtomicReference<Runnable> sAlarmFinishCallback = BV4.A16(null);
    public static final AtomicReference<Runnable> sSessionCompleteCallback = BV4.A16(null);

    public static native void initNative();

    public static native void onUploadComplete(boolean z, InputStream inputStream, boolean z2);

    public static void onUploadSessionStarted() {
    }

    public static byte[] getQPLConfigDirectives(ByteBuffer byteBuffer) throws Exception {
        try {
            F18<DHQ> f18 = sQPLConfigHandlerProvider;
            if (f18 == null) {
                CFK.A06("FFSamplingBridgeJava", "sQPLConfigHandlerProvider is null, returning empty result");
                return new byte[0];
            }
            DHQ dhqAMN = f18.AMN();
            if (dhqAMN == null) {
                CFK.A06("FFSamplingBridgeJava", "sQPLConfigHandlerProvider.get() returned null, returning empty result");
                return new byte[0];
            }
            if (sHyperThrift == null) {
                CFK.A06("FFSamplingBridgeJava", "sHyperThrift is null, returning empty result");
                return new byte[0];
            }
            byte[] bArrA00 = CLo.A00(byteBuffer);
            C5091DVm c5091DVm = C5090DVl.A02;
            ByteArrayInputStream byteArrayInputStreamA0E = BV4.A0E(bArrA00);
            C5090DVl c5090DVl = new C5090DVl();
            c5090DVl.A01 = null;
            c5090DVl.A00 = byteArrayInputStreamA0E;
            DVZ dvz = new DVZ(c5090DVl);
            DKG dkg = sHyperThrift;
            GetQPLConfigDirective qPLConfigDirective = dhqAMN.getQPLConfigDirective((PrincipalSubject) DVY.A00(new DVY(dkg.A00, dkg.A01, dvz), "com.facebook.logginginfra.falco.PrincipalSubject"));
            ByteArrayOutputStream byteArrayOutputStreamA0F = BV4.A0F();
            C5090DVl c5090DVl2 = new C5090DVl();
            c5090DVl2.A00 = null;
            c5090DVl2.A01 = byteArrayOutputStreamA0F;
            DVW.A00(qPLConfigDirective, new DVW(sHyperThrift.A00, new DVZ(c5090DVl2)), "com.facebook.logginginfra.falco.GetQPLConfigDirective");
            return byteArrayOutputStreamA0F.toByteArray();
        } catch (IllegalStateException e) {
            CFK.A0B("FFSamplingBridgeJava", "Returning empty result from getQPLConfigDirectives due to illegal state", e);
            return new byte[0];
        } catch (Exception e2) {
            CFK.A0B("FFSamplingBridgeJava", "Error in getQPLConfigDirectives", e2);
            throw e2;
        }
    }

    public static TigonServiceHolder initializeTigonServiceForOneFabric() {
        return sTigonServiceHolderProvider.AMN();
    }

    public static void onUploadSessionCompleted(boolean z) {
        Runnable andSet = sAlarmFinishCallback.getAndSet(null);
        if (andSet != null) {
            andSet.run();
        }
        resetScheduleDelay();
        Runnable andSet2 = sSessionCompleteCallback.getAndSet(null);
        if (andSet2 != null) {
            andSet2.run();
        }
    }

    public static void resetScheduleDelay() {
        synchronized (sScheduleLock) {
            sCurrentlyScheduledDelay = LinkEncryptedPairingKt.LINK_COUNTER_MAX;
        }
    }

    public static void scheduleUpload(long j) {
        synchronized (sScheduleLock) {
            if (j < sCurrentlyScheduledDelay) {
                sCurrentlyScheduledDelay = j;
                throw BV4.A0a("this$0");
            }
        }
    }

    static {
        ETi.loadLibrary("ffqplbridge");
    }

    public static void doUpload(ByteBuffer byteBuffer, boolean z, boolean z2) {
        sUploader.doUpload(BV5.A1X(byteBuffer), sUploadCallback, z, z2);
    }

    public static void setEventConfigs(String str, ByteBuffer[] byteBufferArr) {
        Number number;
        HashMap mapA0u = BV4.A0u();
        for (ByteBuffer byteBuffer : byteBufferArr) {
            byte[] bArrA00 = CLo.A00(byteBuffer);
            C5091DVm c5091DVm = C5090DVl.A02;
            ByteArrayInputStream byteArrayInputStreamA0E = BV4.A0E(bArrA00);
            C5090DVl c5090DVl = new C5090DVl();
            c5090DVl.A01 = null;
            c5090DVl.A00 = byteArrayInputStreamA0E;
            DVZ dvz = new DVZ(c5090DVl);
            DKG dkg = sHyperThrift;
            HyperThriftBase hyperThriftBaseA00 = DVY.A00(new DVY(dkg.A00, dkg.A01, dvz), "com.facebook.logginginfra.falco.PigeonEventSamplingConfig");
            HyperThriftBase hyperThriftBase = (HyperThriftBase) hyperThriftBaseA00.A00(0);
            String strA00 = hyperThriftBase != null ? hyperThriftBase.A00(0) : "";
            HyperThriftBase hyperThriftBase2 = (HyperThriftBase) hyperThriftBaseA00.A00(1);
            C8j4.A1O(strA00, mapA0u, (hyperThriftBase2 == null || (number = (Number) hyperThriftBase2.A00(1)) == null) ? 1 : number.intValue());
        }
    }

    public static void setQPLConfigDirectives(ByteBuffer byteBuffer) {
        byte[] bArrA00 = CLo.A00(byteBuffer);
        C5091DVm c5091DVm = C5090DVl.A02;
        ByteArrayInputStream byteArrayInputStreamA0E = BV4.A0E(bArrA00);
        C5090DVl c5090DVl = new C5090DVl();
        c5090DVl.A01 = null;
        c5090DVl.A00 = byteArrayInputStreamA0E;
        DVZ dvz = new DVZ(c5090DVl);
        DHQ dhqAMN = sQPLConfigHandlerProvider.AMN();
        DKG dkg = sHyperThrift;
        dhqAMN.handleConfig((SetQPLConfigDirective) DVY.A00(new DVY(dkg.A00, dkg.A01, dvz), "com.facebook.logginginfra.falco.SetQPLConfigDirective"));
    }
}

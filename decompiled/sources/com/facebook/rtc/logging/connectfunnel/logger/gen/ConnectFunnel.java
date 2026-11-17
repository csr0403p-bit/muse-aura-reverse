package com.facebook.rtc.logging.connectfunnel.logger.gen;

import X.AbstractC7607F5u;
import X.AbstractC7608F5v;
import X.ETi;
import X.GWM;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.msys.mci.Execution;
import java.util.Date;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class ConnectFunnel {

    public final class CProxy extends ConnectFunnel {
        public static native boolean annotate(String str, int i, McfReference mcfReference);

        public static native boolean annotateMultiple(String str, Map<Integer, McfReference> map);

        public static native boolean annotateMultipleTyped(String str, Map<Integer, String> map, Map<Integer, Boolean> map2, Map<Integer, Long> map3);

        public static native void associateCallIds(String str, String str2, boolean z);

        public static native boolean cancel(String str);

        public static native ConnectFunnel createFromMcfType(McfReference mcfReference);

        public static native boolean fail(String str, String str2, String str3);

        public static native boolean markPoint(String str, int i, Long l);

        public static native long nativeGetMcfTypeId();

        public static native void removeCallIdAssociation(String str, String str2);

        public static native boolean start(McfReference mcfReference, String str, int i, Long l, Map<Integer, McfReference> map);

        public static native boolean startWithProxy(ConnectFunnelProxy connectFunnelProxy, String str, int i, Long l, Map<Integer, McfReference> map);

        public static native boolean succeed(String str, McfReference mcfReference);

        public static native void uploadLogsAtColdStartIfNecessary(String str, Date date, String str2, McfReference mcfReference, McfReference mcfReference2);

        static {
            if (GWM.A00) {
                return;
            }
            try {
                AbstractC7607F5u.A1F();
                Execution.initialize();
                ETi.loadLibrary("jniperflogger");
                ETi.loadLibrary("rtcloggerjni");
                GWM.A00 = true;
            } catch (ClassNotFoundException e) {
                throw AbstractC7608F5v.A0m(e);
            }
        }
    }
}

package com.facebook.rsys.devicestats.gen;

import X.AbstractC7607F5u;
import X.AbstractC7608F5v;
import X.C8925Fth;
import X.ETi;
import X.G50;
import X.GZM;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.msys.mci.Execution;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes6.dex */
public abstract class DeviceStatsApi {
    public static G50<DeviceStatsApi> CONVERTER = C8925Fth.A00(1);

    public final class CProxy extends DeviceStatsApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native DeviceStatsApi createDeviceStatsApi();

        public static native DeviceStatsApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.devicestats.gen.DeviceStatsApi
        public native BatteryStatsReader getBatteryStatsReader();

        public native int hashCode();

        @Override // com.facebook.rsys.devicestats.gen.DeviceStatsApi
        public native void setBatteryStatsReader(BatteryStatsReader batteryStatsReader);

        static {
            if (GZM.A00) {
                return;
            }
            try {
                AbstractC7607F5u.A1F();
                Execution.initialize();
                ETi.loadLibrary("jniperflogger");
                ETi.loadLibrary("rsysdevicestatsjni");
                GZM.A00 = true;
            } catch (ClassNotFoundException e) {
                throw AbstractC7608F5v.A0m(e);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof DeviceStatsApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract BatteryStatsReader getBatteryStatsReader();

    public abstract void setBatteryStatsReader(BatteryStatsReader batteryStatsReader);
}

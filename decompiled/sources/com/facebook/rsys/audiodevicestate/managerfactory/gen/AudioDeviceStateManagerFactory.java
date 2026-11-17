package com.facebook.rsys.audiodevicestate.managerfactory.gen;

import X.AbstractC7607F5u;
import X.AbstractC7608F5v;
import X.ETi;
import X.GWt;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.msys.mci.Execution;
import com.facebook.rsys.audiodevicestate.gen.AudioDeviceContext;
import com.facebook.rsys.audiodevicestate.manager.gen.AudioDeviceStateManager;
import com.facebook.rsys.execution.gen.TaskExecutor;

/* loaded from: classes6.dex */
public abstract class AudioDeviceStateManagerFactory {

    public final class CProxy extends AudioDeviceStateManagerFactory {
        public static native AudioDeviceStateManagerFactory createFromMcfType(McfReference mcfReference);

        public static native AudioDeviceStateManager createManager(TaskExecutor taskExecutor, AudioDeviceContext audioDeviceContext);

        public static native long nativeGetMcfTypeId();

        static {
            if (GWt.A00) {
                return;
            }
            try {
                AbstractC7607F5u.A1F();
                Execution.initialize();
                ETi.loadLibrary("jniperflogger");
                ETi.loadLibrary("rsysaudiodevicestatemanagerfactoryjniLatest");
                GWt.A00 = true;
            } catch (ClassNotFoundException e) {
                throw AbstractC7608F5v.A0m(e);
            }
        }
    }
}

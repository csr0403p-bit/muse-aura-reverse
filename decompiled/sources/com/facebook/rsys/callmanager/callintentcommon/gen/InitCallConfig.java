package com.facebook.rsys.callmanager.callintentcommon.gen;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BV8;
import X.C60O;
import X.C8926Fti;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.audiodevicestate.manager.gen.AudioDeviceRtcSession;
import com.facebook.rsys.base.gen.FeatureHolder;
import com.facebook.rsys.callintent.gen.CallIntent;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public class InitCallConfig {
    public static G50<InitCallConfig> CONVERTER = C8926Fti.A00(29);
    public static long sMcfTypeId;
    public final AudioDeviceRtcSession audioDeviceRtcSession;
    public final CallIntent callIntent;
    public final ArrayList<FeatureHolder> features;
    public final boolean setupMode;

    public class Builder {
        public AudioDeviceRtcSession audioDeviceRtcSession;
        public CallIntent callIntent;
        public ArrayList<FeatureHolder> features;
        public boolean setupMode;

        public InitCallConfig build() {
            return new InitCallConfig(this);
        }
    }

    public InitCallConfig(AudioDeviceRtcSession audioDeviceRtcSession, CallIntent callIntent, ArrayList arrayList, boolean z) {
        this.callIntent = callIntent;
        this.setupMode = z;
        this.features = arrayList;
        this.audioDeviceRtcSession = audioDeviceRtcSession;
    }

    public static native InitCallConfig createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof InitCallConfig) {
                InitCallConfig initCallConfig = (InitCallConfig) obj;
                if (this.callIntent.equals(initCallConfig.callIntent) && this.setupMode == initCallConfig.setupMode && this.features.equals(initCallConfig.features)) {
                    AudioDeviceRtcSession audioDeviceRtcSession = this.audioDeviceRtcSession;
                    AudioDeviceRtcSession audioDeviceRtcSession2 = initCallConfig.audioDeviceRtcSession;
                    if (audioDeviceRtcSession != null ? !audioDeviceRtcSession.equals(audioDeviceRtcSession2) : audioDeviceRtcSession2 != null) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.features, (BV8.A09(this.callIntent) + (this.setupMode ? 1 : 0)) * 31) + AnonymousClass006.A0D(this.audioDeviceRtcSession);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("InitCallConfig{callIntent=");
        sbA0x.append(this.callIntent);
        sbA0x.append(",setupMode=");
        sbA0x.append(this.setupMode);
        sbA0x.append(",features=");
        sbA0x.append(this.features);
        sbA0x.append(",audioDeviceRtcSession=");
        return BV8.A0v(this.audioDeviceRtcSession, sbA0x);
    }

    public InitCallConfig(Builder builder) {
        builder.callIntent.getClass();
        builder.features.getClass();
        this.callIntent = builder.callIntent;
        this.setupMode = builder.setupMode;
        this.features = builder.features;
        this.audioDeviceRtcSession = builder.audioDeviceRtcSession;
    }
}

package com.facebook.rsys.devxcallagent.gen;

import X.AbstractC7608F5v;
import X.AnonymousClass006;
import X.BV8;
import X.C3cH;
import X.C60O;
import X.C8925Fth;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.base.gen.FeatureHolder;
import com.facebook.rsys.camera.gen.CameraProxy;
import com.facebook.rsys.screenshare.gen.ScreenShareProxy;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public class DevXAgentCallConfig {
    public static G50<DevXAgentCallConfig> CONVERTER = C8925Fth.A00(21);
    public static long sMcfTypeId;
    public final CameraProxy cameraProxy;
    public final ArrayList<FeatureHolder> features;
    public final ScreenShareProxy screenShareProxy;

    public static native DevXAgentCallConfig createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DevXAgentCallConfig) {
                DevXAgentCallConfig devXAgentCallConfig = (DevXAgentCallConfig) obj;
                CameraProxy cameraProxy = this.cameraProxy;
                CameraProxy cameraProxy2 = devXAgentCallConfig.cameraProxy;
                if (cameraProxy != null ? cameraProxy.equals(cameraProxy2) : cameraProxy2 == null) {
                    ArrayList<FeatureHolder> arrayList = this.features;
                    ArrayList<FeatureHolder> arrayList2 = devXAgentCallConfig.features;
                    if (arrayList == null) {
                        if (arrayList2 != null) {
                            return false;
                        }
                    } else if (arrayList.equals(arrayList2)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (AbstractC7608F5v.A02(AnonymousClass006.A0D(this.cameraProxy)) * 31) + C3cH.A02(this.features);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("DevXAgentCallConfig{cameraProxy=");
        sbA0x.append(this.cameraProxy);
        sbA0x.append(",screenShareProxy=");
        sbA0x.append((Object) null);
        sbA0x.append(",features=");
        return BV8.A0v(this.features, sbA0x);
    }

    public DevXAgentCallConfig(CameraProxy cameraProxy, ScreenShareProxy screenShareProxy, ArrayList<FeatureHolder> arrayList) {
        this.cameraProxy = cameraProxy;
        this.screenShareProxy = screenShareProxy;
        this.features = arrayList;
    }
}

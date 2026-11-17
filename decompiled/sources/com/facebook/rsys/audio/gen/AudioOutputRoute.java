package com.facebook.rsys.audio.gen;

import X.AnonymousClass001;
import X.BV8;
import X.C8923Ftf;
import X.FGI;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class AudioOutputRoute {
    public static long sMcfTypeId;
    public final String identifier;
    public final String name;
    public static final AudioOutputRoute UNKNOWN = new AudioOutputRoute("unknown_device", "unknown");
    public static final AudioOutputRoute EARPIECE = new AudioOutputRoute("earpiece_device", "earpiece");
    public static final AudioOutputRoute SPEAKER = new AudioOutputRoute("speaker_device", "speaker");
    public static final AudioOutputRoute HEADSET = new AudioOutputRoute("headset_device", "headset");
    public static final AudioOutputRoute BLUETOOTH = new AudioOutputRoute("bluetooth_device", "bluetooth");
    public static final AudioOutputRoute BLUETOOTH_A2DP = new AudioOutputRoute("bluetooth_device", "BluetoothA2DPOutput");
    public static final AudioOutputRoute BLUETOOTH_LE = new AudioOutputRoute("bluetooth_device", "BluetoothLE");
    public static final AudioOutputRoute BLUETOOTH_HFP = new AudioOutputRoute("bluetooth_device", "BluetoothHFP");
    public static G50<AudioOutputRoute> CONVERTER = C8923Ftf.A00(40);

    public static native AudioOutputRoute createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AudioOutputRoute) {
                AudioOutputRoute audioOutputRoute = (AudioOutputRoute) obj;
                if (!this.identifier.equals(audioOutputRoute.identifier) || !this.name.equals(audioOutputRoute.name)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.name, BV8.A0B(this.identifier));
    }

    public String toString() {
        return FGI.A0h("AudioOutputRoute{identifier=", this.identifier, ",name=", this.name, "}");
    }

    public AudioOutputRoute(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.identifier = str;
        this.name = str2;
    }
}

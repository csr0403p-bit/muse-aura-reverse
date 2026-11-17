package com.facebook.rsys.audio.gen;

import X.AnonymousClass001;
import X.BV8;
import X.C8923Ftf;
import X.FGI;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class AudioInputRoute {
    public static long sMcfTypeId;
    public final String identifier;
    public final String name;
    public static final AudioInputRoute DEFAULT = new AudioInputRoute("default_audio_input_route", "Default audio input route");
    public static G50<AudioInputRoute> CONVERTER = C8923Ftf.A00(37);

    public static native AudioInputRoute createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AudioInputRoute) {
                AudioInputRoute audioInputRoute = (AudioInputRoute) obj;
                if (!this.identifier.equals(audioInputRoute.identifier) || !this.name.equals(audioInputRoute.name)) {
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
        return FGI.A0h("AudioInputRoute{identifier=", this.identifier, ",name=", this.name, "}");
    }

    public AudioInputRoute(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.identifier = str;
        this.name = str2;
    }
}

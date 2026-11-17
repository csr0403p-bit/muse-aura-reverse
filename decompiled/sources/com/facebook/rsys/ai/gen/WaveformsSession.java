package com.facebook.rsys.ai.gen;

import X.AbstractC7608F5v;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C8923Ftf;
import X.FGI;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class WaveformsSession {
    public static G50<WaveformsSession> CONVERTER = C8923Ftf.A00(15);
    public static long sMcfTypeId;
    public final String cosmosTier;
    public final String handshakeRequestJson;

    public class Builder {
        public String cosmosTier;
        public String handshakeRequestJson;

        public WaveformsSession build() {
            return new WaveformsSession(this);
        }
    }

    public static native WaveformsSession createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WaveformsSession) {
                WaveformsSession waveformsSession = (WaveformsSession) obj;
                String str = this.handshakeRequestJson;
                String str2 = waveformsSession.handshakeRequestJson;
                if (str != null ? str.equals(str2) : str2 == null) {
                    String str3 = this.cosmosTier;
                    String str4 = waveformsSession.cosmosTier;
                    if (str3 == null) {
                        if (str4 != null) {
                            return false;
                        }
                    } else if (str3.equals(str4)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AbstractC7608F5v.A02(AnonymousClass006.A0G(this.handshakeRequestJson)) + AnonymousClass005.A0H(this.cosmosTier);
    }

    public String toString() {
        return FGI.A0h("WaveformsSession{handshakeRequestJson=", this.handshakeRequestJson, ",cosmosTier=", this.cosmosTier, "}");
    }

    public WaveformsSession(Builder builder) {
        this.handshakeRequestJson = builder.handshakeRequestJson;
        this.cosmosTier = builder.cosmosTier;
    }
}

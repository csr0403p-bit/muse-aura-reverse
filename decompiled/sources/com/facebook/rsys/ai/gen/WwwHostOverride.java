package com.facebook.rsys.ai.gen;

import X.AbstractC7610F5x;
import X.AnonymousClass001;
import X.BV8;
import X.C60O;
import X.C8923Ftf;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class WwwHostOverride {
    public static G50<WwwHostOverride> CONVERTER = C8923Ftf.A00(16);
    public static long sMcfTypeId;
    public final String hostname;
    public final String ipAddress;
    public final int port;

    public class Builder {
        public String hostname;
        public String ipAddress;
        public int port;

        public WwwHostOverride build() {
            return new WwwHostOverride(this);
        }
    }

    public static native WwwHostOverride createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WwwHostOverride) {
                WwwHostOverride wwwHostOverride = (WwwHostOverride) obj;
                if (!this.ipAddress.equals(wwwHostOverride.ipAddress) || this.port != wwwHostOverride.port || !this.hostname.equals(wwwHostOverride.hostname)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.hostname, (BV8.A0B(this.ipAddress) + this.port) * 31);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("WwwHostOverride{ipAddress=");
        sbA0x.append(this.ipAddress);
        sbA0x.append(",port=");
        sbA0x.append(this.port);
        sbA0x.append(",hostname=");
        return AbstractC7610F5x.A0w(this.hostname, sbA0x);
    }

    public WwwHostOverride(Builder builder) {
        builder.ipAddress.getClass();
        builder.hostname.getClass();
        this.ipAddress = builder.ipAddress;
        this.port = builder.port;
        this.hostname = builder.hostname;
    }
}

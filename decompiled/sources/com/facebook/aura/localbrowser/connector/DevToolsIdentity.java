package com.facebook.aura.localbrowser.connector;

import X.BFI;
import X.C06H;
import X.C3cJ;
import X.FGI;
import X.G0U;
import java.security.SecureRandom;

/* loaded from: classes2.dex */
public final class DevToolsIdentity {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String html;
    public final String nonce;
    public final String url;

    public final class Companion {
        public final DevToolsIdentity create() {
            byte[] bArr = new byte[16];
            new SecureRandom().nextBytes(bArr);
            return new DevToolsIdentity(BFI.A0C("", new G0U() { // from class: com.facebook.aura.localbrowser.connector.DevToolsIdentity$Companion$$ExternalSyntheticLambda0
                @Override // X.G0U
                public final Object invoke(Object obj) {
                    return C3cJ.A0K(Integer.valueOf(((Number) obj).byteValue() & 255));
                }
            }, bArr));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final String getHtml() {
        return this.html;
    }

    public final String getNonce() {
        return this.nonce;
    }

    public final String getUrl() {
        return this.url;
    }

    public DevToolsIdentity(String str) {
        this.nonce = str;
        this.url = FGI.A0U("https://", str, ".hatch-identity.invalid/");
        this.html = FGI.A0U("<!doctype html><html><head><title>", str, "</title></head><body></body></html>");
    }

    public /* synthetic */ DevToolsIdentity(String str, C06H c06h) {
        this(str);
    }
}

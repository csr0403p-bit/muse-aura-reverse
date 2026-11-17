package com.facebook.aura.devices.pairing;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class LinkPairingClientHello extends C06G {
    public static final int $stable = 8;
    public final String action;
    public final List<String> cipher_suites;
    public final String mobile_nonce;
    public final String mobile_pub;
    public final String pairing_auth;
    public final String pairing_policy;
    public final int version;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, null, AbstractC5321DgF.A02(C79.A01, LinkPairingClientHello$Companion$$childSerializers$1.INSTANCE), null, null};

    public final class Companion {
        public final C9hr<LinkPairingClientHello> serializer() {
            return LinkPairingClientHello$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public LinkPairingClientHello(String str, int i, String str2, String str3, List<String> list, String str4, String str5) {
        AnonymousClass005.A11(str, str2, str3, 0);
        this.action = str;
        this.version = i;
        this.mobile_pub = str2;
        this.mobile_nonce = str3;
        this.cipher_suites = list;
        this.pairing_auth = str4;
        this.pairing_policy = str5;
    }

    public final LinkPairingClientHello copy(String str, int i, String str2, String str3, List<String> list, String str4, String str5) {
        AnonymousClass005.A11(str, str2, str3, 0);
        return new LinkPairingClientHello(str, i, str2, str3, list, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LinkPairingClientHello) {
                LinkPairingClientHello linkPairingClientHello = (LinkPairingClientHello) obj;
                if (!C7384Etj.areEqual(this.action, linkPairingClientHello.action) || this.version != linkPairingClientHello.version || !C7384Etj.areEqual(this.mobile_pub, linkPairingClientHello.mobile_pub) || !C7384Etj.areEqual(this.mobile_nonce, linkPairingClientHello.mobile_nonce) || !C7384Etj.areEqual(this.cipher_suites, linkPairingClientHello.cipher_suites) || !C7384Etj.areEqual(this.pairing_auth, linkPairingClientHello.pairing_auth) || !C7384Etj.areEqual(this.pairing_policy, linkPairingClientHello.pairing_policy)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LinkPairingClientHello copy$default(LinkPairingClientHello linkPairingClientHello, String str, int i, String str2, String str3, List list, String str4, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = linkPairingClientHello.action;
        }
        if ((i2 & 2) != 0) {
            i = linkPairingClientHello.version;
        }
        if ((i2 & 4) != 0) {
            str2 = linkPairingClientHello.mobile_pub;
        }
        if ((i2 & 8) != 0) {
            str3 = linkPairingClientHello.mobile_nonce;
        }
        if ((i2 & 16) != 0) {
            list = linkPairingClientHello.cipher_suites;
        }
        if ((i2 & 32) != 0) {
            str4 = linkPairingClientHello.pairing_auth;
        }
        if ((i2 & 64) != 0) {
            str5 = linkPairingClientHello.pairing_policy;
        }
        return linkPairingClientHello.copy(str, i, str2, str3, list, str4, str5);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_devices_pairing_pairing(LinkPairingClientHello linkPairingClientHello, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !LinkPairingProtocolStrings.ACTION_CLIENT_HELLO.equals(linkPairingClientHello.action)) {
            c9j5.AAV(linkPairingClientHello.action, c9iZ, 0);
        }
        c9j5.AAK(c9iZ, 1, linkPairingClientHello.version);
        c9j5.AAV(linkPairingClientHello.mobile_pub, c9iZ, 2);
        c9j5.AAV(linkPairingClientHello.mobile_nonce, c9iZ, 3);
        c9j5.AAP(linkPairingClientHello.cipher_suites, C3cH.A15(f0cArr, 4), c9iZ, 4);
        if (zAfR || linkPairingClientHello.pairing_auth != null) {
            c9j5.AAP(linkPairingClientHello.pairing_auth, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || linkPairingClientHello.pairing_policy != null) {
            c9j5.AAP(linkPairingClientHello.pairing_policy, C07779iq.A01, c9iZ, 6);
        }
    }

    public final String component1() {
        return this.action;
    }

    public final int component2() {
        return this.version;
    }

    public final String component3() {
        return this.mobile_pub;
    }

    public final String component4() {
        return this.mobile_nonce;
    }

    public final List<String> component5() {
        return this.cipher_suites;
    }

    public final String component6() {
        return this.pairing_auth;
    }

    public final String component7() {
        return this.pairing_policy;
    }

    public final String getAction() {
        return this.action;
    }

    public final List<String> getCipher_suites() {
        return this.cipher_suites;
    }

    public final String getMobile_nonce() {
        return this.mobile_nonce;
    }

    public final String getMobile_pub() {
        return this.mobile_pub;
    }

    public final String getPairing_auth() {
        return this.pairing_auth;
    }

    public final String getPairing_policy() {
        return this.pairing_policy;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return ((((AnonymousClass005.A0I(this.mobile_nonce, AnonymousClass005.A0I(this.mobile_pub, (AnonymousClass001.A0G(this.action) + this.version) * 31)) + AnonymousClass006.A0D(this.cipher_suites)) * 31) + AnonymousClass006.A0G(this.pairing_auth)) * 31) + AnonymousClass005.A0H(this.pairing_policy);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ LinkPairingClientHello(String str, int i, String str2, String str3, List list, String str4, String str5, int i2, C06H c06h) {
        this((i2 & 1) != 0 ? LinkPairingProtocolStrings.ACTION_CLIENT_HELLO : str, i, str2, str3, list, (i2 & 32) != 0 ? null : str4, (i2 & 64) != 0 ? null : str5);
    }

    public /* synthetic */ LinkPairingClientHello(int i, String str, int i2, String str2, String str3, List list, String str4, String str5, C2hx c2hx) {
        if (30 != (i & 30)) {
            C9iI.A00(LinkPairingClientHello$$serializer.descriptor, i, 30);
            throw F60.createAndThrow();
        }
        this.action = (i & 1) == 0 ? LinkPairingProtocolStrings.ACTION_CLIENT_HELLO : str;
        this.version = i2;
        this.mobile_pub = str2;
        this.mobile_nonce = str3;
        this.cipher_suites = list;
        if ((i & 32) == 0) {
            this.pairing_auth = null;
        } else {
            this.pairing_auth = str4;
        }
        if ((i & 64) == 0) {
            this.pairing_policy = null;
        } else {
            this.pairing_policy = str5;
        }
    }
}

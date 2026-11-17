package com.facebook.aura.devices.pairing;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class LinkEncryptedRecordJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String action;
    public final String ciphertext;
    public final String counter;
    public final String session_id;
    public final String tag;

    public final class Companion {
        public final C9hr<LinkEncryptedRecordJson> serializer() {
            return LinkEncryptedRecordJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_devices_pairing_pairing(LinkEncryptedRecordJson linkEncryptedRecordJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || !LinkPairingProtocolStrings.ACTION_ENCRYPTED_RECORD.equals(linkEncryptedRecordJson.action)) {
            c9j5.AAV(linkEncryptedRecordJson.action, c9iZ, 0);
        }
        c9j5.AAV(linkEncryptedRecordJson.session_id, c9iZ, 1);
        c9j5.AAV(linkEncryptedRecordJson.counter, c9iZ, 2);
        c9j5.AAV(linkEncryptedRecordJson.ciphertext, c9iZ, 3);
        c9j5.AAV(linkEncryptedRecordJson.tag, c9iZ, 4);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LinkEncryptedRecordJson) {
                LinkEncryptedRecordJson linkEncryptedRecordJson = (LinkEncryptedRecordJson) obj;
                if (!C7384Etj.areEqual(this.action, linkEncryptedRecordJson.action) || !C7384Etj.areEqual(this.session_id, linkEncryptedRecordJson.session_id) || !C7384Etj.areEqual(this.counter, linkEncryptedRecordJson.counter) || !C7384Etj.areEqual(this.ciphertext, linkEncryptedRecordJson.ciphertext) || !C7384Etj.areEqual(this.tag, linkEncryptedRecordJson.tag)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ LinkEncryptedRecordJson(int i, String str, String str2, String str3, String str4, String str5, C2hx c2hx) {
        if (30 != (i & 30)) {
            C9iI.A00(LinkEncryptedRecordJson$$serializer.descriptor, i, 30);
            throw F60.createAndThrow();
        }
        this.action = (i & 1) == 0 ? LinkPairingProtocolStrings.ACTION_ENCRYPTED_RECORD : str;
        this.session_id = str2;
        this.counter = str3;
        this.ciphertext = str4;
        this.tag = str5;
    }

    public static /* synthetic */ LinkEncryptedRecordJson copy$default(LinkEncryptedRecordJson linkEncryptedRecordJson, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = linkEncryptedRecordJson.action;
        }
        if ((i & 2) != 0) {
            str2 = linkEncryptedRecordJson.session_id;
        }
        if ((i & 4) != 0) {
            str3 = linkEncryptedRecordJson.counter;
        }
        if ((i & 8) != 0) {
            str4 = linkEncryptedRecordJson.ciphertext;
        }
        if ((i & 16) != 0) {
            str5 = linkEncryptedRecordJson.tag;
        }
        return linkEncryptedRecordJson.copy(str, str2, str3, str4, str5);
    }

    public final String component1() {
        return this.action;
    }

    public final String component2() {
        return this.session_id;
    }

    public final String component3() {
        return this.counter;
    }

    public final String component4() {
        return this.ciphertext;
    }

    public final String component5() {
        return this.tag;
    }

    public final String getAction() {
        return this.action;
    }

    public final String getCiphertext() {
        return this.ciphertext;
    }

    public final String getCounter() {
        return this.counter;
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public final String getTag() {
        return this.tag;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.tag, AnonymousClass005.A0I(this.ciphertext, AnonymousClass005.A0I(this.counter, AnonymousClass005.A0I(this.session_id, AnonymousClass001.A0G(this.action)))));
    }

    public final LinkEncryptedRecordJson copy(String str, String str2, String str3, String str4, String str5) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        return new LinkEncryptedRecordJson(str, str2, str3, str4, str5);
    }

    public String toString() {
        return super.toString();
    }

    public LinkEncryptedRecordJson(String str, String str2, String str3, String str4, String str5) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        this.action = str;
        this.session_id = str2;
        this.counter = str3;
        this.ciphertext = str4;
        this.tag = str5;
    }

    public /* synthetic */ LinkEncryptedRecordJson(String str, String str2, String str3, String str4, String str5, int i, C06H c06h) {
        this((i & 1) != 0 ? LinkPairingProtocolStrings.ACTION_ENCRYPTED_RECORD : str, str2, str3, str4, str5);
    }
}

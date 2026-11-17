package com.facebook.aura.pairs;

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
/* loaded from: classes3.dex */
public final class PeerInviteSendRecipientJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String app_target;
    public final String recipient_id;
    public final String recipient_type;
    public final String sender_account_id;

    public final class Companion {
        public final C9hr<PeerInviteSendRecipientJson> serializer() {
            return PeerInviteSendRecipientJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(PeerInviteSendRecipientJson peerInviteSendRecipientJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(peerInviteSendRecipientJson.app_target, c9iZ, 0);
        c9j5.AAV(peerInviteSendRecipientJson.recipient_type, c9iZ, 1);
        c9j5.AAV(peerInviteSendRecipientJson.recipient_id, c9iZ, 2);
        c9j5.AAV(peerInviteSendRecipientJson.sender_account_id, c9iZ, 3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PeerInviteSendRecipientJson) {
                PeerInviteSendRecipientJson peerInviteSendRecipientJson = (PeerInviteSendRecipientJson) obj;
                if (!C7384Etj.areEqual(this.app_target, peerInviteSendRecipientJson.app_target) || !C7384Etj.areEqual(this.recipient_type, peerInviteSendRecipientJson.recipient_type) || !C7384Etj.areEqual(this.recipient_id, peerInviteSendRecipientJson.recipient_id) || !C7384Etj.areEqual(this.sender_account_id, peerInviteSendRecipientJson.sender_account_id)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ PeerInviteSendRecipientJson(int i, String str, String str2, String str3, String str4, C2hx c2hx) {
        if (15 != (i & 15)) {
            C9iI.A00(PeerInviteSendRecipientJson$$serializer.descriptor, i, 15);
            throw F60.createAndThrow();
        }
        this.app_target = str;
        this.recipient_type = str2;
        this.recipient_id = str3;
        this.sender_account_id = str4;
    }

    public static /* synthetic */ PeerInviteSendRecipientJson copy$default(PeerInviteSendRecipientJson peerInviteSendRecipientJson, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = peerInviteSendRecipientJson.app_target;
        }
        if ((i & 2) != 0) {
            str2 = peerInviteSendRecipientJson.recipient_type;
        }
        if ((i & 4) != 0) {
            str3 = peerInviteSendRecipientJson.recipient_id;
        }
        if ((i & 8) != 0) {
            str4 = peerInviteSendRecipientJson.sender_account_id;
        }
        return peerInviteSendRecipientJson.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.app_target;
    }

    public final String component2() {
        return this.recipient_type;
    }

    public final String component3() {
        return this.recipient_id;
    }

    public final String component4() {
        return this.sender_account_id;
    }

    public final String getApp_target() {
        return this.app_target;
    }

    public final String getRecipient_id() {
        return this.recipient_id;
    }

    public final String getRecipient_type() {
        return this.recipient_type;
    }

    public final String getSender_account_id() {
        return this.sender_account_id;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.sender_account_id, AnonymousClass005.A0I(this.recipient_id, AnonymousClass005.A0I(this.recipient_type, AnonymousClass001.A0G(this.app_target))));
    }

    public final PeerInviteSendRecipientJson copy(String str, String str2, String str3, String str4) {
        AnonymousClass005.A14(str, str2, str3, str4);
        return new PeerInviteSendRecipientJson(str, str2, str3, str4);
    }

    public String toString() {
        return super.toString();
    }

    public PeerInviteSendRecipientJson(String str, String str2, String str3, String str4) {
        AnonymousClass005.A14(str, str2, str3, str4);
        this.app_target = str;
        this.recipient_type = str2;
        this.recipient_id = str3;
        this.sender_account_id = str4;
    }
}

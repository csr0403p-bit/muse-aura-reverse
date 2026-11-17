package com.facebook.aura.pairs;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C60R;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class PeerInviteSendRequestJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final long expires_at_ms;
    public final String invite_b64;
    public final String offered_preset;
    public final PeerInviteSendRecipientJson recipient;

    public final class Companion {
        public final C9hr<PeerInviteSendRequestJson> serializer() {
            return PeerInviteSendRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static /* synthetic */ PeerInviteSendRequestJson copy$default(PeerInviteSendRequestJson peerInviteSendRequestJson, PeerInviteSendRecipientJson peerInviteSendRecipientJson, String str, long j, String str2, int i, Object obj) {
        PeerInviteSendRecipientJson peerInviteSendRecipientJson2 = peerInviteSendRecipientJson;
        String str3 = str;
        long j2 = j;
        String str4 = str2;
        if ((i & 1) != 0) {
            peerInviteSendRecipientJson2 = peerInviteSendRequestJson.recipient;
        }
        if ((i & 2) != 0) {
            str3 = peerInviteSendRequestJson.invite_b64;
        }
        if ((i & 4) != 0) {
            j2 = peerInviteSendRequestJson.expires_at_ms;
        }
        if ((i & 8) != 0) {
            str4 = peerInviteSendRequestJson.offered_preset;
        }
        AnonymousClass005.A0y(peerInviteSendRecipientJson2, str3, str4);
        return new PeerInviteSendRequestJson(peerInviteSendRecipientJson2, str3, j2, str4);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PeerInviteSendRequestJson) {
                PeerInviteSendRequestJson peerInviteSendRequestJson = (PeerInviteSendRequestJson) obj;
                if (!C7384Etj.areEqual(this.recipient, peerInviteSendRequestJson.recipient) || !C7384Etj.areEqual(this.invite_b64, peerInviteSendRequestJson.invite_b64) || this.expires_at_ms != peerInviteSendRequestJson.expires_at_ms || !C7384Etj.areEqual(this.offered_preset, peerInviteSendRequestJson.offered_preset)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ PeerInviteSendRequestJson(int i, PeerInviteSendRecipientJson peerInviteSendRecipientJson, String str, long j, String str2, C2hx c2hx) {
        if (15 != (i & 15)) {
            C9iI.A00(PeerInviteSendRequestJson$$serializer.descriptor, i, 15);
            throw F60.createAndThrow();
        }
        this.recipient = peerInviteSendRecipientJson;
        this.invite_b64 = str;
        this.expires_at_ms = j;
        this.offered_preset = str2;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(PeerInviteSendRequestJson peerInviteSendRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAQ(peerInviteSendRequestJson.recipient, PeerInviteSendRecipientJson$$serializer.INSTANCE, c9iZ, 0);
        c9j5.AAV(peerInviteSendRequestJson.invite_b64, c9iZ, 1);
        c9j5.AAN(c9iZ, 2, peerInviteSendRequestJson.expires_at_ms);
        c9j5.AAV(peerInviteSendRequestJson.offered_preset, c9iZ, 3);
    }

    public final PeerInviteSendRecipientJson component1() {
        return this.recipient;
    }

    public final String component2() {
        return this.invite_b64;
    }

    public final long component3() {
        return this.expires_at_ms;
    }

    public final String component4() {
        return this.offered_preset;
    }

    public final long getExpires_at_ms() {
        return this.expires_at_ms;
    }

    public final String getInvite_b64() {
        return this.invite_b64;
    }

    public final String getOffered_preset() {
        return this.offered_preset;
    }

    public final PeerInviteSendRecipientJson getRecipient() {
        return this.recipient;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.offered_preset, C60R.A00(this.expires_at_ms, AnonymousClass005.A0I(this.invite_b64, AnonymousClass005.A0E(this.recipient))));
    }

    public final PeerInviteSendRequestJson copy(PeerInviteSendRecipientJson peerInviteSendRecipientJson, String str, long j, String str2) {
        AnonymousClass005.A0y(peerInviteSendRecipientJson, str, str2);
        return new PeerInviteSendRequestJson(peerInviteSendRecipientJson, str, j, str2);
    }

    public String toString() {
        return super.toString();
    }

    public PeerInviteSendRequestJson(PeerInviteSendRecipientJson peerInviteSendRecipientJson, String str, long j, String str2) {
        AnonymousClass005.A0y(peerInviteSendRecipientJson, str, str2);
        this.recipient = peerInviteSendRecipientJson;
        this.invite_b64 = str;
        this.expires_at_ms = j;
        this.offered_preset = str2;
    }
}

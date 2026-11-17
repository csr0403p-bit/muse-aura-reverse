package com.facebook.aura.pairs;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
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
public final class PeerInviteCreateRequestJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String create_request_id;
    public final String label;
    public final String offered_preset;
    public final String recipient_name;
    public final String space_permission;
    public final String space_slug;

    public final class Companion {
        public final C9hr<PeerInviteCreateRequestJson> serializer() {
            return PeerInviteCreateRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static /* synthetic */ PeerInviteCreateRequestJson copy$default(PeerInviteCreateRequestJson peerInviteCreateRequestJson, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        String str7 = str;
        String str8 = str2;
        String str9 = str3;
        String str10 = str4;
        String str11 = str5;
        String str12 = str6;
        if ((i & 1) != 0) {
            str7 = peerInviteCreateRequestJson.create_request_id;
        }
        if ((i & 2) != 0) {
            str8 = peerInviteCreateRequestJson.offered_preset;
        }
        if ((i & 4) != 0) {
            str9 = peerInviteCreateRequestJson.label;
        }
        if ((i & 8) != 0) {
            str10 = peerInviteCreateRequestJson.recipient_name;
        }
        if ((i & 16) != 0) {
            str11 = peerInviteCreateRequestJson.space_slug;
        }
        if ((i & 32) != 0) {
            str12 = peerInviteCreateRequestJson.space_permission;
        }
        AnonymousClass003.A0u(str7, str8);
        return new PeerInviteCreateRequestJson(str7, str8, str9, str10, str11, str12);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(PeerInviteCreateRequestJson peerInviteCreateRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(peerInviteCreateRequestJson.create_request_id, c9iZ, 0);
        c9j5.AAV(peerInviteCreateRequestJson.offered_preset, c9iZ, 1);
        boolean zAfR = c9j5.AfR();
        if (zAfR || peerInviteCreateRequestJson.label != null) {
            c9j5.AAP(peerInviteCreateRequestJson.label, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || peerInviteCreateRequestJson.recipient_name != null) {
            c9j5.AAP(peerInviteCreateRequestJson.recipient_name, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || peerInviteCreateRequestJson.space_slug != null) {
            c9j5.AAP(peerInviteCreateRequestJson.space_slug, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || peerInviteCreateRequestJson.space_permission != null) {
            c9j5.AAP(peerInviteCreateRequestJson.space_permission, C07779iq.A01, c9iZ, 5);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PeerInviteCreateRequestJson) {
                PeerInviteCreateRequestJson peerInviteCreateRequestJson = (PeerInviteCreateRequestJson) obj;
                if (!C7384Etj.areEqual(this.create_request_id, peerInviteCreateRequestJson.create_request_id) || !C7384Etj.areEqual(this.offered_preset, peerInviteCreateRequestJson.offered_preset) || !C7384Etj.areEqual(this.label, peerInviteCreateRequestJson.label) || !C7384Etj.areEqual(this.recipient_name, peerInviteCreateRequestJson.recipient_name) || !C7384Etj.areEqual(this.space_slug, peerInviteCreateRequestJson.space_slug) || !C7384Etj.areEqual(this.space_permission, peerInviteCreateRequestJson.space_permission)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.create_request_id;
    }

    public final String component2() {
        return this.offered_preset;
    }

    public final String component3() {
        return this.label;
    }

    public final String component4() {
        return this.recipient_name;
    }

    public final String component5() {
        return this.space_slug;
    }

    public final String component6() {
        return this.space_permission;
    }

    public final String getCreate_request_id() {
        return this.create_request_id;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getOffered_preset() {
        return this.offered_preset;
    }

    public final String getRecipient_name() {
        return this.recipient_name;
    }

    public final String getSpace_permission() {
        return this.space_permission;
    }

    public final String getSpace_slug() {
        return this.space_slug;
    }

    public int hashCode() {
        return ((((((AnonymousClass005.A0I(this.offered_preset, AnonymousClass001.A0G(this.create_request_id)) + AnonymousClass006.A0G(this.label)) * 31) + AnonymousClass006.A0G(this.recipient_name)) * 31) + AnonymousClass006.A0G(this.space_slug)) * 31) + AnonymousClass005.A0H(this.space_permission);
    }

    public PeerInviteCreateRequestJson(String str, String str2, String str3, String str4, String str5, String str6) {
        AnonymousClass003.A0u(str, str2);
        this.create_request_id = str;
        this.offered_preset = str2;
        this.label = str3;
        this.recipient_name = str4;
        this.space_slug = str5;
        this.space_permission = str6;
    }

    public final PeerInviteCreateRequestJson copy(String str, String str2, String str3, String str4, String str5, String str6) {
        AnonymousClass003.A0u(str, str2);
        return new PeerInviteCreateRequestJson(str, str2, str3, str4, str5, str6);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PeerInviteCreateRequestJson(String str, String str2, String str3, String str4, String str5, String str6, int i, C06H c06h) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
    }

    public /* synthetic */ PeerInviteCreateRequestJson(int i, String str, String str2, String str3, String str4, String str5, String str6, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(PeerInviteCreateRequestJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.create_request_id = str;
        this.offered_preset = str2;
        if ((i & 4) == 0) {
            this.label = null;
        } else {
            this.label = str3;
        }
        if ((i & 8) == 0) {
            this.recipient_name = null;
        } else {
            this.recipient_name = str4;
        }
        if ((i & 16) == 0) {
            this.space_slug = null;
        } else {
            this.space_slug = str5;
        }
        if ((i & 32) == 0) {
            this.space_permission = null;
        } else {
            this.space_permission = str6;
        }
    }
}

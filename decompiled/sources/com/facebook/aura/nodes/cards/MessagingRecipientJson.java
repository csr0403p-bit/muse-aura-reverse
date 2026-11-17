package com.facebook.aura.nodes.cards;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class MessagingRecipientJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String address;
    public final String contact_name;

    public final class Companion {
        public final C9hr<MessagingRecipientJson> serializer() {
            return MessagingRecipientJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public MessagingRecipientJson(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        this.address = str;
        this.contact_name = str2;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_nodes_cards_cards(MessagingRecipientJson messagingRecipientJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(messagingRecipientJson.address)) {
            c9j5.AAV(messagingRecipientJson.address, c9iZ, 0);
        }
        if (zAfR || messagingRecipientJson.contact_name != null) {
            c9j5.AAP(messagingRecipientJson.contact_name, C07779iq.A01, c9iZ, 1);
        }
    }

    public final MessagingRecipientJson copy(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        return new MessagingRecipientJson(str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MessagingRecipientJson) {
                MessagingRecipientJson messagingRecipientJson = (MessagingRecipientJson) obj;
                if (!C7384Etj.areEqual(this.address, messagingRecipientJson.address) || !C7384Etj.areEqual(this.contact_name, messagingRecipientJson.contact_name)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ MessagingRecipientJson copy$default(MessagingRecipientJson messagingRecipientJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = messagingRecipientJson.address;
        }
        if ((i & 2) != 0) {
            str2 = messagingRecipientJson.contact_name;
        }
        C7384Etj.A0Y(str, 0);
        return new MessagingRecipientJson(str, str2);
    }

    public final String component1() {
        return this.address;
    }

    public final String component2() {
        return this.contact_name;
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getContact_name() {
        return this.contact_name;
    }

    public int hashCode() {
        return AnonymousClass001.A0G(this.address) + AnonymousClass006.A0G(this.contact_name);
    }

    public final MessagingCardRecipient toDomain() {
        String strA0l;
        String strA0l2 = AnonymousClass002.A0l(this.address);
        String str = null;
        if (strA0l2.length() <= 0) {
            return null;
        }
        String str2 = this.contact_name;
        if (str2 != null && (strA0l = AnonymousClass002.A0l(str2)) != null && strA0l.length() > 0) {
            str = strA0l;
        }
        return new MessagingCardRecipient(strA0l2, str);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ MessagingRecipientJson(int i, String str, String str2, C2hx c2hx) {
        this.address = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.contact_name = null;
        } else {
            this.contact_name = str2;
        }
    }

    public /* synthetic */ MessagingRecipientJson(String str, String str2, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), AnonymousClass006.A0s(i, str2));
    }

    public MessagingRecipientJson() {
        this("", null);
    }
}

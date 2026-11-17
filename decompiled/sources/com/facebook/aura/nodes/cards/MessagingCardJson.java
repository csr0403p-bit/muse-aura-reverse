package com.facebook.aura.nodes.cards;

import X.AGI;
import X.AHD;
import X.AbstractC0885AGm;
import X.AbstractC5321DgF;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class MessagingCardJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String address;
    public final List<MessagingAttachmentJson> attachments;
    public final String body;
    public final String contact_name;
    public final List<MessagingRecipientJson> recipients;

    public final class Companion {
        public final C9hr<MessagingCardJson> serializer() {
            return MessagingCardJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = new F0C[]{AbstractC5321DgF.A02(num, MessagingCardJson$Companion$$childSerializers$1.INSTANCE), null, AbstractC5321DgF.A02(num, MessagingCardJson$Companion$$childSerializers$2.INSTANCE), null, null};
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MessagingCardJson) {
                MessagingCardJson messagingCardJson = (MessagingCardJson) obj;
                if (!C7384Etj.areEqual(this.recipients, messagingCardJson.recipients) || !C7384Etj.areEqual(this.body, messagingCardJson.body) || !C7384Etj.areEqual(this.attachments, messagingCardJson.attachments) || !C7384Etj.areEqual(this.address, messagingCardJson.address) || !C7384Etj.areEqual(this.contact_name, messagingCardJson.contact_name)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MessagingCardJson copy$default(MessagingCardJson messagingCardJson, List list, String str, List list2, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = messagingCardJson.recipients;
        }
        if ((i & 2) != 0) {
            str = messagingCardJson.body;
        }
        if ((i & 4) != 0) {
            list2 = messagingCardJson.attachments;
        }
        if ((i & 8) != 0) {
            str2 = messagingCardJson.address;
        }
        if ((i & 16) != 0) {
            str3 = messagingCardJson.contact_name;
        }
        return messagingCardJson.copy(list, str, list2, str2, str3);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_nodes_cards_cards(MessagingCardJson messagingCardJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cG.A1L(messagingCardJson.recipients)) {
            c9j5.AAQ(messagingCardJson.recipients, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
        if (zAfR || !"".equals(messagingCardJson.body)) {
            c9j5.AAV(messagingCardJson.body, c9iZ, 1);
        }
        if (zAfR || !C3cG.A1L(messagingCardJson.attachments)) {
            c9j5.AAQ(messagingCardJson.attachments, C3cH.A15(f0cArr, 2), c9iZ, 2);
        }
        if (zAfR || !"".equals(messagingCardJson.address)) {
            c9j5.AAV(messagingCardJson.address, c9iZ, 3);
        }
        if (zAfR || messagingCardJson.contact_name != null) {
            c9j5.AAP(messagingCardJson.contact_name, C07779iq.A01, c9iZ, 4);
        }
    }

    public final List<MessagingRecipientJson> component1() {
        return this.recipients;
    }

    public final String component2() {
        return this.body;
    }

    public final List<MessagingAttachmentJson> component3() {
        return this.attachments;
    }

    public final String component4() {
        return this.address;
    }

    public final String component5() {
        return this.contact_name;
    }

    public final String getAddress() {
        return this.address;
    }

    public final List<MessagingAttachmentJson> getAttachments() {
        return this.attachments;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getContact_name() {
        return this.contact_name;
    }

    public final List<MessagingRecipientJson> getRecipients() {
        return this.recipients;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.address, AnonymousClass005.A0F(this.attachments, AnonymousClass005.A0I(this.body, AnonymousClass005.A0E(this.recipients)))) + AnonymousClass006.A0G(this.contact_name);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.List] */
    public final MessagingCardData toDomain() {
        List<MessagingRecipientJson> list = this.recipients;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<MessagingRecipientJson> it = list.iterator();
        while (it.hasNext()) {
            MessagingCardRecipient domain = it.next().toDomain();
            if (domain != null) {
                arrayListA0h.add(domain);
            }
        }
        boolean zIsEmpty = arrayListA0h.isEmpty();
        ArrayList arrayListA0z = arrayListA0h;
        if (zIsEmpty) {
            arrayListA0z = AbstractC0885AGm.A0z(new MessagingRecipientJson(this.address, this.contact_name).toDomain());
        }
        if (arrayListA0z.isEmpty()) {
            return null;
        }
        AHD ahdA07 = AGI.A07(arrayListA0z);
        String str = this.body;
        List<MessagingAttachmentJson> list2 = this.attachments;
        ArrayList arrayListA0h2 = C3cG.A0h();
        Iterator<MessagingAttachmentJson> it2 = list2.iterator();
        while (it2.hasNext()) {
            MessagingCardAttachment domain2 = it2.next().toDomain();
            if (domain2 != null) {
                arrayListA0h2.add(domain2);
            }
        }
        return new MessagingCardData(ahdA07, str, AGI.A07(arrayListA0h2));
    }

    public MessagingCardJson(List<MessagingRecipientJson> list, String str, List<MessagingAttachmentJson> list2, String str2, String str3) {
        AnonymousClass005.A14(list, str, list2, str2);
        this.recipients = list;
        this.body = str;
        this.attachments = list2;
        this.address = str2;
        this.contact_name = str3;
    }

    public final MessagingCardJson copy(List<MessagingRecipientJson> list, String str, List<MessagingAttachmentJson> list2, String str2, String str3) {
        AnonymousClass005.A14(list, str, list2, str2);
        return new MessagingCardJson(list, str, list2, str2, str3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ MessagingCardJson(List list, String str, List list2, String str2, String str3, int i, C06H c06h) {
        this(C3cI.A10(list, i), (i & 2) != 0 ? "" : str, C3cI.A12(list2, i), (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? null : str3);
    }

    public /* synthetic */ MessagingCardJson(int i, List list, String str, List list2, String str2, String str3, C2hx c2hx) {
        this.recipients = (i & 1) == 0 ? C0881AGi.A00 : list;
        if ((i & 2) == 0) {
            this.body = "";
        } else {
            this.body = str;
        }
        if ((i & 4) == 0) {
            this.attachments = C0881AGi.A00;
        } else {
            this.attachments = list2;
        }
        if ((i & 8) == 0) {
            this.address = "";
        } else {
            this.address = str2;
        }
        if ((i & 16) == 0) {
            this.contact_name = null;
        } else {
            this.contact_name = str3;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MessagingCardJson() {
        C0881AGi c0881AGi = C0881AGi.A00;
        this(c0881AGi, "", c0881AGi, "", null);
    }
}

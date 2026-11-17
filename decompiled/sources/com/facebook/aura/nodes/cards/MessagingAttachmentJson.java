package com.facebook.aura.nodes.cards;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
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
public final class MessagingAttachmentJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String file_name;
    public final String mime_type;
    public final String path;

    public final class Companion {
        public final C9hr<MessagingAttachmentJson> serializer() {
            return MessagingAttachmentJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public MessagingAttachmentJson(String str, String str2, String str3) {
        C7384Etj.A0Y(str, 0);
        this.path = str;
        this.file_name = str2;
        this.mime_type = str3;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_nodes_cards_cards(MessagingAttachmentJson messagingAttachmentJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(messagingAttachmentJson.path)) {
            c9j5.AAV(messagingAttachmentJson.path, c9iZ, 0);
        }
        if (zAfR || messagingAttachmentJson.file_name != null) {
            c9j5.AAP(messagingAttachmentJson.file_name, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || messagingAttachmentJson.mime_type != null) {
            c9j5.AAP(messagingAttachmentJson.mime_type, C07779iq.A01, c9iZ, 2);
        }
    }

    public final MessagingAttachmentJson copy(String str, String str2, String str3) {
        C7384Etj.A0Y(str, 0);
        return new MessagingAttachmentJson(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MessagingAttachmentJson) {
                MessagingAttachmentJson messagingAttachmentJson = (MessagingAttachmentJson) obj;
                if (!C7384Etj.areEqual(this.path, messagingAttachmentJson.path) || !C7384Etj.areEqual(this.file_name, messagingAttachmentJson.file_name) || !C7384Etj.areEqual(this.mime_type, messagingAttachmentJson.mime_type)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ MessagingAttachmentJson copy$default(MessagingAttachmentJson messagingAttachmentJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = messagingAttachmentJson.path;
        }
        if ((i & 2) != 0) {
            str2 = messagingAttachmentJson.file_name;
        }
        if ((i & 4) != 0) {
            str3 = messagingAttachmentJson.mime_type;
        }
        return messagingAttachmentJson.copy(str, str2, str3);
    }

    public final String component1() {
        return this.path;
    }

    public final String component2() {
        return this.file_name;
    }

    public final String component3() {
        return this.mime_type;
    }

    public final String getFile_name() {
        return this.file_name;
    }

    public final String getMime_type() {
        return this.mime_type;
    }

    public final String getPath() {
        return this.path;
    }

    public int hashCode() {
        return ((AnonymousClass001.A0G(this.path) + AnonymousClass006.A0G(this.file_name)) * 31) + AnonymousClass005.A0H(this.mime_type);
    }

    public final MessagingCardAttachment toDomain() {
        String strA0l;
        String strA0l2;
        String strA0l3 = AnonymousClass002.A0l(this.path);
        String str = null;
        if (strA0l3.length() <= 0) {
            return null;
        }
        String str2 = this.file_name;
        if (str2 == null || (strA0l = AnonymousClass002.A0l(str2)) == null || strA0l.length() <= 0) {
            strA0l = null;
        }
        String str3 = this.mime_type;
        if (str3 != null && (strA0l2 = AnonymousClass002.A0l(str3)) != null && strA0l2.length() > 0) {
            str = strA0l2;
        }
        return new MessagingCardAttachment(strA0l3, strA0l, str);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ MessagingAttachmentJson(int i, String str, String str2, String str3, C2hx c2hx) {
        this.path = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.file_name = null;
        } else {
            this.file_name = str2;
        }
        if ((i & 4) == 0) {
            this.mime_type = null;
        } else {
            this.mime_type = str3;
        }
    }

    public /* synthetic */ MessagingAttachmentJson(String str, String str2, String str3, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public MessagingAttachmentJson() {
        this("", null, null);
    }
}

package com.facebook.aura.sharesheet;

import X.C06G;
import X.C06H;
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
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class ShareRecipientsResponseJson extends C06G {
    public static final int $stable = 8;
    public final List<ShareRecipientJson> recipients;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C06G.A0x(C79.A01, ShareRecipientsResponseJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<ShareRecipientsResponseJson> serializer() {
            return ShareRecipientsResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final ShareRecipientsResponseJson copy(List<ShareRecipientJson> list) {
        C7384Etj.A0Y(list, 0);
        return new ShareRecipientsResponseJson(list);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ShareRecipientsResponseJson) && C7384Etj.areEqual(this.recipients, ((ShareRecipientsResponseJson) obj).recipients));
    }

    public static /* synthetic */ ShareRecipientsResponseJson copy$default(ShareRecipientsResponseJson shareRecipientsResponseJson, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = shareRecipientsResponseJson.recipients;
        }
        C7384Etj.A0Y(list, 0);
        return new ShareRecipientsResponseJson(list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_sharesheet_sharesheet(ShareRecipientsResponseJson shareRecipientsResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        if (c9j5.AfR() || !C3cG.A1L(shareRecipientsResponseJson.recipients)) {
            c9j5.AAQ(shareRecipientsResponseJson.recipients, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
    }

    public final List<ShareRecipientJson> component1() {
        return this.recipients;
    }

    public final List<ShareRecipientJson> getRecipients() {
        return this.recipients;
    }

    public int hashCode() {
        return this.recipients.hashCode();
    }

    public /* synthetic */ ShareRecipientsResponseJson(int i, List list, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.recipients = C0881AGi.A00;
        } else {
            this.recipients = list;
        }
    }

    public String toString() {
        return super.toString();
    }

    public ShareRecipientsResponseJson(List<ShareRecipientJson> list) {
        C7384Etj.A0Y(list, 0);
        this.recipients = list;
    }

    public /* synthetic */ ShareRecipientsResponseJson(List list, int i, C06H c06h) {
        this(C3cI.A10(list, i));
    }

    public ShareRecipientsResponseJson() {
        this(C0881AGi.A00);
    }
}

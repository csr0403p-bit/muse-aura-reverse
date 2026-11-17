package com.facebook.aura.commands.sms;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C0KA;
import X.C2nw;
import X.C60O;
import X.C60R;
import X.C7384Etj;
import X.C7pd;
import X.C7qW;
import X.C9Y;
import com.facebook.aura.nodes.datasource.NodeSyncTimestamps;
import com.facebook.aura.wearablebroadcast.MetaAiAppBroadcastSender;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public final class CanonicalSmsMessage extends C06G {
    public static final Companion Companion = new Companion();
    public static final String DIRECTION_INBOUND = "inbound";
    public static final String DIRECTION_OUTBOUND = "outbound";
    public static final String KIND_MMS = "mms";
    public static final String KIND_RCS = "rcs";
    public static final String KIND_SMS = "sms";
    public final String address;
    public final int attachmentCount;
    public final List<String> attachmentTypes;
    public final List<SmsAttachment> attachments;
    public final String body;
    public final String contactName;
    public final String direction;
    public final boolean isRead;
    public final String kind;
    public final String messageId;
    public final List<String> participants;
    public final String threadId;
    public final long timestampMs;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CanonicalSmsMessage) {
                CanonicalSmsMessage canonicalSmsMessage = (CanonicalSmsMessage) obj;
                if (!C7384Etj.areEqual(this.messageId, canonicalSmsMessage.messageId) || !C7384Etj.areEqual(this.threadId, canonicalSmsMessage.threadId) || !C7384Etj.areEqual(this.address, canonicalSmsMessage.address) || !C7384Etj.areEqual(this.body, canonicalSmsMessage.body) || this.timestampMs != canonicalSmsMessage.timestampMs || !C7384Etj.areEqual(this.direction, canonicalSmsMessage.direction) || !C7384Etj.areEqual(this.kind, canonicalSmsMessage.kind) || this.isRead != canonicalSmsMessage.isRead || !C7384Etj.areEqual(this.contactName, canonicalSmsMessage.contactName) || this.attachmentCount != canonicalSmsMessage.attachmentCount || !C7384Etj.areEqual(this.attachmentTypes, canonicalSmsMessage.attachmentTypes) || !C7384Etj.areEqual(this.participants, canonicalSmsMessage.participants) || !C7384Etj.areEqual(this.attachments, canonicalSmsMessage.attachments)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.messageId;
    }

    public final int component10() {
        return this.attachmentCount;
    }

    public final List<String> component11() {
        return this.attachmentTypes;
    }

    public final List<String> component12() {
        return this.participants;
    }

    public final List<SmsAttachment> component13() {
        return this.attachments;
    }

    public final String component2() {
        return this.threadId;
    }

    public final String component3() {
        return this.address;
    }

    public final String component4() {
        return this.body;
    }

    public final long component5() {
        return this.timestampMs;
    }

    public final String component6() {
        return this.direction;
    }

    public final String component7() {
        return this.kind;
    }

    public final boolean component8() {
        return this.isRead;
    }

    public final String component9() {
        return this.contactName;
    }

    public final String getAddress() {
        return this.address;
    }

    public final int getAttachmentCount() {
        return this.attachmentCount;
    }

    public final List<String> getAttachmentTypes() {
        return this.attachmentTypes;
    }

    public final List<SmsAttachment> getAttachments() {
        return this.attachments;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getContactName() {
        return this.contactName;
    }

    public final String getDirection() {
        return this.direction;
    }

    public final String getKind() {
        return this.kind;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final List<String> getParticipants() {
        return this.participants;
    }

    public final String getThreadId() {
        return this.threadId;
    }

    public final long getTimestampMs() {
        return this.timestampMs;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.attachments, AnonymousClass005.A0F(this.participants, AnonymousClass005.A0F(this.attachmentTypes, (((C0KA.A01(AnonymousClass005.A0I(this.kind, AnonymousClass005.A0I(this.direction, C60R.A00(this.timestampMs, AnonymousClass005.A0I(this.body, AnonymousClass005.A0I(this.address, AnonymousClass005.A0I(this.threadId, AnonymousClass001.A0G(this.messageId))))))), this.isRead) + AnonymousClass006.A0G(this.contactName)) * 31) + this.attachmentCount) * 31)));
    }

    public final boolean isRead() {
        return this.isRead;
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public CanonicalSmsMessage(String str, String str2, String str3, String str4, long j, String str5, String str6, boolean z, String str7, int i, List<String> list, List<String> list2, List<SmsAttachment> list3) {
        AnonymousClass005.A14(str, str2, str3, str4);
        AnonymousClass003.A0z(str5, str6);
        AnonymousClass002.A1G(list, 10, list2);
        C7384Etj.A0Y(list3, 12);
        this.messageId = str;
        this.threadId = str2;
        this.address = str3;
        this.body = str4;
        this.timestampMs = j;
        this.direction = str5;
        this.kind = str6;
        this.isRead = z;
        this.contactName = str7;
        this.attachmentCount = i;
        this.attachmentTypes = list;
        this.participants = list2;
        this.attachments = list3;
    }

    public final CanonicalSmsMessage copy(String str, String str2, String str3, String str4, long j, String str5, String str6, boolean z, String str7, int i, List<String> list, List<String> list2, List<SmsAttachment> list3) {
        AnonymousClass005.A14(str, str2, str3, str4);
        AnonymousClass003.A0z(str5, str6);
        AnonymousClass002.A1G(list, 10, list2);
        C7384Etj.A0Y(list3, 12);
        return new CanonicalSmsMessage(str, str2, str3, str4, j, str5, str6, z, str7, i, list, list2, list3);
    }

    public final JsonObject toJson() {
        C2nw c2nwA1K = C60O.A1K();
        C7qW.A06("messageId", this.messageId, c2nwA1K);
        C7qW.A06("threadId", this.threadId, c2nwA1K);
        C7qW.A06("address", this.address, c2nwA1K);
        C7qW.A06(MetaAiAppBroadcastSender.EXTRA_BODY, this.body, c2nwA1K);
        C7qW.A05(Long.valueOf(this.timestampMs), "timestampMs", c2nwA1K);
        NodeSyncTimestamps.INSTANCE.putLocalTimeFields(c2nwA1K, this.timestampMs, "timestamp");
        C7qW.A06("direction", this.direction, c2nwA1K);
        C7qW.A06("kind", this.kind, c2nwA1K);
        C7qW.A04(Boolean.valueOf(this.isRead), "isRead", c2nwA1K);
        C7qW.A06("contactName", this.contactName, c2nwA1K);
        int i = this.attachmentCount;
        if (i > 0) {
            C7qW.A05(Integer.valueOf(i), "attachmentCount", c2nwA1K);
        }
        if (!this.attachmentTypes.isEmpty()) {
            C7pd c7pdA01 = C7pd.A01();
            Iterator<String> it = this.attachmentTypes.iterator();
            while (it.hasNext()) {
                C7pd.A03(it, c7pdA01);
            }
            c2nwA1K.A01("attachmentTypes", C7pd.A00(c7pdA01));
        }
        if (!this.participants.isEmpty()) {
            C7pd c7pdA012 = C7pd.A01();
            Iterator<String> it2 = this.participants.iterator();
            while (it2.hasNext()) {
                C7pd.A03(it2, c7pdA012);
            }
            c2nwA1K.A01("participants", C7pd.A00(c7pdA012));
        }
        if (!this.attachments.isEmpty()) {
            C7pd c7pdA013 = C7pd.A01();
            Iterator<SmsAttachment> it3 = this.attachments.iterator();
            while (it3.hasNext()) {
                c7pdA013.A06(it3.next().toJson());
            }
            c2nwA1K.A01(C9Y.BUG_REPORT_ATTACHMENTS_ENDPOINT, C7pd.A00(c7pdA013));
        }
        return c2nwA1K.A00();
    }

    public String toString() {
        return super.toString();
    }

    public static /* synthetic */ CanonicalSmsMessage copy$default(CanonicalSmsMessage canonicalSmsMessage, String str, String str2, String str3, String str4, long j, String str5, String str6, boolean z, String str7, int i, List list, List list2, List list3, int i2, Object obj) {
        String str8 = str5;
        String str9 = str6;
        boolean z2 = z;
        String str10 = str7;
        int i3 = i;
        List list4 = list;
        List list5 = list2;
        List list6 = list3;
        if ((i2 & 1) != 0) {
            str = canonicalSmsMessage.messageId;
        }
        if ((i2 & 2) != 0) {
            str2 = canonicalSmsMessage.threadId;
        }
        if ((i2 & 4) != 0) {
            str3 = canonicalSmsMessage.address;
        }
        if ((i2 & 8) != 0) {
            str4 = canonicalSmsMessage.body;
        }
        if ((i2 & 16) != 0) {
            j = canonicalSmsMessage.timestampMs;
        }
        if ((i2 & 32) != 0) {
            str8 = canonicalSmsMessage.direction;
        }
        if ((i2 & 64) != 0) {
            str9 = canonicalSmsMessage.kind;
        }
        if ((i2 & 128) != 0) {
            z2 = canonicalSmsMessage.isRead;
        }
        if ((i2 & 256) != 0) {
            str10 = canonicalSmsMessage.contactName;
        }
        if ((i2 & 512) != 0) {
            i3 = canonicalSmsMessage.attachmentCount;
        }
        if ((i2 & 1024) != 0) {
            list4 = canonicalSmsMessage.attachmentTypes;
        }
        if ((i2 & 2048) != 0) {
            list5 = canonicalSmsMessage.participants;
        }
        if ((i2 & 4096) != 0) {
            list6 = canonicalSmsMessage.attachments;
        }
        return canonicalSmsMessage.copy(str, str2, str3, str4, j, str8, str9, z2, str10, i3, list4, list5, list6);
    }

    public /* synthetic */ CanonicalSmsMessage(String str, String str2, String str3, String str4, long j, String str5, String str6, boolean z, String str7, int i, List list, List list2, List list3, int i2, C06H c06h) {
        this(str, str2, str3, str4, j, str5, str6, z, (i2 & 256) != 0 ? null : str7, (i2 & 512) != 0 ? 0 : i, (i2 & 1024) != 0 ? C0881AGi.A00 : list, (i2 & 2048) != 0 ? C0881AGi.A00 : list2, (i2 & 4096) != 0 ? C0881AGi.A00 : list3);
    }
}

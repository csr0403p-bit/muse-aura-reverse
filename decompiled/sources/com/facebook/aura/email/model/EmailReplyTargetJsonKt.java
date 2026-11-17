package com.facebook.aura.email.model;

import X.AnonymousClass005;
import X.C7384Etj;
import X.C9oY;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.model.ReplyAttribution;

/* loaded from: classes4.dex */
public abstract class EmailReplyTargetJsonKt {
    public static final ReplyAttribution.Context emailReplyAttribution(String str, String str2, String str3, String str4, String str5) {
        AnonymousClass005.A11(str, str3, str4, 0);
        C7384Etj.A0Y(str5, 4);
        return new ReplyAttribution.Context("mail_message", C9oY.A05(HatchJsonKt.HatchJson.A03(new EmailReplyTargetJson("mail_message", str, null, null, str2, null, null, null, null, null, null, null), EmailReplyTargetJson$$serializer.INSTANCE)), str4, str3, str5);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.model.ReplyAttribution.Context parseEmailReplyTarget(kotlinx.serialization.json.JsonObject r13) {
        /*
            r2 = 0
            X.C7384Etj.A0Y(r13, r2)
            r7 = 0
            X.9sU r1 = com.facebook.aura.json.HatchJsonKt.HatchJson     // Catch: kotlinx.serialization.SerializationException -> Lac
            com.facebook.aura.email.model.EmailReplyTargetJson$$serializer r0 = com.facebook.aura.email.model.EmailReplyTargetJson$$serializer.INSTANCE     // Catch: kotlinx.serialization.SerializationException -> Lac
            X.C7384Etj.A0Y(r0, r2)     // Catch: kotlinx.serialization.SerializationException -> Lac
            java.lang.Object r4 = X.C9sZ.A00(r0, r1, r13)     // Catch: kotlinx.serialization.SerializationException -> Lac
            com.facebook.aura.email.model.EmailReplyTargetJson r4 = (com.facebook.aura.email.model.EmailReplyTargetJson) r4     // Catch: kotlinx.serialization.SerializationException -> Lac
            java.lang.String r0 = r4.type
            java.lang.String r0 = X.AnonymousClass002.A0l(r0)
            java.util.Locale r6 = java.util.Locale.ROOT
            java.lang.String r1 = r0.toLowerCase(r6)
            java.lang.String r0 = "mail_message"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lab
            java.lang.String r2 = r4.message_id
            java.lang.String r1 = r4.messageId
            java.lang.String r0 = r4.messageID
            java.lang.String[] r0 = new java.lang.String[]{r2, r1, r0}
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.util.Iterator r1 = r0.iterator()
        L38:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Lab
            java.lang.String r0 = X.AnonymousClass005.A0j(r1)
            if (r0 == 0) goto L38
            java.lang.String r3 = X.AnonymousClass002.A0l(r0)
            if (r3 == 0) goto L38
            int r0 = r3.length()
            if (r0 <= 0) goto L38
            java.lang.String r8 = r4.sender_name
            java.lang.String r9 = r4.senderName
            java.lang.String r10 = r4.sender
            java.lang.String r11 = r4.from_name
            java.lang.String r12 = r4.fromName
            java.lang.String r13 = r4.from
            java.lang.String[] r0 = new java.lang.String[]{r8, r9, r10, r11, r12, r13}
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.util.Iterator r1 = r0.iterator()
        L68:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto La9
            java.lang.String r0 = X.AnonymousClass005.A0j(r1)
            if (r0 == 0) goto L68
            java.lang.String r5 = X.AnonymousClass002.A0l(r0)
            if (r5 == 0) goto L68
            int r0 = r5.length()
            if (r0 <= 0) goto L68
        L80:
            java.lang.String r2 = ""
            if (r5 != 0) goto L85
            r5 = r2
        L85:
            java.lang.String r0 = r4.action
            if (r0 == 0) goto La7
            java.lang.String r1 = r0.toLowerCase(r6)
            java.lang.String r0 = "reply"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L9d
            java.lang.String r0 = "forward"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto La7
        L9d:
            java.lang.String r0 = r4.subject
            if (r0 != 0) goto La2
            r0 = r2
        La2:
            com.facebook.aura.model.ReplyAttribution$Context r0 = emailReplyAttribution(r3, r1, r5, r0, r2)
            return r0
        La7:
            r1 = r7
            goto L9d
        La9:
            r5 = r7
            goto L80
        Lab:
            return r7
        Lac:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.email.model.EmailReplyTargetJsonKt.parseEmailReplyTarget(kotlinx.serialization.json.JsonObject):com.facebook.aura.model.ReplyAttribution$Context");
    }

    public static /* synthetic */ ReplyAttribution.Context emailReplyAttribution$default(String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 16) != 0) {
            str5 = "";
        }
        return emailReplyAttribution(str, str2, str3, str4, str5);
    }
}

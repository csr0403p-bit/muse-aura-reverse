package com.facebook.aura.email.repo;

import X.A6B;
import X.AGI;
import X.AHD;
import X.AII;
import X.AIM;
import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.B3i;
import X.BQG;
import X.C06827l3;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0881AGi;
import X.C10600Hxy;
import X.C2308BTi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C7438Evz;
import X.C79;
import X.C7BY;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import X.G0U;
import X.HsK;
import X.HxE;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.facebook.aura.email.model.EmailBodyPart;
import com.facebook.aura.email.model.EmailMessage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class EmailMessageJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion();
    public final String attachment_status;
    public final List<EmailAttachmentJson> attachments;
    public final double created_at;
    public final String delivery_status;
    public final String direction;
    public final String extracted_text;
    public final List<EmailForwardedJson> forwarded_messages;
    public final List<String> header_cc;
    public final String header_from;
    public final String header_from_name;
    public final List<String> header_to;
    public final String html_body;
    public final String id;
    public final String in_reply_to;
    public final String preview;
    public final List<String> references;
    public final String rfc_message_id;
    public final EmailAuthenticationJson sender_authentication;
    public final String subject;
    public final String text_body;

    /* loaded from: classes.dex */
    public final class Companion {
        public final C9hr<EmailMessageJson> serializer() {
            return EmailMessageJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* renamed from: com.facebook.aura.email.repo.EmailMessageJson$toDomain$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 extends C7438Evz implements G0U<String, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        @Override // X.G0U
        public final Boolean invoke(String str) {
            C7384Etj.A0Y(str, 0);
            return Boolean.valueOf(AnonymousClass002.A1N(str.length()));
        }

        public AnonymousClass1() {
            super(1, BQG.class, "isNotEmpty", "isNotEmpty(Ljava/lang/CharSequence;)Z", 1);
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = new F0C[]{null, null, null, null, null, AbstractC5321DgF.A02(num, EmailMessageJson$Companion$$childSerializers$1.INSTANCE), AbstractC5321DgF.A02(num, EmailMessageJson$Companion$$childSerializers$2.INSTANCE), null, null, null, null, AbstractC5321DgF.A02(num, EmailMessageJson$Companion$$childSerializers$3.INSTANCE), null, null, null, null, AbstractC5321DgF.A02(num, EmailMessageJson$Companion$$childSerializers$4.INSTANCE), AbstractC5321DgF.A02(num, EmailMessageJson$Companion$$childSerializers$5.INSTANCE), null, null};
    }

    public final EmailMessageJson copy(String str, double d, String str2, String str3, String str4, List<String> list, List<String> list2, String str5, String str6, String str7, String str8, List<String> list3, String str9, EmailAuthenticationJson emailAuthenticationJson, String str10, String str11, List<EmailForwardedJson> list4, List<EmailAttachmentJson> list5, String str12, String str13) {
        C7384Etj.A0Y(str, 0);
        AnonymousClass005.A16(str2, str3, str4, list, 2);
        AnonymousClass005.A13(list2, str5, str6, 6);
        C7384Etj.A0Y(list5, 17);
        C7384Etj.A0Y(str13, 19);
        return new EmailMessageJson(str, d, str2, str3, str4, list, list2, str5, str6, str7, str8, list3, str9, emailAuthenticationJson, str10, str11, list4, list5, str12, str13);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EmailMessageJson) {
                EmailMessageJson emailMessageJson = (EmailMessageJson) obj;
                if (!C7384Etj.areEqual(this.id, emailMessageJson.id) || Double.compare(this.created_at, emailMessageJson.created_at) != 0 || !C7384Etj.areEqual(this.rfc_message_id, emailMessageJson.rfc_message_id) || !C7384Etj.areEqual(this.header_from, emailMessageJson.header_from) || !C7384Etj.areEqual(this.header_from_name, emailMessageJson.header_from_name) || !C7384Etj.areEqual(this.header_to, emailMessageJson.header_to) || !C7384Etj.areEqual(this.header_cc, emailMessageJson.header_cc) || !C7384Etj.areEqual(this.preview, emailMessageJson.preview) || !C7384Etj.areEqual(this.direction, emailMessageJson.direction) || !C7384Etj.areEqual(this.delivery_status, emailMessageJson.delivery_status) || !C7384Etj.areEqual(this.in_reply_to, emailMessageJson.in_reply_to) || !C7384Etj.areEqual(this.references, emailMessageJson.references) || !C7384Etj.areEqual(this.html_body, emailMessageJson.html_body) || !C7384Etj.areEqual(this.sender_authentication, emailMessageJson.sender_authentication) || !C7384Etj.areEqual(this.text_body, emailMessageJson.text_body) || !C7384Etj.areEqual(this.extracted_text, emailMessageJson.extracted_text) || !C7384Etj.areEqual(this.forwarded_messages, emailMessageJson.forwarded_messages) || !C7384Etj.areEqual(this.attachments, emailMessageJson.attachments) || !C7384Etj.areEqual(this.attachment_status, emailMessageJson.attachment_status) || !C7384Etj.areEqual(this.subject, emailMessageJson.subject)) {
                }
            }
            return false;
        }
        return true;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_email_repo_repo(EmailMessageJson emailMessageJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(emailMessageJson.id, c9iZ, 0);
        c9j5.AAD(c9iZ, emailMessageJson.created_at, 1);
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(emailMessageJson.rfc_message_id)) {
            c9j5.AAV(emailMessageJson.rfc_message_id, c9iZ, 2);
        }
        if (zAfR || !"".equals(emailMessageJson.header_from)) {
            c9j5.AAV(emailMessageJson.header_from, c9iZ, 3);
        }
        if (zAfR || !"".equals(emailMessageJson.header_from_name)) {
            c9j5.AAV(emailMessageJson.header_from_name, c9iZ, 4);
        }
        if (zAfR || !C3cG.A1L(emailMessageJson.header_to)) {
            c9j5.AAQ(emailMessageJson.header_to, C3cH.A15(f0cArr, 5), c9iZ, 5);
        }
        if (zAfR || !C3cG.A1L(emailMessageJson.header_cc)) {
            c9j5.AAQ(emailMessageJson.header_cc, C3cH.A15(f0cArr, 6), c9iZ, 6);
        }
        if (zAfR || !"".equals(emailMessageJson.preview)) {
            c9j5.AAV(emailMessageJson.preview, c9iZ, 7);
        }
        if (zAfR || !"".equals(emailMessageJson.direction)) {
            c9j5.AAV(emailMessageJson.direction, c9iZ, 8);
        }
        if (zAfR || emailMessageJson.delivery_status != null) {
            c9j5.AAP(emailMessageJson.delivery_status, C07779iq.A01, c9iZ, 9);
        }
        if (zAfR || emailMessageJson.in_reply_to != null) {
            c9j5.AAP(emailMessageJson.in_reply_to, C07779iq.A01, c9iZ, 10);
        }
        if (zAfR || emailMessageJson.references != null) {
            c9j5.AAP(emailMessageJson.references, C3cH.A15(f0cArr, 11), c9iZ, 11);
        }
        if (zAfR || emailMessageJson.html_body != null) {
            c9j5.AAP(emailMessageJson.html_body, C07779iq.A01, c9iZ, 12);
        }
        if (zAfR || emailMessageJson.sender_authentication != null) {
            c9j5.AAP(emailMessageJson.sender_authentication, EmailAuthenticationJson$$serializer.INSTANCE, c9iZ, 13);
        }
        if (zAfR || emailMessageJson.text_body != null) {
            c9j5.AAP(emailMessageJson.text_body, C07779iq.A01, c9iZ, 14);
        }
        if (zAfR || emailMessageJson.extracted_text != null) {
            c9j5.AAP(emailMessageJson.extracted_text, C07779iq.A01, c9iZ, 15);
        }
        if (zAfR || emailMessageJson.forwarded_messages != null) {
            c9j5.AAP(emailMessageJson.forwarded_messages, C3cH.A15(f0cArr, 16), c9iZ, 16);
        }
        if (zAfR || !C3cG.A1L(emailMessageJson.attachments)) {
            c9j5.AAQ(emailMessageJson.attachments, C3cH.A15(f0cArr, 17), c9iZ, 17);
        }
        if (zAfR || emailMessageJson.attachment_status != null) {
            c9j5.AAP(emailMessageJson.attachment_status, C07779iq.A01, c9iZ, 18);
        }
        if (zAfR || !"".equals(emailMessageJson.subject)) {
            c9j5.AAV(emailMessageJson.subject, c9iZ, 19);
        }
    }

    public final String component1() {
        return this.id;
    }

    public final String component10() {
        return this.delivery_status;
    }

    public final String component11() {
        return this.in_reply_to;
    }

    public final List<String> component12() {
        return this.references;
    }

    public final String component13() {
        return this.html_body;
    }

    public final EmailAuthenticationJson component14() {
        return this.sender_authentication;
    }

    public final String component15() {
        return this.text_body;
    }

    public final String component16() {
        return this.extracted_text;
    }

    public final List<EmailForwardedJson> component17() {
        return this.forwarded_messages;
    }

    public final List<EmailAttachmentJson> component18() {
        return this.attachments;
    }

    public final String component19() {
        return this.attachment_status;
    }

    public final double component2() {
        return this.created_at;
    }

    public final String component20() {
        return this.subject;
    }

    public final String component3() {
        return this.rfc_message_id;
    }

    public final String component4() {
        return this.header_from;
    }

    public final String component5() {
        return this.header_from_name;
    }

    public final List<String> component6() {
        return this.header_to;
    }

    public final List<String> component7() {
        return this.header_cc;
    }

    public final String component8() {
        return this.preview;
    }

    public final String component9() {
        return this.direction;
    }

    public final String getAttachment_status() {
        return this.attachment_status;
    }

    public final List<EmailAttachmentJson> getAttachments() {
        return this.attachments;
    }

    public final double getCreated_at() {
        return this.created_at;
    }

    public final String getDelivery_status() {
        return this.delivery_status;
    }

    public final String getDirection() {
        return this.direction;
    }

    public final String getExtracted_text() {
        return this.extracted_text;
    }

    public final List<EmailForwardedJson> getForwarded_messages() {
        return this.forwarded_messages;
    }

    public final List<String> getHeader_cc() {
        return this.header_cc;
    }

    public final String getHeader_from() {
        return this.header_from;
    }

    public final String getHeader_from_name() {
        return this.header_from_name;
    }

    public final List<String> getHeader_to() {
        return this.header_to;
    }

    public final String getHtml_body() {
        return this.html_body;
    }

    public final String getId() {
        return this.id;
    }

    public final String getIn_reply_to() {
        return this.in_reply_to;
    }

    public final String getPreview() {
        return this.preview;
    }

    public final List<String> getReferences() {
        return this.references;
    }

    public final String getRfc_message_id() {
        return this.rfc_message_id;
    }

    public final EmailAuthenticationJson getSender_authentication() {
        return this.sender_authentication;
    }

    public final String getSubject() {
        return this.subject;
    }

    public final String getText_body() {
        return this.text_body;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.subject, (AnonymousClass005.A0F(this.attachments, (((((((((((((((AnonymousClass005.A0I(this.direction, AnonymousClass005.A0I(this.preview, AnonymousClass005.A0F(this.header_cc, AnonymousClass005.A0F(this.header_to, AnonymousClass005.A0I(this.header_from_name, AnonymousClass005.A0I(this.header_from, AnonymousClass005.A0I(this.rfc_message_id, (AnonymousClass001.A0G(this.id) + HsK.A00(this.created_at)) * 31))))))) + AnonymousClass006.A0G(this.delivery_status)) * 31) + AnonymousClass006.A0G(this.in_reply_to)) * 31) + AnonymousClass006.A0D(this.references)) * 31) + AnonymousClass006.A0G(this.html_body)) * 31) + AnonymousClass006.A0D(this.sender_authentication)) * 31) + AnonymousClass006.A0G(this.text_body)) * 31) + AnonymousClass006.A0G(this.extracted_text)) * 31) + AnonymousClass006.A0D(this.forwarded_messages)) * 31) + AnonymousClass005.A0H(this.attachment_status)) * 31);
    }

    public final EmailMessage toDomain() {
        String str;
        EmailRichContent emailRichContentRichContent = EmailForwardHtmlKt.richContent(this);
        String str2 = this.id;
        double d = this.created_at;
        String str3 = this.rfc_message_id;
        String str4 = this.header_from;
        String str5 = this.header_from_name;
        AHD ahdA07 = AGI.A07(this.header_to);
        String str6 = this.preview;
        C06827l3 c06827l3 = new C06827l3("[\\s\\p{Z}\\u0085]+");
        C7384Etj.A0Y(str6, 0);
        String str7 = null;
        B3i b3iA03 = A6B.A03(AnonymousClass1.INSTANCE, new C2308BTi(new C10600Hxy(str6, null, c06827l3, 0), 1));
        String str8 = null;
        String strA01 = A6B.A01(InviteCodeScratcherKt.CODE_SEPARATOR, b3iA03);
        String str9 = this.direction;
        String str10 = this.delivery_status;
        String str11 = this.in_reply_to;
        Iterable iterable = this.references;
        if (iterable == null) {
            iterable = C0881AGi.A00;
        }
        AHD ahdA072 = AGI.A07(iterable);
        AHD ahdA073 = AGI.A07(bodyParts());
        List<EmailAttachmentJson> list = this.attachments;
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        Iterator<EmailAttachmentJson> it = list.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(it.next().toDomain());
        }
        AHD ahdA074 = AGI.A07(arrayListA0i);
        String str12 = this.attachment_status;
        String str13 = this.subject;
        if (emailRichContentRichContent != null) {
            str8 = emailRichContentRichContent.html;
            str7 = emailRichContentRichContent.preamble;
            str = emailRichContentRichContent.fallback;
        } else {
            str = null;
        }
        EmailAuthenticationJson emailAuthenticationJson = this.sender_authentication;
        return new EmailMessage(str2, d, str3, str4, str5, ahdA07, strA01, str9, str10, str11, ahdA072, ahdA073, ahdA074, str12, str13, str8, str7, str, emailAuthenticationJson != null ? emailAuthenticationJson.verdict : null, AGI.A07(this.header_cc));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<EmailBodyPart> bodyParts() {
        String strSubstring;
        Object next;
        AII aiiA17 = AIM.A17();
        String str = this.text_body;
        if (str == null || str.length() == 0) {
            strSubstring = this.extracted_text;
            if (strSubstring == null) {
                strSubstring = "";
            }
        } else {
            strSubstring = str;
        }
        Object obj = null;
        if (str != null && str.length() != 0) {
            List list = this.forwarded_messages;
            if (list == null) {
                list = C0881AGi.A00;
            }
            ArrayList arrayListA0h = C3cG.A0h();
            for (Object obj2 : list) {
                EmailForwardedJson emailForwardedJson = (EmailForwardedJson) obj2;
                if ("INLINE".equals(emailForwardedJson.format) && emailForwardedJson.text_body.length() > 0) {
                    arrayListA0h.add(obj2);
                }
            }
            ArrayList arrayList = new ArrayList(arrayListA0h);
            while (!arrayList.isEmpty()) {
                ArrayList arrayListA0h2 = C3cG.A0h();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    EmailForwardedJson emailForwardedJson2 = (EmailForwardedJson) it.next();
                    Integer numValueOf = Integer.valueOf(C7BY.A0B(strSubstring, emailForwardedJson2.text_body, 0, false));
                    if (numValueOf.intValue() >= 0) {
                        AnonymousClass002.A1J(numValueOf, emailForwardedJson2, arrayListA0h2);
                    }
                }
                Iterator it2 = arrayListA0h2.iterator();
                if (it2.hasNext()) {
                    next = it2.next();
                    if (it2.hasNext()) {
                        int iA0F = AnonymousClass001.A0F(((HxE) next).first);
                        do {
                            Object next2 = it2.next();
                            int iA0F2 = AnonymousClass001.A0F(((HxE) next2).first);
                            if (iA0F > iA0F2) {
                                next = next2;
                                iA0F = iA0F2;
                            }
                        } while (it2.hasNext());
                    }
                } else {
                    next = null;
                }
                HxE hxE = (HxE) next;
                if (hxE == null) {
                    break;
                }
                int iA0F3 = AnonymousClass001.A0F(hxE.first);
                EmailForwardedJson emailForwardedJson3 = (EmailForwardedJson) hxE.second;
                aiiA17.add(new EmailBodyPart(strSubstring.substring(0, iA0F3), false));
                aiiA17.add(new EmailBodyPart(emailForwardedJson3.text_body, true));
                strSubstring = strSubstring.substring(iA0F3 + emailForwardedJson3.text_body.length());
                arrayList.remove(emailForwardedJson3);
            }
        }
        aiiA17.add(new EmailBodyPart(strSubstring, false));
        String str2 = this.text_body;
        if (str2 == null || str2.length() == 0) {
            List list2 = this.forwarded_messages;
            if (list2 == null) {
                list2 = C0881AGi.A00;
            }
            Iterator it3 = list2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next3 = it3.next();
                if ("INLINE".equals(((EmailForwardedJson) next3).format)) {
                    obj = next3;
                    break;
                }
            }
            EmailForwardedJson emailForwardedJson4 = (EmailForwardedJson) obj;
            if (emailForwardedJson4 != null) {
                aiiA17.add(new EmailBodyPart(emailForwardedJson4.text_body, true));
            }
        }
        List list3 = this.forwarded_messages;
        if (list3 == null) {
            list3 = C0881AGi.A00;
        }
        ArrayList arrayListA0h3 = C3cG.A0h();
        for (Object obj3 : list3) {
            C3cI.A1J(((EmailForwardedJson) obj3).format, obj3, "ATTACHED", arrayListA0h3);
        }
        Iterator it4 = arrayListA0h3.iterator();
        while (it4.hasNext()) {
            aiiA17.add(new EmailBodyPart(((EmailForwardedJson) it4.next()).text_body, true));
        }
        AII aiiA18 = AIM.A18(aiiA17);
        ArrayList arrayListA0h4 = C3cG.A0h();
        Iterator<E> it5 = aiiA18.iterator();
        while (it5.hasNext()) {
            Object next4 = it5.next();
            if (((EmailBodyPart) next4).text.length() > 0) {
                arrayListA0h4.add(next4);
            }
        }
        return arrayListA0h4;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ EmailMessageJson(int i, String str, double d, String str2, String str3, String str4, List list, List list2, String str5, String str6, String str7, String str8, List list3, String str9, EmailAuthenticationJson emailAuthenticationJson, String str10, String str11, List list4, List list5, String str12, String str13, C2hx c2hx) {
        List list6 = list5;
        if (3 != (i & 3)) {
            C9iI.A00(EmailMessageJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.id = str;
        this.created_at = d;
        if ((i & 4) == 0) {
            this.rfc_message_id = "";
        } else {
            this.rfc_message_id = str2;
        }
        if ((i & 8) == 0) {
            this.header_from = "";
        } else {
            this.header_from = str3;
        }
        if ((i & 16) == 0) {
            this.header_from_name = "";
        } else {
            this.header_from_name = str4;
        }
        if ((i & 32) == 0) {
            this.header_to = C0881AGi.A00;
        } else {
            this.header_to = list;
        }
        if ((i & 64) == 0) {
            this.header_cc = C0881AGi.A00;
        } else {
            this.header_cc = list2;
        }
        if ((i & 128) == 0) {
            this.preview = "";
        } else {
            this.preview = str5;
        }
        if ((i & 256) == 0) {
            this.direction = "";
        } else {
            this.direction = str6;
        }
        if ((i & 512) == 0) {
            this.delivery_status = null;
        } else {
            this.delivery_status = str7;
        }
        if ((i & 1024) == 0) {
            this.in_reply_to = null;
        } else {
            this.in_reply_to = str8;
        }
        if ((i & 2048) == 0) {
            this.references = null;
        } else {
            this.references = list3;
        }
        if ((i & 4096) == 0) {
            this.html_body = null;
        } else {
            this.html_body = str9;
        }
        if ((i & 8192) == 0) {
            this.sender_authentication = null;
        } else {
            this.sender_authentication = emailAuthenticationJson;
        }
        if ((i & 16384) == 0) {
            this.text_body = null;
        } else {
            this.text_body = str10;
        }
        if ((32768 & i) == 0) {
            this.extracted_text = null;
        } else {
            this.extracted_text = str11;
        }
        if ((65536 & i) == 0) {
            this.forwarded_messages = null;
        } else {
            this.forwarded_messages = list4;
        }
        this.attachments = (131072 & i) == 0 ? C0881AGi.A00 : list6;
        if ((262144 & i) == 0) {
            this.attachment_status = null;
        } else {
            this.attachment_status = str12;
        }
        if ((i & 524288) == 0) {
            this.subject = "";
        } else {
            this.subject = str13;
        }
    }

    public static /* synthetic */ EmailMessageJson copy$default(EmailMessageJson emailMessageJson, String str, double d, String str2, String str3, String str4, List list, List list2, String str5, String str6, String str7, String str8, List list3, String str9, EmailAuthenticationJson emailAuthenticationJson, String str10, String str11, List list4, List list5, String str12, String str13, int i, Object obj) {
        String str14 = str;
        double d2 = d;
        String str15 = str2;
        String str16 = str3;
        String str17 = str4;
        List list6 = list;
        List list7 = list2;
        String str18 = str5;
        String str19 = str6;
        String str20 = str7;
        String str21 = str8;
        List list8 = list3;
        String str22 = str9;
        EmailAuthenticationJson emailAuthenticationJson2 = emailAuthenticationJson;
        String str23 = str10;
        List list9 = list4;
        List list10 = list5;
        String str24 = str12;
        String str25 = str11;
        String str26 = str13;
        if ((i & 1) != 0) {
            str14 = emailMessageJson.id;
        }
        if ((i & 2) != 0) {
            d2 = emailMessageJson.created_at;
        }
        if ((i & 4) != 0) {
            str15 = emailMessageJson.rfc_message_id;
        }
        if ((i & 8) != 0) {
            str16 = emailMessageJson.header_from;
        }
        if ((i & 16) != 0) {
            str17 = emailMessageJson.header_from_name;
        }
        if ((i & 32) != 0) {
            list6 = emailMessageJson.header_to;
        }
        if ((i & 64) != 0) {
            list7 = emailMessageJson.header_cc;
        }
        if ((i & 128) != 0) {
            str18 = emailMessageJson.preview;
        }
        if ((i & 256) != 0) {
            str19 = emailMessageJson.direction;
        }
        if ((i & 512) != 0) {
            str20 = emailMessageJson.delivery_status;
        }
        if ((i & 1024) != 0) {
            str21 = emailMessageJson.in_reply_to;
        }
        if ((i & 2048) != 0) {
            list8 = emailMessageJson.references;
        }
        if ((i & 4096) != 0) {
            str22 = emailMessageJson.html_body;
        }
        if ((i & 8192) != 0) {
            emailAuthenticationJson2 = emailMessageJson.sender_authentication;
        }
        if ((i & 16384) != 0) {
            str23 = emailMessageJson.text_body;
        }
        if ((i & 32768) != 0) {
            str25 = emailMessageJson.extracted_text;
        }
        if ((i & 65536) != 0) {
            list9 = emailMessageJson.forwarded_messages;
        }
        if ((i & 131072) != 0) {
            list10 = emailMessageJson.attachments;
        }
        if ((i & 262144) != 0) {
            str24 = emailMessageJson.attachment_status;
        }
        if ((i & 524288) != 0) {
            str26 = emailMessageJson.subject;
        }
        String str27 = str20;
        String str28 = str21;
        String str29 = str22;
        return emailMessageJson.copy(str14, d2, str15, str16, str17, list6, list7, str18, str19, str27, str28, list8, str29, emailAuthenticationJson2, str23, str25, list9, list10, str24, str26);
    }

    public /* synthetic */ EmailMessageJson(String str, double d, String str2, String str3, String str4, List list, List list2, String str5, String str6, String str7, String str8, List list3, String str9, EmailAuthenticationJson emailAuthenticationJson, String str10, String str11, List list4, List list5, String str12, String str13, int i, C06H c06h) {
        this(str, d, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? C0881AGi.A00 : list, (i & 64) != 0 ? C0881AGi.A00 : list2, (i & 128) != 0 ? "" : str5, (i & 256) != 0 ? "" : str6, (i & 512) != 0 ? null : str7, (i & 1024) != 0 ? null : str8, (i & 2048) != 0 ? null : list3, (i & 4096) != 0 ? null : str9, (i & 8192) != 0 ? null : emailAuthenticationJson, (i & 16384) != 0 ? null : str10, (32768 & i) != 0 ? null : str11, (65536 & i) != 0 ? null : list4, (131072 & i) != 0 ? C0881AGi.A00 : list5, (262144 & i) != 0 ? null : str12, (i & 524288) != 0 ? "" : str13);
    }

    public EmailMessageJson(String str, double d, String str2, String str3, String str4, List<String> list, List<String> list2, String str5, String str6, String str7, String str8, List<String> list3, String str9, EmailAuthenticationJson emailAuthenticationJson, String str10, String str11, List<EmailForwardedJson> list4, List<EmailAttachmentJson> list5, String str12, String str13) {
        C7384Etj.A0Y(str, 0);
        AnonymousClass005.A16(str2, str3, str4, list, 2);
        AnonymousClass005.A13(list2, str5, str6, 6);
        C7384Etj.A0Y(list5, 17);
        C7384Etj.A0Y(str13, 19);
        this.id = str;
        this.created_at = d;
        this.rfc_message_id = str2;
        this.header_from = str3;
        this.header_from_name = str4;
        this.header_to = list;
        this.header_cc = list2;
        this.preview = str5;
        this.direction = str6;
        this.delivery_status = str7;
        this.in_reply_to = str8;
        this.references = list3;
        this.html_body = str9;
        this.sender_authentication = emailAuthenticationJson;
        this.text_body = str10;
        this.extracted_text = str11;
        this.forwarded_messages = list4;
        this.attachments = list5;
        this.attachment_status = str12;
        this.subject = str13;
    }
}

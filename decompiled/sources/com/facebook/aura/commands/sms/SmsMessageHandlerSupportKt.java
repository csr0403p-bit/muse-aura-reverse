package com.facebook.aura.commands.sms;

import X.AbstractC06907md;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.C0881AGi;
import X.C3cG;
import X.C60O;
import X.C60Q;
import X.C7384Etj;
import X.C7BY;
import X.C7pd;
import X.C7qW;
import X.CFK;
import X.FGI;
import X.HtJ;
import X.HzP;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.json.JsonObjectExtensionsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public abstract class SmsMessageHandlerSupportKt {
    public static final String ATTACHMENTS_TAG = "SmsMessageAttachments";
    public static final String CONTACTS_PERMISSION_REQUIRED = "Contacts permission is required to message a contact by name or contact id. Use a phone number instead, or enable Contacts permission.";
    public static final String INVALID_ATTACHMENTS = "Nothing was sent and no card was shown. `attachments` must be a JSON array string of objects, each with a non-empty `path` and optional `file_name` and `mime_type` \u2014 e.g. '[{\"path\":\"workspace/user/files/photo.jpg\"}]'. A bare file path is not accepted.";
    public static final String INVALID_RECIPIENTS = "One or more values in `recipients` could not be resolved. Nothing was sent. Pass raw phone numbers, use `contact_ids` for known contacts, or set `resolve_name: true` to look up contact names.";
    public static final int MAX_ATTACHMENTS = 10;
    public static final String MESSAGE_BODY_REQUIRED = "The `body` of the message is required.";
    public static final String MISSING_RECIPIENTS = "Provide at least one of `recipients` or `contact_ids`.";
    public static final String RECIPIENTS_TAG = "SmsMessageRecipients";
    public static final String UNRESOLVED_CONTACT_IDS = "One or more contact IDs could not be resolved to a phone number. Nothing was sent. Look up the contacts again with `contacts.search` and use their `platform_id` values in `contact_ids`. Message IDs and thread IDs are not contact IDs.";

    @DebugMetadata(c = "com.facebook.aura.commands.sms.SmsMessageHandlerSupportKt", f = "SmsMessageHandlerSupport.kt", l = {93, 146}, m = "resolveMessageRecipients", v = 2)
    /* renamed from: com.facebook.aura.commands.sms.SmsMessageHandlerSupportKt$resolveMessageRecipients$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SmsMessageHandlerSupportKt.resolveMessageRecipients(null, null, this);
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List<com.facebook.aura.commands.sms.MessagingAttachmentArg> parseMessageAttachments(kotlinx.serialization.json.JsonObject r9) {
        /*
            r0 = 0
            X.C7384Etj.A0Y(r9, r0)
            java.lang.String r0 = "attachments"
            r8 = 0
            java.lang.String r7 = ""
            java.lang.String r1 = com.facebook.aura.json.JsonObjectExtensionsKt.optString(r9, r0, r7)
            boolean r0 = X.C7BY.A0j(r1)
            if (r0 == 0) goto L14
            r1 = r8
        L14:
            if (r1 != 0) goto L19
            X.AGi r8 = X.C0881AGi.A00
        L18:
            return r8
        L19:
            X.9sU r0 = com.facebook.aura.json.HatchJsonKt.HatchJson     // Catch: java.lang.Exception -> L26
            kotlinx.serialization.json.JsonElement r5 = r0.A04(r1)     // Catch: java.lang.Exception -> L26
            boolean r0 = r5 instanceof kotlinx.serialization.json.JsonArray     // Catch: java.lang.Exception -> L26
            if (r0 == 0) goto L2e
            kotlinx.serialization.json.JsonArray r5 = (kotlinx.serialization.json.JsonArray) r5     // Catch: java.lang.Exception -> L26
            goto L2f
        L26:
            r2 = move-exception
            java.lang.String r1 = "attachments param was not valid JSON"
            java.lang.String r0 = "SmsMessageAttachments"
            X.CFK.A08(r0, r1, r2)
        L2e:
            r5 = r8
        L2f:
            if (r5 == 0) goto L18
            java.util.ArrayList r6 = X.C3cG.A0h()
            java.util.Iterator r4 = r5.iterator()
        L39:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L75
            kotlinx.serialization.json.JsonElement r3 = X.C60Q.A11(r4)
            boolean r0 = r3 instanceof kotlinx.serialization.json.JsonObject
            if (r0 == 0) goto L73
            kotlinx.serialization.json.JsonObject r3 = (kotlinx.serialization.json.JsonObject) r3
        L49:
            if (r3 == 0) goto L71
            java.lang.String r0 = "path"
            java.lang.String r2 = com.facebook.aura.json.JsonObjectExtensionsKt.optString(r3, r0, r7)
            boolean r0 = X.C7BY.A0j(r2)
            if (r0 == 0) goto L58
            r2 = r8
        L58:
            if (r2 == 0) goto L71
            java.lang.String r0 = "file_name"
            java.lang.String r1 = com.facebook.aura.json.JsonObjectExtensionsKt.optStringOrNull(r3, r0)
            java.lang.String r0 = "mime_type"
            java.lang.String r0 = com.facebook.aura.json.JsonObjectExtensionsKt.optStringOrNull(r3, r0)
            com.facebook.aura.commands.sms.MessagingAttachmentArg r3 = new com.facebook.aura.commands.sms.MessagingAttachmentArg
            r3.<init>(r2, r1, r0)
        L6b:
            if (r3 == 0) goto L39
            r6.add(r3)
            goto L39
        L71:
            r3 = r8
            goto L6b
        L73:
            r3 = r8
            goto L49
        L75:
            r0 = 10
            java.util.List r1 = X.AbstractC0878AGe.A0a(r6, r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L87
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L18
        L87:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.sms.SmsMessageHandlerSupportKt.parseMessageAttachments(kotlinx.serialization.json.JsonObject):java.util.List");
    }

    public static final List<RequestedRecipient> parseRecipientsParam(String str) {
        ArrayList arrayListA0m;
        String strA0l;
        JsonElement jsonElementA04;
        C7384Etj.A0Y(str, 0);
        String strA0l2 = AnonymousClass002.A0l(str);
        if (strA0l2.length() == 0) {
            return C0881AGi.A00;
        }
        if (strA0l2.startsWith("[")) {
            try {
                jsonElementA04 = HatchJsonKt.HatchJson.A04(strA0l2);
            } catch (Exception e) {
                CFK.A08(RECIPIENTS_TAG, "recipients looked like JSON but did not parse", e);
            }
            JsonArray jsonArray = jsonElementA04 instanceof JsonArray ? (JsonArray) jsonElementA04 : null;
            if (jsonArray == null) {
                return null;
            }
            arrayListA0m = AnonymousClass002.A0m(jsonArray);
            Iterator<JsonElement> it = jsonArray.iterator();
            while (it.hasNext()) {
                JsonElement jsonElementA11 = C60Q.A11(it);
                JsonObject jsonObject = jsonElementA11 instanceof JsonObject ? (JsonObject) jsonElementA11 : null;
                if (jsonObject == null) {
                    return null;
                }
                String strA0l3 = AnonymousClass002.A0l(C60O.A0u(jsonObject, "address"));
                if (strA0l3.length() <= 0) {
                    strA0l3 = null;
                }
                if (strA0l3 == null) {
                    return null;
                }
                String strOptStringOrNull = JsonObjectExtensionsKt.optStringOrNull(jsonObject, "name");
                if (strOptStringOrNull == null || (strA0l = AnonymousClass002.A0l(strOptStringOrNull)) == null || strA0l.length() <= 0) {
                    strA0l = null;
                }
                arrayListA0m.add(new RequestedRecipient(strA0l3, strA0l));
            }
        } else {
            List listA0e = C7BY.A0e(strA0l2, ",");
            ArrayList arrayListA0m2 = AnonymousClass002.A0m(listA0e);
            Iterator it2 = listA0e.iterator();
            while (it2.hasNext()) {
                arrayListA0m2.add(C7BY.A0b(it2));
            }
            ArrayList arrayListA0h = C3cG.A0h();
            Iterator it3 = arrayListA0m2.iterator();
            while (it3.hasNext()) {
                AnonymousClass007.A19(arrayListA0h, it3);
            }
            arrayListA0m = AnonymousClass002.A0m(arrayListA0h);
            Iterator it4 = arrayListA0h.iterator();
            while (it4.hasNext()) {
                arrayListA0m.add(new RequestedRecipient(AnonymousClass005.A0j(it4), null));
            }
        }
        return arrayListA0m;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a A[PHI: r5 r7 r9 r10
  0x003a: PHI (r5v2 int) = (r5v0 int), (r5v5 int), (r5v5 int) binds: [B:58:0x0155, B:13:0x0034, B:15:0x0038] A[DONT_GENERATE, DONT_INLINE]
  0x003a: PHI (r7v4 java.util.Map) = (r7v1 java.util.Map), (r7v7 java.util.Map), (r7v7 java.util.Map) binds: [B:58:0x0155, B:13:0x0034, B:15:0x0038] A[DONT_GENERATE, DONT_INLINE]
  0x003a: PHI (r9v3 com.facebook.aura.commands.sms.RecipientResolution) = 
  (r9v2 com.facebook.aura.commands.sms.RecipientResolution)
  (r9v6 com.facebook.aura.commands.sms.RecipientResolution)
  (r9v6 com.facebook.aura.commands.sms.RecipientResolution)
 binds: [B:58:0x0155, B:13:0x0034, B:15:0x0038] A[DONT_GENERATE, DONT_INLINE]
  0x003a: PHI (r10v7 com.facebook.aura.commands.contactlookup.ContactNameLookup$ContactNames) = 
  (r10v5 com.facebook.aura.commands.contactlookup.ContactNameLookup$ContactNames)
  (r10v10 com.facebook.aura.commands.contactlookup.ContactNameLookup$ContactNames)
  (r10v10 com.facebook.aura.commands.contactlookup.ContactNameLookup$ContactNames)
 binds: [B:58:0x0155, B:13:0x0034, B:15:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040 A[PHI: r5 r7 r8 r9 r10
  0x0040: PHI (r5v4 int) = (r5v2 int), (r5v5 int) binds: [B:17:0x003e, B:15:0x0038] A[DONT_GENERATE, DONT_INLINE]
  0x0040: PHI (r7v6 java.util.Map) = (r7v4 java.util.Map), (r7v7 java.util.Map) binds: [B:17:0x003e, B:15:0x0038] A[DONT_GENERATE, DONT_INLINE]
  0x0040: PHI (r8v5 java.util.Map) = (r8v2 java.util.Map), (r8v6 java.util.Map) binds: [B:17:0x003e, B:15:0x0038] A[DONT_GENERATE, DONT_INLINE]
  0x0040: PHI (r9v5 com.facebook.aura.commands.sms.RecipientResolution) = (r9v3 com.facebook.aura.commands.sms.RecipientResolution), (r9v6 com.facebook.aura.commands.sms.RecipientResolution) binds: [B:17:0x003e, B:15:0x0038] A[DONT_GENERATE, DONT_INLINE]
  0x0040: PHI (r10v8 com.facebook.aura.commands.contactlookup.ContactNameLookup$ContactNames) = 
  (r10v7 com.facebook.aura.commands.contactlookup.ContactNameLookup$ContactNames)
  (r10v10 com.facebook.aura.commands.contactlookup.ContactNameLookup$ContactNames)
 binds: [B:17:0x003e, B:15:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object resolveMessageRecipients(android.content.Context r15, kotlinx.serialization.json.JsonObject r16, X.HtJ<? super com.facebook.aura.commands.sms.MessageRecipientOutcome> r17) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.sms.SmsMessageHandlerSupportKt.resolveMessageRecipients(android.content.Context, kotlinx.serialization.json.JsonObject, X.HtJ):java.lang.Object");
    }

    public static final String ambiguousMessage(List<AmbiguousNameMatch> list) {
        return FGI.A0U("Nothing was sent. Contact-name matching is fuzzy, so a match \u2014 including a lone one \u2014 is never proof of who the user meant, and a name in `recipients` is never messaged directly. ", AbstractC06907md.A01(InviteCodeScratcherKt.CODE_SEPARATOR, list, SmsMessageHandlerSupportKt$ambiguousMessage$perMatch$1.INSTANCE), " Once the user has answered for every name, call this tool again with the chosen `contact_id` values in `contact_ids` (dropping those names from `recipients`).");
    }

    public static final String unverifiedNameMessage(List<UnconfirmedName> list) {
        return FGI.A0U("You named a recipient the device address book does not know: ", AbstractC06907md.A01("; ", list, SmsMessageHandlerSupportKt$unverifiedNameMessage$summary$1.INSTANCE), ". A number you remember, or saw in an earlier conversation, is not evidence of whose number it is \u2014 it may be out of date or belong to someone else entirely, and the user cannot tell from the card. Nothing was sent. Look the person up with `contacts.search` and retry with their `platform_id` in `contact_ids`. If the user gave you this number directly and it is genuinely not one of their contacts, retry with the same address and no `name` \u2014 the card will show the bare number, which is accurate.");
    }

    public static final JsonElement ambiguousMatchesJson(List<AmbiguousNameMatch> list) {
        C7pd c7pdA01 = C7pd.A01();
        Iterator<AmbiguousNameMatch> it = list.iterator();
        while (it.hasNext()) {
            C7qW.A0B(new SmsMessageHandlerSupportKt$ambiguousMatchesJson$1$1$1(it.next()), c7pdA01);
        }
        return C7pd.A00(c7pdA01);
    }
}

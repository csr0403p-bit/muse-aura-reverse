package com.facebook.aura.commands.sms;

import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C06G;
import X.C0881AGi;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C60Q;
import X.C7BY;
import X.FGI;
import X.G0V;
import X.GAo;
import X.HtJ;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.facebook.aura.pairs.PairsDiscretionDocument;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class DeviceSmsReader {
    public static final DeviceSmsReader INSTANCE = new DeviceSmsReader();

    public final class MmsAddressInfo extends C06G {
        public final List<String> addresses;
        public final List<String> participants;

        public static /* synthetic */ MmsAddressInfo copy$default(MmsAddressInfo mmsAddressInfo, List list, List list2, int i, Object obj) {
            if ((i & 1) != 0) {
                list = mmsAddressInfo.addresses;
            }
            if ((i & 2) != 0) {
                list2 = mmsAddressInfo.participants;
            }
            AnonymousClass003.A0u(list, list2);
            return new MmsAddressInfo(list, list2);
        }

        public final List<String> component1() {
            return this.addresses;
        }

        public final List<String> component2() {
            return this.participants;
        }

        public final List<String> getAddresses() {
            return this.addresses;
        }

        public final List<String> getParticipants() {
            return this.participants;
        }

        public MmsAddressInfo(List<String> list, List<String> list2) {
            AnonymousClass003.A0u(list, list2);
            this.addresses = list;
            this.participants = list2;
        }

        public final MmsAddressInfo copy(List<String> list, List<String> list2) {
            AnonymousClass003.A0u(list, list2);
            return new MmsAddressInfo(list, list2);
        }

        public boolean equals(Object obj) {
            return super.equals(obj);
        }

        public int hashCode() {
            return super.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class MmsPartInfo extends C06G {
        public final List<SmsAttachment> attachments;
        public final String body;

        public static /* synthetic */ MmsPartInfo copy$default(MmsPartInfo mmsPartInfo, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = mmsPartInfo.body;
            }
            if ((i & 2) != 0) {
                list = mmsPartInfo.attachments;
            }
            AnonymousClass003.A0u(str, list);
            return new MmsPartInfo(str, list);
        }

        public final String component1() {
            return this.body;
        }

        public final List<SmsAttachment> component2() {
            return this.attachments;
        }

        public final List<SmsAttachment> getAttachments() {
            return this.attachments;
        }

        public final String getBody() {
            return this.body;
        }

        public MmsPartInfo(String str, List<SmsAttachment> list) {
            AnonymousClass003.A0u(str, list);
            this.body = str;
            this.attachments = list;
        }

        public final MmsPartInfo copy(String str, List<SmsAttachment> list) {
            AnonymousClass003.A0u(str, list);
            return new MmsPartInfo(str, list);
        }

        public boolean equals(Object obj) {
            return super.equals(obj);
        }

        public int hashCode() {
            return super.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.sms.DeviceSmsReader$readAttachmentByPartId$2", f = "DeviceSmsReader.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.commands.sms.DeviceSmsReader$readAttachmentByPartId$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super SmsAttachment>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ long $partId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Context context, long j, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$context = context;
            this.$partId = j;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$context, this.$partId, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.String r3 = "name"
                java.lang.String r4 = "cl"
                java.lang.String r7 = "ct"
                int r0 = r14.label
                if (r0 != 0) goto L8e
                X.Hwg.A00(r15)
                android.content.Context r1 = r14.$context
                java.lang.String r0 = "android.permission.READ_SMS"
                int r0 = r1.checkSelfPermission(r0)
                java.lang.String r5 = "DeviceSmsReader"
                r13 = 0
                if (r0 == 0) goto L1b
                return r13
            L1b:
                android.content.Context r0 = r14.$context     // Catch: java.lang.Exception -> L7b
                android.content.ContentResolver r8 = r0.getContentResolver()     // Catch: java.lang.Exception -> L7b
                java.lang.String r0 = "content://mms/part"
                android.net.Uri r9 = android.net.Uri.parse(r0)     // Catch: java.lang.Exception -> L7b
                java.lang.String r0 = "_id"
                java.lang.String[] r10 = new java.lang.String[]{r0, r7, r4, r3}     // Catch: java.lang.Exception -> L7b
                java.lang.String r11 = "_id = ?"
                long r0 = r14.$partId     // Catch: java.lang.Exception -> L7b
                java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Exception -> L7b
                java.lang.String[] r12 = new java.lang.String[]{r0}     // Catch: java.lang.Exception -> L7b
                android.database.Cursor r6 = r8.query(r9, r10, r11, r12, r13)     // Catch: java.lang.Exception -> L7b
                if (r6 == 0) goto L7a
                long r1 = r14.$partId     // Catch: java.lang.Exception -> L7b
                boolean r0 = r6.moveToFirst()     // Catch: java.lang.Throwable -> L73
                if (r0 == 0) goto L6e
                java.lang.String r7 = X.C60Q.A0c(r6, r7)     // Catch: java.lang.Throwable -> L73
                if (r7 != 0) goto L4f
                java.lang.String r7 = ""
            L4f:
                boolean r0 = X.C7BY.A0j(r7)     // Catch: java.lang.Throwable -> L73
                if (r0 != 0) goto L6e
                java.lang.String r0 = "application/smil"
                boolean r0 = r7.equals(r0)     // Catch: java.lang.Throwable -> L73
                if (r0 != 0) goto L6e
                java.lang.String r3 = X.C60Q.A0c(r6, r3)     // Catch: java.lang.Throwable -> L73
                if (r3 != 0) goto L67
                java.lang.String r3 = X.C60Q.A0c(r6, r4)     // Catch: java.lang.Throwable -> L73
            L67:
                com.facebook.aura.commands.sms.DeviceSmsReader r0 = com.facebook.aura.commands.sms.DeviceSmsReader.INSTANCE     // Catch: java.lang.Throwable -> L73
                com.facebook.aura.commands.sms.SmsAttachment r0 = com.facebook.aura.commands.sms.DeviceSmsReader.access$attachmentOf(r0, r1, r7, r3)     // Catch: java.lang.Throwable -> L73
                goto L6f
            L6e:
                r0 = r13
            L6f:
                r6.close()     // Catch: java.lang.Exception -> L7b
                return r0
            L73:
                r1 = move-exception
                throw r1     // Catch: java.lang.Throwable -> L75
            L75:
                r0 = move-exception
                X.AbstractC7531Ezs.A00(r6, r1)     // Catch: java.lang.Exception -> L7b
                throw r0     // Catch: java.lang.Exception -> L7b
            L7a:
                return r13
            L7b:
                r0 = move-exception
                long r3 = r14.$partId
                java.lang.String r2 = r0.getMessage()
                java.lang.String r1 = "Failed to read MMS part "
                java.lang.String r0 = ": "
                java.lang.String r0 = X.FGI.A0L(r1, r3, r0, r2)
                X.CFK.A06(r5, r0)
                return r13
            L8e:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.sms.DeviceSmsReader.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super SmsAttachment> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final String attachmentFilename(String str, long j, String str2) {
        String strA0B;
        if (str != null && (strA0B = AnonymousClass002.A0l(str)) != null && strA0B.length() > 0) {
            if (!C7BY.A0k(strA0B, '.')) {
            }
            return strA0B;
        }
        strA0B = null;
        String strExtensionForMime = extensionForMime(str2);
        if (strA0B == null) {
            strA0B = FGI.A0B(j, "mms_part_");
        }
        if (strExtensionForMime.length() != 0) {
            return FGI.A0U(strA0B, ".", strExtensionForMime);
        }
        return strA0B;
    }

    private final String smsDirection(int i) {
        return i == 1 ? CanonicalSmsMessage.DIRECTION_INBOUND : CanonicalSmsMessage.DIRECTION_OUTBOUND;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SmsAttachment attachmentOf(long j, String str, String str2) {
        return new SmsAttachment(FGI.A0B(j, DeviceSmsReaderKt.ATTACHMENT_ID_PREFIX), categorizeAttachment(str), str, attachmentFilename(str2, j, str), FGI.A0B(j, "content://mms/part/"), null);
    }

    private final String categorizeAttachment(String str) {
        return C60O.A1X(str, "image/") ? "image" : str.startsWith("video/") ? "video" : str.startsWith("audio/") ? "audio" : ("text/x-vcard".equals(str) || "text/vcard".equals(str)) ? "contact" : str.startsWith("text/") ? "text" : DeviceSmsReaderKt.ATTACHMENT_OTHER;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:4:0x001b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String extensionForMime(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 47
            java.lang.String r2 = ""
            java.lang.String r0 = X.C7BY.A0Q(r6, r2, r0)
            java.lang.String r6 = X.AnonymousClass001.A0u(r0)
            int r0 = r6.hashCode()
            java.lang.String r5 = "wav"
            java.lang.String r4 = "ogg"
            java.lang.String r3 = "mp3"
            java.lang.String r1 = "m4a"
            switch(r0) {
                case 96323: goto L1c;
                case 96710: goto L1f;
                case 102340: goto L22;
                case 106458: goto L5c;
                case 108272: goto L25;
                case 108273: goto L2a;
                case 109967: goto L2d;
                case 111145: goto L32;
                case 117484: goto L35;
                case 1621908: goto L3a;
                case 3268712: goto L3d;
                case 3358085: goto L48;
                case 3418175: goto L51;
                case 3645340: goto L5a;
                case 50279198: goto L61;
                case 112269573: goto L6c;
                case 112280599: goto L75;
                default: goto L1b;
            }
        L1b:
            return r2
        L1c:
            java.lang.String r1 = "aac"
            goto L5c
        L1f:
            java.lang.String r1 = "amr"
            goto L5c
        L22:
            java.lang.String r1 = "gif"
            goto L5c
        L25:
            boolean r0 = r6.equals(r3)
            goto L4e
        L2a:
            java.lang.String r0 = "mp4"
            goto L6e
        L2d:
            boolean r0 = r6.equals(r4)
            goto L57
        L32:
            java.lang.String r1 = "png"
            goto L5c
        L35:
            boolean r0 = r6.equals(r5)
            goto L7b
        L3a:
            java.lang.String r0 = "3gpp"
            goto L63
        L3d:
            java.lang.String r0 = "jpeg"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L1b
            java.lang.String r2 = "jpg"
            return r2
        L48:
            java.lang.String r0 = "mpeg"
            boolean r0 = r6.equals(r0)
        L4e:
            if (r0 == 0) goto L1b
            return r3
        L51:
            java.lang.String r0 = "opus"
            boolean r0 = r6.equals(r0)
        L57:
            if (r0 == 0) goto L1b
            return r4
        L5a:
            java.lang.String r1 = "webp"
        L5c:
            boolean r0 = r6.equals(r1)
            goto L72
        L61:
            java.lang.String r0 = "3gpp2"
        L63:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L1b
            java.lang.String r2 = "3gp"
            return r2
        L6c:
            java.lang.String r0 = "x-m4a"
        L6e:
            boolean r0 = r6.equals(r0)
        L72:
            if (r0 == 0) goto L1b
            return r1
        L75:
            java.lang.String r0 = "x-wav"
            boolean r0 = r6.equals(r0)
        L7b:
            if (r0 == 0) goto L1b
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.sms.DeviceSmsReader.extensionForMime(java.lang.String):java.lang.String");
    }

    private final MmsAddressInfo readMmsAddresses(Context context, long j, boolean z, String str) {
        Uri uri = Uri.parse(FGI.A0J(DeviceSmsReaderKt.MMS_URI_PREFIX, j, "/addr"));
        ArrayList arrayListA0h = C3cG.A0h();
        ArrayList arrayListA0h2 = C3cG.A0h();
        try {
            Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{"address", "type"}, null, null, null);
            if (cursorQuery != null) {
                try {
                    int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("address");
                    int columnIndexOrThrow2 = cursorQuery.getColumnIndexOrThrow("type");
                    while (cursorQuery.moveToNext()) {
                        String string = cursorQuery.getString(columnIndexOrThrow);
                        if (string == null) {
                            string = "";
                        }
                        String strA0l = AnonymousClass002.A0l(string);
                        if (!C7BY.A0j(strA0l) && !DeviceSmsReaderKt.MMS_INSERT_ADDRESS_TOKEN.equals(strA0l)) {
                            String e164 = PhoneNormalizer.INSTANCE.toE164(strA0l, str);
                            String string2 = cursorQuery.getString(columnIndexOrThrow2);
                            if (string2 != null) {
                                int iHashCode = string2.hashCode();
                                if (iHashCode != 48718) {
                                    if (iHashCode != 48725) {
                                        if (iHashCode == 48781 && string2.equals(DeviceSmsReaderKt.MMS_ADDR_TYPE_TO)) {
                                            arrayListA0h2.add(e164);
                                        }
                                    } else if (string2.equals(DeviceSmsReaderKt.MMS_ADDR_TYPE_FROM)) {
                                        arrayListA0h.add(e164);
                                    }
                                } else if (string2.equals(DeviceSmsReaderKt.MMS_ADDR_TYPE_CC)) {
                                    arrayListA0h2.add(e164);
                                }
                            }
                        }
                    }
                    cursorQuery.close();
                } finally {
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
        List listA0T = AbstractC0878AGe.A0T(AbstractC0878AGe.A0P(arrayListA0h2, arrayListA0h));
        boolean z2 = C3cG.A0m(arrayListA0h2).size() > 1 || listA0T.size() > 2;
        if (!z) {
            arrayListA0h = arrayListA0h2;
        }
        List listA0m = C3cG.A0m(arrayListA0h);
        if (!z2) {
            listA0T = C0881AGi.A00;
        }
        return new MmsAddressInfo(listA0m, listA0T);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x028b  */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11, types: [int] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v3, types: [int] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [int] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v38 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<com.facebook.aura.commands.sms.CanonicalSmsMessage> readMmsMessages(android.content.Context r43, int r44, java.lang.String r45, java.lang.Long r46, java.lang.Long r47, java.util.List<java.lang.String> r48, java.lang.String r49) {
        /*
            Method dump skipped, instructions count: 727
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.sms.DeviceSmsReader.readMmsMessages(android.content.Context, int, java.lang.String, java.lang.Long, java.lang.Long, java.util.List, java.lang.String):java.util.List");
    }

    private final MmsPartInfo readMmsParts(Context context, long j) {
        Uri uri = Uri.parse("content://mms/part");
        ArrayList arrayListA0h = C3cG.A0h();
        ArrayList arrayListA0h2 = C3cG.A0h();
        try {
            Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{"_id", "ct", "text", "cl", "name"}, "mid = ?", new String[]{String.valueOf(j)}, null);
            if (cursorQuery != null) {
                try {
                    int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("_id");
                    int columnIndexOrThrow2 = cursorQuery.getColumnIndexOrThrow("ct");
                    int columnIndexOrThrow3 = cursorQuery.getColumnIndexOrThrow("text");
                    int columnIndexOrThrow4 = cursorQuery.getColumnIndexOrThrow("cl");
                    int columnIndexOrThrow5 = cursorQuery.getColumnIndexOrThrow("name");
                    while (cursorQuery.moveToNext()) {
                        String string = cursorQuery.getString(columnIndexOrThrow2);
                        if (string == null) {
                            string = "";
                        }
                        if (string.equals("text/plain")) {
                            String string2 = cursorQuery.getString(columnIndexOrThrow3);
                            if (string2 != null) {
                                C60Q.A1M(string2, arrayListA0h);
                            }
                        } else if (!C7BY.A0j(string) && !string.equals(DeviceSmsReaderKt.MMS_CT_SMIL)) {
                            long j2 = cursorQuery.getLong(columnIndexOrThrow);
                            String string3 = cursorQuery.getString(columnIndexOrThrow5);
                            if (string3 == null) {
                                string3 = cursorQuery.getString(columnIndexOrThrow4);
                            }
                            arrayListA0h2.add(INSTANCE.attachmentOf(j2, string, string3));
                        }
                    }
                    cursorQuery.close();
                } finally {
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return new MmsPartInfo(C3cH.A0e(PairsDiscretionDocument.TERMINATOR, arrayListA0h), arrayListA0h2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object readSms$default(DeviceSmsReader deviceSmsReader, Context context, int i, String str, Long l, Long l2, List list, HtJ htJ, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i2 & 4) != 0) {
            str = null;
        }
        if ((i2 & 8) != 0) {
            l = null;
        }
        if ((i2 & 16) != 0) {
            l2 = null;
        }
        if ((i2 & 32) != 0) {
            list = null;
        }
        return deviceSmsReader.readSms(context, i, str, l, l2, list, htJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0090  */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11, types: [int] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [int] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<com.facebook.aura.commands.sms.CanonicalSmsMessage> readSmsMessages(android.content.Context r37, int r38, java.lang.String r39, java.lang.Long r40, java.lang.Long r41, java.util.List<java.lang.String> r42, java.lang.String r43) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.sms.DeviceSmsReader.readSmsMessages(android.content.Context, int, java.lang.String, java.lang.Long, java.lang.Long, java.util.List, java.lang.String):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readSms(android.content.Context r14, int r15, java.lang.String r16, java.lang.Long r17, java.lang.Long r18, java.util.List<java.lang.String> r19, X.HtJ<? super com.facebook.aura.commands.sms.CanonicalSmsPayload> r20) {
        /*
            r13 = this;
            java.lang.String r0 = "android.permission.READ_SMS"
            r6 = r14
            int r0 = r14.checkSelfPermission(r0)
            if (r0 == 0) goto L17
            long r2 = java.lang.System.currentTimeMillis()
            X.AGi r1 = X.C0881AGi.A00
            java.lang.String r0 = "android"
            com.facebook.aura.commands.sms.CanonicalSmsPayload r4 = new com.facebook.aura.commands.sms.CanonicalSmsPayload
            r4.<init>(r0, r2, r1)
            return r4
        L17:
            r3 = 0
            if (r19 == 0) goto L39
            java.util.ArrayList r11 = X.C3cG.A0h()
            java.util.Iterator r2 = r19.iterator()
        L22:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L33
            java.lang.Object r1 = r2.next()
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
            X.AnonymousClass006.A1F(r0, r1, r11)
            goto L22
        L33:
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L3a
        L39:
            r11 = r3
        L3a:
            com.facebook.aura.commands.sms.PhoneNormalizer r0 = com.facebook.aura.commands.sms.PhoneNormalizer.INSTANCE
            java.lang.String r12 = r0.defaultRegion(r14)
            r5 = r13
            r7 = r15
            r8 = r16
            r9 = r17
            r10 = r18
            java.util.List r4 = r5.readSmsMessages(r6, r7, r8, r9, r10, r11, r12)
            java.util.List r2 = r5.readMmsMessages(r6, r7, r8, r9, r10, r11, r12)
            java.util.ArrayList r1 = X.AbstractC0878AGe.A0P(r2, r4)
            com.facebook.aura.commands.sms.DeviceSmsReader$readSms$$inlined$sortedByDescending$1 r0 = new com.facebook.aura.commands.sms.DeviceSmsReader$readSms$$inlined$sortedByDescending$1
            r0.<init>()
            java.util.List r3 = X.AbstractC0878AGe.A0c(r1, r0)
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r15 == r0) goto L66
            java.util.List r3 = X.AbstractC0878AGe.A0a(r3, r15)
        L66:
            r4.size()
            r2.size()
            r3.size()
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = "android"
            com.facebook.aura.commands.sms.CanonicalSmsPayload r4 = new com.facebook.aura.commands.sms.CanonicalSmsPayload
            r4.<init>(r0, r1, r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.sms.DeviceSmsReader.readSms(android.content.Context, int, java.lang.String, java.lang.Long, java.lang.Long, java.util.List, X.HtJ):java.lang.Object");
    }

    public final Object readAttachmentByPartId(Context context, long j, HtJ<? super SmsAttachment> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(context, j, null));
    }
}

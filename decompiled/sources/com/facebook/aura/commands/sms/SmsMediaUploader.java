package com.facebook.aura.commands.sms;

import X.AnonymousClass002;
import X.AnonymousClass004;
import X.C7384Etj;
import X.HtJ;
import X.HzP;
import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class SmsMediaUploader {
    public static final SmsMediaUploader INSTANCE = new SmsMediaUploader();
    public static final String REASON_TOO_LARGE = "too_large";
    public static final String REASON_UNREADABLE = "unreadable";
    public static final String REASON_UPLOAD_FAILED = "upload_failed";

    public interface UploadOutcome {

        public final class Skipped implements UploadOutcome {
            public final String reason;

            public Skipped(String str) {
                C7384Etj.A0Y(str, 0);
                this.reason = str;
            }

            public final String getReason() {
                return this.reason;
            }
        }

        public final class Uploaded implements UploadOutcome {
            public final SmsAttachment attachment;

            public Uploaded(SmsAttachment smsAttachment) {
                C7384Etj.A0Y(smsAttachment, 0);
                this.attachment = smsAttachment;
            }

            public final SmsAttachment getAttachment() {
                return this.attachment;
            }
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.sms.SmsMediaUploader", f = "SmsMediaUploader.kt", l = {74, 88}, m = "upload", v = 2)
    /* renamed from: com.facebook.aura.commands.sms.SmsMediaUploader$upload$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SmsMediaUploader.this.upload(null, null, null, 0L, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x013c: RETURN (r1 I:java.lang.Object) (LINE:316), block:B:46:0x013c */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f7 A[Catch: all -> 0x0142, TryCatch #1 {all -> 0x0142, blocks: (B:35:0x00ee, B:36:0x00f1, B:38:0x00f7, B:39:0x0120, B:41:0x0124, B:47:0x013d, B:48:0x0141, B:32:0x00dd), top: B:63:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0120 A[Catch: all -> 0x0142, TryCatch #1 {all -> 0x0142, blocks: (B:35:0x00ee, B:36:0x00f1, B:38:0x00f7, B:39:0x0120, B:41:0x0124, B:47:0x013d, B:48:0x0141, B:32:0x00dd), top: B:63:0x002a }] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object upload(android.content.Context r16, com.facebook.aura.commands.sms.SmsAttachment r17, X.AbstractC3358CGz r18, long r19, X.HtJ<? super com.facebook.aura.commands.sms.SmsMediaUploader.UploadOutcome> r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.sms.SmsMediaUploader.upload(android.content.Context, com.facebook.aura.commands.sms.SmsAttachment, X.CGz, long, X.HtJ):java.lang.Object");
    }

    public final List<CanonicalSmsMessage> withUploadedPaths(Context context, List<CanonicalSmsMessage> list) {
        SmsAttachment smsAttachmentCopy;
        boolean zA1b = AnonymousClass004.A1b(context, list);
        ArrayList arrayListA0m = AnonymousClass002.A0m(list);
        for (CanonicalSmsMessage canonicalSmsMessageCopy$default : list) {
            List<SmsAttachment> list2 = canonicalSmsMessageCopy$default.attachments;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<SmsAttachment> it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (it.next().uploadedPath == null) {
                        List<SmsAttachment> list3 = canonicalSmsMessageCopy$default.attachments;
                        ArrayList arrayListA0m2 = AnonymousClass002.A0m(list3);
                        for (SmsAttachment smsAttachment : list3) {
                            if (smsAttachment.uploadedPath != null) {
                                smsAttachmentCopy = smsAttachment;
                            } else {
                                String strUploadedMediaPath = SmsMediaUploadStoreKt.uploadedMediaPath(context, smsAttachment.partUri);
                                if (strUploadedMediaPath == null || (smsAttachmentCopy = smsAttachment.copy(smsAttachment.attachmentId, smsAttachment.type, smsAttachment.mimeType, smsAttachment.filename, smsAttachment.partUri, strUploadedMediaPath)) == null) {
                                }
                                arrayListA0m2.add(smsAttachment);
                            }
                            smsAttachment = smsAttachmentCopy;
                            arrayListA0m2.add(smsAttachment);
                        }
                        canonicalSmsMessageCopy$default = CanonicalSmsMessage.copy$default(canonicalSmsMessageCopy$default, null, null, null, null, 0L, null, null, zA1b, null, zA1b ? 1 : 0, null, null, arrayListA0m2, 4095, null);
                    }
                }
            }
            arrayListA0m.add(canonicalSmsMessageCopy$default);
        }
        return arrayListA0m;
    }
}

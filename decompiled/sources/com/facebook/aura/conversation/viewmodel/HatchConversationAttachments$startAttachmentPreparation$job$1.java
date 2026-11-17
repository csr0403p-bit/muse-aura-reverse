package com.facebook.aura.conversation.viewmodel;

import X.AbstractC07127nr;
import X.C3UX;
import X.G0V;
import X.HsJ;
import X.HtJ;
import android.net.Uri;
import com.facebook.aura.accountcenter.MC;
import com.facebook.aura.composer.upload.AttachmentCategory;
import com.facebook.aura.composer.upload.HatchAttachmentUploader;
import com.facebook.aura.composer.upload.UploadLogAttachment;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationAttachments$startAttachmentPreparation$job$1", f = "HatchConversationAttachments.kt", l = {618, MC.mwa_accounts_center_3p_link.__CONFIG__, 420, 422, 446, 450}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class HatchConversationAttachments$startAttachmentPreparation$job$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HsJ<? extends Unit>>, Object> {
    public final /* synthetic */ AttachmentCategory $category;
    public final /* synthetic */ String $gatewayPath;
    public final /* synthetic */ UploadLogAttachment $logAttachment;
    public final /* synthetic */ long $maxSizeBytes;
    public final /* synthetic */ Uri $parsedUri;
    public final /* synthetic */ HatchAttachmentUploader $uploader;
    public final /* synthetic */ String $uri;
    public long J$0;
    public long J$1;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$10;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public Object L$7;
    public Object L$8;
    public Object L$9;
    public int label;
    public final /* synthetic */ HatchConversationAttachments this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationAttachments$startAttachmentPreparation$job$1(AttachmentCategory attachmentCategory, HatchConversationAttachments hatchConversationAttachments, String str, Uri uri, long j, UploadLogAttachment uploadLogAttachment, HatchAttachmentUploader hatchAttachmentUploader, String str2, HtJ<? super HatchConversationAttachments$startAttachmentPreparation$job$1> htJ) {
        super(2, htJ);
        this.$category = attachmentCategory;
        this.this$0 = hatchConversationAttachments;
        this.$uri = str;
        this.$parsedUri = uri;
        this.$maxSizeBytes = j;
        this.$logAttachment = uploadLogAttachment;
        this.$uploader = hatchAttachmentUploader;
        this.$gatewayPath = str2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        HatchConversationAttachments$startAttachmentPreparation$job$1 hatchConversationAttachments$startAttachmentPreparation$job$1 = new HatchConversationAttachments$startAttachmentPreparation$job$1(this.$category, this.this$0, this.$uri, this.$parsedUri, this.$maxSizeBytes, this.$logAttachment, this.$uploader, this.$gatewayPath, htJ);
        hatchConversationAttachments$startAttachmentPreparation$job$1.L$0 = obj;
        return hatchConversationAttachments$startAttachmentPreparation$job$1;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x02d3: IGET (r0 I:T) = (r1 I:X.Hqv) A[Catch: all -> 0x02db] (LINE:723) X.Hqv.element java.lang.Object, block:B:91:0x02d1 */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x02d7: INVOKE 
  (r2v1 ?? I:com.facebook.aura.conversation.viewmodel.AttachmentUploadAnalytics)
  (r4 I:com.facebook.aura.composer.upload.UploadLogAttachment)
  (r0 I:com.facebook.aura.conversation.viewmodel.UploadStage)
 VIRTUAL call: com.facebook.aura.conversation.viewmodel.AttachmentUploadAnalytics.importFailed(com.facebook.aura.composer.upload.UploadLogAttachment, com.facebook.aura.conversation.viewmodel.UploadStage):void A[Catch: all -> 0x02db, MD:(com.facebook.aura.composer.upload.UploadLogAttachment, com.facebook.aura.conversation.viewmodel.UploadStage):void (m)] (LINE:727), block:B:91:0x02d1 */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x019c: INVOKE (r8 I:X.BLa), (r0 I:java.lang.Object) INTERFACE call: X.BLa.Ahe(java.lang.Object):void A[Catch: all -> 0x02cd, AttachmentTooLargeException | CancellationException -> 0x02cf, AttachmentTooLargeException | CancellationException -> 0x02cf, MD:(java.lang.Object):void (m), TRY_ENTER] (LINE:412), block:B:41:0x019c */
    /* JADX WARN: Removed duplicated region for block: B:23:0x011d A[Catch: all -> 0x019a, TryCatch #3 {all -> 0x019a, blocks: (B:26:0x014a, B:27:0x014d, B:21:0x0112, B:23:0x011d, B:28:0x0150), top: B:97:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0150 A[Catch: all -> 0x019a, TryCatch #3 {all -> 0x019a, blocks: (B:26:0x014a, B:27:0x014d, B:21:0x0112, B:23:0x011d, B:28:0x0150), top: B:97:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0167 A[Catch: all -> 0x02cd, AttachmentTooLargeException | CancellationException -> 0x02cf, AttachmentTooLargeException | CancellationException -> 0x02cf, TryCatch #6 {all -> 0x02cd, blocks: (B:46:0x01c8, B:47:0x01cb, B:35:0x018f, B:36:0x0192, B:30:0x0162, B:32:0x0167, B:37:0x0195, B:38:0x0199, B:13:0x00c6, B:41:0x019c, B:42:0x019f, B:16:0x00e5, B:18:0x00e9, B:43:0x01a0), top: B:97:0x000c, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0195 A[Catch: all -> 0x02cd, AttachmentTooLargeException | CancellationException -> 0x02cf, AttachmentTooLargeException | CancellationException -> 0x02cf, TryCatch #6 {all -> 0x02cd, blocks: (B:46:0x01c8, B:47:0x01cb, B:35:0x018f, B:36:0x0192, B:30:0x0162, B:32:0x0167, B:37:0x0195, B:38:0x0199, B:13:0x00c6, B:41:0x019c, B:42:0x019f, B:16:0x00e5, B:18:0x00e9, B:43:0x01a0), top: B:97:0x000c, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01d7 A[Catch: all -> 0x02db, TryCatch #5 {all -> 0x02db, blocks: (B:74:0x02b1, B:73:0x02ae, B:92:0x02da, B:86:0x02c9, B:48:0x01cd, B:50:0x01d7, B:52:0x01db, B:53:0x0202, B:91:0x02d1, B:15:0x00dd, B:84:0x02c4, B:46:0x01c8, B:47:0x01cb, B:35:0x018f, B:36:0x0192, B:30:0x0162, B:32:0x0167, B:37:0x0195, B:38:0x0199, B:13:0x00c6, B:41:0x019c, B:42:0x019f, B:16:0x00e5, B:18:0x00e9, B:43:0x01a0, B:71:0x02a9), top: B:97:0x000c, inners: #2, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0249 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x024e A[Catch: all -> 0x02b6, CancellationException -> 0x02b9, TryCatch #10 {CancellationException -> 0x02b9, all -> 0x02b6, blocks: (B:57:0x024a, B:59:0x024e, B:54:0x021d), top: B:103:0x021d }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x028c A[Catch: CancellationException -> 0x02b4, all -> 0x02c3, TryCatch #0 {all -> 0x02c3, blocks: (B:63:0x027f, B:64:0x0286, B:66:0x028c, B:67:0x0299, B:69:0x029f, B:70:0x02a6, B:8:0x0044, B:81:0x02bb, B:82:0x02c2), top: B:97:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x029f A[Catch: CancellationException -> 0x02b4, all -> 0x02c3, TryCatch #0 {all -> 0x02c3, blocks: (B:63:0x027f, B:64:0x0286, B:66:0x028c, B:67:0x0299, B:69:0x029f, B:70:0x02a6, B:8:0x0044, B:81:0x02bb, B:82:0x02c2), top: B:97:0x000c }] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r15v4, types: [T, com.facebook.aura.conversation.viewmodel.UploadStage] */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.Hqv] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [T, com.facebook.aura.conversation.viewmodel.UploadStage] */
    /* JADX WARN: Type inference failed for: r8v11, types: [T, com.facebook.aura.conversation.viewmodel.UploadStage] */
    /* JADX WARN: Type inference failed for: r8v5, types: [T, com.facebook.aura.conversation.viewmodel.UploadStage] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 760
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.viewmodel.HatchConversationAttachments$startAttachmentPreparation$job$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super HsJ<Unit>> htJ) {
        return ((HatchConversationAttachments$startAttachmentPreparation$job$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super HsJ<? extends Unit>> htJ) {
        return invoke2(c3ux, (HtJ<? super HsJ<Unit>>) htJ);
    }
}

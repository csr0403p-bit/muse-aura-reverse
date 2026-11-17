package com.facebook.aura.conversation.repo;

import X.AbstractC3358CGz;
import X.AnonymousClass005;
import X.C3Em;
import X.HtJ;
import X.HzP;
import android.content.Context;
import com.facebook.aura.accountcenter.MC;
import com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class HatchConversationAttachmentBuilder {
    public final Context appContext;
    public final C3Em<Unit> attachmentsDropped;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchConversationAttachmentBuilder", f = "HatchConversationAttachmentBuilder.kt", l = {73, HatchIdeaShareImageRenderer.TEXT_LEFT, 165, 173, 176, 222, 224}, m = "buildAttachments", v = 2)
    /* renamed from: com.facebook.aura.conversation.repo.HatchConversationAttachmentBuilder$buildAttachments$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int I$0;
        public int I$1;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchConversationAttachmentBuilder.this.buildAttachments(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchConversationAttachmentBuilder", f = "HatchConversationAttachmentBuilder.kt", l = {258, MC.mwa_accounts_center_settings.__CONFIG__}, m = "uploadStagedFile", v = 2)
    /* renamed from: com.facebook.aura.conversation.repo.HatchConversationAttachmentBuilder$uploadStagedFile$1, reason: invalid class name and case insensitive filesystem */
    public final class C113511 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public C113511(HtJ<? super C113511> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchConversationAttachmentBuilder.this.uploadStagedFile(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object uploadStagedFile(java.io.File r13, java.lang.String r14, X.HtJ<? super java.lang.String> r15) {
        /*
            r12 = this;
            r7 = r13
            boolean r0 = r15 instanceof com.facebook.aura.conversation.repo.HatchConversationAttachmentBuilder.C113511
            if (r0 == 0) goto L98
            r11 = r15
            com.facebook.aura.conversation.repo.HatchConversationAttachmentBuilder$uploadStagedFile$1 r11 = (com.facebook.aura.conversation.repo.HatchConversationAttachmentBuilder.C113511) r11
            int r2 = r11.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L98
            int r2 = r2 - r1
            r11.label = r2
        L13:
            java.lang.Object r5 = r11.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r11.label
            r2 = 0
            r4 = 2
            r1 = 1
            if (r0 == 0) goto L2f
            if (r0 == r1) goto L54
            if (r0 != r4) goto La0
            java.lang.Object r8 = r11.L$2
            java.lang.Object r1 = X.AnonymousClass001.A0q(r5)
        L28:
            boolean r0 = r1 instanceof X.C10571Hud
            r0 = r0 ^ 1
            if (r0 == 0) goto L9f
            return r8
        L2f:
            X.Hwg.A00(r5)
            com.facebook.aura.composer.upload.HatchAttachmentStaging r0 = com.facebook.aura.composer.upload.HatchAttachmentStaging.INSTANCE
            java.lang.String r8 = r0.makeUploadPath(r14)
            com.facebook.aura.composer.upload.FileUploader r0 = com.facebook.aura.composer.upload.HatchAttachmentUploader.ComposerFileUploader
            com.facebook.aura.composer.upload.HatchAttachmentUploader r6 = new com.facebook.aura.composer.upload.HatchAttachmentUploader
            r6.<init>(r0)
            X.CGz r9 = r12.userSession
            r11.L$0 = r13
            r11.L$1 = r2
            r11.L$2 = r8
            r11.L$3 = r6
            r11.label = r1
            com.facebook.aura.composer.upload.HatchAttachmentUploader$upload$2 r10 = com.facebook.aura.composer.upload.HatchAttachmentUploader$upload$2.INSTANCE
            java.lang.Object r1 = r6.m427uploadyxL6bBk(r7, r8, r9, r10, r11)
            if (r1 != r3) goto L64
            return r3
        L54:
            java.lang.Object r6 = r11.L$3
            com.facebook.aura.composer.upload.HatchAttachmentUploader r6 = (com.facebook.aura.composer.upload.HatchAttachmentUploader) r6
            java.lang.Object r8 = r11.L$2
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r11.L$0
            java.io.File r7 = (java.io.File) r7
            java.lang.Object r1 = X.AnonymousClass001.A0q(r5)
        L64:
            boolean r0 = r1 instanceof X.C10571Hud
            if (r0 == 0) goto L28
            java.lang.Throwable r0 = X.HsJ.A00(r1)
            if (r0 == 0) goto L96
            java.lang.String r1 = r0.getMessage()
        L72:
            java.lang.String r0 = "File upload failed, retrying once: "
            java.lang.String r1 = X.FGI.A0M(r0, r1)
            java.lang.String r0 = "HatchConversationRepository"
            X.CFK.A06(r0, r1)
            X.CGz r9 = r12.userSession
            r11.L$0 = r2
            r11.L$1 = r2
            r11.L$2 = r8
            r11.L$3 = r2
            r11.L$4 = r2
            r11.label = r4
            com.facebook.aura.composer.upload.HatchAttachmentUploader$Companion r0 = com.facebook.aura.composer.upload.HatchAttachmentUploader.Companion
            com.facebook.aura.composer.upload.HatchAttachmentUploader$upload$2 r10 = com.facebook.aura.composer.upload.HatchAttachmentUploader$upload$2.INSTANCE
            java.lang.Object r1 = r6.m427uploadyxL6bBk(r7, r8, r9, r10, r11)
            if (r1 != r3) goto L28
            return r3
        L96:
            r1 = r2
            goto L72
        L98:
            com.facebook.aura.conversation.repo.HatchConversationAttachmentBuilder$uploadStagedFile$1 r11 = new com.facebook.aura.conversation.repo.HatchConversationAttachmentBuilder$uploadStagedFile$1
            r11.<init>(r15)
            goto L13
        L9f:
            return r2
        La0:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.repo.HatchConversationAttachmentBuilder.uploadStagedFile(java.io.File, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:201|64|(13:66|(1:68)|183|72|(2:74|120)|76|86|(2:88|122)|90|(1:97)(3:92|(1:94)(1:96)|95)|(2:175|106)|204|(1:53))|69|187|70|183|72|(0)|76|86|(0)|90|(0)(0)|(0)|204|(1:53)) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:47|(2:49|119)|17|18|(2:20|118)|22|179|23|(1:27)(1:28)) */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x037e, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:?, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00e9, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0249, code lost:
    
        r12 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0280, code lost:
    
        r1 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0285, code lost:
    
        r17 = com.facebook.aura.composer.upload.HatchAttachmentStaging.INSTANCE;
        r11 = r25.appContext;
        X.C7384Etj.A0X(r9);
        r0.L$0 = r4;
        X.C60Q.A17(r0, r3, r2, r6, r5);
        r0.L$5 = null;
        r0.L$6 = r9;
        r0.L$7 = null;
        r0.L$8 = null;
        r0.L$9 = null;
        r0.I$0 = r8;
        r0.label = 4;
        r1 = r17.stage(r11, r9, com.facebook.aura.devices.pairing.LinkEncryptedPairingKt.LINK_COUNTER_MAX, r0);
        r3 = r3;
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x02b0, code lost:
    
        if (r1 == r10) goto L83;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0346: IF  (r11 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:205:? (LINE:838), block:B:113:0x0346 */
    /* JADX WARN: Path cross not found for [B:66:0x0236, B:69:0x0243], limit reached: 204 */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03eb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03fb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x040e A[Catch: Exception -> 0x0431, PHI: r1 r2 r3 r6 r8
  0x040e: PHI (r1v30 java.lang.String) = (r1v32 java.lang.String), (r1v32 java.lang.String), (r1v57 java.lang.String) binds: [B:153:0x03f9, B:154:0x03fb, B:161:0x040d] A[DONT_GENERATE, DONT_INLINE]
  0x040e: PHI (r2v21 java.util.List) = (r2v22 java.util.List), (r2v22 java.util.List), (r2v31 java.util.List) binds: [B:153:0x03f9, B:154:0x03fb, B:161:0x040d] A[DONT_GENERATE, DONT_INLINE]
  0x040e: PHI (r3v25 java.util.List) = (r3v26 java.util.List), (r3v26 java.util.List), (r3v35 java.util.List) binds: [B:153:0x03f9, B:154:0x03fb, B:161:0x040d] A[DONT_GENERATE, DONT_INLINE]
  0x040e: PHI (r6v18 java.lang.String) = (r6v19 java.lang.String), (r6v19 java.lang.String), (r6v29 java.lang.String) binds: [B:153:0x03f9, B:154:0x03fb, B:161:0x040d] A[DONT_GENERATE, DONT_INLINE]
  0x040e: PHI (r8v17 com.facebook.aura.model.PendingDiscussionItem) = 
  (r8v18 com.facebook.aura.model.PendingDiscussionItem)
  (r8v18 com.facebook.aura.model.PendingDiscussionItem)
  (r8v25 com.facebook.aura.model.PendingDiscussionItem)
 binds: [B:153:0x03f9, B:154:0x03fb, B:161:0x040d] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #13 {Exception -> 0x0431, blocks: (B:136:0x039f, B:138:0x03a5, B:140:0x03b2, B:144:0x03d3, B:155:0x03fd, B:162:0x040e, B:152:0x03f6, B:160:0x040c, B:159:0x0409, B:143:0x03d0, B:145:0x03d7, B:149:0x03ef, B:148:0x03ec, B:157:0x0404, B:150:0x03f1), top: B:171:0x0022, inners: #4, #10, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x033b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:206:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ef A[Catch: Exception -> 0x0125, CancellationException -> 0x0440, TryCatch #22 {CancellationException -> 0x0440, Exception -> 0x0125, blocks: (B:27:0x00ef, B:41:0x0151, B:43:0x0163, B:44:0x0182, B:46:0x019b, B:47:0x01a1, B:17:0x00c0, B:33:0x0124, B:32:0x0121, B:28:0x00fa, B:25:0x00ea, B:16:0x00bd), top: B:193:0x00bd }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00fa A[Catch: Exception -> 0x0125, CancellationException -> 0x0440, TRY_LEAVE, TryCatch #22 {CancellationException -> 0x0440, Exception -> 0x0125, blocks: (B:27:0x00ef, B:41:0x0151, B:43:0x0163, B:44:0x0182, B:46:0x019b, B:47:0x01a1, B:17:0x00c0, B:33:0x0124, B:32:0x0121, B:28:0x00fa, B:25:0x00ea, B:16:0x00bd), top: B:193:0x00bd }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0285 A[Catch: Exception -> 0x0329, CancellationException -> 0x0342, all -> 0x0380, TRY_ENTER, TryCatch #1 {, blocks: (B:64:0x0226, B:66:0x0236, B:72:0x024a, B:76:0x027c, B:81:0x0285, B:85:0x02b7, B:101:0x0328, B:70:0x0244, B:84:0x02b4, B:75:0x0279), top: B:171:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02e9 A[Catch: Exception -> 0x0325, CancellationException -> 0x0340, all -> 0x0345, TryCatch #6 {all -> 0x0345, blocks: (B:89:0x02e2, B:90:0x02e5, B:92:0x02e9, B:94:0x02f5, B:95:0x02f7, B:86:0x02ba, B:104:0x032b, B:111:0x0344, B:97:0x031a), top: B:171:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x031a A[Catch: Exception -> 0x0325, CancellationException -> 0x0340, all -> 0x0345, TRY_LEAVE, TryCatch #6 {all -> 0x0345, blocks: (B:89:0x02e2, B:90:0x02e5, B:92:0x02e9, B:94:0x02f5, B:95:0x02f7, B:86:0x02ba, B:104:0x032b, B:111:0x0344, B:97:0x031a), top: B:171:0x0022 }] */
    /* JADX WARN: Type inference failed for: r17v5, types: [com.facebook.aura.composer.upload.HatchAttachmentStaging] */
    /* JADX WARN: Type inference failed for: r19v5, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r25v0, types: [com.facebook.aura.conversation.repo.HatchConversationAttachmentBuilder] */
    /* JADX WARN: Type inference failed for: r3v40, types: [int] */
    /* JADX WARN: Type inference failed for: r3v41, types: [int] */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.facebook.aura.model.HatchSendMessage] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00dc -> B:22:0x00e3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0163 -> B:36:0x0134). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x019b -> B:36:0x0134). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:87:0x02de -> B:90:0x02e5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object buildAttachments(com.facebook.aura.model.HatchSendMessage r26, X.HtJ<? super java.util.List<com.facebook.aura.model.HatchAttachment>> r27) {
        /*
            Method dump skipped, instructions count: 1110
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.repo.HatchConversationAttachmentBuilder.buildAttachments(com.facebook.aura.model.HatchSendMessage, X.HtJ):java.lang.Object");
    }

    public HatchConversationAttachmentBuilder(Context context, AbstractC3358CGz abstractC3358CGz, C3Em<Unit> c3Em) {
        AnonymousClass005.A0x(context, abstractC3358CGz, c3Em);
        this.appContext = context;
        this.userSession = abstractC3358CGz;
        this.attachmentsDropped = c3Em;
    }
}

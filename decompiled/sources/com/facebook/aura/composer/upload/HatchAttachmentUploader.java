package com.facebook.aura.composer.upload;

import X.AGH;
import X.AbstractC3358CGz;
import X.AnonymousClass006;
import X.C06H;
import X.C7384Etj;
import X.G0U;
import X.HtJ;
import com.facebook.aura.gateway.HatchFileOperations;
import java.io.File;
import java.util.Map;

/* loaded from: classes3.dex */
public final class HatchAttachmentUploader {
    public static final String TAG = "HatchAttachmentUploader";
    public final FileUploader fileUploader;
    public static final Companion Companion = new Companion();
    public static final Map<String, String> OPTIMISTIC_UPLOAD_FORM_FIELDS = AnonymousClass006.A10("optimistic_upload_for_send", "true");
    public static final FileUploader DefaultFileUploader = new FileUploader() { // from class: com.facebook.aura.composer.upload.HatchAttachmentUploader$Companion$DefaultFileUploader$1
        @Override // com.facebook.aura.composer.upload.FileUploader
        public final Object uploadFile(String str, File file, AbstractC3358CGz abstractC3358CGz, HtJ<? super HatchFileOperations.WriteResult> htJ) {
            return HatchFileOperations.INSTANCE.uploadFile(str, file, abstractC3358CGz, AGH.A0E(), htJ);
        }
    };
    public static final FileUploader ComposerFileUploader = new FileUploader() { // from class: com.facebook.aura.composer.upload.HatchAttachmentUploader$Companion$ComposerFileUploader$1
        @Override // com.facebook.aura.composer.upload.FileUploader
        public final Object uploadFile(String str, File file, AbstractC3358CGz abstractC3358CGz, HtJ<? super HatchFileOperations.WriteResult> htJ) {
            return HatchFileOperations.INSTANCE.uploadFile(str, file, abstractC3358CGz, HatchAttachmentUploader.OPTIMISTIC_UPLOAD_FORM_FIELDS, htJ);
        }
    };

    public final class Companion {
        public final FileUploader getComposerFileUploader() {
            return HatchAttachmentUploader.ComposerFileUploader;
        }

        public final FileUploader getDefaultFileUploader() {
            return HatchAttachmentUploader.DefaultFileUploader;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public /* synthetic */ HatchAttachmentUploader(FileUploader fileUploader, int i, C06H c06h) {
        this((i & 1) != 0 ? DefaultFileUploader : fileUploader);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: upload-yxL6bBk$default, reason: not valid java name */
    public static /* synthetic */ Object m426uploadyxL6bBk$default(HatchAttachmentUploader hatchAttachmentUploader, File file, String str, AbstractC3358CGz abstractC3358CGz, G0U g0u, HtJ htJ, int i, Object obj) {
        if ((i & 8) != 0) {
            g0u = HatchAttachmentUploader$upload$2.INSTANCE;
        }
        return hatchAttachmentUploader.m427uploadyxL6bBk(file, str, abstractC3358CGz, g0u, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* renamed from: upload-yxL6bBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m427uploadyxL6bBk(java.io.File r14, java.lang.String r15, X.AbstractC3358CGz r16, X.G0U<? super java.lang.Float, kotlin.Unit> r17, X.HtJ<? super X.HsJ<kotlin.Unit>> r18) {
        /*
            r13 = this;
            r4 = r17
            java.lang.String r6 = "Upload failed: "
            java.lang.String r7 = "File upload failed: "
            r3 = r18
            boolean r0 = r3 instanceof com.facebook.aura.composer.upload.HatchAttachmentUploader$upload$1
            if (r0 == 0) goto L2a
            r10 = r3
            com.facebook.aura.composer.upload.HatchAttachmentUploader$upload$1 r10 = (com.facebook.aura.composer.upload.HatchAttachmentUploader$upload$1) r10
            int r2 = r10.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2a
            int r2 = r2 - r1
            r10.label = r2
        L1a:
            java.lang.Object r8 = r10.result
            X.Hji r9 = X.EnumC10460Hji.A02
            int r0 = r10.label
            r5 = 1
            if (r0 == 0) goto L35
            if (r0 != r5) goto L30
            java.lang.Object r4 = r10.L$3
            X.G0U r4 = (X.G0U) r4
            goto L65
        L2a:
            com.facebook.aura.composer.upload.HatchAttachmentUploader$upload$1 r10 = new com.facebook.aura.composer.upload.HatchAttachmentUploader$upload$1
            r10.<init>(r13, r3)
            goto L1a
        L30:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L35:
            X.Hwg.A00(r8)
            long r2 = r14.length()
            r11 = 0
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 > 0) goto L4d
            java.lang.String r0 = "Empty or missing file"
            java.lang.IllegalArgumentException r0 = X.C60O.A0i(r0)
            X.Hud r9 = X.C3cG.A0s(r0)
            return r9
        L4d:
            com.facebook.aura.composer.upload.FileUploader r1 = r13.fileUploader     // Catch: java.lang.Throwable -> La3 java.util.concurrent.CancellationException -> La9
            r0 = 0
            r10.L$0 = r0     // Catch: java.lang.Throwable -> La3 java.util.concurrent.CancellationException -> La9
            r10.L$1 = r0     // Catch: java.lang.Throwable -> La3 java.util.concurrent.CancellationException -> La9
            r10.L$2 = r0     // Catch: java.lang.Throwable -> La3 java.util.concurrent.CancellationException -> La9
            r10.L$3 = r4     // Catch: java.lang.Throwable -> La3 java.util.concurrent.CancellationException -> La9
            r10.J$0 = r2     // Catch: java.lang.Throwable -> La3 java.util.concurrent.CancellationException -> La9
            r10.label = r5     // Catch: java.lang.Throwable -> La3 java.util.concurrent.CancellationException -> La9
            r0 = r16
            java.lang.Object r8 = r1.uploadFile(r15, r14, r0, r10)     // Catch: java.lang.Throwable -> La3 java.util.concurrent.CancellationException -> La9
            if (r8 != r9) goto L68
            return r9
        L65:
            X.Hwg.A00(r8)     // Catch: java.lang.Throwable -> La3 java.util.concurrent.CancellationException -> La9
        L68:
            com.facebook.aura.gateway.HatchFileOperations$WriteResult r8 = (com.facebook.aura.gateway.HatchFileOperations.WriteResult) r8     // Catch: java.lang.Throwable -> La3 java.util.concurrent.CancellationException -> La9
            boolean r0 = r8 instanceof com.facebook.aura.gateway.HatchFileOperations.WriteResult.Success     // Catch: java.lang.Throwable -> La3 java.util.concurrent.CancellationException -> La9
            if (r0 == 0) goto L7b
            r1 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r0 = new java.lang.Float     // Catch: java.lang.Throwable -> La3 java.util.concurrent.CancellationException -> La9
            r0.<init>(r1)     // Catch: java.lang.Throwable -> La3 java.util.concurrent.CancellationException -> La9
            r4.invoke(r0)     // Catch: java.lang.Throwable -> La3 java.util.concurrent.CancellationException -> La9
            kotlin.Unit r9 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> La3 java.util.concurrent.CancellationException -> La9
            return r9
        L7b:
            boolean r0 = r8 instanceof com.facebook.aura.gateway.HatchFileOperations.WriteResult.Failed     // Catch: java.lang.Throwable -> La3 java.util.concurrent.CancellationException -> La9
            if (r0 == 0) goto L9e
            java.lang.String r1 = "HatchAttachmentUploader"
            com.facebook.aura.gateway.HatchFileOperations$WriteResult$Failed r8 = (com.facebook.aura.gateway.HatchFileOperations.WriteResult.Failed) r8     // Catch: java.lang.Throwable -> La3 java.util.concurrent.CancellationException -> La9
            java.lang.String r0 = r8.message     // Catch: java.lang.Throwable -> La3 java.util.concurrent.CancellationException -> La9
            X.C60O.A1P(r7, r0, r1)     // Catch: java.lang.Throwable -> La3 java.util.concurrent.CancellationException -> La9
            java.lang.String r0 = r8.message     // Catch: java.lang.Throwable -> La3 java.util.concurrent.CancellationException -> La9
            java.lang.String r4 = X.FGI.A0M(r6, r0)     // Catch: java.lang.Throwable -> La3 java.util.concurrent.CancellationException -> La9
            java.lang.String r3 = r8.errorClass     // Catch: java.lang.Throwable -> La3 java.util.concurrent.CancellationException -> La9
            java.lang.Integer r2 = r8.httpStatus     // Catch: java.lang.Throwable -> La3 java.util.concurrent.CancellationException -> La9
            java.lang.String r1 = r8.code     // Catch: java.lang.Throwable -> La3 java.util.concurrent.CancellationException -> La9
            com.facebook.aura.composer.upload.AttachmentUploadException r0 = new com.facebook.aura.composer.upload.AttachmentUploadException     // Catch: java.lang.Throwable -> La3 java.util.concurrent.CancellationException -> La9
            r0.<init>(r4, r3, r2, r1)     // Catch: java.lang.Throwable -> La3 java.util.concurrent.CancellationException -> La9
            X.Hud r9 = X.C3cG.A0s(r0)     // Catch: java.lang.Throwable -> La3 java.util.concurrent.CancellationException -> La9
            return r9
        L9e:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()     // Catch: java.lang.Throwable -> La3 java.util.concurrent.CancellationException -> La9
            throw r0     // Catch: java.lang.Throwable -> La3 java.util.concurrent.CancellationException -> La9
        La3:
            r0 = move-exception
            X.Hud r0 = X.C3cG.A0s(r0)
            return r0
        La9:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.composer.upload.HatchAttachmentUploader.m427uploadyxL6bBk(java.io.File, java.lang.String, X.CGz, X.G0U, X.HtJ):java.lang.Object");
    }

    public HatchAttachmentUploader(FileUploader fileUploader) {
        C7384Etj.A0Y(fileUploader, 0);
        this.fileUploader = fileUploader;
    }

    public HatchAttachmentUploader() {
        this(DefaultFileUploader);
    }
}

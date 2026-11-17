package com.facebook.aura.sharesheet;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass007;
import X.C06H;
import X.C3UX;
import X.C60O;
import X.C7384Etj;
import X.C78W;
import X.C9tI;
import X.G0U;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import X.HzP;
import X.InterfaceC7549F2g;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Process;
import com.facebook.aura.auth.credentialmanager.MC;
import com.facebook.aura.common.coroutines.OnDuplicateCall;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.common.coroutines.SingleFlightKt;
import com.facebook.aura.file.core.HatchMimeResolver;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes4.dex */
public final class HatchShareSheetRepository implements InterfaceC7549F2g {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public static final String LINK_STICKER_ICON_FILE_NAME = "instagram-link-sticker-icon-v5.png";
    public static final int LINK_STICKER_ICON_SIZE_PX = 1024;
    public static final long MAX_SHARE_MEDIA_BYTES = 104857600;
    public static final long MAX_UPLOAD_BYTES = 41943040;
    public static final long MEDIA_DOWNLOAD_TIMEOUT_MS = 600000;
    public static final String MUTED_VIDEO_MIME = "video/mp4";
    public static final long MUTED_VIDEO_TIMEOUT_MS = 15000;
    public static final long RECIPIENTS_CACHE_TIMEOUT_MS = 86400000;
    public static final String TAG = "HatchShareSheetRepository";
    public final SingleFlight eligibilitySingleFlight;
    public final SingleFlight mediaSingleFlight;
    public final C3UX recipientSendScope;
    public final SingleFlight recipientsSingleFlight;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetRepository", f = "HatchShareSheetRepository.kt", l = {MC.frl_google_credential_manager.__CONFIG__}, m = "downloadMedia", v = 2)
    /* renamed from: com.facebook.aura.sharesheet.HatchShareSheetRepository$downloadMedia$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchShareSheetRepository.this.downloadMedia(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetRepository", f = "HatchShareSheetRepository.kt", l = {536}, m = "fetchRecipientsOnce", v = 2)
    /* renamed from: com.facebook.aura.sharesheet.HatchShareSheetRepository$fetchRecipientsOnce$1, reason: invalid class name and case insensitive filesystem */
    public final class C136791 extends HzP {
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C136791(HtJ<? super C136791> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchShareSheetRepository.this.fetchRecipientsOnce(false, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetRepository", f = "HatchShareSheetRepository.kt", l = {80}, m = "prefetchRecipients", v = 2)
    /* renamed from: com.facebook.aura.sharesheet.HatchShareSheetRepository$prefetchRecipients$1, reason: invalid class name and case insensitive filesystem */
    public final class C136801 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public C136801(HtJ<? super C136801> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchShareSheetRepository.this.prefetchRecipients(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetRepository$prepareMediaOnce$2", f = "HatchShareSheetRepository.kt", l = {397}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.sharesheet.HatchShareSheetRepository$prepareMediaOnce$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HatchPreparedShareMedia>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ String $previewUri;
        public Object L$0;
        public Object L$1;
        public int label;
        public final /* synthetic */ HatchShareSheetRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Context context, String str, HatchShareSheetRepository hatchShareSheetRepository, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$context = context;
            this.$previewUri = str;
            this.this$0 = hatchShareSheetRepository;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$context, this.$previewUri, this.this$0, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0068 A[RETURN] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                X.Hji r6 = X.EnumC10460Hji.A02
                int r0 = r7.label
                r5 = 1
                r3 = 0
                if (r0 == 0) goto L10
                if (r0 != r5) goto Lb
                goto L69
            Lb:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            L10:
                X.Hwg.A00(r8)
                android.content.Context r0 = r7.$context     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L8a
                com.facebook.aura.sharesheet.HatchShareMediaCache r4 = new com.facebook.aura.sharesheet.HatchShareMediaCache     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L8a
                r4.<init>(r0)     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L8a
                java.lang.String r0 = r7.$previewUri     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L8a
                r2 = 0
                android.net.Uri r2 = X.C7Je.A01(r0)     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L8a
            L21:
                if (r2 == 0) goto L80
                java.lang.String r0 = r2.getScheme()     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L8a
                if (r0 == 0) goto L80
                java.lang.String r1 = X.AnonymousClass001.A0u(r0)     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L8a
                int r0 = r1.hashCode()     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L8a
                switch(r0) {
                    case 3143036: goto L6f;
                    case 3213448: goto L4f;
                    case 99617003: goto L46;
                    case 951530617: goto L35;
                    default: goto L34;
                }     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L8a
            L34:
                return r3
            L35:
                java.lang.String r0 = "content"
                boolean r0 = r1.equals(r0)     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L8a
                if (r0 == 0) goto L80
                com.facebook.aura.sharesheet.HatchShareSheetRepository r1 = r7.this$0     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L8a
                android.content.Context r0 = r7.$context     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L8a
                com.facebook.aura.sharesheet.HatchPreparedShareMedia r0 = com.facebook.aura.sharesheet.HatchShareSheetRepository.access$prepareContentMedia(r1, r0, r2)     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L8a
                return r0
            L46:
                java.lang.String r0 = "https"
                boolean r0 = r1.equals(r0)     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L8a
                if (r0 != 0) goto L58
                return r3
            L4f:
                java.lang.String r0 = "http"
                boolean r0 = r1.equals(r0)     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L8a
                if (r0 != 0) goto L58
                return r3
            L58:
                com.facebook.aura.sharesheet.HatchShareSheetRepository r1 = r7.this$0     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L8a
                android.content.Context r0 = r7.$context     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L8a
                r7.L$0 = r3     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L8a
                r7.L$1 = r3     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L8a
                r7.label = r5     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L8a
                java.lang.Object r8 = com.facebook.aura.sharesheet.HatchShareSheetRepository.access$downloadMedia(r1, r0, r4, r2, r7)     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L8a
                if (r8 != r6) goto L6c
                return r6
            L69:
                X.Hwg.A00(r8)     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L8a
            L6c:
                com.facebook.aura.sharesheet.HatchPreparedShareMedia r8 = (com.facebook.aura.sharesheet.HatchPreparedShareMedia) r8     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L8a
                return r8
            L6f:
                java.lang.String r0 = "file"
                boolean r0 = r1.equals(r0)     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L8a
                if (r0 == 0) goto L80
                com.facebook.aura.sharesheet.HatchShareSheetRepository r1 = r7.this$0     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L8a
                android.content.Context r0 = r7.$context     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L8a
                com.facebook.aura.sharesheet.HatchPreparedShareMedia r0 = com.facebook.aura.sharesheet.HatchShareSheetRepository.access$prepareFileMedia(r1, r0, r4, r2)     // Catch: java.lang.Exception -> L81 java.util.concurrent.CancellationException -> L8a
                return r0
            L80:
                return r3
            L81:
                r2 = move-exception
                java.lang.String r1 = "Failed to prepare share media"
                java.lang.String r0 = "HatchShareSheetRepository"
                X.CFK.A0K(r0, r2, r1)
                return r3
            L8a:
                r0 = move-exception
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.sharesheet.HatchShareSheetRepository.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super HatchPreparedShareMedia> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetRepository$videoDurationMs$2", f = "HatchShareSheetRepository.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.sharesheet.HatchShareSheetRepository$videoDurationMs$2, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes.dex */
    public final class C136812 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Integer>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ Uri $uri;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C136812(Context context, Uri uri, HtJ<? super C136812> htJ) {
            super(2, htJ);
            this.$context = context;
            this.$uri = uri;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C136812(this.$context, this.$uri, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws IOException {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                mediaMetadataRetriever.setDataSource(this.$context, this.$uri);
                String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
                return strExtractMetadata != null ? C9tI.A0r(strExtractMetadata) : null;
            } catch (RuntimeException unused) {
                return null;
            } finally {
                mediaMetadataRetriever.release();
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Integer> htJ) {
            return ((C136812) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007c  */
    /* renamed from: uploadMedia-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m2004uploadMedia0E7RQCE(android.content.Context r12, com.facebook.aura.sharesheet.HatchPreparedShareMedia r13, X.HtJ<? super X.HsJ<java.lang.String>> r14) throws java.io.IOException {
        /*
            r11 = this;
            r3 = r14
            boolean r0 = r14 instanceof com.facebook.aura.sharesheet.HatchShareSheetRepository$uploadMedia$1
            if (r0 == 0) goto L7c
            r14 = r3
            com.facebook.aura.sharesheet.HatchShareSheetRepository$uploadMedia$1 r14 = (com.facebook.aura.sharesheet.HatchShareSheetRepository$uploadMedia$1) r14
            int r2 = r14.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7c
            int r2 = r2 - r1
            r14.label = r2
        L13:
            java.lang.Object r1 = r14.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r14.label
            r5 = 1
            if (r0 == 0) goto L29
            if (r0 != r5) goto L9e
            java.lang.Object r1 = X.AnonymousClass001.A0q(r1)
        L22:
            boolean r0 = r1 instanceof X.C10571Hud
            r0 = r0 ^ 1
            if (r0 == 0) goto L9d
            goto L82
        L29:
            X.Hwg.A00(r1)
            java.io.File r6 = r11.materializeUploadFile(r12, r13)
            if (r6 != 0) goto L39
            java.lang.String r0 = "Unable to read share media"
            X.Hud r0 = X.C8j4.A19(r0)
            return r0
        L39:
            long r8 = r6.length()
            r1 = 1
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 > 0) goto La3
            r1 = 41943041(0x2800001, double:2.07226156E-316)
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 >= 0) goto La3
            com.facebook.aura.network.http.HatchHttpApi r8 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            com.facebook.aura.sharesheet.SharingStefiPath$SharingUpload r11 = com.facebook.aura.sharesheet.SharingStefiPath.SharingUpload.INSTANCE
            java.lang.String r3 = r6.getName()
            java.lang.String r2 = r13.mimeType
            java.lang.String r1 = "file"
            com.facebook.aura.network.transport.HatchMultipartFilePart r0 = new com.facebook.aura.network.transport.HatchMultipartFilePart
            r0.<init>(r1, r3, r2, r6)
            java.util.List r13 = java.util.Collections.singletonList(r0)
            X.AGi r12 = X.C0881AGi.A00
            com.facebook.aura.sharesheet.HatchShareSheetRepository$uploadMedia-0E7RQCE$$inlined$executeStefiMultipartRequest-BWLJW6A$default$1 r9 = com.facebook.aura.sharesheet.HatchShareSheetRepository$uploadMedia0E7RQCE$$inlined$executeStefiMultipartRequestBWLJW6A$default$1.INSTANCE
            r0 = 0
            r14.L$0 = r0
            r14.L$1 = r0
            r14.L$2 = r0
            r14.L$3 = r0
            r14.L$4 = r0
            r14.L$5 = r0
            r14.L$6 = r0
            r14.label = r5
            r10 = 0
            java.lang.Object r1 = r8.m1601executeStefiMultipartRequestWithhUnOzRk(r9, r10, r11, r12, r13, r14)
            if (r1 != r4) goto L22
            return r4
        L7c:
            com.facebook.aura.sharesheet.HatchShareSheetRepository$uploadMedia$1 r14 = new com.facebook.aura.sharesheet.HatchShareSheetRepository$uploadMedia$1
            r14.<init>(r11, r3)
            goto L13
        L82:
            com.facebook.aura.sharesheet.ShareUploadResponseJson r1 = (com.facebook.aura.sharesheet.ShareUploadResponseJson) r1     // Catch: java.lang.Throwable -> L97
            java.lang.String r1 = r1.upload_id     // Catch: java.lang.Throwable -> L97
            boolean r0 = X.C7BY.A0j(r1)     // Catch: java.lang.Throwable -> L97
            if (r0 == 0) goto L8d
            r1 = 0
        L8d:
            if (r1 != 0) goto L9c
            java.lang.String r1 = "Sharesheet upload response omitted upload_id"
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L97
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L97
            throw r0     // Catch: java.lang.Throwable -> L97
        L97:
            r0 = move-exception
            X.Hud r1 = X.C3cG.A0s(r0)
        L9c:
            return r1
        L9d:
            return r1
        L9e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        La3:
            java.lang.String r0 = "Share media exceeds the upload size limit"
            X.Hud r0 = X.C8j4.A19(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.sharesheet.HatchShareSheetRepository.m2004uploadMedia0E7RQCE(android.content.Context, com.facebook.aura.sharesheet.HatchPreparedShareMedia, X.HtJ):java.lang.Object");
    }

    public final void launchRecipientSend$fbandroid_express_aura_java_com_facebook_aura_sharesheet_sharesheet(G0U<? super HtJ<? super Unit>, ? extends Object> g0u) {
        C7384Etj.A0Y(g0u, 0);
        AnonymousClass001.A1J(new HatchShareSheetRepository$launchRecipientSend$1(g0u, null), this.recipientSendScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0119, code lost:
    
        if (r4 == null) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0040  */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.facebook.aura.sharesheet.HatchShareMediaCache] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r4v20, types: [int] */
    /* JADX WARN: Type inference failed for: r4v21, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object downloadMedia(android.content.Context r20, com.facebook.aura.sharesheet.HatchShareMediaCache r21, android.net.Uri r22, X.HtJ<? super com.facebook.aura.sharesheet.HatchPreparedShareMedia> r23) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.sharesheet.HatchShareSheetRepository.downloadMedia(android.content.Context, com.facebook.aura.sharesheet.HatchShareMediaCache, android.net.Uri, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchRecipientsOnce(boolean r8, X.HtJ<? super java.util.List<com.facebook.aura.sharesheet.HatchShareRecipient>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.sharesheet.HatchShareSheetRepository.C136791
            if (r0 == 0) goto L75
            r6 = r9
            com.facebook.aura.sharesheet.HatchShareSheetRepository$fetchRecipientsOnce$1 r6 = (com.facebook.aura.sharesheet.HatchShareSheetRepository.C136791) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L75
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r1 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L5c
            if (r0 != r4) goto L8b
            X.Hwg.A00(r1)
        L21:
            com.facebook.aura.common.coroutines.SingleFlightResult r1 = (com.facebook.aura.common.coroutines.SingleFlightResult) r1
            boolean r0 = r1 instanceof com.facebook.aura.common.coroutines.SingleFlightResult.Result
            if (r0 == 0) goto L7b
            com.facebook.aura.common.coroutines.SingleFlightResult$Result r1 = (com.facebook.aura.common.coroutines.SingleFlightResult.Result) r1
            T r0 = r1.value
            X.HsJ r0 = (X.HsJ) r0
            java.lang.Object r1 = r0.value
            boolean r0 = r1 instanceof X.C10571Hud
            if (r0 == 0) goto L34
            r1 = r3
        L34:
            com.facebook.aura.sharesheet.ShareRecipientsResponseJson r1 = (com.facebook.aura.sharesheet.ShareRecipientsResponseJson) r1
            if (r1 == 0) goto L3c
            java.util.List<com.facebook.aura.sharesheet.ShareRecipientJson> r1 = r1.recipients
            if (r1 != 0) goto L3e
        L3c:
            X.AGi r1 = X.C0881AGi.A00
        L3e:
            java.util.ArrayList r0 = X.C3cG.A0h()
            java.util.Iterator r2 = r1.iterator()
        L46:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L85
            java.lang.Object r1 = r2.next()
            com.facebook.aura.sharesheet.ShareRecipientJson r1 = (com.facebook.aura.sharesheet.ShareRecipientJson) r1
            com.facebook.aura.sharesheet.HatchShareRecipient r1 = com.facebook.aura.sharesheet.HatchShareSheetRepositoryKt.toDomain(r1)
            if (r1 == 0) goto L46
            r0.add(r1)
            goto L46
        L5c:
            X.Hwg.A00(r1)
            com.facebook.aura.common.coroutines.SingleFlight r2 = r7.recipientsSingleFlight
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r8)
            com.facebook.aura.sharesheet.HatchShareSheetRepository$fetchRecipientsOnce$result$1 r0 = new com.facebook.aura.sharesheet.HatchShareSheetRepository$fetchRecipientsOnce$result$1
            r0.<init>(r8, r3)
            r6.Z$0 = r8
            r6.label = r4
            java.lang.Object r1 = r2.invoke(r1, r0, r6)
            if (r1 != r5) goto L21
            return r5
        L75:
            com.facebook.aura.sharesheet.HatchShareSheetRepository$fetchRecipientsOnce$1 r6 = new com.facebook.aura.sharesheet.HatchShareSheetRepository$fetchRecipientsOnce$1
            r6.<init>(r9)
            goto L12
        L7b:
            com.facebook.aura.common.coroutines.SingleFlightResult$Skipped r0 = com.facebook.aura.common.coroutines.SingleFlightResult.Skipped.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 == 0) goto L86
            X.AGi r0 = X.C0881AGi.A00
        L85:
            return r0
        L86:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        L8b:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.sharesheet.HatchShareSheetRepository.fetchRecipientsOnce(boolean, X.HtJ):java.lang.Object");
    }

    private final File materializeUploadFile(Context context, HatchPreparedShareMedia hatchPreparedShareMedia) throws IOException {
        HatchShareMediaCache hatchShareMediaCache = new HatchShareMediaCache(context);
        String strKeyFor = HatchShareMediaCache.Companion.keyFor(AnonymousClass007.A0a("upload:", hatchPreparedShareMedia.uri));
        File fileFind = hatchShareMediaCache.find(strKeyFor);
        if (fileFind == null) {
            String strExtensionForMime = HatchShareSheetRepositoryKt.extensionForMime(hatchPreparedShareMedia.mimeType);
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(hatchPreparedShareMedia.uri);
            fileFind = null;
            if (inputStreamOpenInputStream != null) {
                try {
                    File fileStore = hatchShareMediaCache.store(strKeyFor, strExtensionForMime, inputStreamOpenInputStream);
                    inputStreamOpenInputStream.close();
                    return fileStore;
                } finally {
                }
            }
        }
        return fileFind;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object attemptMessageShare$fbandroid_express_aura_java_com_facebook_aura_sharesheet_sharesheet(java.lang.String r27, java.lang.String r28, X.HtJ<? super com.facebook.aura.sharesheet.HatchMessageShareAttemptResult> r29) {
        /*
            r26 = this;
            r3 = r29
            boolean r0 = r3 instanceof com.facebook.aura.sharesheet.HatchShareSheetRepository$attemptMessageShare$1
            r5 = r26
            if (r0 == 0) goto L22
            r4 = r3
            com.facebook.aura.sharesheet.HatchShareSheetRepository$attemptMessageShare$1 r4 = (com.facebook.aura.sharesheet.HatchShareSheetRepository$attemptMessageShare$1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r4.label = r2
        L16:
            java.lang.Object r1 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L2d
            if (r0 != r2) goto L28
            goto L9c
        L22:
            com.facebook.aura.sharesheet.HatchShareSheetRepository$attemptMessageShare$1 r4 = new com.facebook.aura.sharesheet.HatchShareSheetRepository$attemptMessageShare$1
            r4.<init>(r5, r3)
            goto L16
        L28:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2d:
            X.Hwg.A00(r1)
            com.facebook.aura.network.http.HatchHttpApi r7 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE     // Catch: java.lang.Exception -> Lb3 java.util.concurrent.CancellationException -> Lb6
            com.facebook.aura.sharesheet.SharingJarvisPath$SharingAttempt r11 = com.facebook.aura.sharesheet.SharingJarvisPath.SharingAttempt.INSTANCE     // Catch: java.lang.Exception -> Lb3 java.util.concurrent.CancellationException -> Lb6
            java.lang.String r0 = "message"
            com.facebook.aura.sharesheet.MessageShareAttemptRequestJson r12 = new com.facebook.aura.sharesheet.MessageShareAttemptRequestJson     // Catch: java.lang.Exception -> Lb3 java.util.concurrent.CancellationException -> Lb6
            r6 = r27
            r1 = r28
            r12.<init>(r0, r6, r1)     // Catch: java.lang.Exception -> Lb3 java.util.concurrent.CancellationException -> Lb6
            com.facebook.aura.network.http.RequestType r13 = com.facebook.aura.network.http.RequestType.POST     // Catch: java.lang.Exception -> Lb3 java.util.concurrent.CancellationException -> Lb6
            X.CGz r14 = r5.userSession     // Catch: java.lang.Exception -> Lb3 java.util.concurrent.CancellationException -> Lb6
            r0 = 35
            java.lang.Long r15 = X.C3cG.A0S(r0)     // Catch: java.lang.Exception -> Lb3 java.util.concurrent.CancellationException -> Lb6
            r10 = 0
            X.HxE[] r1 = new X.HxE[r10]     // Catch: java.lang.Exception -> Lb3 java.util.concurrent.CancellationException -> Lb6
            java.util.Set r18 = X.AnonymousClass004.A18()     // Catch: java.lang.Exception -> Lb3 java.util.concurrent.CancellationException -> Lb6
            X.9jH r21 = X.C9jH.A00     // Catch: java.lang.Exception -> Lb3 java.util.concurrent.CancellationException -> Lb6
            com.facebook.aura.sharesheet.HatchShareSheetRepository$attemptMessageShare$$inlined$executeJarvisRequest-Z6QaZII$default$1 r8 = com.facebook.aura.sharesheet.HatchShareSheetRepository$attemptMessageShare$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE     // Catch: java.lang.Exception -> Lb3 java.util.concurrent.CancellationException -> Lb6
            com.facebook.aura.sharesheet.HatchShareSheetRepository$attemptMessageShare$$inlined$executeJarvisRequest-Z6QaZII$default$2 r9 = com.facebook.aura.sharesheet.HatchShareSheetRepository$attemptMessageShare$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE     // Catch: java.lang.Exception -> Lb3 java.util.concurrent.CancellationException -> Lb6
            r0 = 0
            r4.L$0 = r0     // Catch: java.lang.Exception -> Lb3 java.util.concurrent.CancellationException -> Lb6
            r4.L$1 = r0     // Catch: java.lang.Exception -> Lb3 java.util.concurrent.CancellationException -> Lb6
            r4.L$2 = r0     // Catch: java.lang.Exception -> Lb3 java.util.concurrent.CancellationException -> Lb6
            r4.L$3 = r0     // Catch: java.lang.Exception -> Lb3 java.util.concurrent.CancellationException -> Lb6
            r4.L$4 = r0     // Catch: java.lang.Exception -> Lb3 java.util.concurrent.CancellationException -> Lb6
            r4.L$5 = r0     // Catch: java.lang.Exception -> Lb3 java.util.concurrent.CancellationException -> Lb6
            r4.L$6 = r0     // Catch: java.lang.Exception -> Lb3 java.util.concurrent.CancellationException -> Lb6
            r4.L$7 = r0     // Catch: java.lang.Exception -> Lb3 java.util.concurrent.CancellationException -> Lb6
            r4.L$8 = r0     // Catch: java.lang.Exception -> Lb3 java.util.concurrent.CancellationException -> Lb6
            r4.L$9 = r0     // Catch: java.lang.Exception -> Lb3 java.util.concurrent.CancellationException -> Lb6
            r4.L$10 = r0     // Catch: java.lang.Exception -> Lb3 java.util.concurrent.CancellationException -> Lb6
            r4.I$0 = r2     // Catch: java.lang.Exception -> Lb3 java.util.concurrent.CancellationException -> Lb6
            r4.I$1 = r10     // Catch: java.lang.Exception -> Lb3 java.util.concurrent.CancellationException -> Lb6
            r4.I$2 = r10     // Catch: java.lang.Exception -> Lb3 java.util.concurrent.CancellationException -> Lb6
            r4.I$3 = r2     // Catch: java.lang.Exception -> Lb3 java.util.concurrent.CancellationException -> Lb6
            r4.I$4 = r10     // Catch: java.lang.Exception -> Lb3 java.util.concurrent.CancellationException -> Lb6
            r4.I$5 = r10     // Catch: java.lang.Exception -> Lb3 java.util.concurrent.CancellationException -> Lb6
            r4.I$6 = r10     // Catch: java.lang.Exception -> Lb3 java.util.concurrent.CancellationException -> Lb6
            r4.label = r2     // Catch: java.lang.Exception -> Lb3 java.util.concurrent.CancellationException -> Lb6
            r20 = r10
            r22 = r0
            r23 = r10
            r24 = r2
            r25 = r10
            r26 = r10
            r27 = r0
            r28 = r10
            r29 = r4
            r17 = r1
            r19 = r2
            r16 = r0
            java.lang.Object r1 = r7.m1599executeJarvisRequestWithFof5HsY(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)     // Catch: java.lang.Exception -> Lb3 java.util.concurrent.CancellationException -> Lb6
            if (r1 != r3) goto La0
            return r3
        L9c:
            java.lang.Object r1 = X.AnonymousClass001.A0q(r1)     // Catch: java.lang.Exception -> Lb3 java.util.concurrent.CancellationException -> Lb6
        La0:
            boolean r0 = r1 instanceof X.C10571Hud     // Catch: java.lang.Exception -> Lb3 java.util.concurrent.CancellationException -> Lb6
            if (r0 == 0) goto La5
            r1 = 0
        La5:
            com.facebook.aura.sharesheet.MessageShareAttemptResponseJson r1 = (com.facebook.aura.sharesheet.MessageShareAttemptResponseJson) r1     // Catch: java.lang.Exception -> Lb3 java.util.concurrent.CancellationException -> Lb6
            if (r1 == 0) goto Lb0
            com.facebook.aura.sharesheet.HatchMessageShareAttemptResult r3 = r1.toDomain()     // Catch: java.lang.Exception -> Lb3 java.util.concurrent.CancellationException -> Lb6
            if (r3 == 0) goto Lb0
            return r3
        Lb0:
            com.facebook.aura.sharesheet.HatchMessageShareAttemptResult r3 = com.facebook.aura.sharesheet.HatchMessageShareAttemptResult.UNAVAILABLE     // Catch: java.lang.Exception -> Lb3 java.util.concurrent.CancellationException -> Lb6
            return r3
        Lb3:
            com.facebook.aura.sharesheet.HatchMessageShareAttemptResult r0 = com.facebook.aura.sharesheet.HatchMessageShareAttemptResult.UNAVAILABLE
            return r0
        Lb6:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.sharesheet.HatchShareSheetRepository.attemptMessageShare$fbandroid_express_aura_java_com_facebook_aura_sharesheet_sharesheet(java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
    /* renamed from: checkShareEligibility-0E7RQCE$fbandroid_express_aura_java_com_facebook_aura_sharesheet_sharesheet, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m2005x85088dca(java.lang.String r8, java.lang.String r9, X.HtJ<? super X.HsJ<java.lang.Boolean>> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.facebook.aura.sharesheet.HatchShareSheetRepository$checkShareEligibility$1
            if (r0 == 0) goto L66
            r6 = r10
            com.facebook.aura.sharesheet.HatchShareSheetRepository$checkShareEligibility$1 r6 = (com.facebook.aura.sharesheet.HatchShareSheetRepository$checkShareEligibility$1) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L66
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r1 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r4 = 1
            if (r0 == 0) goto L4a
            if (r0 != r4) goto L6c
            X.Hwg.A00(r1)
        L20:
            com.facebook.aura.common.coroutines.SingleFlightResult r1 = (com.facebook.aura.common.coroutines.SingleFlightResult) r1
            boolean r0 = r1 instanceof com.facebook.aura.common.coroutines.SingleFlightResult.Result
            if (r0 == 0) goto L3d
            com.facebook.aura.common.coroutines.SingleFlightResult$Result r1 = (com.facebook.aura.common.coroutines.SingleFlightResult.Result) r1
            T r0 = r1.value
            X.HsJ r0 = (X.HsJ) r0
            java.lang.Object r1 = r0.value
            boolean r0 = r1 instanceof X.C10571Hud
            r0 = r0 ^ 1
            if (r0 == 0) goto L3c
            com.facebook.aura.sharesheet.ShareEligibilityResponseJson r1 = (com.facebook.aura.sharesheet.ShareEligibilityResponseJson) r1
            boolean r4 = r1.can_broadcast_share
        L38:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
        L3c:
            return r1
        L3d:
            com.facebook.aura.common.coroutines.SingleFlightResult$Skipped r0 = com.facebook.aura.common.coroutines.SingleFlightResult.Skipped.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 != 0) goto L38
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        L4a:
            X.Hwg.A00(r1)
            com.facebook.aura.common.coroutines.SingleFlight r3 = r7.eligibilitySingleFlight
            X.HxE r2 = X.C3cG.A0r(r8, r9)
            r1 = 0
            com.facebook.aura.sharesheet.HatchShareSheetRepository$checkShareEligibility$result$1 r0 = new com.facebook.aura.sharesheet.HatchShareSheetRepository$checkShareEligibility$result$1
            r0.<init>(r7, r8, r9, r1)
            r6.L$0 = r1
            r6.L$1 = r1
            r6.label = r4
            java.lang.Object r1 = r3.invoke(r2, r0, r6)
            if (r1 != r5) goto L20
            return r5
        L66:
            com.facebook.aura.sharesheet.HatchShareSheetRepository$checkShareEligibility$1 r6 = new com.facebook.aura.sharesheet.HatchShareSheetRepository$checkShareEligibility$1
            r6.<init>(r7, r10)
            goto L12
        L6c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.sharesheet.HatchShareSheetRepository.m2005x85088dca(java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        this.recipientsSingleFlight.clearAndCancelAll();
        this.mediaSingleFlight.clearAndCancelAll();
        this.eligibilitySingleFlight.clearAndCancelAll();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* renamed from: fetchRecipients-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m2006fetchRecipientsgIAlus(boolean r7, X.HtJ<? super X.HsJ<? extends X.AHD<com.facebook.aura.sharesheet.HatchShareRecipient>>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.sharesheet.HatchShareSheetRepository$fetchRecipients$1
            if (r0 == 0) goto L3a
            r5 = r8
            com.facebook.aura.sharesheet.HatchShareSheetRepository$fetchRecipients$1 r5 = (com.facebook.aura.sharesheet.HatchShareSheetRepository$fetchRecipients$1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3a
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L25
            if (r0 != r3) goto L40
            X.Hwg.A00(r1)
        L20:
            X.HsJ r1 = (X.HsJ) r1
            java.lang.Object r0 = r1.value
            return r0
        L25:
            X.78T r2 = X.AnonymousClass002.A0s(r1)
            r1 = 0
            com.facebook.aura.sharesheet.HatchShareSheetRepository$fetchRecipients$2 r0 = new com.facebook.aura.sharesheet.HatchShareSheetRepository$fetchRecipients$2
            r0.<init>(r6, r7, r1)
            r5.Z$0 = r7
            r5.label = r3
            java.lang.Object r1 = X.GAo.A00(r5, r2, r0)
            if (r1 != r4) goto L20
            return r4
        L3a:
            com.facebook.aura.sharesheet.HatchShareSheetRepository$fetchRecipients$1 r5 = new com.facebook.aura.sharesheet.HatchShareSheetRepository$fetchRecipients$1
            r5.<init>(r6, r8)
            goto L12
        L40:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.sharesheet.HatchShareSheetRepository.m2006fetchRecipientsgIAlus(boolean, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object prefetchRecipients(X.HtJ<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.facebook.aura.sharesheet.HatchShareSheetRepository.C136801
            if (r0 == 0) goto L30
            r4 = r6
            com.facebook.aura.sharesheet.HatchShareSheetRepository$prefetchRecipients$1 r4 = (com.facebook.aura.sharesheet.HatchShareSheetRepository.C136801) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L30
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r1 = r4.label
            r0 = 1
            if (r1 == 0) goto L23
            if (r1 != r0) goto L36
            X.Hwg.A00(r3)
        L20:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        L23:
            X.Hwg.A00(r3)
            r4.label = r0
            r0 = 0
            java.lang.Object r0 = r5.m2006fetchRecipientsgIAlus(r0, r4)
            if (r0 != r2) goto L20
            return r2
        L30:
            com.facebook.aura.sharesheet.HatchShareSheetRepository$prefetchRecipients$1 r4 = new com.facebook.aura.sharesheet.HatchShareSheetRepository$prefetchRecipients$1
            r4.<init>(r6)
            goto L12
        L36:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.sharesheet.HatchShareSheetRepository.prefetchRecipients(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object prepareMedia$fbandroid_express_aura_java_com_facebook_aura_sharesheet_sharesheet(android.content.Context r7, java.lang.String r8, X.HtJ<? super com.facebook.aura.sharesheet.HatchPreparedShareMedia> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.facebook.aura.sharesheet.HatchShareSheetRepository$prepareMedia$1
            if (r0 == 0) goto L50
            r5 = r9
            com.facebook.aura.sharesheet.HatchShareSheetRepository$prepareMedia$1 r5 = (com.facebook.aura.sharesheet.HatchShareSheetRepository$prepareMedia$1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L50
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L39
            if (r0 != r2) goto L56
            X.Hwg.A00(r1)
        L21:
            com.facebook.aura.common.coroutines.SingleFlightResult r1 = (com.facebook.aura.common.coroutines.SingleFlightResult) r1
            boolean r0 = r1 instanceof com.facebook.aura.common.coroutines.SingleFlightResult.Result
            if (r0 == 0) goto L2c
            com.facebook.aura.common.coroutines.SingleFlightResult$Result r1 = (com.facebook.aura.common.coroutines.SingleFlightResult.Result) r1
            T r3 = r1.value
        L2b:
            return r3
        L2c:
            com.facebook.aura.common.coroutines.SingleFlightResult$Skipped r0 = com.facebook.aura.common.coroutines.SingleFlightResult.Skipped.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 != 0) goto L2b
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        L39:
            X.Hwg.A00(r1)
            com.facebook.aura.common.coroutines.SingleFlight r1 = r6.mediaSingleFlight
            com.facebook.aura.sharesheet.HatchShareSheetRepository$prepareMedia$result$1 r0 = new com.facebook.aura.sharesheet.HatchShareSheetRepository$prepareMedia$result$1
            r0.<init>(r6, r7, r8, r3)
            r5.L$0 = r3
            r5.L$1 = r3
            r5.label = r2
            java.lang.Object r1 = r1.invoke(r8, r0, r5)
            if (r1 != r4) goto L21
            return r4
        L50:
            com.facebook.aura.sharesheet.HatchShareSheetRepository$prepareMedia$1 r5 = new com.facebook.aura.sharesheet.HatchShareSheetRepository$prepareMedia$1
            r5.<init>(r6, r9)
            goto L12
        L56:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.sharesheet.HatchShareSheetRepository.prepareMedia$fbandroid_express_aura_java_com_facebook_aura_sharesheet_sharesheet(android.content.Context, java.lang.String, X.HtJ):java.lang.Object");
    }

    public final Object prepareMessengerRecipientMedia$fbandroid_express_aura_java_com_facebook_aura_sharesheet_sharesheet(Context context, HatchPreparedShareMedia hatchPreparedShareMedia, HtJ<? super HatchPreparedShareMedia> htJ) {
        return !C60O.A1X(hatchPreparedShareMedia.mimeType, "image/") ? hatchPreparedShareMedia : GAo.A00(htJ, AnonymousClass001.A0y(), new HatchShareSheetRepository$prepareMessengerRecipientMedia$2(context, hatchPreparedShareMedia, this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object prepareStoryAudio$fbandroid_express_aura_java_com_facebook_aura_sharesheet_sharesheet(android.content.Context r10, com.facebook.aura.model.HatchAttachmentAudio r11, android.net.Uri r12, X.HtJ<? super com.facebook.aura.file.actions.HatchStoryAudio> r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof com.facebook.aura.sharesheet.HatchShareSheetRepository$prepareStoryAudio$1
            if (r0 == 0) goto L51
            r8 = r13
            com.facebook.aura.sharesheet.HatchShareSheetRepository$prepareStoryAudio$1 r8 = (com.facebook.aura.sharesheet.HatchShareSheetRepository$prepareStoryAudio$1) r8
            int r2 = r8.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L51
            int r2 = r2 - r1
            r8.label = r2
        L12:
            java.lang.Object r2 = r8.result
            X.Hji r7 = X.EnumC10460Hji.A02
            int r0 = r8.label
            r6 = 1
            if (r0 == 0) goto L31
            if (r0 != r6) goto L57
            int r1 = r8.I$0
            java.lang.Object r5 = r8.L$4
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r0 = r8.L$3
            java.lang.String r4 = X.C3cG.A0d(r0, r2)
        L29:
            java.lang.Integer r2 = (java.lang.Integer) r2
            com.facebook.aura.file.actions.HatchStoryAudio r0 = new com.facebook.aura.file.actions.HatchStoryAudio
            r0.<init>(r4, r5, r1, r2)
            return r0
        L31:
            X.Hwg.A00(r2)
            java.lang.String r4 = r11.audioAssetId
            java.lang.String r5 = r11.audioClusterId
            long r2 = r11.startMs
            int r1 = (int) r2
            r0 = 0
            r8.L$0 = r0
            r8.L$1 = r0
            r8.L$2 = r0
            r8.L$3 = r4
            r8.L$4 = r5
            r8.I$0 = r1
            r8.label = r6
            java.lang.Object r2 = r9.videoDurationMs(r10, r12, r8)
            if (r2 != r7) goto L29
            return r7
        L51:
            com.facebook.aura.sharesheet.HatchShareSheetRepository$prepareStoryAudio$1 r8 = new com.facebook.aura.sharesheet.HatchShareSheetRepository$prepareStoryAudio$1
            r8.<init>(r9, r13)
            goto L12
        L57:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.sharesheet.HatchShareSheetRepository.prepareStoryAudio$fbandroid_express_aura_java_com_facebook_aura_sharesheet_sharesheet(android.content.Context, com.facebook.aura.model.HatchAttachmentAudio, android.net.Uri, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* renamed from: sendMedia-yxL6bBk$fbandroid_express_aura_java_com_facebook_aura_sharesheet_sharesheet, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m2007x94ee276f(android.content.Context r12, com.facebook.aura.sharesheet.HatchShareRecipient r13, com.facebook.aura.sharesheet.HatchPreparedShareMedia r14, java.lang.String r15, X.HtJ<? super X.HsJ<com.facebook.aura.sharesheet.ShareSendResponseJson>> r16) {
        /*
            r11 = this;
            r3 = r16
            boolean r0 = r3 instanceof com.facebook.aura.sharesheet.HatchShareSheetRepository$sendMedia$1
            r6 = r11
            if (r0 == 0) goto L47
            r4 = r3
            com.facebook.aura.sharesheet.HatchShareSheetRepository$sendMedia$1 r4 = (com.facebook.aura.sharesheet.HatchShareSheetRepository$sendMedia$1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L47
            int r2 = r2 - r1
            r4.label = r2
        L15:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L28
            if (r0 != r1) goto L4d
            X.Hwg.A00(r3)
        L23:
            X.HsJ r3 = (X.HsJ) r3
            java.lang.Object r0 = r3.value
            return r0
        L28:
            X.78T r0 = X.AnonymousClass002.A0s(r3)
            r11 = 0
            com.facebook.aura.sharesheet.HatchShareSheetRepository$sendMedia$2 r5 = new com.facebook.aura.sharesheet.HatchShareSheetRepository$sendMedia$2
            r7 = r12
            r9 = r13
            r8 = r14
            r10 = r15
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r4.L$0 = r11
            r4.L$1 = r11
            r4.L$2 = r11
            r4.L$3 = r11
            r4.label = r1
            java.lang.Object r3 = X.GAo.A00(r4, r0, r5)
            if (r3 != r2) goto L23
            return r2
        L47:
            com.facebook.aura.sharesheet.HatchShareSheetRepository$sendMedia$1 r4 = new com.facebook.aura.sharesheet.HatchShareSheetRepository$sendMedia$1
            r4.<init>(r11, r3)
            goto L15
        L4d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.sharesheet.HatchShareSheetRepository.m2007x94ee276f(android.content.Context, com.facebook.aura.sharesheet.HatchShareRecipient, com.facebook.aura.sharesheet.HatchPreparedShareMedia, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0070  */
    /* renamed from: sendText-0E7RQCE$fbandroid_express_aura_java_com_facebook_aura_sharesheet_sharesheet, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m2008xc74d0c9(com.facebook.aura.sharesheet.HatchShareRecipient r19, java.lang.String r20, X.HtJ<? super X.HsJ<com.facebook.aura.sharesheet.ShareSendResponseJson>> r21) {
        /*
            r18 = this;
            r3 = r21
            boolean r0 = r3 instanceof com.facebook.aura.sharesheet.HatchShareSheetRepository$sendText$1
            if (r0 == 0) goto L70
            r4 = r3
            com.facebook.aura.sharesheet.HatchShareSheetRepository$sendText$1 r4 = (com.facebook.aura.sharesheet.HatchShareSheetRepository$sendText$1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L70
            int r2 = r2 - r1
            r4.label = r2
        L14:
            java.lang.Object r1 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r13 = 1
            if (r0 == 0) goto L24
            if (r0 != r13) goto L78
            java.lang.Object r0 = X.AnonymousClass001.A0q(r1)
        L23:
            return r0
        L24:
            com.facebook.aura.network.http.HatchHttpApi r5 = X.C60O.A06(r1)
            com.facebook.aura.sharesheet.SharingStefiPath$SharingSend r9 = com.facebook.aura.sharesheet.SharingStefiPath.SharingSend.INSTANCE
            r0 = r19
            int r2 = r0.recipientType
            java.lang.String r1 = r0.recipientId
            java.lang.String r0 = r0.senderAccountId
            java.lang.String r21 = X.AnonymousClass002.A0k()
            r14 = 0
            com.facebook.aura.sharesheet.ShareSendRequestJson r10 = new com.facebook.aura.sharesheet.ShareSendRequestJson
            r19 = r20
            r15 = r10
            r17 = r1
            r18 = r0
            r20 = r14
            r16 = r2
            r15.<init>(r16, r17, r18, r19, r20, r21)
            com.facebook.aura.network.http.RequestType r11 = com.facebook.aura.network.http.RequestType.POST
            X.9jH r12 = X.C9jH.A00
            com.facebook.aura.sharesheet.HatchShareSheetRepository$sendText-0E7RQCE$$inlined$executeStefiRequest-tZkwj4A$default$1 r6 = com.facebook.aura.sharesheet.HatchShareSheetRepository$sendText0E7RQCE$$inlined$executeStefiRequesttZkwj4A$default$1.INSTANCE
            com.facebook.aura.sharesheet.HatchShareSheetRepository$sendText-0E7RQCE$$inlined$executeStefiRequest-tZkwj4A$default$2 r7 = com.facebook.aura.sharesheet.HatchShareSheetRepository$sendText0E7RQCE$$inlined$executeStefiRequesttZkwj4A$default$2.INSTANCE
            r8 = 0
            r4.L$0 = r14
            r4.L$1 = r14
            r4.L$2 = r14
            r4.L$3 = r14
            r4.L$4 = r14
            r4.L$5 = r14
            r4.L$6 = r14
            r4.I$0 = r13
            r4.I$1 = r8
            r4.label = r13
            r15 = r8
            r16 = r14
            r17 = r4
            java.lang.Object r0 = r5.m1604executeStefiRequestWithjLovISM(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            if (r0 != r3) goto L23
            return r3
        L70:
            com.facebook.aura.sharesheet.HatchShareSheetRepository$sendText$1 r4 = new com.facebook.aura.sharesheet.HatchShareSheetRepository$sendText$1
            r0 = r18
            r4.<init>(r0, r3)
            goto L14
        L78:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.sharesheet.HatchShareSheetRepository.m2008xc74d0c9(com.facebook.aura.sharesheet.HatchShareRecipient, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* loaded from: classes.dex */
    public final class Companion {
        public final HatchShareSheetRepository getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchShareSheetRepository) abstractC3358CGz.A03(HatchShareSheetRepository.class, new HatchShareSheetRepository$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchShareSheetRepository(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        OnDuplicateCall.Join join = OnDuplicateCall.Join.INSTANCE;
        this.recipientsSingleFlight = SingleFlightKt.SingleFlight(abstractC3358CGz, join, false);
        this.mediaSingleFlight = SingleFlightKt.SingleFlight(abstractC3358CGz, join, false);
        this.eligibilitySingleFlight = SingleFlightKt.SingleFlight(abstractC3358CGz, join, false);
        this.recipientSendScope = C78W.A03();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0032 A[PHI: r5
  0x0032: PHI (r5v2 java.lang.String) = (r5v1 java.lang.String), (r5v0 java.lang.String) binds: [B:15:0x0030, B:6:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.sharesheet.HatchPreparedShareMedia findCachedMedia(android.content.Context r8, com.facebook.aura.sharesheet.HatchShareMediaCache r9, java.lang.String r10) throws java.io.IOException {
        /*
            r7 = this;
            java.io.File r7 = r9.find(r10)
            r6 = 0
            if (r7 == 0) goto L4b
            com.facebook.aura.file.core.HatchMimeResolver r1 = com.facebook.aura.file.core.HatchMimeResolver.INSTANCE
            java.lang.String r0 = r7.getName()
            X.C7384Etj.A0U(r0)
            java.lang.String r5 = r1.mimeForName(r0)
            boolean r0 = com.facebook.aura.sharesheet.HatchShareSheetRepositoryKt.isShareableMedia(r5)
            if (r0 == 0) goto L1c
            if (r5 != 0) goto L32
        L1c:
            java.io.FileInputStream r2 = new java.io.FileInputStream
            r2.<init>(r7)
            java.lang.String r5 = com.facebook.aura.sharesheet.HatchShareSheetRepositoryKt.sniffMediaMime(r2)     // Catch: java.lang.Throwable -> L26
            goto L2d
        L26:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L28
        L28:
            r0 = move-exception
            X.AbstractC7531Ezs.A00(r2, r1)
            throw r0
        L2d:
            r2.close()
            if (r5 == 0) goto L48
        L32:
            long r3 = r7.length()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L48
            com.facebook.aura.model.HatchFileProviderUtil r0 = com.facebook.aura.model.HatchFileProviderUtil.INSTANCE
            android.net.Uri r0 = r0.getUriForFile(r8, r7)
            com.facebook.aura.sharesheet.HatchPreparedShareMedia r6 = new com.facebook.aura.sharesheet.HatchPreparedShareMedia
            r6.<init>(r0, r5)
            return r6
        L48:
            r7.delete()
        L4b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.sharesheet.HatchShareSheetRepository.findCachedMedia(android.content.Context, com.facebook.aura.sharesheet.HatchShareMediaCache, java.lang.String):com.facebook.aura.sharesheet.HatchPreparedShareMedia");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HatchPreparedShareMedia prepareContentMedia(Context context, Uri uri) {
        ApplicationInfo applicationInfo;
        PackageManager packageManager = context.getPackageManager();
        String authority = uri.getAuthority();
        if (authority == null) {
            authority = "";
        }
        ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(authority, 0);
        Integer numValueOf = (providerInfoResolveContentProvider == null || (applicationInfo = ((ComponentInfo) providerInfoResolveContentProvider).applicationInfo) == null) ? null : Integer.valueOf(applicationInfo.uid);
        int iMyUid = Process.myUid();
        if ((numValueOf == null || numValueOf.intValue() != iMyUid) && context.checkUriPermission(uri, Process.myPid(), Process.myUid(), 1) != 0) {
            return null;
        }
        HatchMimeResolver hatchMimeResolver = HatchMimeResolver.INSTANCE;
        String strMimeForContentUri = hatchMimeResolver.mimeForContentUri(context, uri);
        if (!HatchShareSheetRepositoryKt.isShareableMedia(strMimeForContentUri) || strMimeForContentUri == null) {
            String lastPathSegment = uri.getLastPathSegment();
            strMimeForContentUri = hatchMimeResolver.mimeForName(lastPathSegment != null ? lastPathSegment : "");
            if (!HatchShareSheetRepositoryKt.isShareableMedia(strMimeForContentUri) || strMimeForContentUri == null) {
                return null;
            }
        }
        return new HatchPreparedShareMedia(uri, strMimeForContentUri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0061, code lost:
    
        if (r3 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.sharesheet.HatchPreparedShareMedia prepareFileMedia(android.content.Context r10, com.facebook.aura.sharesheet.HatchShareMediaCache r11, android.net.Uri r12) throws java.io.IOException {
        /*
            r9 = this;
            java.lang.String r0 = r12.getPath()
            r8 = 0
            if (r0 == 0) goto L63
            java.io.File r5 = new java.io.File
            r5.<init>(r0)
            boolean r0 = r5.isFile()
            if (r0 == 0) goto L63
            com.facebook.aura.sharesheet.HatchShareMediaCache$Companion r7 = com.facebook.aura.sharesheet.HatchShareMediaCache.Companion
            java.lang.String r4 = r5.getAbsolutePath()
            long r2 = r5.length()
            long r0 = r5.lastModified()
            java.lang.StringBuilder r6 = X.C3cG.A0g(r4)
            java.lang.String r4 = ":"
            r6.append(r4)
            r6.append(r2)
            r6.append(r4)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            java.lang.String r4 = r7.keyFor(r0)
            com.facebook.aura.sharesheet.HatchPreparedShareMedia r0 = r9.findCachedMedia(r10, r11, r4)
            if (r0 != 0) goto L7f
            com.facebook.aura.file.core.HatchMimeResolver r1 = com.facebook.aura.file.core.HatchMimeResolver.INSTANCE
            java.lang.String r0 = r5.getName()
            X.C7384Etj.A0U(r0)
            java.lang.String r3 = r1.mimeForName(r0)
            boolean r0 = com.facebook.aura.sharesheet.HatchShareSheetRepositoryKt.isShareableMedia(r3)
            if (r0 == 0) goto L55
            if (r3 != 0) goto L64
        L55:
            java.io.FileInputStream r2 = new java.io.FileInputStream
            r2.<init>(r5)
            java.lang.String r3 = com.facebook.aura.sharesheet.HatchShareSheetRepositoryKt.sniffMediaMime(r2)     // Catch: java.lang.Throwable -> L80
            r2.close()
            if (r3 != 0) goto L64
        L63:
            return r8
        L64:
            java.io.FileInputStream r2 = new java.io.FileInputStream
            r2.<init>(r5)
            java.lang.String r0 = com.facebook.aura.sharesheet.HatchShareSheetRepositoryKt.extensionForMime(r3)     // Catch: java.lang.Throwable -> L80
            java.io.File r1 = r11.store(r4, r0, r2)     // Catch: java.lang.Throwable -> L80
            r2.close()
            com.facebook.aura.model.HatchFileProviderUtil r0 = com.facebook.aura.model.HatchFileProviderUtil.INSTANCE
            android.net.Uri r1 = r0.getUriForFile(r10, r1)
            com.facebook.aura.sharesheet.HatchPreparedShareMedia r0 = new com.facebook.aura.sharesheet.HatchPreparedShareMedia
            r0.<init>(r1, r3)
        L7f:
            return r0
        L80:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L82
        L82:
            r0 = move-exception
            X.AbstractC7531Ezs.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.sharesheet.HatchShareSheetRepository.prepareFileMedia(android.content.Context, com.facebook.aura.sharesheet.HatchShareMediaCache, android.net.Uri):com.facebook.aura.sharesheet.HatchPreparedShareMedia");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object prepareMediaOnce(Context context, String str, HtJ<? super HatchPreparedShareMedia> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(context, str, this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object videoDurationMs(Context context, Uri uri, HtJ<? super Integer> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C136812(context, uri, null));
    }

    public final Object prepareInstagramLinkStickerIcon$fbandroid_express_aura_java_com_facebook_aura_sharesheet_sharesheet(Context context, HtJ<? super Uri> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new HatchShareSheetRepository$prepareInstagramLinkStickerIcon$2(context, null));
    }

    public final Object prepareMutedVideo$fbandroid_express_aura_java_com_facebook_aura_sharesheet_sharesheet(Context context, HatchPreparedShareMedia hatchPreparedShareMedia, HtJ<? super HatchPreparedShareMedia> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new HatchShareSheetRepository$prepareMutedVideo$2(context, hatchPreparedShareMedia, this, null));
    }

    public /* synthetic */ HatchShareSheetRepository(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}

package com.facebook.aura.sharesheet;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.IOException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetRepository$prepareMutedVideo$2", f = "HatchShareSheetRepository.kt", l = {158}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class HatchShareSheetRepository$prepareMutedVideo$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HatchPreparedShareMedia>, Object> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ HatchPreparedShareMedia $media;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public final /* synthetic */ HatchShareSheetRepository this$0;

    @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetRepository$prepareMutedVideo$2$2", f = "HatchShareSheetRepository.kt", l = {159}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.sharesheet.HatchShareSheetRepository$prepareMutedVideo$2$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ HatchPreparedShareMedia $media;
        public final /* synthetic */ File $pendingFile;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Context context, HatchPreparedShareMedia hatchPreparedShareMedia, File file, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$context = context;
            this.$media = hatchPreparedShareMedia;
            this.$pendingFile = file;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$context, this.$media, this.$pendingFile, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws IOException {
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                Context context = this.$context;
                Uri uri = this.$media.uri;
                File file = this.$pendingFile;
                this.label = 1;
                HatchVideoAudioStripperKt.writeVideoWithoutAudio(context, uri, file, this);
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchShareSheetRepository$prepareMutedVideo$2(Context context, HatchPreparedShareMedia hatchPreparedShareMedia, HatchShareSheetRepository hatchShareSheetRepository, HtJ<? super HatchShareSheetRepository$prepareMutedVideo$2> htJ) {
        super(2, htJ);
        this.$context = context;
        this.$media = hatchPreparedShareMedia;
        this.this$0 = hatchShareSheetRepository;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        HatchShareSheetRepository$prepareMutedVideo$2 hatchShareSheetRepository$prepareMutedVideo$2 = new HatchShareSheetRepository$prepareMutedVideo$2(this.$context, this.$media, this.this$0, htJ);
        hatchShareSheetRepository$prepareMutedVideo$2.L$0 = obj;
        return hatchShareSheetRepository$prepareMutedVideo$2;
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x009f: INVOKE (r3 I:java.io.File) VIRTUAL call: java.io.File.delete():boolean A[MD:():boolean (c)] (LINE:159), block:B:33:0x009f */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006e A[Catch: Exception -> 0x0090, CancellationException -> 0x009c, all -> 0x009e, TRY_LEAVE, TryCatch #0 {Exception -> 0x0090, blocks: (B:15:0x0067, B:16:0x006a, B:18:0x006e, B:21:0x0077), top: B:35:0x0067 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077 A[Catch: Exception -> 0x0090, CancellationException -> 0x009c, all -> 0x009e, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x0090, blocks: (B:15:0x0067, B:16:0x006a, B:18:0x006e, B:21:0x0077), top: B:35:0x0067 }] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.io.IOException {
        /*
            r12 = this;
            java.lang.String r6 = "video/mp4"
            java.lang.Object r11 = r12.L$0
            X.Hji r9 = X.EnumC10460Hji.A02
            int r0 = r12.label
            java.lang.String r5 = "HatchShareSheetRepository"
            r10 = 1
            r4 = 0
            if (r0 == 0) goto L22
            if (r0 != r10) goto L1d
            java.lang.Object r3 = r12.L$3
            java.io.File r3 = (java.io.File) r3
            java.lang.Object r8 = r12.L$2
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r12.L$1
            com.facebook.aura.sharesheet.HatchShareMediaCache r7 = (com.facebook.aura.sharesheet.HatchShareMediaCache) r7
            goto L67
        L1d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L22:
            X.Hwg.A00(r13)
            android.content.Context r0 = r12.$context
            com.facebook.aura.sharesheet.HatchShareMediaCache r7 = new com.facebook.aura.sharesheet.HatchShareMediaCache
            r7.<init>(r0)
            com.facebook.aura.sharesheet.HatchShareMediaCache$Companion r2 = com.facebook.aura.sharesheet.HatchShareMediaCache.Companion
            com.facebook.aura.sharesheet.HatchPreparedShareMedia r0 = r12.$media
            android.net.Uri r1 = r0.uri
            java.lang.String r0 = "muted:"
            java.lang.String r0 = X.AnonymousClass007.A0a(r0, r1)
            java.lang.String r8 = r2.keyFor(r0)
            com.facebook.aura.sharesheet.HatchShareSheetRepository r1 = r12.this$0
            android.content.Context r0 = r12.$context
            com.facebook.aura.sharesheet.HatchPreparedShareMedia r0 = com.facebook.aura.sharesheet.HatchShareSheetRepository.access$findCachedMedia(r1, r0, r7, r8)
            if (r0 == 0) goto L47
            return r0
        L47:
            java.io.File r3 = r7.newPendingFile(r8)
            android.content.Context r1 = r12.$context     // Catch: java.lang.Exception -> L92 java.util.concurrent.CancellationException -> L9c java.lang.Throwable -> L9e
            com.facebook.aura.sharesheet.HatchPreparedShareMedia r0 = r12.$media     // Catch: java.lang.Exception -> L92 java.util.concurrent.CancellationException -> L9c java.lang.Throwable -> L9e
            com.facebook.aura.sharesheet.HatchShareSheetRepository$prepareMutedVideo$2$2 r2 = new com.facebook.aura.sharesheet.HatchShareSheetRepository$prepareMutedVideo$2$2     // Catch: java.lang.Exception -> L92 java.util.concurrent.CancellationException -> L9c java.lang.Throwable -> L9e
            r2.<init>(r1, r0, r3, r4)     // Catch: java.lang.Exception -> L92 java.util.concurrent.CancellationException -> L9c java.lang.Throwable -> L9e
            r12.L$0 = r11     // Catch: java.lang.Exception -> L92 java.util.concurrent.CancellationException -> L9c java.lang.Throwable -> L9e
            r12.L$1 = r7     // Catch: java.lang.Exception -> L92 java.util.concurrent.CancellationException -> L9c java.lang.Throwable -> L9e
            r12.L$2 = r8     // Catch: java.lang.Exception -> L92 java.util.concurrent.CancellationException -> L9c java.lang.Throwable -> L9e
            r12.L$3 = r3     // Catch: java.lang.Exception -> L92 java.util.concurrent.CancellationException -> L9c java.lang.Throwable -> L9e
            r12.label = r10     // Catch: java.lang.Exception -> L92 java.util.concurrent.CancellationException -> L9c java.lang.Throwable -> L9e
            r0 = 15000(0x3a98, double:7.411E-320)
            java.lang.Object r13 = X.GAX.A01(r12, r2, r0)     // Catch: java.lang.Exception -> L92 java.util.concurrent.CancellationException -> L9c java.lang.Throwable -> L9e
            if (r13 != r9) goto L6a
            return r9
        L67:
            X.Hwg.A00(r13)     // Catch: java.lang.Exception -> L90 java.util.concurrent.CancellationException -> L9c java.lang.Throwable -> L9e
        L6a:
            kotlin.Unit r13 = (kotlin.Unit) r13     // Catch: java.lang.Exception -> L90 java.util.concurrent.CancellationException -> L9c java.lang.Throwable -> L9e
            if (r13 != 0) goto L77
            java.lang.String r0 = "Timed out stripping audio from share video"
            X.CFK.A06(r5, r0)     // Catch: java.lang.Exception -> L90 java.util.concurrent.CancellationException -> L9c java.lang.Throwable -> L9e
            r3.delete()
            return r4
        L77:
            java.lang.String r0 = com.facebook.aura.sharesheet.HatchShareSheetRepositoryKt.extensionForMime(r6)     // Catch: java.lang.Exception -> L90 java.util.concurrent.CancellationException -> L9c java.lang.Throwable -> L9e
            java.io.File r2 = r7.commit(r3, r8, r0)     // Catch: java.lang.Exception -> L90 java.util.concurrent.CancellationException -> L9c java.lang.Throwable -> L9e
            com.facebook.aura.model.HatchFileProviderUtil r1 = com.facebook.aura.model.HatchFileProviderUtil.INSTANCE     // Catch: java.lang.Exception -> L90 java.util.concurrent.CancellationException -> L9c java.lang.Throwable -> L9e
            android.content.Context r0 = r12.$context     // Catch: java.lang.Exception -> L90 java.util.concurrent.CancellationException -> L9c java.lang.Throwable -> L9e
            android.net.Uri r0 = r1.getUriForFile(r0, r2)     // Catch: java.lang.Exception -> L90 java.util.concurrent.CancellationException -> L9c java.lang.Throwable -> L9e
            com.facebook.aura.sharesheet.HatchPreparedShareMedia r9 = new com.facebook.aura.sharesheet.HatchPreparedShareMedia     // Catch: java.lang.Exception -> L90 java.util.concurrent.CancellationException -> L9c java.lang.Throwable -> L9e
            r9.<init>(r0, r6)     // Catch: java.lang.Exception -> L90 java.util.concurrent.CancellationException -> L9c java.lang.Throwable -> L9e
            r3.delete()
            return r9
        L90:
            r1 = move-exception
            goto L93
        L92:
            r1 = move-exception
        L93:
            java.lang.String r0 = "Failed to strip audio from share video"
            X.CFK.A0K(r5, r1, r0)     // Catch: java.lang.Throwable -> L9e
            r3.delete()
            return r4
        L9c:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L9e
        L9e:
            r0 = move-exception
            r3.delete()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.sharesheet.HatchShareSheetRepository$prepareMutedVideo$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super HatchPreparedShareMedia> htJ) {
        return ((HatchShareSheetRepository$prepareMutedVideo$2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}

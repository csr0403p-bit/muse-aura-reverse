package com.facebook.aura.conversation.viewmodel;

import X.A3Y;
import X.A3Z;
import X.A3q;
import X.A6B;
import X.AGI;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC0885AGm;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.B3i;
import X.BGK;
import X.BLG;
import X.BTQ;
import X.BV5;
import X.C10533Hqc;
import X.C10550Hrx;
import X.C10571Hud;
import X.C1BN;
import X.C27k;
import X.C31u;
import X.C3Em;
import X.C3Pi;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C60P;
import X.C60Q;
import X.C7384Etj;
import X.C79;
import X.C9258GBl;
import X.C9286GCn;
import X.CFK;
import X.EnumC10460Hji;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.GAo;
import X.HoC;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import X.HxE;
import X.HzP;
import X.InterfaceC2261BLa;
import X.InterfaceC7359EnW;
import android.content.Context;
import android.net.Uri;
import com.facebook.aura.commands.photos.MediaDeviceSyncClientKt;
import com.facebook.aura.composer.upload.AttachmentCategory;
import com.facebook.aura.composer.upload.AttachmentFilenamesKt;
import com.facebook.aura.composer.upload.AttachmentTooLargeException;
import com.facebook.aura.composer.upload.HatchAttachmentStaging;
import com.facebook.aura.composer.upload.HatchAttachmentUploader;
import com.facebook.aura.composer.upload.HatchPendingAttachment;
import com.facebook.aura.composer.upload.UploadLogAttachment;
import com.facebook.aura.conversation.viewmodel.HatchConversationViewEffect;
import com.facebook.aura.conversation.viewmodel.MC;
import com.facebook.aura.file.core.HatchMimeResolver;
import com.facebook.aura.livesession.api.LiveSession;
import com.facebook.aura.livesession.api.LiveSessionAttachmentLimit;
import com.facebook.aura.livesession.api.LiveSessions;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.model.HatchPendingFile;
import com.facebook.aura.model.HatchSendMessage;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes5.dex */
public final class HatchConversationAttachments {
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = AnonymousClass003.A1b(HatchConversationAttachments.class, "maxUploadSizeLimitMb", "getMaxUploadSizeLimitMb()I");
    public static final int $stable = 8;
    public final Context context;
    public final InterfaceC2261BLa imageCompressionMutex;
    public final boolean isPrimaryThread;
    public HoC linkImageJob;
    public Set<String> linkImageUris;
    public final C31u maxUploadSizeLimitMb$delegate;
    public final Map<String, HatchPendingAttachment> pendingAttachments;
    public final BLG<HatchSendMessage> pendingMessage;
    public int removedAttachmentCount;
    public final C3UX scope;
    public final String sessionId;
    public final C1BN<Integer> stagingImageBatchCount;
    public final BLG<Integer> stagingImageBatches;
    public final BLG<HatchConversationUiState> uiState;
    public final AbstractC3358CGz userSession;
    public final C3Em<HatchConversationViewEffect> viewEffects;

    @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationAttachments", f = "HatchConversationAttachments.kt", l = {266}, m = "acceptableImageUris", v = 2)
    /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationAttachments$acceptableImageUris$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
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
            return HatchConversationAttachments.this.acceptableImageUris(null, this);
        }
    }

    /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationAttachments$addPendingImageUris$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<Throwable, Unit> {
        public AnonymousClass2() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            BLG<Integer> blg = HatchConversationAttachments.this.stagingImageBatches;
            do {
            } while (!blg.A6e(blg.getValue(), Integer.valueOf(AnonymousClass001.A0F(r1) - 1)));
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationAttachments$getFileSizeBytes$2", f = "HatchConversationAttachments.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationAttachments$getFileSizeBytes$2, reason: invalid class name and case insensitive filesystem */
    public final class C115292 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Long>, Object> {
        public final /* synthetic */ long $maxSizeBytes;
        public final /* synthetic */ Uri $uri;
        public int label;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws IOException {
            int i;
            String strA00 = AnonymousClass000.A00(2);
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            try {
                InputStream inputStreamOpenInputStream = HatchConversationAttachments.this.context.getContentResolver().openInputStream(this.$uri);
                if (inputStreamOpenInputStream == null) {
                    CFK.A06(strA00, AnonymousClass007.A0a("getFileSizeBytes could not open ", this.$uri));
                    return null;
                }
                long j = this.$maxSizeBytes;
                try {
                    byte[] bArr = new byte[8192];
                    long j2 = 0;
                    while (j2 <= j && (i = inputStreamOpenInputStream.read(bArr)) >= 0) {
                        j2 += i;
                    }
                    Long lA0S = C3cG.A0S(j2);
                    inputStreamOpenInputStream.close();
                    return lA0S;
                } finally {
                }
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                CFK.A06(strA00, C60P.A1M(": ", e2.getMessage(), C3cG.A0f(this.$uri, "getFileSizeBytes failed for ")));
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115292(Uri uri, long j, HtJ<? super C115292> htJ) {
            super(2, htJ);
            this.$uri = uri;
            this.$maxSizeBytes = j;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConversationAttachments.this.new C115292(this.$uri, this.$maxSizeBytes, htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Long> htJ) {
            return ((C115292) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationAttachments$startAttachmentPreparation$2", f = "HatchConversationAttachments.kt", l = {487}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationAttachments$startAttachmentPreparation$2, reason: invalid class name and case insensitive filesystem */
    public final class C115312 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ AttachmentCategory $category;
        public final /* synthetic */ C27k<HsJ<Unit>> $job;
        public final /* synthetic */ int $maxSizeMb;
        public final /* synthetic */ String $uri;
        public int label;
        public final /* synthetic */ HatchConversationAttachments this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115312(C27k<HsJ<Unit>> c27k, HatchConversationAttachments hatchConversationAttachments, String str, AttachmentCategory attachmentCategory, int i, HtJ<? super C115312> htJ) {
            super(2, htJ);
            this.$job = c27k;
            this.this$0 = hatchConversationAttachments;
            this.$uri = str;
            this.$category = attachmentCategory;
            this.$maxSizeMb = i;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C115312(this.$job, this.this$0, this.$uri, this.$category, this.$maxSizeMb, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            HsJ hsJ;
            Throwable thA00;
            HatchConversationUiState value;
            HatchConversationUiState hatchConversationUiState;
            HatchSendMessage value2;
            HatchSendMessage hatchSendMessage;
            ArrayList arrayListA0h;
            BLG<HatchConversationUiState> blg;
            String str;
            HatchConversationUiState value3;
            HatchConversationUiState hatchConversationUiState2;
            Object objA0W = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(objA0W);
                    C27k<HsJ<Unit>> c27k = this.$job;
                    this.label = 1;
                    objA0W = C3cG.A0W(c27k, this);
                    if (objA0W == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(objA0W);
                }
                hsJ = (HsJ) objA0W;
            } catch (CancellationException unused) {
                hsJ = null;
            }
            HatchPendingAttachment hatchPendingAttachment = this.this$0.pendingAttachments.get(this.$uri);
            if (hsJ != null) {
                Object obj2 = hsJ.value;
                if ((!(obj2 instanceof C10571Hud)) && hatchPendingAttachment != null) {
                    this.this$0.pendingAttachments.put(this.$uri, hatchPendingAttachment.copy(hatchPendingAttachment.stagedFile, hatchPendingAttachment.filename, hatchPendingAttachment.mimeType, hatchPendingAttachment.category, hatchPendingAttachment.uploadPath, hatchPendingAttachment.uploadJob, true, hatchPendingAttachment.logAttachment));
                    blg = this.this$0.uiState;
                    str = this.$uri;
                    do {
                        value3 = blg.getValue();
                        hatchConversationUiState2 = value3;
                    } while (!blg.A6e(value3, HatchConversationUiState.copy$default(hatchConversationUiState2, false, false, false, false, false, false, 0, null, false, null, null, AGI.A0H(BGK.A04(str, hatchConversationUiState2.uploadingFileUris)), null, null, null, false, false, false, null, null, null, null, null, null, null, null, false, 0, false, false, false, false, null, null, false, -2049, 7, null)));
                    return Unit.INSTANCE;
                }
                thA00 = HsJ.A00(obj2);
            } else {
                thA00 = null;
            }
            if (thA00 instanceof AttachmentTooLargeException) {
                AttachmentUploadAnalytics.INSTANCE.rejected(UploadRejectionReason.TooLarge, this.$category, 1);
                this.this$0.pendingAttachments.remove(this.$uri);
                BLG<HatchSendMessage> blg2 = this.this$0.pendingMessage;
                String str2 = this.$uri;
                do {
                    value2 = blg2.getValue();
                    hatchSendMessage = value2;
                    List<HatchPendingFile> list = hatchSendMessage.fileUris;
                    arrayListA0h = C3cG.A0h();
                    for (HatchPendingFile hatchPendingFile : list) {
                        if (!C7384Etj.areEqual(hatchPendingFile.uri, str2)) {
                            arrayListA0h.add(hatchPendingFile);
                        }
                    }
                } while (!blg2.A6e(value2, HatchSendMessage.copy$default(hatchSendMessage, null, null, null, null, arrayListA0h, null, null, null, null, false, null, null, null, 8175, null)));
                this.this$0.viewEffects.AhV(new HatchConversationViewEffect.ShowUploadSizeExceeded(this.$maxSizeMb));
            } else if (hsJ != null) {
                Object obj3 = hsJ.value;
                if (obj3 instanceof C10571Hud) {
                    String str3 = this.$uri;
                    Throwable thA002 = HsJ.A00(obj3);
                    CFK.A04(AnonymousClass000.A00(2), FGI.A0d("Eager upload failed for ", str3, ": ", thA002 != null ? thA002.getMessage() : null));
                    this.this$0.viewEffects.AhV(HatchConversationViewEffect.ShowAttachmentUploadFailed.INSTANCE);
                    BLG<HatchConversationUiState> blg3 = this.this$0.uiState;
                    String str4 = this.$uri;
                    do {
                        value = blg3.getValue();
                        hatchConversationUiState = value;
                    } while (!blg3.A6e(value, HatchConversationUiState.copy$default(hatchConversationUiState, false, false, false, false, false, false, 0, null, false, null, null, null, AGI.A0H(BGK.A02(str4, hatchConversationUiState.failedUploadUris)), null, null, false, false, false, null, null, null, null, null, null, null, null, false, 0, false, false, false, false, null, null, false, -4097, 7, null)));
                }
            }
            blg = this.this$0.uiState;
            str = this.$uri;
            do {
                value3 = blg.getValue();
                hatchConversationUiState2 = value3;
            } while (!blg.A6e(value3, HatchConversationUiState.copy$default(hatchConversationUiState2, false, false, false, false, false, false, 0, null, false, null, null, AGI.A0H(BGK.A04(str, hatchConversationUiState2.uploadingFileUris)), null, null, null, false, false, false, null, null, null, null, null, null, null, null, false, 0, false, false, false, false, null, null, false, -2049, 7, null)));
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C115312) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public HatchConversationAttachments(Context context, AbstractC3358CGz abstractC3358CGz, String str, boolean z, C3UX c3ux, BLG<HatchSendMessage> blg, BLG<HatchConversationUiState> blg2, C3Em<HatchConversationViewEffect> c3Em) {
        C7384Etj.A0Y(context, 0);
        AnonymousClass003.A0x(abstractC3358CGz, str);
        C7384Etj.A0Y(c3ux, 4);
        AnonymousClass005.A0z(blg, blg2, c3Em);
        this.context = context;
        this.userSession = abstractC3358CGz;
        this.sessionId = str;
        this.isPrimaryThread = z;
        this.scope = c3ux;
        this.pendingMessage = blg;
        this.uiState = blg2;
        this.viewEffects = c3Em;
        this.linkImageUris = A3q.A00;
        C9286GCn c9286GCn = new C9286GCn(0);
        this.stagingImageBatches = c9286GCn;
        this.stagingImageBatchCount = C3Pi.A00(c9286GCn);
        this.maxUploadSizeLimitMb$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigInt(MC.hatch_android.max_upload_size_limit_mb);
        this.pendingAttachments = C3cG.A0j();
        this.imageCompressionMutex = new C9258GBl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void addPendingFileUris(List<HxE<String, String>> list) {
        HatchSendMessage value;
        HatchSendMessage hatchSendMessage;
        List listA0a;
        List<HatchPendingFile> list2;
        ArrayList arrayListA0m;
        C7384Etj.A0Y(list, 0);
        if (list.isEmpty()) {
            return;
        }
        BLG<HatchSendMessage> blg = this.pendingMessage;
        do {
            value = blg.getValue();
            hatchSendMessage = value;
            int size = (10 - hatchSendMessage.imageUris.size()) - hatchSendMessage.fileUris.size();
            if (size < 0) {
                size = 0;
            }
            listA0a = AbstractC0878AGe.A0a(list, size);
            list2 = hatchSendMessage.fileUris;
            arrayListA0m = AnonymousClass002.A0m(listA0a);
            Iterator it = listA0a.iterator();
            while (it.hasNext()) {
                HxE hxEA10 = C60Q.A10(it);
                arrayListA0m.add(new HatchPendingFile((String) hxEA10.first, (String) hxEA10.second));
            }
        } while (!blg.A6e(value, HatchSendMessage.copy$default(hatchSendMessage, null, null, null, null, AbstractC0878AGe.A0P(arrayListA0m, list2), null, null, null, null, false, null, null, null, 8175, null)));
        Iterator it2 = listA0a.iterator();
        while (it2.hasNext()) {
            HxE hxEA102 = C60Q.A10(it2);
            String str = (String) hxEA102.first;
            String str2 = (String) hxEA102.second;
            startAttachmentPreparation$default(this, str, str2, AttachmentCategory.Companion.fromMimeType(str2), null, 8, null);
        }
        if (listA0a.size() < list.size()) {
            final List listA0Z = AbstractC0878AGe.A0Z(list, listA0a.size());
            Iterator itA0n = AnonymousClass002.A0n(A3Z.A00(new A3Y<HxE<? extends String, ? extends String>, AttachmentCategory>() { // from class: com.facebook.aura.conversation.viewmodel.HatchConversationAttachments$addPendingFileUris$$inlined$groupingBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.A3Y
                public AttachmentCategory keyOf(HxE<? extends String, ? extends String> hxE) {
                    return AttachmentCategory.Companion.fromMimeType((String) hxE.second);
                }

                @Override // X.A3Y
                public Iterator<HxE<? extends String, ? extends String>> sourceIterator() {
                    return listA0Z.iterator();
                }
            }));
            while (itA0n.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(itA0n);
                AttachmentUploadAnalytics.INSTANCE.rejected(UploadRejectionReason.AttachmentCap, (AttachmentCategory) entryA0l.getKey(), AnonymousClass001.A0F(entryA0l.getValue()));
            }
            this.viewEffects.AhV(HatchConversationViewEffect.ShowAttachmentLimitReached.INSTANCE);
        }
    }

    public final HoC addPendingImageUri(String str) {
        C7384Etj.A0Y(str, 0);
        return addPendingImageUris(Collections.singletonList(str));
    }

    public final HoC addPendingImageUris(List<String> list) {
        Integer value;
        C7384Etj.A0Y(list, 0);
        if (list.isEmpty()) {
            return null;
        }
        BLG<Integer> blg = this.stagingImageBatches;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, Integer.valueOf(AnonymousClass001.A0F(value) + 1)));
        C10533Hqc c10533HqcA11 = AnonymousClass001.A11(new HatchConversationAttachments$addPendingImageUris$staging$1(this, list, null), this.scope);
        c10533HqcA11.AO5(new AnonymousClass2());
        return c10533HqcA11;
    }

    public final void onAttachmentsPicked(List<? extends Uri> list) {
        C7384Etj.A0Y(list, 0);
        if (list.isEmpty()) {
            return;
        }
        ArrayList arrayListA0h = C3cG.A0h();
        ArrayList arrayListA0h2 = C3cG.A0h();
        for (Uri uri : list) {
            String strMimeForContentUri = HatchMimeResolver.INSTANCE.mimeForContentUri(this.context, uri);
            boolean zA1a = AnonymousClass005.A1a(strMimeForContentUri, "image/");
            String string = uri.toString();
            if (zA1a) {
                C7384Etj.A0U(string);
                arrayListA0h.add(string);
            } else {
                AnonymousClass002.A1J(string, strMimeForContentUri, arrayListA0h2);
            }
        }
        if (!arrayListA0h.isEmpty()) {
            addPendingImageUris(arrayListA0h);
        }
        if (arrayListA0h2.isEmpty()) {
            return;
        }
        addPendingFileUris(arrayListA0h2);
    }

    public final boolean rejectIfLiveSessionBlocksSend(HatchSendMessage hatchSendMessage) {
        LiveSessionAttachmentLimit liveSessionAttachmentLimit;
        int i;
        C7384Etj.A0Y(hatchSendMessage, 0);
        int iAttachmentCount = HatchConversationAttachmentsKt.attachmentCount(hatchSendMessage);
        if (iAttachmentCount == 0 || (liveSessionAttachmentLimit = liveSessionAttachmentLimit()) == null) {
            return false;
        }
        if (!hatchSendMessage.fileUris.isEmpty() && !AnonymousClass003.A1Y(liveSessionAttachmentLimit.filesAllowed)) {
            i = liveSessionAttachmentLimit.filesBlockedMessageRes;
        } else {
            if (iAttachmentCount <= liveSessionAttachmentLimit.maxAttachments) {
                return false;
            }
            i = liveSessionAttachmentLimit.sendBlockedMessageRes;
        }
        this.viewEffects.AhV(new HatchConversationViewEffect.ShowLiveSessionAttachmentMessage(i));
        return true;
    }

    public final HoC replaceLinkImageUris(List<String> list) {
        C7384Etj.A0Y(list, 0);
        HtJ htJA13 = AnonymousClass006.A13(this.linkImageJob);
        C10533Hqc c10533HqcA11 = AnonymousClass001.A11(new HatchConversationAttachments$replaceLinkImageUris$job$1(this, list, htJA13), this.scope);
        this.linkImageJob = c10533HqcA11;
        return c10533HqcA11;
    }

    public final void retryUpload(String str) {
        C7384Etj.A0Y(str, 0);
        HatchPendingAttachment hatchPendingAttachment = this.pendingAttachments.get(str);
        if (hatchPendingAttachment != null) {
            String str2 = hatchPendingAttachment.mimeType;
            AttachmentCategory attachmentCategory = hatchPendingAttachment.category;
            UploadLogAttachment uploadLogAttachment = hatchPendingAttachment.logAttachment;
            UploadLogAttachment uploadLogAttachment2 = new UploadLogAttachment(uploadLogAttachment.id, str2, uploadLogAttachment.manualRetryCount + 1);
            AttachmentUploadAnalytics.INSTANCE.chipAction(uploadLogAttachment2, UploadChipAction.RetryTapped);
            cancelUpload(str);
            startAttachmentPreparation(str, str2, attachmentCategory, uploadLogAttachment2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0070 -> B:11:0x0034). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object acceptableImageUris(java.util.List<java.lang.String> r15, X.HtJ<? super java.util.List<java.lang.String>> r16) {
        /*
            r14 = this;
            r3 = r16
            boolean r0 = r3 instanceof com.facebook.aura.conversation.viewmodel.HatchConversationAttachments.AnonymousClass1
            if (r0 == 0) goto L99
            r12 = r3
            com.facebook.aura.conversation.viewmodel.HatchConversationAttachments$acceptableImageUris$1 r12 = (com.facebook.aura.conversation.viewmodel.HatchConversationAttachments.AnonymousClass1) r12
            int r2 = r12.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L99
            int r2 = r2 - r1
            r12.label = r2
        L14:
            java.lang.Object r6 = r12.result
            X.Hji r11 = X.EnumC10460Hji.A02
            int r0 = r12.label
            r10 = 1
            if (r0 == 0) goto L82
            if (r0 != r10) goto Lc2
            int r5 = r12.I$2
            int r9 = r12.I$1
            long r2 = r12.J$0
            int r4 = r12.I$0
            java.lang.Object r13 = r12.L$3
            java.lang.Object r1 = r12.L$2
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r8 = r12.L$1
            java.util.List r8 = (java.util.List) r8
            X.Hwg.A00(r6)
        L34:
            java.lang.Number r6 = (java.lang.Number) r6
            if (r6 != 0) goto L73
            int r9 = r9 + 1
        L3a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto La0
            java.lang.String r13 = X.AnonymousClass005.A0j(r1)
            android.net.Uri r6 = android.net.Uri.parse(r13)
            com.facebook.aura.composer.util.HatchRemoteImageFetcher r0 = com.facebook.aura.composer.util.HatchRemoteImageFetcher.INSTANCE
            X.C7384Etj.A0X(r6)
            boolean r0 = r0.isRemote(r6)
            if (r0 == 0) goto L57
            r8.add(r13)
            goto L3a
        L57:
            r0 = 0
            r12.L$0 = r0
            r12.L$1 = r8
            r12.L$2 = r1
            r12.L$3 = r13
            r12.L$4 = r0
            r12.I$0 = r4
            r12.J$0 = r2
            r12.I$1 = r9
            r12.I$2 = r5
            r12.label = r10
            java.lang.Object r6 = r14.getFileSizeBytes(r6, r2, r12)
            if (r6 != r11) goto L34
            return r11
        L73:
            long r6 = r6.longValue()
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 <= 0) goto L7e
            int r5 = r5 + 1
            goto L3a
        L7e:
            r8.add(r13)
            goto L3a
        L82:
            X.Hwg.A00(r6)
            int r4 = r14.getEffectiveMaxUploadSizeLimitMb()
            long r2 = (long) r4
            r0 = 1024(0x400, double:5.06E-321)
            long r2 = r2 * r0
            long r2 = r2 * r0
            java.util.ArrayList r8 = X.C3cG.A0h()
            java.util.Iterator r1 = r15.iterator()
            r5 = 0
            r9 = 0
            goto L3a
        L99:
            com.facebook.aura.conversation.viewmodel.HatchConversationAttachments$acceptableImageUris$1 r12 = new com.facebook.aura.conversation.viewmodel.HatchConversationAttachments$acceptableImageUris$1
            r12.<init>(r3)
            goto L14
        La0:
            com.facebook.aura.conversation.viewmodel.AttachmentUploadAnalytics r2 = com.facebook.aura.conversation.viewmodel.AttachmentUploadAnalytics.INSTANCE
            com.facebook.aura.conversation.viewmodel.UploadRejectionReason r0 = com.facebook.aura.conversation.viewmodel.UploadRejectionReason.TooLarge
            com.facebook.aura.composer.upload.AttachmentCategory r1 = com.facebook.aura.composer.upload.AttachmentCategory.IMAGE
            r2.rejected(r0, r1, r5)
            com.facebook.aura.conversation.viewmodel.UploadRejectionReason r0 = com.facebook.aura.conversation.viewmodel.UploadRejectionReason.ReadFailed
            r2.rejected(r0, r1, r9)
            if (r5 <= 0) goto Lbb
            X.3Em<com.facebook.aura.conversation.viewmodel.HatchConversationViewEffect> r1 = r14.viewEffects
            com.facebook.aura.conversation.viewmodel.HatchConversationViewEffect$ShowUploadSizeExceeded r0 = new com.facebook.aura.conversation.viewmodel.HatchConversationViewEffect$ShowUploadSizeExceeded
            r0.<init>(r4)
        Lb7:
            r1.AhV(r0)
        Lba:
            return r8
        Lbb:
            if (r9 <= 0) goto Lba
            X.3Em<com.facebook.aura.conversation.viewmodel.HatchConversationViewEffect> r1 = r14.viewEffects
            com.facebook.aura.conversation.viewmodel.HatchConversationViewEffect$ShowAttachmentUploadFailed r0 = com.facebook.aura.conversation.viewmodel.HatchConversationViewEffect.ShowAttachmentUploadFailed.INSTANCE
            goto Lb7
        Lc2:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.viewmodel.HatchConversationAttachments.acceptableImageUris(java.util.List, X.HtJ):java.lang.Object");
    }

    public static /* synthetic */ void addPendingFileUri$default(HatchConversationAttachments hatchConversationAttachments, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "application/octet-stream";
        }
        hatchConversationAttachments.addPendingFileUri(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelUpload(String str) {
        HatchConversationUiState value;
        HatchConversationUiState hatchConversationUiState;
        HatchPendingAttachment hatchPendingAttachmentRemove = this.pendingAttachments.remove(str);
        if (hatchPendingAttachmentRemove != null) {
            AnonymousClass002.A1K(hatchPendingAttachmentRemove.uploadJob);
            BLG<HatchConversationUiState> blg = this.uiState;
            do {
                value = blg.getValue();
                hatchConversationUiState = value;
            } while (!blg.A6e(value, HatchConversationUiState.copy$default(hatchConversationUiState, false, false, false, false, false, false, 0, null, false, null, null, AGI.A0H(BGK.A04(str, hatchConversationUiState.uploadingFileUris)), AGI.A0H(BGK.A04(str, hatchConversationUiState.failedUploadUris)), null, null, false, false, false, null, null, null, null, null, null, null, null, false, 0, false, false, false, false, null, null, false, -6145, 7, null)));
        }
    }

    private final int getMaxUploadSizeLimitMb() {
        return BV5.A05(this, this.maxUploadSizeLimitMb$delegate, $$delegatedProperties, 0);
    }

    private final LiveSessionAttachmentLimit liveSessionAttachmentLimit() {
        LiveSession liveSessionForSession = LiveSessions.INSTANCE.forSession(this.userSession);
        if (liveSessionForSession != null) {
            return liveSessionForSession.attachmentLimit(this.isPrimaryThread ? null : this.sessionId);
        }
        return null;
    }

    private final void logRemoval(String str) {
        UploadChipAction uploadChipAction;
        HatchPendingAttachment hatchPendingAttachment = this.pendingAttachments.get(str);
        if (hatchPendingAttachment != null) {
            HatchConversationUiState value = this.uiState.getValue();
            if (value.failedUploadUris.contains(str)) {
                uploadChipAction = UploadChipAction.RemovedFailed;
            } else if (!value.uploadingFileUris.contains(str)) {
                return;
            } else {
                uploadChipAction = hatchPendingAttachment.logAttachment.uploadStarted.get() ? UploadChipAction.RemovedUploading : UploadChipAction.RemovedImporting;
            }
            if (uploadChipAction != UploadChipAction.RemovedImporting) {
                this.removedAttachmentCount++;
            }
            AttachmentUploadAnalytics.INSTANCE.chipAction(hatchPendingAttachment.logAttachment, uploadChipAction);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* renamed from: loggedUpload-hUnOzRk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m710loggedUploadhUnOzRk(com.facebook.aura.composer.upload.HatchAttachmentUploader r14, java.io.File r15, java.lang.String r16, com.facebook.aura.composer.upload.UploadLogAttachment r17, int r18, X.HtJ<? super X.HsJ<kotlin.Unit>> r19) {
        /*
            r13 = this;
            r12 = r18
            r3 = r19
            r11 = r17
            boolean r0 = r3 instanceof com.facebook.aura.conversation.viewmodel.HatchConversationAttachments$loggedUpload$1
            if (r0 == 0) goto L64
            r10 = r3
            com.facebook.aura.conversation.viewmodel.HatchConversationAttachments$loggedUpload$1 r10 = (com.facebook.aura.conversation.viewmodel.HatchConversationAttachments$loggedUpload$1) r10
            int r2 = r10.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L64
            int r2 = r2 - r1
            r10.label = r2
        L18:
            java.lang.Object r2 = r10.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r10.label
            r3 = 1
            if (r0 == 0) goto L3d
            if (r0 != r3) goto L6a
            long r0 = r10.J$0
            int r12 = r10.I$0
            java.lang.Object r11 = r10.L$3
            com.facebook.aura.composer.upload.UploadLogAttachment r11 = (com.facebook.aura.composer.upload.UploadLogAttachment) r11
            java.lang.Object r2 = X.AnonymousClass001.A0q(r2)
        L2f:
            com.facebook.aura.conversation.viewmodel.AttachmentUploadAnalytics r10 = com.facebook.aura.conversation.viewmodel.AttachmentUploadAnalytics.INSTANCE
            java.lang.Throwable r13 = X.HsJ.A00(r2)
            long r14 = X.C3cG.A04(r0)
            r10.attemptFinished(r11, r12, r13, r14)
            return r2
        L3d:
            X.Hwg.A00(r2)
            long r0 = android.os.SystemClock.elapsedRealtime()
            X.CGz r8 = r13.userSession
            r2 = 0
            r10.L$0 = r2
            r10.L$1 = r2
            r10.L$2 = r2
            r10.L$3 = r11
            r10.I$0 = r12
            r10.J$0 = r0
            r10.label = r3
            com.facebook.aura.composer.upload.FileUploader r2 = com.facebook.aura.composer.upload.HatchAttachmentUploader.ComposerFileUploader
            com.facebook.aura.composer.upload.HatchAttachmentUploader$upload$2 r9 = com.facebook.aura.composer.upload.HatchAttachmentUploader$upload$2.INSTANCE
            r5 = r14
            r6 = r15
            r7 = r16
            java.lang.Object r2 = r5.m427uploadyxL6bBk(r6, r7, r8, r9, r10)
            if (r2 != r4) goto L2f
            return r4
        L64:
            com.facebook.aura.conversation.viewmodel.HatchConversationAttachments$loggedUpload$1 r10 = new com.facebook.aura.conversation.viewmodel.HatchConversationAttachments$loggedUpload$1
            r10.<init>(r13, r3)
            goto L18
        L6a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.viewmodel.HatchConversationAttachments.m710loggedUploadhUnOzRk(com.facebook.aura.composer.upload.HatchAttachmentUploader, java.io.File, java.lang.String, com.facebook.aura.composer.upload.UploadLogAttachment, int, X.HtJ):java.lang.Object");
    }

    private final void startAttachmentPreparation(String str, String str2, AttachmentCategory attachmentCategory, UploadLogAttachment uploadLogAttachment) {
        HatchConversationUiState value;
        HatchConversationUiState hatchConversationUiState;
        if (this.pendingAttachments.containsKey(str)) {
            return;
        }
        BLG<HatchConversationUiState> blg = this.uiState;
        do {
            value = blg.getValue();
            hatchConversationUiState = value;
        } while (!blg.A6e(value, HatchConversationUiState.copy$default(hatchConversationUiState, false, false, false, false, false, false, 0, null, false, null, null, AGI.A0H(BGK.A02(str, hatchConversationUiState.uploadingFileUris)), null, null, null, false, false, false, null, null, null, null, null, null, null, null, false, 0, false, false, false, false, null, null, false, -2049, 7, null)));
        int effectiveMaxUploadSizeLimitMb = getEffectiveMaxUploadSizeLimitMb();
        Uri uri = Uri.parse(str);
        Context context = this.context;
        C7384Etj.A0X(uri);
        String strResolveAttachmentFilename = AttachmentFilenamesKt.resolveAttachmentFilename(context, uri, str2);
        String strMakeUploadPath = HatchAttachmentStaging.INSTANCE.makeUploadPath(strResolveAttachmentFilename);
        HatchAttachmentUploader hatchAttachmentUploader = new HatchAttachmentUploader(HatchAttachmentUploader.ComposerFileUploader);
        C10550Hrx c10550HrxA01 = GAo.A01(C79.A01, AnonymousClass001.A0y(), new HatchConversationAttachments$startAttachmentPreparation$job$1(attachmentCategory, this, str, uri, effectiveMaxUploadSizeLimitMb * 1024 * 1024, uploadLogAttachment, hatchAttachmentUploader, strMakeUploadPath, null), this.scope);
        this.pendingAttachments.put(str, new HatchPendingAttachment(null, strResolveAttachmentFilename, str2, attachmentCategory, strMakeUploadPath, c10550HrxA01, false, uploadLogAttachment));
        c10550HrxA01.Afv();
        AnonymousClass001.A1J(new C115312(c10550HrxA01, this, str, attachmentCategory, effectiveMaxUploadSizeLimitMb, null), this.scope);
    }

    public static /* synthetic */ void startAttachmentPreparation$default(HatchConversationAttachments hatchConversationAttachments, String str, String str2, AttachmentCategory attachmentCategory, UploadLogAttachment uploadLogAttachment, int i, Object obj) {
        if ((i & 8) != 0) {
            uploadLogAttachment = new UploadLogAttachment(AnonymousClass002.A0k(), str2, 0);
        }
        hatchConversationAttachments.startAttachmentPreparation(str, str2, attachmentCategory, uploadLogAttachment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startEagerImageUpload(String str) {
        startAttachmentPreparation$default(this, str, MediaDeviceSyncClientKt.FALLBACK_MIME, AttachmentCategory.IMAGE, null, 8, null);
    }

    public final void addPendingFileUri(String str, String str2) {
        HatchSendMessage value;
        HatchSendMessage hatchSendMessageCopy$default;
        boolean z;
        boolean zA1a = AnonymousClass002.A1a(str, str2);
        BLG<HatchSendMessage> blg = this.pendingMessage;
        do {
            value = blg.getValue();
            hatchSendMessageCopy$default = value;
            z = false;
            if (hatchSendMessageCopy$default.imageUris.size() + hatchSendMessageCopy$default.fileUris.size() < 10) {
                z = true;
                hatchSendMessageCopy$default = HatchSendMessage.copy$default(hatchSendMessageCopy$default, null, null, null, null, AbstractC0878AGe.A0Q(new HatchPendingFile(str, str2), hatchSendMessageCopy$default.fileUris), null, null, null, null, false, null, null, null, 8175, null);
            }
        } while (!blg.A6e(value, hatchSendMessageCopy$default));
        if (z) {
            startAttachmentPreparation$default(this, str, str2, AttachmentCategory.Companion.fromMimeType(str2), null, 8, null);
        } else {
            AttachmentUploadAnalytics.INSTANCE.rejected(UploadRejectionReason.AttachmentCap, AttachmentCategory.Companion.fromMimeType(str2), zA1a ? 1 : 0);
            this.viewEffects.AhV(HatchConversationViewEffect.ShowAttachmentLimitReached.INSTANCE);
        }
    }

    public final void clearPending() {
        Iterator itA10 = BV5.A10(this.pendingAttachments);
        while (itA10.hasNext()) {
            AnonymousClass002.A1K(((HatchPendingAttachment) itA10.next()).uploadJob);
        }
        this.pendingAttachments.clear();
        this.removedAttachmentCount = 0;
    }

    public final C1BN<Integer> getStagingImageBatchCount() {
        return this.stagingImageBatchCount;
    }

    public final void removePendingFileUri(int i) {
        String str;
        HatchSendMessage value;
        HatchSendMessage hatchSendMessage;
        ArrayList arrayListA0h;
        HatchPendingFile hatchPendingFile = (HatchPendingFile) AbstractC0878AGe.A0A(i, this.pendingMessage.getValue().fileUris);
        if (hatchPendingFile == null || (str = hatchPendingFile.uri) == null) {
            return;
        }
        logRemoval(str);
        cancelUpload(str);
        BLG<HatchSendMessage> blg = this.pendingMessage;
        do {
            value = blg.getValue();
            hatchSendMessage = value;
            List<HatchPendingFile> list = hatchSendMessage.fileUris;
            arrayListA0h = C3cG.A0h();
            int i2 = 0;
            for (HatchPendingFile hatchPendingFile2 : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    AbstractC0885AGm.A14();
                    throw F60.createAndThrow();
                }
                if (i2 != i) {
                    arrayListA0h.add(hatchPendingFile2);
                }
                i2 = i3;
            }
        } while (!blg.A6e(value, HatchSendMessage.copy$default(hatchSendMessage, null, null, null, null, arrayListA0h, null, null, null, null, false, null, null, null, 8175, null)));
    }

    public final void removePendingImageUri(int i) {
        HatchSendMessage value;
        HatchSendMessage hatchSendMessage;
        ArrayList arrayListA0h;
        String str = (String) AbstractC0878AGe.A0A(i, this.pendingMessage.getValue().imageUris);
        if (str != null) {
            logRemoval(str);
            cancelUpload(str);
        }
        BLG<HatchSendMessage> blg = this.pendingMessage;
        do {
            value = blg.getValue();
            hatchSendMessage = value;
            List<String> list = hatchSendMessage.imageUris;
            arrayListA0h = C3cG.A0h();
            int i2 = 0;
            for (String str2 : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    AbstractC0885AGm.A14();
                    throw F60.createAndThrow();
                }
                if (i2 != i) {
                    arrayListA0h.add(str2);
                }
                i2 = i3;
            }
        } while (!blg.A6e(value, HatchSendMessage.copy$default(hatchSendMessage, null, null, null, arrayListA0h, null, null, null, null, null, false, null, null, null, 8183, null)));
    }

    public final Map<String, String> snapshotUploadedFilePaths() {
        Map<String, HatchPendingAttachment> map = this.pendingAttachments;
        C7384Etj.A0Y(map, 0);
        B3i b3iA03 = A6B.A03(C115301.INSTANCE, AbstractC0878AGe.A06(map.entrySet()));
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        BTQ btq = new BTQ(b3iA03);
        while (btq.hasNext()) {
            Map.Entry entry = (Map.Entry) btq.next();
            linkedHashMapA0j.put(entry.getKey(), ((HatchPendingAttachment) entry.getValue()).uploadPath);
        }
        return linkedHashMapA0j;
    }

    public final List<C27k<HsJ<Unit>>> uploadJobs() {
        Collection<HatchPendingAttachment> collectionValues = this.pendingAttachments.values();
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<HatchPendingAttachment> it = collectionValues.iterator();
        while (it.hasNext()) {
            C27k<HsJ<Unit>> c27k = it.next().uploadJob;
            if (c27k != null) {
                arrayListA0h.add(c27k);
            }
        }
        return arrayListA0h;
    }

    private final int getEffectiveMaxUploadSizeLimitMb() {
        if (getMaxUploadSizeLimitMb() > 0) {
            return getMaxUploadSizeLimitMb();
        }
        return 25;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getFileSizeBytes(Uri uri, long j, HtJ<? super Long> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C115292(uri, j, null));
    }

    private final LiveSessionAttachmentLimit tighterLiveSessionAttachmentLimit() {
        LiveSessionAttachmentLimit liveSessionAttachmentLimit = liveSessionAttachmentLimit();
        if (liveSessionAttachmentLimit == null || liveSessionAttachmentLimit.maxAttachments >= 10) {
            return null;
        }
        return liveSessionAttachmentLimit;
    }

    public final boolean allowsFileAttachments() {
        LiveSessionAttachmentLimit liveSessionAttachmentLimit = liveSessionAttachmentLimit();
        if (liveSessionAttachmentLimit != null) {
            return AnonymousClass003.A1Y(liveSessionAttachmentLimit.filesAllowed);
        }
        return true;
    }

    public final Integer attachmentPickerLimit() {
        LiveSessionAttachmentLimit liveSessionAttachmentLimitTighterLiveSessionAttachmentLimit = tighterLiveSessionAttachmentLimit();
        int iAttachmentCount = (liveSessionAttachmentLimitTighterLiveSessionAttachmentLimit != null ? liveSessionAttachmentLimitTighterLiveSessionAttachmentLimit.maxAttachments : 10) - HatchConversationAttachmentsKt.attachmentCount(this.pendingMessage.getValue());
        if (iAttachmentCount > 0) {
            return Integer.valueOf(iAttachmentCount);
        }
        this.viewEffects.AhV(liveSessionAttachmentLimitTighterLiveSessionAttachmentLimit != null ? new HatchConversationViewEffect.ShowLiveSessionAttachmentMessage(liveSessionAttachmentLimitTighterLiveSessionAttachmentLimit.limitReachedMessageRes) : HatchConversationViewEffect.ShowAttachmentLimitReached.INSTANCE);
        return null;
    }

    public final void logSendOutcome(HatchSendMessage hatchSendMessage, Set<String> set) {
        boolean zA1Y = C60P.A1Y(hatchSendMessage, set);
        List<String> list = hatchSendMessage.imageUris;
        List<HatchPendingFile> list2 = hatchSendMessage.fileUris;
        ArrayList arrayListA0i = AnonymousClass003.A0i(list2);
        Iterator<HatchPendingFile> it = list2.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(it.next().uri);
        }
        ArrayList arrayListA0P = AbstractC0878AGe.A0P(arrayListA0i, list);
        if (arrayListA0P.isEmpty() && this.removedAttachmentCount == 0) {
            return;
        }
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator it2 = arrayListA0P.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (set.contains(next)) {
                arrayListA0h.add(next);
            }
        }
        Iterator it3 = arrayListA0h.iterator();
        while (it3.hasNext()) {
            HatchPendingAttachment hatchPendingAttachment = this.pendingAttachments.get(it3.next());
            if (hatchPendingAttachment != null) {
                AttachmentUploadAnalytics.INSTANCE.chipAction(hatchPendingAttachment.logAttachment, UploadChipAction.SentWithoutFailed);
            }
        }
        AttachmentUploadAnalytics attachmentUploadAnalytics = AttachmentUploadAnalytics.INSTANCE;
        int size = arrayListA0P.size();
        int i = 0;
        if (!(arrayListA0P instanceof Collection) || !arrayListA0P.isEmpty()) {
            Iterator it4 = arrayListA0P.iterator();
            while (it4.hasNext()) {
                HatchPendingAttachment hatchPendingAttachment2 = this.pendingAttachments.get(it4.next());
                if (hatchPendingAttachment2 != null && hatchPendingAttachment2.uploadSucceeded == zA1Y && (i = i + 1) < 0) {
                    AbstractC0885AGm.A13();
                    throw F60.createAndThrow();
                }
            }
        }
        attachmentUploadAnalytics.sendOutcome(size, i, arrayListA0h.size(), this.removedAttachmentCount);
    }

    /* renamed from: com.facebook.aura.conversation.viewmodel.HatchConversationAttachments$snapshotUploadedFilePaths$1, reason: invalid class name and case insensitive filesystem */
    public final class C115301 extends AbstractC7559F3s implements G0U<Map.Entry<? extends String, ? extends HatchPendingAttachment>, Boolean> {
        public static final C115301 INSTANCE = new C115301();

        public C115301() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Boolean invoke2(Map.Entry<String, HatchPendingAttachment> entry) {
            C7384Etj.A0Y(entry, 0);
            return Boolean.valueOf(entry.getValue().uploadSucceeded);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Boolean invoke(Map.Entry<? extends String, ? extends HatchPendingAttachment> entry) {
            return invoke2((Map.Entry<String, HatchPendingAttachment>) entry);
        }
    }
}

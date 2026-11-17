package com.facebook.aura.file.view;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C1BO;
import X.C3UX;
import X.CFK;
import X.EnumC10460Hji;
import X.FGI;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.gateway.HatchFileOperations;
import com.facebook.aura.gateway.HatchThumbnailDisplaySize;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.file.view.FileThumbnailPreviewKt$ResolveFileTitle$1$1", f = "FileThumbnailPreview.kt", l = {246}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class FileThumbnailPreviewKt$ResolveFileTitle$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C1BO<G0U<String, Unit>> $currentCallback$delegate;
    public final /* synthetic */ String $relativePath;
    public final /* synthetic */ AbstractC3358CGz $userSession;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FileThumbnailPreviewKt$ResolveFileTitle$1$1(String str, AbstractC3358CGz abstractC3358CGz, C1BO<? extends G0U<? super String, Unit>> c1bo, HtJ<? super FileThumbnailPreviewKt$ResolveFileTitle$1$1> htJ) {
        super(2, htJ);
        this.$relativePath = str;
        this.$userSession = abstractC3358CGz;
        this.$currentCallback$delegate = c1bo;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new FileThumbnailPreviewKt$ResolveFileTitle$1$1(this.$relativePath, this.$userSession, this.$currentCallback$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        HatchFileOperations.ThumbnailFetchOutcome thumbnailFetchOutcome;
        HatchFileOperations.ThumbnailResult thumbnailResult;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        String str = null;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            CFK.A06(FileThumbnailPreviewKt.TAG, FGI.A0d("Title fetch failed for ", this.$relativePath, ": ", e2.getMessage()));
            thumbnailFetchOutcome = null;
        }
        if (i == 0) {
            Hwg.A00(obj);
            ThumbnailTitleCache thumbnailTitleCache = ThumbnailTitleCache.INSTANCE;
            String strTitle = thumbnailTitleCache.title(this.$relativePath);
            if (strTitle != null) {
                C1BO<G0U<String, Unit>> c1bo = this.$currentCallback$delegate;
                float f = FileThumbnailPreviewKt.MARKDOWN_PREVIEW_VIRTUAL_WIDTH;
                C1BO.A0B(c1bo).invoke(strTitle);
            } else if (!thumbnailTitleCache.hasAttempted(this.$relativePath)) {
                HatchFileOperations hatchFileOperations = HatchFileOperations.INSTANCE;
                String str2 = this.$relativePath;
                AbstractC3358CGz abstractC3358CGz = this.$userSession;
                HatchThumbnailDisplaySize hatchThumbnailDisplaySize = HatchThumbnailDisplaySize.MEDIUM;
                this.label = 1;
                obj = hatchFileOperations.fetchThumbnailBytes(str2, abstractC3358CGz, hatchThumbnailDisplaySize, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        thumbnailFetchOutcome = (HatchFileOperations.ThumbnailFetchOutcome) obj;
        HatchFileOperations.ThumbnailFetchOutcome.Success success = thumbnailFetchOutcome instanceof HatchFileOperations.ThumbnailFetchOutcome.Success ? (HatchFileOperations.ThumbnailFetchOutcome.Success) thumbnailFetchOutcome : null;
        if (success != null && (thumbnailResult = success.result) != null) {
            str = thumbnailResult.fileTitle;
        }
        ThumbnailTitleCache.INSTANCE.record(this.$relativePath, str);
        if (str != null) {
            C1BO<G0U<String, Unit>> c1bo2 = this.$currentCallback$delegate;
            float f2 = FileThumbnailPreviewKt.MARKDOWN_PREVIEW_VIRTUAL_WIDTH;
            C1BO.A0B(c1bo2).invoke(str);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((FileThumbnailPreviewKt$ResolveFileTitle$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}

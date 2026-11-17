package com.facebook.aura.file.utils;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C10543Hqv;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import android.net.Uri;
import com.facebook.aura.gateway.HatchFileOperations;
import java.io.IOException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.file.utils.HatchFileUIUtils$downloadMarkdownAsPdf$savedUri$1", f = "HatchFileUIUtils.kt", l = {981}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class HatchFileUIUtils$downloadMarkdownAsPdf$savedUri$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Uri>, Object> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C10543Hqv<String> $failureType;
    public final /* synthetic */ String $pdfFileName;
    public final /* synthetic */ String $relativePath;
    public final /* synthetic */ long $startTime;
    public final /* synthetic */ AbstractC3358CGz $userSession;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchFileUIUtils$downloadMarkdownAsPdf$savedUri$1(String str, AbstractC3358CGz abstractC3358CGz, long j, C10543Hqv<String> c10543Hqv, Context context, String str2, HtJ<? super HatchFileUIUtils$downloadMarkdownAsPdf$savedUri$1> htJ) {
        super(2, htJ);
        this.$relativePath = str;
        this.$userSession = abstractC3358CGz;
        this.$startTime = j;
        this.$failureType = c10543Hqv;
        this.$context = context;
        this.$pdfFileName = str2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        HatchFileUIUtils$downloadMarkdownAsPdf$savedUri$1 hatchFileUIUtils$downloadMarkdownAsPdf$savedUri$1 = new HatchFileUIUtils$downloadMarkdownAsPdf$savedUri$1(this.$relativePath, this.$userSession, this.$startTime, this.$failureType, this.$context, this.$pdfFileName, htJ);
        hatchFileUIUtils$downloadMarkdownAsPdf$savedUri$1.L$0 = obj;
        return hatchFileUIUtils$downloadMarkdownAsPdf$savedUri$1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) throws IOException {
        Object obj2 = this.L$0;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchFileOperations hatchFileOperations = HatchFileOperations.INSTANCE;
            String str = this.$relativePath;
            AbstractC3358CGz abstractC3358CGz = this.$userSession;
            this.L$0 = obj2;
            this.label = 1;
            obj = hatchFileOperations.exportPdf(str, abstractC3358CGz, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr == null) {
            HatchShareDownloadLogger.INSTANCE.logActionFailed("download_markdown_pdf", this.$relativePath, "pdf_export_failed", HatchShareDownloadLogger.clock.now() - this.$startTime);
            this.$failureType.element = "pdf_export_failed";
            return null;
        }
        int i2 = HatchFileUIUtils.$stable;
        Uri uriSaveToDownloads = MarkdownPdfRenderer.INSTANCE.saveToDownloads(this.$context, this.$pdfFileName, "application/pdf", bArr);
        if (uriSaveToDownloads != null) {
            return uriSaveToDownloads;
        }
        HatchShareDownloadLogger.INSTANCE.logActionFailed("download_markdown_pdf", this.$relativePath, "save_to_downloads_failed", HatchShareDownloadLogger.clock.now() - this.$startTime);
        return null;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Uri> htJ) {
        return ((HatchFileUIUtils$downloadMarkdownAsPdf$savedUri$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}

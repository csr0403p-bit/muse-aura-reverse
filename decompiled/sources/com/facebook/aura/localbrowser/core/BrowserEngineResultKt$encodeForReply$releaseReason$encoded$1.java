package com.facebook.aura.localbrowser.core;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.hatch.browser.core.CommandReport;
import com.hatch.browser.protocol.ReportEncodingOptions;
import com.hatch.browser.protocol.ReportImageFormat;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.localbrowser.core.BrowserEngineResultKt$encodeForReply$releaseReason$encoded$1", f = "BrowserEngineResult.kt", l = {54}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class BrowserEngineResultKt$encodeForReply$releaseReason$encoded$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super byte[]>, Object> {
    public final /* synthetic */ ReportImageFormat $imageFormat;
    public final /* synthetic */ int $maxBytes;
    public final /* synthetic */ CommandReport $this_encodeForReply;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrowserEngineResultKt$encodeForReply$releaseReason$encoded$1(CommandReport commandReport, ReportImageFormat reportImageFormat, int i, HtJ<? super BrowserEngineResultKt$encodeForReply$releaseReason$encoded$1> htJ) {
        super(2, htJ);
        this.$this_encodeForReply = commandReport;
        this.$imageFormat = reportImageFormat;
        this.$maxBytes = i;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new BrowserEngineResultKt$encodeForReply$releaseReason$encoded$1(this.$this_encodeForReply, this.$imageFormat, this.$maxBytes, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            CommandReport commandReport = this.$this_encodeForReply;
            ReportEncodingOptions reportEncodingOptions = new ReportEncodingOptions(this.$imageFormat, this.$maxBytes);
            this.label = 1;
            obj = commandReport.encodeCompact(reportEncodingOptions, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return obj;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super byte[]> htJ) {
        return ((BrowserEngineResultKt$encodeForReply$releaseReason$encoded$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}

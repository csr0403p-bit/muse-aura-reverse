package com.hatch.browser.protocol;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AnonymousClass003;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeReportEnvelope implements FfiConverterRustBuffer<ReportEnvelope> {
    public static final int $stable = 0;
    public static final FfiConverterTypeReportEnvelope INSTANCE = new FfiConverterTypeReportEnvelope();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(ReportEnvelope reportEnvelope) {
        C7384Etj.A0Y(reportEnvelope, 0);
        return 4 + FfiConverterTypeReportView.INSTANCE.mo3323allocationSizeI7RO_PI(reportEnvelope.report);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ ReportEnvelope lift(RustBuffer.ByValue byValue) {
        return (ReportEnvelope) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ ReportEnvelope liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (ReportEnvelope) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(ReportEnvelope reportEnvelope) {
        return lower((Object) reportEnvelope);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(ReportEnvelope reportEnvelope) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, reportEnvelope);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public ReportEnvelope read(ByteBuffer byteBuffer) {
        return new ReportEnvelope(AbstractC7609F5w.A0H(byteBuffer), FfiConverterTypeReportView.INSTANCE.read(byteBuffer));
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(ReportEnvelope reportEnvelope, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(reportEnvelope, byteBuffer);
        byteBuffer.putInt(reportEnvelope.apiVersion);
        FfiConverterTypeReportView.INSTANCE.write(reportEnvelope.report, byteBuffer);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ /* synthetic */ Object lift(RustBuffer.ByValue byValue) {
        return AbstractC7610F5x.A0r(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ /* synthetic */ Object liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: lowerIntoRustBuffer */
    public /* bridge */ /* synthetic */ RustBuffer.ByValue lower(Object obj) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, obj);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.ReportEnvelope, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ ReportEnvelope lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}

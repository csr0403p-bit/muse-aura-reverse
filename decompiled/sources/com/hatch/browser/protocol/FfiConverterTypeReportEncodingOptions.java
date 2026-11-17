package com.hatch.browser.protocol;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AbstractC7611F5y;
import X.AnonymousClass003;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeReportEncodingOptions implements FfiConverterRustBuffer<ReportEncodingOptions> {
    public static final int $stable = 0;
    public static final FfiConverterTypeReportEncodingOptions INSTANCE = new FfiConverterTypeReportEncodingOptions();

    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name */
    public long m3523allocationSizeI7RO_PI(ReportEncodingOptions reportEncodingOptions) {
        C7384Etj.A0Y(reportEncodingOptions, 0);
        return 8L;
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public ReportEncodingOptions read(ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 0);
        return new ReportEncodingOptions(FfiConverterTypeReportImageFormat.INSTANCE.read(byteBuffer), byteBuffer.getInt());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ ReportEncodingOptions lift(RustBuffer.ByValue byValue) {
        return (ReportEncodingOptions) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ ReportEncodingOptions liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (ReportEncodingOptions) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(ReportEncodingOptions reportEncodingOptions) {
        return lower((Object) reportEncodingOptions);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(ReportEncodingOptions reportEncodingOptions) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, reportEncodingOptions);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(ReportEncodingOptions reportEncodingOptions, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(reportEncodingOptions, byteBuffer);
        AbstractC7611F5y.A0q(reportEncodingOptions.imageFormat, byteBuffer);
        byteBuffer.putInt(reportEncodingOptions.maxBytes);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI */
    public /* bridge */ /* synthetic */ long mo3323allocationSizeI7RO_PI(Object obj) {
        C7384Etj.A0Y(obj, 0);
        return 8L;
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.ReportEncodingOptions, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ ReportEncodingOptions lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}

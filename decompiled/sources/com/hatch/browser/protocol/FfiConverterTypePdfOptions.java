package com.hatch.browser.protocol;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AnonymousClass003;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypePdfOptions implements FfiConverterRustBuffer<PdfOptions> {
    public static final int $stable = 0;
    public static final FfiConverterTypePdfOptions INSTANCE = new FfiConverterTypePdfOptions();

    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name */
    public long m3509allocationSizeI7RO_PI(PdfOptions pdfOptions) {
        C7384Etj.A0Y(pdfOptions, 0);
        return 2L;
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public PdfOptions read(ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 0);
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        return new PdfOptions(AbstractC7610F5x.A1V(ffiConverterBoolean, byteBuffer), AbstractC7610F5x.A1V(ffiConverterBoolean, byteBuffer));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ PdfOptions lift(RustBuffer.ByValue byValue) {
        return (PdfOptions) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ PdfOptions liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (PdfOptions) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(PdfOptions pdfOptions) {
        return lower((Object) pdfOptions);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(PdfOptions pdfOptions) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, pdfOptions);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(PdfOptions pdfOptions, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(pdfOptions, byteBuffer);
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        ffiConverterBoolean.write(pdfOptions.printBackground, byteBuffer);
        ffiConverterBoolean.write(pdfOptions.preferCssPageSize, byteBuffer);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI */
    public /* bridge */ /* synthetic */ long mo3323allocationSizeI7RO_PI(Object obj) {
        C7384Etj.A0Y(obj, 0);
        return 2L;
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.PdfOptions, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ PdfOptions lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}

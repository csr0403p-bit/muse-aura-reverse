package com.hatch.browser.protocol;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AnonymousClass003;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeViewMotion implements FfiConverterRustBuffer<ViewMotion> {
    public static final int $stable = 0;
    public static final FfiConverterTypeViewMotion INSTANCE = new FfiConverterTypeViewMotion();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(ViewMotion viewMotion) {
        C7384Etj.A0Y(viewMotion, 0);
        return 8 + AbstractC7610F5x.A0W(viewMotion.edge) + FfiConverterSequenceTypeViewLanding.INSTANCE.mo3323allocationSizeI7RO_PI(viewMotion.landing);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public ViewMotion read(ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 0);
        return new ViewMotion(byteBuffer.getDouble(), FfiConverterOptionalTypeViewEdge.INSTANCE.read(byteBuffer), FfiConverterSequenceTypeViewLanding.INSTANCE.read(byteBuffer));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ ViewMotion lift(RustBuffer.ByValue byValue) {
        return (ViewMotion) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ ViewMotion liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (ViewMotion) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(ViewMotion viewMotion) {
        return lower((Object) viewMotion);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(ViewMotion viewMotion) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, viewMotion);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(ViewMotion viewMotion, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(viewMotion, byteBuffer);
        byteBuffer.putDouble(viewMotion.scrolledY);
        FfiConverterOptionalTypeViewEdge.INSTANCE.write(viewMotion.edge, byteBuffer);
        FfiConverterSequenceTypeViewLanding.INSTANCE.write(viewMotion.landing, byteBuffer);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.ViewMotion, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ ViewMotion lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}

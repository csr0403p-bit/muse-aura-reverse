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
public final class FfiConverterTypeRedactedItems implements FfiConverterRustBuffer<RedactedItems> {
    public static final int $stable = 0;
    public static final FfiConverterTypeRedactedItems INSTANCE = new FfiConverterTypeRedactedItems();

    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name */
    public long m3517allocationSizeI7RO_PI(RedactedItems redactedItems) {
        C7384Etj.A0Y(redactedItems, 0);
        return 8L;
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public RedactedItems read(ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 0);
        return new RedactedItems(FfiConverterTypeRedactedValueKind.INSTANCE.read(byteBuffer), byteBuffer.getInt());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ RedactedItems lift(RustBuffer.ByValue byValue) {
        return (RedactedItems) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ RedactedItems liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (RedactedItems) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(RedactedItems redactedItems) {
        return lower((Object) redactedItems);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(RedactedItems redactedItems) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, redactedItems);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(RedactedItems redactedItems, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(redactedItems, byteBuffer);
        AbstractC7611F5y.A0q(redactedItems.kind, byteBuffer);
        byteBuffer.putInt(redactedItems.items);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.RedactedItems, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ RedactedItems lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}

package com.hatch.browser.protocol;

import X.AbstractC7607F5u;
import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes6.dex */
public final class FfiConverterOptionalSequenceTypeRedactedItems implements FfiConverterRustBuffer<List<? extends RedactedItems>> {
    public static final int $stable = 0;
    public static final FfiConverterOptionalSequenceTypeRedactedItems INSTANCE = new FfiConverterOptionalSequenceTypeRedactedItems();

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(List<RedactedItems> list, ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 1);
        if (list == null) {
            byteBuffer.put((byte) 0);
        } else {
            byteBuffer.put((byte) 1);
            FfiConverterSequenceTypeRedactedItems.INSTANCE.write(list, byteBuffer);
        }
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(List<RedactedItems> list) {
        if (list != null) {
            return FfiConverterSequenceTypeRedactedItems.INSTANCE.mo3323allocationSizeI7RO_PI(list) + 1;
        }
        return 1L;
    }

    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    /* renamed from: lift, reason: avoid collision after fix types in other method */
    public /* bridge */ List<? extends RedactedItems> lift2(RustBuffer.ByValue byValue) {
        return (List) AbstractC7609F5w.A0q(this, byValue);
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

    @Override // com.hatch.browser.protocol.FfiConverter
    public List<RedactedItems> read(ByteBuffer byteBuffer) {
        if (AbstractC7609F5w.A00(byteBuffer) == 0) {
            return null;
        }
        return FfiConverterSequenceTypeRedactedItems.INSTANCE.read(byteBuffer);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ /* synthetic */ Object lift(RustBuffer.ByValue byValue) {
        return AbstractC7610F5x.A0r(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ List<RedactedItems> liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return AbstractC7607F5u.A15(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(List<RedactedItems> list) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, list);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List<? extends com.hatch.browser.protocol.RedactedItems>] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ List<? extends RedactedItems> lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(List<RedactedItems> list) {
        return lower((Object) list);
    }
}

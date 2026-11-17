package com.hatch.browser.protocol;

import X.AbstractC7607F5u;
import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AbstractC7611F5y;
import X.AbstractC9315GDr;
import X.AnonymousClass005;
import X.C60O;
import X.C9314GDq;
import X.Hr7;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class FfiConverterSequenceString implements FfiConverterRustBuffer<List<? extends String>> {
    public static final int $stable = 0;
    public static final FfiConverterSequenceString INSTANCE = new FfiConverterSequenceString();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(List<String> list) {
        ArrayList arrayListA1E = Hr7.A1E(list);
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            C9314GDq.A00(arrayListA1E, FfiConverterString.INSTANCE.mo3323allocationSizeI7RO_PI(AnonymousClass005.A0j(it)));
        }
        return AbstractC9315GDr.A00(arrayListA1E);
    }

    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    /* renamed from: lift, reason: avoid collision after fix types in other method */
    public /* bridge */ List<? extends String> lift2(RustBuffer.ByValue byValue) {
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
    public List<String> read(ByteBuffer byteBuffer) {
        int iA0H = AbstractC7609F5w.A0H(byteBuffer);
        ArrayList arrayListA11 = C60O.A11(iA0H);
        for (int i = 0; i < iA0H; i++) {
            arrayListA11.add(AbstractC7607F5u.A12(byteBuffer));
        }
        return arrayListA11;
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(List<String> list, ByteBuffer byteBuffer) {
        AbstractC7611F5y.A18(list, byteBuffer);
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            FfiConverterString.INSTANCE.write(AnonymousClass005.A0j(it), byteBuffer);
        }
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ /* synthetic */ Object lift(RustBuffer.ByValue byValue) {
        return AbstractC7610F5x.A0r(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ List<String> liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return AbstractC7607F5u.A15(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(List<String> list) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, list);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List<? extends java.lang.String>] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ List<? extends String> lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(List<String> list) {
        return lower((Object) list);
    }
}

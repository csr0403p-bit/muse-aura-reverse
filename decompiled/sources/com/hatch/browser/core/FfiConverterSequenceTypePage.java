package com.hatch.browser.core;

import X.AbstractC7609F5w;
import X.AbstractC7611F5y;
import X.AbstractC9315GDr;
import X.C60O;
import X.C9314GDq;
import X.Hr7;
import com.hatch.browser.core.FfiConverter;
import com.hatch.browser.core.RustBuffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class FfiConverterSequenceTypePage implements FfiConverterRustBuffer<List<? extends Page>> {
    public static final int $stable = 0;
    public static final FfiConverterSequenceTypePage INSTANCE = new FfiConverterSequenceTypePage();

    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ /* synthetic */ Object lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0p(this, byValue);
    }

    @Override // com.hatch.browser.core.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3228allocationSizeI7RO_PI(List<? extends Page> list) {
        ArrayList arrayListA1E = Hr7.A1E(list);
        Iterator<? extends Page> it = list.iterator();
        while (it.hasNext()) {
            it.next();
            C9314GDq.A00(arrayListA1E, 8L);
        }
        return AbstractC9315GDr.A00(arrayListA1E);
    }

    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ List<Page> liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (List) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    @Override // com.hatch.browser.core.FfiConverter
    /* renamed from: lowerIntoRustBuffer */
    public /* bridge */ /* synthetic */ RustBuffer.ByValue lower(Object obj) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, obj);
    }

    @Override // com.hatch.browser.core.FfiConverter
    public List<Page> read(ByteBuffer byteBuffer) {
        int iA0H = AbstractC7609F5w.A0H(byteBuffer);
        ArrayList arrayListA11 = C60O.A11(iA0H);
        for (int i = 0; i < iA0H; i++) {
            arrayListA11.add(FfiConverterTypePage.INSTANCE.read(byteBuffer));
        }
        return arrayListA11;
    }

    @Override // com.hatch.browser.core.FfiConverter
    public void write(List<? extends Page> list, ByteBuffer byteBuffer) {
        AbstractC7611F5y.A18(list, byteBuffer);
        Iterator<? extends Page> it = list.iterator();
        while (it.hasNext()) {
            FfiConverterTypePage.INSTANCE.write(it.next(), byteBuffer);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List<? extends com.hatch.browser.core.Page>] */
    @Override // com.hatch.browser.core.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ List<? extends Page> lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0p(this, byValue);
    }

    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ /* synthetic */ Object liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(List<? extends Page> list) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, list);
    }

    @Override // com.hatch.browser.core.FfiConverterRustBuffer
    /* renamed from: lift, reason: avoid collision after fix types in other method */
    public /* bridge */ List<? extends Page> lift2(RustBuffer.ByValue byValue) {
        return (List) AbstractC7609F5w.A0p(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(List<? extends Page> list) {
        return lower((Object) list);
    }
}

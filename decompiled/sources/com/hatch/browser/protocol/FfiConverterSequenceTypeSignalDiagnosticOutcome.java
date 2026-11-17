package com.hatch.browser.protocol;

import X.AbstractC7607F5u;
import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AbstractC7611F5y;
import X.AbstractC9315GDr;
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
public final class FfiConverterSequenceTypeSignalDiagnosticOutcome implements FfiConverterRustBuffer<List<? extends SignalDiagnosticOutcome>> {
    public static final int $stable = 0;
    public static final FfiConverterSequenceTypeSignalDiagnosticOutcome INSTANCE = new FfiConverterSequenceTypeSignalDiagnosticOutcome();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(List<? extends SignalDiagnosticOutcome> list) {
        ArrayList arrayListA1E = Hr7.A1E(list);
        Iterator<? extends SignalDiagnosticOutcome> it = list.iterator();
        while (it.hasNext()) {
            it.next();
            C9314GDq.A00(arrayListA1E, 4L);
        }
        return AbstractC9315GDr.A00(arrayListA1E);
    }

    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    /* renamed from: lift, reason: avoid collision after fix types in other method */
    public /* bridge */ List<? extends SignalDiagnosticOutcome> lift2(RustBuffer.ByValue byValue) {
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
    public List<SignalDiagnosticOutcome> read(ByteBuffer byteBuffer) {
        int iA0H = AbstractC7609F5w.A0H(byteBuffer);
        ArrayList arrayListA11 = C60O.A11(iA0H);
        for (int i = 0; i < iA0H; i++) {
            arrayListA11.add(FfiConverterTypeSignalDiagnosticOutcome.INSTANCE.read(byteBuffer));
        }
        return arrayListA11;
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(List<? extends SignalDiagnosticOutcome> list, ByteBuffer byteBuffer) {
        AbstractC7611F5y.A18(list, byteBuffer);
        Iterator<? extends SignalDiagnosticOutcome> it = list.iterator();
        while (it.hasNext()) {
            AbstractC7611F5y.A0q(it.next(), byteBuffer);
        }
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ /* synthetic */ Object lift(RustBuffer.ByValue byValue) {
        return AbstractC7610F5x.A0r(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ List<SignalDiagnosticOutcome> liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return AbstractC7607F5u.A15(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(List<? extends SignalDiagnosticOutcome> list) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, list);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List<? extends com.hatch.browser.protocol.SignalDiagnosticOutcome>] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ List<? extends SignalDiagnosticOutcome> lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(List<? extends SignalDiagnosticOutcome> list) {
        return lower((Object) list);
    }
}

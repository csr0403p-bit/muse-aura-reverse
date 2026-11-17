package com.hatch.browser.protocol;

import X.AbstractC7607F5u;
import X.AbstractC7608F5v;
import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.C3cG;
import X.C60P;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import com.hatch.browser.protocol.WaitCondition;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeWaitCondition implements FfiConverterRustBuffer<WaitCondition> {
    public static final int $stable = 0;
    public static final FfiConverterTypeWaitCondition INSTANCE = new FfiConverterTypeWaitCondition();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(WaitCondition waitCondition) {
        long jMo3323allocationSizeI7RO_PI;
        FfiConverterString ffiConverterString;
        String str;
        C7384Etj.A0Y(waitCondition, 0);
        if (waitCondition instanceof WaitCondition.PageTextPresent) {
            ffiConverterString = FfiConverterString.INSTANCE;
            str = ((WaitCondition.PageTextPresent) waitCondition).text;
        } else {
            if (!(waitCondition instanceof WaitCondition.PageTextAbsent)) {
                if (waitCondition instanceof WaitCondition.Delay) {
                    jMo3323allocationSizeI7RO_PI = 4;
                    return jMo3323allocationSizeI7RO_PI + 4;
                }
                if (!(waitCondition instanceof WaitCondition.ElementState)) {
                    throw C3cG.A0q();
                }
                WaitCondition.ElementState elementState = (WaitCondition.ElementState) waitCondition;
                return FfiConverterTypeElementRef.INSTANCE.mo3323allocationSizeI7RO_PI(elementState.element) + 4 + FfiConverterTypeElementState.INSTANCE.mo3323allocationSizeI7RO_PI(elementState.state);
            }
            ffiConverterString = FfiConverterString.INSTANCE;
            str = ((WaitCondition.PageTextAbsent) waitCondition).text;
        }
        jMo3323allocationSizeI7RO_PI = ffiConverterString.mo3323allocationSizeI7RO_PI(str);
        return jMo3323allocationSizeI7RO_PI + 4;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ WaitCondition lift(RustBuffer.ByValue byValue) {
        return (WaitCondition) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ WaitCondition liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (WaitCondition) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(WaitCondition waitCondition) {
        return lower((Object) waitCondition);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(WaitCondition waitCondition) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, waitCondition);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public WaitCondition read(ByteBuffer byteBuffer) {
        int iA0H = AbstractC7609F5w.A0H(byteBuffer);
        if (iA0H == 1) {
            return new WaitCondition.PageTextPresent(AbstractC7607F5u.A12(byteBuffer));
        }
        if (iA0H == 2) {
            return new WaitCondition.PageTextAbsent(AbstractC7607F5u.A12(byteBuffer));
        }
        if (iA0H == 3) {
            return new WaitCondition.Delay(byteBuffer.getInt());
        }
        if (iA0H == 4) {
            return new WaitCondition.ElementState(FfiConverterTypeElementRef.INSTANCE.read(byteBuffer), FfiConverterTypeElementState.INSTANCE.read(byteBuffer));
        }
        throw AbstractC7608F5v.A0l();
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(WaitCondition waitCondition, ByteBuffer byteBuffer) {
        FfiConverterString ffiConverterString;
        String str;
        boolean zA1Y = C60P.A1Y(waitCondition, byteBuffer);
        if (waitCondition instanceof WaitCondition.PageTextPresent) {
            byteBuffer.putInt(zA1Y ? 1 : 0);
            ffiConverterString = FfiConverterString.INSTANCE;
            str = ((WaitCondition.PageTextPresent) waitCondition).text;
        } else {
            if (!(waitCondition instanceof WaitCondition.PageTextAbsent)) {
                if (waitCondition instanceof WaitCondition.Delay) {
                    byteBuffer.putInt(3);
                    byteBuffer.putInt(((WaitCondition.Delay) waitCondition).durationMs);
                    return;
                } else {
                    if (!(waitCondition instanceof WaitCondition.ElementState)) {
                        throw C3cG.A0q();
                    }
                    byteBuffer.putInt(4);
                    WaitCondition.ElementState elementState = (WaitCondition.ElementState) waitCondition;
                    FfiConverterTypeElementRef.INSTANCE.write(elementState.element, byteBuffer);
                    FfiConverterTypeElementState.INSTANCE.write(elementState.state, byteBuffer);
                    return;
                }
            }
            byteBuffer.putInt(2);
            ffiConverterString = FfiConverterString.INSTANCE;
            str = ((WaitCondition.PageTextAbsent) waitCondition).text;
        }
        ffiConverterString.write(str, byteBuffer);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.WaitCondition, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ WaitCondition lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}

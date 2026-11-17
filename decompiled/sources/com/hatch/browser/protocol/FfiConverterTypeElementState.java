package com.hatch.browser.protocol;

import X.AbstractC7607F5u;
import X.AbstractC7608F5v;
import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.C3cG;
import X.C60P;
import X.C7384Etj;
import com.hatch.browser.protocol.ElementState;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeElementState implements FfiConverterRustBuffer<ElementState> {
    public static final int $stable = 0;
    public static final FfiConverterTypeElementState INSTANCE = new FfiConverterTypeElementState();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(ElementState elementState) {
        long jMo3323allocationSizeI7RO_PI;
        C7384Etj.A0Y(elementState, 0);
        if ((elementState instanceof ElementState.Visible) || (elementState instanceof ElementState.Hidden) || (elementState instanceof ElementState.Enabled) || (elementState instanceof ElementState.Disabled)) {
            return 4L;
        }
        if (elementState instanceof ElementState.Checked) {
            jMo3323allocationSizeI7RO_PI = 1;
        } else {
            if (!(elementState instanceof ElementState.ValueEquals)) {
                throw C3cG.A0q();
            }
            jMo3323allocationSizeI7RO_PI = FfiConverterString.INSTANCE.mo3323allocationSizeI7RO_PI(((ElementState.ValueEquals) elementState).value);
        }
        return jMo3323allocationSizeI7RO_PI + 4;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ ElementState lift(RustBuffer.ByValue byValue) {
        return (ElementState) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ ElementState liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (ElementState) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(ElementState elementState) {
        return lower((Object) elementState);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(ElementState elementState) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, elementState);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public ElementState read(ByteBuffer byteBuffer) {
        switch (AbstractC7609F5w.A0H(byteBuffer)) {
            case 1:
                return ElementState.Visible.INSTANCE;
            case 2:
                return ElementState.Hidden.INSTANCE;
            case 3:
                return ElementState.Enabled.INSTANCE;
            case 4:
                return ElementState.Disabled.INSTANCE;
            case 5:
                return new ElementState.Checked(AbstractC7610F5x.A1V(FfiConverterBoolean.INSTANCE, byteBuffer));
            case 6:
                return new ElementState.ValueEquals(AbstractC7607F5u.A12(byteBuffer));
            default:
                throw AbstractC7608F5v.A0l();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(ElementState elementState, ByteBuffer byteBuffer) {
        boolean z = elementState instanceof ElementState.Visible;
        int iA1Y = C60P.A1Y(elementState, byteBuffer);
        if (!z) {
            if (elementState instanceof ElementState.Hidden) {
                iA1Y = 2;
            } else if (elementState instanceof ElementState.Enabled) {
                iA1Y = 3;
            } else {
                if (!(elementState instanceof ElementState.Disabled)) {
                    if (elementState instanceof ElementState.Checked) {
                        byteBuffer.putInt(5);
                        FfiConverterBoolean.INSTANCE.write(((ElementState.Checked) elementState).expected, byteBuffer);
                        return;
                    } else {
                        if (!(elementState instanceof ElementState.ValueEquals)) {
                            throw C3cG.A0q();
                        }
                        byteBuffer.putInt(6);
                        FfiConverterString.INSTANCE.write(((ElementState.ValueEquals) elementState).value, byteBuffer);
                        return;
                    }
                }
                iA1Y = 4;
            }
        }
        byteBuffer.putInt(iA1Y);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.ElementState, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ ElementState lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}

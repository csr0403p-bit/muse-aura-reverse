package com.hatch.browser.protocol;

import X.AbstractC7607F5u;
import X.AbstractC7608F5v;
import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.C3cG;
import X.C60P;
import X.C7384Etj;
import com.hatch.browser.protocol.ElementReadKind;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeElementReadKind implements FfiConverterRustBuffer<ElementReadKind> {
    public static final int $stable = 0;
    public static final FfiConverterTypeElementReadKind INSTANCE = new FfiConverterTypeElementReadKind();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(ElementReadKind elementReadKind) {
        C7384Etj.A0Y(elementReadKind, 0);
        if ((elementReadKind instanceof ElementReadKind.Text) || (elementReadKind instanceof ElementReadKind.Html) || (elementReadKind instanceof ElementReadKind.Value) || (elementReadKind instanceof ElementReadKind.Checked)) {
            return 4L;
        }
        if (elementReadKind instanceof ElementReadKind.Attribute) {
            return FfiConverterString.INSTANCE.mo3323allocationSizeI7RO_PI(((ElementReadKind.Attribute) elementReadKind).name) + 4;
        }
        throw C3cG.A0q();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ ElementReadKind lift(RustBuffer.ByValue byValue) {
        return (ElementReadKind) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ ElementReadKind liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (ElementReadKind) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(ElementReadKind elementReadKind) {
        return lower((Object) elementReadKind);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(ElementReadKind elementReadKind) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, elementReadKind);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public ElementReadKind read(ByteBuffer byteBuffer) {
        int iA0H = AbstractC7609F5w.A0H(byteBuffer);
        if (iA0H == 1) {
            return ElementReadKind.Text.INSTANCE;
        }
        if (iA0H == 2) {
            return ElementReadKind.Html.INSTANCE;
        }
        if (iA0H == 3) {
            return ElementReadKind.Value.INSTANCE;
        }
        if (iA0H == 4) {
            return ElementReadKind.Checked.INSTANCE;
        }
        if (iA0H == 5) {
            return new ElementReadKind.Attribute(AbstractC7607F5u.A12(byteBuffer));
        }
        throw AbstractC7608F5v.A0l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(ElementReadKind elementReadKind, ByteBuffer byteBuffer) {
        boolean z = elementReadKind instanceof ElementReadKind.Text;
        int iA1Y = C60P.A1Y(elementReadKind, byteBuffer);
        if (!z) {
            if (elementReadKind instanceof ElementReadKind.Html) {
                iA1Y = 2;
            } else if (elementReadKind instanceof ElementReadKind.Value) {
                iA1Y = 3;
            } else {
                if (!(elementReadKind instanceof ElementReadKind.Checked)) {
                    if (!(elementReadKind instanceof ElementReadKind.Attribute)) {
                        throw C3cG.A0q();
                    }
                    byteBuffer.putInt(5);
                    FfiConverterString.INSTANCE.write(((ElementReadKind.Attribute) elementReadKind).name, byteBuffer);
                    return;
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.ElementReadKind, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ ElementReadKind lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}

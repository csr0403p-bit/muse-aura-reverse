package com.hatch.browser.protocol;

import X.AbstractC7607F5u;
import X.AbstractC7608F5v;
import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.C3cG;
import X.C60P;
import X.C7384Etj;
import com.hatch.browser.protocol.ElementValue;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeElementValue implements FfiConverterRustBuffer<ElementValue> {
    public static final int $stable = 0;
    public static final FfiConverterTypeElementValue INSTANCE = new FfiConverterTypeElementValue();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(ElementValue elementValue) {
        long jMo3323allocationSizeI7RO_PI;
        FfiConverterString ffiConverterString;
        String str;
        C7384Etj.A0Y(elementValue, 0);
        if (elementValue instanceof ElementValue.Text) {
            ffiConverterString = FfiConverterString.INSTANCE;
            str = ((ElementValue.Text) elementValue).value;
        } else {
            if (!(elementValue instanceof ElementValue.Html)) {
                if (elementValue instanceof ElementValue.Value) {
                    jMo3323allocationSizeI7RO_PI = FfiConverterOptionalString.INSTANCE.mo3323allocationSizeI7RO_PI(((ElementValue.Value) elementValue).value);
                } else {
                    if (!(elementValue instanceof ElementValue.Checked)) {
                        if (!(elementValue instanceof ElementValue.Attribute)) {
                            throw C3cG.A0q();
                        }
                        ElementValue.Attribute attribute = (ElementValue.Attribute) elementValue;
                        return FfiConverterString.INSTANCE.mo3323allocationSizeI7RO_PI(attribute.name) + 4 + FfiConverterOptionalString.INSTANCE.mo3323allocationSizeI7RO_PI(attribute.value);
                    }
                    jMo3323allocationSizeI7RO_PI = 1;
                }
                return jMo3323allocationSizeI7RO_PI + 4;
            }
            ffiConverterString = FfiConverterString.INSTANCE;
            str = ((ElementValue.Html) elementValue).value;
        }
        jMo3323allocationSizeI7RO_PI = ffiConverterString.mo3323allocationSizeI7RO_PI(str);
        return jMo3323allocationSizeI7RO_PI + 4;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ ElementValue lift(RustBuffer.ByValue byValue) {
        return (ElementValue) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ ElementValue liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (ElementValue) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(ElementValue elementValue) {
        return lower((Object) elementValue);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(ElementValue elementValue) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, elementValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public ElementValue read(ByteBuffer byteBuffer) {
        int iA0H = AbstractC7609F5w.A0H(byteBuffer);
        if (iA0H == 1) {
            return new ElementValue.Text(AbstractC7607F5u.A12(byteBuffer));
        }
        if (iA0H == 2) {
            return new ElementValue.Html(AbstractC7607F5u.A12(byteBuffer));
        }
        if (iA0H == 3) {
            return new ElementValue.Value(AbstractC7607F5u.A11(byteBuffer));
        }
        if (iA0H == 4) {
            return new ElementValue.Checked(AbstractC7610F5x.A1V(FfiConverterBoolean.INSTANCE, byteBuffer));
        }
        if (iA0H == 5) {
            return new ElementValue.Attribute(AbstractC7607F5u.A12(byteBuffer), AbstractC7607F5u.A11(byteBuffer));
        }
        throw AbstractC7608F5v.A0l();
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(ElementValue elementValue, ByteBuffer byteBuffer) {
        FfiConverterOptionalString ffiConverterOptionalString;
        String str;
        FfiConverterString ffiConverterString;
        String str2;
        boolean zA1Y = C60P.A1Y(elementValue, byteBuffer);
        if (elementValue instanceof ElementValue.Text) {
            byteBuffer.putInt(zA1Y ? 1 : 0);
            ffiConverterString = FfiConverterString.INSTANCE;
            str2 = ((ElementValue.Text) elementValue).value;
        } else {
            if (!(elementValue instanceof ElementValue.Html)) {
                if (elementValue instanceof ElementValue.Value) {
                    byteBuffer.putInt(3);
                    ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
                    str = ((ElementValue.Value) elementValue).value;
                } else if (elementValue instanceof ElementValue.Checked) {
                    byteBuffer.putInt(4);
                    FfiConverterBoolean.INSTANCE.write(((ElementValue.Checked) elementValue).value, byteBuffer);
                    return;
                } else {
                    if (!(elementValue instanceof ElementValue.Attribute)) {
                        throw C3cG.A0q();
                    }
                    byteBuffer.putInt(5);
                    ElementValue.Attribute attribute = (ElementValue.Attribute) elementValue;
                    FfiConverterString.INSTANCE.write(attribute.name, byteBuffer);
                    ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
                    str = attribute.value;
                }
                ffiConverterOptionalString.write(str, byteBuffer);
                return;
            }
            byteBuffer.putInt(2);
            ffiConverterString = FfiConverterString.INSTANCE;
            str2 = ((ElementValue.Html) elementValue).value;
        }
        ffiConverterString.write(str2, byteBuffer);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.ElementValue, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ ElementValue lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}

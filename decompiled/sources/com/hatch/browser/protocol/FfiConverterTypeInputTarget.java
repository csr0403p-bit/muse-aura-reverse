package com.hatch.browser.protocol;

import X.AbstractC7608F5v;
import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.C3cG;
import X.C60P;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.InputTarget;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeInputTarget implements FfiConverterRustBuffer<InputTarget> {
    public static final int $stable = 0;
    public static final FfiConverterTypeInputTarget INSTANCE = new FfiConverterTypeInputTarget();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(InputTarget inputTarget) {
        C7384Etj.A0Y(inputTarget, 0);
        if (inputTarget instanceof InputTarget.Page) {
            return 4L;
        }
        if (inputTarget instanceof InputTarget.Element) {
            return FfiConverterTypeElementRef.INSTANCE.mo3323allocationSizeI7RO_PI(((InputTarget.Element) inputTarget).element) + 4;
        }
        throw C3cG.A0q();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ InputTarget lift(RustBuffer.ByValue byValue) {
        return (InputTarget) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ InputTarget liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (InputTarget) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(InputTarget inputTarget) {
        return lower((Object) inputTarget);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(InputTarget inputTarget) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, inputTarget);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public InputTarget read(ByteBuffer byteBuffer) {
        int iA0H = AbstractC7609F5w.A0H(byteBuffer);
        if (iA0H == 1) {
            return InputTarget.Page.INSTANCE;
        }
        if (iA0H == 2) {
            return new InputTarget.Element(FfiConverterTypeElementRef.INSTANCE.read(byteBuffer));
        }
        throw AbstractC7608F5v.A0l();
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(InputTarget inputTarget, ByteBuffer byteBuffer) {
        boolean zA1Y = C60P.A1Y(inputTarget, byteBuffer);
        if (inputTarget instanceof InputTarget.Page) {
            byteBuffer.putInt(zA1Y ? 1 : 0);
        } else {
            if (!(inputTarget instanceof InputTarget.Element)) {
                throw C3cG.A0q();
            }
            byteBuffer.putInt(2);
            FfiConverterTypeElementRef.INSTANCE.write(((InputTarget.Element) inputTarget).element, byteBuffer);
        }
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.InputTarget, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ InputTarget lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}

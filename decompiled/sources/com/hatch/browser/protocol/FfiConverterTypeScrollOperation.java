package com.hatch.browser.protocol;

import X.AbstractC7608F5v;
import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AbstractC7611F5y;
import X.C3cG;
import X.C60P;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import com.hatch.browser.protocol.ScrollOperation;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeScrollOperation implements FfiConverterRustBuffer<ScrollOperation> {
    public static final int $stable = 0;
    public static final FfiConverterTypeScrollOperation INSTANCE = new FfiConverterTypeScrollOperation();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(ScrollOperation scrollOperation) {
        long jA0W;
        C7384Etj.A0Y(scrollOperation, 0);
        long jMo3323allocationSizeI7RO_PI = 4;
        if (scrollOperation instanceof ScrollOperation.Reveal) {
            jA0W = FfiConverterTypeElementRef.INSTANCE.mo3323allocationSizeI7RO_PI(((ScrollOperation.Reveal) scrollOperation).element);
        } else if (scrollOperation instanceof ScrollOperation.By) {
            ScrollOperation.By by = (ScrollOperation.By) scrollOperation;
            jMo3323allocationSizeI7RO_PI = 4 + FfiConverterTypeInputTarget.INSTANCE.mo3323allocationSizeI7RO_PI(by.target) + 4 + 4;
            jA0W = AbstractC7610F5x.A0W(by.speed);
        } else {
            if (!(scrollOperation instanceof ScrollOperation.PageToEdge)) {
                throw C3cG.A0q();
            }
            jA0W = 4;
        }
        return jA0W + jMo3323allocationSizeI7RO_PI;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ ScrollOperation lift(RustBuffer.ByValue byValue) {
        return (ScrollOperation) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ ScrollOperation liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (ScrollOperation) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(ScrollOperation scrollOperation) {
        return lower((Object) scrollOperation);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(ScrollOperation scrollOperation) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, scrollOperation);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public ScrollOperation read(ByteBuffer byteBuffer) {
        int iA0H = AbstractC7609F5w.A0H(byteBuffer);
        if (iA0H == 1) {
            return new ScrollOperation.Reveal(FfiConverterTypeElementRef.INSTANCE.read(byteBuffer));
        }
        if (iA0H == 2) {
            return new ScrollOperation.By(FfiConverterTypeInputTarget.INSTANCE.read(byteBuffer), FfiConverterTypeScrollDirection.INSTANCE.read(byteBuffer), byteBuffer.getInt(), FfiConverterOptionalTypeScrollSpeed.INSTANCE.read(byteBuffer));
        }
        if (iA0H == 3) {
            return new ScrollOperation.PageToEdge(FfiConverterTypePageEdge.INSTANCE.read(byteBuffer));
        }
        throw AbstractC7608F5v.A0l();
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(ScrollOperation scrollOperation, ByteBuffer byteBuffer) {
        boolean zA1Y = C60P.A1Y(scrollOperation, byteBuffer);
        if (scrollOperation instanceof ScrollOperation.Reveal) {
            byteBuffer.putInt(zA1Y ? 1 : 0);
            FfiConverterTypeElementRef.INSTANCE.write(((ScrollOperation.Reveal) scrollOperation).element, byteBuffer);
            return;
        }
        if (!(scrollOperation instanceof ScrollOperation.By)) {
            if (!(scrollOperation instanceof ScrollOperation.PageToEdge)) {
                throw C3cG.A0q();
            }
            byteBuffer.putInt(3);
            AbstractC7611F5y.A0q(((ScrollOperation.PageToEdge) scrollOperation).edge, byteBuffer);
            return;
        }
        byteBuffer.putInt(2);
        ScrollOperation.By by = (ScrollOperation.By) scrollOperation;
        FfiConverterTypeInputTarget.INSTANCE.write(by.target, byteBuffer);
        AbstractC7611F5y.A0q(by.direction, byteBuffer);
        byteBuffer.putInt(by.pixels);
        FfiConverterOptionalTypeScrollSpeed.INSTANCE.write(by.speed, byteBuffer);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.ScrollOperation, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ ScrollOperation lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}

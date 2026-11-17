package com.hatch.browser.protocol;

import X.AbstractC7608F5v;
import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AbstractC7611F5y;
import X.C3cG;
import X.C60P;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.PageAuthorityDecision;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypePageAuthorityDecision implements FfiConverterRustBuffer<PageAuthorityDecision> {
    public static final int $stable = 0;
    public static final FfiConverterTypePageAuthorityDecision INSTANCE = new FfiConverterTypePageAuthorityDecision();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(PageAuthorityDecision pageAuthorityDecision) {
        long jMo3323allocationSizeI7RO_PI;
        C7384Etj.A0Y(pageAuthorityDecision, 0);
        if (pageAuthorityDecision instanceof PageAuthorityDecision.Granted) {
            jMo3323allocationSizeI7RO_PI = FfiConverterTypePageAuthoritySnapshot.INSTANCE.mo3323allocationSizeI7RO_PI(((PageAuthorityDecision.Granted) pageAuthorityDecision).snapshot);
        } else {
            if (!(pageAuthorityDecision instanceof PageAuthorityDecision.Denied)) {
                throw C3cG.A0q();
            }
            jMo3323allocationSizeI7RO_PI = 4;
        }
        return jMo3323allocationSizeI7RO_PI + 4;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ PageAuthorityDecision lift(RustBuffer.ByValue byValue) {
        return (PageAuthorityDecision) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ PageAuthorityDecision liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (PageAuthorityDecision) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(PageAuthorityDecision pageAuthorityDecision) {
        return lower((Object) pageAuthorityDecision);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(PageAuthorityDecision pageAuthorityDecision) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, pageAuthorityDecision);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public PageAuthorityDecision read(ByteBuffer byteBuffer) {
        int iA0H = AbstractC7609F5w.A0H(byteBuffer);
        if (iA0H == 1) {
            return new PageAuthorityDecision.Granted(FfiConverterTypePageAuthoritySnapshot.INSTANCE.read(byteBuffer));
        }
        if (iA0H == 2) {
            return new PageAuthorityDecision.Denied(FfiConverterTypeHostRefusal.INSTANCE.read(byteBuffer));
        }
        throw AbstractC7608F5v.A0l();
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(PageAuthorityDecision pageAuthorityDecision, ByteBuffer byteBuffer) {
        boolean zA1Y = C60P.A1Y(pageAuthorityDecision, byteBuffer);
        if (pageAuthorityDecision instanceof PageAuthorityDecision.Granted) {
            byteBuffer.putInt(zA1Y ? 1 : 0);
            FfiConverterTypePageAuthoritySnapshot.INSTANCE.write(((PageAuthorityDecision.Granted) pageAuthorityDecision).snapshot, byteBuffer);
        } else {
            if (!(pageAuthorityDecision instanceof PageAuthorityDecision.Denied)) {
                throw C3cG.A0q();
            }
            byteBuffer.putInt(2);
            AbstractC7611F5y.A0q(((PageAuthorityDecision.Denied) pageAuthorityDecision).reason, byteBuffer);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.PageAuthorityDecision, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ PageAuthorityDecision lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}

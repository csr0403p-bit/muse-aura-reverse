package com.hatch.browser.protocol;

import X.AbstractC7608F5v;
import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AbstractC7611F5y;
import X.C3cG;
import X.C60P;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.PageAuthorityState;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypePageAuthorityState implements FfiConverterRustBuffer<PageAuthorityState> {
    public static final int $stable = 0;
    public static final FfiConverterTypePageAuthorityState INSTANCE = new FfiConverterTypePageAuthorityState();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(PageAuthorityState pageAuthorityState) {
        C7384Etj.A0Y(pageAuthorityState, 0);
        if (pageAuthorityState instanceof PageAuthorityState.Alive) {
            return 8L;
        }
        if (pageAuthorityState instanceof PageAuthorityState.Destroyed) {
            return 4L;
        }
        throw C3cG.A0q();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ PageAuthorityState lift(RustBuffer.ByValue byValue) {
        return (PageAuthorityState) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ PageAuthorityState liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (PageAuthorityState) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(PageAuthorityState pageAuthorityState) {
        return lower((Object) pageAuthorityState);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(PageAuthorityState pageAuthorityState) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, pageAuthorityState);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public PageAuthorityState read(ByteBuffer byteBuffer) {
        int iA0H = AbstractC7609F5w.A0H(byteBuffer);
        if (iA0H == 1) {
            return new PageAuthorityState.Alive(FfiConverterTypeAvailability.INSTANCE.read(byteBuffer));
        }
        if (iA0H == 2) {
            return PageAuthorityState.Destroyed.INSTANCE;
        }
        throw AbstractC7608F5v.A0l();
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(PageAuthorityState pageAuthorityState, ByteBuffer byteBuffer) {
        boolean zA1Y = C60P.A1Y(pageAuthorityState, byteBuffer);
        if (pageAuthorityState instanceof PageAuthorityState.Alive) {
            byteBuffer.putInt(zA1Y ? 1 : 0);
            AbstractC7611F5y.A0q(((PageAuthorityState.Alive) pageAuthorityState).availability, byteBuffer);
        } else {
            if (!(pageAuthorityState instanceof PageAuthorityState.Destroyed)) {
                throw C3cG.A0q();
            }
            byteBuffer.putInt(2);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.PageAuthorityState, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ PageAuthorityState lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}

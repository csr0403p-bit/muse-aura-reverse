package com.hatch.browser.protocol;

import X.AbstractC7607F5u;
import X.AbstractC7608F5v;
import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.C3cG;
import X.C60P;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.NativePageIdentity;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeNativePageIdentity implements FfiConverterRustBuffer<NativePageIdentity> {
    public static final int $stable = 0;
    public static final FfiConverterTypeNativePageIdentity INSTANCE = new FfiConverterTypeNativePageIdentity();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(NativePageIdentity nativePageIdentity) {
        long jMo3323allocationSizeI7RO_PI;
        long jMo3323allocationSizeI7RO_PI2;
        C7384Etj.A0Y(nativePageIdentity, 0);
        if (nativePageIdentity instanceof NativePageIdentity.CdpTarget) {
            FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
            NativePageIdentity.CdpTarget cdpTarget = (NativePageIdentity.CdpTarget) nativePageIdentity;
            jMo3323allocationSizeI7RO_PI = ffiConverterString.mo3323allocationSizeI7RO_PI(cdpTarget.browserInstanceId) + 4;
            jMo3323allocationSizeI7RO_PI2 = ffiConverterString.mo3323allocationSizeI7RO_PI(cdpTarget.targetId);
        } else {
            if (!(nativePageIdentity instanceof NativePageIdentity.ChromeTab)) {
                throw C3cG.A0q();
            }
            jMo3323allocationSizeI7RO_PI = FfiConverterString.INSTANCE.mo3323allocationSizeI7RO_PI(((NativePageIdentity.ChromeTab) nativePageIdentity).browserInstanceId) + 4;
            jMo3323allocationSizeI7RO_PI2 = 4;
        }
        return jMo3323allocationSizeI7RO_PI + jMo3323allocationSizeI7RO_PI2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ NativePageIdentity lift(RustBuffer.ByValue byValue) {
        return (NativePageIdentity) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ NativePageIdentity liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (NativePageIdentity) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(NativePageIdentity nativePageIdentity) {
        return lower((Object) nativePageIdentity);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(NativePageIdentity nativePageIdentity) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, nativePageIdentity);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public NativePageIdentity read(ByteBuffer byteBuffer) {
        int iA0H = AbstractC7609F5w.A0H(byteBuffer);
        if (iA0H == 1) {
            FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
            return new NativePageIdentity.CdpTarget(ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer));
        }
        if (iA0H == 2) {
            return new NativePageIdentity.ChromeTab(AbstractC7607F5u.A12(byteBuffer), byteBuffer.getInt());
        }
        throw AbstractC7608F5v.A0l();
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(NativePageIdentity nativePageIdentity, ByteBuffer byteBuffer) {
        boolean zA1Y = C60P.A1Y(nativePageIdentity, byteBuffer);
        if (nativePageIdentity instanceof NativePageIdentity.CdpTarget) {
            byteBuffer.putInt(zA1Y ? 1 : 0);
            FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
            NativePageIdentity.CdpTarget cdpTarget = (NativePageIdentity.CdpTarget) nativePageIdentity;
            ffiConverterString.write(cdpTarget.browserInstanceId, byteBuffer);
            ffiConverterString.write(cdpTarget.targetId, byteBuffer);
            return;
        }
        if (!(nativePageIdentity instanceof NativePageIdentity.ChromeTab)) {
            throw C3cG.A0q();
        }
        byteBuffer.putInt(2);
        NativePageIdentity.ChromeTab chromeTab = (NativePageIdentity.ChromeTab) nativePageIdentity;
        FfiConverterString.INSTANCE.write(chromeTab.browserInstanceId, byteBuffer);
        byteBuffer.putInt(chromeTab.tabId);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.NativePageIdentity, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ NativePageIdentity lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}

package com.hatch.browser.protocol;

import X.AbstractC7607F5u;
import X.AbstractC7608F5v;
import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AbstractC7611F5y;
import X.C3cG;
import X.C60P;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.Key;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeKey implements FfiConverterRustBuffer<Key> {
    public static final int $stable = 0;
    public static final FfiConverterTypeKey INSTANCE = new FfiConverterTypeKey();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(Key key) {
        long jMo3323allocationSizeI7RO_PI;
        C7384Etj.A0Y(key, 0);
        if (key instanceof Key.Named) {
            jMo3323allocationSizeI7RO_PI = 4;
        } else {
            if (!(key instanceof Key.Character)) {
                throw C3cG.A0q();
            }
            jMo3323allocationSizeI7RO_PI = FfiConverterString.INSTANCE.mo3323allocationSizeI7RO_PI(((Key.Character) key).value);
        }
        return jMo3323allocationSizeI7RO_PI + 4;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ Key lift(RustBuffer.ByValue byValue) {
        return (Key) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ Key liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (Key) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(Key key) {
        return lower((Object) key);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(Key key) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, key);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public Key read(ByteBuffer byteBuffer) {
        int iA0H = AbstractC7609F5w.A0H(byteBuffer);
        if (iA0H == 1) {
            return new Key.Named(FfiConverterTypeNamedKey.INSTANCE.read(byteBuffer));
        }
        if (iA0H == 2) {
            return new Key.Character(AbstractC7607F5u.A12(byteBuffer));
        }
        throw AbstractC7608F5v.A0l();
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(Key key, ByteBuffer byteBuffer) {
        boolean zA1Y = C60P.A1Y(key, byteBuffer);
        if (key instanceof Key.Named) {
            byteBuffer.putInt(zA1Y ? 1 : 0);
            AbstractC7611F5y.A0q(((Key.Named) key).key, byteBuffer);
        } else {
            if (!(key instanceof Key.Character)) {
                throw C3cG.A0q();
            }
            byteBuffer.putInt(2);
            FfiConverterString.INSTANCE.write(((Key.Character) key).value, byteBuffer);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.Key, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ Key lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}

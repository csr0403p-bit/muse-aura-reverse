package com.facebook.aura.spaces.cache;

import X.AbstractC7559F3s;
import X.C3cJ;
import X.G0U;

/* loaded from: classes2.dex */
public final class SpacesDiskCache$Companion$urlKey$1 extends AbstractC7559F3s implements G0U<Byte, CharSequence> {
    public static final SpacesDiskCache$Companion$urlKey$1 INSTANCE = new SpacesDiskCache$Companion$urlKey$1();

    public SpacesDiskCache$Companion$urlKey$1() {
        super(1);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ CharSequence invoke(Byte b) {
        return C3cJ.A0K(Byte.valueOf(b.byteValue()));
    }

    public final CharSequence invoke(byte b) {
        return C3cJ.A0K(Byte.valueOf(b));
    }
}

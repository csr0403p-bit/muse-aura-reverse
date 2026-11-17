package com.facebook.aura.sharesheet;

import X.AbstractC7559F3s;
import X.C3cJ;
import X.G0U;

/* loaded from: classes2.dex */
public final class HatchShareMediaCache$Companion$keyFor$1 extends AbstractC7559F3s implements G0U<Byte, CharSequence> {
    public static final HatchShareMediaCache$Companion$keyFor$1 INSTANCE = new HatchShareMediaCache$Companion$keyFor$1();

    public HatchShareMediaCache$Companion$keyFor$1() {
        super(1);
    }

    public final CharSequence invoke(byte b) {
        return C3cJ.A0K(Integer.valueOf(b & 255));
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ CharSequence invoke(Byte b) {
        return invoke(b.byteValue());
    }
}

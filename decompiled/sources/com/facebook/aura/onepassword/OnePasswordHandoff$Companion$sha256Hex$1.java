package com.facebook.aura.onepassword;

import X.AbstractC7559F3s;
import X.C3cJ;
import X.G0U;

/* loaded from: classes3.dex */
public final class OnePasswordHandoff$Companion$sha256Hex$1 extends AbstractC7559F3s implements G0U<Byte, CharSequence> {
    public static final OnePasswordHandoff$Companion$sha256Hex$1 INSTANCE = new OnePasswordHandoff$Companion$sha256Hex$1();

    public OnePasswordHandoff$Companion$sha256Hex$1() {
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

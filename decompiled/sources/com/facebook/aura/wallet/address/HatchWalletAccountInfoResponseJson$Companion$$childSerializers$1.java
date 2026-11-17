package com.facebook.aura.wallet.address;

import X.AbstractC7559F3s;
import X.C3cG;
import X.C9hr;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchWalletAccountInfoResponseJson$Companion$$childSerializers$1 extends AbstractC7559F3s implements Function0<C9hr<List<? extends HatchWalletSavedAddressJson>>> {
    public static final HatchWalletAccountInfoResponseJson$Companion$$childSerializers$1 INSTANCE = new HatchWalletAccountInfoResponseJson$Companion$$childSerializers$1();

    public HatchWalletAccountInfoResponseJson$Companion$$childSerializers$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C9hr<List<? extends HatchWalletSavedAddressJson>> invoke() {
        return C3cG.A19(HatchWalletSavedAddressJson$$serializer.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<List<? extends HatchWalletSavedAddressJson>> invoke() {
        return C3cG.A19(HatchWalletSavedAddressJson$$serializer.INSTANCE);
    }
}

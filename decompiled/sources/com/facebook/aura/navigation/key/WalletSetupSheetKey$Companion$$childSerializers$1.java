package com.facebook.aura.navigation.key;

import X.A64;
import X.AbstractC7559F3s;
import X.C9hr;
import com.facebook.aura.model.WalletSetupOption;
import com.facebook.aura.model.WalletSetupOption$$serializer;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class WalletSetupSheetKey$Companion$$childSerializers$1 extends AbstractC7559F3s implements Function0<C9hr<List<? extends WalletSetupOption>>> {
    public static final WalletSetupSheetKey$Companion$$childSerializers$1 INSTANCE = new WalletSetupSheetKey$Companion$$childSerializers$1();

    public WalletSetupSheetKey$Companion$$childSerializers$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C9hr<List<? extends WalletSetupOption>> invoke() {
        return new A64(WalletSetupOption$$serializer.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<List<? extends WalletSetupOption>> invoke() {
        return new A64(WalletSetupOption$$serializer.INSTANCE);
    }
}

package com.facebook.aura.email.repo;

import X.AbstractC7559F3s;
import X.C3cG;
import X.C9hr;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class EmailSetupIntroJson$Companion$$childSerializers$1 extends AbstractC7559F3s implements Function0<C9hr<List<? extends EmailSetupPointJson>>> {
    public static final EmailSetupIntroJson$Companion$$childSerializers$1 INSTANCE = new EmailSetupIntroJson$Companion$$childSerializers$1();

    public EmailSetupIntroJson$Companion$$childSerializers$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C9hr<List<? extends EmailSetupPointJson>> invoke() {
        return C3cG.A19(EmailSetupPointJson$$serializer.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<List<? extends EmailSetupPointJson>> invoke() {
        return C3cG.A19(EmailSetupPointJson$$serializer.INSTANCE);
    }
}

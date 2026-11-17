package com.facebook.aura.email.repo;

import X.A64;
import X.AbstractC7559F3s;
import X.C9hr;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class EmailAccountAddressesJson$Companion$$childSerializers$1 extends AbstractC7559F3s implements Function0<C9hr<List<? extends EmailAccountAddressJson>>> {
    public static final EmailAccountAddressesJson$Companion$$childSerializers$1 INSTANCE = new EmailAccountAddressesJson$Companion$$childSerializers$1();

    public EmailAccountAddressesJson$Companion$$childSerializers$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C9hr<List<? extends EmailAccountAddressJson>> invoke() {
        return new A64(EmailAccountAddressJson$$serializer.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<List<? extends EmailAccountAddressJson>> invoke() {
        return new A64(EmailAccountAddressJson$$serializer.INSTANCE);
    }
}

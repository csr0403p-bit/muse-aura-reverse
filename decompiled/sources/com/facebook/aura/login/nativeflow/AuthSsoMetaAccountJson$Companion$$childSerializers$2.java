package com.facebook.aura.login.nativeflow;

import X.AbstractC7559F3s;
import X.C3cG;
import X.C9hr;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class AuthSsoMetaAccountJson$Companion$$childSerializers$2 extends AbstractC7559F3s implements Function0<C9hr<List<? extends AuthSsoLinkedAccountJson>>> {
    public static final AuthSsoMetaAccountJson$Companion$$childSerializers$2 INSTANCE = new AuthSsoMetaAccountJson$Companion$$childSerializers$2();

    public AuthSsoMetaAccountJson$Companion$$childSerializers$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C9hr<List<? extends AuthSsoLinkedAccountJson>> invoke() {
        return C3cG.A19(AuthSsoLinkedAccountJson$$serializer.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<List<? extends AuthSsoLinkedAccountJson>> invoke() {
        return C3cG.A19(AuthSsoLinkedAccountJson$$serializer.INSTANCE);
    }
}

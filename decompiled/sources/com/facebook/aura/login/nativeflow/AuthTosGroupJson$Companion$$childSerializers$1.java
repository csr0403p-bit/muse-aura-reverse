package com.facebook.aura.login.nativeflow;

import X.A64;
import X.AbstractC7559F3s;
import X.C9hr;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuthTosGroupJson$Companion$$childSerializers$1 extends AbstractC7559F3s implements Function0<C9hr<List<? extends AuthTosDocumentJson>>> {
    public static final AuthTosGroupJson$Companion$$childSerializers$1 INSTANCE = new AuthTosGroupJson$Companion$$childSerializers$1();

    public AuthTosGroupJson$Companion$$childSerializers$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C9hr<List<? extends AuthTosDocumentJson>> invoke() {
        return new A64(AuthTosDocumentJson$$serializer.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<List<? extends AuthTosDocumentJson>> invoke() {
        return new A64(AuthTosDocumentJson$$serializer.INSTANCE);
    }
}

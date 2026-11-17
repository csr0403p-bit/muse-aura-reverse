package com.facebook.aura.navigation.key;

import X.AbstractC5321DgF;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C3cG;
import X.C79;
import X.C9hr;
import X.F0C;
import com.facebook.aura.navigation.AuraLoggedOutNavKey;
import com.facebook.aura.navigation.AuraTerminalNavKey;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class LoginLandingScreenKey implements AuraLoggedOutNavKey, AuraTerminalNavKey {
    public static final LoginLandingScreenKey INSTANCE = new LoginLandingScreenKey();
    public static final /* synthetic */ F0C<C9hr<Object>> $cachedSerializer$delegate = AbstractC5321DgF.A02(C79.A01, AnonymousClass1.INSTANCE);

    /* renamed from: com.facebook.aura.navigation.key.LoginLandingScreenKey$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<C9hr<Object>> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final C9hr<Object> invoke() {
            return C3cG.A1B(LoginLandingScreenKey.INSTANCE, "com.facebook.aura.navigation.key.LoginLandingScreenKey", C3cG.A1T());
        }
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof LoginLandingScreenKey);
    }

    private final /* synthetic */ C9hr get$cachedSerializer() {
        return AnonymousClass001.A12($cachedSerializer$delegate);
    }

    public final C9hr<LoginLandingScreenKey> serializer() {
        return AnonymousClass001.A12($cachedSerializer$delegate);
    }

    public String toString() {
        return "LoginLandingScreenKey";
    }

    public int hashCode() {
        return -626404404;
    }
}

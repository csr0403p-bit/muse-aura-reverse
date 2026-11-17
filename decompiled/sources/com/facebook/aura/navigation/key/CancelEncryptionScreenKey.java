package com.facebook.aura.navigation.key;

import X.AbstractC5321DgF;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C79;
import X.C9dz;
import X.C9hr;
import X.F0C;
import com.facebook.aura.navigation.AuraFullScreenNavKey;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class CancelEncryptionScreenKey implements AuraFullScreenNavKey {
    public static final CancelEncryptionScreenKey INSTANCE = new CancelEncryptionScreenKey();
    public static final /* synthetic */ F0C<C9hr<Object>> $cachedSerializer$delegate = AbstractC5321DgF.A02(C79.A01, AnonymousClass1.INSTANCE);

    /* renamed from: com.facebook.aura.navigation.key.CancelEncryptionScreenKey$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<C9hr<Object>> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final C9hr<Object> invoke() {
            return new C9dz(CancelEncryptionScreenKey.INSTANCE, "com.facebook.aura.navigation.key.CancelEncryptionScreenKey", new Annotation[0]);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof CancelEncryptionScreenKey);
    }

    private final /* synthetic */ C9hr get$cachedSerializer() {
        return AnonymousClass001.A12($cachedSerializer$delegate);
    }

    public final C9hr<CancelEncryptionScreenKey> serializer() {
        return AnonymousClass001.A12($cachedSerializer$delegate);
    }

    public String toString() {
        return "CancelEncryptionScreenKey";
    }

    public int hashCode() {
        return -675308035;
    }
}

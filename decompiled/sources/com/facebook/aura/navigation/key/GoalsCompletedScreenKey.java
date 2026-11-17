package com.facebook.aura.navigation.key;

import X.AbstractC5321DgF;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C3cG;
import X.C79;
import X.C9hr;
import X.F0C;
import com.facebook.aura.navigation.AuraNavKey;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class GoalsCompletedScreenKey implements AuraNavKey {
    public static final GoalsCompletedScreenKey INSTANCE = new GoalsCompletedScreenKey();
    public static final /* synthetic */ F0C<C9hr<Object>> $cachedSerializer$delegate = AbstractC5321DgF.A02(C79.A01, AnonymousClass1.INSTANCE);

    /* renamed from: com.facebook.aura.navigation.key.GoalsCompletedScreenKey$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<C9hr<Object>> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final C9hr<Object> invoke() {
            return C3cG.A1B(GoalsCompletedScreenKey.INSTANCE, "com.facebook.aura.navigation.key.GoalsCompletedScreenKey", C3cG.A1T());
        }
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof GoalsCompletedScreenKey);
    }

    private final /* synthetic */ C9hr get$cachedSerializer() {
        return AnonymousClass001.A12($cachedSerializer$delegate);
    }

    public final C9hr<GoalsCompletedScreenKey> serializer() {
        return AnonymousClass001.A12($cachedSerializer$delegate);
    }

    public String toString() {
        return "GoalsCompletedScreenKey";
    }

    public int hashCode() {
        return -1708324177;
    }
}

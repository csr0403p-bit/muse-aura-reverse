package com.facebook.aura.navigation.key;

import X.AbstractC5321DgF;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C06H;
import X.C3cG;
import X.C79;
import X.C9hr;
import X.C9iL;
import X.Ey9;
import X.F0C;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Serializable
/* loaded from: classes3.dex */
public final class MessengerPinLockoutReason {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ MessengerPinLockoutReason[] $VALUES;
    public static final F0C<C9hr<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    public static final MessengerPinLockoutReason NO_PIN;
    public static final MessengerPinLockoutReason RATE_LIMITED;
    public static final MessengerPinLockoutReason TOO_MANY_ATTEMPTS;

    public final class Companion {

        /* renamed from: com.facebook.aura.navigation.key.MessengerPinLockoutReason$Companion$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<C9hr<Object>> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final C9hr<Object> invoke() {
                return C9iL.A01("com.facebook.aura.navigation.key.MessengerPinLockoutReason", MessengerPinLockoutReason.values());
            }
        }

        private final /* synthetic */ C9hr get$cachedSerializer() {
            return AnonymousClass001.A12(MessengerPinLockoutReason.$cachedSerializer$delegate);
        }

        public final C9hr<MessengerPinLockoutReason> serializer() {
            return AnonymousClass001.A12(MessengerPinLockoutReason.$cachedSerializer$delegate);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        MessengerPinLockoutReason messengerPinLockoutReason = new MessengerPinLockoutReason("TOO_MANY_ATTEMPTS", 0);
        TOO_MANY_ATTEMPTS = messengerPinLockoutReason;
        MessengerPinLockoutReason messengerPinLockoutReason2 = new MessengerPinLockoutReason("RATE_LIMITED", 1);
        RATE_LIMITED = messengerPinLockoutReason2;
        MessengerPinLockoutReason messengerPinLockoutReason3 = new MessengerPinLockoutReason("NO_PIN", 2);
        NO_PIN = messengerPinLockoutReason3;
        MessengerPinLockoutReason[] messengerPinLockoutReasonArr = {messengerPinLockoutReason, messengerPinLockoutReason2, messengerPinLockoutReason3};
        $VALUES = messengerPinLockoutReasonArr;
        $ENTRIES = C3cG.A0w(messengerPinLockoutReasonArr);
        Companion = new Companion();
        $cachedSerializer$delegate = AbstractC5321DgF.A02(C79.A01, Companion.AnonymousClass1.INSTANCE);
    }

    public static Ey9<MessengerPinLockoutReason> getEntries() {
        return $ENTRIES;
    }

    public static MessengerPinLockoutReason valueOf(String str) {
        return (MessengerPinLockoutReason) Enum.valueOf(MessengerPinLockoutReason.class, str);
    }

    public static MessengerPinLockoutReason[] values() {
        return (MessengerPinLockoutReason[]) $VALUES.clone();
    }

    public MessengerPinLockoutReason(String str, int i) {
    }
}

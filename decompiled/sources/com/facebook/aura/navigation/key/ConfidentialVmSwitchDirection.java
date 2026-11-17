package com.facebook.aura.navigation.key;

import X.AbstractC5321DgF;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C06H;
import X.C79;
import X.C9hr;
import X.C9iL;
import X.Ey9;
import X.F0C;
import X.F3w;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Serializable
/* loaded from: classes.dex */
public final class ConfidentialVmSwitchDirection {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ConfidentialVmSwitchDirection[] $VALUES;
    public static final F0C<C9hr<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    public static final ConfidentialVmSwitchDirection TO_CONFIDENTIAL_VM;
    public static final ConfidentialVmSwitchDirection TO_SECURE_VM;

    public final class Companion {

        /* renamed from: com.facebook.aura.navigation.key.ConfidentialVmSwitchDirection$Companion$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<C9hr<Object>> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final C9hr<Object> invoke() {
                return C9iL.A01("com.facebook.aura.navigation.key.ConfidentialVmSwitchDirection", ConfidentialVmSwitchDirection.values());
            }
        }

        private final /* synthetic */ C9hr get$cachedSerializer() {
            return AnonymousClass001.A12(ConfidentialVmSwitchDirection.$cachedSerializer$delegate);
        }

        public final C9hr<ConfidentialVmSwitchDirection> serializer() {
            return AnonymousClass001.A12(ConfidentialVmSwitchDirection.$cachedSerializer$delegate);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        ConfidentialVmSwitchDirection confidentialVmSwitchDirection = new ConfidentialVmSwitchDirection("TO_CONFIDENTIAL_VM", 0);
        TO_CONFIDENTIAL_VM = confidentialVmSwitchDirection;
        ConfidentialVmSwitchDirection confidentialVmSwitchDirection2 = new ConfidentialVmSwitchDirection("TO_SECURE_VM", 1);
        TO_SECURE_VM = confidentialVmSwitchDirection2;
        ConfidentialVmSwitchDirection[] confidentialVmSwitchDirectionArr = {confidentialVmSwitchDirection, confidentialVmSwitchDirection2};
        $VALUES = confidentialVmSwitchDirectionArr;
        $ENTRIES = new F3w(confidentialVmSwitchDirectionArr);
        Companion = new Companion();
        $cachedSerializer$delegate = AbstractC5321DgF.A02(C79.A01, Companion.AnonymousClass1.INSTANCE);
    }

    public static Ey9<ConfidentialVmSwitchDirection> getEntries() {
        return $ENTRIES;
    }

    public static ConfidentialVmSwitchDirection valueOf(String str) {
        return (ConfidentialVmSwitchDirection) Enum.valueOf(ConfidentialVmSwitchDirection.class, str);
    }

    public static ConfidentialVmSwitchDirection[] values() {
        return (ConfidentialVmSwitchDirection[]) $VALUES.clone();
    }

    public ConfidentialVmSwitchDirection(String str, int i) {
    }
}

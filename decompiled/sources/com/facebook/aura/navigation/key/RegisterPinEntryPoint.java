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
public final class RegisterPinEntryPoint {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ RegisterPinEntryPoint[] $VALUES;
    public static final F0C<C9hr<Object>> $cachedSerializer$delegate;
    public static final RegisterPinEntryPoint ACTIVATION;
    public static final RegisterPinEntryPoint CVM_ENROLLMENT;
    public static final Companion Companion;
    public static final RegisterPinEntryPoint INTERNAL_SETTINGS;
    public static final RegisterPinEntryPoint ONBOARDING;
    public static final RegisterPinEntryPoint SETTINGS;
    public static final RegisterPinEntryPoint SVM_TO_CVM_DATA_TRANSFER;
    public static final RegisterPinEntryPoint SVM_TO_CVM_SWITCH;

    public final class Companion {

        /* renamed from: com.facebook.aura.navigation.key.RegisterPinEntryPoint$Companion$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<C9hr<Object>> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final C9hr<Object> invoke() {
                return C9iL.A01("com.facebook.aura.navigation.key.RegisterPinEntryPoint", RegisterPinEntryPoint.values());
            }
        }

        private final /* synthetic */ C9hr get$cachedSerializer() {
            return AnonymousClass001.A12(RegisterPinEntryPoint.$cachedSerializer$delegate);
        }

        public final C9hr<RegisterPinEntryPoint> serializer() {
            return AnonymousClass001.A12(RegisterPinEntryPoint.$cachedSerializer$delegate);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        RegisterPinEntryPoint registerPinEntryPoint = new RegisterPinEntryPoint("INTERNAL_SETTINGS", 0);
        INTERNAL_SETTINGS = registerPinEntryPoint;
        RegisterPinEntryPoint registerPinEntryPoint2 = new RegisterPinEntryPoint("SETTINGS", 1);
        SETTINGS = registerPinEntryPoint2;
        RegisterPinEntryPoint registerPinEntryPoint3 = new RegisterPinEntryPoint("ONBOARDING", 2);
        ONBOARDING = registerPinEntryPoint3;
        RegisterPinEntryPoint registerPinEntryPoint4 = new RegisterPinEntryPoint("ACTIVATION", 3);
        ACTIVATION = registerPinEntryPoint4;
        RegisterPinEntryPoint registerPinEntryPoint5 = new RegisterPinEntryPoint("CVM_ENROLLMENT", 4);
        CVM_ENROLLMENT = registerPinEntryPoint5;
        RegisterPinEntryPoint registerPinEntryPoint6 = new RegisterPinEntryPoint("SVM_TO_CVM_SWITCH", 5);
        SVM_TO_CVM_SWITCH = registerPinEntryPoint6;
        RegisterPinEntryPoint registerPinEntryPoint7 = new RegisterPinEntryPoint("SVM_TO_CVM_DATA_TRANSFER", 6);
        SVM_TO_CVM_DATA_TRANSFER = registerPinEntryPoint7;
        RegisterPinEntryPoint[] registerPinEntryPointArr = {registerPinEntryPoint, registerPinEntryPoint2, registerPinEntryPoint3, registerPinEntryPoint4, registerPinEntryPoint5, registerPinEntryPoint6, registerPinEntryPoint7};
        $VALUES = registerPinEntryPointArr;
        $ENTRIES = new F3w(registerPinEntryPointArr);
        Companion = new Companion();
        $cachedSerializer$delegate = AbstractC5321DgF.A02(C79.A01, Companion.AnonymousClass1.INSTANCE);
    }

    public static Ey9<RegisterPinEntryPoint> getEntries() {
        return $ENTRIES;
    }

    public static RegisterPinEntryPoint valueOf(String str) {
        return (RegisterPinEntryPoint) Enum.valueOf(RegisterPinEntryPoint.class, str);
    }

    public static RegisterPinEntryPoint[] values() {
        return (RegisterPinEntryPoint[]) $VALUES.clone();
    }

    public final boolean isSvmToCvmSwitch() {
        return this == SVM_TO_CVM_SWITCH || this == SVM_TO_CVM_DATA_TRANSFER;
    }

    public RegisterPinEntryPoint(String str, int i) {
    }
}

package com.facebook.aura.ageverification;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class AgeVerificationMethod {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AgeVerificationMethod[] $VALUES;
    public static final AgeVerificationMethod ID;
    public static final AgeVerificationMethod SELFIE;

    static {
        AgeVerificationMethod ageVerificationMethod = new AgeVerificationMethod("SELFIE", 0);
        SELFIE = ageVerificationMethod;
        AgeVerificationMethod ageVerificationMethod2 = new AgeVerificationMethod("ID", 1);
        ID = ageVerificationMethod2;
        AgeVerificationMethod[] ageVerificationMethodArr = {ageVerificationMethod, ageVerificationMethod2};
        $VALUES = ageVerificationMethodArr;
        $ENTRIES = C3cG.A0w(ageVerificationMethodArr);
    }

    public static Ey9<AgeVerificationMethod> getEntries() {
        return $ENTRIES;
    }

    public static AgeVerificationMethod valueOf(String str) {
        return (AgeVerificationMethod) Enum.valueOf(AgeVerificationMethod.class, str);
    }

    public static AgeVerificationMethod[] values() {
        return (AgeVerificationMethod[]) $VALUES.clone();
    }

    public AgeVerificationMethod(String str, int i) {
    }
}

package com.facebook.aura.user.provider;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.ccv.nativeflow.HatchCheckoutClientKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class AgeCheckMethod {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AgeCheckMethod[] $VALUES;
    public static final AgeCheckMethod CREDIT_CARD;
    public static final AgeCheckMethod FACEBOOK;
    public static final AgeCheckMethod INSTAGRAM;
    public static final AgeCheckMethod SELFIE;

    static {
        AgeCheckMethod ageCheckMethod = new AgeCheckMethod("SELFIE", 0);
        SELFIE = ageCheckMethod;
        AgeCheckMethod ageCheckMethod2 = new AgeCheckMethod(HatchCheckoutClientKt.CREDENTIAL_TYPE_CARD, 1);
        CREDIT_CARD = ageCheckMethod2;
        AgeCheckMethod ageCheckMethod3 = new AgeCheckMethod("FACEBOOK", 2);
        FACEBOOK = ageCheckMethod3;
        AgeCheckMethod ageCheckMethod4 = new AgeCheckMethod("INSTAGRAM", 3);
        INSTAGRAM = ageCheckMethod4;
        AgeCheckMethod[] ageCheckMethodArr = {ageCheckMethod, ageCheckMethod2, ageCheckMethod3, ageCheckMethod4};
        $VALUES = ageCheckMethodArr;
        $ENTRIES = C3cG.A0w(ageCheckMethodArr);
    }

    public static Ey9<AgeCheckMethod> getEntries() {
        return $ENTRIES;
    }

    public static AgeCheckMethod valueOf(String str) {
        return (AgeCheckMethod) Enum.valueOf(AgeCheckMethod.class, str);
    }

    public static AgeCheckMethod[] values() {
        return (AgeCheckMethod[]) $VALUES.clone();
    }

    public AgeCheckMethod(String str, int i) {
    }
}

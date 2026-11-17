package com.facebook.aura.ageverification.intf;

import X.AnonymousClass006;
import X.C06H;
import X.C3cG;
import X.Ey9;
import com.facebook.aura.ageverification.SelfieAgeStepViewModelKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class AgeCheckFailure {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AgeCheckFailure[] $VALUES;
    public static final AgeCheckFailure CAMERA_ERROR;
    public static final AgeCheckFailure CANCELLED;
    public static final AgeCheckFailure CARD_DECLINED;
    public static final AgeCheckFailure CHECKOUT_SERVER_ERROR;
    public static final AgeCheckFailure CHECKOUT_UNAVAILABLE;
    public static final AgeCheckFailure FACE_DETECTION_UNAVAILABLE;
    public static final AgeCheckFailure GENERIC;
    public static final AgeCheckFailure NOT_ELIGIBLE;
    public static final AgeCheckFailure RATE_LIMITED;
    public static final AgeCheckFailure RECORDING_FAILED;
    public static final AgeCheckFailure RESTART_LINKING;
    public static final AgeCheckFailure SYSTEM_ERROR;
    public static final AgeCheckFailure THREE_DS_FAILED;
    public static final AgeCheckFailure TIMEOUT;
    public static final AgeCheckFailure UPLOAD_FAILED;
    public static final AgeCheckFailure USABILITY_ERROR;
    public final String wireValue;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i = 1;
        AgeCheckFailure ageCheckFailure = new AgeCheckFailure(SelfieAgeStepViewModelKt.ATTEMPT_USABILITY_ERROR, 0, null, i, 0 == true ? 1 : 0);
        USABILITY_ERROR = ageCheckFailure;
        int i2 = 1;
        AgeCheckFailure ageCheckFailure2 = new AgeCheckFailure("SYSTEM_ERROR", i, 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        SYSTEM_ERROR = ageCheckFailure2;
        AgeCheckFailure ageCheckFailure3 = new AgeCheckFailure("RATE_LIMITED", 2, null, i2, 0 == true ? 1 : 0);
        RATE_LIMITED = ageCheckFailure3;
        AgeCheckFailure ageCheckFailure4 = new AgeCheckFailure("UPLOAD_FAILED", 3, 0 == true ? 1 : 0, i2, 0 == true ? 1 : 0);
        UPLOAD_FAILED = ageCheckFailure4;
        AgeCheckFailure ageCheckFailure5 = new AgeCheckFailure("TIMEOUT", 4, 0 == true ? 1 : 0, i2, 0 == true ? 1 : 0);
        TIMEOUT = ageCheckFailure5;
        AgeCheckFailure ageCheckFailure6 = new AgeCheckFailure("CAMERA_ERROR", 5, 0 == true ? 1 : 0, i2, 0 == true ? 1 : 0);
        CAMERA_ERROR = ageCheckFailure6;
        AgeCheckFailure ageCheckFailure7 = new AgeCheckFailure("FACE_DETECTION_UNAVAILABLE", 6, 0 == true ? 1 : 0, i2, 0 == true ? 1 : 0);
        FACE_DETECTION_UNAVAILABLE = ageCheckFailure7;
        AgeCheckFailure ageCheckFailure8 = new AgeCheckFailure("RECORDING_FAILED", 7, 0 == true ? 1 : 0, i2, 0 == true ? 1 : 0);
        RECORDING_FAILED = ageCheckFailure8;
        AgeCheckFailure ageCheckFailure9 = new AgeCheckFailure("CHECKOUT_SERVER_ERROR", 8, "SERVER_ERROR");
        CHECKOUT_SERVER_ERROR = ageCheckFailure9;
        AgeCheckFailure ageCheckFailure10 = new AgeCheckFailure("CHECKOUT_UNAVAILABLE", 9, 0 == true ? 1 : 0, i2, 0 == true ? 1 : 0);
        CHECKOUT_UNAVAILABLE = ageCheckFailure10;
        AgeCheckFailure ageCheckFailure11 = new AgeCheckFailure("THREE_DS_FAILED", 10, 0 == true ? 1 : 0, i2, 0 == true ? 1 : 0);
        THREE_DS_FAILED = ageCheckFailure11;
        AgeCheckFailure ageCheckFailure12 = new AgeCheckFailure("CARD_DECLINED", 11, 0 == true ? 1 : 0, i2, 0 == true ? 1 : 0);
        CARD_DECLINED = ageCheckFailure12;
        AgeCheckFailure ageCheckFailure13 = new AgeCheckFailure("NOT_ELIGIBLE", 12, 0 == true ? 1 : 0, i2, 0 == true ? 1 : 0);
        NOT_ELIGIBLE = ageCheckFailure13;
        AgeCheckFailure ageCheckFailure14 = new AgeCheckFailure("RESTART_LINKING", 13, 0 == true ? 1 : 0, i2, 0 == true ? 1 : 0);
        RESTART_LINKING = ageCheckFailure14;
        AgeCheckFailure ageCheckFailure15 = new AgeCheckFailure("GENERIC", 14, 0 == true ? 1 : 0, i2, 0 == true ? 1 : 0);
        GENERIC = ageCheckFailure15;
        AgeCheckFailure ageCheckFailure16 = new AgeCheckFailure("CANCELLED", 15, 0 == true ? 1 : 0, i2, 0 == true ? 1 : 0);
        CANCELLED = ageCheckFailure16;
        AgeCheckFailure[] ageCheckFailureArr = {ageCheckFailure, ageCheckFailure2, ageCheckFailure3, ageCheckFailure4, ageCheckFailure5, ageCheckFailure6, ageCheckFailure7, ageCheckFailure8, ageCheckFailure9, ageCheckFailure10, ageCheckFailure11, ageCheckFailure12, ageCheckFailure13, ageCheckFailure14, ageCheckFailure15, ageCheckFailure16};
        $VALUES = ageCheckFailureArr;
        $ENTRIES = C3cG.A0w(ageCheckFailureArr);
    }

    public static Ey9<AgeCheckFailure> getEntries() {
        return $ENTRIES;
    }

    public static AgeCheckFailure valueOf(String str) {
        return (AgeCheckFailure) Enum.valueOf(AgeCheckFailure.class, str);
    }

    public static AgeCheckFailure[] values() {
        return (AgeCheckFailure[]) $VALUES.clone();
    }

    public final String getWireValue$fbandroid_express_aura_java_com_facebook_aura_ageverification_intf_intf() {
        return this.wireValue;
    }

    public AgeCheckFailure(String str, int i, String str2) {
        this.wireValue = str2 == null ? AnonymousClass006.A0x(this) : str2;
    }

    public /* synthetic */ AgeCheckFailure(String str, int i, String str2, int i2, C06H c06h) {
        this(str, i, AnonymousClass006.A0r(i2, str2));
    }
}

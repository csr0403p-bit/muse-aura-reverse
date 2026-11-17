package X;

import com.facebook.aura.ccv.nativeflow.HatchCheckoutClientKt;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvThreeDSChallengeDialogKt;
import com.facebook.aura.pairs.PairsPendingLevelStoreKt;
import com.facebook.quicklog.reliability.CancelReason;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.EyA, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC7495EyA {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ EnumC7495EyA[] A01;
    public static final EnumC7495EyA A02;
    public static final EnumC7495EyA A03;
    public static final EnumC7495EyA A04;
    public static final EnumC7495EyA A05;
    public static final EnumC7495EyA A06;
    public final String bloksValue;
    public final String label;

    static {
        EnumC7495EyA enumC7495EyA = new EnumC7495EyA("SUCCESS", 0, HatchCcvThreeDSChallengeDialogKt.AUTH_RESULT_SUCCESS, "success");
        A05 = enumC7495EyA;
        EnumC7495EyA enumC7495EyA2 = new EnumC7495EyA("USER_CANCELLED", 1, "User Cancelled", CancelReason.USER_CANCELLED);
        A06 = enumC7495EyA2;
        EnumC7495EyA enumC7495EyA3 = new EnumC7495EyA(HatchCheckoutClientKt.CHECKOUT_STATUS_PENDING, 2, "Pending", PairsPendingLevelStoreKt.STATE_PENDING);
        A04 = enumC7495EyA3;
        EnumC7495EyA enumC7495EyA4 = new EnumC7495EyA("FAIL", 3, "Fail", "fail");
        A02 = enumC7495EyA4;
        EnumC7495EyA enumC7495EyA5 = new EnumC7495EyA("NETWORK_ERROR", 4, "Network Error", "network_error");
        A03 = enumC7495EyA5;
        EnumC7495EyA[] enumC7495EyAArr = {enumC7495EyA, enumC7495EyA2, enumC7495EyA3, enumC7495EyA4, enumC7495EyA5};
        A01 = enumC7495EyAArr;
        A00 = C3cG.A0w(enumC7495EyAArr);
    }

    public static EnumC7495EyA valueOf(String str) {
        return (EnumC7495EyA) Enum.valueOf(EnumC7495EyA.class, str);
    }

    public static EnumC7495EyA[] values() {
        return (EnumC7495EyA[]) A01.clone();
    }

    public EnumC7495EyA(String str, int i, String str2, String str3) {
        this.label = str2;
        this.bloksValue = str3;
    }
}

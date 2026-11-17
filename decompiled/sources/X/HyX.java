package X;

import com.facebook.aura.subscription.repo.AuraSubscriptionRepositoryJsonKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class HyX {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ HyX[] A01;
    public static final HyX A02;
    public static final HyX A03;
    public static final HyX A04;
    public static final HyX A05;
    public static final HyX A06;
    public static final HyX A07;
    public static final HyX A08;
    public final String serverValue;

    static {
        HyX hyX = new HyX("UNSET_OR_UNRECOGNIZED_ENUM_VALUE", 0, "UNSET_OR_UNRECOGNIZED_ENUM_VALUE");
        A08 = hyX;
        HyX hyX2 = new HyX(AuraSubscriptionRepositoryJsonKt.PENDING_PLAN_CHANGE_DEFERRED, 1, AuraSubscriptionRepositoryJsonKt.PENDING_PLAN_CHANGE_DEFERRED);
        A02 = hyX2;
        HyX hyX3 = new HyX("IMMEDIATE_AND_CHARGE_FULL_PRICE", 2, "IMMEDIATE_AND_CHARGE_FULL_PRICE");
        A03 = hyX3;
        HyX hyX4 = new HyX("IMMEDIATE_SWITCH_WITH_FULL_REFUND", 3, "IMMEDIATE_SWITCH_WITH_FULL_REFUND");
        HyX hyX5 = new HyX("IMMEDIATE_SWITCH_WITH_PRORATED_CHARGE", 4, "IMMEDIATE_SWITCH_WITH_PRORATED_CHARGE");
        A04 = hyX5;
        HyX hyX6 = new HyX("IMMEDIATE_SWITCH_WITH_PRORATED_REFUNDS", 5, "IMMEDIATE_SWITCH_WITH_PRORATED_REFUNDS");
        A05 = hyX6;
        HyX hyX7 = new HyX("IMMEDIATE_SWITCH_WITH_TIME_PRORATION", 6, "IMMEDIATE_SWITCH_WITH_TIME_PRORATION");
        A06 = hyX7;
        HyX hyX8 = new HyX("IMMEDIATE_WITHOUT_PRORATION", 7, "IMMEDIATE_WITHOUT_PRORATION");
        A07 = hyX8;
        HyX[] hyXArr = {hyX, hyX2, hyX3, hyX4, hyX5, hyX6, hyX7, hyX8};
        A01 = hyXArr;
        A00 = C3cG.A0w(hyXArr);
    }

    public static HyX valueOf(String str) {
        return (HyX) Enum.valueOf(HyX.class, str);
    }

    public static HyX[] values() {
        return (HyX[]) A01.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.serverValue;
    }

    public HyX(String str, int i, String str2) {
        this.serverValue = str2;
    }
}

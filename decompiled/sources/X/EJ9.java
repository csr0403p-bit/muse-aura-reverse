package X;

import com.facebook.aura.subscription.repo.AuraSubscriptionRepositoryJsonKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class EJ9 {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ EJ9[] A01;
    public static final EJ9 A02;
    public static final EJ9 A03;

    static {
        EJ9 ej9 = new EJ9(AuraSubscriptionRepositoryJsonKt.PENDING_PLAN_CHANGE_DEFERRED, 0);
        A02 = ej9;
        EJ9 ej92 = new EJ9("IMMEDIATE", 1);
        A03 = ej92;
        EJ9[] ej9Arr = {ej9, ej92, new EJ9("EXCLUSIVE", 2)};
        A01 = ej9Arr;
        A00 = C3cG.A0w(ej9Arr);
    }

    public static EJ9 valueOf(String str) {
        return (EJ9) Enum.valueOf(EJ9.class, str);
    }

    public static EJ9[] values() {
        return (EJ9[]) A01.clone();
    }

    public EJ9(String str, int i) {
    }
}

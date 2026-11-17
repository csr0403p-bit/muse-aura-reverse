package X;

import com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.EKm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC6619EKm {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ EnumC6619EKm[] A01;
    public static final EnumC6619EKm A02;
    public static final EnumC6619EKm A03;
    public static final EnumC6619EKm A04;
    public static final EnumC6619EKm A05;
    public static final EnumC6619EKm A06;
    public static final EnumC6619EKm A07;

    static {
        EnumC6619EKm enumC6619EKm = new EnumC6619EKm("ENQUEUED", 0);
        A04 = enumC6619EKm;
        EnumC6619EKm enumC6619EKm2 = new EnumC6619EKm("RUNNING", 1);
        A06 = enumC6619EKm2;
        EnumC6619EKm enumC6619EKm3 = new EnumC6619EKm(CvmMigrationStatusJson.STAGE_SUCCEEDED, 2);
        A07 = enumC6619EKm3;
        EnumC6619EKm enumC6619EKm4 = new EnumC6619EKm(CvmMigrationStatusJson.STAGE_FAILED, 3);
        A05 = enumC6619EKm4;
        EnumC6619EKm enumC6619EKm5 = new EnumC6619EKm("BLOCKED", 4);
        A02 = enumC6619EKm5;
        EnumC6619EKm enumC6619EKm6 = new EnumC6619EKm("CANCELLED", 5);
        A03 = enumC6619EKm6;
        EnumC6619EKm[] enumC6619EKmArr = {enumC6619EKm, enumC6619EKm2, enumC6619EKm3, enumC6619EKm4, enumC6619EKm5, enumC6619EKm6};
        A01 = enumC6619EKmArr;
        A00 = C3cG.A0w(enumC6619EKmArr);
    }

    public static EnumC6619EKm valueOf(String str) {
        return (EnumC6619EKm) Enum.valueOf(EnumC6619EKm.class, str);
    }

    public static EnumC6619EKm[] values() {
        return (EnumC6619EKm[]) A01.clone();
    }

    public EnumC6619EKm(String str, int i) {
    }
}

package X;

import com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Huf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC10573Huf {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ EnumC10573Huf[] A01;
    public static final EnumC10573Huf A02;
    public static final EnumC10573Huf A03;
    public static final EnumC10573Huf A04;
    public static final EnumC10573Huf A05;
    public static final EnumC10573Huf A06;

    public final boolean A00(EnumC10573Huf enumC10573Huf) {
        C7384Etj.A0Y(enumC10573Huf, 0);
        return compareTo(enumC10573Huf) >= 0;
    }

    static {
        EnumC10573Huf enumC10573Huf = new EnumC10573Huf("DESTROYED", 0);
        A03 = enumC10573Huf;
        EnumC10573Huf enumC10573Huf2 = new EnumC10573Huf("INITIALIZED", 1);
        A04 = enumC10573Huf2;
        EnumC10573Huf enumC10573Huf3 = new EnumC10573Huf("CREATED", 2);
        A02 = enumC10573Huf3;
        EnumC10573Huf enumC10573Huf4 = new EnumC10573Huf(CvmMigrationStatusJson.STAGE_STARTED, 3);
        A06 = enumC10573Huf4;
        EnumC10573Huf enumC10573Huf5 = new EnumC10573Huf("RESUMED", 4);
        A05 = enumC10573Huf5;
        EnumC10573Huf[] enumC10573HufArr = {enumC10573Huf, enumC10573Huf2, enumC10573Huf3, enumC10573Huf4, enumC10573Huf5};
        A01 = enumC10573HufArr;
        A00 = C3cG.A0w(enumC10573HufArr);
    }

    public static EnumC10573Huf valueOf(String str) {
        return (EnumC10573Huf) Enum.valueOf(EnumC10573Huf.class, str);
    }

    public static EnumC10573Huf[] values() {
        return (EnumC10573Huf[]) A01.clone();
    }

    public EnumC10573Huf(String str, int i) {
    }
}

package X;

import com.facebook.aura.confidentialvm.model.ConfidentialVmEligibility;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Hij, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC10450Hij {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ EnumC10450Hij[] A01;
    public static final EnumC10450Hij A02;
    public static final EnumC10450Hij A03;
    public final Number type;

    static {
        EnumC10450Hij enumC10450Hij = new EnumC10450Hij(0, "INELIGIBLE", 0);
        A03 = enumC10450Hij;
        EnumC10450Hij enumC10450Hij2 = new EnumC10450Hij(1, ConfidentialVmEligibility.STATE_ELIGIBLE, 1);
        A02 = enumC10450Hij2;
        EnumC10450Hij[] enumC10450HijArr = {enumC10450Hij, enumC10450Hij2};
        A01 = enumC10450HijArr;
        A00 = C3cG.A0w(enumC10450HijArr);
    }

    public static EnumC10450Hij valueOf(String str) {
        return (EnumC10450Hij) Enum.valueOf(EnumC10450Hij.class, str);
    }

    public static EnumC10450Hij[] values() {
        return (EnumC10450Hij[]) A01.clone();
    }

    public EnumC10450Hij(Number number, String str, int i) {
        this.type = number;
    }
}

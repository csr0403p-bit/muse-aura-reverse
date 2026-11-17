package X;

import com.facebook.acra.constants.ReportField;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class BYM {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ BYM[] A01;
    public static final BYM A02;
    public static final BYM A03;

    static {
        BYM bym = new BYM("CONCURRENT", 0);
        A02 = bym;
        BYM bym2 = new BYM(ReportField.SERIAL, 1);
        BYM bym3 = new BYM("IDLE", 2);
        A03 = bym3;
        BYM[] bymArr = {bym, bym2, bym3};
        A01 = bymArr;
        A00 = C3cG.A0w(bymArr);
    }

    public static BYM valueOf(String str) {
        return (BYM) Enum.valueOf(BYM.class, str);
    }

    public static BYM[] values() {
        return (BYM[]) A01.clone();
    }

    public BYM(String str, int i) {
    }
}

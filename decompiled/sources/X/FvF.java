package X;

import com.facebook.aura.commands.sms.DeviceSmsReaderKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class FvF {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ FvF[] A01;
    public static final FvF A02;
    public static final FvF A03;
    public static final FvF A04;
    public static final FvF A05;
    public final String id;

    static {
        FvF fvF = new FvF("SLEEP", 0, "sleep");
        A04 = fvF;
        FvF fvF2 = new FvF("WORKOUT", 1, "workout");
        A05 = fvF2;
        FvF fvF3 = new FvF("MEAL", 2, "meal");
        A02 = fvF3;
        FvF fvF4 = new FvF("OTHER", 3, DeviceSmsReaderKt.ATTACHMENT_OTHER);
        A03 = fvF4;
        FvF[] fvFArr = {fvF, fvF2, fvF3, fvF4};
        A01 = fvFArr;
        A00 = C3cG.A0w(fvFArr);
    }

    public static FvF valueOf(String str) {
        return (FvF) Enum.valueOf(FvF.class, str);
    }

    public static FvF[] values() {
        return (FvF[]) A01.clone();
    }

    public FvF(String str, int i, String str2) {
        this.id = str2;
    }
}

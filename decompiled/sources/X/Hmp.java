package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class Hmp {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ Hmp[] A01;
    public static final Hmp A02;
    public static final Hmp A03;
    public final String[] permissions;

    static {
        Hmp hmp = new Hmp(0, "MICROPHONE", new String[]{"android.permission.RECORD_AUDIO"});
        A02 = hmp;
        Hmp hmp2 = new Hmp(1, "CAMERA", new String[]{"android.permission.CAMERA"});
        Hmp hmp3 = new Hmp(2, "MICROPHONE_AND_CAMERA", new String[]{"android.permission.RECORD_AUDIO", "android.permission.CAMERA"});
        A03 = hmp3;
        Hmp[] hmpArr = {hmp, hmp2, hmp3};
        A01 = hmpArr;
        A00 = C3cG.A0w(hmpArr);
    }

    public static Hmp valueOf(String str) {
        return (Hmp) Enum.valueOf(Hmp.class, str);
    }

    public static Hmp[] values() {
        return (Hmp[]) A01.clone();
    }

    public Hmp(int i, String str, String[] strArr) {
        this.permissions = strArr;
    }
}

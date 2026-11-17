package X;

import android.os.SystemProperties;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes5.dex */
public final class C1A {
    public static final List<String> A02;
    public static final List<String> A03;
    public static final List<String> A04;
    public static final String[] A05;
    public String A00;
    public String A01;

    static {
        ArrayList arrayListA0h = C3cG.A0h();
        A04 = arrayListA0h;
        arrayListA0h.add("msmnile");
        arrayListA0h.add("trinket");
        arrayListA0h.add("kona");
        arrayListA0h.add("atoll");
        arrayListA0h.add("lito");
        arrayListA0h.add("bengal");
        arrayListA0h.add("lahaina");
        arrayListA0h.add("holi");
        arrayListA0h.add("taro");
        arrayListA0h.add("qm215");
        ArrayList arrayListA0h2 = C3cG.A0h();
        A02 = arrayListA0h2;
        arrayListA0h2.add("tensor");
        arrayListA0h2.add("gs201");
        ArrayList arrayListA0h3 = C3cG.A0h();
        A03 = arrayListA0h3;
        arrayListA0h3.add("orlando");
        A05 = new String[]{"ro.soc.model", "ro.board.platform", "ro.mediatek.platform", "ro.mediatek.hardware"};
    }

    public C1A() {
        String str;
        String str2;
        this.A01 = "others";
        this.A00 = "N/A";
        String[] strArr = A05;
        int i = 0;
        while (true) {
            str = SystemProperties.get(strArr[i]);
            if (str != null && !str.isEmpty()) {
                break;
            }
            i++;
            if (i >= 4) {
                if (str == null) {
                    return;
                }
            }
        }
        if (str.isEmpty()) {
            return;
        }
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        if (!lowerCase.startsWith("msm") && !lowerCase.startsWith("apq") && !lowerCase.startsWith("sdm") && !lowerCase.startsWith("sm") && !A04.contains(lowerCase)) {
            if (lowerCase.startsWith("exynos") || lowerCase.startsWith("universal") || lowerCase.startsWith("erd") || lowerCase.startsWith("s5e")) {
                this.A01 = "samsung";
                String str3 = SystemProperties.get("ro.chipname");
                if (((str3 != null && !str3.isEmpty()) || (str3 = SystemProperties.get("ro.hardware.chipname")) != null) && !str3.isEmpty()) {
                    lowerCase = str3;
                }
            } else if (lowerCase.startsWith("mt")) {
                str2 = "mediatek";
            } else if (lowerCase.startsWith("sc") || lowerCase.startsWith("sp9") || lowerCase.startsWith("sp7") || lowerCase.startsWith("ums")) {
                str2 = "spreadtrum";
            } else if (lowerCase.startsWith("hi") || lowerCase.startsWith("kirin") || A03.contains(lowerCase)) {
                str2 = "hisilicon";
            } else if (lowerCase.startsWith("rk")) {
                str2 = "rockchip";
            } else if (lowerCase.startsWith("bcm")) {
                str2 = "broadcom";
            } else if (A02.contains(lowerCase) || lowerCase.startsWith("tensor")) {
                str2 = "google";
            } else if (lowerCase.startsWith("t6") || lowerCase.startsWith("t3")) {
                str2 = "unisoc";
            } else if (lowerCase.startsWith("n4") || lowerCase.startsWith("n3")) {
                str2 = "intel";
            }
            this.A00 = lowerCase;
        }
        str2 = "qualcomm";
        this.A01 = str2;
        this.A00 = lowerCase;
    }
}

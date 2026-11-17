package X;

import java.util.HashSet;
import java.util.Set;

/* loaded from: classes5.dex */
public abstract class BY5 {
    public static final BXJ A00;
    public static final Set<String> A01;
    public static final Set<String> A02;

    static {
        String[] strArr = new String[30];
        System.arraycopy(new String[]{"moto z2 play", "moto g (5) plus", "moto g (5s)"}, BV5.A1U(new String[]{"blade v8 se", "sm-a320y", "moto g(7) power", "pot-lx1af", "lm-x220", "lenovo a6010", "lm-q710.fg", "infinix note 3", "cph1861", "ax1074", "sm-j327vpp", "lm-x220pm", "i10 plus", "moto g(6) plus", "5049w", "blade v9", "vivo 1806", "motorola one", "lgl84vl", "lgmp450", "redmi 3", "sm-n920s", "samsung-sm-g920a", "lgls676", "iris50", "asus_x01bda", "asus_z012dc"}, strArr) ? 1 : 0, strArr, 27, 3);
        HashSet hashSet = new HashSet(AIW.A0H(30));
        int i = 0;
        do {
            hashSet.add(strArr[i]);
            i++;
        } while (i < 30);
        A02 = hashSet;
        String[] strArr2 = {"Motorola", "Moto", "MOTOROLA"};
        HashSet hashSet2 = new HashSet(AIW.A0H(3));
        int i2 = 0;
        do {
            hashSet2.add(strArr2[i2]);
            i2++;
        } while (i2 < 3);
        A01 = hashSet2;
        A00 = new BXJ(hashSet, hashSet2);
    }
}

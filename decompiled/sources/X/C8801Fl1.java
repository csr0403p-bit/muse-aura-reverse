package X;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Fl1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8801Fl1 {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public String A07;
    public List<AbstractC2181B0z> A08;
    public List<? extends AbstractC8825Fld> A09;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public C8801Fl1() {
        float f = 0.0f;
        this(null, 0 == true ? 1 : 0, f, f, f, f, f, f, f, 1023);
    }

    public static List A00(AbstractList abstractList) {
        return ((C8801Fl1) abstractList.get(abstractList.size() - 1)).A08;
    }

    public /* synthetic */ C8801Fl1(String str, List list, float f, float f2, float f3, float f4, float f5, float f6, float f7, int i) {
        str = (i & 1) != 0 ? "" : str;
        f = (i & 2) != 0 ? 0.0f : f;
        f2 = (i & 4) != 0 ? 0.0f : f2;
        f3 = (i & 8) != 0 ? 0.0f : f3;
        f4 = (i & 16) != 0 ? 1.0f : f4;
        f5 = (i & 32) != 0 ? 1.0f : f5;
        f6 = (i & 64) != 0 ? 0.0f : f6;
        f7 = (i & 128) != 0 ? 0.0f : f7;
        list = (i & 256) != 0 ? AbstractC2176B0u.A00 : list;
        ArrayList arrayListA0h = C3cG.A0h();
        this.A07 = str;
        this.A02 = f;
        this.A00 = f2;
        this.A01 = f3;
        this.A03 = f4;
        this.A04 = f5;
        this.A05 = f6;
        this.A06 = f7;
        this.A09 = list;
        this.A08 = arrayListA0h;
    }
}

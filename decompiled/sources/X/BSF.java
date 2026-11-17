package X;

import java.lang.reflect.Field;
import java.util.Comparator;

/* loaded from: classes4.dex */
public final class BSF implements Comparator {
    public final int $t;

    public BSF(int i) {
        this.$t = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        switch (this.$t) {
            case 0:
                APo aPo = (APo) t;
                APo aPo2 = (APo) t2;
                return Float.valueOf((aPo.AMw() == 0.0f && (aPo instanceof APh) && ((APh) aPo).A01 == null) ? -1.0f : aPo.AMw()).compareTo(Float.valueOf((aPo2.AMw() == 0.0f && (aPo2 instanceof APh) && ((APh) aPo2).A01 == null) ? -1.0f : aPo2.AMw()));
            case 1:
                return C7384Etj.A00(((AfM) t2).A00, ((AfM) t).A00);
            case 2:
                return C7384Etj.A00(((InterfaceC1174Add) t).getIndex(), ((InterfaceC1174Add) t2).getIndex());
            case 3:
                return C7384Etj.A00(((C2233BCd) t).A00, ((C2233BCd) t2).A00);
            case 4:
                return AbstractC7536F0j.A00(((Field) t).getName(), ((Field) t2).getName());
            case 5:
                C1453AjM c1453AjM = (C1453AjM) t;
                C1453AjM c1453AjM2 = (C1453AjM) t2;
                int iA00 = C7384Etj.A00(c1453AjM.A00, c1453AjM2.A00);
                return iA00 == 0 ? C7384Etj.A00(c1453AjM.hashCode(), c1453AjM2.hashCode()) : iA00;
            case 6:
                C1454AjN c1454AjN = ((C1453AjM) t).A0d.A0G;
                float f = c1454AjN.A02;
                C1454AjN c1454AjN2 = ((C1453AjM) t2).A0d.A0G;
                float f2 = c1454AjN2.A02;
                return f == f2 ? C7384Etj.A00(c1454AjN.A03, c1454AjN2.A03) : Float.compare(f, f2);
            case 7:
            case 8:
                return Integer.valueOf(((C1733ApU) t).A01).compareTo(Integer.valueOf(((C1733ApU) t2).A01));
            case 9:
                C0968AJv c0968AJv = (C0968AJv) t;
                C0968AJv c0968AJv2 = (C0968AJv) t2;
                return (c0968AJv.A01 - c0968AJv.A00) - (c0968AJv2.A01 - c0968AJv2.A00);
            case 10:
                return Integer.valueOf(((HkU) ((HxE) t).first).ordinal()).compareTo(Integer.valueOf(((HkU) ((HxE) t2).first).ordinal()));
            default:
                return 0;
        }
    }
}

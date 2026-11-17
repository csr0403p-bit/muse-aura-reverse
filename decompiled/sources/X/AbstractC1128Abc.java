package X;

/* renamed from: X.Abc, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1128Abc {
    public static final int A00(InterfaceC1129Abd interfaceC1129Abd, Object obj, int i) {
        int itemCount;
        int iAGP;
        return (obj == null || (itemCount = interfaceC1129Abd.getItemCount()) == 0 || (i < itemCount && obj.equals(interfaceC1129Abd.AGm(i))) || (iAGP = interfaceC1129Abd.AGP(obj)) == -1) ? i : iAGP;
    }
}

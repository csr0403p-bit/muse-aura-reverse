package X;

import java.util.List;

/* renamed from: X.5qz, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C5qz {
    public static final AMP A00(C5r0 c5r0, List list, List list2, List list3) {
        AMP ampCalculateScene;
        int size = list2.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                ampCalculateScene = new C5qp().calculateScene(c5r0, list);
                break;
            }
            ampCalculateScene = ((C5qH) list2.get(i)).calculateScene(c5r0, list);
            if (ampCalculateScene != null) {
                break;
            }
            i++;
        }
        int size2 = list3.size();
        for (int i2 = 0; i2 < size2; i2++) {
            list3.get(i2);
            if (!(ampCalculateScene instanceof BLi) || (ampCalculateScene = (BLi) ampCalculateScene) == null) {
                throw new NullPointerException("decorateScene");
            }
        }
        return ampCalculateScene;
    }
}

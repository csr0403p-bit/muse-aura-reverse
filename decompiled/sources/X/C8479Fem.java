package X;

import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Fem, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8479Fem implements InterfaceC8476Fej {
    public int A00;
    public C8345FcJ A01;
    public C8345FcJ A02;
    public boolean A03;
    public final C8474Feh A04;
    public final ArrayList<C8480Fen> A05 = C3cG.A0h();

    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x008b A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A00(X.C8479Fem r12) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8479Fem.A00(X.Fem):void");
    }

    public C8479Fem(C8474Feh c8474Feh, List<C8480Fen> list) {
        C8345FcJ c8345FcJ = C8345FcJ.A04;
        this.A01 = c8345FcJ;
        this.A02 = c8345FcJ;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i);
        }
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C8480Fen c8480Fen = list.get(i2);
            Object obj = c8480Fen.A03;
            if (obj != null) {
                StringBuilder sbA0q = BV5.A0q(c8480Fen);
                sbA0q.append(" (");
                sbA0q.append(i2 + 1);
                sbA0q.append(CustomConnectorRegisterRepositoryKt.ROOT_PATH);
                sbA0q.append(size2);
                sbA0q.append(") is already controlled by ");
                sbA0q.append(obj);
                throw C3cG.A0Q(AnonymousClass006.A0y(this, " but is still added to ", sbA0q));
            }
            c8480Fen.A03 = this;
            this.A05.add(c8480Fen);
        }
        ArrayList<InterfaceC8476Fej> arrayList = c8474Feh.A04;
        if (!arrayList.contains(this)) {
            arrayList.add(this);
            C8345FcJ c8345FcJ2 = c8474Feh.A01;
            C8345FcJ c8345FcJ3 = c8474Feh.A02;
            this.A01 = c8345FcJ2;
            this.A02 = c8345FcJ3;
            A00(this);
            int i3 = c8474Feh.A00;
            ArrayList<C8480Fen> arrayList2 = this.A05;
            int size3 = arrayList2.size();
            while (true) {
                size3--;
                if (size3 < 0) {
                    break;
                }
                C8480Fen c8480Fen2 = arrayList2.get(size3);
                if (!c8480Fen2.A04) {
                    C8480Fen.A00(c8480Fen2, i3);
                }
            }
        }
        this.A04 = c8474Feh;
    }
}

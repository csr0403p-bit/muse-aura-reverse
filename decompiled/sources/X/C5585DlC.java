package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.DlC, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5585DlC {
    public final long A00;
    public final C5493DjV A01;
    public final String A02;
    public final List<Dl9> A03;
    public final List<C5483DjL> A04;

    public final int A00(int i) {
        List<Dl9> list = this.A03;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (BV6.A0c(list, i2).A06 == i) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;JLjava/util/List<LX/Dl9;>;Ljava/util/List<LX/DjL;>;LX/DjV;)V */
    public C5585DlC(C5493DjV c5493DjV, String str, List list, List list2, long j) {
        this.A02 = str;
        this.A00 = j;
        this.A03 = Collections.unmodifiableList(list);
        this.A04 = Collections.unmodifiableList(list2);
        this.A01 = c5493DjV;
    }
}

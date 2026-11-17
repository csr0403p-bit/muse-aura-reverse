package X;

import android.os.LocaleList;
import java.util.ArrayList;

/* renamed from: X.BPd, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2268BPd implements BNF {
    public LocaleList A00;
    public C0874AGa A01;
    public final BNK A02 = new BNK();

    @Override // X.BNF
    public final C0874AGa AEM() {
        C0874AGa c0874AGa;
        LocaleList localeList = LocaleList.getDefault();
        synchronized (this.A02) {
            c0874AGa = this.A01;
            if (c0874AGa == null || localeList != this.A00) {
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    arrayList.add(new BN1(localeList.get(i)));
                }
                c0874AGa = new C0874AGa(arrayList);
                this.A00 = localeList;
                this.A01 = c0874AGa;
            }
        }
        return c0874AGa;
    }
}

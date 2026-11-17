package X;

import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class CM4 implements BeM<CMB> {
    public final /* synthetic */ String A00;

    public CM4(String str) {
        this.A00 = str;
    }

    @Override // X.BeM
    public final /* bridge */ /* synthetic */ void accept(CMB cmb) {
        synchronized (CM0.A02) {
            DQZ<String, ArrayList<BeM<CMB>>> dqz = CM0.A01;
            String str = this.A00;
            ArrayList<BeM<CMB>> arrayList = dqz.get(str);
            if (arrayList == null) {
                return;
            }
            dqz.remove(str);
            for (int i = 0; i < arrayList.size(); i++) {
                arrayList.get(i).accept(cmb);
            }
        }
    }
}

package X;

import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class Ej3 implements Runnable {
    public static final String __redex_internal_original_name = "DeferredReleaserConcurrentImpl$releaseRunnable$1";
    public final /* synthetic */ C7238Ej2 A00;

    public Ej3(C7238Ej2 c7238Ej2) {
        this.A00 = c7238Ej2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7238Ej2 c7238Ej2 = this.A00;
        synchronized (c7238Ej2.A03) {
            ArrayList<InterfaceC7295EkM> arrayList = c7238Ej2.A01;
            c7238Ej2.A01 = c7238Ej2.A00;
            c7238Ej2.A00 = arrayList;
        }
        int size = c7238Ej2.A01.size();
        int i = 0;
        while (true) {
            ArrayList<InterfaceC7295EkM> arrayList2 = c7238Ej2.A01;
            if (i >= size) {
                arrayList2.clear();
                return;
            } else {
                ((AbstractC7224Eio) arrayList2.get(i)).close();
                i++;
            }
        }
    }
}

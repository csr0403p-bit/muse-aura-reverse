package X;

import java.util.AbstractCollection;
import java.util.Iterator;

/* loaded from: classes6.dex */
public abstract class G69 implements G65 {
    public G65 A00;
    public final int A01;
    public final int A02;
    public final G72 A03;

    public G69(G72 g72, int i, int i2) {
        this.A03 = g72;
        this.A02 = i;
        this.A01 = i2;
    }

    public static void A00(AbstractCollection abstractCollection, Iterator it) {
        Object next = it.next();
        if (((G69) ((G65) next)).A03.equals(AbstractC9206G6m.A0L)) {
            abstractCollection.add(next);
        }
    }
}

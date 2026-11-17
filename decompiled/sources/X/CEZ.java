package X;

import java.io.File;
import java.util.ArrayDeque;

/* loaded from: classes5.dex */
public final class CEZ extends AbstractC7470ExA<File> {
    public final ArrayDeque<AbstractC3323CEc> A00;
    public final /* synthetic */ CEW A01;

    public CEZ(CEW cew) {
        AbstractC3323CEc c3322CEb;
        this.A01 = cew;
        ArrayDeque<AbstractC3323CEc> arrayDequeA0s = BV4.A0s();
        this.A00 = arrayDequeA0s;
        File file = cew.A00;
        if (file.isDirectory()) {
            c3322CEb = new C3321CEa(file, this);
        } else {
            if (!file.isFile()) {
                super.A00 = 2;
                return;
            }
            c3322CEb = new C3322CEb(file, this);
        }
        arrayDequeA0s.push(c3322CEb);
    }
}

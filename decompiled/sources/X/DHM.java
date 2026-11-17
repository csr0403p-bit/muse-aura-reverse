package X;

import java.io.File;
import java.io.FileFilter;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class DHM implements FileFilter {
    public static final DHM A00 = new DHM();

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        String name = file.getName();
        C7384Etj.A0X(name);
        if (name.startsWith("cpu")) {
            Iterable iterableA0C = ATD.A0C(3, name.length());
            if (!(iterableA0C instanceof Collection) || !((Collection) iterableA0C).isEmpty()) {
                Iterator<Integer> it = iterableA0C.iterator();
                while (it.hasNext()) {
                    if (!Character.isDigit(name.charAt(((BNt) it).A00()))) {
                    }
                }
            }
            return true;
        }
        return false;
    }
}

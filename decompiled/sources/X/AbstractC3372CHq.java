package X;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

/* renamed from: X.CHq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3372CHq {
    public static final Iterator<AbstractC3372CHq> A01 = C60O.A11(0).iterator();
    public final File A00;

    public final Iterator<AbstractC3372CHq> A00() {
        if (!(this instanceof AbstractC3371CHp)) {
            return A01;
        }
        AbstractC3371CHp abstractC3371CHp = (AbstractC3371CHp) this;
        File file = ((AbstractC3372CHq) abstractC3371CHp).A00;
        FileFilter fileFilter = abstractC3371CHp.A00;
        Comparator<File> comparator = abstractC3371CHp.A01;
        Object[] objArrListFiles = fileFilter != null ? file.listFiles(fileFilter) : file.listFiles();
        if (objArrListFiles != null) {
            Object[] objArrCopyOf = Arrays.copyOf(objArrListFiles, objArrListFiles.length);
            try {
                Arrays.sort(objArrCopyOf, comparator);
                objArrListFiles = objArrCopyOf;
            } catch (IllegalArgumentException unused) {
            }
        } else {
            objArrListFiles = new File[0];
        }
        return new F5O(abstractC3371CHp, new C7527EzN(objArrListFiles));
    }

    public AbstractC3372CHq(File file) {
        this.A00 = file;
    }
}

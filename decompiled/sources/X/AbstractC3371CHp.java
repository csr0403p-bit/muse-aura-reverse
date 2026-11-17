package X;

import java.io.File;
import java.io.FileFilter;
import java.util.Comparator;

/* renamed from: X.CHp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3371CHp extends AbstractC3372CHq {
    public FileFilter A00;
    public Comparator<File> A01;
    public final boolean A02;

    public AbstractC3371CHp(File file, boolean z) {
        super(file);
        this.A02 = z;
        this.A01 = z ? C3369CHn.A04 : C3369CHn.A05;
    }
}

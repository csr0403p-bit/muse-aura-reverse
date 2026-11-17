package X;

import java.io.File;
import java.io.FilenameFilter;

/* loaded from: classes5.dex */
public final class DSP implements FilenameFilter {
    public static final DSP A00 = new DSP();

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        C7384Etj.A0X(str);
        return str.endsWith(".mctable");
    }
}

package com.facebook.aura.file.view;

import X.C60O;
import X.C7384Etj;
import java.io.File;
import java.util.Set;

/* loaded from: classes3.dex */
public final class StagedFileHandoff {
    public static final int $stable = 0;
    public static final long DEFAULT_MAX_AGE_MS = 21600000;
    public static final StagedFileHandoff INSTANCE = new StagedFileHandoff();
    public static final Set<String> handedOffPaths;
    public static final Set<String> retainedPaths;

    public final void markHandedOff(File file) {
        C7384Etj.A0Y(file, 0);
        Set<String> set = handedOffPaths;
        String absolutePath = file.getAbsolutePath();
        C7384Etj.A0U(absolutePath);
        set.add(absolutePath);
    }

    public final void release(File file) {
        C7384Etj.A0Y(file, 0);
        String absolutePath = file.getAbsolutePath();
        retainedPaths.remove(absolutePath);
        if (handedOffPaths.contains(absolutePath)) {
            return;
        }
        file.delete();
    }

    public final void retain(File file) {
        C7384Etj.A0Y(file, 0);
        Set<String> set = retainedPaths;
        String absolutePath = file.getAbsolutePath();
        C7384Etj.A0U(absolutePath);
        set.add(absolutePath);
    }

    public final void sweepStale(File file, long j) {
        C7384Etj.A0Y(file, 0);
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                String absolutePath = file2.getAbsolutePath();
                if (!retainedPaths.contains(absolutePath) && file2.isFile() && file2.lastModified() < jCurrentTimeMillis) {
                    handedOffPaths.remove(absolutePath);
                    file2.delete();
                }
            }
        }
    }

    static {
        Set<String> setA18 = C60O.A18();
        C7384Etj.A0U(setA18);
        retainedPaths = setA18;
        Set<String> setA182 = C60O.A18();
        C7384Etj.A0U(setA182);
        handedOffPaths = setA182;
    }

    public static /* synthetic */ void sweepStale$default(StagedFileHandoff stagedFileHandoff, File file, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 21600000;
        }
        stagedFileHandoff.sweepStale(file, j);
    }
}

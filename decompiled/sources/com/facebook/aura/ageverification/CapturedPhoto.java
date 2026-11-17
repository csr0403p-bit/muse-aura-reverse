package com.facebook.aura.ageverification;

import X.C7384Etj;
import java.io.File;

/* loaded from: classes3.dex */
public final class CapturedPhoto {
    public static final int $stable = 8;
    public final long bytes;
    public final File file;
    public final int height;
    public final int width;

    public CapturedPhoto(File file, int i, int i2, long j) {
        C7384Etj.A0Y(file, 0);
        this.file = file;
        this.width = i;
        this.height = i2;
        this.bytes = j;
    }

    public final long getBytes() {
        return this.bytes;
    }

    public final File getFile() {
        return this.file;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }
}

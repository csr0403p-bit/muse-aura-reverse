package com.facebook.aura.file.core;

import X.AnonymousClass002;
import X.C3cG;
import X.C3cJ;
import X.C7384Etj;
import X.CEV;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class AtomicFileWriter implements Closeable {
    public boolean open;
    public final OutputStream out;
    public final File target;
    public final File tmp;

    public final void write(byte[] bArr, int i, int i2) {
        C7384Etj.A0Y(bArr, 0);
        this.out.write(bArr, i, i2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.open) {
            this.open = false;
            try {
                this.out.close();
            } catch (Throwable th) {
                C3cG.A0s(th);
            }
            this.tmp.delete();
        }
    }

    public final boolean commit() {
        boolean z = false;
        if (!this.open) {
            return false;
        }
        this.open = false;
        try {
            try {
                this.out.close();
                if (this.tmp.renameTo(this.target)) {
                    z = true;
                } else {
                    File fileA0A = C3cJ.A0A(this.target, this.target.getParentFile());
                    try {
                        CEV.A02(this.tmp, fileA0A);
                        boolean zRenameTo = fileA0A.renameTo(this.target);
                        if (!zRenameTo) {
                            fileA0A.delete();
                        }
                        z = zRenameTo;
                    } catch (Exception unused) {
                        fileA0A.delete();
                    }
                }
            } finally {
                this.tmp.delete();
            }
        } catch (Exception unused2) {
        }
        return z;
    }

    public AtomicFileWriter(File file, File file2) {
        boolean zA1a = AnonymousClass002.A1a(file, file2);
        this.target = file;
        this.tmp = file2;
        this.out = new BufferedOutputStream(new FileOutputStream(file2));
        this.open = zA1a;
    }

    public final void write(int i) {
        this.out.write(i);
    }
}

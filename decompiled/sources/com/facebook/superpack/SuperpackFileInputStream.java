package com.facebook.superpack;

import X.AnonymousClass001;
import X.BV4;
import X.BV5;
import X.C3cG;
import X.CFK;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes5.dex */
public class SuperpackFileInputStream extends InputStream {
    public int A00;
    public int A01;
    public int A02;
    public Boolean A03;
    public byte[] A04;
    public final SuperpackFile A05;

    @Override // java.io.InputStream
    public final synchronized int available() {
        return this.A00 - this.A02;
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i) {
        this.A01 = this.A02;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.A02 = this.A01;
    }

    @Override // java.io.InputStream
    public final synchronized long skip(long j) {
        if (j < 0) {
            return 0L;
        }
        int i = this.A02;
        long j2 = i + j;
        int i2 = this.A00;
        if (j2 > i2) {
            j = i2 - i;
        }
        this.A02 = i + ((int) j);
        return j;
    }

    public static SuperpackFileInputStream createFromSingletonArchiveFile(File file, String str) {
        SuperpackArchive superpackArchive = SuperpackArchive.$redex_init_class;
        return createFromSingletonArchiveFile(file, str, str.equals("spo") ? BV5.A00() : 1);
    }

    public static SuperpackFileInputStream createFromSingletonArchiveInputStream(InputStream inputStream, String str) {
        SuperpackArchive superpackArchive = SuperpackArchive.$redex_init_class;
        return createFromSingletonArchiveInputStream(inputStream, str, str.equals("spo") ? BV5.A00() : 1);
    }

    public static int getDefaultThreadNum(String str) {
        SuperpackArchive superpackArchive = SuperpackArchive.$redex_init_class;
        if (str.equals("spo")) {
            return BV5.A00();
        }
        return 1;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.A03.booleanValue()) {
            this.A05.close();
        }
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    public SuperpackFileInputStream(SuperpackFile superpackFile) {
        int i;
        superpackFile.getClass();
        this.A05 = superpackFile;
        this.A02 = 0;
        synchronized (superpackFile) {
            if (superpackFile.A02 == 0) {
                throw BV4.A0T();
            }
            i = superpackFile.A01;
        }
        this.A00 = i;
        this.A01 = 0;
        this.A04 = null;
        this.A03 = false;
    }

    public SuperpackFileInputStream(SuperpackFile superpackFile, Boolean bool) {
        this(superpackFile);
        this.A03 = bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [long] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public static SuperpackFileInputStream createFromSingletonArchiveFile(File file, String str, int i) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        ?? threadNumOption;
        SuperpackArchive superpackArchive;
        file.getClass();
        SuperpackArchive superpackArchive2 = SuperpackArchive.$redex_init_class;
        if (!str.matches("spo")) {
            threadNumOption = 0;
        } else {
            threadNumOption = SuperpackArchive.getThreadNumOption(i);
        }
        try {
            try {
                superpackArchive = new SuperpackArchive(SuperpackArchive.readNative(file.getPath(), str, (long) threadNumOption));
                threadNumOption = threadNumOption;
            } catch (RuntimeException e) {
                threadNumOption = "SuperpackArchive";
                CFK.A08("SuperpackArchive", "Failed to read superpack file, retrying.", e);
                FileInputStream fileInputStreamA0H = BV4.A0H(file);
                try {
                    superpackArchive = new SuperpackArchive(SuperpackArchive.readNative(fileInputStreamA0H, str, 0L));
                } finally {
                    fileInputStreamA0H.close();
                }
            }
            try {
                if (superpackArchive.hasNext()) {
                    SuperpackFile next = superpackArchive.next();
                    if (!superpackArchive.hasNext()) {
                        SuperpackFileInputStream superpackFileInputStream = new SuperpackFileInputStream(next, AnonymousClass001.A0i());
                        superpackArchive.close();
                        return superpackFileInputStream;
                    }
                    throw BV4.A0P();
                }
                throw BV4.A0P();
            } catch (Throwable th) {
                superpackArchive.close();
                throw th;
            }
        } catch (Throwable th2) {
            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(threadNumOption, th2);
            throw threadNumOption;
        }
    }

    public static SuperpackFileInputStream createFromSingletonArchiveInputStream(InputStream inputStream, String str, int i) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        long threadNumOption;
        inputStream.getClass();
        SuperpackArchive superpackArchive = SuperpackArchive.$redex_init_class;
        if (!str.matches("spo")) {
            threadNumOption = 0;
        } else {
            threadNumOption = SuperpackArchive.getThreadNumOption(i);
        }
        SuperpackArchive superpackArchive2 = new SuperpackArchive(SuperpackArchive.readNative(inputStream, str, threadNumOption));
        try {
            if (superpackArchive2.hasNext()) {
                SuperpackFile next = superpackArchive2.next();
                if (!superpackArchive2.hasNext()) {
                    SuperpackFileInputStream superpackFileInputStream = new SuperpackFileInputStream(next, AnonymousClass001.A0i());
                    superpackArchive2.close();
                    return superpackFileInputStream;
                }
                throw BV4.A0P();
            }
            throw BV4.A0P();
        } catch (Throwable th) {
            try {
                superpackArchive2.close();
                throw th;
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                throw th;
            }
        }
    }

    @Override // java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        int i3 = i2;
        synchronized (this) {
            if (bArr != null) {
                if (i >= 0 && i2 >= 0) {
                    int i4 = i2 + i;
                    int length = bArr.length;
                    if (i4 <= length) {
                        int i5 = this.A02;
                        int i6 = this.A00;
                        if (i5 == i6) {
                            return -1;
                        }
                        if (i2 + i5 > i6) {
                            i3 = i6 - i5;
                        }
                        SuperpackFile superpackFile = this.A05;
                        synchronized (superpackFile) {
                            try {
                                long j = superpackFile.A02;
                                if (j != 0) {
                                    if (i5 >= 0 && i3 >= 0) {
                                        if (i + i3 <= length) {
                                            if (i5 + i3 <= superpackFile.A01) {
                                                SuperpackFile.readBytesNative(j, i5, i3, bArr, i);
                                            } else {
                                                throw new IndexOutOfBoundsException();
                                            }
                                        } else {
                                            throw new IndexOutOfBoundsException();
                                        }
                                    } else {
                                        throw new IndexOutOfBoundsException();
                                    }
                                } else {
                                    throw BV4.A0T();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        this.A02 += i3;
                        return i3;
                    }
                }
                throw new IndexOutOfBoundsException();
            }
            throw new NullPointerException();
        }
    }

    @Override // java.io.InputStream
    public final synchronized int read() {
        int i;
        byte[] bArr = this.A04;
        if (bArr == null) {
            bArr = new byte[1];
            this.A04 = bArr;
        }
        int i2 = read(bArr);
        i = -1;
        if (i2 != -1) {
            if (i2 == 1) {
                i = this.A04[0];
                if (i < 0) {
                    i += 256;
                }
            } else {
                throw C3cG.A0Q("Unexpected number of bytes read");
            }
        }
        return i;
    }
}

package com.facebook.common.dextricks;

import X.BV4;
import X.BV5;
import X.BV7;
import X.C8D;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.common.dextricks.DexManifest;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.channels.FileChannel;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/* loaded from: classes5.dex */
public final class InputDex implements Closeable {
    public static final byte STATE_RAW = 0;
    public static final byte STATE_USED = 2;
    public static final byte STATE_ZIPPED = 1;
    public final DexManifest.Dex dex;
    public final String filePath;
    public InputStream mContents;
    public byte mState;
    public int sizeHint;

    public InputDex(DexManifest.Dex dex, InputStream inputStream) {
        this.dex = dex;
        String strA0j = dex.assetName;
        this.filePath = null;
        try {
            if (strA0j.endsWith(".jar")) {
                strA0j = BV4.A0j(strA0j, strA0j.length() - 4);
                this.mState = (byte) 1;
            }
            if (!strA0j.endsWith(DexManifest.DEX_EXT)) {
                throw BV5.A0h("malformed dex asset name: ", dex.assetName);
            }
            this.mContents = inputStream;
        } catch (Throwable th) {
            Fs.safeClose(inputStream);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.io.Closeable, java.io.InputStream, java.util.zip.CheckedInputStream] */
    private void synthesizeDexJarFile(OutputStream outputStream) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        InputStream inputStream = this.mContents;
        ZipOutputStream zipOutputStream = new ZipOutputStream(outputStream);
        try {
            ZipEntry zipEntry = new ZipEntry("classes.dex");
            if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                FileChannel channel = fileInputStream.getChannel();
                if (channel.position() == 0) {
                    ?? fileInputStream2 = new FileInputStream(fileInputStream.getFD());
                    try {
                        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream2);
                        try {
                            fileInputStream2 = new CheckedInputStream(bufferedInputStream, new CRC32());
                            zipEntry.setSize(fileInputStream2.skip(LinkEncryptedPairingKt.LINK_COUNTER_MAX));
                            zipEntry.setCrc(fileInputStream2.getChecksum().getValue());
                            zipEntry.setMethod(0);
                            Mlog.v("computed zip data for %s from file size:%s crc:%s", this, Long.valueOf(zipEntry.getSize()), Long.valueOf(zipEntry.getCrc()));
                            Fs.safeClose((Closeable) fileInputStream2);
                            channel.position(0L);
                        } catch (Throwable th) {
                            th = th;
                            fileInputStream2 = bufferedInputStream;
                            Fs.safeClose((Closeable) fileInputStream2);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }
            zipOutputStream.putNextEntry(zipEntry);
            C8D.A00(inputStream, zipOutputStream, Integer.MAX_VALUE);
            zipOutputStream.finish();
            zipOutputStream.close();
        } catch (Throwable th3) {
            try {
                zipOutputStream.close();
                throw th3;
            } catch (Throwable th4) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                throw th3;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Fs.safeClose(this.mContents);
    }

    public void extract(File file) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        InputStream dexContents;
        byte b = this.mState;
        this.mState = (byte) 2;
        if (b != 0 && b != 1) {
            throw BV4.A0c("InputDex already used");
        }
        String name = file.getName();
        FileOutputStream fileOutputStreamA0I = BV4.A0I(file);
        try {
            if (name.endsWith(".dex.jar")) {
                if (b != 1) {
                    Mlog.v("synthesizing new zip file %s", this);
                    synthesizeDexJarFile(fileOutputStreamA0I);
                    fileOutputStreamA0I.close();
                }
                Mlog.v("copying existing zip file %s", this);
                dexContents = this.mContents;
            } else {
                if (!name.endsWith(DexManifest.DEX_EXT)) {
                    throw BV5.A0h("don't know how to make this kind of file: ", name);
                }
                Mlog.v("writing raw dex file %s", this);
                this.mState = b;
                dexContents = getDexContents();
            }
            C8D.A00(dexContents, fileOutputStreamA0I, Integer.MAX_VALUE);
            fileOutputStreamA0I.close();
        } catch (Throwable th) {
            try {
                fileOutputStreamA0I.close();
                throw th;
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                throw th;
            }
        }
    }

    public InputStream getDexContents() throws IOException {
        ZipEntry nextEntry;
        byte b = this.mState;
        this.mState = (byte) 2;
        if (b == 1) {
            ZipInputStream zipInputStream = new ZipInputStream(this.mContents);
            this.mContents = zipInputStream;
            do {
                nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    throw BV7.A0j("zip file %s did not contain a classes.dex", new Object[]{this.dex});
                }
            } while (!nextEntry.getName().equals("classes.dex"));
            long size = nextEntry.getSize();
            this.sizeHint = size > 2147483647L ? Integer.MAX_VALUE : (int) size;
        } else if (b != 0) {
            throw BV4.A0c("InputDex already used");
        }
        return this.mContents;
    }

    public String getFilePath() {
        return this.filePath;
    }

    public int getSizeHint(InputStream inputStream) throws IOException {
        int i = this.sizeHint;
        if (i > 0) {
            return i;
        }
        int iAvailable = inputStream.available();
        if (iAvailable <= 1) {
            return -1;
        }
        return iAvailable;
    }

    public String toString() {
        return String.format("InputDex:[%s]", this.dex.assetName);
    }

    public InputDex(DexManifest.Dex dex, String str) {
        this.dex = dex;
        this.filePath = str;
        this.mContents = BV4.A0E(new byte[0]);
    }
}

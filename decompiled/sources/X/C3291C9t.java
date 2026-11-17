package X;

import X.C9v;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import com.facebook.stash.core.FileStash;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.C9t, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3291C9t<T extends C9v> implements FileStash {
    public static final int DEFAULT_READ_BUFFER_SIZE = 256;
    public static final String TAG = "FileStashImpl";
    public int bufferSize;
    public final InterfaceC7539F0o clock;
    public boolean enableSymlinkAwareEviction;
    public boolean enableSymlinkCreation;
    public final File path;
    public int readToMemoryBufferSize;
    public final T supplier;
    public boolean useBufferedStreams;
    public boolean useByteStreamsRead;
    public boolean useOpenFileSizeForReadResourceToMemory;

    public static final long A00(File file) {
        int length;
        C7384Etj.A0Y(file, 0);
        long jA00 = 0;
        if (!file.exists()) {
            return 0L;
        }
        if (file.isFile()) {
            return file.length();
        }
        if (!file.isDirectory()) {
            return 0L;
        }
        try {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null || (length = fileArrListFiles.length) == 0) {
                return 0L;
            }
            int i = 0;
            do {
                jA00 += A00(fileArrListFiles[i]);
                i++;
            } while (i < length);
            return jA00;
        } catch (Exception e) {
            String strA0M = FGI.A0M("The path is invalid: ", file.getAbsolutePath());
            CFL cfl = AbstractC3422CMk.A00;
            if (!CFL.A02(cfl)) {
                return 0L;
            }
            cfl.Aj8("BigFoot", strA0M, e);
            return 0L;
        }
    }

    @Override // com.facebook.stash.core.FileStash
    public boolean createSymlinksForKey(String str, List<String> list) throws ErrnoException {
        boolean zA1a = AnonymousClass002.A1a(str, list);
        if (this.enableSymlinkCreation && this.enableSymlinkAwareEviction) {
            if (!list.isEmpty()) {
                File filePath = getFilePath(str);
                if (filePath.exists()) {
                    ArrayList<File> arrayListA0i = AnonymousClass003.A0i(list);
                    Iterator<String> it = list.iterator();
                    while (it.hasNext()) {
                        arrayListA0i.add(getFilePath(AnonymousClass005.A0j(it)));
                    }
                    if (arrayListA0i.isEmpty()) {
                        return true;
                    }
                    zA1a = true;
                    for (File file : arrayListA0i) {
                        try {
                            try {
                                Os.symlink(filePath.getCanonicalPath(), file.getAbsolutePath());
                            } catch (ErrnoException e) {
                                if (e.errno != OsConstants.EEXIST) {
                                    throw e;
                                }
                                if (Files.isSymbolicLink(file.toPath())) {
                                    file.delete();
                                    Os.symlink(filePath.getCanonicalPath(), file.getAbsolutePath());
                                }
                            }
                        } catch (Exception e2) {
                            CFK.A0D("SymlinkHelper", "Failed to create symlink from %s to %s", e2, filePath, file);
                            zA1a = false;
                        }
                    }
                }
            }
            return zA1a;
        }
        return false;
    }

    @Override // com.facebook.stash.core.FileStash
    public long creationTime(String str) {
        C7384Etj.A0Y(str, 0);
        File filePath = getFilePath(str);
        try {
            C7384Etj.A0Y(filePath, 0);
            return Files.readAttributes(filePath.toPath(), BasicFileAttributes.class, new LinkOption[0]).creationTime().toMillis();
        } catch (Exception unused) {
            return 0L;
        }
    }

    @Override // com.facebook.stash.core.FileStash
    public File getFile(String str) {
        C7384Etj.A0Y(str, 0);
        File filePath = getFilePath(str);
        if (!filePath.exists()) {
            return null;
        }
        touch(filePath);
        return filePath;
    }

    @Override // com.facebook.stash.core.FileStash
    public File getFilePath(String str) {
        C7384Etj.A0Y(str, 0);
        File file = this.path;
        Set<Character> set = AbstractC7524EzC.A00;
        char[] charArray = str.toCharArray();
        StringBuilder sbA0w = C60O.A0w();
        for (char c : charArray) {
            if (c == '%' || AbstractC7524EzC.A00.contains(Character.valueOf(c))) {
                sbA0w.append('%');
                BV4.A1N(sbA0w, c);
            } else {
                sbA0w.append(c);
            }
        }
        return C3cG.A0O(file, sbA0w.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.facebook.stash.core.FileStash
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.C3292C9w getItemAttributes(java.lang.String r8) throws java.io.IOException {
        /*
            r7 = this;
            r5 = 0
            X.C7384Etj.A0Y(r8, r5)
            java.io.File r6 = r7.getFilePath(r8)
            boolean r1 = r7.enableSymlinkAwareEviction
            r0 = 0
            if (r1 == 0) goto L25
            java.nio.file.Path r1 = r6.toPath()     // Catch: java.lang.Exception -> L15
            boolean r0 = java.nio.file.Files.isSymbolicLink(r1)     // Catch: java.lang.Exception -> L15
        L15:
            if (r0 == 0) goto L25
            java.lang.String r0 = r6.getAbsolutePath()     // Catch: java.lang.Exception -> L22 java.lang.Exception -> L52
            android.system.StructStat r0 = android.system.Os.lstat(r0)     // Catch: java.lang.Exception -> L22 java.lang.Exception -> L52
            long r0 = r0.st_size     // Catch: java.lang.Exception -> L22 java.lang.Exception -> L52
            goto L27
        L22:
            r0 = 0
            goto L27
        L25:
            r4 = 0
            goto L2b
        L27:
            java.lang.Long r4 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Exception -> L52
        L2b:
            java.nio.file.Path r2 = r6.toPath()     // Catch: java.lang.Exception -> L52
            java.lang.Class<java.nio.file.attribute.BasicFileAttributes> r1 = java.nio.file.attribute.BasicFileAttributes.class
            java.nio.file.LinkOption[] r0 = new java.nio.file.LinkOption[r5]     // Catch: java.lang.Exception -> L52
            java.nio.file.attribute.BasicFileAttributes r1 = java.nio.file.Files.readAttributes(r2, r1, r0)     // Catch: java.lang.Exception -> L52
            java.nio.file.attribute.FileTime r0 = r1.lastModifiedTime()     // Catch: java.lang.Exception -> L52
            long r2 = r0.toMillis()     // Catch: java.lang.Exception -> L52
            if (r4 != 0) goto L44
            r1.size()     // Catch: java.lang.Exception -> L52
        L44:
            java.nio.file.attribute.FileTime r0 = r1.creationTime()     // Catch: java.lang.Exception -> L52
            long r0 = r0.toMillis()     // Catch: java.lang.Exception -> L52
            X.C9w r4 = new X.C9w     // Catch: java.lang.Exception -> L52
            r4.<init>(r2, r0)     // Catch: java.lang.Exception -> L52
            return r4
        L52:
            long r2 = r6.lastModified()
            A00(r6)
            java.nio.file.Path r4 = r6.toPath()     // Catch: java.lang.Exception -> L6e
            java.lang.Class<java.nio.file.attribute.BasicFileAttributes> r1 = java.nio.file.attribute.BasicFileAttributes.class
            java.nio.file.LinkOption[] r0 = new java.nio.file.LinkOption[r5]     // Catch: java.lang.Exception -> L6e
            java.nio.file.attribute.BasicFileAttributes r0 = java.nio.file.Files.readAttributes(r4, r1, r0)     // Catch: java.lang.Exception -> L6e
            java.nio.file.attribute.FileTime r0 = r0.creationTime()     // Catch: java.lang.Exception -> L6e
            long r0 = r0.toMillis()     // Catch: java.lang.Exception -> L6e
            goto L70
        L6e:
            r0 = 0
        L70:
            X.C9w r4 = new X.C9w
            r4.<init>(r2, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3291C9t.getItemAttributes(java.lang.String):X.C9w");
    }

    @Override // com.facebook.stash.core.Stash
    public long getItemSizeBytes(String str) {
        C7384Etj.A0Y(str, 0);
        return A00(getFilePath(str));
    }

    @Override // com.facebook.stash.core.Stash
    public boolean hasKey(String str) {
        C7384Etj.A0Y(str, 0);
        return getFilePath(str).exists();
    }

    @Override // com.facebook.stash.core.FileStash
    public File insertFile(String str) {
        C7384Etj.A0Y(str, 0);
        this.path.mkdirs();
        File filePath = getFilePath(str);
        touch(filePath);
        return filePath;
    }

    @Override // com.facebook.stash.core.Stash
    public long lastAccessTime(String str) {
        C7384Etj.A0Y(str, 0);
        return getFilePath(str).lastModified();
    }

    @Override // com.facebook.stash.core.Stash
    public byte[] readResourceToMemory(String str) {
        C7384Etj.A0Y(str, 0);
        return readResourceToMemory(str, this.readToMemoryBufferSize);
    }

    @Override // com.facebook.stash.core.Stash
    public boolean remove(String str) {
        C7384Etj.A0Y(str, 0);
        return this.supplier.deletePath(getFilePath(str));
    }

    @Override // com.facebook.stash.core.Stash
    public boolean touch(String str) {
        C7384Etj.A0Y(str, 0);
        return touch(getFilePath(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.FileOutputStream] */
    @Override // com.facebook.stash.core.Stash
    public OutputStream write(String str) {
        FileOutputStream fileOutputStreamA0I;
        C7384Etj.A0Y(str, 0);
        ?? filePath = getFilePath(str);
        touch((File) filePath);
        try {
            filePath = BV4.A0I(filePath);
            fileOutputStreamA0I = filePath;
        } catch (FileNotFoundException unused) {
            this.path.mkdirs();
            fileOutputStreamA0I = BV4.A0I(filePath);
        }
        return this.useBufferedStreams ? new BufferedOutputStream(fileOutputStreamA0I) : fileOutputStreamA0I;
    }

    private final long getCreationTime(File file) {
        try {
            C7384Etj.A0Y(file, 0);
            return Files.readAttributes(file.toPath(), BasicFileAttributes.class, new LinkOption[0]).creationTime().toMillis();
        } catch (Exception unused) {
            return 0L;
        }
    }

    private final byte[] readResourceToMemoryUsingOpenFileSize(String str, int i) throws IOException {
        InputStream bufferedInputStream;
        try {
            File file = getFile(str);
            if (file == null) {
                return null;
            }
            FileInputStream fileInputStreamA0H = BV4.A0H(file);
            try {
                if (this.useBufferedStreams) {
                    int i2 = this.bufferSize;
                    bufferedInputStream = i2 > 0 ? new BufferedInputStream(fileInputStreamA0H, i2) : new BufferedInputStream(fileInputStreamA0H);
                } else {
                    bufferedInputStream = fileInputStreamA0H;
                }
                long size = fileInputStreamA0H.getChannel().size();
                if (size > 2147483647L) {
                    throw BV5.A0R("Trying to read too big resource, size (b): ", size);
                }
                byte[] streamToMemory = readStreamToMemory(bufferedInputStream, (int) size, i);
                fileInputStreamA0H.close();
                return streamToMemory;
            } finally {
            }
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    private final byte[] readResourceToMemoryUsingPathLength(String str, int i) throws IOException {
        InputStream inputStream = read(str);
        byte[] streamToMemory = null;
        if (inputStream != null) {
            try {
                long length = getFilePath(str).length();
                if (length > 2147483647L) {
                    throw BV5.A0R("Trying to read too big resource, size (b): ", length);
                }
                streamToMemory = readStreamToMemory(inputStream, (int) length, i);
            } finally {
            }
        }
        if (inputStream != null) {
            inputStream.close();
        }
        return streamToMemory;
    }

    private final byte[] readStreamToMemory(InputStream inputStream, int i, int i2) throws IOException {
        byte[] byteArray;
        if (this.useByteStreamsRead) {
            byte[] bArr = new byte[i];
            int i3 = i;
            while (true) {
                if (i3 > 0) {
                    int i4 = i - i3;
                    int i5 = inputStream.read(bArr, i4, i3);
                    if (i5 == -1) {
                        byteArray = Arrays.copyOf(bArr, i4);
                        break;
                    }
                    i3 -= i5;
                } else {
                    int i6 = inputStream.read();
                    if (i6 == -1) {
                        byteArray = bArr;
                    } else {
                        C7504EyN c7504EyN = new C7504EyN();
                        c7504EyN.write(i6);
                        byte[] bArr2 = new byte[4096];
                        while (true) {
                            int i7 = inputStream.read(bArr2);
                            if (i7 == -1) {
                                break;
                            }
                            c7504EyN.write(bArr2, 0, i7);
                        }
                        byteArray = new byte[c7504EyN.size() + i];
                        System.arraycopy(bArr, 0, byteArray, 0, i);
                        c7504EyN.A00(byteArray, i);
                    }
                }
            }
        } else {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i);
            if (i2 <= 0) {
                i2 = 256;
            }
            byte[] bArr3 = new byte[i2];
            while (true) {
                int i8 = inputStream.read(bArr3);
                if (i8 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr3, 0, i8);
            }
            byteArray = byteArrayOutputStream.toByteArray();
        }
        C7384Etj.A0U(byteArray);
        return byteArray;
    }

    @Override // com.facebook.stash.core.Stash
    public Set<String> getAllKeys() {
        int length;
        String[] list = this.path.list();
        if (list == null || (length = list.length) == 0) {
            return A3q.A00;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(length);
        for (String string : list) {
            C7384Etj.A0X(string);
            Set<Character> set = AbstractC7524EzC.A00;
            char[] charArray = string.toCharArray();
            StringBuilder sbA0w = C60O.A0w();
            int i = 0;
            while (i < charArray.length) {
                char c = charArray[i];
                if (c == '%') {
                    try {
                        sbA0w.append((char) Integer.parseInt(new String(charArray, i + 1, 2), 16));
                        i += 2;
                    } catch (NumberFormatException unused) {
                    }
                } else {
                    sbA0w.append(c);
                }
                i++;
            }
            string = sbA0w.toString();
            linkedHashSet.add(string);
        }
        return linkedHashSet;
    }

    @Override // com.facebook.stash.core.Stash
    public File getBaseStoragePath_ForInternalUse() {
        return this.path;
    }

    @Override // com.facebook.stash.core.Stash
    public int getItemCount() {
        String[] list = this.path.list();
        if (list != null) {
            return list.length;
        }
        return 0;
    }

    @Override // com.facebook.stash.core.Stash
    public long getSizeBytes() {
        return A00(this.path);
    }

    @Override // com.facebook.stash.core.Stash
    public InputStream read(String str) throws IOException {
        C7384Etj.A0Y(str, 0);
        try {
            File file = getFile(str);
            if (file == null) {
                return null;
            }
            FileInputStream fileInputStreamA0H = BV4.A0H(file);
            try {
                if (!this.useBufferedStreams) {
                    return fileInputStreamA0H;
                }
                int i = this.bufferSize;
                return i > 0 ? new BufferedInputStream(fileInputStreamA0H, i) : new BufferedInputStream(fileInputStreamA0H);
            } catch (Throwable th) {
                CFK.A0J(TAG, th, "Failed to read from stream");
                fileInputStreamA0H.close();
                return null;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    @Override // com.facebook.stash.core.Stash
    public boolean removeAll() {
        if (!this.supplier.deletePath(this.path)) {
            return false;
        }
        this.path.mkdirs();
        return true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3291C9t(File file, T t) {
        this(file, t, C9u.A00);
        AnonymousClass003.A0u(file, t);
    }

    public final void setBufferedStreamSize(int i) {
        this.bufferSize = i;
    }

    public final void setEnableSymlinkAwareEviction(boolean z) {
        this.enableSymlinkAwareEviction = AnonymousClass002.A1L(z ? 1 : 0);
    }

    public final void setEnableSymlinkCreation(boolean z) {
        this.enableSymlinkCreation = AnonymousClass002.A1L(z ? 1 : 0);
    }

    public final void setReadToMemoryBufferSize(int i) {
        this.readToMemoryBufferSize = i;
    }

    public final void setUseBufferedStreams(boolean z) {
        this.useBufferedStreams = z;
    }

    public final void setUseByteStreamsRead(boolean z) {
        this.useByteStreamsRead = z;
    }

    public final void setUseOpenFileSizeForReadResourceToMemory(boolean z) {
        this.useOpenFileSizeForReadResourceToMemory = z;
    }

    public C3291C9t(File file, T t, InterfaceC7539F0o interfaceC7539F0o) {
        AnonymousClass005.A0x(file, t, interfaceC7539F0o);
        this.path = file;
        this.supplier = t;
        this.clock = interfaceC7539F0o;
        this.bufferSize = -1;
        this.readToMemoryBufferSize = 256;
    }

    private final long getItemSizeBytes(File file) {
        return A00(file);
    }

    private final long lastAccessTime(File file) {
        return file.lastModified();
    }

    private final boolean touch(File file) {
        return file.setLastModified(this.clock.now());
    }

    @Override // com.facebook.stash.core.Stash
    public byte[] readResourceToMemory(String str, int i) {
        C7384Etj.A0Y(str, 0);
        if (this.useOpenFileSizeForReadResourceToMemory) {
            return readResourceToMemoryUsingOpenFileSize(str, i);
        }
        return readResourceToMemoryUsingPathLength(str, i);
    }

    @Override // com.facebook.stash.core.Stash
    public boolean remove(String str, int i) {
        C7384Etj.A0Y(str, 0);
        return remove(str);
    }

    @Override // com.facebook.stash.core.Stash
    public /* synthetic */ void write(String str, byte[] bArr, List list) throws IOException {
        AnonymousClass003.A0x(str, bArr);
        write(str, bArr);
    }

    @Override // com.facebook.stash.core.Stash
    public void write(String str, byte[] bArr) throws IOException {
        AnonymousClass003.A0u(str, bArr);
        OutputStream outputStreamWrite = write(str);
        try {
            outputStreamWrite.write(bArr);
            outputStreamWrite.close();
        } finally {
        }
    }
}

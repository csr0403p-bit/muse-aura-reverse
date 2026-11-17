package com.facebook.aura.file.docx;

import X.AnonymousClass003;
import X.AnonymousClass004;
import X.C7384Etj;
import X.C7BY;
import X.FGI;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes6.dex */
public final class OoxmlArchiveGuard {
    public static final int BUFFER_SIZE = 8192;
    public static final long BYTES_PER_MB = 1048576;
    public static final int INITIAL_CAPACITY = 8192;
    public static final long RATIO_CHECK_MIN_BYTES = 1048576;
    public static final OoxmlArchiveGuard INSTANCE = new OoxmlArchiveGuard();
    public static final Limits docxLimits = new Limits(2048, 25165824, 16777216, 200);
    public static final Limits xlsxLimits = new Limits(1024, 12582912, 4194304, 200);
    public static final Limits pptxLimits = new Limits(4096, 33554432, 16777216, 200);

    public interface Inspection {

        public final class Rejected implements Inspection {
            public final String reason;

            public Rejected(String str) {
                C7384Etj.A0Y(str, 0);
                this.reason = str;
            }

            public final String getReason() {
                return this.reason;
            }
        }

        public final class Safe implements Inspection {
            public static final Safe INSTANCE = new Safe();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Safe);
            }

            public String toString() {
                return "Safe";
            }

            public int hashCode() {
                return -1950307065;
            }
        }
    }

    public final class LimitExceededException extends IOException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LimitExceededException(String str) {
            super(str);
            C7384Etj.A0Y(str, 0);
        }
    }

    public final class Limits {
        public final long maxCompressionRatio;
        public final int maxEntries;
        public final long maxEntryUncompressedBytes;
        public final long maxTotalUncompressedBytes;

        public final long getMaxCompressionRatio() {
            return this.maxCompressionRatio;
        }

        public final int getMaxEntries() {
            return this.maxEntries;
        }

        public final long getMaxEntryUncompressedBytes() {
            return this.maxEntryUncompressedBytes;
        }

        public final long getMaxTotalUncompressedBytes() {
            return this.maxTotalUncompressedBytes;
        }

        public Limits(int i, long j, long j2, long j3) {
            this.maxEntries = i;
            this.maxTotalUncompressedBytes = j;
            this.maxEntryUncompressedBytes = j2;
            this.maxCompressionRatio = j3;
        }
    }

    public final class ReadBudget {
        public int entryCount;
        public final Limits limits;
        public long totalUncompressedBytes;

        public ReadBudget(Limits limits) {
            C7384Etj.A0Y(limits, 0);
            this.limits = limits;
        }

        public final byte[] readEntry(InputStream inputStream, String str, long j) throws IOException {
            boolean zA1b = AnonymousClass004.A1b(inputStream, str);
            long jMin = Math.min(j, this.limits.maxEntryUncompressedBytes);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((int) Math.min(jMin, 8192L));
            byte[] bArr = new byte[8192];
            long j2 = 0;
            while (true) {
                int i = inputStream.read(bArr);
                if (i < 0) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    C7384Etj.A0U(byteArray);
                    return byteArray;
                }
                long j3 = i;
                j2 += j3;
                if (j2 > jMin) {
                    throw new LimitExceededException(FGI.A0M("Archive entry is too large: ", str));
                }
                long j4 = this.totalUncompressedBytes;
                if (j4 > this.limits.maxTotalUncompressedBytes - j3) {
                    throw new LimitExceededException("Archive expands beyond the in-app limit");
                }
                this.totalUncompressedBytes = j4 + j3;
                byteArrayOutputStream.write(bArr, zA1b ? 1 : 0, i);
            }
        }

        public final void registerEntry(ZipEntry zipEntry) throws LimitExceededException {
            C7384Etj.A0Y(zipEntry, 0);
            int i = this.entryCount + 1;
            this.entryCount = i;
            if (i > this.limits.maxEntries) {
                throw new LimitExceededException("Archive contains too many entries");
            }
            OoxmlArchiveGuard ooxmlArchiveGuard = OoxmlArchiveGuard.INSTANCE;
            String name = zipEntry.getName();
            C7384Etj.A0U(name);
            ooxmlArchiveGuard.validatePath(name);
            ooxmlArchiveGuard.validateDeclaredSize(zipEntry, this.limits);
        }

        public static /* synthetic */ byte[] readEntry$default(ReadBudget readBudget, InputStream inputStream, String str, long j, int i, Object obj) {
            if ((i & 4) != 0) {
                j = readBudget.limits.maxEntryUncompressedBytes;
            }
            return readBudget.readEntry(inputStream, str, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void validatePath(String str) throws LimitExceededException {
        if (!C7BY.A0m(str, '/') && !C7BY.A0m(str, '\\')) {
            List listA0g = C7BY.A0g(str, new char[]{'/', '\\'});
            if ((listA0g instanceof Collection) && listA0g.isEmpty()) {
                return;
            }
            Iterator it = listA0g.iterator();
            while (it.hasNext()) {
                if (!"..".equals(it.next())) {
                }
            }
            return;
        }
        throw new LimitExceededException("Archive contains an unsafe path");
    }

    public final ReadBudget newReadBudget(Limits limits) {
        C7384Etj.A0Y(limits, 0);
        return new ReadBudget(limits);
    }

    public final Limits getDocxLimits() {
        return docxLimits;
    }

    public final Limits getPptxLimits() {
        return pptxLimits;
    }

    public final Limits getXlsxLimits() {
        return xlsxLimits;
    }

    private final long chargedUncompressedBytes(ZipEntry zipEntry, Limits limits) {
        long size = zipEntry.getSize();
        if (size > 0) {
            return size;
        }
        long compressedSize = zipEntry.getCompressedSize();
        if (compressedSize <= 0) {
            return 0L;
        }
        long j = limits.maxTotalUncompressedBytes;
        long j2 = limits.maxCompressionRatio;
        return compressedSize > j / j2 ? j + 1 : compressedSize * j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void validateDeclaredSize(ZipEntry zipEntry, Limits limits) throws LimitExceededException {
        long size = zipEntry.getSize();
        if (size > limits.maxEntryUncompressedBytes) {
            throw new LimitExceededException(FGI.A0M("Archive entry is too large: ", zipEntry.getName()));
        }
        long compressedSize = zipEntry.getCompressedSize();
        if (size < 1048576 || compressedSize < 0) {
            return;
        }
        if (compressedSize == 0 || size / compressedSize > limits.maxCompressionRatio) {
            throw new LimitExceededException(FGI.A0M("Archive entry has an unsafe compression ratio: ", zipEntry.getName()));
        }
    }

    public final Inspection inspect(File file, Limits limits) throws IOException {
        Inspection rejected;
        AnonymousClass003.A0u(file, limits);
        try {
            ZipFile zipFile = new ZipFile(file);
            try {
                Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                int i = 0;
                long j = 0;
                while (true) {
                    if (!enumerationEntries.hasMoreElements()) {
                        rejected = Inspection.Safe.INSTANCE;
                        break;
                    }
                    ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                    i++;
                    if (i > limits.maxEntries) {
                        rejected = new Inspection.Rejected("Archive contains too many entries");
                        break;
                    }
                    OoxmlArchiveGuard ooxmlArchiveGuard = INSTANCE;
                    String name = zipEntryNextElement.getName();
                    C7384Etj.A0U(name);
                    ooxmlArchiveGuard.validatePath(name);
                    ooxmlArchiveGuard.validateDeclaredSize(zipEntryNextElement, limits);
                    long jChargedUncompressedBytes = ooxmlArchiveGuard.chargedUncompressedBytes(zipEntryNextElement, limits);
                    if (jChargedUncompressedBytes > 0) {
                        if (j > limits.maxTotalUncompressedBytes - jChargedUncompressedBytes) {
                            rejected = new Inspection.Rejected("Archive expands beyond the in-app limit");
                            break;
                        }
                        j += jChargedUncompressedBytes;
                    }
                }
                zipFile.close();
                return rejected;
            } finally {
            }
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "Invalid archive";
            }
            return new Inspection.Rejected(message);
        }
    }
}

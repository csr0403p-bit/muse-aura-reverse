package X;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class DI0 implements DID {
    public RandomAccessFile A00;
    public final C4966DIx A01;
    public final DID[] A02;
    public final boolean A03;

    @Override // X.DID
    public final void ANg(File file, String str) throws IOException {
        C7384Etj.A0Y(file, 0);
        File fileA0L = BV5.A0L("qpl_resilience_storage", str, file);
        RandomAccessFile randomAccessFileA0M = null;
        try {
            randomAccessFileA0M = BV4.A0M(fileA0L);
            ANh(randomAccessFileA0M, 0L);
            this.A00 = randomAccessFileA0M;
        } catch (Throwable th) {
            CFK.A0J("QPL", th, "initializeStorageWithFile failed");
            if (randomAccessFileA0M != null) {
                try {
                    randomAccessFileA0M.close();
                } catch (IOException unused) {
                }
            }
        }
    }

    @Override // X.DIA
    public final void AaO(int i, int i2, String str, long j) {
        C7384Etj.A0Y(str, 2);
        this.A02[C8j3.A1Q(Arrays.binarySearch(this.A01.A00, i)) ? 1 : 0].AaO(i, i2, str, j);
    }

    @Override // X.DIA
    public final void AeJ(DHu dHu) {
        C7384Etj.A0Y(dHu, 0);
        DID[] didArr = this.A02;
        int i = 0;
        do {
            didArr[i].AeJ(dHu);
            i++;
        } while (i < 2);
    }

    @Override // X.DID
    public final long AL6() {
        DID[] didArr = this.A02;
        long jAL6 = 0;
        int i = 0;
        do {
            jAL6 += didArr[i].AL6();
            i++;
        } while (i < 2);
        return jAL6;
    }

    @Override // X.DID
    public final Integer AL7() {
        return C79.A0C;
    }

    @Override // X.DID
    public final int AL8() {
        return 0;
    }

    @Override // X.DID
    public final void ANh(RandomAccessFile randomAccessFile, long j) throws IOException {
        DI8.A01("qpl.cr.composite.initializeStorageWithFile");
        try {
            int i = 0;
            if (this.A03) {
                DID[] didArr = this.A02;
                long jAL6 = 4 + j + 32;
                int i2 = 0;
                do {
                    jAL6 += didArr[i2].AL6();
                    i2++;
                } while (i2 < 2);
                randomAccessFile.setLength(jAL6);
                if (jAL6 > 0) {
                    randomAccessFile.seek(jAL6 - 1);
                    randomAccessFile.write(0);
                }
                randomAccessFile.getFD().sync();
                randomAccessFile.seek(0L);
            }
            randomAccessFile.seek(j);
            DID[] didArr2 = this.A02;
            randomAccessFile.writeInt(2);
            long jAL62 = j + 4 + 32;
            do {
                randomAccessFile.seek((i * 16) + 4);
                randomAccessFile.writeLong(jAL62);
                randomAccessFile.writeInt(didArr2[i].AL7().intValue());
                randomAccessFile.writeInt(didArr2[i].AL8());
                didArr2[i].ANh(randomAccessFile, jAL62);
                jAL62 += didArr2[i].AL6();
                i++;
            } while (i < 2);
        } catch (IOException e) {
            CFK.A0J("QPL", e, "initializeStorageWithFile failed");
        }
        DI8.A00();
    }

    @Override // X.DIA
    public final void AaK(int i, int i2, String str, int i3) {
        this.A02[C8j3.A1Q(Arrays.binarySearch(this.A01.A00, i)) ? 1 : 0].AaK(i, i2, str, i3);
    }

    @Override // X.DIA
    public final void AaL(int i, int i2, String str, String str2) {
        this.A02[C8j3.A1Q(Arrays.binarySearch(this.A01.A00, i)) ? 1 : 0].AaL(i, i2, str, str2);
    }

    @Override // X.DIA
    public final void AaM(int i, int i2) {
        this.A02[C8j3.A1Q(Arrays.binarySearch(this.A01.A00, i)) ? 1 : 0].AaM(i, i2);
    }

    @Override // X.DIA
    public final void AaN(int i, int i2) {
        this.A02[C8j3.A1Q(Arrays.binarySearch(this.A01.A00, i)) ? 1 : 0].AaN(i, i2);
    }

    @Override // X.DIA
    public final void AaP(int i, int i2, boolean z) {
        this.A02[C8j3.A1Q(Arrays.binarySearch(this.A01.A00, i)) ? 1 : 0].AaP(i, i2, z);
    }

    @Override // X.DIA
    public final void AaQ() {
        DID[] didArr = this.A02;
        int i = 0;
        do {
            didArr[i].AaQ();
            i++;
        } while (i < 2);
    }

    @Override // X.DIA
    public final void AaR(int i, int i2, boolean z) {
        this.A02[C8j3.A1Q(Arrays.binarySearch(this.A01.A00, i)) ? 1 : 0].AaR(i, i2, z);
    }

    public DI0(C4966DIx c4966DIx, DID[] didArr, boolean z) {
        this.A02 = didArr;
        this.A03 = z;
        this.A01 = c4966DIx;
    }
}

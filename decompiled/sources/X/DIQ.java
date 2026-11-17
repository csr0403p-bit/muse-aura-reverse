package X;

import android.util.SparseArray;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.IntBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class DIQ implements DID {
    public final SparseArray<DIR> A00 = BV4.A0B();
    public final List<DIY> A01;

    @Override // X.DID
    public final void ANg(File file, String str) throws IOException {
        C7384Etj.A0Y(file, 0);
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(FGI.A0U(file.getCanonicalPath(), "/qpl_higher_guarantee_", str), "rw");
            try {
                A00(randomAccessFile, 0L);
                randomAccessFile.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    @Override // X.DIA
    public final void AaO(int i, int i2, String str, long j) {
        C7384Etj.A0Y(str, 2);
        DIR dir = this.A00.get(i);
        if (dir != null) {
            dir.AaO(i, i2, str, j);
        }
    }

    @Override // X.DIA
    public final void AeJ(DHu dHu) {
        C7384Etj.A0Y(dHu, 0);
        SparseArray<DIR> sparseArray = this.A00;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            sparseArray.get(sparseArray.keyAt(i));
        }
    }

    private final void A00(RandomAccessFile randomAccessFile, long j) throws IOException {
        try {
            try {
                randomAccessFile.seek(j);
                randomAccessFile.writeInt(2);
                long j2 = j + 4;
                for (DIY diy : this.A01) {
                    randomAccessFile.seek(j2);
                    int i = diy.A01;
                    randomAccessFile.writeInt(i);
                    randomAccessFile.writeInt(diy.A03);
                    randomAccessFile.writeInt(0);
                    randomAccessFile.writeInt(0);
                    FileChannel channel = randomAccessFile.getChannel();
                    FileChannel.MapMode mapMode = FileChannel.MapMode.READ_WRITE;
                    IntBuffer intBufferAsIntBuffer = channel.map(mapMode, j2 + 8, 8L).asIntBuffer();
                    long j3 = j2 + 16;
                    int i2 = diy.A00 * diy.A02;
                    long j4 = i2;
                    MappedByteBuffer map = randomAccessFile.getChannel().map(mapMode, j3, j4);
                    j2 = j3 + j4;
                    C7384Etj.A0X(map);
                    DIX dix = new DIX(diy, map, i2);
                    C7384Etj.A0X(intBufferAsIntBuffer);
                    this.A00.put(i, new DIR(dix, diy, intBufferAsIntBuffer));
                }
                randomAccessFile.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    @Override // X.DID
    public final long AL6() {
        int i = 0;
        for (DIY diy : this.A01) {
            C7384Etj.A0Y(diy, 0);
            i += (diy.A00 * diy.A02) + 16;
        }
        return i + 4;
    }

    @Override // X.DID
    public final Integer AL7() {
        return BZ5.A00;
    }

    @Override // X.DID
    public final int AL8() {
        return 1;
    }

    @Override // X.DIA
    public final void AaK(int i, int i2, String str, int i3) {
        DIR dir = this.A00.get(i);
        if (dir != null) {
            dir.AaK(i, i2, str, i3);
        }
    }

    @Override // X.DIA
    public final void AaL(int i, int i2, String str, String str2) {
        DIR dir = this.A00.get(i);
        if (dir != null) {
            dir.AaL(i, i2, str, str2);
        }
    }

    @Override // X.DIA
    public final void AaM(int i, int i2) {
        DIR dir = this.A00.get(i);
        if (dir != null) {
            dir.AaM(i, i2);
        }
    }

    @Override // X.DIA
    public final void AaN(int i, int i2) {
        DIR dir = this.A00.get(i);
        if (dir != null) {
            dir.AaN(i, i2);
        }
    }

    @Override // X.DIA
    public final void AaP(int i, int i2, boolean z) {
        DIR dir = this.A00.get(i);
        if (dir != null) {
            dir.AaP(i, i2, z);
        }
    }

    @Override // X.DIA
    public final void AaQ() {
        SparseArray<DIR> sparseArray = this.A00;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            sparseArray.get(sparseArray.keyAt(i)).AaQ();
        }
    }

    @Override // X.DIA
    public final void AaR(int i, int i2, boolean z) {
        DIR dir = this.A00.get(i);
        if (dir != null) {
            dir.AaR(i, i2, z);
        }
    }

    public DIQ(C4958DIb[] c4958DIbArr) {
        ArrayList arrayListA0h = C3cG.A0h();
        arrayListA0h.add(c4958DIbArr[0].A04.getValue());
        this.A01 = AbstractC0878AGe.A0X(arrayListA0h);
    }

    @Override // X.DID
    public final void ANh(RandomAccessFile randomAccessFile, long j) throws IOException {
        A00(randomAccessFile, j);
    }
}

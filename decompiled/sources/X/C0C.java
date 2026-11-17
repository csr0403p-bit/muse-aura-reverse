package X;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.media3.common.util.Util;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public final class C0C {
    public C3128Byt A00;
    public final SparseArray<String> A01;
    public final SparseBooleanArray A02;
    public final HashMap<String, C0H> A03;
    public final SparseBooleanArray A04;

    public final C0H A00(String str) {
        int iKeyAt;
        HashMap<String, C0H> map = this.A03;
        C0H c0h = map.get(str);
        if (c0h != null) {
            return c0h;
        }
        SparseArray<String> sparseArray = this.A01;
        int size = sparseArray.size();
        int i = 0;
        if (size == 0) {
            iKeyAt = 0;
        } else {
            iKeyAt = sparseArray.keyAt(size - 1) + 1;
            if (iKeyAt < 0) {
                while (i < size && i == sparseArray.keyAt(i)) {
                    i++;
                }
                iKeyAt = i;
            }
        }
        C0H c0h2 = new C0H(C3121Byl.A02, str, iKeyAt);
        map.put(str, c0h2);
        sparseArray.put(iKeyAt, str);
        this.A02.put(iKeyAt, true);
        this.A00.A01 = true;
        return c0h2;
    }

    public final void A01() throws IOException {
        C3121Byl c3121Byl;
        int i;
        int iHashCode;
        C3130Byv c3130Byv = this.A00.A02;
        File file = c3130Byv.A01;
        if (!file.exists()) {
            c3130Byv.A00.exists();
        }
        HashMap<String, C0H> map = this.A03;
        SparseArray<String> sparseArray = this.A01;
        C1G.A08(!r1.A01);
        if (file.exists() || c3130Byv.A00.exists()) {
            try {
                try {
                    File file2 = c3130Byv.A00;
                    if (file2.exists()) {
                        file.delete();
                        file2.renameTo(file);
                    }
                    DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(BV4.A0H(file)));
                    try {
                        int i2 = dataInputStream.readInt();
                        if (i2 >= 0 && i2 <= 2 && (dataInputStream.readInt() & 1) == 0) {
                            int i3 = dataInputStream.readInt();
                            int i4 = 0;
                            for (int i5 = 0; i5 < i3; i5++) {
                                int i6 = dataInputStream.readInt();
                                String utf = dataInputStream.readUTF();
                                if (i2 < 2) {
                                    long j = dataInputStream.readLong();
                                    C3122Bym c3122Bym = new C3122Bym();
                                    C3122Bym.A01(c3122Bym, j);
                                    c3121Byl = C3121Byl.A02.A01(c3122Bym);
                                } else {
                                    int i7 = dataInputStream.readInt();
                                    HashMap mapA0u = BV4.A0u();
                                    for (int i8 = 0; i8 < i7; i8++) {
                                        String utf2 = dataInputStream.readUTF();
                                        int i9 = dataInputStream.readInt();
                                        if (i9 < 0) {
                                            throw BV4.A0K(FGI.A0H("Invalid value size: ", i9));
                                        }
                                        int iMin = Math.min(i9, 10485760);
                                        byte[] bArrCopyOf = Util.A07;
                                        int i10 = 0;
                                        while (i10 != i9) {
                                            int i11 = i10 + iMin;
                                            bArrCopyOf = Arrays.copyOf(bArrCopyOf, i11);
                                            dataInputStream.readFully(bArrCopyOf, i10, iMin);
                                            iMin = Math.min(i9 - i11, 10485760);
                                            i10 = i11;
                                        }
                                        mapA0u.put(utf2, bArrCopyOf);
                                    }
                                    c3121Byl = new C3121Byl(mapA0u);
                                }
                                C0H c0h = new C0H(c3121Byl, utf, i6);
                                String str = c0h.A02;
                                map.put(str, c0h);
                                int i12 = c0h.A01;
                                sparseArray.put(i12, str);
                                int iA0H = AnonymousClass001.A0H(str, i12 * 31);
                                if (i2 < 2) {
                                    i = iA0H * 31;
                                    iHashCode = AnonymousClass002.A0A(AbstractC3127Bys.A00(c0h.A00));
                                } else {
                                    i = iA0H * 31;
                                    iHashCode = c0h.A00.hashCode();
                                }
                                i4 += i + iHashCode;
                            }
                            int i13 = dataInputStream.readInt();
                            boolean z = dataInputStream.read() == -1;
                            if (i13 == i4 && z) {
                                try {
                                    dataInputStream.close();
                                    return;
                                } catch (IOException unused) {
                                    return;
                                }
                            }
                        }
                    } catch (IOException unused2) {
                    } catch (Throwable th) {
                        try {
                            dataInputStream.close();
                            throw th;
                        } catch (IOException unused3) {
                            throw th;
                        }
                    }
                    dataInputStream.close();
                } catch (Throwable th2) {
                    throw th2;
                }
            } catch (IOException unused4) {
            }
            map.clear();
            sparseArray.clear();
            file.delete();
            c3130Byv.A00.delete();
        }
    }

    public final void A02() throws IOException {
        C3131Byw c3131Byw;
        C3128Byt c3128Byt = this.A00;
        HashMap<String, C0H> map = this.A03;
        if (c3128Byt.A01) {
            try {
                C3130Byv c3130Byv = c3128Byt.A02;
                File file = c3130Byv.A01;
                if (file.exists()) {
                    File file2 = c3130Byv.A00;
                    if (file2.exists()) {
                        file.delete();
                    } else if (!file.renameTo(file2)) {
                        CNC.A04("AtomicFile", AnonymousClass006.A0y(file2, " to backup file ", C3cG.A0f(file, "Couldn't rename file ")));
                    }
                }
                try {
                    c3131Byw = new C3131Byw(file);
                } catch (FileNotFoundException e) {
                    File parentFile = file.getParentFile();
                    if (parentFile == null || !parentFile.mkdirs()) {
                        throw new IOException(AnonymousClass007.A0a("Couldn't create ", file), e);
                    }
                    try {
                        c3131Byw = new C3131Byw(file);
                    } catch (FileNotFoundException e2) {
                        throw new IOException(AnonymousClass007.A0a("Couldn't create ", file), e2);
                    }
                }
                C3129Byu c3129Byu = c3128Byt.A00;
                if (c3129Byu == null) {
                    c3129Byu = new C3129Byu(c3131Byw);
                    c3128Byt.A00 = c3129Byu;
                } else {
                    c3129Byu.A00(c3131Byw);
                }
                DataOutputStream dataOutputStream = new DataOutputStream(c3129Byu);
                try {
                    dataOutputStream.writeInt(2);
                    dataOutputStream.writeInt(0);
                    dataOutputStream.writeInt(map.size());
                    Iterator itA0x = BV5.A0x(map);
                    int iA0G = 0;
                    while (itA0x.hasNext()) {
                        C0H c0h = (C0H) itA0x.next();
                        int i = c0h.A01;
                        dataOutputStream.writeInt(i);
                        String str = c0h.A02;
                        dataOutputStream.writeUTF(str);
                        Set<Map.Entry<String, byte[]>> setEntrySet = c0h.A00.A01.entrySet();
                        dataOutputStream.writeInt(setEntrySet.size());
                        Iterator<Map.Entry<String, byte[]>> it = setEntrySet.iterator();
                        while (it.hasNext()) {
                            Map.Entry entryA0l = C3cH.A0l(it);
                            dataOutputStream.writeUTF(C60O.A0t(entryA0l));
                            byte[] bArr = (byte[]) entryA0l.getValue();
                            dataOutputStream.writeInt(bArr.length);
                            dataOutputStream.write(bArr);
                        }
                        iA0G += AnonymousClass005.A0G(c0h.A00, AnonymousClass005.A0I(str, i * 31));
                    }
                    dataOutputStream.writeInt(iA0G);
                    dataOutputStream.close();
                    c3130Byv.A00.delete();
                    c3128Byt.A01 = false;
                } finally {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        SparseBooleanArray sparseBooleanArray = this.A04;
        int size = sparseBooleanArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.A01.remove(sparseBooleanArray.keyAt(i2));
        }
        sparseBooleanArray.clear();
        this.A02.clear();
    }

    public final void A04(String str) {
        HashMap<String, C0H> map = this.A03;
        C0H c0h = map.get(str);
        if (c0h != null && c0h.A04.isEmpty() && c0h.A03.isEmpty()) {
            map.remove(str);
            int i = c0h.A01;
            SparseBooleanArray sparseBooleanArray = this.A02;
            boolean z = sparseBooleanArray.get(i);
            this.A00.A01 = true;
            SparseArray<String> sparseArray = this.A01;
            if (z) {
                sparseArray.remove(i);
                sparseBooleanArray.delete(i);
            } else {
                sparseArray.put(i, null);
                this.A04.put(i, true);
            }
        }
    }

    public C0C(File file) {
        C1G.A08(AnonymousClass002.A1X(file));
        this.A03 = BV4.A0u();
        this.A01 = BV4.A0B();
        this.A04 = new SparseBooleanArray();
        this.A02 = new SparseBooleanArray();
        this.A00 = file != null ? new C3128Byt(C3cG.A0O(file, "cached_content_index.exi")) : null;
    }

    public final void A03(C3122Bym c3122Bym, String str) {
        C0H c0hA00 = A00(str);
        c0hA00.A00 = c0hA00.A00.A01(c3122Bym);
        if (!r0.equals(r1)) {
            this.A00.A01 = true;
        }
    }
}

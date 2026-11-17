package X;

import android.graphics.Bitmap;
import android.os.SharedMemory;
import android.system.ErrnoException;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.facebook.imagepipeline.memory.BasePool$InvalidSizeException;
import com.facebook.imagepipeline.memory.BufferMemoryChunkPool;
import com.facebook.imagepipeline.memory.NativeMemoryChunk;
import com.facebook.imagepipeline.memory.NativeMemoryChunkPool;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* loaded from: classes5.dex */
public abstract class EBt<V> implements InterfaceC6523EBx<V> {
    public final SparseArray<EBu<V>> A00;
    public final EC1 A01;
    public final EBv A02;
    public final EBv A03;
    public final C7139Egv A04;
    public final Set<V> A05;
    public final InterfaceC3590CVw A06;
    public final String A07;

    public EBt(EC1 ec1, C7139Egv c7139Egv, InterfaceC3590CVw interfaceC3590CVw) {
        C7384Etj.A0Y(ec1, 0);
        AnonymousClass003.A0x(c7139Egv, interfaceC3590CVw);
        this.A07 = C3cI.A0Y(this);
        this.A01 = ec1;
        this.A04 = c7139Egv;
        this.A00 = BV4.A0B();
        this.A06 = interfaceC3590CVw;
        A00(new SparseIntArray(0));
        Set<V> setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        C7384Etj.A0U(setNewSetFromMap);
        this.A05 = setNewSetFromMap;
        this.A02 = new EBv();
        this.A03 = new EBv();
    }

    private final synchronized void A00(SparseIntArray sparseIntArray) {
        SparseArray<EBu<V>> sparseArray = this.A00;
        sparseArray.clear();
        SparseIntArray sparseIntArray2 = this.A04.A01;
        int size = sparseIntArray2.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = sparseIntArray2.keyAt(i);
            sparseArray.put(iKeyAt, new EBu<>(iKeyAt, sparseIntArray2.valueAt(i), sparseIntArray.get(iKeyAt, 0)));
        }
    }

    public synchronized V A01(EBu<V> eBu) {
        V v;
        C7384Etj.A0Y(eBu, 0);
        v = (V) eBu.A02.poll();
        if (v != null) {
            eBu.A00++;
        }
        return v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009b A[Catch: all -> 0x00e5, TryCatch #1 {, blocks: (B:12:0x0031, B:14:0x0039, B:16:0x0051, B:17:0x005c, B:19:0x0063, B:22:0x0072, B:30:0x0096, B:32:0x009b, B:33:0x00a1, B:34:0x00b4, B:36:0x00c4, B:23:0x007f, B:25:0x0083, B:27:0x008f, B:37:0x00cc, B:39:0x00d3, B:40:0x00d9, B:44:0x00e4, B:11:0x0029), top: B:48:0x0029, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b4 A[Catch: all -> 0x00e5, TryCatch #1 {, blocks: (B:12:0x0031, B:14:0x0039, B:16:0x0051, B:17:0x005c, B:19:0x0063, B:22:0x0072, B:30:0x0096, B:32:0x009b, B:33:0x00a1, B:34:0x00b4, B:36:0x00c4, B:23:0x007f, B:25:0x0083, B:27:0x008f, B:37:0x00cc, B:39:0x00d3, B:40:0x00d9, B:44:0x00e4, B:11:0x0029), top: B:48:0x0029, inners: #0 }] */
    @Override // X.InterfaceC6523EBx, X.InterfaceC3587CVm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Aa9(V r8) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EBt.Aa9(java.lang.Object):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.ECU
    public final void AhS(ECR ecr) {
        int i;
        ArrayList arrayListA11;
        synchronized (this) {
            SparseArray<EBu<V>> sparseArray = this.A00;
            arrayListA11 = C60O.A11(sparseArray.size());
            SparseIntArray sparseIntArray = new SparseIntArray();
            int size = sparseArray.size();
            for (int i2 = 0; i2 < size; i2++) {
                EBu<V> eBuValueAt = sparseArray.valueAt(i2);
                if (eBuValueAt == null) {
                    throw BV4.A0U();
                }
                EBu<V> eBu = eBuValueAt;
                if (eBu.A02.size() > 0) {
                    arrayListA11.add(eBu);
                }
                sparseIntArray.put(sparseArray.keyAt(i2), eBu.A00);
            }
            A00(sparseIntArray);
            EBv eBv = this.A02;
            eBv.A00 = 0;
            eBv.A01 = 0;
        }
        int size2 = arrayListA11.size();
        for (i = 0; i < size2; i++) {
            EBu eBu2 = (EBu) arrayListA11.get(i);
            while (true) {
                Object objPoll = eBu2.A02.poll();
                if (objPoll == null) {
                    break;
                } else {
                    A02(objPoll);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC6523EBx
    public final V get(int i) {
        int i2;
        int allocationByteCount;
        Object obj;
        boolean z = this instanceof AbstractC6525EBz;
        if (z) {
            AbstractC6525EBz abstractC6525EBz = (AbstractC6525EBz) this;
            if (i <= 0) {
                throw new BasePool$InvalidSizeException(AnonymousClass007.A0a("Invalid size: ", Integer.valueOf(i)));
            }
            int[] iArr = abstractC6525EBz.A00;
            int length = iArr.length;
            for (int i3 = 0; i3 < length; i3++) {
                i2 = iArr[i3];
                if (i2 >= i) {
                    break;
                }
            }
            i2 = i;
        } else if (this instanceof C6524EBy) {
            C6524EBy c6524EBy = (C6524EBy) this;
            if (i <= 0) {
                throw new BasePool$InvalidSizeException(AnonymousClass007.A0a("Invalid size: ", Integer.valueOf(i)));
            }
            int[] iArr2 = c6524EBy.A00;
            int length2 = iArr2.length;
            for (int i4 = 0; i4 < length2; i4++) {
                i2 = iArr2[i4];
                if (i2 >= i) {
                    break;
                }
            }
            i2 = i;
        } else {
            i2 = i;
        }
        synchronized (this) {
            try {
                SparseArray<EBu<V>> sparseArray = this.A00;
                EBu<V> eBu = sparseArray.get(i2);
                if (eBu != null) {
                    V vA01 = A01(eBu);
                    if (vA01 != 0) {
                        if (!this.A05.add(vA01)) {
                            throw BV4.A0S();
                        }
                        if (z) {
                            EC0 ec0 = (EC0) vA01;
                            ec0.getClass();
                            allocationByteCount = ec0.getSize();
                        } else if (this instanceof C6524EBy) {
                            allocationByteCount = C7384Etj.A0e(vA01).length;
                        } else {
                            Bitmap bitmap = (Bitmap) vA01;
                            C7384Etj.A0Y(bitmap, 0);
                            allocationByteCount = bitmap.getAllocationByteCount();
                        }
                        EBv eBv = this.A03;
                        eBv.A00++;
                        eBv.A01 += allocationByteCount;
                        this.A02.A00(allocationByteCount);
                        return vA01;
                    }
                }
                EBv eBv2 = this.A03;
                eBv2.A00++;
                eBv2.A01 += i2;
                if (eBu != null) {
                    eBu.A00++;
                }
                try {
                    if (this instanceof C6524EBy) {
                        obj = (V) new byte[i2];
                    } else if (this instanceof EC3) {
                        obj = (V) C7384Etj.A07(i2);
                    } else if (this instanceof NativeMemoryChunkPool) {
                        obj = (V) new NativeMemoryChunk(i2);
                    } else if (this instanceof BufferMemoryChunkPool) {
                        obj = (V) new C3589CVp(i2);
                    } else {
                        CVq cVq = (V) new CVq();
                        if (i2 <= 0) {
                            throw BV4.A0O();
                        }
                        try {
                            SharedMemory sharedMemoryCreate = SharedMemory.create("AshmemMemoryChunk", i2);
                            cVq.A00 = sharedMemoryCreate;
                            C7384Etj.A0X(sharedMemoryCreate);
                            cVq.A01 = sharedMemoryCreate.mapReadWrite();
                            obj = cVq;
                        } catch (ErrnoException e) {
                            throw BV4.A0d("Fail to create AshmemMemory", e);
                        }
                    }
                } catch (Throwable th) {
                    synchronized (this) {
                        eBv2.A00(i2);
                        EBu<V> eBu2 = sparseArray.get(i2);
                        if (eBu2 != null) {
                            int i5 = eBu2.A00;
                            CVn.A03(AnonymousClass002.A1N(i5));
                            eBu2.A00 = i5 - 1;
                        }
                        if ((th instanceof Error) || (th instanceof RuntimeException)) {
                            throw th;
                        }
                        obj = (V) null;
                    }
                }
                synchronized (this) {
                    if (!this.A05.add(obj)) {
                        throw BV4.A0S();
                    }
                }
                C7384Etj.A0X(obj);
                return (V) obj;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void A02(V v) {
        if (this instanceof AbstractC6525EBz) {
            EC0 ec0 = (EC0) v;
            ec0.getClass();
            ec0.close();
        } else {
            if (this instanceof C6524EBy) {
                return;
            }
            Bitmap bitmap = (Bitmap) v;
            C7384Etj.A0Y(bitmap, 0);
            bitmap.recycle();
        }
    }
}

package com.facebook.mobileconfig;

import X.BV5;
import X.C60O;
import X.C7321Eku;
import X.C7322Ekv;
import X.CFK;
import X.ETi;
import android.os.ParcelFileDescriptor;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.nio.ByteBuffer;
import java.util.HashSet;

/* loaded from: classes5.dex */
public class MobileConfigSharedMemory {
    public static String TAG = "MobileConfigSharedMemory";
    public static final ReferenceQueue<ByteBuffer> mBufferQueue;
    public static final HashSet<C7321Eku> references;

    public static native int closeMemoryFile(int i);

    public static native int closeMemoryMap(long j, int i);

    public static native Object createByteBufferFromMap(long j, int i);

    public static native int createNewSharedMemoryRegion(int i, String str);

    public static native long memoryMapRegion(int i, int i2);

    static {
        ETi.loadLibrary("mobileconfig-jni");
        mBufferQueue = new ReferenceQueue<>();
        references = C60O.A13();
    }

    public static synchronized void cleanupUnusedBuffers() {
        while (true) {
            Reference<? extends ByteBuffer> referencePoll = mBufferQueue.poll();
            if (referencePoll != null) {
                C7321Eku c7321Eku = (C7321Eku) referencePoll;
                references.remove(c7321Eku);
                int i = c7321Eku.A00;
                long j = c7321Eku.A02;
                int i2 = c7321Eku.A01;
                String str = c7321Eku.A03;
                if (!closeMemoryResources(i, j, i2, str)) {
                    CFK.A0F(TAG, "Failed to close memory resources %d %s", Integer.valueOf(i), str);
                }
                referencePoll.clear();
            }
        }
    }

    public static C7322Ekv fromFd(ParcelFileDescriptor parcelFileDescriptor, int i, String str) {
        if (parcelFileDescriptor == null) {
            return null;
        }
        return new C7322Ekv(parcelFileDescriptor.detachFd(), i, str);
    }

    public static synchronized ByteBuffer getByteBuffer(C7322Ekv c7322Ekv) {
        if (c7322Ekv == null) {
            CFK.A04(TAG, "Failed to create buffer. Invalid memory info");
        } else if (c7322Ekv.A00 > 0) {
            CFK.A04(TAG, "Failed to create buffer. Buffer already created for shared memory region");
        } else {
            int i = c7322Ekv.A02;
            int i2 = c7322Ekv.A01;
            long jMemoryMapRegion = memoryMapRegion(i, i2);
            if (jMemoryMapRegion >= 0) {
                c7322Ekv.A00 = jMemoryMapRegion;
                ByteBuffer byteBuffer = (ByteBuffer) createByteBufferFromMap(jMemoryMapRegion, i);
                references.add(new C7321Eku(c7322Ekv.A03, mBufferQueue, byteBuffer, i2, i, c7322Ekv.A00));
                return byteBuffer;
            }
            CFK.A0F(TAG, "Failed to create memory region for shared memory %d %s", Integer.valueOf(i2), c7322Ekv.A03);
        }
        return null;
    }

    public static ParcelFileDescriptor getParcelFileDescriptor(C7322Ekv c7322Ekv) {
        if (c7322Ekv == null) {
            return null;
        }
        return ParcelFileDescriptor.fromFd(c7322Ekv.A01);
    }

    public static boolean closeMemoryResources(int i, long j, int i2, String str) {
        String str2;
        Object[] objArr;
        String str3;
        int iCloseMemoryMap = closeMemoryMap(j, i2);
        if (iCloseMemoryMap != 0) {
            str2 = TAG;
            objArr = new Object[]{Integer.valueOf(i), str, Integer.valueOf(iCloseMemoryMap)};
            str3 = "Failed to close mmap %d %s result: %d";
        } else {
            int iCloseMemoryFile = closeMemoryFile(i);
            if (iCloseMemoryFile == 0) {
                return true;
            }
            str2 = TAG;
            objArr = new Object[]{Integer.valueOf(i), str, Integer.valueOf(iCloseMemoryFile)};
            str3 = "Failed to close file %d %s result: %d";
        }
        CFK.A0F(str2, str3, objArr);
        return false;
    }

    public static C7322Ekv createSharedMemory(int i, String str) {
        int iCreateNewSharedMemoryRegion = createNewSharedMemoryRegion(i, str);
        if (iCreateNewSharedMemoryRegion >= 0) {
            return new C7322Ekv(iCreateNewSharedMemoryRegion, i, str);
        }
        CFK.A0F(TAG, "Failed to create shared memory region %s Error: %d", BV5.A1a(str, iCreateNewSharedMemoryRegion));
        return null;
    }
}

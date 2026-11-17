package X;

import com.facebook.imagepipeline.memory.NativeMemoryChunk;

/* loaded from: classes5.dex */
public final class CVs {
    private final long nativeAllocate(int i) {
        return NativeMemoryChunk.nativeAllocate(i);
    }

    private final void nativeFree(long j) {
        NativeMemoryChunk.nativeFree(j);
    }

    private final byte nativeReadByte(long j) {
        return NativeMemoryChunk.nativeReadByte(j);
    }

    private final void nativeMemcpy(long j, long j2, int i) {
        NativeMemoryChunk.nativeMemcpy(j, j2, i);
    }

    private final void nativeCopyFromByteArray(long j, byte[] bArr, int i, int i2) {
        NativeMemoryChunk.nativeCopyFromByteArray(j, bArr, i, i2);
    }

    private final void nativeCopyToByteArray(long j, byte[] bArr, int i, int i2) {
        NativeMemoryChunk.nativeCopyToByteArray(j, bArr, i, i2);
    }
}

package com.sun.jna;

import X.AnonymousClass002;
import X.BV4;
import X.BV5;
import X.BV6;
import X.BV7;
import X.C3cG;
import X.C60O;
import X.C8j2;
import X.FGI;
import com.sun.jna.internal.Cleaner;
import java.io.Closeable;
import java.lang.ref.Reference;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
public class Memory extends Pointer implements Closeable {
    public static final Map<Long, Reference<Memory>> allocatedMemory = C60O.A1C();
    public static final WeakMemoryHolder buffers = new WeakMemoryHolder();
    public final Cleaner.Cleanable cleanable;
    public long size;

    public class SharedMemory extends Memory {
        @Override // com.sun.jna.Memory
        public synchronized void dispose() {
            this.peer = 0L;
        }

        public SharedMemory(long j, long j2) {
            this.size = j2;
            this.peer = Memory.this.peer + j;
        }

        @Override // com.sun.jna.Memory
        public void boundsCheck(long j, long j2) {
            Memory memory = Memory.this;
            memory.boundsCheck((this.peer - memory.peer) + j, j2);
        }

        @Override // com.sun.jna.Memory, com.sun.jna.Pointer
        public String toString() {
            return FGI.A0d(super.toString(), " (shared from ", Memory.this.toString(), ")");
        }
    }

    public final class MemoryDisposer implements Runnable {
        public long peer;

        @Override // java.lang.Runnable
        public synchronized void run() {
            try {
                Memory.free(this.peer);
            } finally {
                Memory.allocatedMemory.remove(Long.valueOf(this.peer));
                this.peer = 0L;
            }
        }

        public MemoryDisposer(long j) {
            this.peer = j;
        }
    }

    public static void disposeAll() {
        Iterator itA0z = BV5.A0z(allocatedMemory.values());
        while (itA0z.hasNext()) {
            Memory memory = (Memory) ((Reference) itA0z.next()).get();
            if (memory != null) {
                memory.close();
            }
        }
    }

    public static void free(long j) {
        if (j != 0) {
            Native.free(j);
        }
    }

    public static void purge() {
        buffers.clean();
    }

    private Pointer shareReferenceIfInBounds(Pointer pointer) {
        if (pointer == null) {
            return null;
        }
        long j = pointer.peer - this.peer;
        if (j < 0) {
            return pointer;
        }
        long j2 = this.size;
        return j < j2 ? share(j, j2 - j) : pointer;
    }

    public Memory align(int i) {
        if (i <= 0) {
            throw BV5.A0Q("Byte boundary must be positive: ", i);
        }
        int i2 = 0;
        while (i != (1 << i2)) {
            i2++;
            if (i2 >= 32) {
                throw C60O.A0i("Byte boundary must be a power of two");
            }
        }
        long j = i;
        long j2 = (j - 1) ^ (-1);
        long j3 = this.peer;
        if ((j3 & j2) == j3) {
            return this;
        }
        long j4 = ((j3 + j) - 1) & j2;
        long j5 = (j3 + this.size) - j4;
        if (j5 > 0) {
            return (Memory) share(j4 - j3, j5);
        }
        throw C60O.A0i("Insufficient memory to align to the requested boundary");
    }

    public void boundsCheck(long j, long j2) {
        if (j < 0) {
            throw BV6.A0g(FGI.A0B(j, C8j2.A00(17)));
        }
        long j3 = j + j2;
        long j4 = this.size;
        if (j3 <= j4) {
            return;
        }
        StringBuilder sbA0g = C3cG.A0g("Bounds exceeds available space : size=");
        sbA0g.append(j4);
        throw BV6.A0g(BV7.A0z(", offset=", sbA0g, j3));
    }

    public void clear() {
        clear(this.size);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.peer = 0L;
        Cleaner.Cleanable cleanable = this.cleanable;
        if (cleanable != null) {
            cleanable.clean();
        }
    }

    public String dump() {
        return dump(0L, (int) this.size);
    }

    @Override // com.sun.jna.Pointer
    public byte getByte(long j) {
        boundsCheck(j, 1L);
        return Native.getByte(this, this.peer, j);
    }

    @Override // com.sun.jna.Pointer
    public char getChar(long j) {
        boundsCheck(j, Native.WCHAR_SIZE);
        return Native.getChar(this, this.peer, j);
    }

    @Override // com.sun.jna.Pointer
    public double getDouble(long j) {
        boundsCheck(j, 8L);
        return Native.getDouble(this, this.peer, j);
    }

    @Override // com.sun.jna.Pointer
    public float getFloat(long j) {
        boundsCheck(j, 4L);
        return Native.getFloat(this, this.peer, j);
    }

    @Override // com.sun.jna.Pointer
    public int getInt(long j) {
        boundsCheck(j, 4L);
        return Native.getInt(this, this.peer, j);
    }

    @Override // com.sun.jna.Pointer
    public long getLong(long j) {
        boundsCheck(j, 8L);
        return Native.getLong(this, this.peer, j);
    }

    @Override // com.sun.jna.Pointer
    public Pointer getPointer(long j) {
        boundsCheck(j, Native.POINTER_SIZE);
        return shareReferenceIfInBounds(Native.getPointer(this.peer + j));
    }

    @Override // com.sun.jna.Pointer
    public short getShort(long j) {
        boundsCheck(j, 2L);
        return Native.getShort(this, this.peer, j);
    }

    @Override // com.sun.jna.Pointer
    public String getString(long j, String str) {
        boundsCheck(j, 0L);
        return Native.getString(this, j, str);
    }

    @Override // com.sun.jna.Pointer
    public String getWideString(long j) {
        boundsCheck(j, 0L);
        return Native.getWideString(this, this.peer, j);
    }

    @Override // com.sun.jna.Pointer
    public void read(long j, char[] cArr, int i, int i2) {
        boundsCheck(j, Native.WCHAR_SIZE * i2);
        super.read(j, cArr, i, i2);
    }

    @Override // com.sun.jna.Pointer
    public void setByte(long j, byte b) {
        boundsCheck(j, 1L);
        super.setByte(j, b);
    }

    @Override // com.sun.jna.Pointer
    public void setChar(long j, char c) {
        boundsCheck(j, Native.WCHAR_SIZE);
        super.setChar(j, c);
    }

    @Override // com.sun.jna.Pointer
    public void setDouble(long j, double d) {
        boundsCheck(j, 8L);
        super.setDouble(j, d);
    }

    @Override // com.sun.jna.Pointer
    public void setFloat(long j, float f) {
        boundsCheck(j, 4L);
        super.setFloat(j, f);
    }

    @Override // com.sun.jna.Pointer
    public void setInt(long j, int i) {
        boundsCheck(j, 4L);
        super.setInt(j, i);
    }

    @Override // com.sun.jna.Pointer
    public void setLong(long j, long j2) {
        boundsCheck(j, 8L);
        super.setLong(j, j2);
    }

    @Override // com.sun.jna.Pointer
    public void setPointer(long j, Pointer pointer) {
        boundsCheck(j, Native.POINTER_SIZE);
        super.setPointer(j, pointer);
    }

    @Override // com.sun.jna.Pointer
    public void setShort(long j, short s) {
        boundsCheck(j, 2L);
        super.setShort(j, s);
    }

    @Override // com.sun.jna.Pointer
    public Pointer share(long j) {
        return share(j, this.size - j);
    }

    public long size() {
        return this.size;
    }

    @Override // com.sun.jna.Pointer
    public String toString() {
        return FGI.A0g("allocated@0x", Long.toHexString(this.peer), " (", " bytes)", this.size);
    }

    public boolean valid() {
        return AnonymousClass002.A1L((this.peer > 0L ? 1 : (this.peer == 0L ? 0 : -1)));
    }

    @Override // com.sun.jna.Pointer
    public void write(long j, char[] cArr, int i, int i2) {
        boundsCheck(j, Native.WCHAR_SIZE * i2);
        super.write(j, cArr, i, i2);
    }

    public Memory(long j) {
        this.size = j;
        if (j <= 0) {
            throw C60O.A0i("Allocation size must be greater than zero");
        }
        long jMalloc = Native.malloc(j);
        this.peer = jMalloc;
        if (jMalloc == 0) {
            throw new OutOfMemoryError(FGI.A0J("Cannot allocate ", j, " bytes"));
        }
        allocatedMemory.put(Long.valueOf(jMalloc), BV4.A0q(this));
        this.cleanable = Cleaner.INSTANCE.register(this, new MemoryDisposer(this.peer));
    }

    public static long malloc(long j) {
        return Native.malloc(j);
    }

    @Deprecated
    public void dispose() {
        close();
    }

    @Override // com.sun.jna.Pointer
    public ByteBuffer getByteBuffer(long j, long j2) {
        boundsCheck(j, j2);
        ByteBuffer byteBuffer = super.getByteBuffer(j, j2);
        buffers.put(byteBuffer, this);
        return byteBuffer;
    }

    @Override // com.sun.jna.Pointer
    public void setString(long j, String str, String str2) {
        boundsCheck(j, str.getBytes(Native.getCharset(str2)).length + 1);
        super.setString(j, str, str2);
    }

    @Override // com.sun.jna.Pointer
    public void setWideString(long j, String str) {
        boundsCheck(j, (str.length() + 1) * Native.WCHAR_SIZE);
        super.setWideString(j, str);
    }

    public Memory() {
        this.cleanable = null;
    }

    @Override // com.sun.jna.Pointer
    public void read(long j, double[] dArr, int i, int i2) {
        boundsCheck(j, i2 * 8);
        super.read(j, dArr, i, i2);
    }

    @Override // com.sun.jna.Pointer
    public Pointer share(long j, long j2) {
        boundsCheck(j, j2);
        return new SharedMemory(j, j2);
    }

    @Override // com.sun.jna.Pointer
    public void write(long j, double[] dArr, int i, int i2) {
        boundsCheck(j, i2 * 8);
        super.write(j, dArr, i, i2);
    }

    @Override // com.sun.jna.Pointer
    public void read(long j, float[] fArr, int i, int i2) {
        boundsCheck(j, i2 * 4);
        super.read(j, fArr, i, i2);
    }

    @Override // com.sun.jna.Pointer
    public void write(long j, float[] fArr, int i, int i2) {
        boundsCheck(j, i2 * 4);
        super.write(j, fArr, i, i2);
    }

    @Override // com.sun.jna.Pointer
    public void read(long j, byte[] bArr, int i, int i2) {
        boundsCheck(j, i2);
        super.read(j, bArr, i, i2);
    }

    @Override // com.sun.jna.Pointer
    public void write(long j, byte[] bArr, int i, int i2) {
        boundsCheck(j, i2);
        super.write(j, bArr, i, i2);
    }

    @Override // com.sun.jna.Pointer
    public void read(long j, int[] iArr, int i, int i2) {
        boundsCheck(j, i2 * 4);
        super.read(j, iArr, i, i2);
    }

    @Override // com.sun.jna.Pointer
    public void write(long j, int[] iArr, int i, int i2) {
        boundsCheck(j, i2 * 4);
        super.write(j, iArr, i, i2);
    }

    @Override // com.sun.jna.Pointer
    public void read(long j, long[] jArr, int i, int i2) {
        boundsCheck(j, i2 * 8);
        super.read(j, jArr, i, i2);
    }

    @Override // com.sun.jna.Pointer
    public void write(long j, long[] jArr, int i, int i2) {
        boundsCheck(j, i2 * 8);
        super.write(j, jArr, i, i2);
    }

    @Override // com.sun.jna.Pointer
    public void read(long j, Pointer[] pointerArr, int i, int i2) {
        boundsCheck(j, Native.POINTER_SIZE * i2);
        super.read(j, pointerArr, i, i2);
    }

    @Override // com.sun.jna.Pointer
    public void write(long j, Pointer[] pointerArr, int i, int i2) {
        boundsCheck(j, Native.POINTER_SIZE * i2);
        super.write(j, pointerArr, i, i2);
    }

    @Override // com.sun.jna.Pointer
    public void read(long j, short[] sArr, int i, int i2) {
        boundsCheck(j, i2 * 2);
        super.read(j, sArr, i, i2);
    }

    @Override // com.sun.jna.Pointer
    public void write(long j, short[] sArr, int i, int i2) {
        boundsCheck(j, i2 * 2);
        super.write(j, sArr, i, i2);
    }
}

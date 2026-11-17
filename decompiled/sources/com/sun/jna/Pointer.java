package com.sun.jna;

import X.AnonymousClass001;
import X.AnonymousClass007;
import X.BV4;
import X.BV5;
import X.BV6;
import X.BV7;
import X.C3cG;
import X.C8j3;
import X.FGI;
import com.facebook.aura.analytics.waterfall.HatchPriceImpressionEventDataKt;
import com.sun.jna.Structure;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Array;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public class Pointer {
    public static final Pointer NULL = null;
    public long peer;

    public class Opaque extends Pointer {
        public final String MSG;

        @Override // com.sun.jna.Pointer
        public String toString() {
            return FGI.A0M("const@0x", Long.toHexString(this.peer));
        }

        public Opaque(long j) {
            super(j);
            this.MSG = AnonymousClass007.A0a("This pointer is opaque: ", this);
        }

        @Override // com.sun.jna.Pointer
        public void clear(long j) {
            throw BV6.A0s(this);
        }

        @Override // com.sun.jna.Pointer
        public String dump(long j, int i) {
            throw BV6.A0s(this);
        }

        @Override // com.sun.jna.Pointer
        public byte getByte(long j) {
            throw BV6.A0s(this);
        }

        @Override // com.sun.jna.Pointer
        public ByteBuffer getByteBuffer(long j, long j2) {
            throw BV6.A0s(this);
        }

        @Override // com.sun.jna.Pointer
        public char getChar(long j) {
            throw BV6.A0s(this);
        }

        @Override // com.sun.jna.Pointer
        public double getDouble(long j) {
            throw BV6.A0s(this);
        }

        @Override // com.sun.jna.Pointer
        public float getFloat(long j) {
            throw BV6.A0s(this);
        }

        @Override // com.sun.jna.Pointer
        public int getInt(long j) {
            throw BV6.A0s(this);
        }

        @Override // com.sun.jna.Pointer
        public long getLong(long j) {
            throw BV6.A0s(this);
        }

        @Override // com.sun.jna.Pointer
        public Pointer getPointer(long j) {
            throw BV6.A0s(this);
        }

        @Override // com.sun.jna.Pointer
        public short getShort(long j) {
            throw BV6.A0s(this);
        }

        @Override // com.sun.jna.Pointer
        public String getString(long j, String str) {
            throw BV6.A0s(this);
        }

        @Override // com.sun.jna.Pointer
        public String getWideString(long j) {
            throw BV6.A0s(this);
        }

        @Override // com.sun.jna.Pointer
        public long indexOf(long j, byte b) {
            throw BV6.A0s(this);
        }

        @Override // com.sun.jna.Pointer
        public void read(long j, byte[] bArr, int i, int i2) {
            throw BV6.A0s(this);
        }

        @Override // com.sun.jna.Pointer
        public void setByte(long j, byte b) {
            throw BV6.A0s(this);
        }

        @Override // com.sun.jna.Pointer
        public void setChar(long j, char c) {
            throw BV6.A0s(this);
        }

        @Override // com.sun.jna.Pointer
        public void setDouble(long j, double d) {
            throw BV6.A0s(this);
        }

        @Override // com.sun.jna.Pointer
        public void setFloat(long j, float f) {
            throw BV6.A0s(this);
        }

        @Override // com.sun.jna.Pointer
        public void setInt(long j, int i) {
            throw BV6.A0s(this);
        }

        @Override // com.sun.jna.Pointer
        public void setLong(long j, long j2) {
            throw BV6.A0s(this);
        }

        @Override // com.sun.jna.Pointer
        public void setMemory(long j, long j2, byte b) {
            throw BV6.A0s(this);
        }

        @Override // com.sun.jna.Pointer
        public void setPointer(long j, Pointer pointer) {
            throw BV6.A0s(this);
        }

        @Override // com.sun.jna.Pointer
        public void setShort(long j, short s) {
            throw BV6.A0s(this);
        }

        @Override // com.sun.jna.Pointer
        public void setString(long j, String str, String str2) {
            throw BV6.A0s(this);
        }

        @Override // com.sun.jna.Pointer
        public void setWideString(long j, String str) {
            throw BV6.A0s(this);
        }

        @Override // com.sun.jna.Pointer
        public Pointer share(long j, long j2) {
            throw BV6.A0s(this);
        }

        @Override // com.sun.jna.Pointer
        public void write(long j, byte[] bArr, int i, int i2) {
            throw BV6.A0s(this);
        }

        @Override // com.sun.jna.Pointer
        public void read(long j, char[] cArr, int i, int i2) {
            throw BV6.A0s(this);
        }

        @Override // com.sun.jna.Pointer
        public void write(long j, char[] cArr, int i, int i2) {
            throw BV6.A0s(this);
        }

        @Override // com.sun.jna.Pointer
        public void read(long j, double[] dArr, int i, int i2) {
            throw BV6.A0s(this);
        }

        @Override // com.sun.jna.Pointer
        public void write(long j, double[] dArr, int i, int i2) {
            throw BV6.A0s(this);
        }

        @Override // com.sun.jna.Pointer
        public void read(long j, short[] sArr, int i, int i2) {
            throw BV6.A0s(this);
        }

        @Override // com.sun.jna.Pointer
        public void write(long j, short[] sArr, int i, int i2) {
            throw BV6.A0s(this);
        }

        @Override // com.sun.jna.Pointer
        public void read(long j, float[] fArr, int i, int i2) {
            throw BV6.A0s(this);
        }

        @Override // com.sun.jna.Pointer
        public void write(long j, float[] fArr, int i, int i2) {
            throw BV6.A0s(this);
        }

        @Override // com.sun.jna.Pointer
        public void read(long j, int[] iArr, int i, int i2) {
            throw BV6.A0s(this);
        }

        @Override // com.sun.jna.Pointer
        public void write(long j, int[] iArr, int i, int i2) {
            throw BV6.A0s(this);
        }

        @Override // com.sun.jna.Pointer
        public void read(long j, long[] jArr, int i, int i2) {
            throw BV6.A0s(this);
        }

        @Override // com.sun.jna.Pointer
        public void write(long j, long[] jArr, int i, int i2) {
            throw BV6.A0s(this);
        }

        @Override // com.sun.jna.Pointer
        public void read(long j, Pointer[] pointerArr, int i, int i2) {
            throw BV6.A0s(this);
        }

        @Override // com.sun.jna.Pointer
        public void write(long j, Pointer[] pointerArr, int i, int i2) {
            throw BV6.A0s(this);
        }
    }

    public boolean equals(Object obj) {
        return obj == this || (obj != null && (obj instanceof Pointer) && ((Pointer) obj).peer == this.peer);
    }

    public byte[] getByteArray(long j, int i) {
        byte[] bArr = new byte[i];
        read(j, bArr, 0, i);
        return bArr;
    }

    public ByteBuffer getByteBuffer(long j, long j2) {
        return Native.getDirectByteBuffer(this, this.peer, j, j2).order(ByteOrder.nativeOrder());
    }

    public char[] getCharArray(long j, int i) {
        char[] cArr = new char[i];
        read(j, cArr, 0, i);
        return cArr;
    }

    public double[] getDoubleArray(long j, int i) {
        double[] dArr = new double[i];
        read(j, dArr, 0, i);
        return dArr;
    }

    public float[] getFloatArray(long j, int i) {
        float[] fArr = new float[i];
        read(j, fArr, 0, i);
        return fArr;
    }

    public int[] getIntArray(long j, int i) {
        int[] iArr = new int[i];
        read(j, iArr, 0, i);
        return iArr;
    }

    public long[] getLongArray(long j, int i) {
        long[] jArr = new long[i];
        read(j, jArr, 0, i);
        return jArr;
    }

    public short[] getShortArray(long j, int i) {
        short[] sArr = new short[i];
        read(j, sArr, 0, i);
        return sArr;
    }

    public String[] getStringArray(long j) {
        return getStringArray(j, -1, Native.getDefaultStringEncoding());
    }

    public String[] getWideStringArray(long j) {
        return getWideStringArray(j, -1);
    }

    public long indexOf(long j, byte b) {
        return Native.indexOf(this, this.peer, j, b);
    }

    public void read(long j, Pointer[] pointerArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            Pointer pointer = getPointer((Native.POINTER_SIZE * i3) + j);
            int i4 = i3 + i;
            Pointer pointer2 = pointerArr[i4];
            if (pointer2 == null || pointer == null || pointer.peer != pointer2.peer) {
                pointerArr[i4] = pointer;
            }
        }
    }

    public void setByte(long j, byte b) {
        Native.setByte(this, this.peer, j, b);
    }

    public void setChar(long j, char c) {
        Native.setChar(this, this.peer, j, c);
    }

    public void setDouble(long j, double d) {
        Native.setDouble(this, this.peer, j, d);
    }

    public void setFloat(long j, float f) {
        Native.setFloat(this, this.peer, j, f);
    }

    public void setInt(long j, int i) {
        Native.setInt(this, this.peer, j, i);
    }

    public void setLong(long j, long j2) {
        Native.setLong(this, this.peer, j, j2);
    }

    public void setMemory(long j, long j2, byte b) {
        Native.setMemory(this, this.peer, j, j2, b);
    }

    public void setPointer(long j, Pointer pointer) {
        Native.setPointer(this, this.peer, j, pointer != null ? pointer.peer : 0L);
    }

    public void setShort(long j, short s) {
        Native.setShort(this, this.peer, j, s);
    }

    public void setWideString(long j, String str) {
        Native.setWideString(this, this.peer, j, str);
    }

    public void write(long j, Pointer[] pointerArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            setPointer((Native.POINTER_SIZE * i3) + j, pointerArr[i + i3]);
        }
    }

    private void readArray(long j, Object obj, Class<?> cls) {
        int length = Array.getLength(obj);
        if (cls == Byte.TYPE) {
            read(j, (byte[]) obj, 0, length);
            return;
        }
        if (cls == Short.TYPE) {
            read(j, (short[]) obj, 0, length);
            return;
        }
        if (cls == Character.TYPE) {
            read(j, (char[]) obj, 0, length);
            return;
        }
        if (cls == Integer.TYPE) {
            read(j, (int[]) obj, 0, length);
            return;
        }
        if (cls == Long.TYPE) {
            read(j, (long[]) obj, 0, length);
            return;
        }
        if (cls == Float.TYPE) {
            read(j, (float[]) obj, 0, length);
            return;
        }
        if (cls == Double.TYPE) {
            read(j, (double[]) obj, 0, length);
            return;
        }
        if (Pointer.class.isAssignableFrom(cls)) {
            read(j, (Pointer[]) obj, 0, length);
            return;
        }
        int i = 0;
        if (!BV6.A1X(cls)) {
            if (!NativeMapped.class.isAssignableFrom(cls)) {
                throw C8j3.A0w(" from memory not supported", C3cG.A0f(cls, "Reading array of "));
            }
            Object[] objArr = (NativeMapped[]) obj;
            NativeMappedConverter nativeMappedConverter = NativeMappedConverter.getInstance(cls);
            int nativeSize = Native.getNativeSize(obj.getClass(), obj);
            int length2 = objArr.length;
            int i2 = nativeSize / length2;
            while (i < length2) {
                objArr[i] = nativeMappedConverter.fromNative(getValue((i2 * i) + j, nativeMappedConverter.nativeType(), objArr[i]), new FromNativeContext(cls));
                i++;
            }
            return;
        }
        Structure[] structureArr = (Structure[]) obj;
        if (Structure.ByReference.class.isAssignableFrom(cls)) {
            int length3 = structureArr.length;
            Pointer[] pointerArray = getPointerArray(j, length3);
            while (i < length3) {
                structureArr[i] = Structure.updateStructureByReference(cls, structureArr[i], pointerArray[i]);
                i++;
            }
            return;
        }
        Structure structureNewInstance = structureArr[0];
        if (structureNewInstance == null) {
            structureNewInstance = Structure.newInstance((Class<Structure>) cls, share(j));
            structureNewInstance.conditionalAutoRead();
            structureArr[0] = structureNewInstance;
        } else {
            structureNewInstance.useMemory(this, (int) j, true);
            structureNewInstance.read();
        }
        int length4 = structureArr.length;
        Structure[] array = structureNewInstance.toArray(length4);
        for (int i3 = 1; i3 < length4; i3++) {
            Structure structure = structureArr[i3];
            if (structure == null) {
                structureArr[i3] = array[i3];
            } else {
                structure.useMemory(this, (int) ((structure.size() * i3) + j), true);
                structureArr[i3].read();
            }
        }
    }

    private void writeArray(long j, Object obj, Class<?> cls) {
        int length;
        Pointer[] pointerArr;
        int i;
        if (cls == Byte.TYPE) {
            byte[] bArr = (byte[]) obj;
            write(j, bArr, 0, bArr.length);
            return;
        }
        if (cls == Short.TYPE) {
            short[] sArr = (short[]) obj;
            write(j, sArr, 0, sArr.length);
            return;
        }
        if (cls == Character.TYPE) {
            char[] cArr = (char[]) obj;
            write(j, cArr, 0, cArr.length);
            return;
        }
        if (cls == Integer.TYPE) {
            int[] iArr = (int[]) obj;
            write(j, iArr, 0, iArr.length);
            return;
        }
        if (cls == Long.TYPE) {
            long[] jArr = (long[]) obj;
            write(j, jArr, 0, jArr.length);
            return;
        }
        if (cls == Float.TYPE) {
            float[] fArr = (float[]) obj;
            write(j, fArr, 0, fArr.length);
            return;
        }
        if (cls == Double.TYPE) {
            double[] dArr = (double[]) obj;
            write(j, dArr, 0, dArr.length);
            return;
        }
        if (Pointer.class.isAssignableFrom(cls)) {
            pointerArr = (Pointer[]) obj;
            i = 0;
            length = pointerArr.length;
        } else {
            if (!BV6.A1X(cls)) {
                if (!NativeMapped.class.isAssignableFrom(cls)) {
                    throw C8j3.A0w(" to memory not supported", C3cG.A0f(cls, "Writing array of "));
                }
                NativeMapped[] nativeMappedArr = (NativeMapped[]) obj;
                NativeMappedConverter nativeMappedConverter = NativeMappedConverter.getInstance(cls);
                Class<?> clsNativeType = nativeMappedConverter.nativeType();
                int nativeSize = Native.getNativeSize(obj.getClass(), obj);
                int length2 = nativeMappedArr.length;
                int i2 = nativeSize / length2;
                for (int i3 = 0; i3 < length2; i3++) {
                    setValue((i3 * i2) + j, nativeMappedConverter.toNative(nativeMappedArr[i3], new ToNativeContext()), clsNativeType);
                }
                return;
            }
            Structure[] structureArr = (Structure[]) obj;
            if (!Structure.ByReference.class.isAssignableFrom(cls)) {
                Structure structureNewInstance = structureArr[0];
                if (structureNewInstance == null) {
                    structureNewInstance = Structure.newInstance((Class<Structure>) cls, share(j));
                    structureArr[0] = structureNewInstance;
                } else {
                    structureNewInstance.useMemory(this, (int) j, true);
                }
                structureNewInstance.write();
                int length3 = structureArr.length;
                Structure[] array = structureNewInstance.toArray(length3);
                for (int i4 = 1; i4 < length3; i4++) {
                    Structure structure = structureArr[i4];
                    if (structure == null) {
                        structureArr[i4] = array[i4];
                    } else {
                        structure.useMemory(this, (int) ((structure.size() * i4) + j), true);
                    }
                    structureArr[i4].write();
                }
                return;
            }
            length = structureArr.length;
            pointerArr = new Pointer[length];
            for (int i5 = 0; i5 < length; i5++) {
                Structure structure2 = structureArr[i5];
                if (structure2 == null) {
                    pointerArr[i5] = null;
                } else {
                    pointerArr[i5] = structure2.getPointer();
                    structureArr[i5].write();
                }
            }
            i = 0;
        }
        write(j, pointerArr, i, length);
    }

    public void clear(long j) {
        setMemory(0L, j, (byte) 0);
    }

    public String dump(long j, int i) {
        StringWriter stringWriter = new StringWriter((i * 2) + 13 + ((i / 4) * 4));
        PrintWriter printWriter = new PrintWriter(stringWriter);
        printWriter.println("memory dump");
        for (int i2 = 0; i2 < i; i2++) {
            byte b = getByte(i2 + j);
            int i3 = i2 % 4;
            if (i3 == 0) {
                printWriter.print("[");
            }
            if (b >= 0 && b < 16) {
                printWriter.print(HatchPriceImpressionEventDataKt.NO_DISCOUNT);
            }
            printWriter.print(Integer.toHexString(b & 255));
            if (i3 == 3 && i2 < i - 1) {
                printWriter.println("]");
            }
        }
        if (stringWriter.getBuffer().charAt(stringWriter.getBuffer().length() - 2) != ']') {
            printWriter.println("]");
        }
        return stringWriter.toString();
    }

    public byte getByte(long j) {
        return Native.getByte(this, this.peer, j);
    }

    public char getChar(long j) {
        return Native.getChar(this, this.peer, j);
    }

    public double getDouble(long j) {
        return Native.getDouble(this, this.peer, j);
    }

    public float getFloat(long j) {
        return Native.getFloat(this, this.peer, j);
    }

    public int getInt(long j) {
        return Native.getInt(this, this.peer, j);
    }

    public long getLong(long j) {
        return Native.getLong(this, this.peer, j);
    }

    public NativeLong getNativeLong(long j) {
        return new NativeLong(NativeLong.SIZE == 8 ? getLong(j) : getInt(j), false);
    }

    public Pointer getPointer(long j) {
        return Native.getPointer(this.peer + j);
    }

    public short getShort(long j) {
        return Native.getShort(this, this.peer, j);
    }

    public String getWideString(long j) {
        return Native.getWideString(this, this.peer, j);
    }

    public int hashCode() {
        long j = this.peer;
        return (int) ((j >>> 32) + (j & 4294967295L));
    }

    public void setNativeLong(long j, NativeLong nativeLong) {
        if (NativeLong.SIZE == 8) {
            setLong(j, nativeLong.value);
        } else {
            setInt(j, (int) nativeLong.value);
        }
    }

    public void setString(long j, WString wString) {
        setWideString(j, wString == null ? null : wString.toString());
    }

    public void setValue(long j, Object obj, Class<?> cls) {
        Pointer functionPointer;
        int iA0F = 0;
        iA0F = 0;
        if (cls == Boolean.TYPE || cls == Boolean.class) {
            if (Boolean.TRUE.equals(obj)) {
                iA0F = -1;
            }
        } else {
            if (cls == Byte.TYPE || cls == Byte.class) {
                setByte(j, obj != null ? ((Number) obj).byteValue() : (byte) 0);
                return;
            }
            if (cls == Short.TYPE || cls == Short.class) {
                setShort(j, obj != null ? ((Number) obj).shortValue() : (short) 0);
                return;
            }
            if (cls == Character.TYPE || cls == Character.class) {
                setChar(j, obj != null ? ((Character) obj).charValue() : (char) 0);
                return;
            }
            if (cls != Integer.TYPE && cls != Integer.class) {
                if (cls == Long.TYPE || cls == Long.class) {
                    setLong(j, obj == null ? 0L : C3cG.A05(obj));
                    return;
                }
                if (cls == Float.TYPE || cls == Float.class) {
                    setFloat(j, obj == null ? 0.0f : AnonymousClass001.A02(obj));
                    return;
                }
                if (cls == Double.TYPE || cls == Double.class) {
                    setDouble(j, obj == null ? 0.0d : BV6.A00(obj));
                    return;
                }
                if (cls == Pointer.class || cls == String.class || cls == WString.class) {
                    functionPointer = (Pointer) obj;
                } else {
                    if (BV6.A1X(cls)) {
                        Structure structure = (Structure) obj;
                        if (!Structure.ByReference.class.isAssignableFrom(cls)) {
                            structure.useMemory(this, (int) j, true);
                            structure.write();
                            return;
                        } else {
                            setPointer(j, structure != null ? structure.getPointer() : null);
                            if (structure != null) {
                                structure.autoWrite();
                                return;
                            }
                            return;
                        }
                    }
                    if (!Callback.class.isAssignableFrom(cls)) {
                        if (Platform.HAS_BUFFERS && Buffer.class.isAssignableFrom(cls)) {
                            setPointer(j, obj != null ? Native.getDirectBufferPointer((Buffer) obj) : null);
                            return;
                        }
                        if (NativeMapped.class.isAssignableFrom(cls)) {
                            NativeMappedConverter nativeMappedConverter = NativeMappedConverter.getInstance(cls);
                            setValue(j, nativeMappedConverter.toNative(obj, new ToNativeContext()), nativeMappedConverter.nativeType());
                            return;
                        } else {
                            if (!cls.isArray()) {
                                throw C8j3.A0w(" to memory is not supported", C3cG.A0f(cls, "Writing "));
                            }
                            writeArray(j, obj, cls.getComponentType());
                            return;
                        }
                    }
                    functionPointer = CallbackReference.getFunctionPointer((Callback) obj, false);
                }
                setPointer(j, functionPointer);
                return;
            }
            if (obj != null) {
                iA0F = AnonymousClass001.A0F(obj);
            }
        }
        setInt(j, iA0F);
    }

    public Pointer share(long j) {
        return share(j, 0L);
    }

    public String toString() {
        return FGI.A0M("native@0x", Long.toHexString(this.peer));
    }

    public Pointer(long j) {
        this.peer = j;
    }

    public static final Pointer createConstant(int i) {
        return new Opaque(BV4.A03(i));
    }

    public static long nativeValue(Pointer pointer) {
        return BV7.A0V(pointer);
    }

    public Pointer[] getPointerArray(long j) {
        ArrayList arrayListA0h = C3cG.A0h();
        Pointer pointer = getPointer(j);
        int i = 0;
        while (pointer != null) {
            arrayListA0h.add(pointer);
            i += Native.POINTER_SIZE;
            pointer = getPointer(i + j);
        }
        return (Pointer[]) arrayListA0h.toArray(new Pointer[0]);
    }

    public String getString(long j) {
        return getString(j, Native.getDefaultStringEncoding());
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x00e5, code lost:
    
        if (r0.equals(r1) != false) goto L82;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object getValue(long r5, java.lang.Class<?> r7, java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.jna.Pointer.getValue(long, java.lang.Class, java.lang.Object):java.lang.Object");
    }

    public Pointer() {
    }

    public static final Pointer createConstant(long j) {
        return new Opaque(j);
    }

    public static void nativeValue(Pointer pointer, long j) {
        pointer.peer = j;
    }

    public Pointer[] getPointerArray(long j, int i) {
        Pointer[] pointerArr = new Pointer[i];
        read(j, pointerArr, 0, i);
        return pointerArr;
    }

    public String getString(long j, String str) {
        return Native.getString(this, j, str);
    }

    public String[] getStringArray(long j, int i, String str) {
        String string;
        String string2;
        ArrayList arrayListA0h = C3cG.A0h();
        if (i != -1) {
            Pointer pointer = getPointer(j);
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= i) {
                    break;
                }
                if (pointer == null) {
                    string2 = null;
                } else if (NativeString.WIDE_STRING.equals(str)) {
                    string2 = pointer.getWideString(0L);
                } else {
                    string2 = pointer.getString(0L, str);
                }
                arrayListA0h.add(string2);
                if (i4 < i) {
                    i3 += Native.POINTER_SIZE;
                    pointer = getPointer(i3 + j);
                }
                i2 = i4;
            }
        } else {
            int i5 = 0;
            while (true) {
                Pointer pointer2 = getPointer(i5 + j);
                if (pointer2 == null) {
                    break;
                }
                if (NativeString.WIDE_STRING.equals(str)) {
                    string = pointer2.getWideString(0L);
                } else {
                    string = pointer2.getString(0L, str);
                }
                arrayListA0h.add(string);
                i5 += Native.POINTER_SIZE;
            }
        }
        return BV5.A1b(arrayListA0h, 0);
    }

    public String[] getWideStringArray(long j, int i) {
        return getStringArray(j, i, NativeString.WIDE_STRING);
    }

    public void read(long j, byte[] bArr, int i, int i2) {
        Native.read(this, this.peer, j, bArr, i, i2);
    }

    public void setString(long j, String str, String str2) {
        byte[] bytes = str.getBytes(Native.getCharset(str2));
        int length = bytes.length;
        write(j, bytes, 0, length);
        setByte(length + j, (byte) 0);
    }

    public Pointer share(long j, long j2) {
        if (j == 0) {
            return this;
        }
        return new Pointer(this.peer + j);
    }

    public void write(long j, byte[] bArr, int i, int i2) {
        Native.write(this, this.peer, j, bArr, i, i2);
    }

    public String[] getStringArray(long j, int i) {
        return getStringArray(j, i, Native.getDefaultStringEncoding());
    }

    public void read(long j, char[] cArr, int i, int i2) {
        Native.read(this, this.peer, j, cArr, i, i2);
    }

    public void setString(long j, String str) {
        setString(j, str, Native.getDefaultStringEncoding());
    }

    public void write(long j, char[] cArr, int i, int i2) {
        Native.write(this, this.peer, j, cArr, i, i2);
    }

    public String[] getStringArray(long j, String str) {
        return getStringArray(j, -1, str);
    }

    public void read(long j, short[] sArr, int i, int i2) {
        Native.read(this, this.peer, j, sArr, i, i2);
    }

    public void write(long j, short[] sArr, int i, int i2) {
        Native.write(this, this.peer, j, sArr, i, i2);
    }

    public void read(long j, double[] dArr, int i, int i2) {
        Native.read(this, this.peer, j, dArr, i, i2);
    }

    public void write(long j, double[] dArr, int i, int i2) {
        Native.write(this, this.peer, j, dArr, i, i2);
    }

    public void read(long j, float[] fArr, int i, int i2) {
        Native.read(this, this.peer, j, fArr, i, i2);
    }

    public void write(long j, float[] fArr, int i, int i2) {
        Native.write(this, this.peer, j, fArr, i, i2);
    }

    public void read(long j, int[] iArr, int i, int i2) {
        Native.read(this, this.peer, j, iArr, i, i2);
    }

    public void write(long j, int[] iArr, int i, int i2) {
        Native.write(this, this.peer, j, iArr, i, i2);
    }

    public void read(long j, long[] jArr, int i, int i2) {
        Native.read(this, this.peer, j, jArr, i, i2);
    }

    public void write(long j, long[] jArr, int i, int i2) {
        Native.write(this, this.peer, j, jArr, i, i2);
    }
}

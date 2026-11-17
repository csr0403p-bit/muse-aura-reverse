package com.sun.jna;

/* loaded from: classes5.dex */
public class NativeLong extends IntegerType {
    public static final int SIZE = Native.LONG_SIZE;
    public static final long serialVersionUID = 1;

    public NativeLong(long j) {
        this(j, false);
    }

    public NativeLong(long j, boolean z) {
        super(SIZE, j, z);
    }

    public NativeLong() {
        this(0L, false);
    }
}

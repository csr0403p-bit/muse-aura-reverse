package com.sun.jna;

import X.BV4;

/* loaded from: classes5.dex */
public class NativeString implements CharSequence, Comparable {
    public static final String WIDE_STRING = "--WIDE-STRING--";
    public String encoding;
    public Pointer pointer;

    public class StringMemory extends Memory {
        public StringMemory(long j) {
            super(j);
        }

        @Override // com.sun.jna.Memory, com.sun.jna.Pointer
        public String toString() {
            return NativeString.this.toString();
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (obj == null) {
            return 1;
        }
        return toString().compareTo(obj.toString());
    }

    public boolean equals(Object obj) {
        return (obj instanceof CharSequence) && compareTo(obj) == 0;
    }

    public Pointer getPointer() {
        return this.pointer;
    }

    @Override // java.lang.CharSequence
    public String toString() {
        String str = this.encoding;
        boolean zEquals = WIDE_STRING.equals(str);
        Pointer pointer = this.pointer;
        return zEquals ? pointer.getWideString(0L) : pointer.getString(0L, str);
    }

    public NativeString(WString wString) {
        this(wString.toString(), WIDE_STRING);
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return toString().charAt(i);
    }

    public int hashCode() {
        return toString().hashCode();
    }

    @Override // java.lang.CharSequence
    public int length() {
        return toString().length();
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return toString().subSequence(i, i2);
    }

    public NativeString(String str, String str2) {
        if (str != null) {
            this.encoding = str2;
            if (WIDE_STRING.equals(str2)) {
                StringMemory stringMemory = new StringMemory((str.length() + 1) * Native.WCHAR_SIZE);
                this.pointer = stringMemory;
                stringMemory.setWideString(0L, str);
                return;
            } else {
                byte[] bytes = str.getBytes(Native.getCharset(str2));
                int length = bytes.length;
                StringMemory stringMemory2 = new StringMemory(length + 1);
                this.pointer = stringMemory2;
                stringMemory2.write(0L, bytes, 0, length);
                this.pointer.setByte(length, (byte) 0);
                return;
            }
        }
        throw BV4.A0a("String must not be null");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NativeString(String str, boolean z) {
        String defaultStringEncoding;
        if (z) {
            defaultStringEncoding = WIDE_STRING;
        } else {
            defaultStringEncoding = Native.getDefaultStringEncoding();
        }
        this(str, defaultStringEncoding);
    }

    public NativeString(String str) {
        this(str, Native.getDefaultStringEncoding());
    }
}

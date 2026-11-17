package com.sun.jna;

import X.C3cG;
import X.C8j3;
import com.sun.jna.Function;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes5.dex */
public class StringArray extends Memory implements Function.PostCallRead {
    public String encoding;
    public List<NativeString> natives;
    public Object[] original;

    public StringArray(WString[] wStringArr) {
        this(wStringArr, NativeString.WIDE_STRING);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.sun.jna.WString] */
    @Override // com.sun.jna.Function.PostCallRead
    public void read() {
        String wideString;
        Object[] objArr = this.original;
        boolean z = objArr instanceof WString[];
        boolean zEquals = NativeString.WIDE_STRING.equals(this.encoding);
        for (int i = 0; i < objArr.length; i++) {
            Pointer pointer = getPointer(Native.POINTER_SIZE * i);
            if (pointer != null) {
                wideString = zEquals ? pointer.getWideString(0L) : pointer.getString(0L, this.encoding);
                if (z) {
                    wideString = new WString(wideString);
                }
            } else {
                wideString = null;
            }
            objArr = this.original;
            objArr[i] = wideString;
        }
    }

    @Override // com.sun.jna.Memory, com.sun.jna.Pointer
    public String toString() {
        return C8j3.A14(Arrays.asList(this.original), C3cG.A0g(NativeString.WIDE_STRING.equals(this.encoding) ? "const wchar_t*[]" : "const char*[]"));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public StringArray(Object[] objArr, String str) {
        int length = objArr.length;
        int i = Native.POINTER_SIZE;
        super((length + 1) * i);
        this.natives = C3cG.A0h();
        this.original = objArr;
        this.encoding = str;
        int i2 = 0;
        while (true) {
            Pointer pointer = null;
            if (i2 < length) {
                if (objArr[i2] != null) {
                    NativeString nativeString = new NativeString(objArr[i2].toString(), str);
                    this.natives.add(nativeString);
                    pointer = nativeString.pointer;
                }
                setPointer(i * i2, pointer);
                i2++;
            } else {
                setPointer(i * length, null);
                return;
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public StringArray(String[] strArr, boolean z) {
        String defaultStringEncoding;
        if (z) {
            defaultStringEncoding = NativeString.WIDE_STRING;
        } else {
            defaultStringEncoding = Native.getDefaultStringEncoding();
        }
        this((Object[]) strArr, defaultStringEncoding);
    }

    public StringArray(String[] strArr, String str) {
        this((Object[]) strArr, str);
    }

    public StringArray(String[] strArr) {
        this(strArr, false);
    }
}

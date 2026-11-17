package com.facebook.aura.app.noopbindings.foa;

import X.C7384Etj;
import X.InterfaceC7542F0w;

/* loaded from: classes5.dex */
public final class NoOpSharedPrefsProvider {
    public static final NoOpSharedPrefsProvider INSTANCE = new NoOpSharedPrefsProvider();

    public String getString(InterfaceC7542F0w interfaceC7542F0w, String str, String str2) {
        C7384Etj.A0Y(str2, 2);
        return str2;
    }

    public boolean contains(InterfaceC7542F0w interfaceC7542F0w, String str) {
        return false;
    }

    public void remove(InterfaceC7542F0w interfaceC7542F0w, String str) {
    }

    public boolean getBoolean(InterfaceC7542F0w interfaceC7542F0w, String str, boolean z) {
        return z;
    }

    public double getDouble(InterfaceC7542F0w interfaceC7542F0w, String str, double d) {
        return d;
    }

    public float getFloat(InterfaceC7542F0w interfaceC7542F0w, String str, float f) {
        return f;
    }

    public int getInt(InterfaceC7542F0w interfaceC7542F0w, String str, int i) {
        return i;
    }

    public long getLong(InterfaceC7542F0w interfaceC7542F0w, String str, long j) {
        return j;
    }

    public void putBoolean(InterfaceC7542F0w interfaceC7542F0w, String str, boolean z) {
    }

    public void putDouble(InterfaceC7542F0w interfaceC7542F0w, String str, double d) {
    }

    public void putFloat(InterfaceC7542F0w interfaceC7542F0w, String str, float f) {
    }

    public void putInt(InterfaceC7542F0w interfaceC7542F0w, String str, int i) {
    }

    public void putLong(InterfaceC7542F0w interfaceC7542F0w, String str, long j) {
    }

    public void putString(InterfaceC7542F0w interfaceC7542F0w, String str, String str2) {
    }
}

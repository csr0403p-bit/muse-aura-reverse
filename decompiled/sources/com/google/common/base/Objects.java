package com.google.common.base;

/* loaded from: classes5.dex */
public abstract class Objects extends ExtraObjectsMethodsForWeb {
    public static boolean equal(Object a, Object b) {
        if (a != b) {
            return a != null && a.equals(b);
        }
        return true;
    }
}

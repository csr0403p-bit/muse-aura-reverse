package X;

import java.util.Arrays;

/* renamed from: X.A6r, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0867A6r {
    public static final String A00(Object obj) {
        Class<?> cls = obj.getClass();
        return FGI.A0O(cls.isAnonymousClass() ? cls.getName() : cls.getSimpleName(), String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1)), '@');
    }
}

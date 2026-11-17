package X;

import com.google.firebase.components.DependencyException;
import java.util.Set;

/* loaded from: classes5.dex */
public abstract class CUL {
    public <T> CUK<T> A04(Class<T> cls) {
        CUP cup = (CUP) this;
        if (cup.A01.contains(cls)) {
            return cup.A00.A04(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<%s>.", cls));
    }

    public <T> CUK<Set<T>> A05(Class<T> cls) {
        CUP cup = (CUP) this;
        if (cup.A02.contains(cls)) {
            return cup.A00.A05(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", cls));
    }

    public <T> T A02(Class<T> cls) {
        CUK<T> cukA04 = A04(cls);
        if (cukA04 == null) {
            return null;
        }
        return cukA04.get();
    }

    public <T> Set<T> A03(Class<T> cls) {
        return A05(cls).get();
    }
}

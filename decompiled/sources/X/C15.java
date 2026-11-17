package X;

import java.io.File;
import java.util.Comparator;

/* loaded from: classes5.dex */
public final class C15<T> implements Comparator {
    public static final C15<T> A00 = new C15<>();

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        long jLastModified = ((File) obj).lastModified();
        long jLastModified2 = ((File) obj2).lastModified();
        if (jLastModified < jLastModified2) {
            return -1;
        }
        return C8j3.A1S((jLastModified > jLastModified2 ? 1 : (jLastModified == jLastModified2 ? 0 : -1))) ? 1 : 0;
    }
}

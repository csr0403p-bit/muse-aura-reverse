package X;

import java.util.Random;

/* loaded from: classes5.dex */
public final class CU6 extends ThreadLocal<Random> {
    @Override // java.lang.ThreadLocal
    public final /* bridge */ /* synthetic */ Random initialValue() {
        return new Random();
    }
}

package X;

import androidx.savedstate.SavedStateRegistry;

/* loaded from: classes4.dex */
public abstract class A6W {
    public static final void A00(F2N f2n, SavedStateRegistry savedStateRegistry) throws NoSuchMethodException, SecurityException {
        EnumC10573Huf enumC10573Huf = ((C5303Dfm) f2n).A01;
        if (enumC10573Huf == EnumC10573Huf.A04 || enumC10573Huf.A00(EnumC10573Huf.A06)) {
            savedStateRegistry.A02();
        } else {
            f2n.A04(new C8940Ftw(2, savedStateRegistry, f2n));
        }
    }
}

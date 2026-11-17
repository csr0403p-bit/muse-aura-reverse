package X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class A6H {
    public static final BNw<A6I> A01 = new BSV(0);
    public static final BNw<BOD> A02 = new BSV(1);
    public static final BNw<Bundle> A00 = new BSV(2);

    public static final A6N A00(A6J a6j) {
        A6E a6e;
        HxE[] hxEArrA1b;
        A6I a6i = (A6I) a6j.A00(A01);
        if (a6i == null) {
            throw C60O.A0i("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        BOD bod = (BOD) a6j.A00(A02);
        if (bod == null) {
            throw C60O.A0i("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) a6j.A00(A00);
        String str = (String) a6j.A00(BON.A01);
        if (str == null) {
            throw C60O.A0i("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        A6F a6fA01 = a6i.getSavedStateRegistry().A01("androidx.lifecycle.internal.SavedStateHandlesProvider");
        if (!(a6fA01 instanceof A6E) || (a6e = (A6E) a6fA01) == null) {
            throw C3cG.A0Q("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        Map<String, A6N> map = A01(bod).A00;
        A6N a6n = map.get(str);
        if (a6n != null) {
            return a6n;
        }
        a6e.A00();
        Bundle bundle2 = a6e.A00;
        Bundle bundle3 = null;
        if (bundle2 != null && bundle2.containsKey(str)) {
            Bundle bundle4 = bundle2.getBundle(str);
            if (bundle4 == null) {
                C9jH c9jH = C9jH.A00;
                if (c9jH.isEmpty()) {
                    hxEArrA1b = new HxE[0];
                } else {
                    ArrayList arrayListA1A = C8j3.A1A(c9jH);
                    Iterator itA1B = C8j3.A1B(c9jH);
                    while (itA1B.hasNext()) {
                        C8j5.A0q(arrayListA1A, itA1B);
                    }
                    hxEArrA1b = C8j3.A1b(arrayListA1A);
                }
                bundle4 = AbstractC0849A5g.A00(hxEArrA1b);
            }
            bundle2.remove(str);
            if (bundle2.isEmpty()) {
                a6e.A00 = null;
            }
            bundle3 = bundle4;
        }
        A6N a6nA00 = A6N.A00(bundle3, bundle);
        map.put(str, a6nA00);
        return a6nA00;
    }

    public static final C08459uk A01(BOD bod) {
        InterfaceC08439ui interfaceC08439ui = new InterfaceC08439ui() { // from class: X.9uj
            @Override // X.InterfaceC08439ui
            public final /* synthetic */ AEs create(Class cls) {
                throw C8j3.A18("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
            }

            @Override // X.InterfaceC08439ui
            public final <T extends AEs> T create(C9uG<T> c9uG, A6J a6j) {
                return new C08459uk();
            }

            @Override // X.InterfaceC08439ui
            public final /* synthetic */ AEs create(Class cls, A6J a6j) {
                return InterfaceC08439ui.A00(this, cls);
            }
        };
        A6J defaultViewModelCreationExtras = bod instanceof BRk ? ((BRk) bod).getDefaultViewModelCreationExtras() : A6K.A00;
        C7384Etj.A0Y(defaultViewModelCreationExtras, 2);
        return (C08459uk) new BON(interfaceC08439ui, bod.getViewModelStore(), defaultViewModelCreationExtras).A00.A00("androidx.lifecycle.internal.SavedStateHandlesVM", C3cG.A0x(C08459uk.class));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends A6I & BOD> void A02(T t) {
        EnumC10573Huf enumC10573HufA0m = C8j3.A0m(t);
        if (enumC10573HufA0m != EnumC10573Huf.A04 && enumC10573HufA0m != EnumC10573Huf.A02) {
            throw C60O.A0i("Failed requirement.");
        }
        if (t.getSavedStateRegistry().A01("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            A6E a6e = new A6E(t, t.getSavedStateRegistry());
            t.getSavedStateRegistry().A03(a6e, "androidx.lifecycle.internal.SavedStateHandlesProvider");
            t.getLifecycle().A04(new A6G(a6e));
        }
    }
}

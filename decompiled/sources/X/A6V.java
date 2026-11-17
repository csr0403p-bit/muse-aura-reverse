package X;

import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public final class A6V implements Dg3 {
    public final A6I A00;

    @Override // X.Dg3
    public final void onStateChanged(C1HY c1hy, EnumC3085Bxl enumC3085Bxl) throws NoSuchMethodException, SecurityException {
        boolean zA1a = AnonymousClass002.A1a(c1hy, enumC3085Bxl);
        if (enumC3085Bxl != EnumC3085Bxl.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        c1hy.getLifecycle().A05(this);
        A6I a6i = this.A00;
        Bundle bundleA00 = a6i.getSavedStateRegistry().A00("androidx.savedstate.Restarter");
        if (bundleA00 != null) {
            ArrayList<String> stringArrayList = bundleA00.getStringArrayList("classes_to_restore");
            if (stringArrayList == null) {
                throw C3cG.A0Q("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                try {
                    Class<? extends U> clsAsSubclass = Class.forName(next, false, A6V.class.getClassLoader()).asSubclass(A6U.class);
                    C7384Etj.A0X(clsAsSubclass);
                    try {
                        Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                        declaredConstructor.setAccessible(zA1a);
                        try {
                            C7384Etj.A0X(declaredConstructor.newInstance(null));
                            if (!(a6i instanceof BOD)) {
                                throw C3cG.A0Q(AnonymousClass007.A0a("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: ", a6i));
                            }
                            BJt viewModelStore = ((BOD) a6i).getViewModelStore();
                            SavedStateRegistry savedStateRegistry = a6i.getSavedStateRegistry();
                            Map<String, AEs> map = viewModelStore.A00;
                            Iterator it2 = new HashSet(map.keySet()).iterator();
                            while (it2.hasNext()) {
                                Object next2 = it2.next();
                                C7384Etj.A0Y(next2, 0);
                                AEs aEs = map.get(next2);
                                if (aEs != null) {
                                    F2N lifecycle = a6i.getLifecycle();
                                    C7384Etj.A0Y(savedStateRegistry, zA1a ? 1 : 0);
                                    C7384Etj.A0Y(lifecycle, 2);
                                    A6L a6l = (A6L) aEs.getCloseable("androidx.lifecycle.savedstate.vm.tag");
                                    if (a6l != null && !a6l.A00) {
                                        a6l.A00(lifecycle, savedStateRegistry);
                                        A6W.A00(lifecycle, savedStateRegistry);
                                    }
                                }
                            }
                            if (!new HashSet(map.keySet()).isEmpty()) {
                                savedStateRegistry.A02();
                            }
                        } catch (Exception e) {
                            throw new RuntimeException(FGI.A0M("Failed to instantiate ", next), e);
                        }
                    } catch (NoSuchMethodException e2) {
                        throw new IllegalStateException(FGI.A0U("Class ", clsAsSubclass.getSimpleName(), " must have default constructor in order to be automatically recreated"), e2);
                    }
                } catch (ClassNotFoundException e3) {
                    throw new RuntimeException(FGI.A0U("Class ", next, " wasn't found"), e3);
                }
            }
        }
    }

    public A6V(A6I a6i) {
        this.A00 = a6i;
    }
}

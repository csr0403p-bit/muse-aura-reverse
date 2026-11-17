package com.facebook.aura.navigation;

import X.A6K;
import X.AnonymousClass001;
import X.BFM;
import X.BJt;
import X.BOD;
import X.BON;
import X.C0861A6i;
import X.C3cG;
import X.C5rr;
import X.C5wL;
import X.C7384Etj;
import X.C78N;
import X.FGI;
import X.InterfaceC08439ui;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public abstract class SharedViewModelStoreNavEntryDecoratorKt {
    public static final <T> SharedViewModelStoreNavEntryDecorator<T> rememberSharedViewModelStoreNavEntryDecorator(BOD bod, BFM bfm, int i, int i2) {
        boolean z = true;
        if ((i2 & 1) != 0 && (bod = C5wL.A00(bfm)) == null) {
            throw AnonymousClass001.A0o();
        }
        if ((((i & 14) ^ 6) <= 4 || !bfm.A65(bod)) && (i & 6) != 4) {
            z = false;
        }
        Object objAaT = bfm.AaT();
        if (z || objAaT == C78N.A00) {
            objAaT = new SharedViewModelStoreNavEntryDecorator(bod.getViewModelStore());
            bfm.Ai0(objAaT);
        }
        return (SharedViewModelStoreNavEntryDecorator) objAaT;
    }

    public static final EntryViewModel getEntryViewModel(BJt bJt) {
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        SharedViewModelStoreNavEntryDecoratorKt$getEntryViewModel$provider$1$1 sharedViewModelStoreNavEntryDecoratorKt$getEntryViewModel$provider$1$1 = SharedViewModelStoreNavEntryDecoratorKt$getEntryViewModel$provider$1$1.INSTANCE;
        C0861A6i c0861A6iA0x = C3cG.A0x(EntryViewModel.class);
        C7384Etj.A0Y(sharedViewModelStoreNavEntryDecoratorKt$getEntryViewModel$provider$1$1, 1);
        if (linkedHashMapA0j.containsKey(c0861A6iA0x)) {
            throw new IllegalArgumentException(FGI.A0N("A `initializer` with the same `clazz` has already been added: ", C0861A6i.A00(c0861A6iA0x.A00), '.'));
        }
        linkedHashMapA0j.put(c0861A6iA0x, new C5rr(sharedViewModelStoreNavEntryDecoratorKt$getEntryViewModel$provider$1$1, c0861A6iA0x));
        Collection collectionValues = linkedHashMapA0j.values();
        C7384Etj.A0Y(collectionValues, 0);
        C5rr[] c5rrArr = (C5rr[]) collectionValues.toArray(new C5rr[0]);
        final C5rr[] c5rrArr2 = (C5rr[]) Arrays.copyOf(c5rrArr, c5rrArr.length);
        return (EntryViewModel) BON.A00(new InterfaceC08439ui(c5rrArr2) { // from class: X.5rq
            public final C5rr<?>[] A00;

            {
                C7384Etj.A0Y(c5rrArr2, 0);
                this.A00 = c5rrArr2;
            }

            @Override // X.InterfaceC08439ui
            public final /* synthetic */ AEs create(Class cls) {
                throw new UnsupportedOperationException(C8j2.A00(62));
            }

            @Override // X.InterfaceC08439ui
            public final <VM extends AEs> VM create(Class<VM> cls, A6J a6j) {
                AnonymousClass003.A0u(cls, a6j);
                C0861A6i c0861A6iA0x2 = C3cG.A0x(cls);
                C5rr<?>[] c5rrArr3 = this.A00;
                C5rr[] c5rrArr4 = (C5rr[]) Arrays.copyOf(c5rrArr3, c5rrArr3.length);
                C7384Etj.A0Y(c5rrArr4, 2);
                int length = c5rrArr4.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    C5rr c5rr = c5rrArr4[i];
                    if (c5rr.A01.equals(c0861A6iA0x2)) {
                        VM vm = (VM) c5rr.A00.invoke(a6j);
                        if (vm != null) {
                            return vm;
                        }
                    } else {
                        i++;
                    }
                }
                throw new IllegalArgumentException(FGI.A0M("No initializer set for given class ", C0861A6i.A00(c0861A6iA0x2.A00)));
            }

            @Override // X.InterfaceC08439ui
            public final /* synthetic */ AEs create(C9uG c9uG, A6J a6j) {
                return AbstractC08429uh.A00(this, a6j, c9uG);
            }
        }, bJt, A6K.A00).A02(C3cG.A0x(EntryViewModel.class));
    }
}

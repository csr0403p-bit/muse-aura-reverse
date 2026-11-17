package X;

import android.app.Application;
import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry;
import java.lang.reflect.Constructor;
import java.util.List;

/* loaded from: classes4.dex */
public final class A6X extends AbstractC0859A6g implements InterfaceC08439ui {
    public F2N A00;
    public SavedStateRegistry A01;
    public Application A02;
    public Bundle A03;
    public final InterfaceC08439ui A04;

    @Override // X.InterfaceC08439ui
    public final <T extends AEs> T create(Class<T> cls) {
        C7384Etj.A0Y(cls, 0);
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) A00(cls, canonicalName);
        }
        throw C60O.A0i("Local and anonymous classes can not be ViewModels");
    }

    /* JADX WARN: Incorrect types in method signature: <T:LX/AEs;>(Ljava/lang/String;Ljava/lang/Class<TT;>;)TT; */
    private final AEs A00(Class cls, String str) throws NoSuchMethodException, SecurityException {
        Application application;
        F2N f2n = this.A00;
        if (f2n == null) {
            throw C8j3.A18("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = AbstractC0858A6f.class.isAssignableFrom(cls);
        Constructor constructorA01 = A6Z.A01(cls, (!zIsAssignableFrom || this.A02 == null) ? A6Z.A01 : A6Z.A00);
        if (constructorA01 == null) {
            if (this.A02 != null) {
                return this.A04.create(cls);
            }
            BG0 bg0 = BG0.A00;
            if (bg0 == null) {
                bg0 = new BG0();
                BG0.A00 = bg0;
            }
            C7384Etj.A0X(bg0);
            return bg0.create(cls);
        }
        SavedStateRegistry savedStateRegistry = this.A01;
        C7384Etj.A0X(savedStateRegistry);
        A6L a6l = new A6L(A6N.A00(savedStateRegistry.A00(str), this.A03), str);
        a6l.A00(f2n, savedStateRegistry);
        A6W.A00(f2n, savedStateRegistry);
        AEs aEsA00 = A6Z.A00(cls, constructorA01, (!zIsAssignableFrom || (application = this.A02) == null) ? new Object[]{a6l.A01} : new Object[]{application, a6l.A01});
        aEsA00.addCloseable("androidx.lifecycle.savedstate.vm.tag", a6l);
        return aEsA00;
    }

    public A6X(Application application, Bundle bundle, A6I a6i) {
        A6Y a6y;
        this.A01 = a6i.getSavedStateRegistry();
        this.A00 = a6i.getLifecycle();
        this.A03 = bundle;
        this.A02 = application;
        if (application != null) {
            a6y = A6Y.A01;
            if (a6y == null) {
                a6y = new A6Y(application);
                A6Y.A01 = a6y;
            }
            C7384Etj.A0X(a6y);
        } else {
            a6y = new A6Y();
        }
        this.A04 = a6y;
    }

    public A6X() {
        this.A04 = new A6Y();
    }

    @Override // X.InterfaceC08439ui
    public final <T extends AEs> T create(Class<T> cls, A6J a6j) {
        List<Class<?>> list;
        Object[] objArr;
        AnonymousClass003.A0u(cls, a6j);
        String str = (String) a6j.A00(BON.A01);
        if (str != null) {
            if (a6j.A00(A6H.A01) != null && a6j.A00(A6H.A02) != null) {
                Object objA00 = a6j.A00(A6Y.A02);
                boolean zIsAssignableFrom = AbstractC0858A6f.class.isAssignableFrom(cls);
                if (zIsAssignableFrom && objA00 != null) {
                    list = A6Z.A00;
                } else {
                    list = A6Z.A01;
                }
                Constructor constructorA01 = A6Z.A01(cls, list);
                if (constructorA01 == null) {
                    return (T) this.A04.create(cls, a6j);
                }
                if (zIsAssignableFrom && objA00 != null) {
                    objArr = new Object[]{objA00, A6H.A00(a6j)};
                } else {
                    objArr = new Object[]{A6H.A00(a6j)};
                }
                return (T) A6Z.A00(cls, constructorA01, objArr);
            }
            if (this.A00 != null) {
                return (T) A00(cls, str);
            }
            throw C3cG.A0Q("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        throw C3cG.A0Q("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @Override // X.InterfaceC08439ui
    public final <T extends AEs> T create(C9uG<T> c9uG, A6J a6j) {
        AnonymousClass003.A0u(c9uG, a6j);
        return (T) create(C9uT.A01(c9uG), a6j);
    }
}

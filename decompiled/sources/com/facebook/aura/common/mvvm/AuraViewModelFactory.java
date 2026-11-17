package com.facebook.aura.common.mvvm;

import X.A6J;
import X.AEs;
import X.AbstractC08429uh;
import X.C7384Etj;
import X.C7500EyF;
import X.C9uG;
import X.InterfaceC08439ui;

/* loaded from: classes4.dex */
public abstract class AuraViewModelFactory<Model extends AEs> implements InterfaceC08439ui {
    @Override // X.InterfaceC08439ui
    public final <T extends AEs> T create(Class<T> cls) {
        T t = (T) create();
        C7384Etj.A0Z(t, "null cannot be cast to non-null type T of com.facebook.aura.common.mvvm.AuraViewModelFactory.create");
        return t;
    }

    @Override // X.InterfaceC08439ui
    public final <T extends AEs> T create(Class<T> cls, A6J a6j) {
        C7384Etj.A0Y(a6j, 1);
        T t = (T) create(a6j);
        C7384Etj.A0Z(t, "null cannot be cast to non-null type T of com.facebook.aura.common.mvvm.AuraViewModelFactory.create");
        return t;
    }

    public Model create(A6J a6j) {
        return (Model) create();
    }

    @Override // X.InterfaceC08439ui
    public /* bridge */ <T extends AEs> T create(C9uG<T> c9uG, A6J a6j) {
        return (T) AbstractC08429uh.A00(this, a6j, c9uG);
    }

    public Model create() {
        throw new C7500EyF("Must be implemented by subclass");
    }
}

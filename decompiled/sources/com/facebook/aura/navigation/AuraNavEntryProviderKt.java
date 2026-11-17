package com.facebook.aura.navigation;

import X.AEs;
import X.AKL;
import X.AKO;
import X.AnonymousClass000;
import X.BBI;
import X.BFM;
import X.BRk;
import X.C7384Etj;
import X.F60;
import X.InterfaceC08439ui;
import androidx.activity.ComponentActivity;

/* loaded from: classes4.dex */
public abstract class AuraNavEntryProviderKt {
    public static final /* synthetic */ <VM extends AEs> VM activityViewModel(InterfaceC08439ui interfaceC08439ui, String str, BFM bfm, int i, int i2) {
        Object objA07 = AKO.A07(AKL.A00, (BBI) bfm);
        C7384Etj.A0Z(objA07, AnonymousClass000.A00(6));
        ComponentActivity componentActivity = (ComponentActivity) objA07;
        if (componentActivity instanceof BRk) {
            componentActivity.getDefaultViewModelCreationExtras();
        }
        C7384Etj.A0Q();
        throw F60.createAndThrow();
    }
}

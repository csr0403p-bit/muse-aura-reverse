package com.facebook.aura.bloks;

import X.AbstractC6813EaR;
import X.C60O;
import X.C6808EaM;
import X.C6979Edd;
import X.C6980Edg;
import X.C6982Edi;
import X.C7109EgN;
import X.C7384Etj;
import X.C7863FHz;
import X.EES;
import X.FNQ;
import X.FP4;
import X.InterfaceC6814EaS;
import android.content.Context;
import com.facebook.aura.bloks.cds.AuraCdsThemeResolver;
import com.facebook.aura.bloks.data.AuraDataFetchPropsCreator;

/* loaded from: classes5.dex */
public final class AuraBloksInitializer {
    public static final AuraBloksInitializer INSTANCE = new AuraBloksInitializer();

    public static final void initBloksLazy(Context context) {
        EES ees = new EES() { // from class: com.facebook.aura.bloks.AuraBloksInitializer.initBloksLazy.1
            @Override // X.EES
            public final C6979Edd get() {
                C7109EgN.A03().A06();
                FP4.A00 = new AuraCdsThemeResolver();
                C6982Edi c6982Edi = new C6982Edi();
                C00491<T> c00491 = new EES() { // from class: com.facebook.aura.bloks.AuraBloksInitializer.initBloksLazy.1.1
                    @Override // X.EES
                    public final FNQ get() {
                        return new FNQ(new AuraDataFetchPropsCreator());
                    }
                };
                C7384Etj.A0Y(c00491, 0);
                return new C6979Edd(new C7863FHz(C60O.A0g()), new C6980Edg(), c00491, new EES() { // from class: com.facebook.aura.bloks.AuraBloksInitializer.initBloksLazy.1.2
                    @Override // X.EES
                    public final AuraBloksNavigator get() {
                        return new AuraBloksNavigator();
                    }

                    @Override // X.EES
                    public /* bridge */ /* synthetic */ Object get() {
                        return new AuraBloksNavigator();
                    }
                }, c6982Edi);
            }
        };
        synchronized (C6979Edd.class) {
            C6979Edd.A06 = ees;
            AbstractC6813EaR.A00 = C6979Edd.A05;
            C6808EaM.A01 = new InterfaceC6814EaS() { // from class: X.Edb
                @Override // X.InterfaceC6814EaS
                public final void Ab2() {
                    Hx0.A01();
                }
            };
        }
    }

    private final void initFresco() {
        C7109EgN.A03().A06();
    }
}

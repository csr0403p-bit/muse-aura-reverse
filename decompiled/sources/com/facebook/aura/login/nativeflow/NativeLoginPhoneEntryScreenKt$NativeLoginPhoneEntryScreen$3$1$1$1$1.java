package com.facebook.aura.login.nativeflow;

import X.AKQ;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AxM;
import X.BBI;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C1515AkP;
import X.C1AC;
import X.C1Cd;
import X.C2VU;
import X.F60;
import X.G0U;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.components.phone.CountryDialCode;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class NativeLoginPhoneEntryScreenKt$NativeLoginPhoneEntryScreen$3$1$1$1$1 extends AbstractC7559F3s implements G0W<C1Cd, BFM, Integer, Unit> {
    public final /* synthetic */ boolean $isLoading;
    public final /* synthetic */ G0U<CountryDialCode, Unit> $onCountrySelected;
    public final /* synthetic */ CountryDialCode $selectedCountry;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NativeLoginPhoneEntryScreenKt$NativeLoginPhoneEntryScreen$3$1$1$1$1(CountryDialCode countryDialCode, G0U<? super CountryDialCode, Unit> g0u, boolean z) {
        super(3);
        this.$selectedCountry = countryDialCode;
        this.$onCountrySelected = g0u;
        this.$isLoading = z;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C1Cd c1Cd, BFM bfm, Integer num) {
        invoke(c1Cd, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(C1Cd c1Cd, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            C1AC c1ac = C2VU.A04;
            CountryDialCode countryDialCode = this.$selectedCountry;
            G0U<CountryDialCode, Unit> g0u = this.$onCountrySelected;
            boolean z = this.$isLoading;
            BS0 bs0 = BRg.A00;
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass002.A0W(bfm, c1ac);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bs0);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0W, akqA04, bRgA01, iA0J);
            NativeLoginCountryFieldKt.NativeLoginCountryField(countryDialCode, g0u, null, !z, bfm, 0, 4);
            C01N.A09(bfm, bs0, AuraDimensKt.SpacingSmall);
            BBI.A0R(bbi, true);
            return;
        }
        bfm.Afo();
    }
}

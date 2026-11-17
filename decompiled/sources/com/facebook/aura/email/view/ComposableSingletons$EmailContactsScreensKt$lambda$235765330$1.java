package com.facebook.aura.email.view;

import X.AKQ;
import X.AbstractC07539Wl;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AxM;
import X.BBI;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C1515AkP;
import X.C7384Etj;
import X.F60;
import X.G2j;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.email.viewmodel.EmailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ComposableSingletons$EmailContactsScreensKt$lambda$235765330$1 extends AbstractC7559F3s implements G2j<EmailViewModel, BRg, BFM, Integer, Unit> {
    public static final ComposableSingletons$EmailContactsScreensKt$lambda$235765330$1 INSTANCE = new ComposableSingletons$EmailContactsScreensKt$lambda$235765330$1();

    public ComposableSingletons$EmailContactsScreensKt$lambda$235765330$1() {
        super(4);
    }

    public final void invoke(EmailViewModel emailViewModel, BRg bRg, BFM bfm, int i) {
        C7384Etj.A0Y(bRg, 1);
        BRg bRgA00 = AbstractC07539Wl.A00(AnonymousClass005.A0T(bfm, AnonymousClass001.A0R(bRg)), "email-unknown-contacts");
        InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
        BBI bbi = (BBI) bfm;
        int iA0J = AnonymousClass003.A0J(bbi);
        AKQ akqA04 = BBI.A04(bbi);
        BRg bRgA01 = AxM.A01(bfm, bRgA00);
        Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
        if (bbi.A0V == null) {
            C00x.A00();
            throw F60.createAndThrow();
        }
        AnonymousClass005.A0n(bfm, bbi, function0);
        AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
        EmailSettingsComponentsKt.EmailNavHeader(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1209b6), null, false, bfm, 0, 6);
        EmailSettingsComponentsKt.EmailSettingsHelp(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1209b7), null, bfm, 0, 2);
        BBI.A0R(bbi, true);
    }

    @Override // X.G2j
    public /* bridge */ /* synthetic */ Unit invoke(EmailViewModel emailViewModel, BRg bRg, BFM bfm, Integer num) {
        invoke(emailViewModel, bRg, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}

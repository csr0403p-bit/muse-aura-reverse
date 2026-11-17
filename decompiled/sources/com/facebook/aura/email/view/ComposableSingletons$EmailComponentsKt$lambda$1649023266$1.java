package com.facebook.aura.email.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.BFM;
import X.BRg;
import X.G2j;
import com.facebook.aura.email.viewmodel.EmailError;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ComposableSingletons$EmailComponentsKt$lambda$1649023266$1 extends AbstractC7559F3s implements G2j<EmailError, BRg, BFM, Integer, Unit> {
    public static final ComposableSingletons$EmailComponentsKt$lambda$1649023266$1 INSTANCE = new ComposableSingletons$EmailComponentsKt$lambda$1649023266$1();

    public ComposableSingletons$EmailComponentsKt$lambda$1649023266$1() {
        super(4);
    }

    public final void invoke(EmailError emailError, BRg bRg, BFM bfm, int i) {
        boolean zA1b = AnonymousClass004.A1b(emailError, bRg);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, emailError) | i : i;
        if ((i & 48) == 0) {
            iA08 |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA08), bfm, iA08)) {
            EmailComponentsKt.EmailErrorMessage(emailError, bRg, bfm, iA08 & 126, zA1b ? 1 : 0);
        } else {
            bfm.Afo();
        }
    }

    @Override // X.G2j
    public /* bridge */ /* synthetic */ Unit invoke(EmailError emailError, BRg bRg, BFM bfm, Integer num) {
        invoke(emailError, bRg, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}

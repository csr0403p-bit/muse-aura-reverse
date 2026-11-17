package com.facebook.aura.email.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.C07C;
import X.C7384Etj;
import X.G0W;
import X.G2j;
import com.facebook.aura.email.viewmodel.EmailError;
import com.facebook.aura.email.viewmodel.EmailViewModel;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class EmailComponentsKt$EmailSettingsPage$5$3$1$1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
    public final /* synthetic */ G2j<C07C, EmailViewModel, BFM, Integer, Unit> $content;
    public final /* synthetic */ EmailViewModel $model;
    public final /* synthetic */ boolean $resetBlocked;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EmailComponentsKt$EmailSettingsPage$5$3$1$1(boolean z, G2j<? super C07C, ? super EmailViewModel, ? super BFM, ? super Integer, Unit> g2j, EmailViewModel emailViewModel) {
        super(3);
        this.$resetBlocked = z;
        this.$content = g2j;
        this.$model = emailViewModel;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
        invoke(c07c, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(C07C c07c, BFM bfm, int i) {
        C7384Etj.A0Y(c07c, 0);
        if ((i & 6) == 0) {
            i |= AnonymousClass004.A0d(bfm, c07c);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(i), bfm, i)) {
            if (this.$resetBlocked) {
                bfm.AgE(1376048594);
                EmailComponentsKt.EmailErrorMessage(EmailError.RESET_REQUIRED, null, bfm, 6, 2);
            } else {
                bfm.AgE(1376050164);
                AnonymousClass001.A1F(c07c, this.$model, bfm, this.$content, i & 14);
            }
            AnonymousClass001.A1D(bfm);
            return;
        }
        bfm.Afo();
    }
}

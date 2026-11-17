package com.facebook.aura.email.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.G0V;
import X.G0W;
import com.facebook.aura.email.viewmodel.EmailViewModel;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class EmailComponentsKt$EmailSheetEnvironment$1$1$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ G0W<EmailViewModel, BFM, Integer, Unit> $it;
    public final /* synthetic */ EmailViewModel $model;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EmailComponentsKt$EmailSheetEnvironment$1$1$1(G0W<? super EmailViewModel, ? super BFM, ? super Integer, Unit> g0w, EmailViewModel emailViewModel) {
        super(2);
        this.$it = g0w;
        this.$model = emailViewModel;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            AnonymousClass001.A1G(this.$model, bfm, this.$it, 0);
        } else {
            bfm.Afo();
        }
    }
}

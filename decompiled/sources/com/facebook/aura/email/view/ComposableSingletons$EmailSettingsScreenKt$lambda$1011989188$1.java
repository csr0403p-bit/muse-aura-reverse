package com.facebook.aura.email.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.BFM;
import X.G0W;
import com.facebook.aura.email.viewmodel.EmailViewModel;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ComposableSingletons$EmailSettingsScreenKt$lambda$1011989188$1 extends AbstractC7559F3s implements G0W<EmailViewModel, BFM, Integer, Unit> {
    public static final ComposableSingletons$EmailSettingsScreenKt$lambda$1011989188$1 INSTANCE = new ComposableSingletons$EmailSettingsScreenKt$lambda$1011989188$1();

    public ComposableSingletons$EmailSettingsScreenKt$lambda$1011989188$1() {
        super(3);
    }

    public final void invoke(EmailViewModel emailViewModel, BFM bfm, int i) {
        EmailSettingsScreenKt.EmailCreateButton(emailViewModel, null, bfm, AnonymousClass006.A0E(emailViewModel, i), 2);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(EmailViewModel emailViewModel, BFM bfm, Integer num) {
        invoke(emailViewModel, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}

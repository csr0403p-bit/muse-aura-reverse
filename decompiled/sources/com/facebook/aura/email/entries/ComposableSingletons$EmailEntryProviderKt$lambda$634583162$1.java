package com.facebook.aura.email.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.email.keys.EmailOwnerConfirmationKey;
import com.facebook.aura.email.view.EmailOwnerConfirmationScreenKt;
import kotlin.Unit;

/* renamed from: com.facebook.aura.email.entries.ComposableSingletons$EmailEntryProviderKt$lambda$-634583162$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$EmailEntryProviderKt$lambda$634583162$1 extends AbstractC7559F3s implements G0W<EmailOwnerConfirmationKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$EmailEntryProviderKt$lambda$634583162$1 INSTANCE = new ComposableSingletons$EmailEntryProviderKt$lambda$634583162$1();

    public ComposableSingletons$EmailEntryProviderKt$lambda$634583162$1() {
        super(3);
    }

    public final void invoke(EmailOwnerConfirmationKey emailOwnerConfirmationKey, BFM bfm, int i) {
        C7384Etj.A0Y(emailOwnerConfirmationKey, 0);
        EmailOwnerConfirmationScreenKt.EmailOwnerConfirmationScreen(emailOwnerConfirmationKey.environmentId, null, false, null, bfm, 0, 14);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(EmailOwnerConfirmationKey emailOwnerConfirmationKey, BFM bfm, Integer num) {
        invoke(emailOwnerConfirmationKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}

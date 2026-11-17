package com.facebook.aura.email.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.email.keys.EmailTrustedContactsKey;
import com.facebook.aura.email.view.EmailContactsScreensKt;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class ComposableSingletons$EmailEntryProviderKt$lambda$1461687749$1 extends AbstractC7559F3s implements G0W<EmailTrustedContactsKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$EmailEntryProviderKt$lambda$1461687749$1 INSTANCE = new ComposableSingletons$EmailEntryProviderKt$lambda$1461687749$1();

    public ComposableSingletons$EmailEntryProviderKt$lambda$1461687749$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(EmailTrustedContactsKey emailTrustedContactsKey, BFM bfm, Integer num) {
        invoke(emailTrustedContactsKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(EmailTrustedContactsKey emailTrustedContactsKey, BFM bfm, int i) {
        C7384Etj.A0Y(emailTrustedContactsKey, 0);
        EmailContactsScreensKt.EmailTrustedContactsScreen(emailTrustedContactsKey.environmentId, null, bfm, 0, 2);
    }
}

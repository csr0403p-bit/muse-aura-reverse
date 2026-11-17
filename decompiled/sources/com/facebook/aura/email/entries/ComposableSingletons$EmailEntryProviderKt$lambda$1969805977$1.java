package com.facebook.aura.email.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.email.keys.EmailUnknownContactsKey;
import com.facebook.aura.email.view.EmailContactsScreensKt;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class ComposableSingletons$EmailEntryProviderKt$lambda$1969805977$1 extends AbstractC7559F3s implements G0W<EmailUnknownContactsKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$EmailEntryProviderKt$lambda$1969805977$1 INSTANCE = new ComposableSingletons$EmailEntryProviderKt$lambda$1969805977$1();

    public ComposableSingletons$EmailEntryProviderKt$lambda$1969805977$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(EmailUnknownContactsKey emailUnknownContactsKey, BFM bfm, Integer num) {
        invoke(emailUnknownContactsKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(EmailUnknownContactsKey emailUnknownContactsKey, BFM bfm, int i) {
        C7384Etj.A0Y(emailUnknownContactsKey, 0);
        EmailContactsScreensKt.EmailUnknownContactsScreen(emailUnknownContactsKey.environmentId, null, bfm, 0, 2);
    }
}

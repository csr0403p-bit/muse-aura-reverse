package com.facebook.aura.email.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.email.keys.EmailSendersKey;
import com.facebook.aura.email.view.EmailSendersScreenKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ComposableSingletons$EmailEntryProviderKt$lambda$1908990323$1 extends AbstractC7559F3s implements G0W<EmailSendersKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$EmailEntryProviderKt$lambda$1908990323$1 INSTANCE = new ComposableSingletons$EmailEntryProviderKt$lambda$1908990323$1();

    public ComposableSingletons$EmailEntryProviderKt$lambda$1908990323$1() {
        super(3);
    }

    public final void invoke(EmailSendersKey emailSendersKey, BFM bfm, int i) {
        C7384Etj.A0Y(emailSendersKey, 0);
        EmailSendersScreenKt.EmailSendersScreen(emailSendersKey.environmentId, null, bfm, 0, 2);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(EmailSendersKey emailSendersKey, BFM bfm, Integer num) {
        invoke(emailSendersKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}

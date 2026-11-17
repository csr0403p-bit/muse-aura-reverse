package com.facebook.aura.email.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.email.keys.EmailSenderNameKey;
import com.facebook.aura.email.view.EmailSettingsScreenKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ComposableSingletons$EmailEntryProviderKt$lambda$363127243$1 extends AbstractC7559F3s implements G0W<EmailSenderNameKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$EmailEntryProviderKt$lambda$363127243$1 INSTANCE = new ComposableSingletons$EmailEntryProviderKt$lambda$363127243$1();

    public ComposableSingletons$EmailEntryProviderKt$lambda$363127243$1() {
        super(3);
    }

    public final void invoke(EmailSenderNameKey emailSenderNameKey, BFM bfm, int i) {
        C7384Etj.A0Y(emailSenderNameKey, 0);
        EmailSettingsScreenKt.EmailSenderNameScreen(emailSenderNameKey.environmentId, null, bfm, 0, 2);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(EmailSenderNameKey emailSenderNameKey, BFM bfm, Integer num) {
        invoke(emailSenderNameKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}

package com.facebook.aura.email.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.email.keys.EmailThreadKey;
import com.facebook.aura.email.view.EmailThreadScreenKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ComposableSingletons$EmailEntryProviderKt$lambda$1202971940$1 extends AbstractC7559F3s implements G0W<EmailThreadKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$EmailEntryProviderKt$lambda$1202971940$1 INSTANCE = new ComposableSingletons$EmailEntryProviderKt$lambda$1202971940$1();

    public ComposableSingletons$EmailEntryProviderKt$lambda$1202971940$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(EmailThreadKey emailThreadKey, BFM bfm, Integer num) {
        invoke(emailThreadKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(EmailThreadKey emailThreadKey, BFM bfm, int i) {
        C7384Etj.A0Y(emailThreadKey, 0);
        EmailThreadScreenKt.EmailThreadScreen(emailThreadKey.environmentId, emailThreadKey.threadId, null, bfm, 0, 4);
    }
}

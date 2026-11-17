package com.facebook.aura.email.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.email.keys.EmailDeleteMailboxKey;
import com.facebook.aura.email.view.EmailDeleteMailboxScreenKt;
import kotlin.Unit;

/* renamed from: com.facebook.aura.email.entries.ComposableSingletons$EmailEntryProviderKt$lambda$-54611226$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$EmailEntryProviderKt$lambda$54611226$1 extends AbstractC7559F3s implements G0W<EmailDeleteMailboxKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$EmailEntryProviderKt$lambda$54611226$1 INSTANCE = new ComposableSingletons$EmailEntryProviderKt$lambda$54611226$1();

    public ComposableSingletons$EmailEntryProviderKt$lambda$54611226$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(EmailDeleteMailboxKey emailDeleteMailboxKey, BFM bfm, Integer num) {
        invoke(emailDeleteMailboxKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(EmailDeleteMailboxKey emailDeleteMailboxKey, BFM bfm, int i) {
        C7384Etj.A0Y(emailDeleteMailboxKey, 0);
        EmailDeleteMailboxScreenKt.EmailDeleteMailboxScreen(emailDeleteMailboxKey.environmentId, null, bfm, 0, 2);
    }
}

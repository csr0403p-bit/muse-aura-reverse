package com.facebook.aura.email.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.email.keys.EmailAddSenderKey;
import com.facebook.aura.email.view.EmailAddSenderScreenKt;
import kotlin.Unit;

/* renamed from: com.facebook.aura.email.entries.ComposableSingletons$EmailEntryProviderKt$lambda$-1481540003$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$EmailEntryProviderKt$lambda$1481540003$1 extends AbstractC7559F3s implements G0W<EmailAddSenderKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$EmailEntryProviderKt$lambda$1481540003$1 INSTANCE = new ComposableSingletons$EmailEntryProviderKt$lambda$1481540003$1();

    public ComposableSingletons$EmailEntryProviderKt$lambda$1481540003$1() {
        super(3);
    }

    public final void invoke(EmailAddSenderKey emailAddSenderKey, BFM bfm, int i) {
        C7384Etj.A0Y(emailAddSenderKey, 0);
        EmailAddSenderScreenKt.EmailAddSenderScreen(emailAddSenderKey.environmentId, null, bfm, 0, 2);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(EmailAddSenderKey emailAddSenderKey, BFM bfm, Integer num) {
        invoke(emailAddSenderKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}

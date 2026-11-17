package com.facebook.aura.email.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.email.keys.EmailSettingsKey;
import com.facebook.aura.email.view.EmailSettingsScreenKt;
import kotlin.Unit;

/* renamed from: com.facebook.aura.email.entries.ComposableSingletons$EmailEntryProviderKt$lambda$-1881210193$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$EmailEntryProviderKt$lambda$1881210193$1 extends AbstractC7559F3s implements G0W<EmailSettingsKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$EmailEntryProviderKt$lambda$1881210193$1 INSTANCE = new ComposableSingletons$EmailEntryProviderKt$lambda$1881210193$1();

    public ComposableSingletons$EmailEntryProviderKt$lambda$1881210193$1() {
        super(3);
    }

    public final void invoke(EmailSettingsKey emailSettingsKey, BFM bfm, int i) {
        C7384Etj.A0Y(emailSettingsKey, 0);
        EmailSettingsScreenKt.EmailSettingsScreen(emailSettingsKey.environmentId, null, bfm, 0, 2);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(EmailSettingsKey emailSettingsKey, BFM bfm, Integer num) {
        invoke(emailSettingsKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}

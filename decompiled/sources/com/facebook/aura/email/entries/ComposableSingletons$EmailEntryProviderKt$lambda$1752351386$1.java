package com.facebook.aura.email.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.email.keys.EmailFormKey;
import com.facebook.aura.email.view.EmailSettingsScreenKt;
import kotlin.Unit;

/* renamed from: com.facebook.aura.email.entries.ComposableSingletons$EmailEntryProviderKt$lambda$-1752351386$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$EmailEntryProviderKt$lambda$1752351386$1 extends AbstractC7559F3s implements G0W<EmailFormKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$EmailEntryProviderKt$lambda$1752351386$1 INSTANCE = new ComposableSingletons$EmailEntryProviderKt$lambda$1752351386$1();

    public ComposableSingletons$EmailEntryProviderKt$lambda$1752351386$1() {
        super(3);
    }

    public final void invoke(EmailFormKey emailFormKey, BFM bfm, int i) {
        C7384Etj.A0Y(emailFormKey, 0);
        EmailSettingsScreenKt.EmailFormScreen(emailFormKey.environmentId, null, bfm, 0, 2);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(EmailFormKey emailFormKey, BFM bfm, Integer num) {
        invoke(emailFormKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}

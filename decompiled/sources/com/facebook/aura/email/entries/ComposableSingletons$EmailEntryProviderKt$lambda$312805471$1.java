package com.facebook.aura.email.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.email.keys.EmailIntroKey;
import com.facebook.aura.email.view.EmailIntroScreenKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ComposableSingletons$EmailEntryProviderKt$lambda$312805471$1 extends AbstractC7559F3s implements G0W<EmailIntroKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$EmailEntryProviderKt$lambda$312805471$1 INSTANCE = new ComposableSingletons$EmailEntryProviderKt$lambda$312805471$1();

    public ComposableSingletons$EmailEntryProviderKt$lambda$312805471$1() {
        super(3);
    }

    public final void invoke(EmailIntroKey emailIntroKey, BFM bfm, int i) {
        C7384Etj.A0Y(emailIntroKey, 0);
        EmailIntroScreenKt.EmailIntroScreen(emailIntroKey.environmentId, null, bfm, 0, 2);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(EmailIntroKey emailIntroKey, BFM bfm, Integer num) {
        invoke(emailIntroKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}

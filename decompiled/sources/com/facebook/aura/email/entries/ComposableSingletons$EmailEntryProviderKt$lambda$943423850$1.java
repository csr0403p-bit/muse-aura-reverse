package com.facebook.aura.email.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.email.keys.EmailAttachmentKey;
import com.facebook.aura.email.view.EmailAttachmentScreenKt;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class ComposableSingletons$EmailEntryProviderKt$lambda$943423850$1 extends AbstractC7559F3s implements G0W<EmailAttachmentKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$EmailEntryProviderKt$lambda$943423850$1 INSTANCE = new ComposableSingletons$EmailEntryProviderKt$lambda$943423850$1();

    public ComposableSingletons$EmailEntryProviderKt$lambda$943423850$1() {
        super(3);
    }

    public final void invoke(EmailAttachmentKey emailAttachmentKey, BFM bfm, int i) {
        C7384Etj.A0Y(emailAttachmentKey, 0);
        EmailAttachmentScreenKt.EmailAttachmentScreen(emailAttachmentKey.environmentId, emailAttachmentKey.messageId, emailAttachmentKey.attachmentIndex, null, bfm, 0, 8);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(EmailAttachmentKey emailAttachmentKey, BFM bfm, Integer num) {
        invoke(emailAttachmentKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}

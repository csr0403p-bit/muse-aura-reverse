package com.facebook.aura.assist;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import android.content.Context;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class AssistVoicePhotoSender$Companion$getInstance$1 extends AbstractC7559F3s implements Function0<AssistVoicePhotoSender> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ AbstractC3358CGz $session;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssistVoicePhotoSender$Companion$getInstance$1(Context context, AbstractC3358CGz abstractC3358CGz) {
        super(0);
        this.$context = context;
        this.$session = abstractC3358CGz;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final AssistVoicePhotoSender invoke() {
        return new AssistVoicePhotoSender(AnonymousClass001.A0I(this.$context), this.$session);
    }
}

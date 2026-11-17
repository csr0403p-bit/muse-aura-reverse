package com.facebook.aura.audio;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import android.content.Context;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchAudioPlayerRepository$Companion$getInstance$1 extends AbstractC7559F3s implements Function0<HatchAudioPlayerRepository> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAudioPlayerRepository$Companion$getInstance$1(Context context, AbstractC3358CGz abstractC3358CGz) {
        super(0);
        this.$context = context;
        this.$userSession = abstractC3358CGz;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final HatchAudioPlayerRepository invoke() {
        return new HatchAudioPlayerRepository(AnonymousClass001.A0I(this.$context), this.$userSession);
    }
}

package com.facebook.aura.partners.voice.avatar;

import X.F2X;
import X.G0W;
import X.HtJ;
import X.HxE;

/* loaded from: classes.dex */
public final /* synthetic */ class HatchVoiceAvatarStore$generations$1 extends F2X implements G0W {
    public static final HatchVoiceAvatarStore$generations$1 INSTANCE = new HatchVoiceAvatarStore$generations$1();

    public HatchVoiceAvatarStore$generations$1() {
        super(3, HxE.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
    }

    public final Object invoke(long j, long j2, HtJ<? super HxE<Long, Long>> htJ) {
        return new HxE(new Long(j), new Long(j2));
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke(((Number) obj).longValue(), ((Number) obj2).longValue(), (HtJ<? super HxE<Long, Long>>) obj3);
    }
}

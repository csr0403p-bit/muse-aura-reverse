package com.facebook.aura.partners.voice.avatar;

import X.AbstractC7559F3s;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchAvatarIdlePosterCache$prepareCallIdle$2 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ File $local;
    public final /* synthetic */ HatchAvatarIdlePosterCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAvatarIdlePosterCache$prepareCallIdle$2(HatchAvatarIdlePosterCache hatchAvatarIdlePosterCache, File file) {
        super(0);
        this.this$0 = hatchAvatarIdlePosterCache;
        this.$local = file;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.pruneCallIdleVideos(this.$local);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

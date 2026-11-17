package com.facebook.aura.avatarsize;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.avatarsize.HatchAvatarSizeRepositoryKt$rememberHatchAvatarSize$1$1", f = "HatchAvatarSizeRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchAvatarSizeRepositoryKt$rememberHatchAvatarSize$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ HatchAvatarSizeRepository $repository;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAvatarSizeRepositoryKt$rememberHatchAvatarSize$1$1(HatchAvatarSizeRepository hatchAvatarSizeRepository, HtJ<? super HatchAvatarSizeRepositoryKt$rememberHatchAvatarSize$1$1> htJ) {
        super(2, htJ);
        this.$repository = hatchAvatarSizeRepository;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchAvatarSizeRepositoryKt$rememberHatchAvatarSize$1$1(this.$repository, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        this.$repository.syncFromPrefs();
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return new HatchAvatarSizeRepositoryKt$rememberHatchAvatarSize$1$1(this.$repository, htJ).invokeSuspend(Unit.INSTANCE);
    }
}

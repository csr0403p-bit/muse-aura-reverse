package com.facebook.aura.sharesheet;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.identity.dances.HatchAvatarDancesRepository;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetViewModel$avatarDances$1$1$load$1", f = "HatchShareSheetViewModel.kt", l = {345}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchShareSheetViewModel$avatarDances$1$1$load$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
    public final /* synthetic */ HatchAvatarDancesRepository $dancesRepository;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchShareSheetViewModel$avatarDances$1$1$load$1(HatchAvatarDancesRepository hatchAvatarDancesRepository, HtJ<? super HatchShareSheetViewModel$avatarDances$1$1$load$1> htJ) {
        super(2, htJ);
        this.$dancesRepository = hatchAvatarDancesRepository;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchShareSheetViewModel$avatarDances$1$1$load$1(this.$dancesRepository, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchAvatarDancesRepository hatchAvatarDancesRepository = this.$dancesRepository;
            this.label = 1;
            obj = hatchAvatarDancesRepository.load(this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return obj;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
        return new HatchShareSheetViewModel$avatarDances$1$1$load$1(this.$dancesRepository, htJ).invokeSuspend(Unit.INSTANCE);
    }
}

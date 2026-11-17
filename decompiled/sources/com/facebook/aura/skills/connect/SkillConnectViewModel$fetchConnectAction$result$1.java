package com.facebook.aura.skills.connect;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.EnumC10460Hji;
import X.G0U;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.skills.connect.repository.AuraSkillAuthRepository;
import com.facebook.aura.skills.connect.repository.SkillConnectAction;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.skills.connect.SkillConnectViewModel$fetchConnectAction$result$1", f = "SkillConnectViewModel.kt", l = {243}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class SkillConnectViewModel$fetchConnectAction$result$1 extends AbstractC07127nr implements G0U<HtJ<? super SkillConnectAction>, Object> {
    public int label;
    public final /* synthetic */ SkillConnectViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkillConnectViewModel$fetchConnectAction$result$1(SkillConnectViewModel skillConnectViewModel, HtJ<? super SkillConnectViewModel$fetchConnectAction$result$1> htJ) {
        super(1, htJ);
        this.this$0 = skillConnectViewModel;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new SkillConnectViewModel$fetchConnectAction$result$1(this.this$0, htJ);
    }

    @Override // X.G0U
    public final Object invoke(HtJ<? super SkillConnectAction> htJ) {
        return new SkillConnectViewModel$fetchConnectAction$result$1(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            SkillConnectViewModel skillConnectViewModel = this.this$0;
            AuraSkillAuthRepository auraSkillAuthRepository = skillConnectViewModel.skillAuthRepository;
            String str = skillConnectViewModel.skill.id;
            String str2 = skillConnectViewModel.sourceSessionId;
            this.label = 1;
            obj = auraSkillAuthRepository.fetchConnectAction(str, str2, this);
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
}

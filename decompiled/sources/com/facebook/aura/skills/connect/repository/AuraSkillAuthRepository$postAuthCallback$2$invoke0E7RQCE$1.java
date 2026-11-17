package com.facebook.aura.skills.connect.repository;

import X.HtJ;
import X.HzP;
import com.facebook.aura.skills.connect.repository.AuraSkillAuthRepository;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.skills.connect.repository.AuraSkillAuthRepository$postAuthCallback$2", f = "AuraSkillAuthRepository.kt", l = {243}, m = "invoke-0E7RQCE", v = 2)
/* renamed from: com.facebook.aura.skills.connect.repository.AuraSkillAuthRepository$postAuthCallback$2$invoke-0E7RQCE$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AuraSkillAuthRepository$postAuthCallback$2$invoke0E7RQCE$1 extends HzP {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AuraSkillAuthRepository.C138042 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSkillAuthRepository$postAuthCallback$2$invoke0E7RQCE$1(AuraSkillAuthRepository.C138042 c138042, HtJ<? super AuraSkillAuthRepository$postAuthCallback$2$invoke0E7RQCE$1> htJ) {
        super(htJ);
        this.this$0 = c138042;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(null, null, this);
    }
}

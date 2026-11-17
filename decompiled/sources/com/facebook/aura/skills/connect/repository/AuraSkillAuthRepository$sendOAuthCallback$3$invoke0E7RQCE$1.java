package com.facebook.aura.skills.connect.repository;

import X.HtJ;
import X.HzP;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.skills.connect.repository.AuraSkillAuthRepository;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.skills.connect.repository.AuraSkillAuthRepository$sendOAuthCallback$3", f = "AuraSkillAuthRepository.kt", l = {HatchMessageShareDocumentRenderer.APP_ICON_SIZE_PX}, m = "invoke-0E7RQCE", v = 2)
/* renamed from: com.facebook.aura.skills.connect.repository.AuraSkillAuthRepository$sendOAuthCallback$3$invoke-0E7RQCE$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AuraSkillAuthRepository$sendOAuthCallback$3$invoke0E7RQCE$1 extends HzP {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AuraSkillAuthRepository.C138053 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSkillAuthRepository$sendOAuthCallback$3$invoke0E7RQCE$1(AuraSkillAuthRepository.C138053 c138053, HtJ<? super AuraSkillAuthRepository$sendOAuthCallback$3$invoke0E7RQCE$1> htJ) {
        super(htJ);
        this.this$0 = c138053;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(null, null, this);
    }
}

package com.facebook.aura.skills.repo;

import X.AnonymousClass006;
import X.HtJ;
import X.HzP;
import com.facebook.aura.commands.sms.MessageDraftSenderKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.skills.repo.SkillsConnectorAccountsRepository", f = "SkillsConnectorAccountsRepository.kt", l = {MessageDraftSenderKt.UNICODE_SINGLE_PART_CHARS}, m = "fetchReconnectLinkUrl-BWLJW6A", v = 2)
/* loaded from: classes3.dex */
public final class SkillsConnectorAccountsRepository$fetchReconnectLinkUrl$1 extends HzP {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SkillsConnectorAccountsRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkillsConnectorAccountsRepository$fetchReconnectLinkUrl$1(SkillsConnectorAccountsRepository skillsConnectorAccountsRepository, HtJ<? super SkillsConnectorAccountsRepository$fetchReconnectLinkUrl$1> htJ) {
        super(htJ);
        this.this$0 = skillsConnectorAccountsRepository;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AnonymousClass006.A0m(this.this$0.m2127fetchReconnectLinkUrlBWLJW6A(null, null, null, this));
    }
}

package com.facebook.aura.email.repo;

import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.email.repo.EmailRepository", f = "EmailRepository.kt", l = {926, 111}, m = "attachmentImage$fbandroid_express_aura_java_com_facebook_aura_email_repo_repo", v = 2)
/* loaded from: classes.dex */
public final class EmailRepository$attachmentImage$1 extends HzP {
    public long J$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ EmailRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailRepository$attachmentImage$1(EmailRepository emailRepository, HtJ<? super EmailRepository$attachmentImage$1> htJ) {
        super(htJ);
        this.this$0 = emailRepository;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.attachmentImage$fbandroid_express_aura_java_com_facebook_aura_email_repo_repo(null, null, null, 0L, this);
    }
}

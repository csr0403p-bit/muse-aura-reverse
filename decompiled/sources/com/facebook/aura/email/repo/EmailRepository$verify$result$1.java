package com.facebook.aura.email.repo;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.EnumC10460Hji;
import X.G0U;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.email.model.EmailSender;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.email.repo.EmailRepository$verify$result$1", f = "EmailRepository.kt", l = {726}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class EmailRepository$verify$result$1 extends AbstractC07127nr implements G0U<HtJ<? super EmailSender>, Object> {
    public final /* synthetic */ String $address;
    public final /* synthetic */ String $id;
    public int label;
    public final /* synthetic */ EmailRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailRepository$verify$result$1(EmailRepository emailRepository, String str, String str2, HtJ<? super EmailRepository$verify$result$1> htJ) {
        super(1, htJ);
        this.this$0 = emailRepository;
        this.$id = str;
        this.$address = str2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new EmailRepository$verify$result$1(this.this$0, this.$id, this.$address, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            EmailRepository emailRepository = this.this$0;
            String str = this.$id;
            String str2 = this.$address;
            this.label = 1;
            obj = emailRepository.verifySender(str, str2, this);
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

    @Override // X.G0U
    public final Object invoke(HtJ<? super EmailSender> htJ) {
        return ((EmailRepository$verify$result$1) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }
}

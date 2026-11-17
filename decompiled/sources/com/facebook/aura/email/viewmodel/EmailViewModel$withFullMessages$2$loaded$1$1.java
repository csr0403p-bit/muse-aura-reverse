package com.facebook.aura.email.viewmodel;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C8eM;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.email.model.EmailMessage;
import com.facebook.aura.email.repo.EmailRepository;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.email.viewmodel.EmailViewModel$withFullMessages$2$loaded$1$1", f = "EmailViewModel.kt", l = {1434, 1401}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class EmailViewModel$withFullMessages$2$loaded$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super EmailMessage>, Object> {
    public final /* synthetic */ C8eM $limit;
    public final /* synthetic */ EmailMessage $message;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ EmailViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailViewModel$withFullMessages$2$loaded$1$1(C8eM c8eM, EmailViewModel emailViewModel, EmailMessage emailMessage, HtJ<? super EmailViewModel$withFullMessages$2$loaded$1$1> htJ) {
        super(2, htJ);
        this.$limit = c8eM;
        this.this$0 = emailViewModel;
        this.$message = emailMessage;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new EmailViewModel$withFullMessages$2$loaded$1$1(this.$limit, this.this$0, this.$message, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        C8eM c8eM;
        EmailViewModel emailViewModel;
        EmailMessage emailMessage;
        Object obj3;
        Object obj4 = EnumC10460Hji.A02;
        int i = this.label;
        try {
            try {
            } catch (CancellationException e) {
                throw e;
            } catch (Exception unused) {
                obj2 = obj3;
            }
            if (i == 0) {
                Hwg.A00(obj);
                c8eM = this.$limit;
                emailViewModel = this.this$0;
                EmailMessage emailMessage2 = this.$message;
                this.L$0 = c8eM;
                this.L$1 = emailViewModel;
                this.L$2 = emailMessage2;
                this.label = 1;
                emailMessage = emailMessage2;
                if (c8eM.A2u(this) == obj4) {
                    return obj4;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw AnonymousClass001.A0n();
                    }
                    Object obj5 = this.L$1;
                    c8eM = (C8eM) this.L$0;
                    Hwg.A00(obj);
                    obj3 = obj5;
                    obj2 = (EmailMessage) obj;
                    return obj2;
                }
                EmailMessage emailMessage3 = (EmailMessage) this.L$2;
                emailViewModel = (EmailViewModel) this.L$1;
                c8eM = (C8eM) this.L$0;
                Hwg.A00(obj);
                emailMessage = emailMessage3;
            }
            EmailRepository emailRepository = emailViewModel.repository;
            String str = emailViewModel.environmentId;
            String str2 = emailMessage.id;
            this.L$0 = c8eM;
            this.L$1 = emailMessage;
            this.L$2 = null;
            this.label = 2;
            obj = emailRepository.message(str, str2, this);
            obj3 = emailMessage;
            if (obj == obj4) {
                return obj4;
            }
            obj2 = (EmailMessage) obj;
            return obj2;
        } finally {
            c8eM.release();
        }
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super EmailMessage> htJ) {
        return ((EmailViewModel$withFullMessages$2$loaded$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}

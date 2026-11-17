package com.facebook.aura.email.repo;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.common.coroutines.SingleFlight;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.email.repo.EmailRepository$releaseSetupAnnouncement$1$1", f = "EmailRepository.kt", l = {407}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class EmailRepository$releaseSetupAnnouncement$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ String $id;
    public int label;
    public final /* synthetic */ EmailRepository this$0;

    @DebugMetadata(c = "com.facebook.aura.email.repo.EmailRepository$releaseSetupAnnouncement$1$1$1", f = "EmailRepository.kt", l = {407}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.email.repo.EmailRepository$releaseSetupAnnouncement$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $id;
        public int label;
        public final /* synthetic */ EmailRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(EmailRepository emailRepository, String str, HtJ<? super AnonymousClass1> htJ) {
            super(1, htJ);
            this.this$0 = emailRepository;
            this.$id = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return new AnonymousClass1(this.this$0, this.$id, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                EmailRepository emailRepository = this.this$0;
                String str = this.$id;
                this.label = 1;
                if (emailRepository.sendSetupEndWithRetry(str, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailRepository$releaseSetupAnnouncement$1$1(EmailRepository emailRepository, String str, HtJ<? super EmailRepository$releaseSetupAnnouncement$1$1> htJ) {
        super(2, htJ);
        this.this$0 = emailRepository;
        this.$id = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new EmailRepository$releaseSetupAnnouncement$1$1(this.this$0, this.$id, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            EmailRepository emailRepository = this.this$0;
            SingleFlight singleFlight = emailRepository.setupEndFlight;
            String str = this.$id;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(emailRepository, str, null);
            this.label = 1;
            if (singleFlight.invoke(str, anonymousClass1, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((EmailRepository$releaseSetupAnnouncement$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}

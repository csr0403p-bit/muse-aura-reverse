package com.facebook.aura.email.viewmodel;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C20Z;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.email.repo.EmailRepository;
import com.facebook.aura.skills.model.Skill;
import com.facebook.aura.skills.repo.HatchConnectorCatalogRepository;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.email.viewmodel.EmailViewModel$productName$1", f = "EmailViewModel.kt", l = {223}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class EmailViewModel$productName$1 extends AbstractC07127nr implements G0V<C20Z<? super Skill>, HtJ<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ EmailViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailViewModel$productName$1(EmailViewModel emailViewModel, HtJ<? super EmailViewModel$productName$1> htJ) {
        super(2, htJ);
        this.this$0 = emailViewModel;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new EmailViewModel$productName$1(this.this$0, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            if (this.this$0.connectorCatalog.cache.connector(EmailRepository.MUSE_MAIL_CONNECTOR) == null) {
                HatchConnectorCatalogRepository hatchConnectorCatalogRepository = this.this$0.connectorCatalog;
                this.label = 1;
                if (hatchConnectorCatalogRepository.m2119fetchConnectorgIAlus(EmailRepository.MUSE_MAIL_CONNECTOR, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
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
    public final Object invoke(C20Z<? super Skill> c20z, HtJ<? super Unit> htJ) {
        return new EmailViewModel$productName$1(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
    }
}

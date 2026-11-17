package com.facebook.aura.gateway;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0U;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import com.facebook.aura.nodes.datasource.DataSource;
import com.facebook.aura.nodes.datasource.DataSourceContext;
import com.facebook.aura.nodes.datasource.DataSourceResult;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.gateway.AuraProactiveSyncWorker$doBackgroundWork$syncResult$1", f = "AuraProactiveSyncWorker.kt", l = {HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 113}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class AuraProactiveSyncWorker$doBackgroundWork$syncResult$1 extends AbstractC07127nr implements G0U<HtJ<? super DataSourceResult>, Object> {
    public final /* synthetic */ DataSourceContext $ctx;
    public final /* synthetic */ DataSource $source;
    public final /* synthetic */ AbstractC3358CGz $userSession;
    public int label;
    public final /* synthetic */ AuraProactiveSyncWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraProactiveSyncWorker$doBackgroundWork$syncResult$1(AbstractC3358CGz abstractC3358CGz, AuraProactiveSyncWorker auraProactiveSyncWorker, DataSource dataSource, DataSourceContext dataSourceContext, HtJ<? super AuraProactiveSyncWorker$doBackgroundWork$syncResult$1> htJ) {
        super(1, htJ);
        this.$userSession = abstractC3358CGz;
        this.this$0 = auraProactiveSyncWorker;
        this.$source = dataSource;
        this.$ctx = dataSourceContext;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new AuraProactiveSyncWorker$doBackgroundWork$syncResult$1(this.$userSession, this.this$0, this.$source, this.$ctx, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchNodeClientAttachment hatchNodeClientAttachment = HatchNodeClientAttachment.INSTANCE;
            AbstractC3358CGz abstractC3358CGz = this.$userSession;
            Context context = this.this$0.mAppContext;
            C7384Etj.A0U(context);
            this.label = 1;
            obj = hatchNodeClientAttachment.connectForBackgroundWork(abstractC3358CGz, context, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    Hwg.A00(obj);
                }
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        if (!AnonymousClass001.A1X(obj)) {
            return null;
        }
        DataSource dataSource = this.$source;
        DataSourceContext dataSourceContext = this.$ctx;
        this.label = 2;
        obj = dataSource.proactiveSync(dataSourceContext, this);
        return obj == enumC10460Hji ? enumC10460Hji : obj;
    }

    @Override // X.G0U
    public final Object invoke(HtJ<? super DataSourceResult> htJ) {
        return ((AuraProactiveSyncWorker$doBackgroundWork$syncResult$1) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }
}

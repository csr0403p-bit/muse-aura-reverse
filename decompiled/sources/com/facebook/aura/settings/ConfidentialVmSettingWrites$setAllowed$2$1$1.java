package com.facebook.aura.settings;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.conversation.repo.HatchConversationHistoryReloader;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

@DebugMetadata(c = "com.facebook.aura.settings.ConfidentialVmSettingWrites$setAllowed$2$1$1", f = "ConfidentialVmSettingWrites.kt", l = {R.styleable.maplibre_MapView_maplibre_uiCompassMarginTop}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class ConfidentialVmSettingWrites$setAllowed$2$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ ConfidentialVmSettingWrites this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfidentialVmSettingWrites$setAllowed$2$1$1(ConfidentialVmSettingWrites confidentialVmSettingWrites, HtJ<? super ConfidentialVmSettingWrites$setAllowed$2$1$1> htJ) {
        super(2, htJ);
        this.this$0 = confidentialVmSettingWrites;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new ConfidentialVmSettingWrites$setAllowed$2$1$1(this.this$0, htJ);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return new ConfidentialVmSettingWrites$setAllowed$2$1$1(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchConversationHistoryReloader hatchConversationHistoryReloader = HatchConversationHistoryReloader.INSTANCE;
            AbstractC3358CGz abstractC3358CGz = this.this$0.userSession;
            this.label = 1;
            if (hatchConversationHistoryReloader.reload(abstractC3358CGz, this) == enumC10460Hji) {
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
}

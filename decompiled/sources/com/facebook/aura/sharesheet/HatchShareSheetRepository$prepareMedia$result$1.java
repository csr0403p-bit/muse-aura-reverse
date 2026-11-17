package com.facebook.aura.sharesheet;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.EnumC10460Hji;
import X.G0U;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetRepository$prepareMedia$result$1", f = "HatchShareSheetRepository.kt", l = {140}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchShareSheetRepository$prepareMedia$result$1 extends AbstractC07127nr implements G0U<HtJ<? super HatchPreparedShareMedia>, Object> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ String $previewUri;
    public int label;
    public final /* synthetic */ HatchShareSheetRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchShareSheetRepository$prepareMedia$result$1(HatchShareSheetRepository hatchShareSheetRepository, Context context, String str, HtJ<? super HatchShareSheetRepository$prepareMedia$result$1> htJ) {
        super(1, htJ);
        this.this$0 = hatchShareSheetRepository;
        this.$context = context;
        this.$previewUri = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new HatchShareSheetRepository$prepareMedia$result$1(this.this$0, this.$context, this.$previewUri, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchShareSheetRepository hatchShareSheetRepository = this.this$0;
            Context context = this.$context;
            String str = this.$previewUri;
            this.label = 1;
            obj = hatchShareSheetRepository.prepareMediaOnce(context, str, this);
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
    public final Object invoke(HtJ<? super HatchPreparedShareMedia> htJ) {
        return ((HatchShareSheetRepository$prepareMedia$result$1) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }
}

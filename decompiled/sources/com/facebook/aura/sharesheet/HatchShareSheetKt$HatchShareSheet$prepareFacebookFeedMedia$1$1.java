package com.facebook.aura.sharesheet;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetKt$HatchShareSheet$prepareFacebookFeedMedia$1$1", f = "HatchShareSheet.kt", l = {145}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchShareSheetKt$HatchShareSheet$prepareFacebookFeedMedia$1$1 extends AbstractC07127nr implements G0V<String, HtJ<? super String>, Object> {
    public final /* synthetic */ Context $applicationContext;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchShareSheetKt$HatchShareSheet$prepareFacebookFeedMedia$1$1(Context context, HtJ<? super HatchShareSheetKt$HatchShareSheet$prepareFacebookFeedMedia$1$1> htJ) {
        super(2, htJ);
        this.$applicationContext = context;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        HatchShareSheetKt$HatchShareSheet$prepareFacebookFeedMedia$1$1 hatchShareSheetKt$HatchShareSheet$prepareFacebookFeedMedia$1$1 = new HatchShareSheetKt$HatchShareSheet$prepareFacebookFeedMedia$1$1(this.$applicationContext, htJ);
        hatchShareSheetKt$HatchShareSheet$prepareFacebookFeedMedia$1$1.L$0 = obj;
        return hatchShareSheetKt$HatchShareSheet$prepareFacebookFeedMedia$1$1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.L$0;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchMessageShareImageRenderer hatchMessageShareImageRenderer = HatchMessageShareImageRenderer.INSTANCE;
            Context context = this.$applicationContext;
            C7384Etj.A0X(context);
            this.L$0 = null;
            this.label = 1;
            obj = hatchMessageShareImageRenderer.renderFacebookFeedCard(context, str, this);
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

    @Override // X.G0V
    public final Object invoke(String str, HtJ<? super String> htJ) {
        return ((HatchShareSheetKt$HatchShareSheet$prepareFacebookFeedMedia$1$1) create(str, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}

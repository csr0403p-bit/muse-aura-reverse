package com.facebook.rp.platform.appdrivenaudio;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C3cG;
import X.C7Bm;
import X.C8j3;
import X.EnumC10460Hji;
import X.G0V;
import X.GBL;
import X.GSV;
import X.HtJ;
import X.Hwg;
import X.RunnableC10561Htc;
import com.facebook.aura.partners.accountlinking.nativeauthlogging.MC;
import java.util.concurrent.RejectedExecutionException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.DispatchException;

@DebugMetadata(c = "com.facebook.rp.platform.appdrivenaudio.AndroidAudioStateManager$teardownAudioStateForRtcAndWait$2", f = "AndroidAudioStateManager.kt", l = {MC.xe_growth_hatch_abra_config.__CONFIG__}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class AndroidAudioStateManager$teardownAudioStateForRtcAndWait$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ String $localCallId;
    public final /* synthetic */ boolean $playEndEarcon;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public boolean Z$0;
    public int label;
    public final /* synthetic */ GSV this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/GSV;Ljava/lang/String;ZLX/HtJ<-Lcom/facebook/rp/platform/appdrivenaudio/AndroidAudioStateManager$teardownAudioStateForRtcAndWait$2;>;)V */
    public AndroidAudioStateManager$teardownAudioStateForRtcAndWait$2(GSV gsv, String str, HtJ htJ, boolean z) {
        super(2, htJ);
        this.this$0 = gsv;
        this.$localCallId = str;
        this.$playEndEarcon = z;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        AndroidAudioStateManager$teardownAudioStateForRtcAndWait$2 androidAudioStateManager$teardownAudioStateForRtcAndWait$2 = new AndroidAudioStateManager$teardownAudioStateForRtcAndWait$2(this.this$0, this.$localCallId, htJ, this.$playEndEarcon);
        androidAudioStateManager$teardownAudioStateForRtcAndWait$2.L$0 = obj;
        return androidAudioStateManager$teardownAudioStateForRtcAndWait$2;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) throws DispatchException {
        C3UX c3ux = (C3UX) this.L$0;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            GSV gsv = this.this$0;
            String str = this.$localCallId;
            boolean z = this.$playEndEarcon;
            this.L$0 = c3ux;
            this.L$1 = gsv;
            this.L$2 = str;
            this.Z$0 = z;
            this.label = 1;
            GBL gblA04 = C7Bm.A04(this);
            try {
                gsv.A04.execute(new RunnableC10561Htc(gsv, str, gblA04, c3ux, z));
            } catch (RejectedExecutionException e) {
                gblA04.resumeWith(C3cG.A0s(e));
            }
            if (gblA04.A0F() == enumC10460Hji) {
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
    public final /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((AndroidAudioStateManager$teardownAudioStateForRtcAndWait$2) C8j3.A1E(htJ, c3ux, this)).invokeSuspend(Unit.INSTANCE);
    }
}

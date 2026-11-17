package com.facebook.aura.gateway;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.gateway.HatchPauseOperations;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.gateway.HatchPauseOperations$Companion$status$2", f = "HatchPauseOperations.kt", l = {195}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class HatchPauseOperations$Companion$status$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HatchPauseOperations.PauseStatusResult>, Object> {
    public final /* synthetic */ String $authToken;
    public final /* synthetic */ String $wsUrl;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchPauseOperations$Companion$status$2(String str, String str2, HtJ<? super HatchPauseOperations$Companion$status$2> htJ) {
        super(2, htJ);
        this.$wsUrl = str;
        this.$authToken = str2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchPauseOperations$Companion$status$2(this.$wsUrl, this.$authToken, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchPauseOperations.Companion companion = HatchPauseOperations.Companion;
            String str = this.$wsUrl;
            String str2 = this.$authToken;
            this.label = 1;
            obj = companion.statusInternal(str, str2, this);
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
    public final Object invoke(C3UX c3ux, HtJ<? super HatchPauseOperations.PauseStatusResult> htJ) {
        return ((HatchPauseOperations$Companion$status$2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}

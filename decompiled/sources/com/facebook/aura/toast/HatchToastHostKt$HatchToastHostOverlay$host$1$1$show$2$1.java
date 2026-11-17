package com.facebook.aura.toast;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C78T;
import X.EnumC10460Hji;
import X.G0V;
import X.GBM;
import X.HtJ;
import X.Hwg;
import X.InterfaceC10560Hsz;
import com.facebook.aura.ageverification.SelfieSnapshotKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.toast.HatchToastHostKt$HatchToastHostOverlay$host$1$1$show$2$1", f = "HatchToastHost.kt", l = {SelfieSnapshotKt.SELFIE_JPEG_QUALITY}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchToastHostKt$HatchToastHostOverlay$host$1$1$show$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC10560Hsz<Unit> $dismissed;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchToastHostKt$HatchToastHostOverlay$host$1$1$show$2$1(InterfaceC10560Hsz<Unit> interfaceC10560Hsz, HtJ<? super HatchToastHostKt$HatchToastHostOverlay$host$1$1$show$2$1> htJ) {
        super(2, htJ);
        this.$dismissed = interfaceC10560Hsz;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchToastHostKt$HatchToastHostOverlay$host$1$1$show$2$1(this.$dismissed, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C78T c78t = this.$dismissed;
            this.label = 1;
            if (((GBM) c78t).A0E(this) == enumC10460Hji) {
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
        return new HatchToastHostKt$HatchToastHostOverlay$host$1$1$show$2$1(this.$dismissed, htJ).invokeSuspend(Unit.INSTANCE);
    }
}

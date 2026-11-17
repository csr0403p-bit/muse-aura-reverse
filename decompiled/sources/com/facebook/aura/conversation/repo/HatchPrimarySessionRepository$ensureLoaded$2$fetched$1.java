package com.facebook.aura.conversation.repo;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C1BN;
import X.C20Z;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

@DebugMetadata(c = "com.facebook.aura.conversation.repo.HatchPrimarySessionRepository$ensureLoaded$2$fetched$1", f = "HatchPrimarySessionRepository.kt", l = {R.styleable.maplibre_MapView_maplibre_uiCompassMarginLeft, R.styleable.maplibre_MapView_maplibre_uiCompassMarginLeft}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchPrimarySessionRepository$ensureLoaded$2$fetched$1 extends AbstractC07127nr implements G0V<C20Z<? super String>, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C1BN<String> $acknowledged;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ HatchPrimarySessionRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchPrimarySessionRepository$ensureLoaded$2$fetched$1(HatchPrimarySessionRepository hatchPrimarySessionRepository, C1BN<String> c1bn, HtJ<? super HatchPrimarySessionRepository$ensureLoaded$2$fetched$1> htJ) {
        super(2, htJ);
        this.this$0 = hatchPrimarySessionRepository;
        this.$acknowledged = c1bn;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        HatchPrimarySessionRepository$ensureLoaded$2$fetched$1 hatchPrimarySessionRepository$ensureLoaded$2$fetched$1 = new HatchPrimarySessionRepository$ensureLoaded$2$fetched$1(this.this$0, this.$acknowledged, htJ);
        hatchPrimarySessionRepository$ensureLoaded$2$fetched$1.L$0 = obj;
        return hatchPrimarySessionRepository$ensureLoaded$2$fetched$1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        C20Z c20z = (C20Z) this.L$0;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchPrimarySessionRepository hatchPrimarySessionRepository = this.this$0;
            this.L$0 = null;
            this.L$1 = c20z;
            this.label = 1;
            obj = hatchPrimarySessionRepository.fetchPrimarySessionId(this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                return Unit.INSTANCE;
            }
            c20z = (C20Z) this.L$1;
            Hwg.A00(obj);
        }
        if (obj == null) {
            obj = this.$acknowledged.getValue();
        }
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        if (c20z.emit(obj, this) == enumC10460Hji) {
            return enumC10460Hji;
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C20Z<? super String> c20z, HtJ<? super Unit> htJ) {
        return ((HatchPrimarySessionRepository$ensureLoaded$2$fetched$1) create(c20z, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}

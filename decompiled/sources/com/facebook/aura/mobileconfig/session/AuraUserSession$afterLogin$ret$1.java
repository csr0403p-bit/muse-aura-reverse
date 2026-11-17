package com.facebook.aura.mobileconfig.session;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C3UX;
import X.C78T;
import X.DRZ;
import X.DS1;
import X.EZD;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.mobileconfig.session.AuraUserSession$afterLogin$ret$1", f = "AuraUserSession.kt", l = {106}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class AuraUserSession$afterLogin$ret$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
    public final /* synthetic */ DRZ $mc;
    public final /* synthetic */ DS1 $updateOptions;
    public int label;
    public final /* synthetic */ AuraUserSession this$0;

    /* renamed from: com.facebook.aura.mobileconfig.session.AuraUserSession$afterLogin$ret$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Boolean> {
        public final /* synthetic */ DRZ $mc;
        public final /* synthetic */ DS1 $updateOptions;
        public final /* synthetic */ AuraUserSession this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AuraUserSession auraUserSession, DRZ drz, DS1 ds1) {
            super(0);
            this.this$0 = auraUserSession;
            this.$mc = drz;
            this.$updateOptions = ds1;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(this.this$0.updateMobileConfigsWithRetry(this.$mc, this.$updateOptions));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraUserSession$afterLogin$ret$1(AuraUserSession auraUserSession, DRZ drz, DS1 ds1, HtJ<? super AuraUserSession$afterLogin$ret$1> htJ) {
        super(2, htJ);
        this.this$0 = auraUserSession;
        this.$mc = drz;
        this.$updateOptions = ds1;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new AuraUserSession$afterLogin$ret$1(this.this$0, this.$mc, this.$updateOptions, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C78T c78tA0y = AnonymousClass001.A0y();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$mc, this.$updateOptions);
            this.label = 1;
            obj = GAo.A00(this, c78tA0y, new EZD(anonymousClass1, (HtJ) null, 10, 42));
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
    public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
        return ((AuraUserSession$afterLogin$ret$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}

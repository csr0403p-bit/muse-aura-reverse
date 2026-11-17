package com.facebook.aura.rentalcars;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C78T;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import X.InterfaceC05161qu;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.executors.AuraDispatchers;
import com.facebook.aura.model.GenericListPresentation;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.rentalcars.RentalCarResultsRenderer$Render$decoded$2$1", f = "RentalCarResultsRenderer.kt", l = {40}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class RentalCarResultsRenderer$Render$decoded$2$1 extends AbstractC07127nr implements G0V<InterfaceC05161qu<RentalCarDecode>, HtJ<? super Unit>, Object> {
    public final /* synthetic */ RentalCarDecodeKey $key;
    public final /* synthetic */ GenericListPresentation $list;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;

    @DebugMetadata(c = "com.facebook.aura.rentalcars.RentalCarResultsRenderer$Render$decoded$2$1$1", f = "RentalCarResultsRenderer.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.rentalcars.RentalCarResultsRenderer$Render$decoded$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super RentalCarDecode>, Object> {
        public final /* synthetic */ RentalCarDecodeKey $key;
        public final /* synthetic */ GenericListPresentation $list;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RentalCarDecodeKey rentalCarDecodeKey, GenericListPresentation genericListPresentation, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$key = rentalCarDecodeKey;
            this.$list = genericListPresentation;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$key, this.$list, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return RentalCarDecodeCache.INSTANCE.decode(this.$key, this.$list);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super RentalCarDecode> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RentalCarResultsRenderer$Render$decoded$2$1(RentalCarDecodeKey rentalCarDecodeKey, GenericListPresentation genericListPresentation, HtJ<? super RentalCarResultsRenderer$Render$decoded$2$1> htJ) {
        super(2, htJ);
        this.$key = rentalCarDecodeKey;
        this.$list = genericListPresentation;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        RentalCarResultsRenderer$Render$decoded$2$1 rentalCarResultsRenderer$Render$decoded$2$1 = new RentalCarResultsRenderer$Render$decoded$2$1(this.$key, this.$list, htJ);
        rentalCarResultsRenderer$Render$decoded$2$1.L$0 = obj;
        return rentalCarResultsRenderer$Render$decoded$2$1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        MutableState mutableState = (MutableState) this.L$0;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            obj = RentalCarDecodeCache.INSTANCE.get(this.$key, this.$list);
            if (obj == null) {
                C78T c78tM764default = AuraDispatchers.INSTANCE.m764default();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$key, this.$list, null);
                this.L$0 = null;
                this.L$1 = mutableState;
                this.label = 1;
                obj = GAo.A00(this, c78tM764default, anonymousClass1);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            mutableState = (MutableState) this.L$1;
            Hwg.A00(obj);
        }
        mutableState.Af8(obj);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(InterfaceC05161qu<RentalCarDecode> interfaceC05161qu, HtJ<? super Unit> htJ) {
        return ((RentalCarResultsRenderer$Render$decoded$2$1) create(interfaceC05161qu, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}

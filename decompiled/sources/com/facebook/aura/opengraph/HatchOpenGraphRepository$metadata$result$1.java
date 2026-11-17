package com.facebook.aura.opengraph;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.common.coroutines.SingleFlightResult;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.opengraph.HatchOpenGraphRepository$metadata$result$1", f = "HatchOpenGraphRepository.kt", l = {124}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class HatchOpenGraphRepository$metadata$result$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super SingleFlightResult<? extends HatchWebPageMetadata>>, Object> {
    public final /* synthetic */ String $url;
    public int label;
    public final /* synthetic */ HatchOpenGraphRepository this$0;

    @DebugMetadata(c = "com.facebook.aura.opengraph.HatchOpenGraphRepository$metadata$result$1$1", f = "HatchOpenGraphRepository.kt", l = {124}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.opengraph.HatchOpenGraphRepository$metadata$result$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0U<HtJ<? super HatchWebPageMetadata>, Object> {
        public final /* synthetic */ String $url;
        public int label;
        public final /* synthetic */ HatchOpenGraphRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchOpenGraphRepository hatchOpenGraphRepository, String str, HtJ<? super AnonymousClass1> htJ) {
            super(1, htJ);
            this.this$0 = hatchOpenGraphRepository;
            this.$url = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return new AnonymousClass1(this.this$0, this.$url, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchOpenGraphRepository hatchOpenGraphRepository = this.this$0;
                String str = this.$url;
                this.label = 1;
                obj = hatchOpenGraphRepository.fetchAndCache(str, this);
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
        public final Object invoke(HtJ<? super HatchWebPageMetadata> htJ) {
            return ((AnonymousClass1) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchOpenGraphRepository$metadata$result$1(HatchOpenGraphRepository hatchOpenGraphRepository, String str, HtJ<? super HatchOpenGraphRepository$metadata$result$1> htJ) {
        super(2, htJ);
        this.this$0 = hatchOpenGraphRepository;
        this.$url = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchOpenGraphRepository$metadata$result$1(this.this$0, this.$url, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchOpenGraphRepository hatchOpenGraphRepository = this.this$0;
            SingleFlight singleFlight = hatchOpenGraphRepository.singleFlight;
            String str = this.$url;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(hatchOpenGraphRepository, str, null);
            this.label = 1;
            obj = singleFlight.invoke(str, anonymousClass1, this);
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

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super SingleFlightResult<HatchWebPageMetadata>> htJ) {
        return ((HatchOpenGraphRepository$metadata$result$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super SingleFlightResult<? extends HatchWebPageMetadata>> htJ) {
        return invoke2(c3ux, (HtJ<? super SingleFlightResult<HatchWebPageMetadata>>) htJ);
    }
}

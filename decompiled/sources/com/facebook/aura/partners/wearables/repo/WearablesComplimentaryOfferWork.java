package com.facebook.aura.partners.wearables.repo;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06H;
import X.C3UX;
import X.C7384Etj;
import X.C78W;
import X.CFK;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.Hxb;
import X.InterfaceC7549F2g;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.common.coroutines.OnDuplicateCall;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.common.coroutines.SingleFlightKt;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class WearablesComplimentaryOfferWork implements InterfaceC7549F2g {
    public static final Companion Companion = new Companion();
    public static final String TAG = "WearablesComplimentaryOfferWork";
    public final WearablesLinkingRepository repository;
    public final C3UX scope;
    public final SingleFlight singleFlight;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.partners.wearables.repo.WearablesComplimentaryOfferWork$prepare$1", f = "WearablesComplimentaryOfferWork.kt", l = {28}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.wearables.repo.WearablesComplimentaryOfferWork$prepare$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $setupSessionId;
        public final /* synthetic */ HatchSubsurface $subsurface;
        public final /* synthetic */ HatchSurface $surface;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.partners.wearables.repo.WearablesComplimentaryOfferWork$prepare$1$1", f = "WearablesComplimentaryOfferWork.kt", l = {29}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.partners.wearables.repo.WearablesComplimentaryOfferWork$prepare$1$1, reason: invalid class name and collision with other inner class name */
        public final class C03341 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
            public final /* synthetic */ String $setupSessionId;
            public final /* synthetic */ HatchSubsurface $subsurface;
            public final /* synthetic */ HatchSurface $surface;
            public int label;
            public final /* synthetic */ WearablesComplimentaryOfferWork this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03341(WearablesComplimentaryOfferWork wearablesComplimentaryOfferWork, HatchSurface hatchSurface, HatchSubsurface hatchSubsurface, String str, HtJ<? super C03341> htJ) {
                super(1, htJ);
                this.this$0 = wearablesComplimentaryOfferWork;
                this.$surface = hatchSurface;
                this.$subsurface = hatchSubsurface;
                this.$setupSessionId = str;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(HtJ<?> htJ) {
                return new C03341(this.this$0, this.$surface, this.$subsurface, this.$setupSessionId, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    WearablesComplimentaryOfferWork wearablesComplimentaryOfferWork = this.this$0;
                    WearablesLinkingRepository wearablesLinkingRepository = wearablesComplimentaryOfferWork.repository;
                    AbstractC3358CGz abstractC3358CGz = wearablesComplimentaryOfferWork.userSession;
                    HatchSurface hatchSurface = this.$surface;
                    HatchSubsurface hatchSubsurface = this.$subsurface;
                    String str = this.$setupSessionId;
                    this.label = 1;
                    if (wearablesLinkingRepository.prepareComplimentaryOffer(abstractC3358CGz, hatchSurface, hatchSubsurface, str, this) == enumC10460Hji) {
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

            @Override // X.G0U
            public final Object invoke(HtJ<? super Unit> htJ) {
                return ((C03341) create(htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchSurface hatchSurface, HatchSubsurface hatchSubsurface, String str, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$surface = hatchSurface;
            this.$subsurface = hatchSubsurface;
            this.$setupSessionId = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return WearablesComplimentaryOfferWork.this.new AnonymousClass1(this.$surface, this.$subsurface, this.$setupSessionId, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    WearablesComplimentaryOfferWork wearablesComplimentaryOfferWork = WearablesComplimentaryOfferWork.this;
                    SingleFlight singleFlight = wearablesComplimentaryOfferWork.singleFlight;
                    C03341 c03341 = new C03341(wearablesComplimentaryOfferWork, this.$surface, this.$subsurface, this.$setupSessionId, null);
                    this.label = 1;
                    if (singleFlight.invoke(Unit.INSTANCE, c03341, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                CFK.A0A(WearablesComplimentaryOfferWork.TAG, "Failed to prepare complimentary offer", e2);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final void prepare(HatchSurface hatchSurface, HatchSubsurface hatchSubsurface, String str) {
        AnonymousClass003.A0u(hatchSurface, hatchSubsurface);
        AnonymousClass001.A1J(new AnonymousClass1(hatchSurface, hatchSubsurface, str, null), this.scope);
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        Hxb.A03(null, this.scope);
        this.singleFlight.clearAndCancelAll();
    }

    public final class Companion {
        public final WearablesComplimentaryOfferWork getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (WearablesComplimentaryOfferWork) abstractC3358CGz.A03(WearablesComplimentaryOfferWork.class, new WearablesComplimentaryOfferWork$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public WearablesComplimentaryOfferWork(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        this.repository = new WearablesLinkingRepository();
        this.scope = C78W.A03();
        this.singleFlight = SingleFlightKt.SingleFlight(abstractC3358CGz, OnDuplicateCall.Join.INSTANCE, false);
    }

    public /* synthetic */ WearablesComplimentaryOfferWork(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}

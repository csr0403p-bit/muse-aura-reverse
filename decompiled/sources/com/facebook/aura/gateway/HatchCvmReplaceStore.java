package com.facebook.aura.gateway;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BLG;
import X.C06H;
import X.C1BN;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C9286GCn;
import X.CFK;
import X.EnumC10460Hji;
import X.G0V;
import X.HnJ;
import X.HtJ;
import X.Hwg;
import X.Hxb;
import X.InterfaceC7549F2g;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.common.coroutines.SingleFlightResult;
import com.facebook.aura.gateway.HatchCvmReplacement;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class HatchCvmReplaceStore implements InterfaceC7549F2g {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public static final String TAG = "HatchCvmReplaceStore";
    public final BLG<HatchCvmReplacement> _replacement;
    public final C1BN<HatchCvmReplacement> replacement;
    public final C3UX scope;
    public final SingleFlight stateRead;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchCvmReplaceStore$refresh$2", f = "HatchCvmReplaceStore.kt", l = {82}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchCvmReplaceStore$refresh$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HatchCvmReplacement>, Object> {
        public final /* synthetic */ HatchCvmReplaceSource $source;
        public final /* synthetic */ String $vmId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, HatchCvmReplaceSource hatchCvmReplaceSource, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$vmId = str;
            this.$source = hatchCvmReplaceSource;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchCvmReplaceStore.this.new AnonymousClass2(this.$vmId, this.$source, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchCvmReplaceStore hatchCvmReplaceStore = HatchCvmReplaceStore.this;
                SingleFlight singleFlight = hatchCvmReplaceStore.stateRead;
                String str = this.$vmId;
                HatchCvmReplaceStore$refresh$2$result$1 hatchCvmReplaceStore$refresh$2$result$1 = new HatchCvmReplaceStore$refresh$2$result$1(hatchCvmReplaceStore, str, this.$source, null);
                this.label = 1;
                obj = singleFlight.invoke(str, hatchCvmReplaceStore$refresh$2$result$1, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            SingleFlightResult singleFlightResult = (SingleFlightResult) obj;
            if (singleFlightResult instanceof SingleFlightResult.Result) {
                return ((SingleFlightResult.Result) singleFlightResult).value;
            }
            if (C7384Etj.areEqual(singleFlightResult, SingleFlightResult.Skipped.INSTANCE)) {
                return null;
            }
            throw C3cG.A0q();
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super HatchCvmReplacement> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final void setReplacement$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(String str, String str2, HatchVmState hatchVmState, HatchlingVmType hatchlingVmType) {
        HatchCvmReplacement value;
        HatchCvmReplacement hatchCvmReplacement;
        C7384Etj.A0Y(hatchVmState, 2);
        HatchCvmReplaceStore$setReplacement$next$1 hatchCvmReplaceStore$setReplacement$next$1 = new HatchCvmReplaceStore$setReplacement$next$1(str, str2, hatchVmState, hatchlingVmType);
        BLG<HatchCvmReplacement> blg = this._replacement;
        do {
            value = blg.getValue();
            hatchCvmReplacement = value;
        } while (!blg.A6e(value, hatchCvmReplaceStore$setReplacement$next$1.invoke(hatchCvmReplacement)));
        HatchCvmReplacement hatchCvmReplacementInvoke = hatchCvmReplaceStore$setReplacement$next$1.invoke(hatchCvmReplacement);
        if (hatchCvmReplacementInvoke instanceof HatchCvmReplacement.Active) {
            HatchCvmReplaceReadPolicy.Companion.getInstance(this.userSession).rearm(((HatchCvmReplacement.Active) hatchCvmReplacementInvoke).vmId);
        }
        logObserved(hatchCvmReplacement, hatchCvmReplacementInvoke, HatchCvmReplaceSource.FETCH_VMS);
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        Hxb.A03(null, this.scope);
        this._replacement.Af8(HatchCvmReplacement.Unknown.INSTANCE);
    }

    public final C1BN<HatchCvmReplacement> getReplacement() {
        return this.replacement;
    }

    public final Object refresh(String str, HatchCvmReplaceSource hatchCvmReplaceSource, HtJ<? super HatchCvmReplacement> htJ) {
        return AnonymousClass001.A10(new AnonymousClass2(str, hatchCvmReplaceSource, null), this.scope).A0E(htJ);
    }

    public final class Companion {
        public final HatchCvmReplaceStore getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchCvmReplaceStore) abstractC3358CGz.A03(HatchCvmReplaceStore.class, new HatchCvmReplaceStore$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchCvmReplaceStore(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        C9286GCn c9286GCnA01 = HnJ.A01(HatchCvmReplacement.Unknown.INSTANCE);
        this._replacement = c9286GCnA01;
        this.scope = C3cH.A0x(AnonymousClass001.A0y());
        this.stateRead = C3cH.A0M();
        this.replacement = C3cG.A11(c9286GCnA01);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logObserved(HatchCvmReplacement hatchCvmReplacement, HatchCvmReplacement hatchCvmReplacement2, HatchCvmReplaceSource hatchCvmReplaceSource) {
        if (C7384Etj.areEqual(hatchCvmReplacement2, hatchCvmReplacement) || !(hatchCvmReplacement2 instanceof HatchCvmReplacement.Active)) {
            return;
        }
        HatchCvmReplacement.Active active = (HatchCvmReplacement.Active) hatchCvmReplacement2;
        CFK.A0G(TAG, "CVM replacement observed: attempt=%s state=%s ownerNoncePresent=%s source=%s vm=%s", active.attemptId, active.state, Boolean.valueOf(AnonymousClass002.A1X(active.ownerNonce)), hatchCvmReplaceSource, HatcheryVMIdUtilsKt.vmIdForLog(active.vmId));
    }

    public /* synthetic */ HatchCvmReplaceStore(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}

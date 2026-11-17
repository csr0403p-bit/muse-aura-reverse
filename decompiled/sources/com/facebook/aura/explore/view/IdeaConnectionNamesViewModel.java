package com.facebook.aura.explore.view;

import X.AEs;
import X.AEu;
import X.AGI;
import X.AHD;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.BLG;
import X.BO6;
import X.C0953AJg;
import X.C1BN;
import X.C3Pi;
import X.C3UX;
import X.C7384Etj;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0V;
import X.HnJ;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.explore.api.IdeaConnectionNames;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public final class IdeaConnectionNamesViewModel extends AEs {
    public static final int $stable = 8;
    public final BLG<BO6<List<String>, AHD<String>>> _names;
    public final C1BN<BO6<List<String>, AHD<String>>> names;
    public final ConcurrentHashMap.KeySetView<List<String>, Boolean> requested;
    public final AbstractC3358CGz userSession;

    public final class Factory extends AuraViewModelFactory<IdeaConnectionNamesViewModel> {
        public static final int $stable = 8;
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public /* bridge */ /* synthetic */ AEs create() {
            return new IdeaConnectionNamesViewModel(this.userSession);
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public IdeaConnectionNamesViewModel create() {
            return new IdeaConnectionNamesViewModel(this.userSession);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.explore.view.IdeaConnectionNamesViewModel$load$1", f = "IdeaConnectionNamesViewModel.kt", l = {34}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.explore.view.IdeaConnectionNamesViewModel$load$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ List<String> $connectionIds;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List<String> list, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$connectionIds = list;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return IdeaConnectionNamesViewModel.this.new AnonymousClass1(this.$connectionIds, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            BO6<List<String>, AHD<String>> value;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                IdeaConnectionNames ideaConnectionNames = IdeaConnectionNames.INSTANCE;
                AbstractC3358CGz abstractC3358CGz = IdeaConnectionNamesViewModel.this.userSession;
                List<String> list = this.$connectionIds;
                this.label = 1;
                obj = ideaConnectionNames.names(abstractC3358CGz, list, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            AHD ahdA07 = AGI.A07((Iterable) obj);
            BLG<BO6<List<String>, AHD<String>>> blg = IdeaConnectionNamesViewModel.this._names;
            List<String> list2 = this.$connectionIds;
            do {
                value = blg.getValue();
            } while (!blg.A6e(value, AGI.A0F(AnonymousClass006.A11(list2, ahdA07, value))));
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public IdeaConnectionNamesViewModel(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.userSession = abstractC3358CGz;
        C9286GCn c9286GCnA01 = HnJ.A01(C0953AJg.A00());
        this._names = c9286GCnA01;
        this.names = C3Pi.A00(c9286GCnA01);
        this.requested = ConcurrentHashMap.newKeySet();
    }

    public final void load(List<String> list) {
        C7384Etj.A0Y(list, 0);
        if (list.isEmpty() || !this.requested.add(list)) {
            return;
        }
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new AnonymousClass1(list, null), AEu.A00(this));
    }

    public final C1BN<BO6<List<String>, AHD<String>>> getNames() {
        return this.names;
    }
}

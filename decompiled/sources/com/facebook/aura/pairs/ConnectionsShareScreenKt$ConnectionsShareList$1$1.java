package com.facebook.aura.pairs;

import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C1160Acs;
import X.C1161Act;
import X.C16C;
import X.C1BO;
import X.C20Z;
import X.C3UX;
import X.C6v3;
import X.EnumC10460Hji;
import X.G0V;
import X.GDB;
import X.HtJ;
import X.Hwg;
import androidx.compose.foundation.lazy.LazyListState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.pairs.ConnectionsShareScreenKt$ConnectionsShareList$1$1", f = "ConnectionsShareScreen.kt", l = {198}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class ConnectionsShareScreenKt$ConnectionsShareList$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C1BO<Function0<Unit>> $currentOnLoadMore$delegate;
    public final /* synthetic */ LazyListState $listState;
    public int label;

    /* renamed from: com.facebook.aura.pairs.ConnectionsShareScreenKt$ConnectionsShareList$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Boolean> {
        public final /* synthetic */ LazyListState $listState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LazyListState lazyListState) {
            super(0);
            this.$listState = lazyListState;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            C1161Act c1161Act = (C1161Act) this.$listState.A04();
            C16C c16c = (C16C) AbstractC0878AGe.A0I(c1161Act.A0D);
            return Boolean.valueOf((c16c != null ? ((C1160Acs) c16c).A07 : -1) >= c1161Act.A05 + (-5));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConnectionsShareScreenKt$ConnectionsShareList$1$1(LazyListState lazyListState, C1BO<? extends Function0<Unit>> c1bo, HtJ<? super ConnectionsShareScreenKt$ConnectionsShareList$1$1> htJ) {
        super(2, htJ);
        this.$listState = lazyListState;
        this.$currentOnLoadMore$delegate = c1bo;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new ConnectionsShareScreenKt$ConnectionsShareList$1$1(this.$listState, this.$currentOnLoadMore$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            ConnectionsShareScreenKt$ConnectionsShareList$1$1$invokeSuspend$$inlined$filter$1 connectionsShareScreenKt$ConnectionsShareList$1$1$invokeSuspend$$inlined$filter$1 = new ConnectionsShareScreenKt$ConnectionsShareList$1$1$invokeSuspend$$inlined$filter$1(GDB.A01(C6v3.A01(new AnonymousClass1(this.$listState))));
            final C1BO<Function0<Unit>> c1bo = this.$currentOnLoadMore$delegate;
            C20Z<? super Boolean> c20z = new C20Z() { // from class: com.facebook.aura.pairs.ConnectionsShareScreenKt$ConnectionsShareList$1$1.3
                public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                    C1BO.A0D(c1bo);
                    return Unit.INSTANCE;
                }

                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    C1BO.A0D(c1bo);
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (connectionsShareScreenKt$ConnectionsShareList$1$1$invokeSuspend$$inlined$filter$1.collect(c20z, this) == enumC10460Hji) {
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
        return ((ConnectionsShareScreenKt$ConnectionsShareList$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}

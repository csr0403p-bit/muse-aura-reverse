package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass037;
import X.BFM;
import X.C0CD;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import com.facebook.aura.pairs.ConnectionsUiState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ConnectionsTabScreenKt$ConnectionsTabContent$2$1 extends AbstractC7559F3s implements G0U<C0CD, Unit> {
    public final /* synthetic */ int $connectionCount;
    public final /* synthetic */ ConnectionsLogContext $log;
    public final /* synthetic */ Function0<Unit> $openAdd;
    public final /* synthetic */ ConnectionsUiState.Loaded $state;
    public final /* synthetic */ ConnectionsViewModel $viewModel;

    /* renamed from: com.facebook.aura.pairs.ConnectionsTabScreenKt$ConnectionsTabContent$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ ConnectionsLogContext $log;
        public final /* synthetic */ Function0<Unit> $openAdd;
        public final /* synthetic */ ConnectionsUiState.Loaded $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ConnectionsUiState.Loaded loaded, ConnectionsLogContext connectionsLogContext, Function0<Unit> function0) {
            super(3);
            this.$state = loaded;
            this.$log = connectionsLogContext;
            this.$openAdd = function0;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                bfm.Afo();
            } else {
                ConnectionsUiState.Loaded loaded = this.$state;
                ConnectionsTabScreenKt.ConnectionsRow(loaded.connections, loaded.groups, this.$log, this.$openAdd, null, bfm, ConnectionsPerson.$stable | (ConnectionsGroup.$stable << 3) | (ConnectionsLogContext.$stable << 6), 16);
            }
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C0CD c0cd) {
        C7384Etj.A0Y(c0cd, 0);
        c0cd.APJ("title", null, ComposableSingletons$ConnectionsTabScreenKt.f205lambda$409871384);
        int i = this.$connectionCount;
        ConnectionsUiState.Loaded loaded = this.$state;
        if (i == 0) {
            ConnectionsTabScreenKt.connectionsSuggestions(c0cd, loaded, this.$viewModel, this.$log, this.$openAdd);
        } else {
            c0cd.APJ("row", null, AnonymousClass001.A0M(new AnonymousClass1(loaded, this.$log, this.$openAdd), -1253950836));
        }
        c0cd.APJ("divider", null, ComposableSingletons$ConnectionsTabScreenKt.f203lambda$318013153);
        ConnectionsTabScreenKt.connectionsActivity(c0cd, this.$state, this.$viewModel, this.$log);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionsTabScreenKt$ConnectionsTabContent$2$1(int i, ConnectionsUiState.Loaded loaded, ConnectionsViewModel connectionsViewModel, ConnectionsLogContext connectionsLogContext, Function0<Unit> function0) {
        super(1);
        this.$connectionCount = i;
        this.$state = loaded;
        this.$viewModel = connectionsViewModel;
        this.$log = connectionsLogContext;
        this.$openAdd = function0;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C0CD c0cd) {
        invoke2(c0cd);
        return Unit.INSTANCE;
    }
}

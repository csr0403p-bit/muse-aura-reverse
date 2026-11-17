package com.facebook.aura.pairs;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass037;
import X.B1V;
import X.BFM;
import X.BRg;
import X.C06G;
import X.C0CD;
import X.C1822Arm;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0V;
import X.G0W;
import X.G2j;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ConnectionsShareScreenKt$ConnectionsShareList$2$1 extends AbstractC7559F3s implements G0U<C0CD, Unit> {
    public final /* synthetic */ G0W<String, Integer, Boolean, Unit> $onToggle;
    public final /* synthetic */ String $title;
    public final /* synthetic */ ConnectionsShareUiState $uiState;

    /* renamed from: com.facebook.aura.pairs.ConnectionsShareScreenKt$ConnectionsShareList$2$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str) {
            super(3);
            this.$title = str;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, anonymousClass037), bfm, i)) {
                C1822Arm c1822ArmA0X = C06G.A0X(bfm);
                long jA0C = C06G.A0C(bfm);
                AuraTextKt.m2639AuraTextUY9GdpU(this.$title, C3U4.A0B(BRg.A00, 4.0f, 4.0f), jA0C, c1822ArmA0X, null, null, null, false, 0, 2, 2, null, null, null, bfm, 805306416, 6, 14832);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C0CD c0cd) {
        C7384Etj.A0Y(c0cd, 0);
        String str = this.$title;
        if (str.length() > 0) {
            c0cd.APJ("title", null, B1V.A01(new AnonymousClass1(str), -1582349657, true));
        }
        final ConnectionsShareUiState connectionsShareUiState = this.$uiState;
        final AHD<ConnectionsShareTarget> ahd = connectionsShareUiState.targets;
        final AnonymousClass2 anonymousClass2 = AnonymousClass2.INSTANCE;
        final G0W<String, Integer, Boolean, Unit> g0w = this.$onToggle;
        c0cd.APL(anonymousClass2 != null ? new G0U<Integer, Object>() { // from class: com.facebook.aura.pairs.ConnectionsShareScreenKt$ConnectionsShareList$2$1$invoke$$inlined$itemsIndexed$default$1
            public final Object invoke(int i) {
                return AnonymousClass006.A0n(Integer.valueOf(i), ahd, anonymousClass2, i);
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(AnonymousClass001.A0F(num));
            }
        } : null, new G0U<Integer, Object>() { // from class: com.facebook.aura.pairs.ConnectionsShareScreenKt$ConnectionsShareList$2$1$invoke$$inlined$itemsIndexed$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                ahd.get(AnonymousClass001.A0F(num));
                return null;
            }

            public final Object invoke(int i) {
                ahd.get(i);
                return null;
            }
        }, B1V.A01(new G2j<AnonymousClass037, Integer, BFM, Integer, Unit>() { // from class: com.facebook.aura.pairs.ConnectionsShareScreenKt$ConnectionsShareList$2$1$invoke$$inlined$itemsIndexed$default$3
            public final void invoke(AnonymousClass037 anonymousClass037, int i, BFM bfm, int i2) {
                int iA0d = (i2 & 6) == 0 ? i2 | AnonymousClass004.A0d(bfm, anonymousClass037) : i2;
                if ((i2 & 48) == 0) {
                    iA0d |= AnonymousClass004.A0E(bfm, i);
                }
                if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
                    bfm.Afo();
                    return;
                }
                ConnectionsShareTarget connectionsShareTarget = (ConnectionsShareTarget) ahd.get(i);
                bfm.AgE(-483370072);
                boolean zContains = connectionsShareUiState.selected.contains(connectionsShareTarget.connectionId);
                ConnectionsShareStatus connectionsShareStatus = connectionsShareUiState.statuses.get(connectionsShareTarget.connectionId);
                boolean z = !(!connectionsShareUiState.statuses.isEmpty());
                boolean zA1U = AnonymousClass001.A1U(bfm, zContains, AnonymousClass003.A1J(bfm, g0w, connectionsShareTarget) | ((((iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) ^ 48) > 32 && bfm.A63(i)) || (iA0d & 48) == 32));
                Object objAaT = bfm.AaT();
                if (zA1U || objAaT == C78N.A00) {
                    objAaT = new ConnectionsShareScreenKt$ConnectionsShareList$2$1$3$1$1(g0w, connectionsShareTarget, i, zContains);
                    bfm.Ai0(objAaT);
                }
                ConnectionsShareScreenKt.ConnectionsShareRow(connectionsShareTarget, zContains, connectionsShareStatus, z, (Function0) objAaT, null, bfm, ConnectionsShareTarget.$stable, 32);
                AnonymousClass002.A19(bfm);
            }

            @Override // X.G2j
            public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, Integer num, BFM bfm, Integer num2) {
                invoke(anonymousClass037, AnonymousClass001.A0F(num), bfm, AnonymousClass001.A0F(num2));
                return Unit.INSTANCE;
            }
        }, 2039820996, true), ahd.size());
        if (this.$uiState.isLoadingMore) {
            c0cd.APJ(AuraButtonKt.LOADING_TAG, null, ComposableSingletons$ConnectionsShareScreenKt.lambda$2055560528);
        }
    }

    /* renamed from: com.facebook.aura.pairs.ConnectionsShareScreenKt$ConnectionsShareList$2$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<Integer, ConnectionsShareTarget, Object> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(2);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(Integer num, ConnectionsShareTarget connectionsShareTarget) {
            AnonymousClass005.A0w(num);
            ConnectionsShareTarget connectionsShareTarget2 = connectionsShareTarget;
            C7384Etj.A0Y(connectionsShareTarget2, 1);
            return connectionsShareTarget2.connectionId;
        }

        public final Object invoke(int i, ConnectionsShareTarget connectionsShareTarget) {
            C7384Etj.A0Y(connectionsShareTarget, 1);
            return connectionsShareTarget.connectionId;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConnectionsShareScreenKt$ConnectionsShareList$2$1(String str, ConnectionsShareUiState connectionsShareUiState, G0W<? super String, ? super Integer, ? super Boolean, Unit> g0w) {
        super(1);
        this.$title = str;
        this.$uiState = connectionsShareUiState;
        this.$onToggle = g0w;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C0CD c0cd) {
        invoke2(c0cd);
        return Unit.INSTANCE;
    }
}

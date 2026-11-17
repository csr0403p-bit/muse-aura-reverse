package com.facebook.aura.pairs;

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
import X.C0CD;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0V;
import X.G0W;
import X.G2j;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ConnectionsTabScreenKt$ConnectionsRow$1$1 extends AbstractC7559F3s implements G0U<C0CD, Unit> {
    public final /* synthetic */ List<ConnectionsPerson> $connections;
    public final /* synthetic */ List<ConnectionsGroup> $groups;
    public final /* synthetic */ ConnectionsLogContext $log;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ Function0<Unit> $onOpenAdd;

    /* renamed from: com.facebook.aura.pairs.ConnectionsTabScreenKt$ConnectionsRow$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ ConnectionsLogContext $log;
        public final /* synthetic */ Function0<Unit> $onOpenAdd;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ConnectionsLogContext connectionsLogContext, Function0<Unit> function0) {
            super(3);
            this.$log = connectionsLogContext;
            this.$onOpenAdd = function0;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                bfm.Afo();
                return;
            }
            boolean zA1R = AnonymousClass001.A1R(bfm, this.$onOpenAdd, bfm.A67(this.$log));
            ConnectionsLogContext connectionsLogContext = this.$log;
            Function0<Unit> function0 = this.$onOpenAdd;
            Object objAaT = bfm.AaT();
            if (zA1R || objAaT == C78N.A00) {
                objAaT = new ConnectionsTabScreenKt$ConnectionsRow$1$1$1$1$1(connectionsLogContext, function0);
                bfm.Ai0(objAaT);
            }
            ConnectionsTabScreenKt.ConnectionsConnectChip((Function0) objAaT, null, bfm, 0, 2);
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
        c0cd.APJ("connect", null, B1V.A01(new AnonymousClass1(this.$log, this.$onOpenAdd), 810598284, true));
        final List<ConnectionsPerson> list = this.$connections;
        final AnonymousClass2 anonymousClass2 = AnonymousClass2.INSTANCE;
        final ConnectionsLogContext connectionsLogContext = this.$log;
        final AuraNavigator auraNavigator = this.$navigator;
        c0cd.APL(anonymousClass2 != null ? new G0U<Integer, Object>() { // from class: com.facebook.aura.pairs.ConnectionsTabScreenKt$ConnectionsRow$1$1$invoke$$inlined$itemsIndexed$default$1
            public final Object invoke(int i) {
                return AnonymousClass006.A0n(Integer.valueOf(i), list, anonymousClass2, i);
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(AnonymousClass001.A0F(num));
            }
        } : null, new G0U<Integer, Object>() { // from class: com.facebook.aura.pairs.ConnectionsTabScreenKt$ConnectionsRow$1$1$invoke$$inlined$itemsIndexed$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                list.get(AnonymousClass001.A0F(num));
                return null;
            }

            public final Object invoke(int i) {
                list.get(i);
                return null;
            }
        }, B1V.A01(new G2j<AnonymousClass037, Integer, BFM, Integer, Unit>() { // from class: com.facebook.aura.pairs.ConnectionsTabScreenKt$ConnectionsRow$1$1$invoke$$inlined$itemsIndexed$default$3
            public final void invoke(AnonymousClass037 anonymousClass037, int i, BFM bfm, int i2) {
                int iA0d = (i2 & 6) == 0 ? AnonymousClass004.A0d(bfm, anonymousClass037) | i2 : i2;
                if ((i2 & 48) == 0) {
                    iA0d |= AnonymousClass004.A0E(bfm, i);
                }
                if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
                    bfm.Afo();
                    return;
                }
                ConnectionsPerson connectionsPerson = (ConnectionsPerson) list.get(i);
                bfm.AgE(-718820899);
                boolean zA1V = AnonymousClass002.A1V(bfm, connectionsPerson, bfm.A67(connectionsLogContext) | ((((iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) ^ 48) > 32 && bfm.A63(i)) || (iA0d & 48) == 32), bfm.A67(auraNavigator));
                Object objAaT = bfm.AaT();
                if (zA1V || objAaT == C78N.A00) {
                    objAaT = new ConnectionsTabScreenKt$ConnectionsRow$1$1$3$1$1(connectionsLogContext, i, auraNavigator, connectionsPerson);
                    bfm.Ai0(objAaT);
                }
                ConnectionsTabScreenKt.ConnectionsAvatar(connectionsPerson, (Function0) objAaT, null, bfm, ConnectionsPerson.$stable, 4);
                AnonymousClass002.A19(bfm);
            }

            @Override // X.G2j
            public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, Integer num, BFM bfm, Integer num2) {
                invoke(anonymousClass037, AnonymousClass001.A0F(num), bfm, AnonymousClass001.A0F(num2));
                return Unit.INSTANCE;
            }
        }, 2039820996, true), list.size());
        final List<ConnectionsGroup> list2 = this.$groups;
        final AnonymousClass4 anonymousClass4 = AnonymousClass4.INSTANCE;
        final ConnectionsLogContext connectionsLogContext2 = this.$log;
        final List<ConnectionsPerson> list3 = this.$connections;
        final AuraNavigator auraNavigator2 = this.$navigator;
        c0cd.APL(anonymousClass4 != null ? new G0U<Integer, Object>() { // from class: com.facebook.aura.pairs.ConnectionsTabScreenKt$ConnectionsRow$1$1$invoke$$inlined$itemsIndexed$default$4
            public final Object invoke(int i) {
                return AnonymousClass006.A0n(Integer.valueOf(i), list2, anonymousClass4, i);
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(AnonymousClass001.A0F(num));
            }
        } : null, new G0U<Integer, Object>() { // from class: com.facebook.aura.pairs.ConnectionsTabScreenKt$ConnectionsRow$1$1$invoke$$inlined$itemsIndexed$default$5
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                list2.get(AnonymousClass001.A0F(num));
                return null;
            }

            public final Object invoke(int i) {
                list2.get(i);
                return null;
            }
        }, B1V.A01(new G2j<AnonymousClass037, Integer, BFM, Integer, Unit>() { // from class: com.facebook.aura.pairs.ConnectionsTabScreenKt$ConnectionsRow$1$1$invoke$$inlined$itemsIndexed$default$6
            public final void invoke(AnonymousClass037 anonymousClass037, int i, BFM bfm, int i2) {
                int iA0d = (i2 & 6) == 0 ? AnonymousClass004.A0d(bfm, anonymousClass037) | i2 : i2;
                if ((i2 & 48) == 0) {
                    iA0d |= AnonymousClass004.A0E(bfm, i);
                }
                if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
                    bfm.Afo();
                    return;
                }
                ConnectionsGroup connectionsGroup = (ConnectionsGroup) list2.get(i);
                bfm.AgE(-737502105);
                String str = connectionsGroup.displayName;
                boolean zA1T = AnonymousClass001.A1T(bfm, auraNavigator2, AnonymousClass001.A1T(bfm, list3, AnonymousClass003.A1M(bfm, connectionsLogContext2, connectionsGroup)) | ((((iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) ^ 48) > 32 && bfm.A63(i)) || (iA0d & 48) == 32));
                Object objAaT = bfm.AaT();
                if (zA1T || objAaT == C78N.A00) {
                    objAaT = new ConnectionsTabScreenKt$ConnectionsRow$1$1$5$1$1(connectionsLogContext2, connectionsGroup, list3, i, auraNavigator2);
                    bfm.Ai0(objAaT);
                }
                ConnectionsTabScreenKt.ConnectionsRowItem(str, (Function0) objAaT, null, ComposableSingletons$ConnectionsTabScreenKt.f204lambda$377387563, bfm, 3072, 4);
                AnonymousClass002.A19(bfm);
            }

            @Override // X.G2j
            public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, Integer num, BFM bfm, Integer num2) {
                invoke(anonymousClass037, AnonymousClass001.A0F(num), bfm, AnonymousClass001.A0F(num2));
                return Unit.INSTANCE;
            }
        }, 2039820996, true), list2.size());
    }

    /* renamed from: com.facebook.aura.pairs.ConnectionsTabScreenKt$ConnectionsRow$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<Integer, ConnectionsPerson, Object> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(2);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(Integer num, ConnectionsPerson connectionsPerson) {
            AnonymousClass005.A0w(num);
            ConnectionsPerson connectionsPerson2 = connectionsPerson;
            C7384Etj.A0Y(connectionsPerson2, 1);
            return connectionsPerson2.contact.museId;
        }

        public final Object invoke(int i, ConnectionsPerson connectionsPerson) {
            C7384Etj.A0Y(connectionsPerson, 1);
            return connectionsPerson.contact.museId;
        }
    }

    /* renamed from: com.facebook.aura.pairs.ConnectionsTabScreenKt$ConnectionsRow$1$1$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<Integer, ConnectionsGroup, Object> {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        public AnonymousClass4() {
            super(2);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(Integer num, ConnectionsGroup connectionsGroup) {
            AnonymousClass005.A0w(num);
            ConnectionsGroup connectionsGroup2 = connectionsGroup;
            C7384Etj.A0Y(connectionsGroup2, 1);
            return connectionsGroup2.connectionId;
        }

        public final Object invoke(int i, ConnectionsGroup connectionsGroup) {
            C7384Etj.A0Y(connectionsGroup, 1);
            return connectionsGroup.connectionId;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionsTabScreenKt$ConnectionsRow$1$1(List<ConnectionsPerson> list, List<ConnectionsGroup> list2, ConnectionsLogContext connectionsLogContext, Function0<Unit> function0, AuraNavigator auraNavigator) {
        super(1);
        this.$connections = list;
        this.$groups = list2;
        this.$log = connectionsLogContext;
        this.$onOpenAdd = function0;
        this.$navigator = auraNavigator;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C0CD c0cd) {
        invoke2(c0cd);
        return Unit.INSTANCE;
    }
}

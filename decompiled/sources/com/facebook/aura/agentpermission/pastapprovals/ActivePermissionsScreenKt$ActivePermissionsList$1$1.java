package com.facebook.aura.agentpermission.pastapprovals;

import X.AHD;
import X.AHH;
import X.AbstractC0878AGe;
import X.AbstractC0885AGm;
import X.AbstractC2258BHp;
import X.AbstractC7536F0j;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass037;
import X.BFM;
import X.BO6;
import X.C0CD;
import X.C3cG;
import X.C7384Etj;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G0W;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.agentpermission.ConnectorPermissionMode;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ActivePermissionsScreenKt$ActivePermissionsList$1$1 extends AbstractC7559F3s implements G0U<C0CD, Unit> {
    public final /* synthetic */ long $destructiveTextColor;
    public final /* synthetic */ MutableState<String> $menuPermissionId$delegate;
    public final /* synthetic */ Function0<Unit> $onDismissMenu;
    public final /* synthetic */ Function0<Unit> $onLoadMore;
    public final /* synthetic */ G0U<String, Unit> $onMenuRequested;
    public final /* synthetic */ G0V<ActivePermission, ConnectorPermissionMode, Unit> $onModeSelected;
    public final /* synthetic */ Function0<Unit> $onReset;
    public final /* synthetic */ G0U<ActivePermission, Unit> $onRevoke;
    public final /* synthetic */ String $resetLabel;
    public final /* synthetic */ BO6<ActivePermissionScopeType, String> $scopeTypeLabels;
    public final /* synthetic */ AHH<ActivePermissionGroup> $supportedGroups;
    public final /* synthetic */ ActivePermissionsUiState $uiState;
    public final /* synthetic */ AHH<ActivePermission> $ungroupedPermissions;
    public final /* synthetic */ String $websiteSectionTitle;

    /* renamed from: com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsScreenKt$ActivePermissionsList$1$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> $onLoadMore;
        public final /* synthetic */ ActivePermissionsUiState $uiState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ActivePermissionsUiState activePermissionsUiState, Function0<Unit> function0) {
            super(3);
            this.$uiState = activePermissionsUiState;
            this.$onLoadMore = function0;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void invoke(X.AnonymousClass037 r41, X.BFM r42, int r43) {
            /*
                r40 = this;
                r5 = 0
                r0 = r41
                X.C7384Etj.A0Y(r0, r5)
                r2 = r43
                r1 = r43 & 17
                r0 = 16
                r4 = 1
                boolean r0 = X.AnonymousClass002.A1P(r1, r0)
                r6 = r42
                boolean r0 = X.AnonymousClass001.A1b(r0, r6, r2)
                if (r0 == 0) goto Lae
                r12 = 0
                X.ATq r1 = X.C10G.A02
                float r0 = com.facebook.aura.vds.compose.base.AuraDimensKt.SpacingSmall
                X.BRg r1 = X.C3U4.A04(r1, r0)
                androidx.compose.ui.Alignment r0 = X.C2VU.A09
                r2 = r40
                com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsUiState r7 = r2.$uiState
                kotlin.jvm.functions.Function0<kotlin.Unit> r3 = r2.$onLoadMore
                X.AiA r11 = X.C3Ue.A01(r0, r5)
                r2 = r6
                X.BBI r2 = (X.BBI) r2
                int r10 = X.AnonymousClass003.A0J(r2)
                X.AKQ r9 = X.BBI.A04(r2)
                X.BRg r8 = X.AxM.A01(r6, r1)
                kotlin.jvm.functions.Function0<X.AkQ> r1 = X.C1515AkP.A00
                X.Ahw<?> r0 = r2.A0V
                if (r0 != 0) goto L4b
                X.C00x.A00()
                X.F60 r0 = X.F60.createAndThrow()
                throw r0
            L4b:
                X.AnonymousClass005.A0n(r6, r2, r1)
                X.AnonymousClass005.A0p(r6, r11, r9, r8, r10)
                r0 = 2131886355(0x7f120113, float:1.9407287E38)
                java.lang.String r13 = X.AbstractC2271BQs.A01(r6, r0)
                com.facebook.aura.vds.compose.button.AuraLabelButtonStyle r16 = X.AnonymousClass006.A0g(r6)
                com.facebook.aura.vds.compose.button.AuraButtonSize r17 = com.facebook.aura.vds.compose.button.AuraButtonSize.SMALL
                boolean r1 = r7.isLoadingMore
                if (r1 != 0) goto L70
                boolean r0 = r7.isResetting
                if (r0 != 0) goto L70
                java.lang.String r0 = r7.revokingPermissionId
                if (r0 != 0) goto L70
                java.lang.String r0 = r7.updatingPermissionId
                r21 = 1
                if (r0 == 0) goto L72
            L70:
                r21 = 0
            L72:
                r42 = 24576(0x6000, float:3.4438E-41)
                r43 = 117422541(0x6ffb9cd, float:9.619335E-35)
                r40 = 196608(0x30000, float:2.75506E-40)
                r14 = r12
                r15 = r12
                r18 = r12
                r20 = r5
                r22 = r1
                r23 = r5
                r24 = r12
                r25 = r12
                r26 = r3
                r27 = r12
                r28 = r12
                r29 = r12
                r30 = r12
                r31 = r12
                r32 = r12
                r33 = r12
                r34 = r12
                r35 = r5
                r36 = r4
                r37 = r5
                r38 = r5
                r39 = r6
                r41 = r5
                r19 = r5
                com.facebook.aura.vds.compose.button.AuraButtonKt.m2408AuraButtonnL3aKkM(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)
                X.BBI.A0R(r2, r4)
                return
            Lae:
                r6.Afo()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsScreenKt$ActivePermissionsList$1$1.AnonymousClass2.invoke(X.037, X.BFM, int):void");
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsScreenKt$ActivePermissionsList$1$1$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ long $destructiveTextColor;
        public final /* synthetic */ Function0<Unit> $onReset;
        public final /* synthetic */ String $resetLabel;
        public final /* synthetic */ ActivePermissionsUiState $uiState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ActivePermissionsUiState activePermissionsUiState, String str, Function0<Unit> function0, long j) {
            super(3);
            this.$uiState = activePermissionsUiState;
            this.$resetLabel = str;
            this.$onReset = function0;
            this.$destructiveTextColor = j;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0041  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void invoke(X.AnonymousClass037 r36, X.BFM r37, int r38) {
            /*
                r35 = this;
                r14 = 0
                r0 = r36
                X.C7384Etj.A0Y(r0, r14)
                r3 = r38
                r1 = r38 & 17
                r0 = 16
                r31 = 1
                boolean r0 = X.AnonymousClass002.A1P(r1, r0)
                r2 = r37
                boolean r0 = X.AnonymousClass001.A1b(r0, r2, r3)
                if (r0 == 0) goto L97
                r7 = 0
                X.ATq r1 = X.C10G.A02
                float r0 = com.facebook.aura.vds.compose.base.AuraDimensKt.SpacingMedium
                X.BRg r1 = X.C3U4.A04(r1, r0)
                r0 = 1112539136(0x42500000, float:52.0)
                X.BRg r10 = X.C10G.A04(r1, r0)
                com.facebook.aura.vds.compose.button.AuraLabelButtonStyle r11 = X.AnonymousClass006.A0g(r2)
                com.facebook.aura.vds.compose.button.AuraButtonSize r12 = com.facebook.aura.vds.compose.button.AuraButtonSize.LARGE
                r4 = r35
                com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsUiState r1 = r4.$uiState
                java.lang.String r0 = r1.revokingPermissionId
                if (r0 != 0) goto L41
                java.lang.String r0 = r1.updatingPermissionId
                if (r0 != 0) goto L41
                boolean r0 = r1.isLoadingMore
                r16 = 1
                if (r0 == 0) goto L43
            L41:
                r16 = 0
            L43:
                boolean r5 = r1.isResetting
                java.lang.String r8 = r4.$resetLabel
                kotlin.jvm.functions.Function0<kotlin.Unit> r3 = r4.$onReset
                long r0 = r4.$destructiveTextColor
                boolean r6 = r2.A64(r0)
                long r0 = r4.$destructiveTextColor
                java.lang.Object r4 = r2.AaT()
                if (r6 != 0) goto L5b
                java.lang.Object r6 = X.C78N.A00
                if (r4 != r6) goto L63
            L5b:
                com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsScreenKt$ActivePermissionsList$1$1$3$1$1 r4 = new com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsScreenKt$ActivePermissionsList$1$1$3$1$1
                r4.<init>(r0)
                r2.Ai0(r4)
            L63:
                kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
                r37 = 24576(0x6000, float:3.4438E-41)
                r38 = 117291461(0x6fdb9c5, float:9.5440986E-35)
                r35 = 196608(0x30000, float:2.75506E-40)
                r9 = r7
                r13 = r7
                r15 = r14
                r18 = r14
                r19 = r7
                r20 = r7
                r21 = r3
                r22 = r7
                r23 = r7
                r24 = r4
                r25 = r7
                r26 = r7
                r27 = r7
                r28 = r7
                r29 = r7
                r30 = r14
                r32 = r14
                r33 = r14
                r34 = r2
                r36 = r14
                r17 = r5
                com.facebook.aura.vds.compose.button.AuraButtonKt.m2408AuraButtonnL3aKkM(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
                return
            L97:
                r2.Afo()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsScreenKt$ActivePermissionsList$1$1.AnonymousClass3.invoke(X.037, X.BFM, int):void");
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C0CD c0cd) {
        G0W<? super AnonymousClass037, ? super BFM, ? super Integer, Unit> g0wA0M;
        String str;
        String str2;
        C7384Etj.A0Y(c0cd, 0);
        ActivePermissionsUiState activePermissionsUiState = this.$uiState;
        if (activePermissionsUiState.loadingState == ActivePermissionsLoadingState.SUCCESS) {
            if (activePermissionsUiState.isGrouped) {
                AHH<ActivePermissionGroup> ahh = this.$supportedGroups;
                BO6<ActivePermissionScopeType, String> bo6 = this.$scopeTypeLabels;
                G0U<ActivePermission, Unit> g0u = this.$onRevoke;
                G0U<String, Unit> g0u2 = this.$onMenuRequested;
                Function0<Unit> function0 = this.$onDismissMenu;
                G0V<ActivePermission, ConnectorPermissionMode, Unit> g0v = this.$onModeSelected;
                MutableState<String> mutableState = this.$menuPermissionId$delegate;
                int i = 0;
                for (Object obj : ahh) {
                    int i2 = i + 1;
                    if (i < 0) {
                        AbstractC0885AGm.A14();
                        throw F60.createAndThrow();
                    }
                    ActivePermissionGroup activePermissionGroup = (ActivePermissionGroup) obj;
                    ActivePermissionScope activePermissionScope = activePermissionGroup.scope;
                    ActivePermissionScopeType activePermissionScopeType = activePermissionScope.type;
                    String strA0d = FGI.A0d("scope_", activePermissionScopeType.getWireValue(), "_", activePermissionScope.sessionScopeId);
                    String str3 = activePermissionScope.displayName;
                    if (str3 == null) {
                        C7384Etj.A0Y(bo6, 0);
                        str3 = (String) AbstractC2258BHp.A0L(activePermissionScopeType, bo6);
                    }
                    List<ActivePermission> list = activePermissionGroup.items;
                    String strA05 = MutableState.A05(mutableState);
                    ActivePermissionScopeType activePermissionScopeType2 = activePermissionGroup.scope.type;
                    C7384Etj.A0Y(bo6, 0);
                    ActivePermissionsScreenKt.activePermissionSection(c0cd, strA0d, str3, list, activePermissionsUiState, g0u, strA05, g0u2, function0, g0v, (String) AbstractC2258BHp.A0L(activePermissionScopeType2, bo6), AnonymousClass002.A1N(i));
                    i = i2;
                }
                ActivePermissionsScreenKt.activePermissionSection(c0cd, "scope_other", this.$websiteSectionTitle, this.$ungroupedPermissions, this.$uiState, this.$onRevoke, MutableState.A05(this.$menuPermissionId$delegate), this.$onMenuRequested, this.$onDismissMenu, this.$onModeSelected, null, !this.$supportedGroups.isEmpty());
            } else {
                AHD<ActivePermission> ahd = activePermissionsUiState.permissions;
                ArrayList arrayListA0h = C3cG.A0h();
                for (Object obj2 : ahd) {
                    if (ActivePermissionsScreenKt.isVisibleFlatPermission((ActivePermission) obj2)) {
                        arrayListA0h.add(obj2);
                    }
                }
                ActivePermissionsScreenKt.activePermissionSection(c0cd, "kind_website", this.$websiteSectionTitle, AbstractC0878AGe.A0c(arrayListA0h, new Comparator() { // from class: com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsScreenKt$ActivePermissionsList$1$1$invoke$$inlined$sortedBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return AbstractC7536F0j.A00(((ActivePermission) t).display.summaryTitle, ((ActivePermission) t2).display.summaryTitle);
                    }
                }), this.$uiState, this.$onRevoke, MutableState.A05(this.$menuPermissionId$delegate), this.$onMenuRequested, this.$onDismissMenu, this.$onModeSelected, null, false);
            }
            ActivePermissionsUiState activePermissionsUiState2 = this.$uiState;
            if (activePermissionsUiState2.canLoadMore || activePermissionsUiState2.isLoadingMore) {
                c0cd.APJ("active_permissions_load_more", "load_more", AnonymousClass001.A0M(new AnonymousClass2(activePermissionsUiState2, this.$onLoadMore), 1714453206));
            }
            g0wA0M = AnonymousClass001.A0M(new AnonymousClass3(this.$uiState, this.$resetLabel, this.$onReset, this.$destructiveTextColor), -1768359804);
            str = "active_permissions_reset";
            str2 = "reset";
        } else {
            g0wA0M = ComposableSingletons$ActivePermissionsScreenKt.lambda$54296397;
            str = "active_permissions_loading";
            str2 = AuraButtonKt.LOADING_TAG;
        }
        c0cd.APJ(str, str2, g0wA0M);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ActivePermissionsScreenKt$ActivePermissionsList$1$1(ActivePermissionsUiState activePermissionsUiState, AHH<ActivePermissionGroup> ahh, String str, AHH<ActivePermission> ahh2, G0U<? super ActivePermission, Unit> g0u, G0U<? super String, Unit> g0u2, Function0<Unit> function0, G0V<? super ActivePermission, ? super ConnectorPermissionMode, Unit> g0v, BO6<ActivePermissionScopeType, String> bo6, MutableState<String> mutableState, Function0<Unit> function02, String str2, Function0<Unit> function03, long j) {
        super(1);
        this.$uiState = activePermissionsUiState;
        this.$supportedGroups = ahh;
        this.$websiteSectionTitle = str;
        this.$ungroupedPermissions = ahh2;
        this.$onRevoke = g0u;
        this.$onMenuRequested = g0u2;
        this.$onDismissMenu = function0;
        this.$onModeSelected = g0v;
        this.$scopeTypeLabels = bo6;
        this.$menuPermissionId$delegate = mutableState;
        this.$onLoadMore = function02;
        this.$resetLabel = str2;
        this.$onReset = function03;
        this.$destructiveTextColor = j;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C0CD c0cd) {
        invoke2(c0cd);
        return Unit.INSTANCE;
    }
}

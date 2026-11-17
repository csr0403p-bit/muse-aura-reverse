package com.facebook.aura.spaces.menu;

import X.AbstractC7559F3s;
import X.BRg;
import X.BS0;
import X.C1BO;
import X.C7384Etj;
import X.C7438Evz;
import X.G0U;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupScope;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class PeerSpaceLeaveDialogKt$PeerSpaceLeaveDialog$3$1$1 extends AbstractC7559F3s implements G0U<AuraButtonGroupScope, Unit> {
    public final /* synthetic */ String $cancelLabel;
    public final /* synthetic */ String $confirmLabel;
    public final /* synthetic */ C1BO<Boolean> $leaving$delegate;
    public final /* synthetic */ Function0<Unit> $onDismiss;
    public final /* synthetic */ PeerSpaceLeaveViewModel $viewModel;

    /* renamed from: com.facebook.aura.spaces.menu.PeerSpaceLeaveDialogKt$PeerSpaceLeaveDialog$3$1$1$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 extends C7438Evz implements Function0<Unit> {
        public AnonymousClass1(Object obj) {
            super(0, obj, PeerSpaceLeaveViewModel.class, "leave", "leave()V", 0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((PeerSpaceLeaveViewModel) this.receiver).leave();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.spaces.menu.PeerSpaceLeaveDialogKt$PeerSpaceLeaveDialog$3$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ C1BO<Boolean> $leaving$delegate;
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Function0<Unit> function0, C1BO<Boolean> c1bo) {
            super(0);
            this.$onDismiss = function0;
            this.$leaving$delegate = c1bo;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (C1BO.A0F(this.$leaving$delegate)) {
                return;
            }
            this.$onDismiss.invoke();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraButtonGroupScope auraButtonGroupScope) {
        C7384Etj.A0Y(auraButtonGroupScope, 0);
        String str = this.$confirmLabel;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$viewModel);
        BS0 bs0 = BRg.A00;
        auraButtonGroupScope.destructiveButton(str, null, true, false, AuraButtonGroupsKt.DEFAULT_DESTRUCTIVE_BUTTON_ID, anonymousClass1, null, bs0);
        auraButtonGroupScope.secondaryButton(this.$cancelLabel, null, true, false, AuraButtonGroupsKt.DEFAULT_SECONDARY_BUTTON_ID, new AnonymousClass2(this.$onDismiss, this.$leaving$delegate), null, bs0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PeerSpaceLeaveDialogKt$PeerSpaceLeaveDialog$3$1$1(String str, PeerSpaceLeaveViewModel peerSpaceLeaveViewModel, String str2, Function0<Unit> function0, C1BO<Boolean> c1bo) {
        super(1);
        this.$confirmLabel = str;
        this.$viewModel = peerSpaceLeaveViewModel;
        this.$cancelLabel = str2;
        this.$onDismiss = function0;
        this.$leaving$delegate = c1bo;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraButtonGroupScope auraButtonGroupScope) {
        invoke2(auraButtonGroupScope);
        return Unit.INSTANCE;
    }
}

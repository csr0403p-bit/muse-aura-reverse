package com.facebook.aura.spaces.menu;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.spaces.repo.HatchSpacesDataSource;
import com.facebook.aura.toast.api.ToastApi;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class SpaceContextMenuKt$SpaceContextMenu$4$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C3UX $coroutineScope;
    public final /* synthetic */ boolean $isOwnedSpace;
    public final /* synthetic */ SpaceMenuLogOrigin $logOrigin;
    public final /* synthetic */ Function0<Unit> $onDeleted;
    public final /* synthetic */ MutableState<Boolean> $showDeleteConfirmation$delegate;
    public final /* synthetic */ String $slug;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    @DebugMetadata(c = "com.facebook.aura.spaces.menu.SpaceContextMenuKt$SpaceContextMenu$4$1$2", f = "SpaceContextMenu.kt", l = {493}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.spaces.menu.SpaceContextMenuKt$SpaceContextMenu$4$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ boolean $isOwnedSpace;
        public final /* synthetic */ Function0<Unit> $onDeleted;
        public final /* synthetic */ String $slug;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AbstractC3358CGz abstractC3358CGz, String str, boolean z, Function0<Unit> function0, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$userSession = abstractC3358CGz;
            this.$slug = str;
            this.$isOwnedSpace = z;
            this.$onDeleted = function0;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$userSession, this.$slug, this.$isOwnedSpace, this.$onDeleted, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchSpacesDataSource companion = HatchSpacesDataSource.Companion.getInstance(this.$userSession);
                String str = this.$slug;
                boolean z = this.$isOwnedSpace;
                this.label = 1;
                obj = companion.deleteSpace(str, z, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            if (AnonymousClass001.A1X(obj)) {
                this.$onDeleted.invoke();
            } else {
                ToastApi.INSTANCE.showToast(R.string._name_removed__res_0x7f120550);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpaceContextMenuKt$SpaceContextMenu$4$1(SpaceMenuLogOrigin spaceMenuLogOrigin, C3UX c3ux, MutableState<Boolean> mutableState, AbstractC3358CGz abstractC3358CGz, String str, boolean z, Function0<Unit> function0) {
        super(0);
        this.$logOrigin = spaceMenuLogOrigin;
        this.$coroutineScope = c3ux;
        this.$showDeleteConfirmation$delegate = mutableState;
        this.$userSession = abstractC3358CGz;
        this.$slug = str;
        this.$isOwnedSpace = z;
        this.$onDeleted = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        SpaceMenuLogOrigin spaceMenuLogOrigin = this.$logOrigin;
        if (spaceMenuLogOrigin != null) {
            SpaceMenuAnalytics.INSTANCE.logDeleteConfirm$fbandroid_express_aura_java_com_facebook_aura_spaces_menu_menu(spaceMenuLogOrigin);
        }
        MutableState.A09(false, this.$showDeleteConfirmation$delegate);
        AnonymousClass001.A1J(new AnonymousClass2(this.$userSession, this.$slug, this.$isOwnedSpace, this.$onDeleted, null), this.$coroutineScope);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

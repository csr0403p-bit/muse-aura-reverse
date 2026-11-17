package com.facebook.aura.spaces.menu;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C3UX;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.file.utils.HatchFileUIUtils;
import com.facebook.aura.library.repo.ArtifactPlacement;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.PublishSpaceSheetKey;
import com.facebook.aura.navigation.key.SavedSpaceAudienceScreenKey;
import com.facebook.aura.shortcut.HatchShortcutManager;
import com.facebook.aura.toast.api.ToastApi;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import com.facebook.aura.widgets.intf.SpaceWidgetPinning;
import com.facebook.aura.widgets.intf.SpaceWidgets;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class SpaceContextMenuKt$SpaceContextMenu$1$1 extends AbstractC7559F3s implements G0U<AuraContextMenuItem, Unit> {
    public final /* synthetic */ boolean $asBottomSheet;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C3UX $coroutineScope;
    public final /* synthetic */ String $imageUrl;
    public final /* synthetic */ SpaceInviteMenuAction $inviteAction;
    public final /* synthetic */ boolean $isPinned;
    public final /* synthetic */ SpaceMenuLogOrigin $logOrigin;
    public final /* synthetic */ MutableState<ArtifactPlacement> $moveConfirmationPlacement$delegate;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ Function0<Unit> $onChangeIcon;
    public final /* synthetic */ Function0<Unit> $onDismiss;
    public final /* synthetic */ Function0<Unit> $onRename;
    public final /* synthetic */ Function0<Unit> $onTogglePin;
    public final /* synthetic */ String $shortcutUpdatedToast;
    public final /* synthetic */ MutableState<Boolean> $showDeleteConfirmation$delegate;
    public final /* synthetic */ String $slug;
    public final /* synthetic */ String $title;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    @DebugMetadata(c = "com.facebook.aura.spaces.menu.SpaceContextMenuKt$SpaceContextMenu$1$1$2", f = "SpaceContextMenu.kt", l = {214}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.spaces.menu.SpaceContextMenuKt$SpaceContextMenu$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ boolean $asBottomSheet;
        public final /* synthetic */ Context $context;
        public final /* synthetic */ String $imageUrl;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ String $shortcutUpdatedToast;
        public final /* synthetic */ String $slug;
        public final /* synthetic */ String $title;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Context context, String str, String str2, String str3, AbstractC3358CGz abstractC3358CGz, String str4, boolean z, Function0<Unit> function0, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$context = context;
            this.$slug = str;
            this.$title = str2;
            this.$imageUrl = str3;
            this.$userSession = abstractC3358CGz;
            this.$shortcutUpdatedToast = str4;
            this.$asBottomSheet = z;
            this.$onDismiss = function0;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$context, this.$slug, this.$title, this.$imageUrl, this.$userSession, this.$shortcutUpdatedToast, this.$asBottomSheet, this.$onDismiss, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchShortcutManager hatchShortcutManager = HatchShortcutManager.INSTANCE;
                Context context = this.$context;
                String str = this.$slug;
                String str2 = this.$title;
                String str3 = this.$imageUrl;
                AbstractC3358CGz abstractC3358CGz = this.$userSession;
                String str4 = this.$shortcutUpdatedToast;
                this.label = 1;
                if (hatchShortcutManager.requestPinSpaceShortcut(context, str, str2, str3, abstractC3358CGz, str4, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            if (this.$asBottomSheet) {
                this.$onDismiss.invoke();
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.spaces.menu.SpaceContextMenuKt$SpaceContextMenu$1$1$3", f = "SpaceContextMenu.kt", l = {233}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.spaces.menu.SpaceContextMenuKt$SpaceContextMenu$1$1$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ boolean $asBottomSheet;
        public final /* synthetic */ Context $context;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ String $slug;
        public final /* synthetic */ String $title;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Context context, String str, String str2, AbstractC3358CGz abstractC3358CGz, boolean z, Function0<Unit> function0, HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
            this.$context = context;
            this.$slug = str;
            this.$title = str2;
            this.$userSession = abstractC3358CGz;
            this.$asBottomSheet = z;
            this.$onDismiss = function0;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass3(this.$context, this.$slug, this.$title, this.$userSession, this.$asBottomSheet, this.$onDismiss, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchFileUIUtils hatchFileUIUtils = HatchFileUIUtils.INSTANCE;
                Context context = this.$context;
                String str = this.$slug;
                String str2 = this.$title;
                AbstractC3358CGz abstractC3358CGz = this.$userSession;
                this.label = 1;
                if (hatchFileUIUtils.downloadSpaceExportHtml(context, str, str2, abstractC3358CGz, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            if (this.$asBottomSheet) {
                this.$onDismiss.invoke();
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass3) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraContextMenuItem auraContextMenuItem) {
        Function0<Unit> function0;
        AuraNavigator auraNavigator;
        AuraNavKey savedSpaceAudienceScreenKey;
        C3UX c3ux;
        G0V anonymousClass3;
        MutableState<ArtifactPlacement> mutableState;
        ArtifactPlacement artifactPlacement;
        int i;
        C7384Etj.A0Y(auraContextMenuItem, 0);
        SpaceMenuLogOrigin spaceMenuLogOrigin = this.$logOrigin;
        if (spaceMenuLogOrigin != null) {
            SpaceMenuAnalytics.INSTANCE.logOptionClick$fbandroid_express_aura_java_com_facebook_aura_spaces_menu_menu(spaceMenuLogOrigin, auraContextMenuItem.id, this.$isPinned);
        }
        if (!this.$asBottomSheet && (i = auraContextMenuItem.id) != 10 && i != 11) {
            this.$onDismiss.invoke();
        }
        switch (auraContextMenuItem.id) {
            case 0:
                auraNavigator = this.$navigator;
                savedSpaceAudienceScreenKey = new PublishSpaceSheetKey(this.$slug, this.$title, this.$imageUrl);
                auraNavigator.navigate(savedSpaceAudienceScreenKey, false);
                break;
            case 1:
                c3ux = this.$coroutineScope;
                anonymousClass3 = new AnonymousClass2(this.$context, this.$slug, this.$title, this.$imageUrl, this.$userSession, this.$shortcutUpdatedToast, this.$asBottomSheet, this.$onDismiss, null);
                AnonymousClass001.A1J(anonymousClass3, c3ux);
                break;
            case 2:
                MutableState.A09(true, this.$showDeleteConfirmation$delegate);
                break;
            case 3:
                function0 = this.$onTogglePin;
                if (function0 == null) {
                }
                function0.invoke();
                break;
            case 4:
                c3ux = this.$coroutineScope;
                anonymousClass3 = new AnonymousClass3(this.$context, this.$slug, this.$title, this.$userSession, this.$asBottomSheet, this.$onDismiss, null);
                AnonymousClass001.A1J(anonymousClass3, c3ux);
                break;
            case 5:
                function0 = this.$onChangeIcon;
                if (function0 == null) {
                }
                function0.invoke();
                break;
            case 6:
                mutableState = this.$moveConfirmationPlacement$delegate;
                artifactPlacement = ArtifactPlacement.LIBRARY;
                mutableState.Af8(artifactPlacement);
                break;
            case 7:
                mutableState = this.$moveConfirmationPlacement$delegate;
                artifactPlacement = ArtifactPlacement.SPACES;
                mutableState.Af8(artifactPlacement);
                break;
            case 8:
                function0 = this.$onRename;
                if (function0 == null) {
                }
                function0.invoke();
                break;
            case 10:
                function0 = this.$inviteAction.onClick;
                function0.invoke();
                break;
            case 11:
                if (this.$asBottomSheet) {
                    this.$navigator.dismissBottomSheetStack(1);
                } else {
                    this.$onDismiss.invoke();
                }
                auraNavigator = this.$navigator;
                savedSpaceAudienceScreenKey = new SavedSpaceAudienceScreenKey(this.$slug);
                auraNavigator.navigate(savedSpaceAudienceScreenKey, false);
                break;
            case 12:
                SpaceWidgetPinning pinning = SpaceWidgets.INSTANCE.getPinning();
                if (pinning == null || !pinning.requestPin(this.$context, this.$slug, this.$title)) {
                    ToastApi.INSTANCE.showToast(R.string._name_removed__res_0x7f12054a);
                }
                if (this.$asBottomSheet) {
                    function0 = this.$onDismiss;
                    function0.invoke();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpaceContextMenuKt$SpaceContextMenu$1$1(SpaceMenuLogOrigin spaceMenuLogOrigin, boolean z, Function0<Unit> function0, SpaceInviteMenuAction spaceInviteMenuAction, AuraNavigator auraNavigator, String str, String str2, String str3, C3UX c3ux, Context context, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, boolean z2, AbstractC3358CGz abstractC3358CGz, String str4, MutableState<ArtifactPlacement> mutableState, MutableState<Boolean> mutableState2) {
        super(1);
        this.$logOrigin = spaceMenuLogOrigin;
        this.$asBottomSheet = z;
        this.$onDismiss = function0;
        this.$inviteAction = spaceInviteMenuAction;
        this.$navigator = auraNavigator;
        this.$slug = str;
        this.$title = str2;
        this.$imageUrl = str3;
        this.$coroutineScope = c3ux;
        this.$context = context;
        this.$onRename = function02;
        this.$onChangeIcon = function03;
        this.$onTogglePin = function04;
        this.$isPinned = z2;
        this.$userSession = abstractC3358CGz;
        this.$shortcutUpdatedToast = str4;
        this.$moveConfirmationPlacement$delegate = mutableState;
        this.$showDeleteConfirmation$delegate = mutableState2;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraContextMenuItem auraContextMenuItem) {
        invoke2(auraContextMenuItem);
        return Unit.INSTANCE;
    }
}

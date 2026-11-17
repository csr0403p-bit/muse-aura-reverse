package com.facebook.aura.spaces.menu;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C1BO;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.file.utils.HatchFileUIUtils;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.PeerSpaceMenuSheetKey;
import com.facebook.aura.shortcut.HatchShortcutManager;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public final class PeerSpaceMenuSheetKt$PeerSpaceMenuSheet$3$1 extends AbstractC7559F3s implements G0U<AuraContextMenuItem, Unit> {
    public final /* synthetic */ MutableState<Boolean> $confirmLeave$delegate;
    public final /* synthetic */ MutableState<Boolean> $confirmMove$delegate;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C3UX $coroutineScope;
    public final /* synthetic */ C1BO<String> $iconUrl$delegate;
    public final /* synthetic */ PeerSpaceMenuSheetKey $key;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ String $shortcutUpdatedToast;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    @DebugMetadata(c = "com.facebook.aura.spaces.menu.PeerSpaceMenuSheetKt$PeerSpaceMenuSheet$3$1$1", f = "PeerSpaceMenuSheet.kt", l = {119}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.spaces.menu.PeerSpaceMenuSheetKt$PeerSpaceMenuSheet$3$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ PeerSpaceMenuSheetKey $key;
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, PeerSpaceMenuSheetKey peerSpaceMenuSheetKey, AbstractC3358CGz abstractC3358CGz, AuraNavigator auraNavigator, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$context = context;
            this.$key = peerSpaceMenuSheetKey;
            this.$userSession = abstractC3358CGz;
            this.$navigator = auraNavigator;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$context, this.$key, this.$userSession, this.$navigator, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchFileUIUtils hatchFileUIUtils = HatchFileUIUtils.INSTANCE;
                Context context = this.$context;
                PeerSpaceMenuSheetKey peerSpaceMenuSheetKey = this.$key;
                String str = peerSpaceMenuSheetKey.hostMuse;
                String str2 = peerSpaceMenuSheetKey.spaceId;
                String str3 = peerSpaceMenuSheetKey.title;
                AbstractC3358CGz abstractC3358CGz = this.$userSession;
                this.label = 1;
                if (hatchFileUIUtils.downloadPeerSpaceExportHtml(context, str, str2, str3, abstractC3358CGz, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            this.$navigator.back();
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.spaces.menu.PeerSpaceMenuSheetKt$PeerSpaceMenuSheet$3$1$2", f = "PeerSpaceMenuSheet.kt", l = {140}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.spaces.menu.PeerSpaceMenuSheetKt$PeerSpaceMenuSheet$3$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ C1BO<String> $iconUrl$delegate;
        public final /* synthetic */ PeerSpaceMenuSheetKey $key;
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ String $shortcutUpdatedToast;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Context context, PeerSpaceMenuSheetKey peerSpaceMenuSheetKey, AbstractC3358CGz abstractC3358CGz, String str, AuraNavigator auraNavigator, C1BO<String> c1bo, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$context = context;
            this.$key = peerSpaceMenuSheetKey;
            this.$userSession = abstractC3358CGz;
            this.$shortcutUpdatedToast = str;
            this.$navigator = auraNavigator;
            this.$iconUrl$delegate = c1bo;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$context, this.$key, this.$userSession, this.$shortcutUpdatedToast, this.$navigator, this.$iconUrl$delegate, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchShortcutManager hatchShortcutManager = HatchShortcutManager.INSTANCE;
                Context context = this.$context;
                PeerSpaceMenuSheetKey peerSpaceMenuSheetKey = this.$key;
                String str = peerSpaceMenuSheetKey.hostMuse;
                String str2 = peerSpaceMenuSheetKey.spaceId;
                String str3 = peerSpaceMenuSheetKey.title;
                String strA08 = C1BO.A08(this.$iconUrl$delegate);
                AbstractC3358CGz abstractC3358CGz = this.$userSession;
                String str4 = this.$shortcutUpdatedToast;
                this.label = 1;
                if (hatchShortcutManager.requestPinPeerSpaceShortcut(context, str, str2, str3, strA08, abstractC3358CGz, str4, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            this.$navigator.back();
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke2(com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem r8) {
        /*
            r7 = this;
            r5 = 0
            X.C7384Etj.A0Y(r8, r5)
            int r1 = r8.id
            r0 = 2
            if (r1 == 0) goto L79
            r6 = 1
            if (r1 == r6) goto L73
            if (r1 == r0) goto L6d
            r0 = 3
            if (r1 == r0) goto L2b
            r0 = 4
            if (r1 == r0) goto L40
            r0 = 5
            if (r1 != r0) goto L2a
            X.3UX r0 = r7.$coroutineScope
            android.content.Context r2 = r7.$context
            com.facebook.aura.navigation.key.PeerSpaceMenuSheetKey r3 = r7.$key
            X.CGz r4 = r7.$userSession
            com.facebook.aura.navigation.AuraNavigator r5 = r7.$navigator
            r6 = 0
            com.facebook.aura.spaces.menu.PeerSpaceMenuSheetKt$PeerSpaceMenuSheet$3$1$1 r1 = new com.facebook.aura.spaces.menu.PeerSpaceMenuSheetKt$PeerSpaceMenuSheet$3$1$1
            r1.<init>(r2, r3, r4, r5, r6)
        L27:
            X.AnonymousClass001.A1J(r1, r0)
        L2a:
            return
        L2b:
            X.3UX r0 = r7.$coroutineScope
            android.content.Context r2 = r7.$context
            com.facebook.aura.navigation.key.PeerSpaceMenuSheetKey r3 = r7.$key
            X.CGz r4 = r7.$userSession
            java.lang.String r5 = r7.$shortcutUpdatedToast
            com.facebook.aura.navigation.AuraNavigator r6 = r7.$navigator
            X.1BO<java.lang.String> r7 = r7.$iconUrl$delegate
            r8 = 0
            com.facebook.aura.spaces.menu.PeerSpaceMenuSheetKt$PeerSpaceMenuSheet$3$1$2 r1 = new com.facebook.aura.spaces.menu.PeerSpaceMenuSheetKt$PeerSpaceMenuSheet$3$1$2
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            goto L27
        L40:
            com.facebook.aura.widgets.intf.SpaceWidgets r0 = com.facebook.aura.widgets.intf.SpaceWidgets.INSTANCE
            com.facebook.aura.widgets.intf.SpaceWidgetPinning r5 = r0.getPinning()
            if (r5 == 0) goto L64
            android.content.Context r4 = r7.$context
            com.facebook.aura.navigation.key.PeerSpaceMenuSheetKey r3 = r7.$key
            java.lang.String r2 = r3.hostMuse
            java.lang.String r1 = r3.spaceId
            java.lang.String r0 = ":"
            java.lang.String r1 = X.FGI.A0U(r2, r0, r1)
            java.lang.String r0 = r3.title
            boolean r0 = r5.requestPin(r4, r1, r0)
            if (r0 != r6) goto L64
        L5e:
            com.facebook.aura.navigation.AuraNavigator r0 = r7.$navigator
            r0.back()
            return
        L64:
            com.facebook.aura.toast.api.ToastApi r1 = com.facebook.aura.toast.api.ToastApi.INSTANCE
            r0 = 2131887434(0x7f12054a, float:1.9409475E38)
            r1.showToast(r0)
            goto L5e
        L6d:
            androidx.compose.runtime.MutableState<java.lang.Boolean> r0 = r7.$confirmLeave$delegate
            androidx.compose.runtime.MutableState.A09(r6, r0)
            return
        L73:
            androidx.compose.runtime.MutableState<java.lang.Boolean> r0 = r7.$confirmMove$delegate
            androidx.compose.runtime.MutableState.A09(r6, r0)
            return
        L79:
            com.facebook.aura.navigation.AuraNavigator r4 = r7.$navigator
            com.facebook.aura.navigation.key.PeerSpaceMenuSheetKey r0 = r7.$key
            java.lang.String r3 = r0.hostMuse
            java.lang.String r2 = r0.spaceId
            java.lang.String r1 = r0.title
            com.facebook.aura.navigation.key.PeerSpaceCollaboratorsSheetKey r0 = new com.facebook.aura.navigation.key.PeerSpaceCollaboratorsSheetKey
            r0.<init>(r3, r2, r1)
            r4.navigate(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.menu.PeerSpaceMenuSheetKt$PeerSpaceMenuSheet$3$1.invoke2(com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PeerSpaceMenuSheetKt$PeerSpaceMenuSheet$3$1(AuraNavigator auraNavigator, PeerSpaceMenuSheetKey peerSpaceMenuSheetKey, C3UX c3ux, Context context, MutableState<Boolean> mutableState, AbstractC3358CGz abstractC3358CGz, String str, C1BO<String> c1bo, MutableState<Boolean> mutableState2) {
        super(1);
        this.$navigator = auraNavigator;
        this.$key = peerSpaceMenuSheetKey;
        this.$coroutineScope = c3ux;
        this.$context = context;
        this.$confirmMove$delegate = mutableState;
        this.$userSession = abstractC3358CGz;
        this.$shortcutUpdatedToast = str;
        this.$iconUrl$delegate = c1bo;
        this.$confirmLeave$delegate = mutableState2;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraContextMenuItem auraContextMenuItem) {
        invoke2(auraContextMenuItem);
        return Unit.INSTANCE;
    }
}

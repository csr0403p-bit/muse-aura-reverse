package com.facebook.aura.file.view;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.file.actions.HatchFileActions;
import com.facebook.aura.file.actions.HatchFileRef;
import com.facebook.aura.file.view.ContentViewerViewModel;
import com.facebook.aura.file.view.api.ContentItem;
import com.facebook.aura.file.view.api.ContentType;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.sharesheet.HatchWorkspaceMediaShareKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public final class ContentViewerScreenKt$ContentViewerContent$9$7$1 extends AbstractC7559F3s implements G0U<ContentItem, Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C3UX $coroutineScope;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ AbstractC3358CGz $userSession;
    public final /* synthetic */ ContentViewerViewModel $viewModel;

    @DebugMetadata(c = "com.facebook.aura.file.view.ContentViewerScreenKt$ContentViewerContent$9$7$1$1", f = "ContentViewerScreen.kt", l = {353}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.file.view.ContentViewerScreenKt$ContentViewerContent$9$7$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ ContentItem $item;
        public final /* synthetic */ ContentViewerViewModel.ShareRoute $route;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, ContentViewerViewModel.ShareRoute shareRoute, ContentItem contentItem, AbstractC3358CGz abstractC3358CGz, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$context = context;
            this.$route = shareRoute;
            this.$item = contentItem;
            this.$userSession = abstractC3358CGz;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$context, this.$route, this.$item, this.$userSession, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchFileActions hatchFileActions = HatchFileActions.INSTANCE;
                Context context = this.$context;
                HatchFileRef.Workspace workspace = new HatchFileRef.Workspace(((ContentViewerViewModel.ShareRoute.WorkspaceFile) this.$route).workspacePath, this.$item.name);
                AbstractC3358CGz abstractC3358CGz = this.$userSession;
                this.label = 1;
                if (hatchFileActions.share(context, workspace, abstractC3358CGz, this) == enumC10460Hji) {
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
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentViewerScreenKt$ContentViewerContent$9$7$1(ContentViewerViewModel contentViewerViewModel, AuraNavigator auraNavigator, Context context, AbstractC3358CGz abstractC3358CGz, C3UX c3ux) {
        super(1);
        this.$viewModel = contentViewerViewModel;
        this.$navigator = auraNavigator;
        this.$context = context;
        this.$userSession = abstractC3358CGz;
        this.$coroutineScope = c3ux;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ContentItem contentItem) {
        AnonymousClass006.A0b(contentItem).logClick(HatchSurface.MEDIA_VIEWER, HatchSubsurface.MEDIA_CONTROLS, HatchScreen.MEDIA_FULLSCREEN, HatchComponent.SHARE_BUTTON, null, AnonymousClass006.A10("media_type", ContentViewerScreenKt.mediaTypeString(contentItem)), null);
        ContentViewerViewModel.ShareRoute shareRoute = this.$viewModel.shareRoute(contentItem);
        if (shareRoute instanceof ContentViewerViewModel.ShareRoute.Media) {
            ContentViewerViewModel.ShareRoute.Media media = (ContentViewerViewModel.ShareRoute.Media) shareRoute;
            HatchWorkspaceMediaShareKt.shareWorkspaceMedia(this.$navigator, media.workspacePath, contentItem.name, media.mediaUri, contentItem.thumbnailUri, contentItem.messageId, contentItem.type instanceof ContentType.Video, this.$context, this.$userSession, this.$coroutineScope, null, contentItem.getDance());
        } else if (shareRoute instanceof ContentViewerViewModel.ShareRoute.WorkspaceFile) {
            AnonymousClass001.A1J(new AnonymousClass1(this.$context, shareRoute, contentItem, this.$userSession, null), this.$coroutineScope);
        } else if (shareRoute != null) {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(ContentItem contentItem) {
        invoke2(contentItem);
        return Unit.INSTANCE;
    }
}

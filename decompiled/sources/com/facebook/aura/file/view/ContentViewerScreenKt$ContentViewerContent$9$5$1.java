package com.facebook.aura.file.view;

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
import com.facebook.aura.file.actions.HatchFileActions;
import com.facebook.aura.file.actions.HatchFileRef;
import com.facebook.aura.file.utils.HatchSaveAnalytics;
import com.facebook.aura.file.utils.HatchSaveLogOrigin;
import com.facebook.aura.file.view.api.ContentItem;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public final class ContentViewerScreenKt$ContentViewerContent$9$5$1 extends AbstractC7559F3s implements G0U<ContentItem, Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C3UX $coroutineScope;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    @DebugMetadata(c = "com.facebook.aura.file.view.ContentViewerScreenKt$ContentViewerContent$9$5$1$1", f = "ContentViewerScreen.kt", l = {307}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.file.view.ContentViewerScreenKt$ContentViewerContent$9$5$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ ContentItem $item;
        public final /* synthetic */ HatchSaveLogOrigin $logOrigin;
        public final /* synthetic */ String $path;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, String str, ContentItem contentItem, AbstractC3358CGz abstractC3358CGz, HatchSaveLogOrigin hatchSaveLogOrigin, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$context = context;
            this.$path = str;
            this.$item = contentItem;
            this.$userSession = abstractC3358CGz;
            this.$logOrigin = hatchSaveLogOrigin;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$context, this.$path, this.$item, this.$userSession, this.$logOrigin, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchFileActions hatchFileActions = HatchFileActions.INSTANCE;
                Context context = this.$context;
                HatchFileRef.Workspace workspace = new HatchFileRef.Workspace(this.$path, this.$item.name);
                AbstractC3358CGz abstractC3358CGz = this.$userSession;
                HatchSaveLogOrigin hatchSaveLogOrigin = this.$logOrigin;
                this.label = 1;
                if (hatchFileActions.download(context, workspace, abstractC3358CGz, true, hatchSaveLogOrigin, this) == enumC10460Hji) {
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

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ContentItem contentItem) {
        C7384Etj.A0Y(contentItem, 0);
        HatchSaveLogOrigin hatchSaveLogOriginMediaViewer = HatchSaveLogOrigin.Companion.mediaViewer(ContentViewerScreenKt.mediaTypeString(contentItem));
        HatchSaveAnalytics.INSTANCE.logTap(hatchSaveLogOriginMediaViewer);
        String str = contentItem.workspacePath;
        if (str != null) {
            AnonymousClass001.A1J(new AnonymousClass1(this.$context, str, contentItem, this.$userSession, hatchSaveLogOriginMediaViewer, null), this.$coroutineScope);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentViewerScreenKt$ContentViewerContent$9$5$1(C3UX c3ux, Context context, AbstractC3358CGz abstractC3358CGz) {
        super(1);
        this.$coroutineScope = c3ux;
        this.$context = context;
        this.$userSession = abstractC3358CGz;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(ContentItem contentItem) {
        invoke2(contentItem);
        return Unit.INSTANCE;
    }
}

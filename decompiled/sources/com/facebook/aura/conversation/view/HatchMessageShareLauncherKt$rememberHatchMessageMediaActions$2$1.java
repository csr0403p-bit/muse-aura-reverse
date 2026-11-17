package com.facebook.aura.conversation.view;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import com.facebook.aura.file.actions.HatchFileActions;
import com.facebook.aura.file.actions.HatchFileRef;
import com.facebook.aura.file.view.api.ContentItem;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchMessageShareLauncherKt$rememberHatchMessageMediaActions$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C3UX $coroutineScope;
    public final /* synthetic */ ContentItem $media;
    public final /* synthetic */ String $path;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    @DebugMetadata(c = "com.facebook.aura.conversation.view.HatchMessageShareLauncherKt$rememberHatchMessageMediaActions$2$1$1", f = "HatchMessageShareLauncher.kt", l = {82}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.view.HatchMessageShareLauncherKt$rememberHatchMessageMediaActions$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ ContentItem $media;
        public final /* synthetic */ String $path;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, String str, ContentItem contentItem, AbstractC3358CGz abstractC3358CGz, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$context = context;
            this.$path = str;
            this.$media = contentItem;
            this.$userSession = abstractC3358CGz;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$context, this.$path, this.$media, this.$userSession, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchFileActions hatchFileActions = HatchFileActions.INSTANCE;
                Context context = this.$context;
                HatchFileRef.Workspace workspace = new HatchFileRef.Workspace(this.$path, this.$media.name);
                AbstractC3358CGz abstractC3358CGz = this.$userSession;
                this.label = 1;
                if (hatchFileActions.download(context, workspace, abstractC3358CGz, true, null, this) == enumC10460Hji) {
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
    public HatchMessageShareLauncherKt$rememberHatchMessageMediaActions$2$1(C3UX c3ux, Context context, String str, ContentItem contentItem, AbstractC3358CGz abstractC3358CGz) {
        super(0);
        this.$coroutineScope = c3ux;
        this.$context = context;
        this.$path = str;
        this.$media = contentItem;
        this.$userSession = abstractC3358CGz;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AnonymousClass001.A1J(new AnonymousClass1(this.$context, this.$path, this.$media, this.$userSession, null), this.$coroutineScope);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

package com.facebook.aura.file.view;

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
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.file.utils.HatchFileUIUtils;
import com.facebook.aura.partners.voice.screen.HatchVoiceAnnouncementSheetKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ArtifactFileActionMenuKt$ArtifactFileActionMenu$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C3UX $coroutineScope;
    public final /* synthetic */ String $fileExtension;
    public final /* synthetic */ String $fileName;
    public final /* synthetic */ String $imageUri;
    public final /* synthetic */ HatchScreen $loggingScreen;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    @DebugMetadata(c = "com.facebook.aura.file.view.ArtifactFileActionMenuKt$ArtifactFileActionMenu$3$1$1", f = "ArtifactFileActionMenu.kt", l = {HatchVoiceAnnouncementSheetKt.NUX_FADE_IN_DELAY_MS}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.file.view.ArtifactFileActionMenuKt$ArtifactFileActionMenu$3$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ String $fileName;
        public final /* synthetic */ String $imageUri;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, String str, String str2, AbstractC3358CGz abstractC3358CGz, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$context = context;
            this.$imageUri = str;
            this.$fileName = str2;
            this.$userSession = abstractC3358CGz;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$context, this.$imageUri, this.$fileName, this.$userSession, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchFileUIUtils hatchFileUIUtils = HatchFileUIUtils.INSTANCE;
                Context context = this.$context;
                String str = this.$imageUri;
                String str2 = this.$fileName;
                AbstractC3358CGz abstractC3358CGz = this.$userSession;
                this.label = 1;
                if (hatchFileUIUtils.downloadHtmlAsPdf(context, str, str2, abstractC3358CGz, this) == enumC10460Hji) {
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
    public ArtifactFileActionMenuKt$ArtifactFileActionMenu$3$1(HatchScreen hatchScreen, String str, C3UX c3ux, Context context, String str2, String str3, AbstractC3358CGz abstractC3358CGz) {
        super(0);
        this.$loggingScreen = hatchScreen;
        this.$fileExtension = str;
        this.$coroutineScope = c3ux;
        this.$context = context;
        this.$imageUri = str2;
        this.$fileName = str3;
        this.$userSession = abstractC3358CGz;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ArtifactFileActionMenuKt.logFileMenuClick(this.$loggingScreen, HatchComponent.DOWNLOAD_PDF, this.$fileExtension);
        AnonymousClass001.A1J(new AnonymousClass1(this.$context, this.$imageUri, this.$fileName, this.$userSession, null), this.$coroutineScope);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

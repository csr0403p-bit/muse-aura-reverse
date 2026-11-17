package com.facebook.aura.sharesheet;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C1BO;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import android.graphics.Bitmap;
import com.facebook.aura.explore.repo.IdeaCardShareResult;
import com.facebook.aura.explore.view.cards.IdeaPreviewImageUrlsKt;
import com.facebook.aura.gateway.HatchThumbnailDisplaySize;
import com.facebook.aura.installsource.AuraInstallSourceDetector;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetKt$HatchShareSheet$prepareIdeaImage$1$1", f = "HatchShareSheet.kt", l = {AuraInstallSourceDetector.SYSTEM_IMAGE_FLAGS}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchShareSheetKt$HatchShareSheet$prepareIdeaImage$1$1 extends AbstractC07127nr implements G0V<IdeaCardShareResult, HtJ<? super String>, Object> {
    public final /* synthetic */ Context $applicationContext;
    public final /* synthetic */ C1BO<Boolean> $isDarkTheme$delegate;
    public final /* synthetic */ AbstractC3358CGz $userSession;
    public /* synthetic */ Object L$0;
    public int label;

    @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetKt$HatchShareSheet$prepareIdeaImage$1$1$1", f = "HatchShareSheet.kt", l = {135}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.sharesheet.HatchShareSheetKt$HatchShareSheet$prepareIdeaImage$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<String, HtJ<? super Bitmap>, Object> {
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AbstractC3358CGz abstractC3358CGz, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$userSession = abstractC3358CGz;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$userSession, htJ);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            String str = (String) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchShareImageLoader hatchShareImageLoader = HatchShareImageLoader.INSTANCE;
                AbstractC3358CGz abstractC3358CGz = this.$userSession;
                this.L$0 = null;
                this.label = 1;
                obj = hatchShareImageLoader.load(str, abstractC3358CGz, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return obj;
        }

        @Override // X.G0V
        public final Object invoke(String str, HtJ<? super Bitmap> htJ) {
            return ((AnonymousClass1) create(str, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchShareSheetKt$HatchShareSheet$prepareIdeaImage$1$1(Context context, AbstractC3358CGz abstractC3358CGz, C1BO<Boolean> c1bo, HtJ<? super HatchShareSheetKt$HatchShareSheet$prepareIdeaImage$1$1> htJ) {
        super(2, htJ);
        this.$applicationContext = context;
        this.$userSession = abstractC3358CGz;
        this.$isDarkTheme$delegate = c1bo;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        HatchShareSheetKt$HatchShareSheet$prepareIdeaImage$1$1 hatchShareSheetKt$HatchShareSheet$prepareIdeaImage$1$1 = new HatchShareSheetKt$HatchShareSheet$prepareIdeaImage$1$1(this.$applicationContext, this.$userSession, this.$isDarkTheme$delegate, htJ);
        hatchShareSheetKt$HatchShareSheet$prepareIdeaImage$1$1.L$0 = obj;
        return hatchShareSheetKt$HatchShareSheet$prepareIdeaImage$1$1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) throws Throwable {
        IdeaCardShareResult ideaCardShareResult = (IdeaCardShareResult) this.L$0;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchIdeaShareImageRenderer hatchIdeaShareImageRenderer = HatchIdeaShareImageRenderer.INSTANCE;
            Context context = this.$applicationContext;
            C7384Etj.A0X(context);
            String str = ideaCardShareResult.title;
            String str2 = ideaCardShareResult.summary;
            String strResolveIdeaPreviewImageUrl = IdeaPreviewImageUrlsKt.resolveIdeaPreviewImageUrl(ideaCardShareResult.iconUrl, this.$userSession, HatchThumbnailDisplaySize.MEDIUM);
            boolean zA0F = C1BO.A0F(this.$isDarkTheme$delegate);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$userSession, null);
            this.L$0 = null;
            this.label = 1;
            obj = hatchIdeaShareImageRenderer.render(context, str, str2, strResolveIdeaPreviewImageUrl, zA0F, true, anonymousClass1, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return obj;
    }

    @Override // X.G0V
    public final Object invoke(IdeaCardShareResult ideaCardShareResult, HtJ<? super String> htJ) {
        return ((HatchShareSheetKt$HatchShareSheet$prepareIdeaImage$1$1) create(ideaCardShareResult, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}

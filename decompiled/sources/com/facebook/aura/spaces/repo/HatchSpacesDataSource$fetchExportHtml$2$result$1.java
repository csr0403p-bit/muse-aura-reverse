package com.facebook.aura.spaces.repo;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C3cG;
import X.C60O;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HxE;
import com.facebook.aura.file.utils.HtmlPdfRenderer;
import com.facebook.aura.network.http.HatchHttpStreamRequestResult;
import com.facebook.aura.network.http.RequestType;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.spaces.repo.HatchSpacesDataSource$fetchExportHtml$2$result$1", f = "HatchSpacesDataSource.kt", l = {HtmlPdfRenderer.PAGE_WIDTH}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class HatchSpacesDataSource$fetchExportHtml$2$result$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HatchHttpStreamRequestResult>, Object> {
    public final /* synthetic */ SpacesJarvisPath $endpoint;
    public int label;
    public final /* synthetic */ HatchSpacesDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSpacesDataSource$fetchExportHtml$2$result$1(SpacesJarvisPath spacesJarvisPath, HatchSpacesDataSource hatchSpacesDataSource, HtJ<? super HatchSpacesDataSource$fetchExportHtml$2$result$1> htJ) {
        super(2, htJ);
        this.$endpoint = spacesJarvisPath;
        this.this$0 = hatchSpacesDataSource;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchSpacesDataSource$fetchExportHtml$2$result$1(this.$endpoint, this.this$0, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            this.label = 1;
            obj = C60O.A06(obj).openJarvisHttpResponseStreamDetailedInternal(this.$endpoint, RequestType.GET, this.this$0.userSession, C3cG.A0S(60L), null, null, new HxE[0], this);
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
    public final Object invoke(C3UX c3ux, HtJ<? super HatchHttpStreamRequestResult> htJ) {
        return ((HatchSpacesDataSource$fetchExportHtml$2$result$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
